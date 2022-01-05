package com.clubhouse.android.ui.events.creation;

import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.user.model.UserSelf;
import i0.b.a.o;
import i0.e.b.g3.o.w0.h;
import i0.e.b.g3.o.w0.p0.c;
import i0.e.b.g3.o.w0.p0.f;
import i0.e.b.g3.o.w0.w;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: AddEditEventFragment.kt */
public final class AddEditEventFragment$buildCoHostsModels$1 extends Lambda implements l<w, i> {
    public final /* synthetic */ o c;
    public final /* synthetic */ AddEditEventFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventFragment$buildCoHostsModels$1(o oVar, AddEditEventFragment addEditEventFragment) {
        super(1);
        this.c = oVar;
        this.d = addEditEventFragment;
    }

    public Object invoke(Object obj) {
        Integer num;
        w wVar = (w) obj;
        m0.n.b.i.e(wVar, "state");
        UserSelf userSelf = wVar.l;
        o oVar = this.c;
        f fVar = new f();
        Number[] numberArr = new Number[1];
        if (userSelf == null) {
            num = null;
        } else {
            num = Integer.valueOf(userSelf.a);
        }
        numberArr[0] = num;
        fVar.M(numberArr);
        fVar.L(userSelf);
        oVar.add(fVar);
        List<UserInList> list = wVar.j;
        o oVar2 = this.c;
        AddEditEventFragment addEditEventFragment = this.d;
        for (UserInList userInList : list) {
            c cVar = new c();
            cVar.L(new Number[]{userInList.getId()});
            cVar.O(userInList);
            cVar.N(userSelf != null && userSelf.a == userInList.getId().intValue());
            cVar.M(new h(addEditEventFragment, userInList));
            oVar2.add(cVar);
        }
        return i.a;
    }
}
