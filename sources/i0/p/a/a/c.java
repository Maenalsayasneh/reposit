package i0.p.a.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import com.theartofdev.edmodo.cropper.CropImageView;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.ref.WeakReference;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import org.json.HTTP;

/* compiled from: BitmapUtils */
public final class c {
    public static final Rect a = new Rect();
    public static final RectF b = new RectF();
    public static final RectF c = new RectF();
    public static final float[] d = new float[6];
    public static final float[] e = new float[6];
    public static int f;
    public static Pair<String, WeakReference<Bitmap>> g;

    /* compiled from: BitmapUtils */
    public static final class a {
        public final Bitmap a;
        public final int b;

        public a(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = i;
        }
    }

    /* compiled from: BitmapUtils */
    public static final class b {
        public final Bitmap a;
        public final int b;

        public b(Bitmap bitmap, int i) {
            this.a = bitmap;
            this.b = i;
        }
    }

    public static int a(int i, int i2) {
        int i3 = 1;
        if (f == 0) {
            int i4 = 2048;
            try {
                EGL10 egl10 = (EGL10) EGLContext.getEGL();
                EGLDisplay eglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
                egl10.eglInitialize(eglGetDisplay, new int[2]);
                int[] iArr = new int[1];
                egl10.eglGetConfigs(eglGetDisplay, (EGLConfig[]) null, 0, iArr);
                EGLConfig[] eGLConfigArr = new EGLConfig[iArr[0]];
                egl10.eglGetConfigs(eglGetDisplay, eGLConfigArr, iArr[0], iArr);
                int[] iArr2 = new int[1];
                int i5 = 0;
                for (int i6 = 0; i6 < iArr[0]; i6++) {
                    egl10.eglGetConfigAttrib(eglGetDisplay, eGLConfigArr[i6], 12332, iArr2);
                    if (i5 < iArr2[0]) {
                        i5 = iArr2[0];
                    }
                }
                egl10.eglTerminate(eglGetDisplay);
                i4 = Math.max(i5, 2048);
            } catch (Exception unused) {
            }
            f = i4;
        }
        if (f > 0) {
            while (true) {
                int i7 = i2 / i3;
                int i8 = f;
                if (i7 <= i8 && i / i3 <= i8) {
                    break;
                }
                i3 *= 2;
            }
        }
        return i3;
    }

    public static int b(int i, int i2, int i3, int i4) {
        int i5 = 1;
        if (i2 > i4 || i > i3) {
            while ((i2 / 2) / i5 > i4 && (i / 2) / i5 > i3) {
                i5 *= 2;
            }
        }
        return i5;
    }

