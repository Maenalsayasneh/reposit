package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Collection;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 62\u00020\u00012\u00020\u0002:\u00016BQ\u0012\u0006\u0010\u0014\u001a\u00020\u0003\u0012\u0006\u0010\u0015\u001a\u00020\u0003\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u0012\u0006\u0010\u0019\u001a\u00020\u0003\u0012\u0006\u0010\u001a\u001a\u00020\u0003\u0012\u0006\u0010\u001b\u001a\u00020\f\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b4\u00105J\u0010\u0010\u0004\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u0007\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\b\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\t\u0010\u0005J\u0010\u0010\n\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\n\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\u0003HÂ\u0003¢\u0006\u0004\b\u000b\u0010\u0005J\u0010\u0010\r\u001a\u00020\fHÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u000f\u0010\u0005J\u001b\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013Jl\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0014\u001a\u00020\u00032\b\b\u0002\u0010\u0015\u001a\u00020\u00032\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u00032\b\b\u0002\u0010\u0019\u001a\u00020\u00032\b\b\u0002\u0010\u001a\u001a\u00020\u00032\b\b\u0002\u0010\u001b\u001a\u00020\f2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0005J\u0010\u0010 \u001a\u00020\fHÖ\u0001¢\u0006\u0004\b \u0010\u000eJ\u001a\u0010#\u001a\u00020\"2\b\u0010!\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b%\u0010\u000eJ \u0010*\u001a\u00020)2\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b*\u0010+R\u0016\u0010\u001a\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010,R\u0016\u0010\u0017\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010,R\u0016\u0010\u0014\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010,R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010,R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010,R\u0016\u0010\u001b\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u0016\u00101\u001a\u00020.8A@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R\u0016\u0010\u0019\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010,R\u0016\u0010\u0018\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010,R\u0016\u0010\u0015\u001a\u00020\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010,R\u0016\u00103\u001a\u00020.8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b2\u00100¨\u00067"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "", "component8", "()I", "component9", "", "", "toParamMap", "()Ljava/util/Map;", "sourceId", "sdkAppId", "sdkReferenceNumber", "sdkTransactionId", "deviceData", "sdkEphemeralPublicKey", "messageVersion", "maxTimeout", "returnUrl", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Lcom/stripe/android/model/Stripe3ds2AuthParams;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "I", "Lorg/json/JSONObject;", "getAppParams$payments_core_release", "()Lorg/json/JSONObject;", "appParams", "getDeviceRenderOptions", "deviceRenderOptions", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Stripe3ds2AuthParams.kt */
public final class Stripe3ds2AuthParams implements StripeParamsModel, Parcelable {
    public static final Parcelable.Creator<Stripe3ds2AuthParams> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    public static final String FIELD_APP = "app";
    private static final String FIELD_DEVICE_RENDER_OPTIONS = "deviceRenderOptions";
    public static final String FIELD_FALLBACK_RETURN_URL = "fallback_return_url";
    private static final String FIELD_MESSAGE_VERSION = "messageVersion";
    private static final String FIELD_SDK_APP_ID = "sdkAppID";
    private static final String FIELD_SDK_ENC_DATA = "sdkEncData";
    private static final String FIELD_SDK_EPHEM_PUB_KEY = "sdkEphemPubKey";
    private static final String FIELD_SDK_INTERFACE = "sdkInterface";
    private static final String FIELD_SDK_MAX_TIMEOUT = "sdkMaxTimeout";
    private static final String FIELD_SDK_REFERENCE_NUMBER = "sdkReferenceNumber";
    private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    private static final String FIELD_SDK_UI_TYPE = "sdkUiType";
    public static final String FIELD_SOURCE = "source";
    private final String deviceData;
    private final int maxTimeout;
    private final String messageVersion;
    private final String returnUrl;
    private final String sdkAppId;
    private final String sdkEphemeralPublicKey;
    private final String sdkReferenceNumber;
    private final String sdkTransactionId;
    private final String sourceId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004R\u0016\u0010\u0010\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u0004¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/model/Stripe3ds2AuthParams$Companion;", "", "", "FIELD_APP", "Ljava/lang/String;", "FIELD_DEVICE_RENDER_OPTIONS", "FIELD_FALLBACK_RETURN_URL", "FIELD_MESSAGE_VERSION", "FIELD_SDK_APP_ID", "FIELD_SDK_ENC_DATA", "FIELD_SDK_EPHEM_PUB_KEY", "FIELD_SDK_INTERFACE", "FIELD_SDK_MAX_TIMEOUT", "FIELD_SDK_REFERENCE_NUMBER", "FIELD_SDK_TRANS_ID", "FIELD_SDK_UI_TYPE", "FIELD_SOURCE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Stripe3ds2AuthParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<Stripe3ds2AuthParams> {
        public final Stripe3ds2AuthParams createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new Stripe3ds2AuthParams(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readString());
        }

