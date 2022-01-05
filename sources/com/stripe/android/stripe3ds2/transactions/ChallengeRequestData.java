package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.stripe3ds2.exceptions.SDKRuntimeException;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\b\u0018\u0000 K2\u00020\u00012\u00020\u0002:\u0002LKBu\u0012\u0006\u0010\u001f\u001a\u00020\n\u0012\u0006\u0010 \u001a\u00020\n\u0012\u0006\u0010!\u001a\u00020\n\u0012\u0006\u0010\"\u001a\u00020\u000f\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n\u0012\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\bI\u0010JJ\u000f\u0010\u0006\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\t\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0012\u0010\fJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\fJ\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\n2\b\b\u0002\u0010 \u001a\u00020\n2\b\b\u0002\u0010!\u001a\u00020\n2\b\b\u0002\u0010\"\u001a\u00020\u000f2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\n2\u0010\b\u0002\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00172\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001bHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b+\u0010\fJ\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\u001b2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020,HÖ\u0001¢\u0006\u0004\b3\u0010.J \u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020,HÖ\u0001¢\u0006\u0004\b8\u00109R\u001b\u0010$\u001a\u0004\u0018\u00010\u00138\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010:\u001a\u0004\b;\u0010\u0015R\u0019\u0010!\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010<\u001a\u0004\b=\u0010\fR\u001b\u0010'\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\b?\u0010\u001dR\u001b\u0010#\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\b@\u0010\fR\u001b\u0010%\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010<\u001a\u0004\bA\u0010\fR\u0019\u0010\u001f\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\bB\u0010\fR\u001b\u0010(\u001a\u0004\u0018\u00010\u001b8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010>\u001a\u0004\bC\u0010\u001dR\u0019\u0010 \u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010<\u001a\u0004\bD\u0010\fR!\u0010&\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00178\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010E\u001a\u0004\bF\u0010\u001aR\u0019\u0010\"\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010G\u001a\u0004\bH\u0010\u0011¨\u0006M"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "Ljava/io/Serializable;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "()Lorg/json/JSONObject;", "toJson", "sanitize$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "sanitize", "", "component1", "()Ljava/lang/String;", "component2", "component3", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "component4", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "component5", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "component6", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "component7", "", "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "component8", "()Ljava/util/List;", "", "component9", "()Ljava/lang/Boolean;", "component10", "messageVersion", "threeDsServerTransId", "acsTransId", "sdkTransId", "challengeDataEntry", "cancelReason", "challengeHtmlDataEntry", "messageExtensions", "oobContinue", "shouldResendChallenge", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "getCancelReason", "Ljava/lang/String;", "getAcsTransId", "Ljava/lang/Boolean;", "getOobContinue", "getChallengeDataEntry", "getChallengeHtmlDataEntry", "getMessageVersion", "getShouldResendChallenge", "getThreeDsServerTransId", "Ljava/util/List;", "getMessageExtensions", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "Companion", "CancelReason", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeRequestData.kt */
public final class ChallengeRequestData implements Serializable, Parcelable {
    public static final Parcelable.Creator<ChallengeRequestData> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    public static final String FIELD_3DS_SERVER_TRANS_ID = "threeDSServerTransID";
    public static final String FIELD_ACS_TRANS_ID = "acsTransID";
    public static final String FIELD_CHALLENGE_CANCEL = "challengeCancel";
    public static final String FIELD_CHALLENGE_DATA_ENTRY = "challengeDataEntry";
    public static final String FIELD_CHALLENGE_HTML_DATA_ENTRY = "challengeHTMLDataEntry";
    public static final String FIELD_MESSAGE_EXTENSION = "messageExtensions";
    public static final String FIELD_MESSAGE_TYPE = "messageType";
    public static final String FIELD_MESSAGE_VERSION = "messageVersion";
    public static final String FIELD_OOB_CONTINUE = "oobContinue";
    public static final String FIELD_RESEND_CHALLENGE = "resendChallenge";
    public static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    public static final String MESSAGE_TYPE = "CReq";
    private final String acsTransId;
    private final CancelReason cancelReason;
    private final String challengeDataEntry;
    private final String challengeHtmlDataEntry;
    private final List<MessageExtension> messageExtensions;
    private final String messageVersion;
    private final Boolean oobContinue;
    private final SdkTransactionId sdkTransId;
    private final Boolean shouldResendChallenge;
    private final String threeDsServerTransId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$CancelReason;", "", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "UserSelected", "Reserved", "TransactionTimedOutDecoupled", "TransactionTimedOutOther", "TransactionTimedOutFirstCreq", "TransactionError", "Unknown", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeRequestData.kt */
    public enum CancelReason {
        UserSelected("01"),
        Reserved("02"),
        TransactionTimedOutDecoupled("03"),
        TransactionTimedOutOther("04"),
        TransactionTimedOutFirstCreq("05"),
        TransactionError("06"),
        Unknown("07");
        
