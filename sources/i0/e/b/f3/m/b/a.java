package i0.e.b.f3.m.b;

import android.view.View;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.User;
import com.clubhouse.core.ui.R;
import com.clubhouse.core.ui.databinding.ListUserAnatomyBinding;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: AbsListUser.kt */
public abstract class a<T extends d> extends BaseEpoxyModelWithHolder<T> {
    public User j;
    public String k;
    public View.OnClickListener l;

    public final void K(ListUserAnatomyBinding listUserAnatomyBinding) {
        i.e(listUserAnatomyBinding, "<this>");
        AvatarView avatarView = listUserAnatomyBinding.b;
        i.d(avatarView, "avatar");
        k.u(avatarView, this.j);
        TextView textView = listUserAnatomyBinding.d;
        User user = this.j;
        textView.setText(user == null ? null : user.getName());
        listUserAnatomyBinding.c.setText(this.k);
        listUserAnatomyBinding.a.setOnClickListener(this.l);
        listUserAnatomyBinding.a.setOnLongClickListener((View.OnLongClickListener) null);
    }

    public final void L(ListUserAnatomyBinding listUserAnatomyBinding, boolean z) {
        i.e(listUserAnatomyBinding, "<this>");
        if (z) {
            TextView textView = listUserAnatomyBinding.d;
            i.d(textView, "name");
            k.I(textView, listUserAnatomyBinding.d.getResources().getDimensionPixelSize(R.dimen.compact_mode_top_margin));
            listUserAnatomyBinding.c.setMaxLines(1);
            return;
        }
        TextView textView2 = listUserAnatomyBinding.d;
        i.d(textView2, "name");
        k.I(textView2, 0);
        listUserAnatomyBinding.c.setMaxLines(2);
    }
}
