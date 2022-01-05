package i0.e.b.g3.j.l0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ActivityItemStackedBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: ActivityItemStacked.kt */
public abstract class e extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public View.OnClickListener k;

    /* compiled from: ActivityItemStacked.kt */
    public static final class a extends d {
        public ActivityItemStackedBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ActivityItemStackedBinding bind = ActivityItemStackedBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        ActivityItemStackedBinding activityItemStackedBinding = aVar.b;
        if (activityItemStackedBinding != null) {
            activityItemStackedBinding.b.setText(this.j);
            ActivityItemStackedBinding activityItemStackedBinding2 = aVar.b;
            if (activityItemStackedBinding2 != null) {
                activityItemStackedBinding2.a.setOnClickListener(this.k);
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