        private final String code;

        private CancelReason(String str) {
            this.code = str;
        }

        public final String getCode() {
            return this.code;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004R\u0016\u0010\f\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\u0004R\u0016\u0010\r\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\r\u0010\u0004R\u0016\u0010\u000e\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000e\u0010\u0004R\u0016\u0010\u000f\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000f\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeRequestData$Companion;", "", "", "FIELD_3DS_SERVER_TRANS_ID", "Ljava/lang/String;", "FIELD_ACS_TRANS_ID", "FIELD_CHALLENGE_CANCEL", "FIELD_CHALLENGE_DATA_ENTRY", "FIELD_CHALLENGE_HTML_DATA_ENTRY", "FIELD_MESSAGE_EXTENSION", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_OOB_CONTINUE", "FIELD_RESEND_CHALLENGE", "FIELD_SDK_TRANS_ID", "MESSAGE_TYPE", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeRequestData.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<ChallengeRequestData> {
        public final ChallengeRequestData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean bool;
            Boolean bool2;
            i.e(parcel, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            SdkTransactionId createFromParcel = SdkTransactionId.CREATOR.createFromParcel(parcel);
            String readString4 = parcel.readString();
            CancelReason cancelReason = parcel.readInt() != 0 ? (CancelReason) Enum.valueOf(CancelReason.class, parcel.readString()) : null;
            String readString5 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                arrayList = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList.add(MessageExtension.CREATOR.createFromParcel(parcel));
                    readInt--;
                }
            } else {
                arrayList = null;
            }
            boolean z = true;
            if (parcel.readInt() != 0) {
                bool = Boolean.valueOf(parcel.readInt() != 0);
            } else {
                bool = null;
            }
            if (parcel.readInt() != 0) {
                if (parcel.readInt() == 0) {
                    z = false;
                }
                bool2 = Boolean.valueOf(z);
            } else {
                bool2 = null;
            }
            return new ChallengeRequestData(readString, readString2, readString3, createFromParcel, readString4, cancelReason, readString5, arrayList, bool, bool2);
        }

        public final ChallengeRequestData[] newArray(int i) {
            return new ChallengeRequestData[i];
        }
    }

    public ChallengeRequestData(String str, String str2, String str3, SdkTransactionId sdkTransactionId, String str4, CancelReason cancelReason2, String str5, List<MessageExtension> list, Boolean bool, Boolean bool2) {
        i.e(str, FIELD_MESSAGE_VERSION);
        i.e(str2, "threeDsServerTransId");
        i.e(str3, "acsTransId");
        i.e(sdkTransactionId, "sdkTransId");
        this.messageVersion = str;
        this.threeDsServerTransId = str2;
        this.acsTransId = str3;
        this.sdkTransId = sdkTransactionId;
        this.challengeDataEntry = str4;
        this.cancelReason = cancelReason2;
        this.challengeHtmlDataEntry = str5;
        this.messageExtensions = list;
        this.oobContinue = bool;
        this.shouldResendChallenge = bool2;
    }

    public static /* synthetic */ ChallengeRequestData copy$default(ChallengeRequestData challengeRequestData, String str, String str2, String str3, SdkTransactionId sdkTransactionId, String str4, CancelReason cancelReason2, String str5, List list, Boolean bool, Boolean bool2, int i, Object obj) {
        ChallengeRequestData challengeRequestData2 = challengeRequestData;
        int i2 = i;
        return challengeRequestData.copy((i2 & 1) != 0 ? challengeRequestData2.messageVersion : str, (i2 & 2) != 0 ? challengeRequestData2.threeDsServerTransId : str2, (i2 & 4) != 0 ? challengeRequestData2.acsTransId : str3, (i2 & 8) != 0 ? challengeRequestData2.sdkTransId : sdkTransactionId, (i2 & 16) != 0 ? challengeRequestData2.challengeDataEntry : str4, (i2 & 32) != 0 ? challengeRequestData2.cancelReason : cancelReason2, (i2 & 64) != 0 ? challengeRequestData2.challengeHtmlDataEntry : str5, (i2 & 128) != 0 ? challengeRequestData2.messageExtensions : list, (i2 & 256) != 0 ? challengeRequestData2.oobContinue : bool, (i2 & 512) != 0 ? challengeRequestData2.shouldResendChallenge : bool2);
    }

    public final String component1() {
        return this.messageVersion;
    }

