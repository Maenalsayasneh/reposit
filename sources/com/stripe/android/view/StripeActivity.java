package com.stripe.android.view;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.widget.ProgressBar;
import com.stripe.android.R;
import com.stripe.android.databinding.StripeActivityBinding;
import h0.b.a.a;
import h0.b.a.e;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.c;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b9\u0010\u0012J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0014¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0010\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0004H$¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0004¢\u0006\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001f\u001a\u00020\u001a8B@\u0002X\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001d\u0010$\u001a\u00020 8@@\u0000X\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\"\u0010#R\u001d\u0010)\u001a\u00020%8B@\u0002X\u0002¢\u0006\f\n\u0004\b&\u0010\u001c\u001a\u0004\b'\u0010(R*\u0010+\u001a\u00020\t2\u0006\u0010*\u001a\u00020\t8\u0004@DX\u000e¢\u0006\u0012\n\u0004\b+\u0010,\u001a\u0004\b+\u0010-\"\u0004\b.\u0010\u0015R\u001d\u00103\u001a\u00020/8B@\u0002X\u0002¢\u0006\f\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u00102R\u001d\u00108\u001a\u0002048@@\u0000X\u0002¢\u0006\f\n\u0004\b5\u0010\u001c\u001a\u0004\b6\u00107¨\u0006:"}, d2 = {"Lcom/stripe/android/view/StripeActivity;", "Lh0/b/a/e;", "Landroid/os/Bundle;", "savedInstanceState", "Lm0/i;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "", "onCreateOptionsMenu", "(Landroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "onPrepareOptionsMenu", "onActionSave", "()V", "visible", "onProgressBarVisibilityChanged", "(Z)V", "", "error", "showError", "(Ljava/lang/String;)V", "Lcom/stripe/android/view/StripeColorUtils;", "stripeColorUtils$delegate", "Lm0/c;", "getStripeColorUtils", "()Lcom/stripe/android/view/StripeColorUtils;", "stripeColorUtils", "Landroid/view/ViewStub;", "viewStub$delegate", "getViewStub$payments_core_release", "()Landroid/view/ViewStub;", "viewStub", "Lcom/stripe/android/view/AlertDisplayer;", "alertDisplayer$delegate", "getAlertDisplayer", "()Lcom/stripe/android/view/AlertDisplayer;", "alertDisplayer", "value", "isProgressBarVisible", "Z", "()Z", "setProgressBarVisible", "Lcom/stripe/android/databinding/StripeActivityBinding;", "viewBinding$delegate", "getViewBinding", "()Lcom/stripe/android/databinding/StripeActivityBinding;", "viewBinding", "Landroid/widget/ProgressBar;", "progressBar$delegate", "getProgressBar$payments_core_release", "()Landroid/widget/ProgressBar;", "progressBar", "<init>", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: StripeActivity.kt */
public abstract class StripeActivity extends e {
    private final c alertDisplayer$delegate = h.H2(new StripeActivity$alertDisplayer$2(this));
    private boolean isProgressBarVisible;
    private final c progressBar$delegate = h.H2(new StripeActivity$progressBar$2(this));
    private final c stripeColorUtils$delegate = h.H2(new StripeActivity$stripeColorUtils$2(this));
    private final c viewBinding$delegate = h.H2(new StripeActivity$viewBinding$2(this));
    private final c viewStub$delegate = h.H2(new StripeActivity$viewStub$2(this));

    private final AlertDisplayer getAlertDisplayer() {
        return (AlertDisplayer) this.alertDisplayer$delegate.getValue();
    }

    private final StripeColorUtils getStripeColorUtils() {
        return (StripeColorUtils) this.stripeColorUtils$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final StripeActivityBinding getViewBinding() {
        return (StripeActivityBinding) this.viewBinding$delegate.getValue();
    }

    public final ProgressBar getProgressBar$payments_core_release() {
        return (ProgressBar) this.progressBar$delegate.getValue();
    }

    public final ViewStub getViewStub$payments_core_release() {
        return (ViewStub) this.viewStub$delegate.getValue();
    }

    public final boolean isProgressBarVisible() {
        return this.isProgressBarVisible;
    }

    public abstract void onActionSave();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((View) getViewBinding().getRoot());
        setSupportActionBar(getViewBinding().toolbar);
        a supportActionBar = getSupportActionBar();
        if (supportActionBar != null) {
            supportActionBar.p(true);
        }
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        i.e(menu, "menu");
        getMenuInflater().inflate(R.menu.add_payment_method, menu);
        MenuItem findItem = menu.findItem(R.id.action_save);
        i.d(findItem, "menu.findItem(R.id.action_save)");
        findItem.setEnabled(!this.isProgressBarVisible);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        i.e(menuItem, "item");
        if (menuItem.getItemId() == R.id.action_save) {
            onActionSave();
            return true;
        }
        boolean onOptionsItemSelected = super.onOptionsItemSelected(menuItem);
        if (onOptionsItemSelected) {
            return onOptionsItemSelected;
        }
        onBackPressed();
        return onOptionsItemSelected;
    }

    public boolean onPrepareOptionsMenu(Menu menu) {
        i.e(menu, "menu");
        MenuItem findItem = menu.findItem(R.id.action_save);
        StripeColorUtils stripeColorUtils = getStripeColorUtils();
        Resources.Theme theme = getTheme();
        i.d(theme, "theme");
        Drawable tintedIconWithAttribute = stripeColorUtils.getTintedIconWithAttribute(theme, R.attr.titleTextColor, R.drawable.stripe_ic_checkmark);
        i.d(findItem, "saveItem");
        findItem.setIcon(tintedIconWithAttribute);
        return super.onPrepareOptionsMenu(menu);
    }

    public void onProgressBarVisibilityChanged(boolean z) {
    }

    public final void setProgressBarVisible(boolean z) {
        getProgressBar$payments_core_release().setVisibility(z ? 0 : 8);
        invalidateOptionsMenu();
        onProgressBarVisibilityChanged(z);
        this.isProgressBarVisible = z;
    }

    public final void showError(String str) {
        i.e(str, "error");
        getAlertDisplayer().show(str);
    }
}
