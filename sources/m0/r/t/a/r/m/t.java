package m0.r.t.a.r.m;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import m0.n.b.i;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.m0;

/* compiled from: TypeSubstitution.kt */
public final class t extends p0 {
    public final m0[] b;
    public final m0[] c;
    public final boolean d;

    public t(m0[] m0VarArr, m0[] m0VarArr2, boolean z) {
        i.e(m0VarArr, InstabugDbContract.SDKApiEntry.COLUMN_PARAMETERS);
        i.e(m0VarArr2, "arguments");
        this.b = m0VarArr;
        this.c = m0VarArr2;
        this.d = z;
        int length = m0VarArr.length;
        int length2 = m0VarArr2.length;
    }

    public boolean b() {
        return this.d;
    }

    public m0 e(v vVar) {
        i.e(vVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        f c2 = vVar.I0().c();
        m0 m0Var = c2 instanceof m0 ? (m0) c2 : null;
        if (m0Var == null) {
            return null;
        }
        int g = m0Var.g();
        m0[] m0VarArr = this.b;
        if (g >= m0VarArr.length || !i.a(m0VarArr[g].i(), m0Var.i())) {
            return null;
        }
        return this.c[g];
    }

    public boolean f() {
        return this.c.length == 0;
    }
}
