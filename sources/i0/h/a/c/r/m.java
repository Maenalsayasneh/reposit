package i0.h.a.c.r;

import android.graphics.Canvas;
import android.graphics.Paint;
import i0.h.a.c.r.c;

/* compiled from: DrawingDelegate */
public abstract class m<S extends c> {
    public S a;
    public l b;

    public m(S s) {
        this.a = s;
    }

    public abstract void a(Canvas canvas, float f);

    public abstract void b(Canvas canvas, Paint paint, float f, float f2, int i);

    public abstract void c(Canvas canvas, Paint paint);

    public abstract int d();

    public abstract int e();
}
