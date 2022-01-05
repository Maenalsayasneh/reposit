package com.stripe.android.stripe3ds2.transaction;

import i0.d.a.a.a;
import java.security.interfaces.ECPublicKey;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0017\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0018\u0010\u0007R\u0019\u0010\t\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/AcsData;", "", "", "component1", "()Ljava/lang/String;", "Ljava/security/interfaces/ECPublicKey;", "component2", "()Ljava/security/interfaces/ECPublicKey;", "component3", "acsUrl", "acsEphemPubKey", "sdkEphemPubKey", "copy", "(Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPublicKey;)Lcom/stripe/android/stripe3ds2/transaction/AcsData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/security/interfaces/ECPublicKey;", "getAcsEphemPubKey", "getSdkEphemPubKey", "Ljava/lang/String;", "getAcsUrl", "<init>", "(Ljava/lang/String;Ljava/security/interfaces/ECPublicKey;Ljava/security/interfaces/ECPublicKey;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AcsData.kt */
public final class AcsData {
    private final ECPublicKey acsEphemPubKey;
    private final String acsUrl;
    private final ECPublicKey sdkEphemPubKey;

    public AcsData(String str, ECPublicKey eCPublicKey, ECPublicKey eCPublicKey2) {
        i.e(str, "acsUrl");
        i.e(eCPublicKey, AcsDataParser.FIELD_ACS_EPHEM_PUB_KEY);
        i.e(eCPublicKey2, AcsDataParser.FIELD_SDK_EPHEM_PUB_KEY);
        this.acsUrl = str;
        this.acsEphemPubKey = eCPublicKey;
        this.sdkEphemPubKey = eCPublicKey2;
    }

    public static /* synthetic */ AcsData copy$default(AcsData acsData, String str, ECPublicKey eCPublicKey, ECPublicKey eCPublicKey2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = acsData.acsUrl;
        }
        if ((i & 2) != 0) {
            eCPublicKey = acsData.acsEphemPubKey;
        }
        if ((i & 4) != 0) {
            eCPublicKey2 = acsData.sdkEphemPubKey;
        }
        return acsData.copy(str, eCPublicKey, eCPublicKey2);
    }

    public final String component1() {
        return this.acsUrl;
    }

    public final ECPublicKey component2() {
        return this.acsEphemPubKey;
    }

    public final ECPublicKey component3() {
        return this.sdkEphemPubKey;
    }

    public final AcsData copy(String str, ECPublicKey eCPublicKey, ECPublicKey eCPublicKey2) {
        i.e(str, "acsUrl");
        i.e(eCPublicKey, AcsDataParser.FIELD_ACS_EPHEM_PUB_KEY);
        i.e(eCPublicKey2, AcsDataParser.FIELD_SDK_EPHEM_PUB_KEY);
        return new AcsData(str, eCPublicKey, eCPublicKey2);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AcsData)) {
            return false;
        }
        AcsData acsData = (AcsData) obj;
        return i.a(this.acsUrl, acsData.acsUrl) && i.a(this.acsEphemPubKey, acsData.acsEphemPubKey) && i.a(this.sdkEphemPubKey, acsData.sdkEphemPubKey);
    }

    public final ECPublicKey getAcsEphemPubKey() {
        return this.acsEphemPubKey;
    }

    public final String getAcsUrl() {
        return this.acsUrl;
    }

    public final ECPublicKey getSdkEphemPubKey() {
        return this.sdkEphemPubKey;
    }

    public int hashCode() {
        String str = this.acsUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        ECPublicKey eCPublicKey = this.acsEphemPubKey;
        int hashCode2 = (hashCode + (eCPublicKey != null ? eCPublicKey.hashCode() : 0)) * 31;
        ECPublicKey eCPublicKey2 = this.sdkEphemPubKey;
        if (eCPublicKey2 != null) {
            i = eCPublicKey2.hashCode();
        }
        return hashCode2 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("AcsData(acsUrl=");
        P0.append(this.acsUrl);
        P0.append(", acsEphemPubKey=");
        P0.append(this.acsEphemPubKey);
        P0.append(", sdkEphemPubKey=");
        P0.append(this.sdkEphemPubKey);
        P0.append(")");
        return P0.toString();
    }
}
