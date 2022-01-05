package i0.e.b.g3.q.r;

import android.content.res.Resources;
import android.net.Uri;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.SuggestedInvite;
import com.clubhouse.android.databinding.InviteItemBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.ui.invites.viewholder.Type;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: InviteItem.kt */
public abstract class a extends BaseEpoxyModelWithHolder<C0206a> {
    public Type j = Type.INVITE;
    public SuggestedInvite k;
    public View.OnClickListener l;

    /* renamed from: i0.e.b.g3.q.r.a$a  reason: collision with other inner class name */
    /* compiled from: InviteItem.kt */
    public static final class C0206a extends d {
        public InviteItemBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            InviteItemBinding bind = InviteItemBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final InviteItemBinding b() {
            InviteItemBinding inviteItemBinding = this.b;
            if (inviteItemBinding != null) {
                return inviteItemBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(C0206a aVar) {
        String str;
        String str2;
        i.e(aVar, "holder");
        Resources resources = aVar.b().a.getResources();
        SuggestedInvite suggestedInvite = this.k;
        boolean z = false;
        if (suggestedInvite != null) {
            String str3 = suggestedInvite.y;
            if (str3 == null || str3.length() == 0) {
                str2 = suggestedInvite.c;
            } else {
                str2 = suggestedInvite.y;
            }
            AvatarView avatarView = aVar.b().b;
            i.d(avatarView, "holder.binding.avatar");
            v.S0(avatarView, Uri.decode(suggestedInvite.Y1), str2, 0.0f, 4);
            aVar.b().f.setText(str2);
        }
        int ordinal = this.j.ordinal();
        if (ordinal == 0) {
            SuggestedInvite suggestedInvite2 = this.k;
            if (suggestedInvite2 != null) {
                TextView textView = aVar.b().c;
                if (suggestedInvite2.d) {
                    str = resources.getString(R.string.already_on_clubhouse);
                } else {
                    int i = suggestedInvite2.x;
                    str = resources.getQuantityString(R.plurals.friends_on_clubhouse, i, new Object[]{Integer.valueOf(i)});
                }
                textView.setText(str);
                Button button = aVar.b().d;
                i.d(button, "holder.binding.inviteButton");
                if (suggestedInvite2.d || suggestedInvite2.q) {
                    z = true;
                }
                k.q(button, Boolean.valueOf(z));
                TextView textView2 = aVar.b().e;
                i.d(textView2, "holder.binding.joined");
                k.L(textView2, Boolean.valueOf(suggestedInvite2.d));
            }
            aVar.b().d.setText(resources.getString(R.string.invite));
        } else if (ordinal == 1) {
            aVar.b().c.setText(resources.getString(R.string.already_invited));
            aVar.b().d.setText(resources.getString(R.string.send_reminder));
        }
        Button button2 = aVar.b().d;
        i.d(button2, "holder.binding.inviteButton");
        k.H(button2, aVar.a, this.l);
    }

    public int o() {
        return R.layout.invite_item;
    }
}
