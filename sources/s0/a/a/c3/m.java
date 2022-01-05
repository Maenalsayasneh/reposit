package s0.a.a.c3;

import i0.d.a.a.a;
import java.util.Hashtable;
import s0.a.a.g;
import s0.a.a.r;

public class m extends s0.a.a.m {
    public static final String[] c = {"unspecified", "keyCompromise", "cACompromise", "affiliationChanged", "superseded", "cessationOfOperation", "certificateHold", "unknown", "removeFromCRL", "privilegeWithdrawn", "aACompromise"};
    public static final Hashtable d = new Hashtable();
    public g q;

    public m(int i) {
        this.q = new g(i);
    }

    public static m s(Object obj) {
        if (obj instanceof m) {
            return (m) obj;
        }
        if (obj == null) {
            return null;
        }
        int E = g.C(obj).E();
        Integer valueOf = Integer.valueOf(E);
        Hashtable hashtable = d;
        if (!hashtable.containsKey(valueOf)) {
            hashtable.put(valueOf, new m(E));
        }
        return (m) hashtable.get(valueOf);
    }

    public r c() {
        return this.q;
    }

    public String toString() {
        int intValue = this.q.D().intValue();
        return a.n0("CRLReason: ", (intValue < 0 || intValue > 10) ? "invalid" : c[intValue]);
    }
}
