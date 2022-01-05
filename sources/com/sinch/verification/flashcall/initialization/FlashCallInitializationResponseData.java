package com.sinch.verification.flashcall.initialization;

import com.sinch.verification.core.internal.VerificationMethodType;
import i0.n.c.a.d.a.c;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\b\u0018\u0000 \u001e2\u00020\u0001:\u0002\u001f\u001eB3\b\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0014\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u000b\u0010\fR\"\u0010\u0014\u001a\u00020\r8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0010\u0010\u0011R\"\u0010\u0019\u001a\u00020\u00028\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0017\u0010\u0004¨\u0006 "}, d2 = {"Lcom/sinch/verification/flashcall/initialization/FlashCallInitializationResponseData;", "Li0/n/c/a/d/a/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sinch/verification/flashcall/initialization/FlashCallInitializationDetails;", "b", "Lcom/sinch/verification/flashcall/initialization/FlashCallInitializationDetails;", "getDetails", "()Lcom/sinch/verification/flashcall/initialization/FlashCallInitializationDetails;", "getDetails$annotations", "()V", "details", "a", "Ljava/lang/String;", "getId", "getId$annotations", "id", "seen1", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/sinch/verification/flashcall/initialization/FlashCallInitializationDetails;Ljava/lang/Object;)V", "Companion", "serializer", "verification-flashcall_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: FlashCallInitializationResponseData.kt */
public final class FlashCallInitializationResponseData implements c {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final FlashCallInitializationDetails b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/verification/flashcall/initialization/FlashCallInitializationResponseData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/verification/flashcall/initialization/FlashCallInitializationResponseData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "verification-flashcall_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FlashCallInitializationResponseData.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FlashCallInitializationResponseData> serializer() {
            return FlashCallInitializationResponseData$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public /* synthetic */ FlashCallInitializationResponseData(int i, String str, FlashCallInitializationDetails flashCallInitializationDetails) {
        if (3 == (i & 3)) {
            this.a = str;
            this.b = flashCallInitializationDetails;
            VerificationMethodType verificationMethodType = VerificationMethodType.FLASHCALL;
            return;
        }
        a.W3(i, 3, FlashCallInitializationResponseData$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashCallInitializationResponseData)) {
            return false;
        }
        FlashCallInitializationResponseData flashCallInitializationResponseData = (FlashCallInitializationResponseData) obj;
        return i.a(this.a, flashCallInitializationResponseData.a) && i.a(this.b, flashCallInitializationResponseData.b);
    }

    public String getId() {
        return this.a;
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        FlashCallInitializationDetails flashCallInitializationDetails = this.b;
        if (flashCallInitializationDetails != null) {
            i = flashCallInitializationDetails.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FlashCallInitializationResponseData(id=");
        P0.append(this.a);
        P0.append(", details=");
        P0.append(this.b);
        P0.append(")");
        return P0.toString();
    }
}
