package h0.t;

import android.os.Bundle;
import h0.t.s;
import i0.d.a.a.a;

@s.b("navigation")
/* compiled from: NavGraphNavigator */
public class n extends s<m> {
    public final t a;

    public n(t tVar) {
        this.a = tVar;
    }

    public k a() {
        return new m(this);
    }

    public k b(k kVar, Bundle bundle, q qVar, s.a aVar) {
        String str;
        m mVar = (m) kVar;
        int i = mVar.c2;
        if (i == 0) {
            StringBuilder P0 = a.P0("no start destination defined via app:startDestination for ");
            int i2 = mVar.q;
            if (i2 != 0) {
                if (mVar.x == null) {
                    mVar.x = Integer.toString(i2);
                }
                str = mVar.x;
            } else {
                str = "the root navigation";
            }
            P0.append(str);
            throw new IllegalStateException(P0.toString());
        }
        k t = mVar.t(i, false);
        if (t != null) {
            return this.a.c(t.c).b(t, t.b(bundle), qVar, aVar);
        }
        if (mVar.d2 == null) {
            mVar.d2 = Integer.toString(mVar.c2);
        }
        throw new IllegalArgumentException(a.o0("navigation destination ", mVar.d2, " is not a direct child of this NavGraph"));
    }

    public boolean e() {
        return true;
    }
}
