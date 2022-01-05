package com.clubhouse.android.ui.profile.settings;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.Language;
import com.clubhouse.android.data.models.remote.response.EmptySuccessResponse;
import com.clubhouse.android.data.repos.LanguageRepo;
import i0.e.b.g3.u.z5.v0;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.j.g;
import m0.l.c;
import m0.n.a.l;
import m0.r.m;
import n0.a.d0;

/* compiled from: LanguagesViewModel.kt */
public final class LanguagesViewModel$updateLanguage$1 extends Lambda implements l<v0, i> {
    public final /* synthetic */ LanguagesViewModel c;
    public final /* synthetic */ Language d;
    public final /* synthetic */ boolean q;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.settings.LanguagesViewModel$updateLanguage$1$3", f = "LanguagesViewModel.kt", l = {60}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.settings.LanguagesViewModel$updateLanguage$1$3  reason: invalid class name */
    /* compiled from: LanguagesViewModel.kt */
    public final class AnonymousClass3 extends SuspendLambda implements l<c<? super EmptySuccessResponse>, Object> {
        public int c;

        public final c<i> create(c<?> cVar) {
            return new AnonymousClass3(arrayList2, cVar);
        }

        public Object invoke(Object obj) {
            return new AnonymousClass3(arrayList2, (c) obj).invokeSuspend(i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                LanguageRepo languageRepo = LanguagesViewModel.this.n;
                List<Language> list = arrayList2;
                this.c = 1;
                obj = languageRepo.b(list, this);
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

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguagesViewModel$updateLanguage$1(LanguagesViewModel languagesViewModel, Language language, boolean z) {
        super(1);
        this.c = languagesViewModel;
        this.d = language;
        this.q = z;
    }

    public Object invoke(Object obj) {
        v0 v0Var = (v0) obj;
        m0.n.b.i.e(v0Var, "state");
        List<Language> list = v0Var.a;
        Language language = this.d;
        boolean z = this.q;
        final ArrayList arrayList = new ArrayList(h.K(list, 10));
        for (Language language2 : list) {
            if (m0.n.b.i.a(language2.c, language.c)) {
                language2 = new Language(language2.c, language2.d, language2.q, z);
            }
            arrayList.add(language2);
        }
        int i = 0;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                if (((Language) it.next()).x && (i = i + 1) < 0) {
                    g.q0();
                    throw null;
                }
            }
        }
        if (i > 0) {
            this.c.m(new l<v0, v0>() {
                public Object invoke(Object obj) {
                    m0.n.b.i.e((v0) obj, "$this$setState");
                    List<Language> list = arrayList;
                    m0.n.b.i.e(list, "languages");
                    return new v0(list, true);
                }
            });
            final ArrayList arrayList2 = new ArrayList();
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                Object next = it2.next();
                if (((Language) next).x) {
                    arrayList2.add(next);
                }
            }
            final LanguagesViewModel languagesViewModel = this.c;
            MavericksViewModel.f(languagesViewModel, new AnonymousClass3((c<? super AnonymousClass3>) null), (d0) null, (m) null, AnonymousClass4.c, 3, (Object) null);
        }
        return i.a;
    }
}
