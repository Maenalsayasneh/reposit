package com.clubhouse.android.shared.auth;

import android.app.Activity;
import com.clubhouse.android.core.ui.Banner;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.app.R;
import i0.e.b.a3.f.b;
import i0.e.b.a3.f.j;
import i0.e.b.f3.i.a;
import i0.j.f.p.h;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.c;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.i;
import n0.a.d0;
import n0.a.f0;
import n0.a.h2.o;
import n0.a.i0;
import n0.a.m0;

/* compiled from: SessionCoordinator.kt */
public final class SessionCoordinator {
    public final Activity a;
    public final f0 b;

    @m0.l.f.a.c(c = "com.clubhouse.android.shared.auth.SessionCoordinator$1", f = "SessionCoordinator.kt", l = {48, 51}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.shared.auth.SessionCoordinator$1  reason: invalid class name */
    /* compiled from: SessionCoordinator.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<Integer, c<? super m0.i>, Object> {
        public Object c;
        public int d;

        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(aVar, bVar, this, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            ((Number) obj).intValue();
            return new AnonymousClass1(aVar, bVar, this, (c) obj2).invokeSuspend(m0.i.a);
        }

        public final Object invokeSuspend(Object obj) {
            i0.e.b.h3.a.b bVar;
            i0.e.b.h3.a.b bVar2;
            Class cls = i0.e.b.c3.i.a.class;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.d;
            if (i == 0) {
                h.d4(obj);
                bVar2 = aVar.d;
                i.c(bVar2);
                UserRepo c2 = ((i0.e.b.c3.i.a) h.L0(bVar2, cls)).c();
                this.c = bVar2;
                this.d = 1;
                Object b = c2.l.b(this);
                if (b != coroutineSingletons) {
                    b = m0.i.a;
                }
                if (b == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else if (i == 1) {
                h.d4(obj);
                bVar2 = (i0.e.b.h3.a.b) this.c;
            } else if (i == 2) {
                bVar = (i0.e.b.h3.a.b) this.c;
                h.d4(obj);
                final i0<Integer> i0Var = ((i0.e.b.h3.a.a) h.L0(bVar, i0.e.b.h3.a.a.class)).a().a;
                final b bVar3 = bVar;
                final SessionCoordinator sessionCoordinator = this;
                i0Var.E(new l<Throwable, m0.i>() {
                    public Object invoke(Object obj) {
                        j jVar;
                        if (((Throwable) obj) != null) {
                            b bVar = bVar3;
                            SessionCoordinator sessionCoordinator = sessionCoordinator;
                            j create = bVar.create();
                            create.d(R.string.log_in_error);
                            create.h(Banner.Style.Negative);
                            sessionCoordinator.a(create);
                        } else {
                            try {
                                Integer i = i0Var.i();
                                if (i == null) {
                                    jVar = null;
                                } else {
                                    jVar = bVar3.create();
                                    jVar.d(i.intValue());
                                    jVar.h(Banner.Style.Positive);
                                }
                                sessionCoordinator.a(jVar);
                            } catch (Exception unused) {
                                sessionCoordinator.a((Banner) null);
                            }
                        }
                        return m0.i.a;
                    }
                });
                return m0.i.a;
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            UserRepo c3 = ((i0.e.b.c3.i.a) h.L0(bVar2, cls)).c();
            this.c = bVar2;
            this.d = 2;
            Object b2 = c3.m.b(this);
            if (b2 != coroutineSingletons) {
                b2 = m0.i.a;
            }
            if (b2 == coroutineSingletons) {
                return coroutineSingletons;
            }
            bVar = bVar2;
            final i0<Integer> i0Var2 = ((i0.e.b.h3.a.a) h.L0(bVar, i0.e.b.h3.a.a.class)).a().a;
            final b bVar32 = bVar;
            final SessionCoordinator sessionCoordinator2 = this;
            i0Var2.E(new l<Throwable, m0.i>() {
                public Object invoke(Object obj) {
                    j jVar;
                    if (((Throwable) obj) != null) {
                        b bVar = bVar32;
                        SessionCoordinator sessionCoordinator = sessionCoordinator2;
                        j create = bVar.create();
                        create.d(R.string.log_in_error);
                        create.h(Banner.Style.Negative);
                        sessionCoordinator.a(create);
                    } else {
                        try {
                            Integer i = i0Var2.i();
                            if (i == null) {
                                jVar = null;
                            } else {
                                jVar = bVar32.create();
                                jVar.d(i.intValue());
                                jVar.h(Banner.Style.Positive);
                            }
                            sessionCoordinator2.a(jVar);
                        } catch (Exception unused) {
                            sessionCoordinator2.a((Banner) null);
                        }
                    }
                    return m0.i.a;
                }
            });
            return m0.i.a;
        }
    }

    public SessionCoordinator(Activity activity, final b bVar, UserManager userManager, final a aVar, f0 f0Var) {
        i.e(activity, "activity");
        i.e(bVar, "bannerHandler");
        i.e(userManager, "userManager");
        i.e(aVar, "userComponentHandler");
        i.e(f0Var, "coroutineScope");
        this.a = activity;
        this.b = f0Var;
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(new FlowKt__TransformKt$filterNotNull$$inlined$unsafeTransform$1(userManager.e), new AnonymousClass1((c<? super AnonymousClass1>) null)), f0Var);
    }

    public final void a(Banner banner) {
        f0 f0Var = this.b;
        d0 d0Var = m0.a;
        m0.r.t.a.r.m.a1.a.E2(f0Var, o.c, (CoroutineStart) null, new SessionCoordinator$showMessageIfNeededAndNavigate$1(banner, this, (c<? super SessionCoordinator$showMessageIfNeededAndNavigate$1>) null), 2, (Object) null);
    }
}
