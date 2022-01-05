package com.sinch.verification.flashcall.report;

import com.sinch.verification.core.internal.VerificationMethodType;
import i0.d.a.a.a;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u0000  2\u00020\u0001:\u0002! B\u000f\u0012\u0006\u0010\u001a\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cB3\b\u0017\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u001a\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010\u001fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u001a\u001a\u00020\u00148\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u0012\u0004\b\u0019\u0010\u0012\u001a\u0004\b\u0017\u0010\u0018¨\u0006\""}, d2 = {"Lcom/sinch/verification/flashcall/report/FlashCallReportData;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sinch/verification/core/internal/VerificationMethodType;", "a", "Lcom/sinch/verification/core/internal/VerificationMethodType;", "getMethod", "()Lcom/sinch/verification/core/internal/VerificationMethodType;", "getMethod$annotations", "()V", "method", "Lcom/sinch/verification/flashcall/report/FlashCallReportDetails;", "b", "Lcom/sinch/verification/flashcall/report/FlashCallReportDetails;", "getDetails", "()Lcom/sinch/verification/flashcall/report/FlashCallReportDetails;", "getDetails$annotations", "details", "<init>", "(Lcom/sinch/verification/flashcall/report/FlashCallReportDetails;)V", "seen1", "serializationConstructorMarker", "(ILcom/sinch/verification/flashcall/report/FlashCallReportDetails;Lcom/sinch/verification/core/internal/VerificationMethodType;Ljava/lang/Object;)V", "Companion", "serializer", "verification-flashcall_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: FlashCallReportData.kt */
public final class FlashCallReportData {
    public static final Companion Companion = new Companion((f) null);
    public final VerificationMethodType a;
    public final FlashCallReportDetails b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/verification/flashcall/report/FlashCallReportData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/verification/flashcall/report/FlashCallReportData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "verification-flashcall_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FlashCallReportData.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FlashCallReportData> serializer() {
            return FlashCallReportData$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public FlashCallReportData(FlashCallReportDetails flashCallReportDetails) {
        i.e(flashCallReportDetails, "details");
        this.b = flashCallReportDetails;
        this.a = VerificationMethodType.FLASHCALL;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FlashCallReportData) && i.a(this.b, ((FlashCallReportData) obj).b);
        }
        return true;
    }

    public int hashCode() {
        FlashCallReportDetails flashCallReportDetails = this.b;
        if (flashCallReportDetails != null) {
            return flashCallReportDetails.hashCode();
        }
        return 0;
    }

    public String toString() {
        StringBuilder P0 = a.P0("FlashCallReportData(details=");
        P0.append(this.b);
        P0.append(")");
        return P0.toString();
    }

    public /* synthetic */ FlashCallReportData(int i, FlashCallReportDetails flashCallReportDetails, VerificationMethodType verificationMethodType) {
        if (1 == (i & 1)) {
            this.b = flashCallReportDetails;
            if ((i & 2) != 0) {
                this.a = verificationMethodType;
            } else {
                this.a = VerificationMethodType.FLASHCALL;
            }
        } else {
            m0.r.t.a.r.m.a1.a.W3(i, 1, FlashCallReportData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
