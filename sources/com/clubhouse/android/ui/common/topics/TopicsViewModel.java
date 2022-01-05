package com.clubhouse.android.ui.common.topics;

import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.repos.TopicRepo;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.shared.auth.UserManager;
import i0.b.b.j0;
import i0.b.b.v;
import i0.e.b.g3.m.g.b;
import i0.e.b.g3.m.g.d;
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

/* compiled from: TopicsViewModel.kt */
public final class TopicsViewModel extends i0.e.b.a3.b.a<d> {
    public static final /* synthetic */ int m = 0;
    public final TopicRepo n;
    public final UserRepo o;
    public UserManager p;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.common.topics.TopicsViewModel$1", f = "TopicsViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.common.topics.TopicsViewModel$1  reason: invalid class name */
    /* compiled from: TopicsViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<i0.e.b.a3.b.c, c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ TopicsViewModel d;

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
            if (cVar instanceof i0.e.b.g3.m.g.a) {
                TopicsViewModel topicsViewModel = this.d;
                Topic topic = ((i0.e.b.g3.m.g.a) cVar).a;
                int i = TopicsViewModel.m;
                Objects.requireNonNull(topicsViewModel);
                MavericksViewModel.f(topicsViewModel, new TopicsViewModel$addUserTopic$1(topicsViewModel, topic, (c<? super TopicsViewModel$addUserTopic$1>) null), (d0) null, (m) null, new TopicsViewModel$addUserTopic$2(topic), 3, (Object) null);
            } else if (cVar instanceof b) {
                TopicsViewModel topicsViewModel2 = this.d;
                Topic topic2 = ((b) cVar).a;
                int i2 = TopicsViewModel.m;
                Objects.requireNonNull(topicsViewModel2);
                MavericksViewModel.f(topicsViewModel2, new TopicsViewModel$removeUserTopic$1(topicsViewModel2, topic2, (c<? super TopicsViewModel$removeUserTopic$1>) null), (d0) null, (m) null, new TopicsViewModel$removeUserTopic$2(topic2), 3, (Object) null);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TopicsViewModel(d dVar, TopicRepo topicRepo, UserRepo userRepo, UserManager userManager) {
        super(dVar);
        i.e(dVar, "initialState");
        i.e(topicRepo, "topicRepo");
        i.e(userRepo, "userRepo");
        i.e(userManager, "userManager");
        this.n = topicRepo;
        this.o = userRepo;
        this.p = userManager;
        MavericksViewModel.f(this, new TopicsViewModel$loadAllTopics$1(this, (c<? super TopicsViewModel$loadAllTopics$1>) null), (d0) null, (m) null, new TopicsViewModel$loadAllTopics$2(this), 3, (Object) null);
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (c<? super AnonymousClass1>) null)), this.c);
    }

    /* compiled from: TopicsViewModel.kt */
    public static final class a implements v<TopicsViewModel, d> {
        public final /* synthetic */ i0.e.b.c3.h.c<TopicsViewModel, d> a = new i0.e.b.c3.h.c<>(TopicsViewModel.class);

        public a() {
        }

        public TopicsViewModel create(j0 j0Var, d dVar) {
            i.e(j0Var, "viewModelContext");
            i.e(dVar, "state");
            return this.a.create(j0Var, dVar);
        }

        public d initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
