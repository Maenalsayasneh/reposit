package com.stripe.android.view;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.core.app.NotificationCompat;
import com.stripe.android.Logger;
import com.stripe.android.PaymentConfiguration;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.exception.StripeException;
import com.stripe.android.model.Source;
import com.stripe.android.model.Token;
import com.stripe.android.networking.AnalyticsEvent;
import com.stripe.android.networking.AnalyticsRequest;
import com.stripe.android.networking.AnalyticsRequestExecutor;
import com.stripe.android.networking.AnalyticsRequestFactory;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization;
import h0.q.k0;
import h0.q.m0;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import m0.c;
import m0.l.e;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\b\u0000\u0018\u00002\u00020\u0001:\u000201B\u001f\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010&\u001a\u00020%¢\u0006\u0004\b.\u0010/J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\bR\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0016\u0010\u0019\u001a\u00020\u00168@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u000b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001f\u0010\r\u001a\u0004\b \u0010\u000fR\u0016\u0010$\u001a\u00020!8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R)\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0(8F@\u0006X\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u00062"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "Lh0/q/k0;", "Lcom/stripe/android/networking/AnalyticsRequest;", "request", "Lm0/i;", "fireAnalytics", "(Lcom/stripe/android/networking/AnalyticsRequest;)V", "logStart", "()V", "logError", "logComplete", "", "buttonText", "Ljava/lang/String;", "getButtonText$payments_core_release", "()Ljava/lang/String;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "analyticsRequestExecutor", "Lcom/stripe/android/networking/AnalyticsRequestExecutor;", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "getPaymentResult$payments_core_release", "()Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "paymentResult", "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "toolbarTitle", "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "getToolbarTitle$payments_core_release", "()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "toolbarBackgroundColor", "getToolbarBackgroundColor$payments_core_release", "Landroid/content/Intent;", "getCancellationResult$payments_core_release", "()Landroid/content/Intent;", "cancellationResult", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "analyticsRequestFactory", "Lcom/stripe/android/networking/AnalyticsRequestFactory;", "", "extraHeaders$delegate", "Lm0/c;", "getExtraHeaders", "()Ljava/util/Map;", "extraHeaders", "<init>", "(Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;Lcom/stripe/android/networking/AnalyticsRequestExecutor;Lcom/stripe/android/networking/AnalyticsRequestFactory;)V", "Factory", "ToolbarTitleData", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentAuthWebViewActivityViewModel.kt */
public final class PaymentAuthWebViewActivityViewModel extends k0 {
    private final AnalyticsRequestExecutor analyticsRequestExecutor;
    private final AnalyticsRequestFactory analyticsRequestFactory;
    private final PaymentBrowserAuthContract.Args args;
    private final /* synthetic */ String buttonText;
    private final c extraHeaders$delegate = h.H2(PaymentAuthWebViewActivityViewModel$extraHeaders$2.INSTANCE);
    private final /* synthetic */ String toolbarBackgroundColor;
    private final /* synthetic */ ToolbarTitleData toolbarTitle;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012J)\u0010\u0006\u001a\u00028\u0000\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0016\u0010\u000f\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$Factory;", "Lh0/q/m0$b;", "Lh0/q/k0;", "T", "Ljava/lang/Class;", "modelClass", "create", "(Ljava/lang/Class;)Lh0/q/k0;", "Landroid/app/Application;", "application", "Landroid/app/Application;", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "args", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "Lcom/stripe/android/Logger;", "logger", "Lcom/stripe/android/Logger;", "<init>", "(Landroid/app/Application;Lcom/stripe/android/Logger;Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentAuthWebViewActivityViewModel.kt */
    public static final class Factory implements m0.b {
        private final Application application;
        private final PaymentBrowserAuthContract.Args args;
        private final Logger logger;

        public Factory(Application application2, Logger logger2, PaymentBrowserAuthContract.Args args2) {
            i.e(application2, "application");
            i.e(logger2, "logger");
            i.e(args2, "args");
            this.application = application2;
            this.logger = logger2;
            this.args = args2;
        }

        public <T extends k0> T create(Class<T> cls) {
            i.e(cls, "modelClass");
            return new PaymentAuthWebViewActivityViewModel(this.args, new AnalyticsRequestExecutor.Default(this.logger, (e) null, 2, (f) null), new AnalyticsRequestFactory((Context) this.application, PaymentConfiguration.Companion.getInstance(this.application).getPublishableKey()));
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u0005\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\t\u001a\u00020\u0006HÀ\u0003¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u0004J\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u000b\u001a\u00020\u00068\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\bR\u001c\u0010\n\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u0004¨\u0006\u001c"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "", "", "component1$payments_core_release", "()Ljava/lang/String;", "component1", "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "component2$payments_core_release", "()Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "component2", "text", "toolbarCustomization", "copy", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;)Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel$ToolbarTitleData;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;", "getToolbarCustomization$payments_core_release", "Ljava/lang/String;", "getText$payments_core_release", "<init>", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/StripeToolbarCustomization;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentAuthWebViewActivityViewModel.kt */
    public static final class ToolbarTitleData {
        private final String text;
        private final StripeToolbarCustomization toolbarCustomization;

        public ToolbarTitleData(String str, StripeToolbarCustomization stripeToolbarCustomization) {
            i.e(str, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
            i.e(stripeToolbarCustomization, "toolbarCustomization");
            this.text = str;
            this.toolbarCustomization = stripeToolbarCustomization;
        }

        public static /* synthetic */ ToolbarTitleData copy$default(ToolbarTitleData toolbarTitleData, String str, StripeToolbarCustomization stripeToolbarCustomization, int i, Object obj) {
            if ((i & 1) != 0) {
                str = toolbarTitleData.text;
            }
            if ((i & 2) != 0) {
                stripeToolbarCustomization = toolbarTitleData.toolbarCustomization;
            }
            return toolbarTitleData.copy(str, stripeToolbarCustomization);
        }

        public final String component1$payments_core_release() {
            return this.text;
        }

        public final StripeToolbarCustomization component2$payments_core_release() {
            return this.toolbarCustomization;
        }

        public final ToolbarTitleData copy(String str, StripeToolbarCustomization stripeToolbarCustomization) {
            i.e(str, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
            i.e(stripeToolbarCustomization, "toolbarCustomization");
            return new ToolbarTitleData(str, stripeToolbarCustomization);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToolbarTitleData)) {
                return false;
            }
            ToolbarTitleData toolbarTitleData = (ToolbarTitleData) obj;
            return i.a(this.text, toolbarTitleData.text) && i.a(this.toolbarCustomization, toolbarTitleData.toolbarCustomization);
        }

        public final String getText$payments_core_release() {
            return this.text;
        }

        public final StripeToolbarCustomization getToolbarCustomization$payments_core_release() {
            return this.toolbarCustomization;
        }

        public int hashCode() {
            String str = this.text;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            StripeToolbarCustomization stripeToolbarCustomization = this.toolbarCustomization;
            if (stripeToolbarCustomization != null) {
                i = stripeToolbarCustomization.hashCode();
            }
            return hashCode + i;
        }

        public String toString() {
            StringBuilder P0 = a.P0("ToolbarTitleData(text=");
            P0.append(this.text);
            P0.append(", toolbarCustomization=");
            P0.append(this.toolbarCustomization);
            P0.append(")");
            return P0.toString();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0039, code lost:
        if ((r6 == null || kotlin.text.StringsKt__IndentKt.o(r6)) == false) goto L_0x003d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PaymentAuthWebViewActivityViewModel(com.stripe.android.auth.PaymentBrowserAuthContract.Args r5, com.stripe.android.networking.AnalyticsRequestExecutor r6, com.stripe.android.networking.AnalyticsRequestFactory r7) {
        /*
            r4 = this;
            java.lang.String r0 = "args"
            m0.n.b.i.e(r5, r0)
            java.lang.String r0 = "analyticsRequestExecutor"
            m0.n.b.i.e(r6, r0)
            java.lang.String r0 = "analyticsRequestFactory"
            m0.n.b.i.e(r7, r0)
            r4.<init>()
            r4.args = r5
            r4.analyticsRequestExecutor = r6
            r4.analyticsRequestFactory = r7
            com.stripe.android.view.PaymentAuthWebViewActivityViewModel$extraHeaders$2 r6 = com.stripe.android.view.PaymentAuthWebViewActivityViewModel$extraHeaders$2.INSTANCE
            m0.c r6 = i0.j.f.p.h.H2(r6)
            r4.extraHeaders$delegate = r6
            com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization r6 = r5.getToolbarCustomization()
            r7 = 0
            r0 = 1
            r1 = 0
            if (r6 == 0) goto L_0x003c
            java.lang.String r6 = r6.getButtonText()
            if (r6 == 0) goto L_0x0038
            boolean r2 = kotlin.text.StringsKt__IndentKt.o(r6)
            if (r2 == 0) goto L_0x0036
            goto L_0x0038
        L_0x0036:
            r2 = r7
            goto L_0x0039
        L_0x0038:
            r2 = r0
        L_0x0039:
            if (r2 != 0) goto L_0x003c
            goto L_0x003d
        L_0x003c:
            r6 = r1
        L_0x003d:
            r4.buttonText = r6
            com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization r6 = r5.getToolbarCustomization()
            if (r6 == 0) goto L_0x0063
            java.lang.String r2 = r6.getHeaderText()
            if (r2 == 0) goto L_0x0051
            boolean r3 = kotlin.text.StringsKt__IndentKt.o(r2)
            if (r3 == 0) goto L_0x0052
        L_0x0051:
            r7 = r0
        L_0x0052:
            if (r7 != 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r2 = r1
        L_0x0056:
            if (r2 == 0) goto L_0x0063
            com.stripe.android.view.PaymentAuthWebViewActivityViewModel$ToolbarTitleData r7 = new com.stripe.android.view.PaymentAuthWebViewActivityViewModel$ToolbarTitleData
            java.lang.String r0 = "it"
            m0.n.b.i.d(r2, r0)
            r7.<init>(r2, r6)
            goto L_0x0064
        L_0x0063:
            r7 = r1
        L_0x0064:
            r4.toolbarTitle = r7
            com.stripe.android.stripe3ds2.init.ui.StripeToolbarCustomization r5 = r5.getToolbarCustomization()
            if (r5 == 0) goto L_0x0070
            java.lang.String r1 = r5.getBackgroundColor()
        L_0x0070:
            r4.toolbarBackgroundColor = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentAuthWebViewActivityViewModel.<init>(com.stripe.android.auth.PaymentBrowserAuthContract$Args, com.stripe.android.networking.AnalyticsRequestExecutor, com.stripe.android.networking.AnalyticsRequestFactory):void");
    }

    private final void fireAnalytics(AnalyticsRequest analyticsRequest) {
        this.analyticsRequestExecutor.executeAsync(analyticsRequest);
    }

    public final String getButtonText$payments_core_release() {
        return this.buttonText;
    }

    public final /* synthetic */ Intent getCancellationResult$payments_core_release() {
        Intent putExtras = new Intent().putExtras(PaymentFlowResult.Unvalidated.copy$default(getPaymentResult$payments_core_release(), (String) null, this.args.getShouldCancelIntentOnUserNavigation() ? 3 : 1, (StripeException) null, this.args.getShouldCancelSource(), (String) null, (Source) null, (String) null, 117, (Object) null).toBundle());
        i.d(putExtras, "Intent().putExtras(\n    ….toBundle()\n            )");
        return putExtras;
    }

    public final Map<String, String> getExtraHeaders() {
        return (Map) this.extraHeaders$delegate.getValue();
    }

    public final /* synthetic */ PaymentFlowResult.Unvalidated getPaymentResult$payments_core_release() {
        String clientSecret = this.args.getClientSecret();
        Uri parse = Uri.parse(this.args.getUrl());
        i.d(parse, "Uri.parse(args.url)");
        String lastPathSegment = parse.getLastPathSegment();
        if (lastPathSegment == null) {
            lastPathSegment = "";
        }
        return new PaymentFlowResult.Unvalidated(clientSecret, 0, (StripeException) null, false, lastPathSegment, (Source) null, this.args.getStripeAccountId(), 46, (f) null);
    }

    public final String getToolbarBackgroundColor$payments_core_release() {
        return this.toolbarBackgroundColor;
    }

    public final ToolbarTitleData getToolbarTitle$payments_core_release() {
        return this.toolbarTitle;
    }

    public final void logComplete() {
        fireAnalytics(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, AnalyticsEvent.Auth3ds1ChallengeComplete, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
    }

    public final void logError() {
        fireAnalytics(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, AnalyticsEvent.Auth3ds1ChallengeError, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
    }

    public final void logStart() {
        fireAnalytics(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, AnalyticsEvent.Auth3ds1ChallengeStart, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
        fireAnalytics(AnalyticsRequestFactory.createRequest$payments_core_release$default(this.analyticsRequestFactory, AnalyticsEvent.AuthWithWebView, (Set) null, (String) null, (Token.Type) null, (AnalyticsRequestFactory.ThreeDS2UiType) null, 30, (Object) null));
    }
}
