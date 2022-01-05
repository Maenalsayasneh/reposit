package com.sinch.verification.flashcall.initialization;

import com.sinch.metadata.model.PhoneMetadata;
import com.sinch.verification.core.initiation.VerificationIdentity;
import com.sinch.verification.core.internal.VerificationMethodType;
import i0.d.a.a.a;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import m0.n.b.f;
import m0.n.b.i;
import n0.c.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\b\b\u0018\u0000 62\u00020\u0001:\u000276B5\u0012\u0006\u0010&\u001a\u00020 \u0012\u0006\u0010,\u001a\u00020\t\u0012\b\u00100\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b1\u00102Ba\b\u0017\u0012\u0006\u00103\u001a\u00020\u0005\u0012\n\b\u0001\u0010&\u001a\u0004\u0018\u00010 \u0012\b\b\u0001\u0010,\u001a\u00020\t\u0012\n\b\u0001\u00100\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0018\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0001\u0010\u001f\u001a\u0004\u0018\u00010\u0019\u0012\b\u00104\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b1\u00105J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\n\u0010\u000bR$\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b\f\u0010\r\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000e\u0010\u0004R$\u0010\u0018\u001a\u0004\u0018\u00010\u00128\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u0012\u0004\b\u0017\u0010\u0010\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u001f\u001a\u00020\u00198\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001c\u0010\u001dR\"\u0010&\u001a\u00020 8\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b!\u0010\"\u0012\u0004\b%\u0010\u0010\u001a\u0004\b#\u0010$R\"\u0010,\u001a\u00020\t8\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b'\u0010(\u0012\u0004\b+\u0010\u0010\u001a\u0004\b)\u0010*R$\u00100\u001a\u0004\u0018\u00010\u00028\u0016@\u0017X\u0004¢\u0006\u0012\n\u0004\b-\u0010\r\u0012\u0004\b/\u0010\u0010\u001a\u0004\b.\u0010\u0004¨\u00068"}, d2 = {"Lcom/sinch/verification/flashcall/initialization/FlashCallVerificationInitializationData;", "", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "e", "Ljava/lang/String;", "getReference", "getReference$annotations", "()V", "reference", "Lcom/sinch/metadata/model/PhoneMetadata;", "f", "Lcom/sinch/metadata/model/PhoneMetadata;", "getMetadata", "()Lcom/sinch/metadata/model/PhoneMetadata;", "getMetadata$annotations", "metadata", "Lcom/sinch/verification/core/internal/VerificationMethodType;", "a", "Lcom/sinch/verification/core/internal/VerificationMethodType;", "getMethod", "()Lcom/sinch/verification/core/internal/VerificationMethodType;", "getMethod$annotations", "method", "Lcom/sinch/verification/core/initiation/VerificationIdentity;", "b", "Lcom/sinch/verification/core/initiation/VerificationIdentity;", "getIdentity", "()Lcom/sinch/verification/core/initiation/VerificationIdentity;", "getIdentity$annotations", "identity", "c", "Z", "getHonourEarlyReject", "()Z", "getHonourEarlyReject$annotations", "honourEarlyReject", "d", "getCustom", "getCustom$annotations", "custom", "<init>", "(Lcom/sinch/verification/core/initiation/VerificationIdentity;ZLjava/lang/String;Ljava/lang/String;Lcom/sinch/metadata/model/PhoneMetadata;)V", "seen1", "serializationConstructorMarker", "(ILcom/sinch/verification/core/initiation/VerificationIdentity;ZLjava/lang/String;Ljava/lang/String;Lcom/sinch/metadata/model/PhoneMetadata;Lcom/sinch/verification/core/internal/VerificationMethodType;Ljava/lang/Object;)V", "Companion", "serializer", "verification-flashcall_productionRelease"}, k = 1, mv = {1, 4, 2})
@e
/* compiled from: FlashCallVerificationInitializationData.kt */
public final class FlashCallVerificationInitializationData {
    public static final Companion Companion = new Companion((f) null);
    public final VerificationMethodType a;
    public final VerificationIdentity b;
    public final boolean c;
    public final String d;
    public final String e;
    public final PhoneMetadata f;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/sinch/verification/flashcall/initialization/FlashCallVerificationInitializationData$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/sinch/verification/flashcall/initialization/FlashCallVerificationInitializationData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "<init>", "()V", "verification-flashcall_productionRelease"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FlashCallVerificationInitializationData.kt */
    public static final class Companion {
        public Companion() {
        }

        public final KSerializer<FlashCallVerificationInitializationData> serializer() {
            return FlashCallVerificationInitializationData$$serializer.INSTANCE;
        }

        public Companion(f fVar) {
        }
    }

    public FlashCallVerificationInitializationData(VerificationIdentity verificationIdentity, boolean z, String str, String str2, PhoneMetadata phoneMetadata) {
        i.e(verificationIdentity, "identity");
        this.b = verificationIdentity;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = phoneMetadata;
        this.a = VerificationMethodType.FLASHCALL;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FlashCallVerificationInitializationData)) {
            return false;
        }
        FlashCallVerificationInitializationData flashCallVerificationInitializationData = (FlashCallVerificationInitializationData) obj;
        return i.a(this.b, flashCallVerificationInitializationData.b) && this.c == flashCallVerificationInitializationData.c && i.a(this.d, flashCallVerificationInitializationData.d) && i.a(this.e, flashCallVerificationInitializationData.e) && i.a(this.f, flashCallVerificationInitializationData.f);
    }

    public int hashCode() {
        VerificationIdentity verificationIdentity = this.b;
        int i = 0;
        int hashCode = (verificationIdentity != null ? verificationIdentity.hashCode() : 0) * 31;
        boolean z = this.c;
        if (z) {
            z = true;
        }
        int i2 = (hashCode + (z ? 1 : 0)) * 31;
        String str = this.d;
        int hashCode2 = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.e;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        PhoneMetadata phoneMetadata = this.f;
        if (phoneMetadata != null) {
            i = phoneMetadata.hashCode();
        }
        return hashCode3 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("FlashCallVerificationInitializationData(identity=");
        P0.append(this.b);
        P0.append(", honourEarlyReject=");
        P0.append(this.c);
        P0.append(", custom=");
        P0.append(this.d);
        P0.append(", reference=");
        P0.append(this.e);
        P0.append(", metadata=");
        P0.append(this.f);
        P0.append(")");
        return P0.toString();
    }

    public /* synthetic */ FlashCallVerificationInitializationData(int i, VerificationIdentity verificationIdentity, boolean z, String str, String str2, PhoneMetadata phoneMetadata, VerificationMethodType verificationMethodType) {
        if (31 == (i & 31)) {
            this.b = verificationIdentity;
            this.c = z;
            this.d = str;
            this.e = str2;
            this.f = phoneMetadata;
            if ((i & 32) != 0) {
                this.a = verificationMethodType;
            } else {
                this.a = VerificationMethodType.FLASHCALL;
            }
        } else {
            m0.r.t.a.r.m.a1.a.W3(i, 31, FlashCallVerificationInitializationData$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
    }
}
