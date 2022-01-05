package n0.c.k;

import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CollectionDescriptors.kt */
public final class x0 extends k0 {
    public final String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public x0(SerialDescriptor serialDescriptor) {
        super(serialDescriptor, (f) null);
        i.e(serialDescriptor, "primitive");
        this.c = serialDescriptor.a() + "Array";
    }

    public String a() {
        return this.c;
    }
}
