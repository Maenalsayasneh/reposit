package com.clubhouse.android.ui.channels.viewholder;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.emoji.widget.EmojiTextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.databinding.LargeUserInGridBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.d3.k;
import kotlinx.coroutines.CoroutineStart;
import m0.l.e;
import m0.n.b.i;
import n0.a.g2.c;
import n0.a.g2.d;

/* compiled from: ChannelSpeaker.kt */
public abstract class ChannelSpeaker extends BaseEpoxyModelWithHolder<a> {
    public UserInChannel j;
    public boolean k;
    public d<Boolean> l;
    public d<Boolean> m;
    public View.OnClickListener n;

    /* compiled from: ChannelSpeaker.kt */
    public static final class a extends i0.e.b.a3.f.d {
        public LargeUserInGridBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            LargeUserInGridBinding bind = LargeUserInGridBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final LargeUserInGridBinding b() {
            LargeUserInGridBinding largeUserInGridBinding = this.b;
            if (largeUserInGridBinding != null) {
                return largeUserInGridBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    public ChannelSpeaker() {
        c cVar = c.c;
        this.l = cVar;
        this.m = cVar;
    }

    /* renamed from: K */
    public void k(a aVar) {
        String str;
        a aVar2 = aVar;
        i.e(aVar2, "holder");
        TextView textView = aVar.b().f;
        UserInChannel userInChannel = this.j;
        if (userInChannel == null) {
            str = null;
        } else {
            str = userInChannel.c;
        }
        textView.setText(str);
        ConstraintLayout constraintLayout = aVar.b().a;
        i.d(constraintLayout, "holder.binding.root");
        k.H(constraintLayout, aVar2.a, this.n);
        if (this.k) {
            aVar.b().f.setCompoundDrawablesWithIntrinsicBounds(h0.i.b.a.getDrawable(aVar.b().a.getContext(), R.drawable.ic_moderator), (Drawable) null, (Drawable) null, (Drawable) null);
        } else {
            aVar.b().f.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        AvatarView avatarView = aVar.b().b;
        i.d(avatarView, "holder.binding.avatar");
        k.u(avatarView, this.j);
        m0.r.t.a.r.m.a1.a.E2(aVar2.a, (e) null, (CoroutineStart) null, new ChannelSpeaker$bind$1(this, aVar2, (m0.l.c<? super ChannelSpeaker$bind$1>) null), 3, (Object) null);
        m0.r.t.a.r.m.a1.a.E2(aVar2.a, (e) null, (CoroutineStart) null, new ChannelSpeaker$bind$2(this, aVar2, (m0.l.c<? super ChannelSpeaker$bind$2>) null), 3, (Object) null);
        EmojiTextView emojiTextView = aVar.b().g;
        i.d(emojiTextView, "holder.binding.startBadge");
        v.p(emojiTextView, this.j);
    }

    public int p(int i, int i2, int i3) {
        return i / 3;
    }

    public int q() {
        return 0;
    }
}
