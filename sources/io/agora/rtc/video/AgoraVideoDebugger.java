package io.agora.rtc.video;

import android.os.Handler;
import android.os.HandlerThread;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.gl.VideoFrame;
import io.agora.rtc.mediaio.AgoraSurfaceView;

public class AgoraVideoDebugger {
    public static final boolean DIRECT_OES = false;
    public static final boolean ENABLE_DEBUG = false;
    public static final String TAG = "AgoraVideoDebugger";
    public static final boolean VERBOSE = false;
    public static final boolean VERBOSE_DETAIL = false;
    public static boolean applyRotation = false;
    public static AgoraSurfaceView debugViewForTexture = null;
    public static int droppedTextureFrameCnt = 0;
    public static boolean followSourceDimension = false;
    public static boolean isDebugViewInitialized = false;
    public static int lastTextureHeight = 0;
    public static int lastTextureWidth = 0;
    public static boolean mirror = false;
    public static Handler renderHandler;
    public static HandlerThread renderThread;
    public static int textureFrameCnt;

    public static void onDropTextureBuffer(long j) {
    }

    public static void onRawBufferAvailable(VideoCapture videoCapture, byte[] bArr, int i) {
    }

    public static void onTextureAndRawBufferAvailable(VideoCapture videoCapture, VideoFrame.TextureBuffer textureBuffer, int i, long j, byte[] bArr, int i2) {
    }

    public static void onTextureBufferAvailable(VideoCapture videoCapture, EglBase.Context context, VideoFrame.TextureBuffer textureBuffer, int i, long j) {
    }

    public static void reset() {
    }

    public static void setDebugViewForTexture(AgoraSurfaceView agoraSurfaceView, boolean z, boolean z2, boolean z3) {
    }
}
