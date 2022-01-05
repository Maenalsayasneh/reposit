package com.stripe.android.stripe3ds2.views;

import android.view.View;
import android.view.inputmethod.InputMethodManager;
import h0.i.b.a;
import h0.o.a.k;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\n"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/KeyboardController;", "", "Lm0/i;", "hide", "()V", "Lh0/o/a/k;", "activity", "Lh0/o/a/k;", "<init>", "(Lh0/o/a/k;)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: KeyboardController.kt */
public final class KeyboardController {
    private final k activity;

    public KeyboardController(k kVar) {
        i.e(kVar, "activity");
        this.activity = kVar;
    }

    public final void hide() {
        InputMethodManager inputMethodManager = (InputMethodManager) a.getSystemService(this.activity, InputMethodManager.class);
        if (inputMethodManager != null && inputMethodManager.isAcceptingText()) {
            View currentFocus = this.activity.getCurrentFocus();
            inputMethodManager.hideSoftInputFromWindow(currentFocus != null ? currentFocus.getWindowToken() : null, 0);
        }
    }
}
