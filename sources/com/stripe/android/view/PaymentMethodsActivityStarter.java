package com.stripe.android.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.ActivityStarter;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\f\u000b\rB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter;", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/view/PaymentMethodsActivity;", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)V", "Companion", "Args", "Result", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodsActivityStarter.kt */
public final class PaymentMethodsActivityStarter extends ActivityStarter<PaymentMethodsActivity, Args> {
    public static final Companion Companion = new Companion((f) null);
    public static final int REQUEST_CODE = 6000;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\b\u0018\u0000 R2\u00020\u0001:\u0002SRBy\b\u0000\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0001\u0010%\u001a\u00020\u0006\u0012\b\b\u0001\u0010&\u001a\u00020\u0006\u0012\u0006\u0010'\u001a\u00020\n\u0012\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u0012\b\u0010)\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010+\u001a\u00020\u001a\u0012\b\b\u0002\u0010,\u001a\u00020\n\u0012\b\b\u0002\u0010-\u001a\u00020\n\u0012\b\b\u0002\u0010.\u001a\u00020\n¢\u0006\u0004\bP\u0010QJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0007\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\r\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0016\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eHÀ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0013HÀ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÀ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u001aHÀ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001f\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\u001e\u0010\fJ\u0010\u0010!\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b \u0010\fJ\u0010\u0010#\u001a\u00020\nHÀ\u0003¢\u0006\u0004\b\"\u0010\fJ\u0001\u0010/\u001a\u00020\u00002\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010%\u001a\u00020\u00062\b\b\u0003\u0010&\u001a\u00020\u00062\b\b\u0002\u0010'\u001a\u00020\n2\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010*\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010+\u001a\u00020\u001a2\b\b\u0002\u0010,\u001a\u00020\n2\b\b\u0002\u0010-\u001a\u00020\n2\b\b\u0002\u0010.\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b1\u0010\u0004J\u0010\u00102\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b2\u0010\bJ\u001a\u00105\u001a\u00020\n2\b\u00104\u001a\u0004\u0018\u000103HÖ\u0003¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b7\u0010\bJ \u0010<\u001a\u00020;2\u0006\u00109\u001a\u0002082\u0006\u0010:\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b<\u0010=R\u001c\u0010+\u001a\u00020\u001a8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b+\u0010>\u001a\u0004\b?\u0010\u001cR\u0019\u0010%\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b%\u0010@\u001a\u0004\bA\u0010\bR\"\u0010(\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b(\u0010B\u001a\u0004\bC\u0010\u0011R\u001c\u0010.\u001a\u00020\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b.\u0010D\u001a\u0004\bE\u0010\fR\u0019\u0010&\u001a\u00020\u00068\u0006@\u0006¢\u0006\f\n\u0004\b&\u0010@\u001a\u0004\bF\u0010\bR\u001c\u0010-\u001a\u00020\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b-\u0010D\u001a\u0004\bG\u0010\fR\u001c\u0010'\u001a\u00020\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010D\u001a\u0004\bH\u0010\fR\u001e\u0010*\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b*\u0010I\u001a\u0004\bJ\u0010\u0018R\u001e\u0010$\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b$\u0010K\u001a\u0004\bL\u0010\u0004R\u001e\u0010)\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b)\u0010M\u001a\u0004\bN\u0010\u0015R\u001c\u0010,\u001a\u00020\n8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b,\u0010D\u001a\u0004\bO\u0010\f¨\u0006T"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "", "component2", "()I", "component3", "", "component4$payments_core_release", "()Z", "component4", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "component5$payments_core_release", "()Ljava/util/List;", "component5", "Lcom/stripe/android/PaymentConfiguration;", "component6$payments_core_release", "()Lcom/stripe/android/PaymentConfiguration;", "component6", "component7$payments_core_release", "()Ljava/lang/Integer;", "component7", "Lcom/stripe/android/view/BillingAddressFields;", "component8$payments_core_release", "()Lcom/stripe/android/view/BillingAddressFields;", "component8", "component9$payments_core_release", "component9", "component10$payments_core_release", "component10", "component11$payments_core_release", "component11", "initialPaymentMethodId", "paymentMethodsFooterLayoutId", "addPaymentMethodFooterLayoutId", "isPaymentSessionActive", "paymentMethodTypes", "paymentConfiguration", "windowFlags", "billingAddressFields", "shouldShowGooglePay", "useGooglePay", "canDeletePaymentMethods", "copy", "(Ljava/lang/String;IIZLjava/util/List;Lcom/stripe/android/PaymentConfiguration;Ljava/lang/Integer;Lcom/stripe/android/view/BillingAddressFields;ZZZ)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "toString", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/view/BillingAddressFields;", "getBillingAddressFields$payments_core_release", "I", "getPaymentMethodsFooterLayoutId", "Ljava/util/List;", "getPaymentMethodTypes$payments_core_release", "Z", "getCanDeletePaymentMethods$payments_core_release", "getAddPaymentMethodFooterLayoutId", "getUseGooglePay$payments_core_release", "isPaymentSessionActive$payments_core_release", "Ljava/lang/Integer;", "getWindowFlags$payments_core_release", "Ljava/lang/String;", "getInitialPaymentMethodId$payments_core_release", "Lcom/stripe/android/PaymentConfiguration;", "getPaymentConfiguration$payments_core_release", "getShouldShowGooglePay$payments_core_release", "<init>", "(Ljava/lang/String;IIZLjava/util/List;Lcom/stripe/android/PaymentConfiguration;Ljava/lang/Integer;Lcom/stripe/android/view/BillingAddressFields;ZZZ)V", "Companion", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodsActivityStarter.kt */
    public static final class Args implements ActivityStarter.Args {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        private final int addPaymentMethodFooterLayoutId;
        private final BillingAddressFields billingAddressFields;
        private final boolean canDeletePaymentMethods;
        private final String initialPaymentMethodId;
        private final boolean isPaymentSessionActive;
        private final PaymentConfiguration paymentConfiguration;
        private final List<PaymentMethod.Type> paymentMethodTypes;
        private final int paymentMethodsFooterLayoutId;
        private final boolean shouldShowGooglePay;
        private final boolean useGooglePay;
        private final Integer windowFlags;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0019\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b1\u00102J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00002\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0016\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00002\u0006\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0019\u0010\u000eJ\u0017\u0010\u001c\u001a\u00020\u00002\b\b\u0001\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u00002\b\b\u0001\u0010\u001e\u001a\u00020\u001a¢\u0006\u0004\b\u001f\u0010\u001dJ\u0017\u0010!\u001a\u00020\u00002\b\u0010 \u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\u00002\u0006\u0010#\u001a\u00020\u000bH\u0000¢\u0006\u0004\b$\u0010\u000eJ\u0015\u0010'\u001a\u00020\u00002\u0006\u0010&\u001a\u00020\u000b¢\u0006\u0004\b'\u0010\u000eJ\u000f\u0010(\u001a\u00020\u0002H\u0016¢\u0006\u0004\b(\u0010)R\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010*R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010+R\u0016\u0010\u0018\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0018\u0010,R\u0016\u0010#\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b#\u0010,R\u001e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010-R\u0016\u0010\u001e\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010.R\u0018\u0010 \u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b \u0010/R\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010,R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u00100R\u0016\u0010&\u001a\u00020\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b&\u0010,R\u0016\u0010\u001b\u001a\u00020\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010.¨\u00063"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "Lcom/stripe/android/view/BillingAddressFields;", "billingAddressFields", "setBillingAddressFields", "(Lcom/stripe/android/view/BillingAddressFields;)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Builder;", "", "initialPaymentMethodId", "setInitialPaymentMethodId", "(Ljava/lang/String;)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Builder;", "", "isPaymentSessionActive", "setIsPaymentSessionActive", "(Z)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Builder;", "Lcom/stripe/android/PaymentConfiguration;", "paymentConfiguration", "setPaymentConfiguration", "(Lcom/stripe/android/PaymentConfiguration;)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Builder;", "", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodTypes", "setPaymentMethodTypes", "(Ljava/util/List;)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Builder;", "shouldShowGooglePay", "setShouldShowGooglePay", "", "paymentMethodsFooterLayoutId", "setPaymentMethodsFooter", "(I)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Builder;", "addPaymentMethodFooterLayoutId", "setAddPaymentMethodFooter", "windowFlags", "setWindowFlags", "(Ljava/lang/Integer;)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Builder;", "useGooglePay", "setUseGooglePay$payments_core_release", "setUseGooglePay", "canDeletePaymentMethods", "setCanDeletePaymentMethods", "build", "()Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "Lcom/stripe/android/PaymentConfiguration;", "Ljava/lang/String;", "Z", "Ljava/util/List;", "I", "Ljava/lang/Integer;", "Lcom/stripe/android/view/BillingAddressFields;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodsActivityStarter.kt */
        public static final class Builder implements ObjectBuilder<Args> {
            private int addPaymentMethodFooterLayoutId;
            private BillingAddressFields billingAddressFields = BillingAddressFields.PostalCode;
            private boolean canDeletePaymentMethods = true;
            private String initialPaymentMethodId;
            private boolean isPaymentSessionActive;
            private PaymentConfiguration paymentConfiguration;
            private List<? extends PaymentMethod.Type> paymentMethodTypes;
            private int paymentMethodsFooterLayoutId;
            private boolean shouldShowGooglePay;
            private boolean useGooglePay;
            private Integer windowFlags;

