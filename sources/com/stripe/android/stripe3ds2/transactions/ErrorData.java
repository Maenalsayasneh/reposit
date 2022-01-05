package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.Stripe3ds2AuthResult;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u0000 A2\u00020\u0001:\u0002ABBo\b\u0000\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u001b\u001a\u00020\u0006\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b?\u0010@J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000b\u0010\bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\bJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\bJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\bJ\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\bJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0001\u0010 \u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u001b\u001a\u00020\u00062\b\b\u0002\u0010\u001c\u001a\u00020\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u001e\u001a\u00020\u00062\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\"\u0010\bJ\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%J\u001a\u0010)\u001a\u00020(2\b\u0010'\u001a\u0004\u0018\u00010&HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020#HÖ\u0001¢\u0006\u0004\b+\u0010%J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020#HÖ\u0001¢\u0006\u0004\b0\u00101R\u0019\u0010\u001e\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001e\u00102\u001a\u0004\b3\u0010\bR\u0019\u0010\u0019\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0019\u00102\u001a\u0004\b4\u0010\bR\u0019\u0010\u001c\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001c\u00102\u001a\u0004\b5\u0010\bR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u001a\u00106\u001a\u0004\b7\u0010\u000eR\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001d\u00102\u001a\u0004\b8\u0010\bR\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u00102\u001a\u0004\b9\u0010\bR\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00138\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010:\u001a\u0004\b;\u0010\u0015R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u00102\u001a\u0004\b<\u0010\bR\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u0018\u00102\u001a\u0004\b=\u0010\bR\u0019\u0010\u001b\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u00102\u001a\u0004\b>\u0010\b¨\u0006C"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "()Lorg/json/JSONObject;", "toJson", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "component5", "()Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "component6", "component7", "component8", "component9", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "component10", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "serverTransId", "acsTransId", "dsTransId", "errorCode", "errorComponent", "errorDescription", "errorDetail", "errorMessageType", "messageVersion", "sdkTransId", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMessageVersion", "getErrorCode", "getErrorDetail", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "getErrorComponent", "getErrorMessageType", "getServerTransId", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransId", "getAcsTransId", "getDsTransId", "getErrorDescription", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;)V", "Companion", "ErrorComponent", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ErrorData.kt */
public final class ErrorData implements Parcelable {
    public static final Parcelable.Creator<ErrorData> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private static final String FIELD_3DS_SERVER_TRANS_ID = "threeDSServerTransID";
    private static final String FIELD_ACS_TRANS_ID = "acsTransID";
    private static final String FIELD_DS_TRANS_ID = "dsTransID";
    private static final String FIELD_ERROR_CODE = "errorCode";
    private static final String FIELD_ERROR_COMPONENT = "errorComponent";
    private static final String FIELD_ERROR_DESCRIPTION = "errorDescription";
    private static final String FIELD_ERROR_DETAIL = "errorDetail";
    private static final String FIELD_ERROR_MESSAGE_TYPE = "errorMessageType";
    private static final String FIELD_MESSAGE_TYPE = "messageType";
    private static final String FIELD_MESSAGE_VERSION = "messageVersion";
    private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    private static final String MESSAGE_TYPE = "Erro";
    private final String acsTransId;
    private final String dsTransId;
    private final String errorCode;
    private final ErrorComponent errorComponent;
    private final String errorDescription;
    private final String errorDetail;
    private final String errorMessageType;
    private final String messageVersion;
    private final SdkTransactionId sdkTransId;
    private final String serverTransId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0016\u0010\u0011\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0016\u0010\u0013\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0013\u0010\u000eR\u0016\u0010\u0014\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0014\u0010\u000eR\u0016\u0010\u0015\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0016\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0016\u0010\u000eR\u0016\u0010\u0017\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0017\u0010\u000eR\u0016\u0010\u0018\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0018\u0010\u000eR\u0016\u0010\u0019\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0019\u0010\u000e¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData$Companion;", "", "Lorg/json/JSONObject;", "payload", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "fromJson$3ds2sdk_release", "(Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transactions/ErrorData;", "fromJson", "", "isErrorMessage$3ds2sdk_release", "(Lorg/json/JSONObject;)Z", "isErrorMessage", "", "FIELD_3DS_SERVER_TRANS_ID", "Ljava/lang/String;", "FIELD_ACS_TRANS_ID", "FIELD_DS_TRANS_ID", "FIELD_ERROR_CODE", "FIELD_ERROR_COMPONENT", "FIELD_ERROR_DESCRIPTION", "FIELD_ERROR_DETAIL", "FIELD_ERROR_MESSAGE_TYPE", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_SDK_TRANS_ID", "MESSAGE_TYPE", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ErrorData.kt */
    public static final class Companion {
        private Companion() {
        }

        public final ErrorData fromJson$3ds2sdk_release(JSONObject jSONObject) {
            i.e(jSONObject, "payload");
            String optString = jSONObject.optString("threeDSServerTransID");
            String optString2 = jSONObject.optString("acsTransID");
            String optString3 = jSONObject.optString(ErrorData.FIELD_DS_TRANS_ID);
            String optString4 = jSONObject.optString(ErrorData.FIELD_ERROR_CODE);
            i.d(optString4, "payload.optString(FIELD_ERROR_CODE)");
            ErrorComponent fromCode = ErrorComponent.Companion.fromCode(jSONObject.optString(ErrorData.FIELD_ERROR_COMPONENT));
            String optString5 = jSONObject.optString(ErrorData.FIELD_ERROR_DESCRIPTION);
            i.d(optString5, "payload.optString(FIELD_ERROR_DESCRIPTION)");
            String optString6 = jSONObject.optString(ErrorData.FIELD_ERROR_DETAIL);
            i.d(optString6, "payload.optString(FIELD_ERROR_DETAIL)");
            String optString7 = jSONObject.optString(ErrorData.FIELD_ERROR_MESSAGE_TYPE);
            String optString8 = jSONObject.optString("messageVersion");
            i.d(optString8, "payload.optString(FIELD_MESSAGE_VERSION)");
            String optString9 = jSONObject.optString("sdkTransID");
            return new ErrorData(optString, optString2, optString3, optString4, fromCode, optString5, optString6, optString7, optString8, optString9 != null ? new SdkTransactionId(optString9) : null);
        }

        public final boolean isErrorMessage$3ds2sdk_release(JSONObject jSONObject) {
            i.e(jSONObject, "payload");
            return i.a(ErrorData.MESSAGE_TYPE, jSONObject.optString("messageType"));
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<ErrorData> {
        public final ErrorData createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new ErrorData(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (ErrorComponent) Enum.valueOf(ErrorComponent.class, parcel.readString()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? SdkTransactionId.CREATOR.createFromParcel(parcel) : null);
        }

        public final ErrorData[] newArray(int i) {
            return new ErrorData[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "ThreeDsSdk", "ThreeDsServer", "DirectoryServer", "Acs", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ErrorData.kt */
    public enum ErrorComponent {
        ThreeDsSdk(Stripe3ds2AuthResult.Ares.VALUE_CHALLENGE),
        ThreeDsServer("S"),
        DirectoryServer("D"),
        Acs("A");
        
        public static final Companion Companion = null;
        private final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent$Companion;", "", "", "code", "Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ErrorData$ErrorComponent;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: ErrorData.kt */
        public static final class Companion {
            private Companion() {
            }

            public final ErrorComponent fromCode(String str) {
                ErrorComponent[] values = ErrorComponent.values();
                for (int i = 0; i < 4; i++) {
                    ErrorComponent errorComponent = values[i];
                    if (i.a(errorComponent.getCode(), str)) {
                        return errorComponent;
                    }
                }
                return null;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((f) null);
        }

        private ErrorComponent(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    public ErrorData(String str, String str2, String str3, String str4, ErrorComponent errorComponent2, String str5, String str6, String str7, String str8, SdkTransactionId sdkTransactionId) {
        i.e(str4, FIELD_ERROR_CODE);
        i.e(str5, FIELD_ERROR_DESCRIPTION);
        i.e(str6, FIELD_ERROR_DETAIL);
        i.e(str8, "messageVersion");
        this.serverTransId = str;
        this.acsTransId = str2;
        this.dsTransId = str3;
        this.errorCode = str4;
        this.errorComponent = errorComponent2;
        this.errorDescription = str5;
        this.errorDetail = str6;
        this.errorMessageType = str7;
        this.messageVersion = str8;
        this.sdkTransId = sdkTransactionId;
    }

    public static /* synthetic */ ErrorData copy$default(ErrorData errorData, String str, String str2, String str3, String str4, ErrorComponent errorComponent2, String str5, String str6, String str7, String str8, SdkTransactionId sdkTransactionId, int i, Object obj) {
        ErrorData errorData2 = errorData;
        int i2 = i;
        return errorData.copy((i2 & 1) != 0 ? errorData2.serverTransId : str, (i2 & 2) != 0 ? errorData2.acsTransId : str2, (i2 & 4) != 0 ? errorData2.dsTransId : str3, (i2 & 8) != 0 ? errorData2.errorCode : str4, (i2 & 16) != 0 ? errorData2.errorComponent : errorComponent2, (i2 & 32) != 0 ? errorData2.errorDescription : str5, (i2 & 64) != 0 ? errorData2.errorDetail : str6, (i2 & 128) != 0 ? errorData2.errorMessageType : str7, (i2 & 256) != 0 ? errorData2.messageVersion : str8, (i2 & 512) != 0 ? errorData2.sdkTransId : sdkTransactionId);
    }

    public final String component1() {
        return this.serverTransId;
    }

    public final SdkTransactionId component10() {
        return this.sdkTransId;
    }

    public final String component2() {
        return this.acsTransId;
    }

    public final String component3() {
        return this.dsTransId;
    }

    public final String component4() {
        return this.errorCode;
    }

    public final ErrorComponent component5() {
        return this.errorComponent;
    }

    public final String component6() {
        return this.errorDescription;
    }

    public final String component7() {
        return this.errorDetail;
    }

    public final String component8() {
        return this.errorMessageType;
    }

    public final String component9() {
        return this.messageVersion;
    }

    public final ErrorData copy(String str, String str2, String str3, String str4, ErrorComponent errorComponent2, String str5, String str6, String str7, String str8, SdkTransactionId sdkTransactionId) {
        String str9 = str4;
        i.e(str9, FIELD_ERROR_CODE);
        String str10 = str5;
        i.e(str10, FIELD_ERROR_DESCRIPTION);
        String str11 = str6;
        i.e(str11, FIELD_ERROR_DETAIL);
        String str12 = str8;
        i.e(str12, "messageVersion");
        return new ErrorData(str, str2, str3, str9, errorComponent2, str10, str11, str7, str12, sdkTransactionId);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ErrorData)) {
            return false;
        }
        ErrorData errorData = (ErrorData) obj;
        return i.a(this.serverTransId, errorData.serverTransId) && i.a(this.acsTransId, errorData.acsTransId) && i.a(this.dsTransId, errorData.dsTransId) && i.a(this.errorCode, errorData.errorCode) && i.a(this.errorComponent, errorData.errorComponent) && i.a(this.errorDescription, errorData.errorDescription) && i.a(this.errorDetail, errorData.errorDetail) && i.a(this.errorMessageType, errorData.errorMessageType) && i.a(this.messageVersion, errorData.messageVersion) && i.a(this.sdkTransId, errorData.sdkTransId);
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final String getDsTransId() {
        return this.dsTransId;
    }

    public final String getErrorCode() {
        return this.errorCode;
    }

    public final ErrorComponent getErrorComponent() {
        return this.errorComponent;
    }

    public final String getErrorDescription() {
        return this.errorDescription;
    }

    public final String getErrorDetail() {
        return this.errorDetail;
    }

    public final String getErrorMessageType() {
        return this.errorMessageType;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final String getServerTransId() {
        return this.serverTransId;
    }

    public int hashCode() {
        String str = this.serverTransId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.acsTransId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.dsTransId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.errorCode;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        ErrorComponent errorComponent2 = this.errorComponent;
        int hashCode5 = (hashCode4 + (errorComponent2 != null ? errorComponent2.hashCode() : 0)) * 31;
        String str5 = this.errorDescription;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.errorDetail;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.errorMessageType;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.messageVersion;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        if (sdkTransactionId != null) {
            i = sdkTransactionId.hashCode();
        }
        return hashCode9 + i;
    }

    public final JSONObject toJson$3ds2sdk_release() throws JSONException {
        JSONObject put = new JSONObject().put("messageType", (Object) MESSAGE_TYPE).put("messageVersion", (Object) this.messageVersion).put("sdkTransID", (Object) this.sdkTransId).put(FIELD_ERROR_CODE, (Object) this.errorCode).put(FIELD_ERROR_DESCRIPTION, (Object) this.errorDescription).put(FIELD_ERROR_DETAIL, (Object) this.errorDetail);
        String str = this.serverTransId;
        if (str != null) {
            put.put("threeDSServerTransID", (Object) str);
        }
        String str2 = this.acsTransId;
        if (str2 != null) {
            put.put("acsTransID", (Object) str2);
        }
        String str3 = this.dsTransId;
        if (str3 != null) {
            put.put(FIELD_DS_TRANS_ID, (Object) str3);
        }
        ErrorComponent errorComponent2 = this.errorComponent;
        if (errorComponent2 != null) {
            put.put(FIELD_ERROR_COMPONENT, (Object) errorComponent2.getCode());
        }
        String str4 = this.errorMessageType;
        if (str4 != null) {
            put.put(FIELD_ERROR_MESSAGE_TYPE, (Object) str4);
        }
        i.d(put, "json");
        return put;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ErrorData(serverTransId=");
        P0.append(this.serverTransId);
        P0.append(", acsTransId=");
        P0.append(this.acsTransId);
        P0.append(", dsTransId=");
        P0.append(this.dsTransId);
        P0.append(", errorCode=");
        P0.append(this.errorCode);
        P0.append(", errorComponent=");
        P0.append(this.errorComponent);
        P0.append(", errorDescription=");
        P0.append(this.errorDescription);
        P0.append(", errorDetail=");
        P0.append(this.errorDetail);
        P0.append(", errorMessageType=");
        P0.append(this.errorMessageType);
        P0.append(", messageVersion=");
        P0.append(this.messageVersion);
        P0.append(", sdkTransId=");
        P0.append(this.sdkTransId);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.serverTransId);
        parcel.writeString(this.acsTransId);
        parcel.writeString(this.dsTransId);
        parcel.writeString(this.errorCode);
        ErrorComponent errorComponent2 = this.errorComponent;
        if (errorComponent2 != null) {
            parcel.writeInt(1);
            parcel.writeString(errorComponent2.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.errorDescription);
        parcel.writeString(this.errorDetail);
        parcel.writeString(this.errorMessageType);
        parcel.writeString(this.messageVersion);
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        if (sdkTransactionId != null) {
            parcel.writeInt(1);
            sdkTransactionId.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ErrorData(java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, com.stripe.android.stripe3ds2.transactions.ErrorData.ErrorComponent r19, java.lang.String r20, java.lang.String r21, java.lang.String r22, java.lang.String r23, com.stripe.android.stripe3ds2.transaction.SdkTransactionId r24, int r25, m0.n.b.f r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000a
        L_0x0009:
            r4 = r15
        L_0x000a:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0010
            r5 = r2
            goto L_0x0012
        L_0x0010:
            r5 = r16
        L_0x0012:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0018
            r6 = r2
            goto L_0x001a
        L_0x0018:
            r6 = r17
        L_0x001a:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0020
            r8 = r2
            goto L_0x0022
        L_0x0020:
            r8 = r19
        L_0x0022:
            r0 = r0 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0028
            r11 = r2
            goto L_0x002a
        L_0x0028:
            r11 = r22
        L_0x002a:
            r3 = r14
            r7 = r18
            r9 = r20
            r10 = r21
            r12 = r23
            r13 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transactions.ErrorData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.stripe.android.stripe3ds2.transactions.ErrorData$ErrorComponent, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.stripe.android.stripe3ds2.transaction.SdkTransactionId, int, m0.n.b.f):void");
    }
}
