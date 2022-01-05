package kotlinx.serialization.internal;

import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.a.a;
import m0.n.a.l;
import n0.c.i.h;

/* compiled from: Enums.kt */
public final class EnumDescriptor$elementDescriptors$2 extends Lambda implements a<SerialDescriptor[]> {
    public final /* synthetic */ EnumDescriptor c;
    public final /* synthetic */ int d;
    public final /* synthetic */ String q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EnumDescriptor$elementDescriptors$2(EnumDescriptor enumDescriptor, int i, String str) {
        super(0);
        this.c = enumDescriptor;
        this.d = i;
        this.q = str;
    }

    public Object invoke() {
        int i = this.d;
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[i];
        for (int i2 = 0; i2 < i; i2++) {
            serialDescriptorArr[i2] = m0.r.t.a.r.m.a1.a.g0(this.q + "." + this.c.b[i2], h.d.a, new SerialDescriptor[0], (l) null, 8);
        }
        return serialDescriptorArr;
    }
}
