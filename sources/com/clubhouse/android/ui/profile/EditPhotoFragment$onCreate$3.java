package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.remote.response.UpdatePhotoResponse;
import h0.b0.v;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.EditPhotoFragment$onCreate$3", f = "EditPhotoFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: EditPhotoFragment.kt */
public final class EditPhotoFragment$onCreate$3 extends SuspendLambda implements p<UpdatePhotoResponse, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ EditPhotoFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPhotoFragment$onCreate$3(EditPhotoFragment editPhotoFragment, m0.l.c<? super EditPhotoFragment$onCreate$3> cVar) {
        super(2, cVar);
        this.d = editPhotoFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        EditPhotoFragment$onCreate$3 editPhotoFragment$onCreate$3 = new EditPhotoFragment$onCreate$3(this.d, cVar);
        editPhotoFragment$onCreate$3.c = obj;
        return editPhotoFragment$onCreate$3;
    }

    public Object invoke(Object obj, Object obj2) {
        EditPhotoFragment$onCreate$3 editPhotoFragment$onCreate$3 = new EditPhotoFragment$onCreate$3(this.d, (m0.l.c) obj2);
        editPhotoFragment$onCreate$3.c = (UpdatePhotoResponse) obj;
        i iVar = i.a;
        editPhotoFragment$onCreate$3.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        if (!((UpdatePhotoResponse) this.c).a) {
            v.f2(this.d, AnonymousClass1.c);
        }
        return i.a;
    }
}
