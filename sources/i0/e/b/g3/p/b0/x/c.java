package i0.e.b.g3.p.b0.x;

import android.view.View;
import android.widget.Button;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.BuddyListSectionHeaderBinding;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: BuddyListSectionHeader.kt */
public abstract class c extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public boolean k;
    public View.OnClickListener l;

    /* compiled from: BuddyListSectionHeader.kt */
    public static final class a extends d {
        public BuddyListSectionHeaderBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            BuddyListSectionHeaderBinding bind = BuddyListSectionHeaderBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final BuddyListSectionHeaderBinding b() {
            BuddyListSectionHeaderBinding buddyListSectionHeaderBinding = this.b;
            if (buddyListSectionHeaderBinding != null) {
                return buddyListSectionHeaderBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        String str = this.j;
        if (str != null) {
            aVar.b().b.setText(str);
        }
        if (this.l != null) {
            Button button = aVar.b().a;
            i.d(button, "holder.binding.showAll");
            k.H(button, aVar.a, this.l);
        }
        Button button2 = aVar.b().a;
        i.d(button2, "holder.binding.showAll");
        k.L(button2, Boolean.valueOf(this.k));
    }
}
