package kotlin.reflect.jvm.internal.impl.builtins;

import m0.n.b.i;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.d;

/* compiled from: UnsignedType.kt */
public enum UnsignedType {
    UBYTE(r1),
    USHORT(r2),
    UINT(r4),
    ULONG(r6);
    
    private final a arrayClassId;
    private final a classId;
    private final d typeName;

    private UnsignedType(a aVar) {
        this.classId = aVar;
        d j = aVar.j();
        i.d(j, "classId.shortClassName");
        this.typeName = j;
        this.arrayClassId = new a(aVar.h(), d.g(i.k(j.b(), "Array")));
    }

    public final a getArrayClassId() {
        return this.arrayClassId;
    }

    public final a getClassId() {
        return this.classId;
    }

    public final d getTypeName() {
        return this.typeName;
    }
}
