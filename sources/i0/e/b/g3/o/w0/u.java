package i0.e.b.g3.o.w0;

import android.text.Editable;
import android.text.TextWatcher;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment;
import m0.r.k;

/* compiled from: TextView.kt */
public final class u implements TextWatcher {
    public final /* synthetic */ AddEditEventFragment c;

    public u(AddEditEventFragment addEditEventFragment) {
        this.c = addEditEventFragment;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        AddEditEventFragment addEditEventFragment = this.c;
        k<Object>[] kVarArr = AddEditEventFragment.Z1;
        addEditEventFragment.O0().p(new o0(this.c.N0().k.getText().toString()));
    }
}
