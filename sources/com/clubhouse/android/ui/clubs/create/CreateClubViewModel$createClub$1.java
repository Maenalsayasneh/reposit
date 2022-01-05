package com.clubhouse.android.ui.clubs.create;

import android.net.Uri;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.remote.response.GetCreateClubResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.b.b.f;
import i0.e.b.g3.l.v2.q;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.d0;

/* compiled from: CreateClubViewModel.kt */
public final class CreateClubViewModel$createClub$1 extends Lambda implements l<q, i> {
    public final /* synthetic */ CreateClubViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.clubs.create.CreateClubViewModel$createClub$1$1", f = "CreateClubViewModel.kt", l = {86}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.clubs.create.CreateClubViewModel$createClub$1$1  reason: invalid class name */
    /* compiled from: CreateClubViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super GetCreateClubResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(qVar, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1(qVar, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ClubRepo clubRepo = CreateClubViewModel.this.n;
                q qVar = qVar;
                String str = qVar.b;
                String str2 = qVar.c;
                List<Topic> list = qVar.j;
                ArrayList arrayList = new ArrayList(h.K(list, 10));
                for (Topic topic : list) {
                    arrayList.add(new Integer(topic.c));
                }
                q qVar2 = qVar;
                boolean z = qVar2.g;
                boolean z2 = qVar2.e;
                boolean z3 = qVar2.f;
                boolean z4 = qVar2.d;
                Uri uri = qVar2.h;
                this.c = 1;
                obj = clubRepo.h(str, str2, arrayList, z, z2, z3, z4, uri, this);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateClubViewModel$createClub$1(CreateClubViewModel createClubViewModel) {
        super(1);
        this.c = createClubViewModel;
    }

    public Object invoke(Object obj) {
        final q qVar = (q) obj;
        m0.n.b.i.e(qVar, "state");
        if (!(qVar.a instanceof f)) {
            final CreateClubViewModel createClubViewModel = this.c;
            MavericksViewModel.f(createClubViewModel, new AnonymousClass1((c<? super AnonymousClass1>) null), (d0) null, (m) null, AnonymousClass2.c, 3, (Object) null);
        }
        return i.a;
    }
}
