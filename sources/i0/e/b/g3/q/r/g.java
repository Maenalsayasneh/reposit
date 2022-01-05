package i0.e.b.g3.q.r;

import android.view.View;
import android.widget.Button;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.InvitePhoneItemBinding;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: InvitePhoneItem.kt */
public abstract class g extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public View.OnClickListener k;

    /* compiled from: InvitePhoneItem.kt */
    public static final class a extends d {
        public InvitePhoneItemBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            InvitePhoneItemBinding bind = InvitePhoneItemBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        InvitePhoneItemBinding invitePhoneItemBinding = aVar.b;
        if (invitePhoneItemBinding != null) {
            invitePhoneItemBinding.b.setText(this.j);
            InvitePhoneItemBinding invitePhoneItemBinding2 = aVar.b;
            if (invitePhoneItemBinding2 != null) {
                Button button = invitePhoneItemBinding2.a;
                i.d(button, "holder.binding.inviteButton");
                k.H(button, aVar.a, this.k);
                return;
            }
            i.m("binding");
            throw null;
        }
        i.m("binding");
        throw null;
    }
}
