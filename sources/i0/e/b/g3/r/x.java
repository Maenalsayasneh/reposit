package i0.e.b.g3.r;

import android.view.View;
import com.clubhouse.android.ui.onboarding.ValidateNumberFragment;
import m0.n.b.i;
import m0.r.k;

/* compiled from: lambda */
public final /* synthetic */ class x implements View.OnClickListener {
    public final /* synthetic */ ValidateNumberFragment c;

    public /* synthetic */ x(ValidateNumberFragment validateNumberFragment) {
        this.c = validateNumberFragment;
    }

    public final void onClick(View view) {
        ValidateNumberFragment validateNumberFragment = this.c;
        k<Object>[] kVarArr = ValidateNumberFragment.Z1;
        i.e(validateNumberFragment, "this$0");
        validateNumberFragment.O0().q(validateNumberFragment.N0().b.getText().toString());
    }
}
