package i0.h.a.c.l;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendar;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.MaterialDatePicker;
import com.google.android.material.datepicker.Month;
import h0.i.i.q;
import h0.i.i.u;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: MonthsPagerAdapter */
public class o extends RecyclerView.Adapter<a> {
    public final Context a;
    public final CalendarConstraints b;
    public final DateSelector<?> c;
    public final MaterialCalendar.e d;
    public final int e;

    /* compiled from: MonthsPagerAdapter */
    public static class a extends RecyclerView.b0 {
        public final TextView a;
        public final MaterialCalendarGridView b;

        public a(LinearLayout linearLayout, boolean z) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(R.id.month_title);
            this.a = textView;
            AtomicInteger atomicInteger = q.a;
            new u(androidx.core.R.id.tag_accessibility_heading, Boolean.class, 28).e(textView, Boolean.TRUE);
            this.b = (MaterialCalendarGridView) linearLayout.findViewById(R.id.month_grid);
            if (!z) {
                textView.setVisibility(8);
            }
        }
    }

    public o(Context context, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints, MaterialCalendar.e eVar) {
        Month month = calendarConstraints.c;
        Month month2 = calendarConstraints.d;
        Month month3 = calendarConstraints.x;
        if (month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        } else if (month3.compareTo(month2) <= 0) {
            int i = m.c;
            int i2 = MaterialCalendar.d;
            Resources resources = context.getResources();
            int i3 = R.dimen.mtrl_calendar_day_height;
            int dimensionPixelSize = i * resources.getDimensionPixelSize(i3);
            int dimensionPixelSize2 = MaterialDatePicker.R0(context) ? context.getResources().getDimensionPixelSize(i3) : 0;
            this.a = context;
            this.e = dimensionPixelSize + dimensionPixelSize2;
            this.b = calendarConstraints;
            this.c = dateSelector;
            this.d = eVar;
            setHasStableIds(true);
        } else {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
    }

    public Month b(int i) {
        return this.b.c.s(i);
    }

    public int c(Month month) {
        return this.b.c.t(month);
    }

    public int getItemCount() {
        return this.b.Y1;
    }

    public long getItemId(int i) {
        return this.b.c.s(i).c.getTimeInMillis();
    }

    public void onBindViewHolder(RecyclerView.b0 b0Var, int i) {
        a aVar = (a) b0Var;
        Month s = this.b.c.s(i);
        aVar.a.setText(s.r(aVar.itemView.getContext()));
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) aVar.b.findViewById(R.id.month_grid);
        if (materialCalendarGridView.getAdapter() == null || !s.equals(materialCalendarGridView.getAdapter().d)) {
            m mVar = new m(s, this.c, this.b);
            materialCalendarGridView.setNumColumns(s.x);
            materialCalendarGridView.setAdapter((ListAdapter) mVar);
        } else {
            materialCalendarGridView.invalidate();
            m a2 = materialCalendarGridView.getAdapter();
            for (Long longValue : a2.x) {
                a2.f(materialCalendarGridView, longValue.longValue());
            }
            DateSelector<?> dateSelector = a2.q;
            if (dateSelector != null) {
                for (Long longValue2 : dateSelector.i0()) {
                    a2.f(materialCalendarGridView, longValue2.longValue());
                }
                a2.x = a2.q.i0();
            }
        }
        materialCalendarGridView.setOnItemClickListener(new n(this, materialCalendarGridView));
    }

    public RecyclerView.b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_month_labeled, viewGroup, false);
        if (!MaterialDatePicker.R0(viewGroup.getContext())) {
            return new a(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.o(-1, this.e));
        return new a(linearLayout, true);
    }
}
