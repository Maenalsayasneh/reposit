package com.sinch.verification.core.verification.response;

import com.sinch.verification.core.internal.VerificationMethodType;
import com.sinch.verification.core.internal.VerificationStatus;
import com.sinch.verification.core.verification.model.VerificationSourceType;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\b\b\u0018\u0000 32\u00020\u0001:\u000243Bc\b\u0017\u0012\u0006\u0010/\u001a\u00020\u0005\u0012\n\b\u0001\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010*\u001a\u0004\u0018\u00010$\u0012\n\b\u0001\u0010#\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0001\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u00100\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b1\u00102J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u0004R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u0019\u0010\r\u0012\u0004\b\u001b\u0010\u0010\u001a\u0004\b\u001a\u0010\u0004R\"\u0010#\u001a\u00020\u001d8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b\u001e\u0010\u001f\u0012\u0004\b\"\u0010\u0010\u001a\u0004\b \u0010!R\"\u0010*\u001a\u00020$8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b%\u0010&\u0012\u0004\b)\u0010\u0010\u001a\u0004\b'\u0010(R\"\u0010.\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b+\u0010\r\u0012\u0004\b-\u0010\u0010\u001a\u0004\b,\u0010\u0004¨\u00065"}, d2 = {"Lcom/sinch/verification/core/verification/response/VerificationResponseData;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "f", "Ljava/lang/String;", "getReference", "getReference$annotations", "()V", "reference", "Lcom/sinch/verification/core/verification/model/VerificationSourceType;", "b", "Lcom/sinch/verification/core/verification/model/VerificationSourceType;", "getSource", "()Lcom/sinch/verification/core/verification/model/VerificationSourceType;", "getSource$annotations", "source", "e", "getErrorReason", "getErrorReason$annotations", "errorReason", "Lcom/sinch/verification/core/internal/VerificationMethodType;", "d", "Lcom/sinch/verification/core/internal/VerificationMethodType;", "getMethod", "()Lcom/sinch/verification/core/internal/VerificationMethodType;", "getMethod$annotations", "method", "Lcom/sinch/verification/core/internal/VerificationStatus;", "c", "Lcom/sinch/verification/core/internal/VerificationStatus;", "getStatus", "()Lcom/sinch/verification/core/internal/VerificationStatus;", "getStatus$annotations", "status", "a", "getId", "getId$annotations", "id", "seen1", "serializationConstructorMarker", "<init>", "(ILjava/lang/String;Lcom/sinch/verification/core/verification/model/VerificationSourceType;Lcom/sinch/verification/core/internal/VerificationStatus;Lcom/sinch/verification/core/internal/VerificationMethodType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)V", "Companion", "serializer", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: VerificationResponseData.kt */
public final class VerificationResponseData {
    public static final Companion Companion = new Companion((f) null);
    public final String a;
    public final VerificationSourceType b;
    public final VerificationStatus c;
    public final VerificationMethodType d;
    public final String e;
    public final String f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/verification/core/verification/response/VerificationResponseData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/verification/core/verification/response/VerificationResponseData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "verification-core_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: VerificationResponseData.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<VerificationResponseData> serializer() {
            return VerificationResponseData$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public /* synthetic */ VerificationResponseData(int i, String str, VerificationSourceType verificationSourceType, VerificationStatus verificationStatus, VerificationMethodType verificationMethodType, String str2, String str3) {
        if (13 == (i & 13)) {
            this.a = str;
            if ((i & 2) != 0) {
                this.b = verificationSourceType;
            } else {
                this.b = null;
            }
            this.c = verificationStatus;
            this.d = verificationMethodType;
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
            a.W3(i, 13, VerificationResponseData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationResponseData)) {
            return false;
        }
        VerificationResponseData verificationResponseData = (VerificationResponseData) obj;
        return i.a(this.a, verificationResponseData.a) && i.a(this.b, verificationResponseData.b) && i.a(this.c, verificationResponseData.c) && i.a(this.d, verificationResponseData.d) && i.a(this.e, verificationResponseData.e) && i.a(this.f, verificationResponseData.f);
    }

    public int hashCode() {
        String str = this.a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        VerificationSourceType verificationSourceType = this.b;
        int hashCode2 = (hashCode + (verificationSourceType != null ? verificationSourceType.hashCode() : 0)) * 31;
        VerificationStatus verificationStatus = this.c;
        int hashCode3 = (hashCode2 + (verificationStatus != null ? verificationStatus.hashCode() : 0)) * 31;
        VerificationMethodType verificationMethodType = this.d;
        int hashCode4 = (hashCode3 + (verificationMethodType != null ? verificationMethodType.hashCode() : 0)) * 31;
        String str2 = this.e;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder P0 = i0.d.a.a.a.P0("VerificationResponseData(id=");
        P0.append(this.a);
        P0.append(", source=");
        P0.append(this.b);
        P0.append(", status=");
        P0.append(this.c);
        P0.append(", method=");
        P0.append(this.d);
        P0.append(", errorReason=");
        P0.append(this.e);
        P0.append(", reference=");
        return i0.d.a.a.a.y0(P0, this.f, ")");
    }
}
