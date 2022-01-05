package com.clubhouse.android.ui.profile.settings;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.Language;
import com.clubhouse.android.data.repos.LanguageRepo;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.g3.u.z5.v0;
import i0.e.b.g3.u.z5.v1;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: LanguagesViewModel.kt */
public final class LanguagesViewModel extends i0.e.b.a3.b.a<v0> {
    public static final /* synthetic */ int m = 0;
    public final LanguageRepo n;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.profile.settings.LanguagesViewModel$1", f = "LanguagesViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.profile.settings.LanguagesViewModel$1  reason: invalid class name */
    /* compiled from: LanguagesViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<i0.e.b.a3.b.c, c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ LanguagesViewModel d;

        {
            this.d = r1;
        }

        public final c<m0.i> create(Object obj, c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, (c) obj2);
            r02.c = (i0.e.b.a3.b.c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            i0.e.b.a3.b.c cVar = (i0.e.b.a3.b.c) this.c;
            if (cVar instanceof v1) {
                LanguagesViewModel languagesViewModel = this.d;
                v1 v1Var = (v1) cVar;
                Language language = v1Var.a;
                boolean z = v1Var.b;
                int i = LanguagesViewModel.m;
                Objects.requireNonNull(languagesViewModel);
                languagesViewModel.n(new LanguagesViewModel$updateLanguage$1(languagesViewModel, language, z));
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LanguagesViewModel(v0 v0Var, LanguageRepo languageRepo) {
        super(v0Var);
        i.e(v0Var, "initialState");
        i.e(languageRepo, "languageRepo");
        this.n = languageRepo;
        MavericksViewModel.f(this, new LanguagesViewModel$loadAllLanguages$1(this, (c<? super LanguagesViewModel$loadAllLanguages$1>) null), (d0) null, (m) null, new LanguagesViewModel$loadAllLanguages$2(this), 3, (Object) null);
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (c<? super AnonymousClass1>) null)), this.c);
    }

    /* compiled from: LanguagesViewModel.kt */
    public static final class a implements v<LanguagesViewModel, v0> {
        public final /* synthetic */ i0.e.b.c3.h.c<LanguagesViewModel, v0> a = new i0.e.b.c3.h.c<>(LanguagesViewModel.class);

        public a() {
        }

        public LanguagesViewModel create(j0 j0Var, v0 v0Var) {
            i.e(j0Var, "viewModelContext");
            i.e(v0Var, "state");
            return this.a.create(j0Var, v0Var);
        }

        public v0 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
