package i0.e.b.g3.p.c0.e0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.EventUserMediumBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: EventUserSuggestion.kt */
public abstract class y extends BaseEpoxyModelWithHolder<a> {
    public UserInList j;

    /* compiled from: EventUserSuggestion.kt */
    public static final class a extends d {
        public EventUserMediumBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            EventUserMediumBinding bind = EventUserMediumBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        EventUserMediumBinding eventUserMediumBinding = aVar.b;
        if (eventUserMediumBinding != null) {
            AvatarView avatarView = eventUserMediumBinding.a;
            i.d(avatarView, "holder.binding.avatar");
            k.u(avatarView, this.j);
            return;
        }
        i.m("binding");
        throw null;
    }
}
