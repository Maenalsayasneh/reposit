package kotlinx.serialization.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.n.a.a;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
public final class PluginGeneratedSerialDescriptor$indices$2 extends Lambda implements a<Map<String, ? extends Integer>> {
    public final /* synthetic */ PluginGeneratedSerialDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PluginGeneratedSerialDescriptor$indices$2(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        super(0);
        this.c = pluginGeneratedSerialDescriptor;
    }

    public Object invoke() {
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = this.c;
        Objects.requireNonNull(pluginGeneratedSerialDescriptor);
        HashMap hashMap = new HashMap();
        int length = pluginGeneratedSerialDescriptor.b.length;
        for (int i = 0; i < length; i++) {
            hashMap.put(pluginGeneratedSerialDescriptor.b[i], Integer.valueOf(i));
        }
        return hashMap;
    }
}
