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
import n0.c.k.g1;
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/sinch/metadata/model/sim/OperatorInfo.$serializer", "Ln0/c/k/v;", "Lcom/sinch/metadata/model/sim/OperatorInfo;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lm0/i;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sinch/metadata/model/sim/OperatorInfo;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sinch/metadata/model/sim/OperatorInfo;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: OperatorInfo.kt */
public final class OperatorInfo$$serializer implements v<OperatorInfo> {
    private static final /* synthetic */ SerialDescriptor $$serialDesc;
    public static final OperatorInfo$$serializer INSTANCE;

    static {
        OperatorInfo$$serializer operatorInfo$$serializer = new OperatorInfo$$serializer();
        INSTANCE = operatorInfo$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sinch.metadata.model.sim.OperatorInfo", operatorInfo$$serializer, 5);
        pluginGeneratedSerialDescriptor.i("countryId", false);
        pluginGeneratedSerialDescriptor.i("name", false);
        pluginGeneratedSerialDescriptor.i("isRoaming", false);
        pluginGeneratedSerialDescriptor.i("mcc", false);
        pluginGeneratedSerialDescriptor.i("mnc", false);
        $$serialDesc = pluginGeneratedSerialDescriptor;
    }

    private OperatorInfo$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        g1 g1Var = g1.b;
        return new KSerializer[]{g1Var, g1Var, h.b, a.R1(g1Var), a.R1(g1Var)};
    }

    public OperatorInfo deserialize(Decoder decoder) {
        String str;
        String str2;
        boolean z;
        String str3;
        String str4;
        int i;
        Decoder decoder2 = decoder;
        i.e(decoder2, "decoder");
        SerialDescriptor serialDescriptor = $$serialDesc;
        c c = decoder2.c(serialDescriptor);
        if (!c.y()) {
            String str5 = null;
            String str6 = null;
            String str7 = null;
            String str8 = null;
            boolean z2 = false;
            int i2 = 0;
            while (true) {
                int x = c.x(serialDescriptor);
                if (x == -1) {
                    z = z2;
                    i = i2;
                    str4 = str5;
                    str3 = str6;
                    str2 = str7;
                    str = str8;
                    break;
                } else if (x == 0) {
                    str5 = c.t(serialDescriptor, 0);
                    i2 |= 1;
                } else if (x == 1) {
                    str6 = c.t(serialDescriptor, 1);
                    i2 |= 2;
                } else if (x == 2) {
                    z2 = c.s(serialDescriptor, 2);
                    i2 |= 4;
                } else if (x == 3) {
                    str7 = (String) c.v(serialDescriptor, 3, g1.b, str7);
                    i2 |= 8;
                } else if (x == 4) {
                    str8 = (String) c.v(serialDescriptor, 4, g1.b, str8);
                    i2 |= 16;
                } else {
                    throw new UnknownFieldException(x);
                }
            }
        } else {
            String t = c.t(serialDescriptor, 0);
            String t2 = c.t(serialDescriptor, 1);
            boolean s = c.s(serialDescriptor, 2);
            g1 g1Var = g1.b;
            str4 = t;
            str2 = (String) c.v(serialDescriptor, 3, g1Var, null);
            str = (String) c.v(serialDescriptor, 4, g1Var, null);
            z = s;
            str3 = t2;
            i = Integer.MAX_VALUE;
        }
        c.b(serialDescriptor);
        return new OperatorInfo(i, str4, str3, z, str2, str);
    }

    public SerialDescriptor getDescriptor() {
        return $$serialDesc;
    }

    public void serialize(Encoder encoder, OperatorInfo operatorInfo) {
        i.e(encoder, "encoder");
        i.e(operatorInfo, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        SerialDescriptor serialDescriptor = $$serialDesc;
        d c = encoder.c(serialDescriptor);
        i.e(operatorInfo, "self");
        i.e(c, "output");
        i.e(serialDescriptor, "serialDesc");
        c.s(serialDescriptor, 0, operatorInfo.a);
        c.s(serialDescriptor, 1, operatorInfo.b);
        c.r(serialDescriptor, 2, operatorInfo.c);
        g1 g1Var = g1.b;
        c.l(serialDescriptor, 3, g1Var, operatorInfo.d);
        c.l(serialDescriptor, 4, g1Var, operatorInfo.e);
        c.b(serialDescriptor);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return v0.a;
    }
}
