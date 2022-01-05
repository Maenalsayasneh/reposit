package io.agora.rtc.gl;

import android.graphics.Matrix;
import android.os.Handler;
import com.instabug.library.settings.SettingsManager;
import io.agora.rtc.gl.EglBase;
import java.nio.ByteBuffer;

public class VideoFrame {
    private final Buffer buffer;
    private final int rotation;
    private final long timestampNs;

    public interface Buffer {
        Buffer cropAndScale(int i, int i2, int i3, int i4, int i5, int i6);

        int getHeight();

        int getWidth();

        void release();

        void retain();

        I420Buffer toI420();
    }

    public interface I420Buffer extends Buffer {
        ByteBuffer getDataU();

        ByteBuffer getDataV();

        ByteBuffer getDataY();

        int getStrideU();

        int getStrideV();

        int getStrideY();
    }

    public interface TextureBuffer extends Buffer {
        public static final String TAG = "TEXBUF";

        public enum Type {
            OES(36197),
            RGB(3553);
            
            private final int glTarget;

            private Type(int i) {
                this.glTarget = i;
            }

            public int getGlTarget() {
                return this.glTarget;
            }
        }

        TextureBuffer flip(boolean z);

        EglBase.Context getEglBaseContext();

        int getEglType();

        float[] getGlTransformMatrix();

        long getNativeBuffer();

        long getNativeEglContext();

        Object getRealEglContext();

        int getSequence();

        int getTextureId();

        int getTextureType();

        Handler getToI420Handler();

        Matrix getTransformMatrix();

        Type getType();

        YuvConverter getYuvConverter();

        String infoString();

        boolean isNativeBufferSupported();

        boolean isValidNativeBuffer();

        TextureBuffer rotate(int i);

        TextureBuffer toAGraphicBufferEx();

        TextureBuffer toTextureBuffer();
    }

    public VideoFrame(Buffer buffer2, int i, long j) {
        if (buffer2 == null) {
            throw new IllegalArgumentException("buffer not allowed to be null");
        } else if (i % 90 == 0) {
            this.buffer = buffer2;
            this.rotation = i;
            this.timestampNs = j;
        } else {
            throw new IllegalArgumentException("rotation must be a multiple of 90");
        }
    }

    public static Buffer cropAndScaleI420(I420Buffer i420Buffer, int i, int i2, int i3, int i4, int i5, int i6) {
        if (i3 != i5) {
            I420Buffer i420Buffer2 = i420Buffer;
            int i7 = i4;
            int i8 = i6;
        } else if (i4 == i6) {
            ByteBuffer dataY = i420Buffer.getDataY();
            ByteBuffer dataU = i420Buffer.getDataU();
            ByteBuffer dataV = i420Buffer.getDataV();
            dataY.position((i420Buffer.getStrideY() * i2) + i);
            int i9 = i / 2;
            int i10 = i2 / 2;
            dataU.position((i420Buffer.getStrideU() * i10) + i9);
            dataV.position((i420Buffer.getStrideV() * i10) + i9);
            i420Buffer.retain();
            final I420Buffer i420Buffer3 = i420Buffer;
            return JavaI420Buffer.wrap(i420Buffer.getWidth(), i420Buffer.getHeight(), dataY.slice(), i420Buffer.getStrideY(), dataU.slice(), i420Buffer.getStrideU(), dataV.slice(), i420Buffer.getStrideV(), new Runnable() {
                public void run() {
                    i420Buffer3.release();
                }
            });
        } else {
            I420Buffer i420Buffer4 = i420Buffer;
        }
        JavaI420Buffer allocate = JavaI420Buffer.allocate(i5, i6);
        nativeCropAndScaleI420(i420Buffer.getDataY(), i420Buffer.getStrideY(), i420Buffer.getDataU(), i420Buffer.getStrideU(), i420Buffer.getDataV(), i420Buffer.getStrideV(), i, i2, i3, i4, allocate.getDataY(), allocate.getStrideY(), allocate.getDataU(), allocate.getStrideU(), allocate.getDataV(), allocate.getStrideV(), i5, i6);
        return allocate;
    }

    public static final int getAgoraFormat(TextureBuffer textureBuffer) {
        return textureBuffer.getType() == TextureBuffer.Type.OES ? 11 : 10;
    }

    private static native void nativeCropAndScaleI420(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, ByteBuffer byteBuffer3, int i3, int i4, int i5, int i6, int i7, ByteBuffer byteBuffer4, int i8, ByteBuffer byteBuffer5, int i9, ByteBuffer byteBuffer6, int i10, int i11, int i12);

    public Buffer getBuffer() {
        return this.buffer;
    }

    public int getRotatedHeight() {
        if (this.rotation % SettingsManager.MAX_ASR_DURATION_IN_SECONDS == 0) {
            return this.buffer.getHeight();
        }
        return this.buffer.getWidth();
    }

    public int getRotatedWidth() {
        if (this.rotation % SettingsManager.MAX_ASR_DURATION_IN_SECONDS == 0) {
            return this.buffer.getWidth();
        }
        return this.buffer.getHeight();
    }

    public int getRotation() {
        return this.rotation;
    }

    public long getTimestampNs() {
        return this.timestampNs;
    }

    public void release() {
        this.buffer.release();
    }

    public void retain() {
        this.buffer.retain();
    }
}
