package com.clubhouse.android.ui.events.creation;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.models.remote.response.CreateEventResponse;
import com.clubhouse.android.data.repos.EventRepo;
import com.clubhouse.android.user.model.UserSelf;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.b.b.b;
import i0.b.b.e;
import i0.b.b.f0;
import i0.e.b.a3.b.d;
import i0.e.b.g3.o.w0.w;
import i0.j.f.p.h;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.m;
import n0.a.d0;

/* compiled from: AddEditEventViewModel.kt */
public final class AddEditEventViewModel$publishEvent$1 extends Lambda implements l<w, i> {
    public final /* synthetic */ AddEditEventViewModel c;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.events.creation.AddEditEventViewModel$publishEvent$1$2", f = "AddEditEventViewModel.kt", l = {159}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.events.creation.AddEditEventViewModel$publishEvent$1$2  reason: invalid class name */
    /* compiled from: AddEditEventViewModel.kt */
    public final class AnonymousClass2 extends SuspendLambda implements l<c<? super CreateEventResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass2(addEditEventViewModel, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass2(addEditEventViewModel, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            int i;
            Integer num;
            Long l;
            Instant instant;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i2 = this.c;
            if (i2 == 0) {
                h.d4(obj);
                UserSelf userSelf = w.this.l;
                if (userSelf == null) {
                    i = 0;
                } else {
                    i = new Integer(userSelf.a).intValue();
                }
                EventRepo eventRepo = addEditEventViewModel.o;
                String str = w.this.d;
                if (str == null) {
                    str = "";
                }
                ArrayList c2 = g.c(new Integer(i));
                List<UserInList> list = w.this.j;
                ArrayList arrayList = new ArrayList(h.K(list, 10));
                for (UserInList id : list) {
                    arrayList.add(new Integer(id.getId().intValue()));
                }
                List Z = g.Z(c2, arrayList);
                ClubWithAdmin clubWithAdmin = w.this.m;
                if (clubWithAdmin == null) {
                    num = null;
                } else {
                    num = new Integer(clubWithAdmin.x);
                }
                Boolean valueOf = Boolean.valueOf(w.this.k);
                w wVar = w.this;
                String str2 = wVar.e;
                if (str2 == null) {
                    str2 = "";
                }
                OffsetDateTime offsetDateTime = wVar.g;
                if (offsetDateTime == null || (instant = offsetDateTime.toInstant()) == null) {
                    l = null;
                } else {
                    l = new Long(instant.getEpochSecond());
                }
                this.c = 1;
                obj = eventRepo.a(str, Z, num, valueOf, str2, l, this);
                if (obj == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i2 == 1) {
                h.d4(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            return obj;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventViewModel$publishEvent$1(AddEditEventViewModel addEditEventViewModel) {
        super(1);
        this.c = addEditEventViewModel;
    }

    public Object invoke(Object obj) {
        final w wVar = (w) obj;
        m0.n.b.i.e(wVar, "state");
        if (!wVar.o) {
            this.c.m(AnonymousClass1.c);
            final AddEditEventViewModel addEditEventViewModel = this.c;
            AnonymousClass2 r3 = new AnonymousClass2((c<? super AnonymousClass2>) null);
            final AddEditEventViewModel addEditEventViewModel2 = this.c;
            MavericksViewModel.f(addEditEventViewModel, r3, (d0) null, (m) null, new p<w, b<? extends CreateEventResponse>, w>() {
                public Object invoke(Object obj, Object obj2) {
                    w wVar = (w) obj;
                    b bVar = (b) obj2;
                    m0.n.b.i.e(wVar, "$this$execute");
                    m0.n.b.i.e(bVar, InstabugDbContract.NetworkLogEntry.COLUMN_RESPONSE);
                    if (bVar instanceof f0) {
                        AddEditEventViewModel.this.p(new i0.e.b.g3.o.w0.f0(((CreateEventResponse) ((f0) bVar).b).a));
                    } else if (bVar instanceof i0.b.b.c) {
                        AddEditEventViewModel addEditEventViewModel = AddEditEventViewModel.this;
                        d dVar = new d(((i0.b.b.c) bVar).b.getMessage());
                        int i = AddEditEventViewModel.m;
                        addEditEventViewModel.o(dVar);
                    }
                    return w.copy$default(wVar, (EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, (OffsetDateTime) null, false, false, (List) null, false, (UserSelf) null, (ClubWithAdmin) null, (List) null, bVar instanceof e, 16383, (Object) null);
                }
            }, 3, (Object) null);
        }
        return i.a;
    }
}
