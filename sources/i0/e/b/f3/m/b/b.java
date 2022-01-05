package i0.e.b.f3.m.b;

import android.view.View;
import android.widget.TextView;
import com.clubhouse.android.core.ui.TriStateButton;
import com.clubhouse.core.ui.R;
import com.clubhouse.core.ui.databinding.FollowableListUserBinding;
import com.clubhouse.core.ui.databinding.ListUserAnatomyBinding;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: FollowableListUser.kt */
public abstract class b extends a<a> {
    public boolean m = true;
    public boolean n;
    public View.OnClickListener o;
    public boolean p;
    public boolean q;
    public boolean r;
    public boolean s;

    /* compiled from: FollowableListUser.kt */
    public static final class a extends d {
        public FollowableListUserBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            FollowableListUserBinding bind = FollowableListUserBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final FollowableListUserBinding b() {
            FollowableListUserBinding followableListUserBinding = this.b;
            if (followableListUserBinding != null) {
                return followableListUserBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: M */
    public void k(a aVar) {
        i.e(aVar, "holder");
        ListUserAnatomyBinding listUserAnatomyBinding = aVar.b().b;
        i.d(listUserAnatomyBinding, "holder.binding.user");
        K(listUserAnatomyBinding);
        if (!this.m || this.q || this.p) {
            TriStateButton triStateButton = aVar.b().a;
            i.d(triStateButton, "holder.binding.followButton");
            k.p(triStateButton);
        } else {
            TriStateButton triStateButton2 = aVar.b().a;
            i.d(triStateButton2, "holder.binding.followButton");
            k.K(triStateButton2);
            aVar.b().a.setChecked(this.n);
            TriStateButton triStateButton3 = aVar.b().a;
            i.d(triStateButton3, "holder.binding.followButton");
            k.H(triStateButton3, aVar.a, this.o);
        }
        if (this.s) {
            TextView textView = aVar.b().b.c;
            i.d(textView, "holder.binding.user.bio");
            k.p(textView);
        }
        ListUserAnatomyBinding listUserAnatomyBinding2 = aVar.b().b;
        i.d(listUserAnatomyBinding2, "holder.binding.user");
        L(listUserAnatomyBinding2, this.r);
    }

    public int o() {
        return R.layout.followable_list_user;
    }
}
