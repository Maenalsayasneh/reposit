package io.agora.rtc.mediaio;

import android.graphics.SurfaceTexture;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.mediaio.MediaIO;
import io.agora.rtc.mediaio.SurfaceTextureHelper;
import java.lang.ref.WeakReference;

public abstract class TextureSource implements IVideoSource, SurfaceTextureHelper.OnTextureFrameAvailableListener {
    public WeakReference<IVideoFrameConsumer> mConsumer;
    public int mHeight;
    public int mPixelFormat = 11;
    public SurfaceTextureHelper mSurfaceTextureHelper;
    public int mWidth;

    public TextureSource(EglBase.Context context, int i, int i2) {
        this.mWidth = i;
        this.mHeight = i2;
        SurfaceTextureHelper create = SurfaceTextureHelper.create("TexCamThread", context);
        this.mSurfaceTextureHelper = create;
        create.getSurfaceTexture().setDefaultBufferSize(i, i2);
        this.mSurfaceTextureHelper.startListening(this);
    }

    public int getBufferType() {
        return 3;
    }

    public int getCaptureType() {
        return MediaIO.CaptureType.CAMERA.intValue();
    }

    public int getContentHint() {
        return MediaIO.ContentHint.NONE.intValue();
    }

    public EglBase.Context getEglContext() {
        return this.mSurfaceTextureHelper.getEglContext();
    }

    public SurfaceTexture getSurfaceTexture() {
        return this.mSurfaceTextureHelper.getSurfaceTexture();
    }

    public abstract void onCapturerClosed();

    public abstract boolean onCapturerOpened();

    public abstract boolean onCapturerStarted();

    public abstract void onCapturerStopped();

    public void onDispose() {
        this.mConsumer = null;
        onCapturerClosed();
    }

    public boolean onInitialize(IVideoFrameConsumer iVideoFrameConsumer) {
        this.mConsumer = new WeakReference<>(iVideoFrameConsumer);
        return onCapturerOpened();
    }

    public boolean onStart() {
        return onCapturerStarted();
    }

    public void onStop() {
        onCapturerStopped();
    }

    public void onTextureFrameAvailable(int i, float[] fArr, long j) {
        this.mSurfaceTextureHelper.returnTextureFrame();
    }

    public void release() {
        this.mSurfaceTextureHelper.stopListening();
        this.mSurfaceTextureHelper.dispose();
        this.mSurfaceTextureHelper = null;
    }

    public void onTextureFrameAvailable(int i, MediaIO.PixelFormat pixelFormat, float[] fArr, long j) {
        this.mSurfaceTextureHelper.returnTextureFrame();
    }

    public TextureSource(EglBase.Context context, int i, int i2, boolean z) {
        this.mWidth = i;
        this.mHeight = i2;
        SurfaceTextureHelper create = SurfaceTextureHelper.create("TexCamThreadOesTo2D", context, z, i, i2);
        this.mSurfaceTextureHelper = create;
        create.getSurfaceTexture().setDefaultBufferSize(i, i2);
        this.mSurfaceTextureHelper.startListening(this);
    }
}
