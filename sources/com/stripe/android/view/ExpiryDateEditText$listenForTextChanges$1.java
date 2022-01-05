package com.stripe.android.view;

import android.content.res.Resources;
import android.text.Editable;
import com.stripe.android.R;
import com.stripe.android.model.ExpirationDate;
import kotlin.Metadata;
import m0.q.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J1\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ1\u0010\f\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0019\u0010\u000e\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0010\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0014\u001a\u00020\u00048\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"com/stripe/android/view/ExpiryDateEditText$listenForTextChanges$1", "Lcom/stripe/android/view/StripeTextWatcher;", "", "s", "", "start", "count", "after", "Lm0/i;", "beforeTextChanged", "(Ljava/lang/CharSequence;III)V", "before", "onTextChanged", "Landroid/text/Editable;", "afterTextChanged", "(Landroid/text/Editable;)V", "latestChangeStart", "I", "newCursorPosition", "Ljava/lang/Integer;", "latestInsertionSize", "Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "expirationDate", "Lcom/stripe/android/model/ExpirationDate$Unvalidated;", "", "formattedDate", "Ljava/lang/String;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ExpiryDateEditText.kt */
public final class ExpiryDateEditText$listenForTextChanges$1 extends StripeTextWatcher {
    private ExpirationDate.Unvalidated expirationDate = ExpirationDate.Unvalidated.Companion.getEMPTY();
    private String formattedDate;
    private int latestChangeStart;
    private int latestInsertionSize;
    private Integer newCursorPosition;
    public final /* synthetic */ ExpiryDateEditText this$0;

    public ExpiryDateEditText$listenForTextChanges$1(ExpiryDateEditText expiryDateEditText) {
        this.this$0 = expiryDateEditText;
    }

    public void afterTextChanged(Editable editable) {
        int i;
        String str;
        boolean z = false;
        if (!this.this$0.isLastKeyDelete() && (str = this.formattedDate) != null) {
            this.this$0.setTextSilent$payments_core_release(str);
            Integer num = this.newCursorPosition;
            if (num != null) {
                int intValue = num.intValue();
                ExpiryDateEditText expiryDateEditText = this.this$0;
                expiryDateEditText.setSelection(i.b(intValue, 0, expiryDateEditText.getFieldText$payments_core_release().length()));
            }
        }
        String month = this.expirationDate.getMonth();
        String year = this.expirationDate.getYear();
        boolean z2 = month.length() == 2 && !this.expirationDate.isMonthValid();
        if (month.length() == 2 && year.length() == 2) {
            boolean isDateValid = this.this$0.isDateValid();
            ExpiryDateEditText expiryDateEditText2 = this.this$0;
            expiryDateEditText2.isDateValid = expiryDateEditText2.isDateValid(month, year);
            boolean z3 = !this.this$0.isDateValid();
            if (!isDateValid && this.this$0.isDateValid()) {
                this.this$0.getCompletionCallback$payments_core_release().invoke();
            }
            z2 = z3;
        } else {
            this.this$0.isDateValid = false;
        }
        ExpiryDateEditText expiryDateEditText3 = this.this$0;
        Resources resources = expiryDateEditText3.getResources();
        if (this.expirationDate.isPartialEntry$payments_core_release()) {
            i = R.string.incomplete_expiry_date;
        } else if (!this.expirationDate.isMonthValid()) {
            i = R.string.invalid_expiry_month;
        } else {
            i = R.string.invalid_expiry_year;
        }
        expiryDateEditText3.setErrorMessage(resources.getString(i));
        ExpiryDateEditText expiryDateEditText4 = this.this$0;
        if (z2 && (this.expirationDate.isPartialEntry$payments_core_release() || this.expirationDate.isComplete$payments_core_release())) {
            z = true;
        }
        expiryDateEditText4.setShouldShowError(z);
        this.formattedDate = null;
        this.newCursorPosition = null;
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        this.latestChangeStart = i;
        this.latestInsertionSize = i3;
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        String obj = charSequence != null ? charSequence.toString() : null;
        if (obj == null) {
            obj = "";
        }
        StringBuilder sb = new StringBuilder();
        int length = obj.length();
        for (int i4 = 0; i4 < length; i4++) {
            char charAt = obj.charAt(i4);
            if (Character.isDigit(charAt)) {
                sb.append(charAt);
            }
        }
        String sb2 = sb.toString();
        m0.n.b.i.d(sb2, "filterTo(StringBuilder(), predicate).toString()");
        if (sb2.length() == 1 && this.latestChangeStart == 0 && this.latestInsertionSize == 1) {
            char charAt2 = sb2.charAt(0);
            if (!(charAt2 == '0' || charAt2 == '1')) {
                sb2 = '0' + sb2;
                this.latestInsertionSize++;
            }
        } else if (sb2.length() == 2 && this.latestChangeStart == 2 && this.latestInsertionSize == 0) {
            sb2 = sb2.substring(0, 1);
            m0.n.b.i.d(sb2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
        }
        ExpirationDate.Unvalidated create = ExpirationDate.Unvalidated.Companion.create(sb2);
        this.expirationDate = create;
        boolean z = !create.isMonthValid();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(create.getMonth());
        if ((create.getMonth().length() == 2 && this.latestInsertionSize > 0 && !z) || sb2.length() > 2) {
            sb3.append(this.this$0.separator);
        }
        sb3.append(create.getYear());
        String sb4 = sb3.toString();
        m0.n.b.i.d(sb4, "formattedDateBuilder.toString()");
        this.newCursorPosition = Integer.valueOf(this.this$0.updateSelectionIndex$payments_core_release(sb4.length(), this.latestChangeStart, this.latestInsertionSize, this.this$0.separator.length() + this.this$0.dateDigitsLength));
        this.formattedDate = sb4;
    }
}
