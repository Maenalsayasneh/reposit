package m0.r.t.a.r.m;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.c.m0;

/* compiled from: TypeSubstitution.kt */
public abstract class l0 extends p0 {
    public static final a b = new a((f) null);

    /* compiled from: TypeSubstitution.kt */
    public static final class a {
        public a(f fVar) {
        }

        public static l0 c(a aVar, Map map, boolean z, int i) {
            if ((i & 2) != 0) {
                z = false;
            }
            i.e(map, "map");
            return new k0(map, z);
        }

        public final p0 a(v vVar) {
            i.e(vVar, "kotlinType");
            return b(vVar.I0(), vVar.H0());
        }

        public final p0 b(j0 j0Var, List<? extends m0> list) {
            i.e(j0Var, "typeConstructor");
            i.e(list, "arguments");
            List<m0> parameters = j0Var.getParameters();
            i.d(parameters, "typeConstructor.parameters");
            m0 m0Var = (m0) g.I(parameters);
            if (i.a(m0Var == null ? null : Boolean.valueOf(m0Var.n0()), Boolean.TRUE)) {
                List<m0> parameters2 = j0Var.getParameters();
                i.d(parameters2, "typeConstructor.parameters");
                ArrayList arrayList = new ArrayList(h.K(parameters2, 10));
                for (m0 i : parameters2) {
                    arrayList.add(i.i());
                }
                return c(this, g.w0(g.F0(arrayList, list)), false, 2);
            }
            i.e(parameters, InstabugDbContract.SDKApiEntry.COLUMN_PARAMETERS);
            i.e(list, "argumentsList");
            Object[] array = parameters.toArray(new m0[0]);
            Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
            Object[] array2 = list.toArray(new m0[0]);
            Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
            return new t((m0[]) array, (m0[]) array2, false);
        }
    }

    public m0 e(v vVar) {
        i.e(vVar, InstabugDbContract.UserAttributesEntry.COLUMN_KEY);
        return h(vVar.I0());
    }

    public abstract m0 h(j0 j0Var);
}
