package com.clubhouse.android.ui.profile;

import android.content.ContentResolver;
import android.net.Uri;
import com.clubhouse.android.data.models.remote.response.UpdatePhotoResponse;
import com.clubhouse.android.data.repos.OnboardingRepo;
import i0.e.b.b3.b.d;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.profile.EditPhotoViewModel$savePhoto$1$1$1", f = "EditPhotoViewModel.kt", l = {67}, m = "invokeSuspend")
/* compiled from: EditPhotoViewModel.kt */
public final class EditPhotoViewModel$savePhoto$1$1$1 extends SuspendLambda implements l<m0.l.c<? super UpdatePhotoResponse>, Object> {
    public int c;
    public final /* synthetic */ EditPhotoViewModel d;
    public final /* synthetic */ Uri q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditPhotoViewModel$savePhoto$1$1$1(EditPhotoViewModel editPhotoViewModel, Uri uri, m0.l.c<? super EditPhotoViewModel$savePhoto$1$1$1> cVar) {
        super(1, cVar);
        this.d = editPhotoViewModel;
        this.q = uri;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new EditPhotoViewModel$savePhoto$1$1$1(this.d, this.q, cVar);
    }

    public Object invoke(Object obj) {
        return new EditPhotoViewModel$savePhoto$1$1$1(this.d, this.q, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            ContentResolver contentResolver = this.d.o.getContentResolver();
            m0.n.b.i.d(contentResolver, "contentResolver");
            d dVar = new d(contentResolver, this.q);
            OnboardingRepo onboardingRepo = this.d.n;
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
