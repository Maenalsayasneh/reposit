package com.stripe.android.paymentsheet.ui;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.FragmentManager;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.MaterialToolbar;
import com.stripe.android.R;
import com.stripe.android.paymentsheet.BottomSheetController;
import com.stripe.android.paymentsheet.analytics.EventReporter;
import com.stripe.android.paymentsheet.viewmodels.BaseSheetViewModel;
import com.stripe.android.view.KeyboardController;
import h0.b.a.e;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import kotlin.Metadata;
import m0.c;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b \u0018\u0000 A*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0002ABB\u0007¢\u0006\u0004\b@\u0010\u000bJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0007J\u000f\u0010\n\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000H&¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0013\u0010\u000bJ\u000f\u0010\u0014\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u000bJ\u0017\u0010\u0015\u001a\u00020\u00052\u0006\u0010\f\u001a\u00028\u0000H\u0004¢\u0006\u0004\b\u0015\u0010\u000eR\u0016\u0010\u0019\u001a\u00020\u00168&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018R\u0016\u0010\u001b\u001a\u00020\u00168&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u001c8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0016\u0010#\u001a\u00020 8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010+\u001a\u00020(8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b-\u0010.R\u0016\u00101\u001a\u00020\u00168&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b0\u0010\u0018R\u0016\u00105\u001a\u0002028&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b3\u00104R\u001d\u0010;\u001a\u0002068B@\u0002X\u0002¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u0016\u0010?\u001a\u00020<8&@&X¦\u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006C"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity;", "ResultType", "Lh0/b/a/e;", "", "isStackEmpty", "Lm0/i;", "updateToolbarButton", "(Z)V", "isProcessing", "updateRootViewClickHandling", "onUserBack", "()V", "result", "setActivityResult", "(Ljava/lang/Object;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "finish", "onBackPressed", "closeSheet", "Landroid/view/ViewGroup;", "getFragmentContainerParent", "()Landroid/view/ViewGroup;", "fragmentContainerParent", "getBottomSheet", "bottomSheet", "Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "getViewModel", "()Lcom/stripe/android/paymentsheet/viewmodels/BaseSheetViewModel;", "viewModel", "Landroid/widget/TextView;", "getMessageView", "()Landroid/widget/TextView;", "messageView", "Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "getEventReporter", "()Lcom/stripe/android/paymentsheet/analytics/EventReporter;", "eventReporter", "Lcom/stripe/android/paymentsheet/BottomSheetController;", "getBottomSheetController", "()Lcom/stripe/android/paymentsheet/BottomSheetController;", "bottomSheetController", "Lcom/google/android/material/appbar/MaterialToolbar;", "getToolbar", "()Lcom/google/android/material/appbar/MaterialToolbar;", "toolbar", "getRootView", "rootView", "Landroid/widget/ScrollView;", "getScrollView", "()Landroid/widget/ScrollView;", "scrollView", "Lcom/stripe/android/view/KeyboardController;", "keyboardController$delegate", "Lm0/c;", "getKeyboardController", "()Lcom/stripe/android/view/KeyboardController;", "keyboardController", "Lcom/google/android/material/appbar/AppBarLayout;", "getAppbar", "()Lcom/google/android/material/appbar/AppBarLayout;", "appbar", "<init>", "Companion", "ToolbarResources", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BaseSheetActivity.kt */
public abstract class BaseSheetActivity<ResultType> extends e {
    public static final Companion Companion = new Companion((f) null);
    public static final String EXTRA_FRAGMENT_CONFIG = "com.stripe.android.paymentsheet.extra_fragment_config";
    public static final String EXTRA_STARTER_ARGS = "com.stripe.android.paymentsheet.extra_starter_args";
    private final c keyboardController$delegate = h.H2(new BaseSheetActivity$keyboardController$2(this));

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0006@\u0006XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$Companion;", "", "", "EXTRA_FRAGMENT_CONFIG", "Ljava/lang/String;", "EXTRA_STARTER_ARGS", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BaseSheetActivity.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\b\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0003\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0005\u0010\u0004J$\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u0004J\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0007\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0012\u001a\u0004\b\u0013\u0010\u0004R\u0019\u0010\u0006\u001a\u00020\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0014\u0010\u0004¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$ToolbarResources;", "", "", "component1", "()I", "component2", "icon", "description", "copy", "(II)Lcom/stripe/android/paymentsheet/ui/BaseSheetActivity$ToolbarResources;", "", "toString", "()Ljava/lang/String;", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getDescription", "getIcon", "<init>", "(II)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BaseSheetActivity.kt */
    public static final class ToolbarResources {
        private final int description;
        private final int icon;

        public ToolbarResources(int i, int i2) {
            this.icon = i;
            this.description = i2;
        }

