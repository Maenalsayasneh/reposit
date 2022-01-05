package com.stripe.android.stripe3ds2.views;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import com.instabug.library.settings.SettingsManager;
import com.stripe.android.stripe3ds2.databinding.StripeInformationZoneViewBinding;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010D\u001a\u00020C\u0012\n\b\u0002\u0010F\u001a\u0004\u0018\u00010E\u0012\b\b\u0002\u0010G\u001a\u00020(¢\u0006\u0004\bH\u0010IJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u000f\u001a\u00020\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0013\u001a\u00020\u00072\b\u0010\u0011\u001a\u0004\u0018\u00010\n2\b\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u0013\u0010\u0010J\r\u0010\u0014\u001a\u00020\u0007¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0017\u001a\u00020\u00168\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u0012\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u0019\u0010\u001aR\"\u0010\u001d\u001a\u00020\u001c8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u0012\u0004\b!\u0010\u0015\u001a\u0004\b\u001f\u0010 R\"\u0010#\u001a\u00020\"8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b#\u0010$\u0012\u0004\b'\u0010\u0015\u001a\u0004\b%\u0010&R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\"\u0010+\u001a\u00020\u001c8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b+\u0010\u001e\u0012\u0004\b-\u0010\u0015\u001a\u0004\b,\u0010 R\"\u0010.\u001a\u00020\u00168\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b.\u0010\u0018\u0012\u0004\b0\u0010\u0015\u001a\u0004\b/\u0010\u001aR\"\u00101\u001a\u00020(8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b1\u0010*\u001a\u0004\b2\u00103\"\u0004\b4\u00105R\u0016\u00107\u001a\u0002068\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\"\u00109\u001a\u00020\u001c8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b9\u0010\u001e\u0012\u0004\b;\u0010\u0015\u001a\u0004\b:\u0010 R\"\u0010<\u001a\u00020\u001c8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b<\u0010\u001e\u0012\u0004\b>\u0010\u0015\u001a\u0004\b=\u0010 R\"\u0010?\u001a\u00020\"8\u0000@\u0001X\u0004¢\u0006\u0012\n\u0004\b?\u0010$\u0012\u0004\bA\u0010\u0015\u001a\u0004\b@\u0010&R\u0016\u0010B\u001a\u00020(8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bB\u0010*¨\u0006J"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/InformationZoneView;", "Landroid/widget/FrameLayout;", "Landroid/view/View;", "arrow", "Landroid/widget/TextView;", "label", "detailsView", "Lm0/i;", "toggleView", "(Landroid/view/View;Landroid/widget/TextView;Landroid/view/View;)V", "", "whyInfoLabel", "whyInfoText", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "labelCustomization", "setWhyInfo", "(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V", "expandInfoLabel", "expandInfoText", "setExpandInfo", "expandViews", "()V", "Landroidx/appcompat/widget/AppCompatImageView;", "whyArrow", "Landroidx/appcompat/widget/AppCompatImageView;", "getWhyArrow$3ds2sdk_release", "()Landroidx/appcompat/widget/AppCompatImageView;", "getWhyArrow$3ds2sdk_release$annotations", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "whyLabel", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getWhyLabel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getWhyLabel$3ds2sdk_release$annotations", "Landroid/widget/LinearLayout;", "whyContainer", "Landroid/widget/LinearLayout;", "getWhyContainer$3ds2sdk_release", "()Landroid/widget/LinearLayout;", "getWhyContainer$3ds2sdk_release$annotations", "", "animationDuration", "I", "expandText", "getExpandText$3ds2sdk_release", "getExpandText$3ds2sdk_release$annotations", "expandArrow", "getExpandArrow$3ds2sdk_release", "getExpandArrow$3ds2sdk_release$annotations", "toggleColor", "getToggleColor$3ds2sdk_release", "()I", "setToggleColor$3ds2sdk_release", "(I)V", "Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;", "viewBinding", "Lcom/stripe/android/stripe3ds2/databinding/StripeInformationZoneViewBinding;", "whyText", "getWhyText$3ds2sdk_release", "getWhyText$3ds2sdk_release$annotations", "expandLabel", "getExpandLabel$3ds2sdk_release", "getExpandLabel$3ds2sdk_release$annotations", "expandContainer", "getExpandContainer$3ds2sdk_release", "getExpandContainer$3ds2sdk_release$annotations", "defaultColor", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: InformationZoneView.kt */
public final class InformationZoneView extends FrameLayout {
    private final int animationDuration;
    private int defaultColor;
    private final AppCompatImageView expandArrow;
    private final LinearLayout expandContainer;
    private final ThreeDS2TextView expandLabel;
    private final ThreeDS2TextView expandText;
    private int toggleColor;
    private final StripeInformationZoneViewBinding viewBinding;
    private final AppCompatImageView whyArrow;
    private final LinearLayout whyContainer;
    private final ThreeDS2TextView whyLabel;
    private final ThreeDS2TextView whyText;

    public InformationZoneView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public InformationZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ InformationZoneView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void getExpandArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getExpandText$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyArrow$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyContainer$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyLabel$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void getWhyText$3ds2sdk_release$annotations() {
    }

    public static /* synthetic */ void setExpandInfo$default(InformationZoneView informationZoneView, String str, String str2, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 4) != 0) {
            labelCustomization = null;
        }
        informationZoneView.setExpandInfo(str, str2, labelCustomization);
    }

    public static /* synthetic */ void setWhyInfo$default(InformationZoneView informationZoneView, String str, String str2, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 4) != 0) {
            labelCustomization = null;
        }
        informationZoneView.setWhyInfo(str, str2, labelCustomization);
    }

    /* access modifiers changed from: private */
    public final void toggleView(View view, TextView textView, View view2) {
        int i = 8;
        boolean z = view2.getVisibility() == 8;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "rotation", new float[]{(float) (z ? SettingsManager.MAX_ASR_DURATION_IN_SECONDS : 0)});
        i.d(ofFloat, "arrowAnimator");
        ofFloat.setDuration((long) this.animationDuration);
        ofFloat.start();
        textView.setEnabled(z);
        view.setEnabled(z);
        if (this.toggleColor != 0) {
            if (this.defaultColor == 0) {
                ColorStateList textColors = textView.getTextColors();
                i.d(textColors, "label.textColors");
                this.defaultColor = textColors.getDefaultColor();
            }
            textView.setTextColor(z ? this.toggleColor : this.defaultColor);
        }
        if (z) {
            i = 0;
        }
        view2.setVisibility(i);
        if (z) {
            view2.postDelayed(new InformationZoneView$toggleView$1(view2), (long) this.animationDuration);
        }
    }

    public final void expandViews() {
        this.expandArrow.setRotation(180.0f);
        this.whyArrow.setRotation(180.0f);
        this.expandText.setVisibility(0);
        this.whyText.setVisibility(0);
    }

    public final AppCompatImageView getExpandArrow$3ds2sdk_release() {
        return this.expandArrow;
    }

    public final LinearLayout getExpandContainer$3ds2sdk_release() {
        return this.expandContainer;
    }

    public final ThreeDS2TextView getExpandLabel$3ds2sdk_release() {
        return this.expandLabel;
    }

    public final ThreeDS2TextView getExpandText$3ds2sdk_release() {
        return this.expandText;
    }

    public final int getToggleColor$3ds2sdk_release() {
        return this.toggleColor;
    }

    public final AppCompatImageView getWhyArrow$3ds2sdk_release() {
        return this.whyArrow;
    }

    public final LinearLayout getWhyContainer$3ds2sdk_release() {
        return this.whyContainer;
    }

    public final ThreeDS2TextView getWhyLabel$3ds2sdk_release() {
        return this.whyLabel;
    }

    public final ThreeDS2TextView getWhyText$3ds2sdk_release() {
        return this.whyText;
    }

    public final void setExpandInfo(String str, String str2, LabelCustomization labelCustomization) {
        if (!(str == null || StringsKt__IndentKt.o(str))) {
            this.expandLabel.setText(str, labelCustomization);
            this.expandContainer.setVisibility(0);
            this.expandText.setText(str2, labelCustomization);
        }
    }

    public final void setToggleColor$3ds2sdk_release(int i) {
        this.toggleColor = i;
    }

    public final void setWhyInfo(String str, String str2, LabelCustomization labelCustomization) {
        if (!(str == null || StringsKt__IndentKt.o(str))) {
            this.whyLabel.setText(str, labelCustomization);
            this.whyContainer.setVisibility(0);
            this.whyText.setText(str2, labelCustomization);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InformationZoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        StripeInformationZoneViewBinding inflate = StripeInformationZoneViewBinding.inflate(LayoutInflater.from(context), this, true);
        i.d(inflate, "StripeInformationZoneVie… this,\n        true\n    )");
        this.viewBinding = inflate;
        ThreeDS2TextView threeDS2TextView = inflate.whyLabel;
        i.d(threeDS2TextView, "viewBinding.whyLabel");
        this.whyLabel = threeDS2TextView;
        ThreeDS2TextView threeDS2TextView2 = inflate.whyText;
        i.d(threeDS2TextView2, "viewBinding.whyText");
        this.whyText = threeDS2TextView2;
        LinearLayout linearLayout = inflate.whyContainer;
        i.d(linearLayout, "viewBinding.whyContainer");
        this.whyContainer = linearLayout;
        AppCompatImageView appCompatImageView = inflate.whyArrow;
        i.d(appCompatImageView, "viewBinding.whyArrow");
        this.whyArrow = appCompatImageView;
        ThreeDS2TextView threeDS2TextView3 = inflate.expandLabel;
        i.d(threeDS2TextView3, "viewBinding.expandLabel");
        this.expandLabel = threeDS2TextView3;
        ThreeDS2TextView threeDS2TextView4 = inflate.expandText;
        i.d(threeDS2TextView4, "viewBinding.expandText");
        this.expandText = threeDS2TextView4;
        LinearLayout linearLayout2 = inflate.expandContainer;
        i.d(linearLayout2, "viewBinding.expandContainer");
        this.expandContainer = linearLayout2;
        AppCompatImageView appCompatImageView2 = inflate.expandArrow;
        i.d(appCompatImageView2, "viewBinding.expandArrow");
        this.expandArrow = appCompatImageView2;
        this.animationDuration = getResources().getInteger(17694720);
        linearLayout.setOnClickListener(new View.OnClickListener(this) {
            public final /* synthetic */ InformationZoneView this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                InformationZoneView informationZoneView = this.this$0;
                informationZoneView.toggleView(informationZoneView.getWhyArrow$3ds2sdk_release(), this.this$0.getWhyLabel$3ds2sdk_release(), this.this$0.getWhyText$3ds2sdk_release());
            }
        });
        linearLayout2.setOnClickListener(new View.OnClickListener(this) {
            public final /* synthetic */ InformationZoneView this$0;

            {
                this.this$0 = r1;
            }

            public final void onClick(View view) {
                InformationZoneView informationZoneView = this.this$0;
                informationZoneView.toggleView(informationZoneView.getExpandArrow$3ds2sdk_release(), this.this$0.getExpandLabel$3ds2sdk_release(), this.this$0.getExpandText$3ds2sdk_release());
            }
        });
    }
}
