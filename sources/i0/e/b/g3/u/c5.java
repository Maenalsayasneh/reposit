package i0.e.b.g3.u;

import androidx.recyclerview.widget.RecyclerView;
import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.data.models.local.user.SourceLocation;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.data.models.remote.response.GetCanCreateClubResponse;
import com.clubhouse.android.data.models.remote.response.GetProfileResponse;
import com.clubhouse.android.data.models.remote.response.UpdatePhotoResponse;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.Stripe3ds2AuthParams;
import i0.b.b.b;
import i0.b.b.j;
import i0.d.a.a.a;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: ProfileViewModel.kt */
public final class c5 implements b5, j {
    public final Integer a;
    public final SourceLocation b;
    public final Map<String, Object> c;
    public final String d;
    public final BasicUser e;
    public final b<UpdatePhotoResponse> f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final b<GetProfileResponse> j;
    public final b<GetCanCreateClubResponse> k;
    public final UserProfile l;
    public final List<UserInList> m;
    public final FollowNotificationType n;
    public final Integer o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final EventInProfile t;
    public final boolean u;
    public final boolean v;

    public c5(Integer num, SourceLocation sourceLocation, Map<String, ? extends Object> map, String str, BasicUser basicUser, b<UpdatePhotoResponse> bVar, boolean z, boolean z2, boolean z3, b<GetProfileResponse> bVar2, b<GetCanCreateClubResponse> bVar3, UserProfile userProfile, List<UserInList> list, FollowNotificationType followNotificationType, Integer num2, boolean z4, boolean z5, boolean z6, boolean z7, EventInProfile eventInProfile, boolean z8, boolean z9) {
        b<GetProfileResponse> bVar4 = bVar2;
        b<GetCanCreateClubResponse> bVar5 = bVar3;
        FollowNotificationType followNotificationType2 = followNotificationType;
        i.e(sourceLocation, Stripe3ds2AuthParams.FIELD_SOURCE);
        i.e(bVar, "updatePhotoRequest");
        i.e(bVar4, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        i.e(bVar5, "canCreateClubRequest");
        i.e(followNotificationType2, "notificationType");
        this.a = num;
        this.b = sourceLocation;
        this.c = map;
        this.d = str;
        this.e = basicUser;
        this.f = bVar;
        this.g = z;
        this.h = z2;
        this.i = z3;
        this.j = bVar4;
        this.k = bVar5;
        this.l = userProfile;
        this.m = list;
        this.n = followNotificationType2;
        this.o = num2;
        this.p = z4;
        this.q = z5;
        this.r = z6;
        this.s = z7;
        this.t = eventInProfile;
        this.u = z8;
        this.v = z9;
    }

    public static c5 copy$default(c5 c5Var, Integer num, SourceLocation sourceLocation, Map map, String str, BasicUser basicUser, b bVar, boolean z, boolean z2, boolean z3, b bVar2, b bVar3, UserProfile userProfile, List list, FollowNotificationType followNotificationType, Integer num2, boolean z4, boolean z5, boolean z6, boolean z7, EventInProfile eventInProfile, boolean z8, boolean z9, int i2, Object obj) {
        c5 c5Var2 = c5Var;
        int i3 = i2;
        Integer num3 = (i3 & 1) != 0 ? c5Var2.a : num;
        SourceLocation sourceLocation2 = (i3 & 2) != 0 ? c5Var2.b : sourceLocation;
        Map map2 = (i3 & 4) != 0 ? c5Var2.c : map;
        String str2 = (i3 & 8) != 0 ? c5Var2.d : str;
        BasicUser basicUser2 = (i3 & 16) != 0 ? c5Var2.e : basicUser;
        b bVar4 = (i3 & 32) != 0 ? c5Var2.f : bVar;
        boolean z10 = (i3 & 64) != 0 ? c5Var2.g : z;
        boolean z11 = (i3 & 128) != 0 ? c5Var2.h : z2;
        boolean z12 = (i3 & 256) != 0 ? c5Var2.i : z3;
        b bVar5 = (i3 & 512) != 0 ? c5Var2.j : bVar2;
        b bVar6 = (i3 & RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE) != 0 ? c5Var2.k : bVar3;
        UserProfile userProfile2 = (i3 & 2048) != 0 ? c5Var2.l : userProfile;
        List list2 = (i3 & 4096) != 0 ? c5Var2.m : list;
        FollowNotificationType followNotificationType2 = (i3 & 8192) != 0 ? c5Var2.n : followNotificationType;
        List list3 = list2;
        Integer num4 = (i3 & 16384) != 0 ? c5Var2.o : num2;
        boolean z13 = (i3 & 32768) != 0 ? c5Var2.p : z4;
        boolean z14 = (i3 & 65536) != 0 ? c5Var2.q : z5;
        boolean z15 = (i3 & 131072) != 0 ? c5Var2.r : z6;
        boolean z16 = (i3 & 262144) != 0 ? c5Var2.s : z7;
        EventInProfile eventInProfile2 = (i3 & 524288) != 0 ? c5Var2.t : eventInProfile;
        boolean z17 = (i3 & 1048576) != 0 ? c5Var2.u : z8;
        boolean z18 = (i3 & 2097152) != 0 ? c5Var2.v : z9;
        Objects.requireNonNull(c5Var);
        i.e(sourceLocation2, Stripe3ds2AuthParams.FIELD_SOURCE);
        i.e(bVar4, "updatePhotoRequest");
        i.e(bVar5, InstabugDbContract.NetworkLogEntry.COLUMN_REQUEST);
        i.e(bVar6, "canCreateClubRequest");
        i.e(followNotificationType2, "notificationType");
        return new c5(num3, sourceLocation2, map2, str2, basicUser2, bVar4, z10, z11, z12, bVar5, bVar6, userProfile2, list3, followNotificationType2, num4, z13, z14, z15, z16, eventInProfile2, z17, z18);
    }

    public boolean a() {
        return this.p;
    }

    public boolean b() {
        return this.i;
    }

    public FollowNotificationType c() {
        return this.n;
    }

    public final Integer component1() {
        return this.a;
    }

    public final b<GetProfileResponse> component10() {
        return this.j;
    }

    public final b<GetCanCreateClubResponse> component11() {
        return this.k;
    }

    public final UserProfile component12() {
        return this.l;
    }

    public final List<UserInList> component13() {
        return this.m;
    }

    public final FollowNotificationType component14() {
        return this.n;
    }

    public final Integer component15() {
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

    public final boolean component19() {
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

    public final Map<String, Object> component3() {
        return this.c;
    }

    public final String component4() {
        return this.d;
    }

    public final BasicUser component5() {
        return this.e;
    }

    public final b<UpdatePhotoResponse> component6() {
        return this.f;
    }

    public final boolean component7() {
        return this.g;
    }

    public final boolean component8() {
        return this.h;
    }

    public final boolean component9() {
        return this.i;
    }

    public List<UserInList> d() {
        return this.m;
    }

    public boolean e() {
        return this.q;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c5)) {
            return false;
        }
        c5 c5Var = (c5) obj;
        return i.a(this.a, c5Var.a) && this.b == c5Var.b && i.a(this.c, c5Var.c) && i.a(this.d, c5Var.d) && i.a(this.e, c5Var.e) && i.a(this.f, c5Var.f) && this.g == c5Var.g && this.h == c5Var.h && this.i == c5Var.i && i.a(this.j, c5Var.j) && i.a(this.k, c5Var.k) && i.a(this.l, c5Var.l) && i.a(this.m, c5Var.m) && this.n == c5Var.n && i.a(this.o, c5Var.o) && this.p == c5Var.p && this.q == c5Var.q && this.r == c5Var.r && this.s == c5Var.s && i.a(this.t, c5Var.t) && this.u == c5Var.u && this.v == c5Var.v;
    }

    public EventInProfile f() {
        return this.t;
    }

    public boolean g() {
        return this.r;
    }

    public boolean getLoading() {
        return this.h;
    }

    public b<GetProfileResponse> getRequest() {
        return this.j;
    }

    public boolean h() {
        return this.s;
    }

    public int hashCode() {
        int i2;
        int i3;
        int i4;
        Integer num = this.a;
        int i5 = 0;
        int hashCode = (this.b.hashCode() + ((num == null ? 0 : num.hashCode()) * 31)) * 31;
        Map<String, Object> map = this.c;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        String str = this.d;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        BasicUser basicUser = this.e;
        int hashCode4 = (this.f.hashCode() + ((hashCode3 + (basicUser == null ? 0 : basicUser.hashCode())) * 31)) * 31;
        boolean z = this.g;
        boolean z2 = true;
        if (z) {
            z = true;
        }
        int i6 = (hashCode4 + (z ? 1 : 0)) * 31;
        boolean z3 = this.h;
        if (z3) {
            z3 = true;
        }
        int i7 = (i6 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.i;
        if (z4) {
            z4 = true;
        }
        int hashCode5 = (this.k.hashCode() + ((this.j.hashCode() + ((i7 + (z4 ? 1 : 0)) * 31)) * 31)) * 31;
        UserProfile userProfile = this.l;
        if (userProfile == null) {
            i2 = 0;
        } else {
            i2 = userProfile.hashCode();
        }
        int i8 = (hashCode5 + i2) * 31;
        List<UserInList> list = this.m;
        if (list == null) {
            i3 = 0;
        } else {
            i3 = list.hashCode();
        }
        int hashCode6 = (this.n.hashCode() + ((i8 + i3) * 31)) * 31;
        Integer num2 = this.o;
        if (num2 == null) {
            i4 = 0;
        } else {
            i4 = num2.hashCode();
        }
        int i9 = (hashCode6 + i4) * 31;
        boolean z5 = this.p;
        if (z5) {
            z5 = true;
        }
        int i10 = (i9 + (z5 ? 1 : 0)) * 31;
        boolean z6 = this.q;
        if (z6) {
            z6 = true;
        }
        int i11 = (i10 + (z6 ? 1 : 0)) * 31;
        boolean z7 = this.r;
        if (z7) {
            z7 = true;
        }
        int i12 = (i11 + (z7 ? 1 : 0)) * 31;
        boolean z8 = this.s;
        if (z8) {
            z8 = true;
        }
        int i13 = (i12 + (z8 ? 1 : 0)) * 31;
        EventInProfile eventInProfile = this.t;
        if (eventInProfile != null) {
            i5 = eventInProfile.hashCode();
        }
        int i14 = (i13 + i5) * 31;
        boolean z9 = this.u;
        if (z9) {
            z9 = true;
        }
        int i15 = (i14 + (z9 ? 1 : 0)) * 31;
        boolean z10 = this.v;
        if (!z10) {
            z2 = z10;
        }
        return i15 + (z2 ? 1 : 0);
    }

    public boolean i() {
        return this.v;
    }

    public Integer j() {
        return this.o;
    }

    public UserProfile k() {
        return this.l;
    }

    public b<GetCanCreateClubResponse> l() {
        return this.k;
    }

    public String toString() {
        StringBuilder P0 = a.P0("ProfileViewState(userId=");
        P0.append(this.a);
        P0.append(", source=");
        P0.append(this.b);
        P0.append(", loggingContext=");
        P0.append(this.c);
        P0.append(", username=");
        P0.append(this.d);
        P0.append(", basicUser=");
        P0.append(this.e);
        P0.append(", updatePhotoRequest=");
        P0.append(this.f);
        P0.append(", waveChannelLoading=");
        P0.append(this.g);
        P0.append(", loading=");
        P0.append(this.h);
        P0.append(", followSuggestionsExpanded=");
        P0.append(this.i);
        P0.append(", request=");
        P0.append(this.j);
        P0.append(", canCreateClubRequest=");
        P0.append(this.k);
        P0.append(", userProfile=");
        P0.append(this.l);
        P0.append(", followSuggestions=");
        P0.append(this.m);
        P0.append(", notificationType=");
        P0.append(this.n);
        P0.append(", selfId=");
        P0.append(this.o);
        P0.append(", isSelf=");
        P0.append(this.p);
        P0.append(", followedBySelf=");
        P0.append(this.q);
        P0.append(", blockedBySelf=");
        P0.append(this.r);
        P0.append(", wavedAtBySelf=");
        P0.append(this.s);
        P0.append(", nextEvent=");
        P0.append(this.t);
        P0.append(", isReportV2=");
        P0.append(this.u);
        P0.append(", enableWaves=");
        return a.C0(P0, this.v, ')');
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ c5(java.lang.Integer r27, com.clubhouse.android.data.models.local.user.SourceLocation r28, java.util.Map r29, java.lang.String r30, com.clubhouse.android.data.models.local.user.BasicUser r31, i0.b.b.b r32, boolean r33, boolean r34, boolean r35, i0.b.b.b r36, i0.b.b.b r37, com.clubhouse.android.data.models.local.user.UserProfile r38, java.util.List r39, com.clubhouse.android.data.models.local.notification.FollowNotificationType r40, java.lang.Integer r41, boolean r42, boolean r43, boolean r44, boolean r45, com.clubhouse.android.data.models.local.EventInProfile r46, boolean r47, boolean r48, int r49, m0.n.b.f r50) {
        /*
            r26 = this;
            r0 = r49
            r1 = r0 & 1
            r2 = 0
            if (r1 == 0) goto L_0x0009
            r4 = r2
            goto L_0x000b
        L_0x0009:
            r4 = r27
        L_0x000b:
            r1 = r0 & 4
            if (r1 == 0) goto L_0x0011
            r6 = r2
            goto L_0x0013
        L_0x0011:
            r6 = r29
        L_0x0013:
            r1 = r0 & 8
            if (r1 == 0) goto L_0x0019
            r7 = r2
            goto L_0x001b
        L_0x0019:
            r7 = r30
        L_0x001b:
            r1 = r0 & 16
            if (r1 == 0) goto L_0x0021
            r8 = r2
            goto L_0x0023
        L_0x0021:
            r8 = r31
        L_0x0023:
            r1 = r0 & 32
            if (r1 == 0) goto L_0x002b
            i0.b.b.g0 r1 = i0.b.b.g0.b
            r9 = r1
            goto L_0x002d
        L_0x002b:
            r9 = r32
        L_0x002d:
            r1 = r0 & 64
            r3 = 0
            if (r1 == 0) goto L_0x0034
            r10 = r3
            goto L_0x0036
        L_0x0034:
            r10 = r33
        L_0x0036:
            r1 = r0 & 128(0x80, float:1.794E-43)
            if (r1 == 0) goto L_0x003c
            r11 = r3
            goto L_0x003e
        L_0x003c:
            r11 = r34
        L_0x003e:
            r1 = r0 & 256(0x100, float:3.59E-43)
            if (r1 == 0) goto L_0x0044
            r12 = r3
            goto L_0x0046
        L_0x0044:
            r12 = r35
        L_0x0046:
            r1 = r0 & 512(0x200, float:7.175E-43)
            if (r1 == 0) goto L_0x004e
            i0.b.b.g0 r1 = i0.b.b.g0.b
            r13 = r1
            goto L_0x0050
        L_0x004e:
            r13 = r36
        L_0x0050:
            r1 = r0 & 1024(0x400, float:1.435E-42)
            if (r1 == 0) goto L_0x0058
            i0.b.b.g0 r1 = i0.b.b.g0.b
            r14 = r1
            goto L_0x005a
        L_0x0058:
            r14 = r37
        L_0x005a:
            r1 = r0 & 2048(0x800, float:2.87E-42)
            if (r1 == 0) goto L_0x0060
            r15 = r2
            goto L_0x0062
        L_0x0060:
            r15 = r38
        L_0x0062:
            r1 = r0 & 4096(0x1000, float:5.74E-42)
            if (r1 == 0) goto L_0x0069
            r16 = r2
            goto L_0x006b
        L_0x0069:
            r16 = r39
        L_0x006b:
            r1 = r0 & 8192(0x2000, float:1.14794E-41)
            if (r1 == 0) goto L_0x0074
            com.clubhouse.android.data.models.local.notification.FollowNotificationType r1 = com.clubhouse.android.data.models.local.notification.FollowNotificationType.SOMETIMES
            r17 = r1
            goto L_0x0076
        L_0x0074:
            r17 = r40
        L_0x0076:
            r1 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r1 == 0) goto L_0x007d
            r18 = r2
            goto L_0x007f
        L_0x007d:
            r18 = r41
        L_0x007f:
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0088
            r19 = r3
            goto L_0x008a
        L_0x0088:
            r19 = r42
        L_0x008a:
            r1 = 65536(0x10000, float:9.18355E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x0092
            r20 = r3
            goto L_0x0094
        L_0x0092:
            r20 = r43
        L_0x0094:
            r1 = 131072(0x20000, float:1.83671E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x009c
            r21 = r3
            goto L_0x009e
        L_0x009c:
            r21 = r44
        L_0x009e:
            r1 = 262144(0x40000, float:3.67342E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00a6
            r22 = r3
            goto L_0x00a8
        L_0x00a6:
            r22 = r45
        L_0x00a8:
            r1 = 524288(0x80000, float:7.34684E-40)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00b0
            r23 = r2
            goto L_0x00b2
        L_0x00b0:
            r23 = r46
        L_0x00b2:
            r1 = 1048576(0x100000, float:1.469368E-39)
            r1 = r1 & r0
            if (r1 == 0) goto L_0x00bb
            r1 = 1
            r24 = r1
            goto L_0x00bd
        L_0x00bb:
            r24 = r47
        L_0x00bd:
            r1 = 2097152(0x200000, float:2.938736E-39)
            r0 = r0 & r1
            if (r0 == 0) goto L_0x00c5
            r25 = r3
            goto L_0x00c7
        L_0x00c5:
            r25 = r48
        L_0x00c7:
            r3 = r26
            r5 = r28
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.u.c5.<init>(java.lang.Integer, com.clubhouse.android.data.models.local.user.SourceLocation, java.util.Map, java.lang.String, com.clubhouse.android.data.models.local.user.BasicUser, i0.b.b.b, boolean, boolean, boolean, i0.b.b.b, i0.b.b.b, com.clubhouse.android.data.models.local.user.UserProfile, java.util.List, com.clubhouse.android.data.models.local.notification.FollowNotificationType, java.lang.Integer, boolean, boolean, boolean, boolean, com.clubhouse.android.data.models.local.EventInProfile, boolean, boolean, int, m0.n.b.f):void");
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public c5(com.clubhouse.android.ui.profile.ProfileArgs r28) {
        /*
            r27 = this;
            r0 = r28
            java.lang.String r1 = "args"
            m0.n.b.i.e(r0, r1)
            java.lang.Integer r3 = r0.c
            java.lang.String r6 = r0.d
            com.clubhouse.android.data.models.local.user.BasicUser r7 = r0.q
            boolean r1 = r0.x
            com.clubhouse.android.data.models.local.user.SourceLocation r4 = r0.Y1
            java.util.Map<java.lang.String, java.lang.Object> r5 = r0.Z1
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
            r19 = 0
            r20 = 0
            r21 = 0
            r22 = 0
            r23 = 0
            r24 = 0
            r25 = 4161504(0x3f7fe0, float:5.831509E-39)
            r26 = 0
            r2 = r27
            r18 = r1
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.u.c5.<init>(com.clubhouse.android.ui.profile.ProfileArgs):void");
    }
}
