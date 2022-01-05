package i0.e.b.g3.o.x0;

import android.view.View;
import com.clubhouse.android.databinding.EventClubHeaderBinding;
import i0.b.a.u;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: EventClubHeader.kt */
public abstract class l extends u<a> {
    public String i;
    public View.OnClickListener j;

    /* compiled from: EventClubHeader.kt */
    public static final class a extends d {
        public EventClubHeaderBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            EventClubHeaderBinding bind = EventClubHeaderBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: I */
    public void k(a aVar) {
        i.e(aVar, "holder");
        EventClubHeaderBinding eventClubHeaderBinding = aVar.b;
        if (eventClubHeaderBinding != null) {
            eventClubHeaderBinding.c.setText(this.i);
            EventClubHeaderBinding eventClubHeaderBinding2 = aVar.b;
            if (eventClubHeaderBinding2 != null) {
                eventClubHeaderBinding2.a.setOnClickListener(this.j);
            } else {
                i.m("binding");
                throw null;
            }
        } else {
            i.m("binding");
            throw null;
        }
    }
}
