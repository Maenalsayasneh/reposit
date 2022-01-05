package com.clubhouse.android.data.repos;

import com.clubhouse.android.data.models.local.Language;
import java.util.List;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import m0.l.f.a.c;

@c(c = "com.clubhouse.android.data.repos.LanguageRepo", f = "LanguageRepo.kt", l = {28}, m = "updateLanguages")
/* compiled from: LanguageRepo.kt */
public final class LanguageRepo$updateLanguages$1 extends ContinuationImpl {
    public /* synthetic */ Object c;
    public final /* synthetic */ LanguageRepo d;
    public int q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguageRepo$updateLanguages$1(LanguageRepo languageRepo, m0.l.c<? super LanguageRepo$updateLanguages$1> cVar) {
        super(cVar);
        this.d = languageRepo;
    }

    public final Object invokeSuspend(Object obj) {
        this.c = obj;
        this.q |= Integer.MIN_VALUE;
        return this.d.b((List<Language>) null, this);
    }
}
