package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.analytics.AmplitudeAnalytics;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.e;
import i0.e.b.g3.u.z5.d1;
import kotlin.jvm.internal.Lambda;
import m0.n.a.p;
import m0.n.b.i;

/* compiled from: SettingsViewModel.kt */
public final class SettingsViewModel$logout$2 extends Lambda implements p<d1, b<? extends EmptySuccessResponse>, d1> {
    public final /* synthetic */ SettingsViewModel c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$logout$2(SettingsViewModel settingsViewModel) {
        super(2);
        this.c = settingsViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        d1 d1Var = (d1) obj;
        b bVar = (b) obj2;
        i.e(d1Var, "$this$execute");
        i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
        if (!(bVar instanceof e)) {
            ((AmplitudeAnalytics) this.c.o).a("Settings-Logout");
            this.c.n.d((Object) null);
        }
        return d1Var;
    }
}
