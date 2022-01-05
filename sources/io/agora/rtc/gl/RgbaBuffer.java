package io.agora.rtc.gl;

import io.agora.rtc.gl.VideoFrame;
import java.nio.ByteBuffer;

public class RgbaBuffer implements VideoFrame.Buffer {
    private final ByteBuffer mBuffer;
    private int mHeight;
    private int mWidth;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;

    public RgbaBuffer(ByteBuffer byteBuffer, int i, int i2, Runnable runnable) {
        this.mBuffer = byteBuffer;
        this.mWidth = i;
        this.mHeight = i2;
        this.releaseCallback = runnable;
    }

    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return null;
    }

    public ByteBuffer getBuffer() {
        return this.mBuffer;
    }

    public int getHeight() {
        return this.mHeight;
    }

    public int getWidth() {
        return this.mWidth;
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

    public void retain() {
        synchronized (this.refCountLock) {
            this.refCount++;
        }
    }

    public VideoFrame.I420Buffer toI420() {
        return null;
    }
}
