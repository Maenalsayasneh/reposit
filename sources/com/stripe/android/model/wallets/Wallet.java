package com.stripe.android.model.wallets;

import android.os.Parcel;
import android.os.Parcelable;
import com.stripe.android.model.Address;
import com.stripe.android.model.StripeModel;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\t\n\u000b\f\r\u000e\u000fB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\u0001\u0006\u0010\u0011\u0012\u0013\u0014\u0015¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/model/wallets/Wallet;", "Lcom/stripe/android/model/StripeModel;", "Lcom/stripe/android/model/wallets/Wallet$Type;", "walletType", "Lcom/stripe/android/model/wallets/Wallet$Type;", "getWalletType$payments_core_release", "()Lcom/stripe/android/model/wallets/Wallet$Type;", "<init>", "(Lcom/stripe/android/model/wallets/Wallet$Type;)V", "AmexExpressCheckoutWallet", "ApplePayWallet", "GooglePayWallet", "MasterpassWallet", "SamsungPayWallet", "Type", "VisaCheckoutWallet", "Lcom/stripe/android/model/wallets/Wallet$AmexExpressCheckoutWallet;", "Lcom/stripe/android/model/wallets/Wallet$ApplePayWallet;", "Lcom/stripe/android/model/wallets/Wallet$GooglePayWallet;", "Lcom/stripe/android/model/wallets/Wallet$MasterpassWallet;", "Lcom/stripe/android/model/wallets/Wallet$SamsungPayWallet;", "Lcom/stripe/android/model/wallets/Wallet$VisaCheckoutWallet;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: Wallet.kt */
public abstract class Wallet implements StripeModel {
    private final Type walletType;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/wallets/Wallet$AmexExpressCheckoutWallet;", "Lcom/stripe/android/model/wallets/Wallet;", "", "component1", "()Ljava/lang/String;", "dynamicLast4", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/wallets/Wallet$AmexExpressCheckoutWallet;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDynamicLast4", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Wallet.kt */
    public static final class AmexExpressCheckoutWallet extends Wallet {
        public static final Parcelable.Creator<AmexExpressCheckoutWallet> CREATOR = new Creator();
        private final String dynamicLast4;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<AmexExpressCheckoutWallet> {
            public final AmexExpressCheckoutWallet createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new AmexExpressCheckoutWallet(parcel.readString());
            }

            public final AmexExpressCheckoutWallet[] newArray(int i) {
                return new AmexExpressCheckoutWallet[i];
            }
        }

        public AmexExpressCheckoutWallet(String str) {
            super(Type.AmexExpressCheckout, (f) null);
            this.dynamicLast4 = str;
        }

