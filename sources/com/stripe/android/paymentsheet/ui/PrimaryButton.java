package com.stripe.android.paymentsheet.ui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.stripe.android.R;
import com.stripe.android.databinding.PrimaryButtonBinding;
import i0.j.f.p.h;
import kotlin.Metadata;
import m0.i;
import m0.j.g;
import m0.n.a.a;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u00016B'\b\u0007\u0012\u0006\u00101\u001a\u000200\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u00103\u001a\u000202¢\u0006\u0004\b4\u00105J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\tJ\u001d\u0010\r\u001a\u00020\u00072\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\tJ\u0019\u0010\u0012\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00072\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\u00020 8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010&\u001a\u00020%8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u0018\u0010,\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010.\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b.\u0010/¨\u00067"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton;", "Landroid/widget/FrameLayout;", "Landroid/util/AttributeSet;", "attrs", "", "getTextAttributeValue", "(Landroid/util/AttributeSet;)Ljava/lang/CharSequence;", "Lm0/i;", "onReadyState", "()V", "onStartProcessing", "Lkotlin/Function0;", "onAnimationEnd", "onFinishProcessing", "(Lm0/n/a/a;)V", "updateAlpha", "Landroid/content/res/ColorStateList;", "tintList", "setBackgroundTintList", "(Landroid/content/res/ColorStateList;)V", "", "text", "setLabel", "(Ljava/lang/String;)V", "", "enabled", "setEnabled", "(Z)V", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "state", "updateState", "(Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;)V", "Lcom/stripe/android/databinding/PrimaryButtonBinding;", "viewBinding", "Lcom/stripe/android/databinding/PrimaryButtonBinding;", "getViewBinding$payments_core_release", "()Lcom/stripe/android/databinding/PrimaryButtonBinding;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;", "animator", "Lcom/stripe/android/paymentsheet/ui/PrimaryButtonAnimator;", "Landroid/widget/ImageView;", "confirmedIcon", "Landroid/widget/ImageView;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "defaultTintList", "Landroid/content/res/ColorStateList;", "externalLabel", "Ljava/lang/String;", "Landroid/content/Context;", "context", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "State", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PrimaryButton.kt */
public final class PrimaryButton extends FrameLayout {
    private final PrimaryButtonAnimator animator;
    private final ImageView confirmedIcon;
    private ColorStateList defaultTintList;
    private String externalLabel;
    private State state;
    private final PrimaryButtonBinding viewBinding;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "", "<init>", "()V", "FinishProcessing", "Ready", "StartProcessing", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PrimaryButton.kt */
    public static abstract class State {

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J \u0010\u0007\u001a\u00020\u00002\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006@\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0015\u0010\u0005¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "Lkotlin/Function0;", "Lm0/i;", "component1", "()Lm0/n/a/a;", "onComplete", "copy", "(Lm0/n/a/a;)Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$FinishProcessing;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lm0/n/a/a;", "getOnComplete", "<init>", "(Lm0/n/a/a;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PrimaryButton.kt */
        public static final class FinishProcessing extends State {
            private final a<i> onComplete;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public FinishProcessing(a<i> aVar) {
                super((f) null);
                m0.n.b.i.e(aVar, "onComplete");
                this.onComplete = aVar;
            }

            public static /* synthetic */ FinishProcessing copy$default(FinishProcessing finishProcessing, a<i> aVar, int i, Object obj) {
                if ((i & 1) != 0) {
                    aVar = finishProcessing.onComplete;
                }
                return finishProcessing.copy(aVar);
            }

            public final a<i> component1() {
                return this.onComplete;
            }

            public final FinishProcessing copy(a<i> aVar) {
                m0.n.b.i.e(aVar, "onComplete");
                return new FinishProcessing(aVar);
            }

            public boolean equals(Object obj) {
                if (this != obj) {
                    return (obj instanceof FinishProcessing) && m0.n.b.i.a(this.onComplete, ((FinishProcessing) obj).onComplete);
                }
                return true;
            }

            public final a<i> getOnComplete() {
                return this.onComplete;
            }

            public int hashCode() {
                a<i> aVar = this.onComplete;
                if (aVar != null) {
                    return aVar.hashCode();
                }
                return 0;
            }

