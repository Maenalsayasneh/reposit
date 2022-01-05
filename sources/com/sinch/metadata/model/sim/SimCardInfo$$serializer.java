package com.sinch.metadata.model.sim;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.j.c;
import n0.c.j.d;
import n0.c.k.v;
import n0.c.k.v0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/sinch/metadata/model/sim/SimCardInfo.$serializer", "Ln0/c/k/v;", "Lcom/sinch/metadata/model/sim/SimCardInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lm0/i;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sinch/metadata/model/sim/SimCardInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sinch/metadata/model/sim/SimCardInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: SimCardInfo.kt */
public final class SimCardInfo$$serializer implements v<SimCardInfo> {
    private static final /* synthetic */ SerialDescriptor $$serialDesc;
    public static final SimCardInfo$$serializer INSTANCE;

    static {
        SimCardInfo$$serializer simCardInfo$$serializer = new SimCardInfo$$serializer();
        INSTANCE = simCardInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sinch.metadata.model.sim.SimCardInfo", simCardInfo$$serializer, 2);
        pluginGeneratedSerialDescriptor.i("sim", false);
        pluginGeneratedSerialDescriptor.i("operator", false);
        $$serialDesc = pluginGeneratedSerialDescriptor;
    }

    private SimCardInfo$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{a.R1(SimMetadata$$serializer.INSTANCE), OperatorInfo$$serializer.INSTANCE};
    }

    public SimCardInfo deserialize(Decoder decoder) {
        int i;
        OperatorInfo operatorInfo;
        SimMetadata simMetadata;
        i.e(decoder, "decoder");
        SerialDescriptor serialDescriptor = $$serialDesc;
        c c = decoder.c(serialDescriptor);
        SimMetadata simMetadata2 = null;
        if (!c.y()) {
            OperatorInfo operatorInfo2 = null;
            int i2 = 0;
            while (true) {
                int x = c.x(serialDescriptor);
                if (x == -1) {
                    i = i2;
                    SimMetadata simMetadata3 = simMetadata2;
                    operatorInfo = operatorInfo2;
                    simMetadata = simMetadata3;
                    break;
                } else if (x == 0) {
                    simMetadata2 = (SimMetadata) c.v(serialDescriptor, 0, SimMetadata$$serializer.INSTANCE, simMetadata2);
                    i2 |= 1;
                } else if (x == 1) {
                    operatorInfo2 = (OperatorInfo) c.m(serialDescriptor, 1, OperatorInfo$$serializer.INSTANCE, operatorInfo2);
                    i2 |= 2;
                } else {
                    throw new UnknownFieldException(x);
                }
            }
        } else {
            simMetadata = (SimMetadata) c.v(serialDescriptor, 0, SimMetadata$$serializer.INSTANCE, null);
            operatorInfo = (OperatorInfo) c.m(serialDescriptor, 1, OperatorInfo$$serializer.INSTANCE, null);
            i = Integer.MAX_VALUE;
        }
        c.b(serialDescriptor);
        return new SimCardInfo(i, simMetadata, operatorInfo);
    }

    public SerialDescriptor getDescriptor() {
        return $$serialDesc;
    }

    public void serialize(Encoder encoder, SimCardInfo simCardInfo) {
        i.e(encoder, "encoder");
        i.e(simCardInfo, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        SerialDescriptor serialDescriptor = $$serialDesc;
        d c = encoder.c(serialDescriptor);
        i.e(simCardInfo, "self");
        i.e(c, "output");
        i.e(serialDescriptor, "serialDesc");
        c.l(serialDescriptor, 0, SimMetadata$$serializer.INSTANCE, simCardInfo.a);
        c.z(serialDescriptor, 1, OperatorInfo$$serializer.INSTANCE, simCardInfo.b);
        c.b(serialDescriptor);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return v0.a;
    }
}
