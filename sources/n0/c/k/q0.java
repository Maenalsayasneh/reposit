package n0.c.k;

import java.util.Iterator;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.i.d;
import n0.c.j.c;

/* compiled from: CollectionSerializers.kt */
public abstract class q0<Key, Value, Collection, Builder extends Map<Key, Value>> extends a<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    public final KSerializer<Key> a;
    public final KSerializer<Value> b;

    public q0(KSerializer kSerializer, KSerializer kSerializer2, f fVar) {
        super((f) null);
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    public void g(c cVar, Object obj, int i, int i2) {
        Map map = (Map) obj;
        i.e(cVar, "decoder");
        i.e(map, "builder");
        if (i2 >= 0) {
            m0.q.c e = m0.q.i.e(m0.q.i.f(0, i2 * 2), 2);
            int i3 = e.c;
            int i4 = e.d;
            int i5 = e.q;
            if (i5 >= 0) {
                if (i3 > i4) {
                    return;
                }
            } else if (i3 < i4) {
                return;
            }
            while (true) {
                h(cVar, i + i3, map, false);
                if (i3 != i4) {
                    i3 += i5;
                } else {
                    return;
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    public abstract SerialDescriptor getDescriptor();

    /* renamed from: k */
    public final void h(c cVar, int i, Builder builder, boolean z) {
        int i2;
        Value value;
        i.e(cVar, "decoder");
        i.e(builder, "builder");
        Object c1 = a.c1(cVar, getDescriptor(), i, this.a, (Object) null, 8, (Object) null);
        boolean z2 = true;
        if (z) {
            i2 = cVar.x(getDescriptor());
            if (i2 != i + 1) {
                z2 = false;
            }
            if (!z2) {
                throw new IllegalArgumentException(i0.d.a.a.a.h0("Value must follow key in a map, index for key: ", i, ", returned index for value: ", i2).toString());
            }
        } else {
            i2 = i + 1;
        }
        int i3 = i2;
        if (!builder.containsKey(c1) || (this.b.getDescriptor().f() instanceof d)) {
            value = a.c1(cVar, getDescriptor(), i3, this.b, (Object) null, 8, (Object) null);
        } else {
            value = cVar.m(getDescriptor(), i3, this.b, g.A(builder, c1));
        }
        builder.put(c1, value);
    }

    public void serialize(Encoder encoder, Collection collection) {
        i.e(encoder, "encoder");
        n0.c.j.d t = encoder.t(getDescriptor(), e(collection));
        Iterator d = d(collection);
        int i = 0;
        while (d.hasNext()) {
            Map.Entry entry = (Map.Entry) d.next();
            Object key = entry.getKey();
            Object value = entry.getValue();
            int i2 = i + 1;
            t.z(getDescriptor(), i, this.a, key);
            t.z(getDescriptor(), i2, this.b, value);
            i = i2 + 1;
        }
        t.b(getDescriptor());
    }
}
