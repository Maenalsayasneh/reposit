package i0.e.b.g3.p.c0.e0;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ViewChannelBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.UserInRoom;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import m0.n.b.i;

/* compiled from: ChannelView.kt */
public abstract class m extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public String k;
    public String l;
    public String m;
    public UserInRoom n;
    public UserInRoom o;
    public List<? extends UserInRoom> p = EmptyList.c;
    public AudienceType q;
    public String r;
    public boolean s;
    public View.OnClickListener t;
    public View.OnClickListener u;
    public View.OnLongClickListener v;

    /* compiled from: ChannelView.kt */
    public static final class a extends d {
        public ViewChannelBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ViewChannelBinding bind = ViewChannelBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ViewChannelBinding b() {
            ViewChannelBinding viewChannelBinding = this.b;
            if (viewChannelBinding != null) {
                return viewChannelBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        aVar.b().c.setText(this.j);
        TextView textView = aVar.b().c;
        i.d(textView, "holder.binding.clubName");
        String str = this.j;
        boolean z = true;
        k.q(textView, Boolean.valueOf(str == null || str.length() == 0));
        TextView textView2 = aVar.b().f;
        String str2 = this.k;
        if (str2 == null) {
            str2 = "";
        }
        textView2.setText(str2);
        TextView textView3 = aVar.b().f;
        i.d(textView3, "holder.binding.name");
        String str3 = this.k;
        k.q(textView3, Boolean.valueOf(str3 == null || str3.length() == 0));
        ImageView imageView = aVar.b().h;
        i.d(imageView, "holder.binding.overflowIcon");
        k.L(imageView, Boolean.valueOf(this.s));
        aVar.b().j.setText(this.l);
        aVar.b().i.setText(this.m);
        AvatarView avatarView = aVar.b().d;
        i.d(avatarView, "holder.binding.moderator1");
        L(avatarView, this.n);
        AvatarView avatarView2 = aVar.b().e;
        i.d(avatarView2, "holder.binding.moderator2");
        L(avatarView2, this.o);
        aVar.b().g.removeAllViews();
        for (UserInRoom userInRoom : this.p) {
            View inflate = LayoutInflater.from(aVar.b().a.getContext()).inflate(R.layout.view_channel_member, aVar.b().g, false);
            Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
            TextView textView4 = (TextView) inflate;
            textView4.setText(userInRoom.getName());
            if (userInRoom.M()) {
                k.e(textView4, 0, 0, R.drawable.ic_speaker_white, 0, 11);
            } else {
                k.e(textView4, 0, 0, 0, 0, 11);
            }
            aVar.b().g.addView(textView4);
        }
        AudienceType audienceType = this.q;
        if (audienceType != null) {
            if (!(audienceType == AudienceType.Closed || audienceType == AudienceType.Social)) {
                z = false;
            }
            if (z) {
                aVar.b().b.setImageResource(audienceType.getActionIcon());
            }
            ImageView imageView2 = aVar.b().b;
            i.d(imageView2, "holder.binding.closedChannelIcon");
            k.L(imageView2, Boolean.valueOf(z));
        }
        String str4 = this.r;
        if (str4 != null) {
            aVar.b().a.setContentDescription(str4);
        }
        aVar.b().a.setOnClickListener(this.t);
        aVar.b().a.setOnLongClickListener(this.v);
        aVar.b().h.setOnClickListener(this.u);
    }

    public final void L(AvatarView avatarView, UserInRoom userInRoom) {
        String str;
        String name;
        k.L(avatarView, Boolean.valueOf(userInRoom != null));
        if (!(userInRoom == null || (name = userInRoom.getName()) == null)) {
            avatarView.setText(AvatarView.c.a(name));
        }
        if (userInRoom == null) {
            str = null;
        } else {
            str = userInRoom.b();
        }
        v.Q0(avatarView, str);
    }
}
