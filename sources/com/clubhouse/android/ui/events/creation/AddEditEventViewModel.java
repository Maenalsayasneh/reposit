package com.clubhouse.android.ui.events.creation;

import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.repos.ClubRepo;
import com.clubhouse.android.data.repos.EventRepo;
import com.clubhouse.android.shared.auth.UserManager;
import com.clubhouse.android.user.model.UserSelf;
import i0.b.b.v;
import i0.e.b.a3.b.c;
import i0.e.b.g3.o.w0.e0;
import i0.e.b.g3.o.w0.f0;
import i0.e.b.g3.o.w0.g0;
import i0.e.b.g3.o.w0.h0;
import i0.e.b.g3.o.w0.i0;
import i0.e.b.g3.o.w0.j0;
import i0.e.b.g3.o.w0.k0;
import i0.e.b.g3.o.w0.l0;
import i0.e.b.g3.o.w0.m0;
import i0.e.b.g3.o.w0.n0;
import i0.e.b.g3.o.w0.o0;
import i0.e.b.g3.o.w0.w;
import i0.e.b.g3.o.w0.x;
import i0.e.b.g3.o.w0.y;
import i0.j.f.p.h;
import j$.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.j.g;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;

/* compiled from: AddEditEventViewModel.kt */
public final class AddEditEventViewModel extends i0.e.b.a3.b.a<w> {
    public static final /* synthetic */ int m = 0;
    public UserManager n;
    public EventRepo o;
    public ClubRepo p;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.events.creation.AddEditEventViewModel$1", f = "AddEditEventViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.events.creation.AddEditEventViewModel$1  reason: invalid class name */
    /* compiled from: AddEditEventViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ AddEditEventViewModel d;

        /* renamed from: com.clubhouse.android.ui.events.creation.AddEditEventViewModel$1$a */
        /* compiled from: kotlin-style lambda group */
        public static final class a extends Lambda implements l<w, w> {
            public static final a c = new a(0);
            public static final a d = new a(1);
            public static final a q = new a(2);
            public final /* synthetic */ int x;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(1);
                this.x = i;
            }

