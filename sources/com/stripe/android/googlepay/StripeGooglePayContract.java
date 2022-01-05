package com.stripe.android.googlepay;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.api.Status;
import com.stripe.android.model.PaymentIntent;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.view.ActivityStarter;
import h0.a.f.d.a;
import java.io.Serializable;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u0011\u0012\u0013B\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0007H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayContract;", "Lh0/a/f/d/a;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "Landroid/content/Context;", "context", "input", "Landroid/content/Intent;", "createIntent", "(Landroid/content/Context;Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;)Landroid/content/Intent;", "", "resultCode", "intent", "parseResult", "(ILandroid/content/Intent;)Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "<init>", "()V", "Args", "GooglePayConfig", "Result", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeGooglePayContract.kt */
public final class StripeGooglePayContract extends a<Args, Result> {

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\b\u0018\u0000 -2\u00020\u0001:\u0001-B#\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\n\b\u0001\u0010\r\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b+\u0010,J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0003\u0010\r\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0014J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001b\u0010\r\u001a\u0004\u0018\u00010\b8\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010!\u001a\u0004\b\"\u0010\nR\"\u0010\u000b\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010#\u001a\u0004\b$\u0010\u0004\"\u0004\b%\u0010&R\"\u0010\f\u001a\u00020\u00058\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\f\u0010'\u001a\u0004\b(\u0010\u0007\"\u0004\b)\u0010*¨\u0006."}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "Lcom/stripe/android/view/ActivityStarter$Args;", "Lcom/stripe/android/model/PaymentIntent;", "component1", "()Lcom/stripe/android/model/PaymentIntent;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$GooglePayConfig;", "component2", "()Lcom/stripe/android/googlepay/StripeGooglePayContract$GooglePayConfig;", "", "component3", "()Ljava/lang/Integer;", "paymentIntent", "config", "statusBarColor", "copy", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/googlepay/StripeGooglePayContract$GooglePayConfig;Ljava/lang/Integer;)Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Integer;", "getStatusBarColor", "Lcom/stripe/android/model/PaymentIntent;", "getPaymentIntent", "setPaymentIntent", "(Lcom/stripe/android/model/PaymentIntent;)V", "Lcom/stripe/android/googlepay/StripeGooglePayContract$GooglePayConfig;", "getConfig", "setConfig", "(Lcom/stripe/android/googlepay/StripeGooglePayContract$GooglePayConfig;)V", "<init>", "(Lcom/stripe/android/model/PaymentIntent;Lcom/stripe/android/googlepay/StripeGooglePayContract$GooglePayConfig;Ljava/lang/Integer;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeGooglePayContract.kt */
    public static final class Args implements ActivityStarter.Args {
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        public static final Companion Companion = new Companion((f) null);
        private GooglePayConfig config;
        private PaymentIntent paymentIntent;
        private final Integer statusBarColor;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayContract$Args$Companion;", "", "Landroid/content/Intent;", "intent", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "create$payments_core_release", "(Landroid/content/Intent;)Lcom/stripe/android/googlepay/StripeGooglePayContract$Args;", "create", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeGooglePayContract.kt */
        public static final class Companion {
            private Companion() {
            }

