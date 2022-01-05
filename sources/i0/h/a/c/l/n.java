package i0.h.a.c.l;

import android.view.View;
import android.widget.AdapterView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import java.util.Iterator;

/* compiled from: MonthsPagerAdapter */
public class n implements AdapterView.OnItemClickListener {
    public final /* synthetic */ MaterialCalendarGridView c;
    public final /* synthetic */ o d;

    public n(o oVar, MaterialCalendarGridView materialCalendarGridView) {
        this.d = oVar;
        this.c = materialCalendarGridView;
    }

    public void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        m a = this.c.getAdapter();
        if (i >= a.b() && i <= a.d()) {
            MaterialCalendar.e eVar = this.d.d;
            long longValue = this.c.getAdapter().getItem(i).longValue();
            MaterialCalendar.d dVar = (MaterialCalendar.d) eVar;
            if (MaterialCalendar.this.y.q.c0(longValue)) {
                MaterialCalendar.this.x.y0(longValue);
                Iterator it = MaterialCalendar.this.c.iterator();
                while (it.hasNext()) {
                    ((p) it.next()).a(MaterialCalendar.this.x.m0());
                }
                MaterialCalendar.this.c2.getAdapter().notifyDataSetChanged();
                RecyclerView recyclerView = MaterialCalendar.this.b2;
                if (recyclerView != null) {
                    recyclerView.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }
}
