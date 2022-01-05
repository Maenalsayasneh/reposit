package i0.h.a.c.b0;

import com.google.android.material.R;
import com.google.android.material.chip.Chip;
import com.google.android.material.timepicker.ClockHandView;
import com.google.android.material.timepicker.TimeModel;
import com.google.android.material.timepicker.TimePickerView;
import h0.i.i.q;
import io.sentry.SentryClient;
import java.util.Locale;

/* compiled from: TimePickerClockPresenter */
public class f implements ClockHandView.d, TimePickerView.d, TimePickerView.c, ClockHandView.c, g {
    public static final String[] c = {"12", "1", "2", "3", "4", "5", "6", SentryClient.SENTRY_PROTOCOL_VERSION, "8", "9", "10", "11"};
    public static final String[] d = {"00", "2", "4", "6", "8", "10", "12", "14", "16", "18", "20", "22"};
    public static final String[] q = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};
    public float Y1;
    public float Z1;
    public boolean a2 = false;
    public TimePickerView x;
    public TimeModel y;

    public f(TimePickerView timePickerView, TimeModel timeModel) {
        this.x = timePickerView;
        this.y = timeModel;
        if (timeModel.q == 0) {
            timePickerView.r2.setVisibility(0);
        }
        this.x.p2.a2.add(this);
        TimePickerView timePickerView2 = this.x;
        timePickerView2.u2 = this;
        timePickerView2.t2 = this;
        timePickerView2.p2.i2 = this;
        h(c, "%d");
        h(d, "%d");
        h(q, "%02d");
        J();
    }

    public void J() {
        this.Z1 = (float) (e() * this.y.c());
        TimeModel timeModel = this.y;
        this.Y1 = (float) (timeModel.y * 6);
        f(timeModel.Y1, false);
        g();
    }

    public void a() {
        this.x.setVisibility(0);
    }

    public void b(float f, boolean z) {
        if (!this.a2) {
            TimeModel timeModel = this.y;
            int i = timeModel.x;
            int i2 = timeModel.y;
            int round = Math.round(f);
            TimeModel timeModel2 = this.y;
            if (timeModel2.Y1 == 12) {
                int i3 = ((round + 3) / 6) % 60;
                timeModel2.y = i3;
                this.Y1 = (float) Math.floor((double) (i3 * 6));
            } else {
                this.y.d((round + (e() / 2)) / e());
                this.Z1 = (float) (e() * this.y.c());
            }
            if (!z) {
                g();
                TimeModel timeModel3 = this.y;
                if (timeModel3.y != i2 || timeModel3.x != i) {
                    this.x.performHapticFeedback(4);
                }
            }
        }
    }

    public void c(int i) {
        f(i, true);
    }

    public void d() {
        this.x.setVisibility(8);
    }

    public final int e() {
        return this.y.q == 1 ? 15 : 30;
    }

    public void f(int i, boolean z) {
        String[] strArr;
        boolean z2 = false;
        boolean z3 = i == 12;
        TimePickerView timePickerView = this.x;
        timePickerView.p2.q = z3;
        TimeModel timeModel = this.y;
        timeModel.Y1 = i;
        if (z3) {
            strArr = q;
        } else {
            strArr = timeModel.q == 1 ? d : c;
        }
        timePickerView.q2.v(strArr, z3 ? R.string.material_minute_suffix : R.string.material_hour_suffix);
        this.x.p2.b(z3 ? this.Y1 : this.Z1, z);
        TimePickerView timePickerView2 = this.x;
        timePickerView2.n2.setChecked(i == 12);
        Chip chip = timePickerView2.o2;
        if (i == 10) {
            z2 = true;
        }
        chip.setChecked(z2);
        q.p(this.x.o2, new a(this.x.getContext(), R.string.material_hour_selection));
        q.p(this.x.n2, new a(this.x.getContext(), R.string.material_minute_selection));
    }

    public final void g() {
        TimePickerView timePickerView = this.x;
        TimeModel timeModel = this.y;
        int i = timeModel.Z1;
        int c2 = timeModel.c();
        int i2 = this.y.y;
        timePickerView.r2.b(i == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", new Object[]{Integer.valueOf(i2)});
        String format2 = String.format(locale, "%02d", new Object[]{Integer.valueOf(c2)});
        timePickerView.n2.setText(format);
        timePickerView.o2.setText(format2);
    }

    public final void h(String[] strArr, String str) {
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = TimeModel.a(this.x.getResources(), strArr[i], str);
        }
    }
}
