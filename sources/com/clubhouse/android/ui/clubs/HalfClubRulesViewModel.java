package com.clubhouse.android.ui.clubs;

import com.clubhouse.android.data.repos.ClubRepo;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.l.a2;
import i0.e.b.g3.l.e2;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: HalfClubRulesViewModel.kt */
public final class HalfClubRulesViewModel extends i0.e.b.a3.b.a<a2> {
    public static final /* synthetic */ int m = 0;
    public final ClubRepo n;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.clubs.HalfClubRulesViewModel$1", f = "HalfClubRulesViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.clubs.HalfClubRulesViewModel$1  reason: invalid class name */
    /* compiled from: HalfClubRulesViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ HalfClubRulesViewModel d;

        {
            this.d = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, (m0.l.c) obj2);
            r02.c = (c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            if (((c) this.c) instanceof e2) {
                HalfClubRulesViewModel halfClubRulesViewModel = this.d;
                int i = HalfClubRulesViewModel.m;
                Objects.requireNonNull(halfClubRulesViewModel);
                halfClubRulesViewModel.n(new HalfClubRulesViewModel$joinClub$1(halfClubRulesViewModel));
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfClubRulesViewModel(a2 a2Var, i0.e.b.f3.i.a aVar) {
        super(a2Var);
        i.e(a2Var, "initialState");
        i.e(aVar, "userComponentHandler");
        this.n = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).l();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
    }

    /* compiled from: HalfClubRulesViewModel.kt */
    public static final class a implements v<HalfClubRulesViewModel, a2> {
        public final /* synthetic */ i0.e.b.c3.h.c<HalfClubRulesViewModel, a2> a = new i0.e.b.c3.h.c<>(HalfClubRulesViewModel.class);

        public a() {
        }

        public HalfClubRulesViewModel create(j0 j0Var, a2 a2Var) {
            i.e(j0Var, "viewModelContext");
            i.e(a2Var, "state");
            return this.a.create(j0Var, a2Var);
        }

        public a2 initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
