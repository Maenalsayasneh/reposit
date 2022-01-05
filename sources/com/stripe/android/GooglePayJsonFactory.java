package com.stripe.android;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Currency;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import m0.j.g;
import m0.n.b.f;
import m0.n.b.i;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 $2\u00020\u0001:\u0005%$&'(B\u0019\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010 B\u001b\b\u0016\u0012\u0006\u0010\"\u001a\u00020!\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0011¢\u0006\u0004\b\u001f\u0010#J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\u00020\u00042\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014JE\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0015\u001a\u00020\u00112\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0007¢\u0006\u0004\b\u0018\u0010\u0019R\u0016\u0010\u001a\u001a\u00020\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006)"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory;", "", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "transactionInfo", "Lorg/json/JSONObject;", "createTransactionInfo", "(Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;)Lorg/json/JSONObject;", "Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;", "shippingAddressParameters", "createShippingAddressParameters", "(Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;)Lorg/json/JSONObject;", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "billingAddressParameters", "createCardPaymentMethod", "(Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;)Lorg/json/JSONObject;", "createBaseCardPaymentMethodParams", "()Lorg/json/JSONObject;", "", "existingPaymentMethodRequired", "createIsReadyToPayRequest", "(Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Ljava/lang/Boolean;)Lorg/json/JSONObject;", "isEmailRequired", "Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;", "merchantInfo", "createPaymentDataRequest", "(Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;ZLcom/stripe/android/GooglePayJsonFactory$MerchantInfo;)Lorg/json/JSONObject;", "isJcbEnabled", "Z", "Lcom/stripe/android/GooglePayConfig;", "googlePayConfig", "Lcom/stripe/android/GooglePayConfig;", "<init>", "(Lcom/stripe/android/GooglePayConfig;Z)V", "Landroid/content/Context;", "context", "(Landroid/content/Context;Z)V", "Companion", "BillingAddressParameters", "MerchantInfo", "ShippingAddressParameters", "TransactionInfo", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: GooglePayJsonFactory.kt */
public final class GooglePayJsonFactory {
    @Deprecated
    private static final List<String> ALLOWED_AUTH_METHODS = g.K("PAN_ONLY", "CRYPTOGRAM_3DS");
    @Deprecated
    private static final int API_VERSION = 2;
    @Deprecated
    private static final int API_VERSION_MINOR = 0;
    @Deprecated
    private static final String CARD_PAYMENT_METHOD = "CARD";
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final List<String> DEFAULT_CARD_NETWORKS = g.K("AMEX", "DISCOVER", "MASTERCARD", "VISA");
    @Deprecated
    private static final String JCB_CARD_NETWORK = "JCB";
    private final GooglePayConfig googlePayConfig;
    private final boolean isJcbEnabled;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001:\u0001)B'\b\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\n\u0010\u0004J.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0016J \u0010 \u001a\u00020\u001f2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!R\u001c\u0010\r\u001a\u00020\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010\"\u001a\u0004\b#\u0010\bR\u001c\u0010\f\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010\u0004R\u001c\u0010\u000e\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b&\u0010\u0004¨\u0006*"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "Landroid/os/Parcelable;", "", "component1$payments_core_release", "()Z", "component1", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "component2$payments_core_release", "()Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "component2", "component3$payments_core_release", "component3", "isRequired", "format", "isPhoneNumberRequired", "copy", "(ZLcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;Z)Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "getFormat$payments_core_release", "Z", "isRequired$payments_core_release", "isPhoneNumberRequired$payments_core_release", "<init>", "(ZLcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;Z)V", "Format", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: GooglePayJsonFactory.kt */
    public static final class BillingAddressParameters implements Parcelable {
        public static final Parcelable.Creator<BillingAddressParameters> CREATOR = new Creator();
        private final Format format;
        private final boolean isPhoneNumberRequired;
        private final boolean isRequired;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<BillingAddressParameters> {
            public final BillingAddressParameters createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                boolean z = true;
                boolean z2 = parcel.readInt() != 0;
                Format format = (Format) Enum.valueOf(Format.class, parcel.readString());
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new BillingAddressParameters(z2, format, z);
            }

            public final BillingAddressParameters[] newArray(int i) {
                return new BillingAddressParameters[i];
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$BillingAddressParameters$Format;", "", "", "code", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Min", "Full", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: GooglePayJsonFactory.kt */
        public enum Format {
            Min("MIN"),
            Full("FULL");
            
            private final String code;

            private Format(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        public BillingAddressParameters() {
            this(false, (Format) null, false, 7, (f) null);
        }

        public BillingAddressParameters(boolean z) {
            this(z, (Format) null, false, 6, (f) null);
        }

        public BillingAddressParameters(boolean z, Format format2) {
            this(z, format2, false, 4, (f) null);
        }

        public BillingAddressParameters(boolean z, Format format2, boolean z2) {
            i.e(format2, "format");
            this.isRequired = z;
            this.format = format2;
            this.isPhoneNumberRequired = z2;
        }

        public static /* synthetic */ BillingAddressParameters copy$default(BillingAddressParameters billingAddressParameters, boolean z, Format format2, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = billingAddressParameters.isRequired;
            }
            if ((i & 2) != 0) {
                format2 = billingAddressParameters.format;
            }
            if ((i & 4) != 0) {
                z2 = billingAddressParameters.isPhoneNumberRequired;
            }
            return billingAddressParameters.copy(z, format2, z2);
        }

        public final boolean component1$payments_core_release() {
            return this.isRequired;
        }

        public final Format component2$payments_core_release() {
            return this.format;
        }

        public final boolean component3$payments_core_release() {
            return this.isPhoneNumberRequired;
        }

        public final BillingAddressParameters copy(boolean z, Format format2, boolean z2) {
            i.e(format2, "format");
            return new BillingAddressParameters(z, format2, z2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BillingAddressParameters)) {
                return false;
            }
            BillingAddressParameters billingAddressParameters = (BillingAddressParameters) obj;
            return this.isRequired == billingAddressParameters.isRequired && i.a(this.format, billingAddressParameters.format) && this.isPhoneNumberRequired == billingAddressParameters.isPhoneNumberRequired;
        }

        public final Format getFormat$payments_core_release() {
            return this.format;
        }

        public int hashCode() {
            boolean z = this.isRequired;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            Format format2 = this.format;
            int hashCode = (i + (format2 != null ? format2.hashCode() : 0)) * 31;
            boolean z3 = this.isPhoneNumberRequired;
            if (!z3) {
                z2 = z3;
            }
            return hashCode + (z2 ? 1 : 0);
        }

        public final boolean isPhoneNumberRequired$payments_core_release() {
            return this.isPhoneNumberRequired;
        }

        public final boolean isRequired$payments_core_release() {
            return this.isRequired;
        }

        public String toString() {
            StringBuilder P0 = a.P0("BillingAddressParameters(isRequired=");
            P0.append(this.isRequired);
            P0.append(", format=");
            P0.append(this.format);
            P0.append(", isPhoneNumberRequired=");
            return a.D0(P0, this.isPhoneNumberRequired, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeInt(this.isRequired ? 1 : 0);
            parcel.writeString(this.format.name());
            parcel.writeInt(this.isPhoneNumberRequired ? 1 : 0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ BillingAddressParameters(boolean z, Format format2, boolean z2, int i, f fVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? Format.Min : format2, (i & 4) != 0 ? false : z2);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0007\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\u00020\u00068\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0016\u0010\n\u001a\u00020\u00038\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0005R\u0016\u0010\r\u001a\u00020\u00038\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$Companion;", "", "", "", "ALLOWED_AUTH_METHODS", "Ljava/util/List;", "", "API_VERSION", "I", "API_VERSION_MINOR", "CARD_PAYMENT_METHOD", "Ljava/lang/String;", "DEFAULT_CARD_NETWORKS", "JCB_CARD_NETWORK", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: GooglePayJsonFactory.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u001c\u0010\u0007\u001a\u00020\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\u0004J\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0012\u0010\fJ \u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u0004¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;", "Landroid/os/Parcelable;", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "merchantName", "copy", "(Ljava/lang/String;)Lcom/stripe/android/GooglePayJsonFactory$MerchantInfo;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getMerchantName$payments_core_release", "<init>", "(Ljava/lang/String;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: GooglePayJsonFactory.kt */
    public static final class MerchantInfo implements Parcelable {
        public static final Parcelable.Creator<MerchantInfo> CREATOR = new Creator();
        private final String merchantName;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<MerchantInfo> {
            public final MerchantInfo createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new MerchantInfo(parcel.readString());
            }

            public final MerchantInfo[] newArray(int i) {
                return new MerchantInfo[i];
            }
        }

        public MerchantInfo() {
            this((String) null, 1, (f) null);
        }

        public MerchantInfo(String str) {
            this.merchantName = str;
        }

        public static /* synthetic */ MerchantInfo copy$default(MerchantInfo merchantInfo, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = merchantInfo.merchantName;
            }
            return merchantInfo.copy(str);
        }

        public final String component1$payments_core_release() {
            return this.merchantName;
        }

        public final MerchantInfo copy(String str) {
            return new MerchantInfo(str);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof MerchantInfo) && i.a(this.merchantName, ((MerchantInfo) obj).merchantName);
            }
            return true;
        }

        public final String getMerchantName$payments_core_release() {
            return this.merchantName;
        }

        public int hashCode() {
            String str = this.merchantName;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public String toString() {
            return a.y0(a.P0("MerchantInfo(merchantName="), this.merchantName, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.merchantName);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ MerchantInfo(String str, int i, f fVar) {
            this((i & 1) != 0 ? null : str);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\b\u0018\u00002\u00020\u0001:\u0002=>BU\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b;\u0010<J\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\n\u0010\u0004J\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\f\u0010\u0004J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u000eHÀ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÀ\u0003¢\u0006\u0004\b\u0012\u0010\u0004J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0014HÀ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J`\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00062\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0004J\u0010\u0010\"\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010$HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b)\u0010#J \u0010.\u001a\u00020-2\u0006\u0010+\u001a\u00020*2\u0006\u0010,\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b.\u0010/R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u00100\u001a\u0004\b1\u0010\u0004R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001a\u00100\u001a\u0004\b2\u0010\u0004R\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u000e8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001c\u00103\u001a\u0004\b4\u0010\u0010R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00148\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001e\u00105\u001a\u0004\b6\u0010\u0016R\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001d\u00100\u001a\u0004\b7\u0010\u0004R\u001c\u0010\u0019\u001a\u00020\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0019\u00108\u001a\u0004\b9\u0010\bR\u001c\u0010\u0018\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0018\u00100\u001a\u0004\b:\u0010\u0004¨\u0006?"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "Landroid/os/Parcelable;", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "component2$payments_core_release", "()Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "component2", "component3$payments_core_release", "component3", "component4$payments_core_release", "component4", "", "component5$payments_core_release", "()Ljava/lang/Integer;", "component5", "component6$payments_core_release", "component6", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "component7$payments_core_release", "()Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "component7", "currencyCode", "totalPriceStatus", "countryCode", "transactionId", "totalPrice", "totalPriceLabel", "checkoutOption", "copy", "(Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;)Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo;", "toString", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTransactionId$payments_core_release", "getCountryCode$payments_core_release", "Ljava/lang/Integer;", "getTotalPrice$payments_core_release", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "getCheckoutOption$payments_core_release", "getTotalPriceLabel$payments_core_release", "Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "getTotalPriceStatus$payments_core_release", "getCurrencyCode$payments_core_release", "<init>", "(Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;)V", "CheckoutOption", "TotalPriceStatus", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: GooglePayJsonFactory.kt */
    public static final class TransactionInfo implements Parcelable {
        public static final Parcelable.Creator<TransactionInfo> CREATOR = new Creator();
        private final CheckoutOption checkoutOption;
        private final String countryCode;
        private final String currencyCode;
        private final Integer totalPrice;
        private final String totalPriceLabel;
        private final TotalPriceStatus totalPriceStatus;
        private final String transactionId;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$CheckoutOption;", "", "", "code", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Default", "CompleteImmediatePurchase", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: GooglePayJsonFactory.kt */
        public enum CheckoutOption {
            Default("DEFAULT"),
            CompleteImmediatePurchase("COMPLETE_IMMEDIATE_PURCHASE");
            
            private final String code;

            private CheckoutOption(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<TransactionInfo> {
            public final TransactionInfo createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                return new TransactionInfo(parcel.readString(), (TotalPriceStatus) Enum.valueOf(TotalPriceStatus.class, parcel.readString()), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readInt() != 0 ? (CheckoutOption) Enum.valueOf(CheckoutOption.class, parcel.readString()) : null);
            }

            public final TransactionInfo[] newArray(int i) {
                return new TransactionInfo[i];
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\n\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\tj\u0002\b\nj\u0002\b\u000b¨\u0006\f"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$TransactionInfo$TotalPriceStatus;", "", "", "code", "Ljava/lang/String;", "getCode$payments_core_release", "()Ljava/lang/String;", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "NotCurrentlyKnown", "Estimated", "Final", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: GooglePayJsonFactory.kt */
        public enum TotalPriceStatus {
            NotCurrentlyKnown("NOT_CURRENTLY_KNOWN"),
            Estimated("ESTIMATED"),
            Final("FINAL");
            
            private final String code;

            private TotalPriceStatus(String str) {
                this.code = str;
            }

            public final String getCode$payments_core_release() {
                return this.code;
            }
        }

        public TransactionInfo(String str, TotalPriceStatus totalPriceStatus2) {
            this(str, totalPriceStatus2, (String) null, (String) null, (Integer) null, (String) null, (CheckoutOption) null, 124, (f) null);
        }

        public TransactionInfo(String str, TotalPriceStatus totalPriceStatus2, String str2) {
            this(str, totalPriceStatus2, str2, (String) null, (Integer) null, (String) null, (CheckoutOption) null, 120, (f) null);
        }

        public TransactionInfo(String str, TotalPriceStatus totalPriceStatus2, String str2, String str3) {
            this(str, totalPriceStatus2, str2, str3, (Integer) null, (String) null, (CheckoutOption) null, 112, (f) null);
        }

        public TransactionInfo(String str, TotalPriceStatus totalPriceStatus2, String str2, String str3, Integer num) {
            this(str, totalPriceStatus2, str2, str3, num, (String) null, (CheckoutOption) null, 96, (f) null);
        }

        public TransactionInfo(String str, TotalPriceStatus totalPriceStatus2, String str2, String str3, Integer num, String str4) {
            this(str, totalPriceStatus2, str2, str3, num, str4, (CheckoutOption) null, 64, (f) null);
        }

        public TransactionInfo(String str, TotalPriceStatus totalPriceStatus2, String str2, String str3, Integer num, String str4, CheckoutOption checkoutOption2) {
            i.e(str, "currencyCode");
            i.e(totalPriceStatus2, "totalPriceStatus");
            this.currencyCode = str;
            this.totalPriceStatus = totalPriceStatus2;
            this.countryCode = str2;
            this.transactionId = str3;
            this.totalPrice = num;
            this.totalPriceLabel = str4;
            this.checkoutOption = checkoutOption2;
        }

        public static /* synthetic */ TransactionInfo copy$default(TransactionInfo transactionInfo, String str, TotalPriceStatus totalPriceStatus2, String str2, String str3, Integer num, String str4, CheckoutOption checkoutOption2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = transactionInfo.currencyCode;
            }
            if ((i & 2) != 0) {
                totalPriceStatus2 = transactionInfo.totalPriceStatus;
            }
            TotalPriceStatus totalPriceStatus3 = totalPriceStatus2;
            if ((i & 4) != 0) {
                str2 = transactionInfo.countryCode;
            }
            String str5 = str2;
            if ((i & 8) != 0) {
                str3 = transactionInfo.transactionId;
            }
            String str6 = str3;
            if ((i & 16) != 0) {
                num = transactionInfo.totalPrice;
            }
            Integer num2 = num;
            if ((i & 32) != 0) {
                str4 = transactionInfo.totalPriceLabel;
            }
            String str7 = str4;
            if ((i & 64) != 0) {
                checkoutOption2 = transactionInfo.checkoutOption;
            }
            return transactionInfo.copy(str, totalPriceStatus3, str5, str6, num2, str7, checkoutOption2);
        }

        public final String component1$payments_core_release() {
            return this.currencyCode;
        }

        public final TotalPriceStatus component2$payments_core_release() {
            return this.totalPriceStatus;
        }

        public final String component3$payments_core_release() {
            return this.countryCode;
        }

        public final String component4$payments_core_release() {
            return this.transactionId;
        }

        public final Integer component5$payments_core_release() {
            return this.totalPrice;
        }

        public final String component6$payments_core_release() {
            return this.totalPriceLabel;
        }

        public final CheckoutOption component7$payments_core_release() {
            return this.checkoutOption;
        }

        public final TransactionInfo copy(String str, TotalPriceStatus totalPriceStatus2, String str2, String str3, Integer num, String str4, CheckoutOption checkoutOption2) {
            i.e(str, "currencyCode");
            i.e(totalPriceStatus2, "totalPriceStatus");
            return new TransactionInfo(str, totalPriceStatus2, str2, str3, num, str4, checkoutOption2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof TransactionInfo)) {
                return false;
            }
            TransactionInfo transactionInfo = (TransactionInfo) obj;
            return i.a(this.currencyCode, transactionInfo.currencyCode) && i.a(this.totalPriceStatus, transactionInfo.totalPriceStatus) && i.a(this.countryCode, transactionInfo.countryCode) && i.a(this.transactionId, transactionInfo.transactionId) && i.a(this.totalPrice, transactionInfo.totalPrice) && i.a(this.totalPriceLabel, transactionInfo.totalPriceLabel) && i.a(this.checkoutOption, transactionInfo.checkoutOption);
        }

        public final CheckoutOption getCheckoutOption$payments_core_release() {
            return this.checkoutOption;
        }

        public final String getCountryCode$payments_core_release() {
            return this.countryCode;
        }

        public final String getCurrencyCode$payments_core_release() {
            return this.currencyCode;
        }

        public final Integer getTotalPrice$payments_core_release() {
            return this.totalPrice;
        }

        public final String getTotalPriceLabel$payments_core_release() {
            return this.totalPriceLabel;
        }

        public final TotalPriceStatus getTotalPriceStatus$payments_core_release() {
            return this.totalPriceStatus;
        }

        public final String getTransactionId$payments_core_release() {
            return this.transactionId;
        }

        public int hashCode() {
            String str = this.currencyCode;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            TotalPriceStatus totalPriceStatus2 = this.totalPriceStatus;
            int hashCode2 = (hashCode + (totalPriceStatus2 != null ? totalPriceStatus2.hashCode() : 0)) * 31;
            String str2 = this.countryCode;
            int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
            String str3 = this.transactionId;
            int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
            Integer num = this.totalPrice;
            int hashCode5 = (hashCode4 + (num != null ? num.hashCode() : 0)) * 31;
            String str4 = this.totalPriceLabel;
            int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
            CheckoutOption checkoutOption2 = this.checkoutOption;
            if (checkoutOption2 != null) {
                i = checkoutOption2.hashCode();
            }
            return hashCode6 + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("TransactionInfo(currencyCode=");
            P0.append(this.currencyCode);
            P0.append(", totalPriceStatus=");
            P0.append(this.totalPriceStatus);
            P0.append(", countryCode=");
            P0.append(this.countryCode);
            P0.append(", transactionId=");
            P0.append(this.transactionId);
            P0.append(", totalPrice=");
            P0.append(this.totalPrice);
            P0.append(", totalPriceLabel=");
            P0.append(this.totalPriceLabel);
            P0.append(", checkoutOption=");
            P0.append(this.checkoutOption);
            P0.append(")");
            return P0.toString();
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeString(this.currencyCode);
            parcel.writeString(this.totalPriceStatus.name());
            parcel.writeString(this.countryCode);
            parcel.writeString(this.transactionId);
            Integer num = this.totalPrice;
            if (num != null) {
                a.i(parcel, 1, num);
            } else {
                parcel.writeInt(0);
            }
            parcel.writeString(this.totalPriceLabel);
            CheckoutOption checkoutOption2 = this.checkoutOption;
            if (checkoutOption2 != null) {
                parcel.writeInt(1);
                parcel.writeString(checkoutOption2.name());
                return;
            }
            parcel.writeInt(0);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public /* synthetic */ TransactionInfo(String str, TotalPriceStatus totalPriceStatus2, String str2, String str3, Integer num, String str4, CheckoutOption checkoutOption2, int i, f fVar) {
            this(str, totalPriceStatus2, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? null : num, (i & 32) != 0 ? null : str4, (i & 64) != 0 ? null : checkoutOption2);
        }
    }

    public GooglePayJsonFactory(GooglePayConfig googlePayConfig2, boolean z) {
        i.e(googlePayConfig2, "googlePayConfig");
        this.googlePayConfig = googlePayConfig2;
        this.isJcbEnabled = z;
    }

    private final JSONObject createBaseCardPaymentMethodParams() {
        JSONObject put = new JSONObject().put("allowedAuthMethods", (Object) new JSONArray((Collection<?>) ALLOWED_AUTH_METHODS));
        List<String> list = DEFAULT_CARD_NETWORKS;
        List L2 = h.L2(JCB_CARD_NETWORK);
        if (!this.isJcbEnabled) {
            L2 = null;
        }
        if (L2 == null) {
            L2 = EmptyList.c;
        }
        JSONObject put2 = put.put("allowedCardNetworks", (Object) new JSONArray((Collection<?>) g.Z(list, L2)));
        i.d(put2, "JSONObject()\n           …          )\n            )");
        return put2;
    }

    private final JSONObject createCardPaymentMethod(BillingAddressParameters billingAddressParameters) {
        JSONObject createBaseCardPaymentMethodParams = createBaseCardPaymentMethodParams();
        if (billingAddressParameters != null && billingAddressParameters.isRequired$payments_core_release()) {
            createBaseCardPaymentMethodParams.put("billingAddressRequired", true);
            createBaseCardPaymentMethodParams.put("billingAddressParameters", (Object) new JSONObject().put("phoneNumberRequired", billingAddressParameters.isPhoneNumberRequired$payments_core_release()).put("format", (Object) billingAddressParameters.getFormat$payments_core_release().getCode$payments_core_release()));
        }
        JSONObject put = new JSONObject().put("type", (Object) CARD_PAYMENT_METHOD).put(InstabugDbContract.SDKApiEntry.COLUMN_PARAMETERS, (Object) createBaseCardPaymentMethodParams).put("tokenizationSpecification", (Object) this.googlePayConfig.getTokenizationSpecification());
        i.d(put, "JSONObject()\n           …okenizationSpecification)");
        return put;
    }

    public static /* synthetic */ JSONObject createIsReadyToPayRequest$default(GooglePayJsonFactory googlePayJsonFactory, BillingAddressParameters billingAddressParameters, Boolean bool, int i, Object obj) {
        if ((i & 1) != 0) {
            billingAddressParameters = null;
        }
        if ((i & 2) != 0) {
            bool = null;
        }
        return googlePayJsonFactory.createIsReadyToPayRequest(billingAddressParameters, bool);
    }

    public static /* synthetic */ JSONObject createPaymentDataRequest$default(GooglePayJsonFactory googlePayJsonFactory, TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean z, MerchantInfo merchantInfo, int i, Object obj) {
        BillingAddressParameters billingAddressParameters2 = (i & 2) != 0 ? null : billingAddressParameters;
        ShippingAddressParameters shippingAddressParameters2 = (i & 4) != 0 ? null : shippingAddressParameters;
        if ((i & 8) != 0) {
            z = false;
        }
        return googlePayJsonFactory.createPaymentDataRequest(transactionInfo, billingAddressParameters2, shippingAddressParameters2, z, (i & 16) != 0 ? null : merchantInfo);
    }

    private final JSONObject createShippingAddressParameters(ShippingAddressParameters shippingAddressParameters) {
        JSONObject put = new JSONObject().put("allowedCountryCodes", (Object) new JSONArray((Collection<?>) shippingAddressParameters.getNormalizedAllowedCountryCodes$payments_core_release())).put("phoneNumberRequired", shippingAddressParameters.getPhoneNumberRequired$payments_core_release());
        i.d(put, "JSONObject()\n           …berRequired\n            )");
        return put;
    }

    private final JSONObject createTransactionInfo(TransactionInfo transactionInfo) {
        JSONObject jSONObject = new JSONObject();
        String currencyCode$payments_core_release = transactionInfo.getCurrencyCode$payments_core_release();
        Locale locale = Locale.ROOT;
        i.d(locale, "Locale.ROOT");
        Objects.requireNonNull(currencyCode$payments_core_release, "null cannot be cast to non-null type java.lang.String");
        String upperCase = currencyCode$payments_core_release.toUpperCase(locale);
        i.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
        JSONObject put = jSONObject.put("currencyCode", (Object) upperCase).put("totalPriceStatus", (Object) transactionInfo.getTotalPriceStatus$payments_core_release().getCode$payments_core_release());
        String countryCode$payments_core_release = transactionInfo.getCountryCode$payments_core_release();
        if (countryCode$payments_core_release != null) {
            i.d(locale, "Locale.ROOT");
            String upperCase2 = countryCode$payments_core_release.toUpperCase(locale);
            i.d(upperCase2, "(this as java.lang.String).toUpperCase(locale)");
            put.put("countryCode", (Object) upperCase2);
        }
        String transactionId$payments_core_release = transactionInfo.getTransactionId$payments_core_release();
        if (transactionId$payments_core_release != null) {
            put.put("transactionId", (Object) transactionId$payments_core_release);
        }
        Integer totalPrice$payments_core_release = transactionInfo.getTotalPrice$payments_core_release();
        if (totalPrice$payments_core_release != null) {
            int intValue = totalPrice$payments_core_release.intValue();
            String currencyCode$payments_core_release2 = transactionInfo.getCurrencyCode$payments_core_release();
            i.d(locale, "Locale.ROOT");
            Objects.requireNonNull(currencyCode$payments_core_release2, "null cannot be cast to non-null type java.lang.String");
            String upperCase3 = currencyCode$payments_core_release2.toUpperCase(locale);
            i.d(upperCase3, "(this as java.lang.String).toUpperCase(locale)");
            Currency instance = Currency.getInstance(upperCase3);
            i.d(instance, "Currency.getInstance(\n  …                        )");
            put.put("totalPrice", (Object) PayWithGoogleUtils.getPriceString(intValue, instance));
        }
        String totalPriceLabel$payments_core_release = transactionInfo.getTotalPriceLabel$payments_core_release();
        if (totalPriceLabel$payments_core_release != null) {
            put.put("totalPriceLabel", (Object) totalPriceLabel$payments_core_release);
        }
        TransactionInfo.CheckoutOption checkoutOption$payments_core_release = transactionInfo.getCheckoutOption$payments_core_release();
        if (checkoutOption$payments_core_release != null) {
            put.put("checkoutOption", (Object) checkoutOption$payments_core_release.getCode$payments_core_release());
        }
        i.d(put, "JSONObject()\n           …          }\n            }");
        return put;
    }

    public final JSONObject createIsReadyToPayRequest() {
        return createIsReadyToPayRequest$default(this, (BillingAddressParameters) null, (Boolean) null, 3, (Object) null);
    }

    public final JSONObject createIsReadyToPayRequest(BillingAddressParameters billingAddressParameters) {
        return createIsReadyToPayRequest$default(this, billingAddressParameters, (Boolean) null, 2, (Object) null);
    }

    public final JSONObject createIsReadyToPayRequest(BillingAddressParameters billingAddressParameters, Boolean bool) {
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", (Object) new JSONArray().put((Object) createCardPaymentMethod(billingAddressParameters)));
        if (bool != null) {
            put.put("existingPaymentMethodRequired", bool.booleanValue());
        }
        i.d(put, "JSONObject()\n           …          }\n            }");
        return put;
    }

    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo) {
        return createPaymentDataRequest$default(this, transactionInfo, (BillingAddressParameters) null, (ShippingAddressParameters) null, false, (MerchantInfo) null, 30, (Object) null);
    }

    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters) {
        return createPaymentDataRequest$default(this, transactionInfo, billingAddressParameters, (ShippingAddressParameters) null, false, (MerchantInfo) null, 28, (Object) null);
    }

    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters) {
        return createPaymentDataRequest$default(this, transactionInfo, billingAddressParameters, shippingAddressParameters, false, (MerchantInfo) null, 24, (Object) null);
    }

    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean z) {
        return createPaymentDataRequest$default(this, transactionInfo, billingAddressParameters, shippingAddressParameters, z, (MerchantInfo) null, 16, (Object) null);
    }

    public final JSONObject createPaymentDataRequest(TransactionInfo transactionInfo, BillingAddressParameters billingAddressParameters, ShippingAddressParameters shippingAddressParameters, boolean z, MerchantInfo merchantInfo) {
        i.e(transactionInfo, "transactionInfo");
        boolean z2 = false;
        JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0).put("allowedPaymentMethods", (Object) new JSONArray().put((Object) createCardPaymentMethod(billingAddressParameters))).put("transactionInfo", (Object) createTransactionInfo(transactionInfo)).put("emailRequired", z);
        if (shippingAddressParameters != null && shippingAddressParameters.isRequired$payments_core_release()) {
            put.put("shippingAddressRequired", true);
            put.put("shippingAddressParameters", (Object) createShippingAddressParameters(shippingAddressParameters));
        }
        if (merchantInfo != null) {
            String merchantName$payments_core_release = merchantInfo.getMerchantName$payments_core_release();
            if (merchantName$payments_core_release == null || merchantName$payments_core_release.length() == 0) {
                z2 = true;
            }
            if (!z2) {
                put.put("merchantInfo", (Object) new JSONObject().put("merchantName", (Object) merchantInfo.getMerchantName$payments_core_release()));
            }
        }
        i.d(put, "JSONObject()\n           …          }\n            }");
        return put;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\b\u0018\u00002\u00020\u0001B-\b\u0007\u0012\b\b\u0002\u0010\f\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006¢\u0006\u0004\b'\u0010(J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÂ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000b\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\n\u0010\bJ4\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\f\u001a\u00020\u00062\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00062\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u0015J \u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u001f\u0010 R\u001c\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010!R\u001c\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u0005R\u001c\u0010\f\u001a\u00020\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010\bR\u001c\u0010\u000e\u001a\u00020\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b&\u0010\b¨\u0006)"}, d2 = {"Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;", "Landroid/os/Parcelable;", "", "", "component2", "()Ljava/util/Set;", "", "component1$payments_core_release", "()Z", "component1", "component3$payments_core_release", "component3", "isRequired", "allowedCountryCodes", "phoneNumberRequired", "copy", "(ZLjava/util/Set;Z)Lcom/stripe/android/GooglePayJsonFactory$ShippingAddressParameters;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/Set;", "getNormalizedAllowedCountryCodes$payments_core_release", "normalizedAllowedCountryCodes", "Z", "isRequired$payments_core_release", "getPhoneNumberRequired$payments_core_release", "<init>", "(ZLjava/util/Set;Z)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: GooglePayJsonFactory.kt */
    public static final class ShippingAddressParameters implements Parcelable {
        public static final Parcelable.Creator<ShippingAddressParameters> CREATOR = new Creator();
        private final Set<String> allowedCountryCodes;
        private final boolean isRequired;
        private final boolean phoneNumberRequired;

        @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
        public static class Creator implements Parcelable.Creator<ShippingAddressParameters> {
            public final ShippingAddressParameters createFromParcel(Parcel parcel) {
                i.e(parcel, "in");
                boolean z = true;
                boolean z2 = parcel.readInt() != 0;
                int readInt = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(readInt);
                while (readInt != 0) {
                    linkedHashSet.add(parcel.readString());
                    readInt--;
                }
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new ShippingAddressParameters(z2, linkedHashSet, z);
            }

            public final ShippingAddressParameters[] newArray(int i) {
                return new ShippingAddressParameters[i];
            }
        }

        public ShippingAddressParameters() {
            this(false, (Set) null, false, 7, (f) null);
        }

        public ShippingAddressParameters(boolean z) {
            this(z, (Set) null, false, 6, (f) null);
        }

        public ShippingAddressParameters(boolean z, Set<String> set) {
            this(z, set, false, 4, (f) null);
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public ShippingAddressParameters(boolean z, Set set, boolean z2, int i, f fVar) {
            this((i & 1) != 0 ? false : z, (i & 2) != 0 ? EmptySet.c : set, (i & 4) != 0 ? false : z2);
        }

        private final Set<String> component2() {
            return this.allowedCountryCodes;
        }

        public static /* synthetic */ ShippingAddressParameters copy$default(ShippingAddressParameters shippingAddressParameters, boolean z, Set<String> set, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                z = shippingAddressParameters.isRequired;
            }
            if ((i & 2) != 0) {
                set = shippingAddressParameters.allowedCountryCodes;
            }
            if ((i & 4) != 0) {
                z2 = shippingAddressParameters.phoneNumberRequired;
            }
            return shippingAddressParameters.copy(z, set, z2);
        }

        public final boolean component1$payments_core_release() {
            return this.isRequired;
        }

        public final boolean component3$payments_core_release() {
            return this.phoneNumberRequired;
        }

        public final ShippingAddressParameters copy(boolean z, Set<String> set, boolean z2) {
            i.e(set, "allowedCountryCodes");
            return new ShippingAddressParameters(z, set, z2);
        }

        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ShippingAddressParameters)) {
                return false;
            }
            ShippingAddressParameters shippingAddressParameters = (ShippingAddressParameters) obj;
            return this.isRequired == shippingAddressParameters.isRequired && i.a(this.allowedCountryCodes, shippingAddressParameters.allowedCountryCodes) && this.phoneNumberRequired == shippingAddressParameters.phoneNumberRequired;
        }

        public final Set<String> getNormalizedAllowedCountryCodes$payments_core_release() {
            Set<String> set = this.allowedCountryCodes;
            ArrayList arrayList = new ArrayList(h.K(set, 10));
            for (String str : set) {
                Locale locale = Locale.ROOT;
                i.d(locale, "Locale.ROOT");
                Objects.requireNonNull(str, "null cannot be cast to non-null type java.lang.String");
                String upperCase = str.toUpperCase(locale);
                i.d(upperCase, "(this as java.lang.String).toUpperCase(locale)");
                arrayList.add(upperCase);
            }
            return g.D0(arrayList);
        }

        public final boolean getPhoneNumberRequired$payments_core_release() {
            return this.phoneNumberRequired;
        }

        public int hashCode() {
            boolean z = this.isRequired;
            boolean z2 = true;
            if (z) {
                z = true;
            }
            int i = (z ? 1 : 0) * true;
            Set<String> set = this.allowedCountryCodes;
            int hashCode = (i + (set != null ? set.hashCode() : 0)) * 31;
            boolean z3 = this.phoneNumberRequired;
            if (!z3) {
                z2 = z3;
            }
            return hashCode + (z2 ? 1 : 0);
        }

        public final boolean isRequired$payments_core_release() {
            return this.isRequired;
        }

        public String toString() {
            StringBuilder P0 = a.P0("ShippingAddressParameters(isRequired=");
            P0.append(this.isRequired);
            P0.append(", allowedCountryCodes=");
            P0.append(this.allowedCountryCodes);
            P0.append(", phoneNumberRequired=");
            return a.D0(P0, this.phoneNumberRequired, ")");
        }

        public void writeToParcel(Parcel parcel, int i) {
            i.e(parcel, "parcel");
            parcel.writeInt(this.isRequired ? 1 : 0);
            Set<String> set = this.allowedCountryCodes;
            parcel.writeInt(set.size());
            for (String writeString : set) {
                parcel.writeString(writeString);
            }
            parcel.writeInt(this.phoneNumberRequired ? 1 : 0);
        }

        public ShippingAddressParameters(boolean z, Set<String> set, boolean z2) {
            i.e(set, "allowedCountryCodes");
            this.isRequired = z;
            this.allowedCountryCodes = set;
            this.phoneNumberRequired = z2;
            String[] iSOCountries = Locale.getISOCountries();
            for (String str : getNormalizedAllowedCountryCodes$payments_core_release()) {
                i.d(iSOCountries, "countryCodes");
                int length = iSOCountries.length;
                boolean z3 = false;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    } else if (i.a(str, iSOCountries[i])) {
                        z3 = true;
                        continue;
                        break;
                    } else {
                        i++;
                    }
                }
                if (!z3) {
                    throw new IllegalArgumentException(('\'' + str + "' is not a valid country code").toString());
                }
            }
        }
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePayJsonFactory(GooglePayConfig googlePayConfig2, boolean z, int i, f fVar) {
        this(googlePayConfig2, (i & 2) != 0 ? false : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ GooglePayJsonFactory(Context context, boolean z, int i, f fVar) {
        this(context, (i & 2) != 0 ? false : z);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GooglePayJsonFactory(Context context, boolean z) {
        this(new GooglePayConfig(context), z);
        i.e(context, "context");
    }
}
