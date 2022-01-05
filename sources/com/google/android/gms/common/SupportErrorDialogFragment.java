package com.google.android.gms.common;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentManager;

/* compiled from: com.google.android.gms:play-services-base@@17.5.0 */
public class SupportErrorDialogFragment extends DialogFragment {
    public Dialog j2;
    public DialogInterface.OnCancelListener k2;
    public Dialog l2;

    public Dialog L0(Bundle bundle) {
        Dialog dialog = this.j2;
        if (dialog != null) {
            return dialog;
        }
        this.a2 = false;
        if (this.l2 == null) {
            this.l2 = new AlertDialog.Builder(getActivity()).create();
        }
        return this.l2;
    }

    public void P0(@RecentlyNonNull FragmentManager fragmentManager, String str) {
        super.P0(fragmentManager, str);
    }

    public void onCancel(@RecentlyNonNull DialogInterface dialogInterface) {
        DialogInterface.OnCancelListener onCancelListener = this.k2;
        if (onCancelListener != null) {
            onCancelListener.onCancel(dialogInterface);
        }
    }
}
