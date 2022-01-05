package i0.e.b.g3.o.w0.p0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.EventCoHostBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.UserSelf;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: EventCurrentUser.kt */
public abstract class d extends BaseEpoxyModelWithHolder<a> {
    public UserSelf j;

    /* compiled from: EventCurrentUser.kt */
    public static final class a extends i0.e.b.a3.f.d {
        public EventCoHostBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            EventCoHostBinding bind = EventCoHostBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final EventCoHostBinding b() {
            EventCoHostBinding eventCoHostBinding = this.b;
            if (eventCoHostBinding != null) {
                return eventCoHostBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        TextView textView = aVar.b().e;
        i.d(textView, "holder.binding.eventCoHostWith");
        k.K(textView);
        ImageView imageView = aVar.b().c;
        i.d(imageView, "holder.binding.eventCoHostRemove");
        k.p(imageView);
        UserSelf userSelf = this.j;
        if (userSelf != null) {
            AvatarView avatarView = aVar.b().f;
            i.d(avatarView, "holder.binding.eventCoHostWithAvatar");
            k.v(avatarView, userSelf);
            aVar.b().b.setText(userSelf.b);
        }
    }

    public int q() {
        return 0;
    }
}
