package i0.e.b.g3.r;

import android.view.View;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.ui.onboarding.ValidateNumberFragment;
import com.clubhouse.android.ui.onboarding.ValidateNumberFragment$onViewCreated$3$1;
import com.clubhouse.android.ui.onboarding.ValidateNumberViewModel;
import com.clubhouse.android.ui.onboarding.ValidateNumberViewModel$resendCode$3;
import com.clubhouse.android.ui.onboarding.ValidateNumberViewModel$resendCode$6;
import h0.b0.v;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import m0.l.c;
import m0.n.b.i;
import m0.r.k;
import m0.r.m;
import n0.a.d0;

/* compiled from: lambda */
public final /* synthetic */ class y implements View.OnClickListener {
    public final /* synthetic */ ValidateNumberFragment c;

    public /* synthetic */ y(ValidateNumberFragment validateNumberFragment) {
        this.c = validateNumberFragment;
    }

    public final void onClick(View view) {
        ValidateNumberFragment validateNumberFragment = this.c;
        k<Object>[] kVarArr = ValidateNumberFragment.Z1;
        i.e(validateNumberFragment, "this$0");
        ValidateNumberViewModel O0 = validateNumberFragment.O0();
        Objects.requireNonNull(O0);
        if (TimeUnit.SECONDS.convert(System.nanoTime() - O0.q, TimeUnit.NANOSECONDS) < 15) {
            O0.m(x.c);
        } else {
            O0.m(x.d);
            O0.q = System.nanoTime();
            int i = O0.r;
            if (i <= 2) {
                MavericksViewModel.f(O0, new ValidateNumberViewModel$resendCode$3(O0, (c<? super ValidateNumberViewModel$resendCode$3>) null), (d0) null, (m) null, d.c, 3, (Object) null);
                if (O0.r == 2) {
                    O0.m(x.q);
                }
            } else if (i <= 4) {
                MavericksViewModel.f(O0, new ValidateNumberViewModel$resendCode$6(O0, (c<? super ValidateNumberViewModel$resendCode$6>) null), (d0) null, (m) null, d.d, 3, (Object) null);
            } else {
                O0.m(x.x);
            }
            O0.r++;
        }
        v.v2(validateNumberFragment.O0(), new ValidateNumberFragment$onViewCreated$3$1(validateNumberFragment));
    }
}
