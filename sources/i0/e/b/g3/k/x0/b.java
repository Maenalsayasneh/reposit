package i0.e.b.g3.k.x0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ChannelUserListDividerBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: ChannelDivider.kt */
public abstract class b extends BaseEpoxyModelWithHolder<a> {
    public String j;

    /* compiled from: ChannelDivider.kt */
    public static final class a extends d {
        public ChannelUserListDividerBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ChannelUserListDividerBinding bind = ChannelUserListDividerBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        ChannelUserListDividerBinding channelUserListDividerBinding = aVar.b;
        if (channelUserListDividerBinding != null) {
            channelUserListDividerBinding.a.setText(this.j);
        } else {
            i.m("binding");
            throw null;
        }
    }

    public int p(int i, int i2, int i3) {
        return i;
    }
}
