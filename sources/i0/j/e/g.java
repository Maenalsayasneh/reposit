package i0.j.e;

import k0.b.y.a;

/* compiled from: InstabugDelegate */
public class g implements a {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ i b;

    public g(i iVar, boolean z) {
        this.b = iVar;
        this.a = z;
    }

    public void run() throws Exception {
        k0.b.w.a aVar;
        if (this.a && (aVar = this.b.d2) != null) {
            aVar.dispose();
            this.b.d2 = null;
        }
    }
}
