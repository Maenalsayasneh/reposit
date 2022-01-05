package i0.h.a.c.l;

import android.view.View;
import com.google.android.material.R;
import com.google.android.material.datepicker.MaterialCalendar;
import h0.i.i.a;
import h0.i.i.g0.b;

/* compiled from: MaterialCalendar */
public class e extends a {
    public final /* synthetic */ MaterialCalendar a;

    public e(MaterialCalendar materialCalendar) {
        this.a = materialCalendar;
    }

    public void onInitializeAccessibilityNodeInfo(View view, b bVar) {
        String str;
        super.onInitializeAccessibilityNodeInfo(view, bVar);
        if (this.a.e2.getVisibility() == 0) {
            str = this.a.getString(R.string.mtrl_picker_toggle_to_year_selection);
        } else {
            str = this.a.getString(R.string.mtrl_picker_toggle_to_day_selection);
        }
        bVar.k(str);
    }
}
