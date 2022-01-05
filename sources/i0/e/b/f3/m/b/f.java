package i0.e.b.f3.m.b;

import android.content.res.Resources;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.core.ui.R;
import com.clubhouse.core.ui.databinding.ListClubWithMembershipBinding;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: ListClubWithMembership.kt */
public abstract class f extends BaseEpoxyModelWithHolder<a> {
    public Club j;
    public boolean k;
    public View.OnClickListener l;
    public View.OnClickListener m;

    /* compiled from: ListClubWithMembership.kt */
    public static final class a extends d {
        public ListClubWithMembershipBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ListClubWithMembershipBinding bind = ListClubWithMembershipBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ListClubWithMembershipBinding b() {
            ListClubWithMembershipBinding listClubWithMembershipBinding = this.b;
            if (listClubWithMembershipBinding != null) {
                return listClubWithMembershipBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        Resources resources = aVar.b().a.getResources();
        AvatarView avatarView = aVar.b().b.a;
        i.d(avatarView, "holder.binding.club.avatar");
        k.t(avatarView, this.j);
        TextView textView = aVar.b().b.b;
        Club club = this.j;
        textView.setText(club == null ? null : club.getName());
        aVar.b().a.setOnClickListener(this.l);
        aVar.b().d.setOnClickListener(this.l);
        Button button = aVar.b().c;
        i.d(button, "holder.binding.joinButton");
        k.H(button, aVar.a, this.m);
        Button button2 = aVar.b().c;
        i.d(button2, "holder.binding.joinButton");
        k.L(button2, Boolean.valueOf(!this.k));
        Button button3 = aVar.b().d;
        i.d(button3, "holder.binding.memberButton");
        k.L(button3, Boolean.valueOf(this.k));
        Club club2 = this.j;
        if (club2 != null) {
            String quantityString = resources.getQuantityString(R.plurals.num_members, club2.q(), new Object[]{i0.e.b.f3.d.a(club2.q())});
            i.d(quantityString, "resources.getQuantityString(\n                R.plurals.num_members,\n                it.numMembers,\n                it.numMembers.stringForValue()\n            )");
            aVar.b().b.c.setText(quantityString);
        }
    }

    public int o() {
        return R.layout.list_club_with_membership;
    }
}