    public final Boolean component10() {
        return this.shouldResendChallenge;
    }

    public final String component2() {
        return this.threeDsServerTransId;
    }

    public final String component3() {
        return this.acsTransId;
    }

    public final SdkTransactionId component4() {
        return this.sdkTransId;
    }

    public final String component5() {
        return this.challengeDataEntry;
    }

    public final CancelReason component6() {
        return this.cancelReason;
    }

    public final String component7() {
        return this.challengeHtmlDataEntry;
    }

    public final List<MessageExtension> component8() {
        return this.messageExtensions;
    }

    public final Boolean component9() {
        return this.oobContinue;
    }

    public final ChallengeRequestData copy(String str, String str2, String str3, SdkTransactionId sdkTransactionId, String str4, CancelReason cancelReason2, String str5, List<MessageExtension> list, Boolean bool, Boolean bool2) {
        i.e(str, FIELD_MESSAGE_VERSION);
        i.e(str2, "threeDsServerTransId");
        i.e(str3, "acsTransId");
        SdkTransactionId sdkTransactionId2 = sdkTransactionId;
        i.e(sdkTransactionId2, "sdkTransId");
        return new ChallengeRequestData(str, str2, str3, sdkTransactionId2, str4, cancelReason2, str5, list, bool, bool2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeRequestData)) {
            return false;
        }
        ChallengeRequestData challengeRequestData = (ChallengeRequestData) obj;
        return i.a(this.messageVersion, challengeRequestData.messageVersion) && i.a(this.threeDsServerTransId, challengeRequestData.threeDsServerTransId) && i.a(this.acsTransId, challengeRequestData.acsTransId) && i.a(this.sdkTransId, challengeRequestData.sdkTransId) && i.a(this.challengeDataEntry, challengeRequestData.challengeDataEntry) && i.a(this.cancelReason, challengeRequestData.cancelReason) && i.a(this.challengeHtmlDataEntry, challengeRequestData.challengeHtmlDataEntry) && i.a(this.messageExtensions, challengeRequestData.messageExtensions) && i.a(this.oobContinue, challengeRequestData.oobContinue) && i.a(this.shouldResendChallenge, challengeRequestData.shouldResendChallenge);
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final CancelReason getCancelReason() {
        return this.cancelReason;
    }

    public final String getChallengeDataEntry() {
        return this.challengeDataEntry;
    }

    public final String getChallengeHtmlDataEntry() {
        return this.challengeHtmlDataEntry;
    }

