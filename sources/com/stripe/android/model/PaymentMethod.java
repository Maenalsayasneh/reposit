package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.model.parsers.AccountRangeJsonParser;
import com.stripe.android.model.parsers.PaymentMethodJsonParser;
import com.stripe.android.model.wallets.Wallet;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b%\b\b\u0018\u0000 i2\u00020\u0001:\u000ejklmnoipqrstuvB×\u0001\b\u0000\u0012\b\u00103\u001a\u0004\u0018\u00010\u0002\u0012\b\u00104\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u00105\u001a\u00020\b\u0012\b\u00106\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0002\u0012\u0016\b\u0002\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001e\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010@\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u000100¢\u0006\u0004\bg\u0010hJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0004J\u001e\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\b%\u0010&J\u0012\u0010(\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010+\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010.\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0004\b.\u0010/J\u0012\u00101\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0004\b1\u00102Jæ\u0001\u0010D\u001a\u00020\u00002\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u00105\u001a\u00020\b2\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00022\u0016\b\u0002\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00122\n\b\u0002\u0010:\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010\u001e2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010@\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010-2\n\b\u0002\u0010C\u001a\u0004\u0018\u000100HÆ\u0001¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bF\u0010\u0004J\u0010\u0010H\u001a\u00020GHÖ\u0001¢\u0006\u0004\bH\u0010IJ\u001a\u0010L\u001a\u00020\b2\b\u0010K\u001a\u0004\u0018\u00010JHÖ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020GHÖ\u0001¢\u0006\u0004\bN\u0010IJ \u0010S\u001a\u00020R2\u0006\u0010P\u001a\u00020O2\u0006\u0010Q\u001a\u00020GHÖ\u0001¢\u0006\u0004\bS\u0010TR\u0018\u0010B\u001a\u0004\u0018\u00010-8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bB\u0010UR\u0018\u00103\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b3\u0010VR\u0018\u00106\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b6\u0010WR\u0018\u0010<\u001a\u0004\u0018\u00010\u001b8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b<\u0010XR\u0018\u0010A\u001a\u0004\u0018\u00010*8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bA\u0010YR*\u00109\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00128\u0006@\u0007X\u0004¢\u0006\f\n\u0004\b9\u0010Z\u0012\u0004\b[\u0010\\R\u0018\u0010>\u001a\u0004\u0018\u00010!8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b>\u0010]R\u0018\u00108\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b8\u0010VR\u0016\u00105\u001a\u00020\b8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b5\u0010^R\u0018\u0010@\u001a\u0004\u0018\u00010'8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b@\u0010_R\u0018\u0010;\u001a\u0004\u0018\u00010\u00188\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b;\u0010`R\u0018\u00104\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b4\u0010aR\u0018\u0010:\u001a\u0004\u0018\u00010\u00158\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b:\u0010bR\u0018\u0010?\u001a\u0004\u0018\u00010$8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b?\u0010cR\u0018\u0010C\u001a\u0004\u0018\u0001008\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\bC\u0010dR\u0018\u00107\u001a\u0004\u0018\u00010\u000e8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b7\u0010eR\u0018\u0010=\u001a\u0004\u0018\u00010\u001e8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b=\u0010f¨\u0006w"}, d2 = {"Lcom/stripe/android/model/PaymentMethod;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "", "component2", "()Ljava/lang/Long;", "", "component3", "()Z", "Lcom/stripe/android/model/PaymentMethod$Type;", "component4", "()Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "component5", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "component6", "", "component7", "()Ljava/util/Map;", "Lcom/stripe/android/model/PaymentMethod$Card;", "component8", "()Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "component9", "()Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "component10", "()Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "component11", "()Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "component12", "()Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "component13", "()Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "component14", "()Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "component15", "()Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "component16", "()Lcom/stripe/android/model/PaymentMethod$Upi;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "component17", "()Lcom/stripe/android/model/PaymentMethod$Netbanking;", "id", "created", "liveMode", "type", "billingDetails", "customerId", "metadata", "card", "cardPresent", "fpx", "ideal", "sepaDebit", "auBecsDebit", "bacsDebit", "sofort", "upi", "netbanking", "copy", "(Ljava/lang/String;Ljava/lang/Long;ZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$CardPresent;Lcom/stripe/android/model/PaymentMethod$Fpx;Lcom/stripe/android/model/PaymentMethod$Ideal;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BacsDebit;Lcom/stripe/android/model/PaymentMethod$Sofort;Lcom/stripe/android/model/PaymentMethod$Upi;Lcom/stripe/android/model/PaymentMethod$Netbanking;)Lcom/stripe/android/model/PaymentMethod;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/PaymentMethod$Upi;", "Ljava/lang/String;", "Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "Ljava/util/Map;", "getMetadata$annotations", "()V", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Z", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Ljava/lang/Long;", "Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "<init>", "(Ljava/lang/String;Ljava/lang/Long;ZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/model/PaymentMethod$BillingDetails;Ljava/lang/String;Ljava/util/Map;Lcom/stripe/android/model/PaymentMethod$Card;Lcom/stripe/android/model/PaymentMethod$CardPresent;Lcom/stripe/android/model/PaymentMethod$Fpx;Lcom/stripe/android/model/PaymentMethod$Ideal;Lcom/stripe/android/model/PaymentMethod$SepaDebit;Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;Lcom/stripe/android/model/PaymentMethod$BacsDebit;Lcom/stripe/android/model/PaymentMethod$Sofort;Lcom/stripe/android/model/PaymentMethod$Upi;Lcom/stripe/android/model/PaymentMethod$Netbanking;)V", "Companion", "AuBecsDebit", "BacsDebit", "BillingDetails", "Builder", "Card", "CardPresent", "Fpx", "Ideal", "Netbanking", "SepaDebit", "Sofort", "Type", "Upi", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethod.kt */
public final class PaymentMethod implements StripeModel {
    public static final Parcelable.Creator<PaymentMethod> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    public final AuBecsDebit auBecsDebit;
    public final BacsDebit bacsDebit;
    public final BillingDetails billingDetails;
    public final Card card;
    public final CardPresent cardPresent;
    public final Long created;
    public final String customerId;
    public final Fpx fpx;
    public final String id;
    public final Ideal ideal;
    public final boolean liveMode;
    public final Map<String, String> metadata;
    public final Netbanking netbanking;
    public final SepaDebit sepaDebit;
    public final Sofort sofort;
    public final Type type;
    public final Upi upi;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B'\b\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J4\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "bsbNumber", "fingerprint", "last4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public static final class AuBecsDebit implements StripeModel {
        public static final Parcelable.Creator<AuBecsDebit> CREATOR = new Creator();
        public final String bsbNumber;
        public final String fingerprint;
        public final String last4;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<AuBecsDebit> {
            public final AuBecsDebit createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new AuBecsDebit(parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final AuBecsDebit[] newArray(int i) {
                return new AuBecsDebit[i];
            }
        }

        public AuBecsDebit(String str, String str2, String str3) {
            this.bsbNumber = str;
            this.fingerprint = str2;
            this.last4 = str3;
        }

        public static /* synthetic */ AuBecsDebit copy$default(AuBecsDebit auBecsDebit, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = auBecsDebit.bsbNumber;
            }
            if ((i & 2) != 0) {
                str2 = auBecsDebit.fingerprint;
            }
            if ((i & 4) != 0) {
                str3 = auBecsDebit.last4;
            }
            return auBecsDebit.copy(str, str2, str3);
        }

        public final String component1() {
            return this.bsbNumber;
        }

        public final String component2() {
            return this.fingerprint;
        }

        public final String component3() {
            return this.last4;
        }

        public final AuBecsDebit copy(String str, String str2, String str3) {
            return new AuBecsDebit(str, str2, str3);
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
            return i.a(this.bsbNumber, auBecsDebit.bsbNumber) && i.a(this.fingerprint, auBecsDebit.fingerprint) && i.a(this.last4, auBecsDebit.last4);
        }

        public int hashCode() {
            String str = this.bsbNumber;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.fingerprint;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.last4;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("AuBecsDebit(bsbNumber=");
            P0.append(this.bsbNumber);
            P0.append(", fingerprint=");
            P0.append(this.fingerprint);
            P0.append(", last4=");
            return a.y0(P0, this.last4, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.bsbNumber);
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B'\b\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J4\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001cR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "fingerprint", "last4", "sortCode", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public static final class BacsDebit implements StripeModel {
        public static final Parcelable.Creator<BacsDebit> CREATOR = new Creator();
        public final String fingerprint;
        public final String last4;
        public final String sortCode;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<BacsDebit> {
            public final BacsDebit createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new BacsDebit(parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final BacsDebit[] newArray(int i) {
                return new BacsDebit[i];
            }
        }

        public BacsDebit(String str, String str2, String str3) {
            this.fingerprint = str;
            this.last4 = str2;
            this.sortCode = str3;
        }

        public static /* synthetic */ BacsDebit copy$default(BacsDebit bacsDebit, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = bacsDebit.fingerprint;
            }
            if ((i & 2) != 0) {
                str2 = bacsDebit.last4;
            }
            if ((i & 4) != 0) {
                str3 = bacsDebit.sortCode;
            }
            return bacsDebit.copy(str, str2, str3);
        }

        public final String component1() {
            return this.fingerprint;
        }

        public final String component2() {
            return this.last4;
        }

        public final String component3() {
            return this.sortCode;
        }

        public final BacsDebit copy(String str, String str2, String str3) {
            return new BacsDebit(str, str2, str3);
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
            return i.a(this.fingerprint, bacsDebit.fingerprint) && i.a(this.last4, bacsDebit.last4) && i.a(this.sortCode, bacsDebit.sortCode);
        }

        public int hashCode() {
            String str = this.fingerprint;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.last4;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.sortCode;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode2 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("BacsDebit(fingerprint=");
            P0.append(this.fingerprint);
            P0.append(", last4=");
            P0.append(this.last4);
            P0.append(", sortCode=");
            return a.y0(P0, this.sortCode, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
            parcel.writeString(this.sortCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 +2\u00020\u00012\u00020\u0002:\u0002,+B9\b\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b)\u0010*J\r\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ@\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b \u0010\u001bJ \u0010%\u001a\u00020$2\u0006\u0010\"\u001a\u00020!2\u0006\u0010#\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010'R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010(R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010'R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010'¨\u0006-"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/StripeParamsModel;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "toBuilder", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "", "", "", "toParamMap", "()Ljava/util/Map;", "Lcom/stripe/android/model/Address;", "component1", "()Lcom/stripe/android/model/Address;", "component2", "()Ljava/lang/String;", "component3", "component4", "address", "email", "name", "phone", "copy", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "Lcom/stripe/android/model/Address;", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public static final class BillingDetails implements StripeModel, StripeParamsModel {
        public static final Parcelable.Creator<BillingDetails> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        public static final String PARAM_ADDRESS = "address";
        public static final String PARAM_EMAIL = "email";
        public static final String PARAM_NAME = "name";
        public static final String PARAM_PHONE = "phone";
        public final Address address;
        public final String email;
        public final String name;
        public final String phone;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u000e\u001a\u00020\u00002\b\u0010\r\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\r\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u0011R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\u0012R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010\u0011¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Lcom/stripe/android/model/Address;", "address", "setAddress", "(Lcom/stripe/android/model/Address;)Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "", "email", "setEmail", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$BillingDetails$Builder;", "name", "setName", "phone", "setPhone", "build", "()Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Ljava/lang/String;", "Lcom/stripe/android/model/Address;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethod.kt */
        public static final class Builder implements ObjectBuilder<BillingDetails> {
            private Address address;
            private String email;
            private String name;
            private String phone;

            public final Builder setAddress(Address address2) {
                this.address = address2;
                return this;
            }

            public final Builder setEmail(String str) {
                this.email = str;
                return this;
            }

            public final Builder setName(String str) {
                this.name = str;
                return this;
            }

            public final Builder setPhone(String str) {
                this.phone = str;
                return this;
            }

            public BillingDetails build() {
                return new BillingDetails(this.address, this.email, this.name, this.phone);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0016\u0010\n\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0016\u0010\u000b\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0016\u0010\f\u001a\u00020\u00078\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\t¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$BillingDetails$Companion;", "", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "create", "(Lcom/stripe/android/model/ShippingInformation;)Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "", "PARAM_ADDRESS", "Ljava/lang/String;", "PARAM_EMAIL", "PARAM_NAME", "PARAM_PHONE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethod.kt */
        public static final class Companion {
            private Companion() {
            }

            public final BillingDetails create(ShippingInformation shippingInformation) {
                i.e(shippingInformation, "shippingInformation");
                return new BillingDetails(shippingInformation.getAddress(), (String) null, shippingInformation.getName(), shippingInformation.getPhone(), 2, (f) null);
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<BillingDetails> {
            public final BillingDetails createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new BillingDetails(parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final BillingDetails[] newArray(int i) {
                return new BillingDetails[i];
            }
        }

        public BillingDetails() {
            this((Address) null, (String) null, (String) null, (String) null, 15, (f) null);
        }

        public BillingDetails(Address address2) {
            this(address2, (String) null, (String) null, (String) null, 14, (f) null);
        }

        public BillingDetails(Address address2, String str) {
            this(address2, str, (String) null, (String) null, 12, (f) null);
        }

        public BillingDetails(Address address2, String str, String str2) {
            this(address2, str, str2, (String) null, 8, (f) null);
        }

        public BillingDetails(Address address2, String str, String str2, String str3) {
            this.address = address2;
            this.email = str;
            this.name = str2;
            this.phone = str3;
        }

        public static /* synthetic */ BillingDetails copy$default(BillingDetails billingDetails, Address address2, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                address2 = billingDetails.address;
            }
            if ((i & 2) != 0) {
                str = billingDetails.email;
            }
            if ((i & 4) != 0) {
                str2 = billingDetails.name;
            }
            if ((i & 8) != 0) {
                str3 = billingDetails.phone;
            }
            return billingDetails.copy(address2, str, str2, str3);
        }

        public final Address component1() {
            return this.address;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final String component4() {
            return this.phone;
        }

        public final BillingDetails copy(Address address2, String str, String str2, String str3) {
            return new BillingDetails(address2, str, str2, str3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BillingDetails)) {
                return false;
            }
            BillingDetails billingDetails = (BillingDetails) obj;
            return i.a(this.address, billingDetails.address) && i.a(this.email, billingDetails.email) && i.a(this.name, billingDetails.name) && i.a(this.phone, billingDetails.phone);
        }

        public int hashCode() {
            Address address2 = this.address;
            int i = 0;
            int hashCode = (address2 != null ? address2.hashCode() : 0) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.phone;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode3 + i;
        }

        public final Builder toBuilder() {
            return new Builder().setAddress(this.address).setEmail(this.email).setName(this.name).setPhone(this.phone);
        }

        public Map<String, Object> toParamMap() {
            Map o = g.o();
            Address address2 = this.address;
            Map map = null;
            Map S2 = address2 != null ? h.S2(new Pair(PARAM_ADDRESS, address2.toParamMap())) : null;
            if (S2 == null) {
                S2 = g.o();
            }
            Map b0 = g.b0(o, S2);
            String str = this.email;
            Map S22 = str != null ? h.S2(new Pair("email", str)) : null;
            if (S22 == null) {
                S22 = g.o();
            }
            Map b02 = g.b0(b0, S22);
            String str2 = this.name;
            Map S23 = str2 != null ? h.S2(new Pair("name", str2)) : null;
            if (S23 == null) {
                S23 = g.o();
            }
            Map b03 = g.b0(b02, S23);
            String str3 = this.phone;
            if (str3 != null) {
                map = h.S2(new Pair(PARAM_PHONE, str3));
            }
            if (map == null) {
                map = g.o();
            }
            return g.b0(b03, map);
        }

        public String toString() {
            StringBuilder P0 = a.P0("BillingDetails(address=");
            P0.append(this.address);
            P0.append(", email=");
            P0.append(this.email);
            P0.append(", name=");
            P0.append(this.name);
            P0.append(", phone=");
            return a.y0(P0, this.phone, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            Address address2 = this.address;
            if (address2 != null) {
                parcel.writeInt(1);
                address2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            parcel.writeString(this.phone);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BillingDetails(Address address2, String str, String str2, String str3, int i, f fVar) {
            this((i & 1) != 0 ? null : address2, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0018\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bW\u0010XJ\u0017\u0010\u0005\u001a\u00020\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0011\u001a\u00020\u00002\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00002\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00002\b\u0010#\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b$\u0010\u0006J\u0017\u0010'\u001a\u00020\u00002\b\u0010&\u001a\u0004\u0018\u00010%¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020\u00002\b\u0010*\u001a\u0004\u0018\u00010)¢\u0006\u0004\b+\u0010,J\u0017\u0010/\u001a\u00020\u00002\b\u0010.\u001a\u0004\u0018\u00010-¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u00002\b\u00102\u001a\u0004\u0018\u000101¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\u00002\b\u00106\u001a\u0004\u0018\u000105¢\u0006\u0004\b7\u00108J\u0017\u0010;\u001a\u00020\u00002\b\u0010:\u001a\u0004\u0018\u000109¢\u0006\u0004\b;\u0010<J\u0017\u0010?\u001a\u00020\u00002\b\u0010>\u001a\u0004\u0018\u00010=¢\u0006\u0004\b?\u0010@J\u0017\u0010C\u001a\u00020\u00002\b\u0010B\u001a\u0004\u0018\u00010A¢\u0006\u0004\bC\u0010DJ\u000f\u0010E\u001a\u00020\u0002H\u0016¢\u0006\u0004\bE\u0010FR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010GR\u0018\u0010>\u001a\u0004\u0018\u00010=8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b>\u0010HR\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010IR\u0018\u00106\u001a\u0004\u0018\u0001058\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b6\u0010JR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010KR\u0018\u0010:\u001a\u0004\u0018\u0001098\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b:\u0010LR\u0018\u0010*\u001a\u0004\u0018\u00010)8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b*\u0010MR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010NR\u0018\u0010#\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010OR\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010PR\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010QR\u0018\u0010.\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010RR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010OR\u0018\u00102\u001a\u0004\u0018\u0001018\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b2\u0010SR$\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010TR\u0018\u0010B\u001a\u0004\u0018\u00010A8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010UR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010V¨\u0006Y"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PaymentMethod;", "", "id", "setId", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Builder;", "", "created", "setCreated", "(Ljava/lang/Long;)Lcom/stripe/android/model/PaymentMethod$Builder;", "", "liveMode", "setLiveMode", "(Z)Lcom/stripe/android/model/PaymentMethod$Builder;", "", "metadata", "setMetadata", "(Ljava/util/Map;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$Type;", "type", "setType", "(Lcom/stripe/android/model/PaymentMethod$Type;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "billingDetails", "setBillingDetails", "(Lcom/stripe/android/model/PaymentMethod$BillingDetails;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$Card;", "card", "setCard", "(Lcom/stripe/android/model/PaymentMethod$Card;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "cardPresent", "setCardPresent", "(Lcom/stripe/android/model/PaymentMethod$CardPresent;)Lcom/stripe/android/model/PaymentMethod$Builder;", "customerId", "setCustomerId", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "ideal", "setIdeal", "(Lcom/stripe/android/model/PaymentMethod$Ideal;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "fpx", "setFpx", "(Lcom/stripe/android/model/PaymentMethod$Fpx;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "sepaDebit", "setSepaDebit", "(Lcom/stripe/android/model/PaymentMethod$SepaDebit;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "auBecsDebit", "setAuBecsDebit", "(Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "bacsDebit", "setBacsDebit", "(Lcom/stripe/android/model/PaymentMethod$BacsDebit;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "sofort", "setSofort", "(Lcom/stripe/android/model/PaymentMethod$Sofort;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "netbanking", "setNetbanking", "(Lcom/stripe/android/model/PaymentMethod$Netbanking;)Lcom/stripe/android/model/PaymentMethod$Builder;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "upi", "setUpi", "(Lcom/stripe/android/model/PaymentMethod$Upi;)Lcom/stripe/android/model/PaymentMethod$Builder;", "build", "()Lcom/stripe/android/model/PaymentMethod;", "Lcom/stripe/android/model/PaymentMethod$BillingDetails;", "Lcom/stripe/android/model/PaymentMethod$Netbanking;", "Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lcom/stripe/android/model/PaymentMethod$BacsDebit;", "Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lcom/stripe/android/model/PaymentMethod$Fpx;", "Z", "Ljava/lang/String;", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Lcom/stripe/android/model/PaymentMethod$Type;", "Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lcom/stripe/android/model/PaymentMethod$AuBecsDebit;", "Ljava/util/Map;", "Lcom/stripe/android/model/PaymentMethod$Upi;", "Ljava/lang/Long;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public static final class Builder implements ObjectBuilder<PaymentMethod> {
        private AuBecsDebit auBecsDebit;
        private BacsDebit bacsDebit;
        private BillingDetails billingDetails;
        private Card card;
        private CardPresent cardPresent;
        private Long created;
        private String customerId;
        private Fpx fpx;
        private String id;
        private Ideal ideal;
        private boolean liveMode;
        private Map<String, String> metadata;
        private Netbanking netbanking;
        private SepaDebit sepaDebit;
        private Sofort sofort;
        private Type type;
        private Upi upi;

        public final Builder setAuBecsDebit(AuBecsDebit auBecsDebit2) {
            this.auBecsDebit = auBecsDebit2;
            return this;
        }

        public final Builder setBacsDebit(BacsDebit bacsDebit2) {
            this.bacsDebit = bacsDebit2;
            return this;
        }

        public final Builder setBillingDetails(BillingDetails billingDetails2) {
            this.billingDetails = billingDetails2;
            return this;
        }

        public final Builder setCard(Card card2) {
            this.card = card2;
            return this;
        }

        public final Builder setCardPresent(CardPresent cardPresent2) {
            this.cardPresent = cardPresent2;
            return this;
        }

        public final Builder setCreated(Long l) {
            this.created = l;
            return this;
        }

        public final Builder setCustomerId(String str) {
            this.customerId = str;
            return this;
        }

        public final Builder setFpx(Fpx fpx2) {
            this.fpx = fpx2;
            return this;
        }

        public final Builder setId(String str) {
            this.id = str;
            return this;
        }

        public final Builder setIdeal(Ideal ideal2) {
            this.ideal = ideal2;
            return this;
        }

        public final Builder setLiveMode(boolean z) {
            this.liveMode = z;
            return this;
        }

        public final Builder setMetadata(Map<String, String> map) {
            this.metadata = map;
            return this;
        }

        public final Builder setNetbanking(Netbanking netbanking2) {
            this.netbanking = netbanking2;
            return this;
        }

        public final Builder setSepaDebit(SepaDebit sepaDebit2) {
            this.sepaDebit = sepaDebit2;
            return this;
        }

        public final Builder setSofort(Sofort sofort2) {
            this.sofort = sofort2;
            return this;
        }

        public final Builder setType(Type type2) {
            this.type = type2;
            return this;
        }

        public final Builder setUpi(Upi upi2) {
            this.upi = upi2;
            return this;
        }

        public PaymentMethod build() {
            return new PaymentMethod(this.id, this.created, this.liveMode, this.type, this.billingDetails, this.customerId, (Map) null, this.card, this.cardPresent, this.fpx, this.ideal, this.sepaDebit, this.auBecsDebit, this.bacsDebit, this.sofort, (Upi) null, this.netbanking, 32832, (f) null);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u00002\u00020\u0001:\u0004ABCDB\u0001\b\u0000\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b?\u0010@J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000f\u0010\nJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0010\u0010\nJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0011\u0010\nJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0018HÀ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0001\u0010'\u001a\u00020\u00002\b\b\u0002\u0010\u001c\u001a\u00020\u00022\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b)\u0010\nJ\u0010\u0010*\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010/\u001a\u00020.2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b1\u0010+J \u00106\u001a\u0002052\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b6\u00107R\u0018\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u001e\u00108R\u0016\u0010\u001c\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u001c\u00109R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010:R\u0018\u0010\"\u001a\u0004\u0018\u00010\b8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\"\u00108R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010;R\u0018\u0010$\u001a\u0004\u0018\u00010\u00128\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b$\u0010<R\u0018\u0010&\u001a\u0004\u0018\u00010\u00188\u0000@\u0001X\u0004¢\u0006\u0006\n\u0004\b&\u0010=R\u0018\u0010 \u001a\u0004\u0018\u00010\u000b8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b \u0010;R\u0018\u0010#\u001a\u0004\u0018\u00010\b8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b#\u00108R\u0018\u0010%\u001a\u0004\u0018\u00010\u00158\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b%\u0010>R\u0018\u0010!\u001a\u0004\u0018\u00010\b8\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b!\u00108¨\u0006E"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/CardBrand;", "component1", "()Lcom/stripe/android/model/CardBrand;", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "component2", "()Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "", "component3", "()Ljava/lang/String;", "", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "component8", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "component9", "()Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "Lcom/stripe/android/model/wallets/Wallet;", "component10", "()Lcom/stripe/android/model/wallets/Wallet;", "Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "component11$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "component11", "brand", "checks", "country", "expiryMonth", "expiryYear", "fingerprint", "funding", "last4", "threeDSecureUsage", "wallet", "networks", "copy", "(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$Card$Checks;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;Lcom/stripe/android/model/wallets/Wallet;Lcom/stripe/android/model/PaymentMethod$Card$Networks;)Lcom/stripe/android/model/PaymentMethod$Card;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "Lcom/stripe/android/model/CardBrand;", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "Ljava/lang/Integer;", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "Lcom/stripe/android/model/wallets/Wallet;", "<init>", "(Lcom/stripe/android/model/CardBrand;Lcom/stripe/android/model/PaymentMethod$Card$Checks;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;Lcom/stripe/android/model/wallets/Wallet;Lcom/stripe/android/model/PaymentMethod$Card$Networks;)V", "Builder", "Checks", "Networks", "ThreeDSecureUsage", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public static final class Card implements StripeModel {
        public static final Parcelable.Creator<Card> CREATOR = new Creator();
        public final CardBrand brand;
        public final Checks checks;
        public final String country;
        public final Integer expiryMonth;
        public final Integer expiryYear;
        public final String fingerprint;
        public final String funding;
        public final String last4;
        public final Networks networks;
        public final ThreeDSecureUsage threeDSecureUsage;
        public final Wallet wallet;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b+\u0010,J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00002\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0012J\u0017\u0010\u0016\u001a\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0016\u0010\u000eJ\u0017\u0010\u0018\u001a\u00020\u00002\b\u0010\u0017\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\u00002\b\u0010\u0019\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u001a\u0010\u000eJ\u0017\u0010\u001d\u001a\u00020\u00002\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u001f¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010%R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010&R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010'R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010&R\u0018\u0010 \u001a\u0004\u0018\u00010\u001f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010(R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010)R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010*R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010&R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010&¨\u0006-"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/CardBrand;", "brand", "setBrand", "(Lcom/stripe/android/model/CardBrand;)Lcom/stripe/android/model/PaymentMethod$Card$Builder;", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "checks", "setChecks", "(Lcom/stripe/android/model/PaymentMethod$Card$Checks;)Lcom/stripe/android/model/PaymentMethod$Card$Builder;", "", "country", "setCountry", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Card$Builder;", "", "expiryMonth", "setExpiryMonth", "(Ljava/lang/Integer;)Lcom/stripe/android/model/PaymentMethod$Card$Builder;", "expiryYear", "setExpiryYear", "fingerprint", "setFingerprint", "funding", "setFunding", "last4", "setLast4", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "threeDSecureUsage", "setThreeDSecureUsage", "(Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;)Lcom/stripe/android/model/PaymentMethod$Card$Builder;", "Lcom/stripe/android/model/wallets/Wallet;", "wallet", "setWallet", "(Lcom/stripe/android/model/wallets/Wallet;)Lcom/stripe/android/model/PaymentMethod$Card$Builder;", "build", "()Lcom/stripe/android/model/PaymentMethod$Card;", "Lcom/stripe/android/model/CardBrand;", "Ljava/lang/String;", "Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "Lcom/stripe/android/model/wallets/Wallet;", "Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "Ljava/lang/Integer;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethod.kt */
        public static final class Builder implements ObjectBuilder<Card> {
            private CardBrand brand = CardBrand.Unknown;
            private Checks checks;
            private String country;
            private Integer expiryMonth;
            private Integer expiryYear;
            private String fingerprint;
            private String funding;
            private String last4;
            private ThreeDSecureUsage threeDSecureUsage;
            private Wallet wallet;

            public final Builder setBrand(CardBrand cardBrand) {
                i.e(cardBrand, AccountRangeJsonParser.FIELD_BRAND);
                this.brand = cardBrand;
                return this;
            }

            public final Builder setChecks(Checks checks2) {
                this.checks = checks2;
                return this;
            }

            public final Builder setCountry(String str) {
                this.country = str;
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

            public final Builder setFingerprint(String str) {
                this.fingerprint = str;
                return this;
            }

            public final Builder setFunding(String str) {
                this.funding = str;
                return this;
            }

            public final Builder setLast4(String str) {
                this.last4 = str;
                return this;
            }

            public final Builder setThreeDSecureUsage(ThreeDSecureUsage threeDSecureUsage2) {
                this.threeDSecureUsage = threeDSecureUsage2;
                return this;
            }

            public final Builder setWallet(Wallet wallet2) {
                this.wallet = wallet2;
                return this;
            }

            public Card build() {
                return new Card(this.brand, this.checks, this.country, this.expiryMonth, this.expiryYear, this.fingerprint, this.funding, this.last4, this.threeDSecureUsage, this.wallet, (Networks) null, RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, (f) null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B'\b\u0000\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J4\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0004J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u000fJ \u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001c¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "addressLine1Check", "addressPostalCodeCheck", "cvcCheck", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Card$Checks;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethod.kt */
        public static final class Checks implements StripeModel {
            public static final Parcelable.Creator<Checks> CREATOR = new Creator();
            public final String addressLine1Check;
            public final String addressPostalCodeCheck;
            public final String cvcCheck;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<Checks> {
                public final Checks createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new Checks(parcel.readString(), parcel.readString(), parcel.readString());
                }

                public final Checks[] newArray(int i) {
                    return new Checks[i];
                }
            }

            public Checks(String str, String str2, String str3) {
                this.addressLine1Check = str;
                this.addressPostalCodeCheck = str2;
                this.cvcCheck = str3;
            }

            public static /* synthetic */ Checks copy$default(Checks checks, String str, String str2, String str3, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = checks.addressLine1Check;
                }
                if ((i & 2) != 0) {
                    str2 = checks.addressPostalCodeCheck;
                }
                if ((i & 4) != 0) {
                    str3 = checks.cvcCheck;
                }
                return checks.copy(str, str2, str3);
            }

            public final String component1() {
                return this.addressLine1Check;
            }

            public final String component2() {
                return this.addressPostalCodeCheck;
            }

            public final String component3() {
                return this.cvcCheck;
            }

            public final Checks copy(String str, String str2, String str3) {
                return new Checks(str, str2, str3);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Checks)) {
                    return false;
                }
                Checks checks = (Checks) obj;
                return i.a(this.addressLine1Check, checks.addressLine1Check) && i.a(this.addressPostalCodeCheck, checks.addressPostalCodeCheck) && i.a(this.cvcCheck, checks.cvcCheck);
            }

            public int hashCode() {
                String str = this.addressLine1Check;
                int i = 0;
                int hashCode = (str != null ? str.hashCode() : 0) * 31;
                String str2 = this.addressPostalCodeCheck;
                int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
                String str3 = this.cvcCheck;
                if (str3 != null) {
                    i = str3.hashCode();
                }
                return hashCode2 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("Checks(addressLine1Check=");
                P0.append(this.addressLine1Check);
                P0.append(", addressPostalCodeCheck=");
                P0.append(this.addressPostalCodeCheck);
                P0.append(", cvcCheck=");
                return a.y0(P0, this.cvcCheck, ")");
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeString(this.addressLine1Check);
                parcel.writeString(this.addressPostalCodeCheck);
                parcel.writeString(this.cvcCheck);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Card> {
            public final Card createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Card((CardBrand) Enum.valueOf(CardBrand.class, parcel.readString()), parcel.readInt() != 0 ? Checks.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? ThreeDSecureUsage.CREATOR.createFromParcel(parcel) : null, (Wallet) parcel.readParcelable(Card.class.getClassLoader()), parcel.readInt() != 0 ? Networks.CREATOR.createFromParcel(parcel) : null);
            }

            public final Card[] newArray(int i) {
                return new Card[i];
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Z", "isSupported", "copy", "(Z)Lcom/stripe/android/model/PaymentMethod$Card$ThreeDSecureUsage;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "<init>", "(Z)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethod.kt */
        public static final class ThreeDSecureUsage implements StripeModel {
            public static final Parcelable.Creator<ThreeDSecureUsage> CREATOR = new Creator();
            public final boolean isSupported;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<ThreeDSecureUsage> {
                public final ThreeDSecureUsage createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new ThreeDSecureUsage(parcel.readInt() != 0);
                }

                public final ThreeDSecureUsage[] newArray(int i) {
                    return new ThreeDSecureUsage[i];
                }
            }

            public ThreeDSecureUsage(boolean z) {
                this.isSupported = z;
            }

            public static /* synthetic */ ThreeDSecureUsage copy$default(ThreeDSecureUsage threeDSecureUsage, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    z = threeDSecureUsage.isSupported;
                }
                return threeDSecureUsage.copy(z);
            }

            public final boolean component1() {
                return this.isSupported;
            }

            public final ThreeDSecureUsage copy(boolean z) {
                return new ThreeDSecureUsage(z);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof ThreeDSecureUsage) && this.isSupported == ((ThreeDSecureUsage) obj).isSupported;
                }
                return true;
            }

            public int hashCode() {
                boolean z = this.isSupported;
                if (z) {
                    return 1;
                }
                return z ? 1 : 0;
            }

            public String toString() {
                return a.D0(a.P0("ThreeDSecureUsage(isSupported="), this.isSupported, ")");
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeInt(this.isSupported ? 1 : 0);
            }
        }

        public Card() {
            this((CardBrand) null, (Checks) null, (String) null, (Integer) null, (Integer) null, (String) null, (String) null, (String) null, (ThreeDSecureUsage) null, (Wallet) null, (Networks) null, 2047, (f) null);
        }

        public Card(CardBrand cardBrand, Checks checks2, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage2, Wallet wallet2, Networks networks2) {
            i.e(cardBrand, AccountRangeJsonParser.FIELD_BRAND);
            this.brand = cardBrand;
            this.checks = checks2;
            this.country = str;
            this.expiryMonth = num;
            this.expiryYear = num2;
            this.fingerprint = str2;
            this.funding = str3;
            this.last4 = str4;
            this.threeDSecureUsage = threeDSecureUsage2;
            this.wallet = wallet2;
            this.networks = networks2;
        }

        public static /* synthetic */ Card copy$default(Card card, CardBrand cardBrand, Checks checks2, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage2, Wallet wallet2, Networks networks2, int i, Object obj) {
            Card card2 = card;
            int i2 = i;
            return card.copy((i2 & 1) != 0 ? card2.brand : cardBrand, (i2 & 2) != 0 ? card2.checks : checks2, (i2 & 4) != 0 ? card2.country : str, (i2 & 8) != 0 ? card2.expiryMonth : num, (i2 & 16) != 0 ? card2.expiryYear : num2, (i2 & 32) != 0 ? card2.fingerprint : str2, (i2 & 64) != 0 ? card2.funding : str3, (i2 & 128) != 0 ? card2.last4 : str4, (i2 & 256) != 0 ? card2.threeDSecureUsage : threeDSecureUsage2, (i2 & 512) != 0 ? card2.wallet : wallet2, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? card2.networks : networks2);
        }

        public final CardBrand component1() {
            return this.brand;
        }

        public final Wallet component10() {
            return this.wallet;
        }

        public final Networks component11$payments_core_release() {
            return this.networks;
        }

        public final Checks component2() {
            return this.checks;
        }

        public final String component3() {
            return this.country;
        }

        public final Integer component4() {
            return this.expiryMonth;
        }

        public final Integer component5() {
            return this.expiryYear;
        }

        public final String component6() {
            return this.fingerprint;
        }

        public final String component7() {
            return this.funding;
        }

        public final String component8() {
            return this.last4;
        }

        public final ThreeDSecureUsage component9() {
            return this.threeDSecureUsage;
        }

        public final Card copy(CardBrand cardBrand, Checks checks2, String str, Integer num, Integer num2, String str2, String str3, String str4, ThreeDSecureUsage threeDSecureUsage2, Wallet wallet2, Networks networks2) {
            i.e(cardBrand, AccountRangeJsonParser.FIELD_BRAND);
            return new Card(cardBrand, checks2, str, num, num2, str2, str3, str4, threeDSecureUsage2, wallet2, networks2);
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
            return i.a(this.brand, card.brand) && i.a(this.checks, card.checks) && i.a(this.country, card.country) && i.a(this.expiryMonth, card.expiryMonth) && i.a(this.expiryYear, card.expiryYear) && i.a(this.fingerprint, card.fingerprint) && i.a(this.funding, card.funding) && i.a(this.last4, card.last4) && i.a(this.threeDSecureUsage, card.threeDSecureUsage) && i.a(this.wallet, card.wallet) && i.a(this.networks, card.networks);
        }

        public int hashCode() {
            CardBrand cardBrand = this.brand;
            int i = 0;
            int hashCode = (cardBrand != null ? cardBrand.hashCode() : 0) * 31;
            Checks checks2 = this.checks;
            int hashCode2 = (hashCode + (checks2 != null ? checks2.hashCode() : 0)) * 31;
            String str = this.country;
            int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
            Integer num = this.expiryMonth;
            int hashCode4 = (hashCode3 + (num != null ? num.hashCode() : 0)) * 31;
            Integer num2 = this.expiryYear;
            int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
            String str2 = this.fingerprint;
            int hashCode6 = (hashCode5 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.funding;
            int hashCode7 = (hashCode6 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.last4;
            int hashCode8 = (hashCode7 + (str4 != null ? str4.hashCode() : 0)) * 31;
            ThreeDSecureUsage threeDSecureUsage2 = this.threeDSecureUsage;
            int hashCode9 = (hashCode8 + (threeDSecureUsage2 != null ? threeDSecureUsage2.hashCode() : 0)) * 31;
            Wallet wallet2 = this.wallet;
            int hashCode10 = (hashCode9 + (wallet2 != null ? wallet2.hashCode() : 0)) * 31;
            Networks networks2 = this.networks;
            if (networks2 != null) {
                i = networks2.hashCode();
            }
            return hashCode10 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Card(brand=");
            P0.append(this.brand);
            P0.append(", checks=");
            P0.append(this.checks);
            P0.append(", country=");
            P0.append(this.country);
            P0.append(", expiryMonth=");
            P0.append(this.expiryMonth);
            P0.append(", expiryYear=");
            P0.append(this.expiryYear);
            P0.append(", fingerprint=");
            P0.append(this.fingerprint);
            P0.append(", funding=");
            P0.append(this.funding);
            P0.append(", last4=");
            P0.append(this.last4);
            P0.append(", threeDSecureUsage=");
            P0.append(this.threeDSecureUsage);
            P0.append(", wallet=");
            P0.append(this.wallet);
            P0.append(", networks=");
            P0.append(this.networks);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.brand.name());
            Checks checks2 = this.checks;
            if (checks2 != null) {
                parcel.writeInt(1);
                checks2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.country);
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
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.funding);
            parcel.writeString(this.last4);
            ThreeDSecureUsage threeDSecureUsage2 = this.threeDSecureUsage;
            if (threeDSecureUsage2 != null) {
                parcel.writeInt(1);
                threeDSecureUsage2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeParcelable(this.wallet, i);
            Networks networks2 = this.networks;
            if (networks2 != null) {
                parcel.writeInt(1);
                networks2.writeToParcel(parcel, 0);
                return;
            }
            parcel.writeInt(0);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B-\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b%\u0010&J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ6\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\f\u001a\u00020\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0013J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001b\u0010\r\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b \u0010\nR\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b\"\u0010\u0005R\u0019\u0010\f\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b$\u0010\b¨\u0006'"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "Lcom/stripe/android/model/StripeModel;", "", "", "component1", "()Ljava/util/Set;", "", "component2", "()Z", "component3", "()Ljava/lang/String;", "available", "selectionMandatory", "preferred", "copy", "(Ljava/util/Set;ZLjava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Card$Networks;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPreferred", "Ljava/util/Set;", "getAvailable", "Z", "getSelectionMandatory", "<init>", "(Ljava/util/Set;ZLjava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethod.kt */
        public static final class Networks implements StripeModel {
            public static final Parcelable.Creator<Networks> CREATOR = new Creator();
            private final Set<String> available;
            private final String preferred;
            private final boolean selectionMandatory;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<Networks> {
                public final Networks createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    int readInt = parcel.readInt();
                    LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                    while (readInt != 0) {
                        linkedHashSet.add(parcel.readString());
                        readInt--;
                    }
                    return new Networks(linkedHashSet, parcel.readInt() != 0, parcel.readString());
                }

                public final Networks[] newArray(int i) {
                    return new Networks[i];
                }
            }

            public Networks() {
                this((Set) null, false, (String) null, 7, (f) null);
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public Networks(Set set, boolean z, String str, int i, f fVar) {
                this((i & 1) != 0 ? EmptySet.c : set, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str);
            }

            public static /* synthetic */ Networks copy$default(Networks networks, Set<String> set, boolean z, String str, int i, Object obj) {
                if ((i & 1) != 0) {
                    set = networks.available;
                }
                if ((i & 2) != 0) {
                    z = networks.selectionMandatory;
                }
                if ((i & 4) != 0) {
                    str = networks.preferred;
                }
                return networks.copy(set, z, str);
            }

            public final Set<String> component1() {
                return this.available;
            }

            public final boolean component2() {
                return this.selectionMandatory;
            }

            public final String component3() {
                return this.preferred;
            }

            public final Networks copy(Set<String> set, boolean z, String str) {
                i.e(set, SDKCoreEvent.ForegroundStatus.VALUE_AVAILABLE);
                return new Networks(set, z, str);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Networks)) {
                    return false;
                }
                Networks networks = (Networks) obj;
                return i.a(this.available, networks.available) && this.selectionMandatory == networks.selectionMandatory && i.a(this.preferred, networks.preferred);
            }

            public final Set<String> getAvailable() {
                return this.available;
            }

            public final String getPreferred() {
                return this.preferred;
            }

            public final boolean getSelectionMandatory() {
                return this.selectionMandatory;
            }

            public int hashCode() {
                Set<String> set = this.available;
                int i = 0;
                int hashCode = (set != null ? set.hashCode() : 0) * 31;
                boolean z = this.selectionMandatory;
                if (z) {
                    z = true;
                }
                int i2 = (hashCode + (z ? 1 : 0)) * 31;
                String str = this.preferred;
                if (str != null) {
                    i = str.hashCode();
                }
                return i2 + i;
            }

            public String toString() {
                StringBuilder P0 = a.P0("Networks(available=");
                P0.append(this.available);
                P0.append(", selectionMandatory=");
                P0.append(this.selectionMandatory);
                P0.append(", preferred=");
                return a.y0(P0, this.preferred, ")");
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                Set<String> set = this.available;
                parcel.writeInt(set.size());
                for (String writeString : set) {
                    parcel.writeString(writeString);
                }
                parcel.writeInt(this.selectionMandatory ? 1 : 0);
                parcel.writeString(this.preferred);
            }

            public Networks(Set<String> set, boolean z, String str) {
                i.e(set, SDKCoreEvent.ForegroundStatus.VALUE_AVAILABLE);
                this.available = set;
                this.selectionMandatory = z;
                this.preferred = str;
            }
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Card(com.stripe.android.model.CardBrand r13, com.stripe.android.model.PaymentMethod.Card.Checks r14, java.lang.String r15, java.lang.Integer r16, java.lang.Integer r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, com.stripe.android.model.PaymentMethod.Card.ThreeDSecureUsage r21, com.stripe.android.model.wallets.Wallet r22, com.stripe.android.model.PaymentMethod.Card.Networks r23, int r24, m0.n.b.f r25) {
            /*
                r12 = this;
                r0 = r24
                r1 = r0 & 1
                if (r1 == 0) goto L_0x0009
                com.stripe.android.model.CardBrand r1 = com.stripe.android.model.CardBrand.Unknown
                goto L_0x000a
            L_0x0009:
                r1 = r13
            L_0x000a:
                r2 = r0 & 2
                r3 = 0
                if (r2 == 0) goto L_0x0011
                r2 = r3
                goto L_0x0012
            L_0x0011:
                r2 = r14
            L_0x0012:
                r4 = r0 & 4
                if (r4 == 0) goto L_0x0018
                r4 = r3
                goto L_0x0019
            L_0x0018:
                r4 = r15
            L_0x0019:
                r5 = r0 & 8
                if (r5 == 0) goto L_0x001f
                r5 = r3
                goto L_0x0021
            L_0x001f:
                r5 = r16
            L_0x0021:
                r6 = r0 & 16
                if (r6 == 0) goto L_0x0027
                r6 = r3
                goto L_0x0029
            L_0x0027:
                r6 = r17
            L_0x0029:
                r7 = r0 & 32
                if (r7 == 0) goto L_0x002f
                r7 = r3
                goto L_0x0031
            L_0x002f:
                r7 = r18
            L_0x0031:
                r8 = r0 & 64
                if (r8 == 0) goto L_0x0037
                r8 = r3
                goto L_0x0039
            L_0x0037:
                r8 = r19
            L_0x0039:
                r9 = r0 & 128(0x80, float:1.794E-43)
                if (r9 == 0) goto L_0x003f
                r9 = r3
                goto L_0x0041
            L_0x003f:
                r9 = r20
            L_0x0041:
                r10 = r0 & 256(0x100, float:3.59E-43)
                if (r10 == 0) goto L_0x0047
                r10 = r3
                goto L_0x0049
            L_0x0047:
                r10 = r21
            L_0x0049:
                r11 = r0 & 512(0x200, float:7.175E-43)
                if (r11 == 0) goto L_0x004f
                r11 = r3
                goto L_0x0051
            L_0x004f:
                r11 = r22
            L_0x0051:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0056
                goto L_0x0058
            L_0x0056:
                r3 = r23
            L_0x0058:
                r13 = r12
                r14 = r1
                r15 = r2
                r16 = r4
                r17 = r5
                r18 = r6
                r19 = r7
                r20 = r8
                r21 = r9
                r22 = r10
                r23 = r11
                r24 = r3
                r13.<init>(r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.PaymentMethod.Card.<init>(com.stripe.android.model.CardBrand, com.stripe.android.model.PaymentMethod$Card$Checks, java.lang.String, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, com.stripe.android.model.PaymentMethod$Card$ThreeDSecureUsage, com.stripe.android.model.wallets.Wallet, com.stripe.android.model.PaymentMethod$Card$Networks, int, m0.n.b.f):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0013\b\u0000\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0003\u001a\u00020\u0002HÂ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0019¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$CardPresent;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Z", "ignore", "copy", "(Z)Lcom/stripe/android/model/PaymentMethod$CardPresent;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "<init>", "(Z)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public static final class CardPresent implements StripeModel {
        public static final Parcelable.Creator<CardPresent> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        /* access modifiers changed from: private */
        public static final /* synthetic */ CardPresent EMPTY = new CardPresent(false, 1, (f) null);
        private final boolean ignore;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$CardPresent$Companion;", "", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "EMPTY", "Lcom/stripe/android/model/PaymentMethod$CardPresent;", "getEMPTY$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$CardPresent;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethod.kt */
        public static final class Companion {
            private Companion() {
            }

            public final CardPresent getEMPTY$payments_core_release() {
                return CardPresent.EMPTY;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<CardPresent> {
            public final CardPresent createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new CardPresent(parcel.readInt() != 0);
            }

            public final CardPresent[] newArray(int i) {
                return new CardPresent[i];
            }
        }

        public CardPresent() {
            this(false, 1, (f) null);
        }

        public CardPresent(boolean z) {
            this.ignore = z;
        }

        private final boolean component1() {
            return this.ignore;
        }

        public static /* synthetic */ CardPresent copy$default(CardPresent cardPresent, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = cardPresent.ignore;
            }
            return cardPresent.copy(z);
        }

        public final CardPresent copy(boolean z) {
            return new CardPresent(z);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof CardPresent) && this.ignore == ((CardPresent) obj).ignore;
            }
            return true;
        }

        public int hashCode() {
            boolean z = this.ignore;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public String toString() {
            return a.D0(a.P0("CardPresent(ignore="), this.ignore, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeInt(this.ignore ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ CardPresent(boolean z, int i, f fVar) {
            this((i & 1) != 0 ? true : z);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Companion;", "", "Lorg/json/JSONObject;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "fromJson", "(Lorg/json/JSONObject;)Lcom/stripe/android/model/PaymentMethod;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public static final class Companion {
        private Companion() {
        }

        public final PaymentMethod fromJson(JSONObject jSONObject) {
            if (jSONObject != null) {
                return new PaymentMethodJsonParser().parse(jSONObject);
            }
            return null;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<PaymentMethod> {
        public final PaymentMethod createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Parcel parcel2 = parcel;
            i.e(parcel2, "in");
            String readString = parcel.readString();
            Long valueOf = parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null;
            boolean z = parcel.readInt() != 0;
            Type type = parcel.readInt() != 0 ? (Type) Enum.valueOf(Type.class, parcel.readString()) : null;
            BillingDetails createFromParcel = parcel.readInt() != 0 ? BillingDetails.CREATOR.createFromParcel(parcel2) : null;
            String readString2 = parcel.readString();
            if (parcel.readInt() != 0) {
                int readInt = parcel.readInt();
                linkedHashMap = new LinkedHashMap(readInt);
                while (readInt != 0) {
                    linkedHashMap.put(parcel.readString(), parcel.readString());
                    readInt--;
                }
            } else {
                linkedHashMap = null;
            }
            return new PaymentMethod(readString, valueOf, z, type, createFromParcel, readString2, linkedHashMap, parcel.readInt() != 0 ? Card.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? CardPresent.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? Fpx.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? Ideal.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? SepaDebit.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? AuBecsDebit.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? BacsDebit.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? Sofort.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? Upi.CREATOR.createFromParcel(parcel2) : null, parcel.readInt() != 0 ? Netbanking.CREATOR.createFromParcel(parcel2) : null);
        }

        public final PaymentMethod[] newArray(int i) {
            return new PaymentMethod[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Fpx;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "component2", "bank", "accountHolderType", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Fpx;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public static final class Fpx implements StripeModel {
        public static final Parcelable.Creator<Fpx> CREATOR = new Creator();
        public final String accountHolderType;
        public final String bank;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Fpx> {
            public final Fpx createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Fpx(parcel.readString(), parcel.readString());
            }

            public final Fpx[] newArray(int i) {
                return new Fpx[i];
            }
        }

        public Fpx(String str, String str2) {
            this.bank = str;
            this.accountHolderType = str2;
        }

        public static /* synthetic */ Fpx copy$default(Fpx fpx, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = fpx.bank;
            }
            if ((i & 2) != 0) {
                str2 = fpx.accountHolderType;
            }
            return fpx.copy(str, str2);
        }

        public final String component1() {
            return this.bank;
        }

        public final String component2() {
            return this.accountHolderType;
        }

        public final Fpx copy(String str, String str2) {
            return new Fpx(str, str2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Fpx)) {
                return false;
            }
            Fpx fpx = (Fpx) obj;
            return i.a(this.bank, fpx.bank) && i.a(this.accountHolderType, fpx.accountHolderType);
        }

        public int hashCode() {
            String str = this.bank;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.accountHolderType;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Fpx(bank=");
            P0.append(this.bank);
            P0.append(", accountHolderType=");
            return a.y0(P0, this.accountHolderType, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.bank);
            parcel.writeString(this.accountHolderType);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u001d\b\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J(\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001aR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001a¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Ideal;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "component2", "bank", "bankIdentifierCode", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Ideal;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public static final class Ideal implements StripeModel {
        public static final Parcelable.Creator<Ideal> CREATOR = new Creator();
        public final String bank;
        public final String bankIdentifierCode;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Ideal> {
            public final Ideal createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Ideal(parcel.readString(), parcel.readString());
            }

            public final Ideal[] newArray(int i) {
                return new Ideal[i];
            }
        }

        public Ideal(String str, String str2) {
            this.bank = str;
            this.bankIdentifierCode = str2;
        }

        public static /* synthetic */ Ideal copy$default(Ideal ideal, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ideal.bank;
            }
            if ((i & 2) != 0) {
                str2 = ideal.bankIdentifierCode;
            }
            return ideal.copy(str, str2);
        }

        public final String component1() {
            return this.bank;
        }

        public final String component2() {
            return this.bankIdentifierCode;
        }

        public final Ideal copy(String str, String str2) {
            return new Ideal(str, str2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Ideal)) {
                return false;
            }
            Ideal ideal = (Ideal) obj;
            return i.a(this.bank, ideal.bank) && i.a(this.bankIdentifierCode, ideal.bankIdentifierCode);
        }

        public int hashCode() {
            String str = this.bank;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.bankIdentifierCode;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Ideal(bank=");
            P0.append(this.bank);
            P0.append(", bankIdentifierCode=");
            return a.y0(P0, this.bankIdentifierCode, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.bank);
            parcel.writeString(this.bankIdentifierCode);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Netbanking;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "bank", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Netbanking;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public static final class Netbanking implements StripeModel {
        public static final Parcelable.Creator<Netbanking> CREATOR = new Creator();
        public final String bank;

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
            this.bank = str;
        }

        public static /* synthetic */ Netbanking copy$default(Netbanking netbanking, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = netbanking.bank;
            }
            return netbanking.copy(str);
        }

        public final String component1() {
            return this.bank;
        }

        public final Netbanking copy(String str) {
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

        public int hashCode() {
            String str = this.bank;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.y0(a.P0("Netbanking(bank="), this.bank, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.bank);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B;\b\u0000\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b!\u0010\"J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0004J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\u0004J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\u0004JL\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0004J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\r\u0010 R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\n\u0010 R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\t\u0010 R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010 ¨\u0006#"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "bankCode", "branchCode", "country", "fingerprint", "last4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$SepaDebit;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public static final class SepaDebit implements StripeModel {
        public static final Parcelable.Creator<SepaDebit> CREATOR = new Creator();
        public final String bankCode;
        public final String branchCode;
        public final String country;
        public final String fingerprint;
        public final String last4;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<SepaDebit> {
            public final SepaDebit createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new SepaDebit(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            public final SepaDebit[] newArray(int i) {
                return new SepaDebit[i];
            }
        }

        public SepaDebit(String str, String str2, String str3, String str4, String str5) {
            this.bankCode = str;
            this.branchCode = str2;
            this.country = str3;
            this.fingerprint = str4;
            this.last4 = str5;
        }

        public static /* synthetic */ SepaDebit copy$default(SepaDebit sepaDebit, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sepaDebit.bankCode;
            }
            if ((i & 2) != 0) {
                str2 = sepaDebit.branchCode;
            }
            String str6 = str2;
            if ((i & 4) != 0) {
                str3 = sepaDebit.country;
            }
            String str7 = str3;
            if ((i & 8) != 0) {
                str4 = sepaDebit.fingerprint;
            }
            String str8 = str4;
            if ((i & 16) != 0) {
                str5 = sepaDebit.last4;
            }
            return sepaDebit.copy(str, str6, str7, str8, str5);
        }

        public final String component1() {
            return this.bankCode;
        }

        public final String component2() {
            return this.branchCode;
        }

        public final String component3() {
            return this.country;
        }

        public final String component4() {
            return this.fingerprint;
        }

        public final String component5() {
            return this.last4;
        }

        public final SepaDebit copy(String str, String str2, String str3, String str4, String str5) {
            return new SepaDebit(str, str2, str3, str4, str5);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof SepaDebit)) {
                return false;
            }
            SepaDebit sepaDebit = (SepaDebit) obj;
            return i.a(this.bankCode, sepaDebit.bankCode) && i.a(this.branchCode, sepaDebit.branchCode) && i.a(this.country, sepaDebit.country) && i.a(this.fingerprint, sepaDebit.fingerprint) && i.a(this.last4, sepaDebit.last4);
        }

        public int hashCode() {
            String str = this.bankCode;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.branchCode;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.country;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            String str4 = this.fingerprint;
            int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
            String str5 = this.last4;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("SepaDebit(bankCode=");
            P0.append(this.bankCode);
            P0.append(", branchCode=");
            P0.append(this.branchCode);
            P0.append(", country=");
            P0.append(this.country);
            P0.append(", fingerprint=");
            P0.append(this.fingerprint);
            P0.append(", last4=");
            return a.y0(P0, this.last4, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.bankCode);
            parcel.writeString(this.branchCode);
            parcel.writeString(this.country);
            parcel.writeString(this.fingerprint);
            parcel.writeString(this.last4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Sofort;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "country", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Sofort;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public static final class Sofort implements StripeModel {
        public static final Parcelable.Creator<Sofort> CREATOR = new Creator();
        public final String country;

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
            this.country = str;
        }

        public static /* synthetic */ Sofort copy$default(Sofort sofort, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = sofort.country;
            }
            return sofort.copy(str);
        }

        public final String component1() {
            return this.country;
        }

        public final Sofort copy(String str) {
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

        public int hashCode() {
            String str = this.country;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.y0(a.P0("Sofort(country="), this.country, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.country);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0001\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002:\u0001\u0016B\u0019\b\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u0016\u0010\u000f\u001a\u00020\u00038\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0012\u001a\u00020\u00118\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'j\u0002\b(j\u0002\b)j\u0002\b*j\u0002\b+¨\u0006,"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Type;", "", "Landroid/os/Parcelable;", "", "toString", "()Ljava/lang/String;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "code", "Ljava/lang/String;", "", "isReusable", "Z", "<init>", "(Ljava/lang/String;ILjava/lang/String;Z)V", "Companion", "Card", "CardPresent", "Fpx", "Ideal", "SepaDebit", "AuBecsDebit", "BacsDebit", "Sofort", "Upi", "P24", "Bancontact", "Giropay", "Eps", "Oxxo", "Alipay", "GrabPay", "PayPal", "AfterpayClearpay", "Netbanking", "Blik", "WeChatPay", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public enum Type implements Parcelable {
        Card("card", true),
        CardPresent("card_present", false),
        Fpx("fpx", false),
        Ideal("ideal", false),
        SepaDebit("sepa_debit", false),
        AuBecsDebit("au_becs_debit", true),
        BacsDebit("bacs_debit", true),
        Sofort("sofort", false),
        Upi("upi", false),
        P24("p24", false),
        Bancontact("bancontact", false),
        Giropay("giropay", false),
        Eps("eps", false),
        Oxxo("oxxo", false),
        Alipay("alipay", false),
        GrabPay("grabpay", false),
        PayPal("paypal", false),
        AfterpayClearpay("afterpay_clearpay", false),
        Netbanking("netbanking", false),
        Blik("blik", false),
        WeChatPay("wechat_pay", false);
        
        public static final Parcelable.Creator<Type> CREATOR = null;
        public static final Companion Companion = null;
        public final String code;
        public final boolean isReusable;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Type$Companion;", "", "", "code", "Lcom/stripe/android/model/PaymentMethod$Type;", "fromCode$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Type;", "fromCode", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethod.kt */
        public static final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Type fromCode$payments_core_release(String str) {
                Type[] values = Type.values();
                for (int i = 0; i < 21; i++) {
                    Type type = values[i];
                    if (i.a(type.code, str)) {
                        return type;
                    }
                }
                return null;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Type> {
            public final Type createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return (Type) Enum.valueOf(Type.class, parcel.readString());
            }

            public final Type[] newArray(int i) {
                return new Type[i];
            }
        }

        /* access modifiers changed from: public */
        static {
            Companion = new Companion((f) null);
            CREATOR = new Creator();
        }

        private Type(String str, boolean z) {
            this.code = str;
            this.isReusable = z;
        }

        public int describeContents() {
            return 0;
        }

        public String toString() {
            return this.code;
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(name());
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0018¨\u0006\u001b"}, d2 = {"Lcom/stripe/android/model/PaymentMethod$Upi;", "Lcom/stripe/android/model/StripeModel;", "", "component1", "()Ljava/lang/String;", "vpa", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/PaymentMethod$Upi;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethod.kt */
    public static final class Upi implements StripeModel {
        public static final Parcelable.Creator<Upi> CREATOR = new Creator();
        public final String vpa;

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

        public static /* synthetic */ Upi copy$default(Upi upi, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = upi.vpa;
            }
            return upi.copy(str);
        }

        public final String component1() {
            return this.vpa;
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

        public String toString() {
            return a.y0(a.P0("Upi(vpa="), this.vpa, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.vpa);
        }
    }

    public PaymentMethod(String str, Long l, boolean z, Type type2, BillingDetails billingDetails2, String str2, Map<String, String> map, Card card2, CardPresent cardPresent2, Fpx fpx2, Ideal ideal2, SepaDebit sepaDebit2, AuBecsDebit auBecsDebit2, BacsDebit bacsDebit2, Sofort sofort2, Upi upi2, Netbanking netbanking2) {
        this.id = str;
        this.created = l;
        this.liveMode = z;
        this.type = type2;
        this.billingDetails = billingDetails2;
        this.customerId = str2;
        this.metadata = map;
        this.card = card2;
        this.cardPresent = cardPresent2;
        this.fpx = fpx2;
        this.ideal = ideal2;
        this.sepaDebit = sepaDebit2;
        this.auBecsDebit = auBecsDebit2;
        this.bacsDebit = bacsDebit2;
        this.sofort = sofort2;
        this.upi = upi2;
        this.netbanking = netbanking2;
    }

    public static /* synthetic */ PaymentMethod copy$default(PaymentMethod paymentMethod, String str, Long l, boolean z, Type type2, BillingDetails billingDetails2, String str2, Map map, Card card2, CardPresent cardPresent2, Fpx fpx2, Ideal ideal2, SepaDebit sepaDebit2, AuBecsDebit auBecsDebit2, BacsDebit bacsDebit2, Sofort sofort2, Upi upi2, Netbanking netbanking2, int i, Object obj) {
        PaymentMethod paymentMethod2 = paymentMethod;
        int i2 = i;
        return paymentMethod.copy((i2 & 1) != 0 ? paymentMethod2.id : str, (i2 & 2) != 0 ? paymentMethod2.created : l, (i2 & 4) != 0 ? paymentMethod2.liveMode : z, (i2 & 8) != 0 ? paymentMethod2.type : type2, (i2 & 16) != 0 ? paymentMethod2.billingDetails : billingDetails2, (i2 & 32) != 0 ? paymentMethod2.customerId : str2, (i2 & 64) != 0 ? paymentMethod2.metadata : map, (i2 & 128) != 0 ? paymentMethod2.card : card2, (i2 & 256) != 0 ? paymentMethod2.cardPresent : cardPresent2, (i2 & 512) != 0 ? paymentMethod2.fpx : fpx2, (i2 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? paymentMethod2.ideal : ideal2, (i2 & 2048) != 0 ? paymentMethod2.sepaDebit : sepaDebit2, (i2 & 4096) != 0 ? paymentMethod2.auBecsDebit : auBecsDebit2, (i2 & 8192) != 0 ? paymentMethod2.bacsDebit : bacsDebit2, (i2 & 16384) != 0 ? paymentMethod2.sofort : sofort2, (i2 & 32768) != 0 ? paymentMethod2.upi : upi2, (i2 & 65536) != 0 ? paymentMethod2.netbanking : netbanking2);
    }

    public static final PaymentMethod fromJson(JSONObject jSONObject) {
        return Companion.fromJson(jSONObject);
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public final String component1() {
        return this.id;
    }

    public final Fpx component10() {
        return this.fpx;
    }

    public final Ideal component11() {
        return this.ideal;
    }

    public final SepaDebit component12() {
        return this.sepaDebit;
    }

    public final AuBecsDebit component13() {
        return this.auBecsDebit;
    }

    public final BacsDebit component14() {
        return this.bacsDebit;
    }

    public final Sofort component15() {
        return this.sofort;
    }

    public final Upi component16() {
        return this.upi;
    }

    public final Netbanking component17() {
        return this.netbanking;
    }

    public final Long component2() {
        return this.created;
    }

    public final boolean component3() {
        return this.liveMode;
    }

    public final Type component4() {
        return this.type;
    }

    public final BillingDetails component5() {
        return this.billingDetails;
    }

    public final String component6() {
        return this.customerId;
    }

    public final Map<String, String> component7() {
        return this.metadata;
    }

    public final Card component8() {
        return this.card;
    }

    public final CardPresent component9() {
        return this.cardPresent;
    }

    public final PaymentMethod copy(String str, Long l, boolean z, Type type2, BillingDetails billingDetails2, String str2, Map<String, String> map, Card card2, CardPresent cardPresent2, Fpx fpx2, Ideal ideal2, SepaDebit sepaDebit2, AuBecsDebit auBecsDebit2, BacsDebit bacsDebit2, Sofort sofort2, Upi upi2, Netbanking netbanking2) {
        return new PaymentMethod(str, l, z, type2, billingDetails2, str2, map, card2, cardPresent2, fpx2, ideal2, sepaDebit2, auBecsDebit2, bacsDebit2, sofort2, upi2, netbanking2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentMethod)) {
            return false;
        }
        PaymentMethod paymentMethod = (PaymentMethod) obj;
        return i.a(this.id, paymentMethod.id) && i.a(this.created, paymentMethod.created) && this.liveMode == paymentMethod.liveMode && i.a(this.type, paymentMethod.type) && i.a(this.billingDetails, paymentMethod.billingDetails) && i.a(this.customerId, paymentMethod.customerId) && i.a(this.metadata, paymentMethod.metadata) && i.a(this.card, paymentMethod.card) && i.a(this.cardPresent, paymentMethod.cardPresent) && i.a(this.fpx, paymentMethod.fpx) && i.a(this.ideal, paymentMethod.ideal) && i.a(this.sepaDebit, paymentMethod.sepaDebit) && i.a(this.auBecsDebit, paymentMethod.auBecsDebit) && i.a(this.bacsDebit, paymentMethod.bacsDebit) && i.a(this.sofort, paymentMethod.sofort) && i.a(this.upi, paymentMethod.upi) && i.a(this.netbanking, paymentMethod.netbanking);
    }

    public int hashCode() {
        String str = this.id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        Long l = this.created;
        int hashCode2 = (hashCode + (l != null ? l.hashCode() : 0)) * 31;
        boolean z = this.liveMode;
        if (z) {
            z = true;
        }
        int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
        Type type2 = this.type;
        int hashCode3 = (i2 + (type2 != null ? type2.hashCode() : 0)) * 31;
        BillingDetails billingDetails2 = this.billingDetails;
        int hashCode4 = (hashCode3 + (billingDetails2 != null ? billingDetails2.hashCode() : 0)) * 31;
        String str2 = this.customerId;
        int hashCode5 = (hashCode4 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Map<String, String> map = this.metadata;
        int hashCode6 = (hashCode5 + (map != null ? map.hashCode() : 0)) * 31;
        Card card2 = this.card;
        int hashCode7 = (hashCode6 + (card2 != null ? card2.hashCode() : 0)) * 31;
        CardPresent cardPresent2 = this.cardPresent;
        int hashCode8 = (hashCode7 + (cardPresent2 != null ? cardPresent2.hashCode() : 0)) * 31;
        Fpx fpx2 = this.fpx;
        int hashCode9 = (hashCode8 + (fpx2 != null ? fpx2.hashCode() : 0)) * 31;
        Ideal ideal2 = this.ideal;
        int hashCode10 = (hashCode9 + (ideal2 != null ? ideal2.hashCode() : 0)) * 31;
        SepaDebit sepaDebit2 = this.sepaDebit;
        int hashCode11 = (hashCode10 + (sepaDebit2 != null ? sepaDebit2.hashCode() : 0)) * 31;
        AuBecsDebit auBecsDebit2 = this.auBecsDebit;
        int hashCode12 = (hashCode11 + (auBecsDebit2 != null ? auBecsDebit2.hashCode() : 0)) * 31;
        BacsDebit bacsDebit2 = this.bacsDebit;
        int hashCode13 = (hashCode12 + (bacsDebit2 != null ? bacsDebit2.hashCode() : 0)) * 31;
        Sofort sofort2 = this.sofort;
        int hashCode14 = (hashCode13 + (sofort2 != null ? sofort2.hashCode() : 0)) * 31;
        Upi upi2 = this.upi;
        int hashCode15 = (hashCode14 + (upi2 != null ? upi2.hashCode() : 0)) * 31;
        Netbanking netbanking2 = this.netbanking;
        if (netbanking2 != null) {
            i = netbanking2.hashCode();
        }
        return hashCode15 + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PaymentMethod(id=");
        P0.append(this.id);
        P0.append(", created=");
        P0.append(this.created);
        P0.append(", liveMode=");
        P0.append(this.liveMode);
        P0.append(", type=");
        P0.append(this.type);
        P0.append(", billingDetails=");
        P0.append(this.billingDetails);
        P0.append(", customerId=");
        P0.append(this.customerId);
        P0.append(", metadata=");
        P0.append(this.metadata);
        P0.append(", card=");
        P0.append(this.card);
        P0.append(", cardPresent=");
        P0.append(this.cardPresent);
        P0.append(", fpx=");
        P0.append(this.fpx);
        P0.append(", ideal=");
        P0.append(this.ideal);
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
        P0.append(")");
        return P0.toString();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [java.util.Map$Entry, java.lang.Object] */
    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.id);
        Long l = this.created;
        if (l != null) {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.liveMode ? 1 : 0);
        Type type2 = this.type;
        if (type2 != null) {
            parcel.writeInt(1);
            parcel.writeString(type2.name());
        } else {
            parcel.writeInt(0);
        }
        BillingDetails billingDetails2 = this.billingDetails;
        if (billingDetails2 != null) {
            parcel.writeInt(1);
            billingDetails2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.customerId);
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
        Card card2 = this.card;
        if (card2 != null) {
            parcel.writeInt(1);
            card2.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        CardPresent cardPresent2 = this.cardPresent;
        if (cardPresent2 != null) {
            parcel.writeInt(1);
            cardPresent2.writeToParcel(parcel, 0);
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
        Ideal ideal2 = this.ideal;
        if (ideal2 != null) {
            parcel.writeInt(1);
            ideal2.writeToParcel(parcel, 0);
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
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ PaymentMethod(java.lang.String r22, java.lang.Long r23, boolean r24, com.stripe.android.model.PaymentMethod.Type r25, com.stripe.android.model.PaymentMethod.BillingDetails r26, java.lang.String r27, java.util.Map r28, com.stripe.android.model.PaymentMethod.Card r29, com.stripe.android.model.PaymentMethod.CardPresent r30, com.stripe.android.model.PaymentMethod.Fpx r31, com.stripe.android.model.PaymentMethod.Ideal r32, com.stripe.android.model.PaymentMethod.SepaDebit r33, com.stripe.android.model.PaymentMethod.AuBecsDebit r34, com.stripe.android.model.PaymentMethod.BacsDebit r35, com.stripe.android.model.PaymentMethod.Sofort r36, com.stripe.android.model.PaymentMethod.Upi r37, com.stripe.android.model.PaymentMethod.Netbanking r38, int r39, m0.n.b.f r40) {
        /*
            r21 = this;
            r0 = r39
            r1 = r0 & 16
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r8 = r2
            goto L_0x000b
        L_0x0009:
            r8 = r26
        L_0x000b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0011
            r9 = r2
            goto L_0x0013
        L_0x0011:
            r9 = r27
        L_0x0013:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0019
            r10 = r2
            goto L_0x001b
        L_0x0019:
            r10 = r28
        L_0x001b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0021
            r11 = r2
            goto L_0x0023
        L_0x0021:
            r11 = r29
        L_0x0023:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0029
            r12 = r2
            goto L_0x002b
        L_0x0029:
            r12 = r30
        L_0x002b:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0031
            r13 = r2
            goto L_0x0033
        L_0x0031:
            r13 = r31
        L_0x0033:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0039
            r14 = r2
            goto L_0x003b
        L_0x0039:
            r14 = r32
        L_0x003b:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0041
            r15 = r2
            goto L_0x0043
        L_0x0041:
            r15 = r33
        L_0x0043:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x004a
            r16 = r2
            goto L_0x004c
        L_0x004a:
            r16 = r34
        L_0x004c:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0053
            r17 = r2
            goto L_0x0055
        L_0x0053:
            r17 = r35
        L_0x0055:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x005c
            r18 = r2
            goto L_0x005e
        L_0x005c:
            r18 = r36
        L_0x005e:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0067
            r19 = r2
            goto L_0x0069
        L_0x0067:
            r19 = r37
        L_0x0069:
            r1 = 65536(0x10000, float:9.18355E-41)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x0071
            r20 = r2
            goto L_0x0073
        L_0x0071:
            r20 = r38
        L_0x0073:
            r3 = r21
            r4 = r22
            r5 = r23
            r6 = r24
            r7 = r25
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.PaymentMethod.<init>(java.lang.String, java.lang.Long, boolean, com.stripe.android.model.PaymentMethod$Type, com.stripe.android.model.PaymentMethod$BillingDetails, java.lang.String, java.util.Map, com.stripe.android.model.PaymentMethod$Card, com.stripe.android.model.PaymentMethod$CardPresent, com.stripe.android.model.PaymentMethod$Fpx, com.stripe.android.model.PaymentMethod$Ideal, com.stripe.android.model.PaymentMethod$SepaDebit, com.stripe.android.model.PaymentMethod$AuBecsDebit, com.stripe.android.model.PaymentMethod$BacsDebit, com.stripe.android.model.PaymentMethod$Sofort, com.stripe.android.model.PaymentMethod$Upi, com.stripe.android.model.PaymentMethod$Netbanking, int, m0.n.b.f):void");
    }
}
