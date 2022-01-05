package i0.e.c.i.r;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.databinding.ChatMemberBinding;
import h0.b0.v;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: ChatMemberView.kt */
public final class d extends ConstraintLayout {
    public final ChatMemberBinding n2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context, (AttributeSet) null, 0);
        i.e(context, "context");
        i.e(context, "context");
        ViewGroup.inflate(context, R.layout.chat_member, this);
        ChatMemberBinding bind = ChatMemberBinding.bind(this);
        i.d(bind, "bind(this)");
        this.n2 = bind;
    }

    public final void setAdmin(boolean z) {
        TextView textView = this.n2.b;
        i.d(textView, "binding.admin");
        k.L(textView, Boolean.valueOf(z));
    }

    public final void setAvatar(String str) {
        AvatarView avatarView = this.n2.c;
        i.d(avatarView, "binding.avatar");
        v.Q0(avatarView, str);
    }

    public final void setLastActiveMinutes(Integer num) {
        ImageView imageView = this.n2.e;
        i.d(imageView, "binding.endBadge");
        k.b(imageView, num);
    }

    public final void setName(String str) {
        this.n2.f.setText(str);
        this.n2.c.setText(AvatarView.c.a(str));
    }

    public final void setRemoveClickListener(View.OnClickListener onClickListener) {
        this.n2.g.setOnClickListener(onClickListener);
    }

    public final void setUserClickListener(View.OnClickListener onClickListener) {
        this.n2.c.setOnClickListener(onClickListener);
        this.n2.f.setOnClickListener(onClickListener);
    }
}
