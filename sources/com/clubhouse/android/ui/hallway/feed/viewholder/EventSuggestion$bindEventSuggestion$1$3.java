package com.clubhouse.android.ui.hallway.feed.viewholder;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.user.UserInList;
import i0.b.a.o;
import i0.e.b.g3.p.c0.e0.a0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: EventSuggestion.kt */
public final class EventSuggestion$bindEventSuggestion$1$3 extends Lambda implements l<o, i> {
    public final /* synthetic */ EventInClub c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EventSuggestion$bindEventSuggestion$1$3(EventInClub eventInClub) {
        super(1);
        this.c = eventInClub;
    }

    public Object invoke(Object obj) {
        o oVar = (o) obj;
        m0.n.b.i.e(oVar, "$this$safeWithModels");
        EventInClub eventInClub = this.c;
        List<UserInList> list = eventInClub.b2;
        if (list != null) {
            for (UserInList userInList : list) {
                a0 a0Var = new a0();
                a0Var.L(new Number[]{Integer.valueOf(userInList.getId().intValue() + eventInClub.Y1)});
                a0Var.M(userInList);
                oVar.add(a0Var);
            }
        }
        return i.a;
    }
}
