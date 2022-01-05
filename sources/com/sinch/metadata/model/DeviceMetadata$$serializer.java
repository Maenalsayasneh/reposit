package com.sinch.metadata.model;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.i;
import n0.c.j.c;
import n0.c.j.d;
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/sinch/metadata/model/DeviceMetadata.$serializer", "Ln0/c/k/v;", "Lcom/sinch/metadata/model/DeviceMetadata;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lm0/i;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sinch/metadata/model/DeviceMetadata;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sinch/metadata/model/DeviceMetadata;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: DeviceMetadata.kt */
public final class DeviceMetadata$$serializer implements v<DeviceMetadata> {
    private static final /* synthetic */ SerialDescriptor $$serialDesc;
    public static final DeviceMetadata$$serializer INSTANCE;

    static {
        DeviceMetadata$$serializer deviceMetadata$$serializer = new DeviceMetadata$$serializer();
        INSTANCE = deviceMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sinch.metadata.model.DeviceMetadata", deviceMetadata$$serializer, 3);
        pluginGeneratedSerialDescriptor.i("model", false);
        pluginGeneratedSerialDescriptor.i("idname", false);
        pluginGeneratedSerialDescriptor.i("manufacturer", false);
        $$serialDesc = pluginGeneratedSerialDescriptor;
    }

    private DeviceMetadata$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        g1 g1Var = g1.b;
        return new KSerializer[]{g1Var, g1Var, g1Var};
    }

    public DeviceMetadata deserialize(Decoder decoder) {
        int i;
        String str;
        String str2;
        String str3;
        i.e(decoder, "decoder");
        SerialDescriptor serialDescriptor = $$serialDesc;
        c c = decoder.c(serialDescriptor);
        if (!c.y()) {
            str3 = null;
            String str4 = null;
            String str5 = null;
            int i2 = 0;
            while (true) {
                int x = c.x(serialDescriptor);
                if (x == -1) {
                    str2 = str4;
                    str = str5;
                    i = i2;
                    break;
                } else if (x == 0) {
                    str3 = c.t(serialDescriptor, 0);
                    i2 |= 1;
                } else if (x == 1) {
                    str4 = c.t(serialDescriptor, 1);
                    i2 |= 2;
                } else if (x == 2) {
                    str5 = c.t(serialDescriptor, 2);
                    i2 |= 4;
                } else {
                    throw new UnknownFieldException(x);
                }
            }
        } else {
            str3 = c.t(serialDescriptor, 0);
            str2 = c.t(serialDescriptor, 1);
            str = c.t(serialDescriptor, 2);
            i = Integer.MAX_VALUE;
        }
        c.b(serialDescriptor);
        return new DeviceMetadata(i, str3, str2, str);
    }

    public SerialDescriptor getDescriptor() {
        return $$serialDesc;
    }

    public void serialize(Encoder encoder, DeviceMetadata deviceMetadata) {
        i.e(encoder, "encoder");
        i.e(deviceMetadata, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        SerialDescriptor serialDescriptor = $$serialDesc;
        d c = encoder.c(serialDescriptor);
        i.e(deviceMetadata, "self");
        i.e(c, "output");
        i.e(serialDescriptor, "serialDesc");
        c.s(serialDescriptor, 0, deviceMetadata.a);
        c.s(serialDescriptor, 1, deviceMetadata.b);
        c.s(serialDescriptor, 2, deviceMetadata.c);
        c.b(serialDescriptor);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return v0.a;
    }
}
