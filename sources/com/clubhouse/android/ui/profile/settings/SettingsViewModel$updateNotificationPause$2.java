package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.local.notification.NotificationFrequency;
import com.clubhouse.android.data.models.local.notification.NotificationPause;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.user.model.UserSelf;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.d.a.a.a;
import i0.e.b.g3.u.z5.d1;
import i0.e.b.g3.u.z5.f1;
import i0.e.b.g3.u.z5.g1;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: SettingsViewModel.kt */
public final class SettingsViewModel$updateNotificationPause$2 extends Lambda implements p<d1, b<? extends EmptySuccessResponse>, d1> {
    public final /* synthetic */ NotificationPause c;
    public final /* synthetic */ SettingsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$updateNotificationPause$2(NotificationPause notificationPause, SettingsViewModel settingsViewModel) {
        super(2);
        this.c = notificationPause;
        this.d = settingsViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        d1 d1Var = (d1) obj;
        b bVar = (b) obj2;
        i.e(d1Var, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            NotificationPause notificationPause = this.c;
            NotificationPause notificationPause2 = NotificationPause.UNPAUSE;
            if (notificationPause == notificationPause2) {
                ((AmplitudeAnalytics) this.d.o).a("Settings-Notifications-UnPaused");
            } else {
                Integer label = notificationPause.getLabel();
                String string = label != null ? this.d.p.getString(label.intValue()) : "unknown";
                i.d(string, "if (durationLabel != null) resources.getString(durationLabel) else \"unknown\"");
                ((AmplitudeAnalytics) this.d.o).b("Settings-Notifications-Paused", a.n1("duration", string));
            }
            this.d.o(new g1(this.c != notificationPause2));
            SettingsViewModel settingsViewModel = this.d;
            final NotificationPause notificationPause3 = this.c;
            settingsViewModel.m(new l<d1, d1>() {
                public Object invoke(Object obj) {
                    d1 d1Var = (d1) obj;
                    i.e(d1Var, "$this$setState");
                    return d1.copy$default(d1Var, (UserSelf) null, false, (NotificationFrequency) null, NotificationPause.this, false, false, false, false, false, false, false, false, false, 8183, (Object) null);
                }
            });
        }
        if (bVar instanceof c) {
            this.d.o(new f1(((c) bVar).b.getMessage()));
        }
        return d1Var;
    }
}
