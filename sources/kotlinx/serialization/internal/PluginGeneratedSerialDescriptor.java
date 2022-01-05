package kotlinx.serialization.internal;

import i0.d.a.a.a;
import i0.j.f.p.h;
import java.lang.annotation.Annotation;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.c;
import m0.n.b.i;
import n0.c.i.g;
import n0.c.i.h;
import n0.c.k.l;
import n0.c.k.v;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
public class PluginGeneratedSerialDescriptor implements SerialDescriptor, l {
    public int a = -1;
    public final String[] b;
    public final List<Annotation>[] c;
    public final boolean[] d;
    public final c e;
    public final c f;
    public final c g;
    public final c h;
    public final String i;
    public final v<?> j;
    public final int k;

    public PluginGeneratedSerialDescriptor(String str, v<?> vVar, int i2) {
        i.e(str, "serialName");
        this.i = str;
        this.j = vVar;
        this.k = i2;
        String[] strArr = new String[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.b = strArr;
        int i4 = this.k;
        this.c = new List[i4];
        this.d = new boolean[i4];
        this.e = h.H2(new PluginGeneratedSerialDescriptor$indices$2(this));
        this.f = h.H2(new PluginGeneratedSerialDescriptor$childSerializers$2(this));
        this.g = h.H2(new PluginGeneratedSerialDescriptor$typeParameterDescriptors$2(this));
        this.h = h.H2(new PluginGeneratedSerialDescriptor$_hashCode$2(this));
    }

    public String a() {
        return this.i;
    }

    public Set<String> b() {
        return j().keySet();
    }

    public boolean c() {
        return false;
    }

    public int d(String str) {
        i.e(str, "name");
        Integer num = j().get(str);
        if (num != null) {
            return num.intValue();
        }
        return -3;
    }

    public final int e() {
        return this.k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PluginGeneratedSerialDescriptor) {
            SerialDescriptor serialDescriptor = (SerialDescriptor) obj;
            if (!(!i.a(this.i, serialDescriptor.a())) && Arrays.equals(k(), ((PluginGeneratedSerialDescriptor) obj).k()) && this.k == serialDescriptor.e()) {
                int i2 = this.k;
                int i3 = 0;
                while (i3 < i2) {
                    if (!(!i.a(h(i3).a(), serialDescriptor.h(i3).a())) && !(!i.a(h(i3).f(), serialDescriptor.h(i3).f()))) {
                        i3++;
                    }
                }
                return true;
            }
        }
        return false;
    }

    public g f() {
        return h.a.a;
    }

    public String g(int i2) {
        return this.b[i2];
    }

    public SerialDescriptor h(int i2) {
        return ((KSerializer[]) this.f.getValue())[i2].getDescriptor();
    }

    public int hashCode() {
        return ((Number) this.h.getValue()).intValue();
    }

    public final void i(String str, boolean z) {
        i.e(str, "name");
        String[] strArr = this.b;
        int i2 = this.a + 1;
        this.a = i2;
        strArr[i2] = str;
        this.d[i2] = z;
        this.c[i2] = null;
    }

    public boolean isInline() {
        return false;
    }

    public final Map<String, Integer> j() {
        return (Map) this.e.getValue();
    }

    public final SerialDescriptor[] k() {
        return (SerialDescriptor[]) this.g.getValue();
    }

    public String toString() {
        return m0.j.g.E(j().entrySet(), ", ", a.x0(new StringBuilder(), this.i, '('), ")", 0, (CharSequence) null, new PluginGeneratedSerialDescriptor$toString$1(this), 24);
    }
}
