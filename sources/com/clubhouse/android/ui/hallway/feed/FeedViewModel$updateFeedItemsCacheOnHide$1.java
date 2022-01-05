package com.clubhouse.android.ui.hallway.feed;

import com.clubhouse.android.data.models.local.channel.ChannelInFeed;
import i0.e.b.g3.p.c0.v;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: FeedViewModel.kt */
public final class FeedViewModel$updateFeedItemsCacheOnHide$1 extends Lambda implements l<v, v> {
    public final /* synthetic */ boolean c;
    public final /* synthetic */ ChannelInFeed d;
    public final /* synthetic */ FeedViewModel q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public FeedViewModel$updateFeedItemsCacheOnHide$1(boolean z, ChannelInFeed channelInFeed, FeedViewModel feedViewModel) {
        super(1);
        this.c = z;
        this.d = channelInFeed;
        this.q = feedViewModel;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v5, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v6, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v8, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: kotlin.collections.EmptyList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v10, resolved type: kotlin.collections.EmptyList} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0083 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            i0.e.b.g3.p.c0.v r1 = (i0.e.b.g3.p.c0.v) r1
            java.lang.String r2 = "$this$setState"
            m0.n.b.i.e(r1, r2)
            boolean r2 = r0.c
            if (r2 == 0) goto L_0x0018
            java.util.Set<com.clubhouse.android.data.models.local.channel.ChannelInFeed> r2 = r1.b
            com.clubhouse.android.data.models.local.channel.ChannelInFeed r3 = r0.d
            java.util.Set r2 = m0.j.g.T(r2, r3)
            goto L_0x0020
        L_0x0018:
            java.util.Set<com.clubhouse.android.data.models.local.channel.ChannelInFeed> r2 = r1.b
            com.clubhouse.android.data.models.local.channel.ChannelInFeed r3 = r0.d
            java.util.Set r2 = m0.j.g.e0(r2, r3)
        L_0x0020:
            r3 = r2
            java.lang.Object r2 = m0.j.g.H(r3)
            com.clubhouse.android.data.models.local.channel.ChannelInFeed r2 = (com.clubhouse.android.data.models.local.channel.ChannelInFeed) r2
            i0.b.b.b<java.util.List<i0.e.b.b3.a.a.d.a.e>> r4 = r1.a
            java.lang.Object r4 = r4.a()
            java.util.List r4 = (java.util.List) r4
            if (r4 != 0) goto L_0x0034
            r2 = 0
            goto L_0x00b3
        L_0x0034:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = 10
            int r6 = i0.j.f.p.h.K(r4, r6)
            r5.<init>(r6)
            java.util.Iterator r4 = r4.iterator()
        L_0x0043:
            boolean r6 = r4.hasNext()
            if (r6 == 0) goto L_0x0078
            java.lang.Object r6 = r4.next()
            i0.e.b.b3.a.a.d.a.e r6 = (i0.e.b.b3.a.a.d.a.e) r6
            boolean r7 = r6 instanceof i0.e.b.b3.a.a.d.a.a
            if (r7 == 0) goto L_0x0066
            r7 = r6
            i0.e.b.b3.a.a.d.a.a r7 = (i0.e.b.b3.a.a.d.a.a) r7
            com.clubhouse.android.data.models.local.channel.ChannelInFeed r8 = r7.a
            boolean r8 = m0.n.b.i.a(r8, r2)
            if (r8 == 0) goto L_0x0066
            i0.e.b.b3.a.a.d.a.f r6 = new i0.e.b.b3.a.a.d.a.f
            com.clubhouse.android.data.models.local.channel.ChannelInFeed r7 = r7.a
            r6.<init>(r7)
            goto L_0x0074
        L_0x0066:
            boolean r7 = r6 instanceof i0.e.b.b3.a.a.d.a.f
            if (r7 == 0) goto L_0x0074
            i0.e.b.b3.a.a.d.a.a r7 = new i0.e.b.b3.a.a.d.a.a
            i0.e.b.b3.a.a.d.a.f r6 = (i0.e.b.b3.a.a.d.a.f) r6
            com.clubhouse.android.data.models.local.channel.ChannelInFeed r6 = r6.a
            r7.<init>(r6)
            r6 = r7
        L_0x0074:
            r5.add(r6)
            goto L_0x0043
        L_0x0078:
            com.clubhouse.android.ui.hallway.feed.FeedViewModel r4 = r0.q
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r5 = r5.iterator()
        L_0x0083:
            boolean r7 = r5.hasNext()
            if (r7 == 0) goto L_0x00b2
            java.lang.Object r7 = r5.next()
            r8 = r7
            i0.e.b.b3.a.a.d.a.e r8 = (i0.e.b.b3.a.a.d.a.e) r8
            java.util.Objects.requireNonNull(r4)
            boolean r9 = r8 instanceof i0.e.b.b3.a.a.d.a.a
            if (r9 == 0) goto L_0x00ab
            i0.e.b.b3.a.a.d.a.a r8 = (i0.e.b.b3.a.a.d.a.a) r8
            com.clubhouse.android.data.models.local.channel.ChannelInFeed r9 = r8.a
            boolean r9 = r3.contains(r9)
            if (r9 == 0) goto L_0x00ab
            com.clubhouse.android.data.models.local.channel.ChannelInFeed r8 = r8.a
            boolean r8 = m0.n.b.i.a(r8, r2)
            if (r8 != 0) goto L_0x00ab
            r8 = 1
            goto L_0x00ac
        L_0x00ab:
            r8 = 0
        L_0x00ac:
            if (r8 != 0) goto L_0x0083
            r6.add(r7)
            goto L_0x0083
        L_0x00b2:
            r2 = r6
        L_0x00b3:
            if (r2 != 0) goto L_0x00b7
            kotlin.collections.EmptyList r2 = kotlin.collections.EmptyList.c
        L_0x00b7:
            i0.b.b.f0 r4 = new i0.b.b.f0
            r4.<init>(r2)
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r12 = 0
            r14 = 0
            r15 = 0
            r16 = 4092(0xffc, float:5.734E-42)
            r17 = 0
            r2 = r4
            r4 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            r8 = r9
            r9 = r10
            r10 = r11
            r11 = r12
            r13 = r14
            r14 = r15
            r15 = r16
            r16 = r17
            i0.e.b.g3.p.c0.v r1 = i0.e.b.g3.p.c0.v.copy$default(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r13, r14, r15, r16)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.hallway.feed.FeedViewModel$updateFeedItemsCacheOnHide$1.invoke(java.lang.Object):java.lang.Object");
    }
}
