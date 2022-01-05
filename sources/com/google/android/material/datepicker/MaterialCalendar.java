package com.google.android.material.datepicker;

import android.content.Context;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import h0.v.a.w;
import i0.h.a.c.l.f;
import i0.h.a.c.l.g;
import i0.h.a.c.l.h;
import i0.h.a.c.l.i;
import i0.h.a.c.l.o;
import i0.h.a.c.l.p;
import i0.h.a.c.l.q;
import i0.h.a.c.l.u;

public final class MaterialCalendar<S> extends PickerFragment<S> {
    public static final /* synthetic */ int d = 0;
    public Month Y1;
    public CalendarSelector Z1;
    public i0.h.a.c.l.b a2;
    public RecyclerView b2;
    public RecyclerView c2;
    public View d2;
    public View e2;
    public int q;
    public DateSelector<S> x;
    public CalendarConstraints y;

    public enum CalendarSelector {
        DAY,
        YEAR
    }

    public class a implements Runnable {
        public final /* synthetic */ int c;

        public a(int i) {
            this.c = i;
        }

        public void run() {
            MaterialCalendar.this.c2.smoothScrollToPosition(this.c);
        }
    }

    public class b extends h0.i.i.a {
        public b(MaterialCalendar materialCalendar) {
        }

        public void onInitializeAccessibilityNodeInfo(View view, h0.i.i.g0.b bVar) {
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            bVar.i((Object) null);
        }
    }

    public class c extends q {
        public final /* synthetic */ int a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            this.a = i2;
        }

        public void calculateExtraLayoutSpace(RecyclerView.y yVar, int[] iArr) {
            if (this.a == 0) {
                iArr[0] = MaterialCalendar.this.c2.getWidth();
                iArr[1] = MaterialCalendar.this.c2.getWidth();
                return;
            }
            iArr[0] = MaterialCalendar.this.c2.getHeight();
            iArr[1] = MaterialCalendar.this.c2.getHeight();
        }
    }

    public class d implements e {
        public d() {
        }
    }

    public interface e {
    }

    public boolean I0(p<S> pVar) {
        return this.c.add(pVar);
    }

    public LinearLayoutManager J0() {
        return (LinearLayoutManager) this.c2.getLayoutManager();
    }

    public final void K0(int i) {
        this.c2.post(new a(i));
    }

    public void L0(Month month) {
        o oVar = (o) this.c2.getAdapter();
        int t = oVar.b.c.t(month);
        int c3 = t - oVar.c(this.Y1);
        boolean z = true;
        boolean z2 = Math.abs(c3) > 3;
        if (c3 <= 0) {
            z = false;
        }
        this.Y1 = month;
        if (z2 && z) {
            this.c2.scrollToPosition(t - 3);
            K0(t);
        } else if (z2) {
            this.c2.scrollToPosition(t + 3);
            K0(t);
        } else {
            K0(t);
        }
    }

    public void M0(CalendarSelector calendarSelector) {
        this.Z1 = calendarSelector;
        if (calendarSelector == CalendarSelector.YEAR) {
            this.b2.getLayoutManager().scrollToPosition(((u) this.b2.getAdapter()).b(this.Y1.q));
            this.d2.setVisibility(0);
            this.e2.setVisibility(8);
        } else if (calendarSelector == CalendarSelector.DAY) {
            this.d2.setVisibility(8);
            this.e2.setVisibility(0);
            L0(this.Y1);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.q = bundle.getInt("THEME_RES_ID_KEY");
        this.x = (DateSelector) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.y = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.Y1 = (Month) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.q);
        this.a2 = new i0.h.a.c.l.b(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        Month month = this.y.c;
        if (MaterialDatePicker.R0(contextThemeWrapper)) {
            i2 = R.layout.mtrl_calendar_vertical;
            i = 1;
        } else {
            i2 = R.layout.mtrl_calendar_horizontal;
            i = 0;
        }
        View inflate = cloneInContext.inflate(i2, viewGroup, false);
        GridView gridView = (GridView) inflate.findViewById(R.id.mtrl_calendar_days_of_week);
        h0.i.i.q.p(gridView, new b(this));
        gridView.setAdapter(new i0.h.a.c.l.c());
        gridView.setNumColumns(month.x);
        gridView.setEnabled(false);
        this.c2 = (RecyclerView) inflate.findViewById(R.id.mtrl_calendar_months);
        this.c2.setLayoutManager(new c(getContext(), i, false, i));
        this.c2.setTag("MONTHS_VIEW_GROUP_TAG");
        o oVar = new o(contextThemeWrapper, this.x, this.y, new d());
        this.c2.setAdapter(oVar);
        int integer = contextThemeWrapper.getResources().getInteger(R.integer.mtrl_calendar_year_selector_span);
        int i3 = R.id.mtrl_calendar_year_selector_frame;
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(i3);
        this.b2 = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.b2.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.b2.setAdapter(new u(this));
            this.b2.addItemDecoration(new i0.h.a.c.l.d(this));
        }
        int i4 = R.id.month_navigation_fragment_toggle;
        if (inflate.findViewById(i4) != null) {
            MaterialButton materialButton = (MaterialButton) inflate.findViewById(i4);
            materialButton.setTag("SELECTOR_TOGGLE_TAG");
            h0.i.i.q.p(materialButton, new i0.h.a.c.l.e(this));
            MaterialButton materialButton2 = (MaterialButton) inflate.findViewById(R.id.month_navigation_previous);
            materialButton2.setTag("NAVIGATION_PREV_TAG");
            MaterialButton materialButton3 = (MaterialButton) inflate.findViewById(R.id.month_navigation_next);
            materialButton3.setTag("NAVIGATION_NEXT_TAG");
            this.d2 = inflate.findViewById(i3);
            this.e2 = inflate.findViewById(R.id.mtrl_calendar_day_selector_frame);
            M0(CalendarSelector.DAY);
            materialButton.setText(this.Y1.r(inflate.getContext()));
            this.c2.addOnScrollListener(new f(this, oVar, materialButton));
            materialButton.setOnClickListener(new g(this));
            materialButton3.setOnClickListener(new h(this, oVar));
            materialButton2.setOnClickListener(new i(this, oVar));
        }
        if (!MaterialDatePicker.R0(contextThemeWrapper)) {
            new w().a(this.c2);
        }
        this.c2.scrollToPosition(oVar.c(this.Y1));
        return inflate;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.q);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.x);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.y);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.Y1);
    }
}
