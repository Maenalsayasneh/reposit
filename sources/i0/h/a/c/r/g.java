package i0.h.a.c.r;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;

/* compiled from: CircularIndeterminateAnimatorDelegate */
public final class g extends n<ObjectAnimator> {
    public static final int[] d = {0, 1350, 2700, 4050};
    public static final int[] e = {667, 2017, 3367, 4717};
    public static final int[] f = {1000, 2350, 3700, 5050};
    public static final Property<g, Float> g;
    public static final Property<g, Float> h;
    public ObjectAnimator i;
    public ObjectAnimator j;
    public final h0.p.a.a.b k;
    public final c l;
    public int m = 0;
    public float n;
    public float o;
    public h0.c0.a.a.b p = null;

    /* compiled from: CircularIndeterminateAnimatorDelegate */
    public static class a extends Property<g, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(((g) obj).n);
        }

        public void set(Object obj, Object obj2) {
            g gVar = (g) obj;
            float floatValue = ((Float) obj2).floatValue();
            gVar.n = floatValue;
            int i = (int) (5400.0f * floatValue);
            float[] fArr = gVar.b;
            float f = floatValue * 1520.0f;
            fArr[0] = -20.0f + f;
            fArr[1] = f;
            for (int i2 = 0; i2 < 4; i2++) {
                float b = gVar.b(i, g.d[i2], 667);
                float[] fArr2 = gVar.b;
                fArr2[1] = (gVar.k.getInterpolation(b) * 250.0f) + fArr2[1];
                float b2 = gVar.b(i, g.e[i2], 667);
                float[] fArr3 = gVar.b;
                fArr3[0] = (gVar.k.getInterpolation(b2) * 250.0f) + fArr3[0];
            }
            float[] fArr4 = gVar.b;
            fArr4[0] = ((fArr4[1] - fArr4[0]) * gVar.o) + fArr4[0];
            fArr4[0] = fArr4[0] / 360.0f;
            fArr4[1] = fArr4[1] / 360.0f;
            int i3 = 0;
            while (true) {
                if (i3 >= 4) {
                    break;
                }
                float b3 = gVar.b(i, g.f[i3], 333);
                if (b3 >= 0.0f && b3 <= 1.0f) {
                    int i4 = i3 + gVar.m;
                    int[] iArr = gVar.l.c;
                    int length = i4 % iArr.length;
                    gVar.c[0] = i0.h.a.c.a.b.a.evaluate(gVar.k.getInterpolation(b3), Integer.valueOf(i0.h.a.b.c.m.b.v(iArr[length], gVar.a.d2)), Integer.valueOf(i0.h.a.b.c.m.b.v(gVar.l.c[(length + 1) % iArr.length], gVar.a.d2))).intValue();
                    break;
                }
                i3++;
            }
            gVar.a.invalidateSelf();
        }
    }

    /* compiled from: CircularIndeterminateAnimatorDelegate */
    public static class b extends Property<g, Float> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(((g) obj).o);
        }

        public void set(Object obj, Object obj2) {
            ((g) obj).o = ((Float) obj2).floatValue();
        }
    }

    static {
        Class<Float> cls = Float.class;
        g = new a(cls, "animationFraction");
        h = new b(cls, "completeEndFraction");
    }

    public g(h hVar) {
        super(1);
        this.l = hVar;
        this.k = new h0.p.a.a.b();
    }

    public void a() {
        ObjectAnimator objectAnimator = this.i;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void c() {
        h();
    }

    public void d(h0.c0.a.a.b bVar) {
        this.p = bVar;
    }

    public void e() {
        if (!this.j.isRunning()) {
            if (this.a.isVisible()) {
                this.j.start();
            } else {
                a();
            }
        }
    }

    public void f() {
        if (this.i == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, g, new float[]{0.0f, 1.0f});
            this.i = ofFloat;
            ofFloat.setDuration(5400);
            this.i.setInterpolator((TimeInterpolator) null);
            this.i.setRepeatCount(-1);
            this.i.addListener(new e(this));
        }
        if (this.j == null) {
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this, h, new float[]{0.0f, 1.0f});
            this.j = ofFloat2;
            ofFloat2.setDuration(333);
            this.j.setInterpolator(this.k);
            this.j.addListener(new f(this));
        }
        h();
        this.i.start();
    }

    public void g() {
        this.p = null;
    }

    public void h() {
        this.m = 0;
        this.c[0] = i0.h.a.b.c.m.b.v(this.l.c[0], this.a.d2);
        this.o = 0.0f;
    }
}
