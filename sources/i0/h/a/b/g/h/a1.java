package i0.h.a.b.g.h;

/* compiled from: com.google.android.gms:play-services-recaptcha@@16.0.0 */
public final class a1<T> implements j1<T> {
    public final y0 a;
    public final x1<?, ?> b;
    public final boolean c;
    public final u<?> d;

    public a1(x1<?, ?> x1Var, u<?> uVar, y0 y0Var) {
        this.b = x1Var;
        this.c = uVar.b(y0Var);
        this.d = uVar;
        this.a = y0Var;
    }

    public final void a(T t) {
        this.b.d(t);
        this.d.d(t);
    }

    public final boolean b(T t, T t2) {
        if (!this.b.b(t).equals(this.b.b(t2))) {
            return false;
        }
        if (this.c) {
            return this.d.a(t).equals(this.d.a(t2));
        }
        return true;
    }

    public final boolean c(T t) {
        return this.d.a(t).h();
    }

    public final int d(T t) {
        int hashCode = this.b.b(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a(t).hashCode() : hashCode;
    }

    public final void e(T t, T t2) {
        x1<?, ?> x1Var = this.b;
        Class<?> cls = k1.a;
        x1Var.a(t, x1Var.c(x1Var.b(t), x1Var.b(t2)));
        if (this.c) {
            k1.b(this.d, t, t2);
        }
    }
}
