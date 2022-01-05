package i0.e.b.g3.u.a6;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ViewCreateClubInProfileBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import m0.n.b.i;

/* compiled from: CreateClubInProfile.kt */
public abstract class d extends BaseEpoxyModelWithHolder<a> {
    public View.OnClickListener j;

    /* compiled from: CreateClubInProfile.kt */
    public static final class a extends i0.e.b.a3.f.d {
        public ViewCreateClubInProfileBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ViewCreateClubInProfileBinding bind = ViewCreateClubInProfileBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ViewCreateClubInProfileBinding b() {
            ViewCreateClubInProfileBinding viewCreateClubInProfileBinding = this.b;
            if (viewCreateClubInProfileBinding != null) {
                return viewCreateClubInProfileBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        aVar.b().b.setText(AvatarView.c.a("+"));
        aVar.b().b.setSquareness(0.88f);
        aVar.b().a.setOnClickListener(this.j);
    }
}
