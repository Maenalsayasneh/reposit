package com.clubhouse.android.ui.invites;

import com.clubhouse.android.data.models.local.PhoneContact;
import com.clubhouse.android.data.models.remote.response.GetSuggestedInvitesResponse;
import java.util.List;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Ref$ObjectRef;
import m0.i;
import m0.l.f.a.c;
import m0.n.a.l;

@c(c = "com.clubhouse.android.ui.invites.InvitesViewModel$loadSuggestedInvites$1", f = "InvitesViewModel.kt", l = {114, 118}, m = "invokeSuspend")
/* compiled from: InvitesViewModel.kt */
public final class InvitesViewModel$loadSuggestedInvites$1 extends SuspendLambda implements l<m0.l.c<? super GetSuggestedInvitesResponse>, Object> {
    public final /* synthetic */ Ref$ObjectRef<List<PhoneContact>> Y1;
    public Object c;
    public Object d;
    public int q;
    public final /* synthetic */ InvitesViewModel x;
    public final /* synthetic */ boolean y;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InvitesViewModel$loadSuggestedInvites$1(InvitesViewModel invitesViewModel, boolean z, Ref$ObjectRef<List<PhoneContact>> ref$ObjectRef, m0.l.c<? super InvitesViewModel$loadSuggestedInvites$1> cVar) {
        super(1, cVar);
        this.x = invitesViewModel;
        this.y = z;
        this.Y1 = ref$ObjectRef;
    }

    public final m0.l.c<i> create(m0.l.c<?> cVar) {
        return new InvitesViewModel$loadSuggestedInvites$1(this.x, this.y, this.Y1, cVar);
    }

    public Object invoke(Object obj) {
        return new InvitesViewModel$loadSuggestedInvites$1(this.x, this.y, this.Y1, (m0.l.c) obj).invokeSuspend(i.a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x00a8 A[LOOP:1: B:21:0x00a2->B:23:0x00a8, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00c5 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00c6 A[PHI: r13 
      PHI: (r13v1 java.lang.Object) = (r13v4 java.lang.Object), (r13v0 java.lang.Object) binds: [B:25:0x00c3, B:4:0x000f] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            int r1 = r12.q
            r2 = 10
            r3 = 1
            r4 = 2
            r5 = 0
            if (r1 == 0) goto L_0x0028
            if (r1 == r3) goto L_0x001c
            if (r1 != r4) goto L_0x0014
            i0.j.f.p.h.d4(r13)
            goto L_0x00c6
        L_0x0014:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x001c:
            java.lang.Object r1 = r12.d
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            java.lang.Object r3 = r12.c
            java.util.List r3 = (java.util.List) r3
            i0.j.f.p.h.d4(r13)
            goto L_0x007e
        L_0x0028:
            i0.j.f.p.h.d4(r13)
            com.clubhouse.android.ui.invites.InvitesViewModel r13 = r12.x
            i0.e.b.f3.k.b r13 = r13.o
            java.util.Objects.requireNonNull(r13)
            com.clubhouse.android.shared.preferences.Key r1 = com.clubhouse.android.shared.preferences.Key.INVITED_PHONE_NUMBERS
            java.util.Set r13 = i0.e.b.f3.k.a.d(r13, r1, r5, r4, r5)
            com.clubhouse.android.ui.invites.InvitesViewModel r1 = r12.x
            java.util.ArrayList r6 = new java.util.ArrayList
            int r7 = i0.j.f.p.h.K(r13, r2)
            r6.<init>(r7)
            java.util.Iterator r13 = r13.iterator()
        L_0x0047:
            boolean r7 = r13.hasNext()
            if (r7 == 0) goto L_0x0066
            java.lang.Object r7 = r13.next()
            java.lang.String r7 = (java.lang.String) r7
            com.clubhouse.android.data.models.local.PhoneContact r8 = new com.clubhouse.android.data.models.local.PhoneContact
            i0.e.b.i3.b r9 = i0.e.b.i3.b.a
            android.content.Context r10 = r1.n
            r11 = 0
            java.lang.String r9 = r9.b(r10, r7, r11)
            r10 = 4
            r8.<init>((java.lang.String) r7, (java.lang.String) r9, (java.lang.String) r5, (int) r10)
            r6.add(r8)
            goto L_0x0047
        L_0x0066:
            boolean r13 = r12.y
            if (r13 == 0) goto L_0x0087
            kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.clubhouse.android.data.models.local.PhoneContact>> r1 = r12.Y1
            com.clubhouse.android.ui.invites.InvitesViewModel r13 = r12.x
            com.clubhouse.android.data.repos.PhoneContactsRepo r13 = r13.r
            r12.c = r6
            r12.d = r1
            r12.q = r3
            java.lang.Object r13 = r13.a(r12)
            if (r13 != r0) goto L_0x007d
            return r0
        L_0x007d:
            r3 = r6
        L_0x007e:
            java.util.Collection r13 = (java.util.Collection) r13
            java.util.List r13 = m0.j.g.Z(r13, r3)
            r1.c = r13
            goto L_0x008b
        L_0x0087:
            kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.clubhouse.android.data.models.local.PhoneContact>> r13 = r12.Y1
            r13.c = r6
        L_0x008b:
            com.clubhouse.android.ui.invites.InvitesViewModel r13 = r12.x
            com.clubhouse.android.data.repos.InviteRepo r13 = r13.q
            kotlin.jvm.internal.Ref$ObjectRef<java.util.List<com.clubhouse.android.data.models.local.PhoneContact>> r1 = r12.Y1
            T r1 = r1.c
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.ArrayList r3 = new java.util.ArrayList
            int r2 = i0.j.f.p.h.K(r1, r2)
            r3.<init>(r2)
            java.util.Iterator r1 = r1.iterator()
        L_0x00a2:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00b9
            java.lang.Object r2 = r1.next()
            com.clubhouse.android.data.models.local.PhoneContact r2 = (com.clubhouse.android.data.models.local.PhoneContact) r2
            com.clubhouse.android.data.models.local.Contact r6 = new com.clubhouse.android.data.models.local.Contact
            java.lang.String r2 = r2.a
            r6.<init>(r2)
            r3.add(r6)
            goto L_0x00a2
        L_0x00b9:
            r12.c = r5
            r12.d = r5
            r12.q = r4
            java.lang.Object r13 = r13.a(r3, r12)
            if (r13 != r0) goto L_0x00c6
            return r0
        L_0x00c6:
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.invites.InvitesViewModel$loadSuggestedInvites$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
