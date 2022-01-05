package m0.r.t.a.r.e.b;

import i0.d.a.a.a;
import kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors.DeserializedContainerAbiStability;
import m0.n.b.i;
import m0.r.t.a.r.c.i0;
import m0.r.t.a.r.f.d.a.f;
import m0.r.t.a.r.k.b.n;
import m0.r.t.a.r.k.b.w.d;

/* compiled from: KotlinJvmBinarySourceElement.kt */
public final class l implements d {
    public final j b;

    public l(j jVar, n<f> nVar, boolean z, DeserializedContainerAbiStability deserializedContainerAbiStability) {
        i.e(jVar, "binaryClass");
        i.e(deserializedContainerAbiStability, "abiStability");
        this.b = jVar;
    }

    public i0 a() {
        i0 i0Var = i0.a;
        i.d(i0Var, "NO_SOURCE_FILE");
        return i0Var;
    }

    public String c() {
        StringBuilder P0 = a.P0("Class '");
        P0.append(this.b.e().b().b());
        P0.append('\'');
        return P0.toString();
    }

    public String toString() {
        return l.class.getSimpleName() + ": " + this.b;
    }
}
