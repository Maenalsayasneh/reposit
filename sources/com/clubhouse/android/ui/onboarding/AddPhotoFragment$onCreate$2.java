package com.clubhouse.android.ui.onboarding;

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

@c(c = "com.clubhouse.android.ui.onboarding.AddPhotoFragment$onCreate$2", f = "AddPhotoFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: AddPhotoFragment.kt */
public final class AddPhotoFragment$onCreate$2 extends SuspendLambda implements p<Throwable, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ AddPhotoFragment d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPhotoFragment$onCreate$2(AddPhotoFragment addPhotoFragment, m0.l.c<? super AddPhotoFragment$onCreate$2> cVar) {
        super(2, cVar);
        this.d = addPhotoFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        AddPhotoFragment$onCreate$2 addPhotoFragment$onCreate$2 = new AddPhotoFragment$onCreate$2(this.d, cVar);
        addPhotoFragment$onCreate$2.c = obj;
        return addPhotoFragment$onCreate$2;
    }

    public Object invoke(Object obj, Object obj2) {
        final AddPhotoFragment addPhotoFragment = this.d;
        AddPhotoFragment$onCreate$2 addPhotoFragment$onCreate$2 = new AddPhotoFragment$onCreate$2(addPhotoFragment, (m0.l.c) obj2);
        addPhotoFragment$onCreate$2.c = (Throwable) obj;
        i iVar = i.a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(iVar);
        final Throwable th = (Throwable) addPhotoFragment$onCreate$2.c;
        v.f2(addPhotoFragment, new l<j, i>() {
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
        final AddPhotoFragment addPhotoFragment = this.d;
        v.f2(addPhotoFragment, new l<j, i>() {
            public Object invoke(Object obj) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                String message = th.getMessage();
                if (message == null) {
                    message = addPhotoFragment.getString(R.string.common_error_try_again);
                    m0.n.b.i.d(message, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(message);
                return i.a;
            }
        });
        return i.a;
    }
}
