package com.stripe.android.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.databinding.AddPaymentMethodRowBinding;
import kotlin.Metadata;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0002\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u0003\u001a\u00020\u00028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\b\u001a\u00020\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodRowView;", "Landroid/widget/FrameLayout;", "Landroidx/appcompat/widget/AppCompatTextView;", "label", "Landroidx/appcompat/widget/AppCompatTextView;", "getLabel$payments_core_release", "()Landroidx/appcompat/widget/AppCompatTextView;", "Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;", "viewBinding", "Lcom/stripe/android/databinding/AddPaymentMethodRowBinding;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodRowView.kt */
public final class AddPaymentMethodRowView extends FrameLayout {
    private final AppCompatTextView label;
    private final AddPaymentMethodRowBinding viewBinding;

    private AddPaymentMethodRowView(Context context) {
        super(context);
        AddPaymentMethodRowBinding inflate = AddPaymentMethodRowBinding.inflate(LayoutInflater.from(context), this, true);
        i.d(inflate, "AddPaymentMethodRowBindi… this,\n        true\n    )");
        this.viewBinding = inflate;
        AppCompatTextView appCompatTextView = inflate.label;
        i.d(appCompatTextView, "viewBinding.label");
        this.label = appCompatTextView;
        setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
        setFocusable(true);
        setClickable(true);
    }

    public final AppCompatTextView getLabel$payments_core_release() {
        return this.label;
    }
}
