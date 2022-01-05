package i0.h.a.c.w;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import i0.h.a.c.w.g;
import i0.h.a.c.w.n;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Objects;

/* compiled from: ShapeAppearancePathProvider */
public class l {
    public final n[] a = new n[4];
    public final Matrix[] b = new Matrix[4];
    public final Matrix[] c = new Matrix[4];
    public final PointF d = new PointF();
    public final Path e = new Path();
    public final Path f = new Path();
    public final n g = new n();
    public final float[] h = new float[2];
    public final float[] i = new float[2];
    public final Path j = new Path();
    public final Path k = new Path();
    public boolean l = true;

    /* compiled from: ShapeAppearancePathProvider */
    public static class a {
        public static final l a = new l();
    }

    /* compiled from: ShapeAppearancePathProvider */
    public interface b {
    }

    public l() {
        for (int i2 = 0; i2 < 4; i2++) {
            this.a[i2] = new n();
            this.b[i2] = new Matrix();
            this.c[i2] = new Matrix();
        }
    }

    public void a(k kVar, float f2, RectF rectF, b bVar, Path path) {
        float f3;
        f fVar;
        char c2;
        c cVar;
        d dVar;
        k kVar2 = kVar;
        float f4 = f2;
        RectF rectF2 = rectF;
        Path path2 = path;
        path.rewind();
        this.e.rewind();
        this.f.rewind();
        this.f.addRect(rectF2, Path.Direction.CW);
        int i2 = 0;
        while (i2 < 4) {
            if (i2 == 1) {
                cVar = kVar2.h;
            } else if (i2 == 2) {
                cVar = kVar2.i;
            } else if (i2 != 3) {
                cVar = kVar2.g;
            } else {
                cVar = kVar2.f;
            }
            if (i2 == 1) {
                dVar = kVar2.d;
            } else if (i2 == 2) {
                dVar = kVar2.e;
            } else if (i2 != 3) {
                dVar = kVar2.c;
            } else {
                dVar = kVar2.b;
            }
            n nVar = this.a[i2];
            Objects.requireNonNull(dVar);
            dVar.a(nVar, 90.0f, f4, cVar.a(rectF2));
            int i3 = i2 + 1;
            float f5 = (float) (i3 * 90);
            this.b[i2].reset();
            PointF pointF = this.d;
            if (i2 == 1) {
                pointF.set(rectF2.right, rectF2.bottom);
            } else if (i2 == 2) {
                pointF.set(rectF2.left, rectF2.bottom);
            } else if (i2 != 3) {
                pointF.set(rectF2.right, rectF2.top);
            } else {
                pointF.set(rectF2.left, rectF2.top);
            }
            Matrix matrix = this.b[i2];
            PointF pointF2 = this.d;
            matrix.setTranslate(pointF2.x, pointF2.y);
            this.b[i2].preRotate(f5);
            float[] fArr = this.h;
            n[] nVarArr = this.a;
            fArr[0] = nVarArr[i2].c;
            fArr[1] = nVarArr[i2].d;
            this.b[i2].mapPoints(fArr);
            this.c[i2].reset();
            Matrix matrix2 = this.c[i2];
            float[] fArr2 = this.h;
            matrix2.setTranslate(fArr2[0], fArr2[1]);
            this.c[i2].preRotate(f5);
            i2 = i3;
        }
        int i4 = 0;
        while (i4 < 4) {
            float[] fArr3 = this.h;
            n[] nVarArr2 = this.a;
            fArr3[0] = nVarArr2[i4].a;
            fArr3[1] = nVarArr2[i4].b;
            this.b[i4].mapPoints(fArr3);
            if (i4 == 0) {
                float[] fArr4 = this.h;
                path2.moveTo(fArr4[0], fArr4[1]);
            } else {
                float[] fArr5 = this.h;
                path2.lineTo(fArr5[0], fArr5[1]);
            }
            this.a[i4].c(this.b[i4], path2);
            if (bVar != null) {
                n nVar2 = this.a[i4];
                Matrix matrix3 = this.b[i4];
                g.a aVar = (g.a) bVar;
                BitSet bitSet = g.this.Y1;
                Objects.requireNonNull(nVar2);
                bitSet.set(i4, false);
                n.f[] fVarArr = g.this.x;
                nVar2.b(nVar2.f);
                fVarArr[i4] = new m(nVar2, new ArrayList(nVar2.h), new Matrix(matrix3));
            }
            int i5 = i4 + 1;
            int i6 = i5 % 4;
            float[] fArr6 = this.h;
            n[] nVarArr3 = this.a;
            fArr6[0] = nVarArr3[i4].c;
            fArr6[1] = nVarArr3[i4].d;
            this.b[i4].mapPoints(fArr6);
            float[] fArr7 = this.i;
            n[] nVarArr4 = this.a;
            fArr7[0] = nVarArr4[i6].a;
            fArr7[1] = nVarArr4[i6].b;
            this.b[i6].mapPoints(fArr7);
            float[] fArr8 = this.h;
            float f6 = fArr8[0];
            float[] fArr9 = this.i;
            float max = Math.max(((float) Math.hypot((double) (f6 - fArr9[0]), (double) (fArr8[1] - fArr9[1]))) - 0.001f, 0.0f);
            float[] fArr10 = this.h;
            n[] nVarArr5 = this.a;
            fArr10[0] = nVarArr5[i4].c;
            fArr10[1] = nVarArr5[i4].d;
            this.b[i4].mapPoints(fArr10);
            if (i4 == 1 || i4 == 3) {
                f3 = Math.abs(rectF.centerX() - this.h[0]);
            } else {
                f3 = Math.abs(rectF.centerY() - this.h[1]);
            }
            this.g.e(0.0f, 0.0f, 270.0f, 0.0f);
            if (i4 == 1) {
                c2 = 3;
                fVar = kVar2.l;
            } else if (i4 != 2) {
                c2 = 3;
                if (i4 != 3) {
                    fVar = kVar2.k;
                } else {
                    fVar = kVar2.j;
                }
            } else {
                c2 = 3;
                fVar = kVar2.m;
            }
            fVar.c(max, f3, f4, this.g);
            this.j.reset();
            this.g.c(this.c[i4], this.j);
            if (!this.l || (!fVar.b() && !b(this.j, i4) && !b(this.j, i6))) {
                this.g.c(this.c[i4], path2);
            } else {
                Path path3 = this.j;
                path3.op(path3, this.f, Path.Op.DIFFERENCE);
                float[] fArr11 = this.h;
                n nVar3 = this.g;
                fArr11[0] = nVar3.a;
                fArr11[1] = nVar3.b;
                this.c[i4].mapPoints(fArr11);
                Path path4 = this.e;
                float[] fArr12 = this.h;
                path4.moveTo(fArr12[0], fArr12[1]);
                this.g.c(this.c[i4], this.e);
            }
            if (bVar != null) {
                n nVar4 = this.g;
                Matrix matrix4 = this.c[i4];
                g.a aVar2 = (g.a) bVar;
                Objects.requireNonNull(nVar4);
                g.this.Y1.set(i4 + 4, false);
                n.f[] fVarArr2 = g.this.y;
                nVar4.b(nVar4.f);
                fVarArr2[i4] = new m(nVar4, new ArrayList(nVar4.h), new Matrix(matrix4));
            }
            i4 = i5;
            char c3 = c2;
        }
        path.close();
        this.e.close();
        if (!this.e.isEmpty()) {
            path2.op(this.e, Path.Op.UNION);
        }
    }

    public final boolean b(Path path, int i2) {
        this.k.reset();
        this.a[i2].c(this.b[i2], this.k);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        this.k.computeBounds(rectF, true);
        path.op(this.k, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        if (!rectF.isEmpty()) {
            return true;
        }
        if (rectF.width() <= 1.0f || rectF.height() <= 1.0f) {
            return false;
        }
        return true;
    }
}