    public static a c(Context context, Uri uri, float[] fArr, int i, int i2, int i3, boolean z, int i4, int i5, int i6, int i7, boolean z2, boolean z3) {
        OutOfMemoryError outOfMemoryError;
        int i8 = 1;
        do {
            try {
                return d(context, uri, fArr, i, i2, i3, z, i4, i5, i6, i7, z2, z3, i8);
            } catch (OutOfMemoryError e2) {
                outOfMemoryError = e2;
                i8 *= 2;
                if (i8 > 16) {
                    throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + HTTP.CRLF + outOfMemoryError.getMessage(), outOfMemoryError);
                }
            }
        } while (i8 > 16);
        throw new RuntimeException("Failed to handle OOM by sampling (" + i8 + "): " + uri + HTTP.CRLF + outOfMemoryError.getMessage(), outOfMemoryError);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00e8, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00e9, code lost:
        r17 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00f9, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00fa, code lost:
        r2 = new java.lang.StringBuilder();
        r2.append("Failed to load sampled bitmap: ");
        r2.append(r7);
        r2.append(org.json.HTTP.CRLF);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0115, code lost:
        throw new java.lang.RuntimeException(i0.d.a.a.a.a0(r0, r2), r0);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0045 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x009b A[SYNTHETIC, Splitter:B:42:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x00f9 A[ExcHandler: Exception (r0v3 'e' java.lang.Exception A[CUSTOM_DECLARE]), Splitter:B:42:0x009b] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i0.p.a.a.c.a d(android.content.Context r18, android.net.Uri r19, float[] r20, int r21, int r22, int r23, boolean r24, int r25, int r26, int r27, int r28, boolean r29, boolean r30, int r31) {
        /*
            r7 = r19
            r0 = r20
            r10 = r21
            r1 = r20
            r2 = r22
            r3 = r23
            r4 = r24
            r5 = r25
            r6 = r26
            android.graphics.Rect r8 = o(r1, r2, r3, r4, r5, r6)
            if (r27 <= 0) goto L_0x001b
            r9 = r27
            goto L_0x0020
        L_0x001b:
            int r1 = r8.width()
            r9 = r1
        L_0x0020:
            if (r28 <= 0) goto L_0x0025
            r11 = r28
            goto L_0x002a
        L_0x0025:
            int r1 = r8.height()
            r11 = r1
        L_0x002a:
            r17 = 0
            r1 = r18
            r2 = r19
            r3 = r8
            r4 = r9
            r5 = r11
            r6 = r31
            i0.p.a.a.c$a r1 = j(r1, r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x003e }
            android.graphics.Bitmap r2 = r1.a     // Catch:{ Exception -> 0x003e }
            int r1 = r1.b     // Catch:{ Exception -> 0x0040 }
            goto L_0x0041
        L_0x003e:
            r2 = r17
        L_0x0040:
            r1 = 1
        L_0x0041:
            r12 = r1
            r13 = r2
            if (r13 == 0) goto L_0x009b
            if (r10 > 0) goto L_0x004b
            if (r29 != 0) goto L_0x004b
            if (r30 == 0) goto L_0x007a
        L_0x004b:
            android.graphics.Matrix r6 = new android.graphics.Matrix     // Catch:{ OutOfMemoryError -> 0x0094 }
            r6.<init>()     // Catch:{ OutOfMemoryError -> 0x0094 }
            float r1 = (float) r10     // Catch:{ OutOfMemoryError -> 0x0094 }
            r6.setRotate(r1)     // Catch:{ OutOfMemoryError -> 0x0094 }
            r1 = -1082130432(0xffffffffbf800000, float:-1.0)
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r29 == 0) goto L_0x005c
            r3 = r1
            goto L_0x005d
        L_0x005c:
            r3 = r2
        L_0x005d:
            if (r30 == 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r1 = r2
        L_0x0061:
            r6.postScale(r3, r1)     // Catch:{ OutOfMemoryError -> 0x0094 }
            r2 = 0
            r3 = 0
            int r4 = r13.getWidth()     // Catch:{ OutOfMemoryError -> 0x0094 }
            int r5 = r13.getHeight()     // Catch:{ OutOfMemoryError -> 0x0094 }
            r7 = 0
            r1 = r13
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x0094 }
            if (r1 == r13) goto L_0x0079
            r13.recycle()     // Catch:{ OutOfMemoryError -> 0x0094 }
        L_0x0079:
            r13 = r1
        L_0x007a:
            int r1 = r10 % 90
            if (r1 == 0) goto L_0x008e
            r1 = r13
            r2 = r20
            r3 = r8
            r4 = r21
            r5 = r24
            r6 = r25
            r7 = r26
            android.graphics.Bitmap r13 = g(r1, r2, r3, r4, r5, r6, r7)     // Catch:{ OutOfMemoryError -> 0x0094 }
        L_0x008e:
            i0.p.a.a.c$a r0 = new i0.p.a.a.c$a
            r0.<init>(r13, r12)
            return r0
        L_0x0094:
            r0 = move-exception
            if (r13 == 0) goto L_0x009a
            r13.recycle()
        L_0x009a:
            throw r0
        L_0x009b:
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ OutOfMemoryError -> 0x0116, Exception -> 0x00f9 }
            r1.<init>()     // Catch:{ OutOfMemoryError -> 0x0116, Exception -> 0x00f9 }
            int r2 = r8.width()     // Catch:{ OutOfMemoryError -> 0x0116, Exception -> 0x00f9 }
            int r3 = r8.height()     // Catch:{ OutOfMemoryError -> 0x0116, Exception -> 0x00f9 }
            int r2 = b(r2, r3, r9, r11)     // Catch:{ OutOfMemoryError -> 0x0116, Exception -> 0x00f9 }
            int r2 = r2 * r31
            r1.inSampleSize = r2     // Catch:{ OutOfMemoryError -> 0x0116, Exception -> 0x00f9 }
            android.content.ContentResolver r3 = r18.getContentResolver()     // Catch:{ OutOfMemoryError -> 0x0116, Exception -> 0x00f9 }
            android.graphics.Bitmap r3 = h(r3, r7, r1)     // Catch:{ OutOfMemoryError -> 0x0116, Exception -> 0x00f9 }
            if (r3 == 0) goto L_0x00f1
            int r4 = r0.length     // Catch:{ all -> 0x00ec }
            float[] r9 = new float[r4]     // Catch:{ all -> 0x00ec }
            int r5 = r0.length     // Catch:{ all -> 0x00ec }
            r6 = 0
            java.lang.System.arraycopy(r0, r6, r9, r6, r5)     // Catch:{ all -> 0x00ec }
        L_0x00c2:
            if (r6 >= r4) goto L_0x00cf
            r0 = r9[r6]     // Catch:{ all -> 0x00ec }
            int r5 = r1.inSampleSize     // Catch:{ all -> 0x00ec }
            float r5 = (float) r5     // Catch:{ all -> 0x00ec }
            float r0 = r0 / r5
            r9[r6] = r0     // Catch:{ all -> 0x00ec }
            int r6 = r6 + 1
            goto L_0x00c2
        L_0x00cf:
            r14 = 1065353216(0x3f800000, float:1.0)
            r8 = r3
            r10 = r21
            r11 = r24
            r12 = r25
            r13 = r26
            r15 = r29
            r16 = r30
            android.graphics.Bitmap r1 = f(r8, r9, r10, r11, r12, r13, r14, r15, r16)     // Catch:{ all -> 0x00ec }
            if (r1 == r3) goto L_0x00f3
            r3.recycle()     // Catch:{ OutOfMemoryError -> 0x00e8, Exception -> 0x00f9 }
            goto L_0x00f3
        L_0x00e8:
            r0 = move-exception
            r17 = r1
            goto L_0x0117
        L_0x00ec:
            r0 = move-exception
            r3.recycle()     // Catch:{ OutOfMemoryError -> 0x0116, Exception -> 0x00f9 }
            throw r0     // Catch:{ OutOfMemoryError -> 0x0116, Exception -> 0x00f9 }
        L_0x00f1:
            r1 = r17
        L_0x00f3:
            i0.p.a.a.c$a r0 = new i0.p.a.a.c$a
            r0.<init>(r1, r2)
            return r0
        L_0x00f9:
            r0 = move-exception
            java.lang.RuntimeException r1 = new java.lang.RuntimeException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Failed to load sampled bitmap: "
            r2.append(r3)
            r2.append(r7)
            java.lang.String r3 = "\r\n"
            r2.append(r3)
            java.lang.String r2 = i0.d.a.a.a.a0(r0, r2)
            r1.<init>(r2, r0)
            throw r1
        L_0x0116:
            r0 = move-exception
        L_0x0117:
            if (r17 == 0) goto L_0x011c
            r17.recycle()
        L_0x011c:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.p.a.a.c.d(android.content.Context, android.net.Uri, float[], int, int, int, boolean, int, int, int, int, boolean, boolean, int):i0.p.a.a.c$a");
    }

    public static a e(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, boolean z2, boolean z3) {
        int i4 = 1;
        do {
            try {
                return new a(f(bitmap, fArr, i, z, i2, i3, 1.0f / ((float) i4), z2, z3), i4);
            } catch (OutOfMemoryError e2) {
                i4 *= 2;
                if (i4 > 8) {
                    throw e2;
                }
            }
        } while (i4 > 8);
        throw e2;
    }

    public static Bitmap f(Bitmap bitmap, float[] fArr, int i, boolean z, int i2, int i3, float f2, boolean z2, boolean z3) {
        Bitmap bitmap2 = bitmap;
        int i4 = i;
        float f3 = f2;
        Rect o = o(fArr, bitmap.getWidth(), bitmap.getHeight(), z, i2, i3);
        Matrix matrix = new Matrix();
        matrix.setRotate((float) i4, (float) (bitmap.getWidth() / 2), (float) (bitmap.getHeight() / 2));
        float f4 = z2 ? -f3 : f3;
        if (z3) {
            f3 = -f3;
        }
        matrix.postScale(f4, f3);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, o.left, o.top, o.width(), o.height(), matrix, true);
        if (createBitmap == bitmap2) {
            createBitmap = bitmap.copy(bitmap.getConfig(), false);
        }
        return i4 % 90 != 0 ? g(createBitmap, fArr, o, i, z, i2, i3) : createBitmap;
    }

    public static Bitmap g(Bitmap bitmap, float[] fArr, Rect rect, int i, boolean z, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        if (i % 90 == 0) {
            return bitmap;
        }
        double radians = Math.toRadians((double) i);
        int i7 = (i < 90 || (i > 180 && i < 270)) ? rect.left : rect.right;
        int i8 = 0;
        int i9 = 0;
        while (true) {
            if (i9 < fArr.length) {
                if (fArr[i9] >= ((float) (i7 - 1)) && fArr[i9] <= ((float) (i7 + 1))) {
                    int i10 = i9 + 1;
                    int abs = (int) Math.abs(Math.sin(radians) * ((double) (((float) rect.bottom) - fArr[i10])));
                    int abs2 = (int) Math.abs(Math.cos(radians) * ((double) (fArr[i10] - ((float) rect.top))));
                    int abs3 = (int) Math.abs(((double) (((float) rect.bottom) - fArr[i10])) / Math.cos(radians));
                    i6 = abs2;
                    i5 = abs3;
                    i4 = abs;
                    i8 = (int) Math.abs(((double) (fArr[i10] - ((float) rect.top))) / Math.sin(radians));
                    break;
                }
                i9 += 2;
            } else {
                i4 = 0;
                i5 = 0;
                i6 = 0;
                break;
            }
        }
        rect.set(i4, i6, i8 + i4, i5 + i6);
        if (z) {
            k(rect, i2, i3);
        }
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, rect.left, rect.top, rect.width(), rect.height());
        if (bitmap != createBitmap) {
            bitmap.recycle();
        }
        return createBitmap;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:9|10|(2:12|13)|14|(3:24|17|18)) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.inSampleSize *= 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003c, code lost:
        if (r0 != null) goto L_0x003e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:?, code lost:
        r0.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0041, code lost:
        throw r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0011, code lost:
        r2 = move-exception;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0013 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Bitmap h(android.content.ContentResolver r2, android.net.Uri r3, android.graphics.BitmapFactory.Options r4) throws java.io.FileNotFoundException {
        /*
        L_0x0000:
            r0 = 0
            java.io.InputStream r0 = r2.openInputStream(r3)     // Catch:{ OutOfMemoryError -> 0x0013 }
            android.graphics.Rect r1 = a     // Catch:{ OutOfMemoryError -> 0x0013 }
            android.graphics.Bitmap r2 = android.graphics.BitmapFactory.decodeStream(r0, r1, r4)     // Catch:{ OutOfMemoryError -> 0x0013 }
            if (r0 == 0) goto L_0x0010
            r0.close()     // Catch:{ IOException -> 0x0010 }
        L_0x0010:
            return r2
        L_0x0011:
            r2 = move-exception
            goto L_0x003c
        L_0x0013:
            int r1 = r4.inSampleSize     // Catch:{ all -> 0x0011 }
            int r1 = r1 * 2
            r4.inSampleSize = r1     // Catch:{ all -> 0x0011 }
            if (r0 == 0) goto L_0x001e
            r0.close()     // Catch:{ IOException -> 0x001e }
        L_0x001e:
            int r0 = r4.inSampleSize
            r1 = 512(0x200, float:7.175E-43)
            if (r0 > r1) goto L_0x0025
            goto L_0x0000
        L_0x0025:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r0 = "Failed to decode image: "
            r4.append(r0)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
        L_0x003c:
            if (r0 == 0) goto L_0x0041
            r0.close()     // Catch:{ IOException -> 0x0041 }
        L_0x0041:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.p.a.a.c.h(android.content.ContentResolver, android.net.Uri, android.graphics.BitmapFactory$Options):android.graphics.Bitmap");
    }

    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0058 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x001d */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0022 A[Catch:{ Exception -> 0x0059 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0055 A[SYNTHETIC, Splitter:B:23:0x0055] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i0.p.a.a.c.a i(android.content.Context r4, android.net.Uri r5, int r6, int r7) {
        /*
            android.content.ContentResolver r4 = r4.getContentResolver()     // Catch:{ Exception -> 0x0059 }
            java.io.InputStream r0 = r4.openInputStream(r5)     // Catch:{ all -> 0x0051 }
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ all -> 0x004f }
            r1.<init>()     // Catch:{ all -> 0x004f }
            r2 = 1
            r1.inJustDecodeBounds = r2     // Catch:{ all -> 0x004f }
            android.graphics.Rect r2 = a     // Catch:{ all -> 0x004f }
            android.graphics.BitmapFactory.decodeStream(r0, r2, r1)     // Catch:{ all -> 0x004f }
            r2 = 0
            r1.inJustDecodeBounds = r2     // Catch:{ all -> 0x004f }
            if (r0 == 0) goto L_0x001d
            r0.close()     // Catch:{ IOException -> 0x001d }
        L_0x001d:
            int r0 = r1.outWidth     // Catch:{ Exception -> 0x0059 }
            r2 = -1
            if (r0 != r2) goto L_0x002f
            int r3 = r1.outHeight     // Catch:{ Exception -> 0x0059 }
            if (r3 == r2) goto L_0x0027
            goto L_0x002f
        L_0x0027:
            java.lang.RuntimeException r4 = new java.lang.RuntimeException     // Catch:{ Exception -> 0x0059 }
            java.lang.String r6 = "File is not a picture"
            r4.<init>(r6)     // Catch:{ Exception -> 0x0059 }
            throw r4     // Catch:{ Exception -> 0x0059 }
        L_0x002f:
            int r2 = r1.outHeight     // Catch:{ Exception -> 0x0059 }
            int r6 = b(r0, r2, r6, r7)     // Catch:{ Exception -> 0x0059 }
            int r7 = r1.outWidth     // Catch:{ Exception -> 0x0059 }
            int r0 = r1.outHeight     // Catch:{ Exception -> 0x0059 }
            int r7 = a(r7, r0)     // Catch:{ Exception -> 0x0059 }
            int r6 = java.lang.Math.max(r6, r7)     // Catch:{ Exception -> 0x0059 }
            r1.inSampleSize = r6     // Catch:{ Exception -> 0x0059 }
            android.graphics.Bitmap r4 = h(r4, r5, r1)     // Catch:{ Exception -> 0x0059 }
            i0.p.a.a.c$a r6 = new i0.p.a.a.c$a     // Catch:{ Exception -> 0x0059 }
            int r7 = r1.inSampleSize     // Catch:{ Exception -> 0x0059 }
            r6.<init>(r4, r7)     // Catch:{ Exception -> 0x0059 }
            return r6
        L_0x004f:
            r4 = move-exception
            goto L_0x0053
        L_0x0051:
            r4 = move-exception
            r0 = 0
        L_0x0053:
            if (r0 == 0) goto L_0x0058
            r0.close()     // Catch:{ IOException -> 0x0058 }
        L_0x0058:
            throw r4     // Catch:{ Exception -> 0x0059 }
        L_0x0059:
            r4 = move-exception
            java.lang.RuntimeException r6 = new java.lang.RuntimeException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Failed to load sampled bitmap: "
            r7.append(r0)
            r7.append(r5)
            java.lang.String r5 = "\r\n"
            r7.append(r5)
            java.lang.String r5 = i0.d.a.a.a.a0(r4, r7)
            r6.<init>(r5, r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.p.a.a.c.i(android.content.Context, android.net.Uri, int, int):i0.p.a.a.c$a");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v3, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v4, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v9, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v5, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v6, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v4, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v7, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: java.io.InputStream} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v12, resolved type: android.graphics.BitmapRegionDecoder} */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r5.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x002d, code lost:
        if (r5 == null) goto L_0x0032;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:16:0x003a */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[SYNTHETIC, Splitter:B:21:0x0046] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0090 A[SYNTHETIC, Splitter:B:43:0x0090] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0095  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static i0.p.a.a.c.a j(android.content.Context r5, android.net.Uri r6, android.graphics.Rect r7, int r8, int r9, int r10) {
        /*
            r0 = 0
            android.graphics.BitmapFactory$Options r1 = new android.graphics.BitmapFactory$Options     // Catch:{ Exception -> 0x0067, all -> 0x0063 }
            r1.<init>()     // Catch:{ Exception -> 0x0067, all -> 0x0063 }
            int r2 = r7.width()     // Catch:{ Exception -> 0x0067, all -> 0x0063 }
            int r3 = r7.height()     // Catch:{ Exception -> 0x0067, all -> 0x0063 }
            int r8 = b(r2, r3, r8, r9)     // Catch:{ Exception -> 0x0067, all -> 0x0063 }
            int r10 = r10 * r8
            r1.inSampleSize = r10     // Catch:{ Exception -> 0x0067, all -> 0x0063 }
            android.content.ContentResolver r5 = r5.getContentResolver()     // Catch:{ Exception -> 0x0067, all -> 0x0063 }
            java.io.InputStream r5 = r5.openInputStream(r6)     // Catch:{ Exception -> 0x0067, all -> 0x0063 }
            r8 = 0
            android.graphics.BitmapRegionDecoder r8 = android.graphics.BitmapRegionDecoder.newInstance(r5, r8)     // Catch:{ Exception -> 0x005e, all -> 0x0059 }
        L_0x0022:
            i0.p.a.a.c$a r9 = new i0.p.a.a.c$a     // Catch:{ OutOfMemoryError -> 0x003a }
            android.graphics.Bitmap r10 = r8.decodeRegion(r7, r1)     // Catch:{ OutOfMemoryError -> 0x003a }
            int r2 = r1.inSampleSize     // Catch:{ OutOfMemoryError -> 0x003a }
            r9.<init>(r10, r2)     // Catch:{ OutOfMemoryError -> 0x003a }
            if (r5 == 0) goto L_0x0032
            r5.close()     // Catch:{ IOException -> 0x0032 }
        L_0x0032:
            r8.recycle()
            return r9
        L_0x0036:
            r6 = move-exception
            goto L_0x0055
        L_0x0038:
            r7 = move-exception
            goto L_0x0057
        L_0x003a:
            int r9 = r1.inSampleSize     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            int r9 = r9 * 2
            r1.inSampleSize = r9     // Catch:{ Exception -> 0x0038, all -> 0x0036 }
            r10 = 512(0x200, float:7.175E-43)
            if (r9 <= r10) goto L_0x0022
            if (r5 == 0) goto L_0x0049
            r5.close()     // Catch:{ IOException -> 0x0049 }
        L_0x0049:
            if (r8 == 0) goto L_0x004e
            r8.recycle()
        L_0x004e:
            i0.p.a.a.c$a r5 = new i0.p.a.a.c$a
            r6 = 1
            r5.<init>(r0, r6)
            return r5
        L_0x0055:
            r0 = r8
            goto L_0x005a
        L_0x0057:
            r0 = r8
            goto L_0x005f
        L_0x0059:
            r6 = move-exception
        L_0x005a:
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x008e
        L_0x005e:
            r7 = move-exception
        L_0x005f:
            r4 = r0
            r0 = r5
            r5 = r4
            goto L_0x006a
        L_0x0063:
            r5 = move-exception
            r6 = r5
            r5 = r0
            goto L_0x008e
        L_0x0067:
            r5 = move-exception
            r7 = r5
            r5 = r0
        L_0x006a:
            java.lang.RuntimeException r8 = new java.lang.RuntimeException     // Catch:{ all -> 0x008d }
            java.lang.StringBuilder r9 = new java.lang.StringBuilder     // Catch:{ all -> 0x008d }
            r9.<init>()     // Catch:{ all -> 0x008d }
            java.lang.String r10 = "Failed to load sampled bitmap: "
            r9.append(r10)     // Catch:{ all -> 0x008d }
            r9.append(r6)     // Catch:{ all -> 0x008d }
            java.lang.String r6 = "\r\n"
            r9.append(r6)     // Catch:{ all -> 0x008d }
            java.lang.String r6 = r7.getMessage()     // Catch:{ all -> 0x008d }
            r9.append(r6)     // Catch:{ all -> 0x008d }
            java.lang.String r6 = r9.toString()     // Catch:{ all -> 0x008d }
            r8.<init>(r6, r7)     // Catch:{ all -> 0x008d }
            throw r8     // Catch:{ all -> 0x008d }
        L_0x008d:
            r6 = move-exception
        L_0x008e:
            if (r0 == 0) goto L_0x0093
            r0.close()     // Catch:{ IOException -> 0x0093 }
        L_0x0093:
            if (r5 == 0) goto L_0x0098
            r5.recycle()
        L_0x0098:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.p.a.a.c.j(android.content.Context, android.net.Uri, android.graphics.Rect, int, int, int):i0.p.a.a.c$a");
    }

    public static void k(Rect rect, int i, int i2) {
        if (i == i2 && rect.width() != rect.height()) {
            if (rect.height() > rect.width()) {
                rect.bottom -= rect.height() - rect.width();
            } else {
                rect.right -= rect.width() - rect.height();
            }
        }
    }

    public static float l(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static float m(float[] fArr) {
        return (q(fArr) + r(fArr)) / 2.0f;
    }

    public static float n(float[] fArr) {
        return (s(fArr) + l(fArr)) / 2.0f;
    }

    public static Rect o(float[] fArr, int i, int i2, boolean z, int i3, int i4) {
        Rect rect = new Rect(Math.round(Math.max(0.0f, q(fArr))), Math.round(Math.max(0.0f, s(fArr))), Math.round(Math.min((float) i, r(fArr))), Math.round(Math.min((float) i2, l(fArr))));
        if (z) {
            k(rect, i3, i4);
        }
        return rect;
    }

    public static float p(float[] fArr) {
        return l(fArr) - s(fArr);
    }

    public static float q(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float r(float[] fArr) {
        return Math.max(Math.max(Math.max(fArr[0], fArr[2]), fArr[4]), fArr[6]);
    }

    public static float s(float[] fArr) {
        return Math.min(Math.min(Math.min(fArr[1], fArr[3]), fArr[5]), fArr[7]);
    }

    public static float t(float[] fArr) {
        return r(fArr) - q(fArr);
    }

    public static Bitmap u(Bitmap bitmap, int i, int i2, CropImageView.RequestSizeOptions requestSizeOptions) {
        if (i > 0 && i2 > 0) {
            try {
                CropImageView.RequestSizeOptions requestSizeOptions2 = CropImageView.RequestSizeOptions.RESIZE_FIT;
                if (requestSizeOptions == requestSizeOptions2 || requestSizeOptions == CropImageView.RequestSizeOptions.RESIZE_INSIDE || requestSizeOptions == CropImageView.RequestSizeOptions.RESIZE_EXACT) {
                    Bitmap bitmap2 = null;
                    if (requestSizeOptions == CropImageView.RequestSizeOptions.RESIZE_EXACT) {
                        bitmap2 = Bitmap.createScaledBitmap(bitmap, i, i2, false);
                    } else {
                        float width = (float) bitmap.getWidth();
                        float height = (float) bitmap.getHeight();
                        float max = Math.max(width / ((float) i), height / ((float) i2));
                        if (max > 1.0f || requestSizeOptions == requestSizeOptions2) {
                            bitmap2 = Bitmap.createScaledBitmap(bitmap, (int) (width / max), (int) (height / max), false);
                        }
                    }
                    if (bitmap2 != null) {
                        if (bitmap2 != bitmap) {
                            bitmap.recycle();
                        }
                        return bitmap2;
                    }
                }
            } catch (Exception e2) {
                Log.w("AIC", "Failed to resize cropped image, return bitmap before resize", e2);
            }
        }
        return bitmap;
    }

    public static void v(Context context, Bitmap bitmap, Uri uri, Bitmap.CompressFormat compressFormat, int i) throws FileNotFoundException {
        OutputStream outputStream = null;
        try {
            outputStream = context.getContentResolver().openOutputStream(uri);
            bitmap.compress(compressFormat, i, outputStream);
        } finally {
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException unused) {
                }
            }
        }
    }
}
