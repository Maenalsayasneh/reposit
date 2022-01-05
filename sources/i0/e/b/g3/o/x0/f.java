package i0.e.b.g3.o.x0;

import android.view.View;
import android.widget.ImageView;
import com.clubhouse.android.databinding.EventClubActionBinding;
import i0.b.a.u;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: EventClubAction.kt */
public abstract class f extends u<a> {
    public Integer i;
    public String j;
    public String k;
    public View.OnClickListener l;

    /* compiled from: EventClubAction.kt */
    public static final class a extends d {
        public EventClubActionBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            EventClubActionBinding bind = EventClubActionBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final EventClubActionBinding b() {
            EventClubActionBinding eventClubActionBinding = this.b;
            if (eventClubActionBinding != null) {
                return eventClubActionBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: I */
    public void k(a aVar) {
        i.e(aVar, "holder");
        ImageView imageView = aVar.b().c;
        Integer num = this.i;
        i.c(num);
        imageView.setImageResource(num.intValue());
        aVar.b().d.setText(this.j);
        aVar.b().b.setText(this.k);
        aVar.b().a.setOnClickListener(this.l);
    }
}
