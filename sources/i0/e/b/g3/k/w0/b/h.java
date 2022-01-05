package i0.e.b.g3.k.w0.b;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.databinding.LargeUserInGridBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: SelectableUser.kt */
public abstract class h extends BaseEpoxyModelWithHolder<a> {
    public UserInList j;
    public boolean k;
    public boolean l;
    public View.OnClickListener m;

    /* compiled from: SelectableUser.kt */
    public static final class a extends d {
        public LargeUserInGridBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            LargeUserInGridBinding bind = LargeUserInGridBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final LargeUserInGridBinding b() {
            LargeUserInGridBinding largeUserInGridBinding = this.b;
            if (largeUserInGridBinding != null) {
                return largeUserInGridBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        String str;
        i.e(aVar, "holder");
        TextView textView = aVar.b().f;
        UserInList userInList = this.j;
        Integer num = null;
        if (userInList == null) {
            str = null;
        } else {
            str = userInList.y;
        }
        textView.setText(str);
        AvatarView avatarView = aVar.b().b;
        i.d(avatarView, "holder.binding.avatar");
        k.u(avatarView, this.j);
        AvatarView avatarView2 = aVar.b().b;
        i.d(avatarView2, "holder.binding.avatar");
        boolean z = this.k;
        if (this.l) {
            if (z) {
                avatarView2.setAlpha(1.0f);
            } else {
                k.h(avatarView2);
            }
        } else if (z) {
            k.h(avatarView2);
        } else {
            avatarView2.setAlpha(1.0f);
        }
        aVar.b().a.setOnClickListener(this.m);
        ImageView imageView = aVar.b().d;
        i.d(imageView, "holder.binding.endBadge");
        UserInList userInList2 = this.j;
        i.e(imageView, "<this>");
        if (userInList2 != null) {
            num = userInList2.d;
        }
        k.b(imageView, num);
        if (this.k) {
            ImageView imageView2 = aVar.b().c;
            i.d(imageView2, "holder.binding.check");
            k.K(imageView2);
            aVar.b().c.setImageResource(R.drawable.ic_check);
            return;
        }
        ImageView imageView3 = aVar.b().c;
        i.d(imageView3, "holder.binding.check");
        k.p(imageView3);
    }

    public int p(int i, int i2, int i3) {
        return i / 3;
    }

    public int q() {
        return 0;
    }
}
