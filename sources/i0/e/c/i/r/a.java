package i0.e.c.i.r;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.clubhouse.backchannel.R;
import m0.n.b.i;

/* compiled from: AddChatMemberView.kt */
public final class a extends LinearLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public a(Context context) {
        super(context, (AttributeSet) null, 0);
        i.e(context, "context");
        i.e(context, "context");
        LinearLayout.inflate(context, R.layout.chat_add_member, this);
    }

    public final void setClickListener(View.OnClickListener onClickListener) {
        setOnClickListener(onClickListener);
    }
}
