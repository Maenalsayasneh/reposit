package com.sinch.verification.core.verification.model;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.sinch.verification.core.internal.VerificationMethodType;
import com.sinch.verification.core.verification.model.callout.CalloutVerificationDetails;
import com.sinch.verification.core.verification.model.callout.CalloutVerificationDetails$$serializer;
import com.sinch.verification.core.verification.model.flashcall.FlashCallVerificationDetails;
import com.sinch.verification.core.verification.model.flashcall.FlashCallVerificationDetails$$serializer;
import com.sinch.verification.core.verification.model.sms.SmsVerificationDetails;
import com.sinch.verification.core.verification.model.sms.SmsVerificationDetails$$serializer;
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
import n0.c.k.v;
import n0.c.k.v0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0018\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000e0\rHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0014\u001a\u00020\u00118V@\u0016XÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"com/sinch/verification/core/verification/model/VerificationData.$serializer", "Ln0/c/k/v;", "Lcom/sinch/verification/core/verification/model/VerificationData;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "Lm0/i;", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/sinch/verification/core/verification/model/VerificationData;)V", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/sinch/verification/core/verification/model/VerificationData;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "<init>", "()V", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
/* compiled from: VerificationData.kt */
public final class VerificationData$$serializer implements v<VerificationData> {
    private static final /* synthetic */ SerialDescriptor $$serialDesc;
    public static final VerificationData$$serializer INSTANCE;

    static {
        VerificationData$$serializer verificationData$$serializer = new VerificationData$$serializer();
        INSTANCE = verificationData$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.sinch.verification.core.verification.model.VerificationData", verificationData$$serializer, 5);
        pluginGeneratedSerialDescriptor.i("method", false);
        pluginGeneratedSerialDescriptor.i(Stripe3ds2AuthParams.FIELD_SOURCE, true);
        pluginGeneratedSerialDescriptor.i("sms", true);
        pluginGeneratedSerialDescriptor.i("flashcall", true);
        pluginGeneratedSerialDescriptor.i("callout", true);
        $$serialDesc = pluginGeneratedSerialDescriptor;
    }

    private VerificationData$$serializer() {
    }

    public KSerializer<?>[] childSerializers() {
        return new KSerializer[]{VerificationMethodType.Companion, VerificationSourceType$$serializer.INSTANCE, a.R1(SmsVerificationDetails$$serializer.INSTANCE), a.R1(FlashCallVerificationDetails$$serializer.INSTANCE), a.R1(CalloutVerificationDetails$$serializer.INSTANCE)};
    }

