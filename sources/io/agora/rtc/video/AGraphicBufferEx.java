package io.agora.rtc.video;

import android.graphics.Matrix;
import android.os.Build;
import android.os.Handler;
import i0.d.a.a.a;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.gl.RendererCommon;
import io.agora.rtc.gl.VideoFrame;
import io.agora.rtc.gl.YuvConverter;
import io.agora.rtc.utils.ThreadUtils;
import java.util.concurrent.Callable;

public class AGraphicBufferEx implements VideoFrame.TextureBuffer {
    private final EglBase.Context eglContext;
    private int height;
    private final int id;
    /* access modifiers changed from: private */
    public long mHandler;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;
    private final Handler toI420Handler;
    private Matrix transformMatrix;
    private final VideoFrame.TextureBuffer.Type type;
    private int width;

    public AGraphicBufferEx(EglBase.Context context, int i, int i2, Handler handler, int i3, Matrix matrix, Runnable runnable) {
        this.eglContext = context;
        this.width = i;
        this.height = i2;
        this.type = VideoFrame.TextureBuffer.Type.OES;
        this.id = i3;
        this.transformMatrix = matrix;
        this.toI420Handler = handler;
        this.releaseCallback = runnable;
        this.refCount = 1;
        this.mHandler = initHardwareBuffer(i, i2, i3);
    }

    private native byte[] getBuffer(long j);

    private native int getTextureId(long j);

    private native long initHardwareBuffer(int i, int i2, int i3);

    /* access modifiers changed from: private */
    public native boolean isValid(long j);

    private native void releaseHardwareBuffer(long j);

    private native void setBuffer(long j, byte[] bArr);

    public VideoFrame.TextureBuffer applyTransformMatrix(Matrix matrix, int i, int i2) {
        Matrix matrix2 = new Matrix(this.transformMatrix);
        matrix2.preConcat(matrix);
        this.transformMatrix = matrix2;
        this.width = i;
        this.height = i2;
        return this;
    }

    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix = new Matrix();
        int i7 = this.height;
        matrix.preTranslate(((float) i) / ((float) this.width), ((float) (i7 - (i2 + i4))) / ((float) i7));
        matrix.preScale(((float) i3) / ((float) this.width), ((float) i4) / ((float) this.height));
        return applyTransformMatrix(matrix, i5, i6);
    }

    public VideoFrame.TextureBuffer flip(boolean z) {
        return applyTransformMatrix(RendererCommon.convertMatrixToAndroidGraphicsMatrix(z ? RendererCommon.verticalFlipMatrix() : RendererCommon.horizontalFlipMatrix()), this.width, this.height);
    }

    public byte[] getBuffer() {
        return getBuffer(this.mHandler);
    }

    public EglBase.Context getEglBaseContext() {
        return this.eglContext;
    }

    public int getEglType() {
        return this.eglContext.getEglType();
    }

    public float[] getGlTransformMatrix() {
        return RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.transformMatrix);
    }

    public int getHeight() {
        return this.height;
    }

    public long getNativeBuffer() {
        return ((Long) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable<Long>() {
            public Long call() throws Exception {
                return Long.valueOf(AGraphicBufferEx.this.mHandler);
            }
        })).longValue();
    }

    public long getNativeEglContext() {
        EglBase.Context context = this.eglContext;
        if (context != null) {
            return context.getNativeEglContext();
        }
        return 0;
    }

    public Object getRealEglContext() {
        return this.eglContext.getRealEglContext();
    }

    public int getSequence() {
        return 0;
    }

    public int getTextureId() {
        return getTextureId(this.mHandler);
    }

    public int getTextureType() {
        return this.type == VideoFrame.TextureBuffer.Type.OES ? 11 : 10;
    }

    public Handler getToI420Handler() {
        return this.toI420Handler;
    }

    public Matrix getTransformMatrix() {
        return this.transformMatrix;
    }

    public VideoFrame.TextureBuffer.Type getType() {
        return this.type;
    }

    public int getWidth() {
        return this.width;
    }

    public YuvConverter getYuvConverter() {
        return null;
    }

    public String infoString() {
        return toString();
    }

    public boolean isNativeBufferSupported() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public boolean isValidNativeBuffer() {
        return ((Boolean) ThreadUtils.invokeAtFrontUninterruptibly(this.toI420Handler, new Callable<Boolean>() {
            public Boolean call() throws Exception {
                AGraphicBufferEx aGraphicBufferEx = AGraphicBufferEx.this;
                return Boolean.valueOf(aGraphicBufferEx.isValid(aGraphicBufferEx.mHandler));
            }
        })).booleanValue();
    }

    public void release() {
        Runnable runnable;
        synchronized (this.refCountLock) {
            int i = this.refCount - 1;
            this.refCount = i;
            if (i == 0 && (runnable = this.releaseCallback) != null) {
                runnable.run();
            }
        }
    }

    public void releaseNativeBuffer() {
        releaseHardwareBuffer(this.mHandler);
    }

    public void retain() {
        synchronized (this.refCountLock) {
            this.refCount++;
        }
    }

    public VideoFrame.TextureBuffer rotate(int i) {
        boolean z = i == 90 || i == 270;
        int i2 = z ? this.height : this.width;
        int i3 = z ? this.width : this.height;
        Matrix matrix = new Matrix();
        matrix.preTranslate(0.5f, 0.5f);
        matrix.preRotate((float) i);
        matrix.preTranslate(-0.5f, -0.5f);
        return applyTransformMatrix(matrix, i2, i3);
    }

    public void setBuffer(byte[] bArr) {
        setBuffer(this.mHandler, bArr);
    }

    public VideoFrame.TextureBuffer toAGraphicBufferEx() {
        return this;
    }

    public VideoFrame.I420Buffer toI420() {
        return null;
    }

    public String toString() {
        StringBuilder P0 = a.P0("AGraphicBufferEx{eglContext=");
        P0.append(this.eglContext);
        P0.append(", width=");
        P0.append(this.width);
        P0.append(", height=");
        P0.append(this.height);
        P0.append(", type=");
        P0.append(this.type);
        P0.append(", id=");
        P0.append(this.id);
        P0.append(", transformMatrix=");
        P0.append(this.transformMatrix);
        P0.append(", toI420Handler=");
        P0.append(this.toI420Handler);
        P0.append(", releaseCallback=");
        P0.append(this.releaseCallback);
        P0.append(", refCountLock=");
        P0.append(this.refCountLock);
        P0.append(", refCount=");
        P0.append(this.refCount);
        P0.append(", mHandler=");
        P0.append(this.mHandler);
        P0.append('}');
        return P0.toString();
    }

    public VideoFrame.TextureBuffer toTextureBuffer() {
        return this;
    }
}
