package com.clubhouse.android.ui.profile;

import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.b.b;
import i0.e.b.a3.b.d;
import i0.e.b.a3.f.j;
import i0.e.b.g3.u.a4;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.EditPhotoFragment$onViewCreated$1", f = "EditPhotoFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: EditPhotoFragment.kt */
public final class EditPhotoFragment$onViewCreated$1 extends SuspendLambda implements p<b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ EditPhotoFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPhotoFragment$onViewCreated$1(EditPhotoFragment editPhotoFragment, m0.l.c<? super EditPhotoFragment$onViewCreated$1> cVar) {
        super(2, cVar);
        this.d = editPhotoFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        EditPhotoFragment$onViewCreated$1 editPhotoFragment$onViewCreated$1 = new EditPhotoFragment$onViewCreated$1(this.d, cVar);
        editPhotoFragment$onViewCreated$1.c = obj;
        return editPhotoFragment$onViewCreated$1;
    }

    public Object invoke(Object obj, Object obj2) {
        EditPhotoFragment$onViewCreated$1 editPhotoFragment$onViewCreated$1 = new EditPhotoFragment$onViewCreated$1(this.d, (m0.l.c) obj2);
        editPhotoFragment$onViewCreated$1.c = (b) obj;
        i iVar = i.a;
        editPhotoFragment$onViewCreated$1.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final b bVar = (b) this.c;
        if (bVar instanceof a4) {
            v.V1(this.d, "photo_url", ((a4) bVar).a);
            v.c1(this.d);
        } else if (bVar instanceof d) {
            final EditPhotoFragment editPhotoFragment = this.d;
            v.f2(editPhotoFragment, new l<j, i>() {
                public Object invoke(Object obj) {
                    j jVar = (j) obj;
                    m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                    String str = ((d) bVar).a;
                    if (str == null) {
                        str = editPhotoFragment.getString(R.string.common_error_try_again);
                        m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                    }
                    jVar.c.b.setText(str);
                    return i.a;
                }
            });
        }
        return i.a;
    }
}