            public final Builder setAddPaymentMethodFooter(int i) {
                this.addPaymentMethodFooterLayoutId = i;
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

            public final Builder setInitialPaymentMethodId(String str) {
                this.initialPaymentMethodId = str;
                return this;
            }

            public final Builder setIsPaymentSessionActive(boolean z) {
                this.isPaymentSessionActive = z;
                return this;
            }

            public final Builder setPaymentConfiguration(PaymentConfiguration paymentConfiguration2) {
                this.paymentConfiguration = paymentConfiguration2;
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

            public final Builder setShouldShowGooglePay(boolean z) {
                this.shouldShowGooglePay = z;
                return this;
            }

            public final Builder setUseGooglePay$payments_core_release(boolean z) {
                this.useGooglePay = z;
                return this;
            }

            public final Builder setWindowFlags(Integer num) {
                this.windowFlags = num;
                return this;
            }

            public Args build() {
                String str = this.initialPaymentMethodId;
                boolean z = this.isPaymentSessionActive;
                List<? extends PaymentMethod.Type> list = this.paymentMethodTypes;
                if (list == null) {
                    list = h.L2(PaymentMethod.Type.Card);
                }
                boolean z2 = this.shouldShowGooglePay;
                boolean z3 = this.useGooglePay;
                PaymentConfiguration paymentConfiguration2 = this.paymentConfiguration;
                return new Args(str, this.paymentMethodsFooterLayoutId, this.addPaymentMethodFooterLayoutId, z, list, paymentConfiguration2, this.windowFlags, this.billingAddressFields, z2, z3, this.canDeletePaymentMethods);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args$Companion;", "", "Landroid/content/Intent;", "intent", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "create$payments_core_release", "(Landroid/content/Intent;)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Args;", "create", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodsActivityStarter.kt */
        public static final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Args create$payments_core_release(Intent intent) {
                i.e(intent, "intent");
                Parcelable parcelableExtra = intent.getParcelableExtra("extra_activity_args");
                if (parcelableExtra != null) {
                    return (Args) parcelableExtra;
                }
                throw new IllegalArgumentException("Required value was null.".toString());
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Args> {
            public final Args createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                String readString = parcel.readString();
                int readInt = parcel.readInt();
                int readInt2 = parcel.readInt();
                boolean z = parcel.readInt() != 0;
                int readInt3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(readInt3);
                while (readInt3 != 0) {
                    arrayList.add((PaymentMethod.Type) Enum.valueOf(PaymentMethod.Type.class, parcel.readString()));
                    readInt3--;
                }
                Integer num = null;
                PaymentConfiguration createFromParcel = parcel.readInt() != 0 ? PaymentConfiguration.CREATOR.createFromParcel(parcel) : null;
                if (parcel.readInt() != 0) {
                    num = Integer.valueOf(parcel.readInt());
                }
                return new Args(readString, readInt, readInt2, z, arrayList, createFromParcel, num, (BillingAddressFields) Enum.valueOf(BillingAddressFields.class, parcel.readString()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            }

            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(String str, int i, int i2, boolean z, List<? extends PaymentMethod.Type> list, PaymentConfiguration paymentConfiguration2, Integer num, BillingAddressFields billingAddressFields2, boolean z2, boolean z3, boolean z4) {
            i.e(list, "paymentMethodTypes");
            i.e(billingAddressFields2, "billingAddressFields");
            this.initialPaymentMethodId = str;
            this.paymentMethodsFooterLayoutId = i;
            this.addPaymentMethodFooterLayoutId = i2;
            this.isPaymentSessionActive = z;
            this.paymentMethodTypes = list;
            this.paymentConfiguration = paymentConfiguration2;
            this.windowFlags = num;
            this.billingAddressFields = billingAddressFields2;
            this.shouldShowGooglePay = z2;
            this.useGooglePay = z3;
            this.canDeletePaymentMethods = z4;
        }

        public static /* synthetic */ Args copy$default(Args args, String str, int i, int i2, boolean z, List list, PaymentConfiguration paymentConfiguration2, Integer num, BillingAddressFields billingAddressFields2, boolean z2, boolean z3, boolean z4, int i3, Object obj) {
            Args args2 = args;
            int i4 = i3;
            return args.copy((i4 & 1) != 0 ? args2.initialPaymentMethodId : str, (i4 & 2) != 0 ? args2.paymentMethodsFooterLayoutId : i, (i4 & 4) != 0 ? args2.addPaymentMethodFooterLayoutId : i2, (i4 & 8) != 0 ? args2.isPaymentSessionActive : z, (i4 & 16) != 0 ? args2.paymentMethodTypes : list, (i4 & 32) != 0 ? args2.paymentConfiguration : paymentConfiguration2, (i4 & 64) != 0 ? args2.windowFlags : num, (i4 & 128) != 0 ? args2.billingAddressFields : billingAddressFields2, (i4 & 256) != 0 ? args2.shouldShowGooglePay : z2, (i4 & 512) != 0 ? args2.useGooglePay : z3, (i4 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? args2.canDeletePaymentMethods : z4);
        }

        public final String component1$payments_core_release() {
            return this.initialPaymentMethodId;
        }

        public final boolean component10$payments_core_release() {
            return this.useGooglePay;
        }

        public final boolean component11$payments_core_release() {
            return this.canDeletePaymentMethods;
        }

        public final int component2() {
            return this.paymentMethodsFooterLayoutId;
        }

        public final int component3() {
            return this.addPaymentMethodFooterLayoutId;
        }

        public final boolean component4$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public final List<PaymentMethod.Type> component5$payments_core_release() {
            return this.paymentMethodTypes;
        }

        public final PaymentConfiguration component6$payments_core_release() {
            return this.paymentConfiguration;
        }

        public final Integer component7$payments_core_release() {
            return this.windowFlags;
        }

        public final BillingAddressFields component8$payments_core_release() {
            return this.billingAddressFields;
        }

        public final boolean component9$payments_core_release() {
            return this.shouldShowGooglePay;
        }

        public final Args copy(String str, int i, int i2, boolean z, List<? extends PaymentMethod.Type> list, PaymentConfiguration paymentConfiguration2, Integer num, BillingAddressFields billingAddressFields2, boolean z2, boolean z3, boolean z4) {
            List<? extends PaymentMethod.Type> list2 = list;
            i.e(list2, "paymentMethodTypes");
            BillingAddressFields billingAddressFields3 = billingAddressFields2;
            i.e(billingAddressFields3, "billingAddressFields");
            return new Args(str, i, i2, z, list2, paymentConfiguration2, num, billingAddressFields3, z2, z3, z4);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Args)) {
                return false;
            }
            Args args = (Args) obj;
            return i.a(this.initialPaymentMethodId, args.initialPaymentMethodId) && this.paymentMethodsFooterLayoutId == args.paymentMethodsFooterLayoutId && this.addPaymentMethodFooterLayoutId == args.addPaymentMethodFooterLayoutId && this.isPaymentSessionActive == args.isPaymentSessionActive && i.a(this.paymentMethodTypes, args.paymentMethodTypes) && i.a(this.paymentConfiguration, args.paymentConfiguration) && i.a(this.windowFlags, args.windowFlags) && i.a(this.billingAddressFields, args.billingAddressFields) && this.shouldShowGooglePay == args.shouldShowGooglePay && this.useGooglePay == args.useGooglePay && this.canDeletePaymentMethods == args.canDeletePaymentMethods;
        }

        public final int getAddPaymentMethodFooterLayoutId() {
            return this.addPaymentMethodFooterLayoutId;
        }

        public final BillingAddressFields getBillingAddressFields$payments_core_release() {
            return this.billingAddressFields;
        }

        public final boolean getCanDeletePaymentMethods$payments_core_release() {
            return this.canDeletePaymentMethods;
        }

        public final String getInitialPaymentMethodId$payments_core_release() {
            return this.initialPaymentMethodId;
        }

        public final PaymentConfiguration getPaymentConfiguration$payments_core_release() {
            return this.paymentConfiguration;
        }

        public final List<PaymentMethod.Type> getPaymentMethodTypes$payments_core_release() {
            return this.paymentMethodTypes;
        }

        public final int getPaymentMethodsFooterLayoutId() {
            return this.paymentMethodsFooterLayoutId;
        }

        public final boolean getShouldShowGooglePay$payments_core_release() {
            return this.shouldShowGooglePay;
        }

        public final boolean getUseGooglePay$payments_core_release() {
            return this.useGooglePay;
        }

        public final Integer getWindowFlags$payments_core_release() {
            return this.windowFlags;
        }

        public int hashCode() {
            String str = this.initialPaymentMethodId;
            int i = 0;
            int M = a.M(this.addPaymentMethodFooterLayoutId, a.M(this.paymentMethodsFooterLayoutId, (str != null ? str.hashCode() : 0) * 31, 31), 31);
            boolean z = this.isPaymentSessionActive;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (M + (z ? 1 : 0)) * 31;
            List<PaymentMethod.Type> list = this.paymentMethodTypes;
            int hashCode = (i2 + (list != null ? list.hashCode() : 0)) * 31;
            PaymentConfiguration paymentConfiguration2 = this.paymentConfiguration;
            int hashCode2 = (hashCode + (paymentConfiguration2 != null ? paymentConfiguration2.hashCode() : 0)) * 31;
            Integer num = this.windowFlags;
            int hashCode3 = (hashCode2 + (num != null ? num.hashCode() : 0)) * 31;
            BillingAddressFields billingAddressFields2 = this.billingAddressFields;
            if (billingAddressFields2 != null) {
                i = billingAddressFields2.hashCode();
            }
            int i3 = (hashCode3 + i) * 31;
            boolean z3 = this.shouldShowGooglePay;
            if (z3) {
                z3 = true;
            }
            int i4 = (i3 + (z3 ? 1 : 0)) * 31;
            boolean z4 = this.useGooglePay;
            if (z4) {
                z4 = true;
            }
            int i5 = (i4 + (z4 ? 1 : 0)) * 31;
            boolean z5 = this.canDeletePaymentMethods;
            if (!z5) {
                z2 = z5;
            }
            return i5 + (z2 ? 1 : 0);
        }

        public final boolean isPaymentSessionActive$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Args(initialPaymentMethodId=");
            P0.append(this.initialPaymentMethodId);
            P0.append(", paymentMethodsFooterLayoutId=");
            P0.append(this.paymentMethodsFooterLayoutId);
            P0.append(", addPaymentMethodFooterLayoutId=");
            P0.append(this.addPaymentMethodFooterLayoutId);
            P0.append(", isPaymentSessionActive=");
            P0.append(this.isPaymentSessionActive);
            P0.append(", paymentMethodTypes=");
            P0.append(this.paymentMethodTypes);
            P0.append(", paymentConfiguration=");
            P0.append(this.paymentConfiguration);
            P0.append(", windowFlags=");
            P0.append(this.windowFlags);
            P0.append(", billingAddressFields=");
            P0.append(this.billingAddressFields);
            P0.append(", shouldShowGooglePay=");
            P0.append(this.shouldShowGooglePay);
            P0.append(", useGooglePay=");
            P0.append(this.useGooglePay);
            P0.append(", canDeletePaymentMethods=");
            return a.D0(P0, this.canDeletePaymentMethods, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.initialPaymentMethodId);
            parcel.writeInt(this.paymentMethodsFooterLayoutId);
            parcel.writeInt(this.addPaymentMethodFooterLayoutId);
            parcel.writeInt(this.isPaymentSessionActive ? 1 : 0);
            List<PaymentMethod.Type> list = this.paymentMethodTypes;
            parcel.writeInt(list.size());
            for (PaymentMethod.Type name : list) {
                parcel.writeString(name.name());
            }
            PaymentConfiguration paymentConfiguration2 = this.paymentConfiguration;
            if (paymentConfiguration2 != null) {
                parcel.writeInt(1);
                paymentConfiguration2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            Integer num = this.windowFlags;
            if (num != null) {
                a.i(parcel, 1, num);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.billingAddressFields.name());
            parcel.writeInt(this.shouldShowGooglePay ? 1 : 0);
            parcel.writeInt(this.useGooglePay ? 1 : 0);
            parcel.writeInt(this.canDeletePaymentMethods ? 1 : 0);
        }

        /* JADX WARNING: Illegal instructions before constructor call */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public /* synthetic */ Args(java.lang.String r15, int r16, int r17, boolean r18, java.util.List r19, com.stripe.android.PaymentConfiguration r20, java.lang.Integer r21, com.stripe.android.view.BillingAddressFields r22, boolean r23, boolean r24, boolean r25, int r26, m0.n.b.f r27) {
            /*
                r14 = this;
                r0 = r26
                r1 = r0 & 64
                if (r1 == 0) goto L_0x0009
                r1 = 0
                r9 = r1
                goto L_0x000b
            L_0x0009:
                r9 = r21
            L_0x000b:
                r1 = r0 & 256(0x100, float:3.59E-43)
                r2 = 0
                if (r1 == 0) goto L_0x0012
                r11 = r2
                goto L_0x0014
            L_0x0012:
                r11 = r23
            L_0x0014:
                r1 = r0 & 512(0x200, float:7.175E-43)
                if (r1 == 0) goto L_0x001a
                r12 = r2
                goto L_0x001c
            L_0x001a:
                r12 = r24
            L_0x001c:
                r0 = r0 & 1024(0x400, float:1.435E-42)
                if (r0 == 0) goto L_0x0023
                r0 = 1
                r13 = r0
                goto L_0x0025
            L_0x0023:
                r13 = r25
            L_0x0025:
                r2 = r14
                r3 = r15
                r4 = r16
                r5 = r17
                r6 = r18
                r7 = r19
                r8 = r20
                r10 = r22
                r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentMethodsActivityStarter.Args.<init>(java.lang.String, int, int, boolean, java.util.List, com.stripe.android.PaymentConfiguration, java.lang.Integer, com.stripe.android.view.BillingAddressFields, boolean, boolean, boolean, int, m0.n.b.f):void");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Companion;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodsActivityStarter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u0000 %2\u00020\u0001:\u0001%B\u001f\b\u0000\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\b¢\u0006\u0004\b#\u0010$J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\f\u001a\u00020\bHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0014J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\f\u001a\u00020\b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\nR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0007X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\"¨\u0006&"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "Lcom/stripe/android/model/PaymentMethod;", "component1", "()Lcom/stripe/android/model/PaymentMethod;", "", "component2", "()Z", "paymentMethod", "useGooglePay", "copy", "(Lcom/stripe/android/model/PaymentMethod;Z)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getUseGooglePay", "Lcom/stripe/android/model/PaymentMethod;", "<init>", "(Lcom/stripe/android/model/PaymentMethod;Z)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodsActivityStarter.kt */
    public static final class Result implements ActivityStarter.Result {
        public static final Parcelable.Creator<Result> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        public final PaymentMethod paymentMethod;
        private final boolean useGooglePay;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result$Companion;", "", "Landroid/content/Intent;", "intent", "Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;", "fromIntent", "(Landroid/content/Intent;)Lcom/stripe/android/view/PaymentMethodsActivityStarter$Result;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentMethodsActivityStarter.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Result fromIntent(Intent intent) {
                if (intent != null) {
                    return (Result) intent.getParcelableExtra("extra_activity_result");
                }
                return null;
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Result> {
            public final Result createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Result(parcel.readInt() != 0 ? PaymentMethod.CREATOR.createFromParcel(parcel) : null, parcel.readInt() != 0);
            }

            public final Result[] newArray(int i) {
                return new Result[i];
            }
        }

        public Result() {
            this((PaymentMethod) null, false, 3, (f) null);
        }

        public Result(PaymentMethod paymentMethod2, boolean z) {
            this.paymentMethod = paymentMethod2;
            this.useGooglePay = z;
        }

        public static /* synthetic */ Result copy$default(Result result, PaymentMethod paymentMethod2, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentMethod2 = result.paymentMethod;
            }
            if ((i & 2) != 0) {
                z = result.useGooglePay;
            }
            return result.copy(paymentMethod2, z);
        }

        public static final Result fromIntent(Intent intent) {
            return Companion.fromIntent(intent);
        }

        public final PaymentMethod component1() {
            return this.paymentMethod;
        }

        public final boolean component2() {
            return this.useGooglePay;
        }

        public final Result copy(PaymentMethod paymentMethod2, boolean z) {
            return new Result(paymentMethod2, z);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Result)) {
                return false;
            }
            Result result = (Result) obj;
            return i.a(this.paymentMethod, result.paymentMethod) && this.useGooglePay == result.useGooglePay;
        }

        public final boolean getUseGooglePay() {
            return this.useGooglePay;
        }

        public int hashCode() {
            PaymentMethod paymentMethod2 = this.paymentMethod;
            int hashCode = (paymentMethod2 != null ? paymentMethod2.hashCode() : 0) * 31;
            boolean z = this.useGooglePay;
            if (z) {
                z = true;
            }
            return hashCode + (z ? 1 : 0);
        }

        public Bundle toBundle() {
            return g0.a.b.b.a.g(new Pair("extra_activity_result", this));
        }

        public String toString() {
            StringBuilder P0 = a.P0("Result(paymentMethod=");
            P0.append(this.paymentMethod);
            P0.append(", useGooglePay=");
            return a.D0(P0, this.useGooglePay, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            PaymentMethod paymentMethod2 = this.paymentMethod;
            if (paymentMethod2 != null) {
                parcel.writeInt(1);
                paymentMethod2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeInt(this.useGooglePay ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Result(PaymentMethod paymentMethod2, boolean z, int i, f fVar) {
            this((i & 1) != 0 ? null : paymentMethod2, (i & 2) != 0 ? false : z);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivityStarter(Activity activity) {
        super(activity, PaymentMethodsActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (f) null);
        i.e(activity, "activity");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodsActivityStarter(Fragment fragment) {
        super(fragment, PaymentMethodsActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (f) null);
        i.e(fragment, "fragment");
    }
}
