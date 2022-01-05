package i0.e.b.g3.o.w0;

import android.widget.CalendarView;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment;
import com.clubhouse.android.ui.events.creation.AddEditEventFragment$createDateChangedListener$1$1;
import h0.b0.v;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class g implements CalendarView.OnDateChangeListener {
    public final /* synthetic */ AddEditEventFragment a;

    public /* synthetic */ g(AddEditEventFragment addEditEventFragment) {
        this.a = addEditEventFragment;
    }

    public final void onSelectedDayChange(CalendarView calendarView, int i, int i2, int i3) {
        AddEditEventFragment addEditEventFragment = this.a;
        k<Object>[] kVarArr = AddEditEventFragment.Z1;
        i.e(addEditEventFragment, "this$0");
        i.e(calendarView, "view");
        v.v2(addEditEventFragment.O0(), new AddEditEventFragment$createDateChangedListener$1$1(i, i2, i3, addEditEventFragment));
    }
}
