package com.stripe.android.payments;

import android.content.Intent;
import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.core.app.ActivityOptionsCompat;
import com.stripe.android.auth.PaymentBrowserAuthContract;
import h0.a.f.b;
import h0.a.f.d.d;
import h0.b.a.e;
import h0.q.l0;
import kotlin.Metadata;
import m0.c;
import m0.n.b.i;
import m0.n.b.m;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0019\u0010\t\u001a\u00020\u00042\b\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0014¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00042\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eR\u001d\u0010\u0014\u001a\u00020\u000f8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/payments/StripeBrowserLauncherActivity;", "Lh0/b/a/e;", "Landroidx/activity/result/ActivityResult;", "activityResult", "Lm0/i;", "onResult", "(Landroidx/activity/result/ActivityResult;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/content/Intent;", "intent", "onNewIntent", "(Landroid/content/Intent;)V", "Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;", "viewModel$delegate", "Lm0/c;", "getViewModel", "()Lcom/stripe/android/payments/StripeBrowserLauncherViewModel;", "viewModel", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeBrowserLauncherActivity.kt */
public final class StripeBrowserLauncherActivity extends e {
    private final c viewModel$delegate = new l0(m.a(StripeBrowserLauncherViewModel.class), new StripeBrowserLauncherActivity$$special$$inlined$viewModels$2(this), new StripeBrowserLauncherActivity$viewModel$2(this));

    private final StripeBrowserLauncherViewModel getViewModel() {
        return (StripeBrowserLauncherViewModel) this.viewModel$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void onResult(ActivityResult activityResult) {
        finish();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        PaymentBrowserAuthContract.Companion companion = PaymentBrowserAuthContract.Companion;
        Intent intent = getIntent();
        i.d(intent, "intent");
        PaymentBrowserAuthContract.Args parseArgs$payments_core_release = companion.parseArgs$payments_core_release(intent);
        if (parseArgs$payments_core_release == null) {
            finish();
            return;
        }
        setResult(-1, getViewModel().getResultIntent(parseArgs$payments_core_release));
        b registerForActivityResult = registerForActivityResult(new d(), new StripeBrowserLauncherActivity$sam$androidx_activity_result_ActivityResultCallback$0(new StripeBrowserLauncherActivity$onCreate$launcher$1(this)));
        i.d(registerForActivityResult, "registerForActivityResul…     ::onResult\n        )");
        registerForActivityResult.a(getViewModel().createLaunchIntent(parseArgs$payments_core_release), (ActivityOptionsCompat) null);
    }

    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
    }
}
