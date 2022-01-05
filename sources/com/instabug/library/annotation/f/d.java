package com.instabug.library.annotation.f;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.PointF;
import com.instabug.library.annotation.b;
import i0.j.c.l.a;

/* compiled from: OvalShape */
public class d extends f {
    public d(int i, float f, int i2) {
        super(i, f, i2);
    }

    public void b(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        a.v(canvas, pointF, pointF2, this.c);
        a.v(canvas, pointF, pointF4, this.c);
        a.v(canvas, pointF2, pointF3, this.c);
        a.v(canvas, pointF3, pointF4, this.c);
    }

    public void i(Canvas canvas, b bVar) {
        canvas.drawPath(a(bVar), this.d);
    }

    public void l(b bVar) {
        b bVar2 = bVar;
        this.y.reset();
        int i = this.x;
        if (i == 0 || i == 180) {
            this.y.addOval(bVar2, Path.Direction.CW);
            return;
        }
        PointF k = a.k(bVar2.y, bVar2.Y1);
        PointF k2 = a.k(bVar2.y, k);
        PointF k3 = a.k(bVar2.Y1, k);
        PointF k4 = a.k(bVar2.Y1, bVar2.Z1);
        PointF k5 = a.k(bVar2.Y1, k4);
        PointF k6 = a.k(bVar2.Z1, k4);
        PointF k7 = a.k(bVar2.Z1, bVar2.a2);
        PointF k8 = a.k(bVar2.Z1, k7);
        PointF k9 = a.k(bVar2.a2, k7);
        PointF k10 = a.k(bVar2.a2, bVar2.y);
        PointF k11 = a.k(bVar2.a2, k10);
        PointF k12 = a.k(bVar2.y, k10);
        this.y.moveTo(k.x, k.y);
        PointF pointF = k;
        this.y.cubicTo(k3.x, k3.y, k5.x, k5.y, k4.x, k4.y);
        this.y.cubicTo(k6.x, k6.y, k8.x, k8.y, k7.x, k7.y);
        this.y.cubicTo(k9.x, k9.y, k11.x, k11.y, k10.x, k10.y);
        PointF pointF2 = pointF;
        this.y.cubicTo(k12.x, k12.y, k2.x, k2.y, pointF2.x, pointF2.y);
        this.y.close();
    }
}
