package io.agora.rtc.mediaio;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.util.AttributeSet;
import android.util.Log;
import android.view.TextureView;
import io.agora.rtc.gl.EglBase;
import io.agora.rtc.gl.RendererCommon;
import io.agora.rtc.mediaio.MediaIO;
import io.agora.rtc.utils.ThreadUtils;
import java.nio.ByteBuffer;

public class AgoraTextureView extends TextureView implements IVideoSink, TextureView.SurfaceTextureListener {
    private static final String TAG = TextureView.class.getSimpleName();
    private int[] mConfigAttributes;
    private RendererCommon.GlDrawer mDrawer;
    private EglBase.Context mEglContext;
    private BaseVideoRenderer mRender;

    public AgoraTextureView(Context context) {
        super(context);
        BaseVideoRenderer baseVideoRenderer = new BaseVideoRenderer(TAG);
        this.mRender = baseVideoRenderer;
        baseVideoRenderer.setRenderView((TextureView) this, (TextureView.SurfaceTextureListener) this);
    }

    public void consumeByteArrayFrame(byte[] bArr, int i, int i2, int i3, int i4, long j) {
        this.mRender.consume(bArr, i, i2, i3, i4, j);
    }

    public void consumeByteBufferFrame(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, long j) {
        this.mRender.consume(byteBuffer, i, i2, i3, i4, j);
    }

    public void consumeTextureFrame(int i, int i2, int i3, int i4, int i5, long j, float[] fArr) {
        this.mRender.consume(i, i2, i3, i4, i5, j, fArr);
    }

    public int getBufferType() {
        int bufferType = this.mRender.getBufferType();
        if (bufferType != -1) {
            return bufferType;
        }
        throw new IllegalArgumentException("Buffer type is not set");
    }

    public long getEGLContextHandle() {
        return this.mRender.getEGLContextHandle();
    }

    public int getPixelFormat() {
        int pixelFormat = this.mRender.getPixelFormat();
        if (pixelFormat != -1) {
            return pixelFormat;
        }
        throw new IllegalArgumentException("Pixel format is not set");
    }

    public void init(EglBase.Context context) {
        this.mEglContext = context;
    }

    public void onDispose() {
        this.mRender.release();
    }

    public boolean onInitialize() {
        RendererCommon.GlDrawer glDrawer;
        int[] iArr = this.mConfigAttributes;
        if (iArr == null || (glDrawer = this.mDrawer) == null) {
            this.mRender.init(this.mEglContext);
            return true;
        }
        this.mRender.init(this.mEglContext, iArr, glDrawer);
        return true;
    }

    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        ThreadUtils.checkIsOnMainThread();
        this.mRender.getEglRender().setLayoutAspectRatio(((float) (i3 - i)) / ((float) (i4 - i2)));
    }

    public boolean onStart() {
        return this.mRender.start();
    }

    public void onStop() {
        this.mRender.stop();
    }

    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        String str = TAG;
        Log.e(str, "onSurfaceTextureSizeChanged: width- " + i + ", height: " + i2);
    }

    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public void setBufferType(MediaIO.BufferType bufferType) {
        this.mRender.setBufferType(bufferType);
    }

    public void setMirror(boolean z) {
        this.mRender.getEglRender().setMirror(z);
    }

    public void setPixelFormat(MediaIO.PixelFormat pixelFormat) {
        this.mRender.setPixelFormat(pixelFormat);
    }

    public void init(EglBase.Context context, int[] iArr, RendererCommon.GlDrawer glDrawer) {
        this.mEglContext = context;
        this.mConfigAttributes = iArr;
        this.mDrawer = glDrawer;
    }

    public AgoraTextureView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        BaseVideoRenderer baseVideoRenderer = new BaseVideoRenderer(TAG);
        this.mRender = baseVideoRenderer;
        baseVideoRenderer.setRenderView((TextureView) this, (TextureView.SurfaceTextureListener) this);
    }
}
