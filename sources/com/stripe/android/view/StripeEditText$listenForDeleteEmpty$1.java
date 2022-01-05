package com.stripe.android.view;

import android.view.KeyEvent;
import android.view.View;
import com.stripe.android.view.StripeEditText;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\n\u001a\u00020\u00072\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0010\u0006\u001a\n \u0001*\u0004\u0018\u00010\u00050\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Landroid/view/View;", "kotlin.jvm.PlatformType", "<anonymous parameter 0>", "", "keyCode", "Landroid/view/KeyEvent;", "event", "", "onKey", "(Landroid/view/View;ILandroid/view/KeyEvent;)Z", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: StripeEditText.kt */
public final class StripeEditText$listenForDeleteEmpty$1 implements View.OnKeyListener {
    public final /* synthetic */ StripeEditText this$0;

    public StripeEditText$listenForDeleteEmpty$1(StripeEditText stripeEditText) {
        this.this$0 = stripeEditText;
    }

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        StripeEditText.DeleteEmptyListener access$getDeleteEmptyListener$p;
        StripeEditText stripeEditText = this.this$0;
        i.d(keyEvent, "event");
        stripeEditText.setLastKeyDelete(stripeEditText.isDeleteKey(i, keyEvent));
        if (!this.this$0.isLastKeyDelete() || this.this$0.length() != 0 || (access$getDeleteEmptyListener$p = this.this$0.deleteEmptyListener) == null) {
            return false;
        }
        access$getDeleteEmptyListener$p.onDeleteEmpty();
        return false;
    }
}
