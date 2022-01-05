package com.stripe.android.view;

import android.content.Context;
import android.text.InputFilter;
import android.util.AttributeSet;
import androidx.appcompat.R;
import kotlin.Metadata;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B'\b\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u0015\u0010\f\u001a\u0004\u0018\u00010\t8F@\u0006¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/view/BecsDebitAccountNumberEditText;", "Lcom/stripe/android/view/StripeEditText;", "", "minLength", "I", "getMinLength", "()I", "setMinLength", "(I)V", "", "getAccountNumber", "()Ljava/lang/String;", "accountNumber", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: BecsDebitAccountNumberEditText.kt */
public final class BecsDebitAccountNumberEditText extends StripeEditText {
    public static final Companion Companion = new Companion((f) null);
    public static final int DEFAULT_MIN_LENGTH = 5;
    private static final int MAX_LENGTH = 9;
    private int minLength;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0000@\u0000XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/view/BecsDebitAccountNumberEditText$Companion;", "", "", "DEFAULT_MIN_LENGTH", "I", "MAX_LENGTH", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: BecsDebitAccountNumberEditText.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public BecsDebitAccountNumberEditText(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public BecsDebitAccountNumberEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ BecsDebitAccountNumberEditText(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    public final String getAccountNumber() {
        String str;
        if (StringsKt__IndentKt.o(getFieldText$payments_core_release())) {
            str = getResources().getString(com.stripe.android.R.string.becs_widget_account_number_required);
        } else {
            str = getFieldText$payments_core_release().length() < this.minLength ? getResources().getString(com.stripe.android.R.string.becs_widget_account_number_incomplete) : null;
        }
        setErrorMessage$payments_core_release(str);
        String fieldText$payments_core_release = getFieldText$payments_core_release();
        if (getErrorMessage$payments_core_release() == null) {
            return fieldText$payments_core_release;
        }
        return null;
    }

    public final int getMinLength() {
        return this.minLength;
    }

    public final void setMinLength(int i) {
        this.minLength = i;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public BecsDebitAccountNumberEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        this.minLength = 5;
        setFilters(new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(9)});
        setInputType(2);
        addTextChangedListener(new BecsDebitAccountNumberEditText$$special$$inlined$doAfterTextChanged$1(this));
    }
}
