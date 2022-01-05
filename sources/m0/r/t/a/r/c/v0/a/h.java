package m0.r.t.a.r.c.v0.a;

import i0.d.a.a.a;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.descriptors.CallableMemberDescriptor;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.c.t0.b;
import m0.r.t.a.r.k.b.l;

/* compiled from: RuntimeErrorReporter.kt */
public final class h implements l {
    public static final h b = new h();

    public void a(CallableMemberDescriptor callableMemberDescriptor) {
        i.e(callableMemberDescriptor, "descriptor");
        throw new IllegalStateException(i.k("Cannot infer visibility for ", callableMemberDescriptor));
    }

    public void b(d dVar, List<String> list) {
        i.e(dVar, "descriptor");
        i.e(list, "unresolvedSuperClasses");
        StringBuilder P0 = a.P0("Incomplete hierarchy for class ");
        P0.append(((b) dVar).getName());
        P0.append(", unresolved classes ");
        P0.append(list);
        throw new IllegalStateException(P0.toString());
    }
}
