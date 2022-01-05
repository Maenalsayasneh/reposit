package i0.e.b.g3.o.w0.p0;

import android.view.View;
import android.widget.ImageView;
import com.clubhouse.android.databinding.EventNoHostClubBinding;
import i0.b.a.u;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: EventNoHostClub.kt */
public abstract class m extends u<a> {
    public boolean i;
    public View.OnClickListener j;

    /* compiled from: EventNoHostClub.kt */
    public static final class a extends d {
        public EventNoHostClubBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            EventNoHostClubBinding bind = EventNoHostClubBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: I */
    public void k(a aVar) {
        i.e(aVar, "holder");
        EventNoHostClubBinding eventNoHostClubBinding = aVar.b;
        if (eventNoHostClubBinding != null) {
            ImageView imageView = eventNoHostClubBinding.b;
            i.d(imageView, "holder.binding.selectedIcon");
            k.L(imageView, Boolean.valueOf(this.i));
            EventNoHostClubBinding eventNoHostClubBinding2 = aVar.b;
            if (eventNoHostClubBinding2 != null) {
                eventNoHostClubBinding2.a.setOnClickListener(this.j);
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
