package com.stripe.android;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Parcel;
import android.os.Parcelable;
import i0.d.a.a.a;
import kotlin.Metadata;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\b\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001f B\u001d\b\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J&\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0006\u001a\u00020\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u0004J\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0013\u0010\rJ \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u0004R\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001c\u0010\u0004¨\u0006!"}, d2 = {"Lcom/stripe/android/PaymentConfiguration;", "Landroid/os/Parcelable;", "", "component1", "()Ljava/lang/String;", "component2", "publishableKey", "stripeAccountId", "copy", "(Ljava/lang/String;Ljava/lang/String;)Lcom/stripe/android/PaymentConfiguration;", "toString", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lm0/i;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getPublishableKey", "getStripeAccountId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Store", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentConfiguration.kt */
public final class PaymentConfiguration implements Parcelable {
    public static final Parcelable.Creator<PaymentConfiguration> CREATOR = new Creator();
    public static final Companion Companion = new Companion((f) null);
    /* access modifiers changed from: private */
    public static PaymentConfiguration instance;
    private final String publishableKey;
    private final String stripeAccountId;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0007\u0010\u0006J+\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0010\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/PaymentConfiguration$Companion;", "", "Landroid/content/Context;", "context", "Lcom/stripe/android/PaymentConfiguration;", "loadInstance", "(Landroid/content/Context;)Lcom/stripe/android/PaymentConfiguration;", "getInstance", "", "publishableKey", "stripeAccountId", "Lm0/i;", "init", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V", "clearInstance$payments_core_release", "()V", "clearInstance", "instance", "Lcom/stripe/android/PaymentConfiguration;", "<init>", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentConfiguration.kt */
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ void init$default(Companion companion, Context context, String str, String str2, int i, Object obj) {
            if ((i & 4) != 0) {
                str2 = null;
            }
            companion.init(context, str, str2);
        }

        private final PaymentConfiguration loadInstance(Context context) {
            PaymentConfiguration load$payments_core_release = new Store(context).load$payments_core_release();
            if (load$payments_core_release != null) {
                PaymentConfiguration.instance = load$payments_core_release;
                return load$payments_core_release;
            }
            throw new IllegalStateException("PaymentConfiguration was not initialized. Call PaymentConfiguration.init().");
        }

        public final /* synthetic */ void clearInstance$payments_core_release() {
            PaymentConfiguration.instance = null;
        }

        public final PaymentConfiguration getInstance(Context context) {
            i.e(context, "context");
            PaymentConfiguration access$getInstance$cp = PaymentConfiguration.instance;
            return access$getInstance$cp != null ? access$getInstance$cp : loadInstance(context);
        }

        public final void init(Context context, String str) {
            init$default(this, context, str, (String) null, 4, (Object) null);
        }

