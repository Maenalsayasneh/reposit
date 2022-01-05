package i0.e.b.g3.o.x0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.EventUserBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: EventUser.kt */
public abstract class a0 extends BaseEpoxyModelWithHolder<a> {
    public UserInList j;
    public View.OnClickListener k;

    /* compiled from: EventUser.kt */
    public static final class a extends d {
        public EventUserBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            EventUserBinding bind = EventUserBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        EventUserBinding eventUserBinding = aVar.b;
        if (eventUserBinding != null) {
            AvatarView avatarView = eventUserBinding.b;
            i.d(avatarView, "holder.binding.avatar");
            k.u(avatarView, this.j);
            EventUserBinding eventUserBinding2 = aVar.b;
            if (eventUserBinding2 != null) {
                eventUserBinding2.a.setOnClickListener(this.k);
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
