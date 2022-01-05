package com.stripe.android.view;

import android.content.Context;
import android.os.Build;
import android.text.Editable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import androidx.appcompat.R;
import com.stripe.android.model.ExpirationDate;
import i0.d.a.a.a;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.Result;
import kotlin.text.StringsKt__IndentKt;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.o.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 @2\u00020\u0001:\u0001@B'\b\u0007\u0012\u0006\u0010:\u001a\u000209\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010=\u001a\u00020\u000e¢\u0006\u0004\b>\u0010?J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000eH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J/\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u000eH\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u0015\u0010\u001e\u001a\u0004\u0018\u00010\u001b8F@\u0006¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00040\u001f8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u000e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0016\u0010(\u001a\u00020\t8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b(\u0010)R*\u0010.\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0018\u00010*8F@\u0007X\u0004¢\u0006\f\u0012\u0004\b-\u0010\b\u001a\u0004\b+\u0010,R\u0016\u00101\u001a\u00020\t8T@\u0014X\u0004¢\u0006\u0006\u001a\u0004\b/\u00100R+\u0010\u0003\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00028@@@X\u0002¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u0010\u0006R$\u0010\f\u001a\u00020\u00022\u0006\u00102\u001a\u00020\u00028\u0006@BX\u000e¢\u0006\f\n\u0004\b\f\u00108\u001a\u0004\b\f\u00106¨\u0006A"}, d2 = {"Lcom/stripe/android/view/ExpiryDateEditText;", "Lcom/stripe/android/view/StripeEditText;", "", "includeSeparatorGaps", "Lm0/i;", "updateSeparatorUi", "(Z)V", "listenForTextChanges", "()V", "", "month", "year", "isDateValid", "(Ljava/lang/String;Ljava/lang/String;)Z", "", "expiryMonth", "expiryYear", "setText$payments_core_release", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "setText", "newLength", "editActionStart", "editActionAddition", "maxInputLength", "updateSelectionIndex$payments_core_release", "(IIII)I", "updateSelectionIndex", "Lcom/stripe/android/model/ExpirationDate$Validated;", "getValidatedDate", "()Lcom/stripe/android/model/ExpirationDate$Validated;", "validatedDate", "Lkotlin/Function0;", "completionCallback", "Lm0/n/a/a;", "getCompletionCallback$payments_core_release", "()Lm0/n/a/a;", "setCompletionCallback$payments_core_release", "(Lm0/n/a/a;)V", "dateDigitsLength", "I", "separator", "Ljava/lang/String;", "Lkotlin/Pair;", "getValidDateFields", "()Lkotlin/Pair;", "getValidDateFields$annotations", "validDateFields", "getAccessibilityText", "()Ljava/lang/String;", "accessibilityText", "<set-?>", "includeSeparatorGaps$delegate", "Lm0/o/d;", "getIncludeSeparatorGaps$payments_core_release", "()Z", "setIncludeSeparatorGaps$payments_core_release", "Z", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Companion", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ExpiryDateEditText.kt */
public final class ExpiryDateEditText extends StripeEditText {
    public static final /* synthetic */ k[] $$delegatedProperties = {a.o1(ExpiryDateEditText.class, "includeSeparatorGaps", "getIncludeSeparatorGaps$payments_core_release()Z", 0)};
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final boolean INCLUDE_SEPARATOR_GAPS_DEFAULT = false;
    @Deprecated
    private static final int INVALID_INPUT = -1;
    @Deprecated
    private static final String SEPARATOR_WITHOUT_GAPS = "/";
    @Deprecated
    private static final String SEPARATOR_WITH_GAPS = " / ";
    private /* synthetic */ m0.n.a.a<i> completionCallback;
    /* access modifiers changed from: private */
    public final int dateDigitsLength;
    private final d includeSeparatorGaps$delegate;
    /* access modifiers changed from: private */
    public boolean isDateValid;
    /* access modifiers changed from: private */
    public String separator;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\f\u0010\rR\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0006\u001a\u00020\u00058\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0016\u0010\t\u001a\u00020\b8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u000b\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/stripe/android/view/ExpiryDateEditText$Companion;", "", "", "INCLUDE_SEPARATOR_GAPS_DEFAULT", "Z", "", "INVALID_INPUT", "I", "", "SEPARATOR_WITHOUT_GAPS", "Ljava/lang/String;", "SEPARATOR_WITH_GAPS", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ExpiryDateEditText.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public ExpiryDateEditText(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public ExpiryDateEditText(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ExpiryDateEditText(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.editTextStyle : i);
    }

    public static /* synthetic */ void getValidDateFields$annotations() {
    }

    private final void listenForTextChanges() {
        addTextChangedListener(new ExpiryDateEditText$listenForTextChanges$1(this));
    }

    /* access modifiers changed from: private */
    public final void updateSeparatorUi(boolean z) {
        this.separator = z ? SEPARATOR_WITH_GAPS : SEPARATOR_WITHOUT_GAPS;
        Object[] array = h.L2(new InputFilter.LengthFilter(this.separator.length() + this.dateDigitsLength)).toArray(new InputFilter.LengthFilter[0]);
        Objects.requireNonNull(array, "null cannot be cast to non-null type kotlin.Array<T>");
        setFilters((InputFilter[]) array);
    }

    public static /* synthetic */ void updateSeparatorUi$default(ExpiryDateEditText expiryDateEditText, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        expiryDateEditText.updateSeparatorUi(z);
    }

    public String getAccessibilityText() {
        String string = getResources().getString(com.stripe.android.R.string.acc_label_expiry_date_node, new Object[]{getText()});
        m0.n.b.i.d(string, "resources.getString(R.st…l_expiry_date_node, text)");
        return string;
    }

    public final m0.n.a.a<i> getCompletionCallback$payments_core_release() {
        return this.completionCallback;
    }

    public final boolean getIncludeSeparatorGaps$payments_core_release() {
        return ((Boolean) this.includeSeparatorGaps$delegate.getValue(this, $$delegatedProperties[0])).booleanValue();
    }

    public final Pair<Integer, Integer> getValidDateFields() {
        ExpirationDate.Validated validatedDate = getValidatedDate();
        if (validatedDate != null) {
            return new Pair<>(Integer.valueOf(validatedDate.getMonth()), Integer.valueOf(validatedDate.getYear()));
        }
        return null;
    }

    public final ExpirationDate.Validated getValidatedDate() {
        boolean z = this.isDateValid;
        if (z) {
            return ExpirationDate.Unvalidated.Companion.create(getFieldText$payments_core_release()).validate();
        }
        if (!z) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final boolean isDateValid() {
        return this.isDateValid;
    }

    public final void setCompletionCallback$payments_core_release(m0.n.a.a<i> aVar) {
        m0.n.b.i.e(aVar, "<set-?>");
        this.completionCallback = aVar;
    }

    public final void setIncludeSeparatorGaps$payments_core_release(boolean z) {
        this.includeSeparatorGaps$delegate.setValue(this, $$delegatedProperties[0], Boolean.valueOf(z));
    }

    public final void setText$payments_core_release(Integer num, Integer num2) {
        if (num != null && num2 != null) {
            setText(g.E(g.K(StringsKt__IndentKt.t(String.valueOf(num.intValue()), 2, '0'), StringsKt__IndentKt.t(m0.r.t.a.r.m.a1.a.U3(String.valueOf(num2.intValue()), 2), 2, '0')), this.separator, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (l) null, 62));
        }
    }

    public final int updateSelectionIndex$payments_core_release(int i, int i2, int i3, int i4) {
        int i5 = 0;
        int length = (i2 > 2 || i2 + i3 < 2) ? 0 : this.separator.length();
        boolean z = true;
        if (!(i3 == 0) || i2 != this.separator.length() + 2) {
            z = false;
        }
        int i6 = i2 + i3 + length;
        if (z && i6 > 0) {
            i5 = this.separator.length();
        }
        return Math.min(i4, Math.min(i6 - i5, i));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ExpiryDateEditText(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        m0.n.b.i.e(context, "context");
        this.completionCallback = ExpiryDateEditText$completionCallback$1.INSTANCE;
        Boolean bool = Boolean.FALSE;
        this.includeSeparatorGaps$delegate = new ExpiryDateEditText$$special$$inlined$observable$1(bool, bool, this);
        this.dateDigitsLength = context.getResources().getInteger(com.stripe.android.R.integer.stripe_date_digits_length);
        this.separator = SEPARATOR_WITHOUT_GAPS;
        setInputType(2);
        updateSeparatorUi$default(this, false, 1, (Object) null);
        listenForTextChanges();
        if (Build.VERSION.SDK_INT >= 26) {
            setAutofillHints(new String[]{"creditCardExpirationDate"});
        }
        getInternalFocusChangeListeners$payments_core_release().add(new View.OnFocusChangeListener(this) {
            public final /* synthetic */ ExpiryDateEditText this$0;

            {
                this.this$0 = r1;
            }

            public final void onFocusChange(View view, boolean z) {
                if (!z) {
                    Editable text = this.this$0.getText();
                    if (!(text == null || text.length() == 0) && !this.this$0.isDateValid()) {
                        this.this$0.setShouldShowError(true);
                    }
                }
            }
        });
        setLayoutDirection(0);
    }

    /* access modifiers changed from: private */
    public final boolean isDateValid(String str, String str2) {
        int i;
        Object obj;
        Object obj2;
        int i2 = -1;
        int i3 = -1;
        if (str.length() != 2) {
            i = -1;
        } else {
            try {
                obj2 = Integer.valueOf(Integer.parseInt(str));
            } catch (Throwable th) {
                obj2 = h.l0(th);
            }
            if (obj2 instanceof Result.Failure) {
                obj2 = -1;
            }
            i = ((Number) obj2).intValue();
        }
        if (str2.length() == 2) {
            try {
                obj = Integer.valueOf(DateUtils.INSTANCE.convertTwoDigitYearToFour(Integer.parseInt(str2)));
            } catch (Throwable th2) {
                obj = h.l0(th2);
            }
            if (!(obj instanceof Result.Failure)) {
                i3 = obj;
            }
            i2 = ((Number) i3).intValue();
        }
        return DateUtils.isExpiryDataValid(i, i2);
    }
}
