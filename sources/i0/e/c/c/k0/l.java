package i0.e.c.c.k0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.databinding.SystemMessageBinding;
import m0.n.b.i;

/* compiled from: SystemMessageView.kt */
public final class l extends FrameLayout {
    public final SystemMessageBinding c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public l(Context context) {
        super(context, (AttributeSet) null, 0);
        i.e(context, "context");
        i.e(context, "context");
        FrameLayout.inflate(context, R.layout.system_message, this);
        SystemMessageBinding bind = SystemMessageBinding.bind(this);
        i.d(bind, "bind(this)");
        this.c = bind;
    }

    public final void setMessage(CharSequence charSequence) {
        this.c.b.setText(charSequence);
    }
}
