package i0.h.a.c.r;

import android.animation.Animator;
import h0.c0.a.a.b;

/* compiled from: IndeterminateAnimatorDelegate */
public abstract class n<T extends Animator> {
    public o a;
    public final float[] b;
    public final int[] c;

    public n(int i) {
        this.b = new float[(i * 2)];
        this.c = new int[i];
    }

    public abstract void a();

    public float b(int i, int i2, int i3) {
        return ((float) (i - i2)) / ((float) i3);
    }

    public abstract void c();

    public abstract void d(b bVar);

    public abstract void e();

    public abstract void f();

    public abstract void g();
}
