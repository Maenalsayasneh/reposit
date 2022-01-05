package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.util.AttributeSet;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J#\u0010\u0007\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\u0011"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ThreeDS2HeaderTextView;", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "", "text", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "labelCustomization", "Lm0/i;", "setText", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ThreeDS2HeaderTextView.kt */
public final class ThreeDS2HeaderTextView extends ThreeDS2TextView {
    public ThreeDS2HeaderTextView(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public void setText(String str, LabelCustomization labelCustomization) {
        setText(str);
        if (labelCustomization != null) {
            String headingTextColor = labelCustomization.getHeadingTextColor();
            if (headingTextColor != null) {
                setTextColor(Color.parseColor(headingTextColor));
            }
            Integer valueOf = Integer.valueOf(labelCustomization.getHeadingTextFontSize());
            if (!(valueOf.intValue() > 0)) {
                valueOf = null;
            }
            if (valueOf != null) {
                setTextSize(2, (float) valueOf.intValue());
            }
            String headingTextFontName = labelCustomization.getHeadingTextFontName();
            if (headingTextFontName != null) {
                setTypeface(Typeface.create(headingTextFontName, 0));
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ThreeDS2HeaderTextView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
    }
}
