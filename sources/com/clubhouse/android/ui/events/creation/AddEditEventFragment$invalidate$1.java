package com.clubhouse.android.ui.events.creation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.TimePicker;
import androidx.cardview.widget.CardView;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.g3.o.w0.g;
import i0.e.b.g3.o.w0.w;
import j$.time.OffsetDateTime;
import j$.time.ZonedDateTime;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.r.k;

/* compiled from: AddEditEventFragment.kt */
public final class AddEditEventFragment$invalidate$1 extends Lambda implements l<w, i> {
    public final /* synthetic */ AddEditEventFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventFragment$invalidate$1(AddEditEventFragment addEditEventFragment) {
        super(1);
        this.c = addEditEventFragment;
    }

    public Object invoke(Object obj) {
        String str;
        String str2;
        ZonedDateTime zonedDateTime;
        w wVar = (w) obj;
        m0.n.b.i.e(wVar, "state");
        if (wVar.q) {
            AddEditEventFragment addEditEventFragment = this.c;
            k<Object>[] kVarArr = AddEditEventFragment.Z1;
            addEditEventFragment.N0().x.setText(this.c.getResources().getString(R.string.edit_event));
            this.c.N0().w.setText(this.c.getResources().getString(R.string.save));
            Button button = this.c.N0().h;
            m0.n.b.i.d(button, "binding.eventDelete");
            i0.e.b.d3.k.K(button);
        } else {
            AddEditEventFragment addEditEventFragment2 = this.c;
            k<Object>[] kVarArr2 = AddEditEventFragment.Z1;
            addEditEventFragment2.N0().x.setText(this.c.getResources().getString(R.string.new_event));
            this.c.N0().w.setText(this.c.getResources().getString(R.string.publish));
            Button button2 = this.c.N0().h;
            m0.n.b.i.d(button2, "binding.eventDelete");
            i0.e.b.d3.k.p(button2);
        }
        this.c.N0().w.setEnabled(wVar.r);
        this.c.N0().c.g();
        boolean z = true;
        if (wVar.h) {
            CalendarView calendarView = this.c.N0().f;
            m0.n.b.i.d(calendarView, "binding.eventDatePicker");
            if ((calendarView.getVisibility() == 8) && wVar.g != null) {
                this.c.N0().f.setDate(v.m2(wVar.g));
                CalendarView calendarView2 = this.c.N0().f;
                AddEditEventFragment addEditEventFragment3 = this.c;
                Objects.requireNonNull(addEditEventFragment3);
                calendarView2.setOnDateChangeListener(new g(addEditEventFragment3));
            }
        }
        View view = this.c.N0().g;
        m0.n.b.i.d(view, "binding.eventDatePickerDivider");
        i0.e.b.d3.k.L(view, Boolean.valueOf(wVar.h));
        CalendarView calendarView3 = this.c.N0().f;
        m0.n.b.i.d(calendarView3, "binding.eventDatePicker");
        i0.e.b.d3.k.L(calendarView3, Boolean.valueOf(wVar.h));
        TextView textView = this.c.N0().d;
        Resources resources = this.c.getResources();
        boolean z2 = wVar.h;
        int i = R.color.clubhouse_green;
        textView.setTextColor(resources.getColor(z2 ? R.color.clubhouse_green : R.color.clubhouse_eggshell_dark));
        OffsetDateTime offsetDateTime = wVar.g;
        String str3 = null;
        if (offsetDateTime == null) {
            str = null;
        } else {
            Context requireContext = this.c.requireContext();
            m0.n.b.i.d(requireContext, "requireContext()");
            str = v.J1(offsetDateTime, requireContext);
        }
        this.c.N0().d.setText(str);
        if (wVar.i) {
            TimePicker timePicker = this.c.N0().o;
            m0.n.b.i.d(timePicker, "binding.eventTimePicker");
            if (timePicker.getVisibility() == 8) {
                OffsetDateTime offsetDateTime2 = wVar.g;
                if (offsetDateTime2 == null) {
                    zonedDateTime = null;
                } else {
                    zonedDateTime = v.m(offsetDateTime2);
                }
                this.c.N0().o.setCurrentHour(Integer.valueOf(zonedDateTime == null ? 0 : zonedDateTime.getHour()));
                this.c.N0().o.setCurrentMinute(Integer.valueOf(zonedDateTime == null ? 0 : zonedDateTime.getMinute()));
            }
        }
        View view2 = this.c.N0().p;
        m0.n.b.i.d(view2, "binding.eventTimePickerDivider");
        i0.e.b.d3.k.L(view2, Boolean.valueOf(wVar.i));
        TimePicker timePicker2 = this.c.N0().o;
        m0.n.b.i.d(timePicker2, "binding.eventTimePicker");
        i0.e.b.d3.k.L(timePicker2, Boolean.valueOf(wVar.i));
        TextView textView2 = this.c.N0().l;
        Resources resources2 = this.c.getResources();
        if (!wVar.i) {
            i = R.color.clubhouse_eggshell_dark;
        }
        textView2.setTextColor(resources2.getColor(i));
        OffsetDateTime offsetDateTime3 = wVar.g;
        if (offsetDateTime3 == null) {
            str2 = null;
        } else {
            str2 = v.L1(offsetDateTime3);
        }
        this.c.N0().l.setText(str2);
        this.c.N0().v.setChecked(wVar.k);
        this.c.N0().v.setOnCheckedChangeListener(new i0.e.b.g3.o.w0.k(this.c));
        CardView cardView = this.c.N0().q;
        m0.n.b.i.d(cardView, "binding.hostClubEventInfo");
        i0.e.b.d3.k.L(cardView, Boolean.valueOf(!wVar.n.isEmpty()));
        TextView textView3 = this.c.N0().r;
        ClubWithAdmin clubWithAdmin = wVar.m;
        if (clubWithAdmin != null) {
            str3 = clubWithAdmin.y;
        }
        if (str3 == null) {
            str3 = this.c.getString(R.string.none);
        }
        textView3.setText(str3);
        View view3 = this.c.N0().t;
        m0.n.b.i.d(view3, "binding.openToMembersDivider");
        i0.e.b.d3.k.L(view3, Boolean.valueOf(wVar.m != null));
        LinearLayout linearLayout = this.c.N0().u;
        m0.n.b.i.d(linearLayout, "binding.openToMembersRoot");
        if (wVar.m == null) {
            z = false;
        }
        i0.e.b.d3.k.L(linearLayout, Boolean.valueOf(z));
        return i.a;
    }
}
