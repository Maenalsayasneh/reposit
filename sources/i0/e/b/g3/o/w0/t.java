package i0.e.b.g3.o.w0;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.TextView;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment$updateRemainingDescription$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: TextView.kt */
public final class t implements TextWatcher {
    public final /* synthetic */ AddEditEventFragment c;

    public t(AddEditEventFragment addEditEventFragment) {
        this.c = addEditEventFragment;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        AddEditEventFragment addEditEventFragment = this.c;
        k<Object>[] kVarArr = AddEditEventFragment.Z1;
        addEditEventFragment.O0().p(new m0(this.c.N0().i.getText().toString()));
        AddEditEventFragment addEditEventFragment2 = this.c;
        TextView textView = addEditEventFragment2.N0().j;
        i.d(textView, "binding.eventDescriptionRemaining");
        v.v2(addEditEventFragment2.O0(), new AddEditEventFragment$updateRemainingDescription$1(String.valueOf(charSequence), textView, addEditEventFragment2));
    }
}
