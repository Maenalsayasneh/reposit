package com.clubhouse.android.ui.profile.settings;

import android.view.View;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.data.models.local.notification.NotificationPause;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.UserSelf;
import com.google.android.material.switchmaterial.SwitchMaterial;
import h0.b0.v;
import i0.e.b.d3.k;
import i0.e.b.g3.u.z5.c0;
import i0.e.b.g3.u.z5.d0;
import i0.e.b.g3.u.z5.d1;
import i0.e.b.g3.u.z5.e0;
import i0.e.b.g3.u.z5.f0;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: SettingsFragment.kt */
public final class SettingsFragment$invalidate$1 extends Lambda implements l<d1, i> {
    public final /* synthetic */ SettingsFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsFragment$invalidate$1(SettingsFragment settingsFragment) {
        super(1);
        this.c = settingsFragment;
    }

    public Object invoke(Object obj) {
        d1 d1Var = (d1) obj;
        m0.n.b.i.e(d1Var, "state");
        SwitchMaterial switchMaterial = this.c.N0().t;
        NotificationPause notificationPause = d1Var.d;
        boolean z = true;
        switchMaterial.setChecked((notificationPause == NotificationPause.NULL || notificationPause == NotificationPause.UNPAUSE) ? false : true);
        switchMaterial.jumpDrawablesToCurrentState();
        SwitchMaterial switchMaterial2 = this.c.N0().x;
        switchMaterial2.setChecked(d1Var.i);
        switchMaterial2.jumpDrawablesToCurrentState();
        if (d1Var.l) {
            TextView textView = this.c.N0().u;
            m0.n.b.i.d(textView, "binding.payments");
            k.K(textView);
            View view = this.c.N0().v;
            m0.n.b.i.d(view, "binding.paymentsDivider");
            k.K(view);
            this.c.N0().u.setOnClickListener(new e0(this.c));
        }
        if (d1Var.m) {
            View view2 = this.c.N0().l;
            m0.n.b.i.d(view2, "binding.languagesDivider");
            k.K(view2);
            ConstraintLayout constraintLayout = this.c.N0().y;
            m0.n.b.i.d(constraintLayout, "binding.spatialAudioRoot");
            k.K(constraintLayout);
            SwitchMaterial switchMaterial3 = this.c.N0().z;
            switchMaterial3.setChecked(d1Var.j);
            switchMaterial3.jumpDrawablesToCurrentState();
        }
        if (d1Var.k) {
            CardView cardView = this.c.N0().f;
            m0.n.b.i.d(cardView, "binding.debugSettings");
            k.K(cardView);
            this.c.N0().r.setOnClickListener(new f0(this.c));
            this.c.N0().s.setOnClickListener(new c0(this.c));
            TextView textView2 = this.c.N0().b;
            m0.n.b.i.d(textView2, "binding.apiOverride");
            k.L(textView2, Boolean.valueOf(v.J0()));
            this.c.N0().b.setOnClickListener(new d0(this.c));
        }
        if (d1Var.b) {
            SwitchMaterial switchMaterial4 = this.c.N0().t;
            m0.n.b.i.d(switchMaterial4, "binding.pauseNotificationsSwitch");
            if (switchMaterial4.getVisibility() != 8) {
                z = false;
            }
            if (z) {
                SwitchMaterial switchMaterial5 = this.c.N0().t;
                m0.n.b.i.d(switchMaterial5, "binding.pauseNotificationsSwitch");
                k.l(switchMaterial5);
                SwitchMaterial switchMaterial6 = this.c.N0().x;
                m0.n.b.i.d(switchMaterial6, "binding.sendFewerNotificationsSwitch");
                k.l(switchMaterial6);
            }
        }
        UserSelf userSelf = d1Var.a;
        if (userSelf == null) {
            return null;
        }
        SettingsFragment settingsFragment = this.c;
        AvatarView avatarView = settingsFragment.N0().c;
        m0.n.b.i.d(avatarView, "binding.avatar");
        k.v(avatarView, userSelf);
        settingsFragment.N0().n.setText(userSelf.b);
        settingsFragment.N0().B.setText(m0.n.b.i.k("@", userSelf.c));
        return i.a;
    }
}
