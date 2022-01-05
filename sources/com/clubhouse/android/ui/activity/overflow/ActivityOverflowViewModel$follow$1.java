package com.clubhouse.android.ui.activity.overflow;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.activity.overflow.ActivityOverflowViewModel$follow$1", f = "ActivityOverflowViewModel.kt", l = {75}, m = "invokeSuspend")
/* compiled from: ActivityOverflowViewModel.kt */
public final class ActivityOverflowViewModel$follow$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ ActivityOverflowViewModel d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ActivityOverflowViewModel$follow$1(ActivityOverflowViewModel activityOverflowViewModel, int i, m0.l.c<? super ActivityOverflowViewModel$follow$1> cVar) {
        super(1, cVar);
        this.d = activityOverflowViewModel;
        this.q = i;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ActivityOverflowViewModel$follow$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new ActivityOverflowViewModel$follow$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UserRepo userRepo = this.d.o;
            int i2 = this.q;
            SourceLocation sourceLocation = SourceLocation.ACTIONABLE_NOTIFICATION;
            this.c = 1;
            obj = UserRepo.j(userRepo, i2, sourceLocation, (Map) null, this, 4, (Object) null);
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
