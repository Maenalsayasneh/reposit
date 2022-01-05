package i0.e.b.f3.m.b;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.core.ui.R;
import com.clubhouse.core.ui.databinding.ViewListClubBinding;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: ListClub.kt */
public abstract class d extends BaseEpoxyModelWithHolder<a> {
    public Club j;
    public boolean k;
    public boolean l;
    public boolean m;
    public View.OnClickListener n;

    /* compiled from: ListClub.kt */
    public static final class a extends i0.e.b.a3.f.d {
        public ViewListClubBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ViewListClubBinding bind = ViewListClubBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ViewListClubBinding b() {
            ViewListClubBinding viewListClubBinding = this.b;
            if (viewListClubBinding != null) {
                return viewListClubBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        Club club;
        i.e(aVar, "holder");
        Resources resources = aVar.b().a.getResources();
        AvatarView avatarView = aVar.b().c.a;
        i.d(avatarView, "holder.binding.club.avatar");
        k.t(avatarView, this.j);
        TextView textView = aVar.b().c.b;
        Club club2 = this.j;
        textView.setText(club2 == null ? null : club2.getName());
        aVar.b().a.setOnClickListener(this.n);
        TextView textView2 = aVar.b().c.c;
        i.d(textView2, "holder.binding.club.socialProof");
        int i = 8;
        textView2.setVisibility(this.k ? 0 : 8);
        ImageView imageView = aVar.b().b;
        i.d(imageView, "holder.binding.arrow");
        imageView.setVisibility(!this.k && !this.l ? 0 : 8);
        ImageView imageView2 = aVar.b().d;
        i.d(imageView2, "holder.binding.selectButton");
        if (this.l) {
            i = 0;
        }
        imageView2.setVisibility(i);
        if (this.k && (club = this.j) != null) {
            String quantityString = aVar.b().a.getContext().getResources().getQuantityString(R.plurals.num_members, club.q(), new Object[]{i0.e.b.f3.d.a(club.q())});
            i.d(quantityString, "resources.getQuantityString(\n                    R.plurals.num_members,\n                    it.numMembers,\n                    it.numMembers.stringForValue()\n                )");
            aVar.b().c.c.setText(quantityString);
        }
        if (this.m) {
            aVar.b().d.setImageResource(R.drawable.checkbox_filled);
            aVar.b().a.setContentDescription(resources.getString(R.string.cd_club_suggestion_selected, new Object[]{aVar.b().c.b.getText()}));
            return;
        }
        aVar.b().d.setImageResource(R.drawable.ic_button_add_participant);
        aVar.b().a.setContentDescription(resources.getString(R.string.cd_club_suggestion_unselected, new Object[]{aVar.b().c.b.getText()}));
    }

    public int o() {
        return R.layout.view_list_club;
    }
}
