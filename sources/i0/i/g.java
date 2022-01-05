package i0.i;

import android.content.SharedPreferences;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.hbb20.CountryCodePicker;
import java.util.List;

/* compiled from: CountryCodeAdapter */
public class g implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ h d;

    public g(h hVar, int i) {
        this.d = hVar;
        this.c = i;
    }

    public void onClick(View view) {
        List<a> list;
        int i;
        int i2;
        List<a> list2 = this.d.a;
        if (list2 != null && list2.size() > (i2 = this.c)) {
            h hVar = this.d;
            CountryCodePicker countryCodePicker = hVar.d;
            a aVar = hVar.a.get(i2);
            CountryCodePicker countryCodePicker2 = countryCodePicker.l2;
            if (countryCodePicker2.C2) {
                String str = aVar.Y1;
                SharedPreferences.Editor edit = countryCodePicker2.Y1.getSharedPreferences(countryCodePicker2.q, 0).edit();
                edit.putString(countryCodePicker2.K2, str);
                edit.apply();
            }
            countryCodePicker.setSelectedCountry(aVar);
        }
        if (view != null && (list = this.d.a) != null && list.size() > (i = this.c) && this.d.a.get(i) != null) {
            ((InputMethodManager) this.d.h.getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
            this.d.g.dismiss();
        }
    }
}
