package com.stripe.android.stripe3ds2.views;

import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import androidx.core.app.NotificationCompat;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.io.InputStream;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u0000 \u001c2\u00020\u0001:\u0002\u001c\u001dB\u0007¢\u0006\u0004\b\u001a\u0010\u001bJ!\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\n\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012R$\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient;", "Landroid/webkit/WebViewClient;", "Landroid/webkit/WebView;", "view", "Landroid/webkit/WebResourceRequest;", "request", "Landroid/webkit/WebResourceResponse;", "shouldInterceptRequest", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Landroid/webkit/WebResourceResponse;", "Landroid/net/Uri;", "uri", "", "shouldNotInterceptUrl", "(Landroid/net/Uri;)Z", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "Lm0/i;", "handleFormSubmitUrl", "(Landroid/net/Uri;)V", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$OnHtmlSubmitListener;", "listener", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$OnHtmlSubmitListener;", "getListener$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$OnHtmlSubmitListener;", "setListener$3ds2sdk_release", "(Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$OnHtmlSubmitListener;)V", "<init>", "()V", "Companion", "OnHtmlSubmitListener", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ThreeDS2WebViewClient.kt */
public final class ThreeDS2WebViewClient extends WebViewClient {
    public static final String CHALLENGE_URL = "https://emv3ds/challenge";
    public static final Companion Companion = new Companion((f) null);
    private OnHtmlSubmitListener listener;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$Companion;", "", "", "CHALLENGE_URL", "Ljava/lang/String;", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ThreeDS2WebViewClient.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bà\u0001\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebViewClient$OnHtmlSubmitListener;", "", "", "data", "Lm0/i;", "onHtmlSubmit", "(Ljava/lang/String;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ThreeDS2WebViewClient.kt */
    public interface OnHtmlSubmitListener {
        void onHtmlSubmit(String str);
    }

    public final OnHtmlSubmitListener getListener$3ds2sdk_release() {
        return this.listener;
    }

    public final void handleFormSubmitUrl(Uri uri) {
        OnHtmlSubmitListener onHtmlSubmitListener;
        i.e(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        String uri2 = uri.toString();
        i.d(uri2, "uri.toString()");
        Locale locale = Locale.ENGLISH;
        i.d(locale, "Locale.ENGLISH");
        String lowerCase = uri2.toLowerCase(locale);
        i.d(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
        if (StringsKt__IndentKt.J(lowerCase, CHALLENGE_URL, false, 2) && (onHtmlSubmitListener = this.listener) != null) {
            onHtmlSubmitListener.onHtmlSubmit(uri.getQuery());
        }
    }

    public final void setListener$3ds2sdk_release(OnHtmlSubmitListener onHtmlSubmitListener) {
        this.listener = onHtmlSubmitListener;
    }

    public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        i.e(webView, "view");
        i.e(webResourceRequest, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        Uri url = webResourceRequest.getUrl();
        i.d(url, "request.url");
        handleFormSubmitUrl(url);
        Uri url2 = webResourceRequest.getUrl();
        i.d(url2, "request.url");
        if (shouldNotInterceptUrl(url2)) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        return new WebResourceResponse((String) null, (String) null, (InputStream) null);
    }

    public final boolean shouldNotInterceptUrl(Uri uri) {
        i.e(uri, NotificationCompat.MessagingStyle.Message.KEY_DATA_URI);
        return URLUtil.isDataUrl(uri.toString());
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        i.e(webView, "view");
        i.e(webResourceRequest, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        Uri url = webResourceRequest.getUrl();
        i.d(url, "request.url");
        handleFormSubmitUrl(url);
        return true;
    }
}
