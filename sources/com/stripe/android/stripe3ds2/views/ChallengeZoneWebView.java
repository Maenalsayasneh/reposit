package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneWebViewBinding;
import com.stripe.android.stripe3ds2.views.ThreeDS2WebViewClient;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 '2\u00020\u00012\u00020\u0002:\u0001'B'\b\u0007\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0017\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0001¢\u0006\u0004\b\b\u0010\u0006J\u0017\u0010\u000b\u001a\u00020\n2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\n2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0012\u001a\u00020\u00118\u0006@\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R$\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u0010R$\u0010\u001b\u001a\u00020\u00032\u0006\u0010\u001a\u001a\u00020\u00038\u0016@RX\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006("}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView;", "Landroid/widget/FrameLayout;", "Lcom/stripe/android/stripe3ds2/views/FormField;", "", "html", "transformFormMethod", "(Ljava/lang/String;)Ljava/lang/String;", "transformFormActionUrl", "transformHtml$3ds2sdk_release", "transformHtml", "Lm0/i;", "loadHtml", "(Ljava/lang/String;)V", "Landroid/view/View$OnClickListener;", "onClickListener", "setOnClickListener", "(Landroid/view/View$OnClickListener;)V", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "webView", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "getWebView", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2WebView;", "Landroid/view/View$OnClickListener;", "getOnClickListener$3ds2sdk_release", "()Landroid/view/View$OnClickListener;", "setOnClickListener$3ds2sdk_release", "<set-?>", "userEntry", "Ljava/lang/String;", "getUserEntry", "()Ljava/lang/String;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeZoneWebView.kt */
public final class ChallengeZoneWebView extends FrameLayout implements FormField {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String ENCODING = "UTF-8";
    @Deprecated
    private static final String HTML_MIME_TYPE = "text/html";
    @Deprecated
    private static final String METHOD_GET = "method=\"get\"";
    @Deprecated
    private static final Pattern PATTERN_FORM_ACTION = Pattern.compile("action=\"(.+?)\"", 10);
    @Deprecated
    private static final Pattern PATTERN_METHOD_POST = Pattern.compile("method=\"post\"", 10);
    private View.OnClickListener onClickListener;
    /* access modifiers changed from: private */
    public String userEntry;
    private final ThreeDS2WebView webView;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0004R\u001e\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneWebView$Companion;", "", "", "ENCODING", "Ljava/lang/String;", "HTML_MIME_TYPE", "METHOD_GET", "Ljava/util/regex/Pattern;", "kotlin.jvm.PlatformType", "PATTERN_FORM_ACTION", "Ljava/util/regex/Pattern;", "PATTERN_METHOD_POST", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeZoneWebView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public ChallengeZoneWebView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public ChallengeZoneWebView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeZoneWebView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final String transformFormActionUrl(String str) {
        String group;
        Matcher matcher = PATTERN_FORM_ACTION.matcher(str);
        if (!matcher.find() || (group = matcher.group(1)) == null || !(true ^ i.a(ThreeDS2WebViewClient.CHALLENGE_URL, group))) {
            return str;
        }
        i.e(group, "pattern");
        Pattern compile = Pattern.compile(group);
        i.d(compile, "Pattern.compile(pattern)");
        i.e(compile, "nativePattern");
        i.e(str, "input");
        i.e(ThreeDS2WebViewClient.CHALLENGE_URL, "replacement");
        String replaceAll = compile.matcher(str).replaceAll(ThreeDS2WebViewClient.CHALLENGE_URL);
        i.d(replaceAll, "nativePattern.matcher(in…).replaceAll(replacement)");
        return replaceAll;
    }

    private final String transformFormMethod(String str) {
        String replaceAll = PATTERN_METHOD_POST.matcher(str).replaceAll(METHOD_GET);
        i.d(replaceAll, "methodMatcher.replaceAll(METHOD_GET)");
        return replaceAll;
    }

    public final View.OnClickListener getOnClickListener$3ds2sdk_release() {
        return this.onClickListener;
    }

    public String getUserEntry() {
        return this.userEntry;
    }

    public final ThreeDS2WebView getWebView() {
        return this.webView;
    }

    public final void loadHtml(String str) {
        if (str != null) {
            this.webView.loadDataWithBaseURL((String) null, transformHtml$3ds2sdk_release(str), "text/html", "UTF-8", (String) null);
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener2) {
        this.onClickListener = onClickListener2;
    }

    public final void setOnClickListener$3ds2sdk_release(View.OnClickListener onClickListener2) {
        this.onClickListener = onClickListener2;
    }

    public final String transformHtml$3ds2sdk_release(String str) {
        i.e(str, "html");
        return transformFormActionUrl(transformFormMethod(str));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeZoneWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        this.userEntry = "";
        StripeChallengeZoneWebViewBinding inflate = StripeChallengeZoneWebViewBinding.inflate(LayoutInflater.from(context), this);
        i.d(inflate, "StripeChallengeZoneWebVi…           this\n        )");
        ThreeDS2WebView threeDS2WebView = inflate.webView;
        i.d(threeDS2WebView, "viewBinding.webView");
        this.webView = threeDS2WebView;
        threeDS2WebView.setOnHtmlSubmitListener$3ds2sdk_release(new ThreeDS2WebViewClient.OnHtmlSubmitListener(this) {
            public final /* synthetic */ ChallengeZoneWebView this$0;

            {
                this.this$0 = r1;
            }

            public final void onHtmlSubmit(String str) {
                ChallengeZoneWebView challengeZoneWebView = this.this$0;
                if (str == null) {
                    str = "";
                }
                challengeZoneWebView.userEntry = str;
                View.OnClickListener onClickListener$3ds2sdk_release = this.this$0.getOnClickListener$3ds2sdk_release();
                if (onClickListener$3ds2sdk_release != null) {
                    onClickListener$3ds2sdk_release.onClick(this.this$0);
                }
            }
        });
    }
}
