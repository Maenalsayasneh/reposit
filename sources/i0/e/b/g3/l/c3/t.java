package i0.e.b.g3.l.c3;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ClubRuleBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: ClubRule.kt */
public abstract class t extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public String k;

    /* compiled from: ClubRule.kt */
    public static final class a extends d {
        public ClubRuleBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ClubRuleBinding bind = ClubRuleBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        ClubRuleBinding clubRuleBinding = aVar.b;
        if (clubRuleBinding != null) {
            clubRuleBinding.c.setText(this.j);
            ClubRuleBinding clubRuleBinding2 = aVar.b;
            if (clubRuleBinding2 != null) {
                clubRuleBinding2.b.setText(this.k);
            } else {
                i.m("binding");
                throw null;
            }
        } else {
            i.m("binding");
            throw null;
        }
    }
}
