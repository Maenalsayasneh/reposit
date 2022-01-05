package i0.h.a.c.l;

import android.widget.BaseAdapter;
import android.widget.TextView;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.datepicker.DateSelector;
import com.google.android.material.datepicker.MaterialCalendarGridView;
import com.google.android.material.datepicker.Month;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: MonthAdapter */
public class m extends BaseAdapter {
    public static final int c = s.e().getMaximum(4);
    public final CalendarConstraints Y1;
    public final Month d;
    public final DateSelector<?> q;
    public Collection<Long> x;
    public b y;

    public m(Month month, DateSelector<?> dateSelector, CalendarConstraints calendarConstraints) {
        this.d = month;
        this.q = dateSelector;
        this.Y1 = calendarConstraints;
        this.x = dateSelector.i0();
    }

    public int a(int i) {
        return b() + (i - 1);
    }

    public int b() {
        return this.d.o();
    }

    /* renamed from: c */
    public Long getItem(int i) {
        if (i < this.d.o() || i > d()) {
            return null;
        }
        Month month = this.d;
        Calendar b = s.b(month.c);
        b.set(5, (i - month.o()) + 1);
        return Long.valueOf(b.getTimeInMillis());
    }

    public int d() {
        return (this.d.o() + this.d.y) - 1;
    }

    public final void e(TextView textView, long j) {
        a aVar;
        if (textView != null) {
            boolean z = false;
            if (this.Y1.q.c0(j)) {
                textView.setEnabled(true);
                Iterator<Long> it = this.q.i0().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    if (s.a(j) == s.a(it.next().longValue())) {
                        z = true;
                        break;
                    }
                }
                if (z) {
                    aVar = this.y.b;
                } else if (s.d().getTimeInMillis() == j) {
                    aVar = this.y.c;
                } else {
                    aVar = this.y.a;
                }
            } else {
                textView.setEnabled(false);
                aVar = this.y.g;
            }
            aVar.b(textView);
        }
    }

    public final void f(MaterialCalendarGridView materialCalendarGridView, long j) {
        if (Month.j(j).equals(this.d)) {
            Calendar b = s.b(this.d.c);
            b.setTimeInMillis(j);
            e((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(b.get(5)) - materialCalendarGridView.getFirstVisiblePosition()), j);
        }
    }

    public int getCount() {
        return b() + this.d.y;
    }

    public long getItemId(int i) {
        return (long) (i / this.d.x);
    }

    /* JADX WARNING: type inference failed for: r10v10, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x00e0  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r9, android.view.View r10, android.view.ViewGroup r11) {
        /*
            r8 = this;
            android.content.Context r0 = r11.getContext()
            i0.h.a.c.l.b r1 = r8.y
            if (r1 != 0) goto L_0x000f
            i0.h.a.c.l.b r1 = new i0.h.a.c.l.b
            r1.<init>(r0)
            r8.y = r1
        L_0x000f:
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r10 != 0) goto L_0x0026
            android.content.Context r10 = r11.getContext()
            android.view.LayoutInflater r10 = android.view.LayoutInflater.from(r10)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_day
            android.view.View r10 = r10.inflate(r0, r11, r1)
            r0 = r10
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0026:
            int r10 = r8.b()
            int r10 = r9 - r10
            if (r10 < 0) goto L_0x00d1
            com.google.android.material.datepicker.Month r11 = r8.d
            int r2 = r11.y
            if (r10 < r2) goto L_0x0036
            goto L_0x00d1
        L_0x0036:
            r2 = 1
            int r10 = r10 + r2
            r0.setTag(r11)
            android.content.res.Resources r11 = r0.getResources()
            android.content.res.Configuration r11 = r11.getConfiguration()
            java.util.Locale r11 = r11.locale
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Integer r4 = java.lang.Integer.valueOf(r10)
            r3[r1] = r4
            java.lang.String r4 = "%d"
            java.lang.String r11 = java.lang.String.format(r11, r4, r3)
            r0.setText(r11)
            com.google.android.material.datepicker.Month r11 = r8.d
            java.util.Calendar r11 = r11.c
            java.util.Calendar r11 = i0.h.a.c.l.s.b(r11)
            r3 = 5
            r11.set(r3, r10)
            long r10 = r11.getTimeInMillis()
            com.google.android.material.datepicker.Month r4 = r8.d
            int r4 = r4.q
            java.util.Calendar r5 = i0.h.a.c.l.s.d()
            r5.set(r3, r2)
            java.util.Calendar r5 = i0.h.a.c.l.s.b(r5)
            r6 = 2
            r5.get(r6)
            int r6 = r5.get(r2)
            r7 = 7
            r5.getMaximum(r7)
            r5.getActualMaximum(r3)
            r5.getTimeInMillis()
            java.lang.String r3 = "UTC"
            if (r4 != r6) goto L_0x00ab
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.util.concurrent.atomic.AtomicReference<i0.h.a.c.l.r> r5 = i0.h.a.c.l.s.a
            java.lang.String r5 = "MMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
            r0.setContentDescription(r10)
            goto L_0x00ca
        L_0x00ab:
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.util.concurrent.atomic.AtomicReference<i0.h.a.c.l.r> r5 = i0.h.a.c.l.s.a
            java.lang.String r5 = "yMMMEd"
            android.icu.text.DateFormat r4 = android.icu.text.DateFormat.getInstanceForSkeleton(r5, r4)
            android.icu.util.TimeZone r3 = android.icu.util.TimeZone.getTimeZone(r3)
            r4.setTimeZone(r3)
            java.util.Date r3 = new java.util.Date
            r3.<init>(r10)
            java.lang.String r10 = r4.format(r3)
            r0.setContentDescription(r10)
        L_0x00ca:
            r0.setVisibility(r1)
            r0.setEnabled(r2)
            goto L_0x00d9
        L_0x00d1:
            r10 = 8
            r0.setVisibility(r10)
            r0.setEnabled(r1)
        L_0x00d9:
            java.lang.Long r9 = r8.getItem(r9)
            if (r9 != 0) goto L_0x00e0
            goto L_0x00e7
        L_0x00e0:
            long r9 = r9.longValue()
            r8.e(r0, r9)
        L_0x00e7:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.l.m.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }

    public boolean hasStableIds() {
        return true;
    }
}
