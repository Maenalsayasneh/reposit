package n0.a;

import m0.i;

/* compiled from: JobSupport.kt */
public final class s extends g1 implements r {
    public final t y;

    public s(t tVar) {
        this.y = tVar;
    }

    public void H(Throwable th) {
        this.y.y(J());
    }

    public boolean f(Throwable th) {
        return J().R(th);
    }

    public f1 getParent() {
        return J();
    }

    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        H((Throwable) obj);
        return i.a;
    }
}
