package i0.e.b.g3.p.b0.x;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.BuddyListUserInClubBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: BuddyListUserInClub.kt */
public abstract class g extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public String k;
    public View.OnClickListener l;

    /* compiled from: BuddyListUserInClub.kt */
    public static final class a extends d {
        public BuddyListUserInClubBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            BuddyListUserInClubBinding bind = BuddyListUserInClubBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final BuddyListUserInClubBinding b() {
            BuddyListUserInClubBinding buddyListUserInClubBinding = this.b;
            if (buddyListUserInClubBinding != null) {
                return buddyListUserInClubBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        AvatarView avatarView = aVar.b().b;
        i.d(avatarView, "holder.binding.avatar");
        v.S0(avatarView, this.k, this.j, 0.0f, 4);
        aVar.b().a.setContentDescription(aVar.b().a.getResources().getString(R.string.cd_club_member_name, new Object[]{this.j}));
        aVar.b().a.setOnClickListener(this.l);
    }
}
