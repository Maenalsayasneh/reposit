package m0.r.t.a.r.b.k;

import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.reflect.jvm.internal.impl.builtins.jvm.JvmBuiltInsCustomizer;
import m0.n.b.i;
import m0.r.t.a.r.c.d;
import m0.r.t.a.r.e.b.p;
import m0.r.t.a.r.o.b;

/* compiled from: JvmBuiltInsCustomizer.kt */
public final class h extends b<d, JvmBuiltInsCustomizer.JDKMemberStatus> {
    public final /* synthetic */ String a;
    public final /* synthetic */ Ref$ObjectRef<JvmBuiltInsCustomizer.JDKMemberStatus> b;

    public h(String str, Ref$ObjectRef<JvmBuiltInsCustomizer.JDKMemberStatus> ref$ObjectRef) {
        this.a = str;
        this.b = ref$ObjectRef;
    }

    public Object a() {
        JvmBuiltInsCustomizer.JDKMemberStatus jDKMemberStatus = (JvmBuiltInsCustomizer.JDKMemberStatus) this.b.c;
        return jDKMemberStatus == null ? JvmBuiltInsCustomizer.JDKMemberStatus.NOT_CONSIDERED : jDKMemberStatus;
    }

    public boolean c(Object obj) {
        d dVar = (d) obj;
        i.e(dVar, "javaClassDescriptor");
        String Q3 = i0.j.f.p.h.Q3(p.a, dVar, this.a);
        k kVar = k.a;
        if (k.c.contains(Q3)) {
            this.b.c = JvmBuiltInsCustomizer.JDKMemberStatus.HIDDEN;
        } else if (k.d.contains(Q3)) {
            this.b.c = JvmBuiltInsCustomizer.JDKMemberStatus.VISIBLE;
        } else if (k.b.contains(Q3)) {
            this.b.c = JvmBuiltInsCustomizer.JDKMemberStatus.DROP;
        }
        return this.b.c == null;
    }
}
