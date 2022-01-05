package i0.i;

import android.text.Editable;
import android.text.TextWatcher;
import com.hbb20.CountryCodePicker;
import i0.e.b.g3.r.e;

/* compiled from: CountryCodePicker */
public class m implements TextWatcher {
    public final /* synthetic */ CountryCodePicker c;

    public m(CountryCodePicker countryCodePicker) {
        this.c = countryCodePicker;
    }

    public void afterTextChanged(Editable editable) {
        CountryCodePicker countryCodePicker = this.c;
        if (countryCodePicker.p3 != null) {
            boolean f = countryCodePicker.f();
            CountryCodePicker countryCodePicker2 = this.c;
            if (f != countryCodePicker2.i3) {
                countryCodePicker2.i3 = f;
                ((e) countryCodePicker2.p3).a(f);
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }
}
