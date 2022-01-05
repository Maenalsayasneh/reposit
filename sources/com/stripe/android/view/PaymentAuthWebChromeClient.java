package com.stripe.android.view;

import android.app.Activity;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.stripe.android.Logger;
import com.stripe.android.R;
import h0.b.a.d;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J7\u0010\u000e\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\t2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebChromeClient;", "Landroid/webkit/WebChromeClient;", "Landroid/webkit/ConsoleMessage;", "consoleMessage", "", "onConsoleMessage", "(Landroid/webkit/ConsoleMessage;)Z", "Landroid/webkit/WebView;", "view", "", "url", "message", "Landroid/webkit/JsResult;", "result", "onJsConfirm", "(Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;Landroid/webkit/JsResult;)Z", "Lcom/stripe/android/Logger;", "logger", "Lcom/stripe/android/Logger;", "Landroid/app/Activity;", "activity", "Landroid/app/Activity;", "<init>", "(Landroid/app/Activity;Lcom/stripe/android/Logger;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentAuthWebChromeClient.kt */
public final class PaymentAuthWebChromeClient extends WebChromeClient {
    private final Activity activity;
    private final Logger logger;

    public PaymentAuthWebChromeClient(Activity activity2, Logger logger2) {
        i.e(activity2, "activity");
        i.e(logger2, "logger");
        this.activity = activity2;
        this.logger = logger2;
    }

    public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message;
        if (!(consoleMessage == null || (message = consoleMessage.message()) == null)) {
            this.logger.debug(message);
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        d.a aVar = new d.a(this.activity, R.style.AlertDialogStyle);
        aVar.a.f = str2;
        aVar.d(17039370, new PaymentAuthWebChromeClient$onJsConfirm$1(jsResult));
        aVar.c(17039360, new PaymentAuthWebChromeClient$onJsConfirm$2(jsResult));
        aVar.a().show();
        return true;
    }
}
