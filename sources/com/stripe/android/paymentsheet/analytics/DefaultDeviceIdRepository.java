package com.stripe.android.paymentsheet.analytics;

import android.content.Context;
import android.content.SharedPreferences;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.k2.b;
import n0.a.k2.d;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u0002H@ø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006R\u001d\u0010\f\u001a\u00020\u00078B@\u0002X\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/DefaultDeviceIdRepository;", "Lcom/stripe/android/paymentsheet/analytics/DeviceIdRepository;", "Lcom/stripe/android/paymentsheet/analytics/DeviceId;", "createDeviceId", "()Lcom/stripe/android/paymentsheet/analytics/DeviceId;", "get", "(Lm0/l/c;)Ljava/lang/Object;", "Landroid/content/SharedPreferences;", "prefs$delegate", "Lm0/c;", "getPrefs", "()Landroid/content/SharedPreferences;", "prefs", "Lm0/l/e;", "workContext", "Lm0/l/e;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "Ln0/a/k2/b;", "mutex", "Ln0/a/k2/b;", "<init>", "(Landroid/content/Context;Lm0/l/e;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: DefaultDeviceIdRepository.kt */
public final class DefaultDeviceIdRepository implements DeviceIdRepository {
    /* access modifiers changed from: private */
    public static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String KEY_DEVICE_ID = "device_id";
    @Deprecated
    private static final String PREF_FILE = "DefaultDeviceIdRepository";
    /* access modifiers changed from: private */
    public final Context context;
    /* access modifiers changed from: private */
    public final b mutex = d.a(false, 1);
    private final c prefs$delegate = h.H2(new DefaultDeviceIdRepository$prefs$2(this));
    private final e workContext;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/analytics/DefaultDeviceIdRepository$Companion;", "", "", "KEY_DEVICE_ID", "Ljava/lang/String;", "PREF_FILE", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: DefaultDeviceIdRepository.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public DefaultDeviceIdRepository(Context context2, e eVar) {
        i.e(context2, "context");
        i.e(eVar, "workContext");
        this.context = context2;
        this.workContext = eVar;
    }

    /* access modifiers changed from: private */
    public final DeviceId createDeviceId() {
        DeviceId deviceId = new DeviceId();
        SharedPreferences.Editor edit = getPrefs().edit();
        i.b(edit, "editor");
        edit.putString("device_id", deviceId.getValue());
        edit.commit();
        return deviceId;
    }

    /* access modifiers changed from: private */
    public final SharedPreferences getPrefs() {
        return (SharedPreferences) this.prefs$delegate.getValue();
    }

    public Object get(m0.l.c<? super DeviceId> cVar) {
        return a.k4(this.workContext, new DefaultDeviceIdRepository$get$2(this, (m0.l.c) null), cVar);
    }
}
