package i0.e.b.g3.u;

import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse;
import com.clubhouse.android.data.models.remote.response.GetProfileResponse;
import com.clubhouse.android.user.model.User;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.b.b.b;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: HalfProfileViewModel.kt */
public final class q4 implements b5, j {
    public final boolean A;
    public final User a;
    public final SourceLocation b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final b<GetProfileResponse> i;
    public final b<GetCanCreateClubResponse> j;
    public final UserProfile k;
    public final List<UserInList> l;
    public final boolean m;
    public final FollowNotificationType n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final Integer s;
    public final EventInProfile t;
    public final boolean u;
    public final boolean v;
    public final UserInChannel w;
    public final boolean x;
    public final boolean y;
    public final String z;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q4(com.clubhouse.android.ui.profile.HalfProfileArgs r27) {
        /*
            r26 = this;
            r0 = r27
            r1 = r26
            java.lang.String r2 = "args"
            m0.n.b.i.e(r0, r2)
            com.clubhouse.android.user.model.User r2 = r0.c
            com.clubhouse.android.data.models.local.user.SourceLocation r3 = r0.d
            boolean r4 = r0.q
            boolean r6 = r0.x
            boolean r7 = r0.y
            r5 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            r16 = 0
            r17 = 0
            r18 = 0
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 4194248(0x3fffc8, float:5.877393E-39)
            r25 = 0
            r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.u.q4.<init>(com.clubhouse.android.ui.profile.HalfProfileArgs):void");
    }

    public static q4 copy$default(q4 q4Var, User user, SourceLocation sourceLocation, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, b bVar, b bVar2, UserProfile userProfile, List list, boolean z8, FollowNotificationType followNotificationType, boolean z9, boolean z10, boolean z11, boolean z12, Integer num, EventInProfile eventInProfile, boolean z13, boolean z14, int i2, Object obj) {
        q4 q4Var2 = q4Var;
        int i3 = i2;
        User user2 = (i3 & 1) != 0 ? q4Var2.a : user;
        SourceLocation sourceLocation2 = (i3 & 2) != 0 ? q4Var2.b : sourceLocation;
        boolean z15 = (i3 & 4) != 0 ? q4Var2.c : z2;
        boolean z16 = (i3 & 8) != 0 ? q4Var2.d : z3;
        boolean z17 = (i3 & 16) != 0 ? q4Var2.e : z4;
        boolean z18 = (i3 & 32) != 0 ? q4Var2.f : z5;
        boolean z19 = (i3 & 64) != 0 ? q4Var2.g : z6;
        boolean z20 = (i3 & 128) != 0 ? q4Var2.h : z7;
        b bVar3 = (i3 & 256) != 0 ? q4Var2.i : bVar;
        b bVar4 = (i3 & 512) != 0 ? q4Var2.j : bVar2;
        UserProfile userProfile2 = (i3 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? q4Var2.k : userProfile;
        List list2 = (i3 & 2048) != 0 ? q4Var2.l : list;
        boolean z21 = (i3 & 4096) != 0 ? q4Var2.m : z8;
        FollowNotificationType followNotificationType2 = (i3 & 8192) != 0 ? q4Var2.n : followNotificationType;
        boolean z22 = z21;
        boolean z23 = (i3 & 16384) != 0 ? q4Var2.o : z9;
        boolean z24 = (i3 & 32768) != 0 ? q4Var2.p : z10;
        boolean z25 = (i3 & 65536) != 0 ? q4Var2.q : z11;
        boolean z26 = (i3 & 131072) != 0 ? q4Var2.r : z12;
        Integer num2 = (i3 & 262144) != 0 ? q4Var2.s : num;
        EventInProfile eventInProfile2 = (i3 & 524288) != 0 ? q4Var2.t : eventInProfile;
        boolean z27 = (i3 & 1048576) != 0 ? q4Var2.u : z13;
        boolean z28 = (i3 & 2097152) != 0 ? q4Var2.v : z14;
        Objects.requireNonNull(q4Var);
        i.e(user2, "user");
        i.e(sourceLocation2, Stripe3ds2AuthParams.FIELD_SOURCE);
        i.e(bVar3, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        i.e(bVar4, "canCreateClubRequest");
        i.e(followNotificationType2, "notificationType");
        return new q4(user2, sourceLocation2, z15, z16, z17, z18, z19, z20, bVar3, bVar4, userProfile2, list2, z22, followNotificationType2, z23, z24, z25, z26, num2, eventInProfile2, z27, z28);
    }

    public boolean a() {
        return this.o;
    }

    public boolean b() {
        return this.m;
    }

    public FollowNotificationType c() {
        return this.n;
    }

    public final User component1() {
        return this.a;
    }

    public final b<GetCanCreateClubResponse> component10() {
        return this.j;
    }

    public final UserProfile component11() {
        return this.k;
    }

    public final List<UserInList> component12() {
        return this.l;
    }

    public final boolean component13() {
        return this.m;
    }

    public final FollowNotificationType component14() {
        return this.n;
    }

    public final boolean component15() {
        return this.o;
    }

    public final boolean component16() {
        return this.p;
    }

    public final boolean component17() {
        return this.q;
    }

    public final boolean component18() {
        return this.r;
    }

    public final Integer component19() {
        return this.s;
    }

    public final SourceLocation component2() {
        return this.b;
    }

    public final EventInProfile component20() {
        return this.t;
    }

    public final boolean component21() {
        return this.u;
    }

    public final boolean component22() {
        return this.v;
    }

    public final boolean component3() {
        return this.c;
    }

    public final boolean component4() {
        return this.d;
    }

    public final boolean component5() {
        return this.e;
    }

    public final boolean component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    public final boolean component8() {
        return this.h;
    }

    public final b<GetProfileResponse> component9() {
        return this.i;
    }

    public List<UserInList> d() {
        return this.l;
    }

    public boolean e() {
        return this.p;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q4)) {
            return false;
        }
        q4 q4Var = (q4) obj;
        return i.a(this.a, q4Var.a) && this.b == q4Var.b && this.c == q4Var.c && this.d == q4Var.d && this.e == q4Var.e && this.f == q4Var.f && this.g == q4Var.g && this.h == q4Var.h && i.a(this.i, q4Var.i) && i.a(this.j, q4Var.j) && i.a(this.k, q4Var.k) && i.a(this.l, q4Var.l) && this.m == q4Var.m && this.n == q4Var.n && this.o == q4Var.o && this.p == q4Var.p && this.q == q4Var.q && this.r == q4Var.r && i.a(this.s, q4Var.s) && i.a(this.t, q4Var.t) && this.u == q4Var.u && this.v == q4Var.v;
    }

    public EventInProfile f() {
        return this.t;
    }

    public boolean g() {
        return this.q;
    }

    public boolean getLoading() {
        return this.g;
    }

    public b<GetProfileResponse> getRequest() {
        return this.i;
    }

    public boolean h() {
        return this.r;
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        boolean z2 = this.c;
        boolean z3 = true;
        if (z2) {
            z2 = true;
        }
        int i5 = (hashCode + (z2 ? 1 : 0)) * 31;
        boolean z4 = this.d;
        if (z4) {
            z4 = true;
        }
        int i6 = (i5 + (z4 ? 1 : 0)) * 31;
        boolean z5 = this.e;
        if (z5) {
            z5 = true;
        }
        int i7 = (i6 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.f;
        if (z6) {
            z6 = true;
        }
        int i8 = (i7 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.g;
        if (z7) {
            z7 = true;
        }
        int i9 = (i8 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.h;
        if (z8) {
            z8 = true;
        }
        int hashCode2 = (this.j.hashCode() + ((this.i.hashCode() + ((i9 + (z8 ? 1 : 0)) * 31)) * 31)) * 31;
        UserProfile userProfile = this.k;
        int i10 = 0;
        if (userProfile == null) {
            i2 = 0;
        } else {
            i2 = userProfile.hashCode();
        }
        int i11 = (hashCode2 + i2) * 31;
        List<UserInList> list = this.l;
        if (list == null) {
            i3 = 0;
        } else {
            i3 = list.hashCode();
        }
        int i12 = (i11 + i3) * 31;
        boolean z9 = this.m;
        if (z9) {
            z9 = true;
        }
        int hashCode3 = (this.n.hashCode() + ((i12 + (z9 ? 1 : 0)) * 31)) * 31;
        boolean z10 = this.o;
        if (z10) {
            z10 = true;
        }
        int i13 = (hashCode3 + (z10 ? 1 : 0)) * 31;
        boolean z11 = this.p;
        if (z11) {
            z11 = true;
        }
        int i14 = (i13 + (z11 ? 1 : 0)) * 31;
        boolean z12 = this.q;
        if (z12) {
            z12 = true;
        }
        int i15 = (i14 + (z12 ? 1 : 0)) * 31;
        boolean z13 = this.r;
        if (z13) {
            z13 = true;
        }
        int i16 = (i15 + (z13 ? 1 : 0)) * 31;
        Integer num = this.s;
        if (num == null) {
            i4 = 0;
        } else {
            i4 = num.hashCode();
        }
        int i17 = (i16 + i4) * 31;
        EventInProfile eventInProfile = this.t;
        if (eventInProfile != null) {
            i10 = eventInProfile.hashCode();
        }
        int i18 = (i17 + i10) * 31;
        boolean z14 = this.u;
        if (z14) {
            z14 = true;
        }
        int i19 = (i18 + (z14 ? 1 : 0)) * 31;
        boolean z15 = this.v;
        if (!z15) {
            z3 = z15;
        }
        return i19 + (z3 ? 1 : 0);
    }

    public boolean i() {
        return this.v;
    }

    public Integer j() {
        return this.s;
    }

    public UserProfile k() {
        return this.k;
    }

    public b<GetCanCreateClubResponse> l() {
        return this.j;
    }

    public String toString() {
        StringBuilder P0 = a.P0("HalfProfileState(user=");
        P0.append(this.a);
        P0.append(", source=");
        P0.append(this.b);
        P0.append(", expanded=");
        P0.append(this.c);
        P0.append(", maybeReportedBySelf=");
        P0.append(this.d);
        P0.append(", autoJumpToEditBio=");
        P0.append(this.e);
        P0.append(", autoJumpToEditPhoto=");
        P0.append(this.f);
        P0.append(", loading=");
        P0.append(this.g);
        P0.append(", waveChannelLoading=");
        P0.append(this.h);
        P0.append(", request=");
        P0.append(this.i);
        P0.append(", canCreateClubRequest=");
        P0.append(this.j);
        P0.append(", userProfile=");
        P0.append(this.k);
        P0.append(", followSuggestions=");
        P0.append(this.l);
        P0.append(", followSuggestionsExpanded=");
        P0.append(this.m);
        P0.append(", notificationType=");
        P0.append(this.n);
        P0.append(", isSelf=");
        P0.append(this.o);
        P0.append(", followedBySelf=");
        P0.append(this.p);
        P0.append(", blockedBySelf=");
        P0.append(this.q);
        P0.append(", wavedAtBySelf=");
        P0.append(this.r);
        P0.append(", selfId=");
        P0.append(this.s);
        P0.append(", nextEvent=");
        P0.append(this.t);
        P0.append(", isReportV2=");
        P0.append(this.u);
        P0.append(", enableWaves=");
        return a.C0(P0, this.v, ')');
    }

    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ba  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d5  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public q4(com.clubhouse.android.user.model.User r11, com.clubhouse.android.data.models.local.user.SourceLocation r12, boolean r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18, i0.b.b.b<com.clubhouse.android.data.models.remote.response.GetProfileResponse> r19, i0.b.b.b<com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse> r20, com.clubhouse.android.data.models.local.user.UserProfile r21, java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r22, boolean r23, com.clubhouse.android.data.models.local.notification.FollowNotificationType r24, boolean r25, boolean r26, boolean r27, boolean r28, java.lang.Integer r29, com.clubhouse.android.data.models.local.EventInProfile r30, boolean r31, boolean r32) {
        /*
            r10 = this;
            r0 = r10
            r1 = r11
            r2 = r12
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r24
            r7 = r25
            r8 = r32
            java.lang.String r9 = "user"
            m0.n.b.i.e(r11, r9)
            java.lang.String r9 = "source"
            m0.n.b.i.e(r12, r9)
            java.lang.String r9 = "request"
            m0.n.b.i.e(r3, r9)
            java.lang.String r9 = "canCreateClubRequest"
            m0.n.b.i.e(r4, r9)
            java.lang.String r9 = "notificationType"
            m0.n.b.i.e(r6, r9)
            r10.<init>()
            r0.a = r1
            r0.b = r2
            r2 = r13
            r0.c = r2
            r2 = r14
            r0.d = r2
            r2 = r15
            r0.e = r2
            r2 = r16
            r0.f = r2
            r2 = r17
            r0.g = r2
            r2 = r18
            r0.h = r2
            r0.i = r3
            r0.j = r4
            r0.k = r5
            r2 = r22
            r0.l = r2
            r2 = r23
            r0.m = r2
            r0.n = r6
            r0.o = r7
            r2 = r26
            r0.p = r2
            r2 = r27
            r0.q = r2
            r2 = r28
            r0.r = r2
            r2 = r29
            r0.s = r2
            r2 = r30
            r0.t = r2
            r2 = r31
            r0.u = r2
            r0.v = r8
            boolean r2 = r1 instanceof com.clubhouse.android.data.models.local.channel.UserInChannel
            r3 = 0
            if (r2 == 0) goto L_0x0079
            r2 = r1
            com.clubhouse.android.data.models.local.channel.UserInChannel r2 = (com.clubhouse.android.data.models.local.channel.UserInChannel) r2
            goto L_0x007a
        L_0x0079:
            r2 = r3
        L_0x007a:
            r0.w = r2
            boolean r2 = r1 instanceof com.clubhouse.android.data.models.local.user.UserInStatus
            if (r2 == 0) goto L_0x0084
            r4 = r1
            com.clubhouse.android.data.models.local.user.UserInStatus r4 = (com.clubhouse.android.data.models.local.user.UserInStatus) r4
            goto L_0x0085
        L_0x0084:
            r4 = r3
        L_0x0085:
            r6 = 0
            if (r4 != 0) goto L_0x0089
            goto L_0x008d
        L_0x0089:
            java.lang.Boolean r4 = r4.c
            if (r4 != 0) goto L_0x008f
        L_0x008d:
            r4 = r6
            goto L_0x0093
        L_0x008f:
            boolean r4 = r4.booleanValue()
        L_0x0093:
            r0.x = r4
            r9 = 1
            if (r4 != 0) goto L_0x00b5
            if (r2 == 0) goto L_0x009e
            r4 = r1
            com.clubhouse.android.data.models.local.user.UserInStatus r4 = (com.clubhouse.android.data.models.local.user.UserInStatus) r4
            goto L_0x009f
        L_0x009e:
            r4 = r3
        L_0x009f:
            if (r4 != 0) goto L_0x00a2
            goto L_0x00b0
        L_0x00a2:
            java.lang.String r4 = r4.q
            if (r4 != 0) goto L_0x00a7
            goto L_0x00b0
        L_0x00a7:
            boolean r4 = kotlin.text.StringsKt__IndentKt.o(r4)
            r4 = r4 ^ r9
            if (r4 != r9) goto L_0x00b0
            r4 = r9
            goto L_0x00b1
        L_0x00b0:
            r4 = r6
        L_0x00b1:
            if (r4 == 0) goto L_0x00b5
            r4 = r9
            goto L_0x00b6
        L_0x00b5:
            r4 = r6
        L_0x00b6:
            r0.y = r4
            if (r2 == 0) goto L_0x00bd
            com.clubhouse.android.data.models.local.user.UserInStatus r1 = (com.clubhouse.android.data.models.local.user.UserInStatus) r1
            goto L_0x00be
        L_0x00bd:
            r1 = r3
        L_0x00be:
            if (r1 != 0) goto L_0x00c1
            goto L_0x00c3
        L_0x00c1:
            java.lang.String r3 = r1.q
        L_0x00c3:
            r0.z = r3
            if (r8 == 0) goto L_0x00d6
            if (r7 != 0) goto L_0x00d6
            if (r5 != 0) goto L_0x00cc
            goto L_0x00d2
        L_0x00cc:
            boolean r1 = r5.a2
            if (r1 != r9) goto L_0x00d2
            r1 = r9
            goto L_0x00d3
        L_0x00d2:
            r1 = r6
        L_0x00d3:
            if (r1 == 0) goto L_0x00d6
            r6 = r9
        L_0x00d6:
            r0.A = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.u.q4.<init>(com.clubhouse.android.user.model.User, com.clubhouse.android.data.models.local.user.SourceLocation, boolean, boolean, boolean, boolean, boolean, boolean, i0.b.b.b, i0.b.b.b, com.clubhouse.android.data.models.local.user.UserProfile, java.util.List, boolean, com.clubhouse.android.data.models.local.notification.FollowNotificationType, boolean, boolean, boolean, boolean, java.lang.Integer, com.clubhouse.android.data.models.local.EventInProfile, boolean, boolean):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ q4(com.clubhouse.android.user.model.User r27, com.clubhouse.android.data.models.local.user.SourceLocation r28, boolean r29, boolean r30, boolean r31, boolean r32, boolean r33, boolean r34, i0.b.b.b r35, i0.b.b.b r36, com.clubhouse.android.data.models.local.user.UserProfile r37, java.util.List r38, boolean r39, com.clubhouse.android.data.models.local.notification.FollowNotificationType r40, boolean r41, boolean r42, boolean r43, boolean r44, java.lang.Integer r45, com.clubhouse.android.data.models.local.EventInProfile r46, boolean r47, boolean r48, int r49, m0.n.b.f r50) {
        /*
            r26 = this;
            r0 = r49
            r1 = r0 & 4
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r6 = r2
            goto L_0x000b
        L_0x0009:
            r6 = r29
        L_0x000b:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0011
            r7 = r2
            goto L_0x0013
        L_0x0011:
            r7 = r30
        L_0x0013:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0019
            r8 = r2
            goto L_0x001b
        L_0x0019:
            r8 = r31
        L_0x001b:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x0021
            r9 = r2
            goto L_0x0023
        L_0x0021:
            r9 = r32
        L_0x0023:
            r1 = r0 & 64
            if (r1 == 0) goto L_0x0029
            r10 = r2
            goto L_0x002b
        L_0x0029:
            r10 = r33
        L_0x002b:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x0031
            r11 = r2
            goto L_0x0033
        L_0x0031:
            r11 = r34
        L_0x0033:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x003b
            i0.b.b.g0 r1 = i0.b.b.g0.b
            r12 = r1
            goto L_0x003d
        L_0x003b:
            r12 = r35
        L_0x003d:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x0045
            i0.b.b.g0 r1 = i0.b.b.g0.b
            r13 = r1
            goto L_0x0047
        L_0x0045:
            r13 = r36
        L_0x0047:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            r3 = 0
            if (r1 == 0) goto L_0x004e
            r14 = r3
            goto L_0x0050
        L_0x004e:
            r14 = r37
        L_0x0050:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0056
            r15 = r3
            goto L_0x0058
        L_0x0056:
            r15 = r38
        L_0x0058:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x005f
            r16 = r2
            goto L_0x0061
        L_0x005f:
            r16 = r39
        L_0x0061:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x006a
            com.clubhouse.android.data.models.local.notification.FollowNotificationType r1 = com.clubhouse.android.data.models.local.notification.FollowNotificationType.SOMETIMES
            r17 = r1
            goto L_0x006c
        L_0x006a:
            r17 = r40
        L_0x006c:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x0073
            r18 = r2
            goto L_0x0075
        L_0x0073:
            r18 = r41
        L_0x0075:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x007e
            r19 = r2
            goto L_0x0080
        L_0x007e:
            r19 = r42
        L_0x0080:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0088
            r20 = r2
            goto L_0x008a
        L_0x0088:
            r20 = r43
        L_0x008a:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0092
            r21 = r2
            goto L_0x0094
        L_0x0092:
            r21 = r44
        L_0x0094:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009c
            r22 = r3
            goto L_0x009e
        L_0x009c:
            r22 = r45
        L_0x009e:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a6
            r23 = r3
            goto L_0x00a8
        L_0x00a6:
            r23 = r46
        L_0x00a8:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b1
            r1 = 1
            r24 = r1
            goto L_0x00b3
        L_0x00b1:
            r24 = r47
        L_0x00b3:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00bb
            r25 = r2
            goto L_0x00bd
        L_0x00bb:
            r25 = r48
        L_0x00bd:
            r3 = r26
            r4 = r27
            r5 = r28
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.u.q4.<init>(com.clubhouse.android.user.model.User, com.clubhouse.android.data.models.local.user.SourceLocation, boolean, boolean, boolean, boolean, boolean, boolean, i0.b.b.b, i0.b.b.b, com.clubhouse.android.data.models.local.user.UserProfile, java.util.List, boolean, com.clubhouse.android.data.models.local.notification.FollowNotificationType, boolean, boolean, boolean, boolean, java.lang.Integer, com.clubhouse.android.data.models.local.EventInProfile, boolean, boolean, int, m0.n.b.f):void");
    }
}
