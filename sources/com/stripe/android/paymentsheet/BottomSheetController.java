package com.stripe.android.paymentsheet;

import android.view.ViewGroup;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import g0.a.b.b.a;
import h0.q.y;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004R$\u0010\n\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000bR*\u0010\r\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\b0\b0\f8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0017"}, d2 = {"Lcom/stripe/android/paymentsheet/BottomSheetController;", "", "Lm0/i;", "setup", "()V", "expand", "hide", "Lh0/q/y;", "", "kotlin.jvm.PlatformType", "_shouldFinish", "Lh0/q/y;", "Landroidx/lifecycle/LiveData;", "shouldFinish", "Landroidx/lifecycle/LiveData;", "getShouldFinish$payments_core_release", "()Landroidx/lifecycle/LiveData;", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "Landroid/view/ViewGroup;", "bottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "<init>", "(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BottomSheetController.kt */
public final class BottomSheetController {
    /* access modifiers changed from: private */
    public final y<Boolean> _shouldFinish;
    /* access modifiers changed from: private */
    public final BottomSheetBehavior<ViewGroup> bottomSheetBehavior;
    private final LiveData<Boolean> shouldFinish;

    public BottomSheetController(BottomSheetBehavior<ViewGroup> bottomSheetBehavior2) {
        i.e(bottomSheetBehavior2, "bottomSheetBehavior");
        this.bottomSheetBehavior = bottomSheetBehavior2;
        y<Boolean> yVar = new y<>(Boolean.FALSE);
        this._shouldFinish = yVar;
        LiveData<Boolean> A = a.A(yVar);
        i.d(A, "Transformations.distinctUntilChanged(this)");
        this.shouldFinish = A;
    }

    public final void expand() {
        this.bottomSheetBehavior.N(3);
    }

    public final LiveData<Boolean> getShouldFinish$payments_core_release() {
        return this.shouldFinish;
    }

    public final void hide() {
        this.bottomSheetBehavior.N(5);
    }

    public final void setup() {
        this.bottomSheetBehavior.L(true);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior2 = this.bottomSheetBehavior;
        bottomSheetBehavior2.y = false;
        bottomSheetBehavior2.N(5);
        BottomSheetBehavior<ViewGroup> bottomSheetBehavior3 = this.bottomSheetBehavior;
        bottomSheetBehavior3.b = -1;
        BottomSheetController$setup$1 bottomSheetController$setup$1 = new BottomSheetController$setup$1(this);
        if (!bottomSheetBehavior3.J.contains(bottomSheetController$setup$1)) {
            bottomSheetBehavior3.J.add(bottomSheetController$setup$1);
        }
    }
}
