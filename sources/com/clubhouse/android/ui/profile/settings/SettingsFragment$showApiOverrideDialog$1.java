package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.databinding.DialogEditTextBinding;
import com.clubhouse.app.R;
import h0.b.a.d;
import i0.d.a.a.a;
import i0.e.b.g3.u.z5.g0;
import i0.e.b.g3.u.z5.h0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: SettingsFragment.kt */
public final class SettingsFragment$showApiOverrideDialog$1 extends Lambda implements l<d.a, i> {
    public final /* synthetic */ DialogEditTextBinding c;
    public final /* synthetic */ SettingsFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsFragment$showApiOverrideDialog$1(DialogEditTextBinding dialogEditTextBinding, SettingsFragment settingsFragment) {
        super(1);
        this.c = dialogEditTextBinding;
        this.d = settingsFragment;
    }

    public Object invoke(Object obj) {
        d.a aVar = (d.a) obj;
        a.j(aVar, "$this$alertDialog", R.string.api_override, R.string.api_override_message);
        aVar.f(this.c.a);
        aVar.d(R.string.ok, new g0(this.d, this.c));
        aVar.c(R.string.cancel, h0.c);
        return i.a;
    }
}
