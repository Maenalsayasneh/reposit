package i0.e.b.g3.l.x2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.databinding.ClubNominationsPreviewBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import i0.e.b.d3.k;
import java.util.List;
import m0.j.g;
import m0.n.b.i;

/* compiled from: ClubNominationsPreviewItem.kt */
public final class n extends ConstraintLayout {
    public final ClubNominationsPreviewBinding n2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public n(Context context) {
        super(context, (AttributeSet) null, 0);
        i.e(context, "context");
        i.e(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.club_nominations_preview, this, false);
        addView(inflate);
        ClubNominationsPreviewBinding bind = ClubNominationsPreviewBinding.bind(inflate);
        i.d(bind, "inflate(LayoutInflater.from(context), this, true)");
        this.n2 = bind;
    }

    public final void setClickListener(View.OnClickListener onClickListener) {
        this.n2.a.setOnClickListener(onClickListener);
        this.n2.b.setOnClickListener(onClickListener);
    }

    public final void setUsers(List<? extends User> list) {
        User user;
        User user2;
        String str = null;
        User user3 = list == null ? null : (User) g.z(list, 0);
        AvatarView avatarView = this.n2.c;
        i.d(avatarView, "binding.avatar1");
        t(avatarView, user3);
        this.n2.f.setText(user3 == null ? null : user3.getName());
        if (list == null) {
            user = null;
        } else {
            user = (User) g.z(list, 1);
        }
        AvatarView avatarView2 = this.n2.d;
        i.d(avatarView2, "binding.avatar2");
        t(avatarView2, user);
        this.n2.g.setText(user == null ? null : user.getName());
        if (list == null) {
            user2 = null;
        } else {
            user2 = (User) g.z(list, 2);
        }
        AvatarView avatarView3 = this.n2.e;
        i.d(avatarView3, "binding.avatar3");
        t(avatarView3, user2);
        TextView textView = this.n2.h;
        if (user2 != null) {
            str = user2.getName();
        }
        textView.setText(str);
    }

    public final void t(AvatarView avatarView, User user) {
        int i = 0;
        if (!(user != null)) {
            i = 8;
        }
        avatarView.setVisibility(i);
        k.u(avatarView, user);
    }
}