        public static /* synthetic */ ToolbarResources copy$default(ToolbarResources toolbarResources, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = toolbarResources.icon;
            }
            if ((i3 & 2) != 0) {
                i2 = toolbarResources.description;
            }
            return toolbarResources.copy(i, i2);
        }

        public final int component1() {
            return this.icon;
        }

        public final int component2() {
            return this.description;
        }

        public final ToolbarResources copy(int i, int i2) {
            return new ToolbarResources(i, i2);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ToolbarResources)) {
                return false;
            }
            ToolbarResources toolbarResources = (ToolbarResources) obj;
            return this.icon == toolbarResources.icon && this.description == toolbarResources.description;
        }

        public final int getDescription() {
            return this.description;
        }

        public final int getIcon() {
            return this.icon;
        }

        public int hashCode() {
            return Integer.hashCode(this.description) + (Integer.hashCode(this.icon) * 31);
        }

        public String toString() {
            StringBuilder P0 = a.P0("ToolbarResources(icon=");
            P0.append(this.icon);
            P0.append(", description=");
            return a.u0(P0, this.description, ")");
        }
    }

    private final KeyboardController getKeyboardController() {
        return (KeyboardController) this.keyboardController$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final void onUserBack() {
        getKeyboardController().hide$payments_core_release();
        onBackPressed();
    }

    /* access modifiers changed from: private */
    public final void updateRootViewClickHandling(boolean z) {
        if (!z) {
            getRootView().setOnClickListener(new BaseSheetActivity$updateRootViewClickHandling$1(this));
            return;
        }
        getRootView().setOnClickListener((View.OnClickListener) null);
        getRootView().setClickable(false);
    }

    /* access modifiers changed from: private */
    public final void updateToolbarButton(boolean z) {
        ToolbarResources toolbarResources;
        if (z) {
            toolbarResources = new ToolbarResources(R.drawable.stripe_paymentsheet_toolbar_close, R.string.stripe_paymentsheet_close);
        } else {
            toolbarResources = new ToolbarResources(R.drawable.stripe_paymentsheet_toolbar_back, R.string.stripe_paymentsheet_back);
        }
        getToolbar().setNavigationIcon(h0.i.b.a.getDrawable(this, toolbarResources.getIcon()));
        getToolbar().setNavigationContentDescription((CharSequence) getResources().getString(toolbarResources.getDescription()));
    }

    public final void closeSheet(ResultType resulttype) {
        setActivityResult(resulttype);
        getBottomSheetController().hide();
    }

    public void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public abstract AppBarLayout getAppbar();

    public abstract ViewGroup getBottomSheet();

    public abstract BottomSheetController getBottomSheetController();

    public abstract EventReporter getEventReporter();

    public abstract ViewGroup getFragmentContainerParent();

    public abstract TextView getMessageView();

    public abstract ViewGroup getRootView();

    public abstract ScrollView getScrollView();

    public abstract MaterialToolbar getToolbar();

    public abstract BaseSheetViewModel<?> getViewModel();

    public void onBackPressed() {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        i.d(supportFragmentManager, "supportFragmentManager");
        if (supportFragmentManager.L() > 0) {
            super.onBackPressed();
        } else {
            getViewModel().onUserCancel();
        }
    }

    public void onCreate(Bundle bundle) {
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        i.d(supportFragmentManager, "supportFragmentManager");
        supportFragmentManager.v = new PaymentSheetFragmentFactory(getEventReporter());
        super.onCreate(bundle);
        if (Build.VERSION.SDK_INT != 26) {
            setRequestedOrientation(1);
        }
        FragmentManager supportFragmentManager2 = getSupportFragmentManager();
        BaseSheetActivity$onCreate$1 baseSheetActivity$onCreate$1 = new BaseSheetActivity$onCreate$1(this);
        if (supportFragmentManager2.l == null) {
            supportFragmentManager2.l = new ArrayList<>();
        }
        supportFragmentManager2.l.add(baseSheetActivity$onCreate$1);
        getScrollView().getViewTreeObserver().addOnScrollChangedListener(new BaseSheetActivity$onCreate$2(this));
        getBottomSheet().getLayoutTransition().enableTransitionType(4);
        getFragmentContainerParent().getLayoutTransition().enableTransitionType(4);
        getBottomSheetController().setup();
        getBottomSheetController().getShouldFinish$payments_core_release().observe(this, new BaseSheetActivity$onCreate$3(this));
        getViewModel().getProcessing().observe(this, new BaseSheetActivity$onCreate$4(this));
        getToolbar().setNavigationOnClickListener(new BaseSheetActivity$onCreate$5(this));
        FragmentManager supportFragmentManager3 = getSupportFragmentManager();
        i.d(supportFragmentManager3, "supportFragmentManager");
        updateToolbarButton(supportFragmentManager3.L() == 0);
        getBottomSheet().setClickable(true);
    }

    public abstract void setActivityResult(ResultType resulttype);
}
