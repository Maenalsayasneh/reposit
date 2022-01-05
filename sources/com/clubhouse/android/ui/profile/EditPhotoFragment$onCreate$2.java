package com.clubhouse.android.ui.profile;

import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.j;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;
import m0.n.a.p;

@c(c = "com.clubhouse.android.ui.profile.EditPhotoFragment$onCreate$2", f = "EditPhotoFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: EditPhotoFragment.kt */
public final class EditPhotoFragment$onCreate$2 extends SuspendLambda implements p<Throwable, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ EditPhotoFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPhotoFragment$onCreate$2(EditPhotoFragment editPhotoFragment, m0.l.c<? super EditPhotoFragment$onCreate$2> cVar) {
        super(2, cVar);
        this.d = editPhotoFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        EditPhotoFragment$onCreate$2 editPhotoFragment$onCreate$2 = new EditPhotoFragment$onCreate$2(this.d, cVar);
        editPhotoFragment$onCreate$2.c = obj;
        return editPhotoFragment$onCreate$2;
    }

    public Object invoke(Object obj, Object obj2) {
        final EditPhotoFragment editPhotoFragment = this.d;
        EditPhotoFragment$onCreate$2 editPhotoFragment$onCreate$2 = new EditPhotoFragment$onCreate$2(editPhotoFragment, (m0.l.c) obj2);
        editPhotoFragment$onCreate$2.c = (Throwable) obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        final Throwable th = (Throwable) editPhotoFragment$onCreate$2.c;
        v.f2(editPhotoFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                String message = r3.getMessage();
                if (message == null) {
                    message = r0.getString(R.string.common_error_try_again);
                    m0.n.b.i.d(message, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(message);
                return i.a;
            }
        });
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        final Throwable th = (Throwable) this.c;
        final EditPhotoFragment editPhotoFragment = this.d;
        v.f2(editPhotoFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                String message = th.getMessage();
                if (message == null) {
                    message = editPhotoFragment.getString(R.string.common_error_try_again);
                    m0.n.b.i.d(message, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(message);
                return i.a;
            }
        });
        return i.a;
    }
}
