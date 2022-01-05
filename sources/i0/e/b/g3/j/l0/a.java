package i0.e.b.g3.j.l0;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.databinding.ActionableActivityItemBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import j$.time.OffsetDateTime;
import m0.n.b.i;

/* compiled from: ActionableActivityItem.kt */
public abstract class a extends BaseEpoxyModelWithHolder<C0199a> {
    public String j;
    public String k;
    public String l;
    public CharSequence m;
    public OffsetDateTime n;
    public String o;
    public String p;
    public View.OnClickListener q;
    public View.OnClickListener r;
    public View.OnClickListener s;
    public View.OnClickListener t;

    /* renamed from: i0.e.b.g3.j.l0.a$a  reason: collision with other inner class name */
    /* compiled from: ActionableActivityItem.kt */
    public static final class C0199a extends d {
        public ActionableActivityItemBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ActionableActivityItemBinding bind = ActionableActivityItemBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ActionableActivityItemBinding b() {
            ActionableActivityItemBinding actionableActivityItemBinding = this.b;
            if (actionableActivityItemBinding != null) {
                return actionableActivityItemBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(C0199a aVar) {
        i.e(aVar, "holder");
        AvatarView avatarView = aVar.b().b;
        i.d(avatarView, "holder.binding.avatar");
        v.S0(avatarView, this.j, this.k, 0.0f, 4);
        aVar.b().b.setOnClickListener(this.s);
        aVar.b().c.setText(this.m);
        String str = this.k;
        if (str != null) {
            TextView textView = aVar.b().c;
            i.d(textView, "holder.binding.message");
            k.y(textView, str);
        }
        String str2 = this.l;
        if (str2 != null) {
            TextView textView2 = aVar.b().c;
            i.d(textView2, "holder.binding.message");
            k.y(textView2, str2);
        }
        OffsetDateTime offsetDateTime = this.n;
        if (offsetDateTime != null) {
            TextView textView3 = aVar.b().f;
            Context context = aVar.b().a.getContext();
            i.d(context, "holder.binding.root.context");
            textView3.setText(v.U(offsetDateTime, context));
        }
        aVar.b().d.setText(this.o);
        aVar.b().e.setText(this.p);
        Button button = aVar.b().d;
        i.d(button, "holder.binding.primaryButton");
        k.H(button, aVar.a, this.q);
        Button button2 = aVar.b().e;
        i.d(button2, "holder.binding.secondaryButton");
        k.H(button2, aVar.a, this.r);
        aVar.b().a.setOnClickListener(this.t);
    }
}
