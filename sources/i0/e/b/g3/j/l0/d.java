package i0.e.b.g3.j.l0;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ActivityItemBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.d3.k;
import j$.time.OffsetDateTime;
import m0.n.b.i;

/* compiled from: ActivityItem.kt */
public abstract class d extends BaseEpoxyModelWithHolder<a> {
    public String j;
    public String k;
    public String l;
    public OffsetDateTime m;
    public Boolean n = Boolean.FALSE;
    public View.OnClickListener o;
    public View.OnClickListener p;

    /* compiled from: ActivityItem.kt */
    public static final class a extends i0.e.b.a3.f.d {
        public ActivityItemBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ActivityItemBinding bind = ActivityItemBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ActivityItemBinding b() {
            ActivityItemBinding activityItemBinding = this.b;
            if (activityItemBinding != null) {
                return activityItemBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        Context context = aVar.b().a.getContext();
        AvatarView avatarView = aVar.b().b;
        i.d(avatarView, "holder.binding.avatar");
        v.S0(avatarView, this.j, this.k, 0.0f, 4);
        aVar.b().b.setOnClickListener(this.o);
        if (this.l != null) {
            String str = this.k;
            if (str == null || str.length() == 0) {
                aVar.b().c.setText(this.l);
            } else {
                aVar.b().c.setText(context.getString(R.string.name_and_message, new Object[]{this.k, this.l}));
                TextView textView = aVar.b().c;
                i.d(textView, "holder.binding.message");
                String str2 = this.k;
                i.c(str2);
                k.y(textView, str2);
            }
        }
        OffsetDateTime offsetDateTime = this.m;
        if (offsetDateTime != null) {
            TextView textView2 = aVar.b().d;
            i.d(context, "context");
            textView2.setText(v.U(offsetDateTime, context));
        }
        if (i.a(this.n, Boolean.FALSE)) {
            ConstraintLayout constraintLayout = aVar.b().a;
            i.d(constraintLayout, "holder.binding.root");
            i.e(constraintLayout, "<this>");
            constraintLayout.setAlpha(0.6f);
        }
        aVar.b().a.setOnClickListener(this.p);
    }
}
