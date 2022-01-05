package i0.j.e.b.c;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import com.instabug.library.annotation.e.g;
import java.util.List;

/* compiled from: Matcher */
public class a {
    public int a;
    public int b;
    public int c;
    public int d;
    public int e;
    public float f;
    public final Path g;
    public Paint h;

    public a(Path path) {
        Paint paint = new Paint();
        this.h = paint;
        paint.setStyle(Paint.Style.STROKE);
        this.h.setStrokeWidth(2.0f);
        Path a2 = d.a(path);
        this.g = a2;
        this.f = new PathMeasure(a2, false).getLength();
        Bitmap createBitmap = Bitmap.createBitmap(28, 28, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.h.setColor(-65536);
        canvas.drawPath(a2, this.h);
        int[] iArr = new int[784];
        createBitmap.getPixels(iArr, 0, 28, 0, 0, 28, 28);
        for (int i = 0; i < 784; i++) {
            if (iArr[i] == -65536) {
                this.a++;
                if (i < 392) {
                    this.c++;
                } else {
                    this.e++;
                }
                if (i % 28 < 14) {
                    this.b++;
                } else {
                    this.d++;
                }
            }
        }
    }

    public final float a(List<g> list) {
        float f2 = 0.0f;
        for (g gVar : list) {
            f2 += gVar.q;
        }
        return f2 / ((float) list.size());
    }

    public final g b(Path path, Path path2) {
        Bitmap createBitmap = Bitmap.createBitmap(28, 28, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        this.h.setColor(-16777216);
        canvas.drawPath(path, this.h);
        int[] iArr = new int[784];
        createBitmap.getPixels(iArr, 0, 28, 0, 0, 28, 28);
        int i = 0;
        for (int i2 = 0; i2 < 784; i2++) {
            if (iArr[i2] == -16777216) {
                i++;
            }
        }
        this.h.setColor(-2130706433);
        canvas.drawPath(path2, this.h);
        int[] iArr2 = new int[784];
        createBitmap.getPixels(iArr2, 0, createBitmap.getWidth(), 0, 0, 28, 28);
        g gVar = new g();
        float f2 = 0.0f;
        float f3 = 0.0f;
        int i3 = 0;
        for (int i4 = 0; i4 < 784; i4++) {
            int i5 = iArr2[i4];
            if (i5 == -8355712) {
                i3++;
            } else if (i5 == -2130706433) {
                f2 += 1.0f;
            } else if (i5 == -16777216) {
                f3 += 1.0f;
            }
        }
        gVar.c = i3;
        float f4 = f2 / ((float) this.a);
        gVar.y = f4;
        float f5 = (float) i;
        float f6 = f3 / f5;
        gVar.Y1 = f6;
        gVar.q = ((((float) i3) / f5) + (((1.0f - f6) + 1.0f) - f4)) / 3.0f;
        gVar.Z1 = this.b;
        gVar.a2 = this.c;
        gVar.b2 = this.d;
        gVar.c2 = this.e;
        gVar.d2 = this.f;
        return gVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x0090  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.instabug.library.annotation.e.g c(com.instabug.library.annotation.e.e r10) {
        /*
            r9 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            com.instabug.library.annotation.e.e r1 = com.instabug.library.annotation.e.e.RECT
            r2 = 0
            r3 = 0
            if (r10 != r1) goto L_0x0019
            java.util.List<i0.j.e.b.c.c> r1 = i0.j.c.l.a.a
            if (r1 == 0) goto L_0x0011
            goto L_0x007e
        L_0x0011:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            i0.j.c.l.a.a = r1
            goto L_0x0029
        L_0x0019:
            com.instabug.library.annotation.e.e r1 = com.instabug.library.annotation.e.e.OVAL
            if (r10 != r1) goto L_0x0029
            java.util.List<i0.j.e.b.c.c> r1 = i0.j.c.l.a.b
            if (r1 == 0) goto L_0x0022
            goto L_0x007e
        L_0x0022:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            i0.j.c.l.a.b = r1
        L_0x0029:
            android.graphics.RectF r1 = new android.graphics.RectF
            r4 = 1105199104(0x41e00000, float:28.0)
            r1.<init>(r2, r2, r4, r4)
            r5 = r3
        L_0x0031:
            r6 = 12
            if (r5 >= r6) goto L_0x006f
            i0.j.e.b.c.c r6 = new i0.j.e.b.c.c
            r6.<init>()
            float r7 = r1.left
            r8 = 1065353216(0x3f800000, float:1.0)
            float r7 = r7 + r8
            r1.left = r7
            float r7 = r1.right
            float r7 = r7 - r8
            r1.right = r7
            com.instabug.library.annotation.e.e r7 = com.instabug.library.annotation.e.e.RECT
            if (r10 != r7) goto L_0x0057
            android.graphics.Path r7 = r6.a
            android.graphics.Path$Direction r8 = android.graphics.Path.Direction.CW
            r7.addRect(r1, r8)
            java.util.List<i0.j.e.b.c.c> r7 = i0.j.c.l.a.a
            r7.add(r6)
            goto L_0x0067
        L_0x0057:
            com.instabug.library.annotation.e.e r7 = com.instabug.library.annotation.e.e.OVAL
            if (r10 != r7) goto L_0x0067
            android.graphics.Path r7 = r6.a
            android.graphics.Path$Direction r8 = android.graphics.Path.Direction.CW
            r7.addOval(r1, r8)
            java.util.List<i0.j.e.b.c.c> r7 = i0.j.c.l.a.b
            r7.add(r6)
        L_0x0067:
            float r7 = r1.left
            float r7 = r7 / r4
            r6.b = r7
            int r5 = r5 + 1
            goto L_0x0031
        L_0x006f:
            com.instabug.library.annotation.e.e r1 = com.instabug.library.annotation.e.e.RECT
            if (r10 != r1) goto L_0x0076
            java.util.List<i0.j.e.b.c.c> r1 = i0.j.c.l.a.a
            goto L_0x007e
        L_0x0076:
            com.instabug.library.annotation.e.e r1 = com.instabug.library.annotation.e.e.OVAL
            if (r10 != r1) goto L_0x007d
            java.util.List<i0.j.e.b.c.c> r1 = i0.j.c.l.a.b
            goto L_0x007e
        L_0x007d:
            r1 = 0
        L_0x007e:
            if (r1 == 0) goto L_0x00c0
            boolean r4 = r1.isEmpty()
            if (r4 != 0) goto L_0x00c0
            java.util.Iterator r1 = r1.iterator()
        L_0x008a:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L_0x00c0
            java.lang.Object r4 = r1.next()
            i0.j.e.b.c.c r4 = (i0.j.e.b.c.c) r4
            r5 = r3
        L_0x0097:
            r6 = 18
            if (r5 >= r6) goto L_0x008a
            int r6 = r5 * 10
            android.graphics.Path r7 = r4.a
            android.graphics.Path r7 = i0.j.e.b.c.d.b(r7, r6)
            android.graphics.Path r8 = r9.g
            com.instabug.library.annotation.e.g r7 = r9.b(r7, r8)
            r7.d = r6
            float r6 = r4.b
            r7.x = r6
            r0.add(r7)
            com.instabug.library.annotation.e.e r6 = com.instabug.library.annotation.e.e.OVAL
            if (r10 != r6) goto L_0x00bd
            float r6 = r4.b
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 != 0) goto L_0x00bd
            goto L_0x008a
        L_0x00bd:
            int r5 = r5 + 1
            goto L_0x0097
        L_0x00c0:
            java.lang.Object r10 = java.util.Collections.max(r0)
            com.instabug.library.annotation.e.g r10 = (com.instabug.library.annotation.e.g) r10
            r9.a(r0)
            java.util.Objects.requireNonNull(r10)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.b.c.a.c(com.instabug.library.annotation.e.e):com.instabug.library.annotation.e.g");
    }
}
