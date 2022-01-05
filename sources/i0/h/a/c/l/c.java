package i0.h.a.c.l;

import android.os.Build;
import android.widget.BaseAdapter;
import java.util.Calendar;

/* compiled from: DaysOfWeekAdapter */
public class c extends BaseAdapter {
    public static final int c = (Build.VERSION.SDK_INT >= 26 ? 4 : 1);
    public final Calendar d;
    public final int q;
    public final int x;

    public c() {
        Calendar e = s.e();
        this.d = e;
        this.q = e.getMaximum(7);
        this.x = e.getFirstDayOfWeek();
    }

    public int getCount() {
        return this.q;
    }

    public Object getItem(int i) {
        int i2 = this.q;
        if (i >= i2) {
            return null;
        }
        int i3 = i + this.x;
        if (i3 > i2) {
            i3 -= i2;
        }
        return Integer.valueOf(i3);
    }

    public long getItemId(int i) {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r7v8, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    @android.annotation.SuppressLint({"WrongConstant"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View getView(int r6, android.view.View r7, android.view.ViewGroup r8) {
        /*
            r5 = this;
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
            r1 = 0
            if (r7 != 0) goto L_0x0017
            android.content.Context r7 = r8.getContext()
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)
            int r0 = com.google.android.material.R.layout.mtrl_calendar_day_of_week
            android.view.View r7 = r7.inflate(r0, r8, r1)
            r0 = r7
            android.widget.TextView r0 = (android.widget.TextView) r0
        L_0x0017:
            java.util.Calendar r7 = r5.d
            int r2 = r5.x
            int r6 = r6 + r2
            int r2 = r5.q
            if (r6 <= r2) goto L_0x0021
            int r6 = r6 - r2
        L_0x0021:
            r2 = 7
            r7.set(r2, r6)
            android.content.res.Resources r6 = r0.getResources()
            android.content.res.Configuration r6 = r6.getConfiguration()
            java.util.Locale r6 = r6.locale
            java.util.Calendar r7 = r5.d
            int r3 = c
            java.lang.String r6 = r7.getDisplayName(r2, r3, r6)
            r0.setText(r6)
            android.content.Context r6 = r8.getContext()
            int r7 = com.google.android.material.R.string.mtrl_picker_day_of_week_column_header
            java.lang.String r6 = r6.getString(r7)
            r7 = 1
            java.lang.Object[] r7 = new java.lang.Object[r7]
            java.util.Calendar r8 = r5.d
            r3 = 2
            java.util.Locale r4 = java.util.Locale.getDefault()
            java.lang.String r8 = r8.getDisplayName(r2, r3, r4)
            r7[r1] = r8
            java.lang.String r6 = java.lang.String.format(r6, r7)
            r0.setContentDescription(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.h.a.c.l.c.getView(int, android.view.View, android.view.ViewGroup):android.view.View");
    }
}
