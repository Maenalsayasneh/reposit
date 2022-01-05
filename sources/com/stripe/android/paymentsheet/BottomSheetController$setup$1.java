package com.stripe.android.paymentsheet;

import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"com/stripe/android/paymentsheet/BottomSheetController$setup$1", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior$c;", "Landroid/view/View;", "bottomSheet", "", "slideOffset", "Lm0/i;", "onSlide", "(Landroid/view/View;F)V", "", "newState", "onStateChanged", "(Landroid/view/View;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BottomSheetController.kt */
public final class BottomSheetController$setup$1 extends BottomSheetBehavior.c {
    public final /* synthetic */ BottomSheetController this$0;

    public BottomSheetController$setup$1(BottomSheetController bottomSheetController) {
        this.this$0 = bottomSheetController;
    }

    public void onSlide(View view, float f) {
        i.e(view, "bottomSheet");
    }

    public void onStateChanged(View view, int i) {
        i.e(view, "bottomSheet");
        if (i == 3) {
            this.this$0.bottomSheetBehavior.K(false);
        } else if (i == 5) {
            this.this$0._shouldFinish.setValue(Boolean.TRUE);
        }
    }
}
