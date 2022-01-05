package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.g3.u.z5.i0;
import i0.e.b.g3.u.z5.j0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: SettingsFragment.kt */
public final class SettingsFragment$showLogoutConfirmationDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ SettingsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsFragment$showLogoutConfirmationDialog$1(SettingsFragment settingsFragment) {
        super(1);
        this.c = settingsFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        a.j(aVar, "$this$alertDialog", R.string.log_out_dialog_title, R.string.log_out_dialog_body);
        aVar.d(R.string.yes, new j0(this.c));
        aVar.c(R.string.no, i0.c);
        return i.a;
    }
}
