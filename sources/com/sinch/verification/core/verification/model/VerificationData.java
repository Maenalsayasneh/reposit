package com.sinch.verification.core.verification.model;

import com.sinch.verification.core.internal.VerificationMethodType;
import com.sinch.verification.core.verification.model.callout.CalloutVerificationDetails;
import com.sinch.verification.core.verification.model.flashcall.FlashCallVerificationDetails;
import com.sinch.verification.core.verification.model.sms.SmsVerificationDetails;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0006\b\u0017\u0018\u0000 (2\u00020\u0001:\u0002)(B\u000f\u0012\u0006\u0010\u001c\u001a\u00020\u0016¢\u0006\u0004\b\"\u0010#BW\b\u0017\u0012\u0006\u0010%\u001a\u00020$\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0001\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0010\u001a\u0004\u0018\u00010\n\u0012\n\b\u0001\u0010!\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010\u0015\u001a\u0004\u0018\u00010\u0011\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\"\u0010'R\"\u0010\t\u001a\u00020\u00028\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u0012\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u0010\u001a\u0004\u0018\u00010\n8\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u0012\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000eR$\u0010\u0015\u001a\u0004\u0018\u00010\u00118\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b\u0005\u0010\u0012\u0012\u0004\b\u0014\u0010\b\u001a\u0004\b\u0003\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00168\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\b\u001a\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u0004\u0018\u00010\u001d8\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u001e\u0012\u0004\b \u0010\b\u001a\u0004\b\u000b\u0010\u001f¨\u0006*"}, d2 = {"Lcom/sinch/verification/core/verification/model/VerificationData;", "", "Lcom/sinch/verification/core/verification/model/VerificationSourceType;", "a", "Lcom/sinch/verification/core/verification/model/VerificationSourceType;", "d", "()Lcom/sinch/verification/core/verification/model/VerificationSourceType;", "getSource$annotations", "()V", "source", "Lcom/sinch/verification/core/verification/model/sms/SmsVerificationDetails;", "b", "Lcom/sinch/verification/core/verification/model/sms/SmsVerificationDetails;", "c", "()Lcom/sinch/verification/core/verification/model/sms/SmsVerificationDetails;", "getSmsDetails$annotations", "smsDetails", "Lcom/sinch/verification/core/verification/model/callout/CalloutVerificationDetails;", "Lcom/sinch/verification/core/verification/model/callout/CalloutVerificationDetails;", "()Lcom/sinch/verification/core/verification/model/callout/CalloutVerificationDetails;", "getCalloutDetails$annotations", "calloutDetails", "Lcom/sinch/verification/core/internal/VerificationMethodType;", "e", "Lcom/sinch/verification/core/internal/VerificationMethodType;", "getMethod", "()Lcom/sinch/verification/core/internal/VerificationMethodType;", "getMethod$annotations", "method", "Lcom/sinch/verification/core/verification/model/flashcall/FlashCallVerificationDetails;", "Lcom/sinch/verification/core/verification/model/flashcall/FlashCallVerificationDetails;", "()Lcom/sinch/verification/core/verification/model/flashcall/FlashCallVerificationDetails;", "getFlashcallDetails$annotations", "flashcallDetails", "<init>", "(Lcom/sinch/verification/core/internal/VerificationMethodType;)V", "", "seen1", "serializationConstructorMarker", "(ILcom/sinch/verification/core/internal/VerificationMethodType;Lcom/sinch/verification/core/verification/model/VerificationSourceType;Lcom/sinch/verification/core/verification/model/sms/SmsVerificationDetails;Lcom/sinch/verification/core/verification/model/flashcall/FlashCallVerificationDetails;Lcom/sinch/verification/core/verification/model/callout/CalloutVerificationDetails;Ljava/lang/Object;)V", "Companion", "serializer", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: VerificationData.kt */
public class VerificationData {
    public static final Companion Companion = new Companion((f) null);
    public final VerificationSourceType a;
    public final SmsVerificationDetails b;
    public final FlashCallVerificationDetails c;
    public final CalloutVerificationDetails d;
    public final VerificationMethodType e;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/verification/core/verification/model/VerificationData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/verification/core/verification/model/VerificationData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: VerificationData.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<VerificationData> serializer() {
            return VerificationData$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public VerificationData(VerificationMethodType verificationMethodType) {
        i.e(verificationMethodType, "method");
        this.e = verificationMethodType;
        this.a = VerificationSourceType.MANUAL;
    }

    public CalloutVerificationDetails a() {
        return this.d;
    }

    public FlashCallVerificationDetails b() {
        return this.c;
    }

    public SmsVerificationDetails c() {
        return this.b;
    }

    public VerificationSourceType d() {
        return this.a;
    }

    public /* synthetic */ VerificationData(int i, VerificationMethodType verificationMethodType, VerificationSourceType verificationSourceType, SmsVerificationDetails smsVerificationDetails, FlashCallVerificationDetails flashCallVerificationDetails, CalloutVerificationDetails calloutVerificationDetails) {
        if (1 == (i & 1)) {
            this.e = verificationMethodType;
            if ((i & 2) != 0) {
                this.a = verificationSourceType;
            } else {
                this.a = VerificationSourceType.MANUAL;
            }
            if ((i & 4) != 0) {
                this.b = smsVerificationDetails;
            } else {
                this.b = null;
            }
            if ((i & 8) != 0) {
                this.c = flashCallVerificationDetails;
            } else {
                this.c = null;
            }
            if ((i & 16) != 0) {
                this.d = calloutVerificationDetails;
            } else {
                this.d = null;
            }
        } else {
            a.W3(i, 1, VerificationData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
