package i0.h.a.c.a;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import i0.d.a.a.a;

/* compiled from: MotionTiming */
public class h {
    public long a = 0;
    public long b = 300;
    public TimeInterpolator c = null;
    public int d = 0;
    public int e = 1;

    public h(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public void a(Animator animator) {
        animator.setStartDelay(this.a);
        animator.setDuration(this.b);
        animator.setInterpolator(b());
        if (animator instanceof ValueAnimator) {
            ValueAnimator valueAnimator = (ValueAnimator) animator;
            valueAnimator.setRepeatCount(this.d);
            valueAnimator.setRepeatMode(this.e);
        }
    }

    public TimeInterpolator b() {
        TimeInterpolator timeInterpolator = this.c;
        return timeInterpolator != null ? timeInterpolator : a.b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.a == hVar.a && this.b == hVar.b && this.d == hVar.d && this.e == hVar.e) {
            return b().getClass().equals(hVar.b().getClass());
        }
        return false;
    }

    public int hashCode() {
        long j = this.a;
        long j2 = this.b;
        return ((((b().getClass().hashCode() + (((((int) (j ^ (j >>> 32))) * 31) + ((int) ((j2 >>> 32) ^ j2))) * 31)) * 31) + this.d) * 31) + this.e;
    }

    public String toString() {
        StringBuilder N0 = a.N0(10);
        N0.append(h.class.getName());
        N0.append('{');
        N0.append(Integer.toHexString(System.identityHashCode(this)));
        N0.append(" delay: ");
        N0.append(this.a);
        N0.append(" duration: ");
        N0.append(this.b);
        N0.append(" interpolator: ");
        N0.append(b().getClass());
        N0.append(" repeatCount: ");
        N0.append(this.d);
        N0.append(" repeatMode: ");
        return a.u0(N0, this.e, "}\n");
    }

    public h(long j, long j2, TimeInterpolator timeInterpolator) {
        this.a = j;
        this.b = j2;
        this.c = timeInterpolator;
    }
}
