package com.stripe.android.payments;

import android.content.ComponentName;
import android.content.Context;
import h0.d.a.c;
import h0.d.a.d;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.Result;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u000e2\u00020\u0001:\u0002\u000e\u000fB\u000f\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b¨\u0006\u0010"}, d2 = {"Lcom/stripe/android/payments/BrowserCapabilitiesSupplier;", "", "", "isCustomTabsSupported", "()Z", "isChromeInstalled", "Lcom/stripe/android/payments/BrowserCapabilities;", "get", "()Lcom/stripe/android/payments/BrowserCapabilities;", "Landroid/content/Context;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "Companion", "NoopCustomTabsServiceConnection", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BrowserCapabilitiesSupplier.kt */
public final class BrowserCapabilitiesSupplier {
    @Deprecated
    private static final String CHROME_PACKAGE = "com.android.chrome";
    private static final Companion Companion = new Companion((f) null);
    private final Context context;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/payments/BrowserCapabilitiesSupplier$Companion;", "", "", "CHROME_PACKAGE", "Ljava/lang/String;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BrowserCapabilitiesSupplier.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/payments/BrowserCapabilitiesSupplier$NoopCustomTabsServiceConnection;", "Lh0/d/a/d;", "Landroid/content/ComponentName;", "componentName", "Lh0/d/a/c;", "customTabsClient", "Lm0/i;", "onCustomTabsServiceConnected", "(Landroid/content/ComponentName;Lh0/d/a/c;)V", "name", "onServiceDisconnected", "(Landroid/content/ComponentName;)V", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BrowserCapabilitiesSupplier.kt */
    public static final class NoopCustomTabsServiceConnection extends d {
        public void onCustomTabsServiceConnected(ComponentName componentName, c cVar) {
            i.e(componentName, "componentName");
            i.e(cVar, "customTabsClient");
        }

        public void onServiceDisconnected(ComponentName componentName) {
            i.e(componentName, "name");
        }
    }

    public BrowserCapabilitiesSupplier(Context context2) {
        i.e(context2, "context");
        this.context = context2;
    }

    private final boolean isChromeInstalled() {
        Object obj;
        try {
            this.context.getPackageManager().getPackageInfo(CHROME_PACKAGE, 0);
            obj = Boolean.TRUE;
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Object obj2 = Boolean.FALSE;
        if (obj instanceof Result.Failure) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    private final boolean isCustomTabsSupported() {
        Object obj;
        try {
            obj = Boolean.valueOf(c.a(this.context, CHROME_PACKAGE, new NoopCustomTabsServiceConnection()));
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Object obj2 = Boolean.FALSE;
        if (obj instanceof Result.Failure) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final BrowserCapabilities get() {
        if (isCustomTabsSupported()) {
            return BrowserCapabilities.CustomTabs;
        }
        if (isChromeInstalled()) {
            return BrowserCapabilities.Chrome;
        }
        return BrowserCapabilities.Unknown;
    }
}
