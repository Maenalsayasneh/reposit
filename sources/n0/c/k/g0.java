package n0.c.k;

import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CollectionDescriptors.kt */
public final class g0 extends p0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public g0(SerialDescriptor serialDescriptor, SerialDescriptor serialDescriptor2) {
        super("kotlin.collections.LinkedHashMap", serialDescriptor, serialDescriptor2, (f) null);
        i.e(serialDescriptor, "keyDesc");
        i.e(serialDescriptor2, "valueDesc");
    }
}
