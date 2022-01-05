package com.stripe.android.stripe3ds2.transaction;

import androidx.annotation.Keep;
import com.stripe.android.stripe3ds2.transactions.ChallengeRequestData;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b$\u0010%J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\u0004JL\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00052\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0004J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0019\u0010\f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u0004R\u0019\u0010\u0010\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001c\u001a\u0004\b\u001e\u0010\u0004R\u0019\u0010\r\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010\u0007R\u0019\u0010\u000f\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u001c\u001a\u0004\b!\u0010\u0004R\u0019\u0010\u000e\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\"\u0010\u0004R\u0019\u0010\u0011\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001c\u001a\u0004\b#\u0010\u0004¨\u0006&"}, d2 = {"Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;", "", "", "component1", "()Ljava/lang/String;", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "component2", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "component3", "component4", "component5", "component6", "deviceData", "sdkTransactionId", "sdkAppId", "sdkReferenceNumber", "sdkEphemeralPublicKey", "messageVersion", "copy", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transaction/AuthenticationRequestParameters;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDeviceData", "getSdkEphemeralPublicKey", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransactionId", "getSdkReferenceNumber", "getSdkAppId", "getMessageVersion", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
@Keep
/* compiled from: AuthenticationRequestParameters.kt */
public final class AuthenticationRequestParameters {
    private final String deviceData;
    private final String messageVersion;
    private final String sdkAppId;
    private final String sdkEphemeralPublicKey;
    private final String sdkReferenceNumber;
    private final SdkTransactionId sdkTransactionId;

    public AuthenticationRequestParameters(String str, SdkTransactionId sdkTransactionId2, String str2, String str3, String str4, String str5) {
        i.e(str, "deviceData");
        i.e(sdkTransactionId2, "sdkTransactionId");
        i.e(str2, "sdkAppId");
        i.e(str3, "sdkReferenceNumber");
        i.e(str4, "sdkEphemeralPublicKey");
        i.e(str5, ChallengeRequestData.FIELD_MESSAGE_VERSION);
        this.deviceData = str;
        this.sdkTransactionId = sdkTransactionId2;
        this.sdkAppId = str2;
        this.sdkReferenceNumber = str3;
        this.sdkEphemeralPublicKey = str4;
        this.messageVersion = str5;
    }

    public static /* synthetic */ AuthenticationRequestParameters copy$default(AuthenticationRequestParameters authenticationRequestParameters, String str, SdkTransactionId sdkTransactionId2, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = authenticationRequestParameters.deviceData;
        }
        if ((i & 2) != 0) {
            sdkTransactionId2 = authenticationRequestParameters.sdkTransactionId;
        }
        SdkTransactionId sdkTransactionId3 = sdkTransactionId2;
        if ((i & 4) != 0) {
            str2 = authenticationRequestParameters.sdkAppId;
        }
        String str6 = str2;
        if ((i & 8) != 0) {
            str3 = authenticationRequestParameters.sdkReferenceNumber;
        }
        String str7 = str3;
        if ((i & 16) != 0) {
            str4 = authenticationRequestParameters.sdkEphemeralPublicKey;
        }
        String str8 = str4;
        if ((i & 32) != 0) {
            str5 = authenticationRequestParameters.messageVersion;
        }
        return authenticationRequestParameters.copy(str, sdkTransactionId3, str6, str7, str8, str5);
    }

    public final String component1() {
        return this.deviceData;
    }

    public final SdkTransactionId component2() {
        return this.sdkTransactionId;
    }

    public final String component3() {
        return this.sdkAppId;
    }

    public final String component4() {
        return this.sdkReferenceNumber;
    }

    public final String component5() {
        return this.sdkEphemeralPublicKey;
    }

    public final String component6() {
        return this.messageVersion;
    }

    public final AuthenticationRequestParameters copy(String str, SdkTransactionId sdkTransactionId2, String str2, String str3, String str4, String str5) {
        i.e(str, "deviceData");
        i.e(sdkTransactionId2, "sdkTransactionId");
        i.e(str2, "sdkAppId");
        i.e(str3, "sdkReferenceNumber");
        i.e(str4, "sdkEphemeralPublicKey");
        i.e(str5, ChallengeRequestData.FIELD_MESSAGE_VERSION);
        return new AuthenticationRequestParameters(str, sdkTransactionId2, str2, str3, str4, str5);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AuthenticationRequestParameters)) {
            return false;
        }
        AuthenticationRequestParameters authenticationRequestParameters = (AuthenticationRequestParameters) obj;
        return i.a(this.deviceData, authenticationRequestParameters.deviceData) && i.a(this.sdkTransactionId, authenticationRequestParameters.sdkTransactionId) && i.a(this.sdkAppId, authenticationRequestParameters.sdkAppId) && i.a(this.sdkReferenceNumber, authenticationRequestParameters.sdkReferenceNumber) && i.a(this.sdkEphemeralPublicKey, authenticationRequestParameters.sdkEphemeralPublicKey) && i.a(this.messageVersion, authenticationRequestParameters.messageVersion);
    }

    public final String getDeviceData() {
        return this.deviceData;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final String getSdkAppId() {
        return this.sdkAppId;
    }

    public final String getSdkEphemeralPublicKey() {
        return this.sdkEphemeralPublicKey;
    }

    public final String getSdkReferenceNumber() {
        return this.sdkReferenceNumber;
    }

    public final SdkTransactionId getSdkTransactionId() {
        return this.sdkTransactionId;
    }

    public int hashCode() {
        String str = this.deviceData;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        SdkTransactionId sdkTransactionId2 = this.sdkTransactionId;
        int hashCode2 = (hashCode + (sdkTransactionId2 != null ? sdkTransactionId2.hashCode() : 0)) * 31;
        String str2 = this.sdkAppId;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.sdkReferenceNumber;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.sdkEphemeralPublicKey;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.messageVersion;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode5 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("AuthenticationRequestParameters(deviceData=");
        P0.append(this.deviceData);
        P0.append(", sdkTransactionId=");
        P0.append(this.sdkTransactionId);
        P0.append(", sdkAppId=");
        P0.append(this.sdkAppId);
        P0.append(", sdkReferenceNumber=");
        P0.append(this.sdkReferenceNumber);
        P0.append(", sdkEphemeralPublicKey=");
        P0.append(this.sdkEphemeralPublicKey);
        P0.append(", messageVersion=");
        return a.y0(P0, this.messageVersion, ")");
    }
}
