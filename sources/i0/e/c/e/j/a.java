package i0.e.c.e.j;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.databinding.CreateChatUserItemBinding;
import h0.b0.v;
import m0.n.b.i;

/* compiled from: CreateChatUserView.kt */
public final class a extends ConstraintLayout {
    public final CreateChatUserItemBinding n2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, (AttributeSet) null, 0);
        i.e(context, "context");
        i.e(context, "context");
        ViewGroup.inflate(context, R.layout.create_chat_user_item, this);
        CreateChatUserItemBinding bind = CreateChatUserItemBinding.bind(this);
        i.d(bind, "bind(this)");
        this.n2 = bind;
    }

    public final void setAvatar(String str) {
        AvatarView avatarView = this.n2.b;
        i.d(avatarView, "binding.avatar");
        v.Q0(avatarView, str);
    }

    public final void setName(String str) {
        this.n2.c.setText(str);
        this.n2.b.setText(AvatarView.c.a(str));
    }

    public final void setRemoveClickListener(View.OnClickListener onClickListener) {
        this.n2.d.setOnClickListener(onClickListener);
    }
}
