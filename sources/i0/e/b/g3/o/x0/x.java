package i0.e.b.g3.o.x0;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.EventInClub;
import com.clubhouse.android.databinding.EventInfoBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: EventInfo.kt */
public abstract class x extends BaseEpoxyModelWithHolder<a> {
    public EventInClub j;
    public boolean k;
    public boolean l;
    public String m;
    public boolean n;
    public boolean o = true;
    public View.OnClickListener p;
    public View.OnClickListener q;
    public View.OnClickListener r;
    public View.OnClickListener s;
    public View.OnClickListener t;

    /* compiled from: EventInfo.kt */
    public static final class a extends d {
        public EventInfoBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            EventInfoBinding bind = EventInfoBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final EventInfoBinding b() {
            EventInfoBinding eventInfoBinding = this.b;
            if (eventInfoBinding != null) {
                return eventInfoBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0108  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0142  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(i0.e.b.g3.o.x0.x.a r7) {
        /*
            r6 = this;
            java.lang.String r0 = "holder"
            m0.n.b.i.e(r7, r0)
            com.clubhouse.android.data.models.local.EventInClub r0 = r6.j
            if (r0 != 0) goto L_0x000a
            goto L_0x0034
        L_0x000a:
            j$.time.OffsetDateTime r0 = r0.c2
            if (r0 != 0) goto L_0x000f
            goto L_0x0034
        L_0x000f:
            com.clubhouse.android.databinding.EventInfoBinding r1 = r7.b()
            android.widget.TextView r1 = r1.g
            boolean r2 = r6.l
            if (r2 == 0) goto L_0x002d
            com.clubhouse.android.databinding.EventInfoBinding r2 = r7.b()
            android.widget.TextView r2 = r2.g
            android.content.Context r2 = r2.getContext()
            java.lang.String r3 = "holder.binding.time.context"
            m0.n.b.i.d(r2, r3)
            java.lang.String r0 = h0.b0.v.K1(r0, r2)
            goto L_0x0031
        L_0x002d:
            java.lang.String r0 = h0.b0.v.L1(r0)
        L_0x0031:
            r1.setText(r0)
        L_0x0034:
            com.clubhouse.android.databinding.EventInfoBinding r0 = r7.b()
            android.widget.TextView r0 = r0.h
            com.clubhouse.android.data.models.local.EventInClub r1 = r6.j
            r2 = 0
            if (r1 != 0) goto L_0x0041
            r1 = r2
            goto L_0x0043
        L_0x0041:
            java.lang.String r1 = r1.a2
        L_0x0043:
            r0.setText(r1)
            com.clubhouse.android.databinding.EventInfoBinding r0 = r7.b()
            android.widget.TextView r0 = r0.e
            java.lang.String r1 = r6.m
            if (r1 != 0) goto L_0x0051
            goto L_0x0059
        L_0x0051:
            java.lang.CharSequence r1 = kotlin.text.StringsKt__IndentKt.X(r1)
            java.lang.String r2 = r1.toString()
        L_0x0059:
            r0.setText(r2)
            com.clubhouse.android.databinding.EventInfoBinding r0 = r7.b()
            android.widget.TextView r0 = r0.f
            java.lang.String r1 = "holder.binding.subtitleFrom"
            m0.n.b.i.d(r0, r1)
            java.lang.String r1 = r6.m
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0076
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0074
            goto L_0x0076
        L_0x0074:
            r1 = r2
            goto L_0x0077
        L_0x0076:
            r1 = r3
        L_0x0077:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            i0.e.b.d3.k.q(r0, r1)
            com.clubhouse.android.databinding.EventInfoBinding r0 = r7.b()
            android.widget.TextView r0 = r0.e
            java.lang.String r1 = "holder.binding.subtitleClub"
            m0.n.b.i.d(r0, r1)
            java.lang.String r1 = r6.m
            if (r1 == 0) goto L_0x0096
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0094
            goto L_0x0096
        L_0x0094:
            r1 = r2
            goto L_0x0097
        L_0x0096:
            r1 = r3
        L_0x0097:
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            i0.e.b.d3.k.q(r0, r1)
            com.clubhouse.android.databinding.EventInfoBinding r0 = r7.b()
            android.widget.TextView r0 = r0.c
            java.lang.String r1 = "holder.binding.edit"
            m0.n.b.i.d(r0, r1)
            boolean r1 = r6.n
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            i0.e.b.d3.k.L(r0, r1)
            com.clubhouse.android.databinding.EventInfoBinding r0 = r7.b()
            android.widget.TextView r0 = r0.c
            android.view.View$OnClickListener r1 = r6.r
            r0.setOnClickListener(r1)
            com.clubhouse.android.databinding.EventInfoBinding r0 = r7.b()
            android.widget.TextView r0 = r0.e
            android.view.View$OnClickListener r1 = r6.s
            r0.setOnClickListener(r1)
            com.clubhouse.android.databinding.EventInfoBinding r0 = r7.b()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.a
            android.view.View$OnClickListener r1 = r6.t
            r0.setOnClickListener(r1)
            com.clubhouse.android.databinding.EventInfoBinding r0 = r7.b()
            com.clubhouse.android.core.ui.RSVPButton r0 = r0.b
            java.lang.String r1 = "holder.binding.bellIcon"
            m0.n.b.i.d(r0, r1)
            boolean r4 = r6.n
            if (r4 != 0) goto L_0x00f2
            boolean r4 = r6.o
            if (r4 == 0) goto L_0x00f2
            com.clubhouse.android.data.models.local.EventInClub r4 = r6.j
            if (r4 != 0) goto L_0x00ec
            r4 = r2
            goto L_0x00ee
        L_0x00ec:
            boolean r4 = r4.g2
        L_0x00ee:
            if (r4 != 0) goto L_0x00f2
            r4 = r3
            goto L_0x00f3
        L_0x00f2:
            r4 = r2
        L_0x00f3:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            i0.e.b.d3.k.L(r0, r4)
            com.clubhouse.android.databinding.EventInfoBinding r0 = r7.b()
            com.clubhouse.android.core.ui.RSVPButton r0 = r0.b
            boolean r4 = r6.n
            if (r4 != 0) goto L_0x010a
            boolean r4 = r6.k
            if (r4 == 0) goto L_0x010a
            r4 = r3
            goto L_0x010b
        L_0x010a:
            r4 = r2
        L_0x010b:
            r0.setChecked(r4)
            com.clubhouse.android.databinding.EventInfoBinding r0 = r7.b()
            com.clubhouse.android.core.ui.RSVPButton r0 = r0.b
            m0.n.b.i.d(r0, r1)
            n0.a.f0 r1 = r7.a
            i0.e.b.g3.o.x0.b r4 = new i0.e.b.g3.o.x0.b
            r4.<init>(r6)
            i0.e.b.d3.k.H(r0, r1, r4)
            com.clubhouse.android.databinding.EventInfoBinding r0 = r7.b()
            android.widget.ImageView r0 = r0.d
            java.lang.String r1 = "holder.binding.menu"
            m0.n.b.i.d(r0, r1)
            android.view.View$OnClickListener r4 = r6.q
            if (r4 == 0) goto L_0x0154
            boolean r4 = r6.n
            if (r4 != 0) goto L_0x0154
            com.clubhouse.android.data.models.local.EventInClub r4 = r6.j
            if (r4 != 0) goto L_0x0139
            goto L_0x013f
        L_0x0139:
            boolean r5 = r4.g2
            if (r5 != 0) goto L_0x013f
            r5 = r3
            goto L_0x0140
        L_0x013f:
            r5 = r2
        L_0x0140:
            if (r5 == 0) goto L_0x0154
            if (r4 != 0) goto L_0x0145
            goto L_0x0150
        L_0x0145:
            com.clubhouse.android.data.models.local.club.ClubWithAdmin r4 = r4.c
            if (r4 != 0) goto L_0x014a
            goto L_0x0150
        L_0x014a:
            boolean r4 = r4.c
            if (r4 != r3) goto L_0x0150
            r4 = r3
            goto L_0x0151
        L_0x0150:
            r4 = r2
        L_0x0151:
            if (r4 == 0) goto L_0x0154
            r2 = r3
        L_0x0154:
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r2)
            i0.e.b.d3.k.L(r0, r2)
            com.clubhouse.android.databinding.EventInfoBinding r0 = r7.b()
            android.widget.ImageView r0 = r0.d
            m0.n.b.i.d(r0, r1)
            n0.a.f0 r7 = r7.a
            i0.e.b.g3.o.x0.a r1 = new i0.e.b.g3.o.x0.a
            r1.<init>(r6)
            i0.e.b.d3.k.H(r0, r7, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.b.g3.o.x0.x.k(i0.e.b.g3.o.x0.x$a):void");
    }
}
