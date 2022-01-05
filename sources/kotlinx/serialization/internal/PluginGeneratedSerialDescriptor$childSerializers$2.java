package kotlinx.serialization.internal;

import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import m0.n.a.a;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
public final class PluginGeneratedSerialDescriptor$childSerializers$2 extends Lambda implements a<KSerializer<?>[]> {
    public final /* synthetic */ PluginGeneratedSerialDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PluginGeneratedSerialDescriptor$childSerializers$2(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        super(0);
        this.c = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0006, code lost:
        r0 = r0.childSerializers();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke() {
        /*
            r1 = this;
            kotlinx.serialization.internal.PluginGeneratedSerialDescriptor r0 = r1.c
            n0.c.k.v<?> r0 = r0.j
            if (r0 == 0) goto L_0x000d
            kotlinx.serialization.KSerializer[] r0 = r0.childSerializers()
            if (r0 == 0) goto L_0x000d
            goto L_0x0010
        L_0x000d:
            r0 = 0
            kotlinx.serialization.KSerializer[] r0 = new kotlinx.serialization.KSerializer[r0]
        L_0x0010:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.PluginGeneratedSerialDescriptor$childSerializers$2.invoke():java.lang.Object");
    }
}
