package kotlinx.serialization.internal;

import java.util.ArrayList;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import m0.n.a.a;
import n0.c.k.u0;
import n0.c.k.v;

/* compiled from: PluginGeneratedSerialDescriptor.kt */
public final class PluginGeneratedSerialDescriptor$typeParameterDescriptors$2 extends Lambda implements a<SerialDescriptor[]> {
    public final /* synthetic */ PluginGeneratedSerialDescriptor c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PluginGeneratedSerialDescriptor$typeParameterDescriptors$2(PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor) {
        super(0);
        this.c = pluginGeneratedSerialDescriptor;
    }

    public Object invoke() {
        ArrayList arrayList;
        KSerializer[] typeParametersSerializers;
        v<?> vVar = this.c.j;
        if (vVar == null || (typeParametersSerializers = vVar.typeParametersSerializers()) == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList(typeParametersSerializers.length);
            for (KSerializer descriptor : typeParametersSerializers) {
                arrayList.add(descriptor.getDescriptor());
            }
        }
        return u0.b(arrayList);
    }
}
