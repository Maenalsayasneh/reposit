package i0.e.b.g3.l.b3;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.clubhouse.android.ui.clubs.rules.EditClubRulesFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: TextView.kt */
public final class d implements TextWatcher {
    public final /* synthetic */ EditClubRulesFragment c;

    public d(EditClubRulesFragment editClubRulesFragment) {
        this.c = editClubRulesFragment;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        EditClubRulesFragment editClubRulesFragment = this.c;
        k<Object>[] kVarArr = EditClubRulesFragment.Z1;
        editClubRulesFragment.P0().p(new m(this.c.O0().b.c.getText().toString(), String.valueOf(charSequence)));
        EditClubRulesFragment editClubRulesFragment2 = this.c;
        TextView textView = editClubRulesFragment2.O0().b.b;
        i.d(textView, "binding.clubRuleOne.remaining");
        editClubRulesFragment2.R0(textView, String.valueOf(charSequence));
    }
}
