package com.sinch.verification.flashcall.report;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.r.t.a.r.m.a1.a;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\b\u0018\u0000 \u001a2\u00020\u0001:\u0002\u001b\u001aB\u0017\u0012\u0006\u0010\u0013\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016B/\b\u0017\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0013\u001a\u00020\t\u0012\b\b\u0001\u0010\u000e\u001a\u00020\t\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0015\u0010\u0019J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u00020\t8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\"\u0010\u0013\u001a\u00020\t8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u0012\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001c"}, d2 = {"Lcom/sinch/verification/flashcall/report/FlashCallReportDetails;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Z", "isNoCall", "()Z", "isNoCall$annotations", "()V", "a", "isLateCall", "isLateCall$annotations", "<init>", "(ZZ)V", "seen1", "serializationConstructorMarker", "(IZZLjava/lang/Object;)V", "Companion", "serializer", "verification-flashcall_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: FlashCallReportDetails.kt */
public final class FlashCallReportDetails {
    public static final Companion Companion = new Companion((f) null);
    public final boolean a;
    public final boolean b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/verification/flashcall/report/FlashCallReportDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/verification/flashcall/report/FlashCallReportDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "verification-flashcall_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FlashCallReportDetails.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FlashCallReportDetails> serializer() {
            return FlashCallReportDetails$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public /* synthetic */ FlashCallReportDetails(int i, boolean z, boolean z2) {
        if (3 == (i & 3)) {
            this.a = z;
            this.b = z2;
            return;
        }
        a.W3(i, 3, FlashCallReportDetails$$serializer.INSTANCE.getDescriptor());
        throw null;
    }

    public FlashCallReportDetails(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashCallReportDetails)) {
            return false;
        }
        FlashCallReportDetails flashCallReportDetails = (FlashCallReportDetails) obj;
        return this.a == flashCallReportDetails.a && this.b == flashCallReportDetails.b;
    }

    public int hashCode() {
        boolean z = this.a;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i = (z ? 1 : 0) * true;
        boolean z3 = this.b;
        if (!z3) {
            z2 = z3;
        }
        return i + (z2 ? 1 : 0);
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FlashCallReportDetails(isLateCall=");
        P0.append(this.a);
        P0.append(", isNoCall=");
        return i0.d.a.a.a.D0(P0, this.b, ")");
    }
}
