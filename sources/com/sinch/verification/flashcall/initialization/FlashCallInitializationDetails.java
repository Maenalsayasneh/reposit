package com.sinch.verification.flashcall.initialization;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u001f\b\b\u0018\u0000 /2\u00020\u0001:\u00020/Bc\b\u0017\u0012\u0006\u0010+\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\"\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010,\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u0004R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\r\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001a\u0010\u0004R\u0013\u0010\u001e\u001a\u00020\u00128F@\u0006¢\u0006\u0006\u001a\u0004\b\f\u0010\u001dR$\u0010\"\u001a\u0004\u0018\u00010\u00128\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u001f\u0010\u0014\u0012\u0004\b!\u0010\u0010\u001a\u0004\b \u0010\u0016R$\u0010&\u001a\u0004\u0018\u00010\u00028\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b#\u0010\r\u0012\u0004\b%\u0010\u0010\u001a\u0004\b$\u0010\u0004R$\u0010*\u001a\u0004\u0018\u00010\u00128\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b'\u0010\u0014\u0012\u0004\b)\u0010\u0010\u001a\u0004\b(\u0010\u0016¨\u00061"}, d2 = {"Lcom/sinch/verification/flashcall/initialization/FlashCallInitializationDetails;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCliFilter", "getCliFilter$annotations", "()V", "cliFilter", "", "b", "Ljava/lang/Long;", "getInterceptionTimeoutApi", "()Ljava/lang/Long;", "getInterceptionTimeoutApi$annotations", "interceptionTimeoutApi", "e", "getCli", "getCli$annotations", "cli", "()J", "interceptionTimeout", "c", "getReportTimeoutApi", "getReportTimeoutApi$annotations", "reportTimeoutApi", "f", "getSubVerificationId", "getSubVerificationId$annotations", "subVerificationId", "d", "getDenyCallAfter", "getDenyCallAfter$annotations", "denyCallAfter", "seen1", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Companion", "serializer", "verification-flashcall_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: FlashCallInitializationDetails.kt */
public final class FlashCallInitializationDetails {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final Long b;
    public final Long c;
    public final Long d;
    public final String e;
    public final String f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/sinch/verification/flashcall/initialization/FlashCallInitializationDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/verification/flashcall/initialization/FlashCallInitializationDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "DEFAULT_INTERCEPTION_TIMEOUT", "J", "<init>", "()V", "verification-flashcall_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FlashCallInitializationDetails.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FlashCallInitializationDetails> serializer() {
            return FlashCallInitializationDetails$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public /* synthetic */ FlashCallInitializationDetails(int i, String str, Long l, Long l2, Long l3, String str2, String str3) {
        if (15 == (i & 15)) {
            this.a = str;
            this.b = l;
            this.c = l2;
            this.d = l3;
            if ((i & 16) != 0) {
                this.e = str2;
            } else {
                this.e = null;
            }
            if ((i & 32) != 0) {
                this.f = str3;
            } else {
                this.f = null;
            }
        } else {
            a.W3(i, 15, FlashCallInitializationDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public final long a() {
        Long l = this.b;
        long longValue = l != null ? l.longValue() * ((long) 1000) : 0;
        if (longValue > 0) {
            return longValue;
        }
        return 15000;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashCallInitializationDetails)) {
            return false;
        }
        FlashCallInitializationDetails flashCallInitializationDetails = (FlashCallInitializationDetails) obj;
        return i.a(this.a, flashCallInitializationDetails.a) && i.a(this.b, flashCallInitializationDetails.b) && i.a(this.c, flashCallInitializationDetails.c) && i.a(this.d, flashCallInitializationDetails.d) && i.a(this.e, flashCallInitializationDetails.e) && i.a(this.f, flashCallInitializationDetails.f);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.b;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        Long l2 = this.c;
        int hashCode3 = (hashCode2 + (l2 != null ? l2.hashCode() : 0)) * 31;
        Long l3 = this.d;
        int hashCode4 = (hashCode3 + (l3 != null ? l3.hashCode() : 0)) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("FlashCallInitializationDetails(cliFilter=");
        P0.append(this.a);
        P0.append(", interceptionTimeoutApi=");
        P0.append(this.b);
        P0.append(", reportTimeoutApi=");
        P0.append(this.c);
        P0.append(", denyCallAfter=");
        P0.append(this.d);
        P0.append(", cli=");
        P0.append(this.e);
        P0.append(", subVerificationId=");
        return i0.d.a.a.a.y0(P0, this.f, ")");
    }
}
