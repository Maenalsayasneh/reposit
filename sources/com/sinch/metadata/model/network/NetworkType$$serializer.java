package com.sinch.metadata.model.network;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumDescriptor;
import m0.n.b.i;
import n0.c.k.g1;
import n0.c.k.v;
import n0.c.k.v0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/sinch/metadata/model/network/NetworkType.$serializer", "Ln0/c/k/v;", "Lcom/sinch/metadata/model/network/NetworkType;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lm0/i;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sinch/metadata/model/network/NetworkType;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sinch/metadata/model/network/NetworkType;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: NetworkType.kt */
public final class NetworkType$$serializer implements v<NetworkType> {
    private static final /* synthetic */ SerialDescriptor $$serialDesc;
    public static final NetworkType$$serializer INSTANCE = new NetworkType$$serializer();

    static {
        EnumDescriptor enumDescriptor = new EnumDescriptor("com.sinch.metadata.model.network.NetworkType", 4);
        enumDescriptor.i("MOBILE", false);
        enumDescriptor.i("WIFI", false);
        enumDescriptor.i("ETHERNET", false);
        enumDescriptor.i("Not Connected", false);
        $$serialDesc = enumDescriptor;
    }

    private NetworkType$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{g1.b};
    }

    public NetworkType deserialize(Decoder decoder) {
        i.e(decoder, "decoder");
        return NetworkType.values()[decoder.g($$serialDesc)];
    }

    public SerialDescriptor getDescriptor() {
        return $$serialDesc;
    }

    public void serialize(Encoder encoder, NetworkType networkType) {
        i.e(encoder, "encoder");
        i.e(networkType, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        encoder.u($$serialDesc, networkType.ordinal());
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return v0.a;
    }
}
