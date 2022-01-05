package com.google.android.material.bottomsheet;

import android.app.Dialog;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatDialogFragment;
import i0.h.a.c.g.d;

public class BottomSheetDialogFragment extends AppCompatDialogFragment {
    public void I0() {
        Dialog dialog = this.e2;
        if (dialog instanceof d) {
            boolean z = ((d) dialog).e().w;
        }
        super.I0();
    }

    public Dialog L0(Bundle bundle) {
        return new d(getContext(), K0());
    }

    public void dismiss() {
        Dialog dialog = this.e2;
        if (dialog instanceof d) {
            boolean z = ((d) dialog).e().w;
        }
        J0(false, false);
    }
}