        public final void init(Context context, String str, String str2) {
            i.e(context, "context");
            i.e(str, "publishableKey");
            PaymentConfiguration.instance = new PaymentConfiguration(str, str2);
            new Store(context).save(str, str2);
            new DefaultFraudDetectionDataRepository(context, (e) null, 2, (f) null).refresh();
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public static class Creator implements Parcelable.Creator<PaymentConfiguration> {
        public final PaymentConfiguration createFromParcel(Parcel parcel) {
            i.e(parcel, "in");
            return new PaymentConfiguration(parcel.readString(), parcel.readString());
        }

        public final PaymentConfiguration[] newArray(int i) {
            return new PaymentConfiguration[i];
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\u0004\u0018\u00010\bH\u0000¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/PaymentConfiguration$Store;", "", "", "publishableKey", "stripeAccountId", "Lm0/i;", "save", "(Ljava/lang/String;Ljava/lang/String;)V", "Lcom/stripe/android/PaymentConfiguration;", "load$payments_core_release", "()Lcom/stripe/android/PaymentConfiguration;", "load", "Landroid/content/SharedPreferences;", "prefs", "Landroid/content/SharedPreferences;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentConfiguration.kt */
    public static final class Store {
        private static final Companion Companion = new Companion((f) null);
        @Deprecated
        private static final String KEY_ACCOUNT_ID = "key_account_id";
        @Deprecated
        private static final String KEY_PUBLISHABLE_KEY = "key_publishable_key";
        @Deprecated
        private static final String NAME = PaymentConfiguration.class.getCanonicalName();
        private final SharedPreferences prefs;

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u001e\u0010\u0007\u001a\n \u0006*\u0004\u0018\u00010\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0004¨\u0006\n"}, d2 = {"Lcom/stripe/android/PaymentConfiguration$Store$Companion;", "", "", "KEY_ACCOUNT_ID", "Ljava/lang/String;", "KEY_PUBLISHABLE_KEY", "kotlin.jvm.PlatformType", "NAME", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentConfiguration.kt */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(f fVar) {
                this();
            }
        }

        public Store(Context context) {
            i.e(context, "context");
            SharedPreferences sharedPreferences = context.getApplicationContext().getSharedPreferences(NAME, 0);
            i.d(sharedPreferences, "context.applicationConte…haredPreferences(NAME, 0)");
            this.prefs = sharedPreferences;
        }

        public final /* synthetic */ PaymentConfiguration load$payments_core_release() {
            String string = this.prefs.getString(KEY_PUBLISHABLE_KEY, (String) null);
            if (string == null) {
                return null;
            }
            i.d(string, "publishableKey");
            return new PaymentConfiguration(string, this.prefs.getString(KEY_ACCOUNT_ID, (String) null));
        }

        public final /* synthetic */ void save(String str, String str2) {
            i.e(str, "publishableKey");
            this.prefs.edit().putString(KEY_PUBLISHABLE_KEY, str).putString(KEY_ACCOUNT_ID, str2).apply();
        }
    }

    public PaymentConfiguration(String str, String str2) {
        i.e(str, "publishableKey");
        this.publishableKey = str;
        this.stripeAccountId = str2;
        ApiKeyValidator.Companion.get$payments_core_release().requireValid(str);
    }

    public static /* synthetic */ PaymentConfiguration copy$default(PaymentConfiguration paymentConfiguration, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = paymentConfiguration.publishableKey;
        }
        if ((i & 2) != 0) {
            str2 = paymentConfiguration.stripeAccountId;
        }
        return paymentConfiguration.copy(str, str2);
    }

    public static final PaymentConfiguration getInstance(Context context) {
        return Companion.getInstance(context);
    }

    public static final void init(Context context, String str) {
        Companion.init$default(Companion, context, str, (String) null, 4, (Object) null);
    }

    public static final void init(Context context, String str, String str2) {
        Companion.init(context, str, str2);
    }

    public final String component1() {
        return this.publishableKey;
    }

    public final String component2() {
        return this.stripeAccountId;
    }

    public final PaymentConfiguration copy(String str, String str2) {
        i.e(str, "publishableKey");
        return new PaymentConfiguration(str, str2);
    }

    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PaymentConfiguration)) {
            return false;
        }
        PaymentConfiguration paymentConfiguration = (PaymentConfiguration) obj;
        return i.a(this.publishableKey, paymentConfiguration.publishableKey) && i.a(this.stripeAccountId, paymentConfiguration.stripeAccountId);
    }

    public final String getPublishableKey() {
        return this.publishableKey;
    }

    public final String getStripeAccountId() {
        return this.stripeAccountId;
    }

    public int hashCode() {
        String str = this.publishableKey;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.stripeAccountId;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public String toString() {
        StringBuilder P0 = a.P0("PaymentConfiguration(publishableKey=");
        P0.append(this.publishableKey);
        P0.append(", stripeAccountId=");
        return a.y0(P0, this.stripeAccountId, ")");
    }

    public void writeToParcel(Parcel parcel, int i) {
        i.e(parcel, "parcel");
        parcel.writeString(this.publishableKey);
        parcel.writeString(this.stripeAccountId);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentConfiguration(String str, String str2, int i, f fVar) {
        this(str, (i & 2) != 0 ? null : str2);
    }
}
