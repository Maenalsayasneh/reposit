package io.agora.rtc.utils;

import android.annotation.TargetApi;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.Rect;
import android.graphics.YuvImage;
import android.media.Image;
import android.util.Log;
import io.agora.rtc.gl.JavaI420Buffer;
import io.agora.rtc.gl.VideoFrame;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;

@TargetApi(21)
public class YuvUtils {
    public static final int I420 = 35;
    public static final int NV21 = 17;
    private static final String TAG = "YuvUtils";

    public static class Plane {
        private ByteBuffer buffer;
        private int pixelStride;
        private int rowStride;

        public Plane(ByteBuffer byteBuffer, int i, int i2) {
            this.buffer = byteBuffer;
            this.rowStride = i;
            this.pixelStride = i2;
        }

        public ByteBuffer getBuffer() {
            return this.buffer;
        }

        public int getPixelStride() {
            return this.pixelStride;
        }

        public int getRowStride() {
            return this.rowStride;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:27:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0098  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] getImageData(android.media.Image r19, int r20) {
        /*
            r0 = r20
            r1 = 17
            r2 = 35
            if (r0 == r2) goto L_0x0013
            if (r0 != r1) goto L_0x000b
            goto L_0x0013
        L_0x000b:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "only support COLOR_FormatI420 and COLOR_FormatNV21"
            r0.<init>(r1)
            throw r0
        L_0x0013:
            boolean r3 = supportedImageFormat(r19)
            if (r3 == 0) goto L_0x00d9
            android.graphics.Rect r3 = r19.getCropRect()
            int r4 = r19.getFormat()
            int r5 = r3.width()
            int r6 = r3.height()
            android.media.Image$Plane[] r7 = r19.getPlanes()
            int r8 = r5 * r6
            int r4 = android.graphics.ImageFormat.getBitsPerPixel(r4)
            int r4 = r4 * r8
            int r4 = r4 / 8
            byte[] r4 = new byte[r4]
            r9 = 0
            r10 = r7[r9]
            int r10 = r10.getRowStride()
            byte[] r10 = new byte[r10]
            r11 = 1
            r12 = r9
            r13 = r11
            r14 = r13
            r11 = r12
        L_0x0046:
            int r15 = r7.length
            if (r9 >= r15) goto L_0x00d8
            r15 = 2
            if (r9 == 0) goto L_0x0069
            if (r9 == r13) goto L_0x005e
            if (r9 == r15) goto L_0x0051
            goto L_0x006b
        L_0x0051:
            if (r0 != r2) goto L_0x005a
            double r1 = (double) r8
            r14 = 4608308318706860032(0x3ff4000000000000, double:1.25)
            double r1 = r1 * r14
            int r1 = (int) r1
            r12 = r1
            goto L_0x006a
        L_0x005a:
            if (r0 != r1) goto L_0x006b
            r12 = r8
            goto L_0x0067
        L_0x005e:
            if (r0 != r2) goto L_0x0062
            r12 = r8
            goto L_0x006a
        L_0x0062:
            if (r0 != r1) goto L_0x006b
            int r1 = r8 + 1
            r12 = r1
        L_0x0067:
            r14 = r15
            goto L_0x006b
        L_0x0069:
            r12 = r11
        L_0x006a:
            r14 = r13
        L_0x006b:
            r1 = r7[r9]
            java.nio.ByteBuffer r1 = r1.getBuffer()
            r2 = r7[r9]
            int r2 = r2.getRowStride()
            r15 = r7[r9]
            int r15 = r15.getPixelStride()
            if (r9 != 0) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r11 = r13
        L_0x0081:
            int r13 = r5 >> r11
            int r0 = r6 >> r11
            r16 = r5
            int r5 = r3.top
            int r5 = r5 >> r11
            int r5 = r5 * r2
            r17 = r6
            int r6 = r3.left
            int r6 = r6 >> r11
            int r6 = r6 * r15
            int r6 = r6 + r5
            r1.position(r6)
            r5 = 0
        L_0x0096:
            if (r5 >= r0) goto L_0x00c8
            r6 = 1
            if (r15 != r6) goto L_0x00a3
            if (r14 != r6) goto L_0x00a3
            r1.get(r4, r12, r13)
            int r12 = r12 + r13
            r6 = r13
            goto L_0x00b8
        L_0x00a3:
            int r6 = r13 + -1
            int r6 = r6 * r15
            int r6 = r6 + 1
            r11 = 0
            r1.get(r10, r11, r6)
        L_0x00ac:
            if (r11 >= r13) goto L_0x00b8
            int r18 = r11 * r15
            byte r18 = r10[r18]
            r4[r12] = r18
            int r12 = r12 + r14
            int r11 = r11 + 1
            goto L_0x00ac
        L_0x00b8:
            int r11 = r0 + -1
            if (r5 >= r11) goto L_0x00c5
            int r11 = r1.position()
            int r11 = r11 + r2
            int r11 = r11 - r6
            r1.position(r11)
        L_0x00c5:
            int r5 = r5 + 1
            goto L_0x0096
        L_0x00c8:
            int r9 = r9 + 1
            r1 = 17
            r2 = 35
            r11 = 0
            r13 = 1
            r0 = r20
            r5 = r16
            r6 = r17
            goto L_0x0046
        L_0x00d8:
            return r4
        L_0x00d9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r1 = "can't convert Image to byte array, format "
            java.lang.StringBuilder r1 = i0.d.a.a.a.P0(r1)
            int r2 = r19.getFormat()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.rtc.utils.YuvUtils.getImageData(android.media.Image, int):byte[]");
    }

    public static boolean supportedImageFormat(Image image) {
        int format = image.getFormat();
        return format == 17 || format == 35 || format == 842094169;
    }

    public static void write420ImageToFile(Image image, String str) {
        if (image != null) {
            try {
                YuvImage yuvImage = new YuvImage(yuv420toNV21(image), 17, image.getWidth(), image.getHeight(), (int[]) null);
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                yuvImage.compressToJpeg(new Rect(0, 0, image.getWidth(), image.getHeight()), 100, byteArrayOutputStream);
                File file = new File(str);
                file.createNewFile();
                FileOutputStream fileOutputStream = new FileOutputStream(file);
                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (IOException e) {
                Log.e(TAG, e.toString());
            }
        }
    }

    public static boolean writeNV21ToFile(byte[] bArr, int i, int i2, String str) {
        YuvImage yuvImage = new YuvImage(bArr, 17, i, i2, (int[]) null);
        Rect rect = new Rect(0, 0, i, i2);
        try {
            File file = new File(str);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            yuvImage.compressToJpeg(rect, 100, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
            return true;
        } catch (IOException e) {
            Log.e(TAG, e.toString());
            return false;
        }
    }

    public static void writeRawData(byte[] bArr, String str) {
        if (bArr != null && bArr.length != 0) {
            try {
                File file = new File(str);
                file.createNewFile();
                BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream(file));
                bufferedOutputStream.write(bArr);
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
            } catch (IOException e) {
                Log.e(TAG, e.toString());
            }
        }
    }

    public static void writeRgbaToFile(Buffer buffer, int i, int i2, String str) {
        try {
            File file = new File(str);
            file.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
            createBitmap.copyPixelsFromBuffer(buffer);
            createBitmap.compress(Bitmap.CompressFormat.JPEG, 50, fileOutputStream);
            fileOutputStream.flush();
            fileOutputStream.close();
        } catch (IOException e) {
            Log.e(TAG, e.toString());
        }
    }

    public static byte[] yuv420toNV21(Image image) {
        int i;
        Rect cropRect = image.getCropRect();
        int format = image.getFormat();
        int width = cropRect.width();
        int height = cropRect.height();
        Image.Plane[] planes = image.getPlanes();
        int i2 = width * height;
        byte[] bArr = new byte[((ImageFormat.getBitsPerPixel(format) * i2) / 8)];
        int i3 = 0;
        byte[] bArr2 = new byte[planes[0].getRowStride()];
        int i4 = 1;
        int i5 = 0;
        int i6 = 0;
        int i7 = 1;
        while (i5 < planes.length) {
            if (i5 != 0) {
                if (i5 == i4) {
                    i6 = i2 + 1;
                } else if (i5 == 2) {
                    i6 = i2;
                }
                i7 = 2;
            } else {
                i6 = i3;
                i7 = i4;
            }
            ByteBuffer buffer = planes[i5].getBuffer();
            int rowStride = planes[i5].getRowStride();
            int pixelStride = planes[i5].getPixelStride();
            int i8 = i5 == 0 ? i3 : i4;
            int i9 = width >> i8;
            int i10 = height >> i8;
            int i11 = width;
            int i12 = height;
            buffer.position(((cropRect.left >> i8) * pixelStride) + ((cropRect.top >> i8) * rowStride));
            for (int i13 = 0; i13 < i10; i13++) {
                if (pixelStride == 1 && i7 == 1) {
                    buffer.get(bArr, i6, i9);
                    i6 += i9;
                    i = i9;
                } else {
                    i = ((i9 - 1) * pixelStride) + 1;
                    buffer.get(bArr2, 0, i);
                    for (int i14 = 0; i14 < i9; i14++) {
                        bArr[i6] = bArr2[i14 * pixelStride];
                        i6 += i7;
                    }
                }
                if (i13 < i10 - 1) {
                    buffer.position((buffer.position() + rowStride) - i);
                }
            }
            i5++;
            width = i11;
            height = i12;
            i3 = 0;
            i4 = 1;
        }
        return bArr;
    }

    public static byte[] yuv420toNV21(byte[] bArr, int i, int i2) {
        return yuv420toNV21((VideoFrame.I420Buffer) JavaI420Buffer.createYUV(bArr, i, i2), i, i2);
    }

    public static byte[] yuv420toNV21(VideoFrame.I420Buffer i420Buffer, int i, int i2) {
        int i3;
        int i4 = i;
        int i5 = i2;
        int i6 = 0;
        Rect rect = new Rect(0, 0, i4, i5);
        int i7 = 3;
        int i8 = 1;
        int i9 = 2;
        Plane[] planeArr = {new Plane(i420Buffer.getDataY(), i420Buffer.getStrideY(), 1), new Plane(i420Buffer.getDataU(), i420Buffer.getStrideU(), 1), new Plane(i420Buffer.getDataV(), i420Buffer.getStrideV(), 1)};
        int i10 = i4 * i5;
        byte[] bArr = new byte[((ImageFormat.getBitsPerPixel(35) * i10) / 8)];
        byte[] bArr2 = new byte[planeArr[0].getRowStride()];
        int i11 = 0;
        int i12 = 0;
        int i13 = 1;
        while (i11 < i7) {
            if (i11 == 0) {
                i12 = i6;
                i13 = i8;
            } else if (i11 == i8) {
                i12 = i10 + 1;
                i13 = i9;
            } else if (i11 == i9) {
                i13 = i9;
                i12 = i10;
            }
            ByteBuffer buffer = planeArr[i11].getBuffer();
            int rowStride = planeArr[i11].getRowStride();
            int pixelStride = planeArr[i11].getPixelStride();
            int i14 = i11 == 0 ? i6 : i8;
            int i15 = i4 >> i14;
            int i16 = i5 >> i14;
            buffer.position(((rect.left >> i14) * pixelStride) + ((rect.top >> i14) * rowStride));
            int i17 = 0;
            while (i17 < i16) {
                if (pixelStride == 1 && i13 == 1) {
                    buffer.get(bArr, i12, i15);
                    i12 += i15;
                    i3 = i15;
                } else {
                    i3 = ((i15 - 1) * pixelStride) + 1;
                    buffer.get(bArr2, 0, i3);
                    for (int i18 = 0; i18 < i15; i18++) {
                        bArr[i12] = bArr2[i18 * pixelStride];
                        i12 += i13;
                    }
                }
                if (i17 < i16 - 1) {
                    buffer.position((buffer.position() + rowStride) - i3);
                }
                i17++;
                int i19 = i2;
            }
            i11++;
            i4 = i;
            i5 = i2;
            i6 = 0;
            i7 = 3;
            i9 = 2;
            i8 = 1;
        }
        return bArr;
    }
}
