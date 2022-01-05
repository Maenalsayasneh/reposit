package com.stripe.android;

import android.content.Context;
import android.content.SharedPreferences;
import com.stripe.android.networking.FraudDetectionData;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.m0;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0019\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0003\u001a\u0004\u0018\u00010\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR%\u0010\u0012\u001a\n \r*\u0004\u0018\u00010\f0\f8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\u0002\u0004\n\u0002\b\u0019¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/DefaultFraudDetectionDataStore;", "Lcom/stripe/android/FraudDetectionDataStore;", "Lcom/stripe/android/networking/FraudDetectionData;", "get", "(Lm0/l/c;)Ljava/lang/Object;", "fraudDetectionData", "Lm0/i;", "save", "(Lcom/stripe/android/networking/FraudDetectionData;)V", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType", "prefs$delegate", "Lm0/c;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lm0/l/e;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: FraudDetectionDataStore.kt */
public final class DefaultFraudDetectionDataStore implements FraudDetectionDataStore {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String KEY_DATA = "key_fraud_detection_data";
    @Deprecated
    private static final String PREF_FILE = "FraudDetectionDataStore";
    private final c prefs$delegate;
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/DefaultFraudDetectionDataStore$Companion;", "", "", "KEY_DATA", "Ljava/lang/String;", "PREF_FILE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: FraudDetectionDataStore.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DefaultFraudDetectionDataStore(Context context, e eVar) {
        i.e(context, "context");
        i.e(eVar, "workContext");
        this.workContext = eVar;
        this.prefs$delegate = h.H2(new DefaultFraudDetectionDataStore$prefs$2(context));
    }

    /* access modifiers changed from: private */
    public final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs$delegate.getValue();
    }

    public Object get(m0.l.c<? super FraudDetectionData> cVar) {
        return a.k4(this.workContext, new DefaultFraudDetectionDataStore$get$2(this, (m0.l.c) null), cVar);
    }

    public void save(FraudDetectionData fraudDetectionData) {
        i.e(fraudDetectionData, "fraudDetectionData");
        SharedPreferences prefs = getPrefs();
        i.d(prefs, "prefs");
        SharedPreferences.Editor edit = prefs.edit();
        i.b(edit, "editor");
        edit.putString(KEY_DATA, fraudDetectionData.toJson().toString());
        edit.apply();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public DefaultFraudDetectionDataStore(Context context, e eVar, int i, f fVar) {
        this(context, (i & 2) != 0 ? m0.c : eVar);
    }
}
