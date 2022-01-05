package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import com.stripe.android.R;
import com.stripe.android.databinding.CardWidgetProgressViewBinding;
import kotlin.Metadata;
import kotlin.TypeCastException;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0004R\u001e\u0010\t\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001e\u0010\u000b\u001a\n \b*\u0004\u0018\u00010\u00070\u00078\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/view/CardWidgetProgressView;", "Landroid/widget/FrameLayout;", "Lm0/i;", "onAttachedToWindow", "()V", "show", "hide", "Landroid/view/animation/Animation;", "kotlin.jvm.PlatformType", "fadeIn", "Landroid/view/animation/Animation;", "fadeOut", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardWidgetProgressView.kt */
public final class CardWidgetProgressView extends FrameLayout {
    private final Animation fadeIn;
    private final Animation fadeOut;

    public CardWidgetProgressView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public CardWidgetProgressView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardWidgetProgressView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final void hide() {
        startAnimation(this.fadeOut);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Context context = getContext();
        i.d(context, "context");
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.stripe_card_widget_progress_size);
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams != null) {
            layoutParams.width = dimensionPixelSize;
            layoutParams.height = dimensionPixelSize;
            setLayoutParams(layoutParams);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
    }

    public final void show() {
        startAnimation(this.fadeIn);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardWidgetProgressView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        Animation loadAnimation = AnimationUtils.loadAnimation(context, R.anim.stripe_card_widget_progress_fade_in);
        loadAnimation.setAnimationListener(new CardWidgetProgressView$$special$$inlined$also$lambda$1(this));
        this.fadeIn = loadAnimation;
        Animation loadAnimation2 = AnimationUtils.loadAnimation(context, R.anim.stripe_card_widget_progress_fade_out);
        loadAnimation2.setAnimationListener(new CardWidgetProgressView$$special$$inlined$also$lambda$2(this));
        this.fadeOut = loadAnimation2;
        CardWidgetProgressViewBinding.inflate(LayoutInflater.from(context), this);
        setBackgroundResource(R.drawable.stripe_card_progress_background);
        setClipToOutline(true);
        setVisibility(4);
    }
}
