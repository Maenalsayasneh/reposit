package i0.e.b.g3.k.x0;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji.widget.EmojiTextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.databinding.UserInGridBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: ChannelUser.kt */
public abstract class j extends BaseEpoxyModelWithHolder<a> {
    public UserInChannel j;
    public boolean k;
    public View.OnClickListener l;

    /* compiled from: ChannelUser.kt */
    public static final class a extends d {
        public UserInGridBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            UserInGridBinding bind = UserInGridBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final UserInGridBinding b() {
            UserInGridBinding userInGridBinding = this.b;
            if (userInGridBinding != null) {
                return userInGridBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        String str;
        i.e(aVar, "holder");
        TextView textView = aVar.b().d;
        UserInChannel userInChannel = this.j;
        if (userInChannel == null) {
            str = null;
        } else {
            str = userInChannel.c;
        }
        textView.setText(str);
        AvatarView avatarView = aVar.b().b;
        i.d(avatarView, "holder.binding.avatar");
        k.u(avatarView, this.j);
        ConstraintLayout constraintLayout = aVar.b().a;
        i.d(constraintLayout, "holder.binding.root");
        k.H(constraintLayout, aVar.a, this.l);
        EmojiTextView emojiTextView = aVar.b().e;
        i.d(emojiTextView, "holder.binding.startBadge");
        v.p(emojiTextView, this.j);
        ImageView imageView = aVar.b().c;
        i.d(imageView, "holder.binding.endBadge");
        k.d(imageView, Integer.valueOf(R.drawable.ic_raise_hand_nux), this.k, 0, 4);
    }

    public int p(int i, int i2, int i3) {
        return i / 4;
    }

    public int q() {
        return 0;
    }
}
