package com.stripe.android.view;

import android.widget.AutoCompleteTextView;
import java.util.Iterator;
import kotlin.Metadata;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0004\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\b\u0010\tR$\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0004\u0012\u00020\f0\n8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0016\u0010\u0010\u001a\u00020\u000f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"Lcom/stripe/android/view/CountryAutoCompleteTextViewValidator;", "Landroid/widget/AutoCompleteTextView$Validator;", "", "invalidText", "fixText", "(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;", "text", "", "isValid", "(Ljava/lang/CharSequence;)Z", "Lkotlin/Function1;", "Lcom/stripe/android/view/Country;", "Lm0/i;", "onCountrySelected", "Lm0/n/a/l;", "Lcom/stripe/android/view/CountryAdapter;", "countryAdapter", "Lcom/stripe/android/view/CountryAdapter;", "<init>", "(Lcom/stripe/android/view/CountryAdapter;Lm0/n/a/l;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CountryAutoCompleteTextViewValidator.kt */
public final class CountryAutoCompleteTextViewValidator implements AutoCompleteTextView.Validator {
    private final CountryAdapter countryAdapter;
    private final l<Country, i> onCountrySelected;

    public CountryAutoCompleteTextViewValidator(CountryAdapter countryAdapter2, l<? super Country, i> lVar) {
        m0.n.b.i.e(countryAdapter2, "countryAdapter");
        m0.n.b.i.e(lVar, "onCountrySelected");
        this.countryAdapter = countryAdapter2;
        this.onCountrySelected = lVar;
    }

    public CharSequence fixText(CharSequence charSequence) {
        return charSequence != null ? charSequence : "";
    }

    public boolean isValid(CharSequence charSequence) {
        T t;
        Iterator<T> it = this.countryAdapter.getUnfilteredCountries$payments_core_release().iterator();
        while (true) {
            if (!it.hasNext()) {
                t = null;
                break;
            }
            t = it.next();
            if (m0.n.b.i.a(((Country) t).getName(), String.valueOf(charSequence))) {
                break;
            }
        }
        this.onCountrySelected.invoke(t);
        return ((Country) t) != null;
    }
}
