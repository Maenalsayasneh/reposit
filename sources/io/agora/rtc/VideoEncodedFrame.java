package io.agora.rtc;

import i0.d.a.a.a;
import java.nio.ByteBuffer;

public class VideoEncodedFrame {
    public static final int CODEC_TYPE_E264 = 4;
    public static final int CODEC_TYPE_EVP = 3;
    public static final int CODEC_TYPE_H264 = 2;
    public static final int CODEC_TYPE_VP8 = 1;
    public static final int FRAME_TYPE_B = 5;
    public static final int FRAME_TYPE_BLANK = 0;
    public static final int FRAME_TYPE_DELTA = 4;
    public static final int FRAME_TYPE_KEY = 3;
    public int codecType;
    public int frameType;
    public int height;
    public ByteBuffer imageBuffer;
    public int length;
    public long renderTimeMs;
    public int rotation;
    public int width;

    public VideoEncodedFrame(int i, ByteBuffer byteBuffer, int i2, int i3, int i4, int i5, int i6, long j) {
        this.codecType = i;
        this.width = i3;
        this.height = i4;
        this.imageBuffer = byteBuffer;
        this.length = i2;
        this.frameType = i5;
        this.rotation = i6;
        this.renderTimeMs = j;
    }

    public String toString() {
        StringBuilder P0 = a.P0("VideoEncodedFrame{codecType=");
        P0.append(this.codecType);
        P0.append(", width=");
        P0.append(this.width);
        P0.append(", height=");
        P0.append(this.height);
        P0.append(", frameType=");
        P0.append(this.frameType);
        P0.append(", rotation=");
        P0.append(this.rotation);
        P0.append(", renderTimeMs=");
        P0.append(this.renderTimeMs);
        P0.append(", imageBuffer=");
        P0.append(this.imageBuffer);
        P0.append(", length=");
        return a.s0(P0, this.length, '}');
    }
}
