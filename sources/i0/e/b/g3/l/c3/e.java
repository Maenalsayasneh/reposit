package i0.e.b.g3.l.c3;

import android.view.View;
import android.view.ViewTreeObserver;
import com.clubhouse.android.ui.clubs.viewholder.ClubActionButtons;
import com.clubhouse.app.R;
import i0.e.b.a3.f.q;

/* compiled from: ViewUtil.kt */
public final class e implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ View c;
    public final /* synthetic */ ClubActionButtons d;

    public e(View view, ClubActionButtons clubActionButtons) {
        this.c = view;
        this.d = clubActionButtons;
    }

    public void onGlobalLayout() {
        int i;
        if (this.c.getMeasuredWidth() > 0 && this.c.getMeasuredHeight() > 0) {
            this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            View view = this.c;
            q qVar = q.a;
            Integer num = this.d.o;
            if (num == null) {
                i = 0;
            } else {
                i = num.intValue();
            }
            qVar.a(view, i, R.xml.add_members_badge_style);
        }
    }
}
