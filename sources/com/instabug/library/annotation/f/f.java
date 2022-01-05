package com.instabug.library.annotation.f;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.graphics.RectF;
import com.instabug.library.annotation.b;
import i0.j.c.l.a;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: RectShape */
public class f extends g {
    public int x;
    public Path y = new Path();

    public f(int i, float f, int i2) {
        super(i, f);
        this.x = i2;
    }

    public Path a(b bVar) {
        if (p() && !bVar.b2) {
            bVar.b2 = true;
            float centerX = bVar.centerX();
            float centerY = bVar.centerY();
            PointF pointF = new PointF(bVar.left, bVar.top);
            a.i(centerX, centerY, (float) this.x, pointF);
            PointF pointF2 = new PointF(bVar.right, bVar.top);
            a.i(centerX, centerY, (float) this.x, pointF2);
            PointF pointF3 = new PointF(bVar.right, bVar.bottom);
            a.i(centerX, centerY, (float) this.x, pointF3);
            PointF pointF4 = new PointF(bVar.left, bVar.bottom);
            a.i(centerX, centerY, (float) this.x, pointF4);
            bVar.y.set(pointF);
            bVar.Y1.set(pointF2);
            bVar.Z1.set(pointF3);
            bVar.a2.set(pointF4);
        }
        l(bVar);
        return this.y;
    }

    public void b(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
    }

    public void c(Canvas canvas, b bVar, b bVar2) {
        if (p() && !bVar.b2) {
            bVar2.b2 = true;
            float centerX = bVar.centerX();
            float centerY = bVar.centerY();
            PointF pointF = new PointF(bVar.left, bVar.top);
            a.i(centerX, centerY, (float) this.x, pointF);
            PointF pointF2 = new PointF(bVar.right, bVar.top);
            a.i(centerX, centerY, (float) this.x, pointF2);
            PointF pointF3 = new PointF(bVar.right, bVar.bottom);
            a.i(centerX, centerY, (float) this.x, pointF3);
            PointF pointF4 = new PointF(bVar.left, bVar.bottom);
            a.i(centerX, centerY, (float) this.x, pointF4);
            bVar2.y.set(pointF);
            bVar2.Y1.set(pointF2);
            bVar2.Z1.set(pointF3);
            bVar2.a2.set(pointF4);
        }
        i(canvas, bVar);
    }

    public void d(Canvas canvas, b bVar, i0.j.e.b.b[] bVarArr) {
        if (!p()) {
            bVarArr[0].a(bVar.left, bVar.top);
            bVarArr[1].a(bVar.right, bVar.top);
            bVarArr[2].a(bVar.right, bVar.bottom);
            bVarArr[3].a(bVar.left, bVar.bottom);
        } else {
            i0.j.e.b.b bVar2 = bVarArr[0];
            PointF pointF = bVar.y;
            bVar2.a(pointF.x, pointF.y);
            i0.j.e.b.b bVar3 = bVarArr[1];
            PointF pointF2 = bVar.Y1;
            bVar3.a(pointF2.x, pointF2.y);
            i0.j.e.b.b bVar4 = bVarArr[2];
            PointF pointF3 = bVar.Z1;
            bVar4.a(pointF3.x, pointF3.y);
            i0.j.e.b.b bVar5 = bVarArr[3];
            PointF pointF4 = bVar.a2;
            bVar5.a(pointF4.x, pointF4.y);
        }
        int color = this.d.getColor();
        for (int i = 0; i < bVarArr.length; i++) {
            bVarArr[i].c = color;
            bVarArr[i].b(canvas);
        }
    }

