package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: SerialDescriptors.kt */
public final class SerialDescriptorImpl$_hashCode$2 extends Lambda implements a<Integer> {
    public final /* synthetic */ SerialDescriptorImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SerialDescriptorImpl$_hashCode$2(SerialDescriptorImpl serialDescriptorImpl) {
        super(0);
        this.c = serialDescriptorImpl;
    }

    public Object invoke() {
        SerialDescriptorImpl serialDescriptorImpl = this.c;
        return Integer.valueOf(m0.r.t.a.r.m.a1.a.c2(serialDescriptorImpl, serialDescriptorImpl.g));
    }
}
