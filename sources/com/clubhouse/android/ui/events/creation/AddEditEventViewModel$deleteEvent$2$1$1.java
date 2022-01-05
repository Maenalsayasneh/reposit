package com.clubhouse.android.ui.events.creation;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.EventRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.events.creation.AddEditEventViewModel$deleteEvent$2$1$1", f = "AddEditEventViewModel.kt", l = {220}, m = "invokeSuspend")
/* compiled from: AddEditEventViewModel.kt */
public final class AddEditEventViewModel$deleteEvent$2$1$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ AddEditEventViewModel d;
    public final /* synthetic */ int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventViewModel$deleteEvent$2$1$1(AddEditEventViewModel addEditEventViewModel, int i, m0.l.c<? super AddEditEventViewModel$deleteEvent$2$1$1> cVar) {
        super(1, cVar);
        this.d = addEditEventViewModel;
        this.q = i;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new AddEditEventViewModel$deleteEvent$2$1$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new AddEditEventViewModel$deleteEvent$2$1$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            EventRepo eventRepo = this.d.o;
            int i2 = this.q;
            this.c = 1;
            obj = eventRepo.b(i2, this);
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
