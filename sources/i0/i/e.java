package i0.i;

import android.text.Editable;
import android.text.TextWatcher;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CountryCodeAdapter */
public class e implements TextWatcher {
    public final /* synthetic */ h c;

    public e(h hVar) {
        this.c = hVar;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        h hVar = this.c;
        String charSequence2 = charSequence.toString();
        hVar.c.setVisibility(8);
        String lowerCase = charSequence2.toLowerCase();
        if (lowerCase.length() > 0 && lowerCase.charAt(0) == '+') {
            lowerCase = lowerCase.substring(1);
        }
        List<a> b = hVar.b(lowerCase);
        hVar.a = b;
        if (((ArrayList) b).size() == 0) {
            hVar.c.setVisibility(0);
        }
        hVar.notifyDataSetChanged();
        if (charSequence.toString().trim().equals("")) {
            this.c.j.setVisibility(8);
        } else {
            this.c.j.setVisibility(0);
        }
    }
}
