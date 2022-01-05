package com.instabug.survey.ui.h;

import android.content.DialogInterface;
import com.instabug.library.ui.custom.InstabugAlertDialog;
import h0.o.a.k;

/* compiled from: PopupPublicQuestionFragment */
public class c extends f {
    public static final /* synthetic */ int q = 0;

    /* compiled from: PopupPublicQuestionFragment */
    public class a implements DialogInterface.OnClickListener {
        public a() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            c.this.c.d();
        }
    }

    /* compiled from: PopupPublicQuestionFragment */
    public class b implements DialogInterface.OnClickListener {
        public b() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            c.this.c.s();
        }
    }

    /* renamed from: com.instabug.survey.ui.h.c$c  reason: collision with other inner class name */
    /* compiled from: PopupPublicQuestionFragment */
    public class C0113c implements DialogInterface.OnClickListener {
        public C0113c() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            c.this.c.g();
        }
    }

    /* compiled from: PopupPublicQuestionFragment */
    public class d implements DialogInterface.OnClickListener {
        public d() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            c.this.c.c();
        }
    }

    public void P(String str, String str2, String str3, String str4) {
        k activity = getActivity();
        if (activity != null) {
            InstabugAlertDialog.showAlertDialog(activity, (String) null, str2, str3, str4, false, new a(), new b());
        }
    }

    public void Y(String str, String str2, String str3, String str4) {
        k activity = getActivity();
        if (activity != null) {
            InstabugAlertDialog.showAlertDialog(activity, (String) null, str2, str3, str4, false, new C0113c(), new d());
        }
    }
}
