package com.clubhouse.android.ui.profile.settings;

import com.clubhouse.android.data.models.remote.response.LanguagePreferencesResponse;
import com.clubhouse.android.data.repos.LanguageRepo;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.profile.settings.LanguagesViewModel$loadAllLanguages$1", f = "LanguagesViewModel.kt", l = {70}, m = "invokeSuspend")
/* compiled from: LanguagesViewModel.kt */
public final class LanguagesViewModel$loadAllLanguages$1 extends SuspendLambda implements l<m0.l.c<? super LanguagePreferencesResponse>, Object> {
    public int c;
    public final /* synthetic */ LanguagesViewModel d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguagesViewModel$loadAllLanguages$1(LanguagesViewModel languagesViewModel, m0.l.c<? super LanguagesViewModel$loadAllLanguages$1> cVar) {
        super(1, cVar);
        this.d = languagesViewModel;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new LanguagesViewModel$loadAllLanguages$1(this.d, cVar);
    }

    public Object invoke(Object obj) {
        return new LanguagesViewModel$loadAllLanguages$1(this.d, (m0.l.c) obj).invokeSuspend(i.a);
    }

    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.c;
        if (i == 0) {
            h.d4(obj);
            LanguageRepo languageRepo = this.d.n;
            this.c = 1;
            obj = languageRepo.a(this);
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
