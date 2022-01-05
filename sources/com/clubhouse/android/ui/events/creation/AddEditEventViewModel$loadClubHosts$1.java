package com.clubhouse.android.ui.events.creation;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.remote.response.GetClubsResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import com.clubhouse.android.user.model.UserSelf;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.g3.o.w0.w;
import i0.j.f.p.h;
import j$.time.OffsetDateTime;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: AddEditEventViewModel.kt */
public final class AddEditEventViewModel$loadClubHosts$1 extends Lambda implements l<w, i> {
    public final /* synthetic */ AddEditEventViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.events.creation.AddEditEventViewModel$loadClubHosts$1$1", f = "AddEditEventViewModel.kt", l = {140}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.events.creation.AddEditEventViewModel$loadClubHosts$1$1  reason: invalid class name */
    /* compiled from: AddEditEventViewModel.kt */
    public final class AnonymousClass1 extends SuspendLambda implements l<c<? super GetClubsResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass1(cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass1((c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                ClubRepo clubRepo = AddEditEventViewModel.this.p;
                this.c = 1;
                obj = clubRepo.m(true, this);
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
    public AddEditEventViewModel$loadClubHosts$1(AddEditEventViewModel addEditEventViewModel) {
        super(1);
        this.c = addEditEventViewModel;
    }

    public Object invoke(Object obj) {
        m0.n.b.i.e((w) obj, "state");
        final AddEditEventViewModel addEditEventViewModel = this.c;
        AnonymousClass1 r2 = new AnonymousClass1((c<? super AnonymousClass1>) null);
        final AddEditEventViewModel addEditEventViewModel2 = this.c;
        MavericksViewModel.f(addEditEventViewModel, r2, (d0) null, (m) null, new p<w, b<? extends GetClubsResponse>, w>() {
            public Object invoke(Object obj, Object obj2) {
                w wVar = (w) obj;
                final b bVar = (b) obj2;
                m0.n.b.i.e(wVar, "$this$execute");
                m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                if (bVar instanceof f0) {
                    AddEditEventViewModel addEditEventViewModel = AddEditEventViewModel.this;
                    AnonymousClass1 r1 = new l<w, w>() {
                        public Object invoke(Object obj) {
                            w wVar = (w) obj;
                            m0.n.b.i.e(wVar, "$this$setState");
                            List list = ((GetClubsResponse) ((f0) bVar).b).c;
                            if (list == null) {
                                list = EmptyList.c;
                            }
                            return w.copy$default(wVar, (EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, (OffsetDateTime) null, false, false, (List) null, false, (UserSelf) null, (ClubWithAdmin) null, list, false, 24575, (Object) null);
                        }
                    };
                    int i = AddEditEventViewModel.m;
                    addEditEventViewModel.m(r1);
                }
                return wVar;
            }
        }, 3, (Object) null);
        return i.a;
    }
}
