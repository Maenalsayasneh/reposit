package i0.h.a.c.r;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.util.Property;
import android.view.animation.AnimationUtils;
import android.view.animation.Interpolator;
import com.google.android.material.R;
import h0.c0.a.a.b;
import java.util.Arrays;

/* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
public final class t extends n<ObjectAnimator> {
    public static final int[] d = {533, 567, 850, 750};
    public static final int[] e = {1267, 1000, 333, 0};
    public static final Property<t, Float> f = new a(Float.class, "animationFraction");
    public ObjectAnimator g;
    public final Interpolator[] h;
    public final c i;
    public int j = 0;
    public boolean k;
    public float l;
    public boolean m;
    public b n = null;

    /* compiled from: LinearIndeterminateDisjointAnimatorDelegate */
    public static class a extends Property<t, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        public Object get(Object obj) {
            return Float.valueOf(((t) obj).l);
        }

        public void set(Object obj, Object obj2) {
            t tVar = (t) obj;
            float floatValue = ((Float) obj2).floatValue();
            tVar.l = floatValue;
            int i = (int) (floatValue * 1800.0f);
            for (int i2 = 0; i2 < 4; i2++) {
                tVar.b[i2] = Math.max(0.0f, Math.min(1.0f, tVar.h[i2].getInterpolation(tVar.b(i, t.e[i2], t.d[i2]))));
            }
            if (tVar.k) {
                Arrays.fill(tVar.c, i0.h.a.b.c.m.b.v(tVar.i.c[tVar.j], tVar.a.d2));
                tVar.k = false;
            }
            tVar.a.invalidateSelf();
        }
    }

    public t(Context context, u uVar) {
        super(2);
        this.i = uVar;
        this.h = new Interpolator[]{AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_head_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line1_tail_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_head_interpolator), AnimationUtils.loadInterpolator(context, R.animator.linear_indeterminate_line2_tail_interpolator)};
    }

    public void a() {
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void c() {
        h();
    }

    public void d(b bVar) {
        this.n = bVar;
    }

    public void e() {
        if (this.a.isVisible()) {
            this.m = true;
            this.g.setRepeatCount(0);
            return;
        }
        ObjectAnimator objectAnimator = this.g;
        if (objectAnimator != null) {
            objectAnimator.cancel();
        }
    }

    public void f() {
        if (this.g == null) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, f, new float[]{0.0f, 1.0f});
            this.g = ofFloat;
            ofFloat.setDuration(1800);
            this.g.setInterpolator((TimeInterpolator) null);
            this.g.setRepeatCount(-1);
            this.g.addListener(new s(this));
        }
        h();
        this.g.start();
    }

    public void g() {
        this.n = null;
    }

    public void h() {
        this.j = 0;
        int v = i0.h.a.b.c.m.b.v(this.i.c[0], this.a.d2);
        int[] iArr = this.c;
        iArr[0] = v;
        iArr[1] = v;
    }
}
