package n0.c.i;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.i;

/* compiled from: SerialDescriptors.kt */
public final class a {
    public List<? extends Annotation> a = EmptyList.c;
    public final List<String> b = new ArrayList();
    public final Set<String> c = new HashSet();
    public final List<SerialDescriptor> d = new ArrayList();
    public final List<List<Annotation>> e = new ArrayList();
    public final List<Boolean> f = new ArrayList();

    public a(String str) {
        i.e(str, "serialName");
    }

    public static void a(a aVar, String str, SerialDescriptor serialDescriptor, List list, boolean z, int i) {
        EmptyList emptyList = (i & 4) != 0 ? EmptyList.c : null;
        if ((i & 8) != 0) {
            z = false;
        }
        i.e(str, "elementName");
        i.e(serialDescriptor, "descriptor");
        i.e(emptyList, "annotations");
        if (aVar.c.add(str)) {
            aVar.b.add(str);
            aVar.d.add(serialDescriptor);
            aVar.e.add(emptyList);
            aVar.f.add(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.o0("Element with name '", str, "' is already registered").toString());
    }
}
