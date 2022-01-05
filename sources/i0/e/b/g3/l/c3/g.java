package i0.e.b.g3.l.c3;

import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ClubDescriptionBinding;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: ClubDescription.kt */
public abstract class g extends BaseEpoxyModelWithHolder<a> {
    public String j;

    /* compiled from: ClubDescription.kt */
    public static final class a extends d {
        public ClubDescriptionBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ClubDescriptionBinding bind = ClubDescriptionBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        ClubDescriptionBinding clubDescriptionBinding = aVar.b;
        if (clubDescriptionBinding != null) {
            clubDescriptionBinding.a.setText(this.j);
            ClubDescriptionBinding clubDescriptionBinding2 = aVar.b;
            if (clubDescriptionBinding2 != null) {
                ConstraintLayout constraintLayout = clubDescriptionBinding2.c;
                i.d(constraintLayout, "holder.binding.descriptionRoot");
                String str = this.j;
                k.q(constraintLayout, Boolean.valueOf(str == null || str.length() == 0));
                return;
            }
            i.m("binding");
            throw null;
        }
        i.m("binding");
        throw null;
    }
}