    public void e(b bVar, b bVar2, int i, int i2) {
        PointF pointF = bVar.y;
        PointF pointF2 = bVar2.y;
        float f = (float) i;
        float f2 = (float) i2;
        pointF.set(pointF2.x + f, pointF2.y + f2);
        PointF pointF3 = bVar.Y1;
        PointF pointF4 = bVar2.Y1;
        pointF3.set(pointF4.x + f, pointF4.y + f2);
        PointF pointF5 = bVar.Z1;
        PointF pointF6 = bVar2.Z1;
        pointF5.set(pointF6.x + f, pointF6.y + f2);
        PointF pointF7 = bVar.a2;
        PointF pointF8 = bVar2.a2;
        pointF7.set(pointF8.x + f, pointF8.y + f2);
        bVar.left = bVar2.left + f;
        bVar.top = bVar2.top + f2;
        bVar.right = bVar2.right + f;
        bVar.bottom = bVar2.bottom + f2;
    }

    public void f(b bVar, b bVar2, boolean z) {
        if (!p() || z) {
            bVar2.c(bVar);
        }
    }

    public boolean g(PointF pointF, b bVar) {
        if (!p()) {
            RectF rectF = new RectF(bVar);
            rectF.inset(50.0f, 50.0f);
            RectF rectF2 = new RectF(bVar);
            rectF2.inset(-50.0f, -50.0f);
            if (!rectF2.contains(pointF.x, pointF.y) || rectF.contains(pointF.x, pointF.y)) {
                return false;
            }
            return true;
        }
        float f = pointF.x;
        float f2 = pointF.y;
        RectF rectF3 = new RectF(f - 50.0f, f2 - 50.0f, f + 50.0f, f2 + 50.0f);
        Path path = this.y;
        ArrayList arrayList = new ArrayList();
        PathMeasure pathMeasure = new PathMeasure(path, false);
        float length = pathMeasure.getLength();
        float[] fArr = new float[2];
        int i = 0;
        while (true) {
            float f3 = (float) i;
            if (f3 >= length) {
                break;
            }
            pathMeasure.getPosTan(f3, fArr, (float[]) null);
            arrayList.add(new PointF(fArr[0], fArr[1]));
            i++;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PointF pointF2 = (PointF) it.next();
            if (rectF3.contains(pointF2.x, pointF2.y)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void h(float r7, float r8, com.instabug.library.annotation.b r9, boolean r10) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r9.y
            r0.set(r7, r8)
            android.graphics.PointF r7 = r9.Z1
            android.graphics.PointF r8 = r9.Y1
            android.graphics.PointF r0 = r9.y
            double r7 = i0.j.c.l.a.a(r7, r8, r0)
            float r7 = (float) r7
            android.graphics.PointF r8 = r9.y
            float r0 = r8.x
            android.graphics.PointF r1 = r9.Y1
            float r2 = r1.x
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 < 0) goto L_0x0036
            float r3 = r8.y
            float r4 = r1.y
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x0025
            goto L_0x0036
        L_0x0025:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x002d
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003c
        L_0x002d:
            int r0 = r6.x
            int r0 = r0 + 180
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
            goto L_0x003c
        L_0x0036:
            int r0 = r6.x
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
        L_0x003c:
            android.graphics.PointF r7 = r9.Z1
            android.graphics.PointF r8 = r9.a2
            android.graphics.PointF r0 = r9.y
            double r7 = i0.j.c.l.a.a(r7, r8, r0)
            float r7 = (float) r7
            android.graphics.PointF r8 = r9.y
            float r0 = r8.y
            android.graphics.PointF r1 = r9.a2
            float r2 = r1.y
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 < 0) goto L_0x006d
            float r3 = r8.x
            float r4 = r1.x
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x005c
            goto L_0x006d
        L_0x005c:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0064
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
        L_0x0064:
            int r0 = r6.x
            int r0 = r0 + 270
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
            goto L_0x0075
        L_0x006d:
            int r0 = r6.x
            int r0 = r0 + 90
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
        L_0x0075:
            if (r10 == 0) goto L_0x0081
            android.graphics.PointF r7 = r9.Z1
            float r8 = r7.x
            float r7 = r7.y
            r10 = 0
            r6.m(r8, r7, r9, r10)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.f.f.h(float, float, com.instabug.library.annotation.b, boolean):void");
    }

