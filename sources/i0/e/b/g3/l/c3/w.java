package i0.e.b.g3.l.c3;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import com.clubhouse.android.databinding.ClubSectionHeaderBinding;
import com.clubhouse.app.R;
import m0.n.b.i;

/* compiled from: ClubSectionHeader.kt */
public final class w extends FrameLayout {
    public final ClubSectionHeaderBinding c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public w(Context context) {
        super(context, (AttributeSet) null, 0);
        i.e(context, "context");
        i.e(context, "context");
        View inflate = LayoutInflater.from(context).inflate(R.layout.club_section_header, this, false);
        addView(inflate);
        ClubSectionHeaderBinding bind = ClubSectionHeaderBinding.bind(inflate);
        i.d(bind, "inflate(LayoutInflater.from(context), this, true)");
        this.c = bind;
    }

    public final void setTitle(CharSequence charSequence) {
        this.c.a.setText(charSequence);
    }
}