    public final List<MessageExtension> getMessageExtensions() {
        return this.messageExtensions;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final Boolean getOobContinue() {
        return this.oobContinue;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final Boolean getShouldResendChallenge() {
        return this.shouldResendChallenge;
    }

    public final String getThreeDsServerTransId() {
        return this.threeDsServerTransId;
    }

    public int hashCode() {
        String str = this.messageVersion;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.threeDsServerTransId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.acsTransId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        int hashCode4 = (hashCode3 + (sdkTransactionId != null ? sdkTransactionId.hashCode() : 0)) * 31;
        String str4 = this.challengeDataEntry;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        CancelReason cancelReason2 = this.cancelReason;
        int hashCode6 = (hashCode5 + (cancelReason2 != null ? cancelReason2.hashCode() : 0)) * 31;
        String str5 = this.challengeHtmlDataEntry;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        List<MessageExtension> list = this.messageExtensions;
        int hashCode8 = (hashCode7 + (list != null ? list.hashCode() : 0)) * 31;
        Boolean bool = this.oobContinue;
        int hashCode9 = (hashCode8 + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.shouldResendChallenge;
        if (bool2 != null) {
            i = bool2.hashCode();
        }
        return hashCode9 + i;
    }

    public final ChallengeRequestData sanitize$3ds2sdk_release() {
        return copy$default(this, (String) null, (String) null, (String) null, (SdkTransactionId) null, (String) null, (CancelReason) null, (String) null, (List) null, (Boolean) null, (Boolean) null, 943, (Object) null);
    }

    public final JSONObject toJson$3ds2sdk_release() {
        try {
            JSONObject put = new JSONObject().put(FIELD_MESSAGE_TYPE, (Object) MESSAGE_TYPE).put(FIELD_MESSAGE_VERSION, (Object) this.messageVersion).put(FIELD_SDK_TRANS_ID, (Object) this.sdkTransId.getValue()).put(FIELD_3DS_SERVER_TRANS_ID, (Object) this.threeDsServerTransId).put(FIELD_ACS_TRANS_ID, (Object) this.acsTransId);
            CancelReason cancelReason2 = this.cancelReason;
            if (cancelReason2 != null) {
                put.put(FIELD_CHALLENGE_CANCEL, (Object) cancelReason2.getCode());
            }
            String str = this.challengeDataEntry;
            if (str != null) {
                put.put(FIELD_CHALLENGE_DATA_ENTRY, (Object) str);
            }
            String str2 = this.challengeHtmlDataEntry;
            if (str2 != null) {
                put.put(FIELD_CHALLENGE_HTML_DATA_ENTRY, (Object) str2);
            }
            JSONArray jsonArray = MessageExtension.Companion.toJsonArray(this.messageExtensions);
            if (jsonArray != null) {
                put.put(FIELD_MESSAGE_EXTENSION, (Object) jsonArray);
            }
            Boolean bool = this.oobContinue;
            if (bool != null) {
                put.put(FIELD_OOB_CONTINUE, bool.booleanValue());
            }
            Boolean bool2 = this.shouldResendChallenge;
            if (bool2 != null) {
                put.put(FIELD_RESEND_CHALLENGE, (Object) bool2.booleanValue() ? "Y" : "N");
            }
            i.d(put, "json");
            return put;
        } catch (Throwable th) {
            Throwable a = Result.a(h.l0(th));
            if (a == null) {
                throw new KotlinNothingValueException();
            }
            throw new SDKRuntimeException(a);
        }
    }

    public String toString() {
        StringBuilder P0 = a.P0("ChallengeRequestData(messageVersion=");
        P0.append(this.messageVersion);
        P0.append(", threeDsServerTransId=");
        P0.append(this.threeDsServerTransId);
        P0.append(", acsTransId=");
        P0.append(this.acsTransId);
        P0.append(", sdkTransId=");
        P0.append(this.sdkTransId);
        P0.append(", challengeDataEntry=");
        P0.append(this.challengeDataEntry);
        P0.append(", cancelReason=");
        P0.append(this.cancelReason);
        P0.append(", challengeHtmlDataEntry=");
        P0.append(this.challengeHtmlDataEntry);
        P0.append(", messageExtensions=");
        P0.append(this.messageExtensions);
        P0.append(", oobContinue=");
        P0.append(this.oobContinue);
        P0.append(", shouldResendChallenge=");
        P0.append(this.shouldResendChallenge);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.messageVersion);
        parcel.writeString(this.threeDsServerTransId);
        parcel.writeString(this.acsTransId);
        this.sdkTransId.writeToParcel(parcel, 0);
        parcel.writeString(this.challengeDataEntry);
        CancelReason cancelReason2 = this.cancelReason;
        if (cancelReason2 != null) {
            parcel.writeInt(1);
            parcel.writeString(cancelReason2.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.challengeHtmlDataEntry);
        List<MessageExtension> list = this.messageExtensions;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (MessageExtension writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        Boolean bool = this.oobContinue;
        if (bool != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool.booleanValue() ? 1 : 0);
        } else {
            parcel.writeInt(0);
        }
        Boolean bool2 = this.shouldResendChallenge;
        if (bool2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(bool2.booleanValue() ? 1 : 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ChallengeRequestData(java.lang.String r15, java.lang.String r16, java.lang.String r17, com.stripe.android.stripe3ds2.transaction.SdkTransactionId r18, java.lang.String r19, com.stripe.android.stripe3ds2.transactions.ChallengeRequestData.CancelReason r20, java.lang.String r21, java.util.List r22, java.lang.Boolean r23, java.lang.Boolean r24, int r25, m0.n.b.f r26) {
        /*
            r14 = this;
            r0 = r25
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r8 = r2
            goto L_0x000b
        L_0x0009:
            r8 = r19
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r9 = r2
            goto L_0x0013
        L_0x0011:
            r9 = r20
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0019
            r10 = r2
            goto L_0x001b
        L_0x0019:
            r10 = r21
        L_0x001b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0021
            r11 = r2
            goto L_0x0023
        L_0x0021:
            r11 = r22
        L_0x0023:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0029
            r12 = r2
            goto L_0x002b
        L_0x0029:
            r12 = r23
        L_0x002b:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0031
            r13 = r2
            goto L_0x0033
        L_0x0031:
            r13 = r24
        L_0x0033:
            r3 = r14
            r4 = r15
            r5 = r16
            r6 = r17
            r7 = r18
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transactions.ChallengeRequestData.<init>(java.lang.String, java.lang.String, java.lang.String, com.stripe.android.stripe3ds2.transaction.SdkTransactionId, java.lang.String, com.stripe.android.stripe3ds2.transactions.ChallengeRequestData$CancelReason, java.lang.String, java.util.List, java.lang.Boolean, java.lang.Boolean, int, m0.n.b.f):void");
    }
}
