package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.text.Editable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import androidx.core.app.NotificationCompat;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneTextViewBinding;
import com.stripe.android.stripe3ds2.init.ui.TextBoxCustomization;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\b\u0007\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\b\u0002\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0017\u0010\u0006\u001a\u00020\u00052\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\u0007J\u0017\u0010\f\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rR\u001c\u0010\u000f\u001a\u00020\u000e8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00038V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0017\u001a\u00020\u00168\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006#"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneTextView;", "Landroid/widget/LinearLayout;", "Lcom/stripe/android/stripe3ds2/views/FormField;", "", "label", "Lm0/i;", "setTextEntryLabel", "(Ljava/lang/String;)V", "text", "setText", "Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;", "textBoxCustomization", "setTextBoxCustomization", "(Lcom/stripe/android/stripe3ds2/init/ui/TextBoxCustomization;)V", "Lcom/google/android/material/textfield/TextInputEditText;", "textEntryView", "Lcom/google/android/material/textfield/TextInputEditText;", "getTextEntryView$3ds2sdk_release", "()Lcom/google/android/material/textfield/TextInputEditText;", "getUserEntry", "()Ljava/lang/String;", "userEntry", "Lcom/google/android/material/textfield/TextInputLayout;", "infoLabel", "Lcom/google/android/material/textfield/TextInputLayout;", "getInfoLabel$3ds2sdk_release", "()Lcom/google/android/material/textfield/TextInputLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeZoneTextView.kt */
public final class ChallengeZoneTextView extends LinearLayout implements FormField {
    private final TextInputLayout infoLabel;
    private final TextInputEditText textEntryView;

    public ChallengeZoneTextView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public ChallengeZoneTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeZoneTextView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final TextInputLayout getInfoLabel$3ds2sdk_release() {
        return this.infoLabel;
    }

    public final TextInputEditText getTextEntryView$3ds2sdk_release() {
        return this.textEntryView;
    }

    public String getUserEntry() {
        Editable text = this.textEntryView.getText();
        String obj = text != null ? text.toString() : null;
        return obj != null ? obj : "";
    }

    public final void setText(String str) {
        i.e(str, NotificationCompat.MessagingStyle.Message.KEY_TEXT);
        this.textEntryView.setText(str);
    }

    public final void setTextBoxCustomization(TextBoxCustomization textBoxCustomization) {
        if (textBoxCustomization != null) {
            String textColor = textBoxCustomization.getTextColor();
            if (textColor != null) {
                this.textEntryView.setTextColor(Color.parseColor(textColor));
            }
            Integer valueOf = Integer.valueOf(textBoxCustomization.getTextFontSize());
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                this.textEntryView.setTextSize(2, (float) valueOf.intValue());
            }
            if (textBoxCustomization.getCornerRadius() >= 0) {
                float cornerRadius = (float) textBoxCustomization.getCornerRadius();
                this.infoLabel.setBoxCornerRadii(cornerRadius, cornerRadius, cornerRadius, cornerRadius);
            }
            String borderColor = textBoxCustomization.getBorderColor();
            if (borderColor != null) {
                this.infoLabel.setBoxBackgroundMode(2);
                this.infoLabel.setBoxStrokeColor(Color.parseColor(borderColor));
            }
            String hintTextColor = textBoxCustomization.getHintTextColor();
            if (hintTextColor != null) {
                this.infoLabel.setDefaultHintTextColor(ColorStateList.valueOf(Color.parseColor(hintTextColor)));
            }
        }
    }

    public final void setTextEntryLabel(String str) {
        this.infoLabel.setHint((CharSequence) str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeZoneTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        StripeChallengeZoneTextViewBinding inflate = StripeChallengeZoneTextViewBinding.inflate(LayoutInflater.from(context), this, true);
        i.d(inflate, "StripeChallengeZoneTextV…           true\n        )");
        TextInputLayout textInputLayout = inflate.label;
        i.d(textInputLayout, "viewBinding.label");
        this.infoLabel = textInputLayout;
        TextInputEditText textInputEditText = inflate.textEntry;
        i.d(textInputEditText, "viewBinding.textEntry");
        this.textEntryView = textInputEditText;
    }
}
