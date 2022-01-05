package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.data.models.local.notification.NotificationFrequency;
import com.clubhouse.android.data.models.local.notification.NotificationPause;
import com.clubhouse.android.data.models.remote.response.GetSettingsResponse;
import com.clubhouse.android.user.model.UserSelf;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.g3.u.z5.d1;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: SettingsViewModel.kt */
public final class SettingsViewModel$getSettings$2 extends Lambda implements p<d1, b<? extends GetSettingsResponse>, d1> {
    public final /* synthetic */ SettingsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$getSettings$2(SettingsViewModel settingsViewModel) {
        super(2);
        this.c = settingsViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        d1 d1Var = (d1) obj;
        b bVar = (b) obj2;
        i.e(d1Var, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (bVar instanceof f0) {
            final GetSettingsResponse getSettingsResponse = (GetSettingsResponse) ((f0) bVar).b;
            this.c.m(new l<d1, d1>() {
                public Object invoke(Object obj) {
                    NotificationPause notificationPause;
                    d1 d1Var = (d1) obj;
                    i.e(d1Var, "$this$setState");
                    GetSettingsResponse getSettingsResponse = GetSettingsResponse.this;
                    if (getSettingsResponse.g) {
                        notificationPause = NotificationPause.HOUR;
                    } else {
                        notificationPause = NotificationPause.NULL;
                    }
                    return d1.copy$default(d1Var, (UserSelf) null, true, (NotificationFrequency) null, notificationPause, getSettingsResponse.a, getSettingsResponse.b, getSettingsResponse.c, getSettingsResponse.d, getSettingsResponse.e, false, false, false, false, 7685, (Object) null);
                }
            });
        }
        return d1Var;
    }
}
