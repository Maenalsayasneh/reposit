package com.clubhouse.android.ui.clubs.create;

import android.net.Uri;
import androidx.core.app.FrameMetricsAggregator;
import com.clubhouse.android.data.repos.ClubRepo;
import i0.b.b.b;
import i0.b.b.j0;
import i0.e.b.a3.b.c;
import i0.e.b.g3.l.v2.j;
import i0.e.b.g3.l.v2.q;
import i0.e.b.g3.l.v2.r;
import i0.e.b.g3.l.v2.s;
import i0.e.b.g3.l.v2.t;
import i0.e.b.g3.l.v2.u;
import i0.e.b.g3.l.v2.v;
import i0.e.b.g3.l.v2.w;
import i0.e.b.g3.l.v2.x;
import i0.e.b.g3.l.v2.y;
import i0.j.f.p.h;
import io.agora.rtc.Constants;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: CreateClubViewModel.kt */
public final class CreateClubViewModel extends i0.e.b.a3.b.a<q> {
    public static final /* synthetic */ int m = 0;
    public final ClubRepo n;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.clubs.create.CreateClubViewModel$1", f = "CreateClubViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.clubs.create.CreateClubViewModel$1  reason: invalid class name */
    /* compiled from: CreateClubViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ CreateClubViewModel d;

        /* renamed from: com.clubhouse.android.ui.clubs.create.CreateClubViewModel$1$a */
        /* compiled from: kotlin-style lambda group */
        public static final class a extends Lambda implements l<q, q> {
            public final /* synthetic */ int c;
            public final /* synthetic */ Object d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(int i, Object obj) {
                super(1);
                this.c = i;
                this.d = obj;
            }

            public final Object invoke(Object obj) {
                switch (this.c) {
                    case 0:
                        q qVar = (q) obj;
                        i.e(qVar, "$this$setState");
                        return q.copy$default(qVar, (b) null, ((w) ((c) this.d)).a, (String) null, false, false, false, false, (Uri) null, 0, (List) null, Constants.WARN_ADM_RECORD_ABNORMAL_FREQUENCY, (Object) null);
                    case 1:
                        q qVar2 = (q) obj;
                        i.e(qVar2, "$this$setState");
                        return q.copy$default(qVar2, (b) null, (String) null, ((r) ((c) this.d)).a, false, false, false, false, (Uri) null, 0, (List) null, 1019, (Object) null);
                    case 2:
                        q qVar3 = (q) obj;
                        i.e(qVar3, "$this$setState");
                        return q.copy$default(qVar3, (b) null, (String) null, (String) null, false, false, false, ((t) ((c) this.d)).a, (Uri) null, 0, (List) null, 959, (Object) null);
                    case 3:
                        q qVar4 = (q) obj;
                        i.e(qVar4, "$this$setState");
                        return q.copy$default(qVar4, (b) null, (String) null, (String) null, ((s) ((c) this.d)).a, false, false, false, (Uri) null, 0, (List) null, 1015, (Object) null);
                    case 4:
                        q qVar5 = (q) obj;
                        i.e(qVar5, "$this$setState");
                        return q.copy$default(qVar5, (b) null, (String) null, (String) null, false, ((v) ((c) this.d)).a, false, false, (Uri) null, 0, (List) null, 1007, (Object) null);
                    case 5:
                        q qVar6 = (q) obj;
                        i.e(qVar6, "$this$setState");
                        return q.copy$default(qVar6, (b) null, (String) null, (String) null, false, false, ((u) ((c) this.d)).a, false, (Uri) null, 0, (List) null, 991, (Object) null);
                    case 6:
                        q qVar7 = (q) obj;
                        i.e(qVar7, "$this$setState");
                        return q.copy$default(qVar7, (b) null, (String) null, (String) null, false, false, false, false, ((x) ((c) this.d)).a, 0, (List) null, 895, (Object) null);
                    case 7:
                        q qVar8 = (q) obj;
                        i.e(qVar8, "$this$setState");
                        return q.copy$default(qVar8, (b) null, (String) null, (String) null, false, false, false, false, (Uri) null, 0, ((y) ((c) this.d)).a, FrameMetricsAggregator.EVERY_DURATION, (Object) null);
                    default:
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
            if (cVar instanceof j) {
                CreateClubViewModel createClubViewModel = this.d;
                int i = CreateClubViewModel.m;
                Objects.requireNonNull(createClubViewModel);
                createClubViewModel.n(new CreateClubViewModel$createClub$1(createClubViewModel));
            } else if (cVar instanceof w) {
                CreateClubViewModel createClubViewModel2 = this.d;
                a aVar = new a(0, cVar);
                int i2 = CreateClubViewModel.m;
                createClubViewModel2.m(aVar);
            } else if (cVar instanceof r) {
                CreateClubViewModel createClubViewModel3 = this.d;
                a aVar2 = new a(1, cVar);
                int i3 = CreateClubViewModel.m;
                createClubViewModel3.m(aVar2);
            } else if (cVar instanceof t) {
                CreateClubViewModel createClubViewModel4 = this.d;
                a aVar3 = new a(2, cVar);
                int i4 = CreateClubViewModel.m;
                createClubViewModel4.m(aVar3);
            } else if (cVar instanceof s) {
                CreateClubViewModel createClubViewModel5 = this.d;
                a aVar4 = new a(3, cVar);
                int i5 = CreateClubViewModel.m;
                createClubViewModel5.m(aVar4);
            } else if (cVar instanceof v) {
                CreateClubViewModel createClubViewModel6 = this.d;
                a aVar5 = new a(4, cVar);
                int i6 = CreateClubViewModel.m;
                createClubViewModel6.m(aVar5);
            } else if (cVar instanceof u) {
                CreateClubViewModel createClubViewModel7 = this.d;
                a aVar6 = new a(5, cVar);
                int i7 = CreateClubViewModel.m;
                createClubViewModel7.m(aVar6);
            } else if (cVar instanceof x) {
                CreateClubViewModel createClubViewModel8 = this.d;
                a aVar7 = new a(6, cVar);
                int i8 = CreateClubViewModel.m;
                createClubViewModel8.m(aVar7);
            } else if (cVar instanceof y) {
                CreateClubViewModel createClubViewModel9 = this.d;
                a aVar8 = new a(7, cVar);
                int i9 = CreateClubViewModel.m;
                createClubViewModel9.m(aVar8);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateClubViewModel(q qVar, i0.e.b.f3.i.a aVar) {
        super(qVar);
        i.e(qVar, "initialState");
        i.e(aVar, "userComponentHandler");
        this.n = ((i0.e.b.c3.i.a) h.L0(aVar, i0.e.b.c3.i.a.class)).l();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
    }

    /* compiled from: CreateClubViewModel.kt */
    public static final class a implements i0.b.b.v<CreateClubViewModel, q> {
        public final /* synthetic */ i0.e.b.c3.h.c<CreateClubViewModel, q> a = new i0.e.b.c3.h.c<>(CreateClubViewModel.class);

        public a() {
        }

        public CreateClubViewModel create(j0 j0Var, q qVar) {
            i.e(j0Var, "viewModelContext");
            i.e(qVar, "state");
            return this.a.create(j0Var, qVar);
        }

        public q initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
