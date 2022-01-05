package com.clubhouse.android.ui.profile;

import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.r.n1;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.EditUsernameFragment$initEffectsHandler$1", f = "EditUsernameFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: EditUsernameFragment.kt */
public final class EditUsernameFragment$initEffectsHandler$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ EditUsernameFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditUsernameFragment$initEffectsHandler$1(EditUsernameFragment editUsernameFragment, m0.l.c<? super EditUsernameFragment$initEffectsHandler$1> cVar) {
        super(2, cVar);
        this.d = editUsernameFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        EditUsernameFragment$initEffectsHandler$1 editUsernameFragment$initEffectsHandler$1 = new EditUsernameFragment$initEffectsHandler$1(this.d, cVar);
        editUsernameFragment$initEffectsHandler$1.c = obj;
        return editUsernameFragment$initEffectsHandler$1;
    }

    public Object invoke(Object obj, Object obj2) {
        EditUsernameFragment$initEffectsHandler$1 editUsernameFragment$initEffectsHandler$1 = new EditUsernameFragment$initEffectsHandler$1(this.d, (m0.l.c) obj2);
        editUsernameFragment$initEffectsHandler$1.c = (b) obj;
        i iVar = i.a;
        editUsernameFragment$initEffectsHandler$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof d) {
            final EditUsernameFragment editUsernameFragment = this.d;
            v.f2(editUsernameFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = editUsernameFragment.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        } else if (m0.n.b.i.a(bVar, n1.a)) {
            v.c1(this.d);
        }
        return i.a;
    }
}
