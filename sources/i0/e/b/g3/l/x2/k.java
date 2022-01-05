package i0.e.b.g3.l.x2;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.clubhouse.android.databinding.ClubInviteCardBinding;
import com.clubhouse.app.R;
import m0.n.b.i;

/* compiled from: ClubInviteCard.kt */
public final class k extends FrameLayout {
    public final ClubInviteCardBinding c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public k(Context context) {
        super(context, (AttributeSet) null, 0);
        i.e(context, "context");
        i.e(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.club_invite_card, this, false);
        addView(inflate);
        ClubInviteCardBinding bind = ClubInviteCardBinding.bind(inflate);
        i.d(bind, "inflate(LayoutInflater.from(context), this, true)");
        this.c = bind;
    }

    public final void setShareClickListener(View.OnClickListener onClickListener) {
        this.c.a.setOnClickListener(onClickListener);
    }

    public final void setShareLabel(CharSequence charSequence) {
        this.c.a.setText(charSequence);
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.b.setText(charSequence);
    }
}
