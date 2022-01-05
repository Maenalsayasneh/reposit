package com.stripe.android.view;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.stripe.android.ObjectBuilder;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.ActivityStarter;
import i0.d.a.a.a;
import kotlin.Metadata;
import kotlin.Pair;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 \u000b2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\f\u000b\rB\u0011\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\u0011\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter;", "Lcom/stripe/android/view/ActivityStarter;", "Lcom/stripe/android/view/AddPaymentMethodActivity;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "Landroid/app/Activity;", "activity", "<init>", "(Landroid/app/Activity;)V", "Landroidx/fragment/app/Fragment;", "fragment", "(Landroidx/fragment/app/Fragment;)V", "Companion", "Args", "Result", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodActivityStarter.kt */
public final class AddPaymentMethodActivityStarter extends ActivityStarter<AddPaymentMethodActivity, Args> {
    public static final Companion Companion = new Companion((f) null);
    public static final int REQUEST_CODE = 6001;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\b\u0018\u0000 B2\u00020\u0001:\u0002CBBI\b\u0000\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0006\u0012\u0006\u0010\u001d\u001a\u00020\u0006\u0012\u0006\u0010\u001e\u001a\u00020\f\u0012\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0001\u0010 \u001a\u00020\u0014\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b@\u0010AJ\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\n\u0010\bJ\u0010\u0010\u000f\u001a\u00020\fHÀ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0010HÀ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0014HÀ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0014HÀ\u0003¢\u0006\u0004\b\u0018\u0010\u0019JZ\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00062\b\b\u0002\u0010\u001d\u001a\u00020\u00062\b\b\u0002\u0010\u001e\u001a\u00020\f2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00102\b\b\u0003\u0010 \u001a\u00020\u00142\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b'\u0010\u0016J\u001a\u0010*\u001a\u00020\u00062\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b,\u0010\u0016J \u00101\u001a\u0002002\u0006\u0010.\u001a\u00020-2\u0006\u0010/\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b1\u00102R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00108\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001f\u00103\u001a\u0004\b4\u0010\u0012R\u001c\u0010\u001c\u001a\u00020\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u00105\u001a\u0004\b6\u0010\bR\u001e\u0010!\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b!\u00107\u001a\u0004\b8\u0010\u0019R\u001c\u0010\u001d\u001a\u00020\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u00105\u001a\u0004\b9\u0010\bR\u001c\u0010 \u001a\u00020\u00148\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b \u0010:\u001a\u0004\b;\u0010\u0016R\u001c\u0010\u001b\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010<\u001a\u0004\b=\u0010\u0004R\u001c\u0010\u001e\u001a\u00020\f8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u0010>\u001a\u0004\b?\u0010\u000e¨\u0006D"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "Lcom/stripe/android/view/BillingAddressFields;", "component1$payments_core_release", "()Lcom/stripe/android/view/BillingAddressFields;", "component1", "", "component2$payments_core_release", "()Z", "component2", "component3$payments_core_release", "component3", "Lcom/stripe/android/model/PaymentMethod$Type;", "component4$payments_core_release", "()Lcom/stripe/android/model/PaymentMethod$Type;", "component4", "Lcom/stripe/android/PaymentConfiguration;", "component5$payments_core_release", "()Lcom/stripe/android/PaymentConfiguration;", "component5", "", "component6$payments_core_release", "()I", "component6", "component7$payments_core_release", "()Ljava/lang/Integer;", "component7", "billingAddressFields", "shouldAttachToCustomer", "isPaymentSessionActive", "paymentMethodType", "paymentConfiguration", "addPaymentMethodFooterLayoutId", "windowFlags", "copy", "(Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "", "toString", "()Ljava/lang/String;", "hashCode", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/PaymentConfiguration;", "getPaymentConfiguration$payments_core_release", "Z", "getShouldAttachToCustomer$payments_core_release", "Ljava/lang/Integer;", "getWindowFlags$payments_core_release", "isPaymentSessionActive$payments_core_release", "I", "getAddPaymentMethodFooterLayoutId$payments_core_release", "Lcom/stripe/android/view/BillingAddressFields;", "getBillingAddressFields$payments_core_release", "Lcom/stripe/android/model/PaymentMethod$Type;", "getPaymentMethodType$payments_core_release", "<init>", "(Lcom/stripe/android/view/BillingAddressFields;ZZLcom/stripe/android/model/PaymentMethod$Type;Lcom/stripe/android/PaymentConfiguration;ILjava/lang/Integer;)V", "Companion", "Builder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AddPaymentMethodActivityStarter.kt */
    public static final class Args implements ActivityStarter.Args {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        private final int addPaymentMethodFooterLayoutId;
        private final BillingAddressFields billingAddressFields;
        private final boolean isPaymentSessionActive;
        private final PaymentConfiguration paymentConfiguration;
        private final PaymentMethod.Type paymentMethodType;
        private final boolean shouldAttachToCustomer;
        private final Integer windowFlags;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b&\u0010'J\u0015\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00002\b\u0010\u0013\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0016\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0017\u0010\u0006J\u0019\u0010\u001d\u001a\u00020\u00002\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\b\u0010!R\u0016\u0010\u0016\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\"R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\f\u0010#R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010$R\u0016\u0010\u0004\u001a\u00020\u00038\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\"R\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010%¨\u0006("}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;", "Lcom/stripe/android/ObjectBuilder;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "", "shouldAttachToCustomer", "setShouldAttachToCustomer", "(Z)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;", "Lcom/stripe/android/view/BillingAddressFields;", "billingAddressFields", "setBillingAddressFields", "(Lcom/stripe/android/view/BillingAddressFields;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;", "Lcom/stripe/android/model/PaymentMethod$Type;", "paymentMethodType", "setPaymentMethodType", "(Lcom/stripe/android/model/PaymentMethod$Type;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;", "", "addPaymentMethodFooterLayoutId", "setAddPaymentMethodFooter", "(I)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;", "windowFlags", "setWindowFlags", "(Ljava/lang/Integer;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;", "isPaymentSessionActive", "setIsPaymentSessionActive$payments_core_release", "setIsPaymentSessionActive", "Lcom/stripe/android/PaymentConfiguration;", "paymentConfiguration", "setPaymentConfiguration$payments_core_release", "(Lcom/stripe/android/PaymentConfiguration;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Builder;", "setPaymentConfiguration", "build", "()Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "Lcom/stripe/android/PaymentConfiguration;", "Lcom/stripe/android/view/BillingAddressFields;", "Z", "Lcom/stripe/android/model/PaymentMethod$Type;", "Ljava/lang/Integer;", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: AddPaymentMethodActivityStarter.kt */
        public static final class Builder implements ObjectBuilder<Args> {
            private int addPaymentMethodFooterLayoutId;
            private BillingAddressFields billingAddressFields = BillingAddressFields.PostalCode;
            private boolean isPaymentSessionActive;
            private PaymentConfiguration paymentConfiguration;
            private PaymentMethod.Type paymentMethodType = PaymentMethod.Type.Card;
            private boolean shouldAttachToCustomer;
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

