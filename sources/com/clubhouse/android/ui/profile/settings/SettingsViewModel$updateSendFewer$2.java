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
import i0.e.b.g3.u.z5.d1;
import i0.e.b.g3.u.z5.n1;
import i0.e.b.g3.u.z5.o1;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: SettingsViewModel.kt */
public final class SettingsViewModel$updateSendFewer$2 extends Lambda implements p<d1, b<? extends EmptySuccessResponse>, d1> {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ SettingsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$updateSendFewer$2(boolean z, SettingsViewModel settingsViewModel) {
        super(2);
        this.c = z;
        this.d = settingsViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        d1 d1Var = (d1) obj;
        b bVar = (b) obj2;
        i.e(d1Var, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            if (this.c) {
                ((AmplitudeAnalytics) this.d.o).a("Settings-Notifications-EnabledFewer");
            } else {
                ((AmplitudeAnalytics) this.d.o).a("Settings-Notifications-DisabledFewer");
            }
            this.d.o(new o1(this.c));
            SettingsViewModel settingsViewModel = this.d;
            final boolean z = this.c;
            settingsViewModel.m(new l<d1, d1>() {
                public Object invoke(Object obj) {
                    d1 d1Var = (d1) obj;
                    i.e(d1Var, "$this$setState");
                    return d1.copy$default(d1Var, (UserSelf) null, false, (NotificationFrequency) null, (NotificationPause) null, false, false, false, false, z, false, false, false, false, 7935, (Object) null);
                }
            });
        }
        if (bVar instanceof c) {
            this.d.o(new n1(((c) bVar).b.getMessage()));
        }
        return d1Var;
    }
}
