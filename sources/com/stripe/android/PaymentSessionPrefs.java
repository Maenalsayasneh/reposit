package com.stripe.android;

import android.content.Context;
import android.content.SharedPreferences;
import i0.d.a.a.a;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.c;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b`\u0018\u0000 \n2\u00020\u0001:\u0002\n\u000bJ\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/stripe/android/PaymentSessionPrefs;", "", "", "customerId", "getPaymentMethodId", "(Ljava/lang/String;)Ljava/lang/String;", "paymentMethodId", "Lm0/i;", "savePaymentMethodId", "(Ljava/lang/String;Ljava/lang/String;)V", "Companion", "Default", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentSessionPrefs.kt */
public interface PaymentSessionPrefs {
    public static final Companion Companion = Companion.$$INSTANCE;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/PaymentSessionPrefs$Companion;", "", "", "customerId", "getPaymentMethodKey", "(Ljava/lang/String;)Ljava/lang/String;", "PREF_FILE", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSessionPrefs.kt */
    public static final class Companion {
        public static final /* synthetic */ Companion $$INSTANCE = new Companion();
        private static final String PREF_FILE = "PaymentSessionPrefs";

        private Companion() {
        }

        /* access modifiers changed from: private */
        public final String getPaymentMethodKey(String str) {
            return a.o0("customer[", str, "].payment_method");
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR\u001d\u0010\u000f\u001a\u00020\n8F@\u0006X\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/PaymentSessionPrefs$Default;", "Lcom/stripe/android/PaymentSessionPrefs;", "", "customerId", "getPaymentMethodId", "(Ljava/lang/String;)Ljava/lang/String;", "paymentMethodId", "Lm0/i;", "savePaymentMethodId", "(Ljava/lang/String;Ljava/lang/String;)V", "Landroid/content/SharedPreferences;", "prefs$delegate", "Lm0/c;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentSessionPrefs.kt */
    public static final class Default implements PaymentSessionPrefs {
        private final c prefs$delegate;

        public Default(Context context) {
            i.e(context, "context");
            this.prefs$delegate = h.H2(new PaymentSessionPrefs$Default$prefs$2(context));
        }

        public String getPaymentMethodId(String str) {
            if (str != null) {
                return getPrefs().getString(PaymentSessionPrefs.Companion.getPaymentMethodKey(str), (String) null);
            }
            return null;
        }

        public final SharedPreferences getPrefs() {
            return (SharedPreferences) this.prefs$delegate.getValue();
        }

        public void savePaymentMethodId(String str, String str2) {
            i.e(str, "customerId");
            getPrefs().edit().putString(PaymentSessionPrefs.Companion.getPaymentMethodKey(str), str2).apply();
        }
    }

    String getPaymentMethodId(String str);

    void savePaymentMethodId(String str, String str2);
}
