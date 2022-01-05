package com.stripe.android.payments;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import androidx.core.app.BundleCompat;
import com.stripe.android.Logger;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.R;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.exception.StripeException;
import com.stripe.android.model.Source;
import com.stripe.android.model.Token;
import com.stripe.android.networking.AnalyticsEvent;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult;
import h0.d.a.a;
import h0.q.k0;
import h0.q.m0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001bB'\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0015\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;", "Lh0/q/k0;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "args", "Landroid/content/Intent;", "createLaunchIntent", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)Landroid/content/Intent;", "getResultIntent", "", "shouldUseCustomTabs", "Lm0/i;", "logCapabilities", "(Z)V", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "", "intentChooserTitle", "Ljava/lang/String;", "Lcom/stripe/android/payments/BrowserCapabilities;", "browserCapabilities", "Lcom/stripe/android/payments/BrowserCapabilities;", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "analyticsRequestFactory", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "<init>", "(Lcom/stripe/android/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/AnalyticsRequestFactory;Lcom/stripe/android/payments/BrowserCapabilities;Ljava/lang/String;)V", "Factory", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeBrowserLauncherViewModel.kt */
public final class StripeBrowserLauncherViewModel extends k0 {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final AnalyticsRequestFactory analyticsRequestFactory;
    private final BrowserCapabilities browserCapabilities;
    private final String intentChooserTitle;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\r"}, d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherViewModel$Factory;", "Lh0/q/m0$b;", "Lh0/q/k0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Lh0/q/k0;", "Landroid/app/Application;", "application", "Landroid/app/Application;", "<init>", "(Landroid/app/Application;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: StripeBrowserLauncherViewModel.kt */
    public static final class Factory implements m0.b {
        private final Application application;

        public Factory(Application application2) {
            i.e(application2, "application");
            this.application = application2;
        }

        public <T extends k0> T create(Class<T> cls) {
            i.e(cls, "modelClass");
            PaymentConfiguration instance = PaymentConfiguration.Companion.getInstance(this.application);
            BrowserCapabilitiesSupplier browserCapabilitiesSupplier = new BrowserCapabilitiesSupplier(this.application);
            AnalyticsRequestExecutor.Default defaultR = new AnalyticsRequestExecutor.Default((Logger) null, (e) null, 3, (f) null);
            AnalyticsRequestFactory analyticsRequestFactory = new AnalyticsRequestFactory((Context) this.application, instance.getPublishableKey());
            BrowserCapabilities browserCapabilities = browserCapabilitiesSupplier.get();
            String string = this.application.getString(R.string.stripe_verify_your_payment);
            i.d(string, "application.getString(R.…ripe_verify_your_payment)");
            return new StripeBrowserLauncherViewModel(defaultR, analyticsRequestFactory, browserCapabilities, string);
        }
    }

    public StripeBrowserLauncherViewModel(AnalyticsRequestExecutor analyticsRequestExecutor2, AnalyticsRequestFactory analyticsRequestFactory2, BrowserCapabilities browserCapabilities2, String str) {
        i.e(analyticsRequestExecutor2, "analyticsRequestExecutor");
        i.e(analyticsRequestFactory2, "analyticsRequestFactory");
        i.e(browserCapabilities2, "browserCapabilities");
        i.e(str, "intentChooserTitle");
        this.analyticsRequestExecutor = analyticsRequestExecutor2;
        this.analyticsRequestFactory = analyticsRequestFactory2;
        this.browserCapabilities = browserCapabilities2;
        this.intentChooserTitle = str;
    }

    public final Intent createLaunchIntent(PaymentBrowserAuthContract.Args args) {
        i.e(args, "args");
        boolean z = this.browserCapabilities == BrowserCapabilities.CustomTabs;
        logCapabilities(z);
        Uri parse = Uri.parse(args.getUrl());
        if (z) {
            Integer statusBarColor = args.getStatusBarColor();
            a aVar = statusBarColor != null ? new a(Integer.valueOf(statusBarColor.intValue() | -16777216), (Integer) null, (Integer) null, (Integer) null) : null;
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.putExtra("android.support.customtabs.extra.SHARE_MENU_ITEM", false);
            Bundle a = aVar != null ? aVar.a() : null;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                BundleCompat.putBinder(bundle, "android.support.customtabs.extra.SESSION", (IBinder) null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", true);
            intent.putExtras(new Bundle());
            if (a != null) {
                intent.putExtras(a);
            }
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 2);
            i.d(intent, "customTabsIntent.intent");
            intent.setData(parse);
            Intent createChooser = Intent.createChooser(intent, this.intentChooserTitle);
            i.d(createChooser, "Intent.createChooser(\n  …hooserTitle\n            )");
            return createChooser;
        }
        Intent createChooser2 = Intent.createChooser(new Intent("android.intent.action.VIEW", parse), this.intentChooserTitle);
        i.d(createChooser2, "Intent.createChooser(\n  …hooserTitle\n            )");
        return createChooser2;
    }

    public final Intent getResultIntent(PaymentBrowserAuthContract.Args args) {
        i.e(args, "args");
        Uri parse = Uri.parse(args.getUrl());
        Intent intent = new Intent();
        String clientSecret = args.getClientSecret();
        i.d(parse, "url");
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        String stripeAccountId = args.getStripeAccountId();
        Intent putExtras = intent.putExtras(new PaymentFlowResult.Unvalidated(clientSecret, 0, (StripeException) null, args.getShouldCancelSource(), lastPathSegment, (Source) null, stripeAccountId, 38, (f) null).toBundle());
        i.d(putExtras, "Intent().putExtras(\n    …   ).toBundle()\n        )");
        return putExtras;
    }

    public final void logCapabilities(boolean z) {
        AnalyticsEvent analyticsEvent;
        AnalyticsRequestExecutor analyticsRequestExecutor2 = this.analyticsRequestExecutor;
        AnalyticsRequestFactory analyticsRequestFactory2 = this.analyticsRequestFactory;
        if (z) {
            analyticsEvent = AnalyticsEvent.AuthWithCustomTabs;
        } else if (!z) {
            analyticsEvent = AnalyticsEvent.AuthWithDefaultBrowser;
        } else {
            throw new NoWhenBranchMatchedException();
        }
        analyticsRequestExecutor2.executeAsync(AnalyticsRequestFactory.createRequest$payments_core_release$default(analyticsRequestFactory2, analyticsEvent, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
    }
}
