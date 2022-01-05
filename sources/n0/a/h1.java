package n0.a;

import kotlinx.coroutines.JobSupport;

/* compiled from: JobSupport.kt */
public class h1 extends JobSupport implements x {
    public final boolean d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public h1(f1 f1Var) {
        super(true);
        boolean z = true;
        d0(f1Var);
        r Z = Z();
        s sVar = Z instanceof s ? (s) Z : null;
        if (sVar != null) {
            JobSupport J = sVar.J();
            while (true) {
                if (J.W()) {
                    break;
                }
                r Z2 = J.Z();
                s sVar2 = Z2 instanceof s ? (s) Z2 : null;
                if (sVar2 == null) {
                    break;
                }
                J = sVar2.J();
            }
            this.d = z;
        }
        z = false;
        this.d = z;
    }

    public boolean W() {
        return this.d;
    }

    public boolean X() {
        return true;
    }
}
