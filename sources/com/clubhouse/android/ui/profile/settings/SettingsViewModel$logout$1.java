package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.profile.settings.SettingsViewModel$logout$1", f = "SettingsViewModel.kt", l = {109}, m = "invokeSuspend")
/* compiled from: SettingsViewModel.kt */
public final class SettingsViewModel$logout$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ SettingsViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SettingsViewModel$logout$1(SettingsViewModel settingsViewModel, m0.l.c<? super SettingsViewModel$logout$1> cVar) {
        super(1, cVar);
        this.d = settingsViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new SettingsViewModel$logout$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new SettingsViewModel$logout$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UserRepo userRepo = this.d.s;
            this.c = 1;
            obj = userRepo.u(this);
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
