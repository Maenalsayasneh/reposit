package io.agora.rtc.gl;

import android.graphics.Matrix;
import android.graphics.Point;
import android.opengl.GLES20;
import io.agora.rtc.gl.RendererCommon;
import io.agora.rtc.gl.VideoFrame;
import java.nio.ByteBuffer;

public class VideoFrameDrawer {
    public static final float[] srcPoints = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f};
    private final float[] dstPoints = new float[6];
    private VideoFrame lastI420Frame;
    private VideoFrame lastRgbaFrame;
    private int renderHeight;
    private final Matrix renderMatrix = new Matrix();
    private final Point renderSize = new Point();
    private int renderWidth;
    private final RGBAUploader rgbaUploader = new RGBAUploader((AnonymousClass1) null);
    private final YuvUploader yuvUploader = new YuvUploader((AnonymousClass1) null);

    /* renamed from: io.agora.rtc.gl.VideoFrameDrawer$1  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$io$agora$rtc$gl$VideoFrame$TextureBuffer$Type;

        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        static {
            /*
                io.agora.rtc.gl.VideoFrame.TextureBuffer.Type.values()
                r0 = 2
                int[] r1 = new int[r0]
                $SwitchMap$io$agora$rtc$gl$VideoFrame$TextureBuffer$Type = r1
                io.agora.rtc.gl.VideoFrame$TextureBuffer$Type r2 = io.agora.rtc.gl.VideoFrame.TextureBuffer.Type.OES     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r1 = $SwitchMap$io$agora$rtc$gl$VideoFrame$TextureBuffer$Type     // Catch:{ NoSuchFieldError -> 0x001b }
                io.agora.rtc.gl.VideoFrame$TextureBuffer$Type r2 = io.agora.rtc.gl.VideoFrame.TextureBuffer.Type.RGB     // Catch:{ NoSuchFieldError -> 0x001b }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x001b }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x001b }
            L_0x001b:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.gl.VideoFrameDrawer.AnonymousClass1.<clinit>():void");
        }
    }

    public static class YuvUploader {
        private ByteBuffer copyBuffer;
        private int[] yuvTextures;

        private YuvUploader() {
        }

        public int[] getYuvTextures() {
            return this.yuvTextures;
        }

        public void release() {
            this.copyBuffer = null;
            int[] iArr = this.yuvTextures;
            if (iArr != null) {
                GLES20.glDeleteTextures(3, iArr, 0);
                this.yuvTextures = null;
            }
        }

        public int[] uploadFromBuffer(VideoFrame.I420Buffer i420Buffer) {
            return uploadYuvData(i420Buffer.getWidth(), i420Buffer.getHeight(), new int[]{i420Buffer.getStrideY(), i420Buffer.getStrideU(), i420Buffer.getStrideV()}, new ByteBuffer[]{i420Buffer.getDataY(), i420Buffer.getDataU(), i420Buffer.getDataV()});
        }

        public int[] uploadYuvData(int i, int i2, int[] iArr, ByteBuffer[] byteBufferArr) {
            ByteBuffer byteBuffer;
            ByteBuffer byteBuffer2;
            int i3 = i / 2;
            int[] iArr2 = {i, i3, i3};
            int i4 = i2 / 2;
            int[] iArr3 = {i2, i4, i4};
            int i5 = 0;
            for (int i6 = 0; i6 < 3; i6++) {
                if (iArr[i6] > iArr2[i6]) {
                    i5 = Math.max(i5, iArr2[i6] * iArr3[i6]);
                }
            }
            if (i5 > 0 && ((byteBuffer2 = this.copyBuffer) == null || byteBuffer2.capacity() < i5)) {
                this.copyBuffer = ByteBuffer.allocateDirect(i5);
            }
            if (this.yuvTextures == null) {
                this.yuvTextures = new int[3];
                for (int i7 = 0; i7 < 3; i7++) {
                    this.yuvTextures[i7] = GlUtil.generateTexture(3553);
                }
            }
            for (int i8 = 0; i8 < 3; i8++) {
                GLES20.glActiveTexture(33984 + i8);
                GLES20.glBindTexture(3553, this.yuvTextures[i8]);
                if (iArr[i8] == iArr2[i8]) {
                    byteBuffer = byteBufferArr[i8];
                } else {
                    byteBuffer = this.copyBuffer;
                }
                GLES20.glTexImage2D(3553, 0, 6409, iArr2[i8], iArr3[i8], 0, 6409, 5121, byteBuffer);
            }
            return this.yuvTextures;
        }

        public /* synthetic */ YuvUploader(AnonymousClass1 r1) {
            this();
        }
    }

    private void calculateTransformedRenderSize(int i, int i2, Matrix matrix) {
        if (matrix == null) {
            this.renderWidth = i;
            this.renderHeight = i2;
            return;
        }
        matrix.mapPoints(this.dstPoints, srcPoints);
        for (int i3 = 0; i3 < 3; i3++) {
            float[] fArr = this.dstPoints;
            int i4 = i3 * 2;
            int i5 = i4 + 0;
            fArr[i5] = fArr[i5] * ((float) i);
            int i6 = i4 + 1;
            fArr[i6] = fArr[i6] * ((float) i2);
        }
        float[] fArr2 = this.dstPoints;
        this.renderWidth = distance(fArr2[0], fArr2[1], fArr2[2], fArr2[3]);
        float[] fArr3 = this.dstPoints;
        this.renderHeight = distance(fArr3[0], fArr3[1], fArr3[4], fArr3[5]);
    }

    private static int distance(float f, float f2, float f3, float f4) {
        return (int) Math.round(Math.hypot((double) (f3 - f), (double) (f4 - f2)));
    }

    public static void drawTexture(RendererCommon.GlDrawer glDrawer, VideoFrame.TextureBuffer textureBuffer, Matrix matrix, int i, int i2, int i3, int i4, int i5, int i6) {
        Matrix matrix2 = new Matrix(textureBuffer.getTransformMatrix());
        Matrix matrix3 = matrix;
        matrix2.preConcat(matrix);
        float[] convertMatrixFromAndroidGraphicsMatrix = RendererCommon.convertMatrixFromAndroidGraphicsMatrix(matrix2);
        int ordinal = textureBuffer.getType().ordinal();
        if (ordinal == 0) {
            glDrawer.drawOes(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
        } else if (ordinal == 1) {
            glDrawer.drawRgb(textureBuffer.getTextureId(), convertMatrixFromAndroidGraphicsMatrix, i, i2, i3, i4, i5, i6);
        } else {
            throw new RuntimeException("Unknown texture type.");
        }
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer) {
        drawFrame(videoFrame, glDrawer, (Matrix) null);
    }

    public void release() {
        this.yuvUploader.release();
        this.lastI420Frame = null;
        this.rgbaUploader.release();
        this.lastRgbaFrame = null;
    }

    public static class RGBAUploader {
        private ByteBuffer mData;
        private int mTextureId;

        private RGBAUploader() {
            this.mTextureId = 0;
        }

        public int getTextureId() {
            return this.mTextureId;
        }

        public void release() {
            this.mData = null;
            int i = this.mTextureId;
            if (i != 0) {
                GLES20.glDeleteTextures(1, new int[]{i}, 0);
                this.mTextureId = 0;
            }
        }

        public int uploadData(ByteBuffer byteBuffer, int i, int i2) {
            this.mData = byteBuffer;
            if (this.mTextureId == 0) {
                this.mTextureId = GlUtil.generateTexture(3553);
            }
            GLES20.glActiveTexture(33984);
            GLES20.glBindTexture(3553, this.mTextureId);
            GLES20.glTexImage2D(3553, 0, 6408, i, i2, 0, 6408, 5121, this.mData);
            GlUtil.checkNoGLES2Error("glTexImage2D");
            return this.mTextureId;
        }

        public /* synthetic */ RGBAUploader(AnonymousClass1 r1) {
            this();
        }
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix) {
        drawFrame(videoFrame, glDrawer, matrix, 0, 0, videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight());
    }

    public void drawFrame(VideoFrame videoFrame, RendererCommon.GlDrawer glDrawer, Matrix matrix, int i, int i2, int i3, int i4) {
        VideoFrame videoFrame2 = videoFrame;
        Matrix matrix2 = matrix;
        calculateTransformedRenderSize(videoFrame.getRotatedWidth(), videoFrame.getRotatedHeight(), matrix);
        boolean z = videoFrame.getBuffer() instanceof VideoFrame.TextureBuffer;
        boolean z2 = videoFrame.getBuffer() instanceof RgbaBuffer;
        this.renderMatrix.reset();
        this.renderMatrix.preTranslate(0.5f, 0.5f);
        if (!z) {
            this.renderMatrix.preScale(1.0f, -1.0f);
        }
        this.renderMatrix.preRotate((float) videoFrame.getRotation());
        this.renderMatrix.preTranslate(-0.5f, -0.5f);
        if (matrix2 != null) {
            this.renderMatrix.preConcat(matrix);
        }
        if (z) {
            this.lastI420Frame = null;
            this.lastRgbaFrame = null;
            drawTexture(glDrawer, (VideoFrame.TextureBuffer) videoFrame.getBuffer(), this.renderMatrix, this.renderWidth, this.renderHeight, i, i2, i3, i4);
        } else if (z2) {
            if (videoFrame2 != this.lastRgbaFrame) {
                this.lastRgbaFrame = videoFrame2;
                RgbaBuffer rgbaBuffer = (RgbaBuffer) videoFrame.getBuffer();
                this.rgbaUploader.uploadData(rgbaBuffer.getBuffer(), rgbaBuffer.getWidth(), rgbaBuffer.getHeight());
                rgbaBuffer.release();
            }
            glDrawer.drawRgb(this.rgbaUploader.getTextureId(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i, i2, i3, i4);
        } else {
            if (videoFrame2 != this.lastI420Frame) {
                this.lastI420Frame = videoFrame2;
                VideoFrame.I420Buffer i420 = videoFrame.getBuffer().toI420();
                this.yuvUploader.uploadFromBuffer(i420);
                i420.release();
            }
            glDrawer.drawYuv(this.yuvUploader.getYuvTextures(), RendererCommon.convertMatrixFromAndroidGraphicsMatrix(this.renderMatrix), this.renderWidth, this.renderHeight, i, i2, i3, i4);
        }
    }
}
