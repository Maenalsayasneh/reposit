package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.app.R;
import com.google.android.material.switchmaterial.SwitchMaterial;
import i0.e.b.g3.u.z5.y0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: NotificationSettingsFragment.kt */
public final class NotificationSettingsFragment$invalidate$1 extends Lambda implements l<y0, SwitchMaterial> {
    public final /* synthetic */ NotificationSettingsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationSettingsFragment$invalidate$1(NotificationSettingsFragment notificationSettingsFragment) {
        super(1);
        this.c = notificationSettingsFragment;
    }

    public Object invoke(Object obj) {
        y0 y0Var = (y0) obj;
        i.e(y0Var, "state");
        if (y0Var.e) {
            this.c.N0().b.setText(this.c.getString(R.string.backchannel_wave_notifications_desc));
        } else {
            this.c.N0().b.setText(this.c.getString(R.string.backchannel_notifications_desc));
        }
        SwitchMaterial switchMaterial = this.c.N0().e;
        switchMaterial.setChecked(y0Var.a);
        switchMaterial.jumpDrawablesToCurrentState();
        SwitchMaterial switchMaterial2 = this.c.N0().c;
        switchMaterial2.setChecked(y0Var.b);
        switchMaterial2.jumpDrawablesToCurrentState();
        SwitchMaterial switchMaterial3 = this.c.N0().f;
        switchMaterial3.setChecked(y0Var.c);
        switchMaterial3.jumpDrawablesToCurrentState();
        SwitchMaterial switchMaterial4 = this.c.N0().d;
        switchMaterial4.setChecked(y0Var.d);
        switchMaterial4.jumpDrawablesToCurrentState();
        return switchMaterial4;
    }
}
