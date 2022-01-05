package n0.c.k;

import i0.d.a.a.a;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.i;
import m0.r.d;
import m0.r.e;
import m0.r.n;

/* compiled from: Platform.common.kt */
public final class u0 {
    public static final SerialDescriptor[] a = new SerialDescriptor[0];

    public static final Set<String> a(SerialDescriptor serialDescriptor) {
        i.e(serialDescriptor, "$this$cachedSerialNames");
        if (serialDescriptor instanceof l) {
            return ((l) serialDescriptor).b();
        }
        HashSet hashSet = new HashSet(serialDescriptor.e());
        int e = serialDescriptor.e();
        for (int i = 0; i < e; i++) {
            hashSet.add(serialDescriptor.g(i));
        }
        return hashSet;
    }

    public static final SerialDescriptor[] b(List<? extends SerialDescriptor> list) {
        if (list == null || list.isEmpty()) {
            list = null;
        }
        if (list == null) {
            return a;
        }
        Object[] array = list.toArray(new SerialDescriptor[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        return (SerialDescriptor[]) array;
    }

    public static final d<Object> c(n nVar) {
        i.e(nVar, "$this$kclass");
        e c = nVar.c();
        if (c instanceof d) {
            return (d) c;
        }
        throw new IllegalStateException(("Only KClass supported as classifier, got " + c).toString());
    }

    public static final Void d(d<?> dVar) {
        i.e(dVar, "$this$serializerNotRegistered");
        StringBuilder P0 = a.P0("Serializer for class '");
        P0.append(dVar.e());
        P0.append("' is not found.\n");
        P0.append("Mark the class as @Serializable or provide the serializer explicitly.");
        throw new SerializationException(P0.toString());
    }
}
