package kotlinx.serialization.descriptors;

import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: SerialDescriptors.kt */
public final class SerialDescriptorImpl$toString$1 extends Lambda implements l<Integer, CharSequence> {
    public final /* synthetic */ SerialDescriptorImpl c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SerialDescriptorImpl$toString$1(SerialDescriptorImpl serialDescriptorImpl) {
        super(1);
        this.c = serialDescriptorImpl;
    }

    public Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        return this.c.c[intValue] + ": " + this.c.d[intValue].a();
    }
}