        public final Stripe3ds2AuthParams[] newArray(int i) {
            return new Stripe3ds2AuthParams[i];
        }
    }

    public Stripe3ds2AuthParams(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8) {
        i.e(str, "sourceId");
        i.e(str2, "sdkAppId");
        i.e(str3, FIELD_SDK_REFERENCE_NUMBER);
        i.e(str4, "sdkTransactionId");
        i.e(str5, "deviceData");
        i.e(str6, "sdkEphemeralPublicKey");
        i.e(str7, "messageVersion");
        this.sourceId = str;
        this.sdkAppId = str2;
        this.sdkReferenceNumber = str3;
        this.sdkTransactionId = str4;
        this.deviceData = str5;
        this.sdkEphemeralPublicKey = str6;
        this.messageVersion = str7;
        this.maxTimeout = i;
        this.returnUrl = str8;
    }

    private final String component1() {
        return this.sourceId;
    }

    private final String component2() {
        return this.sdkAppId;
    }

    private final String component3() {
        return this.sdkReferenceNumber;
    }

    private final String component4() {
        return this.sdkTransactionId;
    }

    private final String component5() {
        return this.deviceData;
    }

    private final String component6() {
        return this.sdkEphemeralPublicKey;
    }

    private final String component7() {
        return this.messageVersion;
    }

    private final int component8() {
        return this.maxTimeout;
    }

    private final String component9() {
        return this.returnUrl;
    }

    public static /* synthetic */ Stripe3ds2AuthParams copy$default(Stripe3ds2AuthParams stripe3ds2AuthParams, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8, int i2, Object obj) {
        Stripe3ds2AuthParams stripe3ds2AuthParams2 = stripe3ds2AuthParams;
        int i3 = i2;
        return stripe3ds2AuthParams.copy((i3 & 1) != 0 ? stripe3ds2AuthParams2.sourceId : str, (i3 & 2) != 0 ? stripe3ds2AuthParams2.sdkAppId : str2, (i3 & 4) != 0 ? stripe3ds2AuthParams2.sdkReferenceNumber : str3, (i3 & 8) != 0 ? stripe3ds2AuthParams2.sdkTransactionId : str4, (i3 & 16) != 0 ? stripe3ds2AuthParams2.deviceData : str5, (i3 & 32) != 0 ? stripe3ds2AuthParams2.sdkEphemeralPublicKey : str6, (i3 & 64) != 0 ? stripe3ds2AuthParams2.messageVersion : str7, (i3 & 128) != 0 ? stripe3ds2AuthParams2.maxTimeout : i, (i3 & 256) != 0 ? stripe3ds2AuthParams2.returnUrl : str8);
    }

    private final JSONObject getDeviceRenderOptions() {
        Object obj;
        try {
            obj = new JSONObject().put(FIELD_SDK_INTERFACE, (Object) "03").put(FIELD_SDK_UI_TYPE, (Object) new JSONArray((Collection<?>) g.K("01", "02", "03", "04", "05")));
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Object jSONObject = new JSONObject();
        if (obj instanceof Result.Failure) {
            obj = jSONObject;
        }
        return (JSONObject) obj;
    }

    public final Stripe3ds2AuthParams copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i, String str8) {
        i.e(str, "sourceId");
        i.e(str2, "sdkAppId");
        i.e(str3, FIELD_SDK_REFERENCE_NUMBER);
        i.e(str4, "sdkTransactionId");
        String str9 = str5;
        i.e(str9, "deviceData");
        String str10 = str6;
        i.e(str10, "sdkEphemeralPublicKey");
        String str11 = str7;
        i.e(str11, "messageVersion");
        return new Stripe3ds2AuthParams(str, str2, str3, str4, str9, str10, str11, i, str8);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Stripe3ds2AuthParams)) {
            return false;
        }
        Stripe3ds2AuthParams stripe3ds2AuthParams = (Stripe3ds2AuthParams) obj;
        return i.a(this.sourceId, stripe3ds2AuthParams.sourceId) && i.a(this.sdkAppId, stripe3ds2AuthParams.sdkAppId) && i.a(this.sdkReferenceNumber, stripe3ds2AuthParams.sdkReferenceNumber) && i.a(this.sdkTransactionId, stripe3ds2AuthParams.sdkTransactionId) && i.a(this.deviceData, stripe3ds2AuthParams.deviceData) && i.a(this.sdkEphemeralPublicKey, stripe3ds2AuthParams.sdkEphemeralPublicKey) && i.a(this.messageVersion, stripe3ds2AuthParams.messageVersion) && this.maxTimeout == stripe3ds2AuthParams.maxTimeout && i.a(this.returnUrl, stripe3ds2AuthParams.returnUrl);
    }

    public final JSONObject getAppParams$payments_core_release() {
        Object obj;
        try {
            obj = new JSONObject().put(FIELD_SDK_APP_ID, (Object) this.sdkAppId).put("sdkTransID", (Object) this.sdkTransactionId).put(FIELD_SDK_ENC_DATA, (Object) this.deviceData).put("sdkEphemPubKey", (Object) new JSONObject(this.sdkEphemeralPublicKey)).put(FIELD_SDK_MAX_TIMEOUT, (Object) StringsKt__IndentKt.t(String.valueOf(this.maxTimeout), 2, '0')).put(FIELD_SDK_REFERENCE_NUMBER, (Object) this.sdkReferenceNumber).put("messageVersion", (Object) this.messageVersion).put(FIELD_DEVICE_RENDER_OPTIONS, (Object) getDeviceRenderOptions());
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Object jSONObject = new JSONObject();
        if (obj instanceof Result.Failure) {
            obj = jSONObject;
        }
        return (JSONObject) obj;
    }

    public int hashCode() {
        String str = this.sourceId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.sdkAppId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.sdkReferenceNumber;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.sdkTransactionId;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.deviceData;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.sdkEphemeralPublicKey;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.messageVersion;
        int M = a.M(this.maxTimeout, (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31, 31);
        String str8 = this.returnUrl;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return M + i;
    }

    public Map<String, Object> toParamMap() {
        Map N = g.N(new Pair(FIELD_SOURCE, this.sourceId), new Pair("app", getAppParams$payments_core_release().toString()));
        String str = this.returnUrl;
        Map S2 = str != null ? h.S2(new Pair(FIELD_FALLBACK_RETURN_URL, str)) : null;
        if (S2 == null) {
            S2 = g.o();
        }
        return g.b0(N, S2);
    }

    public String toString() {
        StringBuilder P0 = a.P0("Stripe3ds2AuthParams(sourceId=");
        P0.append(this.sourceId);
        P0.append(", sdkAppId=");
        P0.append(this.sdkAppId);
        P0.append(", sdkReferenceNumber=");
        P0.append(this.sdkReferenceNumber);
        P0.append(", sdkTransactionId=");
        P0.append(this.sdkTransactionId);
        P0.append(", deviceData=");
        P0.append(this.deviceData);
        P0.append(", sdkEphemeralPublicKey=");
        P0.append(this.sdkEphemeralPublicKey);
        P0.append(", messageVersion=");
        P0.append(this.messageVersion);
        P0.append(", maxTimeout=");
        P0.append(this.maxTimeout);
        P0.append(", returnUrl=");
        return a.y0(P0, this.returnUrl, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.sourceId);
        parcel.writeString(this.sdkAppId);
        parcel.writeString(this.sdkReferenceNumber);
        parcel.writeString(this.sdkTransactionId);
        parcel.writeString(this.deviceData);
        parcel.writeString(this.sdkEphemeralPublicKey);
        parcel.writeString(this.messageVersion);
        parcel.writeInt(this.maxTimeout);
        parcel.writeString(this.returnUrl);
    }
}
