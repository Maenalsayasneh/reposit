package com.clubhouse.android.shared.data;

import com.clubhouse.android.data.models.local.channel.UserInChannel;
import i0.e.b.z2.g.k;
import java.util.List;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;

/* compiled from: ChannelUsersDataSource.kt */
public final class ChannelUsersDataSource$filterChannelUsers$1$1 extends Lambda implements l<k, List<? extends UserInChannel>> {
    public final /* synthetic */ String c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelUsersDataSource$filterChannelUsers$1$1(String str) {
        super(1);
        this.c = str;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0039 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r8) {
        /*
            r7 = this;
            i0.e.b.z2.g.k r8 = (i0.e.b.z2.g.k) r8
            java.lang.String r0 = "state"
            m0.n.b.i.e(r8, r0)
            java.lang.String r0 = r7.c
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0016
            int r0 = r0.length()
            if (r0 != 0) goto L_0x0014
            goto L_0x0016
        L_0x0014:
            r0 = r1
            goto L_0x0017
        L_0x0016:
            r0 = r2
        L_0x0017:
            if (r0 == 0) goto L_0x0026
            i0.e.b.b3.a.a.c.a r8 = r8.d
            java.util.Map<java.lang.Integer, com.clubhouse.android.data.models.local.channel.UserInChannel> r8 = r8.b
            java.util.Collection r8 = r8.values()
            java.util.List r8 = m0.j.g.v0(r8)
            goto L_0x0071
        L_0x0026:
            i0.e.b.b3.a.a.c.a r8 = r8.d
            java.util.Map<java.lang.Integer, com.clubhouse.android.data.models.local.channel.UserInChannel> r8 = r8.b
            java.util.Collection r8 = r8.values()
            java.lang.String r0 = r7.c
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r8 = r8.iterator()
        L_0x0039:
            boolean r4 = r8.hasNext()
            if (r4 == 0) goto L_0x0070
            java.lang.Object r4 = r8.next()
            r5 = r4
            com.clubhouse.android.data.models.local.channel.UserInChannel r5 = (com.clubhouse.android.data.models.local.channel.UserInChannel) r5
            java.lang.String r6 = r5.e2
            if (r6 != 0) goto L_0x004b
            goto L_0x0053
        L_0x004b:
            boolean r6 = kotlin.text.StringsKt__IndentKt.b(r6, r0, r2)
            if (r6 != r2) goto L_0x0053
            r6 = r2
            goto L_0x0054
        L_0x0053:
            r6 = r1
        L_0x0054:
            if (r6 != 0) goto L_0x0069
            java.lang.String r5 = r5.f2
            if (r5 != 0) goto L_0x005b
            goto L_0x0063
        L_0x005b:
            boolean r5 = kotlin.text.StringsKt__IndentKt.b(r5, r0, r2)
            if (r5 != r2) goto L_0x0063
            r5 = r2
            goto L_0x0064
        L_0x0063:
            r5 = r1
        L_0x0064:
            if (r5 == 0) goto L_0x0067
            goto L_0x0069
        L_0x0067:
            r5 = r1
            goto L_0x006a
        L_0x0069:
            r5 = r2
        L_0x006a:
            if (r5 == 0) goto L_0x0039
            r3.add(r4)
            goto L_0x0039
        L_0x0070:
            r8 = r3
        L_0x0071:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.shared.data.ChannelUsersDataSource$filterChannelUsers$1$1.invoke(java.lang.Object):java.lang.Object");
    }
}
