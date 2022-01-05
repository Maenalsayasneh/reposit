package kotlin.reflect.jvm.internal.impl.serialization.deserialization.descriptors;

import java.util.List;
import m0.r.t.a.r.c.i;
import m0.r.t.a.r.c.s;
import m0.r.t.a.r.f.c.c;
import m0.r.t.a.r.f.c.e;
import m0.r.t.a.r.f.c.f;
import m0.r.t.a.r.f.c.g;
import m0.r.t.a.r.h.l;
import m0.r.t.a.r.k.b.w.d;

/* compiled from: DeserializedMemberDescriptor.kt */
public interface DeserializedMemberDescriptor extends i, s {

    /* compiled from: DeserializedMemberDescriptor.kt */
    public enum CoroutinesCompatibilityMode {
        COMPATIBLE,
        NEEDS_WRAPPER,
        INCOMPATIBLE
    }

    l A();

    List<f> F0();

    e R();

    g X();

    c Y();

    d b0();
}
