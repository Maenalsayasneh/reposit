package n0.c.k;

import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CollectionDescriptors.kt */
public final class d extends k0 {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(SerialDescriptor serialDescriptor) {
        super(serialDescriptor, (f) null);
        i.e(serialDescriptor, "elementDesc");
    }

    public String a() {
        return "kotlin.collections.ArrayList";
    }
}
