package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.stripe.android.model.PaymentMethodOptionsParams;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebViewClient;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\r\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "Landroid/webkit/WebView;", "Lm0/i;", "configureSettings", "()V", "Landroid/webkit/WebViewClient;", "client", "setWebViewClient", "(Landroid/webkit/WebViewClient;)V", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$OnHtmlSubmitListener;", "listener", "setOnHtmlSubmitListener$3ds2sdk_release", "(Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$OnHtmlSubmitListener;)V", "setOnHtmlSubmitListener", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient;", "webViewClient", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ThreeDS2WebView.kt */
public final class ThreeDS2WebView extends WebView {
    private final ThreeDS2WebViewClient webViewClient;

    public ThreeDS2WebView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public ThreeDS2WebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThreeDS2WebView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final void configureSettings() {
        WebSettings settings = getSettings();
        settings.setCacheMode(2);
        settings.setJavaScriptEnabled(false);
        settings.setAllowContentAccess(false);
        settings.setBlockNetworkImage(true);
        settings.setBlockNetworkLoads(true);
    }

    public final void setOnHtmlSubmitListener$3ds2sdk_release(ThreeDS2WebViewClient.OnHtmlSubmitListener onHtmlSubmitListener) {
        this.webViewClient.setListener$3ds2sdk_release(onHtmlSubmitListener);
    }

    public void setWebViewClient(WebViewClient webViewClient2) {
        i.e(webViewClient2, PaymentMethodOptionsParams.WeChatPay.PARAM_CLIENT);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeDS2WebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        ThreeDS2WebViewClient threeDS2WebViewClient = new ThreeDS2WebViewClient();
        this.webViewClient = threeDS2WebViewClient;
        configureSettings();
        super.setWebViewClient(threeDS2WebViewClient);
    }
}
