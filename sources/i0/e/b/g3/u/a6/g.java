package i0.e.b.g3.u.a6;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ViewFollowSuggestionProfileBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import h0.b0.v;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: FollowSuggestion.kt */
public abstract class g extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public String k;
    public String l;
    public View.OnClickListener m;
    public View.OnClickListener n;
    public View.OnClickListener o;

    /* compiled from: FollowSuggestion.kt */
    public static final class a extends d {
        public ViewFollowSuggestionProfileBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ViewFollowSuggestionProfileBinding bind = ViewFollowSuggestionProfileBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ViewFollowSuggestionProfileBinding b() {
            ViewFollowSuggestionProfileBinding viewFollowSuggestionProfileBinding = this.b;
            if (viewFollowSuggestionProfileBinding != null) {
                return viewFollowSuggestionProfileBinding;
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
        v.S0(avatarView, this.k, this.j, 0.0f, 4);
        aVar.b().d.setText(this.j);
        aVar.b().b.setText(this.l);
        aVar.b().c.setOnClickListener(this.n);
        aVar.b().e.setOnClickListener(this.o);
        aVar.b().a.setOnClickListener(this.m);
    }
}
