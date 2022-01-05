package com.stripe.android.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.R;
import com.google.android.material.snackbar.Snackbar;
import com.google.android.material.snackbar.SnackbarContentLayout;
import h0.q.z;
import i0.h.a.c.x.o;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "snackbarText", "Lm0/i;", "onChanged", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 4, 2})
/* compiled from: PaymentMethodsActivity.kt */
public final class PaymentMethodsActivity$onCreate$2<T> implements z<String> {
    public final /* synthetic */ PaymentMethodsActivity this$0;

    public PaymentMethodsActivity$onCreate$2(PaymentMethodsActivity paymentMethodsActivity) {
        this.this$0 = paymentMethodsActivity;
    }

    public final void onChanged(String str) {
        ViewGroup viewGroup;
        if (str != null) {
            View view = this.this$0.getViewBinding$payments_core_release().coordinator;
            int[] iArr = Snackbar.r;
            ViewGroup viewGroup2 = null;
            while (true) {
                if (!(view instanceof CoordinatorLayout)) {
                    if (view instanceof FrameLayout) {
                        if (view.getId() == 16908290) {
                            viewGroup = (ViewGroup) view;
                            break;
                        }
                        viewGroup2 = (ViewGroup) view;
                    }
                    if (view != null) {
                        ViewParent parent = view.getParent();
                        if (parent instanceof View) {
                            view = (View) parent;
                            continue;
                        } else {
                            view = null;
                            continue;
                        }
                    }
                    if (view == null) {
                        viewGroup = viewGroup2;
                        break;
                    }
                } else {
                    viewGroup = (ViewGroup) view;
                    break;
                }
            }
            if (viewGroup != null) {
                Context context = viewGroup.getContext();
                LayoutInflater from = LayoutInflater.from(context);
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Snackbar.r);
                int resourceId = obtainStyledAttributes.getResourceId(0, -1);
                boolean z = true;
                int resourceId2 = obtainStyledAttributes.getResourceId(1, -1);
                obtainStyledAttributes.recycle();
                if (resourceId == -1 || resourceId2 == -1) {
                    z = false;
                }
                SnackbarContentLayout snackbarContentLayout = (SnackbarContentLayout) from.inflate(z ? R.layout.mtrl_layout_snackbar_include : R.layout.design_layout_snackbar_include, viewGroup, false);
                Snackbar snackbar = new Snackbar(context, viewGroup, snackbarContentLayout, snackbarContentLayout);
                ((SnackbarContentLayout) snackbar.f.getChildAt(0)).getMessageView().setText(str);
                snackbar.h = -1;
                o b = o.b();
                int i = snackbar.i();
                o.b bVar = snackbar.q;
                synchronized (b.b) {
                    if (b.c(bVar)) {
                        o.c cVar = b.d;
                        cVar.b = i;
                        b.c.removeCallbacksAndMessages(cVar);
                        b.g(b.d);
                        return;
                    }
                    if (b.d(bVar)) {
                        b.e.b = i;
                    } else {
                        b.e = new o.c(i, bVar);
                    }
                    o.c cVar2 = b.d;
                    if (cVar2 == null || !b.a(cVar2, 4)) {
                        b.d = null;
                        b.h();
                        return;
                    }
                    return;
                }
            }
            throw new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        }
    }
}
