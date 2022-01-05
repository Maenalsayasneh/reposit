package i0.e.b.g3.o.x0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.EventHeaderBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: EventHeader.kt */
public abstract class u extends BaseEpoxyModelWithHolder<a> {
    public String j;

    /* compiled from: EventHeader.kt */
    public static final class a extends d {
        public EventHeaderBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            EventHeaderBinding bind = EventHeaderBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        EventHeaderBinding eventHeaderBinding = aVar.b;
        if (eventHeaderBinding != null) {
            eventHeaderBinding.a.setText(this.j);
        } else {
            i.m("binding");
            throw null;
        }
    }
}
