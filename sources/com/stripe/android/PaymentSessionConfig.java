package com.stripe.android;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import com.stripe.android.view.BillingAddressFields;
import com.stripe.android.view.ShippingInfoWidget;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b!\b\b\u0018\u0000 c2\u00020\u0001:\u0005dcefgBÇ\u0001\b\u0000\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010-\u001a\u00020\n\u0012\b\b\u0002\u0010.\u001a\u00020\n\u0012\b\b\u0003\u0010/\u001a\u00020\u000e\u0012\b\b\u0003\u00100\u001a\u00020\u000e\u0012\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002\u0012\b\b\u0002\u00102\u001a\u00020\n\u0012\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015\u0012\b\b\u0002\u00104\u001a\u00020\u0019\u0012\b\b\u0002\u00105\u001a\u00020\n\u0012\b\b\u0002\u00106\u001a\u00020\n\u0012\b\b\u0002\u00107\u001a\u00020\u001f\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\ba\u0010bJ\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0005J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000f\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0005J\u0010\u0010\u0014\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0014\u0010\fJ\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00160\u0015HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\fJ\u0010\u0010\u001e\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\u001d\u0010\fJ\u0010\u0010\"\u001a\u00020\u001fHÀ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010#HÀ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010)\u001a\u0004\u0018\u00010\u000eHÀ\u0003¢\u0006\u0004\b'\u0010(JÎ\u0001\u0010:\u001a\u00020\u00002\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010-\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\n2\b\b\u0003\u0010/\u001a\u00020\u000e2\b\b\u0003\u00100\u001a\u00020\u000e2\u000e\b\u0002\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120\u00022\b\b\u0002\u00102\u001a\u00020\n2\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u00152\b\b\u0002\u00104\u001a\u00020\u00192\b\b\u0002\u00105\u001a\u00020\n2\b\b\u0002\u00106\u001a\u00020\n2\b\b\u0002\u00107\u001a\u00020\u001f2\n\b\u0002\u00108\u001a\u0004\u0018\u00010#2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b:\u0010;J\u0010\u0010<\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b<\u0010=J\u0010\u0010>\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b>\u0010\u0010J\u001a\u0010A\u001a\u00020\n2\b\u0010@\u001a\u0004\u0018\u00010?HÖ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\bC\u0010\u0010J \u0010H\u001a\u00020G2\u0006\u0010E\u001a\u00020D2\u0006\u0010F\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\bH\u0010IR\u0019\u0010/\u001a\u00020\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b/\u0010J\u001a\u0004\bK\u0010\u0010R\u0019\u00102\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b2\u0010L\u001a\u0004\bM\u0010\fR\u0019\u00100\u001a\u00020\u000e8\u0007@\u0006¢\u0006\f\n\u0004\b0\u0010J\u001a\u0004\bN\u0010\u0010R\u001c\u00106\u001a\u00020\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b6\u0010L\u001a\u0004\bO\u0010\fR\u0019\u00104\u001a\u00020\u00198\u0006@\u0006¢\u0006\f\n\u0004\b4\u0010P\u001a\u0004\bQ\u0010\u001bR\u001c\u00107\u001a\u00020\u001f8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b7\u0010R\u001a\u0004\bS\u0010!R\u001b\u0010,\u001a\u0004\u0018\u00010\u00078\u0006@\u0006¢\u0006\f\n\u0004\b,\u0010T\u001a\u0004\bU\u0010\tR\u0019\u00105\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b5\u0010L\u001a\u0004\bV\u0010\fR\u001f\u00101\u001a\b\u0012\u0004\u0012\u00020\u00120\u00028\u0006@\u0006¢\u0006\f\n\u0004\b1\u0010W\u001a\u0004\bX\u0010\u0005R\u001e\u00108\u001a\u0004\u0018\u00010#8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b8\u0010Y\u001a\u0004\bZ\u0010%R\u0019\u0010.\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b.\u0010L\u001a\u0004\b.\u0010\fR\u001f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b+\u0010W\u001a\u0004\b[\u0010\u0005R\u001f\u00103\u001a\b\u0012\u0004\u0012\u00020\u00160\u00158\u0006@\u0006¢\u0006\f\n\u0004\b3\u0010\\\u001a\u0004\b]\u0010\u0018R\u0019\u0010-\u001a\u00020\n8\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010L\u001a\u0004\b-\u0010\fR\u001e\u00109\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b9\u0010^\u001a\u0004\b_\u0010(R\u001f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b*\u0010W\u001a\u0004\b`\u0010\u0005¨\u0006h"}, d2 = {"Lcom/stripe/android/PaymentSessionConfig;", "Landroid/os/Parcelable;", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "component1", "()Ljava/util/List;", "component2", "Lcom/stripe/android/model/ShippingInformation;", "component3", "()Lcom/stripe/android/model/ShippingInformation;", "", "component4", "()Z", "component5", "", "component6", "()I", "component7", "Lcom/stripe/android/model/PaymentMethod$Type;", "component8", "component9", "", "", "component10", "()Ljava/util/Set;", "Lcom/stripe/android/view/BillingAddressFields;", "component11", "()Lcom/stripe/android/view/BillingAddressFields;", "component12", "component13$payments_core_release", "component13", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "component14$payments_core_release", "()Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "component14", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "component15$payments_core_release", "()Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "component15", "component16$payments_core_release", "()Ljava/lang/Integer;", "component16", "hiddenShippingInfoFields", "optionalShippingInfoFields", "prepopulatedShippingInfo", "isShippingInfoRequired", "isShippingMethodRequired", "paymentMethodsFooterLayoutId", "addPaymentMethodFooterLayoutId", "paymentMethodTypes", "shouldShowGooglePay", "allowedShippingCountryCodes", "billingAddressFields", "canDeletePaymentMethods", "shouldPrefetchCustomer", "shippingInformationValidator", "shippingMethodsFactory", "windowFlags", "copy", "(Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/ShippingInformation;ZZIILjava/util/List;ZLjava/util/Set;Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Ljava/lang/Integer;)Lcom/stripe/android/PaymentSessionConfig;", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getPaymentMethodsFooterLayoutId", "Z", "getShouldShowGooglePay", "getAddPaymentMethodFooterLayoutId", "getShouldPrefetchCustomer$payments_core_release", "Lcom/stripe/android/view/BillingAddressFields;", "getBillingAddressFields", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "getShippingInformationValidator$payments_core_release", "Lcom/stripe/android/model/ShippingInformation;", "getPrepopulatedShippingInfo", "getCanDeletePaymentMethods", "Ljava/util/List;", "getPaymentMethodTypes", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "getShippingMethodsFactory$payments_core_release", "getOptionalShippingInfoFields", "Ljava/util/Set;", "getAllowedShippingCountryCodes", "Ljava/lang/Integer;", "getWindowFlags$payments_core_release", "getHiddenShippingInfoFields", "<init>", "(Ljava/util/List;Ljava/util/List;Lcom/stripe/android/model/ShippingInformation;ZZIILjava/util/List;ZLjava/util/Set;Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;Ljava/lang/Integer;)V", "Companion", "Builder", "DefaultShippingInfoValidator", "ShippingInformationValidator", "ShippingMethodsFactory", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSessionConfig.kt */
public final class PaymentSessionConfig implements Parcelable {
    public static final Parcelable.Creator<PaymentSessionConfig> CREATOR = new Creator();
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    @Deprecated
    public static final BillingAddressFields DEFAULT_BILLING_ADDRESS_FIELDS = BillingAddressFields.PostalCode;
    private final int addPaymentMethodFooterLayoutId;
    private final Set<String> allowedShippingCountryCodes;
    private final BillingAddressFields billingAddressFields;
    private final boolean canDeletePaymentMethods;
    private final List<ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields;
    private final boolean isShippingInfoRequired;
    private final boolean isShippingMethodRequired;
    private final List<ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields;
    private final List<PaymentMethod.Type> paymentMethodTypes;
    private final int paymentMethodsFooterLayoutId;
    private final ShippingInformation prepopulatedShippingInfo;
    private final ShippingInformationValidator shippingInformationValidator;
    private final ShippingMethodsFactory shippingMethodsFactory;
    private final boolean shouldPrefetchCustomer;
    private final boolean shouldShowGooglePay;
    private final Integer windowFlags;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0014\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\bE\u0010FJ\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u00020\u00002\u0012\u0010\t\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\u00002\u0012\u0010\f\u001a\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0007\"\u00020\b¢\u0006\u0004\b\r\u0010\u000bJ\u0017\u0010\u0010\u001a\u00020\u00002\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00002\b\b\u0001\u0010\u001c\u001a\u00020\u0018¢\u0006\u0004\b\u001d\u0010\u001bJ\u001b\u0010!\u001a\u00020\u00002\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u0012¢\u0006\u0004\b$\u0010\u0015J\u0015\u0010&\u001a\u00020\u00002\u0006\u0010%\u001a\u00020\u0012¢\u0006\u0004\b&\u0010\u0015J\u001b\u0010*\u001a\u00020\u00002\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u00002\b\u0010,\u001a\u0004\u0018\u00010\u0018¢\u0006\u0004\b-\u0010.J\u0017\u00101\u001a\u00020\u00002\b\u00100\u001a\u0004\u0018\u00010/¢\u0006\u0004\b1\u00102J\u0017\u00105\u001a\u00020\u00002\b\u00104\u001a\u0004\u0018\u000103¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\u00002\u0006\u00107\u001a\u00020\u0012¢\u0006\u0004\b8\u0010\u0015J\u000f\u00109\u001a\u00020\u0002H\u0016¢\u0006\u0004\b9\u0010:R\u0016\u0010%\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b%\u0010;R\u001c\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010<R\u0018\u00100\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b0\u0010=R\u0018\u00104\u001a\u0004\u0018\u0001038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b4\u0010>R\u001c\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b)\u0010?R\u0016\u0010\u0019\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010@R\u001e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010<R\u0016\u0010\u001c\u001a\u00020\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010@R\u0018\u0010A\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u001e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\t\u0010<R\u0016\u00107\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b7\u0010;R\u0016\u0010#\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010;R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010;R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010CR\u0016\u0010\u0016\u001a\u00020\u00128\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010;R\u0018\u0010,\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010D¨\u0006G"}, d2 = {"Lcom/stripe/android/PaymentSessionConfig$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/PaymentSessionConfig;", "Lcom/stripe/android/view/BillingAddressFields;", "billingAddressFields", "setBillingAddressFields", "(Lcom/stripe/android/view/BillingAddressFields;)Lcom/stripe/android/PaymentSessionConfig$Builder;", "", "Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;", "hiddenShippingInfoFields", "setHiddenShippingInfoFields", "([Lcom/stripe/android/view/ShippingInfoWidget$CustomizableShippingField;)Lcom/stripe/android/PaymentSessionConfig$Builder;", "optionalShippingInfoFields", "setOptionalShippingInfoFields", "Lcom/stripe/android/model/ShippingInformation;", "shippingInfo", "setPrepopulatedShippingInfo", "(Lcom/stripe/android/model/ShippingInformation;)Lcom/stripe/android/PaymentSessionConfig$Builder;", "", "shippingInfoRequired", "setShippingInfoRequired", "(Z)Lcom/stripe/android/PaymentSessionConfig$Builder;", "shippingMethodsRequired", "setShippingMethodsRequired", "", "paymentMethodsFooterLayoutId", "setPaymentMethodsFooter", "(I)Lcom/stripe/android/PaymentSessionConfig$Builder;", "addPaymentMethodFooterLayoutId", "setAddPaymentMethodFooter", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodTypes", "setPaymentMethodTypes", "(Ljava/util/List;)Lcom/stripe/android/PaymentSessionConfig$Builder;", "shouldShowGooglePay", "setShouldShowGooglePay", "canDeletePaymentMethods", "setCanDeletePaymentMethods", "", "", "allowedShippingCountryCodes", "setAllowedShippingCountryCodes", "(Ljava/util/Set;)Lcom/stripe/android/PaymentSessionConfig$Builder;", "windowFlags", "setWindowFlags", "(Ljava/lang/Integer;)Lcom/stripe/android/PaymentSessionConfig$Builder;", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "shippingInformationValidator", "setShippingInformationValidator", "(Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;)Lcom/stripe/android/PaymentSessionConfig$Builder;", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "shippingMethodsFactory", "setShippingMethodsFactory", "(Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;)Lcom/stripe/android/PaymentSessionConfig$Builder;", "shouldPrefetchCustomer", "setShouldPrefetchCustomer", "build", "()Lcom/stripe/android/PaymentSessionConfig;", "Z", "Ljava/util/List;", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "Ljava/util/Set;", "I", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "Lcom/stripe/android/view/BillingAddressFields;", "Ljava/lang/Integer;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSessionConfig.kt */
    public static final class Builder implements ObjectBuilder<PaymentSessionConfig> {
        private int addPaymentMethodFooterLayoutId;
        private Set<String> allowedShippingCountryCodes = EmptySet.c;
        private BillingAddressFields billingAddressFields = PaymentSessionConfig.DEFAULT_BILLING_ADDRESS_FIELDS;
        private boolean canDeletePaymentMethods = true;
        private List<? extends ShippingInfoWidget.CustomizableShippingField> hiddenShippingInfoFields;
        private List<? extends ShippingInfoWidget.CustomizableShippingField> optionalShippingInfoFields;
        private List<? extends PaymentMethod.Type> paymentMethodTypes = h.L2(PaymentMethod.Type.Card);
        private int paymentMethodsFooterLayoutId;
        private boolean shippingInfoRequired = true;
        private ShippingInformation shippingInformation;
        private ShippingInformationValidator shippingInformationValidator;
        private ShippingMethodsFactory shippingMethodsFactory;
        private boolean shippingMethodsRequired = true;
        private boolean shouldPrefetchCustomer = true;
        private boolean shouldShowGooglePay;
        private Integer windowFlags;

        public Builder() {
            Companion unused = PaymentSessionConfig.Companion;
        }

        public final Builder setAddPaymentMethodFooter(int i) {
            this.addPaymentMethodFooterLayoutId = i;
            return this;
        }

        public final Builder setAllowedShippingCountryCodes(Set<String> set) {
            i.e(set, "allowedShippingCountryCodes");
            this.allowedShippingCountryCodes = set;
            return this;
        }

        public final Builder setBillingAddressFields(BillingAddressFields billingAddressFields2) {
            i.e(billingAddressFields2, "billingAddressFields");
            this.billingAddressFields = billingAddressFields2;
            return this;
        }

        public final Builder setCanDeletePaymentMethods(boolean z) {
            this.canDeletePaymentMethods = z;
            return this;
        }

        public final Builder setHiddenShippingInfoFields(ShippingInfoWidget.CustomizableShippingField... customizableShippingFieldArr) {
            i.e(customizableShippingFieldArr, "hiddenShippingInfoFields");
            this.hiddenShippingInfoFields = g.K((ShippingInfoWidget.CustomizableShippingField[]) Arrays.copyOf(customizableShippingFieldArr, customizableShippingFieldArr.length));
            return this;
        }

        public final Builder setOptionalShippingInfoFields(ShippingInfoWidget.CustomizableShippingField... customizableShippingFieldArr) {
            i.e(customizableShippingFieldArr, "optionalShippingInfoFields");
            this.optionalShippingInfoFields = g.K((ShippingInfoWidget.CustomizableShippingField[]) Arrays.copyOf(customizableShippingFieldArr, customizableShippingFieldArr.length));
            return this;
        }

        public final Builder setPaymentMethodTypes(List<? extends PaymentMethod.Type> list) {
            i.e(list, "paymentMethodTypes");
            this.paymentMethodTypes = list;
            return this;
        }

        public final Builder setPaymentMethodsFooter(int i) {
            this.paymentMethodsFooterLayoutId = i;
            return this;
        }

        public final Builder setPrepopulatedShippingInfo(ShippingInformation shippingInformation2) {
            this.shippingInformation = shippingInformation2;
            return this;
        }

        public final Builder setShippingInfoRequired(boolean z) {
            this.shippingInfoRequired = z;
            return this;
        }

        public final Builder setShippingInformationValidator(ShippingInformationValidator shippingInformationValidator2) {
            this.shippingInformationValidator = shippingInformationValidator2;
            return this;
        }

        public final Builder setShippingMethodsFactory(ShippingMethodsFactory shippingMethodsFactory2) {
            this.shippingMethodsFactory = shippingMethodsFactory2;
            return this;
        }

        public final Builder setShippingMethodsRequired(boolean z) {
            this.shippingMethodsRequired = z;
            return this;
        }

        public final Builder setShouldPrefetchCustomer(boolean z) {
            this.shouldPrefetchCustomer = z;
            return this;
        }

        public final Builder setShouldShowGooglePay(boolean z) {
            this.shouldShowGooglePay = z;
            return this;
        }

        public final Builder setWindowFlags(Integer num) {
            this.windowFlags = num;
            return this;
        }

        public PaymentSessionConfig build() {
            List list = this.hiddenShippingInfoFields;
            if (list == null) {
                list = EmptyList.c;
            }
            List list2 = list;
            List list3 = this.optionalShippingInfoFields;
            if (list3 == null) {
                list3 = EmptyList.c;
            }
            List list4 = list3;
            ShippingInformation shippingInformation2 = this.shippingInformation;
            boolean z = this.shippingInfoRequired;
            boolean z2 = this.shippingMethodsRequired;
            int i = this.paymentMethodsFooterLayoutId;
            int i2 = this.addPaymentMethodFooterLayoutId;
            List<? extends PaymentMethod.Type> list5 = this.paymentMethodTypes;
            boolean z3 = this.shouldShowGooglePay;
            Set<String> set = this.allowedShippingCountryCodes;
            ShippingInformationValidator shippingInformationValidator2 = this.shippingInformationValidator;
            if (shippingInformationValidator2 == null) {
                shippingInformationValidator2 = new DefaultShippingInfoValidator();
            }
            BillingAddressFields billingAddressFields2 = this.billingAddressFields;
            boolean z4 = this.shouldPrefetchCustomer;
            return new PaymentSessionConfig(list2, list4, shippingInformation2, z, z2, i, i2, list5, z3, set, billingAddressFields2, this.canDeletePaymentMethods, z4, shippingInformationValidator2, this.shippingMethodsFactory, this.windowFlags);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/PaymentSessionConfig$Companion;", "", "Lcom/stripe/android/view/BillingAddressFields;", "DEFAULT_BILLING_ADDRESS_FIELDS", "Lcom/stripe/android/view/BillingAddressFields;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSessionConfig.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<PaymentSessionConfig> {
        public final PaymentSessionConfig createFromParcel(Parcel parcel) {
            String readString;
            Parcel parcel2 = parcel;
            Class cls = ShippingInfoWidget.CustomizableShippingField.class;
            i.e(parcel2, "in");
            int readInt = parcel.readInt();
            ArrayList arrayList = new ArrayList(readInt);
            while (readInt != 0) {
                arrayList.add((ShippingInfoWidget.CustomizableShippingField) Enum.valueOf(cls, parcel.readString()));
                readInt--;
            }
            int readInt2 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(readInt2);
            while (readInt2 != 0) {
                arrayList2.add((ShippingInfoWidget.CustomizableShippingField) Enum.valueOf(cls, parcel.readString()));
                readInt2--;
            }
            ShippingInformation createFromParcel = parcel.readInt() != 0 ? ShippingInformation.CREATOR.createFromParcel(parcel2) : null;
            boolean z = parcel.readInt() != 0;
            boolean z2 = parcel.readInt() != 0;
            int readInt3 = parcel.readInt();
            int readInt4 = parcel.readInt();
            int readInt5 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(readInt5);
            while (readInt5 != 0) {
                arrayList3.add((PaymentMethod.Type) Enum.valueOf(PaymentMethod.Type.class, parcel.readString()));
                readInt5--;
            }
            boolean z3 = parcel.readInt() != 0;
            int readInt6 = parcel.readInt();
            LinkedHashSet linkedHashSet = new LinkedHashSet(readInt6);
            while (true) {
                readString = parcel.readString();
                if (readInt6 == 0) {
                    break;
                }
                linkedHashSet.add(readString);
                readInt6--;
            }
            return new PaymentSessionConfig(arrayList, arrayList2, createFromParcel, z, z2, readInt3, readInt4, arrayList3, z3, linkedHashSet, (BillingAddressFields) Enum.valueOf(BillingAddressFields.class, readString), parcel.readInt() != 0, parcel.readInt() != 0, (ShippingInformationValidator) parcel.readSerializable(), (ShippingMethodsFactory) parcel.readSerializable(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        public final PaymentSessionConfig[] newArray(int i) {
            return new PaymentSessionConfig[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/PaymentSessionConfig$DefaultShippingInfoValidator;", "Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "", "isValid", "(Lcom/stripe/android/model/ShippingInformation;)Z", "", "getErrorMessage", "(Lcom/stripe/android/model/ShippingInformation;)Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSessionConfig.kt */
    public static final class DefaultShippingInfoValidator implements ShippingInformationValidator {
        public String getErrorMessage(ShippingInformation shippingInformation) {
            i.e(shippingInformation, "shippingInformation");
            return "";
        }

        public boolean isValid(ShippingInformation shippingInformation) {
            i.e(shippingInformation, "shippingInformation");
            return true;
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/PaymentSessionConfig$ShippingInformationValidator;", "Ljava/io/Serializable;", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "", "isValid", "(Lcom/stripe/android/model/ShippingInformation;)Z", "", "getErrorMessage", "(Lcom/stripe/android/model/ShippingInformation;)Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSessionConfig.kt */
    public interface ShippingInformationValidator extends Serializable {
        String getErrorMessage(ShippingInformation shippingInformation);

        boolean isValid(ShippingInformation shippingInformation);
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/stripe/android/PaymentSessionConfig$ShippingMethodsFactory;", "Ljava/io/Serializable;", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "", "Lcom/stripe/android/model/ShippingMethod;", "create", "(Lcom/stripe/android/model/ShippingInformation;)Ljava/util/List;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSessionConfig.kt */
    public interface ShippingMethodsFactory extends Serializable {
        List<ShippingMethod> create(ShippingInformation shippingInformation);
    }

    public PaymentSessionConfig() {
        this((List) null, (List) null, (ShippingInformation) null, false, false, 0, 0, (List) null, false, (Set) null, (BillingAddressFields) null, false, false, (ShippingInformationValidator) null, (ShippingMethodsFactory) null, (Integer) null, 65535, (f) null);
    }

    public PaymentSessionConfig(List<? extends ShippingInfoWidget.CustomizableShippingField> list, List<? extends ShippingInfoWidget.CustomizableShippingField> list2, ShippingInformation shippingInformation, boolean z, boolean z2, int i, int i2, List<? extends PaymentMethod.Type> list3, boolean z3, Set<String> set, BillingAddressFields billingAddressFields2, boolean z4, boolean z5, ShippingInformationValidator shippingInformationValidator2, ShippingMethodsFactory shippingMethodsFactory2, Integer num) {
        List<? extends PaymentMethod.Type> list4 = list3;
        Set<String> set2 = set;
        BillingAddressFields billingAddressFields3 = billingAddressFields2;
        ShippingInformationValidator shippingInformationValidator3 = shippingInformationValidator2;
        i.e(list, "hiddenShippingInfoFields");
        i.e(list2, "optionalShippingInfoFields");
        i.e(list4, "paymentMethodTypes");
        i.e(set2, "allowedShippingCountryCodes");
        i.e(billingAddressFields3, "billingAddressFields");
        i.e(shippingInformationValidator3, "shippingInformationValidator");
        this.hiddenShippingInfoFields = list;
        this.optionalShippingInfoFields = list2;
        this.prepopulatedShippingInfo = shippingInformation;
        this.isShippingInfoRequired = z;
        this.isShippingMethodRequired = z2;
        this.paymentMethodsFooterLayoutId = i;
        this.addPaymentMethodFooterLayoutId = i2;
        this.paymentMethodTypes = list4;
        this.shouldShowGooglePay = z3;
        this.allowedShippingCountryCodes = set2;
        this.billingAddressFields = billingAddressFields3;
        this.canDeletePaymentMethods = z4;
        this.shouldPrefetchCustomer = z5;
        this.shippingInformationValidator = shippingInformationValidator3;
        this.shippingMethodsFactory = shippingMethodsFactory2;
        this.windowFlags = num;
        String[] iSOCountries = Locale.getISOCountries();
        for (String str : set) {
            i.d(iSOCountries, "countryCodes");
            int length = iSOCountries.length;
            boolean z6 = false;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                } else if (StringsKt__IndentKt.f(str, iSOCountries[i3], true)) {
                    z6 = true;
                    continue;
                    break;
                } else {
                    i3++;
                }
            }
            if (!z6) {
                throw new IllegalArgumentException(('\'' + str + "' is not a valid country code").toString());
            }
        }
        if (this.isShippingMethodRequired && this.shippingMethodsFactory == null) {
            throw new IllegalArgumentException("If isShippingMethodRequired is true a ShippingMethodsFactory must also be provided.".toString());
        }
    }

    public static /* synthetic */ PaymentSessionConfig copy$default(PaymentSessionConfig paymentSessionConfig, List list, List list2, ShippingInformation shippingInformation, boolean z, boolean z2, int i, int i2, List list3, boolean z3, Set set, BillingAddressFields billingAddressFields2, boolean z4, boolean z5, ShippingInformationValidator shippingInformationValidator2, ShippingMethodsFactory shippingMethodsFactory2, Integer num, int i3, Object obj) {
        PaymentSessionConfig paymentSessionConfig2 = paymentSessionConfig;
        int i4 = i3;
        return paymentSessionConfig.copy((i4 & 1) != 0 ? paymentSessionConfig2.hiddenShippingInfoFields : list, (i4 & 2) != 0 ? paymentSessionConfig2.optionalShippingInfoFields : list2, (i4 & 4) != 0 ? paymentSessionConfig2.prepopulatedShippingInfo : shippingInformation, (i4 & 8) != 0 ? paymentSessionConfig2.isShippingInfoRequired : z, (i4 & 16) != 0 ? paymentSessionConfig2.isShippingMethodRequired : z2, (i4 & 32) != 0 ? paymentSessionConfig2.paymentMethodsFooterLayoutId : i, (i4 & 64) != 0 ? paymentSessionConfig2.addPaymentMethodFooterLayoutId : i2, (i4 & 128) != 0 ? paymentSessionConfig2.paymentMethodTypes : list3, (i4 & 256) != 0 ? paymentSessionConfig2.shouldShowGooglePay : z3, (i4 & 512) != 0 ? paymentSessionConfig2.allowedShippingCountryCodes : set, (i4 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? paymentSessionConfig2.billingAddressFields : billingAddressFields2, (i4 & 2048) != 0 ? paymentSessionConfig2.canDeletePaymentMethods : z4, (i4 & 4096) != 0 ? paymentSessionConfig2.shouldPrefetchCustomer : z5, (i4 & 8192) != 0 ? paymentSessionConfig2.shippingInformationValidator : shippingInformationValidator2, (i4 & 16384) != 0 ? paymentSessionConfig2.shippingMethodsFactory : shippingMethodsFactory2, (i4 & 32768) != 0 ? paymentSessionConfig2.windowFlags : num);
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> component1() {
        return this.hiddenShippingInfoFields;
    }

    public final Set<String> component10() {
        return this.allowedShippingCountryCodes;
    }

    public final BillingAddressFields component11() {
        return this.billingAddressFields;
    }

    public final boolean component12() {
        return this.canDeletePaymentMethods;
    }

    public final boolean component13$payments_core_release() {
        return this.shouldPrefetchCustomer;
    }

    public final ShippingInformationValidator component14$payments_core_release() {
        return this.shippingInformationValidator;
    }

    public final ShippingMethodsFactory component15$payments_core_release() {
        return this.shippingMethodsFactory;
    }

    public final Integer component16$payments_core_release() {
        return this.windowFlags;
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> component2() {
        return this.optionalShippingInfoFields;
    }

    public final ShippingInformation component3() {
        return this.prepopulatedShippingInfo;
    }

    public final boolean component4() {
        return this.isShippingInfoRequired;
    }

    public final boolean component5() {
        return this.isShippingMethodRequired;
    }

    public final int component6() {
        return this.paymentMethodsFooterLayoutId;
    }

    public final int component7() {
        return this.addPaymentMethodFooterLayoutId;
    }

    public final List<PaymentMethod.Type> component8() {
        return this.paymentMethodTypes;
    }

    public final boolean component9() {
        return this.shouldShowGooglePay;
    }

    public final PaymentSessionConfig copy(List<? extends ShippingInfoWidget.CustomizableShippingField> list, List<? extends ShippingInfoWidget.CustomizableShippingField> list2, ShippingInformation shippingInformation, boolean z, boolean z2, int i, int i2, List<? extends PaymentMethod.Type> list3, boolean z3, Set<String> set, BillingAddressFields billingAddressFields2, boolean z4, boolean z5, ShippingInformationValidator shippingInformationValidator2, ShippingMethodsFactory shippingMethodsFactory2, Integer num) {
        List<? extends ShippingInfoWidget.CustomizableShippingField> list4 = list;
        i.e(list4, "hiddenShippingInfoFields");
        i.e(list2, "optionalShippingInfoFields");
        i.e(list3, "paymentMethodTypes");
        i.e(set, "allowedShippingCountryCodes");
        i.e(billingAddressFields2, "billingAddressFields");
        i.e(shippingInformationValidator2, "shippingInformationValidator");
        return new PaymentSessionConfig(list4, list2, shippingInformation, z, z2, i, i2, list3, z3, set, billingAddressFields2, z4, z5, shippingInformationValidator2, shippingMethodsFactory2, num);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentSessionConfig)) {
            return false;
        }
        PaymentSessionConfig paymentSessionConfig = (PaymentSessionConfig) obj;
        return i.a(this.hiddenShippingInfoFields, paymentSessionConfig.hiddenShippingInfoFields) && i.a(this.optionalShippingInfoFields, paymentSessionConfig.optionalShippingInfoFields) && i.a(this.prepopulatedShippingInfo, paymentSessionConfig.prepopulatedShippingInfo) && this.isShippingInfoRequired == paymentSessionConfig.isShippingInfoRequired && this.isShippingMethodRequired == paymentSessionConfig.isShippingMethodRequired && this.paymentMethodsFooterLayoutId == paymentSessionConfig.paymentMethodsFooterLayoutId && this.addPaymentMethodFooterLayoutId == paymentSessionConfig.addPaymentMethodFooterLayoutId && i.a(this.paymentMethodTypes, paymentSessionConfig.paymentMethodTypes) && this.shouldShowGooglePay == paymentSessionConfig.shouldShowGooglePay && i.a(this.allowedShippingCountryCodes, paymentSessionConfig.allowedShippingCountryCodes) && i.a(this.billingAddressFields, paymentSessionConfig.billingAddressFields) && this.canDeletePaymentMethods == paymentSessionConfig.canDeletePaymentMethods && this.shouldPrefetchCustomer == paymentSessionConfig.shouldPrefetchCustomer && i.a(this.shippingInformationValidator, paymentSessionConfig.shippingInformationValidator) && i.a(this.shippingMethodsFactory, paymentSessionConfig.shippingMethodsFactory) && i.a(this.windowFlags, paymentSessionConfig.windowFlags);
    }

    public final int getAddPaymentMethodFooterLayoutId() {
        return this.addPaymentMethodFooterLayoutId;
    }

    public final Set<String> getAllowedShippingCountryCodes() {
        return this.allowedShippingCountryCodes;
    }

    public final BillingAddressFields getBillingAddressFields() {
        return this.billingAddressFields;
    }

    public final boolean getCanDeletePaymentMethods() {
        return this.canDeletePaymentMethods;
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> getHiddenShippingInfoFields() {
        return this.hiddenShippingInfoFields;
    }

    public final List<ShippingInfoWidget.CustomizableShippingField> getOptionalShippingInfoFields() {
        return this.optionalShippingInfoFields;
    }

    public final List<PaymentMethod.Type> getPaymentMethodTypes() {
        return this.paymentMethodTypes;
    }

    public final int getPaymentMethodsFooterLayoutId() {
        return this.paymentMethodsFooterLayoutId;
    }

    public final ShippingInformation getPrepopulatedShippingInfo() {
        return this.prepopulatedShippingInfo;
    }

    public final ShippingInformationValidator getShippingInformationValidator$payments_core_release() {
        return this.shippingInformationValidator;
    }

    public final ShippingMethodsFactory getShippingMethodsFactory$payments_core_release() {
        return this.shippingMethodsFactory;
    }

    public final boolean getShouldPrefetchCustomer$payments_core_release() {
        return this.shouldPrefetchCustomer;
    }

    public final boolean getShouldShowGooglePay() {
        return this.shouldShowGooglePay;
    }

    public final Integer getWindowFlags$payments_core_release() {
        return this.windowFlags;
    }

    public int hashCode() {
        List<ShippingInfoWidget.CustomizableShippingField> list = this.hiddenShippingInfoFields;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        List<ShippingInfoWidget.CustomizableShippingField> list2 = this.optionalShippingInfoFields;
        int hashCode2 = (hashCode + (list2 != null ? list2.hashCode() : 0)) * 31;
        ShippingInformation shippingInformation = this.prepopulatedShippingInfo;
        int hashCode3 = (hashCode2 + (shippingInformation != null ? shippingInformation.hashCode() : 0)) * 31;
        boolean z = this.isShippingInfoRequired;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i2 = (hashCode3 + (z ? 1 : 0)) * 31;
        boolean z3 = this.isShippingMethodRequired;
        if (z3) {
            z3 = true;
        }
        int M = a.M(this.addPaymentMethodFooterLayoutId, a.M(this.paymentMethodsFooterLayoutId, (i2 + (z3 ? 1 : 0)) * 31, 31), 31);
        List<PaymentMethod.Type> list3 = this.paymentMethodTypes;
        int hashCode4 = (M + (list3 != null ? list3.hashCode() : 0)) * 31;
        boolean z4 = this.shouldShowGooglePay;
        if (z4) {
            z4 = true;
        }
        int i3 = (hashCode4 + (z4 ? 1 : 0)) * 31;
        Set<String> set = this.allowedShippingCountryCodes;
        int hashCode5 = (i3 + (set != null ? set.hashCode() : 0)) * 31;
        BillingAddressFields billingAddressFields2 = this.billingAddressFields;
        int hashCode6 = (hashCode5 + (billingAddressFields2 != null ? billingAddressFields2.hashCode() : 0)) * 31;
        boolean z5 = this.canDeletePaymentMethods;
        if (z5) {
            z5 = true;
        }
        int i4 = (hashCode6 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.shouldPrefetchCustomer;
        if (!z6) {
            z2 = z6;
        }
        int i5 = (i4 + (z2 ? 1 : 0)) * 31;
        ShippingInformationValidator shippingInformationValidator2 = this.shippingInformationValidator;
        int hashCode7 = (i5 + (shippingInformationValidator2 != null ? shippingInformationValidator2.hashCode() : 0)) * 31;
        ShippingMethodsFactory shippingMethodsFactory2 = this.shippingMethodsFactory;
        int hashCode8 = (hashCode7 + (shippingMethodsFactory2 != null ? shippingMethodsFactory2.hashCode() : 0)) * 31;
        Integer num = this.windowFlags;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode8 + i;
    }

    public final boolean isShippingInfoRequired() {
        return this.isShippingInfoRequired;
    }

    public final boolean isShippingMethodRequired() {
        return this.isShippingMethodRequired;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PaymentSessionConfig(hiddenShippingInfoFields=");
        P0.append(this.hiddenShippingInfoFields);
        P0.append(", optionalShippingInfoFields=");
        P0.append(this.optionalShippingInfoFields);
        P0.append(", prepopulatedShippingInfo=");
        P0.append(this.prepopulatedShippingInfo);
        P0.append(", isShippingInfoRequired=");
        P0.append(this.isShippingInfoRequired);
        P0.append(", isShippingMethodRequired=");
        P0.append(this.isShippingMethodRequired);
        P0.append(", paymentMethodsFooterLayoutId=");
        P0.append(this.paymentMethodsFooterLayoutId);
        P0.append(", addPaymentMethodFooterLayoutId=");
        P0.append(this.addPaymentMethodFooterLayoutId);
        P0.append(", paymentMethodTypes=");
        P0.append(this.paymentMethodTypes);
        P0.append(", shouldShowGooglePay=");
        P0.append(this.shouldShowGooglePay);
        P0.append(", allowedShippingCountryCodes=");
        P0.append(this.allowedShippingCountryCodes);
        P0.append(", billingAddressFields=");
        P0.append(this.billingAddressFields);
        P0.append(", canDeletePaymentMethods=");
        P0.append(this.canDeletePaymentMethods);
        P0.append(", shouldPrefetchCustomer=");
        P0.append(this.shouldPrefetchCustomer);
        P0.append(", shippingInformationValidator=");
        P0.append(this.shippingInformationValidator);
        P0.append(", shippingMethodsFactory=");
        P0.append(this.shippingMethodsFactory);
        P0.append(", windowFlags=");
        P0.append(this.windowFlags);
        P0.append(")");
        return P0.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        List<ShippingInfoWidget.CustomizableShippingField> list = this.hiddenShippingInfoFields;
        parcel.writeInt(list.size());
        for (ShippingInfoWidget.CustomizableShippingField name : list) {
            parcel.writeString(name.name());
        }
        List<ShippingInfoWidget.CustomizableShippingField> list2 = this.optionalShippingInfoFields;
        parcel.writeInt(list2.size());
        for (ShippingInfoWidget.CustomizableShippingField name2 : list2) {
            parcel.writeString(name2.name());
        }
        ShippingInformation shippingInformation = this.prepopulatedShippingInfo;
        if (shippingInformation != null) {
            parcel.writeInt(1);
            shippingInformation.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
        parcel.writeInt(this.isShippingInfoRequired ? 1 : 0);
        parcel.writeInt(this.isShippingMethodRequired ? 1 : 0);
        parcel.writeInt(this.paymentMethodsFooterLayoutId);
        parcel.writeInt(this.addPaymentMethodFooterLayoutId);
        List<PaymentMethod.Type> list3 = this.paymentMethodTypes;
        parcel.writeInt(list3.size());
        for (PaymentMethod.Type name3 : list3) {
            parcel.writeString(name3.name());
        }
        parcel.writeInt(this.shouldShowGooglePay ? 1 : 0);
        Set<String> set = this.allowedShippingCountryCodes;
        parcel.writeInt(set.size());
        for (String writeString : set) {
            parcel.writeString(writeString);
        }
        parcel.writeString(this.billingAddressFields.name());
        parcel.writeInt(this.canDeletePaymentMethods ? 1 : 0);
        parcel.writeInt(this.shouldPrefetchCustomer ? 1 : 0);
        parcel.writeSerializable(this.shippingInformationValidator);
        parcel.writeSerializable(this.shippingMethodsFactory);
        Integer num = this.windowFlags;
        if (num != null) {
            a.i(parcel, 1, num);
        } else {
            parcel.writeInt(0);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PaymentSessionConfig(java.util.List r18, java.util.List r19, com.stripe.android.model.ShippingInformation r20, boolean r21, boolean r22, int r23, int r24, java.util.List r25, boolean r26, java.util.Set r27, com.stripe.android.view.BillingAddressFields r28, boolean r29, boolean r30, com.stripe.android.PaymentSessionConfig.ShippingInformationValidator r31, com.stripe.android.PaymentSessionConfig.ShippingMethodsFactory r32, java.lang.Integer r33, int r34, m0.n.b.f r35) {
        /*
            r17 = this;
            r0 = r34
            r1 = r0 & 1
            if (r1 == 0) goto L_0x0009
            kotlin.collections.EmptyList r1 = kotlin.collections.EmptyList.c
            goto L_0x000b
        L_0x0009:
            r1 = r18
        L_0x000b:
            r2 = r0 & 2
            if (r2 == 0) goto L_0x0012
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.c
            goto L_0x0014
        L_0x0012:
            r2 = r19
        L_0x0014:
            r3 = r0 & 4
            if (r3 == 0) goto L_0x001a
            r3 = 0
            goto L_0x001c
        L_0x001a:
            r3 = r20
        L_0x001c:
            r5 = r0 & 8
            r6 = 0
            if (r5 == 0) goto L_0x0023
            r5 = r6
            goto L_0x0025
        L_0x0023:
            r5 = r21
        L_0x0025:
            r7 = r0 & 16
            if (r7 == 0) goto L_0x002b
            r7 = r6
            goto L_0x002d
        L_0x002b:
            r7 = r22
        L_0x002d:
            r8 = r0 & 32
            if (r8 == 0) goto L_0x0033
            r8 = r6
            goto L_0x0035
        L_0x0033:
            r8 = r23
        L_0x0035:
            r9 = r0 & 64
            if (r9 == 0) goto L_0x003b
            r9 = r6
            goto L_0x003d
        L_0x003b:
            r9 = r24
        L_0x003d:
            r10 = r0 & 128(0x80, float:1.794E-43)
            if (r10 == 0) goto L_0x0048
            com.stripe.android.model.PaymentMethod$Type r10 = com.stripe.android.model.PaymentMethod.Type.Card
            java.util.List r10 = i0.j.f.p.h.L2(r10)
            goto L_0x004a
        L_0x0048:
            r10 = r25
        L_0x004a:
            r11 = r0 & 256(0x100, float:3.59E-43)
            if (r11 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r6 = r26
        L_0x0051:
            r11 = r0 & 512(0x200, float:7.175E-43)
            if (r11 == 0) goto L_0x0058
            kotlin.collections.EmptySet r11 = kotlin.collections.EmptySet.c
            goto L_0x005a
        L_0x0058:
            r11 = r27
        L_0x005a:
            r12 = r0 & 1024(0x400, float:1.435E-42)
            if (r12 == 0) goto L_0x0061
            com.stripe.android.view.BillingAddressFields r12 = DEFAULT_BILLING_ADDRESS_FIELDS
            goto L_0x0063
        L_0x0061:
            r12 = r28
        L_0x0063:
            r13 = r0 & 2048(0x800, float:2.87E-42)
            r14 = 1
            if (r13 == 0) goto L_0x006a
            r13 = r14
            goto L_0x006c
        L_0x006a:
            r13 = r29
        L_0x006c:
            r15 = r0 & 4096(0x1000, float:5.74E-42)
            if (r15 == 0) goto L_0x0071
            goto L_0x0073
        L_0x0071:
            r14 = r30
        L_0x0073:
            r15 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r15 == 0) goto L_0x007d
            com.stripe.android.PaymentSessionConfig$DefaultShippingInfoValidator r15 = new com.stripe.android.PaymentSessionConfig$DefaultShippingInfoValidator
            r15.<init>()
            goto L_0x007f
        L_0x007d:
            r15 = r31
        L_0x007f:
            r4 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r4 == 0) goto L_0x0085
            r4 = 0
            goto L_0x0087
        L_0x0085:
            r4 = r32
        L_0x0087:
            r16 = 32768(0x8000, float:4.5918E-41)
            r0 = r0 & r16
            if (r0 == 0) goto L_0x0090
            r0 = 0
            goto L_0x0092
        L_0x0090:
            r0 = r33
        L_0x0092:
            r18 = r17
            r19 = r1
            r20 = r2
            r21 = r3
            r22 = r5
            r23 = r7
            r24 = r8
            r25 = r9
            r26 = r10
            r27 = r6
            r28 = r11
            r29 = r12
            r30 = r13
            r31 = r14
            r32 = r15
            r33 = r4
            r34 = r0
            r18.<init>(r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.PaymentSessionConfig.<init>(java.util.List, java.util.List, com.stripe.android.model.ShippingInformation, boolean, boolean, int, int, java.util.List, boolean, java.util.Set, com.stripe.android.view.BillingAddressFields, boolean, boolean, com.stripe.android.PaymentSessionConfig$ShippingInformationValidator, com.stripe.android.PaymentSessionConfig$ShippingMethodsFactory, java.lang.Integer, int, m0.n.b.f):void");
    }
}
