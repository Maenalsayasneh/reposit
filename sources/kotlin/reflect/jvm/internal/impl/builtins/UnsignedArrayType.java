package kotlin.reflect.jvm.internal.impl.builtins;

import m0.n.b.i;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.d;

/* compiled from: UnsignedType.kt */
public enum UnsignedArrayType {
    UBYTEARRAY(r1),
    USHORTARRAY(r2),
    UINTARRAY(r4),
    ULONGARRAY(r6);
    
    private final a classId;
    private final d typeName;

    private UnsignedArrayType(a aVar) {
        this.classId = aVar;
        d j = aVar.j();
        i.d(j, "classId.shortClassName");
        this.typeName = j;
    }

    public final d getTypeName() {
        return this.typeName;
    }
}
