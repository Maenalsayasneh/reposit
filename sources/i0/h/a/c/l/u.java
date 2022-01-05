package i0.h.a.c.l;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.datepicker.MaterialCalendar;
import java.util.Calendar;
import java.util.Locale;

/* compiled from: YearGridAdapter */
public class u extends RecyclerView.Adapter<a> {
    public final MaterialCalendar<?> a;

    /* compiled from: YearGridAdapter */
    public static class a extends RecyclerView.b0 {
        public final TextView a;

        public a(TextView textView) {
            super(textView);
            this.a = textView;
        }
    }

    public u(MaterialCalendar<?> materialCalendar) {
        this.a = materialCalendar;
    }

    public int b(int i) {
        return i - this.a.y.c.q;
    }

    public int getItemCount() {
        return this.a.y.y;
    }

    public void onBindViewHolder(RecyclerView.b0 b0Var, int i) {
        a aVar = (a) b0Var;
        int i2 = this.a.y.c.q + i;
        String string = aVar.a.getContext().getString(R.string.mtrl_picker_navigate_to_year_description);
        aVar.a.setText(String.format(Locale.getDefault(), "%d", new Object[]{Integer.valueOf(i2)}));
        aVar.a.setContentDescription(String.format(string, new Object[]{Integer.valueOf(i2)}));
        b bVar = this.a.a2;
        Calendar d = s.d();
        a aVar2 = d.get(1) == i2 ? bVar.f : bVar.d;
        for (Long longValue : this.a.x.i0()) {
            d.setTimeInMillis(longValue.longValue());
            if (d.get(1) == i2) {
                aVar2 = bVar.e;
            }
        }
        aVar2.b(aVar.a);
        aVar.a.setOnClickListener(new t(this, i2));
    }

    public RecyclerView.b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.mtrl_calendar_year, viewGroup, false));
    }
}
