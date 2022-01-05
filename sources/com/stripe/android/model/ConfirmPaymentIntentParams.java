package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.MandateDataParams;
import com.stripe.android.model.PaymentMethodCreateParams;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b7\b\b\u0018\u0000 p2\u00020\u0001:\u0003pqrBÃ\u0001\b\u0000\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n\u0012\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\u0006\u0010/\u001a\u00020\n\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00102\u001a\u00020\u0002\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010 \u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\n¢\u0006\u0004\bn\u0010oJ\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u001e\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0017\u0010\rJ\u0010\u0010\u0018\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0012J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0012J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0012J\u0012\u0010!\u001a\u0004\u0018\u00010 HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b)\u0010\u0012JÌ\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\b\b\u0002\u0010/\u001a\u00020\n2\n\b\u0002\u00100\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u00102\u001a\u00020\u00022\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u001c2\n\b\u0002\u00104\u001a\u0004\u0018\u00010\n2\n\b\u0002\u00105\u001a\u0004\u0018\u00010 2\n\b\u0002\u00106\u001a\u0004\u0018\u00010#2\n\b\u0002\u00107\u001a\u0004\u0018\u00010&2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b9\u0010:J\u0010\u0010;\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b;\u0010\u0012J\u0010\u0010=\u001a\u00020<HÖ\u0001¢\u0006\u0004\b=\u0010>J\u001a\u0010@\u001a\u00020\u00022\b\u0010?\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b@\u0010AR\"\u0010C\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bB\u0010\rR\u001b\u0010-\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010D\u001a\u0004\bE\u0010\u0012R$\u00100\u001a\u0004\u0018\u00010\n8\u0016@\u0016X\u000e¢\u0006\u0012\n\u0004\b0\u0010D\u001a\u0004\bF\u0010\u0012\"\u0004\bG\u0010HR$\u00105\u001a\u0004\u0018\u00010 8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b5\u0010I\u001a\u0004\bJ\u0010\"\"\u0004\bK\u0010LR$\u00101\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b1\u0010M\u001a\u0004\bN\u0010\u001b\"\u0004\bO\u0010PR$\u00103\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b3\u0010Q\u001a\u0004\bR\u0010\u001e\"\u0004\bS\u0010TR\u001b\u0010*\u001a\u0004\u0018\u00010\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010U\u001a\u0004\bV\u0010\u0010R\u001b\u0010+\u001a\u0004\u0018\u00010\n8\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010D\u001a\u0004\bW\u0010\u0012R\u001b\u0010,\u001a\u0004\u0018\u00010\u00138\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010X\u001a\u0004\bY\u0010\u0015R$\u00104\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b4\u0010D\u001a\u0004\bZ\u0010\u0012\"\u0004\b[\u0010HR\u001c\u0010/\u001a\u00020\n8\u0016@\u0016X\u0004¢\u0006\f\n\u0004\b/\u0010D\u001a\u0004\b\\\u0010\u0012R$\u00108\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b8\u0010D\u001a\u0004\b]\u0010\u0012\"\u0004\b^\u0010HR0\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0006@\u0007X\u0004¢\u0006\u0012\n\u0004\b.\u0010_\u0012\u0004\ba\u0010b\u001a\u0004\b`\u0010\rR$\u00106\u001a\u0004\u0018\u00010#8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b6\u0010c\u001a\u0004\bd\u0010%\"\u0004\be\u0010fR$\u0010h\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bg\u0010\rR$\u00107\u001a\u0004\u0018\u00010&8\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b7\u0010i\u001a\u0004\bj\u0010(\"\u0004\bk\u0010lR\u0016\u00102\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010m¨\u0006s"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/model/ConfirmStripeIntentParams;", "", "component9", "()Z", "shouldSavePaymentMethod", "shouldUseStripeSdk", "withShouldUseStripeSdk", "(Z)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "", "", "", "toParamMap", "()Ljava/util/Map;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "component1", "()Lcom/stripe/android/model/PaymentMethodCreateParams;", "component2", "()Ljava/lang/String;", "Lcom/stripe/android/model/SourceParams;", "component3", "()Lcom/stripe/android/model/SourceParams;", "component4", "component5", "component6", "component7", "component8", "()Ljava/lang/Boolean;", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "component10", "()Lcom/stripe/android/model/PaymentMethodOptionsParams;", "component11", "Lcom/stripe/android/model/MandateDataParams;", "component12", "()Lcom/stripe/android/model/MandateDataParams;", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "component13", "()Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "component14", "()Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "component15", "paymentMethodCreateParams", "paymentMethodId", "sourceParams", "sourceId", "extraParams", "clientSecret", "returnUrl", "savePaymentMethod", "useStripeSdk", "paymentMethodOptions", "mandateId", "mandateData", "setupFutureUsage", "shipping", "receiptEmail", "copy", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Ljava/lang/String;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "toString", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "getPaymentMethodParamMap", "paymentMethodParamMap", "Ljava/lang/String;", "getSourceId", "getReturnUrl", "setReturnUrl", "(Ljava/lang/String;)V", "Lcom/stripe/android/model/MandateDataParams;", "getMandateData", "setMandateData", "(Lcom/stripe/android/model/MandateDataParams;)V", "Ljava/lang/Boolean;", "getSavePaymentMethod", "setSavePaymentMethod", "(Ljava/lang/Boolean;)V", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "getPaymentMethodOptions", "setPaymentMethodOptions", "(Lcom/stripe/android/model/PaymentMethodOptionsParams;)V", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "getPaymentMethodCreateParams", "getPaymentMethodId", "Lcom/stripe/android/model/SourceParams;", "getSourceParams", "getMandateId", "setMandateId", "getClientSecret", "getReceiptEmail", "setReceiptEmail", "Ljava/util/Map;", "getExtraParams", "getExtraParams$annotations", "()V", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "getSetupFutureUsage", "setSetupFutureUsage", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)V", "getMandateDataParams", "mandateDataParams", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "getShipping", "setShipping", "(Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)V", "Z", "<init>", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;ZLcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Ljava/lang/String;)V", "Companion", "SetupFutureUsage", "Shipping", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ConfirmPaymentIntentParams.kt */
public final class ConfirmPaymentIntentParams implements ConfirmStripeIntentParams {
    public static final Companion Companion = new Companion((f) null);
    private static final String PARAM_PAYMENT_METHOD_OPTIONS = "payment_method_options";
    private static final String PARAM_RECEIPT_EMAIL = "receipt_email";
    private static final String PARAM_SAVE_PAYMENT_METHOD = "save_payment_method";
    private static final String PARAM_SETUP_FUTURE_USAGE = "setup_future_usage";
    private static final String PARAM_SHIPPING = "shipping";
    public static final String PARAM_SOURCE_DATA = "source_data";
    private static final String PARAM_SOURCE_ID = "source";
    private final String clientSecret;
    private final Map<String, Object> extraParams;
    private MandateDataParams mandateData;
    private String mandateId;
    private final PaymentMethodCreateParams paymentMethodCreateParams;
    private final String paymentMethodId;
    private PaymentMethodOptionsParams paymentMethodOptions;
    private String receiptEmail;
    private String returnUrl;
    private Boolean savePaymentMethod;
    private SetupFutureUsage setupFutureUsage;
    private Shipping shipping;
    private final String sourceId;
    private final SourceParams sourceParams;
    private final boolean useStripeSdk;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b5\u00106J/\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\nJ9\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\fJE\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\u000fJg\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019Jq\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u001aJ\u0001\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u001bJ[\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001e\u0010\u001fJe\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001e\u0010 J}\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u001e\u0010!J?\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b#\u0010$JU\u0010#\u001a\u00020\b2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b#\u0010%J?\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b(\u0010)JU\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r2\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b(\u0010*J\u0017\u0010+\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b+\u0010,R\u0016\u0010-\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010/\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b/\u0010.R\u0016\u00100\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b0\u0010.R\u0016\u00101\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b1\u0010.R\u0016\u00102\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b2\u0010.R\u0016\u00103\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b3\u0010.R\u0016\u00104\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b4\u0010.¨\u00067"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$Companion;", "", "", "clientSecret", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "shipping", "Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "setupFutureUsage", "Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "create", "(Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "returnUrl", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "", "extraParams", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "paymentMethodId", "", "savePaymentMethod", "Lcom/stripe/android/model/PaymentMethodOptionsParams;", "paymentMethodOptions", "mandateId", "Lcom/stripe/android/model/MandateDataParams;", "mandateData", "createWithPaymentMethodId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethodOptionsParams;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "paymentMethodCreateParams", "createWithPaymentMethodCreateParams", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "(Lcom/stripe/android/model/PaymentMethodCreateParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Ljava/lang/String;Lcom/stripe/android/model/MandateDataParams;Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "sourceId", "createWithSourceId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "Lcom/stripe/android/model/SourceParams;", "sourceParams", "createWithSourceParams", "(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "(Lcom/stripe/android/model/SourceParams;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/util/Map;Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "createAlipay", "(Ljava/lang/String;)Lcom/stripe/android/model/ConfirmPaymentIntentParams;", "PARAM_PAYMENT_METHOD_OPTIONS", "Ljava/lang/String;", "PARAM_RECEIPT_EMAIL", "PARAM_SAVE_PAYMENT_METHOD", "PARAM_SETUP_FUTURE_USAGE", "PARAM_SHIPPING", "PARAM_SOURCE_DATA", "PARAM_SOURCE_ID", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ConfirmPaymentIntentParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ ConfirmPaymentIntentParams create$default(Companion companion, String str, Shipping shipping, SetupFutureUsage setupFutureUsage, int i, Object obj) {
            if ((i & 2) != 0) {
                shipping = null;
            }
            if ((i & 4) != 0) {
                setupFutureUsage = null;
            }
            return companion.create(str, shipping, setupFutureUsage);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithPaymentMethodCreateParams$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, int i, Object obj) {
            return companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str2, (i & 16) != 0 ? null : mandateDataParams, (i & 32) != 0 ? null : setupFutureUsage, (i & 64) != 0 ? null : shipping);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithPaymentMethodId$default(Companion companion, String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, int i, Object obj) {
            int i2 = i;
            return companion.createWithPaymentMethodId(str, str2, (i2 & 4) != 0 ? null : bool, (i2 & 8) != 0 ? null : paymentMethodOptionsParams, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : mandateDataParams, (i2 & 64) != 0 ? null : setupFutureUsage, (i2 & 128) != 0 ? null : shipping);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithSourceId$default(Companion companion, String str, String str2, String str3, Boolean bool, Shipping shipping, int i, Object obj) {
            return companion.createWithSourceId(str, str2, str3, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : shipping);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithSourceParams$default(Companion companion, SourceParams sourceParams, String str, String str2, Boolean bool, Shipping shipping, int i, Object obj) {
            return companion.createWithSourceParams(sourceParams, str, str2, (i & 8) != 0 ? null : bool, (i & 16) != 0 ? null : shipping);
        }

        public final ConfirmPaymentIntentParams create(String str) {
            return create$default(this, str, (Shipping) null, (SetupFutureUsage) null, 6, (Object) null);
        }

        public final ConfirmPaymentIntentParams create(String str, Shipping shipping) {
            return create$default(this, str, shipping, (SetupFutureUsage) null, 4, (Object) null);
        }

        public final ConfirmPaymentIntentParams create(String str, Shipping shipping, SetupFutureUsage setupFutureUsage) {
            SetupFutureUsage setupFutureUsage2 = setupFutureUsage;
            i.e(str, "clientSecret");
            return new ConfirmPaymentIntentParams((PaymentMethodCreateParams) null, (String) null, (SourceParams) null, (String) null, (Map) null, str, (String) null, (Boolean) null, false, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, setupFutureUsage2, shipping, (String) null, 20447, (f) null);
        }

        public final ConfirmPaymentIntentParams create(String str, String str2) {
            return create$default(this, str, str2, (Shipping) null, (SetupFutureUsage) null, 12, (Object) null);
        }

        public final ConfirmPaymentIntentParams create(String str, String str2, Shipping shipping) {
            return create$default(this, str, str2, shipping, (SetupFutureUsage) null, 8, (Object) null);
        }

        public final ConfirmPaymentIntentParams create(String str, String str2, Map<String, ? extends Object> map) {
            return create$default(this, str, str2, (Map) map, (Shipping) null, 8, (Object) null);
        }

        public final ConfirmPaymentIntentParams create(String str, Map<String, ? extends Object> map) {
            return create$default(this, str, (String) null, (Map) map, (Shipping) null, 10, (Object) null);
        }

        public final ConfirmPaymentIntentParams createAlipay(String str) {
            i.e(str, "clientSecret");
            return new ConfirmPaymentIntentParams(PaymentMethodCreateParams.Companion.createAlipay$default(PaymentMethodCreateParams.Companion, (Map) null, 1, (Object) null), (String) null, (SourceParams) null, (String) null, (Map) null, str, "stripe://return_url", (Boolean) null, false, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, (String) null, 32670, (f) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, (Boolean) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 124, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, bool, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 120, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, bool, str2, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 112, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, bool, str2, mandateDataParams, (SetupFutureUsage) null, (Shipping) null, 96, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, bool, str2, mandateDataParams, setupFutureUsage, (Shipping) null, 64, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
            i.e(paymentMethodCreateParams, "paymentMethodCreateParams");
            i.e(str, "clientSecret");
            return new ConfirmPaymentIntentParams(paymentMethodCreateParams, (String) null, (SourceParams) null, (String) null, (Map) null, str, (String) null, bool, false, (PaymentMethodOptionsParams) null, str2, mandateDataParams, setupFutureUsage, shipping, (String) null, 17246, (f) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, str2, (Boolean) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 248, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Boolean bool) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, str2, bool, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 240, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Boolean bool, String str3) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, str2, bool, str3, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 224, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Boolean bool, String str3, MandateDataParams mandateDataParams) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, str2, bool, str3, mandateDataParams, (SetupFutureUsage) null, (Shipping) null, 192, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Boolean bool, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, str2, bool, str3, mandateDataParams, setupFutureUsage, (Shipping) null, 128, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Boolean bool, Map<String, ? extends Object> map) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, str2, bool, map, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 480, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Boolean bool, Map<String, ? extends Object> map, String str3) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, str2, bool, map, str3, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 448, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Boolean bool, Map<String, ? extends Object> map, String str3, MandateDataParams mandateDataParams) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, str2, bool, map, str3, mandateDataParams, (SetupFutureUsage) null, (Shipping) null, 384, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Boolean bool, Map<String, ? extends Object> map, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, str2, bool, map, str3, mandateDataParams, setupFutureUsage, (Shipping) null, 256, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Map<String, ? extends Object> map) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, str2, (Boolean) null, map, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 488, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, Map<String, ? extends Object> map) {
            return createWithPaymentMethodCreateParams$default(this, paymentMethodCreateParams, str, (String) null, (Boolean) null, map, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 492, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2) {
            return createWithPaymentMethodId$default(this, str, str2, (Boolean) null, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 252, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool) {
            return createWithPaymentMethodId$default(this, str, str2, bool, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 248, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams) {
            return createWithPaymentMethodId$default(this, str, str2, bool, paymentMethodOptionsParams, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 240, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3) {
            return createWithPaymentMethodId$default(this, str, str2, bool, paymentMethodOptionsParams, str3, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 224, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams) {
            return createWithPaymentMethodId$default(this, str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams, (SetupFutureUsage) null, (Shipping) null, 192, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
            return createWithPaymentMethodId$default(this, str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams, setupFutureUsage, (Shipping) null, 128, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
            i.e(str, "paymentMethodId");
            i.e(str2, "clientSecret");
            return new ConfirmPaymentIntentParams((PaymentMethodCreateParams) null, str, (SourceParams) null, (String) null, (Map) null, str2, (String) null, bool, false, paymentMethodOptionsParams, str3, mandateDataParams, setupFutureUsage, shipping, (String) null, 16733, (f) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3) {
            return createWithPaymentMethodId$default(this, str, str2, str3, (Boolean) null, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 504, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool) {
            return createWithPaymentMethodId$default(this, str, str2, str3, bool, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 496, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams) {
            return createWithPaymentMethodId$default(this, str, str2, str3, bool, paymentMethodOptionsParams, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 480, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4) {
            return createWithPaymentMethodId$default(this, str, str2, str3, bool, paymentMethodOptionsParams, str4, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 448, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams) {
            return createWithPaymentMethodId$default(this, str, str2, str3, bool, paymentMethodOptionsParams, str4, mandateDataParams, (SetupFutureUsage) null, (Shipping) null, 384, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
            return createWithPaymentMethodId$default(this, str, str2, str3, bool, paymentMethodOptionsParams, str4, mandateDataParams, setupFutureUsage, (Shipping) null, 256, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map) {
            return createWithPaymentMethodId$default(this, str, str2, str3, bool, map, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 992, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, PaymentMethodOptionsParams paymentMethodOptionsParams) {
            return createWithPaymentMethodId$default(this, str, str2, str3, bool, map, paymentMethodOptionsParams, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 960, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4) {
            return createWithPaymentMethodId$default(this, str, str2, str3, bool, map, paymentMethodOptionsParams, str4, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 896, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams) {
            return createWithPaymentMethodId$default(this, str, str2, str3, bool, map, paymentMethodOptionsParams, str4, mandateDataParams, (SetupFutureUsage) null, (Shipping) null, 768, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage) {
            return createWithPaymentMethodId$default(this, str, str2, str3, bool, map, paymentMethodOptionsParams, str4, mandateDataParams, setupFutureUsage, (Shipping) null, 512, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Map<String, ? extends Object> map) {
            return createWithPaymentMethodId$default(this, str, str2, str3, (Boolean) null, map, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 1000, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Map<String, ? extends Object> map) {
            return createWithPaymentMethodId$default(this, str, str2, (String) null, (Boolean) null, map, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 1004, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3) {
            return createWithSourceId$default(this, str, str2, str3, (Boolean) null, (Shipping) null, 24, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool) {
            return createWithSourceId$default(this, str, str2, str3, bool, (Shipping) null, 16, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool, Shipping shipping) {
            i.e(str, "sourceId");
            i.e(str2, "clientSecret");
            i.e(str3, "returnUrl");
            return new ConfirmPaymentIntentParams((PaymentMethodCreateParams) null, (String) null, (SourceParams) null, str, (Map) null, str2, str3, bool, false, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, shipping, (String) null, 24343, (f) null);
        }

        public final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map) {
            return createWithSourceId$default(this, str, str2, str3, bool, map, (Shipping) null, 32, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Map<String, ? extends Object> map) {
            return createWithSourceId$default(this, str, str2, str3, (Boolean) null, map, (Shipping) null, 40, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2) {
            return createWithSourceParams$default(this, sourceParams, str, str2, (Boolean) null, (Shipping) null, 24, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2, Boolean bool) {
            return createWithSourceParams$default(this, sourceParams, str, str2, bool, (Shipping) null, 16, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2, Boolean bool, Shipping shipping) {
            i.e(sourceParams, "sourceParams");
            i.e(str, "clientSecret");
            i.e(str2, "returnUrl");
            return new ConfirmPaymentIntentParams((PaymentMethodCreateParams) null, (String) null, sourceParams, (String) null, (Map) null, str, str2, bool, false, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, shipping, (String) null, 24347, (f) null);
        }

        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2, Boolean bool, Map<String, ? extends Object> map) {
            return createWithSourceParams$default(this, sourceParams, str, str2, bool, map, (Shipping) null, 32, (Object) null);
        }

        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2, Map<String, ? extends Object> map) {
            return createWithSourceParams$default(this, sourceParams, str, str2, (Boolean) null, map, (Shipping) null, 40, (Object) null);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ ConfirmPaymentIntentParams create$default(Companion companion, String str, String str2, Shipping shipping, SetupFutureUsage setupFutureUsage, int i, Object obj) {
            if ((i & 4) != 0) {
                shipping = null;
            }
            if ((i & 8) != 0) {
                setupFutureUsage = null;
            }
            return companion.create(str, str2, shipping, setupFutureUsage);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithPaymentMethodCreateParams$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Boolean bool, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, int i, Object obj) {
            int i2 = i;
            return companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, str2, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : str3, (i2 & 32) != 0 ? null : mandateDataParams, (i2 & 64) != 0 ? null : setupFutureUsage, (i2 & 128) != 0 ? null : shipping);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithPaymentMethodId$default(Companion companion, String str, String str2, String str3, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, int i, Object obj) {
            int i2 = i;
            return companion.createWithPaymentMethodId(str, str2, str3, (i2 & 8) != 0 ? null : bool, (i2 & 16) != 0 ? null : paymentMethodOptionsParams, (i2 & 32) != 0 ? null : str4, (i2 & 64) != 0 ? null : mandateDataParams, (i2 & 128) != 0 ? null : setupFutureUsage, (i2 & 256) != 0 ? null : shipping);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithSourceId$default(Companion companion, String str, String str2, String str3, Boolean bool, Map map, Shipping shipping, int i, Object obj) {
            return companion.createWithSourceId(str, str2, str3, (i & 8) != 0 ? null : bool, map, (i & 32) != 0 ? null : shipping);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithSourceParams$default(Companion companion, SourceParams sourceParams, String str, String str2, Boolean bool, Map map, Shipping shipping, int i, Object obj) {
            return companion.createWithSourceParams(sourceParams, str, str2, (i & 8) != 0 ? null : bool, map, (i & 32) != 0 ? null : shipping);
        }

        public final ConfirmPaymentIntentParams create(String str, String str2, Shipping shipping, SetupFutureUsage setupFutureUsage) {
            SetupFutureUsage setupFutureUsage2 = setupFutureUsage;
            i.e(str, "clientSecret");
            return new ConfirmPaymentIntentParams((PaymentMethodCreateParams) null, (String) null, (SourceParams) null, (String) null, (Map) null, str, str2, (Boolean) null, false, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, setupFutureUsage2, shipping, (String) null, 20383, (f) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Boolean bool, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
            i.e(paymentMethodCreateParams, "paymentMethodCreateParams");
            i.e(str, "clientSecret");
            return new ConfirmPaymentIntentParams(paymentMethodCreateParams, (String) null, (SourceParams) null, (String) null, (Map) null, str, str2, bool, false, (PaymentMethodOptionsParams) null, str3, mandateDataParams, setupFutureUsage, shipping, (String) null, 17182, (f) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
            i.e(str, "paymentMethodId");
            i.e(str2, "clientSecret");
            return new ConfirmPaymentIntentParams((PaymentMethodCreateParams) null, str, (SourceParams) null, (String) null, (Map) null, str2, str3, bool, false, paymentMethodOptionsParams, str4, mandateDataParams, setupFutureUsage, shipping, (String) null, 16669, (f) null);
        }

        public final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, Shipping shipping) {
            Map<String, ? extends Object> map2 = map;
            i.e(str, "sourceId");
            i.e(str2, "clientSecret");
            i.e(str3, "returnUrl");
            return new ConfirmPaymentIntentParams((PaymentMethodCreateParams) null, (String) null, (SourceParams) null, str, map2, str2, str3, bool, false, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, shipping, (String) null, 24327, (f) null);
        }

        public final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams, String str, String str2, Boolean bool, Map<String, ? extends Object> map, Shipping shipping) {
            Map<String, ? extends Object> map2 = map;
            i.e(sourceParams, "sourceParams");
            i.e(str, "clientSecret");
            i.e(str2, "returnUrl");
            return new ConfirmPaymentIntentParams((PaymentMethodCreateParams) null, (String) null, sourceParams, (String) null, map2, str, str2, bool, false, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, shipping, (String) null, 24331, (f) null);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams create$default(Companion companion, String str, String str2, Map map, Shipping shipping, int i, Object obj) {
            if ((i & 2) != 0) {
                str2 = null;
            }
            if ((i & 8) != 0) {
                shipping = null;
            }
            return companion.create(str, str2, (Map<String, ? extends Object>) map, shipping);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithPaymentMethodCreateParams$default(Companion companion, PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Boolean bool, Map map, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, int i, Object obj) {
            int i2 = i;
            return companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams, str, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : bool, map, (i2 & 32) != 0 ? null : str3, (i2 & 64) != 0 ? null : mandateDataParams, (i2 & 128) != 0 ? null : setupFutureUsage, (i2 & 256) != 0 ? null : shipping);
        }

        public static /* synthetic */ ConfirmPaymentIntentParams createWithPaymentMethodId$default(Companion companion, String str, String str2, String str3, Boolean bool, Map map, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping, int i, Object obj) {
            int i2 = i;
            return companion.createWithPaymentMethodId(str, str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? null : bool, map, (i2 & 32) != 0 ? null : paymentMethodOptionsParams, (i2 & 64) != 0 ? null : str4, (i2 & 128) != 0 ? null : mandateDataParams, (i2 & 256) != 0 ? null : setupFutureUsage, (i2 & 512) != 0 ? null : shipping);
        }

        public final ConfirmPaymentIntentParams create(String str, String str2, Map<String, ? extends Object> map, Shipping shipping) {
            Map<String, ? extends Object> map2 = map;
            i.e(str, "clientSecret");
            return new ConfirmPaymentIntentParams((PaymentMethodCreateParams) null, (String) null, (SourceParams) null, (String) null, map2, str, str2, (Boolean) null, false, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, shipping, (String) null, 24463, (f) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams, String str, String str2, Boolean bool, Map<String, ? extends Object> map, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
            Map<String, ? extends Object> map2 = map;
            i.e(paymentMethodCreateParams, "paymentMethodCreateParams");
            i.e(str, "clientSecret");
            return new ConfirmPaymentIntentParams(paymentMethodCreateParams, (String) null, (SourceParams) null, (String) null, map2, str, str2, bool, false, (PaymentMethodOptionsParams) null, str3, mandateDataParams, setupFutureUsage, shipping, (String) null, 17166, (f) null);
        }

        public final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage, Shipping shipping) {
            Map<String, ? extends Object> map2 = map;
            i.e(str, "paymentMethodId");
            i.e(str2, "clientSecret");
            return new ConfirmPaymentIntentParams((PaymentMethodCreateParams) null, str, (SourceParams) null, (String) null, map2, str2, str3, bool, false, paymentMethodOptionsParams, str4, mandateDataParams, setupFutureUsage, shipping, (String) null, 16653, (f) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$SetupFutureUsage;", "", "", "code", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "OnSession", "OffSession", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ConfirmPaymentIntentParams.kt */
    public enum SetupFutureUsage {
        OnSession("on_session"),
        OffSession("off_session");
        
        private final String code;

        private SetupFutureUsage(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u0000 42\u00020\u00012\u00020\u0002:\u00014B=\b\u0007\u0012\u0006\u0010\u0015\u001a\u00020\b\u0012\u0006\u0010\u0016\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b2\u00103J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u000b\u001a\u00020\bHÀ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000e\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0004\b\u000f\u0010\rJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0004\b\u0011\u0010\rJ\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÀ\u0003¢\u0006\u0004\b\u0013\u0010\rJH\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0015\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00042\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b$\u0010\u001fJ \u0010)\u001a\u00020(2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b)\u0010*R\u001c\u0010\u0015\u001a\u00020\b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0015\u0010+\u001a\u0004\b,\u0010\nR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010-\u001a\u0004\b.\u0010\rR\u001c\u0010\u0016\u001a\u00020\u00048\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0016\u0010-\u001a\u0004\b/\u0010\rR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010-\u001a\u0004\b0\u0010\rR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u0010-\u001a\u0004\b1\u0010\r¨\u00065"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "Lcom/stripe/android/model/Address;", "component1$payments_core_release", "()Lcom/stripe/android/model/Address;", "component1", "component2$payments_core_release", "()Ljava/lang/String;", "component2", "component3$payments_core_release", "component3", "component4$payments_core_release", "component4", "component5$payments_core_release", "component5", "address", "name", "carrier", "phone", "trackingNumber", "copy", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/Address;", "getAddress$payments_core_release", "Ljava/lang/String;", "getCarrier$payments_core_release", "getName$payments_core_release", "getTrackingNumber$payments_core_release", "getPhone$payments_core_release", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ConfirmPaymentIntentParams.kt */
    public static final class Shipping implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<Shipping> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_ADDRESS = "address";
        @Deprecated
        private static final String PARAM_CARRIER = "carrier";
        @Deprecated
        private static final String PARAM_NAME = "name";
        @Deprecated
        private static final String PARAM_PHONE = "phone";
        @Deprecated
        private static final String PARAM_TRACKING_NUMBER = "tracking_number";
        private final Address address;
        private final String carrier;
        private final String name;
        private final String phone;
        private final String trackingNumber;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/ConfirmPaymentIntentParams$Shipping$Companion;", "", "", "PARAM_ADDRESS", "Ljava/lang/String;", "PARAM_CARRIER", "PARAM_NAME", "PARAM_PHONE", "PARAM_TRACKING_NUMBER", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: ConfirmPaymentIntentParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

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

        public Shipping(Address address2, String str) {
            this(address2, str, (String) null, (String) null, (String) null, 28, (f) null);
        }

        public Shipping(Address address2, String str, String str2) {
            this(address2, str, str2, (String) null, (String) null, 24, (f) null);
        }

        public Shipping(Address address2, String str, String str2, String str3) {
            this(address2, str, str2, str3, (String) null, 16, (f) null);
        }

        public Shipping(Address address2, String str, String str2, String str3, String str4) {
            i.e(address2, "address");
            i.e(str, "name");
            this.address = address2;
            this.name = str;
            this.carrier = str2;
            this.phone = str3;
            this.trackingNumber = str4;
        }

        public static /* synthetic */ Shipping copy$default(Shipping shipping, Address address2, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                address2 = shipping.address;
            }
            if ((i & 2) != 0) {
                str = shipping.name;
            }
            String str5 = str;
            if ((i & 4) != 0) {
                str2 = shipping.carrier;
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

        public final Address component1$payments_core_release() {
            return this.address;
        }

        public final String component2$payments_core_release() {
            return this.name;
        }

        public final String component3$payments_core_release() {
            return this.carrier;
        }

        public final String component4$payments_core_release() {
            return this.phone;
        }

        public final String component5$payments_core_release() {
            return this.trackingNumber;
        }

        public final Shipping copy(Address address2, String str, String str2, String str3, String str4) {
            i.e(address2, "address");
            i.e(str, "name");
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
            return i.a(this.address, shipping.address) && i.a(this.name, shipping.name) && i.a(this.carrier, shipping.carrier) && i.a(this.phone, shipping.phone) && i.a(this.trackingNumber, shipping.trackingNumber);
        }

        public final Address getAddress$payments_core_release() {
            return this.address;
        }

        public final String getCarrier$payments_core_release() {
            return this.carrier;
        }

        public final String getName$payments_core_release() {
            return this.name;
        }

        public final String getPhone$payments_core_release() {
            return this.phone;
        }

        public final String getTrackingNumber$payments_core_release() {
            return this.trackingNumber;
        }

        public int hashCode() {
            Address address2 = this.address;
            int i = 0;
            int hashCode = (address2 != null ? address2.hashCode() : 0) * 31;
            String str = this.name;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.carrier;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.phone;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.trackingNumber;
            if (str4 != null) {
                i = str4.hashCode();
            }
            return hashCode4 + i;
        }

        public Map<String, Object> toParamMap() {
            List<Pair> K = g.K(new Pair("address", this.address.toParamMap()), new Pair("name", this.name), new Pair("carrier", this.carrier), new Pair("phone", this.phone), new Pair(PARAM_TRACKING_NUMBER, this.trackingNumber));
            Map<String, Object> o = g.o();
            for (Pair pair : K) {
                String str = (String) pair.c;
                B b = pair.d;
                Map S2 = b != null ? h.S2(new Pair(str, b)) : null;
                if (S2 == null) {
                    S2 = g.o();
                }
                o = g.b0(o, S2);
            }
            return o;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Shipping(address=");
            P0.append(this.address);
            P0.append(", name=");
            P0.append(this.name);
            P0.append(", carrier=");
            P0.append(this.carrier);
            P0.append(", phone=");
            P0.append(this.phone);
            P0.append(", trackingNumber=");
            return a.y0(P0, this.trackingNumber, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            this.address.writeToParcel(parcel, 0);
            parcel.writeString(this.name);
            parcel.writeString(this.carrier);
            parcel.writeString(this.phone);
            parcel.writeString(this.trackingNumber);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Shipping(Address address2, String str, String str2, String str3, String str4, int i, f fVar) {
            this(address2, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : str4);
        }
    }

    public ConfirmPaymentIntentParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, SourceParams sourceParams2, String str2, Map<String, ? extends Object> map, String str3, String str4, Boolean bool, boolean z, PaymentMethodOptionsParams paymentMethodOptionsParams, String str5, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2, Shipping shipping2, String str6) {
        i.e(str3, "clientSecret");
        this.paymentMethodCreateParams = paymentMethodCreateParams2;
        this.paymentMethodId = str;
        this.sourceParams = sourceParams2;
        this.sourceId = str2;
        this.extraParams = map;
        this.clientSecret = str3;
        this.returnUrl = str4;
        this.savePaymentMethod = bool;
        this.useStripeSdk = z;
        this.paymentMethodOptions = paymentMethodOptionsParams;
        this.mandateId = str5;
        this.mandateData = mandateDataParams;
        this.setupFutureUsage = setupFutureUsage2;
        this.shipping = shipping2;
        this.receiptEmail = str6;
    }

    private final boolean component9() {
        return this.useStripeSdk;
    }

    public static /* synthetic */ ConfirmPaymentIntentParams copy$default(ConfirmPaymentIntentParams confirmPaymentIntentParams, PaymentMethodCreateParams paymentMethodCreateParams2, String str, SourceParams sourceParams2, String str2, Map map, String str3, String str4, Boolean bool, boolean z, PaymentMethodOptionsParams paymentMethodOptionsParams, String str5, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2, Shipping shipping2, String str6, int i, Object obj) {
        ConfirmPaymentIntentParams confirmPaymentIntentParams2 = confirmPaymentIntentParams;
        int i2 = i;
        return confirmPaymentIntentParams.copy((i2 & 1) != 0 ? confirmPaymentIntentParams2.paymentMethodCreateParams : paymentMethodCreateParams2, (i2 & 2) != 0 ? confirmPaymentIntentParams2.paymentMethodId : str, (i2 & 4) != 0 ? confirmPaymentIntentParams2.sourceParams : sourceParams2, (i2 & 8) != 0 ? confirmPaymentIntentParams2.sourceId : str2, (i2 & 16) != 0 ? confirmPaymentIntentParams2.extraParams : map, (i2 & 32) != 0 ? confirmPaymentIntentParams.getClientSecret() : str3, (i2 & 64) != 0 ? confirmPaymentIntentParams.getReturnUrl() : str4, (i2 & 128) != 0 ? confirmPaymentIntentParams2.savePaymentMethod : bool, (i2 & 256) != 0 ? confirmPaymentIntentParams2.useStripeSdk : z, (i2 & 512) != 0 ? confirmPaymentIntentParams2.paymentMethodOptions : paymentMethodOptionsParams, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? confirmPaymentIntentParams2.mandateId : str5, (i2 & 2048) != 0 ? confirmPaymentIntentParams2.mandateData : mandateDataParams, (i2 & 4096) != 0 ? confirmPaymentIntentParams2.setupFutureUsage : setupFutureUsage2, (i2 & 8192) != 0 ? confirmPaymentIntentParams2.shipping : shipping2, (i2 & 16384) != 0 ? confirmPaymentIntentParams2.receiptEmail : str6);
    }

    public static final ConfirmPaymentIntentParams create(String str) {
        return Companion.create$default(Companion, str, (Shipping) null, (SetupFutureUsage) null, 6, (Object) null);
    }

    public static final ConfirmPaymentIntentParams create(String str, Shipping shipping2) {
        return Companion.create$default(Companion, str, shipping2, (SetupFutureUsage) null, 4, (Object) null);
    }

    public static final ConfirmPaymentIntentParams create(String str, Shipping shipping2, SetupFutureUsage setupFutureUsage2) {
        return Companion.create(str, shipping2, setupFutureUsage2);
    }

    public static final ConfirmPaymentIntentParams create(String str, String str2) {
        return Companion.create$default(Companion, str, str2, (Shipping) null, (SetupFutureUsage) null, 12, (Object) null);
    }

    public static final ConfirmPaymentIntentParams create(String str, String str2, Shipping shipping2) {
        return Companion.create$default(Companion, str, str2, shipping2, (SetupFutureUsage) null, 8, (Object) null);
    }

    public static final ConfirmPaymentIntentParams create(String str, String str2, Shipping shipping2, SetupFutureUsage setupFutureUsage2) {
        return Companion.create(str, str2, shipping2, setupFutureUsage2);
    }

    public static final ConfirmPaymentIntentParams create(String str, String str2, Map<String, ? extends Object> map) {
        return Companion.create$default(Companion, str, str2, (Map) map, (Shipping) null, 8, (Object) null);
    }

    public static final ConfirmPaymentIntentParams create(String str, String str2, Map<String, ? extends Object> map, Shipping shipping2) {
        return Companion.create(str, str2, map, shipping2);
    }

    public static final ConfirmPaymentIntentParams create(String str, Map<String, ? extends Object> map) {
        return Companion.create$default(Companion, str, (String) null, (Map) map, (Shipping) null, 10, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createAlipay(String str) {
        return Companion.createAlipay(str);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, (Boolean) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 124, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, Boolean bool) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, bool, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 120, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, Boolean bool, String str2) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, bool, str2, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 112, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, Boolean bool, String str2, MandateDataParams mandateDataParams) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, bool, str2, mandateDataParams, (SetupFutureUsage) null, (Shipping) null, 96, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, bool, str2, mandateDataParams, setupFutureUsage2, (Shipping) null, 64, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, Boolean bool, String str2, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2, Shipping shipping2) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams2, str, bool, str2, mandateDataParams, setupFutureUsage2, shipping2);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, str2, (Boolean) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 248, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2, Boolean bool) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, str2, bool, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 240, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2, Boolean bool, String str3) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, str2, bool, str3, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 224, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2, Boolean bool, String str3, MandateDataParams mandateDataParams) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, str2, bool, str3, mandateDataParams, (SetupFutureUsage) null, (Shipping) null, 192, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2, Boolean bool, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, str2, bool, str3, mandateDataParams, setupFutureUsage2, (Shipping) null, 128, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2, Boolean bool, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2, Shipping shipping2) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams2, str, str2, bool, str3, mandateDataParams, setupFutureUsage2, shipping2);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2, Boolean bool, Map<String, ? extends Object> map) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, str2, bool, map, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 480, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2, Boolean bool, Map<String, ? extends Object> map, String str3) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, str2, bool, map, str3, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 448, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2, Boolean bool, Map<String, ? extends Object> map, String str3, MandateDataParams mandateDataParams) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, str2, bool, map, str3, mandateDataParams, (SetupFutureUsage) null, (Shipping) null, 384, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2, Boolean bool, Map<String, ? extends Object> map, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, str2, bool, map, str3, mandateDataParams, setupFutureUsage2, (Shipping) null, 256, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2, Boolean bool, Map<String, ? extends Object> map, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2, Shipping shipping2) {
        return Companion.createWithPaymentMethodCreateParams(paymentMethodCreateParams2, str, str2, bool, map, str3, mandateDataParams, setupFutureUsage2, shipping2);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, String str2, Map<String, ? extends Object> map) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, str2, (Boolean) null, map, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 488, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodCreateParams(PaymentMethodCreateParams paymentMethodCreateParams2, String str, Map<String, ? extends Object> map) {
        return Companion.createWithPaymentMethodCreateParams$default(Companion, paymentMethodCreateParams2, str, (String) null, (Boolean) null, map, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 492, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, (Boolean) null, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 252, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, bool, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 248, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, bool, paymentMethodOptionsParams, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 240, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, bool, paymentMethodOptionsParams, str3, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 224, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams, (SetupFutureUsage) null, (Shipping) null, 192, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams, setupFutureUsage2, (Shipping) null, 128, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str3, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2, Shipping shipping2) {
        return Companion.createWithPaymentMethodId(str, str2, bool, paymentMethodOptionsParams, str3, mandateDataParams, setupFutureUsage2, shipping2);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, str3, (Boolean) null, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 504, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, str3, bool, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 496, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, str3, bool, paymentMethodOptionsParams, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 480, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, str3, bool, paymentMethodOptionsParams, str4, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 448, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, str3, bool, paymentMethodOptionsParams, str4, mandateDataParams, (SetupFutureUsage) null, (Shipping) null, 384, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, str3, bool, paymentMethodOptionsParams, str4, mandateDataParams, setupFutureUsage2, (Shipping) null, 256, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2, Shipping shipping2) {
        return Companion.createWithPaymentMethodId(str, str2, str3, bool, paymentMethodOptionsParams, str4, mandateDataParams, setupFutureUsage2, shipping2);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, str3, bool, map, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 992, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, PaymentMethodOptionsParams paymentMethodOptionsParams) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, str3, bool, map, paymentMethodOptionsParams, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 960, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, str3, bool, map, paymentMethodOptionsParams, str4, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 896, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, str3, bool, map, paymentMethodOptionsParams, str4, mandateDataParams, (SetupFutureUsage) null, (Shipping) null, 768, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, str3, bool, map, paymentMethodOptionsParams, str4, mandateDataParams, setupFutureUsage2, (Shipping) null, 512, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, PaymentMethodOptionsParams paymentMethodOptionsParams, String str4, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2, Shipping shipping2) {
        return Companion.createWithPaymentMethodId(str, str2, str3, bool, map, paymentMethodOptionsParams, str4, mandateDataParams, setupFutureUsage2, shipping2);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, String str3, Map<String, ? extends Object> map) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, str3, (Boolean) null, map, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 1000, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithPaymentMethodId(String str, String str2, Map<String, ? extends Object> map) {
        return Companion.createWithPaymentMethodId$default(Companion, str, str2, (String) null, (Boolean) null, map, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, 1004, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3) {
        return Companion.createWithSourceId$default(Companion, str, str2, str3, (Boolean) null, (Shipping) null, 24, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool) {
        return Companion.createWithSourceId$default(Companion, str, str2, str3, bool, (Shipping) null, 16, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool, Shipping shipping2) {
        return Companion.createWithSourceId(str, str2, str3, bool, shipping2);
    }

    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map) {
        return Companion.createWithSourceId$default(Companion, str, str2, str3, bool, map, (Shipping) null, 32, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Boolean bool, Map<String, ? extends Object> map, Shipping shipping2) {
        return Companion.createWithSourceId(str, str2, str3, bool, map, shipping2);
    }

    public static final ConfirmPaymentIntentParams createWithSourceId(String str, String str2, String str3, Map<String, ? extends Object> map) {
        return Companion.createWithSourceId$default(Companion, str, str2, str3, (Boolean) null, map, (Shipping) null, 40, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams2, String str, String str2) {
        return Companion.createWithSourceParams$default(Companion, sourceParams2, str, str2, (Boolean) null, (Shipping) null, 24, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams2, String str, String str2, Boolean bool) {
        return Companion.createWithSourceParams$default(Companion, sourceParams2, str, str2, bool, (Shipping) null, 16, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams2, String str, String str2, Boolean bool, Shipping shipping2) {
        return Companion.createWithSourceParams(sourceParams2, str, str2, bool, shipping2);
    }

    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams2, String str, String str2, Boolean bool, Map<String, ? extends Object> map) {
        return Companion.createWithSourceParams$default(Companion, sourceParams2, str, str2, bool, map, (Shipping) null, 32, (Object) null);
    }

    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams2, String str, String str2, Boolean bool, Map<String, ? extends Object> map, Shipping shipping2) {
        return Companion.createWithSourceParams(sourceParams2, str, str2, bool, map, shipping2);
    }

    public static final ConfirmPaymentIntentParams createWithSourceParams(SourceParams sourceParams2, String str, String str2, Map<String, ? extends Object> map) {
        return Companion.createWithSourceParams$default(Companion, sourceParams2, str, str2, (Boolean) null, map, (Shipping) null, 40, (Object) null);
    }

    public static /* synthetic */ void getExtraParams$annotations() {
    }

    private final Map<String, Object> getMandateDataParams() {
        PaymentMethodCreateParams.Type type$payments_core_release;
        Map<String, Object> paramMap;
        MandateDataParams mandateDataParams = this.mandateData;
        if (mandateDataParams != null && (paramMap = mandateDataParams.toParamMap()) != null) {
            return paramMap;
        }
        PaymentMethodCreateParams paymentMethodCreateParams2 = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams2 == null || (type$payments_core_release = paymentMethodCreateParams2.getType$payments_core_release()) == null || !type$payments_core_release.getHasMandate() || this.mandateId != null) {
            return null;
        }
        return new MandateDataParams(MandateDataParams.Type.Online.Companion.getDEFAULT$payments_core_release()).toParamMap();
    }

    private final Map<String, Object> getPaymentMethodParamMap() {
        PaymentMethodCreateParams paymentMethodCreateParams2 = this.paymentMethodCreateParams;
        if (paymentMethodCreateParams2 != null) {
            return h.S2(new Pair("payment_method_data", paymentMethodCreateParams2.toParamMap()));
        }
        String str = this.paymentMethodId;
        if (str != null) {
            return h.S2(new Pair("payment_method", str));
        }
        SourceParams sourceParams2 = this.sourceParams;
        if (sourceParams2 != null) {
            return h.S2(new Pair(PARAM_SOURCE_DATA, sourceParams2.toParamMap()));
        }
        String str2 = this.sourceId;
        if (str2 != null) {
            return h.S2(new Pair("source", str2));
        }
        return g.o();
    }

    public final PaymentMethodCreateParams component1() {
        return this.paymentMethodCreateParams;
    }

    public final PaymentMethodOptionsParams component10() {
        return this.paymentMethodOptions;
    }

    public final String component11() {
        return this.mandateId;
    }

    public final MandateDataParams component12() {
        return this.mandateData;
    }

    public final SetupFutureUsage component13() {
        return this.setupFutureUsage;
    }

    public final Shipping component14() {
        return this.shipping;
    }

    public final String component15() {
        return this.receiptEmail;
    }

    public final String component2() {
        return this.paymentMethodId;
    }

    public final SourceParams component3() {
        return this.sourceParams;
    }

    public final String component4() {
        return this.sourceId;
    }

    public final Map<String, Object> component5() {
        return this.extraParams;
    }

    public final String component6() {
        return getClientSecret();
    }

    public final String component7() {
        return getReturnUrl();
    }

    public final Boolean component8() {
        return this.savePaymentMethod;
    }

    public final ConfirmPaymentIntentParams copy(PaymentMethodCreateParams paymentMethodCreateParams2, String str, SourceParams sourceParams2, String str2, Map<String, ? extends Object> map, String str3, String str4, Boolean bool, boolean z, PaymentMethodOptionsParams paymentMethodOptionsParams, String str5, MandateDataParams mandateDataParams, SetupFutureUsage setupFutureUsage2, Shipping shipping2, String str6) {
        String str7 = str3;
        i.e(str7, "clientSecret");
        return new ConfirmPaymentIntentParams(paymentMethodCreateParams2, str, sourceParams2, str2, map, str7, str4, bool, z, paymentMethodOptionsParams, str5, mandateDataParams, setupFutureUsage2, shipping2, str6);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ConfirmPaymentIntentParams)) {
            return false;
        }
        ConfirmPaymentIntentParams confirmPaymentIntentParams = (ConfirmPaymentIntentParams) obj;
        return i.a(this.paymentMethodCreateParams, confirmPaymentIntentParams.paymentMethodCreateParams) && i.a(this.paymentMethodId, confirmPaymentIntentParams.paymentMethodId) && i.a(this.sourceParams, confirmPaymentIntentParams.sourceParams) && i.a(this.sourceId, confirmPaymentIntentParams.sourceId) && i.a(this.extraParams, confirmPaymentIntentParams.extraParams) && i.a(getClientSecret(), confirmPaymentIntentParams.getClientSecret()) && i.a(getReturnUrl(), confirmPaymentIntentParams.getReturnUrl()) && i.a(this.savePaymentMethod, confirmPaymentIntentParams.savePaymentMethod) && this.useStripeSdk == confirmPaymentIntentParams.useStripeSdk && i.a(this.paymentMethodOptions, confirmPaymentIntentParams.paymentMethodOptions) && i.a(this.mandateId, confirmPaymentIntentParams.mandateId) && i.a(this.mandateData, confirmPaymentIntentParams.mandateData) && i.a(this.setupFutureUsage, confirmPaymentIntentParams.setupFutureUsage) && i.a(this.shipping, confirmPaymentIntentParams.shipping) && i.a(this.receiptEmail, confirmPaymentIntentParams.receiptEmail);
    }

    public String getClientSecret() {
        return this.clientSecret;
    }

    public final Map<String, Object> getExtraParams() {
        return this.extraParams;
    }

    public final MandateDataParams getMandateData() {
        return this.mandateData;
    }

    public final String getMandateId() {
        return this.mandateId;
    }

    public final PaymentMethodCreateParams getPaymentMethodCreateParams() {
        return this.paymentMethodCreateParams;
    }

    public final String getPaymentMethodId() {
        return this.paymentMethodId;
    }

    public final PaymentMethodOptionsParams getPaymentMethodOptions() {
        return this.paymentMethodOptions;
    }

    public final String getReceiptEmail() {
        return this.receiptEmail;
    }

    public String getReturnUrl() {
        return this.returnUrl;
    }

    public final Boolean getSavePaymentMethod() {
        return this.savePaymentMethod;
    }

    public final SetupFutureUsage getSetupFutureUsage() {
        return this.setupFutureUsage;
    }

    public final Shipping getShipping() {
        return this.shipping;
    }

    public final String getSourceId() {
        return this.sourceId;
    }

    public final SourceParams getSourceParams() {
        return this.sourceParams;
    }

    public int hashCode() {
        PaymentMethodCreateParams paymentMethodCreateParams2 = this.paymentMethodCreateParams;
        int i = 0;
        int hashCode = (paymentMethodCreateParams2 != null ? paymentMethodCreateParams2.hashCode() : 0) * 31;
        String str = this.paymentMethodId;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        SourceParams sourceParams2 = this.sourceParams;
        int hashCode3 = (hashCode2 + (sourceParams2 != null ? sourceParams2.hashCode() : 0)) * 31;
        String str2 = this.sourceId;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, Object> map = this.extraParams;
        int hashCode5 = (hashCode4 + (map != null ? map.hashCode() : 0)) * 31;
        String clientSecret2 = getClientSecret();
        int hashCode6 = (hashCode5 + (clientSecret2 != null ? clientSecret2.hashCode() : 0)) * 31;
        String returnUrl2 = getReturnUrl();
        int hashCode7 = (hashCode6 + (returnUrl2 != null ? returnUrl2.hashCode() : 0)) * 31;
        Boolean bool = this.savePaymentMethod;
        int hashCode8 = (hashCode7 + (bool != null ? bool.hashCode() : 0)) * 31;
        boolean z = this.useStripeSdk;
        if (z) {
            z = true;
        }
        int i2 = (hashCode8 + (z ? 1 : 0)) * 31;
        PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptions;
        int hashCode9 = (i2 + (paymentMethodOptionsParams != null ? paymentMethodOptionsParams.hashCode() : 0)) * 31;
        String str3 = this.mandateId;
        int hashCode10 = (hashCode9 + (str3 != null ? str3.hashCode() : 0)) * 31;
        MandateDataParams mandateDataParams = this.mandateData;
        int hashCode11 = (hashCode10 + (mandateDataParams != null ? mandateDataParams.hashCode() : 0)) * 31;
        SetupFutureUsage setupFutureUsage2 = this.setupFutureUsage;
        int hashCode12 = (hashCode11 + (setupFutureUsage2 != null ? setupFutureUsage2.hashCode() : 0)) * 31;
        Shipping shipping2 = this.shipping;
        int hashCode13 = (hashCode12 + (shipping2 != null ? shipping2.hashCode() : 0)) * 31;
        String str4 = this.receiptEmail;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode13 + i;
    }

    public final void setMandateData(MandateDataParams mandateDataParams) {
        this.mandateData = mandateDataParams;
    }

    public final void setMandateId(String str) {
        this.mandateId = str;
    }

    public final void setPaymentMethodOptions(PaymentMethodOptionsParams paymentMethodOptionsParams) {
        this.paymentMethodOptions = paymentMethodOptionsParams;
    }

    public final void setReceiptEmail(String str) {
        this.receiptEmail = str;
    }

    public void setReturnUrl(String str) {
        this.returnUrl = str;
    }

    public final void setSavePaymentMethod(Boolean bool) {
        this.savePaymentMethod = bool;
    }

    public final void setSetupFutureUsage(SetupFutureUsage setupFutureUsage2) {
        this.setupFutureUsage = setupFutureUsage2;
    }

    public final void setShipping(Shipping shipping2) {
        this.shipping = shipping2;
    }

    public final boolean shouldSavePaymentMethod() {
        return i.a(this.savePaymentMethod, Boolean.TRUE);
    }

    public boolean shouldUseStripeSdk() {
        return this.useStripeSdk;
    }

    public Map<String, Object> toParamMap() {
        Map N = g.N(new Pair("client_secret", getClientSecret()), new Pair("use_stripe_sdk", Boolean.valueOf(this.useStripeSdk)));
        Boolean bool = this.savePaymentMethod;
        Map map = null;
        Map S2 = bool != null ? h.S2(new Pair(PARAM_SAVE_PAYMENT_METHOD, Boolean.valueOf(bool.booleanValue()))) : null;
        if (S2 == null) {
            S2 = g.o();
        }
        Map b0 = g.b0(N, S2);
        String str = this.mandateId;
        Map S22 = str != null ? h.S2(new Pair("mandate", str)) : null;
        if (S22 == null) {
            S22 = g.o();
        }
        Map b02 = g.b0(b0, S22);
        Map<String, Object> mandateDataParams = getMandateDataParams();
        Map S23 = mandateDataParams != null ? h.S2(new Pair("mandate_data", mandateDataParams)) : null;
        if (S23 == null) {
            S23 = g.o();
        }
        Map b03 = g.b0(b02, S23);
        String returnUrl2 = getReturnUrl();
        Map S24 = returnUrl2 != null ? h.S2(new Pair("return_url", returnUrl2)) : null;
        if (S24 == null) {
            S24 = g.o();
        }
        Map b04 = g.b0(b03, S24);
        PaymentMethodOptionsParams paymentMethodOptionsParams = this.paymentMethodOptions;
        Map S25 = paymentMethodOptionsParams != null ? h.S2(new Pair(PARAM_PAYMENT_METHOD_OPTIONS, paymentMethodOptionsParams.toParamMap())) : null;
        if (S25 == null) {
            S25 = g.o();
        }
        Map b05 = g.b0(b04, S25);
        SetupFutureUsage setupFutureUsage2 = this.setupFutureUsage;
        Map S26 = setupFutureUsage2 != null ? h.S2(new Pair(PARAM_SETUP_FUTURE_USAGE, setupFutureUsage2.getCode$payments_core_release())) : null;
        if (S26 == null) {
            S26 = g.o();
        }
        Map b06 = g.b0(b05, S26);
        Shipping shipping2 = this.shipping;
        Map S27 = shipping2 != null ? h.S2(new Pair(PARAM_SHIPPING, shipping2.toParamMap())) : null;
        if (S27 == null) {
            S27 = g.o();
        }
        Map<String, Object> b07 = g.b0(g.b0(b06, S27), getPaymentMethodParamMap());
        String str2 = this.receiptEmail;
        if (str2 != null) {
            map = h.S2(new Pair(PARAM_RECEIPT_EMAIL, str2));
        }
        if (map == null) {
            map = g.o();
        }
        Map<String, Object> b08 = g.b0(b07, map);
        Map<String, Object> map2 = this.extraParams;
        if (map2 == null) {
            map2 = g.o();
        }
        return g.b0(b08, map2);
    }

    public String toString() {
        StringBuilder P0 = a.P0("ConfirmPaymentIntentParams(paymentMethodCreateParams=");
        P0.append(this.paymentMethodCreateParams);
        P0.append(", paymentMethodId=");
        P0.append(this.paymentMethodId);
        P0.append(", sourceParams=");
        P0.append(this.sourceParams);
        P0.append(", sourceId=");
        P0.append(this.sourceId);
        P0.append(", extraParams=");
        P0.append(this.extraParams);
        P0.append(", clientSecret=");
        P0.append(getClientSecret());
        P0.append(", returnUrl=");
        P0.append(getReturnUrl());
        P0.append(", savePaymentMethod=");
        P0.append(this.savePaymentMethod);
        P0.append(", useStripeSdk=");
        P0.append(this.useStripeSdk);
        P0.append(", paymentMethodOptions=");
        P0.append(this.paymentMethodOptions);
        P0.append(", mandateId=");
        P0.append(this.mandateId);
        P0.append(", mandateData=");
        P0.append(this.mandateData);
        P0.append(", setupFutureUsage=");
        P0.append(this.setupFutureUsage);
        P0.append(", shipping=");
        P0.append(this.shipping);
        P0.append(", receiptEmail=");
        return a.y0(P0, this.receiptEmail, ")");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ ConfirmPaymentIntentParams(com.stripe.android.model.PaymentMethodCreateParams r20, java.lang.String r21, com.stripe.android.model.SourceParams r22, java.lang.String r23, java.util.Map r24, java.lang.String r25, java.lang.String r26, java.lang.Boolean r27, boolean r28, com.stripe.android.model.PaymentMethodOptionsParams r29, java.lang.String r30, com.stripe.android.model.MandateDataParams r31, com.stripe.android.model.ConfirmPaymentIntentParams.SetupFutureUsage r32, com.stripe.android.model.ConfirmPaymentIntentParams.Shipping r33, java.lang.String r34, int r35, m0.n.b.f r36) {
        /*
            r19 = this;
            r0 = r35
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r20
        L_0x000b:
            r1 = r0 & 2
            if (r1 == 0) goto L_0x0011
            r5 = r2
            goto L_0x0013
        L_0x0011:
            r5 = r21
        L_0x0013:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0019
            r6 = r2
            goto L_0x001b
        L_0x0019:
            r6 = r22
        L_0x001b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0021
            r7 = r2
            goto L_0x0023
        L_0x0021:
            r7 = r23
        L_0x0023:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0029
            r8 = r2
            goto L_0x002b
        L_0x0029:
            r8 = r24
        L_0x002b:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0031
            r10 = r2
            goto L_0x0033
        L_0x0031:
            r10 = r26
        L_0x0033:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0039
            r11 = r2
            goto L_0x003b
        L_0x0039:
            r11 = r27
        L_0x003b:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0042
            r1 = 0
            r12 = r1
            goto L_0x0044
        L_0x0042:
            r12 = r28
        L_0x0044:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004a
            r13 = r2
            goto L_0x004c
        L_0x004a:
            r13 = r29
        L_0x004c:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0052
            r14 = r2
            goto L_0x0054
        L_0x0052:
            r14 = r30
        L_0x0054:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x005a
            r15 = r2
            goto L_0x005c
        L_0x005a:
            r15 = r31
        L_0x005c:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0063
            r16 = r2
            goto L_0x0065
        L_0x0063:
            r16 = r32
        L_0x0065:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006c
            r17 = r2
            goto L_0x006e
        L_0x006c:
            r17 = r33
        L_0x006e:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L_0x0075
            r18 = r2
            goto L_0x0077
        L_0x0075:
            r18 = r34
        L_0x0077:
            r3 = r19
            r9 = r25
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.ConfirmPaymentIntentParams.<init>(com.stripe.android.model.PaymentMethodCreateParams, java.lang.String, com.stripe.android.model.SourceParams, java.lang.String, java.util.Map, java.lang.String, java.lang.String, java.lang.Boolean, boolean, com.stripe.android.model.PaymentMethodOptionsParams, java.lang.String, com.stripe.android.model.MandateDataParams, com.stripe.android.model.ConfirmPaymentIntentParams$SetupFutureUsage, com.stripe.android.model.ConfirmPaymentIntentParams$Shipping, java.lang.String, int, m0.n.b.f):void");
    }

    public ConfirmPaymentIntentParams withShouldUseStripeSdk(boolean z) {
        return copy$default(this, (PaymentMethodCreateParams) null, (String) null, (SourceParams) null, (String) null, (Map) null, (String) null, (String) null, (Boolean) null, z, (PaymentMethodOptionsParams) null, (String) null, (MandateDataParams) null, (SetupFutureUsage) null, (Shipping) null, (String) null, 32511, (Object) null);
    }
}