            public final /* synthetic */ Builder setIsPaymentSessionActive$payments_core_release(boolean z) {
                this.isPaymentSessionActive = z;
                return this;
            }

            public final /* synthetic */ Builder setPaymentConfiguration$payments_core_release(PaymentConfiguration paymentConfiguration2) {
                this.paymentConfiguration = paymentConfiguration2;
                return this;
            }

            public final Builder setPaymentMethodType(PaymentMethod.Type type) {
                i.e(type, "paymentMethodType");
                this.paymentMethodType = type;
                return this;
            }

            public final Builder setShouldAttachToCustomer(boolean z) {
                this.shouldAttachToCustomer = z;
                return this;
            }

            public final Builder setWindowFlags(Integer num) {
                this.windowFlags = num;
                return this;
            }

            public Args build() {
                BillingAddressFields billingAddressFields2 = this.billingAddressFields;
                boolean z = this.shouldAttachToCustomer;
                boolean z2 = this.isPaymentSessionActive;
                PaymentMethod.Type type = this.paymentMethodType;
                if (type == null) {
                    type = PaymentMethod.Type.Card;
                }
                return new Args(billingAddressFields2, z, z2, type, this.paymentConfiguration, this.addPaymentMethodFooterLayoutId, this.windowFlags);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args$Companion;", "", "Landroid/content/Intent;", "intent", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "create$payments_core_release", "(Landroid/content/Intent;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Args;", "create", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: AddPaymentMethodActivityStarter.kt */
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
                BillingAddressFields billingAddressFields = (BillingAddressFields) Enum.valueOf(BillingAddressFields.class, parcel.readString());
                boolean z = false;
                boolean z2 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z = true;
                }
                return new Args(billingAddressFields, z2, z, (PaymentMethod.Type) Enum.valueOf(PaymentMethod.Type.class, parcel.readString()), parcel.readInt() != 0 ? PaymentConfiguration.CREATOR.createFromParcel(parcel) : null, parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(BillingAddressFields billingAddressFields2, boolean z, boolean z2, PaymentMethod.Type type, PaymentConfiguration paymentConfiguration2, int i, Integer num) {
            i.e(billingAddressFields2, "billingAddressFields");
            i.e(type, "paymentMethodType");
            this.billingAddressFields = billingAddressFields2;
            this.shouldAttachToCustomer = z;
            this.isPaymentSessionActive = z2;
            this.paymentMethodType = type;
            this.paymentConfiguration = paymentConfiguration2;
            this.addPaymentMethodFooterLayoutId = i;
            this.windowFlags = num;
        }

        public static /* synthetic */ Args copy$default(Args args, BillingAddressFields billingAddressFields2, boolean z, boolean z2, PaymentMethod.Type type, PaymentConfiguration paymentConfiguration2, int i, Integer num, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                billingAddressFields2 = args.billingAddressFields;
            }
            if ((i2 & 2) != 0) {
                z = args.shouldAttachToCustomer;
            }
            boolean z3 = z;
            if ((i2 & 4) != 0) {
                z2 = args.isPaymentSessionActive;
            }
            boolean z4 = z2;
            if ((i2 & 8) != 0) {
                type = args.paymentMethodType;
            }
            PaymentMethod.Type type2 = type;
            if ((i2 & 16) != 0) {
                paymentConfiguration2 = args.paymentConfiguration;
            }
            PaymentConfiguration paymentConfiguration3 = paymentConfiguration2;
            if ((i2 & 32) != 0) {
                i = args.addPaymentMethodFooterLayoutId;
            }
            int i3 = i;
            if ((i2 & 64) != 0) {
                num = args.windowFlags;
            }
            return args.copy(billingAddressFields2, z3, z4, type2, paymentConfiguration3, i3, num);
        }

        public final BillingAddressFields component1$payments_core_release() {
            return this.billingAddressFields;
        }

        public final boolean component2$payments_core_release() {
            return this.shouldAttachToCustomer;
        }

        public final boolean component3$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public final PaymentMethod.Type component4$payments_core_release() {
            return this.paymentMethodType;
        }

        public final PaymentConfiguration component5$payments_core_release() {
            return this.paymentConfiguration;
        }

        public final int component6$payments_core_release() {
            return this.addPaymentMethodFooterLayoutId;
        }

        public final Integer component7$payments_core_release() {
            return this.windowFlags;
        }

        public final Args copy(BillingAddressFields billingAddressFields2, boolean z, boolean z2, PaymentMethod.Type type, PaymentConfiguration paymentConfiguration2, int i, Integer num) {
            i.e(billingAddressFields2, "billingAddressFields");
            i.e(type, "paymentMethodType");
            return new Args(billingAddressFields2, z, z2, type, paymentConfiguration2, i, num);
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
            return i.a(this.billingAddressFields, args.billingAddressFields) && this.shouldAttachToCustomer == args.shouldAttachToCustomer && this.isPaymentSessionActive == args.isPaymentSessionActive && i.a(this.paymentMethodType, args.paymentMethodType) && i.a(this.paymentConfiguration, args.paymentConfiguration) && this.addPaymentMethodFooterLayoutId == args.addPaymentMethodFooterLayoutId && i.a(this.windowFlags, args.windowFlags);
        }

        public final int getAddPaymentMethodFooterLayoutId$payments_core_release() {
            return this.addPaymentMethodFooterLayoutId;
        }

        public final BillingAddressFields getBillingAddressFields$payments_core_release() {
            return this.billingAddressFields;
        }

        public final PaymentConfiguration getPaymentConfiguration$payments_core_release() {
            return this.paymentConfiguration;
        }

        public final PaymentMethod.Type getPaymentMethodType$payments_core_release() {
            return this.paymentMethodType;
        }

        public final boolean getShouldAttachToCustomer$payments_core_release() {
            return this.shouldAttachToCustomer;
        }

        public final Integer getWindowFlags$payments_core_release() {
            return this.windowFlags;
        }

        public int hashCode() {
            BillingAddressFields billingAddressFields2 = this.billingAddressFields;
            int i = 0;
            int hashCode = (billingAddressFields2 != null ? billingAddressFields2.hashCode() : 0) * 31;
            boolean z = this.shouldAttachToCustomer;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i2 = (hashCode + (z ? 1 : 0)) * 31;
            boolean z3 = this.isPaymentSessionActive;
            if (!z3) {
                z2 = z3;
            }
            int i3 = (i2 + (z2 ? 1 : 0)) * 31;
            PaymentMethod.Type type = this.paymentMethodType;
            int hashCode2 = (i3 + (type != null ? type.hashCode() : 0)) * 31;
            PaymentConfiguration paymentConfiguration2 = this.paymentConfiguration;
            int M = a.M(this.addPaymentMethodFooterLayoutId, (hashCode2 + (paymentConfiguration2 != null ? paymentConfiguration2.hashCode() : 0)) * 31, 31);
            Integer num = this.windowFlags;
            if (num != null) {
                i = num.hashCode();
            }
            return M + i;
        }

        public final boolean isPaymentSessionActive$payments_core_release() {
            return this.isPaymentSessionActive;
        }

        public String toString() {
            StringBuilder P0 = a.P0("Args(billingAddressFields=");
            P0.append(this.billingAddressFields);
            P0.append(", shouldAttachToCustomer=");
            P0.append(this.shouldAttachToCustomer);
            P0.append(", isPaymentSessionActive=");
            P0.append(this.isPaymentSessionActive);
            P0.append(", paymentMethodType=");
            P0.append(this.paymentMethodType);
            P0.append(", paymentConfiguration=");
            P0.append(this.paymentConfiguration);
            P0.append(", addPaymentMethodFooterLayoutId=");
            P0.append(this.addPaymentMethodFooterLayoutId);
            P0.append(", windowFlags=");
            P0.append(this.windowFlags);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.billingAddressFields.name());
            parcel.writeInt(this.shouldAttachToCustomer ? 1 : 0);
            parcel.writeInt(this.isPaymentSessionActive ? 1 : 0);
            parcel.writeString(this.paymentMethodType.name());
            PaymentConfiguration paymentConfiguration2 = this.paymentConfiguration;
            if (paymentConfiguration2 != null) {
                parcel.writeInt(1);
                paymentConfiguration2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeInt(this.addPaymentMethodFooterLayoutId);
            Integer num = this.windowFlags;
            if (num != null) {
                a.i(parcel, 1, num);
            } else {
                parcel.writeInt(0);
            }
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ Args(BillingAddressFields billingAddressFields2, boolean z, boolean z2, PaymentMethod.Type type, PaymentConfiguration paymentConfiguration2, int i, Integer num, int i2, f fVar) {
            this(billingAddressFields2, z, z2, type, paymentConfiguration2, i, (i2 & 64) != 0 ? null : num);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Companion;", "", "", "REQUEST_CODE", "I", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AddPaymentMethodActivityStarter.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0004\b\u0007\t\nB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0003\u000b\f\r¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "<init>", "()V", "Companion", "Canceled", "Failure", "Success", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Success;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Failure;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Canceled;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AddPaymentMethodActivityStarter.kt */
    public static abstract class Result implements ActivityStarter.Result {
        public static final Companion Companion = new Companion((f) null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Canceled;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: AddPaymentMethodActivityStarter.kt */
        public static final class Canceled extends Result {
            public static final Parcelable.Creator<Canceled> CREATOR = new Creator();
            public static final Canceled INSTANCE = new Canceled();

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<Canceled> {
                public final Canceled createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    if (parcel.readInt() != 0) {
                        return Canceled.INSTANCE;
                    }
                    return null;
                }

                public final Canceled[] newArray(int i) {
                    return new Canceled[i];
                }
            }

            private Canceled() {
                super((f) null);
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeInt(1);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Companion;", "", "Landroid/content/Intent;", "intent", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "fromIntent", "(Landroid/content/Intent;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: AddPaymentMethodActivityStarter.kt */
        public static final class Companion {
            private Companion() {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:1:0x0002, code lost:
                r2 = (com.stripe.android.view.AddPaymentMethodActivityStarter.Result) r2.getParcelableExtra("extra_activity_result");
             */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final com.stripe.android.view.AddPaymentMethodActivityStarter.Result fromIntent(android.content.Intent r2) {
                /*
                    r1 = this;
                    if (r2 == 0) goto L_0x000d
                    java.lang.String r0 = "extra_activity_result"
                    android.os.Parcelable r2 = r2.getParcelableExtra(r0)
                    com.stripe.android.view.AddPaymentMethodActivityStarter$Result r2 = (com.stripe.android.view.AddPaymentMethodActivityStarter.Result) r2
                    if (r2 == 0) goto L_0x000d
                    goto L_0x000f
                L_0x000d:
                    com.stripe.android.view.AddPaymentMethodActivityStarter$Result$Canceled r2 = com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Canceled.INSTANCE
                L_0x000f:
                    return r2
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.AddPaymentMethodActivityStarter.Result.Companion.fromIntent(android.content.Intent):com.stripe.android.view.AddPaymentMethodActivityStarter$Result");
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Failure;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "", "component1", "()Ljava/lang/Throwable;", "exception", "copy", "(Ljava/lang/Throwable;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Failure;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Throwable;", "getException", "<init>", "(Ljava/lang/Throwable;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: AddPaymentMethodActivityStarter.kt */
        public static final class Failure extends Result {
            public static final Parcelable.Creator<Failure> CREATOR = new Creator();
            private final Throwable exception;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<Failure> {
                public final Failure createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new Failure((Throwable) parcel.readSerializable());
                }

                public final Failure[] newArray(int i) {
                    return new Failure[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Failure(Throwable th) {
                super((f) null);
                i.e(th, "exception");
                this.exception = th;
            }

            public static /* synthetic */ Failure copy$default(Failure failure, Throwable th, int i, Object obj) {
                if ((i & 1) != 0) {
                    th = failure.exception;
                }
                return failure.copy(th);
            }

            public final Throwable component1() {
                return this.exception;
            }

            public final Failure copy(Throwable th) {
                i.e(th, "exception");
                return new Failure(th);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof Failure) && i.a(this.exception, ((Failure) obj).exception);
                }
                return true;
            }

            public final Throwable getException() {
                return this.exception;
            }

            public int hashCode() {
                Throwable th = this.exception;
                if (th != null) {
                    return th.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder P0 = a.P0("Failure(exception=");
                P0.append(this.exception);
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                parcel.writeSerializable(this.exception);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0005\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Success;", "Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result;", "Lcom/stripe/android/model/PaymentMethod;", "component1", "()Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "copy", "(Lcom/stripe/android/model/PaymentMethod;)Lcom/stripe/android/view/AddPaymentMethodActivityStarter$Result$Success;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "<init>", "(Lcom/stripe/android/model/PaymentMethod;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: AddPaymentMethodActivityStarter.kt */
        public static final class Success extends Result {
            public static final Parcelable.Creator<Success> CREATOR = new Creator();
            private final PaymentMethod paymentMethod;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<Success> {
                public final Success createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new Success(PaymentMethod.CREATOR.createFromParcel(parcel));
                }

                public final Success[] newArray(int i) {
                    return new Success[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Success(PaymentMethod paymentMethod2) {
                super((f) null);
                i.e(paymentMethod2, "paymentMethod");
                this.paymentMethod = paymentMethod2;
            }

            public static /* synthetic */ Success copy$default(Success success, PaymentMethod paymentMethod2, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentMethod2 = success.paymentMethod;
                }
                return success.copy(paymentMethod2);
            }

            public final PaymentMethod component1() {
                return this.paymentMethod;
            }

            public final Success copy(PaymentMethod paymentMethod2) {
                i.e(paymentMethod2, "paymentMethod");
                return new Success(paymentMethod2);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof Success) && i.a(this.paymentMethod, ((Success) obj).paymentMethod);
                }
                return true;
            }

            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public int hashCode() {
                PaymentMethod paymentMethod2 = this.paymentMethod;
                if (paymentMethod2 != null) {
                    return paymentMethod2.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder P0 = a.P0("Success(paymentMethod=");
                P0.append(this.paymentMethod);
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                this.paymentMethod.writeToParcel(parcel, 0);
            }
        }

        private Result() {
        }

        public static final Result fromIntent(Intent intent) {
            return Companion.fromIntent(intent);
        }

        public Bundle toBundle() {
            return g0.a.b.b.a.g(new Pair("extra_activity_result", this));
        }

        public /* synthetic */ Result(f fVar) {
            this();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivityStarter(Activity activity) {
        super(activity, AddPaymentMethodActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (f) null);
        i.e(activity, "activity");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPaymentMethodActivityStarter(Fragment fragment) {
        super(fragment, AddPaymentMethodActivity.class, (int) REQUEST_CODE, (Integer) null, 8, (f) null);
        i.e(fragment, "fragment");
    }
}
