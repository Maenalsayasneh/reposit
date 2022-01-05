package androidx.appcompat.app;

import android.app.Dialog;
import android.os.Bundle;
import androidx.fragment.app.DialogFragment;
import h0.b.a.m;

public class AppCompatDialogFragment extends DialogFragment {
    public Dialog L0(Bundle bundle) {
        return new m(getContext(), K0());
    }

    public void O0(Dialog dialog, int i) {
        if (dialog instanceof m) {
            m mVar = (m) dialog;
            if (!(i == 1 || i == 2)) {
                if (i == 3) {
                    dialog.getWindow().addFlags(24);
                } else {
                    return;
                }
            }
            mVar.c(1);
            return;
        }
        super.O0(dialog, i);
    }
}
