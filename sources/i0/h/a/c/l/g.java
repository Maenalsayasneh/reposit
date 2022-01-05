package i0.h.a.c.l;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* compiled from: MaterialCalendar */
public class g implements View.OnClickListener {
    public final /* synthetic */ MaterialCalendar c;

    public g(MaterialCalendar materialCalendar) {
        this.c = materialCalendar;
    }

    public void onClick(View view) {
        MaterialCalendar materialCalendar = this.c;
        MaterialCalendar.CalendarSelector calendarSelector = materialCalendar.Z1;
        MaterialCalendar.CalendarSelector calendarSelector2 = MaterialCalendar.CalendarSelector.YEAR;
        if (calendarSelector == calendarSelector2) {
            materialCalendar.M0(MaterialCalendar.CalendarSelector.DAY);
        } else if (calendarSelector == MaterialCalendar.CalendarSelector.DAY) {
            materialCalendar.M0(calendarSelector2);
        }
    }
}
