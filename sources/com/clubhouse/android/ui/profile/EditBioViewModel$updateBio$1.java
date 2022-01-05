package com.clubhouse.android.ui.profile;

import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.UserRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.profile.EditBioViewModel$updateBio$1", f = "EditBioViewModel.kt", l = {56}, m = "invokeSuspend")
/* compiled from: EditBioViewModel.kt */
public final class EditBioViewModel$updateBio$1 extends SuspendLambda implements l<m0.l.c<? super EmptySuccessResponse>, Object> {
    public int c;
    public final /* synthetic */ EditBioViewModel d;
    public final /* synthetic */ String q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditBioViewModel$updateBio$1(EditBioViewModel editBioViewModel, String str, m0.l.c<? super EditBioViewModel$updateBio$1> cVar) {
        super(1, cVar);
        this.d = editBioViewModel;
        this.q = str;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new EditBioViewModel$updateBio$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new EditBioViewModel$updateBio$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            UserRepo userRepo = this.d.n;
            String str = this.q;
            this.c = 1;
            obj = userRepo.y(str, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else if (i == 1) {
            h.d4(obj);
        } else {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return obj;
    }
}
