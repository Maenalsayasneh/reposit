package i0.e.b.g3.o.w0.p0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.EventCoHostBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: EventCoHost.kt */
public abstract class a extends BaseEpoxyModelWithHolder<C0205a> {
    public UserInList j;
    public boolean k;
    public View.OnClickListener l;

    /* renamed from: i0.e.b.g3.o.w0.p0.a$a  reason: collision with other inner class name */
    /* compiled from: EventCoHost.kt */
    public static final class C0205a extends d {
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
    public void k(C0205a aVar) {
        i.e(aVar, "holder");
        TextView textView = aVar.b().e;
        i.d(textView, "holder.binding.eventCoHostWith");
        textView.setVisibility(this.k ^ true ? 4 : 0);
        ImageView imageView = aVar.b().c;
        i.d(imageView, "holder.binding.eventCoHostRemove");
        imageView.setVisibility(this.k ^ true ? 0 : 8);
        UserInList userInList = this.j;
        if (userInList != null) {
            AvatarView avatarView = aVar.b().f;
            i.d(avatarView, "holder.binding.eventCoHostWithAvatar");
            k.u(avatarView, userInList);
            aVar.b().b.setText(userInList.y);
            aVar.b().d.setOnClickListener(this.l);
        }
        View view = aVar.b().a;
        i.d(view, "holder.binding.eventCoHostDivider");
        view.setVisibility(0);
        aVar.b().c.setOnClickListener(this.l);
    }

    public int q() {
        return 0;
    }
}
