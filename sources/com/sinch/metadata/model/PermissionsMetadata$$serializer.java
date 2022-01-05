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
import n0.c.k.h;
import n0.c.k.v;
import n0.c.k.v0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/sinch/metadata/model/PermissionsMetadata.$serializer", "Ln0/c/k/v;", "Lcom/sinch/metadata/model/PermissionsMetadata;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lm0/i;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sinch/metadata/model/PermissionsMetadata;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sinch/metadata/model/PermissionsMetadata;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "metadata-collector_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: PermissionsMetadata.kt */
public final class PermissionsMetadata$$serializer implements v<PermissionsMetadata> {
    private static final /* synthetic */ SerialDescriptor $$serialDesc;
    public static final PermissionsMetadata$$serializer INSTANCE;

    static {
        PermissionsMetadata$$serializer permissionsMetadata$$serializer = new PermissionsMetadata$$serializer();
        INSTANCE = permissionsMetadata$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sinch.metadata.model.PermissionsMetadata", permissionsMetadata$$serializer, 7);
        pluginGeneratedSerialDescriptor.i("READ_PHONE_STATE", false);
        pluginGeneratedSerialDescriptor.i("READ_CALL_LOG", false);
        pluginGeneratedSerialDescriptor.i("CALL_PHONE", false);
        pluginGeneratedSerialDescriptor.i("READ_SMS", false);
        pluginGeneratedSerialDescriptor.i("RECEIVE_SMS", false);
        pluginGeneratedSerialDescriptor.i("ACCESS_NETWORK_STATE", false);
        pluginGeneratedSerialDescriptor.i("getCellularSignalLevel", false);
        $$serialDesc = pluginGeneratedSerialDescriptor;
    }

    private PermissionsMetadata$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        h hVar = h.b;
        return new KSerializer[]{hVar, hVar, hVar, hVar, hVar, hVar, hVar};
    }

    public PermissionsMetadata deserialize(Decoder decoder) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        int i;
        Decoder decoder2 = decoder;
        i.e(decoder2, "decoder");
        SerialDescriptor serialDescriptor = $$serialDesc;
        c c = decoder2.c(serialDescriptor);
        if (c.y()) {
            boolean s = c.s(serialDescriptor, 0);
            boolean s2 = c.s(serialDescriptor, 1);
            boolean s3 = c.s(serialDescriptor, 2);
            boolean s4 = c.s(serialDescriptor, 3);
            boolean s5 = c.s(serialDescriptor, 4);
            boolean s6 = c.s(serialDescriptor, 5);
            z7 = s;
            z = c.s(serialDescriptor, 6);
            z2 = s6;
            z4 = s4;
            z3 = s5;
            z5 = s3;
            z6 = s2;
            i = Integer.MAX_VALUE;
        } else {
            boolean z8 = false;
            boolean z9 = false;
            boolean z10 = false;
            boolean z11 = false;
            boolean z12 = false;
            boolean z13 = false;
            boolean z14 = false;
            int i2 = 0;
            while (true) {
                int x = c.x(serialDescriptor);
                switch (x) {
                    case -1:
                        z7 = z8;
                        z = z9;
                        z2 = z10;
                        z4 = z11;
                        z3 = z12;
                        z5 = z13;
                        z6 = z14;
                        i = i2;
                        break;
                    case 0:
                        z8 = c.s(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        z14 = c.s(serialDescriptor, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        z13 = c.s(serialDescriptor, 2);
                        i2 |= 4;
                        continue;
                    case 3:
                        z11 = c.s(serialDescriptor, 3);
                        i2 |= 8;
                        continue;
                    case 4:
                        z12 = c.s(serialDescriptor, 4);
                        i2 |= 16;
                        continue;
                    case 5:
                        z10 = c.s(serialDescriptor, 5);
                        i2 |= 32;
                        continue;
                    case 6:
                        z9 = c.s(serialDescriptor, 6);
                        i2 |= 64;
                        continue;
                    default:
                        throw new UnknownFieldException(x);
                }
            }
        }
        c.b(serialDescriptor);
        return new PermissionsMetadata(i, z7, z6, z5, z4, z3, z2, z);
    }

    public SerialDescriptor getDescriptor() {
        return $$serialDesc;
    }

    public void serialize(Encoder encoder, PermissionsMetadata permissionsMetadata) {
        i.e(encoder, "encoder");
        i.e(permissionsMetadata, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        SerialDescriptor serialDescriptor = $$serialDesc;
        d c = encoder.c(serialDescriptor);
        i.e(permissionsMetadata, "self");
        i.e(c, "output");
        i.e(serialDescriptor, "serialDesc");
        c.r(serialDescriptor, 0, permissionsMetadata.a);
        c.r(serialDescriptor, 1, permissionsMetadata.b);
        c.r(serialDescriptor, 2, permissionsMetadata.c);
        c.r(serialDescriptor, 3, permissionsMetadata.d);
        c.r(serialDescriptor, 4, permissionsMetadata.e);
        c.r(serialDescriptor, 5, permissionsMetadata.f);
        c.r(serialDescriptor, 6, permissionsMetadata.g);
        c.b(serialDescriptor);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return v0.a;
    }
}
