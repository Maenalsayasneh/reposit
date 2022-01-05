package com.clubhouse.android.ui.clubs.rules;

import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.l.b3.l;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.clubs.rules.EditClubRulesFragment$onViewCreated$1", f = "EditClubRulesFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: EditClubRulesFragment.kt */
public final class EditClubRulesFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ EditClubRulesFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditClubRulesFragment$onViewCreated$1(EditClubRulesFragment editClubRulesFragment, m0.l.c<? super EditClubRulesFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = editClubRulesFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        EditClubRulesFragment$onViewCreated$1 editClubRulesFragment$onViewCreated$1 = new EditClubRulesFragment$onViewCreated$1(this.d, cVar);
        editClubRulesFragment$onViewCreated$1.c = obj;
        return editClubRulesFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        EditClubRulesFragment$onViewCreated$1 editClubRulesFragment$onViewCreated$1 = new EditClubRulesFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        editClubRulesFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        editClubRulesFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof l) {
            v.V1(this.d, "club_rules", ((l) bVar).a);
            v.c1(this.d);
        } else if (bVar instanceof d) {
            v.f2(this.d, new m0.n.a.l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    jVar.e(((d) bVar).a);
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
