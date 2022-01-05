package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.NotificationRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.profile.settings.NotificationSettingsViewModel$updateNotificationEnableTrending$1", f = "NotificationSettingsViewModel.kt", l = {131}, m = "invokeSuspend")
/* compiled from: NotificationSettingsViewModel.kt */
public final class NotificationSettingsViewModel$updateNotificationEnableTrending$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ NotificationSettingsViewModel d;
    public final /* synthetic */ boolean q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NotificationSettingsViewModel$updateNotificationEnableTrending$1(NotificationSettingsViewModel notificationSettingsViewModel, boolean z, m0.l.c<? super NotificationSettingsViewModel$updateNotificationEnableTrending$1> cVar) {
        super(1, cVar);
        this.d = notificationSettingsViewModel;
        this.q = z;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new NotificationSettingsViewModel$updateNotificationEnableTrending$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new NotificationSettingsViewModel$updateNotificationEnableTrending$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            NotificationRepo notificationRepo = this.d.o;
            boolean z = this.q;
            this.c = 1;
            obj = notificationRepo.f(z, this);
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
