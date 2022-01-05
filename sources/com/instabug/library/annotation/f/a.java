package com.instabug.library.annotation.f;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Region;
import com.instabug.library.annotation.b;

/* compiled from: ArrowShape */
public class a extends g {
    public PointF Y1;
    public float Z1;
    public String a2;
    public final Paint x;
    public PointF y;

    public a(PointF pointF, PointF pointF2, int i, float f) {
        super(i, f);
        Paint paint = new Paint(1);
        this.x = paint;
        paint.setColor(i);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(f);
        this.y = pointF;
        this.Y1 = pointF2;
    }

    public Path a(b bVar) {
        Path path = new Path();
        PointF pointF = this.Y1;
        float f = pointF.x;
        float f2 = pointF.y;
        PointF pointF2 = this.y;
        float b = i0.j.c.l.a.b(f, f2, pointF2.x, pointF2.y);
        PointF j = i0.j.c.l.a.j(60.0f, 225.0f + b, this.Y1);
        PointF j2 = i0.j.c.l.a.j(60.0f, b + 135.0f, this.Y1);
        PointF pointF3 = this.y;
        path.moveTo(pointF3.x, pointF3.y);
        PointF pointF4 = this.Y1;
        path.lineTo(pointF4.x + 1.0f, pointF4.y + 1.0f);
        if ("arrow".equals(this.a2)) {
            path.moveTo(j.x, j.y);
            PointF pointF5 = this.Y1;
            path.lineTo(pointF5.x, pointF5.y);
            path.lineTo(j2.x, j2.y);
        }
        return path;
    }

    public void b(Canvas canvas, PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
    }

    public void c(Canvas canvas, b bVar, b bVar2) {
        b.a aVar = bVar.c;
        b.a aVar2 = b.a.RIGHT;
        if (aVar == aVar2) {
            this.y.x = bVar.right;
        } else if (aVar == b.a.LEFT) {
            this.y.x = bVar.left;
        }
        b.C0105b bVar3 = bVar.d;
        b.C0105b bVar4 = b.C0105b.TOP;
        if (bVar3 == bVar4) {
            this.y.y = bVar.top;
        } else if (bVar3 == b.C0105b.BOTTOM) {
            this.y.y = bVar.bottom;
        }
        b.a aVar3 = bVar.q;
        if (aVar3 == aVar2) {
            this.Y1.x = bVar.right;
        } else if (aVar3 == b.a.LEFT) {
            this.Y1.x = bVar.left;
        }
        b.C0105b bVar5 = bVar.x;
        if (bVar5 == bVar4) {
            this.Y1.y = bVar.top;
        } else if (bVar5 == b.C0105b.BOTTOM) {
            this.Y1.y = bVar.bottom;
        }
        canvas.drawPath(a(bVar), this.x);
    }

    public void d(Canvas canvas, b bVar, i0.j.e.b.b[] bVarArr) {
        int color = this.x.getColor();
        bVarArr[0].b = this.y;
        bVarArr[1].b = this.Y1;
        for (int i = 0; i < 2; i++) {
            bVarArr[i].c = color;
            bVarArr[i].b(canvas);
        }
    }

    public void e(b bVar, b bVar2, int i, int i2) {
        float f = (float) i;
        bVar.left = bVar2.left + f;
        float f2 = (float) i2;
        bVar.top = bVar2.top + f2;
        bVar.right = bVar2.right + f;
        bVar.bottom = bVar2.bottom + f2;
    }

    public void f(b bVar, b bVar2, boolean z) {
        bVar2.c(bVar);
    }

    public boolean g(PointF pointF, b bVar) {
        h(bVar);
        PointF pointF2 = this.Y1;
        float f = pointF2.x;
        float f2 = pointF2.y;
        PointF pointF3 = this.y;
        float b = i0.j.c.l.a.b(f, f2, pointF3.x, pointF3.y);
        float f3 = 90.0f + b;
        PointF j = i0.j.c.l.a.j(60.0f, f3, this.y);
        float f4 = b + 270.0f;
        PointF j2 = i0.j.c.l.a.j(60.0f, f4, this.y);
        PointF j3 = i0.j.c.l.a.j(60.0f, f4, this.Y1);
        PointF j4 = i0.j.c.l.a.j(60.0f, f3, this.Y1);
        Region region = new Region();
        RectF rectF = new RectF();
        Path path = new Path();
        path.moveTo(j.x, j.y);
        path.lineTo(j2.x, j2.y);
        path.lineTo(j3.x, j3.y);
        path.lineTo(j4.x, j4.y);
        path.close();
        path.computeBounds(rectF, true);
        region.setPath(path, new Region((int) rectF.left, (int) rectF.top, (int) rectF.right, (int) rectF.bottom));
        return region.contains((int) pointF.x, (int) pointF.y);
    }

    public final void h(b bVar) {
        PointF pointF = this.y;
        float f = pointF.x;
        PointF pointF2 = this.Y1;
        float f2 = pointF2.x;
        if (f < f2) {
            bVar.left = f;
            bVar.right = f2;
            bVar.c = b.a.LEFT;
            bVar.q = b.a.RIGHT;
        } else {
            bVar.right = f;
            bVar.left = f2;
            bVar.c = b.a.RIGHT;
            bVar.q = b.a.LEFT;
        }
        float f3 = pointF.y;
        float f4 = pointF2.y;
        if (f3 < f4) {
            bVar.top = f3;
            bVar.bottom = f4;
            bVar.d = b.C0105b.TOP;
            bVar.x = b.C0105b.BOTTOM;
            return;
        }
        bVar.bottom = f3;
        bVar.top = f4;
        bVar.d = b.C0105b.BOTTOM;
        bVar.x = b.C0105b.TOP;
    }
}
