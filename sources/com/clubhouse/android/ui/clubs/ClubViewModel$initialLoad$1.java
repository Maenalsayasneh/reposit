package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import h0.b0.v;
import i0.j.f.p.h;
import java.util.Map;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.clubs.ClubViewModel$initialLoad$1", f = "ClubViewModel.kt", l = {166}, m = "invokeSuspend")
/* compiled from: ClubViewModel.kt */
public final class ClubViewModel$initialLoad$1 extends SuspendLambda implements l<m0.l.c<? super GetClubResponse>, Object> {
    public int c;
    public final /* synthetic */ ClubViewModel d;
    public final /* synthetic */ Integer q;
    public final /* synthetic */ ClubArgs x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel$initialLoad$1(ClubViewModel clubViewModel, Integer num, ClubArgs clubArgs, m0.l.c<? super ClubViewModel$initialLoad$1> cVar) {
        super(1, cVar);
        this.d = clubViewModel;
        this.q = num;
        this.x = clubArgs;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new ClubViewModel$initialLoad$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new ClubViewModel$initialLoad$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String str2;
        Map<String, Object> map;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ClubRepo clubRepo = this.d.q;
            Integer num = this.q;
            ClubArgs clubArgs = this.x;
            SourceLocation sourceLocation = null;
            if (clubArgs == null) {
                str = null;
            } else {
                str = clubArgs.d;
            }
            if (clubArgs == null) {
                str2 = null;
            } else {
                str2 = clubArgs.q;
            }
            if (clubArgs == null) {
                map = null;
            } else {
                map = clubArgs.Z1;
            }
            if (clubArgs != null) {
                sourceLocation = clubArgs.Y1;
            }
            Map<String, Object> t2 = v.t2(map, sourceLocation);
            this.c = 1;
            obj = clubRepo.j(num, str, str2, t2, this);
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
