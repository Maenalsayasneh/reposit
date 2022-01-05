package i0.h.a.c.r;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.util.Property;
import h0.p.a.a.b;
import java.util.Arrays;

/* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
public final class r extends n<ObjectAnimator> {
    public static final Property<r, Float> d = new a(Float.class, "animationFraction");
    public ObjectAnimator e;
    public b f;
    public final c g;
    public int h = 1;
    public boolean i;
    public float j;

    /* compiled from: LinearIndeterminateContiguousAnimatorDelegate */
    public static class a extends Property<r, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(((r) obj).j);
        }

        public void set(Object obj, Object obj2) {
            r rVar = (r) obj;
            float floatValue = ((Float) obj2).floatValue();
            rVar.j = floatValue;
            rVar.b[0] = 0.0f;
            float b = rVar.b((int) (floatValue * 333.0f), 0, 667);
            float[] fArr = rVar.b;
            float interpolation = rVar.f.getInterpolation(b);
            fArr[2] = interpolation;
            fArr[1] = interpolation;
            float[] fArr2 = rVar.b;
            float interpolation2 = rVar.f.getInterpolation(b + 0.49925038f);
            fArr2[4] = interpolation2;
            fArr2[3] = interpolation2;
            float[] fArr3 = rVar.b;
            fArr3[5] = 1.0f;
            if (rVar.i && fArr3[3] < 1.0f) {
                int[] iArr = rVar.c;
                iArr[2] = iArr[1];
                iArr[1] = iArr[0];
                iArr[0] = i0.h.a.b.c.m.b.v(rVar.g.c[rVar.h], rVar.a.d2);
                rVar.i = false;
            }
            rVar.a.invalidateSelf();
        }
    }

    public r(u uVar) {
        super(3);
        this.g = uVar;
        this.f = new b();
    }

    public void a() {
        ObjectAnimator objectAnimator = this.e;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void c() {
        h();
    }

    public void d(h0.c0.a.a.b bVar) {
    }

    public void e() {
    }

    public void f() {
        if (this.e == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, d, new float[]{0.0f, 1.0f});
            this.e = ofFloat;
            ofFloat.setDuration(333);
            this.e.setInterpolator((TimeInterpolator) null);
            this.e.setRepeatCount(-1);
            this.e.addListener(new q(this));
        }
        h();
        this.e.start();
    }

    public void g() {
    }

    public void h() {
        this.i = true;
        this.h = 1;
        Arrays.fill(this.c, i0.h.a.b.c.m.b.v(this.g.c[0], this.a.d2));
    }
}
