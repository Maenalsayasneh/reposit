package i0.e.b.g3.o.w0;

import android.view.View;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class e implements View.OnFocusChangeListener {
    public final /* synthetic */ AddEditEventFragment a;

    public /* synthetic */ e(AddEditEventFragment addEditEventFragment) {
        this.a = addEditEventFragment;
    }

    public final void onFocusChange(View view, boolean z) {
        AddEditEventFragment addEditEventFragment = this.a;
        k<Object>[] kVarArr = AddEditEventFragment.Z1;
        i.e(addEditEventFragment, "this$0");
        if (z) {
            addEditEventFragment.O0().p(e0.a);
        }
    }
}
