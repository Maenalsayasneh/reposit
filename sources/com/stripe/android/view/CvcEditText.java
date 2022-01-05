package com.stripe.android.view;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import com.google.android.material.textfield.TextInputLayout;
import com.stripe.android.cards.Cvc;
import com.stripe.android.model.CardBrand;
import kotlin.Metadata;
import m0.i;
import m0.n.a.a;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010)\u001a\u00020(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010-\u001a\u00020,¢\u0006\u0004\b.\u0010/J\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J;\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\b8F@\u0007X\u0004¢\u0006\f\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\b8T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0012R(\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u00188\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u0018\u0010#\u001a\u0004\u0018\u00010 8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\"R\u0016\u0010'\u001a\u00020$8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u00060"}, d2 = {"Lcom/stripe/android/view/CvcEditText;", "Lcom/stripe/android/view/StripeEditText;", "Lcom/stripe/android/model/CardBrand;", "cardBrand", "", "Landroid/text/InputFilter;", "createFilters", "(Lcom/stripe/android/model/CardBrand;)[Landroid/text/InputFilter;", "", "customHintText", "customPlaceholderText", "Lcom/google/android/material/textfield/TextInputLayout;", "textInputLayout", "Lm0/i;", "updateBrand$payments_core_release", "(Lcom/stripe/android/model/CardBrand;Ljava/lang/String;Ljava/lang/String;Lcom/google/android/material/textfield/TextInputLayout;)V", "updateBrand", "getCvcValue", "()Ljava/lang/String;", "getCvcValue$annotations", "()V", "cvcValue", "getAccessibilityText", "accessibilityText", "Lkotlin/Function0;", "completionCallback", "Lm0/n/a/a;", "getCompletionCallback$payments_core_release", "()Lm0/n/a/a;", "setCompletionCallback$payments_core_release", "(Lm0/n/a/a;)V", "Lcom/stripe/android/model/CardBrand;", "Lcom/stripe/android/cards/Cvc$Validated;", "getCvc$payments_core_release", "()Lcom/stripe/android/cards/Cvc$Validated;", "cvc", "Lcom/stripe/android/cards/Cvc$Unvalidated;", "getUnvalidatedCvc", "()Lcom/stripe/android/cards/Cvc$Unvalidated;", "unvalidatedCvc", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CvcEditText.kt */
public final class CvcEditText extends StripeEditText {
    /* access modifiers changed from: private */
    public CardBrand cardBrand;
    private /* synthetic */ a<i> completionCallback;

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            CardBrand.values();
            int[] iArr = new int[8];
            $EnumSwitchMapping$0 = iArr;
            iArr[CardBrand.AmericanExpress.ordinal()] = 1;
        }
    }

    public CvcEditText(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public CvcEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CvcEditText(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    private final InputFilter[] createFilters(CardBrand cardBrand2) {
        return new InputFilter[]{new InputFilter.LengthFilter(cardBrand2.getMaxCvcLength())};
    }

    public static /* synthetic */ void getCvcValue$annotations() {
    }

    /* access modifiers changed from: private */
    public final Cvc.Unvalidated getUnvalidatedCvc() {
        return new Cvc.Unvalidated(getFieldText$payments_core_release());
    }

    public static /* synthetic */ void updateBrand$payments_core_release$default(CvcEditText cvcEditText, CardBrand cardBrand2, String str, String str2, TextInputLayout textInputLayout, int i, Object obj) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            str2 = null;
        }
        if ((i & 8) != 0) {
            textInputLayout = null;
        }
        cvcEditText.updateBrand$payments_core_release(cardBrand2, str, str2, textInputLayout);
    }

    public String getAccessibilityText() {
        return getResources().getString(com.stripe.android.R.string.acc_label_cvc_node, new Object[]{getText()});
    }

    public final a<i> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final Cvc.Validated getCvc$payments_core_release() {
        return getUnvalidatedCvc().validate(this.cardBrand.getMaxCvcLength());
    }

    public final String getCvcValue() {
        Cvc.Validated cvc$payments_core_release = getCvc$payments_core_release();
        if (cvc$payments_core_release != null) {
            return cvc$payments_core_release.getValue$payments_core_release();
        }
        return null;
    }

    public final void setCompletionCallback$payments_core_release(a<i> aVar) {
        m0.n.b.i.e(aVar, "<set-?>");
        this.completionCallback = aVar;
    }

    public final /* synthetic */ void updateBrand$payments_core_release(CardBrand cardBrand2, String str, String str2, TextInputLayout textInputLayout) {
        int i;
        m0.n.b.i.e(cardBrand2, "cardBrand");
        this.cardBrand = cardBrand2;
        setFilters(createFilters(cardBrand2));
        if (str == null) {
            if (cardBrand2 == CardBrand.AmericanExpress) {
                str = getResources().getString(com.stripe.android.R.string.cvc_amex_hint);
            } else {
                str = getResources().getString(com.stripe.android.R.string.cvc_number_hint);
            }
            m0.n.b.i.d(str, "if (cardBrand == CardBra…umber_hint)\n            }");
        }
        boolean z = true;
        if (getUnvalidatedCvc().getNormalized$payments_core_release().length() > 0) {
            if (getUnvalidatedCvc().validate(cardBrand2.getMaxCvcLength()) != null) {
                z = false;
            }
            setShouldShowError(z);
        }
        if (textInputLayout != null) {
            textInputLayout.setHint((CharSequence) str);
            if (str2 == null) {
                Resources resources = getResources();
                if (cardBrand2.ordinal() != 0) {
                    i = com.stripe.android.R.string.cvc_multiline_helper;
                } else {
                    i = com.stripe.android.R.string.cvc_multiline_helper_amex;
                }
                str2 = resources.getString(i);
            }
            textInputLayout.setPlaceholderText(str2);
            return;
        }
        setHint(str);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CvcEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m0.n.b.i.e(context, "context");
        CardBrand cardBrand2 = CardBrand.Unknown;
        this.cardBrand = cardBrand2;
        this.completionCallback = CvcEditText$completionCallback$1.INSTANCE;
        setErrorMessage(getResources().getString(com.stripe.android.R.string.invalid_cvc));
        setHint(com.stripe.android.R.string.cvc_number_hint);
        setMaxLines(1);
        setFilters(createFilters(cardBrand2));
        setInputType(2);
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardSecurityCode"});
        }
        addTextChangedListener(new CvcEditText$$special$$inlined$doAfterTextChanged$1(this));
        getInternalFocusChangeListeners$payments_core_release().add(new View.OnFocusChangeListener(this) {
            public final /* synthetic */ CvcEditText this$0;

            {
                this.this$0 = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                if (!z && this.this$0.getUnvalidatedCvc().isPartialEntry(this.this$0.cardBrand.getMaxCvcLength())) {
                    this.this$0.setShouldShowError(true);
                }
            }
        });
        setLayoutDirection(0);
    }
}
