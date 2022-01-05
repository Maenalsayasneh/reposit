package i0.e.c.c.k0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.databinding.ChatHeaderAvatarBinding;
import h0.b0.v;
import i0.e.b.d3.k;
import m0.n.b.i;

/* compiled from: ChatHeaderAvatarView.kt */
public final class a extends FrameLayout {
    public final ChatHeaderAvatarBinding c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, (AttributeSet) null, 0);
        i.e(context, "context");
        i.e(context, "context");
        FrameLayout.inflate(context, R.layout.chat_header_avatar, this);
        ChatHeaderAvatarBinding bind = ChatHeaderAvatarBinding.bind(this);
        i.d(bind, "bind(this)");
        this.c = bind;
    }

    public final void setAvatar(String str) {
        AvatarView avatarView = this.c.b;
        i.d(avatarView, "binding.avatar");
        v.Q0(avatarView, str);
    }

    public final void setClickListener(View.OnClickListener onClickListener) {
        this.c.a.setOnClickListener(onClickListener);
    }

    public final void setLastActiveMinutes(Integer num) {
        ImageView imageView = this.c.c;
        i.d(imageView, "binding.endBadge");
        k.b(imageView, num);
    }

    public final void setName(String str) {
        this.c.b.setText(AvatarView.c.a(str));
    }
}
