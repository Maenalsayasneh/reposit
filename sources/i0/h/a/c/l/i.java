package i0.h.a.c.l;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* compiled from: MaterialCalendar */
public class i implements View.OnClickListener {
    public final /* synthetic */ o c;
    public final /* synthetic */ MaterialCalendar d;

    public i(MaterialCalendar materialCalendar, o oVar) {
        this.d = materialCalendar;
        this.c = oVar;
    }

    public void onClick(View view) {
        int findLastVisibleItemPosition = this.d.J0().findLastVisibleItemPosition() - 1;
        if (findLastVisibleItemPosition >= 0) {
            this.d.L0(this.c.b(findLastVisibleItemPosition));
        }
    }
}
