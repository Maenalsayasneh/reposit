package i0.e.b.g3.r.c3;

import android.content.res.Resources;
import android.view.View;
import android.widget.ImageView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.core.ui.R;
import com.clubhouse.core.ui.databinding.SimpleListUserBinding;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: SimpleListUser.kt */
public abstract class a extends BaseEpoxyModelWithHolder<C0207a> {
    public String j;
    public String k;
    public boolean l;
    public boolean m = true;
    public boolean n = true;
    public View.OnClickListener o;

    /* renamed from: i0.e.b.g3.r.c3.a$a  reason: collision with other inner class name */
    /* compiled from: SimpleListUser.kt */
    public static final class C0207a extends d {
        public SimpleListUserBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            SimpleListUserBinding bind = SimpleListUserBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final SimpleListUserBinding b() {
            SimpleListUserBinding simpleListUserBinding = this.b;
            if (simpleListUserBinding != null) {
                return simpleListUserBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(C0207a aVar) {
        i.e(aVar, "holder");
        Resources resources = aVar.b().a.getResources();
        aVar.b().c.setText(this.j);
        AvatarView avatarView = aVar.b().b;
        i.d(avatarView, "holder.binding.avatar");
        v.S0(avatarView, this.k, this.j, 0.0f, 4);
        aVar.b().a.setOnClickListener(this.o);
        ImageView imageView = aVar.b().d;
        i.d(imageView, "holder.binding.selectButton");
        k.L(imageView, Boolean.valueOf(this.m));
        if (this.l) {
            aVar.b().d.setImageResource(R.drawable.checkbox_filled);
            aVar.b().a.setContentDescription(resources.getString(R.string.cd_follow_suggestion_selected, new Object[]{aVar.b().c.getText()}));
        } else {
            aVar.b().d.setImageResource(R.drawable.ic_button_add_participant);
            aVar.b().a.setContentDescription(resources.getString(R.string.cd_follow_suggestion_unselected, new Object[]{aVar.b().c.getText()}));
        }
        g0.c.a aVar2 = new g0.c.a(aVar.b().b);
        i0.b.c.a aVar3 = new i0.b.c.a();
        if (this.n) {
            aVar3.a(R.style.SimpleListUserAvatarStyleCompact);
        } else {
            aVar3.a(R.style.SimpleListUserAvatarStyleLarge);
        }
        aVar2.a(aVar3.b());
        aVar.b().c.setTextSize(0, resources.getDimension(this.n ? R.dimen.text_size_small : R.dimen.text_size_message));
    }

    public int o() {
        return R.layout.simple_list_user;
    }
}
