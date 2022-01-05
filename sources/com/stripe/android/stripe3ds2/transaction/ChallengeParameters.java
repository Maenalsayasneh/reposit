package com.stripe.android.stripe3ds2.transaction;

import androidx.annotation.Keep;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b \u0010!J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J@\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R$\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0004\"\u0004\b\u0018\u0010\u0019R$\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001a\u0010\u0004\"\u0004\b\u001b\u0010\u0019R$\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u001c\u0010\u0004\"\u0004\b\u001d\u0010\u0019R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001e\u0010\u0004\"\u0004\b\u001f\u0010\u0019¨\u0006\""}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;", "", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "threeDsServerTransactionId", "acsTransactionId", "acsRefNumber", "acsSignedContent", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/ChallengeParameters;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getAcsRefNumber", "setAcsRefNumber", "(Ljava/lang/String;)V", "getAcsTransactionId", "setAcsTransactionId", "getAcsSignedContent", "setAcsSignedContent", "getThreeDsServerTransactionId", "setThreeDsServerTransactionId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
@Keep
/* compiled from: ChallengeParameters.kt */
public final class ChallengeParameters {
    private String acsRefNumber;
    private String acsSignedContent;
    private String acsTransactionId;
    private String threeDsServerTransactionId;

    public ChallengeParameters() {
        this((String) null, (String) null, (String) null, (String) null, 15, (f) null);
    }

    public ChallengeParameters(String str, String str2, String str3, String str4) {
        this.threeDsServerTransactionId = str;
        this.acsTransactionId = str2;
        this.acsRefNumber = str3;
        this.acsSignedContent = str4;
    }

    public static /* synthetic */ ChallengeParameters copy$default(ChallengeParameters challengeParameters, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = challengeParameters.threeDsServerTransactionId;
        }
        if ((i & 2) != 0) {
            str2 = challengeParameters.acsTransactionId;
        }
        if ((i & 4) != 0) {
            str3 = challengeParameters.acsRefNumber;
        }
        if ((i & 8) != 0) {
            str4 = challengeParameters.acsSignedContent;
        }
        return challengeParameters.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.threeDsServerTransactionId;
    }

    public final String component2() {
        return this.acsTransactionId;
    }

    public final String component3() {
        return this.acsRefNumber;
    }

    public final String component4() {
        return this.acsSignedContent;
    }

    public final ChallengeParameters copy(String str, String str2, String str3, String str4) {
        return new ChallengeParameters(str, str2, str3, str4);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeParameters)) {
            return false;
        }
        ChallengeParameters challengeParameters = (ChallengeParameters) obj;
        return i.a(this.threeDsServerTransactionId, challengeParameters.threeDsServerTransactionId) && i.a(this.acsTransactionId, challengeParameters.acsTransactionId) && i.a(this.acsRefNumber, challengeParameters.acsRefNumber) && i.a(this.acsSignedContent, challengeParameters.acsSignedContent);
    }

    public final String getAcsRefNumber() {
        return this.acsRefNumber;
    }

    public final String getAcsSignedContent() {
        return this.acsSignedContent;
    }

    public final String getAcsTransactionId() {
        return this.acsTransactionId;
    }

    public final String getThreeDsServerTransactionId() {
        return this.threeDsServerTransactionId;
    }

    public int hashCode() {
        String str = this.threeDsServerTransactionId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.acsTransactionId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.acsRefNumber;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.acsSignedContent;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final void setAcsRefNumber(String str) {
        this.acsRefNumber = str;
    }

    public final void setAcsSignedContent(String str) {
        this.acsSignedContent = str;
    }

    public final void setAcsTransactionId(String str) {
        this.acsTransactionId = str;
    }

    public final void setThreeDsServerTransactionId(String str) {
        this.threeDsServerTransactionId = str;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ChallengeParameters(threeDsServerTransactionId=");
        P0.append(this.threeDsServerTransactionId);
        P0.append(", acsTransactionId=");
        P0.append(this.acsTransactionId);
        P0.append(", acsRefNumber=");
        P0.append(this.acsRefNumber);
        P0.append(", acsSignedContent=");
        return a.y0(P0, this.acsSignedContent, ")");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeParameters(String str, String str2, String str3, String str4, int i, f fVar) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }
}
