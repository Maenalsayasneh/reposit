package com.clubhouse.android.shared.data;

import com.clubhouse.android.data.models.remote.request.FollowScopedSearchRequest;
import com.clubhouse.android.data.repos.UserRepo;
import h0.u.w;
import i0.e.b.b3.b.e.j;
import i0.e.b.b3.b.e.m;
import i0.e.b.f3.j.d;
import i0.e.b.f3.j.f;
import i0.e.b.f3.j.g;
import i0.j.f.p.h;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;
import m0.l.c;
import m0.l.e;
import m0.n.a.p;
import m0.n.b.i;
import m0.n.b.r;
import n0.a.f0;
import n0.a.g2.a0;

/* compiled from: CompositeSelectableUserDataSource.kt */
public final class CompositeSelectableUserDataSource {
    public final f0 a;
    public final UserRepo b;
    public final f<FollowScopedSearchRequest, j> c;
    public final Set<m> d = new LinkedHashSet();
    public List<m> e = EmptyList.c;
    public d f;
    public n0.a.g2.d<w<i0.e.b.a3.d.a<m>>> g;

    @m0.l.f.a.c(c = "com.clubhouse.android.shared.data.CompositeSelectableUserDataSource$1", f = "CompositeSelectableUserDataSource.kt", l = {49}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.shared.data.CompositeSelectableUserDataSource$1  reason: invalid class name */
    /* compiled from: CompositeSelectableUserDataSource.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<f0, c<? super m0.i>, Object> {
        public int c;
        public final /* synthetic */ CompositeSelectableUserDataSource d;

        {
            this.d = r1;
        }

        public final c<m0.i> create(Object obj, c<?> cVar) {
            return new AnonymousClass1(this.d, cVar);
        }

        public Object invoke(Object obj, Object obj2) {
            f0 f0Var = (f0) obj;
            return new AnonymousClass1(this.d, (c) obj2).invokeSuspend(m0.i.a);
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.c;
            if (i == 0) {
                h.d4(obj);
                CompositeSelectableUserDataSource compositeSelectableUserDataSource = this.d;
                n0.a.g2.d<w<w<T>>> h = g0.a.b.b.a.h(compositeSelectableUserDataSource.c.e, compositeSelectableUserDataSource.a);
                final CompositeSelectableUserDataSource compositeSelectableUserDataSource2 = this.d;
                CompositeSelectableUserDataSource$1$invokeSuspend$$inlined$map$1 compositeSelectableUserDataSource$1$invokeSuspend$$inlined$map$1 = new CompositeSelectableUserDataSource$1$invokeSuspend$$inlined$map$1(h, compositeSelectableUserDataSource2);
                AnonymousClass2 r6 = new p<w<i0.e.b.a3.d.a<m>>, c<? super m0.i>, Object>((c<? super AnonymousClass2>) null) {
                    public int c;
                    public /* synthetic */ Object d;

                    public final c<m0.i> create(Object obj, c<?> cVar) {
                        AnonymousClass2 r02 = 

                        /* compiled from: CompositeSelectableUserDataSource.kt */
                        public interface a {
                        }

                        public CompositeSelectableUserDataSource(g gVar, f0 f0Var, UserRepo userRepo) {
                            i.e(gVar, "searchDataSourceFactory");
                            i.e(f0Var, "coroutineScope");
                            i.e(userRepo, "userRepo");
                            this.a = f0Var;
                            this.b = userRepo;
                            this.c = gVar.a(f0Var);
                            m0.r.t.a.r.m.a1.a.E2(f0Var, (e) null, (CoroutineStart) null, new AnonymousClass1(this, (c<? super AnonymousClass1>) null), 3, (Object) null);
                            this.g = a0.a(w.c.a());
                        }

                        public final boolean a(Collection<m> collection, int i) {
                            T t;
                            boolean z;
                            Iterator<T> it = collection.iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    t = null;
                                    break;
                                }
                                t = it.next();
                                if (((m) t).g.getId().intValue() == i) {
                                    z = true;
                                    continue;
                                } else {
                                    z = false;
                                    continue;
                                }
                                if (z) {
                                    break;
                                }
                            }
                            if (t != null) {
                                return true;
                            }
                            return false;
                        }

                        public void b(m mVar) {
                            i.e(mVar, "item");
                            r.b(this.d).add(mVar);
                            m0.r.t.a.r.m.a1.a.E2(this.a, (e) null, (CoroutineStart) null, new CompositeSelectableUserDataSource$updateSelection$1(this, (c<? super CompositeSelectableUserDataSource$updateSelection$1>) null), 3, (Object) null);
                        }

                        public void c(d dVar) {
                            if (!i.a(this.f, dVar)) {
                                String str = dVar.b;
                                if (str == null || str.length() == 0) {
                                    m0.r.t.a.r.m.a1.a.E2(this.a, (e) null, (CoroutineStart) null, new CompositeSelectableUserDataSource$emitDefaultResults$1(this, dVar.a, (c<? super CompositeSelectableUserDataSource$emitDefaultResults$1>) null), 3, (Object) null);
                                } else {
                                    this.c.a(new FollowScopedSearchRequest(false, false, true, dVar.b, 3));
                                }
                            }
                            this.f = dVar;
                        }
                    }
