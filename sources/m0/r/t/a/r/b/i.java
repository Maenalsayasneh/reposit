package m0.r.t.a.r.b;

import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Pair;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedArrayType;
import kotlin.reflect.jvm.internal.impl.builtins.UnsignedType;
import m0.j.g;
import m0.r.t.a.r.c.f;
import m0.r.t.a.r.g.a;
import m0.r.t.a.r.g.d;
import m0.r.t.a.r.m.s0;
import m0.r.t.a.r.m.v;

/* compiled from: UnsignedType.kt */
public final class i {
    public static final i a = new i();
    public static final Set<d> b;
    public static final HashMap<a, a> c = new HashMap<>();
    public static final HashMap<a, a> d = new HashMap<>();
    public static final Set<d> e;

    static {
        UnsignedType[] values = UnsignedType.values();
        ArrayList arrayList = new ArrayList(4);
        int i = 0;
        for (int i2 = 0; i2 < 4; i2++) {
            arrayList.add(values[i2].getTypeName());
        }
        b = g.D0(arrayList);
        UnsignedArrayType[] values2 = UnsignedArrayType.values();
        ArrayList arrayList2 = new ArrayList(4);
        for (int i3 = 0; i3 < 4; i3++) {
            arrayList2.add(values2[i3].getTypeName());
        }
        g.D0(arrayList2);
        Pair[] pairArr = {new Pair(UnsignedArrayType.UBYTEARRAY, d.g("ubyteArrayOf")), new Pair(UnsignedArrayType.USHORTARRAY, d.g("ushortArrayOf")), new Pair(UnsignedArrayType.UINTARRAY, d.g("uintArrayOf")), new Pair(UnsignedArrayType.ULONGARRAY, d.g("ulongArrayOf"))};
        m0.n.b.i.e(pairArr, "pairs");
        g.f0(new HashMap(h.R2(4)), pairArr);
        UnsignedType[] values3 = UnsignedType.values();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (int i4 = 0; i4 < 4; i4++) {
            linkedHashSet.add(values3[i4].getArrayClassId().j());
        }
        e = linkedHashSet;
        UnsignedType[] values4 = UnsignedType.values();
        while (i < 4) {
            UnsignedType unsignedType = values4[i];
            i++;
            c.put(unsignedType.getArrayClassId(), unsignedType.getClassId());
            d.put(unsignedType.getClassId(), unsignedType.getArrayClassId());
        }
    }

    public static final boolean a(v vVar) {
        f c2;
        m0.n.b.i.e(vVar, "type");
        if (s0.p(vVar) || (c2 = vVar.I0().c()) == null) {
            return false;
        }
        m0.n.b.i.e(c2, "descriptor");
        m0.r.t.a.r.c.i b2 = c2.b();
        if (!(b2 instanceof m0.r.t.a.r.c.v) || !m0.n.b.i.a(((m0.r.t.a.r.c.v) b2).d(), g.l) || !b.contains(c2.getName())) {
            return false;
        }
        return true;
    }
}
