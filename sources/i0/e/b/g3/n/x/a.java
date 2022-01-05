package i0.e.b.g3.n.x;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ChannelCreationAudienceBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import h0.b0.v;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: ChannelAudience.kt */
public abstract class a extends BaseEpoxyModelWithHolder<C0204a> {
    public boolean j;
    public String k;
    public String l;
    public int m;
    public String n;
    public View.OnClickListener o;

    /* renamed from: i0.e.b.g3.n.x.a$a  reason: collision with other inner class name */
    /* compiled from: ChannelAudience.kt */
    public static final class C0204a extends d {
        public ChannelCreationAudienceBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ChannelCreationAudienceBinding bind = ChannelCreationAudienceBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ChannelCreationAudienceBinding b() {
            ChannelCreationAudienceBinding channelCreationAudienceBinding = this.b;
            if (channelCreationAudienceBinding != null) {
                return channelCreationAudienceBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(C0204a aVar) {
        m0.i iVar;
        i.e(aVar, "holder");
        aVar.b().c.setText(this.k);
        aVar.b().a.setSelected(this.j);
        aVar.b().a.setOnClickListener(this.o);
        aVar.b().a.setContentDescription(this.l);
        String str = this.n;
        if (str == null) {
            iVar = null;
        } else {
            AvatarView avatarView = aVar.b().b;
            i.d(avatarView, "holder.binding.icon");
            v.Q0(avatarView, str);
            iVar = m0.i.a;
        }
        if (iVar == null) {
            aVar.b().b.setText(AvatarView.c.a(this.k));
            aVar.b().b.setImageResource(this.m);
        }
    }

    public int p(int i, int i2, int i3) {
        return i / 3;
    }
}
