package i0.e.b.g3.w.j0;

import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.clubhouse.android.channels.model.AudienceType;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ExploreChannelBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.UserInRoom;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import java.util.Objects;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.i;

/* compiled from: ChannelInExplore.kt */
public abstract class e extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public String k;
    public String l;
    public String m;
    public UserInRoom n;
    public UserInRoom o;
    public AudienceType p;
    public View.OnClickListener q;

    /* compiled from: ChannelInExplore.kt */
    public static final class a extends d {
        public ExploreChannelBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ExploreChannelBinding bind = ExploreChannelBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ExploreChannelBinding b() {
            ExploreChannelBinding exploreChannelBinding = this.b;
            if (exploreChannelBinding != null) {
                return exploreChannelBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        boolean z = true;
        if (this.j != null) {
            aVar.b().c.setText(this.j);
            TextView textView = aVar.b().c;
            i.d(textView, "holder.binding.clubName");
            k.a(textView);
            TextView textView2 = aVar.b().c;
            i.d(textView2, "holder.binding.clubName");
            String str = this.j;
            k.q(textView2, Boolean.valueOf(str == null || str.length() == 0));
        }
        AvatarView avatarView = aVar.b().d;
        i.d(avatarView, "holder.binding.moderator1");
        L(avatarView, this.n);
        AvatarView avatarView2 = aVar.b().e;
        i.d(avatarView2, "holder.binding.moderator2");
        L(avatarView2, this.o);
        aVar.b().g.removeAllViews();
        String str2 = this.k;
        if (str2 == null || StringsKt__IndentKt.o(str2)) {
            TextView textView3 = aVar.b().f;
            i.d(textView3, "holder.binding.name");
            k.p(textView3);
            for (UserInRoom userInRoom : g.K(this.n, this.o)) {
                if (userInRoom != null) {
                    View inflate = LayoutInflater.from(aVar.b().a.getContext()).inflate(R.layout.view_channel_member, aVar.b().g, false);
                    Objects.requireNonNull(inflate, "null cannot be cast to non-null type android.widget.TextView");
                    TextView textView4 = (TextView) inflate;
                    textView4.setText(userInRoom.getName());
                    k.e(textView4, 0, 0, R.drawable.ic_speaker_white, 0, 11);
                    aVar.b().g.addView(textView4);
                }
            }
        } else {
            aVar.b().f.setText(this.k);
        }
        aVar.b().i.setText(this.l);
        aVar.b().h.setText(this.m);
        AudienceType audienceType = this.p;
        if (audienceType != null) {
            if (!(audienceType == AudienceType.Closed || audienceType == AudienceType.Social || audienceType == AudienceType.Club)) {
                z = false;
            }
            if (z) {
                aVar.b().b.setImageResource(audienceType.getActionIcon());
            }
            ImageView imageView = aVar.b().b;
            i.d(imageView, "holder.binding.closedChannelIcon");
            k.L(imageView, Boolean.valueOf(z));
        }
        aVar.b().a.setOnClickListener(this.q);
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
