package i0.e.b.g3.u.a6;

import android.view.View;
import android.widget.ImageView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ViewClubInProfileBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: ClubInProfile.kt */
public abstract class a extends BaseEpoxyModelWithHolder<C0209a> {
    public String j;
    public String k;
    public boolean l;
    public boolean m;
    public View.OnClickListener n;

    /* renamed from: i0.e.b.g3.u.a6.a$a  reason: collision with other inner class name */
    /* compiled from: ClubInProfile.kt */
    public static final class C0209a extends d {
        public ViewClubInProfileBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ViewClubInProfileBinding bind = ViewClubInProfileBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ViewClubInProfileBinding b() {
            ViewClubInProfileBinding viewClubInProfileBinding = this.b;
            if (viewClubInProfileBinding != null) {
                return viewClubInProfileBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(C0209a aVar) {
        i.e(aVar, "holder");
        AvatarView avatarView = aVar.b().b;
        i.d(avatarView, "holder.binding.avatar");
        v.R0(avatarView, this.k, this.j, 0.88f);
        aVar.b().a.setOnClickListener(this.n);
        aVar.b().a.setContentDescription(aVar.b().a.getResources().getString(R.string.cd_club_name, new Object[]{this.j}));
        ImageView imageView = aVar.b().c;
        i.d(imageView, "holder.binding.endBadge");
        k.d(imageView, Integer.valueOf(R.drawable.ic_club_admin_badge), this.l, 0, 4);
        if (!this.l) {
            ImageView imageView2 = aVar.b().c;
            i.d(imageView2, "holder.binding.endBadge");
            k.d(imageView2, Integer.valueOf(R.drawable.ic_club_leader_badge), this.m, 0, 4);
        }
    }
}
