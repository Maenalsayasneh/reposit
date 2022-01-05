package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Patterns;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u00028F@\u0006¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/EmailEditText;", "Lcom/stripe/android/view/StripeEditText;", "", "getEmail", "()Ljava/lang/String;", "email", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: EmailEditText.kt */
public final class EmailEditText extends StripeEditText {
    public EmailEditText(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public EmailEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ EmailEditText(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    public final String getEmail() {
        String str;
        if (StringsKt__IndentKt.o(getFieldText$payments_core_release())) {
            str = getResources().getString(com.stripe.android.R.string.becs_widget_email_required);
        } else {
            str = !Patterns.EMAIL_ADDRESS.matcher(getFieldText$payments_core_release()).matches() ? getResources().getString(com.stripe.android.R.string.becs_widget_email_invalid) : null;
        }
        setErrorMessage$payments_core_release(str);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        if (getErrorMessage$payments_core_release() == null) {
            return fieldText$payments_core_release;
        }
        return null;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EmailEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
    }
}
