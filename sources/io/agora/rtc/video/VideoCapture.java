package io.agora.rtc.video;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import i0.d.a.a.a;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.gl.SurfaceTextureHelper;
import io.agora.rtc.gl.VideoFrame;
import io.agora.rtc.internal.Logging;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public abstract class VideoCapture {
    public static boolean FORCE_ENC_TEXTURE_OES = false;
    public static final int MAX_BUFFER_CNT = 6;
    /* access modifiers changed from: private */
    public static final String TAG = "VideoCapture";
    public static final int kCaptureFpsDefault = 0;
    public static final int kCaptureFpsLowPower = 1;
    public static final int kCaptureFpsUnknown = -1;
    private static final int kVideoI420 = 0;
    private static final int kVideoNV12 = 11;
    private static final int kVideoNV21 = 12;
    private static final int kVideoUnknown = 99;
    private static final int kVideoYUY2 = 2;
    private static final int kVideoYV12 = 1;
    public int mCameraNativeOrientation;
    @CaptureOutputDataType
    public int mCaptureOutputDataType = 0;
    public final Context mContext;
    public int mDroppedTextureBufferCount = 0;
    public EglBase.Context mEglContext;
    public int mExpectedRawBufferSize = 0;
    public final int mId;
    private int mLastRotation = -1;
    public long mNativeVideoCaptureDeviceAndroid;
    public int mPQFirst = -1;
    public final EglBase.Context mShareContext;
    public SurfaceTextureHelper mSurfaceTextureHelper;
    public TextureAndRawBufferSynchronizer mTextureAndRawBufferSynchronizer = null;

    public @interface CaptureOutputDataType {
        public static final int CAPTURE_OUTPUT_RAW = 0;
        public static final int CAPTURE_OUTPUT_TEXTURE = 1;
        public static final int CAPTURE_OUTPUT_TEXTURE_AND_RAW = 2;
    }

    public static class RawBuffer {
        public byte[] data;
        public int length;

        public RawBuffer(byte[] bArr, int i) {
            this.data = bArr;
            this.length = i;
        }
    }

    public static class TexBuffer {
        public int rotation;
        public VideoFrame.TextureBuffer textureBuffer;
        public long timestampNs;

        public TexBuffer(VideoFrame.TextureBuffer textureBuffer2, int i, long j) {
            this.textureBuffer = textureBuffer2;
            this.rotation = i;
            this.timestampNs = j;
        }
    }

    public class TextureAndRawBufferSynchronizer {
        public int pendingRemoveRawBufferCount = 0;
        public Queue<RawBuffer> rawBufferQueue = new LinkedList();
        public Queue<TexBuffer> texBufferQueue = new LinkedList();

        public TextureAndRawBufferSynchronizer() {
        }

        private void checkAndResetIfNeeded() {
            if (this.texBufferQueue.size() > 16 || this.rawBufferQueue.size() > 16) {
                String str = this.texBufferQueue.size() > 16 ? "raw" : "texture";
                String access$000 = VideoCapture.TAG;
                Logging.e(access$000, str + " buffer stall, something is broken!");
                reset();
            }
        }

        public void onDropTextureBuffer(long j) {
            if (this.rawBufferQueue.poll() == null) {
                this.pendingRemoveRawBufferCount++;
            }
        }

        public void onRawBufferAvailable(byte[] bArr, int i) {
            checkAndResetIfNeeded();
            int i2 = this.pendingRemoveRawBufferCount;
            if (i2 > 0) {
                this.pendingRemoveRawBufferCount = i2 - 1;
                return;
            }
            TexBuffer poll = this.texBufferQueue.poll();
            if (poll != null) {
                VideoCapture.this.onTextureAndRawBufferAvailable(poll.textureBuffer, poll.rotation, poll.timestampNs, bArr, i);
                poll.textureBuffer.release();
                return;
            }
            this.rawBufferQueue.offer(new RawBuffer(Arrays.copyOf(bArr, i), i));
        }

        public void onTextureBufferAvailable(VideoFrame.TextureBuffer textureBuffer, int i, long j) {
            checkAndResetIfNeeded();
            RawBuffer poll = this.rawBufferQueue.poll();
            if (poll != null) {
                VideoCapture.this.onTextureAndRawBufferAvailable(textureBuffer, i, j, poll.data, poll.length);
                return;
            }
            textureBuffer.retain();
            this.texBufferQueue.offer(new TexBuffer(textureBuffer, i, j));
        }

        public void reset() {
            Logging.i(VideoCapture.TAG, "TextureAndRawBufferSynchronizer reset");
            this.rawBufferQueue.clear();
            for (TexBuffer texBuffer : this.texBufferQueue) {
                texBuffer.textureBuffer.release();
            }
            this.texBufferQueue.clear();
            this.pendingRemoveRawBufferCount = 0;
        }
    }

    public VideoCapture(Context context, int i, int i2, EglBase.Context context2, long j) {
        this.mNativeVideoCaptureDeviceAndroid = j;
        this.mContext = context;
        this.mId = i;
        this.mPQFirst = i2;
        this.mShareContext = context2;
    }

    private native void ProvideCameraTexture(VideoFrame.TextureBuffer textureBuffer, int i, long j, long j2);

    private native void ProvideCameraTextureAndRaw(VideoFrame.TextureBuffer textureBuffer, int i, long j, byte[] bArr, int i2, long j2);

    public static void cacheCapability(int i, Context context, String str, String str2) {
        SharedPreferences.Editor edit = context.getSharedPreferences("CamCaps2", 0).edit();
        edit.putString("Cam_" + i, str);
        edit.putString("CaptureName", str2);
        edit.commit();
    }

    public static boolean checkVideoPermission(Context context) {
        return context != null && context.checkCallingOrSelfPermission("android.permission.CAMERA") == 0;
    }

    public static void clearCapabilityCache(Context context) {
        context.getSharedPreferences("CamCaps2", 0).edit().clear().commit();
    }

    public static String fetchCapability(int i, Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("CamCaps2", 0);
        String string = sharedPreferences.getString("CaptureName", (String) null);
        if (string == null || !string.equals(str)) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.commit();
            return null;
        }
        return sharedPreferences.getString("Cam_" + i, (String) null);
    }

    public static boolean isEmulator() {
        if ("nokia".equalsIgnoreCase(Build.MANUFACTURER) && ("Nokia_N1".equalsIgnoreCase(Build.DEVICE) || "N1".equalsIgnoreCase(Build.MODEL))) {
            return false;
        }
        try {
            Process start = new ProcessBuilder(new String[]{"/system/bin/cat", "/proc/cpuinfo"}).start();
            StringBuffer stringBuffer = new StringBuffer();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(start.getInputStream(), "utf-8"));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    break;
                }
                stringBuffer.append(readLine);
            }
            bufferedReader.close();
            String lowerCase = stringBuffer.toString().toLowerCase();
            if (lowerCase.contains("intel") || lowerCase.contains("amd")) {
                return true;
            }
            return false;
        } catch (IOException | Exception unused) {
            return false;
        }
    }

    public static int translateToAndroidFormat(int i) {
        if (i == 0) {
            return 35;
        }
        if (i == 1) {
            return 842094169;
        }
        if (i != 2) {
            return i != 12 ? 0 : 17;
        }
        return 20;
    }

    @CaptureOutputDataType
    public static int translateToCaptureOutputDataType(int i) {
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                return 0;
            }
        }
        return i2;
    }

    public static int translateToEngineFormat(int i) {
        if (i == 17) {
            return 12;
        }
        if (i == 20) {
            return 2;
        }
        if (i != 35) {
            return i != 842094169 ? 99 : 1;
        }
        return 0;
    }

    public native void NotifyCameraExposureAreaChanged(float f, float f2, float f3, float f4, long j);

    public native void NotifyCameraFocusAreaChanged(float f, float f2, float f3, float f4, long j);

    public native void NotifyFaceDetection(int i, int i2, RectF[] rectFArr, long j, long j2);

    public native void ProvideCameraFrame(byte[] bArr, int i, long j);

    public abstract int UnRegisterNativeHandle();

    public abstract int allocate();

    public int checkOrientation() {
        Display defaultDisplay;
        Context context = this.mContext;
        if (context == null || context.getSystemService("window") == null || (defaultDisplay = ((WindowManager) this.mContext.getSystemService("window")).getDefaultDisplay()) == null) {
            return this.mLastRotation;
        }
        try {
            return defaultDisplay.getRotation();
        } catch (RuntimeException unused) {
            Logging.e(TAG, "video capture checkOrientation display getRotation throwout exception");
            return this.mLastRotation;
        }
    }

    public abstract void deallocate();

    public abstract float getMaxZoom();

    public native boolean isAutoFaceFocusEnabled(long j);

    public abstract boolean isAutoFaceFocusSupported();

    public abstract boolean isExposureSupported();

    public native boolean isFaceDetectionEnabled(long j);

    public abstract boolean isFocusSupported();

    public abstract boolean isTorchSupported();

    public abstract boolean isZoomSupported();

    public native void onCameraError(long j, String str);

    public void onRawBufferAvailable(byte[] bArr, int i) {
        AgoraVideoDebugger.onRawBufferAvailable(this, bArr, i);
        int i2 = this.mCaptureOutputDataType;
        if (i2 == 0) {
            ProvideCameraFrame(bArr, i, this.mNativeVideoCaptureDeviceAndroid);
        } else if (i2 == 2) {
            this.mTextureAndRawBufferSynchronizer.onRawBufferAvailable(bArr, i);
        }
    }

    public void onTextureAndRawBufferAvailable(VideoFrame.TextureBuffer textureBuffer, int i, long j, byte[] bArr, int i2) {
        AgoraVideoDebugger.onTextureAndRawBufferAvailable(this, textureBuffer, i, j, bArr, i2);
        ProvideCameraTextureAndRaw(textureBuffer, i, j, bArr, i2, this.mNativeVideoCaptureDeviceAndroid);
    }

    public void onTextureBufferAvailable(VideoFrame.TextureBuffer textureBuffer, int i, long j) {
        SurfaceTextureHelper surfaceTextureHelper = this.mSurfaceTextureHelper;
        if (surfaceTextureHelper == null) {
            textureBuffer = null;
        } else if (!FORCE_ENC_TEXTURE_OES) {
            textureBuffer = surfaceTextureHelper.textureCopy(textureBuffer);
        }
        if (textureBuffer == null) {
            int i2 = this.mDroppedTextureBufferCount + 1;
            this.mDroppedTextureBufferCount = i2;
            if (i2 % 50 == 1) {
                String str = TAG;
                StringBuilder P0 = a.P0("Dropped texture buffer count: ");
                P0.append(this.mDroppedTextureBufferCount);
                Logging.w(str, P0.toString());
            }
            if (this.mCaptureOutputDataType == 2) {
                this.mTextureAndRawBufferSynchronizer.onDropTextureBuffer(j);
            }
            AgoraVideoDebugger.onDropTextureBuffer(j);
            return;
        }
        AgoraVideoDebugger.onTextureBufferAvailable(this, this.mEglContext, textureBuffer, i, j);
        int i3 = this.mCaptureOutputDataType;
        if (i3 == 1) {
            ProvideCameraTexture(textureBuffer, i, j, this.mNativeVideoCaptureDeviceAndroid);
        } else if (i3 == 2) {
            this.mTextureAndRawBufferSynchronizer.onTextureBufferAvailable(textureBuffer, i, j);
        }
        textureBuffer.release();
    }

    public abstract int setAntiBandingMode(int i);

    public abstract int setAutoFaceFocus(boolean z);

    public abstract int setCaptureFormat(int i, int i2, boolean z);

    public abstract int setEdgeEnhanceMode(int i);

    public abstract int setExposure(float f, float f2, boolean z);

    public abstract int setExposureCompensation(int i);

    public abstract int setFaceDetection(boolean z);

    public abstract int setFocus(float f, float f2, boolean z);

    public abstract int setNoiseReductionMode(int i);

    public abstract int setTorchMode(boolean z);

    public abstract int setVideoStabilityMode(int i);

    public abstract int setZoom(float f);

    public abstract int startCapture(int i, int i2, int i3);

    public abstract int stopCapture();
}
