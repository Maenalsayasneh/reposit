package i0.e.b.g3.q.r;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.InvitePendingBinding;
import com.clubhouse.app.R;
import m0.n.b.i;

/* compiled from: InvitePending.kt */
public abstract class d extends BaseEpoxyModelWithHolder<a> {
    public Integer j = 0;
    public View.OnClickListener k;

    /* compiled from: InvitePending.kt */
    public static final class a extends i0.e.b.a3.f.d {
        public InvitePendingBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            InvitePendingBinding bind = InvitePendingBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final InvitePendingBinding b() {
            InvitePendingBinding invitePendingBinding = this.b;
            if (invitePendingBinding != null) {
                return invitePendingBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        aVar.b().a.setText(aVar.b().a.getResources().getString(R.string.see_pending_invites, new Object[]{this.j}));
        aVar.b().a.setOnClickListener(this.k);
    }
}
