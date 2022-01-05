package com.sinch.verification.core.initiation;

import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\b\u0018\u0000 \u001d2\u00020\u0001:\u0002\u001e\u001dB3\b\u0017\u0012\u0006\u0010\u0019\u001a\u00020\u0005\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u0013\u001a\u00020\f8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\r\u0010\u000e\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0018\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0017\u0010\u0012\u001a\u0004\b\u0016\u0010\u0004¨\u0006\u001f"}, d2 = {"Lcom/sinch/verification/core/initiation/VerificationIdentity;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/sinch/verification/core/initiation/VerificationIdentityType;", "b", "Lcom/sinch/verification/core/initiation/VerificationIdentityType;", "getType", "()Lcom/sinch/verification/core/initiation/VerificationIdentityType;", "getType$annotations", "()V", "type", "a", "Ljava/lang/String;", "getEndpoint", "getEndpoint$annotations", "endpoint", "seen1", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/sinch/verification/core/initiation/VerificationIdentityType;Ljava/lang/Object;)V", "Companion", "serializer", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: VerificationIdentity.kt */
public final class VerificationIdentity {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final VerificationIdentityType b;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/verification/core/initiation/VerificationIdentity$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/verification/core/initiation/VerificationIdentity;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: VerificationIdentity.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<VerificationIdentity> serializer() {
            return VerificationIdentity$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public /* synthetic */ VerificationIdentity(int i, String str, VerificationIdentityType verificationIdentityType) {
        if (1 == (i & 1)) {
            this.a = str;
            if ((i & 2) != 0) {
                this.b = verificationIdentityType;
            } else {
                this.b = VerificationIdentityType.NUMBER;
            }
        } else {
            a.W3(i, 1, VerificationIdentity$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationIdentity)) {
            return false;
        }
        VerificationIdentity verificationIdentity = (VerificationIdentity) obj;
        return i.a(this.a, verificationIdentity.a) && i.a(this.b, verificationIdentity.b);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        VerificationIdentityType verificationIdentityType = this.b;
        if (verificationIdentityType != null) {
            i = verificationIdentityType.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("VerificationIdentity(endpoint=");
        P0.append(this.a);
        P0.append(", type=");
        P0.append(this.b);
        P0.append(")");
        return P0.toString();
    }

    public VerificationIdentity(String str, VerificationIdentityType verificationIdentityType, int i) {
        VerificationIdentityType verificationIdentityType2 = (i & 2) != 0 ? VerificationIdentityType.NUMBER : null;
        i.e(str, "endpoint");
        i.e(verificationIdentityType2, "type");
        this.a = str;
        this.b = verificationIdentityType2;
    }
}