        public static /* synthetic */ AmexExpressCheckoutWallet copy$default(AmexExpressCheckoutWallet amexExpressCheckoutWallet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = amexExpressCheckoutWallet.dynamicLast4;
            }
            return amexExpressCheckoutWallet.copy(str);
        }

        public final String component1() {
            return this.dynamicLast4;
        }

        public final AmexExpressCheckoutWallet copy(String str) {
            return new AmexExpressCheckoutWallet(str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof AmexExpressCheckoutWallet) && i.a(this.dynamicLast4, ((AmexExpressCheckoutWallet) obj).dynamicLast4);
            }
            return true;
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        public int hashCode() {
            String str = this.dynamicLast4;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.y0(a.P0("AmexExpressCheckoutWallet(dynamicLast4="), this.dynamicLast4, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.dynamicLast4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/wallets/Wallet$ApplePayWallet;", "Lcom/stripe/android/model/wallets/Wallet;", "", "component1", "()Ljava/lang/String;", "dynamicLast4", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/wallets/Wallet$ApplePayWallet;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDynamicLast4", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Wallet.kt */
    public static final class ApplePayWallet extends Wallet {
        public static final Parcelable.Creator<ApplePayWallet> CREATOR = new Creator();
        private final String dynamicLast4;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<ApplePayWallet> {
            public final ApplePayWallet createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new ApplePayWallet(parcel.readString());
            }

            public final ApplePayWallet[] newArray(int i) {
                return new ApplePayWallet[i];
            }
        }

        public ApplePayWallet(String str) {
            super(Type.ApplePay, (f) null);
            this.dynamicLast4 = str;
        }

        public static /* synthetic */ ApplePayWallet copy$default(ApplePayWallet applePayWallet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = applePayWallet.dynamicLast4;
            }
            return applePayWallet.copy(str);
        }

        public final String component1() {
            return this.dynamicLast4;
        }

        public final ApplePayWallet copy(String str) {
            return new ApplePayWallet(str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof ApplePayWallet) && i.a(this.dynamicLast4, ((ApplePayWallet) obj).dynamicLast4);
            }
            return true;
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        public int hashCode() {
            String str = this.dynamicLast4;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.y0(a.P0("ApplePayWallet(dynamicLast4="), this.dynamicLast4, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.dynamicLast4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u00012\u00020\u0002B\u0013\b\u0000\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\t\u0010\u0005J\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001b\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u0005¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/model/wallets/Wallet$GooglePayWallet;", "Lcom/stripe/android/model/wallets/Wallet;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "dynamicLast4", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/wallets/Wallet$GooglePayWallet;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDynamicLast4", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Wallet.kt */
    public static final class GooglePayWallet extends Wallet implements Parcelable {
        public static final Parcelable.Creator<GooglePayWallet> CREATOR = new Creator();
        private final String dynamicLast4;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<GooglePayWallet> {
            public final GooglePayWallet createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new GooglePayWallet(parcel.readString());
            }

            public final GooglePayWallet[] newArray(int i) {
                return new GooglePayWallet[i];
            }
        }

        public GooglePayWallet(String str) {
            super(Type.GooglePay, (f) null);
            this.dynamicLast4 = str;
        }

        public static /* synthetic */ GooglePayWallet copy$default(GooglePayWallet googlePayWallet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = googlePayWallet.dynamicLast4;
            }
            return googlePayWallet.copy(str);
        }

        public final String component1() {
            return this.dynamicLast4;
        }

        public final GooglePayWallet copy(String str) {
            return new GooglePayWallet(str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof GooglePayWallet) && i.a(this.dynamicLast4, ((GooglePayWallet) obj).dynamicLast4);
            }
            return true;
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        public int hashCode() {
            String str = this.dynamicLast4;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.y0(a.P0("GooglePayWallet(dynamicLast4="), this.dynamicLast4, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.dynamicLast4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B1\b\u0000\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J@\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0007J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u0004R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010\"\u001a\u0004\b#\u0010\u0007R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b$\u0010\u0004R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b%\u0010\u0007¨\u0006("}, d2 = {"Lcom/stripe/android/model/wallets/Wallet$MasterpassWallet;", "Lcom/stripe/android/model/wallets/Wallet;", "Lcom/stripe/android/model/Address;", "component1", "()Lcom/stripe/android/model/Address;", "", "component2", "()Ljava/lang/String;", "component3", "component4", "billingAddress", "email", "name", "shippingAddress", "copy", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;)Lcom/stripe/android/model/wallets/Wallet$MasterpassWallet;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/Address;", "getBillingAddress", "Ljava/lang/String;", "getName", "getShippingAddress", "getEmail", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Wallet.kt */
    public static final class MasterpassWallet extends Wallet {
        public static final Parcelable.Creator<MasterpassWallet> CREATOR = new Creator();
        private final Address billingAddress;
        private final String email;
        private final String name;
        private final Address shippingAddress;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<MasterpassWallet> {
            public final MasterpassWallet createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                Address address = null;
                Address createFromParcel = parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null;
                String readString = parcel.readString();
                String readString2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    address = Address.CREATOR.createFromParcel(parcel);
                }
                return new MasterpassWallet(createFromParcel, readString, readString2, address);
            }

            public final MasterpassWallet[] newArray(int i) {
                return new MasterpassWallet[i];
            }
        }

        public MasterpassWallet(Address address, String str, String str2, Address address2) {
            super(Type.Masterpass, (f) null);
            this.billingAddress = address;
            this.email = str;
            this.name = str2;
            this.shippingAddress = address2;
        }

        public static /* synthetic */ MasterpassWallet copy$default(MasterpassWallet masterpassWallet, Address address, String str, String str2, Address address2, int i, Object obj) {
            if ((i & 1) != 0) {
                address = masterpassWallet.billingAddress;
            }
            if ((i & 2) != 0) {
                str = masterpassWallet.email;
            }
            if ((i & 4) != 0) {
                str2 = masterpassWallet.name;
            }
            if ((i & 8) != 0) {
                address2 = masterpassWallet.shippingAddress;
            }
            return masterpassWallet.copy(address, str, str2, address2);
        }

        public final Address component1() {
            return this.billingAddress;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final Address component4() {
            return this.shippingAddress;
        }

        public final MasterpassWallet copy(Address address, String str, String str2, Address address2) {
            return new MasterpassWallet(address, str, str2, address2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MasterpassWallet)) {
                return false;
            }
            MasterpassWallet masterpassWallet = (MasterpassWallet) obj;
            return i.a(this.billingAddress, masterpassWallet.billingAddress) && i.a(this.email, masterpassWallet.email) && i.a(this.name, masterpassWallet.name) && i.a(this.shippingAddress, masterpassWallet.shippingAddress);
        }

        public final Address getBillingAddress() {
            return this.billingAddress;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final Address getShippingAddress() {
            return this.shippingAddress;
        }

        public int hashCode() {
            Address address = this.billingAddress;
            int i = 0;
            int hashCode = (address != null ? address.hashCode() : 0) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Address address2 = this.shippingAddress;
            if (address2 != null) {
                i = address2.hashCode();
            }
            return hashCode3 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("MasterpassWallet(billingAddress=");
            P0.append(this.billingAddress);
            P0.append(", email=");
            P0.append(this.email);
            P0.append(", name=");
            P0.append(this.name);
            P0.append(", shippingAddress=");
            P0.append(this.shippingAddress);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            Address address = this.billingAddress;
            if (address != null) {
                parcel.writeInt(1);
                address.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            Address address2 = this.shippingAddress;
            if (address2 != null) {
                parcel.writeInt(1);
                address2.writeToParcel(parcel, 0);
                return;
            }
            parcel.writeInt(0);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0013\b\u0000\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0006\u001a\u00020\u00002\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\u0004J\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u000bJ \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/model/wallets/Wallet$SamsungPayWallet;", "Lcom/stripe/android/model/wallets/Wallet;", "", "component1", "()Ljava/lang/String;", "dynamicLast4", "copy", "(Ljava/lang/String;)Lcom/stripe/android/model/wallets/Wallet$SamsungPayWallet;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDynamicLast4", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Wallet.kt */
    public static final class SamsungPayWallet extends Wallet {
        public static final Parcelable.Creator<SamsungPayWallet> CREATOR = new Creator();
        private final String dynamicLast4;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<SamsungPayWallet> {
            public final SamsungPayWallet createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new SamsungPayWallet(parcel.readString());
            }

            public final SamsungPayWallet[] newArray(int i) {
                return new SamsungPayWallet[i];
            }
        }

        public SamsungPayWallet(String str) {
            super(Type.SamsungPay, (f) null);
            this.dynamicLast4 = str;
        }

        public static /* synthetic */ SamsungPayWallet copy$default(SamsungPayWallet samsungPayWallet, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = samsungPayWallet.dynamicLast4;
            }
            return samsungPayWallet.copy(str);
        }

        public final String component1() {
            return this.dynamicLast4;
        }

        public final SamsungPayWallet copy(String str) {
            return new SamsungPayWallet(str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof SamsungPayWallet) && i.a(this.dynamicLast4, ((SamsungPayWallet) obj).dynamicLast4);
            }
            return true;
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        public int hashCode() {
            String str = this.dynamicLast4;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.y0(a.P0("SamsungPayWallet(dynamicLast4="), this.dynamicLast4, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.dynamicLast4);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0001\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0019\u0010\u0003\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/model/wallets/Wallet$Type;", "", "", "code", "Ljava/lang/String;", "getCode", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Companion", "AmexExpressCheckout", "ApplePay", "GooglePay", "Masterpass", "SamsungPay", "VisaCheckout", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Wallet.kt */
    public enum Type {
        AmexExpressCheckout("amex_express_checkout"),
        ApplePay("apple_pay"),
        GooglePay("google_pay"),
        Masterpass("master_pass"),
        SamsungPay("samsung_pay"),
        VisaCheckout("visa_checkout");
        
        public static final Companion Companion = null;
        private final String code;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n"}, d2 = {"Lcom/stripe/android/model/wallets/Wallet$Type$Companion;", "", "", "code", "Lcom/stripe/android/model/wallets/Wallet$Type;", "fromCode$payments_core_release", "(Ljava/lang/String;)Lcom/stripe/android/model/wallets/Wallet$Type;", "fromCode", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: Wallet.kt */
        public static final class Companion {
            private Companion() {
            }

            public final Type fromCode$payments_core_release(String str) {
                Type[] values = Type.values();
                for (int i = 0; i < 6; i++) {
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

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\b\u0018\u00002\u00020\u0001B;\b\u0000\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b)\u0010*J\u0012\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\b\u0010\u0007J\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\u0004J\u0012\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\n\u0010\u0007JL\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0015J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b \u0010!R\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010\u0004R\u001b\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010\u0007R\u001b\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u000b\u0010\"\u001a\u0004\b&\u0010\u0004R\u001b\u0010\r\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b'\u0010\u0007R\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00058\u0006@\u0006¢\u0006\f\n\u0004\b\u000f\u0010$\u001a\u0004\b(\u0010\u0007¨\u0006+"}, d2 = {"Lcom/stripe/android/model/wallets/Wallet$VisaCheckoutWallet;", "Lcom/stripe/android/model/wallets/Wallet;", "Lcom/stripe/android/model/Address;", "component1", "()Lcom/stripe/android/model/Address;", "", "component2", "()Ljava/lang/String;", "component3", "component4", "component5", "billingAddress", "email", "name", "shippingAddress", "dynamicLast4", "copy", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;)Lcom/stripe/android/model/wallets/Wallet$VisaCheckoutWallet;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/model/Address;", "getShippingAddress", "Ljava/lang/String;", "getEmail", "getBillingAddress", "getName", "getDynamicLast4", "<init>", "(Lcom/stripe/android/model/Address;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/Address;Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: Wallet.kt */
    public static final class VisaCheckoutWallet extends Wallet {
        public static final Parcelable.Creator<VisaCheckoutWallet> CREATOR = new Creator();
        private final Address billingAddress;
        private final String dynamicLast4;
        private final String email;
        private final String name;
        private final Address shippingAddress;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<VisaCheckoutWallet> {
            public final VisaCheckoutWallet createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new VisaCheckoutWallet(parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Address.CREATOR.createFromParcel(parcel) : null, parcel.readString());
            }

            public final VisaCheckoutWallet[] newArray(int i) {
                return new VisaCheckoutWallet[i];
            }
        }

        public VisaCheckoutWallet(Address address, String str, String str2, Address address2, String str3) {
            super(Type.VisaCheckout, (f) null);
            this.billingAddress = address;
            this.email = str;
            this.name = str2;
            this.shippingAddress = address2;
            this.dynamicLast4 = str3;
        }

        public static /* synthetic */ VisaCheckoutWallet copy$default(VisaCheckoutWallet visaCheckoutWallet, Address address, String str, String str2, Address address2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                address = visaCheckoutWallet.billingAddress;
            }
            if ((i & 2) != 0) {
                str = visaCheckoutWallet.email;
            }
            String str4 = str;
            if ((i & 4) != 0) {
                str2 = visaCheckoutWallet.name;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                address2 = visaCheckoutWallet.shippingAddress;
            }
            Address address3 = address2;
            if ((i & 16) != 0) {
                str3 = visaCheckoutWallet.dynamicLast4;
            }
            return visaCheckoutWallet.copy(address, str4, str5, address3, str3);
        }

        public final Address component1() {
            return this.billingAddress;
        }

        public final String component2() {
            return this.email;
        }

        public final String component3() {
            return this.name;
        }

        public final Address component4() {
            return this.shippingAddress;
        }

        public final String component5() {
            return this.dynamicLast4;
        }

        public final VisaCheckoutWallet copy(Address address, String str, String str2, Address address2, String str3) {
            return new VisaCheckoutWallet(address, str, str2, address2, str3);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof VisaCheckoutWallet)) {
                return false;
            }
            VisaCheckoutWallet visaCheckoutWallet = (VisaCheckoutWallet) obj;
            return i.a(this.billingAddress, visaCheckoutWallet.billingAddress) && i.a(this.email, visaCheckoutWallet.email) && i.a(this.name, visaCheckoutWallet.name) && i.a(this.shippingAddress, visaCheckoutWallet.shippingAddress) && i.a(this.dynamicLast4, visaCheckoutWallet.dynamicLast4);
        }

        public final Address getBillingAddress() {
            return this.billingAddress;
        }

        public final String getDynamicLast4() {
            return this.dynamicLast4;
        }

        public final String getEmail() {
            return this.email;
        }

        public final String getName() {
            return this.name;
        }

        public final Address getShippingAddress() {
            return this.shippingAddress;
        }

        public int hashCode() {
            Address address = this.billingAddress;
            int i = 0;
            int hashCode = (address != null ? address.hashCode() : 0) * 31;
            String str = this.email;
            int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.name;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            Address address2 = this.shippingAddress;
            int hashCode4 = (hashCode3 + (address2 != null ? address2.hashCode() : 0)) * 31;
            String str3 = this.dynamicLast4;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return hashCode4 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("VisaCheckoutWallet(billingAddress=");
            P0.append(this.billingAddress);
            P0.append(", email=");
            P0.append(this.email);
            P0.append(", name=");
            P0.append(this.name);
            P0.append(", shippingAddress=");
            P0.append(this.shippingAddress);
            P0.append(", dynamicLast4=");
            return a.y0(P0, this.dynamicLast4, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            Address address = this.billingAddress;
            if (address != null) {
                parcel.writeInt(1);
                address.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.email);
            parcel.writeString(this.name);
            Address address2 = this.shippingAddress;
            if (address2 != null) {
                parcel.writeInt(1);
                address2.writeToParcel(parcel, 0);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.dynamicLast4);
        }
    }

    private Wallet(Type type) {
        this.walletType = type;
    }

    public final Type getWalletType$payments_core_release() {
        return this.walletType;
    }

    public /* synthetic */ Wallet(Type type, f fVar) {
        this(type);
    }
}
