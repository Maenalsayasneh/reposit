package com.clubhouse.android.ui.invites;

import android.content.Context;
import com.afollestad.assent.Permission;
import com.airbnb.mvrx.MavericksViewModel;
import com.clubhouse.android.data.repos.InviteRepo;
import com.clubhouse.android.data.repos.PhoneContactsRepo;
import h0.b0.v;
import i0.b.b.j0;
import i0.e.b.a3.b.c;
import i0.e.b.f3.k.b;
import i0.e.b.g3.q.m;
import i0.e.b.g3.q.q;
import i0.j.f.p.h;
import java.util.List;
import java.util.Objects;
import kotlin.collections.EmptyList;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1;
import m0.n.a.l;
import m0.n.a.p;
import m0.n.b.f;
import m0.n.b.i;
import n0.a.d0;

/* compiled from: InvitesViewModel.kt */
public final class InvitesViewModel extends i0.e.b.a3.b.a<m> {
    public static final /* synthetic */ int m = 0;
    public final Context n;
    public final b o;
    public final i0.e.a.b.a p;
    public final InviteRepo q;
    public final PhoneContactsRepo r;

    @m0.l.f.a.c(c = "com.clubhouse.android.ui.invites.InvitesViewModel$1", f = "InvitesViewModel.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.clubhouse.android.ui.invites.InvitesViewModel$1  reason: invalid class name */
    /* compiled from: InvitesViewModel.kt */
    public static final class AnonymousClass1 extends SuspendLambda implements p<c, m0.l.c<? super m0.i>, Object> {
        public /* synthetic */ Object c;
        public final /* synthetic */ InvitesViewModel d;

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
            final c cVar = (c) this.c;
            if (cVar instanceof i0.e.b.g3.q.h) {
                InvitesViewModel invitesViewModel = this.d;
                i0.e.b.g3.q.h hVar = (i0.e.b.g3.q.h) cVar;
                String str = hVar.a;
                String str2 = hVar.b;
                int i = InvitesViewModel.m;
                Objects.requireNonNull(invitesViewModel);
                MavericksViewModel.f(invitesViewModel, new InvitesViewModel$invite$1(invitesViewModel, str, str2, (m0.l.c<? super InvitesViewModel$invite$1>) null), (d0) null, (m0.r.m) null, new InvitesViewModel$invite$2(invitesViewModel, str), 3, (Object) null);
            } else if (cVar instanceof i0.e.b.g3.q.i) {
                InvitesViewModel invitesViewModel2 = this.d;
                String str3 = ((i0.e.b.g3.q.i) cVar).a;
                int i2 = InvitesViewModel.m;
                Objects.requireNonNull(invitesViewModel2);
                MavericksViewModel.f(invitesViewModel2, new InvitesViewModel$invitePhone$1(invitesViewModel2, str3, (m0.l.c<? super InvitesViewModel$invitePhone$1>) null), (d0) null, (m0.r.m) null, new InvitesViewModel$invitePhone$2(str3, invitesViewModel2), 3, (Object) null);
            } else if (cVar instanceof q) {
                InvitesViewModel invitesViewModel3 = this.d;
                int i3 = InvitesViewModel.m;
                invitesViewModel3.q();
            } else if (cVar instanceof i0.e.b.a3.d.b) {
                InvitesViewModel invitesViewModel4 = this.d;
                AnonymousClass1 r1 = new l<m, m>() {
                    public Object invoke(Object obj) {
                        m mVar = (m) obj;
                        i.e(mVar, "$this$setState");
                        return m.copy$default(mVar, (List) null, false, false, false, ((i0.e.b.a3.d.b) cVar).a, 15, (Object) null);
                    }
                };
                int i4 = InvitesViewModel.m;
                invitesViewModel4.m(r1);
            }
            return m0.i.a;
        }
    }

    static {
        new a((f) null);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesViewModel(m mVar, Context context, b bVar, i0.e.a.b.a aVar, i0.e.b.f3.i.a aVar2) {
        super(mVar);
        Class cls = i0.e.b.c3.i.a.class;
        i.e(mVar, "initialState");
        i.e(context, "applicationContext");
        i.e(bVar, "userPrefs");
        i.e(aVar, "actionTrailRecorder");
        i.e(aVar2, "userComponentHandler");
        this.n = context;
        this.o = bVar;
        this.p = aVar;
        this.q = ((i0.e.b.c3.i.a) h.L0(aVar2, cls)).n();
        this.r = ((i0.e.b.c3.i.a) h.L0(aVar2, cls)).g();
        q();
        m0.r.t.a.r.m.a1.a.F2(new FlowKt__TransformKt$onEach$$inlined$unsafeTransform$1(this.k, new AnonymousClass1(this, (m0.l.c<? super AnonymousClass1>) null)), this.c);
    }

    public final void q() {
        boolean E0 = v.E0(this.n, Permission.READ_CONTACTS);
        m(new InvitesViewModel$checkForContactsPermission$1(E0));
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.c = EmptyList.c;
        MavericksViewModel.f(this, new InvitesViewModel$loadSuggestedInvites$1(this, E0, ref$ObjectRef, (m0.l.c<? super InvitesViewModel$loadSuggestedInvites$1>) null), (d0) null, (m0.r.m) null, new InvitesViewModel$loadSuggestedInvites$2(this, ref$ObjectRef), 3, (Object) null);
    }

    /* compiled from: InvitesViewModel.kt */
    public static final class a implements i0.b.b.v<InvitesViewModel, m> {
        public final /* synthetic */ i0.e.b.c3.h.c<InvitesViewModel, m> a = new i0.e.b.c3.h.c<>(InvitesViewModel.class);

        public a() {
        }

        public InvitesViewModel create(j0 j0Var, m mVar) {
            i.e(j0Var, "viewModelContext");
            i.e(mVar, "state");
            return this.a.create(j0Var, mVar);
        }

        public m initialState(j0 j0Var) {
            i.e(j0Var, "viewModelContext");
            return this.a.initialState(j0Var);
        }

        public a(f fVar) {
        }
    }
}
