package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.remote.request.UpdateInstagramProfileResponse;
import com.clubhouse.app.R;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.u.e5;
import i0.e.b.g3.u.q4;
import i0.j.f.p.h;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

/* compiled from: HalfProfileViewModel.kt */
public final class HalfProfileViewModel$updateInstagramProfile$3 extends Lambda implements p<q4, b<? extends UpdateInstagramProfileResponse>, q4> {
    public final /* synthetic */ HalfProfileViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.HalfProfileViewModel$updateInstagramProfile$3$1", f = "HalfProfileViewModel.kt", l = {318}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.HalfProfileViewModel$updateInstagramProfile$3$1  reason: invalid class name */
    /* compiled from: HalfProfileViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements p<n0.a.f0, c<? super m0.i>, Object> {
        public int c;

        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            n0.a.f0 f0Var = (n0.a.f0) obj;
            return new AnonymousClass1((c) obj2).invokeSuspend(m0.i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                long millis = TimeUnit.SECONDS.toMillis(1);
                this.c = 1;
                if (a.d1(millis, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            HalfProfileViewModel halfProfileViewModel = HalfProfileViewModel.this;
            AnonymousClass1 r02 = AnonymousClass1.c;
            int i2 = HalfProfileViewModel.m;
            halfProfileViewModel.m(r02);
            HalfProfileViewModel.this.p(e5.a);
            HalfProfileViewModel halfProfileViewModel2 = HalfProfileViewModel.this;
            String string = halfProfileViewModel2.p.getString(R.string.instagram_connect_success);
            i.d(string, "resources.getString(R.string.instagram_connect_success)");
            halfProfileViewModel2.o(new i0.e.b.a3.b.e(string));
            return m0.i.a;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileViewModel$updateInstagramProfile$3(HalfProfileViewModel halfProfileViewModel) {
        super(2);
        this.c = halfProfileViewModel;
    }

    public Object invoke(Object obj, Object obj2) {
        q4 q4Var = (q4) obj;
        b bVar = (b) obj2;
        i.e(q4Var, "$this$execute");
        i.e(bVar, "it");
        if (bVar instanceof f0) {
            final HalfProfileViewModel halfProfileViewModel = this.c;
            a.E2(halfProfileViewModel.c, (e) null, (CoroutineStart) null, new AnonymousClass1((c<? super AnonymousClass1>) null), 3, (Object) null);
        }
        if (bVar instanceof i0.b.b.c) {
            this.c.m(AnonymousClass2.c);
            HalfProfileViewModel halfProfileViewModel2 = this.c;
            String message = ((i0.b.b.c) bVar).b.getMessage();
            if (message == null) {
                message = this.c.p.getString(R.string.instagram_connect_error);
                i.d(message, "resources.getString(R.string.instagram_connect_error)");
            }
            halfProfileViewModel2.o(new d(message));
        }
        return q4Var;
    }
}
