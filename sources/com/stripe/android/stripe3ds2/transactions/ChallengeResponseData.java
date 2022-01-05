package com.stripe.android.stripe3ds2.transactions;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.stripe3ds2.transaction.SdkTransactionId;
import com.stripe.android.stripe3ds2.transaction.TransactionStatus;
import com.ults.listeners.ChallengeType;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\b\u0018\u0000 \u00012\u00020\u0001:\b\u0001\u0001\u0001\u0001BÐ\u0002\u0012\u0006\u0010/\u001a\u00020\u0005\u0012\u0006\u00100\u001a\u00020\u0005\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u00104\u001a\u00020\u000e\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u00109\u001a\u00020\u000e\u0012\u0010\b\u0002\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001c\u0012\u0010\b\u0002\u0010>\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0016\u0012\u0006\u0010?\u001a\u00020\u0005\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010E\u001a\u00020'\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0005¢\u0006\u0005\b\u0010\u0001J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007J\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0007J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0007J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0007J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0007J\u0010\u0010\u0015\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0007J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0007J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b \u0010\u0019J\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u0007J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\"\u0010\u0007J\u0012\u0010#\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b#\u0010\u0007J\u0012\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b$\u0010\u0007J\u0012\u0010%\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b%\u0010\u001eJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b&\u0010\u0007J\u0010\u0010(\u001a\u00020'HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b*\u0010\u0007J\u0012\u0010+\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b+\u0010\u0007J\u0012\u0010,\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b,\u0010\u0007J\u0012\u0010-\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b-\u0010\u0007J\u0012\u0010.\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b.\u0010\u0007Jà\u0002\u0010K\u001a\u00020\u00002\b\b\u0002\u0010/\u001a\u00020\u00052\b\b\u0002\u00100\u001a\u00020\u00052\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u00104\u001a\u00020\u000e2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00109\u001a\u00020\u000e2\u0010\b\u0002\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001c2\u0010\b\u0002\u0010>\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00162\b\b\u0002\u0010?\u001a\u00020\u00052\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010E\u001a\u00020'2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010I\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\bM\u0010\u0007J\u0010\u0010O\u001a\u00020NHÖ\u0001¢\u0006\u0004\bO\u0010PJ\u001a\u0010S\u001a\u00020\u000e2\b\u0010R\u001a\u0004\u0018\u00010QHÖ\u0003¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020NHÖ\u0001¢\u0006\u0004\bU\u0010PJ \u0010Z\u001a\u00020Y2\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020NHÖ\u0001¢\u0006\u0004\bZ\u0010[R\u0019\u00109\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010\\\u001a\u0004\b]\u0010\u0010R\u001b\u00101\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010^\u001a\u0004\b_\u0010\u0007R\u001b\u0010B\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bB\u0010^\u001a\u0004\b`\u0010\u0007R\u0019\u00100\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b0\u0010^\u001a\u0004\ba\u0010\u0007R\u001b\u0010A\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bA\u0010^\u001a\u0004\bb\u0010\u0007R\u0019\u0010?\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b?\u0010^\u001a\u0004\bc\u0010\u0007R\u001b\u00108\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b8\u0010^\u001a\u0004\bd\u0010\u0007R\u001b\u0010F\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010^\u001a\u0004\be\u0010\u0007R\u001b\u0010I\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bI\u0010^\u001a\u0004\bf\u0010\u0007R\u001b\u00105\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010^\u001a\u0004\bg\u0010\u0007R\u001b\u00103\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010h\u001a\u0004\bi\u0010\rR\u001b\u0010@\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010^\u001a\u0004\bj\u0010\u0007R\u0019\u0010E\u001a\u00020'8\u0006@\u0006¢\u0006\f\n\u0004\bE\u0010k\u001a\u0004\bl\u0010)R\u001b\u00107\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b7\u0010^\u001a\u0004\bm\u0010\u0007R\u0016\u0010o\u001a\u00020\u000e8A@\u0000X\u0004¢\u0006\u0006\u001a\u0004\bn\u0010\u0010R\u001b\u00106\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b6\u0010^\u001a\u0004\bp\u0010\u0007R\u0019\u0010/\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b/\u0010^\u001a\u0004\bq\u0010\u0007R!\u0010>\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00168\u0006@\u0006¢\u0006\f\n\u0004\b>\u0010r\u001a\u0004\bs\u0010\u0019R\u001b\u0010H\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bH\u0010^\u001a\u0004\bt\u0010\u0007R\u0019\u00104\u001a\u00020\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010\\\u001a\u0004\b4\u0010\u0010R!\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010r\u001a\u0004\bu\u0010\u0019R\u001b\u0010;\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010^\u001a\u0004\bv\u0010\u0007R\u001b\u0010<\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b<\u0010^\u001a\u0004\bw\u0010\u0007R\u001b\u0010=\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b=\u0010x\u001a\u0004\by\u0010\u001eR\u001b\u0010C\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010x\u001a\u0004\bz\u0010\u001eR\u001b\u00102\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010^\u001a\u0004\b{\u0010\u0007R\u001b\u0010D\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bD\u0010^\u001a\u0004\b|\u0010\u0007R\u001b\u0010G\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bG\u0010^\u001a\u0004\b}\u0010\u0007R\u001b\u0010J\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010^\u001a\u0004\b~\u0010\u0007¨\u0006\u0001"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "toJson", "()Lorg/json/JSONObject;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$UiType;", "component5", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$UiType;", "", "component6", "()Z", "component7", "component8", "component9", "component10", "component11", "", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "component12", "()Ljava/util/List;", "component13", "component14", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "component15", "()Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "component16", "component17", "component18", "component19", "component20", "component21", "component22", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "component23", "()Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "component24", "component25", "component26", "component27", "component28", "serverTransId", "acsTransId", "acsHtml", "acsHtmlRefresh", "uiType", "isChallengeCompleted", "challengeInfoHeader", "challengeInfoLabel", "challengeInfoText", "challengeAdditionalInfoText", "shouldShowChallengeInfoTextIndicator", "challengeSelectOptions", "expandInfoLabel", "expandInfoText", "issuerImage", "messageExtensions", "messageVersion", "oobAppUrl", "oobAppLabel", "oobContinueLabel", "paymentSystemImage", "resendInformationLabel", "sdkTransId", "submitAuthenticationLabel", "whitelistingInfoText", "whyInfoLabel", "whyInfoText", "transStatus", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$UiType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getShouldShowChallengeInfoTextIndicator", "Ljava/lang/String;", "getAcsHtml", "getOobContinueLabel", "getAcsTransId", "getOobAppLabel", "getMessageVersion", "getChallengeAdditionalInfoText", "getSubmitAuthenticationLabel", "getWhyInfoText", "getChallengeInfoHeader", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$UiType;", "getUiType", "getOobAppUrl", "Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;", "getSdkTransId", "getChallengeInfoText", "isValidForUi$3ds2sdk_release", "isValidForUi", "getChallengeInfoLabel", "getServerTransId", "Ljava/util/List;", "getMessageExtensions", "getWhyInfoLabel", "getChallengeSelectOptions", "getExpandInfoLabel", "getExpandInfoText", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "getIssuerImage", "getPaymentSystemImage", "getAcsHtmlRefresh", "getResendInformationLabel", "getWhitelistingInfoText", "getTransStatus", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$UiType;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/transaction/SdkTransactionId;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "ChallengeSelectOption", "Image", "UiType", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeResponseData.kt */
public final class ChallengeResponseData implements Parcelable {
    public static final Parcelable.Creator<ChallengeResponseData> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private static final String FIELD_ACS_COUNTER_ACS_TO_SDK = "acsCounterAtoS";
    private static final String FIELD_ACS_HTML = "acsHTML";
    private static final String FIELD_ACS_HTML_REFRESH = "acsHTMLRefresh";
    private static final String FIELD_ACS_TRANS_ID = "acsTransID";
    private static final String FIELD_ACS_UI_TYPE = "acsUiType";
    private static final String FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT = "challengeAddInfo";
    private static final String FIELD_CHALLENGE_COMPLETION_INDICATOR = "challengeCompletionInd";
    private static final String FIELD_CHALLENGE_INFO_HEADER = "challengeInfoHeader";
    private static final String FIELD_CHALLENGE_INFO_LABEL = "challengeInfoLabel";
    private static final String FIELD_CHALLENGE_INFO_TEXT = "challengeInfoText";
    private static final String FIELD_CHALLENGE_INFO_TEXT_INDICATOR = "challengeInfoTextIndicator";
    private static final String FIELD_CHALLENGE_SELECT_INFO = "challengeSelectInfo";
    private static final String FIELD_EXPAND_INFO_LABEL = "expandInfoLabel";
    private static final String FIELD_EXPAND_INFO_TEXT = "expandInfoText";
    private static final String FIELD_ISSUER_IMAGE = "issuerImage";
    private static final String FIELD_MESSAGE_EXTENSION = "messageExtension";
    private static final String FIELD_MESSAGE_TYPE = "messageType";
    private static final String FIELD_MESSAGE_VERSION = "messageVersion";
    private static final String FIELD_OOB_APP_LABEL = "oobAppLabel";
    private static final String FIELD_OOB_APP_URL = "oobAppURL";
    private static final String FIELD_OOB_CONTINUE_LABEL = "oobContinueLabel";
    private static final String FIELD_PAYMENT_SYSTEM_IMAGE = "psImage";
    private static final String FIELD_RESEND_INFORMATION_LABEL = "resendInformationLabel";
    private static final String FIELD_SDK_TRANS_ID = "sdkTransID";
    private static final String FIELD_SERVER_TRANS_ID = "threeDSServerTransID";
    private static final String FIELD_SUBMIT_AUTHENTICATION_LABEL = "submitAuthenticationLabel";
    private static final String FIELD_TRANS_STATUS = "transStatus";
    private static final String FIELD_WHITELISTING_INFO_TEXT = "whitelistingInfoText";
    private static final String FIELD_WHY_INFO_LABEL = "whyInfoLabel";
    private static final String FIELD_WHY_INFO_TEXT = "whyInfoText";
    /* access modifiers changed from: private */
    public static final Set<String> FINAL_CRES_FIELDS = g.h0("threeDSServerTransID", "acsCounterAtoS", "acsTransID", FIELD_CHALLENGE_COMPLETION_INDICATOR, FIELD_MESSAGE_EXTENSION, "messageType", "messageVersion", "sdkTransID", FIELD_TRANS_STATUS);
    public static final String MESSAGE_TYPE = "CRes";
    private static final String NO_VALUE = "N";
    /* access modifiers changed from: private */
    public static final List<String> YES_NO_VALUES = g.K(YES_VALUE, NO_VALUE);
    private static final String YES_VALUE = "Y";
    private final String acsHtml;
    private final String acsHtmlRefresh;
    private final String acsTransId;
    private final String challengeAdditionalInfoText;
    private final String challengeInfoHeader;
    private final String challengeInfoLabel;
    private final String challengeInfoText;
    private final List<ChallengeSelectOption> challengeSelectOptions;
    private final String expandInfoLabel;
    private final String expandInfoText;
    private final boolean isChallengeCompleted;
    private final Image issuerImage;
    private final List<MessageExtension> messageExtensions;
    private final String messageVersion;
    private final String oobAppLabel;
    private final String oobAppUrl;
    private final String oobContinueLabel;
    private final Image paymentSystemImage;
    private final String resendInformationLabel;
    private final SdkTransactionId sdkTransId;
    private final String serverTransId;
    private final boolean shouldShowChallengeInfoTextIndicator;
    private final String submitAuthenticationLabel;
    private final String transStatus;
    private final UiType uiType;
    private final String whitelistingInfoText;
    private final String whyInfoLabel;
    private final String whyInfoText;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0017\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b \u0010!J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J$\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u0007J\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0010J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0019\u0010\t\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u0007R\u0019\u0010\n\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001f\u0010\u0007¨\u0006#"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "toJson", "()Lorg/json/JSONObject;", "", "component1", "()Ljava/lang/String;", "component2", "name", "text", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "getText", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeResponseData.kt */
    public static final class ChallengeSelectOption implements Parcelable {
        public static final Parcelable.Creator<ChallengeSelectOption> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        private final String name;
        private final String text;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\f\u001a\u0004\u0018\u00010\u00022\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption$Companion;", "", "Lorg/json/JSONArray;", "challengeSelectOptionsJson", "", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "fromJson$3ds2sdk_release", "(Lorg/json/JSONArray;)Ljava/util/List;", "fromJson", "options", "toJsonArray$3ds2sdk_release", "(Ljava/util/List;)Lorg/json/JSONArray;", "toJsonArray", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: ChallengeResponseData.kt */
        public static final class Companion {
            private Companion() {
            }