            public final Object invoke(Object obj) {
                int i = this.x;
                if (i == 0) {
                    w wVar = (w) obj;
                    i.e(wVar, "$this$setState");
                    return w.copy$default(wVar, (EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, (OffsetDateTime) null, false, false, (List) null, false, (UserSelf) null, (ClubWithAdmin) null, (List) null, false, 32383, (Object) null);
                } else if (i == 1) {
                    w wVar2 = (w) obj;
                    i.e(wVar2, "$this$setState");
                    return w.copy$default(wVar2, (EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, (OffsetDateTime) null, false, !wVar2.i, (List) null, false, (UserSelf) null, (ClubWithAdmin) null, (List) null, false, 32383, (Object) null);
                } else if (i == 2) {
                    w wVar3 = (w) obj;
                    i.e(wVar3, "$this$setState");
                    return w.copy$default(wVar3, (EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, (OffsetDateTime) null, !wVar3.h, false, (List) null, false, (UserSelf) null, (ClubWithAdmin) null, (List) null, false, 32383, (Object) null);
                } else {
                    throw null;
                }
            }
        }

        /* renamed from: com.clubhouse.android.ui.events.creation.AddEditEventViewModel$1$b */
        /* compiled from: kotlin-style lambda group */
        public static final class b extends Lambda implements l<w, w> {
            public final /* synthetic */ int c;
            public final /* synthetic */ Object d;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public b(int i, Object obj) {
                super(1);
                this.c = i;
                this.d = obj;
            }

            public final Object invoke(Object obj) {
                switch (this.c) {
                    case 0:
                        w wVar = (w) obj;
                        i.e(wVar, "$this$setState");
                        return w.copy$default(wVar, (EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, (OffsetDateTime) null, false, false, (List) null, false, (UserSelf) null, ((h0) ((c) this.d)).a, (List) null, false, 28671, (Object) null);
                    case 1:
                        w wVar2 = (w) obj;
                        i.e(wVar2, "$this$setState");
                        return w.copy$default(wVar2, (EventInClub) null, (String) null, (String) null, ((o0) ((c) this.d)).a, (String) null, 0, (OffsetDateTime) null, false, false, (List) null, false, (UserSelf) null, (ClubWithAdmin) null, (List) null, false, 32759, (Object) null);
                    case 2:
                        w wVar3 = (w) obj;
                        i.e(wVar3, "$this$setState");
                        return w.copy$default(wVar3, (EventInClub) null, (String) null, (String) null, (String) null, ((m0) ((c) this.d)).a, 0, (OffsetDateTime) null, false, false, (List) null, false, (UserSelf) null, (ClubWithAdmin) null, (List) null, false, 32751, (Object) null);
                    case 3:
                        w wVar4 = (w) obj;
                        i.e(wVar4, "$this$setState");
                        return w.copy$default(wVar4, (EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, ((l0) ((c) this.d)).a, false, false, (List) null, false, (UserSelf) null, (ClubWithAdmin) null, (List) null, false, 32703, (Object) null);
                    case 4:
                        w wVar5 = (w) obj;
                        i.e(wVar5, "$this$setState");
                        return w.copy$default(wVar5, (EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, (OffsetDateTime) null, false, false, ((k0) ((c) this.d)).a, false, (UserSelf) null, (ClubWithAdmin) null, (List) null, false, 32255, (Object) null);
                    case 5:
                        w wVar6 = (w) obj;
                        i.e(wVar6, "$this$setState");
                        return w.copy$default(wVar6, (EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, (OffsetDateTime) null, false, false, (List) null, ((n0) ((c) this.d)).a, (UserSelf) null, (ClubWithAdmin) null, (List) null, false, 31743, (Object) null);
                    case 6:
                        w wVar7 = (w) obj;
                        i.e(wVar7, "$this$setState");
                        return w.copy$default(wVar7, (EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, (OffsetDateTime) null, false, false, g.Q(wVar7.j, ((y) ((c) this.d)).a), false, (UserSelf) null, (ClubWithAdmin) null, (List) null, false, 32255, (Object) null);
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
            if (cVar instanceof g0) {
                final AddEditEventViewModel addEditEventViewModel = this.d;
                AnonymousClass1 r02 = new l<w, m0.i>() {
                    public Object invoke(Object obj) {
                        w wVar = (w) obj;
                        i.e(wVar, "state");
                        if (wVar.q) {
                            AddEditEventViewModel addEditEventViewModel = addEditEventViewModel;
                            int i = AddEditEventViewModel.m;
                            Objects.requireNonNull(addEditEventViewModel);
                            addEditEventViewModel.m(AddEditEventViewModel$editEvent$1.c);
                            addEditEventViewModel.n(new AddEditEventViewModel$editEvent$2(addEditEventViewModel));
                        } else {
                            AddEditEventViewModel addEditEventViewModel2 = addEditEventViewModel;
                            int i2 = AddEditEventViewModel.m;
                            Objects.requireNonNull(addEditEventViewModel2);
                            addEditEventViewModel2.n(new AddEditEventViewModel$publishEvent$1(addEditEventViewModel2));
                        }
                        return m0.i.a;
                    }
                };
                int i = AddEditEventViewModel.m;
                addEditEventViewModel.n(r02);
            } else if (cVar instanceof f0) {
                AddEditEventViewModel addEditEventViewModel2 = this.d;
                int i2 = ((f0) cVar).a;
                int i3 = AddEditEventViewModel.m;
                Objects.requireNonNull(addEditEventViewModel2);
                addEditEventViewModel2.m(AddEditEventViewModel$loadEvent$1.c);
                addEditEventViewModel2.n(new AddEditEventViewModel$loadEvent$2(addEditEventViewModel2, i2));
            } else if (cVar instanceof o0) {
                AddEditEventViewModel addEditEventViewModel3 = this.d;
                b bVar = new b(1, cVar);
                int i4 = AddEditEventViewModel.m;
                addEditEventViewModel3.m(bVar);
            } else if (cVar instanceof m0) {
                AddEditEventViewModel addEditEventViewModel4 = this.d;
                b bVar2 = new b(2, cVar);
                int i5 = AddEditEventViewModel.m;
                addEditEventViewModel4.m(bVar2);
            } else if (cVar instanceof l0) {
                AddEditEventViewModel addEditEventViewModel5 = this.d;
                b bVar3 = new b(3, cVar);
                int i6 = AddEditEventViewModel.m;
                addEditEventViewModel5.m(bVar3);
            } else if (cVar instanceof k0) {
                AddEditEventViewModel addEditEventViewModel6 = this.d;
                b bVar4 = new b(4, cVar);
                int i7 = AddEditEventViewModel.m;
                addEditEventViewModel6.m(bVar4);
            } else if (cVar instanceof n0) {
                AddEditEventViewModel addEditEventViewModel7 = this.d;
                b bVar5 = new b(5, cVar);
                int i8 = AddEditEventViewModel.m;
                addEditEventViewModel7.m(bVar5);
            } else if (cVar instanceof y) {
                AddEditEventViewModel addEditEventViewModel8 = this.d;
                b bVar6 = new b(6, cVar);
                int i9 = AddEditEventViewModel.m;
                addEditEventViewModel8.m(bVar6);
            } else if (i.a(cVar, j0.a)) {
                AddEditEventViewModel addEditEventViewModel9 = this.d;
                a aVar = a.d;
                int i10 = AddEditEventViewModel.m;
                addEditEventViewModel9.m(aVar);
            } else if (i.a(cVar, i0.a)) {
                AddEditEventViewModel addEditEventViewModel10 = this.d;
                a aVar2 = a.q;
                int i11 = AddEditEventViewModel.m;
                addEditEventViewModel10.m(aVar2);
            } else if (i.a(cVar, e0.a)) {
                AddEditEventViewModel addEditEventViewModel11 = this.d;
                a aVar3 = a.c;
                int i12 = AddEditEventViewModel.m;
                addEditEventViewModel11.m(aVar3);
            } else if (cVar instanceof x) {
                AddEditEventViewModel addEditEventViewModel12 = this.d;
                int i13 = AddEditEventViewModel.m;
                Objects.requireNonNull(addEditEventViewModel12);
                addEditEventViewModel12.m(AddEditEventViewModel$deleteEvent$1.c);
                addEditEventViewModel12.n(new AddEditEventViewModel$deleteEvent$2(addEditEventViewModel12));
            } else if (cVar instanceof h0) {
                AddEditEventViewModel addEditEventViewModel13 = this.d;
                b bVar7 = new b(0, cVar);
                int i14 = AddEditEventViewModel.m;
                addEditEventViewModel13.m(bVar7);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AddEditEventViewModel(w wVar, i0.e.b.f3.i.a aVar, UserManager userManager) {
        super(wVar);
        Class cls = i0.e.b.c3.i.a.class;
        i.e(wVar, "initialState");
        i.e(aVar, "userComponentHandler");
        i.e(userManager, "userManager");
        this.n = userManager;
        this.o = ((i0.e.b.c3.i.a) h.L0(aVar, cls)).o();
        this.p = ((i0.e.b.c3.i.a) h.L0(aVar, cls)).l();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        m(new l<w, w>(this) {
            public final /* synthetic */ AddEditEventViewModel c;

            {
                this.c = r1;
            }

            public Object invoke(Object obj) {
                w wVar = (w) obj;
                i.e(wVar, "$this$setState");
                UserSelf value = this.c.n.d.getValue();
                List<UserInList> list = wVar.j;
                ArrayList arrayList = new ArrayList();
                for (T next : list) {
                    int intValue = ((UserInList) next).getId().intValue();
                    boolean z = false;
                    if (value != null && intValue == value.a) {
                        z = true;
                    }
                    if (!z) {
                        arrayList.add(next);
                    }
                }
                return w.copy$default(wVar, (EventInClub) null, (String) null, (String) null, (String) null, (String) null, 0, (OffsetDateTime) null, false, false, arrayList, false, value, (ClubWithAdmin) null, (List) null, false, 30207, (Object) null);
            }
        });
        n(new AddEditEventViewModel$loadClubHosts$1(this));
    }

    /* compiled from: AddEditEventViewModel.kt */
    public static final class a implements v<AddEditEventViewModel, w> {
        public final /* synthetic */ i0.e.b.c3.h.c<AddEditEventViewModel, w> a = new i0.e.b.c3.h.c<>(AddEditEventViewModel.class);

        public a() {
        }

        public AddEditEventViewModel create(i0.b.b.j0 j0Var, w wVar) {
            i.e(j0Var, "viewModelContext");
            i.e(wVar, "state");
            return this.a.create(j0Var, wVar);
        }

        public w initialState(i0.b.b.j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
