package i0.e.b.g3.r;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import com.clubhouse.android.ui.onboarding.ValidateNumberFragment;
import kotlin.jvm.internal.Ref$IntRef;
import m0.n.b.i;
import m0.r.k;

/* compiled from: TextView.kt */
public final class e2 implements TextWatcher {
    public final /* synthetic */ Ref$IntRef c;
    public final /* synthetic */ ValidateNumberFragment d;

    public e2(Ref$IntRef ref$IntRef, ValidateNumberFragment validateNumberFragment) {
        this.c = ref$IntRef;
        this.d = validateNumberFragment;
    }

    public void afterTextChanged(Editable editable) {
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        boolean z = false;
        if ((charSequence == null ? 0 : charSequence.length()) >= this.c.c) {
            z = true;
        }
        ValidateNumberFragment validateNumberFragment = this.d;
        k<Object>[] kVarArr = ValidateNumberFragment.Z1;
        Button button = validateNumberFragment.N0().d;
        i.d(button, "binding.nextButton");
        i0.e.b.d3.k.k(button, Boolean.valueOf(z));
        if (z) {
            this.d.O0().q(String.valueOf(charSequence));
        }
    }
}
