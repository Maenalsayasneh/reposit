package i0.e.b.g3.o.w0.p0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.databinding.EventHostClubBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import i0.b.a.u;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: EventHostClub.kt */
public abstract class g extends u<a> {
    public Club i;
    public boolean j;
    public View.OnClickListener k;

    /* compiled from: EventHostClub.kt */
    public static final class a extends d {
        public EventHostClubBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            EventHostClubBinding bind = EventHostClubBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final EventHostClubBinding b() {
            EventHostClubBinding eventHostClubBinding = this.b;
            if (eventHostClubBinding != null) {
                return eventHostClubBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: I */
    public void k(a aVar) {
        String name;
        i.e(aVar, "holder");
        AvatarView avatarView = aVar.b().b;
        i.d(avatarView, "holder.binding.eventHostClubAvatar");
        k.t(avatarView, this.i);
        TextView textView = aVar.b().c;
        Club club = this.i;
        String str = "";
        if (!(club == null || (name = club.getName()) == null)) {
            str = name;
        }
        textView.setText(str);
        ImageView imageView = aVar.b().d;
        i.d(imageView, "holder.binding.selectedIcon");
        k.L(imageView, Boolean.valueOf(this.j));
        aVar.b().a.setOnClickListener(this.k);
    }
}
