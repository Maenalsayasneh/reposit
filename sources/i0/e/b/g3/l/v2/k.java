package i0.e.b.g3.l.v2;

import android.text.Editable;
import android.text.TextWatcher;
import com.clubhouse.android.ui.clubs.create.CreateClubFragment;

/* compiled from: TextView.kt */
public final class k implements TextWatcher {
    public final /* synthetic */ CreateClubFragment c;

    public k(CreateClubFragment createClubFragment) {
        this.c = createClubFragment;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        CreateClubFragment createClubFragment = this.c;
        m0.r.k<Object>[] kVarArr = CreateClubFragment.e2;
        createClubFragment.S0().p(new r(this.c.R0().f.getText().toString()));
    }
}
