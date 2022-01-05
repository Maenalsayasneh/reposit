package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.data.models.local.notification.NotificationPause;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.NotificationRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.profile.settings.SettingsViewModel$updateNotificationPause$1", f = "SettingsViewModel.kt", l = {144}, m = "invokeSuspend")
/* compiled from: SettingsViewModel.kt */
public final class SettingsViewModel$updateNotificationPause$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ SettingsViewModel d;
    public final /* synthetic */ NotificationPause q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$updateNotificationPause$1(SettingsViewModel settingsViewModel, NotificationPause notificationPause, m0.l.c<? super SettingsViewModel$updateNotificationPause$1> cVar) {
        super(1, cVar);
        this.d = settingsViewModel;
        this.q = notificationPause;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new SettingsViewModel$updateNotificationPause$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new SettingsViewModel$updateNotificationPause$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            NotificationRepo notificationRepo = this.d.r;
            NotificationPause notificationPause = this.q;
            this.c = 1;
            obj = notificationRepo.g(notificationPause, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