    public VerificationData deserialize(Decoder decoder) {
        CalloutVerificationDetails calloutVerificationDetails;
        FlashCallVerificationDetails flashCallVerificationDetails;
        SmsVerificationDetails smsVerificationDetails;
        VerificationSourceType verificationSourceType;
        VerificationMethodType verificationMethodType;
        int i;
        Decoder decoder2 = decoder;
        i.e(decoder2, "decoder");
        SerialDescriptor serialDescriptor = $$serialDesc;
        c c = decoder2.c(serialDescriptor);
        VerificationMethodType verificationMethodType2 = null;
        if (!c.y()) {
            int i2 = 0;
            VerificationSourceType verificationSourceType2 = null;
            SmsVerificationDetails smsVerificationDetails2 = null;
            FlashCallVerificationDetails flashCallVerificationDetails2 = null;
            CalloutVerificationDetails calloutVerificationDetails2 = null;
            while (true) {
                int x = c.x(serialDescriptor);
                if (x == -1) {
                    i = i2;
                    verificationMethodType = verificationMethodType2;
                    verificationSourceType = verificationSourceType2;
                    smsVerificationDetails = smsVerificationDetails2;
                    flashCallVerificationDetails = flashCallVerificationDetails2;
                    calloutVerificationDetails = calloutVerificationDetails2;
                    break;
                } else if (x == 0) {
                    verificationMethodType2 = (VerificationMethodType) c.m(serialDescriptor, 0, VerificationMethodType.Companion, verificationMethodType2);
                    i2 |= 1;
                } else if (x == 1) {
                    verificationSourceType2 = (VerificationSourceType) c.m(serialDescriptor, 1, VerificationSourceType$$serializer.INSTANCE, verificationSourceType2);
                    i2 |= 2;
                } else if (x == 2) {
                    smsVerificationDetails2 = (SmsVerificationDetails) c.v(serialDescriptor, 2, SmsVerificationDetails$$serializer.INSTANCE, smsVerificationDetails2);
                    i2 |= 4;
                } else if (x == 3) {
                    flashCallVerificationDetails2 = (FlashCallVerificationDetails) c.v(serialDescriptor, 3, FlashCallVerificationDetails$$serializer.INSTANCE, flashCallVerificationDetails2);
                    i2 |= 8;
                } else if (x == 4) {
                    calloutVerificationDetails2 = (CalloutVerificationDetails) c.v(serialDescriptor, 4, CalloutVerificationDetails$$serializer.INSTANCE, calloutVerificationDetails2);
                    i2 |= 16;
                } else {
                    throw new UnknownFieldException(x);
                }
            }
        } else {
            verificationMethodType = (VerificationMethodType) c.m(serialDescriptor, 0, VerificationMethodType.Companion, null);
            flashCallVerificationDetails = (FlashCallVerificationDetails) c.v(serialDescriptor, 3, FlashCallVerificationDetails$$serializer.INSTANCE, null);
            verificationSourceType = (VerificationSourceType) c.m(serialDescriptor, 1, VerificationSourceType$$serializer.INSTANCE, null);
            calloutVerificationDetails = (CalloutVerificationDetails) c.v(serialDescriptor, 4, CalloutVerificationDetails$$serializer.INSTANCE, null);
            smsVerificationDetails = (SmsVerificationDetails) c.v(serialDescriptor, 2, SmsVerificationDetails$$serializer.INSTANCE, null);
            i = Integer.MAX_VALUE;
        }
        c.b(serialDescriptor);
        return new VerificationData(i, verificationMethodType, verificationSourceType, smsVerificationDetails, flashCallVerificationDetails, calloutVerificationDetails);
    }

    public SerialDescriptor getDescriptor() {
        return $$serialDesc;
    }

    public void serialize(Encoder encoder, VerificationData verificationData) {
        i.e(encoder, "encoder");
        i.e(verificationData, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        SerialDescriptor serialDescriptor = $$serialDesc;
        d c = encoder.c(serialDescriptor);
        i.e(verificationData, "self");
        i.e(c, "output");
        i.e(serialDescriptor, "serialDesc");
        c.z(serialDescriptor, 0, VerificationMethodType.Companion, verificationData.e);
        if ((!i.a(verificationData.d(), VerificationSourceType.MANUAL)) || c.v(serialDescriptor, 1)) {
            c.z(serialDescriptor, 1, VerificationSourceType$$serializer.INSTANCE, verificationData.d());
        }
        if ((!i.a(verificationData.c(), (Object) null)) || c.v(serialDescriptor, 2)) {
            c.l(serialDescriptor, 2, SmsVerificationDetails$$serializer.INSTANCE, verificationData.c());
        }
        if ((!i.a(verificationData.b(), (Object) null)) || c.v(serialDescriptor, 3)) {
            c.l(serialDescriptor, 3, FlashCallVerificationDetails$$serializer.INSTANCE, verificationData.b());
        }
        if ((!i.a(verificationData.a(), (Object) null)) || c.v(serialDescriptor, 4)) {
            c.l(serialDescriptor, 4, CalloutVerificationDetails$$serializer.INSTANCE, verificationData.a());
        }
        c.b(serialDescriptor);
    }

    public KSerializer<?>[] typeParametersSerializers() {
        return v0.a;
    }
}
