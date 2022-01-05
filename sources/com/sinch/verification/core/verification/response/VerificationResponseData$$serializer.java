package com.sinch.verification.core.verification.response;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.sinch.verification.core.internal.VerificationMethodType;
import com.sinch.verification.core.internal.VerificationStatus;
import com.sinch.verification.core.internal.VerificationStatus$$serializer;
import com.sinch.verification.core.verification.model.VerificationSourceType;
import com.sinch.verification.core.verification.model.VerificationSourceType$$serializer;
import com.stripe.android.model.Stripe3ds2AuthParams;
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
import n0.c.k.v;
import n0.c.k.v0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/sinch/verification/core/verification/response/VerificationResponseData.$serializer", "Ln0/c/k/v;", "Lcom/sinch/verification/core/verification/response/VerificationResponseData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lm0/i;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sinch/verification/core/verification/response/VerificationResponseData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sinch/verification/core/verification/response/VerificationResponseData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: VerificationResponseData.kt */
public final class VerificationResponseData$$serializer implements v<VerificationResponseData> {
    private static final /* synthetic */ SerialDescriptor $$serialDesc;
    public static final VerificationResponseData$$serializer INSTANCE;

    static {
        VerificationResponseData$$serializer verificationResponseData$$serializer = new VerificationResponseData$$serializer();
        INSTANCE = verificationResponseData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sinch.verification.core.verification.response.VerificationResponseData", verificationResponseData$$serializer, 6);
        pluginGeneratedSerialDescriptor.i("id", false);
        pluginGeneratedSerialDescriptor.i(Stripe3ds2AuthParams.FIELD_SOURCE, true);
        pluginGeneratedSerialDescriptor.i("status", false);
        pluginGeneratedSerialDescriptor.i("method", false);
        pluginGeneratedSerialDescriptor.i("reason", true);
        pluginGeneratedSerialDescriptor.i("reference", true);
        $$serialDesc = pluginGeneratedSerialDescriptor;
    }

    private VerificationResponseData$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        g1 g1Var = g1.b;
        return new KSerializer[]{g1Var, a.R1(VerificationSourceType$$serializer.INSTANCE), VerificationStatus$$serializer.INSTANCE, VerificationMethodType.Companion, a.R1(g1Var), a.R1(g1Var)};
    }

    public VerificationResponseData deserialize(Decoder decoder) {
        String str;
        String str2;
        VerificationMethodType verificationMethodType;
        VerificationStatus verificationStatus;
        VerificationSourceType verificationSourceType;
        String str3;
        int i;
        Decoder decoder2 = decoder;
        i.e(decoder2, "decoder");
        SerialDescriptor serialDescriptor = $$serialDesc;
        c c = decoder2.c(serialDescriptor);
        String str4 = null;
        if (c.y()) {
            String t = c.t(serialDescriptor, 0);
            g1 g1Var = g1.b;
            str3 = t;
            str = (String) c.v(serialDescriptor, 5, g1Var, null);
            verificationMethodType = (VerificationMethodType) c.m(serialDescriptor, 3, VerificationMethodType.Companion, null);
            str2 = (String) c.v(serialDescriptor, 4, g1Var, null);
            verificationStatus = (VerificationStatus) c.m(serialDescriptor, 2, VerificationStatus$$serializer.INSTANCE, null);
            verificationSourceType = (VerificationSourceType) c.v(serialDescriptor, 1, VerificationSourceType$$serializer.INSTANCE, null);
            i = Integer.MAX_VALUE;
        } else {
            int i2 = 0;
            VerificationSourceType verificationSourceType2 = null;
            VerificationStatus verificationStatus2 = null;
            VerificationMethodType verificationMethodType2 = null;
            String str5 = null;
            String str6 = null;
            while (true) {
                int x = c.x(serialDescriptor);
                switch (x) {
                    case -1:
                        i = i2;
                        str3 = str4;
                        verificationSourceType = verificationSourceType2;
                        verificationStatus = verificationStatus2;
                        verificationMethodType = verificationMethodType2;
                        str2 = str5;
                        str = str6;
                        break;
                    case 0:
                        str4 = c.t(serialDescriptor, 0);
                        i2 |= 1;
                        continue;
                    case 1:
                        verificationSourceType2 = (VerificationSourceType) c.v(serialDescriptor, 1, VerificationSourceType$$serializer.INSTANCE, verificationSourceType2);
                        i2 |= 2;
                        continue;
                    case 2:
                        verificationStatus2 = (VerificationStatus) c.m(serialDescriptor, 2, VerificationStatus$$serializer.INSTANCE, verificationStatus2);
                        i2 |= 4;
                        continue;
                    case 3:
                        verificationMethodType2 = (VerificationMethodType) c.m(serialDescriptor, 3, VerificationMethodType.Companion, verificationMethodType2);
                        i2 |= 8;
                        continue;
                    case 4:
                        str5 = (String) c.v(serialDescriptor, 4, g1.b, str5);
                        i2 |= 16;
                        continue;
                    case 5:
                        str6 = (String) c.v(serialDescriptor, 5, g1.b, str6);
                        i2 |= 32;
                        continue;
                    default:
                        throw new UnknownFieldException(x);
                }
            }
        }
        c.b(serialDescriptor);
        return new VerificationResponseData(i, str3, verificationSourceType, verificationStatus, verificationMethodType, str2, str);
    }

    public SerialDescriptor getDescriptor() {
        return $$serialDesc;
    }

    public void serialize(Encoder encoder, VerificationResponseData verificationResponseData) {
        i.e(encoder, "encoder");
        i.e(verificationResponseData, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        SerialDescriptor serialDescriptor = $$serialDesc;
        d c = encoder.c(serialDescriptor);
        i.e(verificationResponseData, "self");
        i.e(c, "output");
        i.e(serialDescriptor, "serialDesc");
        c.s(serialDescriptor, 0, verificationResponseData.a);
        if ((!i.a(verificationResponseData.b, (Object) null)) || c.v(serialDescriptor, 1)) {
            c.l(serialDescriptor, 1, VerificationSourceType$$serializer.INSTANCE, verificationResponseData.b);
        }
        c.z(serialDescriptor, 2, VerificationStatus$$serializer.INSTANCE, verificationResponseData.c);
        c.z(serialDescriptor, 3, VerificationMethodType.Companion, verificationResponseData.d);
        if ((!i.a(verificationResponseData.e, (Object) null)) || c.v(serialDescriptor, 4)) {
            c.l(serialDescriptor, 4, g1.b, verificationResponseData.e);
        }
        if ((!i.a(verificationResponseData.f, (Object) null)) || c.v(serialDescriptor, 5)) {
            c.l(serialDescriptor, 5, g1.b, verificationResponseData.f);
        }
        c.b(serialDescriptor);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return v0.a;
    }
}
