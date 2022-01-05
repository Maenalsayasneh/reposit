package i0.e.b.g3.o.w0;

import android.widget.CompoundButton;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment;
import m0.n.b.i;

/* compiled from: lambda */
public final /* synthetic */ class k implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ AddEditEventFragment a;

    public /* synthetic */ k(AddEditEventFragment addEditEventFragment) {
        this.a = addEditEventFragment;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        AddEditEventFragment addEditEventFragment = this.a;
        i.e(addEditEventFragment, "this$0");
        m0.r.k<Object>[] kVarArr = AddEditEventFragment.Z1;
        addEditEventFragment.O0().p(new n0(z));
    }
}
