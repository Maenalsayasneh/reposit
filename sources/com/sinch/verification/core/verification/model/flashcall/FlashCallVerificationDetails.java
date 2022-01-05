package com.sinch.verification.core.verification.model.flashcall;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\b\u0018\u0000 \u00172\u00020\u0001:\u0002\u0018\u0017B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013B'\b\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u0012\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0011\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u0004¨\u0006\u0019"}, d2 = {"Lcom/sinch/verification/core/verification/model/flashcall/FlashCallVerificationDetails;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getCli", "getCli$annotations", "()V", "cli", "<init>", "(Ljava/lang/String;)V", "seen1", "serializationConstructorMarker", "(ILjava/lang/String;Ljava/lang/Object;)V", "Companion", "serializer", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: FlashCallVerificationDetails.kt */
public final class FlashCallVerificationDetails {
    public static final Companion Companion = new Companion((f) null);
    public final String a;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/verification/core/verification/model/flashcall/FlashCallVerificationDetails$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/verification/core/verification/model/flashcall/FlashCallVerificationDetails;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FlashCallVerificationDetails.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FlashCallVerificationDetails> serializer() {
            return FlashCallVerificationDetails$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public /* synthetic */ FlashCallVerificationDetails(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            a.W3(i, 1, FlashCallVerificationDetails$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public FlashCallVerificationDetails(String str) {
        i.e(str, "cli");
        this.a = str;
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            return (obj instanceof FlashCallVerificationDetails) && i.a(this.a, ((FlashCallVerificationDetails) obj).a);
        }
        return true;
    }

    public int hashCode() {
        String str = this.a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public String toString() {
        return i0.d.a.a.a.y0(i0.d.a.a.a.P0("FlashCallVerificationDetails(cli="), this.a, ")");
    }
}
