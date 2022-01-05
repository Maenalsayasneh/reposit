package com.clubhouse.android.ui.onboarding;

import android.content.ContentResolver;
import android.net.Uri;
import com.clubhouse.android.data.models.remote.response.UpdatePhotoResponse;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.e.b.b3.b.d;
import i0.e.b.g3.r.j0;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.onboarding.AddPhotoViewModel$savePhoto$1$1$1", f = "AddPhotoViewModel.kt", l = {57}, m = "invokeSuspend")
/* compiled from: AddPhotoViewModel.kt */
public final class AddPhotoViewModel$savePhoto$1$1$1 extends SuspendLambda implements l<m0.l.c<? super UpdatePhotoResponse>, Object> {
    public int c;
    public final /* synthetic */ j0 d;
    public final /* synthetic */ Uri q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddPhotoViewModel$savePhoto$1$1$1(j0 j0Var, Uri uri, m0.l.c<? super AddPhotoViewModel$savePhoto$1$1$1> cVar) {
        super(1, cVar);
        this.d = j0Var;
        this.q = uri;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new AddPhotoViewModel$savePhoto$1$1$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new AddPhotoViewModel$savePhoto$1$1$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ContentResolver contentResolver = this.d.n.getContentResolver();
            m0.n.b.i.d(contentResolver, "contentResolver");
            d dVar = new d(contentResolver, this.q);
            OnboardingRepo onboardingRepo = this.d.m;
            this.c = 1;
            obj = onboardingRepo.o(dVar, this);
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
