package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.StripeIntent;
import com.stripe.android.model.parsers.PaymentIntentJsonParser;
import i0.d.a.a.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Metadata;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0016\b\b\u0018\u0000 \u00012\u00020\u0001:\u000e\u0001\u0001\u0001\u0001\u0001\u0001\u0001B\u0002\b\u0000\u0012\b\u00107\u001a\u0004\u0018\u00010\t\u0012\f\u00108\u001a\b\u0012\u0004\u0012\u00020\t0\f\u0012\b\u00109\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010:\u001a\u00020\u000f\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010<\u001a\u00020\u0017\u0012\b\u0010=\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010>\u001a\u00020\u001b\u0012\u0006\u0010?\u001a\u00020\u000f\u0012\b\u0010@\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010B\u001a\u00020\u0005\u0012\u0018\b\u0002\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010.\u0012\n\b\u0002\u0010J\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u000104¢\u0006\u0006\b\u0001\u0010\u0001J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u000bJ\u0010\u0010\u001c\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u000bJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010\u000bJ\u0010\u0010!\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b!\u0010\u0007J \u0010$\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b)\u0010\u000bJ\u0012\u0010*\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b*\u0010\u000bJ\u0012\u0010,\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010/\u001a\u0004\u0018\u00010.HÆ\u0003¢\u0006\u0004\b/\u00100J\u0012\u00102\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00105\u001a\u0004\u0018\u000104HÆ\u0003¢\u0006\u0004\b5\u00106J\u0002\u0010L\u001a\u00020\u00002\n\b\u0002\u00107\u001a\u0004\u0018\u00010\t2\u000e\b\u0002\u00108\u001a\b\u0012\u0004\u0012\u00020\t0\f2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000f2\b\b\u0002\u0010:\u001a\u00020\u000f2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010<\u001a\u00020\u00172\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010>\u001a\u00020\u001b2\b\b\u0002\u0010?\u001a\u00020\u000f2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010B\u001a\u00020\u00052\u0018\b\u0002\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010F\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010H\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010I\u001a\u0004\u0018\u00010.2\n\b\u0002\u0010J\u001a\u0004\u0018\u0001012\n\b\u0002\u0010K\u001a\u0004\u0018\u000104HÆ\u0001¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\tHÖ\u0001¢\u0006\u0004\bN\u0010\u000bJ\u0010\u0010P\u001a\u00020OHÖ\u0001¢\u0006\u0004\bP\u0010QJ\u001a\u0010S\u001a\u00020\u00052\b\u0010R\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\bS\u0010TJ\u0010\u0010U\u001a\u00020OHÖ\u0001¢\u0006\u0004\bU\u0010QJ \u0010Z\u001a\u00020Y2\u0006\u0010W\u001a\u00020V2\u0006\u0010X\u001a\u00020OHÖ\u0001¢\u0006\u0004\bZ\u0010[R\u001b\u00109\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b9\u0010\\\u001a\u0004\b]\u0010\u0011R\u0018\u0010H\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bH\u0010^R\u001b\u0010;\u001a\u0004\u0018\u00010\u00148\u0006@\u0006¢\u0006\f\n\u0004\b;\u0010_\u001a\u0004\b`\u0010\u0016R\u001c\u0010B\u001a\u00020\u00058\u0016@\u0016X\u0004¢\u0006\f\n\u0004\bB\u0010a\u001a\u0004\bB\u0010\u0007R\u001b\u0010J\u001a\u0004\u0018\u0001018\u0006@\u0006¢\u0006\f\n\u0004\bJ\u0010b\u001a\u0004\bc\u00103R\u0018\u0010e\u001a\u0004\u0018\u00010\t8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\bd\u0010\u000bR\u001b\u0010I\u001a\u0004\u0018\u00010.8\u0006@\u0006¢\u0006\f\n\u0004\bI\u0010f\u001a\u0004\bg\u00100R\u001e\u0010D\u001a\u0004\u0018\u00010&8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\bD\u0010h\u001a\u0004\bi\u0010(R\"\u00108\u001a\b\u0012\u0004\u0012\u00020\t0\f8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b8\u0010j\u001a\u0004\bk\u0010\u000eR\u001e\u0010=\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b=\u0010l\u001a\u0004\bm\u0010\u000bR\u001b\u0010@\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\b@\u0010l\u001a\u0004\bn\u0010\u000bR\u001e\u0010K\u001a\u0004\u0018\u0001048\u0016@\u0016X\u0004¢\u0006\f\n\u0004\bK\u0010o\u001a\u0004\bp\u00106R\u0019\u0010:\u001a\u00020\u000f8\u0006@\u0006¢\u0006\f\n\u0004\b:\u0010q\u001a\u0004\br\u0010\u0013R\u001c\u0010?\u001a\u00020\u000f8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b?\u0010q\u001a\u0004\bs\u0010\u0013R\u001b\u0010F\u001a\u0004\u0018\u00010\t8\u0006@\u0006¢\u0006\f\n\u0004\bF\u0010l\u001a\u0004\bt\u0010\u000bR\u001e\u0010E\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\bE\u0010l\u001a\u0004\bu\u0010\u000bR)\u0010C\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010#\u0018\u00010\"8\u0006@\u0006¢\u0006\f\n\u0004\bC\u0010v\u001a\u0004\bw\u0010%R\u0018\u0010{\u001a\u0004\u0018\u00010x8V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\by\u0010zR\u0016\u0010|\u001a\u00020\u00058V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b|\u0010\u0007R\u001e\u0010G\u001a\u0004\u0018\u00010+8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\bG\u0010}\u001a\u0004\b~\u0010-R\u001a\u0010<\u001a\u00020\u00178\u0006@\u0006¢\u0006\r\n\u0004\b<\u0010\u001a\u0005\b\u0001\u0010\u0019R\u001b\u0010>\u001a\u00020\u001b8\u0006@\u0006¢\u0006\u000e\n\u0005\b>\u0010\u0001\u001a\u0005\b\u0001\u0010\u001dR\u001f\u0010A\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0004¢\u0006\r\n\u0004\bA\u0010l\u001a\u0005\b\u0001\u0010\u000bR\u001f\u00107\u001a\u0004\u0018\u00010\t8\u0016@\u0016X\u0004¢\u0006\r\n\u0004\b7\u0010l\u001a\u0005\b\u0001\u0010\u000b¨\u0006\u0001"}, d2 = {"Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/model/StripeIntent;", "Lcom/stripe/android/model/StripeIntent$Usage;", "component18", "()Lcom/stripe/android/model/StripeIntent$Usage;", "", "requiresAction", "()Z", "requiresConfirmation", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/util/List;", "", "component3", "()Ljava/lang/Long;", "component4", "()J", "Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "component5", "()Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "component6", "()Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "component7", "Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "component8", "()Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "component9", "component10", "component11", "component12", "", "", "component13", "()Ljava/util/Map;", "Lcom/stripe/android/model/PaymentMethod;", "component14", "()Lcom/stripe/android/model/PaymentMethod;", "component15", "component16", "Lcom/stripe/android/model/StripeIntent$Status;", "component17", "()Lcom/stripe/android/model/StripeIntent$Status;", "Lcom/stripe/android/model/PaymentIntent$Error;", "component19", "()Lcom/stripe/android/model/PaymentIntent$Error;", "Lcom/stripe/android/model/PaymentIntent$Shipping;", "component20", "()Lcom/stripe/android/model/PaymentIntent$Shipping;", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "component21", "()Lcom/stripe/android/model/StripeIntent$NextActionData;", "id", "paymentMethodTypes", "amount", "canceledAt", "cancellationReason", "captureMethod", "clientSecret", "confirmationMethod", "created", "currency", "description", "isLiveMode", "nextAction", "paymentMethod", "paymentMethodId", "receiptEmail", "status", "setupFutureUsage", "lastPaymentError", "shipping", "nextActionData", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLcom/stripe/android/model/PaymentIntent$CancellationReason;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;JLjava/lang/String;Ljava/lang/String;ZLjava/util/Map;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$Error;Lcom/stripe/android/model/PaymentIntent$Shipping;Lcom/stripe/android/model/StripeIntent$NextActionData;)Lcom/stripe/android/model/PaymentIntent;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getAmount", "Lcom/stripe/android/model/StripeIntent$Usage;", "Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "getCancellationReason", "Z", "Lcom/stripe/android/model/PaymentIntent$Shipping;", "getShipping", "getLastErrorMessage", "lastErrorMessage", "Lcom/stripe/android/model/PaymentIntent$Error;", "getLastPaymentError", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "Ljava/util/List;", "getPaymentMethodTypes", "Ljava/lang/String;", "getClientSecret", "getCurrency", "Lcom/stripe/android/model/StripeIntent$NextActionData;", "getNextActionData", "J", "getCanceledAt", "getCreated", "getReceiptEmail", "getPaymentMethodId", "Ljava/util/Map;", "getNextAction", "Lcom/stripe/android/model/StripeIntent$NextActionType;", "getNextActionType", "()Lcom/stripe/android/model/StripeIntent$NextActionType;", "nextActionType", "isConfirmed", "Lcom/stripe/android/model/StripeIntent$Status;", "getStatus", "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "getCaptureMethod", "Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "getConfirmationMethod", "getDescription", "getId", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Long;JLcom/stripe/android/model/PaymentIntent$CancellationReason;Lcom/stripe/android/model/PaymentIntent$CaptureMethod;Ljava/lang/String;Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;JLjava/lang/String;Ljava/lang/String;ZLjava/util/Map;Lcom/stripe/android/model/PaymentMethod;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/StripeIntent$Status;Lcom/stripe/android/model/StripeIntent$Usage;Lcom/stripe/android/model/PaymentIntent$Error;Lcom/stripe/android/model/PaymentIntent$Shipping;Lcom/stripe/android/model/StripeIntent$NextActionData;)V", "Companion", "CancellationReason", "CaptureMethod", "ClientSecret", "ConfirmationMethod", "Error", "Shipping", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentIntent.kt */
public final class PaymentIntent implements StripeIntent {
    public static final Parcelable.Creator<PaymentIntent> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private final Long amount;
    private final long canceledAt;
    private final CancellationReason cancellationReason;
    private final CaptureMethod captureMethod;
    private final String clientSecret;
    private final ConfirmationMethod confirmationMethod;
    private final long created;
    private final String currency;
    private final String description;
    private final String id;
    private final boolean isLiveMode;
    private final Error lastPaymentError;
    private final Map<String, Object> nextAction;
    private final StripeIntent.NextActionData nextActionData;
    private final PaymentMethod paymentMethod;
    private final String paymentMethodId;
    private final List<String> paymentMethodTypes;
    private final String receiptEmail;
    private final StripeIntent.Usage setupFutureUsage;
    private final Shipping shipping;
    private final StripeIntent.Status status;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "", "", "code", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Duplicate", "Fraudulent", "RequestedByCustomer", "Abandoned", "FailedInvoice", "VoidInvoice", "Automatic", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentIntent.kt */
    public enum CancellationReason {
        Duplicate("duplicate"),
        Fraudulent("fraudulent"),
        RequestedByCustomer("requested_by_customer"),
        Abandoned("abandoned"),
        FailedInvoice("failed_invoice"),
        VoidInvoice("void_invoice"),
        Automatic("automatic");
        
        public static final Companion Companion = null;
        /* access modifiers changed from: private */
        public final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$CancellationReason$Companion;", "", "", "code", "Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent$CancellationReason;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentIntent.kt */
        public static final class Companion {
            private Companion() {
            }

            public final CancellationReason fromCode(String str) {
                CancellationReason[] values = CancellationReason.values();
                for (int i = 0; i < 7; i++) {
                    CancellationReason cancellationReason = values[i];
                    if (i.a(cancellationReason.code, str)) {
                        return cancellationReason;
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

        private CancellationReason(String str) {
            this.code = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "", "", "code", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Automatic", "Manual", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentIntent.kt */
    public enum CaptureMethod {
        Automatic("automatic"),
        Manual("manual");
        
        public static final Companion Companion = null;
        /* access modifiers changed from: private */
        public final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$CaptureMethod$Companion;", "", "", "code", "Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent$CaptureMethod;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentIntent.kt */
        public static final class Companion {
            private Companion() {
            }

            public final CaptureMethod fromCode(String str) {
                CaptureMethod captureMethod;
                CaptureMethod[] values = CaptureMethod.values();
                int i = 0;
                while (true) {
                    if (i >= 2) {
                        captureMethod = null;
                        break;
                    }
                    captureMethod = values[i];
                    if (i.a(captureMethod.code, str)) {
                        break;
                    }
                    i++;
                }
                return captureMethod != null ? captureMethod : CaptureMethod.Automatic;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((f) null);
        }

        private CaptureMethod(String str) {
            this.code = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\b\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0007\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0006\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0011\u001a\u0004\b\u0012\u0010\u0004R\u001c\u0010\u0013\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0011\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$ClientSecret;", "", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "value", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent$ClientSecret;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getValue$payments_core_release", "paymentIntentId", "getPaymentIntentId$payments_core_release", "<init>", "(Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentIntent.kt */
    public static final class ClientSecret {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final Pattern PATTERN = Pattern.compile("^pi_[^_]+_secret_[^_]+$");
        private final String paymentIntentId;
        private final String value;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\u0004\u001a\n \u0003*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$ClientSecret$Companion;", "", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PATTERN", "Ljava/util/regex/Pattern;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentIntent.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* JADX WARNING: Removed duplicated region for block: B:14:0x0067 A[RETURN] */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x0068  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public ClientSecret(java.lang.String r5) {
            /*
                r4 = this;
                java.lang.String r0 = "value"
                m0.n.b.i.e(r5, r0)
                r4.<init>()
                r4.value = r5
                kotlin.text.Regex r0 = new kotlin.text.Regex
                java.lang.String r1 = "_secret"
                r0.<init>(r1)
                r1 = 0
                java.util.List r5 = r0.c(r5, r1)
                boolean r0 = r5.isEmpty()
                if (r0 != 0) goto L_0x0046
                int r0 = r5.size()
                java.util.ListIterator r0 = r5.listIterator(r0)
            L_0x0024:
                boolean r2 = r0.hasPrevious()
                if (r2 == 0) goto L_0x0046
                java.lang.Object r2 = r0.previous()
                java.lang.String r2 = (java.lang.String) r2
                int r2 = r2.length()
                r3 = 1
                if (r2 != 0) goto L_0x0039
                r2 = r3
                goto L_0x003a
            L_0x0039:
                r2 = r1
            L_0x003a:
                if (r2 != 0) goto L_0x0024
                int r0 = r0.nextIndex()
                int r0 = r0 + r3
                java.util.List r5 = m0.j.g.p0(r5, r0)
                goto L_0x0048
            L_0x0046:
                kotlin.collections.EmptyList r5 = kotlin.collections.EmptyList.c
            L_0x0048:
                java.lang.String[] r0 = new java.lang.String[r1]
                java.lang.Object[] r5 = r5.toArray(r0)
                java.lang.String r0 = "null cannot be cast to non-null type kotlin.Array<T>"
                java.util.Objects.requireNonNull(r5, r0)
                java.lang.String[] r5 = (java.lang.String[]) r5
                r5 = r5[r1]
                r4.paymentIntentId = r5
                java.util.regex.Pattern r5 = PATTERN
                java.lang.String r0 = r4.value
                java.util.regex.Matcher r5 = r5.matcher(r0)
                boolean r5 = r5.matches()
                if (r5 == 0) goto L_0x0068
                return
            L_0x0068:
                java.lang.String r5 = "Invalid client secret: "
                java.lang.StringBuilder r5 = i0.d.a.a.a.P0(r5)
                java.lang.String r0 = r4.value
                r5.append(r0)
                java.lang.String r5 = r5.toString()
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.String r5 = r5.toString()
                r0.<init>(r5)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.PaymentIntent.ClientSecret.<init>(java.lang.String):void");
        }

        public static /* synthetic */ ClientSecret copy$default(ClientSecret clientSecret, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = clientSecret.value;
            }
            return clientSecret.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.value;
        }

        public final ClientSecret copy(String str) {
            i.e(str, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
            return new ClientSecret(str);
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ClientSecret) && i.a(this.value, ((ClientSecret) obj).value);
            }
            return true;
        }

        public final String getPaymentIntentId$payments_core_release() {
            return this.paymentIntentId;
        }

        public final String getValue$payments_core_release() {
            return this.value;
        }

        public int hashCode() {
            String str = this.value;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.y0(a.P0("ClientSecret(value="), this.value, ")");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Companion;", "", "Lorg/json/JSONObject;", "jsonObject", "Lcom/stripe/android/model/PaymentIntent;", "fromJson", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentIntent;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentIntent.kt */
    public static final class Companion {
        private Companion() {
        }

        public final PaymentIntent fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new PaymentIntentJsonParser().parse(jSONObject);
            }
            return null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "", "", "code", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "Automatic", "Manual", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentIntent.kt */
    public enum ConfirmationMethod {
        Automatic("automatic"),
        Manual("manual");
        
        public static final Companion Companion = null;
        /* access modifiers changed from: private */
        public final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod$Companion;", "", "", "code", "Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent$ConfirmationMethod;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentIntent.kt */
        public static final class Companion {
            private Companion() {
            }

            public final ConfirmationMethod fromCode(String str) {
                ConfirmationMethod confirmationMethod;
                ConfirmationMethod[] values = ConfirmationMethod.values();
                int i = 0;
                while (true) {
                    if (i >= 2) {
                        confirmationMethod = null;
                        break;
                    }
                    confirmationMethod = values[i];
                    if (i.a(confirmationMethod.code, str)) {
                        break;
                    }
                    i++;
                }
                return confirmationMethod != null ? confirmationMethod : ConfirmationMethod.Automatic;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((f) null);
        }

        private ConfirmationMethod(String str) {
            this.code = str;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<PaymentIntent> {
        public final PaymentIntent createFromParcel(Parcel parcel) {
            long j;
            LinkedHashMap linkedHashMap;
            String str;
            Parcel parcel2 = parcel;
            i.e(parcel2, "in");
            String readString = parcel.readString();
            ArrayList<String> createStringArrayList = parcel.createStringArrayList();
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            long readLong = parcel.readLong();
            CancellationReason cancellationReason = parcel.readInt() != 0 ? (CancellationReason) Enum.valueOf(CancellationReason.class, parcel.readString()) : null;
            CaptureMethod captureMethod = (CaptureMethod) Enum.valueOf(CaptureMethod.class, parcel.readString());
            String readString2 = parcel.readString();
            ConfirmationMethod confirmationMethod = (ConfirmationMethod) Enum.valueOf(ConfirmationMethod.class, parcel.readString());
            long readLong2 = parcel.readLong();
            String readString3 = parcel.readString();
            String readString4 = parcel.readString();
            boolean z = parcel.readInt() != 0;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(readInt);
                while (readInt != 0) {
                    linkedHashMap2.put(parcel.readString(), parcel2.readValue(Object.class.getClassLoader()));
                    readInt--;
                    readString3 = readString3;
                    readLong2 = readLong2;
                }
                j = readLong2;
                str = readString3;
                linkedHashMap = linkedHashMap2;
            } else {
                j = readLong2;
                str = readString3;
                linkedHashMap = null;
            }
            return new PaymentIntent(readString, createStringArrayList, valueOf, readLong, cancellationReason, captureMethod, readString2, confirmationMethod, j, str, readString4, z, linkedHashMap, parcel.readInt() != 0 ? PaymentMethod.CREATOR.createFromParcel(parcel2) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? (StripeIntent.Status) Enum.valueOf(StripeIntent.Status.class, parcel.readString()) : null, parcel.readInt() != 0 ? (StripeIntent.Usage) Enum.valueOf(StripeIntent.Usage.class, parcel.readString()) : null, parcel.readInt() != 0 ? Error.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? Shipping.CREATOR.createFromParcel(parcel2) : null, (StripeIntent.NextActionData) parcel2.readParcelable(PaymentIntent.class.getClassLoader()));
        }

        public final PaymentIntent[] newArray(int i) {
            return new PaymentIntent[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\b\u0018\u0000 72\u00020\u0001:\u000278BY\b\u0000\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b5\u00106J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJp\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0004J\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b#\u0010\u001dJ \u0010(\u001a\u00020'2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b(\u0010)R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010*\u001a\u0004\b+\u0010\fR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010\u0004R\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0013\u0010,\u001a\u0004\b.\u0010\u0004R\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0014\u0010,\u001a\u0004\b/\u0010\u0004R\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010,\u001a\u0004\b0\u0010\u0004R\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0015\u0010,\u001a\u0004\b1\u0010\u0004R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b2\u0010\u0004R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\r8\u0006@\u0006¢\u0006\f\n\u0004\b\u0017\u00103\u001a\u0004\b4\u0010\u000f¨\u00069"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Error;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "Lcom/stripe/android/model/PaymentMethod;", "component7", "()Lcom/stripe/android/model/PaymentMethod;", "Lcom/stripe/android/model/PaymentIntent$Error$Type;", "component8", "()Lcom/stripe/android/model/PaymentIntent$Error$Type;", "charge", "code", "declineCode", "docUrl", "message", "param", "paymentMethod", "type", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentIntent$Error$Type;)Lcom/stripe/android/model/PaymentIntent$Error;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "Ljava/lang/String;", "getDeclineCode", "getDocUrl", "getMessage", "getCharge", "getParam", "getCode", "Lcom/stripe/android/model/PaymentIntent$Error$Type;", "getType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/PaymentIntent$Error$Type;)V", "Companion", "Type", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentIntent.kt */
    public static final class Error implements StripeModel {
        public static final String CODE_AUTHENTICATION_ERROR = "payment_intent_authentication_failure";
        public static final Parcelable.Creator<Error> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        private final String charge;
        private final String code;
        private final String declineCode;
        private final String docUrl;
        private final String message;
        private final String param;
        private final PaymentMethod paymentMethod;
        private final Type type;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Error$Companion;", "", "", "CODE_AUTHENTICATION_ERROR", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentIntent.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Error> {
            public final Error createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Error(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? PaymentMethod.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? (Type) Enum.valueOf(Type.class, parcel.readString()) : null);
            }

            public final Error[] newArray(int i) {
                return new Error[i];
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Error$Type;", "", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "ApiConnectionError", "ApiError", "AuthenticationError", "CardError", "IdempotencyError", "InvalidRequestError", "RateLimitError", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentIntent.kt */
        public enum Type {
            ApiConnectionError("api_connection_error"),
            ApiError("api_error"),
            AuthenticationError("authentication_error"),
            CardError("card_error"),
            IdempotencyError("idempotency_error"),
            InvalidRequestError("invalid_request_error"),
            RateLimitError("rate_limit_error");
            
            public static final Companion Companion = null;
            private final String code;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Error$Type$Companion;", "", "", "typeCode", "Lcom/stripe/android/model/PaymentIntent$Error$Type;", "fromCode", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent$Error$Type;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: PaymentIntent.kt */
            public static final class Companion {
                private Companion() {
                }

                public final Type fromCode(String str) {
                    Type[] values = Type.values();
                    for (int i = 0; i < 7; i++) {
                        Type type = values[i];
                        if (i.a(type.getCode(), str)) {
                            return type;
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

            private Type(String str) {
                this.code = str;
            }

            public final String getCode() {
                return this.code;
            }
        }

        public Error(String str, String str2, String str3, String str4, String str5, String str6, PaymentMethod paymentMethod2, Type type2) {
            this.charge = str;
            this.code = str2;
            this.declineCode = str3;
            this.docUrl = str4;
            this.message = str5;
            this.param = str6;
            this.paymentMethod = paymentMethod2;
            this.type = type2;
        }

        public static /* synthetic */ Error copy$default(Error error, String str, String str2, String str3, String str4, String str5, String str6, PaymentMethod paymentMethod2, Type type2, int i, Object obj) {
            Error error2 = error;
            int i2 = i;
            return error.copy((i2 & 1) != 0 ? error2.charge : str, (i2 & 2) != 0 ? error2.code : str2, (i2 & 4) != 0 ? error2.declineCode : str3, (i2 & 8) != 0 ? error2.docUrl : str4, (i2 & 16) != 0 ? error2.message : str5, (i2 & 32) != 0 ? error2.param : str6, (i2 & 64) != 0 ? error2.paymentMethod : paymentMethod2, (i2 & 128) != 0 ? error2.type : type2);
        }

        public final String component1() {
            return this.charge;
        }

        public final String component2() {
            return this.code;
        }

        public final String component3() {
            return this.declineCode;
        }

        public final String component4() {
            return this.docUrl;
        }

        public final String component5() {
            return this.message;
        }

        public final String component6() {
            return this.param;
        }

        public final PaymentMethod component7() {
            return this.paymentMethod;
        }

        public final Type component8() {
            return this.type;
        }

        public final Error copy(String str, String str2, String str3, String str4, String str5, String str6, PaymentMethod paymentMethod2, Type type2) {
            return new Error(str, str2, str3, str4, str5, str6, paymentMethod2, type2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return i.a(this.charge, error.charge) && i.a(this.code, error.code) && i.a(this.declineCode, error.declineCode) && i.a(this.docUrl, error.docUrl) && i.a(this.message, error.message) && i.a(this.param, error.param) && i.a(this.paymentMethod, error.paymentMethod) && i.a(this.type, error.type);
        }

        public final String getCharge() {
            return this.charge;
        }

        public final String getCode() {
            return this.code;
        }

        public final String getDeclineCode() {
            return this.declineCode;
        }

        public final String getDocUrl() {
            return this.docUrl;
        }

        public final String getMessage() {
            return this.message;
        }

        public final String getParam() {
            return this.param;
        }

        public final PaymentMethod getPaymentMethod() {
            return this.paymentMethod;
        }

        public final Type getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.charge;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.code;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.declineCode;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.docUrl;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.message;
            int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
            String str6 = this.param;
            int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
            PaymentMethod paymentMethod2 = this.paymentMethod;
            int hashCode7 = (hashCode6 + (paymentMethod2 != null ? paymentMethod2.hashCode() : 0)) * 31;
            Type type2 = this.type;
            if (type2 != null) {
                i = type2.hashCode();
            }
            return hashCode7 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Error(charge=");
            P0.append(this.charge);
            P0.append(", code=");
            P0.append(this.code);
            P0.append(", declineCode=");
            P0.append(this.declineCode);
            P0.append(", docUrl=");
            P0.append(this.docUrl);
            P0.append(", message=");
            P0.append(this.message);
            P0.append(", param=");
            P0.append(this.param);
            P0.append(", paymentMethod=");
            P0.append(this.paymentMethod);
            P0.append(", type=");
            P0.append(this.type);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.charge);
            parcel.writeString(this.code);
            parcel.writeString(this.declineCode);
            parcel.writeString(this.docUrl);
            parcel.writeString(this.message);
            parcel.writeString(this.param);
            PaymentMethod paymentMethod2 = this.paymentMethod;
            if (paymentMethod2 != null) {
                parcel.writeInt(1);
                paymentMethod2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            Type type2 = this.type;
            if (type2 != null) {
                parcel.writeInt(1);
                parcel.writeString(type2.name());
                return;
            }
            parcel.writeInt(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007JJ\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010\u0007R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010\"\u001a\u0004\b$\u0010\u0007R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b%\u0010\u0007R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b&\u0010\u0007R\u0019\u0010\u000b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010\u0004¨\u0006+"}, d2 = {"Lcom/stripe/android/model/PaymentIntent$Shipping;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/Address;", "component1", "()Lcom/stripe/android/model/Address;", "", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "address", "carrier", "name", "phone", "trackingNumber", "copy", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentIntent$Shipping;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCarrier", "getTrackingNumber", "getName", "getPhone", "Lcom/stripe/android/model/Address;", "getAddress", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentIntent.kt */
    public static final class Shipping implements StripeModel {
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();
        private final Address address;
        private final String carrier;
        private final String name;
        private final String phone;
        private final String trackingNumber;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Shipping> {
            public final Shipping createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Shipping(Address.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final Shipping[] newArray(int i) {
                return new Shipping[i];
            }
        }

        public Shipping(Address address2, String str, String str2, String str3, String str4) {
            i.e(address2, PaymentMethod.BillingDetails.PARAM_ADDRESS);
            this.address = address2;
            this.carrier = str;
            this.name = str2;
            this.phone = str3;
            this.trackingNumber = str4;
        }

        public static /* synthetic */ Shipping copy$default(Shipping shipping, Address address2, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                address2 = shipping.address;
            }
            if ((i & 2) != 0) {
                str = shipping.carrier;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = shipping.name;
            }
            String str6 = str2;
            if ((i & 8) != 0) {
                str3 = shipping.phone;
            }
            String str7 = str3;
            if ((i & 16) != 0) {
                str4 = shipping.trackingNumber;
            }
            return shipping.copy(address2, str5, str6, str7, str4);
        }

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.carrier;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final String component5() {
            return this.trackingNumber;
        }

        public final Shipping copy(Address address2, String str, String str2, String str3, String str4) {
            i.e(address2, PaymentMethod.BillingDetails.PARAM_ADDRESS);
            return new Shipping(address2, str, str2, str3, str4);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Shipping)) {
                return false;
            }
            Shipping shipping = (Shipping) obj;
            return i.a(this.address, shipping.address) && i.a(this.carrier, shipping.carrier) && i.a(this.name, shipping.name) && i.a(this.phone, shipping.phone) && i.a(this.trackingNumber, shipping.trackingNumber);
        }

        public final Address getAddress() {
            return this.address;
        }

        public final String getCarrier() {
            return this.carrier;
        }

        public final String getName() {
            return this.name;
        }

        public final String getPhone() {
            return this.phone;
        }

        public final String getTrackingNumber() {
            return this.trackingNumber;
        }

        public int hashCode() {
            Address address2 = this.address;
            int i = 0;
            int hashCode = (address2 != null ? address2.hashCode() : 0) * 31;
            String str = this.carrier;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.phone;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.trackingNumber;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Shipping(address=");
            P0.append(this.address);
            P0.append(", carrier=");
            P0.append(this.carrier);
            P0.append(", name=");
            P0.append(this.name);
            P0.append(", phone=");
            P0.append(this.phone);
            P0.append(", trackingNumber=");
            return a.y0(P0, this.trackingNumber, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            this.address.writeToParcel(parcel, 0);
            parcel.writeString(this.carrier);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
            parcel.writeString(this.trackingNumber);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Shipping(Address address2, String str, String str2, String str3, String str4, int i, f fVar) {
            this(address2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }
    }

    public PaymentIntent(String str, List<String> list, Long l, long j, CancellationReason cancellationReason2, CaptureMethod captureMethod2, String str2, ConfirmationMethod confirmationMethod2, long j2, String str3, String str4, boolean z, Map<String, ? extends Object> map, PaymentMethod paymentMethod2, String str5, String str6, StripeIntent.Status status2, StripeIntent.Usage usage, Error error, Shipping shipping2, StripeIntent.NextActionData nextActionData2) {
        i.e(list, "paymentMethodTypes");
        i.e(captureMethod2, "captureMethod");
        i.e(confirmationMethod2, "confirmationMethod");
        this.id = str;
        this.paymentMethodTypes = list;
        this.amount = l;
        this.canceledAt = j;
        this.cancellationReason = cancellationReason2;
        this.captureMethod = captureMethod2;
        this.clientSecret = str2;
        this.confirmationMethod = confirmationMethod2;
        this.created = j2;
        this.currency = str3;
        this.description = str4;
        this.isLiveMode = z;
        this.nextAction = map;
        this.paymentMethod = paymentMethod2;
        this.paymentMethodId = str5;
        this.receiptEmail = str6;
        this.status = status2;
        this.setupFutureUsage = usage;
        this.lastPaymentError = error;
        this.shipping = shipping2;
        this.nextActionData = nextActionData2;
    }

    private final StripeIntent.Usage component18() {
        return this.setupFutureUsage;
    }

    public static /* synthetic */ PaymentIntent copy$default(PaymentIntent paymentIntent, String str, List list, Long l, long j, CancellationReason cancellationReason2, CaptureMethod captureMethod2, String str2, ConfirmationMethod confirmationMethod2, long j2, String str3, String str4, boolean z, Map map, PaymentMethod paymentMethod2, String str5, String str6, StripeIntent.Status status2, StripeIntent.Usage usage, Error error, Shipping shipping2, StripeIntent.NextActionData nextActionData2, int i, Object obj) {
        PaymentIntent paymentIntent2 = paymentIntent;
        int i2 = i;
        return paymentIntent.copy((i2 & 1) != 0 ? paymentIntent.getId() : str, (i2 & 2) != 0 ? paymentIntent.getPaymentMethodTypes() : list, (i2 & 4) != 0 ? paymentIntent2.amount : l, (i2 & 8) != 0 ? paymentIntent2.canceledAt : j, (i2 & 16) != 0 ? paymentIntent2.cancellationReason : cancellationReason2, (i2 & 32) != 0 ? paymentIntent2.captureMethod : captureMethod2, (i2 & 64) != 0 ? paymentIntent.getClientSecret() : str2, (i2 & 128) != 0 ? paymentIntent2.confirmationMethod : confirmationMethod2, (i2 & 256) != 0 ? paymentIntent.getCreated() : j2, (i2 & 512) != 0 ? paymentIntent2.currency : str3, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? paymentIntent.getDescription() : str4, (i2 & 2048) != 0 ? paymentIntent.isLiveMode() : z, (i2 & 4096) != 0 ? paymentIntent2.nextAction : map, (i2 & 8192) != 0 ? paymentIntent.getPaymentMethod() : paymentMethod2, (i2 & 16384) != 0 ? paymentIntent.getPaymentMethodId() : str5, (i2 & 32768) != 0 ? paymentIntent2.receiptEmail : str6, (i2 & 65536) != 0 ? paymentIntent.getStatus() : status2, (i2 & 131072) != 0 ? paymentIntent2.setupFutureUsage : usage, (i2 & 262144) != 0 ? paymentIntent2.lastPaymentError : error, (i2 & 524288) != 0 ? paymentIntent2.shipping : shipping2, (i2 & 1048576) != 0 ? paymentIntent.getNextActionData() : nextActionData2);
    }

    public static final PaymentIntent fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public final String component1() {
        return getId();
    }

    public final String component10() {
        return this.currency;
    }

    public final String component11() {
        return getDescription();
    }

    public final boolean component12() {
        return isLiveMode();
    }

    public final Map<String, Object> component13() {
        return this.nextAction;
    }

    public final PaymentMethod component14() {
        return getPaymentMethod();
    }

    public final String component15() {
        return getPaymentMethodId();
    }

    public final String component16() {
        return this.receiptEmail;
    }

    public final StripeIntent.Status component17() {
        return getStatus();
    }

    public final Error component19() {
        return this.lastPaymentError;
    }

    public final List<String> component2() {
        return getPaymentMethodTypes();
    }

    public final Shipping component20() {
        return this.shipping;
    }

    public final StripeIntent.NextActionData component21() {
        return getNextActionData();
    }

    public final Long component3() {
        return this.amount;
    }

    public final long component4() {
        return this.canceledAt;
    }

    public final CancellationReason component5() {
        return this.cancellationReason;
    }

    public final CaptureMethod component6() {
        return this.captureMethod;
    }

    public final String component7() {
        return getClientSecret();
    }

    public final ConfirmationMethod component8() {
        return this.confirmationMethod;
    }

    public final long component9() {
        return getCreated();
    }

    public final PaymentIntent copy(String str, List<String> list, Long l, long j, CancellationReason cancellationReason2, CaptureMethod captureMethod2, String str2, ConfirmationMethod confirmationMethod2, long j2, String str3, String str4, boolean z, Map<String, ? extends Object> map, PaymentMethod paymentMethod2, String str5, String str6, StripeIntent.Status status2, StripeIntent.Usage usage, Error error, Shipping shipping2, StripeIntent.NextActionData nextActionData2) {
        String str7 = str;
        i.e(list, "paymentMethodTypes");
        i.e(captureMethod2, "captureMethod");
        i.e(confirmationMethod2, "confirmationMethod");
        return new PaymentIntent(str, list, l, j, cancellationReason2, captureMethod2, str2, confirmationMethod2, j2, str3, str4, z, map, paymentMethod2, str5, str6, status2, usage, error, shipping2, nextActionData2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentIntent)) {
            return false;
        }
        PaymentIntent paymentIntent = (PaymentIntent) obj;
        return i.a(getId(), paymentIntent.getId()) && i.a(getPaymentMethodTypes(), paymentIntent.getPaymentMethodTypes()) && i.a(this.amount, paymentIntent.amount) && this.canceledAt == paymentIntent.canceledAt && i.a(this.cancellationReason, paymentIntent.cancellationReason) && i.a(this.captureMethod, paymentIntent.captureMethod) && i.a(getClientSecret(), paymentIntent.getClientSecret()) && i.a(this.confirmationMethod, paymentIntent.confirmationMethod) && getCreated() == paymentIntent.getCreated() && i.a(this.currency, paymentIntent.currency) && i.a(getDescription(), paymentIntent.getDescription()) && isLiveMode() == paymentIntent.isLiveMode() && i.a(this.nextAction, paymentIntent.nextAction) && i.a(getPaymentMethod(), paymentIntent.getPaymentMethod()) && i.a(getPaymentMethodId(), paymentIntent.getPaymentMethodId()) && i.a(this.receiptEmail, paymentIntent.receiptEmail) && i.a(getStatus(), paymentIntent.getStatus()) && i.a(this.setupFutureUsage, paymentIntent.setupFutureUsage) && i.a(this.lastPaymentError, paymentIntent.lastPaymentError) && i.a(this.shipping, paymentIntent.shipping) && i.a(getNextActionData(), paymentIntent.getNextActionData());
    }

    public final Long getAmount() {
        return this.amount;
    }

    public final long getCanceledAt() {
        return this.canceledAt;
    }

    public final CancellationReason getCancellationReason() {
        return this.cancellationReason;
    }

    public final CaptureMethod getCaptureMethod() {
        return this.captureMethod;
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public final ConfirmationMethod getConfirmationMethod() {
        return this.confirmationMethod;
    }

    public long getCreated() {
        return this.created;
    }

    public final String getCurrency() {
        return this.currency;
    }

    public String getDescription() {
        return this.description;
    }

    public String getId() {
        return this.id;
    }

    public String getLastErrorMessage() {
        Error error = this.lastPaymentError;
        if (error != null) {
            return error.getMessage();
        }
        return null;
    }

    public final Error getLastPaymentError() {
        return this.lastPaymentError;
    }

    public final Map<String, Object> getNextAction() {
        return this.nextAction;
    }

    public StripeIntent.NextActionData getNextActionData() {
        return this.nextActionData;
    }

    public StripeIntent.NextActionType getNextActionType() {
        StripeIntent.NextActionData nextActionData2 = getNextActionData();
        if (nextActionData2 instanceof StripeIntent.NextActionData.SdkData) {
            return StripeIntent.NextActionType.UseStripeSdk;
        }
        if (nextActionData2 instanceof StripeIntent.NextActionData.RedirectToUrl) {
            return StripeIntent.NextActionType.RedirectToUrl;
        }
        if (nextActionData2 instanceof StripeIntent.NextActionData.DisplayOxxoDetails) {
            return StripeIntent.NextActionType.DisplayOxxoDetails;
        }
        return null;
    }

    public PaymentMethod getPaymentMethod() {
        return this.paymentMethod;
    }

    public String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public List<String> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    public final String getReceiptEmail() {
        return this.receiptEmail;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    public StripeIntent.Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        String id2 = getId();
        int i = 0;
        int hashCode = (id2 != null ? id2.hashCode() : 0) * 31;
        List<String> paymentMethodTypes2 = getPaymentMethodTypes();
        int hashCode2 = (hashCode + (paymentMethodTypes2 != null ? paymentMethodTypes2.hashCode() : 0)) * 31;
        Long l = this.amount;
        int hashCode3 = (Long.hashCode(this.canceledAt) + ((hashCode2 + (l != null ? l.hashCode() : 0)) * 31)) * 31;
        CancellationReason cancellationReason2 = this.cancellationReason;
        int hashCode4 = (hashCode3 + (cancellationReason2 != null ? cancellationReason2.hashCode() : 0)) * 31;
        CaptureMethod captureMethod2 = this.captureMethod;
        int hashCode5 = (hashCode4 + (captureMethod2 != null ? captureMethod2.hashCode() : 0)) * 31;
        String clientSecret2 = getClientSecret();
        int hashCode6 = (hashCode5 + (clientSecret2 != null ? clientSecret2.hashCode() : 0)) * 31;
        ConfirmationMethod confirmationMethod2 = this.confirmationMethod;
        int hashCode7 = (Long.hashCode(getCreated()) + ((hashCode6 + (confirmationMethod2 != null ? confirmationMethod2.hashCode() : 0)) * 31)) * 31;
        String str = this.currency;
        int hashCode8 = (hashCode7 + (str != null ? str.hashCode() : 0)) * 31;
        String description2 = getDescription();
        int hashCode9 = (hashCode8 + (description2 != null ? description2.hashCode() : 0)) * 31;
        boolean isLiveMode2 = isLiveMode();
        if (isLiveMode2) {
            isLiveMode2 = true;
        }
        int i2 = (hashCode9 + (isLiveMode2 ? 1 : 0)) * 31;
        Map<String, Object> map = this.nextAction;
        int hashCode10 = (i2 + (map != null ? map.hashCode() : 0)) * 31;
        PaymentMethod paymentMethod2 = getPaymentMethod();
        int hashCode11 = (hashCode10 + (paymentMethod2 != null ? paymentMethod2.hashCode() : 0)) * 31;
        String paymentMethodId2 = getPaymentMethodId();
        int hashCode12 = (hashCode11 + (paymentMethodId2 != null ? paymentMethodId2.hashCode() : 0)) * 31;
        String str2 = this.receiptEmail;
        int hashCode13 = (hashCode12 + (str2 != null ? str2.hashCode() : 0)) * 31;
        StripeIntent.Status status2 = getStatus();
        int hashCode14 = (hashCode13 + (status2 != null ? status2.hashCode() : 0)) * 31;
        StripeIntent.Usage usage = this.setupFutureUsage;
        int hashCode15 = (hashCode14 + (usage != null ? usage.hashCode() : 0)) * 31;
        Error error = this.lastPaymentError;
        int hashCode16 = (hashCode15 + (error != null ? error.hashCode() : 0)) * 31;
        Shipping shipping2 = this.shipping;
        int hashCode17 = (hashCode16 + (shipping2 != null ? shipping2.hashCode() : 0)) * 31;
        StripeIntent.NextActionData nextActionData2 = getNextActionData();
        if (nextActionData2 != null) {
            i = nextActionData2.hashCode();
        }
        return hashCode17 + i;
    }

    public boolean isConfirmed() {
        return g.f(g.h0(StripeIntent.Status.Processing, StripeIntent.Status.RequiresCapture, StripeIntent.Status.Succeeded), getStatus());
    }

    public boolean isLiveMode() {
        return this.isLiveMode;
    }

    public boolean requiresAction() {
        return getStatus() == StripeIntent.Status.RequiresAction;
    }

    public boolean requiresConfirmation() {
        return getStatus() == StripeIntent.Status.RequiresConfirmation;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PaymentIntent(id=");
        P0.append(getId());
        P0.append(", paymentMethodTypes=");
        P0.append(getPaymentMethodTypes());
        P0.append(", amount=");
        P0.append(this.amount);
        P0.append(", canceledAt=");
        P0.append(this.canceledAt);
        P0.append(", cancellationReason=");
        P0.append(this.cancellationReason);
        P0.append(", captureMethod=");
        P0.append(this.captureMethod);
        P0.append(", clientSecret=");
        P0.append(getClientSecret());
        P0.append(", confirmationMethod=");
        P0.append(this.confirmationMethod);
        P0.append(", created=");
        P0.append(getCreated());
        P0.append(", currency=");
        P0.append(this.currency);
        P0.append(", description=");
        P0.append(getDescription());
        P0.append(", isLiveMode=");
        P0.append(isLiveMode());
        P0.append(", nextAction=");
        P0.append(this.nextAction);
        P0.append(", paymentMethod=");
        P0.append(getPaymentMethod());
        P0.append(", paymentMethodId=");
        P0.append(getPaymentMethodId());
        P0.append(", receiptEmail=");
        P0.append(this.receiptEmail);
        P0.append(", status=");
        P0.append(getStatus());
        P0.append(", setupFutureUsage=");
        P0.append(this.setupFutureUsage);
        P0.append(", lastPaymentError=");
        P0.append(this.lastPaymentError);
        P0.append(", shipping=");
        P0.append(this.shipping);
        P0.append(", nextActionData=");
        P0.append(getNextActionData());
        P0.append(")");
        return P0.toString();
    }

    /* JADX WARNING: type inference failed for: r3v3, types: [java.util.Map$Entry, java.lang.Object] */
    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.id);
        parcel.writeStringList(this.paymentMethodTypes);
        Long l = this.amount;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeLong(this.canceledAt);
        CancellationReason cancellationReason2 = this.cancellationReason;
        if (cancellationReason2 != null) {
            parcel.writeInt(1);
            parcel.writeString(cancellationReason2.name());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.captureMethod.name());
        parcel.writeString(this.clientSecret);
        parcel.writeString(this.confirmationMethod.name());
        parcel.writeLong(this.created);
        parcel.writeString(this.currency);
        parcel.writeString(this.description);
        parcel.writeInt(this.isLiveMode ? 1 : 0);
        Map<String, Object> map = this.nextAction;
        if (map != null) {
            Iterator l1 = a.l1(parcel, 1, map);
            while (l1.hasNext()) {
                ? next = l1.next();
                parcel.writeString((String) next.getKey());
                parcel.writeValue(next.getValue());
            }
        } else {
            parcel.writeInt(0);
        }
        PaymentMethod paymentMethod2 = this.paymentMethod;
        if (paymentMethod2 != null) {
            parcel.writeInt(1);
            paymentMethod2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.paymentMethodId);
        parcel.writeString(this.receiptEmail);
        StripeIntent.Status status2 = this.status;
        if (status2 != null) {
            parcel.writeInt(1);
            parcel.writeString(status2.name());
        } else {
            parcel.writeInt(0);
        }
        StripeIntent.Usage usage = this.setupFutureUsage;
        if (usage != null) {
            parcel.writeInt(1);
            parcel.writeString(usage.name());
        } else {
            parcel.writeInt(0);
        }
        Error error = this.lastPaymentError;
        if (error != null) {
            parcel.writeInt(1);
            error.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Shipping shipping2 = this.shipping;
        if (shipping2 != null) {
            parcel.writeInt(1);
            shipping2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeParcelable(this.nextActionData, i);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PaymentIntent(java.lang.String r28, java.util.List r29, java.lang.Long r30, long r31, com.stripe.android.model.PaymentIntent.CancellationReason r33, com.stripe.android.model.PaymentIntent.CaptureMethod r34, java.lang.String r35, com.stripe.android.model.PaymentIntent.ConfirmationMethod r36, long r37, java.lang.String r39, java.lang.String r40, boolean r41, java.util.Map r42, com.stripe.android.model.PaymentMethod r43, java.lang.String r44, java.lang.String r45, com.stripe.android.model.StripeIntent.Status r46, com.stripe.android.model.StripeIntent.Usage r47, com.stripe.android.model.PaymentIntent.Error r48, com.stripe.android.model.PaymentIntent.Shipping r49, com.stripe.android.model.StripeIntent.NextActionData r50, int r51, m0.n.b.f r52) {
        /*
            r27 = this;
            r0 = r51
            r1 = r0 & 8
            if (r1 == 0) goto L_0x000a
            r1 = 0
            r7 = r1
            goto L_0x000c
        L_0x000a:
            r7 = r31
        L_0x000c:
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r9 = r2
            goto L_0x0015
        L_0x0013:
            r9 = r33
        L_0x0015:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x001d
            com.stripe.android.model.PaymentIntent$CaptureMethod r1 = com.stripe.android.model.PaymentIntent.CaptureMethod.Automatic
            r10 = r1
            goto L_0x001f
        L_0x001d:
            r10 = r34
        L_0x001f:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0027
            com.stripe.android.model.PaymentIntent$ConfirmationMethod r1 = com.stripe.android.model.PaymentIntent.ConfirmationMethod.Automatic
            r12 = r1
            goto L_0x0029
        L_0x0027:
            r12 = r36
        L_0x0029:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0030
            r16 = r2
            goto L_0x0032
        L_0x0030:
            r16 = r40
        L_0x0032:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0039
            r18 = r2
            goto L_0x003b
        L_0x0039:
            r18 = r42
        L_0x003b:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0042
            r19 = r2
            goto L_0x0044
        L_0x0042:
            r19 = r43
        L_0x0044:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x004b
            r20 = r2
            goto L_0x004d
        L_0x004b:
            r20 = r44
        L_0x004d:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0056
            r21 = r2
            goto L_0x0058
        L_0x0056:
            r21 = r45
        L_0x0058:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0060
            r22 = r2
            goto L_0x0062
        L_0x0060:
            r22 = r46
        L_0x0062:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x006a
            r23 = r2
            goto L_0x006c
        L_0x006a:
            r23 = r47
        L_0x006c:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0074
            r24 = r2
            goto L_0x0076
        L_0x0074:
            r24 = r48
        L_0x0076:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x007e
            r25 = r2
            goto L_0x0080
        L_0x007e:
            r25 = r49
        L_0x0080:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0088
            r26 = r2
            goto L_0x008a
        L_0x0088:
            r26 = r50
        L_0x008a:
            r3 = r27
            r4 = r28
            r5 = r29
            r6 = r30
            r11 = r35
            r13 = r37
            r15 = r39
            r17 = r41
            r3.<init>(r4, r5, r6, r7, r9, r10, r11, r12, r13, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.PaymentIntent.<init>(java.lang.String, java.util.List, java.lang.Long, long, com.stripe.android.model.PaymentIntent$CancellationReason, com.stripe.android.model.PaymentIntent$CaptureMethod, java.lang.String, com.stripe.android.model.PaymentIntent$ConfirmationMethod, long, java.lang.String, java.lang.String, boolean, java.util.Map, com.stripe.android.model.PaymentMethod, java.lang.String, java.lang.String, com.stripe.android.model.StripeIntent$Status, com.stripe.android.model.StripeIntent$Usage, com.stripe.android.model.PaymentIntent$Error, com.stripe.android.model.PaymentIntent$Shipping, com.stripe.android.model.StripeIntent$NextActionData, int, m0.n.b.f):void");
    }
}
