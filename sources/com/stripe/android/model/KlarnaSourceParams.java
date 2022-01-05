package com.stripe.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import i0.j.f.p.h;
import io.agora.rtc.Constants;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\b\u0018\u0000 L2\u00020\u00012\u00020\u0002:\u0004LMNOB\u0001\b\u0007\u0012\u0006\u0010\u001f\u001a\u00020\u0004\u0012\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\bJ\u0010KJ\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nHÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0016\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0012\u0010\tJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\tJ\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\tJ\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\tJ\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001cHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0001\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u001f\u001a\u00020\u00042\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u000e\b\u0002\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\u001cHÆ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b+\u0010\tJ\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u0002002\b\u0010/\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020,HÖ\u0001¢\u0006\u0004\b3\u0010.J \u00108\u001a\u0002072\u0006\u00105\u001a\u0002042\u0006\u00106\u001a\u00020,HÖ\u0001¢\u0006\u0004\b8\u00109R\u001f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006@\u0006¢\u0006\f\n\u0004\b!\u0010:\u001a\u0004\b;\u0010\u0011R\u001b\u0010%\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010<\u001a\u0004\b=\u0010\tR\u001b\u0010#\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b#\u0010<\u001a\u0004\b>\u0010\tR\u001b\u0010'\u001a\u0004\u0018\u00010\u00198\u0006@\u0006¢\u0006\f\n\u0004\b'\u0010?\u001a\u0004\b@\u0010\u001bR\u001f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006@\u0006¢\u0006\f\n\u0004\b \u0010A\u001a\u0004\bB\u0010\rR\u001b\u0010&\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010<\u001a\u0004\bC\u0010\tR\u001b\u0010$\u001a\u0004\u0018\u00010\u00148\u0006@\u0006¢\u0006\f\n\u0004\b$\u0010D\u001a\u0004\bE\u0010\u0016R\u0019\u0010\u001f\u001a\u00020\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010<\u001a\u0004\bF\u0010\tR\u001b\u0010(\u001a\u0004\u0018\u00010\u001c8\u0006@\u0006¢\u0006\f\n\u0004\b(\u0010G\u001a\u0004\bH\u0010\u001eR\u001b\u0010\"\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\"\u0010<\u001a\u0004\bI\u0010\t¨\u0006P"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "", "Lcom/stripe/android/model/KlarnaSourceParams$LineItem;", "component2", "()Ljava/util/List;", "", "Lcom/stripe/android/model/KlarnaSourceParams$CustomPaymentMethods;", "component3", "()Ljava/util/Set;", "component4", "component5", "Lcom/stripe/android/model/Address;", "component6", "()Lcom/stripe/android/model/Address;", "component7", "component8", "Lcom/stripe/android/model/DateOfBirth;", "component9", "()Lcom/stripe/android/model/DateOfBirth;", "Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "component10", "()Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "purchaseCountry", "lineItems", "customPaymentMethods", "billingEmail", "billingPhone", "billingAddress", "billingFirstName", "billingLastName", "billingDob", "pageOptions", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DateOfBirth;Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;)Lcom/stripe/android/model/KlarnaSourceParams;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Set;", "getCustomPaymentMethods", "Ljava/lang/String;", "getBillingFirstName", "getBillingPhone", "Lcom/stripe/android/model/DateOfBirth;", "getBillingDob", "Ljava/util/List;", "getLineItems", "getBillingLastName", "Lcom/stripe/android/model/Address;", "getBillingAddress", "getPurchaseCountry", "Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "getPageOptions", "getBillingEmail", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/Set;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/DateOfBirth;Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;)V", "Companion", "CustomPaymentMethods", "LineItem", "PaymentPageOptions", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: KlarnaSourceParams.kt */
public final class KlarnaSourceParams implements StripeParamsModel, Parcelable {
    public static final Parcelable.Creator<KlarnaSourceParams> CREATOR = new Creator();
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String PARAM_CUSTOM_PAYMENT_METHODS = "custom_payment_methods";
    @Deprecated
    private static final String PARAM_DOB_DAY = "owner_dob_day";
    @Deprecated
    private static final String PARAM_DOB_MONTH = "owner_dob_month";
    @Deprecated
    private static final String PARAM_DOB_YEAR = "owner_dob_year";
    @Deprecated
    private static final String PARAM_FIRST_NAME = "first_name";
    @Deprecated
    private static final String PARAM_LAST_NAME = "last_name";
    @Deprecated
    private static final String PARAM_PRODUCT = "product";
    @Deprecated
    private static final String PARAM_PURCHASE_COUNTRY = "purchase_country";
    private final Address billingAddress;
    private final DateOfBirth billingDob;
    private final String billingEmail;
    private final String billingFirstName;
    private final String billingLastName;
    private final String billingPhone;
    private final Set<CustomPaymentMethods> customPaymentMethods;
    private final List<LineItem> lineItems;
    private final PaymentPageOptions pageOptions;
    private final String purchaseCountry;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004R\u0016\u0010\b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\b\u0010\u0004R\u0016\u0010\t\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\u0004R\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u0004R\u0016\u0010\u000b\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$Companion;", "", "", "PARAM_CUSTOM_PAYMENT_METHODS", "Ljava/lang/String;", "PARAM_DOB_DAY", "PARAM_DOB_MONTH", "PARAM_DOB_YEAR", "PARAM_FIRST_NAME", "PARAM_LAST_NAME", "PARAM_PRODUCT", "PARAM_PURCHASE_COUNTRY", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: KlarnaSourceParams.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<KlarnaSourceParams> {
        public final KlarnaSourceParams createFromParcel(Parcel parcel) {
            String readString;
            i.e(parcel, "in");
            String readString2 = parcel.readString();
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add(LineItem.CREATOR.createFromParcel(parcel));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt2);
            while (true) {
                readString = parcel.readString();
                if (readInt2 == 0) {
                    break;
                }
                linkedHashSet.add((CustomPaymentMethods) Enum.valueOf(CustomPaymentMethods.class, readString));
                readInt2--;
            }
            return new KlarnaSourceParams(readString2, arrayList, linkedHashSet, readString, parcel.readString(), parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? DateOfBirth.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0 ? PaymentPageOptions.CREATOR.createFromParcel(parcel) : null);
        }

        public final KlarnaSourceParams[] newArray(int i) {
            return new KlarnaSourceParams[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$CustomPaymentMethods;", "", "", "code", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "PayIn4", "Installments", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: KlarnaSourceParams.kt */
    public enum CustomPaymentMethods {
        PayIn4("payin4"),
        Installments("installments");
        
        private final String code;

        private CustomPaymentMethods(String str) {
            this.code = str;
        }

        public final String getCode$payments_core_release() {
            return this.code;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\b\u0018\u00002\u00020\u0001:\u0001+B-\b\u0007\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b)\u0010*J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0014\u0010\nJ\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\nJ \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\r\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010\u0004R\u0019\u0010\u000f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010#\u001a\u0004\b$\u0010\nR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010%\u001a\u0004\b&\u0010\fR\u0019\u0010\u000e\u001a\u00020\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010\u0007¨\u0006,"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$LineItem;", "Landroid/os/Parcelable;", "Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;", "component1", "()Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;", "", "component2", "()Ljava/lang/String;", "", "component3", "()I", "component4", "()Ljava/lang/Integer;", "itemType", "itemDescription", "totalAmount", "quantity", "copy", "(Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;Ljava/lang/String;ILjava/lang/Integer;)Lcom/stripe/android/model/KlarnaSourceParams$LineItem;", "toString", "hashCode", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;", "getItemType", "I", "getTotalAmount", "Ljava/lang/Integer;", "getQuantity", "Ljava/lang/String;", "getItemDescription", "<init>", "(Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;Ljava/lang/String;ILjava/lang/Integer;)V", "Type", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: KlarnaSourceParams.kt */
    public static final class LineItem implements Parcelable {
        public static final Parcelable.Creator<LineItem> CREATOR = new Creator();
        private final String itemDescription;
        private final Type itemType;
        private final Integer quantity;
        private final int totalAmount;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<LineItem> {
            public final LineItem createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new LineItem((Type) Enum.valueOf(Type.class, parcel.readString()), parcel.readString(), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            public final LineItem[] newArray(int i) {
                return new LineItem[i];
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$LineItem$Type;", "", "", "code", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Sku", "Tax", "Shipping", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: KlarnaSourceParams.kt */
        public enum Type {
            Sku("sku"),
            Tax("tax"),
            Shipping("shipping");
            
            private final String code;

            private Type(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        public LineItem(Type type, String str, int i) {
            this(type, str, i, (Integer) null, 8, (f) null);
        }

        public LineItem(Type type, String str, int i, Integer num) {
            i.e(type, "itemType");
            i.e(str, "itemDescription");
            this.itemType = type;
            this.itemDescription = str;
            this.totalAmount = i;
            this.quantity = num;
        }

        public static /* synthetic */ LineItem copy$default(LineItem lineItem, Type type, String str, int i, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                type = lineItem.itemType;
            }
            if ((i2 & 2) != 0) {
                str = lineItem.itemDescription;
            }
            if ((i2 & 4) != 0) {
                i = lineItem.totalAmount;
            }
            if ((i2 & 8) != 0) {
                num = lineItem.quantity;
            }
            return lineItem.copy(type, str, i, num);
        }

        public final Type component1() {
            return this.itemType;
        }

        public final String component2() {
            return this.itemDescription;
        }

        public final int component3() {
            return this.totalAmount;
        }

        public final Integer component4() {
            return this.quantity;
        }

        public final LineItem copy(Type type, String str, int i, Integer num) {
            i.e(type, "itemType");
            i.e(str, "itemDescription");
            return new LineItem(type, str, i, num);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LineItem)) {
                return false;
            }
            LineItem lineItem = (LineItem) obj;
            return i.a(this.itemType, lineItem.itemType) && i.a(this.itemDescription, lineItem.itemDescription) && this.totalAmount == lineItem.totalAmount && i.a(this.quantity, lineItem.quantity);
        }

        public final String getItemDescription() {
            return this.itemDescription;
        }

        public final Type getItemType() {
            return this.itemType;
        }

        public final Integer getQuantity() {
            return this.quantity;
        }

        public final int getTotalAmount() {
            return this.totalAmount;
        }

        public int hashCode() {
            Type type = this.itemType;
            int i = 0;
            int hashCode = (type != null ? type.hashCode() : 0) * 31;
            String str = this.itemDescription;
            int M = a.M(this.totalAmount, (hashCode + (str != null ? str.hashCode() : 0)) * 31, 31);
            Integer num = this.quantity;
            if (num != null) {
                i = num.hashCode();
            }
            return M + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("LineItem(itemType=");
            P0.append(this.itemType);
            P0.append(", itemDescription=");
            P0.append(this.itemDescription);
            P0.append(", totalAmount=");
            P0.append(this.totalAmount);
            P0.append(", quantity=");
            P0.append(this.quantity);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            int i2;
            i.e(parcel, "parcel");
            parcel.writeString(this.itemType.name());
            parcel.writeString(this.itemDescription);
            parcel.writeInt(this.totalAmount);
            Integer num = this.quantity;
            if (num != null) {
                parcel.writeInt(1);
                i2 = num.intValue();
            } else {
                i2 = 0;
            }
            parcel.writeInt(i2);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ LineItem(Type type, String str, int i, Integer num, int i2, f fVar) {
            this(type, str, i, (i2 & 8) != 0 ? null : num);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\b\u0018\u0000 ,2\u00020\u00012\u00020\u0002:\u0002,-B7\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b*\u0010+J\u001b\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ\u0012\u0010\r\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ@\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010\tR\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u0010\u0010$\u001a\u0004\b&\u0010\tR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00048\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b'\u0010\tR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\f8\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010(\u001a\u0004\b)\u0010\u000e¨\u0006."}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "Lcom/stripe/android/model/StripeParamsModel;", "Landroid/os/Parcelable;", "", "", "", "toParamMap", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;", "component4", "()Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;", "logoUrl", "backgroundImageUrl", "pageTitle", "purchaseType", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;)Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPageTitle", "getBackgroundImageUrl", "getLogoUrl", "Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;", "getPurchaseType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;)V", "Companion", "PurchaseType", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: KlarnaSourceParams.kt */
    public static final class PaymentPageOptions implements StripeParamsModel, Parcelable {
        public static final Parcelable.Creator<PaymentPageOptions> CREATOR = new Creator();
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String PARAM_BACKGROUND_IMAGE_URL = "background_image_url";
        @Deprecated
        private static final String PARAM_LOGO_URL = "logo_url";
        @Deprecated
        private static final String PARAM_PAGE_TITLE = "page_title";
        @Deprecated
        private static final String PARAM_PURCHASE_TYPE = "purchase_type";
        private final String backgroundImageUrl;
        private final String logoUrl;
        private final String pageTitle;
        private final PurchaseType purchaseType;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u0016\u0010\u0007\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$Companion;", "", "", "PARAM_BACKGROUND_IMAGE_URL", "Ljava/lang/String;", "PARAM_LOGO_URL", "PARAM_PAGE_TITLE", "PARAM_PURCHASE_TYPE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: KlarnaSourceParams.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<PaymentPageOptions> {
            public final PaymentPageOptions createFromParcel(Parcel parcel) {
                PurchaseType purchaseType;
                i.e(parcel, "in");
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                String readString3 = parcel.readString();
                if (parcel.readInt() != 0) {
                    purchaseType = (PurchaseType) Enum.valueOf(PurchaseType.class, parcel.readString());
                } else {
                    purchaseType = null;
                }
                return new PaymentPageOptions(readString, readString2, readString3, purchaseType);
            }

            public final PaymentPageOptions[] newArray(int i) {
                return new PaymentPageOptions[i];
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/KlarnaSourceParams$PaymentPageOptions$PurchaseType;", "", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Buy", "Rent", "Book", "Subscribe", "Download", "Order", "Continue", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: KlarnaSourceParams.kt */
        public enum PurchaseType {
            Buy("buy"),
            Rent("rent"),
            Book("book"),
            Subscribe("subscribe"),
            Download("download"),
            Order("order"),
            Continue("continue");
            
            private final String code;

            private PurchaseType(String str) {
                this.code = str;
            }

            public final String getCode() {
                return this.code;
            }
        }

        public PaymentPageOptions() {
            this((String) null, (String) null, (String) null, (PurchaseType) null, 15, (f) null);
        }

        public PaymentPageOptions(String str, String str2, String str3, PurchaseType purchaseType2) {
            this.logoUrl = str;
            this.backgroundImageUrl = str2;
            this.pageTitle = str3;
            this.purchaseType = purchaseType2;
        }

        public static /* synthetic */ PaymentPageOptions copy$default(PaymentPageOptions paymentPageOptions, String str, String str2, String str3, PurchaseType purchaseType2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = paymentPageOptions.logoUrl;
            }
            if ((i & 2) != 0) {
                str2 = paymentPageOptions.backgroundImageUrl;
            }
            if ((i & 4) != 0) {
                str3 = paymentPageOptions.pageTitle;
            }
            if ((i & 8) != 0) {
                purchaseType2 = paymentPageOptions.purchaseType;
            }
            return paymentPageOptions.copy(str, str2, str3, purchaseType2);
        }

        public final String component1() {
            return this.logoUrl;
        }

        public final String component2() {
            return this.backgroundImageUrl;
        }

        public final String component3() {
            return this.pageTitle;
        }

        public final PurchaseType component4() {
            return this.purchaseType;
        }

        public final PaymentPageOptions copy(String str, String str2, String str3, PurchaseType purchaseType2) {
            return new PaymentPageOptions(str, str2, str3, purchaseType2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof PaymentPageOptions)) {
                return false;
            }
            PaymentPageOptions paymentPageOptions = (PaymentPageOptions) obj;
            return i.a(this.logoUrl, paymentPageOptions.logoUrl) && i.a(this.backgroundImageUrl, paymentPageOptions.backgroundImageUrl) && i.a(this.pageTitle, paymentPageOptions.pageTitle) && i.a(this.purchaseType, paymentPageOptions.purchaseType);
        }

        public final String getBackgroundImageUrl() {
            return this.backgroundImageUrl;
        }

        public final String getLogoUrl() {
            return this.logoUrl;
        }

        public final String getPageTitle() {
            return this.pageTitle;
        }

        public final PurchaseType getPurchaseType() {
            return this.purchaseType;
        }

        public int hashCode() {
            String str = this.logoUrl;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.backgroundImageUrl;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.pageTitle;
            int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
            PurchaseType purchaseType2 = this.purchaseType;
            if (purchaseType2 != null) {
                i = purchaseType2.hashCode();
            }
            return hashCode3 + i;
        }

        public Map<String, Object> toParamMap() {
            Map o = g.o();
            String str = this.logoUrl;
            Map map = null;
            Map S2 = str != null ? h.S2(new Pair(PARAM_LOGO_URL, str)) : null;
            if (S2 == null) {
                S2 = g.o();
            }
            Map b0 = g.b0(o, S2);
            String str2 = this.backgroundImageUrl;
            Map S22 = str2 != null ? h.S2(new Pair(PARAM_BACKGROUND_IMAGE_URL, str2)) : null;
            if (S22 == null) {
                S22 = g.o();
            }
            Map b02 = g.b0(b0, S22);
            String str3 = this.pageTitle;
            Map S23 = str3 != null ? h.S2(new Pair(PARAM_PAGE_TITLE, str3)) : null;
            if (S23 == null) {
                S23 = g.o();
            }
            Map b03 = g.b0(b02, S23);
            PurchaseType purchaseType2 = this.purchaseType;
            if (purchaseType2 != null) {
                map = h.S2(new Pair(PARAM_PURCHASE_TYPE, purchaseType2.getCode()));
            }
            if (map == null) {
                map = g.o();
            }
            return g.b0(b03, map);
        }

        public String toString() {
            StringBuilder P0 = a.P0("PaymentPageOptions(logoUrl=");
            P0.append(this.logoUrl);
            P0.append(", backgroundImageUrl=");
            P0.append(this.backgroundImageUrl);
            P0.append(", pageTitle=");
            P0.append(this.pageTitle);
            P0.append(", purchaseType=");
            P0.append(this.purchaseType);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.logoUrl);
            parcel.writeString(this.backgroundImageUrl);
            parcel.writeString(this.pageTitle);
            PurchaseType purchaseType2 = this.purchaseType;
            if (purchaseType2 != null) {
                parcel.writeInt(1);
                parcel.writeString(purchaseType2.name());
                return;
            }
            parcel.writeInt(0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ PaymentPageOptions(String str, String str2, String str3, PurchaseType purchaseType2, int i, f fVar) {
            this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : purchaseType2);
        }
    }

    public KlarnaSourceParams(String str, List<LineItem> list) {
        this(str, list, (Set) null, (String) null, (String) null, (Address) null, (String) null, (String) null, (DateOfBirth) null, (PaymentPageOptions) null, Constants.WARN_ADM_PLAYOUT_ABNORMAL_FREQUENCY, (f) null);
    }

    public KlarnaSourceParams(String str, List<LineItem> list, Set<? extends CustomPaymentMethods> set) {
        this(str, list, set, (String) null, (String) null, (Address) null, (String) null, (String) null, (DateOfBirth) null, (PaymentPageOptions) null, 1016, (f) null);
    }

    public KlarnaSourceParams(String str, List<LineItem> list, Set<? extends CustomPaymentMethods> set, String str2) {
        this(str, list, set, str2, (String) null, (Address) null, (String) null, (String) null, (DateOfBirth) null, (PaymentPageOptions) null, 1008, (f) null);
    }

    public KlarnaSourceParams(String str, List<LineItem> list, Set<? extends CustomPaymentMethods> set, String str2, String str3) {
        this(str, list, set, str2, str3, (Address) null, (String) null, (String) null, (DateOfBirth) null, (PaymentPageOptions) null, 992, (f) null);
    }

    public KlarnaSourceParams(String str, List<LineItem> list, Set<? extends CustomPaymentMethods> set, String str2, String str3, Address address) {
        this(str, list, set, str2, str3, address, (String) null, (String) null, (DateOfBirth) null, (PaymentPageOptions) null, 960, (f) null);
    }

    public KlarnaSourceParams(String str, List<LineItem> list, Set<? extends CustomPaymentMethods> set, String str2, String str3, Address address, String str4) {
        this(str, list, set, str2, str3, address, str4, (String) null, (DateOfBirth) null, (PaymentPageOptions) null, 896, (f) null);
    }

    public KlarnaSourceParams(String str, List<LineItem> list, Set<? extends CustomPaymentMethods> set, String str2, String str3, Address address, String str4, String str5) {
        this(str, list, set, str2, str3, address, str4, str5, (DateOfBirth) null, (PaymentPageOptions) null, 768, (f) null);
    }

    public KlarnaSourceParams(String str, List<LineItem> list, Set<? extends CustomPaymentMethods> set, String str2, String str3, Address address, String str4, String str5, DateOfBirth dateOfBirth) {
        this(str, list, set, str2, str3, address, str4, str5, dateOfBirth, (PaymentPageOptions) null, 512, (f) null);
    }

    public KlarnaSourceParams(String str, List<LineItem> list, Set<? extends CustomPaymentMethods> set, String str2, String str3, Address address, String str4, String str5, DateOfBirth dateOfBirth, PaymentPageOptions paymentPageOptions) {
        i.e(str, "purchaseCountry");
        i.e(list, "lineItems");
        i.e(set, "customPaymentMethods");
        this.purchaseCountry = str;
        this.lineItems = list;
        this.customPaymentMethods = set;
        this.billingEmail = str2;
        this.billingPhone = str3;
        this.billingAddress = address;
        this.billingFirstName = str4;
        this.billingLastName = str5;
        this.billingDob = dateOfBirth;
        this.pageOptions = paymentPageOptions;
    }

    public static /* synthetic */ KlarnaSourceParams copy$default(KlarnaSourceParams klarnaSourceParams, String str, List list, Set set, String str2, String str3, Address address, String str4, String str5, DateOfBirth dateOfBirth, PaymentPageOptions paymentPageOptions, int i, Object obj) {
        KlarnaSourceParams klarnaSourceParams2 = klarnaSourceParams;
        int i2 = i;
        return klarnaSourceParams.copy((i2 & 1) != 0 ? klarnaSourceParams2.purchaseCountry : str, (i2 & 2) != 0 ? klarnaSourceParams2.lineItems : list, (i2 & 4) != 0 ? klarnaSourceParams2.customPaymentMethods : set, (i2 & 8) != 0 ? klarnaSourceParams2.billingEmail : str2, (i2 & 16) != 0 ? klarnaSourceParams2.billingPhone : str3, (i2 & 32) != 0 ? klarnaSourceParams2.billingAddress : address, (i2 & 64) != 0 ? klarnaSourceParams2.billingFirstName : str4, (i2 & 128) != 0 ? klarnaSourceParams2.billingLastName : str5, (i2 & 256) != 0 ? klarnaSourceParams2.billingDob : dateOfBirth, (i2 & 512) != 0 ? klarnaSourceParams2.pageOptions : paymentPageOptions);
    }

    public final String component1() {
        return this.purchaseCountry;
    }

    public final PaymentPageOptions component10() {
        return this.pageOptions;
    }

    public final List<LineItem> component2() {
        return this.lineItems;
    }

    public final Set<CustomPaymentMethods> component3() {
        return this.customPaymentMethods;
    }

    public final String component4() {
        return this.billingEmail;
    }

    public final String component5() {
        return this.billingPhone;
    }

    public final Address component6() {
        return this.billingAddress;
    }

    public final String component7() {
        return this.billingFirstName;
    }

    public final String component8() {
        return this.billingLastName;
    }

    public final DateOfBirth component9() {
        return this.billingDob;
    }

    public final KlarnaSourceParams copy(String str, List<LineItem> list, Set<? extends CustomPaymentMethods> set, String str2, String str3, Address address, String str4, String str5, DateOfBirth dateOfBirth, PaymentPageOptions paymentPageOptions) {
        i.e(str, "purchaseCountry");
        i.e(list, "lineItems");
        i.e(set, "customPaymentMethods");
        return new KlarnaSourceParams(str, list, set, str2, str3, address, str4, str5, dateOfBirth, paymentPageOptions);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KlarnaSourceParams)) {
            return false;
        }
        KlarnaSourceParams klarnaSourceParams = (KlarnaSourceParams) obj;
        return i.a(this.purchaseCountry, klarnaSourceParams.purchaseCountry) && i.a(this.lineItems, klarnaSourceParams.lineItems) && i.a(this.customPaymentMethods, klarnaSourceParams.customPaymentMethods) && i.a(this.billingEmail, klarnaSourceParams.billingEmail) && i.a(this.billingPhone, klarnaSourceParams.billingPhone) && i.a(this.billingAddress, klarnaSourceParams.billingAddress) && i.a(this.billingFirstName, klarnaSourceParams.billingFirstName) && i.a(this.billingLastName, klarnaSourceParams.billingLastName) && i.a(this.billingDob, klarnaSourceParams.billingDob) && i.a(this.pageOptions, klarnaSourceParams.pageOptions);
    }

    public final Address getBillingAddress() {
        return this.billingAddress;
    }

    public final DateOfBirth getBillingDob() {
        return this.billingDob;
    }

    public final String getBillingEmail() {
        return this.billingEmail;
    }

    public final String getBillingFirstName() {
        return this.billingFirstName;
    }

    public final String getBillingLastName() {
        return this.billingLastName;
    }

    public final String getBillingPhone() {
        return this.billingPhone;
    }

    public final Set<CustomPaymentMethods> getCustomPaymentMethods() {
        return this.customPaymentMethods;
    }

    public final List<LineItem> getLineItems() {
        return this.lineItems;
    }

    public final PaymentPageOptions getPageOptions() {
        return this.pageOptions;
    }

    public final String getPurchaseCountry() {
        return this.purchaseCountry;
    }

    public int hashCode() {
        String str = this.purchaseCountry;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        List<LineItem> list = this.lineItems;
        int hashCode2 = (hashCode + (list != null ? list.hashCode() : 0)) * 31;
        Set<CustomPaymentMethods> set = this.customPaymentMethods;
        int hashCode3 = (hashCode2 + (set != null ? set.hashCode() : 0)) * 31;
        String str2 = this.billingEmail;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.billingPhone;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Address address = this.billingAddress;
        int hashCode6 = (hashCode5 + (address != null ? address.hashCode() : 0)) * 31;
        String str4 = this.billingFirstName;
        int hashCode7 = (hashCode6 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.billingLastName;
        int hashCode8 = (hashCode7 + (str5 != null ? str5.hashCode() : 0)) * 31;
        DateOfBirth dateOfBirth = this.billingDob;
        int hashCode9 = (hashCode8 + (dateOfBirth != null ? dateOfBirth.hashCode() : 0)) * 31;
        PaymentPageOptions paymentPageOptions = this.pageOptions;
        if (paymentPageOptions != null) {
            i = paymentPageOptions.hashCode();
        }
        return hashCode9 + i;
    }

    public Map<String, Object> toParamMap() {
        Map N = g.N(new Pair(PARAM_PRODUCT, "payment"), new Pair(PARAM_PURCHASE_COUNTRY, this.purchaseCountry));
        Set<CustomPaymentMethods> set = this.customPaymentMethods;
        Map map = null;
        if (!(!set.isEmpty())) {
            set = null;
        }
        Map S2 = set != null ? h.S2(new Pair(PARAM_CUSTOM_PAYMENT_METHODS, g.E(g.n0(g.v0(set), new KlarnaSourceParams$$special$$inlined$sortedBy$1()), InstabugDbContract.COMMA_SEP, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, KlarnaSourceParams$toParamMap$2$2.INSTANCE, 30))) : null;
        if (S2 == null) {
            S2 = g.o();
        }
        Map b0 = g.b0(N, S2);
        String str = this.billingFirstName;
        Map S22 = str != null ? h.S2(new Pair(PARAM_FIRST_NAME, str)) : null;
        if (S22 == null) {
            S22 = g.o();
        }
        Map b02 = g.b0(b0, S22);
        String str2 = this.billingLastName;
        Map S23 = str2 != null ? h.S2(new Pair(PARAM_LAST_NAME, str2)) : null;
        if (S23 == null) {
            S23 = g.o();
        }
        Map b03 = g.b0(b02, S23);
        DateOfBirth dateOfBirth = this.billingDob;
        if (dateOfBirth != null) {
            map = g.N(new Pair(PARAM_DOB_DAY, StringsKt__IndentKt.t(String.valueOf(dateOfBirth.getDay()), 2, '0')), new Pair(PARAM_DOB_MONTH, StringsKt__IndentKt.t(String.valueOf(dateOfBirth.getMonth()), 2, '0')), new Pair(PARAM_DOB_YEAR, String.valueOf(dateOfBirth.getYear())));
        }
        if (map == null) {
            map = g.o();
        }
        return g.b0(b03, map);
    }

    public String toString() {
        StringBuilder P0 = a.P0("KlarnaSourceParams(purchaseCountry=");
        P0.append(this.purchaseCountry);
        P0.append(", lineItems=");
        P0.append(this.lineItems);
        P0.append(", customPaymentMethods=");
        P0.append(this.customPaymentMethods);
        P0.append(", billingEmail=");
        P0.append(this.billingEmail);
        P0.append(", billingPhone=");
        P0.append(this.billingPhone);
        P0.append(", billingAddress=");
        P0.append(this.billingAddress);
        P0.append(", billingFirstName=");
        P0.append(this.billingFirstName);
        P0.append(", billingLastName=");
        P0.append(this.billingLastName);
        P0.append(", billingDob=");
        P0.append(this.billingDob);
        P0.append(", pageOptions=");
        P0.append(this.pageOptions);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.purchaseCountry);
        List<LineItem> list = this.lineItems;
        parcel.writeInt(list.size());
        for (LineItem writeToParcel : list) {
            writeToParcel.writeToParcel(parcel, 0);
        }
        Set<CustomPaymentMethods> set = this.customPaymentMethods;
        parcel.writeInt(set.size());
        for (CustomPaymentMethods name : set) {
            parcel.writeString(name.name());
        }
        parcel.writeString(this.billingEmail);
        parcel.writeString(this.billingPhone);
        Address address = this.billingAddress;
        if (address != null) {
            parcel.writeInt(1);
            address.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeString(this.billingFirstName);
        parcel.writeString(this.billingLastName);
        DateOfBirth dateOfBirth = this.billingDob;
        if (dateOfBirth != null) {
            parcel.writeInt(1);
            dateOfBirth.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        PaymentPageOptions paymentPageOptions = this.pageOptions;
        if (paymentPageOptions != null) {
            parcel.writeInt(1);
            paymentPageOptions.writeToParcel(parcel, 0);
            return;
        }
        parcel.writeInt(0);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public KlarnaSourceParams(java.lang.String r14, java.util.List r15, java.util.Set r16, java.lang.String r17, java.lang.String r18, com.stripe.android.model.Address r19, java.lang.String r20, java.lang.String r21, com.stripe.android.model.DateOfBirth r22, com.stripe.android.model.KlarnaSourceParams.PaymentPageOptions r23, int r24, m0.n.b.f r25) {
        /*
            r13 = this;
            r0 = r24
            r1 = r0 & 4
            if (r1 == 0) goto L_0x000a
            kotlin.collections.EmptySet r1 = kotlin.collections.EmptySet.c
            r5 = r1
            goto L_0x000c
        L_0x000a:
            r5 = r16
        L_0x000c:
            r1 = r0 & 8
            r2 = 0
            if (r1 == 0) goto L_0x0013
            r6 = r2
            goto L_0x0015
        L_0x0013:
            r6 = r17
        L_0x0015:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x001b
            r7 = r2
            goto L_0x001d
        L_0x001b:
            r7 = r18
        L_0x001d:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0023
            r8 = r2
            goto L_0x0025
        L_0x0023:
            r8 = r19
        L_0x0025:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x002b
            r9 = r2
            goto L_0x002d
        L_0x002b:
            r9 = r20
        L_0x002d:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0033
            r10 = r2
            goto L_0x0035
        L_0x0033:
            r10 = r21
        L_0x0035:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003b
            r11 = r2
            goto L_0x003d
        L_0x003b:
            r11 = r22
        L_0x003d:
            r0 = r0 & 512(0x200, float:7.175E-43)
            if (r0 == 0) goto L_0x0043
            r12 = r2
            goto L_0x0045
        L_0x0043:
            r12 = r23
        L_0x0045:
            r2 = r13
            r3 = r14
            r4 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.model.KlarnaSourceParams.<init>(java.lang.String, java.util.List, java.util.Set, java.lang.String, java.lang.String, com.stripe.android.model.Address, java.lang.String, java.lang.String, com.stripe.android.model.DateOfBirth, com.stripe.android.model.KlarnaSourceParams$PaymentPageOptions, int, m0.n.b.f):void");
    }
}
