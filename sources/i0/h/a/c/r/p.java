package i0.h.a.c.r;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import i0.h.a.b.c.m.b;

/* compiled from: LinearDrawingDelegate */
public final class p extends m<u> {
    public float c = 300.0f;
    public float d;
    public float e;

    public p(u uVar) {
        super(uVar);
    }

    public static void f(Canvas canvas, Paint paint, float f, float f2, float f3, boolean z, RectF rectF) {
        Canvas canvas2 = canvas;
        float f4 = f;
        float f5 = f2;
        canvas.save();
        float f6 = f3;
        canvas.translate(f3, 0.0f);
        if (!z) {
            canvas.rotate(180.0f);
        }
        float f7 = ((-f4) / 2.0f) + f5;
        float f8 = (f4 / 2.0f) - f5;
        Canvas canvas3 = canvas;
        Paint paint2 = paint;
        canvas3.drawRect(-f5, f7, 0.0f, f8, paint2);
        canvas.save();
        canvas.translate(0.0f, f7);
        RectF rectF2 = rectF;
        canvas3.drawArc(rectF2, 180.0f, 90.0f, true, paint2);
        canvas.restore();
        canvas.translate(0.0f, f8);
        canvas3.drawArc(rectF2, 180.0f, -90.0f, true, paint2);
        canvas.restore();
    }

    public void a(Canvas canvas, float f) {
        Rect clipBounds = canvas.getClipBounds();
        this.c = (float) clipBounds.width();
        float f2 = (float) ((u) this.a).a;
        canvas.translate(((float) clipBounds.width()) / 2.0f, Math.max(0.0f, ((float) (clipBounds.height() - ((u) this.a).a)) / 2.0f) + (((float) clipBounds.height()) / 2.0f));
        if (((u) this.a).i) {
            canvas.scale(-1.0f, 1.0f);
        }
        if ((this.b.f() && ((u) this.a).e == 1) || (this.b.e() && ((u) this.a).f == 2)) {
            canvas.scale(1.0f, -1.0f);
        }
        if (this.b.f() || this.b.e()) {
            canvas.translate(0.0f, ((f - 1.0f) * ((float) ((u) this.a).a)) / 2.0f);
        }
        float f3 = this.c;
        canvas.clipRect((-f3) / 2.0f, (-f2) / 2.0f, f3 / 2.0f, f2 / 2.0f);
        S s = this.a;
        this.d = ((float) ((u) s).a) * f;
        this.e = ((float) ((u) s).b) * f;
    }

    public void b(Canvas canvas, Paint paint, float f, float f2, int i) {
        if (f != f2) {
            float f3 = this.c;
            float f4 = this.e;
            float f5 = ((-f3) / 2.0f) + f4;
            float f6 = f3 - (f4 * 2.0f);
            float f7 = (f * f6) + f5;
            float f8 = (f6 * f2) + f5;
            paint.setStyle(Paint.Style.FILL);
            paint.setAntiAlias(true);
            paint.setColor(i);
            float f9 = this.d;
            Canvas canvas2 = canvas;
            canvas2.drawRect(f7, (-f9) / 2.0f, f8, f9 / 2.0f, paint);
            float f10 = this.e;
            float f11 = -f10;
            Paint paint2 = paint;
            RectF rectF = new RectF(f11, f11, f10, f10);
            f(canvas2, paint2, this.d, this.e, f7, true, rectF);
            f(canvas2, paint2, this.d, this.e, f8, false, rectF);
        }
    }

    public void c(Canvas canvas, Paint paint) {
        int v = b.v(((u) this.a).d, this.b.d2);
        float f = ((-this.c) / 2.0f) + this.e;
        float f2 = -f;
        paint.setStyle(Paint.Style.FILL);
        paint.setAntiAlias(true);
        paint.setColor(v);
        float f3 = this.d;
        Canvas canvas2 = canvas;
        canvas2.drawRect(f, (-f3) / 2.0f, f2, f3 / 2.0f, paint);
        float f4 = this.e;
        float f5 = -f4;
        RectF rectF = new RectF(f5, f5, f4, f4);
        f(canvas2, paint, this.d, this.e, f, true, rectF);
        f(canvas, paint, this.d, this.e, f2, false, rectF);
    }

    public int d() {
        return ((u) this.a).a;
    }

    public int e() {
        return -1;
    }
}