            public final List<ChallengeSelectOption> fromJson$3ds2sdk_release(JSONArray jSONArray) {
                if (jSONArray == null) {
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                int length = jSONArray.length();
                for (int i = 0; i < length; i++) {
                    JSONObject optJSONObject = jSONArray.optJSONObject(i);
                    if (optJSONObject != null) {
                        String next = optJSONObject.keys().next();
                        String optString = optJSONObject.optString(next);
                        i.d(next, "name");
                        i.d(optString, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
                        arrayList.add(new ChallengeSelectOption(next, optString));
                    }
                }
                return arrayList;
            }

            public final JSONArray toJsonArray$3ds2sdk_release(List<ChallengeSelectOption> list) throws JSONException {
                if (list == null) {
                    return null;
                }
                JSONArray jSONArray = new JSONArray();
                for (ChallengeSelectOption access$toJson : list) {
                    jSONArray.put((Object) access$toJson.toJson());
                }
                return jSONArray;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<ChallengeSelectOption> {
            public final ChallengeSelectOption createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new ChallengeSelectOption(parcel.readString(), parcel.readString());
            }

            public final ChallengeSelectOption[] newArray(int i) {
                return new ChallengeSelectOption[i];
            }
        }

        public ChallengeSelectOption(String str, String str2) {
            i.e(str, "name");
            i.e(str2, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
            this.name = str;
            this.text = str2;
        }

        public static /* synthetic */ ChallengeSelectOption copy$default(ChallengeSelectOption challengeSelectOption, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = challengeSelectOption.name;
            }
            if ((i & 2) != 0) {
                str2 = challengeSelectOption.text;
            }
            return challengeSelectOption.copy(str, str2);
        }

        /* access modifiers changed from: private */
        public final JSONObject toJson() throws JSONException {
            JSONObject put = new JSONObject().put(this.name, (Object) this.text);
            i.d(put, "JSONObject()\n                .put(name, text)");
            return put;
        }

        public final String component1() {
            return this.name;
        }

        public final String component2() {
            return this.text;
        }

        public final ChallengeSelectOption copy(String str, String str2) {
            i.e(str, "name");
            i.e(str2, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
            return new ChallengeSelectOption(str, str2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ChallengeSelectOption)) {
                return false;
            }
            ChallengeSelectOption challengeSelectOption = (ChallengeSelectOption) obj;
            return i.a(this.name, challengeSelectOption.name) && i.a(this.text, challengeSelectOption.text);
        }

        public final String getName() {
            return this.name;
        }

        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.name;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.text;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("ChallengeSelectOption(name=");
            P0.append(this.name);
            P0.append(", text=");
            return a.y0(P0, this.text, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.name);
            parcel.writeString(this.text);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0010\"\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\bd\u0010eJ\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J'\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010!\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\u001f\u0010 J\u0019\u0010%\u001a\u0004\u0018\u00010\"2\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b#\u0010$J\u0017\u0010'\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b&\u0010 J\u001f\u0010+\u001a\u00020(2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0001¢\u0006\u0004\b)\u0010*J\u0017\u0010/\u001a\u00020,2\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b-\u0010.J!\u00103\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0016H\u0000¢\u0006\u0004\b1\u00102J!\u00105\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0016H\u0001¢\u0006\u0004\b4\u00102J!\u00107\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u0016H\u0001¢\u0006\u0004\b6\u00102J\u001f\u0010<\u001a\n\u0012\u0004\u0012\u000209\u0018\u0001082\u0006\u0010\u000b\u001a\u00020\u0006H\u0001¢\u0006\u0004\b:\u0010;R\u0016\u0010=\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010?\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b?\u0010>R\u0016\u0010@\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b@\u0010>R\u0016\u0010A\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bA\u0010>R\u0016\u0010B\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bB\u0010>R\u0016\u0010C\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bC\u0010>R\u0016\u0010D\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bD\u0010>R\u0016\u0010E\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bE\u0010>R\u0016\u0010F\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bF\u0010>R\u0016\u0010G\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bG\u0010>R\u0016\u0010H\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bH\u0010>R\u0016\u0010I\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bI\u0010>R\u0016\u0010J\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bJ\u0010>R\u0016\u0010K\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bK\u0010>R\u0016\u0010L\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bL\u0010>R\u0016\u0010M\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bM\u0010>R\u0016\u0010N\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bN\u0010>R\u0016\u0010O\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bO\u0010>R\u0016\u0010P\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bP\u0010>R\u0016\u0010Q\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bQ\u0010>R\u0016\u0010R\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bR\u0010>R\u0016\u0010S\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bS\u0010>R\u0016\u0010T\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bT\u0010>R\u0016\u0010U\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bU\u0010>R\u0016\u0010V\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bV\u0010>R\u0016\u0010W\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bW\u0010>R\u0016\u0010X\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bX\u0010>R\u0016\u0010Y\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bY\u0010>R\u0016\u0010Z\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bZ\u0010>R\u0016\u0010[\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b[\u0010>R\u001c\u0010]\u001a\b\u0012\u0004\u0012\u00020\u00020\\8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010_\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b_\u0010>R\u0016\u0010`\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b`\u0010>R\u001c\u0010a\u001a\b\u0012\u0004\u0012\u00020\u0002088\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0016\u0010c\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\bc\u0010>¨\u0006f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Companion;", "", "", "encodedHtml", "decodeHtml", "(Ljava/lang/String;)Ljava/lang/String;", "Lorg/json/JSONObject;", "json", "fieldName", "getOrNull", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/lang/String;", "cresJson", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "fromJson$3ds2sdk_release", "(Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData;", "fromJson", "Lm0/i;", "checkFinalCresFields$3ds2sdk_release", "(Lorg/json/JSONObject;)V", "checkFinalCresFields", "checkMessageType$3ds2sdk_release", "checkMessageType", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$UiType;", "getUiType$3ds2sdk_release", "(Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$UiType;", "getUiType", "", "isRequired", "getYesNoValue$3ds2sdk_release", "(Lorg/json/JSONObject;Ljava/lang/String;Z)Z", "getYesNoValue", "getResendInformationLabel$3ds2sdk_release", "(Lorg/json/JSONObject;)Ljava/lang/String;", "getResendInformationLabel", "Lorg/json/JSONArray;", "getChallengeSelectInfoArray$3ds2sdk_release", "(Lorg/json/JSONObject;)Lorg/json/JSONArray;", "getChallengeSelectInfoArray", "getMessageVersion$3ds2sdk_release", "getMessageVersion", "Ljava/util/UUID;", "getTransactionId$3ds2sdk_release", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/UUID;", "getTransactionId", "Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;", "getTransStatus$3ds2sdk_release", "(Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transaction/TransactionStatus;", "getTransStatus", "uiType", "getSubmitAuthenticationLabel$3ds2sdk_release", "(Lorg/json/JSONObject;Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$UiType;)Ljava/lang/String;", "getSubmitAuthenticationLabel", "getDecodedAcsHtml$3ds2sdk_release", "getDecodedAcsHtml", "getOobContinueLabel$3ds2sdk_release", "getOobContinueLabel", "", "Lcom/stripe/android/stripe3ds2/transactions/MessageExtension;", "getMessageExtensions$3ds2sdk_release", "(Lorg/json/JSONObject;)Ljava/util/List;", "getMessageExtensions", "FIELD_ACS_COUNTER_ACS_TO_SDK", "Ljava/lang/String;", "FIELD_ACS_HTML", "FIELD_ACS_HTML_REFRESH", "FIELD_ACS_TRANS_ID", "FIELD_ACS_UI_TYPE", "FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT", "FIELD_CHALLENGE_COMPLETION_INDICATOR", "FIELD_CHALLENGE_INFO_HEADER", "FIELD_CHALLENGE_INFO_LABEL", "FIELD_CHALLENGE_INFO_TEXT", "FIELD_CHALLENGE_INFO_TEXT_INDICATOR", "FIELD_CHALLENGE_SELECT_INFO", "FIELD_EXPAND_INFO_LABEL", "FIELD_EXPAND_INFO_TEXT", "FIELD_ISSUER_IMAGE", "FIELD_MESSAGE_EXTENSION", "FIELD_MESSAGE_TYPE", "FIELD_MESSAGE_VERSION", "FIELD_OOB_APP_LABEL", "FIELD_OOB_APP_URL", "FIELD_OOB_CONTINUE_LABEL", "FIELD_PAYMENT_SYSTEM_IMAGE", "FIELD_RESEND_INFORMATION_LABEL", "FIELD_SDK_TRANS_ID", "FIELD_SERVER_TRANS_ID", "FIELD_SUBMIT_AUTHENTICATION_LABEL", "FIELD_TRANS_STATUS", "FIELD_WHITELISTING_INFO_TEXT", "FIELD_WHY_INFO_LABEL", "FIELD_WHY_INFO_TEXT", "", "FINAL_CRES_FIELDS", "Ljava/util/Set;", "MESSAGE_TYPE", "NO_VALUE", "YES_NO_VALUES", "Ljava/util/List;", "YES_VALUE", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeResponseData.kt */
    public static final class Companion {
        private Companion() {
        }

        private final String decodeHtml(String str) {
            Object obj;
            Object obj2 = null;
            if (str == null) {
                return null;
            }
            Companion companion = ChallengeResponseData.Companion;
            try {
                byte[] decode = Base64.decode(str, 8);
                i.d(decode, "Base64.decode(encodedHtml, Base64.URL_SAFE)");
                obj = new String(decode, m0.t.a.a);
            } catch (Throwable th) {
                obj = h.l0(th);
            }
            if (!(obj instanceof Result.Failure)) {
                obj2 = obj;
            }
            return (String) obj2;
        }

        private final String getOrNull(JSONObject jSONObject, String str) {
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }

        public final void checkFinalCresFields$3ds2sdk_release(JSONObject jSONObject) throws ChallengeResponseParseException {
            i.e(jSONObject, "cresJson");
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!ChallengeResponseData.FINAL_CRES_FIELDS.contains(next)) {
                    throw new ChallengeResponseParseException(ProtocolError.InvalidMessageReceived.getCode(), "Message is not final CRes", a.n0("Invalid data element for final CRes: ", next));
                }
            }
        }

        public final void checkMessageType$3ds2sdk_release(JSONObject jSONObject) throws ChallengeResponseParseException {
            i.e(jSONObject, "cresJson");
            if (!i.a(ChallengeResponseData.MESSAGE_TYPE, jSONObject.optString("messageType"))) {
                throw new ChallengeResponseParseException(ProtocolError.InvalidMessageReceived.getCode(), "Message is not CRes", "Invalid Message Type");
            }
        }

        public final ChallengeResponseData fromJson$3ds2sdk_release(JSONObject jSONObject) throws ChallengeResponseParseException {
            ChallengeResponseData challengeResponseData;
            JSONObject jSONObject2 = jSONObject;
            i.e(jSONObject2, "cresJson");
            checkMessageType$3ds2sdk_release(jSONObject);
            boolean yesNoValue$3ds2sdk_release = getYesNoValue$3ds2sdk_release(jSONObject2, ChallengeResponseData.FIELD_CHALLENGE_COMPLETION_INDICATOR, true);
            SdkTransactionId sdkTransactionId = new SdkTransactionId(getTransactionId$3ds2sdk_release(jSONObject2, "sdkTransID"));
            String uuid = getTransactionId$3ds2sdk_release(jSONObject2, "threeDSServerTransID").toString();
            i.d(uuid, "getTransactionId(cresJso…RVER_TRANS_ID).toString()");
            String uuid2 = getTransactionId$3ds2sdk_release(jSONObject2, "acsTransID").toString();
            i.d(uuid2, "getTransactionId(cresJso…_ACS_TRANS_ID).toString()");
            String messageVersion$3ds2sdk_release = getMessageVersion$3ds2sdk_release(jSONObject);
            List<MessageExtension> messageExtensions$3ds2sdk_release = getMessageExtensions$3ds2sdk_release(jSONObject);
            if (yesNoValue$3ds2sdk_release) {
                checkFinalCresFields$3ds2sdk_release(jSONObject);
                challengeResponseData = new ChallengeResponseData(uuid, uuid2, (String) null, (String) null, (UiType) null, yesNoValue$3ds2sdk_release, (String) null, (String) null, (String) null, (String) null, false, (List) null, (String) null, (String) null, (Image) null, messageExtensions$3ds2sdk_release, messageVersion$3ds2sdk_release, (String) null, (String) null, (String) null, (Image) null, (String) null, sdkTransactionId, (String) null, (String) null, (String) null, (String) null, getTransStatus$3ds2sdk_release(jSONObject).getCode(), 129925084, (f) null);
            } else {
                boolean yesNoValue$3ds2sdk_release2 = getYesNoValue$3ds2sdk_release(jSONObject2, ChallengeResponseData.FIELD_CHALLENGE_INFO_TEXT_INDICATOR, false);
                String resendInformationLabel$3ds2sdk_release = getResendInformationLabel$3ds2sdk_release(jSONObject);
                JSONArray challengeSelectInfoArray$3ds2sdk_release = getChallengeSelectInfoArray$3ds2sdk_release(jSONObject);
                UiType uiType$3ds2sdk_release = getUiType$3ds2sdk_release(jSONObject);
                String submitAuthenticationLabel$3ds2sdk_release = getSubmitAuthenticationLabel$3ds2sdk_release(jSONObject2, uiType$3ds2sdk_release);
                String decodedAcsHtml$3ds2sdk_release = getDecodedAcsHtml$3ds2sdk_release(jSONObject2, uiType$3ds2sdk_release);
                String oobContinueLabel$3ds2sdk_release = getOobContinueLabel$3ds2sdk_release(jSONObject2, uiType$3ds2sdk_release);
                List<ChallengeSelectOption> fromJson$3ds2sdk_release = ChallengeSelectOption.Companion.fromJson$3ds2sdk_release(challengeSelectInfoArray$3ds2sdk_release);
                String decodeHtml = decodeHtml(jSONObject2.optString(ChallengeResponseData.FIELD_ACS_HTML_REFRESH));
                String optString = jSONObject2.optString(ChallengeResponseData.FIELD_CHALLENGE_INFO_HEADER);
                String optString2 = jSONObject2.optString(ChallengeResponseData.FIELD_CHALLENGE_INFO_LABEL);
                String optString3 = jSONObject2.optString(ChallengeResponseData.FIELD_CHALLENGE_INFO_TEXT);
                String optString4 = jSONObject2.optString(ChallengeResponseData.FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT);
                String optString5 = jSONObject2.optString(ChallengeResponseData.FIELD_EXPAND_INFO_LABEL);
                String optString6 = jSONObject2.optString(ChallengeResponseData.FIELD_EXPAND_INFO_TEXT);
                Image.Companion companion = Image.Companion;
                ChallengeResponseData challengeResponseData2 = r4;
                ChallengeResponseData challengeResponseData3 = new ChallengeResponseData(uuid, uuid2, decodedAcsHtml$3ds2sdk_release, decodeHtml, uiType$3ds2sdk_release, yesNoValue$3ds2sdk_release, optString, optString2, optString3, optString4, yesNoValue$3ds2sdk_release2, fromJson$3ds2sdk_release, optString5, optString6, companion.fromJson$3ds2sdk_release(jSONObject2.optJSONObject(ChallengeResponseData.FIELD_ISSUER_IMAGE)), messageExtensions$3ds2sdk_release, messageVersion$3ds2sdk_release, jSONObject2.optString(ChallengeResponseData.FIELD_OOB_APP_URL), jSONObject2.optString(ChallengeResponseData.FIELD_OOB_APP_LABEL), oobContinueLabel$3ds2sdk_release, companion.fromJson$3ds2sdk_release(jSONObject2.optJSONObject(ChallengeResponseData.FIELD_PAYMENT_SYSTEM_IMAGE)), resendInformationLabel$3ds2sdk_release, sdkTransactionId, submitAuthenticationLabel$3ds2sdk_release, jSONObject2.optString(ChallengeResponseData.FIELD_WHITELISTING_INFO_TEXT), jSONObject2.optString(ChallengeResponseData.FIELD_WHY_INFO_LABEL), jSONObject2.optString(ChallengeResponseData.FIELD_WHY_INFO_TEXT), "");
                challengeResponseData = challengeResponseData2;
            }
            if (challengeResponseData.isValidForUi$3ds2sdk_release()) {
                return challengeResponseData;
            }
            throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing("UI fields missing");
        }

        public final JSONArray getChallengeSelectInfoArray$3ds2sdk_release(JSONObject jSONObject) throws ChallengeResponseParseException {
            Object obj;
            i.e(jSONObject, "cresJson");
            if (!jSONObject.has(ChallengeResponseData.FIELD_CHALLENGE_SELECT_INFO)) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                return null;
            }
            Companion companion = ChallengeResponseData.Companion;
            try {
                obj = jSONObject.getJSONArray(ChallengeResponseData.FIELD_CHALLENGE_SELECT_INFO);
            } catch (Throwable th) {
                obj = h.l0(th);
            }
            if (Result.a(obj) == null) {
                return (JSONArray) obj;
            }
            throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(ChallengeResponseData.FIELD_CHALLENGE_SELECT_INFO);
        }

        public final String getDecodedAcsHtml$3ds2sdk_release(JSONObject jSONObject, UiType uiType) throws ChallengeResponseParseException {
            i.e(jSONObject, "cresJson");
            i.e(uiType, "uiType");
            String orNull = getOrNull(jSONObject, ChallengeResponseData.FIELD_ACS_HTML);
            if (!(orNull == null || StringsKt__IndentKt.o(orNull)) || uiType != UiType.HTML) {
                return decodeHtml(orNull);
            }
            throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(ChallengeResponseData.FIELD_ACS_HTML);
        }

        public final List<MessageExtension> getMessageExtensions$3ds2sdk_release(JSONObject jSONObject) throws ChallengeResponseParseException {
            i.e(jSONObject, "cresJson");
            List<MessageExtension> fromJson = MessageExtension.Companion.fromJson(jSONObject.optJSONArray(ChallengeResponseData.FIELD_MESSAGE_EXTENSION));
            if (fromJson != null) {
                ArrayList arrayList = new ArrayList();
                Iterator<T> it = fromJson.iterator();
                while (true) {
                    boolean z = true;
                    if (!it.hasNext()) {
                        break;
                    }
                    T next = it.next();
                    MessageExtension messageExtension = (MessageExtension) next;
                    if (!messageExtension.getCriticalityIndicator() || messageExtension.isProcessable()) {
                        z = false;
                    }
                    if (z) {
                        arrayList.add(next);
                    }
                }
                if (!arrayList.isEmpty()) {
                    throw new ChallengeResponseParseException(ProtocolError.UnrecognizedCriticalMessageExtensions, g.E(arrayList, InstabugDbContract.COMMA_SEP, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62));
                }
            }
            return fromJson;
        }

        public final String getMessageVersion$3ds2sdk_release(JSONObject jSONObject) throws ChallengeResponseParseException {
            i.e(jSONObject, "cresJson");
            String optString = jSONObject.optString("messageVersion");
            i.d(optString, "it");
            if (!(!StringsKt__IndentKt.o(optString))) {
                optString = null;
            }
            if (optString != null) {
                return optString;
            }
            throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing("messageVersion");
        }

        public final String getOobContinueLabel$3ds2sdk_release(JSONObject jSONObject, UiType uiType) throws ChallengeResponseParseException {
            i.e(jSONObject, "cresJson");
            i.e(uiType, "uiType");
            String optString = jSONObject.optString(ChallengeResponseData.FIELD_OOB_CONTINUE_LABEL);
            if (!(optString == null || StringsKt__IndentKt.o(optString)) || uiType != UiType.OOB) {
                return optString;
            }
            throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(ChallengeResponseData.FIELD_OOB_CONTINUE_LABEL);
        }

        public final String getResendInformationLabel$3ds2sdk_release(JSONObject jSONObject) throws ChallengeResponseParseException {
            i.e(jSONObject, "cresJson");
            String orNull = getOrNull(jSONObject, ChallengeResponseData.FIELD_RESEND_INFORMATION_LABEL);
            if (orNull != null) {
                if (orNull.length() == 0) {
                    throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(ChallengeResponseData.FIELD_RESEND_INFORMATION_LABEL);
                }
            }
            return orNull;
        }

        public final String getSubmitAuthenticationLabel$3ds2sdk_release(JSONObject jSONObject, UiType uiType) throws ChallengeResponseParseException {
            i.e(jSONObject, "cresJson");
            i.e(uiType, "uiType");
            String orNull = getOrNull(jSONObject, ChallengeResponseData.FIELD_SUBMIT_AUTHENTICATION_LABEL);
            if (!(orNull == null || StringsKt__IndentKt.o(orNull)) || !uiType.getRequiresSubmitButton$3ds2sdk_release()) {
                return orNull;
            }
            throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(ChallengeResponseData.FIELD_SUBMIT_AUTHENTICATION_LABEL);
        }

        public final TransactionStatus getTransStatus$3ds2sdk_release(JSONObject jSONObject) throws ChallengeResponseParseException {
            i.e(jSONObject, "cresJson");
            String optString = jSONObject.optString(ChallengeResponseData.FIELD_TRANS_STATUS);
            if (!(optString == null || StringsKt__IndentKt.o(optString))) {
                TransactionStatus fromCode = TransactionStatus.Companion.fromCode(optString);
                if (fromCode != null) {
                    return fromCode;
                }
                throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(ChallengeResponseData.FIELD_TRANS_STATUS);
            }
            throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(ChallengeResponseData.FIELD_TRANS_STATUS);
        }

        public final UUID getTransactionId$3ds2sdk_release(JSONObject jSONObject, String str) throws ChallengeResponseParseException {
            i.e(jSONObject, "cresJson");
            i.e(str, "fieldName");
            String optString = jSONObject.optString(str);
            if (!(optString == null || StringsKt__IndentKt.o(optString))) {
                try {
                    UUID fromString = UUID.fromString(optString);
                    i.d(fromString, "UUID.fromString(transId)");
                    return fromString;
                } catch (Throwable th) {
                    if (Result.a(h.l0(th)) == null) {
                        throw new KotlinNothingValueException();
                    }
                    throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(str);
                }
            } else {
                throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(str);
            }
        }

        public final UiType getUiType$3ds2sdk_release(JSONObject jSONObject) throws ChallengeResponseParseException {
            i.e(jSONObject, "cresJson");
            String optString = jSONObject.optString(ChallengeResponseData.FIELD_ACS_UI_TYPE);
            if (!(optString == null || StringsKt__IndentKt.o(optString))) {
                UiType fromCode$3ds2sdk_release = UiType.Companion.fromCode$3ds2sdk_release(optString);
                if (fromCode$3ds2sdk_release != null) {
                    return fromCode$3ds2sdk_release;
                }
                throw ChallengeResponseParseException.Companion.createInvalidDataElementFormat(ChallengeResponseData.FIELD_ACS_UI_TYPE);
            }
            throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(ChallengeResponseData.FIELD_ACS_UI_TYPE);
        }

        public final boolean getYesNoValue$3ds2sdk_release(JSONObject jSONObject, String str, boolean z) throws ChallengeResponseParseException {
            String str2;
            ChallengeResponseParseException challengeResponseParseException;
            i.e(jSONObject, "cresJson");
            i.e(str, "fieldName");
            if (!z) {
                str2 = getOrNull(jSONObject, str);
            } else if (jSONObject.has(str)) {
                str2 = jSONObject.getString(str);
            } else {
                throw ChallengeResponseParseException.Companion.createRequiredDataElementMissing(str);
            }
            if (str2 == null || ChallengeResponseData.YES_NO_VALUES.contains(str2)) {
                return i.a(ChallengeResponseData.YES_VALUE, str2);
            }
            if (!z || !StringsKt__IndentKt.o(str2)) {
                challengeResponseParseException = ChallengeResponseParseException.Companion.createInvalidDataElementFormat(str);
            } else {
                challengeResponseParseException = ChallengeResponseParseException.Companion.createRequiredDataElementMissing(str);
            }
            throw challengeResponseParseException;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<ChallengeResponseData> {
        public final ChallengeResponseData createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Parcel parcel2 = parcel;
            i.e(parcel2, "in");
            String readString = parcel.readString();
            String readString2 = parcel.readString();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            UiType uiType = parcel.readInt() != 0 ? (UiType) Enum.valueOf(UiType.class, parcel.readString()) : null;
            boolean z = parcel.readInt() != 0;
            String readString5 = parcel.readString();
            String readString6 = parcel.readString();
            String readString7 = parcel.readString();
            String readString8 = parcel.readString();
            boolean z2 = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(readInt);
                while (readInt != 0) {
                    arrayList3.add(ChallengeSelectOption.CREATOR.createFromParcel(parcel2));
                    readInt--;
                }
                arrayList = arrayList3;
            } else {
                arrayList = null;
            }
            String readString9 = parcel.readString();
            String readString10 = parcel.readString();
            Image createFromParcel = parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel2) : null;
            if (parcel.readInt() != 0) {
                int readInt2 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(readInt2);
                while (readInt2 != 0) {
                    arrayList4.add(MessageExtension.CREATOR.createFromParcel(parcel2));
                    readInt2--;
                }
                arrayList2 = arrayList4;
            } else {
                arrayList2 = null;
            }
            return new ChallengeResponseData(readString, readString2, readString3, readString4, uiType, z, readString5, readString6, readString7, readString8, z2, arrayList, readString9, readString10, createFromParcel, arrayList2, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Image.CREATOR.createFromParcel(parcel2) : null, parcel.readString(), SdkTransactionId.CREATOR.createFromParcel(parcel2), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        public final ChallengeResponseData[] newArray(int i) {
            return new ChallengeResponseData[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u0000 .2\u00020\u0001:\u0001.B)\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b,\u0010-J\u000f\u0010\u0005\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\r\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bHÀ\u0003¢\u0006\u0004\b\u0010\u0010\fJ4\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\fJ\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0019J \u0010$\u001a\u00020#2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b$\u0010%R\u001e\u0010\u0012\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0012\u0010&\u001a\u0004\b'\u0010\fR\u0015\u0010)\u001a\u0004\u0018\u00010\b8F@\u0006¢\u0006\u0006\u001a\u0004\b(\u0010\fR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010&\u001a\u0004\b*\u0010\fR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b+\u0010\f¨\u0006/"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "Landroid/os/Parcelable;", "Lorg/json/JSONObject;", "toJson$3ds2sdk_release", "()Lorg/json/JSONObject;", "toJson", "", "density", "", "getUrlForDensity", "(I)Ljava/lang/String;", "component1$3ds2sdk_release", "()Ljava/lang/String;", "component1", "component2$3ds2sdk_release", "component2", "component3$3ds2sdk_release", "component3", "mediumUrl", "highUrl", "extraHighUrl", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMediumUrl$3ds2sdk_release", "getHighestFidelityImageUrl", "highestFidelityImageUrl", "getHighUrl$3ds2sdk_release", "getExtraHighUrl$3ds2sdk_release", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeResponseData.kt */
    public static final class Image implements Parcelable {
        public static final Parcelable.Creator<Image> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        private static final String FIELD_EXTRA_HIGH = "extraHigh";
        private static final String FIELD_HIGH = "high";
        private static final String FIELD_MEDIUM = "medium";
        private final String extraHighUrl;
        private final String highUrl;
        private final String mediumUrl;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\nR\u0016\u0010\f\u001a\u00020\b8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\n¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image$Companion;", "", "Lorg/json/JSONObject;", "imageJson", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "fromJson$3ds2sdk_release", "(Lorg/json/JSONObject;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$Image;", "fromJson", "", "FIELD_EXTRA_HIGH", "Ljava/lang/String;", "FIELD_HIGH", "FIELD_MEDIUM", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: ChallengeResponseData.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Image fromJson$3ds2sdk_release(JSONObject jSONObject) {
                if (jSONObject != null) {
                    return new Image(jSONObject.optString(Image.FIELD_MEDIUM), jSONObject.optString(Image.FIELD_HIGH), jSONObject.optString(Image.FIELD_EXTRA_HIGH));
                }
                return null;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Image> {
            public final Image createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Image(parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final Image[] newArray(int i) {
                return new Image[i];
            }
        }

        public Image(String str, String str2, String str3) {
            this.mediumUrl = str;
            this.highUrl = str2;
            this.extraHighUrl = str3;
        }

        public static /* synthetic */ Image copy$default(Image image, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = image.mediumUrl;
            }
            if ((i & 2) != 0) {
                str2 = image.highUrl;
            }
            if ((i & 4) != 0) {
                str3 = image.extraHighUrl;
            }
            return image.copy(str, str2, str3);
        }

        public final String component1$3ds2sdk_release() {
            return this.mediumUrl;
        }

        public final String component2$3ds2sdk_release() {
            return this.highUrl;
        }

        public final String component3$3ds2sdk_release() {
            return this.extraHighUrl;
        }

        public final Image copy(String str, String str2, String str3) {
            return new Image(str, str2, str3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Image)) {
                return false;
            }
            Image image = (Image) obj;
            return i.a(this.mediumUrl, image.mediumUrl) && i.a(this.highUrl, image.highUrl) && i.a(this.extraHighUrl, image.extraHighUrl);
        }

        public final String getExtraHighUrl$3ds2sdk_release() {
            return this.extraHighUrl;
        }

        public final String getHighUrl$3ds2sdk_release() {
            return this.highUrl;
        }

        public final String getHighestFidelityImageUrl() {
            Object obj;
            Iterator it = g.K(this.extraHighUrl, this.highUrl, this.mediumUrl).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                String str = (String) obj;
                if (!(str == null || StringsKt__IndentKt.o(str))) {
                    break;
                }
            }
            return (String) obj;
        }

        public final String getMediumUrl$3ds2sdk_release() {
            return this.mediumUrl;
        }

        public final String getUrlForDensity(int i) {
            String str;
            if (i <= 160) {
                str = this.mediumUrl;
            } else if (i >= 320) {
                str = this.extraHighUrl;
            } else {
                str = this.highUrl;
            }
            if (str == null || StringsKt__IndentKt.o(str)) {
                str = null;
            }
            return str != null ? str : getHighestFidelityImageUrl();
        }

        public int hashCode() {
            String str = this.mediumUrl;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.highUrl;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.extraHighUrl;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public final JSONObject toJson$3ds2sdk_release() throws JSONException {
            JSONObject put = new JSONObject().put(FIELD_MEDIUM, (Object) this.mediumUrl).put(FIELD_HIGH, (Object) this.highUrl).put(FIELD_EXTRA_HIGH, (Object) this.extraHighUrl);
            i.d(put, "JSONObject()\n           …EXTRA_HIGH, extraHighUrl)");
            return put;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Image(mediumUrl=");
            P0.append(this.mediumUrl);
            P0.append(", highUrl=");
            P0.append(this.highUrl);
            P0.append(", extraHighUrl=");
            return a.y0(P0, this.extraHighUrl, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.mediumUrl);
            parcel.writeString(this.highUrl);
            parcel.writeString(this.extraHighUrl);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Image(String str, String str2, String str3, int i, f fVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, str3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\r\b\u0001\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0013B#\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0019\u0010\b\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\r\u001a\u00020\f8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$UiType;", "", "Lcom/ults/listeners/ChallengeType;", "challengeType", "Lcom/ults/listeners/ChallengeType;", "getChallengeType", "()Lcom/ults/listeners/ChallengeType;", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "", "requiresSubmitButton", "Z", "getRequiresSubmitButton$3ds2sdk_release", "()Z", "<init>", "(Ljava/lang/String;ILjava/lang/String;Lcom/ults/listeners/ChallengeType;Z)V", "Companion", "TEXT", "SINGLE_SELECT", "MULTI_SELECT", "OOB", "HTML", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeResponseData.kt */
    public enum UiType {
        TEXT("01", ChallengeType.SINGLE_TEXT_INPUT, true),
        SINGLE_SELECT("02", ChallengeType.SINGLE_SELECT, true),
        MULTI_SELECT("03", ChallengeType.MULTI_SELECT, true),
        OOB("04", ChallengeType.OUT_OF_BAND, false, 4, (boolean) null),
        HTML("05", ChallengeType.HTML_UI, false, 4, (boolean) null);
        
        public static final Companion Companion = null;
        private final ChallengeType challengeType;
        private final String code;
        private final boolean requiresSubmitButton;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$UiType$Companion;", "", "", "code", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$UiType;", "fromCode$3ds2sdk_release", "(Ljava/lang/String;)Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$UiType;", "fromCode", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: ChallengeResponseData.kt */
        public static final class Companion {
            private Companion() {
            }

            public final UiType fromCode$3ds2sdk_release(String str) {
                UiType[] values = UiType.values();
                for (int i = 0; i < 5; i++) {
                    UiType uiType = values[i];
                    if (i.a(str, uiType.getCode())) {
                        return uiType;
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

        private UiType(String str, ChallengeType challengeType2, boolean z) {
            this.code = str;
            this.challengeType = challengeType2;
            this.requiresSubmitButton = z;
        }

        public final ChallengeType getChallengeType() {
            return this.challengeType;
        }

        public final String getCode() {
            return this.code;
        }

        public final boolean getRequiresSubmitButton$3ds2sdk_release() {
            return this.requiresSubmitButton;
        }
    }

    public ChallengeResponseData(String str, String str2, String str3, String str4, UiType uiType2, boolean z, String str5, String str6, String str7, String str8, boolean z2, List<ChallengeSelectOption> list, String str9, String str10, Image image, List<MessageExtension> list2, String str11, String str12, String str13, String str14, Image image2, String str15, SdkTransactionId sdkTransactionId, String str16, String str17, String str18, String str19, String str20) {
        String str21 = str11;
        SdkTransactionId sdkTransactionId2 = sdkTransactionId;
        i.e(str, "serverTransId");
        i.e(str2, "acsTransId");
        i.e(str21, "messageVersion");
        i.e(sdkTransactionId2, "sdkTransId");
        this.serverTransId = str;
        this.acsTransId = str2;
        this.acsHtml = str3;
        this.acsHtmlRefresh = str4;
        this.uiType = uiType2;
        this.isChallengeCompleted = z;
        this.challengeInfoHeader = str5;
        this.challengeInfoLabel = str6;
        this.challengeInfoText = str7;
        this.challengeAdditionalInfoText = str8;
        this.shouldShowChallengeInfoTextIndicator = z2;
        this.challengeSelectOptions = list;
        this.expandInfoLabel = str9;
        this.expandInfoText = str10;
        this.issuerImage = image;
        this.messageExtensions = list2;
        this.messageVersion = str21;
        this.oobAppUrl = str12;
        this.oobAppLabel = str13;
        this.oobContinueLabel = str14;
        this.paymentSystemImage = image2;
        this.resendInformationLabel = str15;
        this.sdkTransId = sdkTransactionId2;
        this.submitAuthenticationLabel = str16;
        this.whitelistingInfoText = str17;
        this.whyInfoLabel = str18;
        this.whyInfoText = str19;
        this.transStatus = str20;
    }

    public static /* synthetic */ ChallengeResponseData copy$default(ChallengeResponseData challengeResponseData, String str, String str2, String str3, String str4, UiType uiType2, boolean z, String str5, String str6, String str7, String str8, boolean z2, List list, String str9, String str10, Image image, List list2, String str11, String str12, String str13, String str14, Image image2, String str15, SdkTransactionId sdkTransactionId, String str16, String str17, String str18, String str19, String str20, int i, Object obj) {
        ChallengeResponseData challengeResponseData2 = challengeResponseData;
        int i2 = i;
        return challengeResponseData.copy((i2 & 1) != 0 ? challengeResponseData2.serverTransId : str, (i2 & 2) != 0 ? challengeResponseData2.acsTransId : str2, (i2 & 4) != 0 ? challengeResponseData2.acsHtml : str3, (i2 & 8) != 0 ? challengeResponseData2.acsHtmlRefresh : str4, (i2 & 16) != 0 ? challengeResponseData2.uiType : uiType2, (i2 & 32) != 0 ? challengeResponseData2.isChallengeCompleted : z, (i2 & 64) != 0 ? challengeResponseData2.challengeInfoHeader : str5, (i2 & 128) != 0 ? challengeResponseData2.challengeInfoLabel : str6, (i2 & 256) != 0 ? challengeResponseData2.challengeInfoText : str7, (i2 & 512) != 0 ? challengeResponseData2.challengeAdditionalInfoText : str8, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? challengeResponseData2.shouldShowChallengeInfoTextIndicator : z2, (i2 & 2048) != 0 ? challengeResponseData2.challengeSelectOptions : list, (i2 & 4096) != 0 ? challengeResponseData2.expandInfoLabel : str9, (i2 & 8192) != 0 ? challengeResponseData2.expandInfoText : str10, (i2 & 16384) != 0 ? challengeResponseData2.issuerImage : image, (i2 & 32768) != 0 ? challengeResponseData2.messageExtensions : list2, (i2 & 65536) != 0 ? challengeResponseData2.messageVersion : str11, (i2 & 131072) != 0 ? challengeResponseData2.oobAppUrl : str12, (i2 & 262144) != 0 ? challengeResponseData2.oobAppLabel : str13, (i2 & 524288) != 0 ? challengeResponseData2.oobContinueLabel : str14, (i2 & 1048576) != 0 ? challengeResponseData2.paymentSystemImage : image2, (i2 & 2097152) != 0 ? challengeResponseData2.resendInformationLabel : str15, (i2 & 4194304) != 0 ? challengeResponseData2.sdkTransId : sdkTransactionId, (i2 & 8388608) != 0 ? challengeResponseData2.submitAuthenticationLabel : str16, (i2 & 16777216) != 0 ? challengeResponseData2.whitelistingInfoText : str17, (i2 & 33554432) != 0 ? challengeResponseData2.whyInfoLabel : str18, (i2 & 67108864) != 0 ? challengeResponseData2.whyInfoText : str19, (i2 & 134217728) != 0 ? challengeResponseData2.transStatus : str20);
    }

    public final String component1() {
        return this.serverTransId;
    }

    public final String component10() {
        return this.challengeAdditionalInfoText;
    }

    public final boolean component11() {
        return this.shouldShowChallengeInfoTextIndicator;
    }

    public final List<ChallengeSelectOption> component12() {
        return this.challengeSelectOptions;
    }

    public final String component13() {
        return this.expandInfoLabel;
    }

    public final String component14() {
        return this.expandInfoText;
    }

    public final Image component15() {
        return this.issuerImage;
    }

    public final List<MessageExtension> component16() {
        return this.messageExtensions;
    }

    public final String component17() {
        return this.messageVersion;
    }

    public final String component18() {
        return this.oobAppUrl;
    }

    public final String component19() {
        return this.oobAppLabel;
    }

    public final String component2() {
        return this.acsTransId;
    }

    public final String component20() {
        return this.oobContinueLabel;
    }

    public final Image component21() {
        return this.paymentSystemImage;
    }

    public final String component22() {
        return this.resendInformationLabel;
    }

    public final SdkTransactionId component23() {
        return this.sdkTransId;
    }

    public final String component24() {
        return this.submitAuthenticationLabel;
    }

    public final String component25() {
        return this.whitelistingInfoText;
    }

    public final String component26() {
        return this.whyInfoLabel;
    }

    public final String component27() {
        return this.whyInfoText;
    }

    public final String component28() {
        return this.transStatus;
    }

    public final String component3() {
        return this.acsHtml;
    }

    public final String component4() {
        return this.acsHtmlRefresh;
    }

    public final UiType component5() {
        return this.uiType;
    }

    public final boolean component6() {
        return this.isChallengeCompleted;
    }

    public final String component7() {
        return this.challengeInfoHeader;
    }

    public final String component8() {
        return this.challengeInfoLabel;
    }

    public final String component9() {
        return this.challengeInfoText;
    }

    public final ChallengeResponseData copy(String str, String str2, String str3, String str4, UiType uiType2, boolean z, String str5, String str6, String str7, String str8, boolean z2, List<ChallengeSelectOption> list, String str9, String str10, Image image, List<MessageExtension> list2, String str11, String str12, String str13, String str14, Image image2, String str15, SdkTransactionId sdkTransactionId, String str16, String str17, String str18, String str19, String str20) {
        String str21 = str;
        i.e(str21, "serverTransId");
        i.e(str2, "acsTransId");
        i.e(str11, "messageVersion");
        i.e(sdkTransactionId, "sdkTransId");
        return new ChallengeResponseData(str21, str2, str3, str4, uiType2, z, str5, str6, str7, str8, z2, list, str9, str10, image, list2, str11, str12, str13, str14, image2, str15, sdkTransactionId, str16, str17, str18, str19, str20);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChallengeResponseData)) {
            return false;
        }
        ChallengeResponseData challengeResponseData = (ChallengeResponseData) obj;
        return i.a(this.serverTransId, challengeResponseData.serverTransId) && i.a(this.acsTransId, challengeResponseData.acsTransId) && i.a(this.acsHtml, challengeResponseData.acsHtml) && i.a(this.acsHtmlRefresh, challengeResponseData.acsHtmlRefresh) && i.a(this.uiType, challengeResponseData.uiType) && this.isChallengeCompleted == challengeResponseData.isChallengeCompleted && i.a(this.challengeInfoHeader, challengeResponseData.challengeInfoHeader) && i.a(this.challengeInfoLabel, challengeResponseData.challengeInfoLabel) && i.a(this.challengeInfoText, challengeResponseData.challengeInfoText) && i.a(this.challengeAdditionalInfoText, challengeResponseData.challengeAdditionalInfoText) && this.shouldShowChallengeInfoTextIndicator == challengeResponseData.shouldShowChallengeInfoTextIndicator && i.a(this.challengeSelectOptions, challengeResponseData.challengeSelectOptions) && i.a(this.expandInfoLabel, challengeResponseData.expandInfoLabel) && i.a(this.expandInfoText, challengeResponseData.expandInfoText) && i.a(this.issuerImage, challengeResponseData.issuerImage) && i.a(this.messageExtensions, challengeResponseData.messageExtensions) && i.a(this.messageVersion, challengeResponseData.messageVersion) && i.a(this.oobAppUrl, challengeResponseData.oobAppUrl) && i.a(this.oobAppLabel, challengeResponseData.oobAppLabel) && i.a(this.oobContinueLabel, challengeResponseData.oobContinueLabel) && i.a(this.paymentSystemImage, challengeResponseData.paymentSystemImage) && i.a(this.resendInformationLabel, challengeResponseData.resendInformationLabel) && i.a(this.sdkTransId, challengeResponseData.sdkTransId) && i.a(this.submitAuthenticationLabel, challengeResponseData.submitAuthenticationLabel) && i.a(this.whitelistingInfoText, challengeResponseData.whitelistingInfoText) && i.a(this.whyInfoLabel, challengeResponseData.whyInfoLabel) && i.a(this.whyInfoText, challengeResponseData.whyInfoText) && i.a(this.transStatus, challengeResponseData.transStatus);
    }

    public final String getAcsHtml() {
        return this.acsHtml;
    }

    public final String getAcsHtmlRefresh() {
        return this.acsHtmlRefresh;
    }

    public final String getAcsTransId() {
        return this.acsTransId;
    }

    public final String getChallengeAdditionalInfoText() {
        return this.challengeAdditionalInfoText;
    }

    public final String getChallengeInfoHeader() {
        return this.challengeInfoHeader;
    }

    public final String getChallengeInfoLabel() {
        return this.challengeInfoLabel;
    }

    public final String getChallengeInfoText() {
        return this.challengeInfoText;
    }

    public final List<ChallengeSelectOption> getChallengeSelectOptions() {
        return this.challengeSelectOptions;
    }

    public final String getExpandInfoLabel() {
        return this.expandInfoLabel;
    }

    public final String getExpandInfoText() {
        return this.expandInfoText;
    }

    public final Image getIssuerImage() {
        return this.issuerImage;
    }

    public final List<MessageExtension> getMessageExtensions() {
        return this.messageExtensions;
    }

    public final String getMessageVersion() {
        return this.messageVersion;
    }

    public final String getOobAppLabel() {
        return this.oobAppLabel;
    }

    public final String getOobAppUrl() {
        return this.oobAppUrl;
    }

    public final String getOobContinueLabel() {
        return this.oobContinueLabel;
    }

    public final Image getPaymentSystemImage() {
        return this.paymentSystemImage;
    }

    public final String getResendInformationLabel() {
        return this.resendInformationLabel;
    }

    public final SdkTransactionId getSdkTransId() {
        return this.sdkTransId;
    }

    public final String getServerTransId() {
        return this.serverTransId;
    }

    public final boolean getShouldShowChallengeInfoTextIndicator() {
        return this.shouldShowChallengeInfoTextIndicator;
    }

    public final String getSubmitAuthenticationLabel() {
        return this.submitAuthenticationLabel;
    }

    public final String getTransStatus() {
        return this.transStatus;
    }

    public final UiType getUiType() {
        return this.uiType;
    }

    public final String getWhitelistingInfoText() {
        return this.whitelistingInfoText;
    }

    public final String getWhyInfoLabel() {
        return this.whyInfoLabel;
    }

    public final String getWhyInfoText() {
        return this.whyInfoText;
    }

    public int hashCode() {
        String str = this.serverTransId;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.acsTransId;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.acsHtml;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.acsHtmlRefresh;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UiType uiType2 = this.uiType;
        int hashCode5 = (hashCode4 + (uiType2 != null ? uiType2.hashCode() : 0)) * 31;
        boolean z = this.isChallengeCompleted;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode5 + (z ? 1 : 0)) * 31;
        String str5 = this.challengeInfoHeader;
        int hashCode6 = (i2 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.challengeInfoLabel;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.challengeInfoText;
        int hashCode8 = (hashCode7 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.challengeAdditionalInfoText;
        int hashCode9 = (hashCode8 + (str8 != null ? str8.hashCode() : 0)) * 31;
        boolean z3 = this.shouldShowChallengeInfoTextIndicator;
        if (!z3) {
            z2 = z3;
        }
        int i3 = (hashCode9 + (z2 ? 1 : 0)) * 31;
        List<ChallengeSelectOption> list = this.challengeSelectOptions;
        int hashCode10 = (i3 + (list != null ? list.hashCode() : 0)) * 31;
        String str9 = this.expandInfoLabel;
        int hashCode11 = (hashCode10 + (str9 != null ? str9.hashCode() : 0)) * 31;
        String str10 = this.expandInfoText;
        int hashCode12 = (hashCode11 + (str10 != null ? str10.hashCode() : 0)) * 31;
        Image image = this.issuerImage;
        int hashCode13 = (hashCode12 + (image != null ? image.hashCode() : 0)) * 31;
        List<MessageExtension> list2 = this.messageExtensions;
        int hashCode14 = (hashCode13 + (list2 != null ? list2.hashCode() : 0)) * 31;
        String str11 = this.messageVersion;
        int hashCode15 = (hashCode14 + (str11 != null ? str11.hashCode() : 0)) * 31;
        String str12 = this.oobAppUrl;
        int hashCode16 = (hashCode15 + (str12 != null ? str12.hashCode() : 0)) * 31;
        String str13 = this.oobAppLabel;
        int hashCode17 = (hashCode16 + (str13 != null ? str13.hashCode() : 0)) * 31;
        String str14 = this.oobContinueLabel;
        int hashCode18 = (hashCode17 + (str14 != null ? str14.hashCode() : 0)) * 31;
        Image image2 = this.paymentSystemImage;
        int hashCode19 = (hashCode18 + (image2 != null ? image2.hashCode() : 0)) * 31;
        String str15 = this.resendInformationLabel;
        int hashCode20 = (hashCode19 + (str15 != null ? str15.hashCode() : 0)) * 31;
        SdkTransactionId sdkTransactionId = this.sdkTransId;
        int hashCode21 = (hashCode20 + (sdkTransactionId != null ? sdkTransactionId.hashCode() : 0)) * 31;
        String str16 = this.submitAuthenticationLabel;
        int hashCode22 = (hashCode21 + (str16 != null ? str16.hashCode() : 0)) * 31;
        String str17 = this.whitelistingInfoText;
        int hashCode23 = (hashCode22 + (str17 != null ? str17.hashCode() : 0)) * 31;
        String str18 = this.whyInfoLabel;
        int hashCode24 = (hashCode23 + (str18 != null ? str18.hashCode() : 0)) * 31;
        String str19 = this.whyInfoText;
        int hashCode25 = (hashCode24 + (str19 != null ? str19.hashCode() : 0)) * 31;
        String str20 = this.transStatus;
        if (str20 != null) {
            i = str20.hashCode();
        }
        return hashCode25 + i;
    }

    public final boolean isChallengeCompleted() {
        return this.isChallengeCompleted;
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean isValidForUi$3ds2sdk_release() {
        /*
            r7 = this;
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData$UiType r0 = r7.uiType
            r1 = 1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData$UiType r2 = com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.UiType.HTML
            r3 = 0
            if (r0 != r2) goto L_0x0019
            java.lang.String r0 = r7.acsHtml
            if (r0 == 0) goto L_0x0015
            boolean r0 = kotlin.text.StringsKt__IndentKt.o(r0)
            if (r0 == 0) goto L_0x0016
        L_0x0015:
            r3 = r1
        L_0x0016:
            r0 = r3 ^ 1
            return r0
        L_0x0019:
            r0 = 8
            java.lang.String[] r0 = new java.lang.String[r0]
            java.lang.String r2 = r7.challengeInfoHeader
            r0[r3] = r2
            java.lang.String r2 = r7.challengeInfoLabel
            r0[r1] = r2
            java.lang.String r2 = r7.challengeInfoText
            r4 = 2
            r0[r4] = r2
            java.lang.String r2 = r7.whyInfoLabel
            r5 = 3
            r0[r5] = r2
            r2 = 4
            java.lang.String r6 = r7.whyInfoText
            r0[r2] = r6
            r2 = 5
            java.lang.String r6 = r7.expandInfoLabel
            r0[r2] = r6
            r2 = 6
            java.lang.String r6 = r7.expandInfoText
            r0[r2] = r6
            r2 = 7
            java.lang.String r6 = r7.resendInformationLabel
            r0[r2] = r6
            java.util.Set r0 = m0.j.g.h0(r0)
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0053
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0053
        L_0x0051:
            r0 = r1
            goto L_0x0072
        L_0x0053:
            java.util.Iterator r0 = r0.iterator()
        L_0x0057:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0051
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x006e
            boolean r2 = kotlin.text.StringsKt__IndentKt.o(r2)
            if (r2 == 0) goto L_0x006c
            goto L_0x006e
        L_0x006c:
            r2 = r3
            goto L_0x006f
        L_0x006e:
            r2 = r1
        L_0x006f:
            if (r2 != 0) goto L_0x0057
            r0 = r3
        L_0x0072:
            if (r0 == 0) goto L_0x0075
            return r3
        L_0x0075:
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData$UiType r0 = r7.uiType
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData$UiType r2 = com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.UiType.OOB
            if (r0 != r2) goto L_0x00b9
            java.lang.String[] r0 = new java.lang.String[r5]
            java.lang.String r2 = r7.oobAppLabel
            r0[r3] = r2
            java.lang.String r2 = r7.oobAppUrl
            r0[r1] = r2
            java.lang.String r2 = r7.oobContinueLabel
            r0[r4] = r2
            java.util.Set r0 = m0.j.g.h0(r0)
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0099
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L_0x0099
        L_0x0097:
            r1 = r3
            goto L_0x00b8
        L_0x0099:
            java.util.Iterator r0 = r0.iterator()
        L_0x009d:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L_0x0097
            java.lang.Object r2 = r0.next()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x00b4
            boolean r2 = kotlin.text.StringsKt__IndentKt.o(r2)
            if (r2 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r2 = r3
            goto L_0x00b5
        L_0x00b4:
            r2 = r1
        L_0x00b5:
            r2 = r2 ^ r1
            if (r2 == 0) goto L_0x009d
        L_0x00b8:
            return r1
        L_0x00b9:
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData$UiType r2 = com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.UiType.SINGLE_SELECT
            if (r0 == r2) goto L_0x00c1
            com.stripe.android.stripe3ds2.transactions.ChallengeResponseData$UiType r2 = com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.UiType.MULTI_SELECT
            if (r0 != r2) goto L_0x00cc
        L_0x00c1:
            java.util.List<com.stripe.android.stripe3ds2.transactions.ChallengeResponseData$ChallengeSelectOption> r0 = r7.challengeSelectOptions
            if (r0 == 0) goto L_0x00da
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x00cc
            goto L_0x00da
        L_0x00cc:
            java.lang.String r0 = r7.submitAuthenticationLabel
            if (r0 == 0) goto L_0x00d6
            boolean r0 = kotlin.text.StringsKt__IndentKt.o(r0)
            if (r0 == 0) goto L_0x00d7
        L_0x00d6:
            r3 = r1
        L_0x00d7:
            r0 = r3 ^ 1
            return r0
        L_0x00da:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.isValidForUi$3ds2sdk_release():boolean");
    }

    public final JSONObject toJson() throws JSONException {
        JSONObject put = new JSONObject().put("messageType", (Object) MESSAGE_TYPE).put("threeDSServerTransID", (Object) this.serverTransId).put("acsTransID", (Object) this.acsTransId).put(FIELD_ACS_HTML, (Object) this.acsHtml).put(FIELD_ACS_HTML_REFRESH, (Object) this.acsHtmlRefresh);
        UiType uiType2 = this.uiType;
        JSONObject jSONObject = null;
        JSONObject put2 = put.put(FIELD_ACS_UI_TYPE, (Object) uiType2 != null ? uiType2.getCode() : null);
        boolean z = this.isChallengeCompleted;
        String str = YES_VALUE;
        JSONObject put3 = put2.put(FIELD_CHALLENGE_COMPLETION_INDICATOR, (Object) z ? str : NO_VALUE).put(FIELD_CHALLENGE_INFO_HEADER, (Object) this.challengeInfoHeader).put(FIELD_CHALLENGE_INFO_LABEL, (Object) this.challengeInfoLabel).put(FIELD_CHALLENGE_INFO_TEXT, (Object) this.challengeInfoText).put(FIELD_CHALLENGE_ADDITIONAL_INFO_TEXT, (Object) this.challengeAdditionalInfoText).put(FIELD_CHALLENGE_SELECT_INFO, (Object) ChallengeSelectOption.Companion.toJsonArray$3ds2sdk_release(this.challengeSelectOptions)).put(FIELD_EXPAND_INFO_LABEL, (Object) this.expandInfoLabel).put(FIELD_EXPAND_INFO_TEXT, (Object) this.expandInfoText);
        Image image = this.issuerImage;
        JSONObject put4 = put3.put(FIELD_ISSUER_IMAGE, (Object) image != null ? image.toJson$3ds2sdk_release() : null).put(FIELD_MESSAGE_EXTENSION, (Object) MessageExtension.Companion.toJsonArray(this.messageExtensions)).put("messageVersion", (Object) this.messageVersion).put(FIELD_OOB_APP_URL, (Object) this.oobAppUrl).put(FIELD_OOB_APP_LABEL, (Object) this.oobAppLabel).put(FIELD_OOB_CONTINUE_LABEL, (Object) this.oobContinueLabel);
        Image image2 = this.paymentSystemImage;
        if (image2 != null) {
            jSONObject = image2.toJson$3ds2sdk_release();
        }
        JSONObject put5 = put4.put(FIELD_PAYMENT_SYSTEM_IMAGE, (Object) jSONObject).put(FIELD_RESEND_INFORMATION_LABEL, (Object) this.resendInformationLabel).put("sdkTransID", (Object) this.sdkTransId).put(FIELD_SUBMIT_AUTHENTICATION_LABEL, (Object) this.submitAuthenticationLabel).put(FIELD_WHITELISTING_INFO_TEXT, (Object) this.whitelistingInfoText).put(FIELD_WHY_INFO_LABEL, (Object) this.whyInfoLabel).put(FIELD_WHY_INFO_TEXT, (Object) this.whyInfoText).put(FIELD_TRANS_STATUS, (Object) this.transStatus);
        if (!this.isChallengeCompleted) {
            if (!this.shouldShowChallengeInfoTextIndicator) {
                str = NO_VALUE;
            }
            put5.put(FIELD_CHALLENGE_INFO_TEXT_INDICATOR, (Object) str);
        }
        i.d(put5, "JSONObject()\n           …          }\n            }");
        return put5;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ChallengeResponseData(serverTransId=");
        P0.append(this.serverTransId);
        P0.append(", acsTransId=");
        P0.append(this.acsTransId);
        P0.append(", acsHtml=");
        P0.append(this.acsHtml);
        P0.append(", acsHtmlRefresh=");
        P0.append(this.acsHtmlRefresh);
        P0.append(", uiType=");
        P0.append(this.uiType);
        P0.append(", isChallengeCompleted=");
        P0.append(this.isChallengeCompleted);
        P0.append(", challengeInfoHeader=");
        P0.append(this.challengeInfoHeader);
        P0.append(", challengeInfoLabel=");
        P0.append(this.challengeInfoLabel);
        P0.append(", challengeInfoText=");
        P0.append(this.challengeInfoText);
        P0.append(", challengeAdditionalInfoText=");
        P0.append(this.challengeAdditionalInfoText);
        P0.append(", shouldShowChallengeInfoTextIndicator=");
        P0.append(this.shouldShowChallengeInfoTextIndicator);
        P0.append(", challengeSelectOptions=");
        P0.append(this.challengeSelectOptions);
        P0.append(", expandInfoLabel=");
        P0.append(this.expandInfoLabel);
        P0.append(", expandInfoText=");
        P0.append(this.expandInfoText);
        P0.append(", issuerImage=");
        P0.append(this.issuerImage);
        P0.append(", messageExtensions=");
        P0.append(this.messageExtensions);
        P0.append(", messageVersion=");
        P0.append(this.messageVersion);
        P0.append(", oobAppUrl=");
        P0.append(this.oobAppUrl);
        P0.append(", oobAppLabel=");
        P0.append(this.oobAppLabel);
        P0.append(", oobContinueLabel=");
        P0.append(this.oobContinueLabel);
        P0.append(", paymentSystemImage=");
        P0.append(this.paymentSystemImage);
        P0.append(", resendInformationLabel=");
        P0.append(this.resendInformationLabel);
        P0.append(", sdkTransId=");
        P0.append(this.sdkTransId);
        P0.append(", submitAuthenticationLabel=");
        P0.append(this.submitAuthenticationLabel);
        P0.append(", whitelistingInfoText=");
        P0.append(this.whitelistingInfoText);
        P0.append(", whyInfoLabel=");
        P0.append(this.whyInfoLabel);
        P0.append(", whyInfoText=");
        P0.append(this.whyInfoText);
        P0.append(", transStatus=");
        return a.y0(P0, this.transStatus, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.serverTransId);
        parcel.writeString(this.acsTransId);
        parcel.writeString(this.acsHtml);
        parcel.writeString(this.acsHtmlRefresh);
        UiType uiType2 = this.uiType;
        if (uiType2 != null) {
            parcel.writeInt(1);
            parcel.writeString(uiType2.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.isChallengeCompleted ? 1 : 0);
        parcel.writeString(this.challengeInfoHeader);
        parcel.writeString(this.challengeInfoLabel);
        parcel.writeString(this.challengeInfoText);
        parcel.writeString(this.challengeAdditionalInfoText);
        parcel.writeInt(this.shouldShowChallengeInfoTextIndicator ? 1 : 0);
        List<ChallengeSelectOption> list = this.challengeSelectOptions;
        if (list != null) {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (ChallengeSelectOption writeToParcel : list) {
                writeToParcel.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.expandInfoLabel);
        parcel.writeString(this.expandInfoText);
        Image image = this.issuerImage;
        if (image != null) {
            parcel.writeInt(1);
            image.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        List<MessageExtension> list2 = this.messageExtensions;
        if (list2 != null) {
            parcel.writeInt(1);
            parcel.writeInt(list2.size());
            for (MessageExtension writeToParcel2 : list2) {
                writeToParcel2.writeToParcel(parcel, 0);
            }
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.messageVersion);
        parcel.writeString(this.oobAppUrl);
        parcel.writeString(this.oobAppLabel);
        parcel.writeString(this.oobContinueLabel);
        Image image2 = this.paymentSystemImage;
        if (image2 != null) {
            parcel.writeInt(1);
            image2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.resendInformationLabel);
        this.sdkTransId.writeToParcel(parcel, 0);
        parcel.writeString(this.submitAuthenticationLabel);
        parcel.writeString(this.whitelistingInfoText);
        parcel.writeString(this.whyInfoLabel);
        parcel.writeString(this.whyInfoText);
        parcel.writeString(this.transStatus);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ChallengeResponseData(java.lang.String r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.UiType r37, boolean r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, boolean r43, java.util.List r44, java.lang.String r45, java.lang.String r46, com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.Image r47, java.util.List r48, java.lang.String r49, java.lang.String r50, java.lang.String r51, java.lang.String r52, com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.Image r53, java.lang.String r54, com.stripe.android.stripe3ds2.transaction.SdkTransactionId r55, java.lang.String r56, java.lang.String r57, java.lang.String r58, java.lang.String r59, java.lang.String r60, int r61, m0.n.b.f r62) {
        /*
            r32 = this;
            r0 = r61
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r35
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r36
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r37
        L_0x001b:
            r1 = r0 & 32
            r3 = 0
            if (r1 == 0) goto L_0x0022
            r9 = r3
            goto L_0x0024
        L_0x0022:
            r9 = r38
        L_0x0024:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002a
            r10 = r2
            goto L_0x002c
        L_0x002a:
            r10 = r39
        L_0x002c:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0032
            r11 = r2
            goto L_0x0034
        L_0x0032:
            r11 = r40
        L_0x0034:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003a
            r12 = r2
            goto L_0x003c
        L_0x003a:
            r12 = r41
        L_0x003c:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0042
            r13 = r2
            goto L_0x0044
        L_0x0042:
            r13 = r42
        L_0x0044:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x004a
            r14 = r3
            goto L_0x004c
        L_0x004a:
            r14 = r43
        L_0x004c:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0052
            r15 = r2
            goto L_0x0054
        L_0x0052:
            r15 = r44
        L_0x0054:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005b
            r16 = r2
            goto L_0x005d
        L_0x005b:
            r16 = r45
        L_0x005d:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0064
            r17 = r2
            goto L_0x0066
        L_0x0064:
            r17 = r46
        L_0x0066:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x006d
            r18 = r2
            goto L_0x006f
        L_0x006d:
            r18 = r47
        L_0x006f:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0078
            r19 = r2
            goto L_0x007a
        L_0x0078:
            r19 = r48
        L_0x007a:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0082
            r21 = r2
            goto L_0x0084
        L_0x0082:
            r21 = r50
        L_0x0084:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x008c
            r22 = r2
            goto L_0x008e
        L_0x008c:
            r22 = r51
        L_0x008e:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0096
            r23 = r2
            goto L_0x0098
        L_0x0096:
            r23 = r52
        L_0x0098:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a0
            r24 = r2
            goto L_0x00a2
        L_0x00a0:
            r24 = r53
        L_0x00a2:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00aa
            r25 = r2
            goto L_0x00ac
        L_0x00aa:
            r25 = r54
        L_0x00ac:
            r1 = 8388608(0x800000, float:1.17549435E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b4
            r27 = r2
            goto L_0x00b6
        L_0x00b4:
            r27 = r56
        L_0x00b6:
            r1 = 16777216(0x1000000, float:2.3509887E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00be
            r28 = r2
            goto L_0x00c0
        L_0x00be:
            r28 = r57
        L_0x00c0:
            r1 = 33554432(0x2000000, float:9.403955E-38)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00c8
            r29 = r2
            goto L_0x00ca
        L_0x00c8:
            r29 = r58
        L_0x00ca:
            r1 = 67108864(0x4000000, float:1.5046328E-36)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00d2
            r30 = r2
            goto L_0x00d4
        L_0x00d2:
            r30 = r59
        L_0x00d4:
            r1 = 134217728(0x8000000, float:3.85186E-34)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00dc
            r31 = r2
            goto L_0x00de
        L_0x00dc:
            r31 = r60
        L_0x00de:
            r3 = r32
            r4 = r33
            r5 = r34
            r20 = r49
            r26 = r55
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.<init>(java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.stripe.android.stripe3ds2.transactions.ChallengeResponseData$UiType, boolean, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, java.util.List, java.lang.String, java.lang.String, com.stripe.android.stripe3ds2.transactions.ChallengeResponseData$Image, java.util.List, java.lang.String, java.lang.String, java.lang.String, java.lang.String, com.stripe.android.stripe3ds2.transactions.ChallengeResponseData$Image, java.lang.String, com.stripe.android.stripe3ds2.transaction.SdkTransactionId, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, m0.n.b.f):void");
    }
}
