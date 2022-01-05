package i0.e.b.g3.r;

import android.text.style.ClickableSpan;
import android.view.View;
import com.clubhouse.android.ui.onboarding.WaitlistFragment;
import com.clubhouse.app.R;
import i0.e.b.a3.f.e;
import m0.n.b.i;

/* compiled from: WaitlistFragment.kt */
public final class q2 extends ClickableSpan {
    public final /* synthetic */ WaitlistFragment c;

    public q2(WaitlistFragment waitlistFragment) {
        this.c = waitlistFragment;
    }

    public void onClick(View view) {
        i.e(view, "widget");
        WaitlistFragment waitlistFragment = this.c;
        e.b(waitlistFragment, waitlistFragment.getString(R.string.clubhouse_intro_blog_post));
    }
}
