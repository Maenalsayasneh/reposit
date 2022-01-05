package com.clubhouse.android.ui.clubs.rules;

import android.content.res.Resources;
import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.app.R;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.a3.b.d;
import i0.e.b.g3.l.b3.j;
import i0.e.b.g3.l.b3.k;
import i0.e.b.g3.l.b3.m;
import i0.e.b.g3.l.b3.n;
import i0.e.b.g3.l.b3.o;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt__IndentKt;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: EditClubRulesViewModel.kt */
public final class EditClubRulesViewModel extends i0.e.b.a3.b.a<j> {
    public static final /* synthetic */ int m = 0;
    public final Resources n;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.clubs.rules.EditClubRulesViewModel$1", f = "EditClubRulesViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.clubs.rules.EditClubRulesViewModel$1  reason: invalid class name */
    /* compiled from: EditClubRulesViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ EditClubRulesViewModel d;

        /* renamed from: com.clubhouse.android.ui.clubs.rules.EditClubRulesViewModel$1$a */
        /* compiled from: kotlin-style lambda group */
        public static final class a extends Lambda implements l<j, j> {
            public final /* synthetic */ int c;
            public final /* synthetic */ Object d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(int i, Object obj) {
                super(1);
                this.c = i;
                this.d = obj;
            }

            public final Object invoke(Object obj) {
                int i = this.c;
                if (i == 0) {
                    j jVar = (j) obj;
                    i.e(jVar, "$this$setState");
                    m mVar = (m) ((c) this.d);
                    return j.copy$default(jVar, new ClubRule(mVar.a, mVar.b), (ClubRule) null, (ClubRule) null, 6, (Object) null);
                } else if (i == 1) {
                    j jVar2 = (j) obj;
                    i.e(jVar2, "$this$setState");
                    o oVar = (o) ((c) this.d);
                    return j.copy$default(jVar2, (ClubRule) null, new ClubRule(oVar.a, oVar.b), (ClubRule) null, 5, (Object) null);
                } else if (i == 2) {
                    j jVar3 = (j) obj;
                    i.e(jVar3, "$this$setState");
                    n nVar = (n) ((c) this.d);
                    return j.copy$default(jVar3, (ClubRule) null, (ClubRule) null, new ClubRule(nVar.a, nVar.b), 3, (Object) null);
                } else {
                    throw null;
                }
            }
        }

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
            c cVar = (c) this.c;
            if (cVar instanceof m) {
                EditClubRulesViewModel editClubRulesViewModel = this.d;
                a aVar = new a(0, cVar);
                int i = EditClubRulesViewModel.m;
                editClubRulesViewModel.m(aVar);
            } else if (cVar instanceof o) {
                EditClubRulesViewModel editClubRulesViewModel2 = this.d;
                a aVar2 = new a(1, cVar);
                int i2 = EditClubRulesViewModel.m;
                editClubRulesViewModel2.m(aVar2);
            } else if (cVar instanceof n) {
                EditClubRulesViewModel editClubRulesViewModel3 = this.d;
                a aVar3 = new a(2, cVar);
                int i3 = EditClubRulesViewModel.m;
                editClubRulesViewModel3.m(aVar3);
            } else if (cVar instanceof k) {
                EditClubRulesViewModel editClubRulesViewModel4 = this.d;
                int i4 = EditClubRulesViewModel.m;
                Objects.requireNonNull(editClubRulesViewModel4);
                editClubRulesViewModel4.n(new EditClubRulesViewModel$saveRules$1(editClubRulesViewModel4));
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public EditClubRulesViewModel(j jVar, Resources resources) {
        super(jVar);
        i.e(jVar, "initialState");
        i.e(resources, "resources");
        this.n = resources;
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
    }

    public static final boolean q(EditClubRulesViewModel editClubRulesViewModel, ArrayList arrayList, ClubRule clubRule) {
        Objects.requireNonNull(editClubRulesViewModel);
        if (clubRule == null) {
            return true;
        }
        if (clubRule.d.length() > 0) {
            if (clubRule.c.length() == 0) {
                editClubRulesViewModel.o(new d(editClubRulesViewModel.n.getString(R.string.rule_title_cannot_be_empty)));
                return false;
            }
        }
        if (!(!StringsKt__IndentKt.o(clubRule.c))) {
            return true;
        }
        arrayList.add(clubRule);
        return true;
    }

    /* compiled from: EditClubRulesViewModel.kt */
    public static final class a implements v<EditClubRulesViewModel, j> {
        public final /* synthetic */ i0.e.b.c3.h.c<EditClubRulesViewModel, j> a = new i0.e.b.c3.h.c<>(EditClubRulesViewModel.class);

        public a() {
        }

        public EditClubRulesViewModel create(j0 j0Var, j jVar) {
            i.e(j0Var, "viewModelContext");
            i.e(jVar, "state");
            return this.a.create(j0Var, jVar);
        }

        public j initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
