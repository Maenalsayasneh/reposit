package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.FrameLayout;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.R;
import h0.i.i.x;
import i0.d.a.a.a;
import java.util.NoSuchElementException;
import java.util.Objects;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;
import m0.o.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R+\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b8@@@X\u0002¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0019"}, d2 = {"Lcom/stripe/android/view/CardNumberTextInputLayout;", "Lcom/google/android/material/textfield/TextInputLayout;", "Lm0/i;", "attachProgressView", "()V", "Lcom/stripe/android/view/CardWidgetProgressView;", "progressView", "Lcom/stripe/android/view/CardWidgetProgressView;", "", "<set-?>", "isLoading$delegate", "Lm0/o/d;", "isLoading$payments_core_release", "()Z", "setLoading$payments_core_release", "(Z)V", "isLoading", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardNumberTextInputLayout.kt */
public final class CardNumberTextInputLayout extends TextInputLayout {
    public static final /* synthetic */ k[] $$delegatedProperties = {a.o1(CardNumberTextInputLayout.class, "isLoading", "isLoading$payments_core_release()Z", 0)};
    private final d isLoading$delegate;
    /* access modifiers changed from: private */
    public final CardWidgetProgressView progressView;

    public CardNumberTextInputLayout(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.textInputStyle : i);
    }

    /* access modifiers changed from: private */
    public final void attachProgressView() {
        ViewParent parent = this.progressView.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        if (viewGroup != null) {
            viewGroup.removeView(this.progressView);
        }
        i.e(this, "$this$children");
        i.e(this, "$this$iterator");
        x xVar = new x(this);
        if (xVar.hasNext()) {
            FrameLayout frameLayout = (FrameLayout) xVar.next();
            frameLayout.addView(this.progressView);
            CardWidgetProgressView cardWidgetProgressView = this.progressView;
            ViewGroup.LayoutParams layoutParams = cardWidgetProgressView.getLayoutParams();
            Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
            layoutParams2.setMarginStart(frameLayout.getWidth() - getResources().getDimensionPixelSize(R.dimen.stripe_card_number_text_input_layout_progress_end_margin));
            layoutParams2.topMargin = getResources().getDimensionPixelSize(R.dimen.stripe_card_number_text_input_layout_progress_top_margin);
            cardWidgetProgressView.setLayoutParams(layoutParams2);
            return;
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    public final boolean isLoading$payments_core_release() {
        return ((Boolean) this.isLoading$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final void setLoading$payments_core_release(boolean z) {
        this.isLoading$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardNumberTextInputLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        this.progressView = new CardWidgetProgressView(context, attributeSet, i);
        Boolean bool = Boolean.FALSE;
        this.isLoading$delegate = new CardNumberTextInputLayout$$special$$inlined$observable$1(bool, bool, this);
        addOnLayoutChangeListener(new CardNumberTextInputLayout$$special$$inlined$doOnNextLayout$1(this));
        setPlaceholderText(getResources().getString(R.string.card_number_hint));
    }
}
