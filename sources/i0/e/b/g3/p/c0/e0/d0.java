package i0.e.b.g3.p.c0.e0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.clubhouse.android.databinding.HallwayEventDividerBinding;
import com.clubhouse.app.R;
import m0.n.b.i;

/* compiled from: HallwayEventDivider.kt */
public final class d0 extends FrameLayout {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d0(Context context) {
        super(context, (AttributeSet) null, 0);
        i.e(context, "context");
        i.e(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.hallway_event_divider, this, false);
        addView(inflate);
        HallwayEventDividerBinding.bind(inflate);
    }
}
