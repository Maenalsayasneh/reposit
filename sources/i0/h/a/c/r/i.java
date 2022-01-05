package i0.h.a.c.r;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import h0.l.a.d;
import h0.l.a.e;
import i0.h.a.b.c.m.b;
import i0.h.a.c.r.c;

/* compiled from: DeterminateDrawable */
public final class i<S extends c> extends l {
    public static final h0.l.a.c<i> e2 = new a("indicatorLevel");
    public m<S> f2;
    public final e g2;
    public final d h2;
    public float i2;
    public boolean j2 = false;

    /* compiled from: DeterminateDrawable */
    public static class a extends h0.l.a.c<i> {
        public a(String str) {
            super(str);
        }

        public float a(Object obj) {
            return ((i) obj).i2 * 10000.0f;
        }

        public void b(Object obj, float f) {
            i iVar = (i) obj;
            iVar.i2 = f / 10000.0f;
            iVar.invalidateSelf();
        }
    }

    public i(Context context, c cVar, m<S> mVar) {
        super(context, cVar);
        this.f2 = mVar;
        mVar.b = this;
        e eVar = new e();
        this.g2 = eVar;
        eVar.a(1.0f);
        eVar.b(50.0f);
        d dVar = new d(this, e2);
        this.h2 = dVar;
        dVar.r = eVar;
        if (this.b2 != 1.0f) {
            this.b2 = 1.0f;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        Rect rect = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(rect)) {
            canvas.save();
            m<S> mVar = this.f2;
            float c = c();
            mVar.a.a();
            mVar.a(canvas, c);
            this.f2.c(canvas, this.c2);
            Canvas canvas2 = canvas;
            this.f2.b(canvas2, this.c2, 0.0f, this.i2, b.v(this.q.c[0], this.d2));
            canvas.restore();
        }
    }

    public int getIntrinsicHeight() {
        return this.f2.d();
    }

    public int getIntrinsicWidth() {
        return this.f2.e();
    }

    public boolean i(boolean z, boolean z2, boolean z3) {
        boolean i = super.i(z, z2, z3);
        float a2 = this.x.a(this.d.getContentResolver());
        if (a2 == 0.0f) {
            this.j2 = true;
        } else {
            this.j2 = false;
            this.g2.b(50.0f / a2);
        }
        return i;
    }

    public void jumpToCurrentState() {
        this.h2.b();
        this.i2 = ((float) getLevel()) / 10000.0f;
        invalidateSelf();
    }

    public boolean onLevelChange(int i) {
        if (this.j2) {
            this.h2.b();
            this.i2 = ((float) i) / 10000.0f;
            invalidateSelf();
        } else {
            d dVar = this.h2;
            dVar.h = this.i2 * 10000.0f;
            dVar.i = true;
            float f = (float) i;
            if (dVar.l) {
                dVar.s = f;
            } else {
                if (dVar.r == null) {
                    dVar.r = new e(f);
                }
                dVar.r.i = (double) f;
                dVar.f();
            }
        }
        return true;
    }
}
