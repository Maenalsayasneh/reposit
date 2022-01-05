package kotlinx.serialization.descriptors;

import i0.j.f.p.h;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Pair;
import m0.c;
import m0.j.m;
import m0.j.n;
import m0.n.b.i;
import n0.c.i.a;
import n0.c.i.g;
import n0.c.k.l;
import n0.c.k.u0;

/* compiled from: SerialDescriptors.kt */
public final class SerialDescriptorImpl implements SerialDescriptor, l {
    public final List<Annotation> a;
    public final Set<String> b;
    public final String[] c;
    public final SerialDescriptor[] d;
    public final List<Annotation>[] e;
    public final Map<String, Integer> f;
    public final SerialDescriptor[] g;
    public final c h;
    public final String i;
    public final g j;
    public final int k;

    public SerialDescriptorImpl(String str, g gVar, int i2, List<? extends SerialDescriptor> list, a aVar) {
        i.e(str, "serialName");
        i.e(gVar, "kind");
        i.e(list, "typeParameters");
        i.e(aVar, "builder");
        this.i = str;
        this.j = gVar;
        this.k = i2;
        this.a = aVar.a;
        this.b = m0.j.g.t0(aVar.b);
        int i3 = 0;
        Object[] array = aVar.b.toArray(new String[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        this.c = (String[]) array;
        this.d = u0.b(aVar.d);
        Object[] array2 = aVar.e.toArray(new List[0]);
        Objects.requireNonNull(array2, "null cannot be cast to non-null type kotlin.Array<T>");
        this.e = (List[]) array2;
        List<Boolean> list2 = aVar.f;
        i.e(list2, "$this$toBooleanArray");
        boolean[] zArr = new boolean[list2.size()];
        for (Boolean booleanValue : list2) {
            zArr[i3] = booleanValue.booleanValue();
            i3++;
        }
        Iterable E4 = h.E4(this.c);
        ArrayList arrayList = new ArrayList(h.K(E4, 10));
        Iterator it = ((m) E4).iterator();
        while (true) {
            n nVar = (n) it;
            if (nVar.hasNext()) {
                m0.j.l lVar = (m0.j.l) nVar.next();
                arrayList.add(new Pair(lVar.b, Integer.valueOf(lVar.a)));
            } else {
                this.f = m0.j.g.w0(arrayList);
                this.g = u0.b(list);
                this.h = h.H2(new SerialDescriptorImpl$_hashCode$2(this));
                return;
            }
        }
    }

    public String a() {
        return this.i;
    }

    public Set<String> b() {
        return this.b;
    }

    public boolean c() {
        return false;
    }

    public int d(String str) {
        i.e(str, "name");
        Integer num = this.f.get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public int e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof SerialDescriptorImpl) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (!(!i.a(this.i, serialDescriptor.a())) && Arrays.equals(this.g, ((SerialDescriptorImpl) obj).g) && this.k == serialDescriptor.e()) {
                int i2 = this.k;
                int i3 = 0;
                while (i3 < i2) {
                    if (!(!i.a(this.d[i3].a(), serialDescriptor.h(i3).a())) && !(!i.a(this.d[i3].f(), serialDescriptor.h(i3).f()))) {
                        i3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public g f() {
        return this.j;
    }

    public String g(int i2) {
        return this.c[i2];
    }

    public SerialDescriptor h(int i2) {
        return this.d[i2];
    }

    public int hashCode() {
        return ((Number) this.h.getValue()).intValue();
    }

    public boolean isInline() {
        return false;
    }

    public String toString() {
        return m0.j.g.E(m0.q.i.f(0, this.k), ", ", i0.d.a.a.a.x0(new StringBuilder(), this.i, '('), ")", 0, (CharSequence) null, new SerialDescriptorImpl$toString$1(this), 24);
    }
}
