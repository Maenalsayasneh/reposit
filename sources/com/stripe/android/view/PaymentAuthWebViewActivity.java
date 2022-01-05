package com.stripe.android.view;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import com.stripe.android.Logger;
import com.stripe.android.R;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import com.stripe.android.databinding.PaymentAuthWebViewActivityBinding;
import com.stripe.android.exception.StripeException;
import com.stripe.android.model.Source;
import com.stripe.android.payments.PaymentFlowResult;
import com.stripe.android.stripe3ds2.utils.CustomizeUtils;
import com.stripe.android.view.PaymentAuthWebViewActivityViewModel;
import com.ults.listeners.SdkChallengeInterface;
import h0.b.a.e;
import h0.q.l0;
import h0.q.y;
import h0.s.a.a;
import i0.j.f.p.h;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.c;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b4\u0010\u0004J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0013\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0014\u0010\u0004J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u0004R\u001d\u0010$\u001a\u00020\u001f8B@\u0002X\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010(R\u001d\u0010.\u001a\u00020*8B@\u0002X\u0002¢\u0006\f\n\u0004\b+\u0010!\u001a\u0004\b,\u0010-R\u001f\u00103\u001a\u0004\u0018\u00010/8B@\u0002X\u0002¢\u0006\f\n\u0004\b0\u0010!\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Lcom/stripe/android/view/PaymentAuthWebViewActivity;", "Lh0/b/a/e;", "Lm0/i;", "cancelIntentSource", "()V", "customizeToolbar", "Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;", "paymentFlowResult", "Landroid/content/Intent;", "createResultIntent", "(Lcom/stripe/android/payments/PaymentFlowResult$Unvalidated;)Landroid/content/Intent;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "", "error", "onAuthComplete$payments_core_release", "(Ljava/lang/Throwable;)V", "onAuthComplete", "onDestroy", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onBackPressed", "Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "viewModel$delegate", "Lm0/c;", "getViewModel", "()Lcom/stripe/android/view/PaymentAuthWebViewActivityViewModel;", "viewModel", "Lcom/stripe/android/Logger;", "logger$delegate", "getLogger", "()Lcom/stripe/android/Logger;", "logger", "Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;", "viewBinding$delegate", "getViewBinding", "()Lcom/stripe/android/databinding/PaymentAuthWebViewActivityBinding;", "viewBinding", "Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "_args$delegate", "get_args", "()Lcom/stripe/android/auth/PaymentBrowserAuthContract$Args;", "_args", "<init>", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentAuthWebViewActivity.kt */
public final class PaymentAuthWebViewActivity extends e {
    private final c _args$delegate = h.H2(new PaymentAuthWebViewActivity$_args$2(this));
    private final c logger$delegate = h.H2(new PaymentAuthWebViewActivity$logger$2(this));
    private final c viewBinding$delegate = h.H2(new PaymentAuthWebViewActivity$viewBinding$2(this));
    private final c viewModel$delegate = new l0(m.a(PaymentAuthWebViewActivityViewModel.class), new PaymentAuthWebViewActivity$$special$$inlined$viewModels$2(this), new PaymentAuthWebViewActivity$viewModel$2(this));

    private final void cancelIntentSource() {
        setResult(-1, getViewModel().getCancellationResult$payments_core_release());
        finish();
    }

    private final Intent createResultIntent(PaymentFlowResult.Unvalidated unvalidated) {
        Intent putExtras = new Intent().putExtras(unvalidated.toBundle());
        i.d(putExtras, "Intent().putExtras(paymentFlowResult.toBundle())");
        return putExtras;
    }

    private final void customizeToolbar() {
        getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar()");
        PaymentAuthWebViewActivityViewModel.ToolbarTitleData toolbarTitle$payments_core_release = getViewModel().getToolbarTitle$payments_core_release();
        if (toolbarTitle$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar title");
            Toolbar toolbar = getViewBinding().toolbar;
            i.d(toolbar, "viewBinding.toolbar");
            toolbar.setTitle((CharSequence) CustomizeUtils.INSTANCE.buildStyledText(this, toolbarTitle$payments_core_release.getText$payments_core_release(), toolbarTitle$payments_core_release.getToolbarCustomization$payments_core_release()));
        }
        String toolbarBackgroundColor$payments_core_release = getViewModel().getToolbarBackgroundColor$payments_core_release();
        if (toolbarBackgroundColor$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating toolbar background color");
            int parseColor = Color.parseColor(toolbarBackgroundColor$payments_core_release);
            getViewBinding().toolbar.setBackgroundColor(parseColor);
            CustomizeUtils.INSTANCE.setStatusBarColor(this, parseColor);
        }
    }

    /* access modifiers changed from: private */
    public final Logger getLogger() {
        return (Logger) this.logger$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final PaymentAuthWebViewActivityBinding getViewBinding() {
        return (PaymentAuthWebViewActivityBinding) this.viewBinding$delegate.getValue();
    }

    private final PaymentAuthWebViewActivityViewModel getViewModel() {
        return (PaymentAuthWebViewActivityViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final PaymentBrowserAuthContract.Args get_args() {
        return (PaymentBrowserAuthContract.Args) this._args$delegate.getValue();
    }

    public final void onAuthComplete$payments_core_release(Throwable th) {
        if (th != null) {
            getViewModel().logError();
            setResult(-1, createResultIntent(PaymentFlowResult.Unvalidated.copy$default(getViewModel().getPaymentResult$payments_core_release(), (String) null, 2, StripeException.Companion.create(th), true, (String) null, (Source) null, (String) null, 113, (Object) null)));
        } else {
            getViewModel().logComplete();
        }
        finish();
    }

    public void onBackPressed() {
        if (getViewBinding().webView.canGoBack()) {
            getViewBinding().webView.goBack();
        } else {
            cancelIntentSource();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBrowserAuthContract.Args args = get_args();
        if (args == null) {
            setResult(0);
            finish();
            return;
        }
        getLogger().debug("PaymentAuthWebViewActivity#onCreate()");
        a.a(this).c(new Intent().setAction(SdkChallengeInterface.UL_HANDLE_CHALLENGE_ACTION));
        setContentView((View) getViewBinding().getRoot());
        setSupportActionBar(getViewBinding().toolbar);
        customizeToolbar();
        String clientSecret = args.getClientSecret();
        setResult(-1, createResultIntent(getViewModel().getPaymentResult$payments_core_release()));
        if (StringsKt__IndentKt.o(clientSecret)) {
            getLogger().debug("PaymentAuthWebViewActivity#onCreate() - clientSecret is blank");
            finish();
            return;
        }
        getLogger().debug("PaymentAuthWebViewActivity#onCreate() - PaymentAuthWebView init and loadUrl");
        y yVar = new y(Boolean.FALSE);
        yVar.observe(this, new PaymentAuthWebViewActivity$onCreate$1(this));
        PaymentAuthWebViewClient paymentAuthWebViewClient = new PaymentAuthWebViewClient(getLogger(), yVar, clientSecret, args.getReturnUrl(), new PaymentAuthWebViewActivity$onCreate$webViewClient$1(this), new PaymentAuthWebViewActivity$onCreate$webViewClient$2(this));
        getViewBinding().webView.setOnLoadBlank$payments_core_release(new PaymentAuthWebViewActivity$onCreate$2(paymentAuthWebViewClient));
        PaymentAuthWebView paymentAuthWebView = getViewBinding().webView;
        i.d(paymentAuthWebView, "viewBinding.webView");
        paymentAuthWebView.setWebViewClient(paymentAuthWebViewClient);
        PaymentAuthWebView paymentAuthWebView2 = getViewBinding().webView;
        i.d(paymentAuthWebView2, "viewBinding.webView");
        paymentAuthWebView2.setWebChromeClient(new PaymentAuthWebChromeClient(this, getLogger()));
        getViewModel().logStart();
        getViewBinding().webView.loadUrl(args.getUrl(), getViewModel().getExtraHeaders());
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        i.e(menu, "menu");
        getLogger().debug("PaymentAuthWebViewActivity#onCreateOptionsMenu()");
        getMenuInflater().inflate(R.menu.payment_auth_web_view_menu, menu);
        String buttonText$payments_core_release = getViewModel().getButtonText$payments_core_release();
        if (buttonText$payments_core_release != null) {
            getLogger().debug("PaymentAuthWebViewActivity#customizeToolbar() - updating close button text");
            MenuItem findItem = menu.findItem(R.id.action_close);
            i.d(findItem, "menu.findItem(R.id.action_close)");
            findItem.setTitle(buttonText$payments_core_release);
        }
        return super.onCreateOptionsMenu(menu);
    }

    public void onDestroy() {
        getViewBinding().webViewContainer.removeAllViews();
        getViewBinding().webView.destroy();
        super.onDestroy();
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        i.e(menuItem, "item");
        getLogger().debug("PaymentAuthWebViewActivity#onOptionsItemSelected()");
        if (menuItem.getItemId() != R.id.action_close) {
            return super.onOptionsItemSelected(menuItem);
        }
        cancelIntentSource();
        return true;
    }
}
