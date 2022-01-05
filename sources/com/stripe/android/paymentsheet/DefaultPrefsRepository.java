package com.stripe.android.paymentsheet;

import android.content.Context;
import android.content.SharedPreferences;
import com.stripe.android.paymentsheet.model.PaymentSelection;
import com.stripe.android.paymentsheet.model.SavedSelection;
import i0.d.a.a.a;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.l.c;
import m0.l.e;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u0000 &2\u00020\u0001:\u0001&B@\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u001c\u0010\u0019\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0015\u0012\u0006\u0010\u0013\u001a\u00020\u0012ø\u0001\u0000¢\u0006\u0004\b$\u0010%J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0013\u0010\n\u001a\u00020\tH@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R/\u0010\u0019\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u0016\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00158\u0002@\u0002X\u0004ø\u0001\u0000¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001c\u001a\u00020\u001b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001d\u0010#\u001a\u00020\u001e8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\u0002\u0004\n\u0002\b\u0019¨\u0006'"}, d2 = {"Lcom/stripe/android/paymentsheet/DefaultPrefsRepository;", "Lcom/stripe/android/paymentsheet/PrefsRepository;", "", "value", "Lm0/i;", "write", "(Ljava/lang/String;)V", "getKey", "()Ljava/lang/String;", "Lcom/stripe/android/paymentsheet/model/SavedSelection;", "getSavedSelection", "(Lm0/l/c;)Ljava/lang/Object;", "Lcom/stripe/android/paymentsheet/model/PaymentSelection;", "paymentSelection", "savePaymentSelection", "(Lcom/stripe/android/paymentsheet/model/PaymentSelection;)V", "customerId", "Ljava/lang/String;", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Lkotlin/Function1;", "Lm0/l/c;", "", "", "isGooglePayReady", "Lm0/n/a/l;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Landroid/content/SharedPreferences;", "prefs$delegate", "Lm0/c;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs", "<init>", "(Landroid/content/Context;Ljava/lang/String;Lm0/n/a/l;Lm0/l/e;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultPrefsRepository.kt */
public final class DefaultPrefsRepository implements PrefsRepository {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String PREF_FILE = "DefaultPrefsRepository";
    /* access modifiers changed from: private */
    public final Context context;
    private final String customerId;
    /* access modifiers changed from: private */
    public final l<c<? super Boolean>, Object> isGooglePayReady;
    private final m0.c prefs$delegate = h.H2(new DefaultPrefsRepository$prefs$2(this));
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/paymentsheet/DefaultPrefsRepository$Companion;", "", "", "PREF_FILE", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultPrefsRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DefaultPrefsRepository(Context context2, String str, l<? super c<? super Boolean>, ? extends Object> lVar, e eVar) {
        i.e(context2, "context");
        i.e(str, "customerId");
        i.e(lVar, "isGooglePayReady");
        i.e(eVar, "workContext");
        this.context = context2;
        this.customerId = str;
        this.isGooglePayReady = lVar;
        this.workContext = eVar;
    }

    /* access modifiers changed from: private */
    public final String getKey() {
        return a.x0(a.P0("customer["), this.customerId, ']');
    }

    /* access modifiers changed from: private */
    public final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs$delegate.getValue();
    }

    private final void write(String str) {
        getPrefs().edit().putString(getKey(), str).apply();
    }

    public Object getSavedSelection(c<? super SavedSelection> cVar) {
        return m0.r.t.a.r.m.a1.a.k4(this.workContext, new DefaultPrefsRepository$getSavedSelection$2(this, (c) null), cVar);
    }

    public void savePaymentSelection(PaymentSelection paymentSelection) {
        String str;
        if (i.a(paymentSelection, PaymentSelection.GooglePay.INSTANCE)) {
            str = "google_pay";
        } else if (paymentSelection instanceof PaymentSelection.Saved) {
            StringBuilder P0 = a.P0("payment_method:");
            String str2 = ((PaymentSelection.Saved) paymentSelection).getPaymentMethod().id;
            if (str2 == null) {
                str2 = "";
            }
            P0.append(str2);
            str = P0.toString();
        } else {
            str = null;
        }
        if (str != null) {
            write(str);
        }
    }
}
