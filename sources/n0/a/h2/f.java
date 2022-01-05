package n0.a.h2;

import i0.d.a.a.a;
import m0.l.e;
import n0.a.f0;

/* compiled from: Scopes.kt */
public final class f implements f0 {
    public final e c;

    public f(e eVar) {
        this.c = eVar;
    }

    public e C() {
        return this.c;
    }

    public String toString() {
        StringBuilder P0 = a.P0("CoroutineScope(coroutineContext=");
        P0.append(this.c);
        P0.append(')');
        return P0.toString();
    }
}
