package defpackage;

import com.clubhouse.android.data.models.local.notification.ActionableNotification;
import com.clubhouse.android.ui.activity.ActivityViewModel;
import com.clubhouse.android.ui.activity.ActivityViewModel$getActionableNotifications$2$1;
import com.clubhouse.android.ui.activity.ActivityViewModel$getActionableNotifications$4$1;
import i0.b.b.b;
import i0.b.b.f0;
import i0.e.b.g3.j.d0;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;
import n0.a.g2.d;

/* renamed from: j  reason: default package */
/* compiled from: kotlin-style lambda group */
public final class j extends Lambda implements p<d0, b<? extends d<? extends List<? extends ActionableNotification>>>, d0> {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public j(int i, Object obj) {
        super(2);
        this.c = i;
        this.d = obj;
    }

    public final Object invoke(Object obj, Object obj2) {
        int i = this.c;
        if (i == 0) {
            d0 d0Var = (d0) obj;
            b bVar = (b) obj2;
            i.e(d0Var, "$this$execute");
            i.e(bVar, "it");
            if (bVar instanceof f0) {
                ActivityViewModel activityViewModel = (ActivityViewModel) this.d;
                a.E2(activityViewModel.c, (e) null, (CoroutineStart) null, new ActivityViewModel$getActionableNotifications$2$1(bVar, activityViewModel, (c<? super ActivityViewModel$getActionableNotifications$2$1>) null), 3, (Object) null);
            }
            if (bVar instanceof i0.b.b.c) {
                ((ActivityViewModel) this.d).o(new i0.e.b.a3.b.d(((i0.b.b.c) bVar).b.getLocalizedMessage()));
            }
            return d0Var;
        } else if (i == 1) {
            d0 d0Var2 = (d0) obj;
            b bVar2 = (b) obj2;
            i.e(d0Var2, "$this$execute");
            i.e(bVar2, "it");
            if (bVar2 instanceof f0) {
                ActivityViewModel activityViewModel2 = (ActivityViewModel) this.d;
                a.E2(activityViewModel2.c, (e) null, (CoroutineStart) null, new ActivityViewModel$getActionableNotifications$4$1(bVar2, activityViewModel2, (c<? super ActivityViewModel$getActionableNotifications$4$1>) null), 3, (Object) null);
            }
            if (bVar2 instanceof i0.b.b.c) {
                ((ActivityViewModel) this.d).o(new i0.e.b.a3.b.d(((i0.b.b.c) bVar2).b.getLocalizedMessage()));
            }
            return d0Var2;
        } else {
            throw null;
        }
    }
}
