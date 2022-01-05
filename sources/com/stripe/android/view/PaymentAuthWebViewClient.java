package com.stripe.android.view;

import android.content.Intent;
import android.net.Uri;
import android.webkit.URLUtil;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.Logger;
import h0.q.y;
import i0.j.f.p.h;
import java.util.Collection;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\b\u0000\u0018\u0000 ;2\u00020\u0001:\u0001;BY\u0012\u0006\u00103\u001a\u000202\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0%\u0012\u0006\u00101\u001a\u00020\u0018\u0012\b\u00108\u001a\u0004\u0018\u00010\u0018\u0012\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020(\u0012\u0014\u00105\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00020(¢\u0006\u0004\b9\u0010:J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\r\u0010\bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0011\u0010\u0010J\u001b\u0010\u0014\u001a\u00020\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR(\u0010!\u001a\u0004\u0018\u00010\u00182\b\u0010 \u001a\u0004\u0018\u00010\u00188\u0006@BX\u000e¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00020\u000e0%8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\"\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00020(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u000e8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0016\u00101\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b1\u0010\"R\u0016\u00103\u001a\u0002028\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b3\u00104R$\u00105\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0012\u0012\u0004\u0012\u00020\u00020(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b5\u0010*R\u0018\u00106\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b6\u00107¨\u0006<"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewClient;", "Landroid/webkit/WebViewClient;", "Lm0/i;", "hideProgressBar", "()V", "Landroid/net/Uri;", "uri", "openIntentScheme", "(Landroid/net/Uri;)V", "Landroid/content/Intent;", "intent", "openIntent", "(Landroid/content/Intent;)V", "updateCompletionUrl", "", "isReturnUrl", "(Landroid/net/Uri;)Z", "isPredefinedReturnUrl", "", "error", "onAuthCompleted", "(Ljava/lang/Throwable;)V", "Landroid/webkit/WebView;", "view", "", "url", "onPageFinished", "(Landroid/webkit/WebView;Ljava/lang/String;)V", "Landroid/webkit/WebResourceRequest;", "request", "shouldOverrideUrlLoading", "(Landroid/webkit/WebView;Landroid/webkit/WebResourceRequest;)Z", "<set-?>", "completionUrlParam", "Ljava/lang/String;", "getCompletionUrlParam", "()Ljava/lang/String;", "Lh0/q/y;", "isPageLoaded", "Lh0/q/y;", "Lkotlin/Function1;", "activityStarter", "Lm0/n/a/l;", "hasLoadedBlank", "Z", "getHasLoadedBlank$payments_core_release", "()Z", "setHasLoadedBlank$payments_core_release", "(Z)V", "clientSecret", "Lcom/stripe/android/Logger;", "logger", "Lcom/stripe/android/Logger;", "activityFinisher", "userReturnUri", "Landroid/net/Uri;", "returnUrl", "<init>", "(Lcom/stripe/android/Logger;Lh0/q/y;Ljava/lang/String;Ljava/lang/String;Lm0/n/a/l;Lm0/n/a/l;)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentAuthWebViewClient.kt */
public final class PaymentAuthWebViewClient extends WebViewClient {
    /* access modifiers changed from: private */
    public static final Set<String> AUTHENTICATE_URLS = h.N3("https://hooks.stripe.com/three_d_secure/authenticate");
    public static final String BLANK_PAGE = "about:blank";
    /* access modifiers changed from: private */
    public static final Set<String> COMPLETION_URLS = g.h0("https://hooks.stripe.com/redirect/complete/", "https://hooks.stripe.com/3d_secure/complete/");
    public static final Companion Companion = new Companion((f) null);
    public static final String PARAM_PAYMENT_CLIENT_SECRET = "payment_intent_client_secret";
    private static final String PARAM_RETURN_URL = "return_url";
    public static final String PARAM_SETUP_CLIENT_SECRET = "setup_intent_client_secret";
    private final l<Throwable, i> activityFinisher;
    private final l<Intent, i> activityStarter;
    private final String clientSecret;
    private String completionUrlParam;
    private boolean hasLoadedBlank;
    private final y<Boolean> isPageLoaded;
    private final Logger logger;
    private final Uri userReturnUri;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0001¢\u0006\u0004\b\u0007\u0010\u0006R\u001c\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001c\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\t8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000bR\u0016\u0010\u000f\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0016\u0010\u0010\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0016\u0010\u0011\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0011\u0010\r¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewClient$Companion;", "", "", "url", "", "isAuthenticateUrl", "(Ljava/lang/String;)Z", "isCompletionUrl$payments_core_release", "isCompletionUrl", "", "AUTHENTICATE_URLS", "Ljava/util/Set;", "BLANK_PAGE", "Ljava/lang/String;", "COMPLETION_URLS", "PARAM_PAYMENT_CLIENT_SECRET", "PARAM_RETURN_URL", "PARAM_SETUP_CLIENT_SECRET", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentAuthWebViewClient.kt */
    public static final class Companion {
        private Companion() {
        }

        /* access modifiers changed from: private */
        public final boolean isAuthenticateUrl(String str) {
            Set<String> access$getAUTHENTICATE_URLS$cp = PaymentAuthWebViewClient.AUTHENTICATE_URLS;
            if ((access$getAUTHENTICATE_URLS$cp instanceof Collection) && access$getAUTHENTICATE_URLS$cp.isEmpty()) {
                return false;
            }
            for (String J : access$getAUTHENTICATE_URLS$cp) {
                if (StringsKt__IndentKt.J(str, J, false, 2)) {
                    return true;
                }
            }
            return false;
        }

        public final boolean isCompletionUrl$payments_core_release(String str) {
            m0.n.b.i.e(str, "url");
            Set<String> access$getCOMPLETION_URLS$cp = PaymentAuthWebViewClient.COMPLETION_URLS;
            if ((access$getCOMPLETION_URLS$cp instanceof Collection) && access$getCOMPLETION_URLS$cp.isEmpty()) {
                return false;
            }
            for (String J : access$getCOMPLETION_URLS$cp) {
                if (StringsKt__IndentKt.J(str, J, false, 2)) {
                    return true;
                }
            }
            return false;
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public PaymentAuthWebViewClient(Logger logger2, y<Boolean> yVar, String str, String str2, l<? super Intent, i> lVar, l<? super Throwable, i> lVar2) {
        m0.n.b.i.e(logger2, "logger");
        m0.n.b.i.e(yVar, "isPageLoaded");
        m0.n.b.i.e(str, "clientSecret");
        m0.n.b.i.e(lVar, "activityStarter");
        m0.n.b.i.e(lVar2, "activityFinisher");
        this.logger = logger2;
        this.isPageLoaded = yVar;
        this.clientSecret = str;
        this.activityStarter = lVar;
        this.activityFinisher = lVar2;
        this.userReturnUri = str2 != null ? Uri.parse(str2) : null;
    }

    private final void hideProgressBar() {
        this.logger.debug("PaymentAuthWebViewClient#hideProgressBar()");
        this.isPageLoaded.setValue(Boolean.TRUE);
    }

    private final boolean isPredefinedReturnUrl(Uri uri) {
        return m0.n.b.i.a("stripejs://use_stripe_sdk/return_url", uri.toString());
    }

    private final boolean isReturnUrl(Uri uri) {
        String str;
        this.logger.debug("PaymentAuthWebViewClient#isReturnUrl()");
        if (isPredefinedReturnUrl(uri)) {
            return true;
        }
        Uri uri2 = this.userReturnUri;
        if (uri2 != null) {
            if (uri2.getScheme() == null || !m0.n.b.i.a(this.userReturnUri.getScheme(), uri.getScheme()) || this.userReturnUri.getHost() == null || !m0.n.b.i.a(this.userReturnUri.getHost(), uri.getHost())) {
                return false;
            }
            return true;
        } else if (uri.isOpaque()) {
            return false;
        } else {
            Set<String> queryParameterNames = uri.getQueryParameterNames();
            if (queryParameterNames.contains(PARAM_PAYMENT_CLIENT_SECRET)) {
                str = uri.getQueryParameter(PARAM_PAYMENT_CLIENT_SECRET);
            } else {
                str = queryParameterNames.contains(PARAM_SETUP_CLIENT_SECRET) ? uri.getQueryParameter(PARAM_SETUP_CLIENT_SECRET) : null;
            }
            return m0.n.b.i.a(this.clientSecret, str);
        }
    }

    private final void onAuthCompleted(Throwable th) {
        this.logger.debug("PaymentAuthWebViewClient#onAuthCompleted()");
        this.activityFinisher.invoke(th);
    }

    public static /* synthetic */ void onAuthCompleted$default(PaymentAuthWebViewClient paymentAuthWebViewClient, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            th = null;
        }
        paymentAuthWebViewClient.onAuthCompleted(th);
    }

    private final void openIntent(Intent intent) {
        Object obj;
        this.logger.debug("PaymentAuthWebViewClient#openIntent()");
        try {
            this.activityStarter.invoke(intent);
            obj = i.a;
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Throwable a = Result.a(obj);
        if (a != null) {
            this.logger.error("Failed to start Intent.", a);
            if (!m0.n.b.i.a(intent.getScheme(), "alipays")) {
                onAuthCompleted(a);
            }
        }
    }

    private final void openIntentScheme(Uri uri) {
        Object obj;
        this.logger.debug("PaymentAuthWebViewClient#openIntentScheme()");
        try {
            Intent parseUri = Intent.parseUri(uri.toString(), 1);
            m0.n.b.i.d(parseUri, "Intent.parseUri(uri.toSt…Intent.URI_INTENT_SCHEME)");
            openIntent(parseUri);
            obj = i.a;
        } catch (Throwable th) {
            obj = h.l0(th);
        }
        Throwable a = Result.a(obj);
        if (a != null) {
            this.logger.error("Failed to start Intent.", a);
            onAuthCompleted(a);
        }
    }

    private final void updateCompletionUrl(Uri uri) {
        this.logger.debug("PaymentAuthWebViewClient#updateCompletionUrl()");
        Companion companion = Companion;
        String uri2 = uri.toString();
        m0.n.b.i.d(uri2, "uri.toString()");
        String queryParameter = companion.isAuthenticateUrl(uri2) ? uri.getQueryParameter("return_url") : null;
        if (!(queryParameter == null || StringsKt__IndentKt.o(queryParameter))) {
            this.completionUrlParam = queryParameter;
        }
    }

    public final String getCompletionUrlParam() {
        return this.completionUrlParam;
    }

    public final boolean getHasLoadedBlank$payments_core_release() {
        return this.hasLoadedBlank;
    }

    public void onPageFinished(WebView webView, String str) {
        m0.n.b.i.e(webView, "view");
        Logger logger2 = this.logger;
        logger2.debug("PaymentAuthWebViewClient#onPageFinished() - " + str);
        super.onPageFinished(webView, str);
        if (!this.hasLoadedBlank) {
            hideProgressBar();
        }
        if (str != null && Companion.isCompletionUrl$payments_core_release(str)) {
            Logger logger3 = this.logger;
            logger3.debug(str + " is a completion URL");
            onAuthCompleted$default(this, (Throwable) null, 1, (Object) null);
        }
    }

    public final void setHasLoadedBlank$payments_core_release(boolean z) {
        this.hasLoadedBlank = z;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        m0.n.b.i.e(webView, "view");
        m0.n.b.i.e(webResourceRequest, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        Uri url = webResourceRequest.getUrl();
        Logger logger2 = this.logger;
        logger2.debug("PaymentAuthWebViewClient#shouldOverrideUrlLoading(): " + url);
        m0.n.b.i.d(url, "url");
        updateCompletionUrl(url);
        if (isReturnUrl(url)) {
            this.logger.debug("PaymentAuthWebViewClient#shouldOverrideUrlLoading() - handle return URL");
            onAuthCompleted$default(this, (Throwable) null, 1, (Object) null);
            return true;
        } else if (StringsKt__IndentKt.f("intent", url.getScheme(), true)) {
            openIntentScheme(url);
            return true;
        } else if (URLUtil.isNetworkUrl(url.toString())) {
            return super.shouldOverrideUrlLoading(webView, webResourceRequest);
        } else {
            openIntent(new Intent("android.intent.action.VIEW", url));
            return true;
        }
    }
}
