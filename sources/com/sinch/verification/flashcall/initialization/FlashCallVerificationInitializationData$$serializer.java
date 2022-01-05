package com.sinch.verification.flashcall.initialization;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.pubnub.api.endpoints.objects_api.utils.Include;
import com.sinch.metadata.model.PhoneMetadata;
import com.sinch.metadata.model.PhoneMetadata$$serializer;
import com.sinch.verification.core.initiation.VerificationIdentity;
import com.sinch.verification.core.initiation.VerificationIdentity$$serializer;
import com.sinch.verification.core.internal.VerificationMethodType;
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

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/sinch/verification/flashcall/initialization/FlashCallVerificationInitializationData.$serializer", "Ln0/c/k/v;", "Lcom/sinch/verification/flashcall/initialization/FlashCallVerificationInitializationData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lm0/i;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sinch/verification/flashcall/initialization/FlashCallVerificationInitializationData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sinch/verification/flashcall/initialization/FlashCallVerificationInitializationData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "verification-flashcall_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: FlashCallVerificationInitializationData.kt */
public final class FlashCallVerificationInitializationData$$serializer implements v<FlashCallVerificationInitializationData> {
    private static final /* synthetic */ SerialDescriptor $$serialDesc;
    public static final FlashCallVerificationInitializationData$$serializer INSTANCE;

    static {
        FlashCallVerificationInitializationData$$serializer flashCallVerificationInitializationData$$serializer = new FlashCallVerificationInitializationData$$serializer();
        INSTANCE = flashCallVerificationInitializationData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sinch.verification.flashcall.initialization.FlashCallVerificationInitializationData", flashCallVerificationInitializationData$$serializer, 6);
        pluginGeneratedSerialDescriptor.i("identity", false);
        pluginGeneratedSerialDescriptor.i("honourEarlyReject", false);
        pluginGeneratedSerialDescriptor.i(Include.INCLUDE_CUSTOM_PARAM_VALUE, false);
        pluginGeneratedSerialDescriptor.i("reference", false);
        pluginGeneratedSerialDescriptor.i("metadata", false);
        pluginGeneratedSerialDescriptor.i("method", true);
        $$serialDesc = pluginGeneratedSerialDescriptor;
    }

    private FlashCallVerificationInitializationData$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        g1 g1Var = g1.b;
        return new KSerializer[]{VerificationIdentity$$serializer.INSTANCE, h.b, a.R1(g1Var), a.R1(g1Var), a.R1(PhoneMetadata$$serializer.INSTANCE), VerificationMethodType.Companion};
    }

    public FlashCallVerificationInitializationData deserialize(Decoder decoder) {
        VerificationMethodType verificationMethodType;
        PhoneMetadata phoneMetadata;
        String str;
        String str2;
        boolean z;
        VerificationIdentity verificationIdentity;
        int i;
        Decoder decoder2 = decoder;
        i.e(decoder2, "decoder");
        SerialDescriptor serialDescriptor = $$serialDesc;
        c c = decoder2.c(serialDescriptor);
        if (c.y()) {
            boolean s = c.s(serialDescriptor, 1);
            g1 g1Var = g1.b;
            verificationIdentity = (VerificationIdentity) c.m(serialDescriptor, 0, VerificationIdentity$$serializer.INSTANCE, null);
            verificationMethodType = (VerificationMethodType) c.m(serialDescriptor, 5, VerificationMethodType.Companion, null);
            str = (String) c.v(serialDescriptor, 3, g1Var, null);
            phoneMetadata = (PhoneMetadata) c.v(serialDescriptor, 4, PhoneMetadata$$serializer.INSTANCE, null);
            str2 = (String) c.v(serialDescriptor, 2, g1Var, null);
            z = s;
            i = Integer.MAX_VALUE;
        } else {
            boolean z2 = false;
            VerificationIdentity verificationIdentity2 = null;
            String str3 = null;
            String str4 = null;
            PhoneMetadata phoneMetadata2 = null;
            VerificationMethodType verificationMethodType2 = null;
            int i2 = 0;
            while (true) {
                int x = c.x(serialDescriptor);
                switch (x) {
                    case -1:
                        z = z2;
                        i = i2;
                        verificationIdentity = verificationIdentity2;
                        str2 = str3;
                        str = str4;
                        phoneMetadata = phoneMetadata2;
                        verificationMethodType = verificationMethodType2;
                        break;
                    case 0:
                        verificationIdentity2 = (VerificationIdentity) c.m(serialDescriptor, 0, VerificationIdentity$$serializer.INSTANCE, verificationIdentity2);
                        i2 |= 1;
                        continue;
                    case 1:
                        z2 = c.s(serialDescriptor, 1);
                        i2 |= 2;
                        continue;
                    case 2:
                        str3 = (String) c.v(serialDescriptor, 2, g1.b, str3);
                        i2 |= 4;
                        continue;
                    case 3:
                        str4 = (String) c.v(serialDescriptor, 3, g1.b, str4);
                        i2 |= 8;
                        continue;
                    case 4:
                        phoneMetadata2 = (PhoneMetadata) c.v(serialDescriptor, 4, PhoneMetadata$$serializer.INSTANCE, phoneMetadata2);
                        i2 |= 16;
                        continue;
                    case 5:
                        verificationMethodType2 = (VerificationMethodType) c.m(serialDescriptor, 5, VerificationMethodType.Companion, verificationMethodType2);
                        i2 |= 32;
                        continue;
                    default:
                        throw new UnknownFieldException(x);
                }
            }
        }
        c.b(serialDescriptor);
        return new FlashCallVerificationInitializationData(i, verificationIdentity, z, str2, str, phoneMetadata, verificationMethodType);
    }

    public SerialDescriptor getDescriptor() {
        return $$serialDesc;
    }

    public void serialize(Encoder encoder, FlashCallVerificationInitializationData flashCallVerificationInitializationData) {
        i.e(encoder, "encoder");
        i.e(flashCallVerificationInitializationData, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        SerialDescriptor serialDescriptor = $$serialDesc;
        d c = encoder.c(serialDescriptor);
        i.e(flashCallVerificationInitializationData, "self");
        i.e(c, "output");
        i.e(serialDescriptor, "serialDesc");
        c.z(serialDescriptor, 0, VerificationIdentity$$serializer.INSTANCE, flashCallVerificationInitializationData.b);
        c.r(serialDescriptor, 1, flashCallVerificationInitializationData.c);
        g1 g1Var = g1.b;
        c.l(serialDescriptor, 2, g1Var, flashCallVerificationInitializationData.d);
        c.l(serialDescriptor, 3, g1Var, flashCallVerificationInitializationData.e);
        c.l(serialDescriptor, 4, PhoneMetadata$$serializer.INSTANCE, flashCallVerificationInitializationData.f);
        if ((!i.a(flashCallVerificationInitializationData.a, VerificationMethodType.FLASHCALL)) || c.v(serialDescriptor, 5)) {
            c.z(serialDescriptor, 5, VerificationMethodType.Companion, flashCallVerificationInitializationData.a);
        }
        c.b(serialDescriptor);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return v0.a;
    }
}