            public final /* synthetic */ Args create$payments_core_release(Intent intent) {
                i.e(intent, "intent");
                return (Args) intent.getParcelableExtra("extra_activity_args");
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<Args> {
            public final Args createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new Args(PaymentIntent.CREATOR.createFromParcel(parcel), GooglePayConfig.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            }

            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public Args(PaymentIntent paymentIntent2, GooglePayConfig googlePayConfig, Integer num) {
            i.e(paymentIntent2, "paymentIntent");
            i.e(googlePayConfig, "config");
            this.paymentIntent = paymentIntent2;
            this.config = googlePayConfig;
            this.statusBarColor = num;
        }

        public static /* synthetic */ Args copy$default(Args args, PaymentIntent paymentIntent2, GooglePayConfig googlePayConfig, Integer num, int i, Object obj) {
            if ((i & 1) != 0) {
                paymentIntent2 = args.paymentIntent;
            }
            if ((i & 2) != 0) {
                googlePayConfig = args.config;
            }
            if ((i & 4) != 0) {
                num = args.statusBarColor;
            }
            return args.copy(paymentIntent2, googlePayConfig, num);
        }

        public final PaymentIntent component1() {
            return this.paymentIntent;
        }

        public final GooglePayConfig component2() {
            return this.config;
        }

        public final Integer component3() {
            return this.statusBarColor;
        }

        public final Args copy(PaymentIntent paymentIntent2, GooglePayConfig googlePayConfig, Integer num) {
            i.e(paymentIntent2, "paymentIntent");
            i.e(googlePayConfig, "config");
            return new Args(paymentIntent2, googlePayConfig, num);
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
            return i.a(this.paymentIntent, args.paymentIntent) && i.a(this.config, args.config) && i.a(this.statusBarColor, args.statusBarColor);
        }

        public final GooglePayConfig getConfig() {
            return this.config;
        }

        public final PaymentIntent getPaymentIntent() {
            return this.paymentIntent;
        }

        public final Integer getStatusBarColor() {
            return this.statusBarColor;
        }

        public int hashCode() {
            PaymentIntent paymentIntent2 = this.paymentIntent;
            int i = 0;
            int hashCode = (paymentIntent2 != null ? paymentIntent2.hashCode() : 0) * 31;
            GooglePayConfig googlePayConfig = this.config;
            int hashCode2 = (hashCode + (googlePayConfig != null ? googlePayConfig.hashCode() : 0)) * 31;
            Integer num = this.statusBarColor;
            if (num != null) {
                i = num.hashCode();
            }
            return hashCode2 + i;
        }

        public final void setConfig(GooglePayConfig googlePayConfig) {
            i.e(googlePayConfig, "<set-?>");
            this.config = googlePayConfig;
        }

        public final void setPaymentIntent(PaymentIntent paymentIntent2) {
            i.e(paymentIntent2, "<set-?>");
            this.paymentIntent = paymentIntent2;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("Args(paymentIntent=");
            P0.append(this.paymentIntent);
            P0.append(", config=");
            P0.append(this.config);
            P0.append(", statusBarColor=");
            P0.append(this.statusBarColor);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            this.paymentIntent.writeToParcel(parcel, 0);
            this.config.writeToParcel(parcel, 0);
            Integer num = this.statusBarColor;
            if (num != null) {
                i0.d.a.a.a.i(parcel, 1, num);
            } else {
                parcel.writeInt(0);
            }
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\b\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\t\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b2\u00103J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\b\u001a\u00020\u0005HÀ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\tHÀ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÀ\u0003¢\u0006\u0004\b\r\u0010\u0007J:\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\t2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0007J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u0018J \u0010\"\u001a\u00020!2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\"\u0010#R\"\u0010\u0011\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010$\u001a\u0004\b%\u0010\u000b\"\u0004\b&\u0010'R\"\u0010\u000f\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010(\u001a\u0004\b)\u0010\u0004\"\u0004\b*\u0010+R\"\u0010\u0010\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010,\u001a\u0004\b-\u0010\u0007\"\u0004\b.\u0010/R$\u0010\u0012\u001a\u0004\u0018\u00010\u00058\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010,\u001a\u0004\b0\u0010\u0007\"\u0004\b1\u0010/¨\u00064"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayContract$GooglePayConfig;", "Landroid/os/Parcelable;", "Lcom/stripe/android/googlepay/StripeGooglePayEnvironment;", "component1", "()Lcom/stripe/android/googlepay/StripeGooglePayEnvironment;", "", "component2$payments_core_release", "()Ljava/lang/String;", "component2", "", "component3$payments_core_release", "()Z", "component3", "component4$payments_core_release", "component4", "environment", "countryCode", "isEmailRequired", "merchantName", "copy", "(Lcom/stripe/android/googlepay/StripeGooglePayEnvironment;Ljava/lang/String;ZLjava/lang/String;)Lcom/stripe/android/googlepay/StripeGooglePayContract$GooglePayConfig;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "isEmailRequired$payments_core_release", "setEmailRequired$payments_core_release", "(Z)V", "Lcom/stripe/android/googlepay/StripeGooglePayEnvironment;", "getEnvironment", "setEnvironment", "(Lcom/stripe/android/googlepay/StripeGooglePayEnvironment;)V", "Ljava/lang/String;", "getCountryCode$payments_core_release", "setCountryCode$payments_core_release", "(Ljava/lang/String;)V", "getMerchantName$payments_core_release", "setMerchantName$payments_core_release", "<init>", "(Lcom/stripe/android/googlepay/StripeGooglePayEnvironment;Ljava/lang/String;ZLjava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeGooglePayContract.kt */
    public static final class GooglePayConfig implements Parcelable {
        public static final Parcelable.Creator<GooglePayConfig> CREATOR = new Creator();
        private String countryCode;
        private StripeGooglePayEnvironment environment;
        private boolean isEmailRequired;
        private String merchantName;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<GooglePayConfig> {
            public final GooglePayConfig createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new GooglePayConfig((StripeGooglePayEnvironment) Enum.valueOf(StripeGooglePayEnvironment.class, parcel.readString()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            }

            public final GooglePayConfig[] newArray(int i) {
                return new GooglePayConfig[i];
            }
        }

        public GooglePayConfig(StripeGooglePayEnvironment stripeGooglePayEnvironment, String str, boolean z, String str2) {
            i.e(stripeGooglePayEnvironment, "environment");
            i.e(str, "countryCode");
            this.environment = stripeGooglePayEnvironment;
            this.countryCode = str;
            this.isEmailRequired = z;
            this.merchantName = str2;
        }

        public static /* synthetic */ GooglePayConfig copy$default(GooglePayConfig googlePayConfig, StripeGooglePayEnvironment stripeGooglePayEnvironment, String str, boolean z, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                stripeGooglePayEnvironment = googlePayConfig.environment;
            }
            if ((i & 2) != 0) {
                str = googlePayConfig.countryCode;
            }
            if ((i & 4) != 0) {
                z = googlePayConfig.isEmailRequired;
            }
            if ((i & 8) != 0) {
                str2 = googlePayConfig.merchantName;
            }
            return googlePayConfig.copy(stripeGooglePayEnvironment, str, z, str2);
        }

        public final StripeGooglePayEnvironment component1() {
            return this.environment;
        }

        public final String component2$payments_core_release() {
            return this.countryCode;
        }

        public final boolean component3$payments_core_release() {
            return this.isEmailRequired;
        }

        public final String component4$payments_core_release() {
            return this.merchantName;
        }

        public final GooglePayConfig copy(StripeGooglePayEnvironment stripeGooglePayEnvironment, String str, boolean z, String str2) {
            i.e(stripeGooglePayEnvironment, "environment");
            i.e(str, "countryCode");
            return new GooglePayConfig(stripeGooglePayEnvironment, str, z, str2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof GooglePayConfig)) {
                return false;
            }
            GooglePayConfig googlePayConfig = (GooglePayConfig) obj;
            return i.a(this.environment, googlePayConfig.environment) && i.a(this.countryCode, googlePayConfig.countryCode) && this.isEmailRequired == googlePayConfig.isEmailRequired && i.a(this.merchantName, googlePayConfig.merchantName);
        }

        public final String getCountryCode$payments_core_release() {
            return this.countryCode;
        }

        public final StripeGooglePayEnvironment getEnvironment() {
            return this.environment;
        }

        public final String getMerchantName$payments_core_release() {
            return this.merchantName;
        }

        public int hashCode() {
            StripeGooglePayEnvironment stripeGooglePayEnvironment = this.environment;
            int i = 0;
            int hashCode = (stripeGooglePayEnvironment != null ? stripeGooglePayEnvironment.hashCode() : 0) * 31;
            String str = this.countryCode;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            boolean z = this.isEmailRequired;
            if (z) {
                z = true;
            }
            int i2 = (hashCode2 + (z ? 1 : 0)) * 31;
            String str2 = this.merchantName;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return i2 + i;
        }

        public final boolean isEmailRequired$payments_core_release() {
            return this.isEmailRequired;
        }

        public final void setCountryCode$payments_core_release(String str) {
            i.e(str, "<set-?>");
            this.countryCode = str;
        }

        public final void setEmailRequired$payments_core_release(boolean z) {
            this.isEmailRequired = z;
        }

        public final void setEnvironment(StripeGooglePayEnvironment stripeGooglePayEnvironment) {
            i.e(stripeGooglePayEnvironment, "<set-?>");
            this.environment = stripeGooglePayEnvironment;
        }

        public final void setMerchantName$payments_core_release(String str) {
            this.merchantName = str;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("GooglePayConfig(environment=");
            P0.append(this.environment);
            P0.append(", countryCode=");
            P0.append(this.countryCode);
            P0.append(", isEmailRequired=");
            P0.append(this.isEmailRequired);
            P0.append(", merchantName=");
            return i0.d.a.a.a.y0(P0, this.merchantName, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.environment.name());
            parcel.writeString(this.countryCode);
            parcel.writeInt(this.isEmailRequired ? 1 : 0);
            parcel.writeString(this.merchantName);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ GooglePayConfig(StripeGooglePayEnvironment stripeGooglePayEnvironment, String str, boolean z, String str2, int i, f fVar) {
            this(stripeGooglePayEnvironment, str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : str2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000 \u00072\u00020\u0001:\u0005\b\u0007\t\n\u000bB\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004\u0001\u0004\f\r\u000e\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "Lcom/stripe/android/view/ActivityStarter$Result;", "Landroid/os/Bundle;", "toBundle", "()Landroid/os/Bundle;", "<init>", "()V", "Companion", "Canceled", "Error", "PaymentData", "Unavailable", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$Error;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$PaymentData;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$Canceled;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$Unavailable;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeGooglePayContract.kt */
    public static abstract class Result implements ActivityStarter.Result {
        public static final Companion Companion = new Companion((f) null);

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$Canceled;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeGooglePayContract.kt */
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

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$Companion;", "", "Landroid/content/Intent;", "intent", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "fromIntent", "(Landroid/content/Intent;)Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeGooglePayContract.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Result fromIntent(Intent intent) {
                Result result = intent != null ? (Result) intent.getParcelableExtra("extra_activity_result") : null;
                return result != null ? result : new Error(new IllegalStateException("Error while processing result from Google Pay."), (Status) null, (PaymentMethod) null, (ShippingInformation) null, 14, (f) null);
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\b\b\u0007\u0018\u0000 !2\u00020\u0001:\u0001!B3\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nR\u001b\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006@\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006@\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u001b\u001a\u00020\u001a8\u0006@\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$Error;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "()Lcom/stripe/android/model/PaymentMethod;", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation", "()Lcom/stripe/android/model/ShippingInformation;", "Lcom/google/android/gms/common/api/Status;", "googlePayStatus", "Lcom/google/android/gms/common/api/Status;", "getGooglePayStatus", "()Lcom/google/android/gms/common/api/Status;", "", "exception", "Ljava/lang/Throwable;", "getException", "()Ljava/lang/Throwable;", "<init>", "(Ljava/lang/Throwable;Lcom/google/android/gms/common/api/Status;Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeGooglePayContract.kt */
        public static final class Error extends Result {
            public static final Parcelable.Creator<Error> CREATOR = new Creator();
            public static final Companion Companion = new Companion((f) null);
            private final Throwable exception;
            private final Status googlePayStatus;
            private final PaymentMethod paymentMethod;
            private final ShippingInformation shippingInformation;

            @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\n\u001a\u00020\t*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$Error$Companion;", "Ln0/b/a;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$Error;", "Landroid/os/Parcel;", "parcel", "create", "(Landroid/os/Parcel;)Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$Error;", "", "flags", "Lm0/i;", "write", "(Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$Error;Landroid/os/Parcel;I)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
            /* compiled from: StripeGooglePayContract.kt */
            public static final class Companion implements n0.b.a<Error> {
                private Companion() {
                }

                public Error[] newArray(int i) {
                    m0.r.t.a.r.m.a1.a.P2(this);
                    throw null;
                }

                public /* synthetic */ Companion(f fVar) {
                    this();
                }

                public Error create(Parcel parcel) {
                    i.e(parcel, "parcel");
                    Serializable readSerializable = parcel.readSerializable();
                    Objects.requireNonNull(readSerializable, "null cannot be cast to non-null type kotlin.Throwable");
                    return new Error((Throwable) readSerializable, (Status) parcel.readParcelable(Status.class.getClassLoader()), (PaymentMethod) null, (ShippingInformation) null, 12, (f) null);
                }

                public void write(Error error, Parcel parcel, int i) {
                    i.e(error, "$this$write");
                    i.e(parcel, "parcel");
                    parcel.writeSerializable(error.getException());
                    parcel.writeParcelable(error.getGooglePayStatus(), i);
                }
            }

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<Error> {
                public final Error createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return Error.Companion.create(parcel);
                }

                public final Error[] newArray(int i) {
                    return new Error[i];
                }
            }

            /* JADX INFO: this call moved to the top of the method (can break code semantics) */
            public /* synthetic */ Error(Throwable th, Status status, PaymentMethod paymentMethod2, ShippingInformation shippingInformation2, int i, f fVar) {
                this(th, (i & 2) != 0 ? null : status, (i & 4) != 0 ? null : paymentMethod2, (i & 8) != 0 ? null : shippingInformation2);
            }

            public int describeContents() {
                return 0;
            }

            public final Throwable getException() {
                return this.exception;
            }

            public final Status getGooglePayStatus() {
                return this.googlePayStatus;
            }

            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public final ShippingInformation getShippingInformation() {
                return this.shippingInformation;
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                Companion.write(this, parcel, i);
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public Error(Throwable th, Status status, PaymentMethod paymentMethod2, ShippingInformation shippingInformation2) {
                super((f) null);
                i.e(th, "exception");
                this.exception = th;
                this.googlePayStatus = status;
                this.paymentMethod = paymentMethod2;
                this.shippingInformation = shippingInformation2;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\"\u0010#J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u0019\u0010\b\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\b\u0010\u001e\u001a\u0004\b\u001f\u0010\u0004R\u001b\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b!\u0010\u0007¨\u0006$"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$PaymentData;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "Lcom/stripe/android/model/PaymentMethod;", "component1", "()Lcom/stripe/android/model/PaymentMethod;", "Lcom/stripe/android/model/ShippingInformation;", "component2", "()Lcom/stripe/android/model/ShippingInformation;", "paymentMethod", "shippingInformation", "copy", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;)Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$PaymentData;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/PaymentMethod;", "getPaymentMethod", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation", "<init>", "(Lcom/stripe/android/model/PaymentMethod;Lcom/stripe/android/model/ShippingInformation;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeGooglePayContract.kt */
        public static final class PaymentData extends Result {
            public static final Parcelable.Creator<PaymentData> CREATOR = new Creator();
            private final PaymentMethod paymentMethod;
            private final ShippingInformation shippingInformation;

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<PaymentData> {
                public final PaymentData createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    return new PaymentData(PaymentMethod.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? ShippingInformation.CREATOR.createFromParcel(parcel) : null);
                }

                public final PaymentData[] newArray(int i) {
                    return new PaymentData[i];
                }
            }

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public PaymentData(PaymentMethod paymentMethod2, ShippingInformation shippingInformation2) {
                super((f) null);
                i.e(paymentMethod2, "paymentMethod");
                this.paymentMethod = paymentMethod2;
                this.shippingInformation = shippingInformation2;
            }

            public static /* synthetic */ PaymentData copy$default(PaymentData paymentData, PaymentMethod paymentMethod2, ShippingInformation shippingInformation2, int i, Object obj) {
                if ((i & 1) != 0) {
                    paymentMethod2 = paymentData.paymentMethod;
                }
                if ((i & 2) != 0) {
                    shippingInformation2 = paymentData.shippingInformation;
                }
                return paymentData.copy(paymentMethod2, shippingInformation2);
            }

            public final PaymentMethod component1() {
                return this.paymentMethod;
            }

            public final ShippingInformation component2() {
                return this.shippingInformation;
            }

            public final PaymentData copy(PaymentMethod paymentMethod2, ShippingInformation shippingInformation2) {
                i.e(paymentMethod2, "paymentMethod");
                return new PaymentData(paymentMethod2, shippingInformation2);
            }

            public int describeContents() {
                return 0;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof PaymentData)) {
                    return false;
                }
                PaymentData paymentData = (PaymentData) obj;
                return i.a(this.paymentMethod, paymentData.paymentMethod) && i.a(this.shippingInformation, paymentData.shippingInformation);
            }

            public final PaymentMethod getPaymentMethod() {
                return this.paymentMethod;
            }

            public final ShippingInformation getShippingInformation() {
                return this.shippingInformation;
            }

            public int hashCode() {
                PaymentMethod paymentMethod2 = this.paymentMethod;
                int i = 0;
                int hashCode = (paymentMethod2 != null ? paymentMethod2.hashCode() : 0) * 31;
                ShippingInformation shippingInformation2 = this.shippingInformation;
                if (shippingInformation2 != null) {
                    i = shippingInformation2.hashCode();
                }
                return hashCode + i;
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("PaymentData(paymentMethod=");
                P0.append(this.paymentMethod);
                P0.append(", shippingInformation=");
                P0.append(this.shippingInformation);
                P0.append(")");
                return P0.toString();
            }

            public void writeToParcel(Parcel parcel, int i) {
                i.e(parcel, "parcel");
                this.paymentMethod.writeToParcel(parcel, 0);
                ShippingInformation shippingInformation2 = this.shippingInformation;
                if (shippingInformation2 != null) {
                    parcel.writeInt(1);
                    shippingInformation2.writeToParcel(parcel, 0);
                    return;
                }
                parcel.writeInt(0);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u0003\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0003\u0010\u0004J \u0010\t\u001a\u00020\b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/googlepay/StripeGooglePayContract$Result$Unavailable;", "Lcom/stripe/android/googlepay/StripeGooglePayContract$Result;", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: StripeGooglePayContract.kt */
        public static final class Unavailable extends Result {
            public static final Parcelable.Creator<Unavailable> CREATOR = new Creator();
            public static final Unavailable INSTANCE = new Unavailable();

            @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
            public static class Creator implements Parcelable.Creator<Unavailable> {
                public final Unavailable createFromParcel(Parcel parcel) {
                    i.e(parcel, "in");
                    if (parcel.readInt() != 0) {
                        return Unavailable.INSTANCE;
                    }
                    return null;
                }

                public final Unavailable[] newArray(int i) {
                    return new Unavailable[i];
                }
            }

            private Unavailable() {
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

    public Intent createIntent(Context context, Args args) {
        i.e(context, "context");
        Intent putExtra = new Intent(context, StripeGooglePayActivity.class).putExtra("extra_activity_args", args);
        i.d(putExtra, "Intent(context, StripeGo…tarter.Args.EXTRA, input)");
        return putExtra;
    }

    public Result parseResult(int i, Intent intent) {
        return Result.Companion.fromIntent(intent);
    }
}
