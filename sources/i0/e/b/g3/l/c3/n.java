package i0.e.b.g3.l.c3;

import android.view.View;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ClubHeaderBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: ClubHeader.kt */
public abstract class n extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public String k;
    public View.OnClickListener l;
    public String m;
    public boolean n;
    public View.OnClickListener o;

    /* compiled from: ClubHeader.kt */
    public static final class a extends d {
        public ClubHeaderBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ClubHeaderBinding bind = ClubHeaderBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ClubHeaderBinding b() {
            ClubHeaderBinding clubHeaderBinding = this.b;
            if (clubHeaderBinding != null) {
                return clubHeaderBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        AvatarView avatarView = aVar.b().a;
        i.d(avatarView, "holder.binding.avatar");
        v.R0(avatarView, this.k, this.j, 0.88f);
        aVar.b().a.setOnClickListener(this.l);
        aVar.b().c.setText(this.j);
        aVar.b().b.setText(this.m);
        TextView textView = aVar.b().d;
        i.d(textView, "holder.binding.rules");
        k.L(textView, Boolean.valueOf(this.n));
        aVar.b().d.setOnClickListener(this.o);
    }
}
