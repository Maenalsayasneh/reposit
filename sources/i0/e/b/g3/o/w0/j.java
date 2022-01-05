package i0.e.b.g3.o.w0;

import android.widget.TimePicker;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment$createTimeChangedListener$1$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class j implements TimePicker.OnTimeChangedListener {
    public final /* synthetic */ AddEditEventFragment a;

    public /* synthetic */ j(AddEditEventFragment addEditEventFragment) {
        this.a = addEditEventFragment;
    }

    public final void onTimeChanged(TimePicker timePicker, int i, int i2) {
        AddEditEventFragment addEditEventFragment = this.a;
        k<Object>[] kVarArr = AddEditEventFragment.Z1;
        i.e(addEditEventFragment, "this$0");
        v.v2(addEditEventFragment.O0(), new AddEditEventFragment$createTimeChangedListener$1$1(i, i2, addEditEventFragment));
    }
}
