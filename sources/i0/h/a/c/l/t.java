package i0.h.a.c.l;

import android.view.View;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.Month;

/* compiled from: YearGridAdapter */
public class t implements View.OnClickListener {
    public final /* synthetic */ int c;
    public final /* synthetic */ u d;

    public t(u uVar, int i) {
        this.d = uVar;
        this.c = i;
    }

    public void onClick(View view) {
        Month g = Month.g(this.c, this.d.a.Y1.d);
        CalendarConstraints calendarConstraints = this.d.a.y;
        if (g.compareTo(calendarConstraints.c) < 0) {
            g = calendarConstraints.c;
        } else if (g.compareTo(calendarConstraints.d) > 0) {
            g = calendarConstraints.d;
        }
        this.d.a.L0(g);
        this.d.a.M0(MaterialCalendar.CalendarSelector.DAY);
    }
}
