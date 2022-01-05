package com.clubhouse.android.ui.events.creation;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.EventRepo;
import com.clubhouse.android.user.model.UserSelf;
import i0.e.b.g3.o.w0.w;
import i0.j.f.p.h;
import j$.time.Instant;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.j.g;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.events.creation.AddEditEventViewModel$editEvent$2$1$1", f = "AddEditEventViewModel.kt", l = {189}, m = "invokeSuspend")
/* compiled from: AddEditEventViewModel.kt */
public final class AddEditEventViewModel$editEvent$2$1$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ w d;
    public final /* synthetic */ AddEditEventViewModel q;
    public final /* synthetic */ EventInClub x;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventViewModel$editEvent$2$1$1(w wVar, AddEditEventViewModel addEditEventViewModel, EventInClub eventInClub, m0.l.c<? super AddEditEventViewModel$editEvent$2$1$1> cVar) {
        super(1, cVar);
        this.d = wVar;
        this.q = addEditEventViewModel;
        this.x = eventInClub;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new AddEditEventViewModel$editEvent$2$1$1(this.d, this.q, this.x, cVar);
    }

    public Object invoke(Object obj) {
        return new AddEditEventViewModel$editEvent$2$1$1(this.d, this.q, this.x, (m0.l.c) obj).invokeSuspend(i.a);
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
            UserSelf userSelf = this.d.l;
            if (userSelf == null) {
                i = 0;
            } else {
                i = new Integer(userSelf.a).intValue();
            }
            EventRepo eventRepo = this.q.o;
            EventInClub eventInClub = this.x;
            int i3 = eventInClub.Y1;
            String str = eventInClub.a2;
            if (str == null) {
                str = "";
            }
            ArrayList c2 = g.c(new Integer(i));
            List<UserInList> list = this.d.j;
            ArrayList arrayList = new ArrayList(h.K(list, 10));
            for (UserInList id : list) {
                arrayList.add(new Integer(id.getId().intValue()));
            }
            List Z = g.Z(c2, arrayList);
            ClubWithAdmin clubWithAdmin = this.d.m;
            if (clubWithAdmin == null) {
                num = null;
            } else {
                num = new Integer(clubWithAdmin.x);
            }
            Boolean valueOf = Boolean.valueOf(this.d.k);
            EventInClub eventInClub2 = this.x;
            String str2 = eventInClub2.Z1;
            if (str2 == null) {
                str2 = "";
            }
            OffsetDateTime offsetDateTime = eventInClub2.c2;
            if (offsetDateTime == null || (instant = offsetDateTime.toInstant()) == null) {
                l = null;
            } else {
                l = new Long(instant.getEpochSecond());
            }
            this.c = 1;
            obj = eventRepo.c(i3, str, Z, num, valueOf, str2, l, this);
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
