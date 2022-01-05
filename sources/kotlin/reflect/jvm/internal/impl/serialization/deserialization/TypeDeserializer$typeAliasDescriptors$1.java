package kotlin.reflect.jvm.internal.impl.serialization.deserialization;

import i0.j.f.p.h;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.c.l0;
import m0.r.t.a.r.c.u;
import m0.r.t.a.r.g.a;

/* compiled from: TypeDeserializer.kt */
public final class TypeDeserializer$typeAliasDescriptors$1 extends Lambda implements l<Integer, f> {
    public final /* synthetic */ TypeDeserializer c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TypeDeserializer$typeAliasDescriptors$1(TypeDeserializer typeDeserializer) {
        super(1);
        this.c = typeDeserializer;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        TypeDeserializer typeDeserializer = this.c;
        a X0 = h.X0(typeDeserializer.a.b, intValue);
        if (X0.c) {
            return null;
        }
        u uVar = typeDeserializer.a.a.b;
        i.e(uVar, "<this>");
        i.e(X0, "classId");
        f E0 = h.E0(uVar, X0);
        if (E0 instanceof l0) {
            return (l0) E0;
        }
        return null;
    }
}
