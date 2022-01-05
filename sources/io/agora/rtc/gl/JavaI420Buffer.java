package io.agora.rtc.gl;

import i0.d.a.a.a;
import io.agora.rtc.gl.VideoFrame;
import java.nio.ByteBuffer;

public class JavaI420Buffer implements VideoFrame.I420Buffer {
    private final ByteBuffer dataU;
    private final ByteBuffer dataV;
    private final ByteBuffer dataY;
    private final int height;
    private int refCount;
    private final Object refCountLock = new Object();
    private final Runnable releaseCallback;
    private final int strideU;
    private final int strideV;
    private final int strideY;
    private final int width;

    private JavaI420Buffer(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        this.width = i;
        this.height = i2;
        this.dataY = byteBuffer;
        this.dataU = byteBuffer2;
        this.dataV = byteBuffer3;
        this.strideY = i3;
        this.strideU = i4;
        this.strideV = i5;
        this.releaseCallback = runnable;
        this.refCount = 1;
    }

    public static JavaI420Buffer allocate(int i, int i2) {
        int i3 = (i2 + 1) / 2;
        int i4 = (i + 1) / 2;
        int i5 = i * i2;
        int i6 = i5 + 0;
        int i7 = i4 * i3;
        int i8 = i6 + i7;
        ByteBuffer allocateDirect = ByteBuffer.allocateDirect((i4 * 2 * i3) + i5);
        allocateDirect.position(0);
        allocateDirect.limit(i6);
        ByteBuffer slice = allocateDirect.slice();
        allocateDirect.position(i6);
        allocateDirect.limit(i8);
        ByteBuffer slice2 = allocateDirect.slice();
        allocateDirect.position(i8);
        allocateDirect.limit(i8 + i7);
        return new JavaI420Buffer(i, i2, slice, i, slice2, i4, allocateDirect.slice(), i4, (Runnable) null);
    }

    public static JavaI420Buffer createYUV(byte[] bArr, int i, int i2) {
        if (bArr == null || bArr.length == 0) {
            return null;
        }
        JavaI420Buffer allocate = allocate(i, i2);
        ByteBuffer dataY2 = allocate.getDataY();
        ByteBuffer dataU2 = allocate.getDataU();
        ByteBuffer dataV2 = allocate.getDataV();
        int i3 = (i2 + 1) / 2;
        int strideY2 = allocate.getStrideY() * i2;
        int strideU2 = allocate.getStrideU() * i3;
        dataY2.put(bArr, 0, strideY2);
        dataU2.put(bArr, strideY2, strideU2);
        dataV2.put(bArr, strideY2 + strideU2, allocate.getStrideV() * i3);
        return allocate;
    }

    public static JavaI420Buffer wrap(int i, int i2, ByteBuffer byteBuffer, int i3, ByteBuffer byteBuffer2, int i4, ByteBuffer byteBuffer3, int i5, Runnable runnable) {
        if (byteBuffer == null || byteBuffer2 == null || byteBuffer3 == null) {
            throw new IllegalArgumentException("Data buffers cannot be null.");
        } else if (!byteBuffer.isDirect() || !byteBuffer2.isDirect() || !byteBuffer3.isDirect()) {
            throw new IllegalArgumentException("Data buffers must be direct byte buffers.");
        } else {
            ByteBuffer slice = byteBuffer.slice();
            ByteBuffer slice2 = byteBuffer2.slice();
            ByteBuffer slice3 = byteBuffer3.slice();
            int i6 = (i2 + 1) / 2;
            int i7 = i3 * i2;
            int i8 = i4 * i6;
            int i9 = i6 * i5;
            if (slice.capacity() < i7) {
                throw new IllegalArgumentException(a.g0("Y-buffer must be at least ", i7, " bytes."));
            } else if (slice2.capacity() < i8) {
                throw new IllegalArgumentException(a.g0("U-buffer must be at least ", i8, " bytes."));
            } else if (slice3.capacity() >= i9) {
                return new JavaI420Buffer(i, i2, slice, i3, slice2, i4, slice3, i5, runnable);
            } else {
                throw new IllegalArgumentException(a.g0("V-buffer must be at least ", i9, " bytes."));
            }
        }
    }

    public VideoFrame.Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6) {
        return VideoFrame.cropAndScaleI420(this, i, i2, i3, i4, i5, i6);
    }

    public ByteBuffer getDataU() {
        return this.dataU.slice();
    }

    public ByteBuffer getDataV() {
        return this.dataV.slice();
    }

    public ByteBuffer getDataY() {
        return this.dataY.slice();
    }

    public int getHeight() {
        return this.height;
    }

    public int getStrideU() {
        return this.strideU;
    }

    public int getStrideV() {
        return this.strideV;
    }

    public int getStrideY() {
        return this.strideY;
    }

    public int getWidth() {
        return this.width;
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
        retain();
        return this;
    }
}
