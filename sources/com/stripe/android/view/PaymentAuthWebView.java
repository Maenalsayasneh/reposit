package com.stripe.android.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.stripe.android.networking.RequestHeadersFactory;
import kotlin.Metadata;
import m0.i;
import m0.n.a.a;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0004R(\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebView;", "Landroid/webkit/WebView;", "Lm0/i;", "cleanup", "()V", "configureSettings", "destroy", "Lkotlin/Function0;", "onLoadBlank", "Lm0/n/a/a;", "getOnLoadBlank$payments_core_release", "()Lm0/n/a/a;", "setOnLoadBlank$payments_core_release", "(Lm0/n/a/a;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentAuthWebView.kt */
public final class PaymentAuthWebView extends WebView {
    private a<i> onLoadBlank;

    public PaymentAuthWebView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public PaymentAuthWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PaymentAuthWebView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void cleanup() {
        clearHistory();
        this.onLoadBlank.invoke();
        loadUrl(PaymentAuthWebViewClient.BLANK_PAGE);
        onPause();
        removeAllViews();
        destroyDrawingCache();
    }

    @SuppressLint({"SetJavaScriptEnabled"})
    private final void configureSettings() {
        String userAgent$payments_core_release$default = RequestHeadersFactory.Companion.getUserAgent$payments_core_release$default(RequestHeadersFactory.Companion, (String) null, 1, (Object) null);
        WebSettings settings = getSettings();
        m0.n.b.i.d(settings, "settings");
        StringBuilder sb = new StringBuilder();
        WebSettings settings2 = getSettings();
        m0.n.b.i.d(settings2, "settings");
        String userAgentString = settings2.getUserAgentString();
        if (userAgentString == null) {
            userAgentString = "";
        }
        sb.append(userAgentString);
        sb.append(" [");
        sb.append(userAgent$payments_core_release$default);
        sb.append(']');
        settings.setUserAgentString(sb.toString());
        WebSettings settings3 = getSettings();
        m0.n.b.i.d(settings3, "settings");
        settings3.setJavaScriptEnabled(true);
        WebSettings settings4 = getSettings();
        m0.n.b.i.d(settings4, "settings");
        settings4.setAllowContentAccess(false);
        WebSettings settings5 = getSettings();
        m0.n.b.i.d(settings5, "settings");
        settings5.setDomStorageEnabled(true);
    }

    public void destroy() {
        cleanup();
        super.destroy();
    }

    public final a<i> getOnLoadBlank$payments_core_release() {
        return this.onLoadBlank;
    }

    public final void setOnLoadBlank$payments_core_release(a<i> aVar) {
        m0.n.b.i.e(aVar, "<set-?>");
        this.onLoadBlank = aVar;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentAuthWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m0.n.b.i.e(context, "context");
        this.onLoadBlank = PaymentAuthWebView$onLoadBlank$1.INSTANCE;
        configureSettings();
    }
}
