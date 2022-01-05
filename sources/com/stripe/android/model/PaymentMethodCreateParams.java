package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.CardUtils;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.model.PaymentMethod;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b/\b\b\u0018\u0000 p2\u00020\u00012\u00020\u0002:\u000bqrsptuvwxyzB±\u0001\b\u0000\u0012\u0006\u00100\u001a\u00020$\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010,\u0012\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b\u0012\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f¢\u0006\u0004\be\u0010fB1\b\u0012\u0012\u0006\u00101\u001a\u00020(\u0012\b\u0010:\u001a\u0004\u0018\u00010,\u0012\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\u0004\be\u0010gB1\b\u0012\u0012\u0006\u00102\u001a\u00020\u0003\u0012\b\u0010:\u001a\u0004\u0018\u00010,\u0012\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\u0004\be\u0010hB1\b\u0012\u0012\u0006\u00103\u001a\u00020\u0006\u0012\b\u0010:\u001a\u0004\u0018\u00010,\u0012\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\u0004\be\u0010iB1\b\u0012\u0012\u0006\u00104\u001a\u00020\t\u0012\b\u0010:\u001a\u0004\u0018\u00010,\u0012\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\u0004\be\u0010jB/\b\u0012\u0012\u0006\u00105\u001a\u00020\f\u0012\u0006\u0010:\u001a\u00020,\u0012\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\u0004\be\u0010kB/\b\u0012\u0012\u0006\u00106\u001a\u00020\u000f\u0012\u0006\u0010:\u001a\u00020,\u0012\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\u0004\be\u0010lB1\b\u0012\u0012\u0006\u00107\u001a\u00020\u0012\u0012\b\u0010:\u001a\u0004\u0018\u00010,\u0012\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\u0004\be\u0010mB1\b\u0012\u0012\u0006\u00108\u001a\u00020\u0015\u0012\b\u0010:\u001a\u0004\u0018\u00010,\u0012\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\u0004\be\u0010nB1\b\u0012\u0012\u0006\u00109\u001a\u00020\u0018\u0012\b\u0010:\u001a\u0004\u0018\u00010,\u0012\u0014\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b¢\u0006\u0004\be\u0010oJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÂ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\n\u001a\u0004\u0018\u00010\tHÂ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÂ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÂ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÂ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÂ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÂ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u001e\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001bHÂ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001c0\u001fHÂ\u0003¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\"0\u001bH\u0016¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010'\u001a\u00020$HÀ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010+\u001a\u0004\u0018\u00010(HÀ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010/\u001a\u0004\u0018\u00010,HÀ\u0003¢\u0006\u0004\b-\u0010.Jº\u0001\u0010=\u001a\u00020\u00002\b\b\u0002\u00100\u001a\u00020$2\n\b\u0002\u00101\u001a\u0004\u0018\u00010(2\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u00104\u001a\u0004\u0018\u00010\t2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\f2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010:\u001a\u0004\u0018\u00010,2\u0016\b\u0002\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b2\u000e\b\u0002\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001fHÆ\u0001¢\u0006\u0004\b=\u0010>J\u0010\u0010?\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b?\u0010@J\u0010\u0010B\u001a\u00020AHÖ\u0001¢\u0006\u0004\bB\u0010CJ\u001a\u0010F\u001a\u00020E2\b\u0010D\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020AHÖ\u0001¢\u0006\u0004\bH\u0010CJ \u0010M\u001a\u00020L2\u0006\u0010J\u001a\u00020I2\u0006\u0010K\u001a\u00020AHÖ\u0001¢\u0006\u0004\bM\u0010NR$\u0010;\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b;\u0010OR\u0018\u00104\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b4\u0010PR\u001c\u00100\u001a\u00020$8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b0\u0010Q\u001a\u0004\bR\u0010&R\u001c\u0010<\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b<\u0010SR\u0018\u00107\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u0010TR\u001e\u0010V\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001f8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\bU\u0010!R\u0018\u00109\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u0010WR\u0018\u00108\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b8\u0010XR\u0013\u0010Z\u001a\u00020\u001c8F@\u0006¢\u0006\u0006\u001a\u0004\bY\u0010@R\u0018\u00103\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u0010[R\u001e\u00101\u001a\u0004\u0018\u00010(8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b1\u0010\\\u001a\u0004\b]\u0010*R\u0018\u00105\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010^R\u0018\u00106\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u0010_R\u001e\u0010:\u001a\u0004\u0018\u00010,8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b:\u0010`\u001a\u0004\ba\u0010.R\u0018\u00102\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u0010bR\"\u0010d\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\"0\u001b8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\bc\u0010\u001e¨\u0006{"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "component3", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "component4", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "component5", "()Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "component6", "()Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "component7", "()Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "component8", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "component9", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "component10", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "", "", "component12", "()Ljava/util/Map;", "", "component13", "()Ljava/util/Set;", "", "toParamMap", "Lcom/stripe/android/model/PaymentMethodCreateParams$Type;", "component1$payments_core_release", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Type;", "component1", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "component2$payments_core_release", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "component2", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "component11$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "component11", "type", "card", "ideal", "fpx", "sepaDebit", "auBecsDebit", "bacsDebit", "sofort", "upi", "netbanking", "billingDetails", "metadata", "productUsage", "copy", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Type;Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Map;", "Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Type;", "getType$payments_core_release", "Ljava/util/Set;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "getAttribution$payments_core_release", "attribution", "Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "getTypeCode", "typeCode", "Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "getCard$payments_core_release", "Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "getBillingDetails$payments_core_release", "Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "getTypeParams", "typeParams", "<init>", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Type;Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;Ljava/util/Set;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)V", "Companion", "AuBecsDebit", "BacsDebit", "Card", "Fpx", "Ideal", "Netbanking", "SepaDebit", "Sofort", "Type", "Upi", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodCreateParams.kt */
public final class PaymentMethodCreateParams implements StripeParamsModel, Parcelable {
    public static final Parcelable.Creator<PaymentMethodCreateParams> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    private static final String PARAM_BILLING_DETAILS = "billing_details";
    private static final String PARAM_METADATA = "metadata";
    private static final String PARAM_TYPE = "type";
    private final AuBecsDebit auBecsDebit;
    private final BacsDebit bacsDebit;
    private final PaymentMethod.BillingDetails billingDetails;
    private final Card card;
    private final Fpx fpx;
    private final Ideal ideal;
    private final Map<String, String> metadata;
    private final Netbanking netbanking;
    private final Set<String> productUsage;
    private final SepaDebit sepaDebit;
    private final Sofort sofort;
    private final Type type;
    private final Upi upi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010!R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010!¨\u0006'"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "bsbNumber", "accountNumber", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getAccountNumber", "setAccountNumber", "(Ljava/lang/String;)V", "getBsbNumber", "setBsbNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodCreateParams.kt */
    public static final class AuBecsDebit implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<AuBecsDebit> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_ACCOUNT_NUMBER = "account_number";
        @Deprecated
        private static final String PARAM_BSB_NUMBER = "bsb_number";
        private String accountNumber;
        private String bsbNumber;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit$Companion;", "", "", "PARAM_ACCOUNT_NUMBER", "Ljava/lang/String;", "PARAM_BSB_NUMBER", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodCreateParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<AuBecsDebit> {
            public final AuBecsDebit createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new AuBecsDebit(parcel.readString(), parcel.readString());
            }

            public final AuBecsDebit[] newArray(int i) {
                return new AuBecsDebit[i];
            }
        }

        public AuBecsDebit(String str, String str2) {
            i.e(str, "bsbNumber");
            i.e(str2, "accountNumber");
            this.bsbNumber = str;
            this.accountNumber = str2;
        }

        public static /* synthetic */ AuBecsDebit copy$default(AuBecsDebit auBecsDebit, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = auBecsDebit.bsbNumber;
            }
            if ((i & 2) != 0) {
                str2 = auBecsDebit.accountNumber;
            }
            return auBecsDebit.copy(str, str2);
        }

        public final String component1() {
            return this.bsbNumber;
        }

        public final String component2() {
            return this.accountNumber;
        }

        public final AuBecsDebit copy(String str, String str2) {
            i.e(str, "bsbNumber");
            i.e(str2, "accountNumber");
            return new AuBecsDebit(str, str2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AuBecsDebit)) {
                return false;
            }
            AuBecsDebit auBecsDebit = (AuBecsDebit) obj;
            return i.a(this.bsbNumber, auBecsDebit.bsbNumber) && i.a(this.accountNumber, auBecsDebit.accountNumber);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getBsbNumber() {
            return this.bsbNumber;
        }

        public int hashCode() {
            String str = this.bsbNumber;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.accountNumber;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final void setAccountNumber(String str) {
            i.e(str, "<set-?>");
            this.accountNumber = str;
        }

        public final void setBsbNumber(String str) {
            i.e(str, "<set-?>");
            this.bsbNumber = str;
        }

        public Map<String, Object> toParamMap() {
            return g.N(new Pair(PARAM_BSB_NUMBER, this.bsbNumber), new Pair(PARAM_ACCOUNT_NUMBER, this.accountNumber));
        }

        public String toString() {
            StringBuilder P0 = a.P0("AuBecsDebit(bsbNumber=");
            P0.append(this.bsbNumber);
            P0.append(", accountNumber=");
            return a.y0(P0, this.accountNumber, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.bsbNumber);
            parcel.writeString(this.accountNumber);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001&B\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ$\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00042\b\b\u0002\u0010\f\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\tJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0012J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\t\"\u0004\b \u0010!R\"\u0010\u000b\u001a\u00020\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001e\u001a\u0004\b\"\u0010\t\"\u0004\b#\u0010!¨\u0006'"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "accountNumber", "sortCode", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getSortCode", "setSortCode", "(Ljava/lang/String;)V", "getAccountNumber", "setAccountNumber", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodCreateParams.kt */
    public static final class BacsDebit implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<BacsDebit> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_ACCOUNT_NUMBER = "account_number";
        @Deprecated
        private static final String PARAM_SORT_CODE = "sort_code";
        private String accountNumber;
        private String sortCode;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit$Companion;", "", "", "PARAM_ACCOUNT_NUMBER", "Ljava/lang/String;", "PARAM_SORT_CODE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodCreateParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<BacsDebit> {
            public final BacsDebit createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new BacsDebit(parcel.readString(), parcel.readString());
            }

            public final BacsDebit[] newArray(int i) {
                return new BacsDebit[i];
            }
        }

        public BacsDebit(String str, String str2) {
            i.e(str, "accountNumber");
            i.e(str2, "sortCode");
            this.accountNumber = str;
            this.sortCode = str2;
        }

        public static /* synthetic */ BacsDebit copy$default(BacsDebit bacsDebit, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bacsDebit.accountNumber;
            }
            if ((i & 2) != 0) {
                str2 = bacsDebit.sortCode;
            }
            return bacsDebit.copy(str, str2);
        }

        public final String component1() {
            return this.accountNumber;
        }

        public final String component2() {
            return this.sortCode;
        }

        public final BacsDebit copy(String str, String str2) {
            i.e(str, "accountNumber");
            i.e(str2, "sortCode");
            return new BacsDebit(str, str2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BacsDebit)) {
                return false;
            }
            BacsDebit bacsDebit = (BacsDebit) obj;
            return i.a(this.accountNumber, bacsDebit.accountNumber) && i.a(this.sortCode, bacsDebit.sortCode);
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final String getSortCode() {
            return this.sortCode;
        }

        public int hashCode() {
            String str = this.accountNumber;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.sortCode;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final void setAccountNumber(String str) {
            i.e(str, "<set-?>");
            this.accountNumber = str;
        }

        public final void setSortCode(String str) {
            i.e(str, "<set-?>");
            this.sortCode = str;
        }

        public Map<String, Object> toParamMap() {
            return g.N(new Pair(PARAM_ACCOUNT_NUMBER, this.accountNumber), new Pair(PARAM_SORT_CODE, this.sortCode));
        }

        public String toString() {
            StringBuilder P0 = a.P0("BacsDebit(accountNumber=");
            P0.append(this.accountNumber);
            P0.append(", sortCode=");
            return a.y0(P0, this.sortCode, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.accountNumber);
            parcel.writeString(this.sortCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u0000 >2\u00020\u00012\u00020\u0002:\u0002?>BW\b\u0000\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014¢\u0006\u0004\b<\u0010=J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0004\b\n\u0010\u0005J\u0012\u0010\u000f\u001a\u0004\u0018\u00010\fHÀ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\fHÀ\u0003¢\u0006\u0004\b\u0010\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÀ\u0003¢\u0006\u0004\b\u0012\u0010\u0005J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÀ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J^\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b \u0010\u0005J\u0010\u0010!\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b'\u0010\"J \u0010,\u001a\u00020+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b,\u0010-R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u0010.\u001a\u0004\b/\u0010\u000eR\u0016\u00103\u001a\u0002008@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u00104\u001a\u0004\b5\u0010\u0005R$\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00148\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u00106\u001a\u0004\b7\u0010\u0016R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u00104\u001a\u0004\b8\u0010\u0005R\u0018\u0010:\u001a\u0004\u0018\u00010\u00038@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b9\u0010\u0005R\u001e\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u0010.\u001a\u0004\b;\u0010\u000eR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u00104¨\u0006@"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "component5", "()Ljava/lang/String;", "", "", "toParamMap", "()Ljava/util/Map;", "component1$payments_core_release", "component1", "", "component2$payments_core_release", "()Ljava/lang/Integer;", "component2", "component3$payments_core_release", "component3", "component4$payments_core_release", "component4", "", "component6$payments_core_release", "()Ljava/util/Set;", "component6", "number", "expiryMonth", "expiryYear", "cvc", "token", "attribution", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getExpiryYear$payments_core_release", "Lcom/stripe/android/model/CardBrand;", "getBrand$payments_core_release", "()Lcom/stripe/android/model/CardBrand;", "brand", "Ljava/lang/String;", "getNumber$payments_core_release", "Ljava/util/Set;", "getAttribution$payments_core_release", "getCvc$payments_core_release", "getLast4$payments_core_release", "last4", "getExpiryMonth$payments_core_release", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)V", "Companion", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodCreateParams.kt */
    public static final class Card implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        private static final String PARAM_CVC = "cvc";
        private static final String PARAM_EXP_MONTH = "exp_month";
        private static final String PARAM_EXP_YEAR = "exp_year";
        private static final String PARAM_NUMBER = "number";
        private static final String PARAM_TOKEN = "token";
        private final Set<String> attribution;
        private final String cvc;
        private final Integer expiryMonth;
        private final Integer expiryYear;
        private final String number;
        private final String token;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u0006J\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0012R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "", "number", "setNumber", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;", "", "expiryMonth", "setExpiryMonth", "(Ljava/lang/Integer;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Builder;", "expiryYear", "setExpiryYear", "cvc", "setCvc", "build", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "Ljava/lang/String;", "Ljava/lang/Integer;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodCreateParams.kt */
        public static final class Builder implements ObjectBuilder<Card> {
            private String cvc;
            private Integer expiryMonth;
            private Integer expiryYear;
            private String number;

            public final Builder setCvc(String str) {
                this.cvc = str;
                return this;
            }

            public final Builder setExpiryMonth(Integer num) {
                this.expiryMonth = num;
                return this;
            }

            public final Builder setExpiryYear(Integer num) {
                this.expiryYear = num;
                return this;
            }

            public final Builder setNumber(String str) {
                this.number = str;
                return this;
            }

            public Card build() {
                return new Card(this.number, this.expiryMonth, this.expiryYear, this.cvc, (String) null, (Set) null, 48, (f) null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\b¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Card$Companion;", "", "", "token", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "create", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "PARAM_CVC", "Ljava/lang/String;", "PARAM_EXP_MONTH", "PARAM_EXP_YEAR", "PARAM_NUMBER", "PARAM_TOKEN", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodCreateParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Card create(String str) {
                i.e(str, Card.PARAM_TOKEN);
                return new Card((String) null, (Integer) null, (Integer) null, (String) null, str, (Set) null, 46, (f) null);
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Card> {
            public final Card createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                String readString = parcel.readString();
                LinkedHashSet linkedHashSet = null;
                Integer valueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                Integer valueOf2 = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    linkedHashSet = new LinkedHashSet(readInt);
                    while (readInt != 0) {
                        linkedHashSet.add(parcel.readString());
                        readInt--;
                    }
                }
                return new Card(readString, valueOf, valueOf2, readString2, readString3, linkedHashSet);
            }

            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        public Card() {
            this((String) null, (Integer) null, (Integer) null, (String) null, (String) null, (Set) null, 63, (f) null);
        }

        public Card(String str, Integer num, Integer num2, String str2, String str3, Set<String> set) {
            this.number = str;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.cvc = str2;
            this.token = str3;
            this.attribution = set;
        }

        private final String component5() {
            return this.token;
        }

        public static /* synthetic */ Card copy$default(Card card, String str, Integer num, Integer num2, String str2, String str3, Set<String> set, int i, Object obj) {
            if ((i & 1) != 0) {
                str = card.number;
            }
            if ((i & 2) != 0) {
                num = card.expiryMonth;
            }
            Integer num3 = num;
            if ((i & 4) != 0) {
                num2 = card.expiryYear;
            }
            Integer num4 = num2;
            if ((i & 8) != 0) {
                str2 = card.cvc;
            }
            String str4 = str2;
            if ((i & 16) != 0) {
                str3 = card.token;
            }
            String str5 = str3;
            if ((i & 32) != 0) {
                set = card.attribution;
            }
            return card.copy(str, num3, num4, str4, str5, set);
        }

        public static final Card create(String str) {
            return Companion.create(str);
        }

        public final String component1$payments_core_release() {
            return this.number;
        }

        public final Integer component2$payments_core_release() {
            return this.expiryMonth;
        }

        public final Integer component3$payments_core_release() {
            return this.expiryYear;
        }

        public final String component4$payments_core_release() {
            return this.cvc;
        }

        public final Set<String> component6$payments_core_release() {
            return this.attribution;
        }

        public final Card copy(String str, Integer num, Integer num2, String str2, String str3, Set<String> set) {
            return new Card(str, num, num2, str2, str3, set);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Card)) {
                return false;
            }
            Card card = (Card) obj;
            return i.a(this.number, card.number) && i.a(this.expiryMonth, card.expiryMonth) && i.a(this.expiryYear, card.expiryYear) && i.a(this.cvc, card.cvc) && i.a(this.token, card.token) && i.a(this.attribution, card.attribution);
        }

        public final Set<String> getAttribution$payments_core_release() {
            return this.attribution;
        }

        public final CardBrand getBrand$payments_core_release() {
            return CardUtils.getPossibleCardBrand(this.number);
        }

        public final String getCvc$payments_core_release() {
            return this.cvc;
        }

        public final Integer getExpiryMonth$payments_core_release() {
            return this.expiryMonth;
        }

        public final Integer getExpiryYear$payments_core_release() {
            return this.expiryYear;
        }

        public final String getLast4$payments_core_release() {
            String str = this.number;
            if (str != null) {
                return m0.r.t.a.r.m.a1.a.U3(str, 4);
            }
            return null;
        }

        public final String getNumber$payments_core_release() {
            return this.number;
        }

        public int hashCode() {
            String str = this.number;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            Integer num = this.expiryMonth;
            int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.expiryYear;
            int hashCode3 = (hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31;
            String str2 = this.cvc;
            int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.token;
            int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Set<String> set = this.attribution;
            if (set != null) {
                i = set.hashCode();
            }
            return hashCode5 + i;
        }

        public Map<String, Object> toParamMap() {
            List<Pair> K = g.K(new Pair(PARAM_NUMBER, this.number), new Pair(PARAM_EXP_MONTH, this.expiryMonth), new Pair(PARAM_EXP_YEAR, this.expiryYear), new Pair(PARAM_CVC, this.cvc), new Pair(PARAM_TOKEN, this.token));
            ArrayList arrayList = new ArrayList();
            for (Pair pair : K) {
                B b = pair.d;
                Pair pair2 = b != null ? new Pair(pair.c, b) : null;
                if (pair2 != null) {
                    arrayList.add(pair2);
                }
            }
            return g.w0(arrayList);
        }

        public String toString() {
            StringBuilder P0 = a.P0("Card(number=");
            P0.append(this.number);
            P0.append(", expiryMonth=");
            P0.append(this.expiryMonth);
            P0.append(", expiryYear=");
            P0.append(this.expiryYear);
            P0.append(", cvc=");
            P0.append(this.cvc);
            P0.append(", token=");
            P0.append(this.token);
            P0.append(", attribution=");
            P0.append(this.attribution);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.number);
            Integer num = this.expiryMonth;
            if (num != null) {
                a.i(parcel, 1, num);
            } else {
                parcel.writeInt(0);
            }
            Integer num2 = this.expiryYear;
            if (num2 != null) {
                a.i(parcel, 1, num2);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.cvc);
            parcel.writeString(this.token);
            Set<String> set = this.attribution;
            if (set != null) {
                parcel.writeInt(1);
                parcel.writeInt(set.size());
                for (String writeString : set) {
                    parcel.writeString(writeString);
                }
                return;
            }
            parcel.writeInt(0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Card(java.lang.String r6, java.lang.Integer r7, java.lang.Integer r8, java.lang.String r9, java.lang.String r10, java.util.Set r11, int r12, m0.n.b.f r13) {
            /*
                r5 = this;
                r13 = r12 & 1
                r0 = 0
                if (r13 == 0) goto L_0x0007
                r13 = r0
                goto L_0x0008
            L_0x0007:
                r13 = r6
            L_0x0008:
                r6 = r12 & 2
                if (r6 == 0) goto L_0x000e
                r1 = r0
                goto L_0x000f
            L_0x000e:
                r1 = r7
            L_0x000f:
                r6 = r12 & 4
                if (r6 == 0) goto L_0x0015
                r2 = r0
                goto L_0x0016
            L_0x0015:
                r2 = r8
            L_0x0016:
                r6 = r12 & 8
                if (r6 == 0) goto L_0x001c
                r3 = r0
                goto L_0x001d
            L_0x001c:
                r3 = r9
            L_0x001d:
                r6 = r12 & 16
                if (r6 == 0) goto L_0x0023
                r4 = r0
                goto L_0x0024
            L_0x0023:
                r4 = r10
            L_0x0024:
                r6 = r12 & 32
                if (r6 == 0) goto L_0x002a
                r12 = r0
                goto L_0x002b
            L_0x002a:
                r12 = r11
            L_0x002b:
                r6 = r5
                r7 = r13
                r8 = r1
                r9 = r2
                r10 = r3
                r11 = r4
                r6.<init>(r7, r8, r9, r10, r11, r12)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.PaymentMethodCreateParams.Card.<init>(java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.util.Set, int, m0.n.b.f):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006J;\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u0012J;\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u0015J;\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u0018J7\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u001bJ7\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u001eJ;\u0010\u000e\u001a\u00020\u00042\u0006\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010!J;\u0010\u000e\u001a\u00020\u00042\u0006\u0010#\u001a\u00020\"2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010$J;\u0010\u000e\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b\u000e\u0010'J/\u0010(\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b(\u0010)J/\u0010*\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b*\u0010)J/\u0010+\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b+\u0010)J/\u0010,\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b,\u0010)J/\u0010-\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b-\u0010)J/\u0010.\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b.\u0010)J'\u0010/\u001a\u00020\u00042\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b/\u00100J'\u00101\u001a\u00020\u00042\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b1\u00100J3\u00102\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b2\u0010)J\u0017\u00105\u001a\u00020\u00042\u0006\u00104\u001a\u000203H\u0007¢\u0006\u0004\b5\u00106J3\u00107\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b7\u0010)J3\u00108\u001a\u00020\u00042\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0007¢\u0006\u0004\b8\u0010)R\u0016\u00109\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b;\u0010:R\u0016\u0010<\u001a\u00020\f8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b<\u0010:¨\u0006?"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Companion;", "", "Lcom/stripe/android/model/CardParams;", "cardParams", "Lcom/stripe/android/model/PaymentMethodCreateParams;", "createCard", "(Lcom/stripe/android/model/CardParams;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Card;", "card", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "billingDetails", "", "", "metadata", "create", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Card;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "ideal", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "fpx", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "sepaDebit", "(Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;", "auBecsDebit", "(Lcom/stripe/android/model/PaymentMethodCreateParams$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;", "bacsDebit", "(Lcom/stripe/android/model/PaymentMethodCreateParams$BacsDebit;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "sofort", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "upi", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "netbanking", "(Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "createP24", "(Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "createBancontact", "createGiropay", "createGrabPay", "createEps", "createOxxo", "createAlipay", "(Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "createPayPal", "createAfterpayClearpay", "Lorg/json/JSONObject;", "googlePayPaymentData", "createFromGooglePay", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethodCreateParams;", "createBlik", "createWeChatPay", "PARAM_BILLING_DETAILS", "Ljava/lang/String;", "PARAM_METADATA", "PARAM_TYPE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodCreateParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Card card, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(card, billingDetails, (Map<String, String>) map);
        }

        public static /* synthetic */ PaymentMethodCreateParams createAfterpayClearpay$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                billingDetails = null;
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createAfterpayClearpay(billingDetails, map);
        }

        public static /* synthetic */ PaymentMethodCreateParams createAlipay$default(Companion companion, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = null;
            }
            return companion.createAlipay(map);
        }

        public static /* synthetic */ PaymentMethodCreateParams createBancontact$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createBancontact(billingDetails, map);
        }

        public static /* synthetic */ PaymentMethodCreateParams createBlik$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                billingDetails = null;
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createBlik(billingDetails, map);
        }

        public static /* synthetic */ PaymentMethodCreateParams createEps$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createEps(billingDetails, map);
        }

        public static /* synthetic */ PaymentMethodCreateParams createGiropay$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createGiropay(billingDetails, map);
        }

        public static /* synthetic */ PaymentMethodCreateParams createGrabPay$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createGrabPay(billingDetails, map);
        }

        public static /* synthetic */ PaymentMethodCreateParams createOxxo$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createOxxo(billingDetails, map);
        }

        public static /* synthetic */ PaymentMethodCreateParams createP24$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createP24(billingDetails, map);
        }

        public static /* synthetic */ PaymentMethodCreateParams createPayPal$default(Companion companion, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                map = null;
            }
            return companion.createPayPal(map);
        }

        public static /* synthetic */ PaymentMethodCreateParams createWeChatPay$default(Companion companion, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 1) != 0) {
                billingDetails = null;
            }
            if ((i & 2) != 0) {
                map = null;
            }
            return companion.createWeChatPay(billingDetails, map);
        }

        public final PaymentMethodCreateParams create(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails) {
            return create$default(this, auBecsDebit, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails) {
            return create$default(this, bacsDebit, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(Card card) {
            return create$default(this, card, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(Card card, PaymentMethod.BillingDetails billingDetails) {
            return create$default(this, card, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(Card card, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            i.e(card, "card");
            return new PaymentMethodCreateParams(card, billingDetails, (Map) map, (f) null);
        }

        public final PaymentMethodCreateParams create(Fpx fpx) {
            return create$default(this, fpx, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(Fpx fpx, PaymentMethod.BillingDetails billingDetails) {
            return create$default(this, fpx, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(Ideal ideal) {
            return create$default(this, ideal, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(Ideal ideal, PaymentMethod.BillingDetails billingDetails) {
            return create$default(this, ideal, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(Netbanking netbanking) {
            return create$default(this, netbanking, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails) {
            return create$default(this, netbanking, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(SepaDebit sepaDebit) {
            return create$default(this, sepaDebit, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails) {
            return create$default(this, sepaDebit, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(Sofort sofort) {
            return create$default(this, sofort, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(Sofort sofort, PaymentMethod.BillingDetails billingDetails) {
            return create$default(this, sofort, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams create(Upi upi) {
            return create$default(this, upi, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
        }

        public final PaymentMethodCreateParams create(Upi upi, PaymentMethod.BillingDetails billingDetails) {
            return create$default(this, upi, billingDetails, (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams createAfterpayClearpay() {
            return createAfterpayClearpay$default(this, (PaymentMethod.BillingDetails) null, (Map) null, 3, (Object) null);
        }

        public final PaymentMethodCreateParams createAfterpayClearpay(PaymentMethod.BillingDetails billingDetails) {
            return createAfterpayClearpay$default(this, billingDetails, (Map) null, 2, (Object) null);
        }

        public final PaymentMethodCreateParams createAfterpayClearpay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(Type.AfterpayClearpay, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails, map, (Set) null, 5118, (f) null);
        }

        public final PaymentMethodCreateParams createAlipay() {
            return createAlipay$default(this, (Map) null, 1, (Object) null);
        }

        public final PaymentMethodCreateParams createAlipay(Map<String, String> map) {
            return new PaymentMethodCreateParams(Type.Alipay, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, (PaymentMethod.BillingDetails) null, map, (Set) null, 6142, (f) null);
        }

        public final PaymentMethodCreateParams createBancontact(PaymentMethod.BillingDetails billingDetails) {
            return createBancontact$default(this, billingDetails, (Map) null, 2, (Object) null);
        }

        public final PaymentMethodCreateParams createBancontact(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            PaymentMethod.BillingDetails billingDetails2 = billingDetails;
            i.e(billingDetails2, "billingDetails");
            return new PaymentMethodCreateParams(Type.Bancontact, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails2, map, (Set) null, 5118, (f) null);
        }

        public final PaymentMethodCreateParams createBlik() {
            return createBlik$default(this, (PaymentMethod.BillingDetails) null, (Map) null, 3, (Object) null);
        }

        public final PaymentMethodCreateParams createBlik(PaymentMethod.BillingDetails billingDetails) {
            return createBlik$default(this, billingDetails, (Map) null, 2, (Object) null);
        }

        public final PaymentMethodCreateParams createBlik(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(Type.Blik, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails, map, (Set) null, 5118, (f) null);
        }

        public final PaymentMethodCreateParams createCard(CardParams cardParams) {
            i.e(cardParams, "cardParams");
            return create(new Card(cardParams.getNumber$payments_core_release(), Integer.valueOf(cardParams.getExpMonth$payments_core_release()), Integer.valueOf(cardParams.getExpYear$payments_core_release()), cardParams.getCvc$payments_core_release(), (String) null, cardParams.getAttribution$payments_core_release(), 16, (f) null), new PaymentMethod.BillingDetails(cardParams.getAddress(), (String) null, cardParams.getName(), (String) null, 10, (f) null), cardParams.getMetadata());
        }

        public final PaymentMethodCreateParams createEps(PaymentMethod.BillingDetails billingDetails) {
            return createEps$default(this, billingDetails, (Map) null, 2, (Object) null);
        }

        public final PaymentMethodCreateParams createEps(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            PaymentMethod.BillingDetails billingDetails2 = billingDetails;
            i.e(billingDetails2, "billingDetails");
            return new PaymentMethodCreateParams(Type.Eps, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails2, map, (Set) null, 5118, (f) null);
        }

        public final PaymentMethodCreateParams createFromGooglePay(JSONObject jSONObject) throws JSONException {
            Set set;
            Card card;
            TokenizationMethod tokenizationMethod;
            i.e(jSONObject, "googlePayPaymentData");
            GooglePayResult fromJson = GooglePayResult.Companion.fromJson(jSONObject);
            Token token = fromJson.getToken();
            String str = null;
            String id = token != null ? token.getId() : null;
            if (id == null) {
                id = "";
            }
            String str2 = id;
            if (!(token == null || (card = token.getCard()) == null || (tokenizationMethod = card.getTokenizationMethod()) == null)) {
                str = tokenizationMethod.toString();
            }
            if (str != null) {
                set = h.N3(str);
            } else {
                set = EmptySet.c;
            }
            return create$default(this, new Card((String) null, (Integer) null, (Integer) null, (String) null, str2, set, 15, (f) null), new PaymentMethod.BillingDetails(fromJson.getAddress(), fromJson.getEmail(), fromJson.getName(), fromJson.getPhoneNumber()), (Map) null, 4, (Object) null);
        }

        public final PaymentMethodCreateParams createGiropay(PaymentMethod.BillingDetails billingDetails) {
            return createGiropay$default(this, billingDetails, (Map) null, 2, (Object) null);
        }

        public final PaymentMethodCreateParams createGiropay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            PaymentMethod.BillingDetails billingDetails2 = billingDetails;
            i.e(billingDetails2, "billingDetails");
            return new PaymentMethodCreateParams(Type.Giropay, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails2, map, (Set) null, 5118, (f) null);
        }

        public final PaymentMethodCreateParams createGrabPay(PaymentMethod.BillingDetails billingDetails) {
            return createGrabPay$default(this, billingDetails, (Map) null, 2, (Object) null);
        }

        public final PaymentMethodCreateParams createGrabPay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            PaymentMethod.BillingDetails billingDetails2 = billingDetails;
            i.e(billingDetails2, "billingDetails");
            return new PaymentMethodCreateParams(Type.GrabPay, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails2, map, (Set) null, 5118, (f) null);
        }

        public final PaymentMethodCreateParams createOxxo(PaymentMethod.BillingDetails billingDetails) {
            return createOxxo$default(this, billingDetails, (Map) null, 2, (Object) null);
        }

        public final PaymentMethodCreateParams createOxxo(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            PaymentMethod.BillingDetails billingDetails2 = billingDetails;
            i.e(billingDetails2, "billingDetails");
            return new PaymentMethodCreateParams(Type.Oxxo, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails2, map, (Set) null, 5118, (f) null);
        }

        public final PaymentMethodCreateParams createP24(PaymentMethod.BillingDetails billingDetails) {
            return createP24$default(this, billingDetails, (Map) null, 2, (Object) null);
        }

        public final PaymentMethodCreateParams createP24(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            PaymentMethod.BillingDetails billingDetails2 = billingDetails;
            i.e(billingDetails2, "billingDetails");
            return new PaymentMethodCreateParams(Type.P24, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails2, map, (Set) null, 5118, (f) null);
        }

        public final PaymentMethodCreateParams createPayPal() {
            return createPayPal$default(this, (Map) null, 1, (Object) null);
        }

        public final PaymentMethodCreateParams createPayPal(Map<String, String> map) {
            return new PaymentMethodCreateParams(Type.PayPal, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, (PaymentMethod.BillingDetails) null, map, (Set) null, 6142, (f) null);
        }

        public final PaymentMethodCreateParams createWeChatPay() {
            return createWeChatPay$default(this, (PaymentMethod.BillingDetails) null, (Map) null, 3, (Object) null);
        }

        public final PaymentMethodCreateParams createWeChatPay(PaymentMethod.BillingDetails billingDetails) {
            return createWeChatPay$default(this, billingDetails, (Map) null, 2, (Object) null);
        }

        public final PaymentMethodCreateParams createWeChatPay(PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            return new PaymentMethodCreateParams(Type.WeChatPay, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails, map, (Set) null, 5118, (f) null);
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }

        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Ideal ideal, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(ideal, billingDetails, (Map<String, String>) map);
        }

        public final PaymentMethodCreateParams create(Ideal ideal, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            i.e(ideal, "ideal");
            return new PaymentMethodCreateParams(ideal, billingDetails, (Map) map, (f) null);
        }

        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(fpx, billingDetails, (Map<String, String>) map);
        }

        public final PaymentMethodCreateParams create(Fpx fpx, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            i.e(fpx, "fpx");
            return new PaymentMethodCreateParams(fpx, billingDetails, (Map) map, (f) null);
        }

        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(sepaDebit, billingDetails, (Map<String, String>) map);
        }

        public final PaymentMethodCreateParams create(SepaDebit sepaDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            i.e(sepaDebit, "sepaDebit");
            return new PaymentMethodCreateParams(sepaDebit, billingDetails, (Map) map, (f) null);
        }

        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(auBecsDebit, billingDetails, (Map<String, String>) map);
        }

        public final PaymentMethodCreateParams create(AuBecsDebit auBecsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            i.e(auBecsDebit, "auBecsDebit");
            i.e(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(auBecsDebit, billingDetails, (Map) map, (f) null);
        }

        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(bacsDebit, billingDetails, (Map<String, String>) map);
        }

        public final PaymentMethodCreateParams create(BacsDebit bacsDebit, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            i.e(bacsDebit, "bacsDebit");
            i.e(billingDetails, "billingDetails");
            return new PaymentMethodCreateParams(bacsDebit, billingDetails, (Map) map, (f) null);
        }

        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Sofort sofort, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(sofort, billingDetails, (Map<String, String>) map);
        }

        public final PaymentMethodCreateParams create(Sofort sofort, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            i.e(sofort, "sofort");
            return new PaymentMethodCreateParams(sofort, billingDetails, (Map) map, (f) null);
        }

        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Upi upi, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(upi, billingDetails, (Map<String, String>) map);
        }

        public final PaymentMethodCreateParams create(Upi upi, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            i.e(upi, "upi");
            return new PaymentMethodCreateParams(upi, billingDetails, (Map) map, (f) null);
        }

        public static /* synthetic */ PaymentMethodCreateParams create$default(Companion companion, Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map map, int i, Object obj) {
            if ((i & 2) != 0) {
                billingDetails = null;
            }
            if ((i & 4) != 0) {
                map = null;
            }
            return companion.create(netbanking, billingDetails, (Map<String, String>) map);
        }

        public final PaymentMethodCreateParams create(Netbanking netbanking, PaymentMethod.BillingDetails billingDetails, Map<String, String> map) {
            i.e(netbanking, "netbanking");
            return new PaymentMethodCreateParams(netbanking, billingDetails, (Map) map, (f) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<PaymentMethodCreateParams> {
        public final PaymentMethodCreateParams createFromParcel(Parcel parcel) {
            Parcel parcel2 = parcel;
            i.e(parcel2, "in");
            Type type = (Type) Enum.valueOf(Type.class, parcel.readString());
            LinkedHashMap linkedHashMap = null;
            Card createFromParcel = parcel.readInt() != 0 ? Card.CREATOR.createFromParcel(parcel2) : null;
            Ideal createFromParcel2 = parcel.readInt() != 0 ? Ideal.CREATOR.createFromParcel(parcel2) : null;
            Fpx createFromParcel3 = parcel.readInt() != 0 ? Fpx.CREATOR.createFromParcel(parcel2) : null;
            SepaDebit createFromParcel4 = parcel.readInt() != 0 ? SepaDebit.CREATOR.createFromParcel(parcel2) : null;
            AuBecsDebit createFromParcel5 = parcel.readInt() != 0 ? AuBecsDebit.CREATOR.createFromParcel(parcel2) : null;
            BacsDebit createFromParcel6 = parcel.readInt() != 0 ? BacsDebit.CREATOR.createFromParcel(parcel2) : null;
            Sofort createFromParcel7 = parcel.readInt() != 0 ? Sofort.CREATOR.createFromParcel(parcel2) : null;
            Upi createFromParcel8 = parcel.readInt() != 0 ? Upi.CREATOR.createFromParcel(parcel2) : null;
            Netbanking createFromParcel9 = parcel.readInt() != 0 ? Netbanking.CREATOR.createFromParcel(parcel2) : null;
            PaymentMethod.BillingDetails createFromParcel10 = parcel.readInt() != 0 ? PaymentMethod.BillingDetails.CREATOR.createFromParcel(parcel2) : null;
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                while (readInt != 0) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    readInt--;
                    Parcel parcel3 = parcel;
                }
            }
            LinkedHashMap linkedHashMap2 = linkedHashMap;
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
            while (readInt2 != 0) {
                linkedHashSet.add(parcel.readString());
                readInt2--;
            }
            return new PaymentMethodCreateParams(type, createFromParcel, createFromParcel2, createFromParcel3, createFromParcel4, createFromParcel5, createFromParcel6, createFromParcel7, createFromParcel8, createFromParcel9, createFromParcel10, linkedHashMap2, linkedHashSet);
        }

        public final PaymentMethodCreateParams[] newArray(int i) {
            return new PaymentMethodCreateParams[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002\"!B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "bank", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBank", "setBank", "(Ljava/lang/String;)V", "<init>", "Companion", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodCreateParams.kt */
    public static final class Fpx implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<Fpx> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_BANK = "bank";
        private String bank;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "", "bank", "setBank", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx$Builder;", "build", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx;", "Ljava/lang/String;", "getBank$payments_core_release", "()Ljava/lang/String;", "setBank$payments_core_release", "(Ljava/lang/String;)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodCreateParams.kt */
        public static final class Builder implements ObjectBuilder<Fpx> {
            private String bank;

            public final String getBank$payments_core_release() {
                return this.bank;
            }

            public final Builder setBank(String str) {
                this.bank = str;
                return this;
            }

            public final void setBank$payments_core_release(String str) {
                this.bank = str;
            }

            public Fpx build() {
                return new Fpx(this.bank);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Fpx$Companion;", "", "", "PARAM_BANK", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodCreateParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Fpx> {
            public final Fpx createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Fpx(parcel.readString());
            }

            public final Fpx[] newArray(int i) {
                return new Fpx[i];
            }
        }

        public Fpx(String str) {
            this.bank = str;
        }

        public static /* synthetic */ Fpx copy$default(Fpx fpx, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fpx.bank;
            }
            return fpx.copy(str);
        }

        public final String component1() {
            return this.bank;
        }

        public final Fpx copy(String str) {
            return new Fpx(str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Fpx) && i.a(this.bank, ((Fpx) obj).bank);
            }
            return true;
        }

        public final String getBank() {
            return this.bank;
        }

        public int hashCode() {
            String str = this.bank;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final void setBank(String str) {
            this.bank = str;
        }

        public Map<String, Object> toParamMap() {
            String str = this.bank;
            Map<String, Object> S2 = str != null ? h.S2(new Pair(PARAM_BANK, str)) : null;
            return S2 != null ? S2 : g.o();
        }

        public String toString() {
            return a.y0(a.P0("Fpx(bank="), this.bank, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.bank);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002\"!B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "bank", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBank", "setBank", "(Ljava/lang/String;)V", "<init>", "Companion", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodCreateParams.kt */
    public static final class Ideal implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<Ideal> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_BANK = "bank";
        private String bank;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR$\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "", "bank", "setBank", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal$Builder;", "build", "()Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal;", "Ljava/lang/String;", "getBank$payments_core_release", "()Ljava/lang/String;", "setBank$payments_core_release", "(Ljava/lang/String;)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodCreateParams.kt */
        public static final class Builder implements ObjectBuilder<Ideal> {
            private String bank;

            public final String getBank$payments_core_release() {
                return this.bank;
            }

            public final Builder setBank(String str) {
                this.bank = str;
                return this;
            }

            public final void setBank$payments_core_release(String str) {
                this.bank = str;
            }

            public Ideal build() {
                return new Ideal(this.bank);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Ideal$Companion;", "", "", "PARAM_BANK", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodCreateParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Ideal> {
            public final Ideal createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Ideal(parcel.readString());
            }

            public final Ideal[] newArray(int i) {
                return new Ideal[i];
            }
        }

        public Ideal(String str) {
            this.bank = str;
        }

        public static /* synthetic */ Ideal copy$default(Ideal ideal, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ideal.bank;
            }
            return ideal.copy(str);
        }

        public final String component1() {
            return this.bank;
        }

        public final Ideal copy(String str) {
            return new Ideal(str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Ideal) && i.a(this.bank, ((Ideal) obj).bank);
            }
            return true;
        }

        public final String getBank() {
            return this.bank;
        }

        public int hashCode() {
            String str = this.bank;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final void setBank(String str) {
            this.bank = str;
        }

        public Map<String, Object> toParamMap() {
            String str = this.bank;
            Map<String, Object> S2 = str != null ? h.S2(new Pair(PARAM_BANK, str)) : null;
            return S2 != null ? S2 : g.o();
        }

        public String toString() {
            return a.y0(a.P0("Ideal(bank="), this.bank, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.bank);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b!\u0010 J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "bank", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getBank$payments_core_release", "setBank$payments_core_release", "(Ljava/lang/String;)V", "<init>", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodCreateParams.kt */
    public static final class Netbanking implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<Netbanking> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_BANK = "bank";
        private String bank;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Netbanking$Companion;", "", "", "PARAM_BANK", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodCreateParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Netbanking> {
            public final Netbanking createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Netbanking(parcel.readString());
            }

            public final Netbanking[] newArray(int i) {
                return new Netbanking[i];
            }
        }

        public Netbanking(String str) {
            i.e(str, PARAM_BANK);
            this.bank = str;
        }

        public static /* synthetic */ Netbanking copy$default(Netbanking netbanking, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = netbanking.bank;
            }
            return netbanking.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.bank;
        }

        public final Netbanking copy(String str) {
            i.e(str, PARAM_BANK);
            return new Netbanking(str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Netbanking) && i.a(this.bank, ((Netbanking) obj).bank);
            }
            return true;
        }

        public final String getBank$payments_core_release() {
            return this.bank;
        }

        public int hashCode() {
            String str = this.bank;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final void setBank$payments_core_release(String str) {
            i.e(str, "<set-?>");
            this.bank = str;
        }

        public Map<String, Object> toParamMap() {
            String str = this.bank;
            Locale locale = Locale.ROOT;
            i.d(locale, "Locale.ROOT");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String lowerCase = str.toLowerCase(locale);
            i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            return h.S2(new Pair(PARAM_BANK, lowerCase));
        }

        public String toString() {
            return a.y0(a.P0("Netbanking(bank="), this.bank, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.bank);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002\"!B\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b \u0010\u001fJ\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR$\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u001c\u001a\u0004\b\u001d\u0010\t\"\u0004\b\u001e\u0010\u001f¨\u0006#"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "iban", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getIban", "setIban", "(Ljava/lang/String;)V", "<init>", "Companion", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodCreateParams.kt */
    public static final class SepaDebit implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_IBAN = "iban";
        private String iban;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "", "iban", "setIban", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit$Builder;", "build", "()Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit;", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodCreateParams.kt */
        public static final class Builder implements ObjectBuilder<SepaDebit> {
            private String iban;

            public final Builder setIban(String str) {
                this.iban = str;
                return this;
            }

            public SepaDebit build() {
                return new SepaDebit(this.iban);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$SepaDebit$Companion;", "", "", "PARAM_IBAN", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodCreateParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<SepaDebit> {
            public final SepaDebit createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new SepaDebit(parcel.readString());
            }

            public final SepaDebit[] newArray(int i) {
                return new SepaDebit[i];
            }
        }

        public SepaDebit(String str) {
            this.iban = str;
        }

        public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sepaDebit.iban;
            }
            return sepaDebit.copy(str);
        }

        public final String component1() {
            return this.iban;
        }

        public final SepaDebit copy(String str) {
            return new SepaDebit(str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SepaDebit) && i.a(this.iban, ((SepaDebit) obj).iban);
            }
            return true;
        }

        public final String getIban() {
            return this.iban;
        }

        public int hashCode() {
            String str = this.iban;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final void setIban(String str) {
            this.iban = str;
        }

        public Map<String, Object> toParamMap() {
            String str = this.iban;
            Map<String, Object> S2 = str != null ? h.S2(new Pair(PARAM_IBAN, str)) : null;
            return S2 != null ? S2 : g.o();
        }

        public String toString() {
            return a.y0(a.P0("SepaDebit(iban="), this.iban, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.iban);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 \"2\u00020\u00012\u00020\u0002:\u0001\"B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0004¢\u0006\u0004\b!\u0010 J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u0004HÀ\u0003¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0011J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\"\u0010\u000b\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\t\"\u0004\b\u001f\u0010 ¨\u0006#"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "country", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCountry$payments_core_release", "setCountry$payments_core_release", "(Ljava/lang/String;)V", "<init>", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodCreateParams.kt */
    public static final class Sofort implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<Sofort> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_COUNTRY = "country";
        private String country;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Sofort$Companion;", "", "", "PARAM_COUNTRY", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodCreateParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Sofort> {
            public final Sofort createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Sofort(parcel.readString());
            }

            public final Sofort[] newArray(int i) {
                return new Sofort[i];
            }
        }

        public Sofort(String str) {
            i.e(str, "country");
            this.country = str;
        }

        public static /* synthetic */ Sofort copy$default(Sofort sofort, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sofort.country;
            }
            return sofort.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.country;
        }

        public final Sofort copy(String str) {
            i.e(str, "country");
            return new Sofort(str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Sofort) && i.a(this.country, ((Sofort) obj).country);
            }
            return true;
        }

        public final String getCountry$payments_core_release() {
            return this.country;
        }

        public int hashCode() {
            String str = this.country;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final void setCountry$payments_core_release(String str) {
            i.e(str, "<set-?>");
            this.country = str;
        }

        public Map<String, Object> toParamMap() {
            String str = this.country;
            Locale locale = Locale.ROOT;
            i.d(locale, "Locale.ROOT");
            Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
            String upperCase = str.toUpperCase(locale);
            i.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
            return h.S2(new Pair("country", upperCase));
        }

        public String toString() {
            return a.y0(a.P0("Sofort(country="), this.country, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.country);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001b\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u001b\b\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u001c\u0010\b\u001a\u00020\u00078\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!¨\u0006\""}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Type;", "", "", "hasMandate", "Z", "getHasMandate", "()Z", "", "code", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "Card", "Ideal", "Fpx", "SepaDebit", "AuBecsDebit", "BacsDebit", "Sofort", "P24", "Bancontact", "Giropay", "Eps", "Oxxo", "Alipay", "GrabPay", "PayPal", "AfterpayClearpay", "Upi", "Netbanking", "Blik", "WeChatPay", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodCreateParams.kt */
    public enum Type {
        Card("card", false, 2, (boolean) null),
        Ideal("ideal", true),
        Fpx("fpx", false, 2, (boolean) null),
        SepaDebit("sepa_debit", true),
        AuBecsDebit("au_becs_debit", true),
        BacsDebit("bacs_debit", true),
        Sofort("sofort", true),
        P24("p24", false, 2, (boolean) null),
        Bancontact("bancontact", true),
        Giropay("giropay", false, 2, (boolean) null),
        Eps("eps", true),
        Oxxo("oxxo", false, 2, (boolean) null),
        Alipay("alipay", false, 2, (boolean) null),
        GrabPay("grabpay", false, 2, (boolean) null),
        PayPal("paypal", false, 2, (boolean) null),
        AfterpayClearpay("afterpay_clearpay", false, 2, (boolean) null),
        Upi("upi", false, 2, (boolean) null),
        Netbanking("netbanking", false, 2, (boolean) null),
        Blik("blik", false, 2, (boolean) null),
        WeChatPay("wechat_pay", false, 2, (boolean) null);
        
        private final String code;
        private final boolean hasMandate;

        private Type(String str, boolean z) {
            this.code = str;
            this.hasMandate = z;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }

        public final boolean getHasMandate() {
            return this.hasMandate;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0001\u001fB\u0011\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u0005J\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0010J \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001c¨\u0006 "}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "", "", "toParamMap", "()Ljava/util/Map;", "vpa", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethodCreateParams$Upi;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodCreateParams.kt */
    public static final class Upi implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<Upi> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_VPA = "vpa";
        private final String vpa;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/model/PaymentMethodCreateParams$Upi$Companion;", "", "", "PARAM_VPA", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodCreateParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Upi> {
            public final Upi createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Upi(parcel.readString());
            }

            public final Upi[] newArray(int i) {
                return new Upi[i];
            }
        }

        public Upi(String str) {
            this.vpa = str;
        }

        private final String component1() {
            return this.vpa;
        }

        public static /* synthetic */ Upi copy$default(Upi upi, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = upi.vpa;
            }
            return upi.copy(str);
        }

        public final Upi copy(String str) {
            return new Upi(str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof Upi) && i.a(this.vpa, ((Upi) obj).vpa);
            }
            return true;
        }

        public int hashCode() {
            String str = this.vpa;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public Map<String, Object> toParamMap() {
            String str = this.vpa;
            Map<String, Object> S2 = str != null ? h.S2(new Pair(PARAM_VPA, str)) : null;
            return S2 != null ? S2 : g.o();
        }

        public String toString() {
            return a.y0(a.P0("Upi(vpa="), this.vpa, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.vpa);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            Type.values();
            int[] iArr = new int[20];
            $EnumSwitchMapping$0 = iArr;
            Type type = Type.Card;
            iArr[type.ordinal()] = 1;
            Type.values();
            int[] iArr2 = new int[20];
            $EnumSwitchMapping$1 = iArr2;
            iArr2[type.ordinal()] = 1;
            iArr2[Type.Ideal.ordinal()] = 2;
            iArr2[Type.Fpx.ordinal()] = 3;
            iArr2[Type.SepaDebit.ordinal()] = 4;
            iArr2[Type.AuBecsDebit.ordinal()] = 5;
            iArr2[Type.BacsDebit.ordinal()] = 6;
            iArr2[Type.Sofort.ordinal()] = 7;
            iArr2[Type.Upi.ordinal()] = 8;
            iArr2[Type.Netbanking.ordinal()] = 9;
        }
    }

    public /* synthetic */ PaymentMethodCreateParams(AuBecsDebit auBecsDebit2, PaymentMethod.BillingDetails billingDetails2, Map map, f fVar) {
        this(auBecsDebit2, billingDetails2, (Map<String, String>) map);
    }

    private final Netbanking component10() {
        return this.netbanking;
    }

    private final Map<String, String> component12() {
        return this.metadata;
    }

    private final Set<String> component13() {
        return this.productUsage;
    }

    private final Ideal component3() {
        return this.ideal;
    }

    private final Fpx component4() {
        return this.fpx;
    }

    private final SepaDebit component5() {
        return this.sepaDebit;
    }

    private final AuBecsDebit component6() {
        return this.auBecsDebit;
    }

    private final BacsDebit component7() {
        return this.bacsDebit;
    }

    private final Sofort component8() {
        return this.sofort;
    }

    private final Upi component9() {
        return this.upi;
    }

    public static /* synthetic */ PaymentMethodCreateParams copy$default(PaymentMethodCreateParams paymentMethodCreateParams, Type type2, Card card2, Ideal ideal2, Fpx fpx2, SepaDebit sepaDebit2, AuBecsDebit auBecsDebit2, BacsDebit bacsDebit2, Sofort sofort2, Upi upi2, Netbanking netbanking2, PaymentMethod.BillingDetails billingDetails2, Map map, Set set, int i, Object obj) {
        PaymentMethodCreateParams paymentMethodCreateParams2 = paymentMethodCreateParams;
        int i2 = i;
        return paymentMethodCreateParams.copy((i2 & 1) != 0 ? paymentMethodCreateParams2.type : type2, (i2 & 2) != 0 ? paymentMethodCreateParams2.card : card2, (i2 & 4) != 0 ? paymentMethodCreateParams2.ideal : ideal2, (i2 & 8) != 0 ? paymentMethodCreateParams2.fpx : fpx2, (i2 & 16) != 0 ? paymentMethodCreateParams2.sepaDebit : sepaDebit2, (i2 & 32) != 0 ? paymentMethodCreateParams2.auBecsDebit : auBecsDebit2, (i2 & 64) != 0 ? paymentMethodCreateParams2.bacsDebit : bacsDebit2, (i2 & 128) != 0 ? paymentMethodCreateParams2.sofort : sofort2, (i2 & 256) != 0 ? paymentMethodCreateParams2.upi : upi2, (i2 & 512) != 0 ? paymentMethodCreateParams2.netbanking : netbanking2, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? paymentMethodCreateParams2.billingDetails : billingDetails2, (i2 & 2048) != 0 ? paymentMethodCreateParams2.metadata : map, (i2 & 4096) != 0 ? paymentMethodCreateParams2.productUsage : set);
    }

    public static final PaymentMethodCreateParams create(AuBecsDebit auBecsDebit2, PaymentMethod.BillingDetails billingDetails2) {
        return Companion.create$default(Companion, auBecsDebit2, billingDetails2, (Map) null, 4, (Object) null);
    }

    public static final PaymentMethodCreateParams create(AuBecsDebit auBecsDebit2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.create(auBecsDebit2, billingDetails2, map);
    }

    public static final PaymentMethodCreateParams create(BacsDebit bacsDebit2, PaymentMethod.BillingDetails billingDetails2) {
        return Companion.create$default(Companion, bacsDebit2, billingDetails2, (Map) null, 4, (Object) null);
    }

    public static final PaymentMethodCreateParams create(BacsDebit bacsDebit2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.create(bacsDebit2, billingDetails2, map);
    }

    public static final PaymentMethodCreateParams create(Card card2) {
        return Companion.create$default(Companion, card2, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    public static final PaymentMethodCreateParams create(Card card2, PaymentMethod.BillingDetails billingDetails2) {
        return Companion.create$default(Companion, card2, billingDetails2, (Map) null, 4, (Object) null);
    }

    public static final PaymentMethodCreateParams create(Card card2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.create(card2, billingDetails2, map);
    }

    public static final PaymentMethodCreateParams create(Fpx fpx2) {
        return Companion.create$default(Companion, fpx2, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    public static final PaymentMethodCreateParams create(Fpx fpx2, PaymentMethod.BillingDetails billingDetails2) {
        return Companion.create$default(Companion, fpx2, billingDetails2, (Map) null, 4, (Object) null);
    }

    public static final PaymentMethodCreateParams create(Fpx fpx2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.create(fpx2, billingDetails2, map);
    }

    public static final PaymentMethodCreateParams create(Ideal ideal2) {
        return Companion.create$default(Companion, ideal2, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    public static final PaymentMethodCreateParams create(Ideal ideal2, PaymentMethod.BillingDetails billingDetails2) {
        return Companion.create$default(Companion, ideal2, billingDetails2, (Map) null, 4, (Object) null);
    }

    public static final PaymentMethodCreateParams create(Ideal ideal2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.create(ideal2, billingDetails2, map);
    }

    public static final PaymentMethodCreateParams create(Netbanking netbanking2) {
        return Companion.create$default(Companion, netbanking2, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    public static final PaymentMethodCreateParams create(Netbanking netbanking2, PaymentMethod.BillingDetails billingDetails2) {
        return Companion.create$default(Companion, netbanking2, billingDetails2, (Map) null, 4, (Object) null);
    }

    public static final PaymentMethodCreateParams create(Netbanking netbanking2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.create(netbanking2, billingDetails2, map);
    }

    public static final PaymentMethodCreateParams create(SepaDebit sepaDebit2) {
        return Companion.create$default(Companion, sepaDebit2, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    public static final PaymentMethodCreateParams create(SepaDebit sepaDebit2, PaymentMethod.BillingDetails billingDetails2) {
        return Companion.create$default(Companion, sepaDebit2, billingDetails2, (Map) null, 4, (Object) null);
    }

    public static final PaymentMethodCreateParams create(SepaDebit sepaDebit2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.create(sepaDebit2, billingDetails2, map);
    }

    public static final PaymentMethodCreateParams create(Sofort sofort2) {
        return Companion.create$default(Companion, sofort2, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    public static final PaymentMethodCreateParams create(Sofort sofort2, PaymentMethod.BillingDetails billingDetails2) {
        return Companion.create$default(Companion, sofort2, billingDetails2, (Map) null, 4, (Object) null);
    }

    public static final PaymentMethodCreateParams create(Sofort sofort2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.create(sofort2, billingDetails2, map);
    }

    public static final PaymentMethodCreateParams create(Upi upi2) {
        return Companion.create$default(Companion, upi2, (PaymentMethod.BillingDetails) null, (Map) null, 6, (Object) null);
    }

    public static final PaymentMethodCreateParams create(Upi upi2, PaymentMethod.BillingDetails billingDetails2) {
        return Companion.create$default(Companion, upi2, billingDetails2, (Map) null, 4, (Object) null);
    }

    public static final PaymentMethodCreateParams create(Upi upi2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.create(upi2, billingDetails2, map);
    }

    public static final PaymentMethodCreateParams createAfterpayClearpay() {
        return Companion.createAfterpayClearpay$default(Companion, (PaymentMethod.BillingDetails) null, (Map) null, 3, (Object) null);
    }

    public static final PaymentMethodCreateParams createAfterpayClearpay(PaymentMethod.BillingDetails billingDetails2) {
        return Companion.createAfterpayClearpay$default(Companion, billingDetails2, (Map) null, 2, (Object) null);
    }

    public static final PaymentMethodCreateParams createAfterpayClearpay(PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.createAfterpayClearpay(billingDetails2, map);
    }

    public static final PaymentMethodCreateParams createAlipay() {
        return Companion.createAlipay$default(Companion, (Map) null, 1, (Object) null);
    }

    public static final PaymentMethodCreateParams createAlipay(Map<String, String> map) {
        return Companion.createAlipay(map);
    }

    public static final PaymentMethodCreateParams createBancontact(PaymentMethod.BillingDetails billingDetails2) {
        return Companion.createBancontact$default(Companion, billingDetails2, (Map) null, 2, (Object) null);
    }

    public static final PaymentMethodCreateParams createBancontact(PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.createBancontact(billingDetails2, map);
    }

    public static final PaymentMethodCreateParams createBlik() {
        return Companion.createBlik$default(Companion, (PaymentMethod.BillingDetails) null, (Map) null, 3, (Object) null);
    }

    public static final PaymentMethodCreateParams createBlik(PaymentMethod.BillingDetails billingDetails2) {
        return Companion.createBlik$default(Companion, billingDetails2, (Map) null, 2, (Object) null);
    }

    public static final PaymentMethodCreateParams createBlik(PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.createBlik(billingDetails2, map);
    }

    public static final PaymentMethodCreateParams createCard(CardParams cardParams) {
        return Companion.createCard(cardParams);
    }

    public static final PaymentMethodCreateParams createEps(PaymentMethod.BillingDetails billingDetails2) {
        return Companion.createEps$default(Companion, billingDetails2, (Map) null, 2, (Object) null);
    }

    public static final PaymentMethodCreateParams createEps(PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.createEps(billingDetails2, map);
    }

    public static final PaymentMethodCreateParams createFromGooglePay(JSONObject jSONObject) throws JSONException {
        return Companion.createFromGooglePay(jSONObject);
    }

    public static final PaymentMethodCreateParams createGiropay(PaymentMethod.BillingDetails billingDetails2) {
        return Companion.createGiropay$default(Companion, billingDetails2, (Map) null, 2, (Object) null);
    }

    public static final PaymentMethodCreateParams createGiropay(PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.createGiropay(billingDetails2, map);
    }

    public static final PaymentMethodCreateParams createGrabPay(PaymentMethod.BillingDetails billingDetails2) {
        return Companion.createGrabPay$default(Companion, billingDetails2, (Map) null, 2, (Object) null);
    }

    public static final PaymentMethodCreateParams createGrabPay(PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.createGrabPay(billingDetails2, map);
    }

    public static final PaymentMethodCreateParams createOxxo(PaymentMethod.BillingDetails billingDetails2) {
        return Companion.createOxxo$default(Companion, billingDetails2, (Map) null, 2, (Object) null);
    }

    public static final PaymentMethodCreateParams createOxxo(PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.createOxxo(billingDetails2, map);
    }

    public static final PaymentMethodCreateParams createP24(PaymentMethod.BillingDetails billingDetails2) {
        return Companion.createP24$default(Companion, billingDetails2, (Map) null, 2, (Object) null);
    }

    public static final PaymentMethodCreateParams createP24(PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.createP24(billingDetails2, map);
    }

    public static final PaymentMethodCreateParams createPayPal() {
        return Companion.createPayPal$default(Companion, (Map) null, 1, (Object) null);
    }

    public static final PaymentMethodCreateParams createPayPal(Map<String, String> map) {
        return Companion.createPayPal(map);
    }

    public static final PaymentMethodCreateParams createWeChatPay() {
        return Companion.createWeChatPay$default(Companion, (PaymentMethod.BillingDetails) null, (Map) null, 3, (Object) null);
    }

    public static final PaymentMethodCreateParams createWeChatPay(PaymentMethod.BillingDetails billingDetails2) {
        return Companion.createWeChatPay$default(Companion, billingDetails2, (Map) null, 2, (Object) null);
    }

    public static final PaymentMethodCreateParams createWeChatPay(PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        return Companion.createWeChatPay(billingDetails2, map);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x006f  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:45:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final java.util.Map<java.lang.String, java.lang.Object> getTypeParams() {
        /*
            r3 = this;
            com.stripe.android.model.PaymentMethodCreateParams$Type r0 = r3.type
            int r0 = r0.ordinal()
            r1 = 16
            r2 = 0
            if (r0 == r1) goto L_0x005c
            r1 = 17
            if (r0 == r1) goto L_0x0053
            switch(r0) {
                case 0: goto L_0x004a;
                case 1: goto L_0x0041;
                case 2: goto L_0x0038;
                case 3: goto L_0x002f;
                case 4: goto L_0x0026;
                case 5: goto L_0x001d;
                case 6: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            r0 = r2
            goto L_0x0064
        L_0x0014:
            com.stripe.android.model.PaymentMethodCreateParams$Sofort r0 = r3.sofort
            if (r0 == 0) goto L_0x0012
            java.util.Map r0 = r0.toParamMap()
            goto L_0x0064
        L_0x001d:
            com.stripe.android.model.PaymentMethodCreateParams$BacsDebit r0 = r3.bacsDebit
            if (r0 == 0) goto L_0x0012
            java.util.Map r0 = r0.toParamMap()
            goto L_0x0064
        L_0x0026:
            com.stripe.android.model.PaymentMethodCreateParams$AuBecsDebit r0 = r3.auBecsDebit
            if (r0 == 0) goto L_0x0012
            java.util.Map r0 = r0.toParamMap()
            goto L_0x0064
        L_0x002f:
            com.stripe.android.model.PaymentMethodCreateParams$SepaDebit r0 = r3.sepaDebit
            if (r0 == 0) goto L_0x0012
            java.util.Map r0 = r0.toParamMap()
            goto L_0x0064
        L_0x0038:
            com.stripe.android.model.PaymentMethodCreateParams$Fpx r0 = r3.fpx
            if (r0 == 0) goto L_0x0012
            java.util.Map r0 = r0.toParamMap()
            goto L_0x0064
        L_0x0041:
            com.stripe.android.model.PaymentMethodCreateParams$Ideal r0 = r3.ideal
            if (r0 == 0) goto L_0x0012
            java.util.Map r0 = r0.toParamMap()
            goto L_0x0064
        L_0x004a:
            com.stripe.android.model.PaymentMethodCreateParams$Card r0 = r3.card
            if (r0 == 0) goto L_0x0012
            java.util.Map r0 = r0.toParamMap()
            goto L_0x0064
        L_0x0053:
            com.stripe.android.model.PaymentMethodCreateParams$Netbanking r0 = r3.netbanking
            if (r0 == 0) goto L_0x0012
            java.util.Map r0 = r0.toParamMap()
            goto L_0x0064
        L_0x005c:
            com.stripe.android.model.PaymentMethodCreateParams$Upi r0 = r3.upi
            if (r0 == 0) goto L_0x0012
            java.util.Map r0 = r0.toParamMap()
        L_0x0064:
            if (r0 == 0) goto L_0x006f
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x006d
            goto L_0x006f
        L_0x006d:
            r1 = 0
            goto L_0x0070
        L_0x006f:
            r1 = 1
        L_0x0070:
            if (r1 != 0) goto L_0x0073
            goto L_0x0074
        L_0x0073:
            r0 = r2
        L_0x0074:
            if (r0 == 0) goto L_0x0085
            com.stripe.android.model.PaymentMethodCreateParams$Type r1 = r3.type
            java.lang.String r1 = r1.getCode$payments_core_release()
            kotlin.Pair r2 = new kotlin.Pair
            r2.<init>(r1, r0)
            java.util.Map r2 = i0.j.f.p.h.S2(r2)
        L_0x0085:
            if (r2 == 0) goto L_0x0088
            goto L_0x008c
        L_0x0088:
            java.util.Map r2 = m0.j.g.o()
        L_0x008c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.PaymentMethodCreateParams.getTypeParams():java.util.Map");
    }

    public final Type component1$payments_core_release() {
        return this.type;
    }

    public final PaymentMethod.BillingDetails component11$payments_core_release() {
        return this.billingDetails;
    }

    public final Card component2$payments_core_release() {
        return this.card;
    }

    public final PaymentMethodCreateParams copy(Type type2, Card card2, Ideal ideal2, Fpx fpx2, SepaDebit sepaDebit2, AuBecsDebit auBecsDebit2, BacsDebit bacsDebit2, Sofort sofort2, Upi upi2, Netbanking netbanking2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map, Set<String> set) {
        Type type3 = type2;
        i.e(type3, "type");
        Set<String> set2 = set;
        i.e(set2, "productUsage");
        return new PaymentMethodCreateParams(type3, card2, ideal2, fpx2, sepaDebit2, auBecsDebit2, bacsDebit2, sofort2, upi2, netbanking2, billingDetails2, map, set2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethodCreateParams)) {
            return false;
        }
        PaymentMethodCreateParams paymentMethodCreateParams = (PaymentMethodCreateParams) obj;
        return i.a(this.type, paymentMethodCreateParams.type) && i.a(this.card, paymentMethodCreateParams.card) && i.a(this.ideal, paymentMethodCreateParams.ideal) && i.a(this.fpx, paymentMethodCreateParams.fpx) && i.a(this.sepaDebit, paymentMethodCreateParams.sepaDebit) && i.a(this.auBecsDebit, paymentMethodCreateParams.auBecsDebit) && i.a(this.bacsDebit, paymentMethodCreateParams.bacsDebit) && i.a(this.sofort, paymentMethodCreateParams.sofort) && i.a(this.upi, paymentMethodCreateParams.upi) && i.a(this.netbanking, paymentMethodCreateParams.netbanking) && i.a(this.billingDetails, paymentMethodCreateParams.billingDetails) && i.a(this.metadata, paymentMethodCreateParams.metadata) && i.a(this.productUsage, paymentMethodCreateParams.productUsage);
    }

    public final /* synthetic */ Set<String> getAttribution$payments_core_release() {
        Set<String> attribution$payments_core_release;
        if (this.type.ordinal() != 0) {
            Set<String> set = this.productUsage;
            if (!set.isEmpty()) {
                return set;
            }
            return null;
        }
        Card card2 = this.card;
        if (card2 == null || (attribution$payments_core_release = card2.getAttribution$payments_core_release()) == null) {
            return null;
        }
        return g.d0(attribution$payments_core_release, this.productUsage);
    }

    public final PaymentMethod.BillingDetails getBillingDetails$payments_core_release() {
        return this.billingDetails;
    }

    public final Card getCard$payments_core_release() {
        return this.card;
    }

    public final Type getType$payments_core_release() {
        return this.type;
    }

    public final String getTypeCode() {
        return this.type.getCode$payments_core_release();
    }

    public int hashCode() {
        Type type2 = this.type;
        int i = 0;
        int hashCode = (type2 != null ? type2.hashCode() : 0) * 31;
        Card card2 = this.card;
        int hashCode2 = (hashCode + (card2 != null ? card2.hashCode() : 0)) * 31;
        Ideal ideal2 = this.ideal;
        int hashCode3 = (hashCode2 + (ideal2 != null ? ideal2.hashCode() : 0)) * 31;
        Fpx fpx2 = this.fpx;
        int hashCode4 = (hashCode3 + (fpx2 != null ? fpx2.hashCode() : 0)) * 31;
        SepaDebit sepaDebit2 = this.sepaDebit;
        int hashCode5 = (hashCode4 + (sepaDebit2 != null ? sepaDebit2.hashCode() : 0)) * 31;
        AuBecsDebit auBecsDebit2 = this.auBecsDebit;
        int hashCode6 = (hashCode5 + (auBecsDebit2 != null ? auBecsDebit2.hashCode() : 0)) * 31;
        BacsDebit bacsDebit2 = this.bacsDebit;
        int hashCode7 = (hashCode6 + (bacsDebit2 != null ? bacsDebit2.hashCode() : 0)) * 31;
        Sofort sofort2 = this.sofort;
        int hashCode8 = (hashCode7 + (sofort2 != null ? sofort2.hashCode() : 0)) * 31;
        Upi upi2 = this.upi;
        int hashCode9 = (hashCode8 + (upi2 != null ? upi2.hashCode() : 0)) * 31;
        Netbanking netbanking2 = this.netbanking;
        int hashCode10 = (hashCode9 + (netbanking2 != null ? netbanking2.hashCode() : 0)) * 31;
        PaymentMethod.BillingDetails billingDetails2 = this.billingDetails;
        int hashCode11 = (hashCode10 + (billingDetails2 != null ? billingDetails2.hashCode() : 0)) * 31;
        Map<String, String> map = this.metadata;
        int hashCode12 = (hashCode11 + (map != null ? map.hashCode() : 0)) * 31;
        Set<String> set = this.productUsage;
        if (set != null) {
            i = set.hashCode();
        }
        return hashCode12 + i;
    }

    public Map<String, Object> toParamMap() {
        Map S2 = h.S2(new Pair("type", this.type.getCode$payments_core_release()));
        PaymentMethod.BillingDetails billingDetails2 = this.billingDetails;
        Map map = null;
        Map S22 = billingDetails2 != null ? h.S2(new Pair(PARAM_BILLING_DETAILS, billingDetails2.toParamMap())) : null;
        if (S22 == null) {
            S22 = g.o();
        }
        Map<String, Object> b0 = g.b0(g.b0(S2, S22), getTypeParams());
        Map<String, String> map2 = this.metadata;
        if (map2 != null) {
            map = h.S2(new Pair(PARAM_METADATA, map2));
        }
        if (map == null) {
            map = g.o();
        }
        return g.b0(b0, map);
    }

    public String toString() {
        StringBuilder P0 = a.P0("PaymentMethodCreateParams(type=");
        P0.append(this.type);
        P0.append(", card=");
        P0.append(this.card);
        P0.append(", ideal=");
        P0.append(this.ideal);
        P0.append(", fpx=");
        P0.append(this.fpx);
        P0.append(", sepaDebit=");
        P0.append(this.sepaDebit);
        P0.append(", auBecsDebit=");
        P0.append(this.auBecsDebit);
        P0.append(", bacsDebit=");
        P0.append(this.bacsDebit);
        P0.append(", sofort=");
        P0.append(this.sofort);
        P0.append(", upi=");
        P0.append(this.upi);
        P0.append(", netbanking=");
        P0.append(this.netbanking);
        P0.append(", billingDetails=");
        P0.append(this.billingDetails);
        P0.append(", metadata=");
        P0.append(this.metadata);
        P0.append(", productUsage=");
        P0.append(this.productUsage);
        P0.append(")");
        return P0.toString();
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [java.util.Map$Entry, java.lang.Object] */
    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.type.name());
        Card card2 = this.card;
        if (card2 != null) {
            parcel.writeInt(1);
            card2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Ideal ideal2 = this.ideal;
        if (ideal2 != null) {
            parcel.writeInt(1);
            ideal2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Fpx fpx2 = this.fpx;
        if (fpx2 != null) {
            parcel.writeInt(1);
            fpx2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        SepaDebit sepaDebit2 = this.sepaDebit;
        if (sepaDebit2 != null) {
            parcel.writeInt(1);
            sepaDebit2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        AuBecsDebit auBecsDebit2 = this.auBecsDebit;
        if (auBecsDebit2 != null) {
            parcel.writeInt(1);
            auBecsDebit2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        BacsDebit bacsDebit2 = this.bacsDebit;
        if (bacsDebit2 != null) {
            parcel.writeInt(1);
            bacsDebit2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Sofort sofort2 = this.sofort;
        if (sofort2 != null) {
            parcel.writeInt(1);
            sofort2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Upi upi2 = this.upi;
        if (upi2 != null) {
            parcel.writeInt(1);
            upi2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Netbanking netbanking2 = this.netbanking;
        if (netbanking2 != null) {
            parcel.writeInt(1);
            netbanking2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        PaymentMethod.BillingDetails billingDetails2 = this.billingDetails;
        if (billingDetails2 != null) {
            parcel.writeInt(1);
            billingDetails2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        Map<String, String> map = this.metadata;
        if (map != null) {
            Iterator l1 = a.l1(parcel, 1, map);
            while (l1.hasNext()) {
                ? next = l1.next();
                parcel.writeString((String) next.getKey());
                parcel.writeString((String) next.getValue());
            }
        } else {
            parcel.writeInt(0);
        }
        Set<String> set = this.productUsage;
        parcel.writeInt(set.size());
        for (String writeString : set) {
            parcel.writeString(writeString);
        }
    }

    public /* synthetic */ PaymentMethodCreateParams(BacsDebit bacsDebit2, PaymentMethod.BillingDetails billingDetails2, Map map, f fVar) {
        this(bacsDebit2, billingDetails2, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Card card2, PaymentMethod.BillingDetails billingDetails2, Map map, f fVar) {
        this(card2, billingDetails2, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Fpx fpx2, PaymentMethod.BillingDetails billingDetails2, Map map, f fVar) {
        this(fpx2, billingDetails2, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Ideal ideal2, PaymentMethod.BillingDetails billingDetails2, Map map, f fVar) {
        this(ideal2, billingDetails2, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Netbanking netbanking2, PaymentMethod.BillingDetails billingDetails2, Map map, f fVar) {
        this(netbanking2, billingDetails2, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(SepaDebit sepaDebit2, PaymentMethod.BillingDetails billingDetails2, Map map, f fVar) {
        this(sepaDebit2, billingDetails2, (Map<String, String>) map);
    }

    public /* synthetic */ PaymentMethodCreateParams(Sofort sofort2, PaymentMethod.BillingDetails billingDetails2, Map map, f fVar) {
        this(sofort2, billingDetails2, (Map<String, String>) map);
    }

    public PaymentMethodCreateParams(Type type2, Card card2, Ideal ideal2, Fpx fpx2, SepaDebit sepaDebit2, AuBecsDebit auBecsDebit2, BacsDebit bacsDebit2, Sofort sofort2, Upi upi2, Netbanking netbanking2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map, Set<String> set) {
        i.e(type2, "type");
        i.e(set, "productUsage");
        this.type = type2;
        this.card = card2;
        this.ideal = ideal2;
        this.fpx = fpx2;
        this.sepaDebit = sepaDebit2;
        this.auBecsDebit = auBecsDebit2;
        this.bacsDebit = bacsDebit2;
        this.sofort = sofort2;
        this.upi = upi2;
        this.netbanking = netbanking2;
        this.billingDetails = billingDetails2;
        this.metadata = map;
        this.productUsage = set;
    }

    public /* synthetic */ PaymentMethodCreateParams(Upi upi2, PaymentMethod.BillingDetails billingDetails2, Map map, f fVar) {
        this(upi2, billingDetails2, (Map<String, String>) map);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PaymentMethodCreateParams(com.stripe.android.model.PaymentMethodCreateParams.Type r14, com.stripe.android.model.PaymentMethodCreateParams.Card r15, com.stripe.android.model.PaymentMethodCreateParams.Ideal r16, com.stripe.android.model.PaymentMethodCreateParams.Fpx r17, com.stripe.android.model.PaymentMethodCreateParams.SepaDebit r18, com.stripe.android.model.PaymentMethodCreateParams.AuBecsDebit r19, com.stripe.android.model.PaymentMethodCreateParams.BacsDebit r20, com.stripe.android.model.PaymentMethodCreateParams.Sofort r21, com.stripe.android.model.PaymentMethodCreateParams.Upi r22, com.stripe.android.model.PaymentMethodCreateParams.Netbanking r23, com.stripe.android.model.PaymentMethod.BillingDetails r24, java.util.Map r25, java.util.Set r26, int r27, m0.n.b.f r28) {
        /*
            r13 = this;
            r0 = r27
            r1 = r0 & 2
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r1 = r2
            goto L_0x000a
        L_0x0009:
            r1 = r15
        L_0x000a:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x0010
            r3 = r2
            goto L_0x0012
        L_0x0010:
            r3 = r16
        L_0x0012:
            r4 = r0 & 8
            if (r4 == 0) goto L_0x0018
            r4 = r2
            goto L_0x001a
        L_0x0018:
            r4 = r17
        L_0x001a:
            r5 = r0 & 16
            if (r5 == 0) goto L_0x0020
            r5 = r2
            goto L_0x0022
        L_0x0020:
            r5 = r18
        L_0x0022:
            r6 = r0 & 32
            if (r6 == 0) goto L_0x0028
            r6 = r2
            goto L_0x002a
        L_0x0028:
            r6 = r19
        L_0x002a:
            r7 = r0 & 64
            if (r7 == 0) goto L_0x0030
            r7 = r2
            goto L_0x0032
        L_0x0030:
            r7 = r20
        L_0x0032:
            r8 = r0 & 128(0x80, float:1.794E-43)
            if (r8 == 0) goto L_0x0038
            r8 = r2
            goto L_0x003a
        L_0x0038:
            r8 = r21
        L_0x003a:
            r9 = r0 & 256(0x100, float:3.59E-43)
            if (r9 == 0) goto L_0x0040
            r9 = r2
            goto L_0x0042
        L_0x0040:
            r9 = r22
        L_0x0042:
            r10 = r0 & 512(0x200, float:7.175E-43)
            if (r10 == 0) goto L_0x0048
            r10 = r2
            goto L_0x004a
        L_0x0048:
            r10 = r23
        L_0x004a:
            r11 = r0 & 1024(0x400, float:1.435E-42)
            if (r11 == 0) goto L_0x0050
            r11 = r2
            goto L_0x0052
        L_0x0050:
            r11 = r24
        L_0x0052:
            r12 = r0 & 2048(0x800, float:2.87E-42)
            if (r12 == 0) goto L_0x0057
            goto L_0x0059
        L_0x0057:
            r2 = r25
        L_0x0059:
            r0 = r0 & 4096(0x1000, float:5.74E-42)
            if (r0 == 0) goto L_0x0060
            kotlin.collections.EmptySet r0 = kotlin.collections.EmptySet.c
            goto L_0x0062
        L_0x0060:
            r0 = r26
        L_0x0062:
            r15 = r13
            r16 = r14
            r17 = r1
            r18 = r3
            r19 = r4
            r20 = r5
            r21 = r6
            r22 = r7
            r23 = r8
            r24 = r9
            r25 = r10
            r26 = r11
            r27 = r2
            r28 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.PaymentMethodCreateParams.<init>(com.stripe.android.model.PaymentMethodCreateParams$Type, com.stripe.android.model.PaymentMethodCreateParams$Card, com.stripe.android.model.PaymentMethodCreateParams$Ideal, com.stripe.android.model.PaymentMethodCreateParams$Fpx, com.stripe.android.model.PaymentMethodCreateParams$SepaDebit, com.stripe.android.model.PaymentMethodCreateParams$AuBecsDebit, com.stripe.android.model.PaymentMethodCreateParams$BacsDebit, com.stripe.android.model.PaymentMethodCreateParams$Sofort, com.stripe.android.model.PaymentMethodCreateParams$Upi, com.stripe.android.model.PaymentMethodCreateParams$Netbanking, com.stripe.android.model.PaymentMethod$BillingDetails, java.util.Map, java.util.Set, int, m0.n.b.f):void");
    }

    private PaymentMethodCreateParams(Card card2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        this(Type.Card, card2, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails2, map, (Set) null, 5116, (f) null);
    }

    private PaymentMethodCreateParams(Ideal ideal2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        this(Type.Ideal, (Card) null, ideal2, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails2, map, (Set) null, 5114, (f) null);
    }

    private PaymentMethodCreateParams(Fpx fpx2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        this(Type.Fpx, (Card) null, (Ideal) null, fpx2, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails2, map, (Set) null, 5110, (f) null);
    }

    private PaymentMethodCreateParams(SepaDebit sepaDebit2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        this(Type.SepaDebit, (Card) null, (Ideal) null, (Fpx) null, sepaDebit2, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails2, map, (Set) null, 5102, (f) null);
    }

    private PaymentMethodCreateParams(AuBecsDebit auBecsDebit2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        this(Type.AuBecsDebit, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, auBecsDebit2, (BacsDebit) null, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails2, map, (Set) null, 5086, (f) null);
    }

    private PaymentMethodCreateParams(BacsDebit bacsDebit2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        this(Type.BacsDebit, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, bacsDebit2, (Sofort) null, (Upi) null, (Netbanking) null, billingDetails2, map, (Set) null, 5054, (f) null);
    }

    private PaymentMethodCreateParams(Sofort sofort2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        this(Type.Sofort, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, sofort2, (Upi) null, (Netbanking) null, billingDetails2, map, (Set) null, 4990, (f) null);
    }

    private PaymentMethodCreateParams(Upi upi2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        this(Type.Upi, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, upi2, (Netbanking) null, billingDetails2, map, (Set) null, 4862, (f) null);
    }

    private PaymentMethodCreateParams(Netbanking netbanking2, PaymentMethod.BillingDetails billingDetails2, Map<String, String> map) {
        this(Type.Netbanking, (Card) null, (Ideal) null, (Fpx) null, (SepaDebit) null, (AuBecsDebit) null, (BacsDebit) null, (Sofort) null, (Upi) null, netbanking2, billingDetails2, map, (Set) null, 4606, (f) null);
    }
}
