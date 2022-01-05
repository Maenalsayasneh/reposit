package i0.h.a.c.r;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import i0.h.a.b.c.m.b;

/* compiled from: CircularDrawingDelegate */
public final class d extends m<h> {
    public int c = 1;
    public float d;
    public float e;
    public float f;

    public d(h hVar) {
        super(hVar);
    }

    public void a(Canvas canvas, float f2) {
        S s = this.a;
        float f3 = (((float) ((h) s).g) / 2.0f) + ((float) ((h) s).h);
        canvas.translate(f3, f3);
        canvas.rotate(-90.0f);
        float f4 = -f3;
        canvas.clipRect(f4, f4, f3, f3);
        S s2 = this.a;
        this.c = ((h) s2).i == 0 ? 1 : -1;
        this.d = ((float) ((h) s2).a) * f2;
        this.e = ((float) ((h) s2).b) * f2;
        this.f = ((float) (((h) s2).g - ((h) s2).a)) / 2.0f;
        if ((this.b.f() && ((h) this.a).e == 2) || (this.b.e() && ((h) this.a).f == 1)) {
            this.f = (((1.0f - f2) * ((float) ((h) this.a).a)) / 2.0f) + this.f;
        } else if ((this.b.f() && ((h) this.a).e == 1) || (this.b.e() && ((h) this.a).f == 2)) {
            this.f -= ((1.0f - f2) * ((float) ((h) this.a).a)) / 2.0f;
        }
    }

    public void b(Canvas canvas, Paint paint, float f2, float f3, int i) {
        if (f2 != f3) {
            paint.setStyle(Paint.Style.STROKE);
            paint.setStrokeCap(Paint.Cap.BUTT);
            paint.setAntiAlias(true);
            paint.setColor(i);
            paint.setStrokeWidth(this.d);
            float f4 = (float) this.c;
            float f5 = f2 * 360.0f * f4;
            if (f3 < f2) {
                f3 += 1.0f;
            }
            float f6 = (f3 - f2) * 360.0f * f4;
            float f7 = this.f;
            float f8 = -f7;
            canvas.drawArc(new RectF(f8, f8, f7, f7), f5, f6, false, paint);
            if (this.e > 0.0f && Math.abs(f6) < 360.0f) {
                paint.setStyle(Paint.Style.FILL);
                float f9 = this.e;
                float f10 = -f9;
                RectF rectF = new RectF(f10, f10, f9, f9);
                f(canvas, paint, this.d, this.e, f5, true, rectF);
                f(canvas, paint, this.d, this.e, f5 + f6, false, rectF);
            }
        }
    }

    public void c(Canvas canvas, Paint paint) {
        int v = b.v(((h) this.a).d, this.b.d2);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.BUTT);
        paint.setAntiAlias(true);
        paint.setColor(v);
        paint.setStrokeWidth(this.d);
        float f2 = this.f;
        float f3 = -f2;
        canvas.drawArc(new RectF(f3, f3, f2, f2), 0.0f, 360.0f, false, paint);
    }

    public int d() {
        h hVar = (h) this.a;
        return (hVar.h * 2) + hVar.g;
    }

    public int e() {
        h hVar = (h) this.a;
        return (hVar.h * 2) + hVar.g;
    }

    public final void f(Canvas canvas, Paint paint, float f2, float f3, float f4, boolean z, RectF rectF) {
        Canvas canvas2 = canvas;
        float f5 = z ? -1.0f : 1.0f;
        canvas.save();
        canvas.rotate(f4);
        float f6 = f2 / 2.0f;
        float f7 = f5 * f3;
        Paint paint2 = paint;
        canvas.drawRect((this.f - f6) + f3, Math.min(0.0f, ((float) this.c) * f7), (this.f + f6) - f3, Math.max(0.0f, f7 * ((float) this.c)), paint2);
        canvas.translate((this.f - f6) + f3, 0.0f);
        RectF rectF2 = rectF;
        canvas.drawArc(rectF2, 180.0f, (-f5) * 90.0f * ((float) this.c), true, paint2);
        canvas.translate(f2 - (f3 * 2.0f), 0.0f);
        canvas.drawArc(rectF2, 0.0f, f5 * 90.0f * ((float) this.c), true, paint2);
        canvas.restore();
    }
}
