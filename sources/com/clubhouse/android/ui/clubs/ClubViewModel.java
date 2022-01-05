package com.clubhouse.android.ui.clubs;

import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.data.models.local.Topic;
import com.clubhouse.android.data.models.local.club.ClubRule;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInClub;
import com.clubhouse.android.data.models.remote.response.GetClubResponse;
import com.clubhouse.android.data.repos.ClubRepo;
import com.clubhouse.android.data.repos.EventRepo;
import com.clubhouse.android.data.repos.UserRepo;
import com.clubhouse.android.shared.auth.UserManager;
import h0.u.w;
import i0.b.b.b;
import i0.b.b.d;
import i0.b.b.j0;
import i0.e.b.c3.h.c;
import i0.e.b.g3.l.b1;
import i0.e.b.g3.l.c1;
import i0.e.b.g3.l.d2;
import i0.e.b.g3.l.f2;
import i0.e.b.g3.l.g2;
import i0.e.b.g3.l.h2;
import i0.e.b.g3.l.i2;
import i0.e.b.g3.l.j2;
import i0.e.b.g3.l.k2;
import i0.e.b.g3.l.l2;
import i0.e.b.g3.l.m2;
import i0.e.b.g3.l.n2;
import i0.e.b.g3.l.o2;
import i0.e.b.g3.l.p2;
import i0.e.b.g3.l.q2;
import i0.e.b.g3.l.r2;
import i0.e.b.g3.l.s2;
import i0.e.b.g3.l.t1;
import i0.e.b.g3.l.t2;
import i0.e.b.g3.l.u2;
import i0.e.b.g3.l.v1;
import i0.e.b.g3.l.v2.y;
import i0.e.b.g3.l.w1;
import i0.e.b.g3.l.x1;
import i0.e.b.g3.l.y1;
import i0.e.b.g3.l.y2.a;
import i0.j.f.p.h;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineStart;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.l.e;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import m0.r.m;
import n0.a.d0;

/* compiled from: ClubViewModel.kt */
public final class ClubViewModel extends i0.e.b.a3.b.a<v1> {
    public static final /* synthetic */ int m = 0;
    public UserManager n;
    public final Resources o;
    public final i0.e.b.c3.i.a p;
    public final ClubRepo q;
    public final UserRepo r;
    public final EventRepo s;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.clubs.ClubViewModel$1", f = "ClubViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.clubs.ClubViewModel$1  reason: invalid class name */
    /* compiled from: ClubViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<i0.e.b.a3.b.c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ ClubViewModel d;

        /* renamed from: com.clubhouse.android.ui.clubs.ClubViewModel$1$a */
        /* compiled from: kotlin-style lambda group */
        public static final class a extends Lambda implements l<v1, v1> {
            public static final a c = new a(0);
            public static final a d = new a(1);
            public final /* synthetic */ int q;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public a(int i) {
                super(1);
                this.q = i;
            }

            public final Object invoke(Object obj) {
                a.c cVar;
                i0.e.b.g3.l.y2.a aVar;
                int i = this.q;
                if (i == 0) {
                    v1 v1Var = (v1) obj;
                    i.e(v1Var, "$this$setState");
                    return v1.copy$default(v1Var, (Integer) null, (ClubArgs) null, (b) null, (b) null, (GetClubResponse) null, (w) null, false, (i0.e.b.g3.l.y2.a) null, 191, (Object) null);
                } else if (i == 1) {
                    v1 v1Var2 = (v1) obj;
                    i.e(v1Var2, "$this$setState");
                    i0.e.b.g3.l.y2.a aVar2 = v1Var2.h;
                    i.e(aVar2, "<this>");
                    if (aVar2 instanceof a.b) {
                        a.b bVar = (a.b) aVar2;
                        aVar = new a.b(true);
                    } else if (aVar2 instanceof a.C0201a) {
                        a.C0201a aVar3 = (a.C0201a) aVar2;
                        aVar = new a.C0201a(true);
                    } else if (aVar2 instanceof a.c) {
                        cVar = new a.c(true, ((a.c) aVar2).c);
                        return v1.copy$default(v1Var2, (Integer) null, (ClubArgs) null, (b) null, (b) null, (GetClubResponse) null, (w) null, false, cVar, 127, (Object) null);
                    } else if (aVar2 instanceof a.d) {
                        a.d dVar = (a.d) aVar2;
                        aVar = new a.d(true);
                    } else {
                        throw new NoWhenBranchMatchedException();
                    }
                    cVar = aVar;
                    return v1.copy$default(v1Var2, (Integer) null, (ClubArgs) null, (b) null, (b) null, (GetClubResponse) null, (w) null, false, cVar, 127, (Object) null);
                } else {
                    throw null;
                }
            }
        }

