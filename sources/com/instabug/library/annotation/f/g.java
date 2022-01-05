package com.instabug.library.annotation.f;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import com.instabug.library.annotation.b;
import java.io.Serializable;

/* compiled from: Shape */
public abstract class g implements Serializable {
    public final Paint c;
    public Paint d;
    public boolean q = false;

    public g(int i, float f) {
        Paint paint = new Paint(1);
        this.d = paint;
        paint.setColor(i);
        this.d.setStyle(Paint.Style.STROKE);
        this.d.setStrokeWidth(f);
        this.d.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint(1);
        this.c = paint2;
        paint2.setColor(Integer.MIN_VALUE);
    }

    public abstract Path a(b bVar);

    public abstract void b(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4);

    public abstract void c(Canvas canvas, b bVar, b bVar2);

    public abstract void d(Canvas canvas, b bVar, i0.j.e.b.b[] bVarArr);

    public abstract void e(b bVar, b bVar2, int i, int i2);

    public abstract void f(b bVar, b bVar2, boolean z);

    public abstract boolean g(PointF pointF, b bVar);
}
