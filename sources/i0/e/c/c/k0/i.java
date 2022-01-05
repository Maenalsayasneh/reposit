package i0.e.c.c.k0;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import com.clubhouse.backchannel.R;

/* compiled from: LoadingSegmentView.kt */
public final class i extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public i(Context context) {
        super(context, (AttributeSet) null, 0);
        m0.n.b.i.e(context, "context");
        m0.n.b.i.e(context, "context");
        FrameLayout.inflate(context, R.layout.loading_segment, this);
    }
}
