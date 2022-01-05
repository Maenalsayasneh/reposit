package i0.e.b.g3.k.x0;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.channel.Channel;
import com.clubhouse.android.data.models.local.channel.ChannelInRoom;
import com.clubhouse.android.data.models.local.club.Club;
import com.clubhouse.android.databinding.ChannelHeaderBinding;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: ChannelHeader.kt */
public abstract class e extends BaseEpoxyModelWithHolder<a> {
    public Channel j;
    public View.OnClickListener k;
    public View.OnClickListener l;

    /* compiled from: ChannelHeader.kt */
    public static final class a extends d {
        public ChannelHeaderBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ChannelHeaderBinding bind = ChannelHeaderBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ChannelHeaderBinding b() {
            ChannelHeaderBinding channelHeaderBinding = this.b;
            if (channelHeaderBinding != null) {
                return channelHeaderBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        Club i;
        String name;
        Club i2;
        int i3;
        i.e(aVar, "holder");
        TextView textView = aVar.b().c;
        i.d(textView, "holder.binding.channelName");
        Channel channel = this.j;
        String str = null;
        k.L(textView, Boolean.valueOf((channel == null ? null : channel.u0()) != null));
        TextView textView2 = aVar.b().c;
        Channel channel2 = this.j;
        textView2.setText(channel2 == null ? null : channel2.u0());
        aVar.b().f.setOnClickListener(this.l);
        Channel channel3 = this.j;
        if (channel3 != null) {
            if (v.G0(channel3)) {
                ImageView imageView = aVar.b().b;
                i.d(imageView, "holder.binding.audienceIcon");
                k.p(imageView);
            } else {
                ImageView imageView2 = aVar.b().b;
                i.d(imageView2, "holder.binding.audienceIcon");
                k.K(imageView2);
                ImageView imageView3 = aVar.b().b;
                imageView3.setImageResource(v.o(channel3).getActionIcon());
                i.d(imageView3, "");
                if (!(channel3 instanceof ChannelInRoom) || channel3.p0() == null) {
                    i3 = v.o(channel3).getTooltip();
                } else {
                    i3 = R.string.welcome_room_tooltip;
                }
                i.e(imageView3, "<this>");
                g0.a.b.b.a.y0(imageView3, imageView3.getResources().getString(i3));
                imageView3.setOnClickListener(new a(imageView3));
                i.d(imageView3, "{\n                holder.binding.audienceIcon.show()\n                holder.binding.audienceIcon.apply {\n                    setImageResource(it.audienceType().actionIcon)\n                    setTooltip(getTooltip(it))\n                    setOnClickListener { performLongClick() } // show tooltip\n                }\n            }");
            }
        }
        FrameLayout frameLayout = aVar.b().e;
        i.d(frameLayout, "holder.binding.clubNameRoot");
        Channel channel4 = this.j;
        if (!(channel4 == null || (i2 = channel4.i()) == null)) {
            str = i2.getName();
        }
        k.L(frameLayout, Boolean.valueOf(str != null));
        aVar.b().e.setOnClickListener(this.k);
        Channel channel5 = this.j;
        if (channel5 != null && (i = channel5.i()) != null && (name = i.getName()) != null) {
            aVar.b().d.setText(name);
            aVar.b().d.setContentDescription(aVar.b().a.getResources().getString(R.string.cd_club_name, new Object[]{name}));
        }
    }

    public int p(int i, int i2, int i3) {
        return i;
    }
}
