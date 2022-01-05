package i0.e.b.g3.p.c0.e0;

import android.view.View;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.databinding.HallwayEventBinding;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import j$.time.OffsetDateTime;
import m0.n.b.i;

/* compiled from: HallwayEventView.kt */
public abstract class g0 extends BaseEpoxyModelWithHolder<a> {
    public EventInClub j;
    public boolean k;
    public View.OnClickListener l;

    /* compiled from: HallwayEventView.kt */
    public static final class a extends d {
        public HallwayEventBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            HallwayEventBinding bind = HallwayEventBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final HallwayEventBinding b() {
            HallwayEventBinding hallwayEventBinding = this.b;
            if (hallwayEventBinding != null) {
                return hallwayEventBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        String str;
        String str2;
        i.e(aVar, "holder");
        EventInClub eventInClub = this.j;
        if (eventInClub != null) {
            TextView textView = aVar.b().d;
            OffsetDateTime offsetDateTime = eventInClub.c2;
            String str3 = null;
            if (offsetDateTime == null) {
                str = null;
            } else {
                str = v.L1(offsetDateTime);
            }
            textView.setText(str);
            aVar.b().e.setText(eventInClub.a2);
            TextView textView2 = aVar.b().a;
            ClubWithAdmin clubWithAdmin = eventInClub.c;
            if (clubWithAdmin == null) {
                str2 = null;
            } else {
                str2 = clubWithAdmin.y;
            }
            textView2.setText(str2);
            TextView textView3 = aVar.b().a;
            i.d(textView3, "holder.binding.club");
            ClubWithAdmin clubWithAdmin2 = eventInClub.c;
            if (clubWithAdmin2 != null) {
                str3 = clubWithAdmin2.y;
            }
            k.q(textView3, Boolean.valueOf(str3 == null || str3.length() == 0));
        }
        TextView textView4 = aVar.b().b;
        i.d(textView4, "holder.binding.confirmedToAttend");
        k.L(textView4, Boolean.valueOf(this.k));
        aVar.b().c.setOnClickListener(this.l);
    }
}