    public void i(Canvas canvas, b bVar) {
        canvas.drawPath(a(bVar), this.d);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void k(float r7, float r8, com.instabug.library.annotation.b r9, boolean r10) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r9.Y1
            r0.set(r7, r8)
            android.graphics.PointF r7 = r9.a2
            android.graphics.PointF r8 = r9.y
            android.graphics.PointF r0 = r9.Y1
            double r7 = i0.j.c.l.a.a(r7, r8, r0)
            float r7 = (float) r7
            android.graphics.PointF r8 = r9.Y1
            float r0 = r8.x
            android.graphics.PointF r1 = r9.y
            float r2 = r1.x
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x0034
            float r3 = r8.y
            float r4 = r1.y
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x0025
            goto L_0x0034
        L_0x0025:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x002d
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x003c
        L_0x002d:
            int r0 = r6.x
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
            goto L_0x003c
        L_0x0034:
            int r0 = r6.x
            int r0 = r0 + 180
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
        L_0x003c:
            android.graphics.PointF r7 = r9.a2
            android.graphics.PointF r8 = r9.Z1
            android.graphics.PointF r0 = r9.Y1
            double r7 = i0.j.c.l.a.a(r7, r8, r0)
            float r7 = (float) r7
            android.graphics.PointF r8 = r9.Y1
            float r0 = r8.y
            android.graphics.PointF r1 = r9.Z1
            float r2 = r1.y
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 < 0) goto L_0x006d
            float r3 = r8.x
            float r4 = r1.x
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x005c
            goto L_0x006d
        L_0x005c:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0064
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
        L_0x0064:
            int r0 = r6.x
            int r0 = r0 + 270
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
            goto L_0x0075
        L_0x006d:
            int r0 = r6.x
            int r0 = r0 + 90
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
        L_0x0075:
            if (r10 == 0) goto L_0x0081
            android.graphics.PointF r7 = r9.a2
            float r8 = r7.x
            float r7 = r7.y
            r10 = 0
            r6.q(r8, r7, r9, r10)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.f.f.k(float, float, com.instabug.library.annotation.b, boolean):void");
    }

    public void l(b bVar) {
        this.y.reset();
        if (!p()) {
            this.y.addRect(bVar, Path.Direction.CW);
            return;
        }
        Path path = this.y;
        PointF pointF = bVar.y;
        path.moveTo(pointF.x, pointF.y);
        Path path2 = this.y;
        PointF pointF2 = bVar.Y1;
        path2.lineTo(pointF2.x, pointF2.y);
        Path path3 = this.y;
        PointF pointF3 = bVar.Z1;
        path3.lineTo(pointF3.x, pointF3.y);
        Path path4 = this.y;
        PointF pointF4 = bVar.a2;
        path4.lineTo(pointF4.x, pointF4.y);
        this.y.close();
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void m(float r7, float r8, com.instabug.library.annotation.b r9, boolean r10) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r9.Z1
            r0.set(r7, r8)
            android.graphics.PointF r7 = r9.y
            android.graphics.PointF r8 = r9.Y1
            android.graphics.PointF r0 = r9.Z1
            double r7 = i0.j.c.l.a.a(r7, r8, r0)
            float r7 = (float) r7
            android.graphics.PointF r8 = r9.Z1
            float r0 = r8.y
            android.graphics.PointF r1 = r9.Y1
            float r2 = r1.y
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x0036
            float r3 = r8.x
            float r4 = r1.x
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x0025
            goto L_0x0036
        L_0x0025:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x002d
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
        L_0x002d:
            int r0 = r6.x
            int r0 = r0 + 90
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
            goto L_0x003e
        L_0x0036:
            int r0 = r6.x
            int r0 = r0 + 270
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
        L_0x003e:
            android.graphics.PointF r7 = r9.y
            android.graphics.PointF r8 = r9.a2
            android.graphics.PointF r0 = r9.Z1
            double r7 = i0.j.c.l.a.a(r7, r8, r0)
            float r7 = (float) r7
            android.graphics.PointF r8 = r9.Z1
            float r0 = r8.x
            android.graphics.PointF r1 = r9.a2
            float r2 = r1.x
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x006d
            float r3 = r8.y
            float r4 = r1.y
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 <= 0) goto L_0x005e
            goto L_0x006d
        L_0x005e:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x0066
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0075
        L_0x0066:
            int r0 = r6.x
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
            goto L_0x0075
        L_0x006d:
            int r0 = r6.x
            int r0 = r0 + 180
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
        L_0x0075:
            if (r10 == 0) goto L_0x0081
            android.graphics.PointF r7 = r9.y
            float r8 = r7.x
            float r7 = r7.y
            r10 = 0
            r6.h(r8, r7, r9, r10)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.f.f.m(float, float, com.instabug.library.annotation.b, boolean):void");
    }

    public final void n(b bVar) {
        RectF rectF = new RectF();
        this.y.computeBounds(rectF, true);
        bVar.set(rectF);
    }

    public final boolean p() {
        int i = this.x;
        return (i == 0 || i == 180 || i == 90) ? false : true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0077  */
    /* JADX WARNING: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void q(float r7, float r8, com.instabug.library.annotation.b r9, boolean r10) {
        /*
            r6 = this;
            android.graphics.PointF r0 = r9.a2
            r0.set(r7, r8)
            android.graphics.PointF r7 = r9.Y1
            android.graphics.PointF r8 = r9.y
            android.graphics.PointF r0 = r9.a2
            double r7 = i0.j.c.l.a.a(r7, r8, r0)
            float r7 = (float) r7
            android.graphics.PointF r8 = r9.a2
            float r0 = r8.y
            android.graphics.PointF r1 = r9.y
            float r2 = r1.y
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x0036
            float r3 = r8.x
            float r4 = r1.x
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x0025
            goto L_0x0036
        L_0x0025:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 < 0) goto L_0x002d
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x003e
        L_0x002d:
            int r0 = r6.x
            int r0 = r0 + 90
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
            goto L_0x003e
        L_0x0036:
            int r0 = r6.x
            int r0 = r0 + 270
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
        L_0x003e:
            android.graphics.PointF r7 = r9.Y1
            android.graphics.PointF r8 = r9.Z1
            android.graphics.PointF r0 = r9.a2
            double r7 = i0.j.c.l.a.a(r7, r8, r0)
            float r7 = (float) r7
            android.graphics.PointF r8 = r9.a2
            float r0 = r8.x
            android.graphics.PointF r1 = r9.Z1
            float r2 = r1.x
            int r3 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r3 < 0) goto L_0x006f
            float r3 = r8.y
            float r4 = r1.y
            int r5 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r5 >= 0) goto L_0x005e
            goto L_0x006f
        L_0x005e:
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L_0x0066
            int r0 = (r3 > r4 ? 1 : (r3 == r4 ? 0 : -1))
            if (r0 <= 0) goto L_0x0075
        L_0x0066:
            int r0 = r6.x
            int r0 = r0 + 180
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
            goto L_0x0075
        L_0x006f:
            int r0 = r6.x
            float r0 = (float) r0
            i0.j.c.l.a.s(r7, r0, r8, r1)
        L_0x0075:
            if (r10 == 0) goto L_0x0081
            android.graphics.PointF r7 = r9.Y1
            float r8 = r7.x
            float r7 = r7.y
            r10 = 0
            r6.k(r8, r7, r9, r10)
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.annotation.f.f.q(float, float, com.instabug.library.annotation.b, boolean):void");
    }
}
