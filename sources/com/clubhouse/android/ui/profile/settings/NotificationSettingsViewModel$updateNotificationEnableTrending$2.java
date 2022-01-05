package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.c;
import i0.b.b.f0;
import i0.e.b.g3.u.z5.p1;
import i0.e.b.g3.u.z5.q1;
import i0.e.b.g3.u.z5.y0;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: NotificationSettingsViewModel.kt */
public final class NotificationSettingsViewModel$updateNotificationEnableTrending$2 extends Lambda implements p<y0, b<? extends EmptySuccessResponse>, y0> {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ NotificationSettingsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationSettingsViewModel$updateNotificationEnableTrending$2(boolean z, NotificationSettingsViewModel notificationSettingsViewModel) {
        super(2);
        this.c = z;
        this.d = notificationSettingsViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        y0 y0Var = (y0) obj;
        b bVar = (b) obj2;
        i.e(y0Var, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            if (this.c) {
                ((AmplitudeAnalytics) this.d.n).a("Settings-Notifications-EnabledTrending");
            } else {
                ((AmplitudeAnalytics) this.d.n).a("Settings-Notifications-DisabledTrending");
            }
            this.d.o(new q1(this.c));
            NotificationSettingsViewModel notificationSettingsViewModel = this.d;
            final boolean z = this.c;
            notificationSettingsViewModel.m(new l<y0, y0>() {
                public Object invoke(Object obj) {
                    y0 y0Var = (y0) obj;
                    i.e(y0Var, "$this$setState");
                    return y0.copy$default(y0Var, false, false, z, false, false, 27, (Object) null);
                }
            });
        }
        if (bVar instanceof c) {
            this.d.o(new p1(((c) bVar).b.getMessage()));
        }
        return y0Var;
    }
}
