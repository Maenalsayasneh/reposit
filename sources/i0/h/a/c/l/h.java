package i0.h.a.c.l;

import android.view.View;
import com.google.android.material.datepicker.MaterialCalendar;

/* compiled from: MaterialCalendar */
public class h implements View.OnClickListener {
    public final /* synthetic */ o c;
    public final /* synthetic */ MaterialCalendar d;

    public h(MaterialCalendar materialCalendar, o oVar) {
        this.d = materialCalendar;
        this.c = oVar;
    }

    public void onClick(View view) {
        int findFirstVisibleItemPosition = this.d.J0().findFirstVisibleItemPosition() + 1;
        if (findFirstVisibleItemPosition < this.d.c2.getAdapter().getItemCount()) {
            this.d.L0(this.c.b(findFirstVisibleItemPosition));
        }
    }
}
