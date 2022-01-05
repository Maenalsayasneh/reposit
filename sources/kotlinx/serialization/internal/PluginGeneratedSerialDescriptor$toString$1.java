package kotlinx.serialization.internal;

import java.util.Map;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
public final class PluginGeneratedSerialDescriptor$toString$1 extends Lambda implements l<Map.Entry<? extends String, ? extends Integer>, CharSequence> {
    public final /* synthetic */ PluginGeneratedSerialDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PluginGeneratedSerialDescriptor$toString$1(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        super(1);
        this.c = pluginGeneratedSerialDescriptor;
    }

    public Object invoke(Object obj) {
        Map.Entry entry = (Map.Entry) obj;
        i.e(entry, "it");
        return ((String) entry.getKey()) + ": " + this.c.h(((Number) entry.getValue()).intValue()).a();
    }
}
