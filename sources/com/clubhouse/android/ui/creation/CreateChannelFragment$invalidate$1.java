package com.clubhouse.android.ui.creation;

import i0.e.b.g3.n.t;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: CreateChannelFragment.kt */
public final class CreateChannelFragment$invalidate$1 extends Lambda implements l<t, i> {
    public final /* synthetic */ CreateChannelFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CreateChannelFragment$invalidate$1(CreateChannelFragment createChannelFragment) {
        super(1);
        this.c = createChannelFragment;
    }

    /* JADX WARNING: Removed duplicated region for block: B:100:0x0299  */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x02a9  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011c  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x015e  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:79:0x01df  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x022f  */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x0297  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object invoke(java.lang.Object r15) {
        /*
            r14 = this;
            i0.e.b.g3.n.t r15 = (i0.e.b.g3.n.t) r15
            java.lang.String r0 = "state"
            m0.n.b.i.e(r15, r0)
            com.clubhouse.android.ui.creation.CreateChannelFragment r0 = r14.c
            com.clubhouse.android.ui.creation.CreateChannelFragment$a r1 = com.clubhouse.android.ui.creation.CreateChannelFragment.p2
            com.clubhouse.android.databinding.CreateChannelBinding r0 = r0.U0()
            com.airbnb.epoxy.EpoxyRecyclerView r0 = r0.c
            r0.g()
            com.clubhouse.android.ui.creation.CreateChannelFragment r0 = r14.c
            com.clubhouse.android.databinding.CreateChannelBinding r0 = r0.U0()
            android.widget.TextView r0 = r0.f
            com.clubhouse.android.ui.creation.CreateChannelFragment r1 = r14.c
            android.content.res.Resources r1 = r1.getResources()
            java.lang.String r2 = "resources"
            m0.n.b.i.d(r1, r2)
            java.lang.String r3 = "<this>"
            m0.n.b.i.e(r15, r3)
            m0.n.b.i.e(r1, r2)
            i0.e.b.z2.f.a r2 = r15.c
            com.clubhouse.android.channels.model.AudienceType r4 = com.clubhouse.android.channels.model.AudienceType.Closed
            java.lang.String r10 = "fromHtml(\n            String.format(getString(id), *args.toTypedArray()),\n            HtmlCompat.FROM_HTML_MODE_COMPACT\n        )"
            java.lang.String r8 = "java.lang.String.format(format, *args)"
            java.lang.String r5 = "null cannot be cast to non-null type kotlin.Array<T>"
            java.lang.String r6 = "getString(id)"
            r9 = 63
            java.lang.String r7 = "rawArgs"
            r11 = 0
            r12 = 1
            if (r2 != r4) goto L_0x00be
            java.lang.String r2 = r15.e
            if (r2 != 0) goto L_0x0048
            goto L_0x0055
        L_0x0048:
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0050
            r2 = r12
            goto L_0x0051
        L_0x0050:
            r2 = r11
        L_0x0051:
            if (r2 != r12) goto L_0x0055
            r2 = r12
            goto L_0x0056
        L_0x0055:
            r2 = r11
        L_0x0056:
            if (r2 == 0) goto L_0x0098
            r2 = 2131951877(0x7f130105, float:1.954018E38)
            java.lang.Object[] r4 = new java.lang.Object[r12]
            java.lang.String r13 = r15.e
            r4[r11] = r13
            java.util.ArrayList r7 = i0.d.a.a.a.i1(r1, r3, r4, r7, r12)
        L_0x0065:
            if (r11 >= r12) goto L_0x007a
            r12 = r4[r11]
            boolean r13 = r12 instanceof java.lang.String
            if (r13 == 0) goto L_0x0073
            java.lang.String r12 = (java.lang.String) r12
            java.lang.String r12 = i0.d.a.a.a.p0(r12, r3, r12, r9)
        L_0x0073:
            r7.add(r12)
            int r11 = r11 + 1
            r12 = 1
            goto L_0x0065
        L_0x007a:
            java.lang.String r1 = r1.getString(r2)
            m0.n.b.i.d(r1, r6)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object[] r2 = r7.toArray(r2)
            java.util.Objects.requireNonNull(r2, r5)
            int r3 = r2.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r2, r3)
            int r6 = r5.length
            r7 = r1
            android.text.Spanned r1 = i0.d.a.a.a.L(r5, r6, r7, r8, r9, r10)
            goto L_0x022d
        L_0x0098:
            r2 = 2131951876(0x7f130104, float:1.9540179E38)
            r4 = 0
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.util.ArrayList r3 = i0.d.a.a.a.i1(r1, r3, r11, r7, r4)
            java.lang.String r7 = r1.getString(r2)
            m0.n.b.i.d(r7, r6)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Object[] r1 = r3.toArray(r1)
            java.util.Objects.requireNonNull(r1, r5)
            int r2 = r1.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r1, r2)
            int r6 = r5.length
            android.text.Spanned r1 = i0.d.a.a.a.L(r5, r6, r7, r8, r9, r10)
            goto L_0x022d
        L_0x00be:
            com.clubhouse.android.channels.model.AudienceType r4 = com.clubhouse.android.channels.model.AudienceType.Open
            if (r2 != r4) goto L_0x0142
            java.lang.String r2 = r15.e
            if (r2 != 0) goto L_0x00c8
            r2 = 1
            goto L_0x00d7
        L_0x00c8:
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x00d0
            r2 = 1
            goto L_0x00d1
        L_0x00d0:
            r2 = 0
        L_0x00d1:
            r4 = 1
            if (r2 != r4) goto L_0x00d6
            r2 = r4
            goto L_0x00d8
        L_0x00d6:
            r2 = r4
        L_0x00d7:
            r4 = 0
        L_0x00d8:
            if (r4 == 0) goto L_0x011c
            r4 = 2131951881(0x7f130109, float:1.954019E38)
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.String r12 = r15.e
            r13 = 0
            r11[r13] = r12
            java.util.ArrayList r7 = i0.d.a.a.a.i1(r1, r3, r11, r7, r2)
            r12 = 0
        L_0x00e9:
            if (r12 >= r2) goto L_0x00fe
            r2 = r11[r12]
            boolean r13 = r2 instanceof java.lang.String
            if (r13 == 0) goto L_0x00f7
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = i0.d.a.a.a.p0(r2, r3, r2, r9)
        L_0x00f7:
            r7.add(r2)
            int r12 = r12 + 1
            r2 = 1
            goto L_0x00e9
        L_0x00fe:
            java.lang.String r1 = r1.getString(r4)
            m0.n.b.i.d(r1, r6)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object[] r2 = r7.toArray(r2)
            java.util.Objects.requireNonNull(r2, r5)
            int r3 = r2.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r2, r3)
            int r6 = r5.length
            r7 = r1
            android.text.Spanned r1 = i0.d.a.a.a.L(r5, r6, r7, r8, r9, r10)
            goto L_0x022d
        L_0x011c:
            r2 = 2131951880(0x7f130108, float:1.9540187E38)
            r4 = 0
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.util.ArrayList r3 = i0.d.a.a.a.i1(r1, r3, r11, r7, r4)
            java.lang.String r7 = r1.getString(r2)
            m0.n.b.i.d(r7, r6)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Object[] r1 = r3.toArray(r1)
            java.util.Objects.requireNonNull(r1, r5)
            int r2 = r1.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r1, r2)
            int r6 = r5.length
            android.text.Spanned r1 = i0.d.a.a.a.L(r5, r6, r7, r8, r9, r10)
            goto L_0x022d
        L_0x0142:
            com.clubhouse.android.channels.model.AudienceType r4 = com.clubhouse.android.channels.model.AudienceType.Social
            if (r2 != r4) goto L_0x01c5
            java.lang.String r2 = r15.e
            if (r2 != 0) goto L_0x014c
            r2 = 1
            goto L_0x015b
        L_0x014c:
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x0154
            r2 = 1
            goto L_0x0155
        L_0x0154:
            r2 = 0
        L_0x0155:
            r4 = 1
            if (r2 != r4) goto L_0x015a
            r2 = r4
            goto L_0x015c
        L_0x015a:
            r2 = r4
        L_0x015b:
            r4 = 0
        L_0x015c:
            if (r4 == 0) goto L_0x01a0
            r4 = 2131951883(0x7f13010b, float:1.9540193E38)
            java.lang.Object[] r11 = new java.lang.Object[r2]
            java.lang.String r12 = r15.e
            r13 = 0
            r11[r13] = r12
            java.util.ArrayList r7 = i0.d.a.a.a.i1(r1, r3, r11, r7, r2)
            r12 = 0
        L_0x016d:
            if (r12 >= r2) goto L_0x0182
            r2 = r11[r12]
            boolean r13 = r2 instanceof java.lang.String
            if (r13 == 0) goto L_0x017b
            java.lang.String r2 = (java.lang.String) r2
            java.lang.String r2 = i0.d.a.a.a.p0(r2, r3, r2, r9)
        L_0x017b:
            r7.add(r2)
            int r12 = r12 + 1
            r2 = 1
            goto L_0x016d
        L_0x0182:
            java.lang.String r1 = r1.getString(r4)
            m0.n.b.i.d(r1, r6)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object[] r2 = r7.toArray(r2)
            java.util.Objects.requireNonNull(r2, r5)
            int r3 = r2.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r2, r3)
            int r6 = r5.length
            r7 = r1
            android.text.Spanned r1 = i0.d.a.a.a.L(r5, r6, r7, r8, r9, r10)
            goto L_0x022d
        L_0x01a0:
            r2 = 2131951882(0x7f13010a, float:1.9540191E38)
            r4 = 0
            java.lang.Object[] r11 = new java.lang.Object[r4]
            java.util.ArrayList r3 = i0.d.a.a.a.i1(r1, r3, r11, r7, r4)
            java.lang.String r7 = r1.getString(r2)
            m0.n.b.i.d(r7, r6)
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.Object[] r1 = r3.toArray(r1)
            java.util.Objects.requireNonNull(r1, r5)
            int r2 = r1.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r1, r2)
            int r6 = r5.length
            android.text.Spanned r1 = i0.d.a.a.a.L(r5, r6, r7, r8, r9, r10)
            goto L_0x022d
        L_0x01c5:
            boolean r2 = r2 instanceof i0.e.b.z2.f.d
            if (r2 == 0) goto L_0x0279
            java.lang.String r2 = r15.e
            if (r2 != 0) goto L_0x01ce
            goto L_0x01dc
        L_0x01ce:
            int r2 = r2.length()
            if (r2 <= 0) goto L_0x01d6
            r2 = 1
            goto L_0x01d7
        L_0x01d6:
            r2 = 0
        L_0x01d7:
            r4 = 1
            if (r2 != r4) goto L_0x01dc
            r2 = 1
            goto L_0x01dd
        L_0x01dc:
            r2 = 0
        L_0x01dd:
            if (r2 == 0) goto L_0x022f
            r2 = 2131951879(0x7f130107, float:1.9540185E38)
            r4 = 2
            java.lang.Object[] r11 = new java.lang.Object[r4]
            i0.e.b.z2.f.a r12 = r15.c
            i0.e.b.z2.f.d r12 = (i0.e.b.z2.f.d) r12
            com.clubhouse.android.data.models.local.club.Club r12 = r12.c
            java.lang.String r12 = r12.getName()
            r13 = 0
            r11[r13] = r12
            java.lang.String r12 = r15.e
            r13 = 1
            r11[r13] = r12
            java.util.ArrayList r7 = i0.d.a.a.a.i1(r1, r3, r11, r7, r4)
            r12 = 0
        L_0x01fc:
            if (r12 >= r4) goto L_0x0211
            r4 = r11[r12]
            boolean r13 = r4 instanceof java.lang.String
            if (r13 == 0) goto L_0x020a
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = i0.d.a.a.a.p0(r4, r3, r4, r9)
        L_0x020a:
            r7.add(r4)
            int r12 = r12 + 1
            r4 = 2
            goto L_0x01fc
        L_0x0211:
            java.lang.String r1 = r1.getString(r2)
            m0.n.b.i.d(r1, r6)
            r2 = 0
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Object[] r2 = r7.toArray(r2)
            java.util.Objects.requireNonNull(r2, r5)
            int r3 = r2.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r2, r3)
            int r6 = r5.length
            r7 = r1
            android.text.Spanned r1 = i0.d.a.a.a.L(r5, r6, r7, r8, r9, r10)
        L_0x022d:
            r2 = 0
            goto L_0x027c
        L_0x022f:
            r2 = 2131951878(0x7f130106, float:1.9540183E38)
            r4 = 1
            java.lang.Object[] r11 = new java.lang.Object[r4]
            i0.e.b.z2.f.a r12 = r15.c
            i0.e.b.z2.f.d r12 = (i0.e.b.z2.f.d) r12
            com.clubhouse.android.data.models.local.club.Club r12 = r12.c
            java.lang.String r12 = r12.getName()
            r13 = 0
            r11[r13] = r12
            java.util.ArrayList r7 = i0.d.a.a.a.i1(r1, r3, r11, r7, r4)
            r12 = 0
        L_0x0247:
            if (r12 >= r4) goto L_0x025c
            r4 = r11[r12]
            boolean r13 = r4 instanceof java.lang.String
            if (r13 == 0) goto L_0x0255
            java.lang.String r4 = (java.lang.String) r4
            java.lang.String r4 = i0.d.a.a.a.p0(r4, r3, r4, r9)
        L_0x0255:
            r7.add(r4)
            int r12 = r12 + 1
            r4 = 1
            goto L_0x0247
        L_0x025c:
            java.lang.String r1 = r1.getString(r2)
            m0.n.b.i.d(r1, r6)
            r2 = 0
            java.lang.Object[] r3 = new java.lang.Object[r2]
            java.lang.Object[] r3 = r7.toArray(r3)
            java.util.Objects.requireNonNull(r3, r5)
            int r4 = r3.length
            java.lang.Object[] r5 = java.util.Arrays.copyOf(r3, r4)
            int r6 = r5.length
            r7 = r1
            android.text.Spanned r1 = i0.d.a.a.a.L(r5, r6, r7, r8, r9, r10)
            goto L_0x027c
        L_0x0279:
            r2 = 0
            java.lang.String r1 = ""
        L_0x027c:
            r0.setText(r1)
            com.clubhouse.android.ui.creation.CreateChannelFragment r0 = r14.c
            com.clubhouse.android.databinding.CreateChannelBinding r0 = r0.U0()
            android.widget.Button r0 = r0.b
            com.clubhouse.android.ui.creation.CreateChannelFragment r1 = r14.c
            java.util.Objects.requireNonNull(r1)
            java.lang.String r3 = r15.e
            if (r3 == 0) goto L_0x0299
            int r3 = r3.length()
            if (r3 != 0) goto L_0x0297
            goto L_0x0299
        L_0x0297:
            r3 = r2
            goto L_0x029a
        L_0x0299:
            r3 = 1
        L_0x029a:
            if (r3 == 0) goto L_0x02a9
            r3 = 2131951677(0x7f13003d, float:1.9539775E38)
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "getString(R.string.add_a_title_button_label)"
            m0.n.b.i.d(r1, r3)
            goto L_0x02b5
        L_0x02a9:
            r3 = 2131952068(0x7f1301c4, float:1.9540568E38)
            java.lang.String r1 = r1.getString(r3)
            java.lang.String r3 = "getString(R.string.edit_title)"
            m0.n.b.i.d(r1, r3)
        L_0x02b5:
            r0.setText(r1)
            i0.e.b.z2.f.a r0 = r15.c
            com.clubhouse.android.channels.model.AudienceType r1 = com.clubhouse.android.channels.model.AudienceType.Closed
            if (r0 != r1) goto L_0x02c8
            java.util.List<com.clubhouse.android.data.models.local.user.UserInList> r15 = r15.d
            boolean r15 = r15.isEmpty()
            r15 = r15 ^ 1
            if (r15 == 0) goto L_0x02c9
        L_0x02c8:
            r2 = 1
        L_0x02c9:
            com.clubhouse.android.ui.creation.CreateChannelFragment r15 = r14.c
            com.clubhouse.android.databinding.CreateChannelBinding r15 = r15.U0()
            android.widget.Button r15 = r15.e
            java.lang.String r0 = "binding.createButton"
            m0.n.b.i.d(r15, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            i0.e.b.d3.k.L(r15, r0)
            com.clubhouse.android.ui.creation.CreateChannelFragment r15 = r14.c
            com.clubhouse.android.databinding.CreateChannelBinding r15 = r15.U0()
            android.widget.Button r15 = r15.d
            java.lang.String r0 = "binding.choosePeopleButton"
            m0.n.b.i.d(r15, r0)
            r0 = r2 ^ 1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            i0.e.b.d3.k.L(r15, r0)
            m0.i r15 = m0.i.a
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.clubhouse.android.ui.creation.CreateChannelFragment$invalidate$1.invoke(java.lang.Object):java.lang.Object");
    }
}
