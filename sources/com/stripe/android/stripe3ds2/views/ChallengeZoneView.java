package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneViewBinding;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.j.o;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010I\u001a\u00020H\u0012\n\b\u0002\u0010K\u001a\u0004\u0018\u00010J\u0012\b\b\u0002\u0010L\u001a\u00020\u000b¢\u0006\u0004\bM\u0010NJ#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ#\u0010\n\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\n\u0010\bJ\u0017\u0010\r\u001a\u00020\u00062\b\b\u0001\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0012\u001a\u00020\u00062\b\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J#\u0010\u0019\u001a\u00020\u00062\b\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0019\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001a\u0010\u0017J/\u0010\u001c\u001a\u00020\u00062\b\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!R\u001c\u0010#\u001a\u00020\"8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001c\u0010\u001f\u001a\u00020'8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001f\u0010(\u001a\u0004\b)\u0010*R\u001c\u0010,\u001a\u00020+8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001c\u00100\u001a\u00020\"8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b0\u0010$\u001a\u0004\b1\u0010&R\u001c\u00103\u001a\u0002028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u0010:\u001a\u0002078@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u001c\u0010<\u001a\u00020;8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?R\u001c\u0010\u001b\u001a\u00020+8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u001b\u0010-\u001a\u0004\b@\u0010/R\u001c\u0010A\u001a\u0002028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bA\u00104\u001a\u0004\bB\u00106R\u001c\u0010D\u001a\u00020C8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G¨\u0006O"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneView;", "Landroid/widget/LinearLayout;", "", "headerText", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "labelCustomization", "Lm0/i;", "setInfoHeaderText", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V", "infoText", "setInfoText", "", "indicatorResId", "setInfoTextIndicator", "(I)V", "submitButtonLabel", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "buttonCustomization", "setSubmitButton", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V", "Landroid/view/View$OnClickListener;", "listener", "setSubmitButtonClickListener", "(Landroid/view/View$OnClickListener;)V", "resendButtonLabel", "setResendButtonLabel", "setResendButtonClickListener", "whitelistingLabel", "setWhitelistingLabel", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V", "Landroid/view/View;", "challengeEntryView", "setChallengeEntryView", "(Landroid/view/View;)V", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "submitButton", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "getSubmitButton$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2Button;", "Landroid/widget/FrameLayout;", "Landroid/widget/FrameLayout;", "getChallengeEntryView$3ds2sdk_release", "()Landroid/widget/FrameLayout;", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "infoTextView", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getInfoTextView$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "resendButton", "getResendButton$3ds2sdk_release", "Landroid/widget/RadioButton;", "whitelistYesRadioButton", "Landroid/widget/RadioButton;", "getWhitelistYesRadioButton$3ds2sdk_release", "()Landroid/widget/RadioButton;", "", "getWhitelistingSelection$3ds2sdk_release", "()Z", "whitelistingSelection", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "infoHeader", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "getInfoHeader$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "getWhitelistingLabel$3ds2sdk_release", "whitelistNoRadioButton", "getWhitelistNoRadioButton$3ds2sdk_release", "Landroid/widget/RadioGroup;", "whitelistRadioGroup", "Landroid/widget/RadioGroup;", "getWhitelistRadioGroup$3ds2sdk_release", "()Landroid/widget/RadioGroup;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeZoneView.kt */
public final class ChallengeZoneView extends LinearLayout {
    private final FrameLayout challengeEntryView;
    private final ThreeDS2HeaderTextView infoHeader;
    private final ThreeDS2TextView infoTextView;
    private final ThreeDS2Button resendButton;
    private final ThreeDS2Button submitButton;
    private final RadioButton whitelistNoRadioButton;
    private final RadioGroup whitelistRadioGroup;
    private final RadioButton whitelistYesRadioButton;
    private final ThreeDS2TextView whitelistingLabel;

