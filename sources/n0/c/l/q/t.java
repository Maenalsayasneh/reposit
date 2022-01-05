package n0.c.l.q;

import java.util.Set;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.d;
import m0.e;
import m0.f;
import m0.h;
import m0.j.g;
import m0.n.b.i;
import n0.c.k.i1;
import n0.c.k.j1;
import n0.c.k.k1;
import n0.c.k.l1;

/* compiled from: StreamingJsonEncoder.kt */
public final class t {
    public static final Set<SerialDescriptor> a = g.h0(j1.a, k1.a, i1.a, l1.a);

    static {
        i.e(e.c, "$this$serializer");
        j1 j1Var = j1.b;
        i.e(f.c, "$this$serializer");
        k1 k1Var = k1.b;
        i.e(d.c, "$this$serializer");
        i1 i1Var = i1.b;
        i.e(h.c, "$this$serializer");
        l1 l1Var = l1.b;
    }

    public static final boolean a(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "$this$isUnsignedNumber");
        return serialDescriptor.isInline() && a.contains(serialDescriptor);
    }
}
