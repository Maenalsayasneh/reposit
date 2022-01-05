package i0.e.b.g3.l.b3;

import android.text.Editable;
import android.text.TextWatcher;
import com.clubhouse.android.ui.clubs.rules.EditClubRulesFragment;
import m0.r.k;

/* compiled from: TextView.kt */
public final class g implements TextWatcher {
    public final /* synthetic */ EditClubRulesFragment c;

    public g(EditClubRulesFragment editClubRulesFragment) {
        this.c = editClubRulesFragment;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditClubRulesFragment editClubRulesFragment = this.c;
        k<Object>[] kVarArr = EditClubRulesFragment.Z1;
        editClubRulesFragment.P0().p(new o(String.valueOf(charSequence), this.c.O0().d.a.getText().toString()));
    }
}