    public ChallengeZoneView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public ChallengeZoneView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeZoneView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public static /* synthetic */ void setInfoHeaderText$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        challengeZoneView.setInfoHeaderText(str, labelCustomization);
    }

    public static /* synthetic */ void setInfoText$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        challengeZoneView.setInfoText(str, labelCustomization);
    }

    public static /* synthetic */ void setResendButtonLabel$default(ChallengeZoneView challengeZoneView, String str, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setResendButtonLabel(str, buttonCustomization);
    }

    public static /* synthetic */ void setSubmitButton$default(ChallengeZoneView challengeZoneView, String str, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setSubmitButton(str, buttonCustomization);
    }

    public static /* synthetic */ void setWhitelistingLabel$default(ChallengeZoneView challengeZoneView, String str, LabelCustomization labelCustomization, ButtonCustomization buttonCustomization, int i, Object obj) {
        if ((i & 2) != 0) {
            labelCustomization = null;
        }
        if ((i & 4) != 0) {
            buttonCustomization = null;
        }
        challengeZoneView.setWhitelistingLabel(str, labelCustomization, buttonCustomization);
    }

    public final FrameLayout getChallengeEntryView$3ds2sdk_release() {
        return this.challengeEntryView;
    }

    public final ThreeDS2HeaderTextView getInfoHeader$3ds2sdk_release() {
        return this.infoHeader;
    }

    public final ThreeDS2TextView getInfoTextView$3ds2sdk_release() {
        return this.infoTextView;
    }

    public final ThreeDS2Button getResendButton$3ds2sdk_release() {
        return this.resendButton;
    }

    public final ThreeDS2Button getSubmitButton$3ds2sdk_release() {
        return this.submitButton;
    }

    public final RadioButton getWhitelistNoRadioButton$3ds2sdk_release() {
        return this.whitelistNoRadioButton;
    }

    public final RadioGroup getWhitelistRadioGroup$3ds2sdk_release() {
        return this.whitelistRadioGroup;
    }

    public final RadioButton getWhitelistYesRadioButton$3ds2sdk_release() {
        return this.whitelistYesRadioButton;
    }

    public final ThreeDS2TextView getWhitelistingLabel$3ds2sdk_release() {
        return this.whitelistingLabel;
    }

    public final boolean getWhitelistingSelection$3ds2sdk_release() {
        return this.whitelistRadioGroup.getCheckedRadioButtonId() == R.id.czv_whitelist_yes_button;
    }

    public final void setChallengeEntryView(View view) {
        i.e(view, "challengeEntryView");
        this.challengeEntryView.addView(view);
    }

    public final void setInfoHeaderText(String str, LabelCustomization labelCustomization) {
        if (str == null || StringsKt__IndentKt.o(str)) {
            this.infoHeader.setVisibility(8);
        } else {
            this.infoHeader.setText(str, labelCustomization);
        }
    }

    public final void setInfoText(String str, LabelCustomization labelCustomization) {
        if (str == null || StringsKt__IndentKt.o(str)) {
            this.infoTextView.setVisibility(8);
        } else {
            this.infoTextView.setText(str, labelCustomization);
        }
    }

    public final void setInfoTextIndicator(int i) {
        this.infoTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(i, 0, 0, 0);
    }

    public final void setResendButtonClickListener(View.OnClickListener onClickListener) {
        this.resendButton.setOnClickListener(onClickListener);
    }

    public final void setResendButtonLabel(String str, ButtonCustomization buttonCustomization) {
        if (!(str == null || StringsKt__IndentKt.o(str))) {
            this.resendButton.setVisibility(0);
            this.resendButton.setText(str);
            this.resendButton.setButtonCustomization(buttonCustomization);
        }
    }

    public final void setSubmitButton(String str, ButtonCustomization buttonCustomization) {
        if (str == null || StringsKt__IndentKt.o(str)) {
            this.submitButton.setVisibility(8);
            return;
        }
        this.submitButton.setText(str);
        this.submitButton.setButtonCustomization(buttonCustomization);
    }

    public final void setSubmitButtonClickListener(View.OnClickListener onClickListener) {
        this.submitButton.setOnClickListener(onClickListener);
    }

    public final void setWhitelistingLabel(String str, LabelCustomization labelCustomization, ButtonCustomization buttonCustomization) {
        if (!(str == null || StringsKt__IndentKt.o(str))) {
            this.whitelistingLabel.setText(str, labelCustomization);
            if (buttonCustomization != null) {
                e f = m0.q.i.f(0, this.whitelistRadioGroup.getChildCount());
                ArrayList<RadioButton> arrayList = new ArrayList<>();
                Iterator it = f.iterator();
                while (it.hasNext()) {
                    View childAt = this.whitelistRadioGroup.getChildAt(((o) it).a());
                    if (!(childAt instanceof RadioButton)) {
                        childAt = null;
                    }
                    RadioButton radioButton = (RadioButton) childAt;
                    if (radioButton != null) {
                        arrayList.add(radioButton);
                    }
                }
                for (RadioButton radioButton2 : arrayList) {
                    String backgroundColor = buttonCustomization.getBackgroundColor();
                    if (!(backgroundColor == null || StringsKt__IndentKt.o(backgroundColor))) {
                        radioButton2.setButtonTintList(ColorStateList.valueOf(Color.parseColor(buttonCustomization.getBackgroundColor())));
                    }
                    String textColor = buttonCustomization.getTextColor();
                    if (!(textColor == null || StringsKt__IndentKt.o(textColor))) {
                        radioButton2.setTextColor(Color.parseColor(buttonCustomization.getTextColor()));
                    }
                }
            }
            this.whitelistingLabel.setVisibility(0);
            this.whitelistRadioGroup.setVisibility(0);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeZoneView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        StripeChallengeZoneViewBinding inflate = StripeChallengeZoneViewBinding.inflate(LayoutInflater.from(context), this);
        i.d(inflate, "StripeChallengeZoneViewB…           this\n        )");
        ThreeDS2HeaderTextView threeDS2HeaderTextView = inflate.czvHeader;
        i.d(threeDS2HeaderTextView, "viewBinding.czvHeader");
        this.infoHeader = threeDS2HeaderTextView;
        ThreeDS2TextView threeDS2TextView = inflate.czvInfo;
        i.d(threeDS2TextView, "viewBinding.czvInfo");
        this.infoTextView = threeDS2TextView;
        ThreeDS2Button threeDS2Button = inflate.czvSubmitButton;
        i.d(threeDS2Button, "viewBinding.czvSubmitButton");
        this.submitButton = threeDS2Button;
        ThreeDS2Button threeDS2Button2 = inflate.czvResendButton;
        i.d(threeDS2Button2, "viewBinding.czvResendButton");
        this.resendButton = threeDS2Button2;
        ThreeDS2TextView threeDS2TextView2 = inflate.czvWhitelistingLabel;
        i.d(threeDS2TextView2, "viewBinding.czvWhitelistingLabel");
        this.whitelistingLabel = threeDS2TextView2;
        RadioGroup radioGroup = inflate.czvWhitelistRadioGroup;
        i.d(radioGroup, "viewBinding.czvWhitelistRadioGroup");
        this.whitelistRadioGroup = radioGroup;
        FrameLayout frameLayout = inflate.czvEntryView;
        i.d(frameLayout, "viewBinding.czvEntryView");
        this.challengeEntryView = frameLayout;
        RadioButton radioButton = inflate.czvWhitelistYesButton;
        i.d(radioButton, "viewBinding.czvWhitelistYesButton");
        this.whitelistYesRadioButton = radioButton;
        RadioButton radioButton2 = inflate.czvWhitelistNoButton;
        i.d(radioButton2, "viewBinding.czvWhitelistNoButton");
        this.whitelistNoRadioButton = radioButton2;
    }
}