        {
            this.d = r1;
        }

        public final m0.l.c<m0.i> create(Object obj, m0.l.c<?> cVar) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, v1Var, cVar);
            r02.c = obj;
            return r02;
        }

        public Object invoke(Object obj, Object obj2) {
            AnonymousClass1 r02 = new AnonymousClass1(this.d, v1Var, (m0.l.c) obj2);
            r02.c = (i0.e.b.a3.b.c) obj;
            m0.i iVar = m0.i.a;
            r02.invokeSuspend(iVar);
            return iVar;
        }

        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            h.d4(obj);
            final i0.e.b.a3.b.c cVar = (i0.e.b.a3.b.c) this.c;
            if (cVar instanceof j2) {
                ClubViewModel clubViewModel = this.d;
                int i = ((j2) cVar).a;
                int i2 = ClubViewModel.m;
                Objects.requireNonNull(clubViewModel);
                MavericksViewModel.f(clubViewModel, new ClubViewModel$toggleFollowUser$1(clubViewModel, i, (m0.l.c<? super ClubViewModel$toggleFollowUser$1>) null), (d0) null, (m) null, ClubViewModel$toggleFollowUser$2.c, 3, (Object) null);
            } else if (cVar instanceof p2) {
                ClubViewModel clubViewModel2 = this.d;
                p2 p2Var = (p2) cVar;
                int i3 = p2Var.a;
                boolean z = p2Var.b;
                int i4 = ClubViewModel.m;
                Objects.requireNonNull(clubViewModel2);
                MavericksViewModel.f(clubViewModel2, new ClubViewModel$updateMemberStartRoom$1(clubViewModel2, i3, z, (m0.l.c<? super ClubViewModel$updateMemberStartRoom$1>) null), (d0) null, (m) null, new ClubViewModel$updateMemberStartRoom$2(clubViewModel2, i3, z), 3, (Object) null);
            } else {
                int i5 = 0;
                if (cVar instanceof h2) {
                    h2 h2Var = (h2) cVar;
                    ClubViewModel.t(this.d, h2Var.a.getId().intValue(), h2Var.a.Z1, false, 4);
                } else if (cVar instanceof f2) {
                    ClubViewModel clubViewModel3 = this.d;
                    Integer b = clubViewModel3.n.b();
                    if (b != null) {
                        i5 = b.intValue();
                    }
                    ClubViewModel.t(clubViewModel3, i5, (String) null, true, 2);
                } else if (cVar instanceof w1) {
                    ClubViewModel clubViewModel4 = this.d;
                    Integer b2 = clubViewModel4.n.b();
                    if (b2 != null) {
                        i5 = b2.intValue();
                    }
                    MavericksViewModel.f(clubViewModel4, new ClubViewModel$deleteClub$1(clubViewModel4, i5, (m0.l.c<? super ClubViewModel$deleteClub$1>) null), (d0) null, (m) null, new ClubViewModel$deleteClub$2(clubViewModel4), 3, (Object) null);
                } else if (cVar instanceof b1) {
                    ClubViewModel clubViewModel5 = this.d;
                    int i6 = ((b1) cVar).a;
                    int i7 = ClubViewModel.m;
                    Objects.requireNonNull(clubViewModel5);
                    MavericksViewModel.f(clubViewModel5, new ClubViewModel$acceptClubInvite$1(clubViewModel5, i6, (m0.l.c<? super ClubViewModel$acceptClubInvite$1>) null), (d0) null, (m) null, new ClubViewModel$acceptClubInvite$2(clubViewModel5, i6), 3, (Object) null);
                } else if (cVar instanceof l2) {
                    ClubViewModel clubViewModel6 = this.d;
                    l2 l2Var = (l2) cVar;
                    UserInClub userInClub = l2Var.a;
                    ClubRole clubRole = l2Var.b;
                    int i8 = ClubViewModel.m;
                    Objects.requireNonNull(clubViewModel6);
                    MavericksViewModel.f(clubViewModel6, new ClubViewModel$updateClubRole$1(clubViewModel6, clubRole, userInClub, (m0.l.c<? super ClubViewModel$updateClubRole$1>) null), (d0) null, (m) null, new ClubViewModel$updateClubRole$2(userInClub, clubRole, clubViewModel6), 3, (Object) null);
                } else if (cVar instanceof t2) {
                    ClubViewModel clubViewModel7 = this.d;
                    Uri uri = ((t2) cVar).a;
                    int i9 = ClubViewModel.m;
                    Objects.requireNonNull(clubViewModel7);
                    clubViewModel7.n(new ClubViewModel$updatePhoto$1(clubViewModel7, uri));
                } else if (cVar instanceof y1) {
                    ClubViewModel.q(this.d, ((y1) cVar).a);
                } else if (cVar instanceof g2) {
                    ClubViewModel.s(this.d, ((g2) cVar).a);
                } else if (cVar instanceof k2) {
                    ClubViewModel clubViewModel8 = this.d;
                    String str = ((k2) cVar).a;
                    int i10 = ClubViewModel.m;
                    Objects.requireNonNull(clubViewModel8);
                    clubViewModel8.n(new ClubViewModel$updateDescription$1(clubViewModel8, str));
                } else if (cVar instanceof y) {
                    ClubViewModel clubViewModel9 = this.d;
                    List<Topic> list = ((y) cVar).a;
                    int i11 = ClubViewModel.m;
                    Objects.requireNonNull(clubViewModel9);
                    clubViewModel9.n(new ClubViewModel$updateTopics$1(clubViewModel9, list));
                } else if (cVar instanceof u2) {
                    ClubViewModel clubViewModel10 = this.d;
                    List<ClubRule> list2 = ((u2) cVar).a;
                    int i12 = ClubViewModel.m;
                    Objects.requireNonNull(clubViewModel10);
                    clubViewModel10.n(new ClubViewModel$updateClubRules$1(clubViewModel10, list2));
                } else if (cVar instanceof o2) {
                    ClubViewModel clubViewModel11 = this.d;
                    boolean z2 = ((o2) cVar).a;
                    int i13 = ClubViewModel.m;
                    Objects.requireNonNull(clubViewModel11);
                    clubViewModel11.n(new ClubViewModel$updateIsMembershipOpen$1(clubViewModel11, z2));
                } else if (cVar instanceof q2) {
                    ClubViewModel clubViewModel12 = this.d;
                    q2 q2Var = (q2) cVar;
                    int i14 = q2Var.a;
                    boolean z3 = q2Var.b;
                    int i15 = ClubViewModel.m;
                    Objects.requireNonNull(clubViewModel12);
                    MavericksViewModel.f(clubViewModel12, new ClubViewModel$updateMemberPrivacy$1(clubViewModel12, i14, z3, (m0.l.c<? super ClubViewModel$updateMemberPrivacy$1>) null), (d0) null, (m) null, new ClubViewModel$updateMemberPrivacy$2(clubViewModel12, i14, z3), 3, (Object) null);
                } else if (cVar instanceof n2) {
                    ClubViewModel clubViewModel13 = this.d;
                    boolean z4 = ((n2) cVar).a;
                    int i16 = ClubViewModel.m;
                    Objects.requireNonNull(clubViewModel13);
                    clubViewModel13.n(new ClubViewModel$updateIsAskToJoinAllowed$1(clubViewModel13, z4));
                } else if (cVar instanceof d2) {
                    ClubViewModel clubViewModel14 = this.d;
                    d2 d2Var = (d2) cVar;
                    String str2 = d2Var.a;
                    SourceLocation sourceLocation = d2Var.b;
                    int i17 = ClubViewModel.m;
                    Objects.requireNonNull(clubViewModel14);
                    clubViewModel14.n(new ClubViewModel$joinClub$1(clubViewModel14, str2, sourceLocation));
                } else if (cVar instanceof c1) {
                    ClubViewModel clubViewModel15 = this.d;
                    a aVar = a.c;
                    int i18 = ClubViewModel.m;
                    clubViewModel15.m(aVar);
                } else if (cVar instanceof m2) {
                    ClubViewModel.r(this.d, v1Var.a);
                } else if (cVar instanceof x1) {
                    ClubViewModel clubViewModel16 = this.d;
                    EventInClub eventInClub = ((x1) cVar).a;
                    int i19 = ClubViewModel.m;
                    Objects.requireNonNull(clubViewModel16);
                    MavericksViewModel.f(clubViewModel16, new ClubViewModel$deleteEvent$1(clubViewModel16, eventInClub, (m0.l.c<? super ClubViewModel$deleteEvent$1>) null), (d0) null, (m) null, new ClubViewModel$deleteEvent$2(clubViewModel16, eventInClub), 3, (Object) null);
                } else if (cVar instanceof s2) {
                    ClubViewModel clubViewModel17 = this.d;
                    AnonymousClass2 r1 = new l<v1, v1>() {
                        public Object invoke(Object obj) {
                            v1 v1Var = (v1) obj;
                            i.e(v1Var, "$this$setState");
                            return v1.copy$default(v1Var, (Integer) null, (ClubArgs) null, (b) null, (b) null, (GetClubResponse) null, (w) null, false, ((s2) cVar).a, 127, (Object) null);
                        }
                    };
                    int i20 = ClubViewModel.m;
                    clubViewModel17.m(r1);
                } else if (cVar instanceof r2) {
                    ClubViewModel clubViewModel18 = this.d;
                    a aVar2 = a.d;
                    int i21 = ClubViewModel.m;
                    clubViewModel18.m(aVar2);
                } else if (cVar instanceof i2) {
                    ClubViewModel clubViewModel19 = this.d;
                    clubViewModel19.n(new ClubViewModel$revokeApplication$1(clubViewModel19, clubViewModel19.n.b(), ((i2) cVar).a));
                } else if (cVar instanceof t1) {
                    ClubViewModel clubViewModel20 = this.d;
                    int i22 = ClubViewModel.m;
                    Objects.requireNonNull(clubViewModel20);
                    clubViewModel20.n(new ClubViewModel$clubMigrationOpenMembership$1(clubViewModel20));
                }
            }
            return m0.i.a;
        }
    }

    /* compiled from: ClubViewModel.kt */
    public static final class a extends c<ClubViewModel, v1> {
        public a() {
            super(ClubViewModel.class);
        }

        public a(f fVar) {
            super(ClubViewModel.class);
        }

        public v1 initialState(j0 j0Var) {
            String str;
            String str2;
            i.e(j0Var, "viewModelContext");
            Bundle arguments = ((d) j0Var).c.getArguments();
            boolean z = false;
            if (arguments != null && arguments.containsKey("mavericks:arg")) {
                z = true;
            }
            if (z) {
                return (v1) super.initialState(j0Var);
            }
            if (arguments == null) {
                str = null;
            } else {
                str = arguments.getString("slug");
            }
            if (arguments == null) {
                str2 = null;
            } else {
                str2 = arguments.getString("inviteCode");
            }
            return new v1(new ClubArgs((Integer) null, str, str2, false, false, SourceLocation.URL, (Map) null, 89));
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClubViewModel(final v1 v1Var, i0.e.b.f3.i.a aVar, UserManager userManager, Resources resources) {
        super(v1Var);
        i.e(v1Var, "initialState");
        i.e(aVar, "userComponentHandler");
        i.e(userManager, "userManager");
        i.e(resources, "resources");
        this.n = userManager;
        this.o = resources;
        Object L0 = h.L0(aVar, i0.e.b.c3.i.a.class);
        i.d(L0, "get(userComponentHandler, UserComponentEntryPoint::class.java)");
        i0.e.b.c3.i.a aVar2 = (i0.e.b.c3.i.a) L0;
        this.p = aVar2;
        this.q = aVar2.l();
        this.r = aVar2.c();
        this.s = aVar2.o();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
        MavericksViewModel.f(this, new ClubViewModel$initialLoad$1(this, v1Var.a, v1Var.b, (m0.l.c<? super ClubViewModel$initialLoad$1>) null), (d0) null, (m) null, new ClubViewModel$initialLoad$2(this), 3, (Object) null);
    }

    public static final void q(ClubViewModel clubViewModel, int i) {
        m0.r.t.a.r.m.a1.a.E2(clubViewModel.c, (e) null, (CoroutineStart) null, new ClubViewModel$loadClubMembers$1(clubViewModel, i, (m0.l.c<? super ClubViewModel$loadClubMembers$1>) null), 3, (Object) null);
    }

    public static final void r(ClubViewModel clubViewModel, Integer num) {
        Objects.requireNonNull(clubViewModel);
        if (num != null) {
            MavericksViewModel.f(clubViewModel, new ClubViewModel$loadEvents$1(clubViewModel, num, (m0.l.c<? super ClubViewModel$loadEvents$1>) null), (d0) null, (m) null, ClubViewModel$loadEvents$2.c, 3, (Object) null);
        }
    }

    public static final void s(ClubViewModel clubViewModel, int i) {
        Objects.requireNonNull(clubViewModel);
        MavericksViewModel.f(clubViewModel, new ClubViewModel$refresh$1(clubViewModel, i, (m0.l.c<? super ClubViewModel$refresh$1>) null), (d0) null, (m) null, ClubViewModel$refresh$2.c, 3, (Object) null);
    }

    public static void t(ClubViewModel clubViewModel, int i, String str, boolean z, int i2) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        if ((i2 & 4) != 0) {
            z = false;
        }
        Objects.requireNonNull(clubViewModel);
        MavericksViewModel.f(clubViewModel, new ClubViewModel$removeClubMember$1(clubViewModel, i, (m0.l.c<? super ClubViewModel$removeClubMember$1>) null), (d0) null, (m) null, new ClubViewModel$removeClubMember$2(z, clubViewModel, str), 3, (Object) null);
    }
}
