package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.data.models.local.notification.NotificationPause;
import i0.e.b.g3.i.c;
import i0.e.b.g3.u.z5.w1;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.a;
import m0.n.a.l;

/* compiled from: SettingsFragment.kt */
public final class SettingsFragment$showNotificationsPauseOptions$1$2$1 extends Lambda implements l<c, i> {
    public final /* synthetic */ SettingsFragment c;
    public final /* synthetic */ NotificationPause d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsFragment$showNotificationsPauseOptions$1$2$1(SettingsFragment settingsFragment, NotificationPause notificationPause) {
        super(1);
        this.c = settingsFragment;
        this.d = notificationPause;
    }

    public Object invoke(Object obj) {
        c cVar = (c) obj;
        m0.n.b.i.e(cVar, "$this$action");
        SettingsFragment settingsFragment = this.c;
        Integer label = this.d.getLabel();
        m0.n.b.i.c(label);
        String string = settingsFragment.getString(label.intValue());
        m0.n.b.i.d(string, "getString(it.label!!)");
        cVar.b(string);
        final SettingsFragment settingsFragment2 = this.c;
        final NotificationPause notificationPause = this.d;
        cVar.a(new a<i>() {
            public Object invoke() {
                SettingsFragment.this.O0().p(new w1(notificationPause));
                return i.a;
            }
        });
        return i.a;
    }
}