            public String toString() {
                StringBuilder P0 = i0.d.a.a.a.P0("FinishProcessing(onComplete=");
                P0.append(this.onComplete);
                P0.append(")");
                return P0.toString();
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$Ready;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PrimaryButton.kt */
        public static final class Ready extends State {
            public static final Ready INSTANCE = new Ready();

            private Ready() {
                super((f) null);
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State$StartProcessing;", "Lcom/stripe/android/paymentsheet/ui/PrimaryButton$State;", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PrimaryButton.kt */
        public static final class StartProcessing extends State {
            public static final StartProcessing INSTANCE = new StartProcessing();

            private StartProcessing() {
                super((f) null);
            }
        }

        private State() {
        }

        public /* synthetic */ State(f fVar) {
            this();
        }
    }

    public PrimaryButton(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public PrimaryButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ PrimaryButton(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    private final CharSequence getTextAttributeValue(AttributeSet attributeSet) {
        Context context = getContext();
        m0.n.b.i.d(context, "context");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, g.u0(h.L2(16843087)), 0, 0);
        CharSequence text = obtainStyledAttributes.getText(0);
        obtainStyledAttributes.recycle();
        return text;
    }

    private final void onFinishProcessing(a<i> aVar) {
        super.setBackgroundTintList((ColorStateList) null);
        setBackgroundResource(R.drawable.stripe_paymentsheet_primary_button_confirmed_background);
        PrimaryButtonAnimator primaryButtonAnimator = this.animator;
        TextView textView = this.viewBinding.label;
        m0.n.b.i.d(textView, "viewBinding.label");
        primaryButtonAnimator.fadeOut$payments_core_release(textView);
        PrimaryButtonAnimator primaryButtonAnimator2 = this.animator;
        CircularProgressIndicator circularProgressIndicator = this.viewBinding.confirmingIcon;
        m0.n.b.i.d(circularProgressIndicator, "viewBinding.confirmingIcon");
        primaryButtonAnimator2.fadeOut$payments_core_release(circularProgressIndicator);
        this.animator.fadeIn$payments_core_release(this.confirmedIcon, getWidth(), new PrimaryButton$onFinishProcessing$1(aVar));
    }

    private final void onReadyState() {
        String str = this.externalLabel;
        if (str != null) {
            TextView textView = this.viewBinding.label;
            m0.n.b.i.d(textView, "viewBinding.label");
            textView.setText(str);
        }
        ColorStateList colorStateList = this.defaultTintList;
        if (colorStateList != null) {
            setBackgroundTintList(colorStateList);
        }
        CircularProgressIndicator circularProgressIndicator = this.viewBinding.confirmingIcon;
        m0.n.b.i.d(circularProgressIndicator, "viewBinding.confirmingIcon");
        circularProgressIndicator.setVisibility(8);
    }

    private final void onStartProcessing() {
        ImageView imageView = this.viewBinding.lockIcon;
        m0.n.b.i.d(imageView, "viewBinding.lockIcon");
        imageView.setVisibility(8);
        CircularProgressIndicator circularProgressIndicator = this.viewBinding.confirmingIcon;
        m0.n.b.i.d(circularProgressIndicator, "viewBinding.confirmingIcon");
        circularProgressIndicator.setVisibility(0);
        TextView textView = this.viewBinding.label;
        m0.n.b.i.d(textView, "viewBinding.label");
        textView.setText(getResources().getString(R.string.stripe_paymentsheet_primary_button_processing));
    }

    private final void updateAlpha() {
        TextView textView = this.viewBinding.label;
        m0.n.b.i.d(textView, "viewBinding.label");
        State state2 = this.state;
        textView.setAlpha(((state2 == null || (state2 instanceof State.Ready)) && !isEnabled()) ? 0.5f : 1.0f);
    }

    public final PrimaryButtonBinding getViewBinding$payments_core_release() {
        return this.viewBinding;
    }

    public void setBackgroundTintList(ColorStateList colorStateList) {
        super.setBackgroundTintList(colorStateList);
        this.defaultTintList = colorStateList;
    }

    public void setEnabled(boolean z) {
        super.setEnabled(z);
        ImageView imageView = this.viewBinding.lockIcon;
        m0.n.b.i.d(imageView, "viewBinding.lockIcon");
        imageView.setVisibility(z ? 0 : 8);
        updateAlpha();
    }

    public final void setLabel(String str) {
        this.externalLabel = str;
        if (str != null) {
            TextView textView = this.viewBinding.label;
            m0.n.b.i.d(textView, "viewBinding.label");
            textView.setText(str);
        }
    }

    public final void updateState(State state2) {
        this.state = state2;
        updateAlpha();
        if (state2 instanceof State.Ready) {
            onReadyState();
        } else if (m0.n.b.i.a(state2, State.StartProcessing.INSTANCE)) {
            onStartProcessing();
        } else if (state2 instanceof State.FinishProcessing) {
            onFinishProcessing(((State.FinishProcessing) state2).getOnComplete());
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PrimaryButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m0.n.b.i.e(context, "context");
        this.animator = new PrimaryButtonAnimator(context);
        PrimaryButtonBinding inflate = PrimaryButtonBinding.inflate(LayoutInflater.from(context), this);
        m0.n.b.i.d(inflate, "PrimaryButtonBinding.inf…text),\n        this\n    )");
        this.viewBinding = inflate;
        ImageView imageView = inflate.confirmedIcon;
        m0.n.b.i.d(imageView, "viewBinding.confirmedIcon");
        this.confirmedIcon = imageView;
        setBackgroundResource(R.drawable.stripe_paymentsheet_primary_button_default_background);
        TextView textView = inflate.label;
        m0.n.b.i.d(textView, "viewBinding.label");
        textView.setText(getTextAttributeValue(attributeSet));
        setClickable(true);
        setEnabled(false);
    }
}
