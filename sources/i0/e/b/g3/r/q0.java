package i0.e.b.g3.r;

import android.text.style.ClickableSpan;
import android.view.View;
import com.clubhouse.android.ui.onboarding.CollectPhoneNumberFragment;
import com.clubhouse.app.R;
import i0.e.b.a3.f.e;
import m0.n.b.i;

/* compiled from: CollectPhoneNumberFragment.kt */
public final class q0 extends ClickableSpan {
    public final /* synthetic */ CollectPhoneNumberFragment c;

    public q0(CollectPhoneNumberFragment collectPhoneNumberFragment) {
        this.c = collectPhoneNumberFragment;
    }

    public void onClick(View view) {
        i.e(view, "widget");
        CollectPhoneNumberFragment collectPhoneNumberFragment = this.c;
        e.b(collectPhoneNumberFragment, collectPhoneNumberFragment.getString(R.string.clubhouse_privacy_policy));
    }
}
