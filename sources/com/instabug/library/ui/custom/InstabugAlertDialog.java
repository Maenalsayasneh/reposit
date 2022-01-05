package com.instabug.library.ui.custom;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import androidx.appcompat.app.AlertController;
import com.instabug.library.Instabug;
import com.instabug.library.R;
import h0.b.a.d;

public class InstabugAlertDialog {
    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static d getAlertDialog(Context context, String str, String str2, String str3, String str4, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        d.a aVar = new d.a(context, R.style.InstabugDialogStyle);
        AlertController.b bVar = aVar.a;
        bVar.f = str2;
        bVar.g = str3;
        bVar.h = onClickListener;
        if (str != null) {
            bVar.d = str;
        }
        if (str4 != null) {
            bVar.i = str4;
            bVar.j = onClickListener2;
        }
        final d a = aVar.a();
        a.setOnShowListener(new DialogInterface.OnShowListener() {
            public void onShow(DialogInterface dialogInterface) {
                a.d(-1).setTextColor(Instabug.getPrimaryColor());
                a.d(-2).setTextColor(Instabug.getPrimaryColor());
            }
        });
        a.setCancelable(z);
        return a;
    }

    public static void showAlertDialog(Activity activity, String str, String str2, String str3, String str4, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        showAlertDialog(activity, str, str2, str3, str4, true, onClickListener, onClickListener2);
    }

    public static void showAlertDialog(Activity activity, String str, String str2, String str3, String str4, boolean z, DialogInterface.OnClickListener onClickListener, DialogInterface.OnClickListener onClickListener2) {
        d alertDialog = getAlertDialog(activity, str, str2, str3, str4, z, onClickListener, onClickListener2);
        if (!activity.isFinishing()) {
            alertDialog.show();
        }
    }
}
