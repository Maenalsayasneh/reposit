package i0.e.c.h.p;

import android.view.View;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.databinding.InboxItemBinding;
import i0.e.b.a3.f.d;
import m0.n.b.i;

/* compiled from: InboxItem.kt */
public abstract class a extends BaseEpoxyModelWithHolder<C0217a> {
    public i0.e.c.f.b.a.a j;
    public View.OnClickListener k;
    public View.OnLongClickListener l;

    /* renamed from: i0.e.c.h.p.a$a  reason: collision with other inner class name */
    /* compiled from: InboxItem.kt */
    public static final class C0217a extends d {
        public InboxItemBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            InboxItemBinding bind = InboxItemBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final InboxItemBinding b() {
            InboxItemBinding inboxItemBinding = this.b;
            if (inboxItemBinding != null) {
                return inboxItemBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x00bd  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00da  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00dc  */
    /* renamed from: K */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void k(i0.e.c.h.p.a.C0217a r8) {
        /*
            r7 = this;
            java.lang.String r0 = "holder"
            m0.n.b.i.e(r8, r0)
            com.clubhouse.backchannel.databinding.InboxItemBinding r0 = r8.b()
            com.clubhouse.backchannel.ui.ChatFacePile r0 = r0.c
            i0.e.c.f.b.a.a r1 = r7.j
            r2 = 0
            if (r1 != 0) goto L_0x0012
            r1 = r2
            goto L_0x0014
        L_0x0012:
            java.util.List<com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember> r1 = r1.n
        L_0x0014:
            r0.setAvatars(r1)
            com.clubhouse.backchannel.databinding.InboxItemBinding r0 = r8.b()
            android.widget.TextView r0 = r0.b
            i0.e.c.f.b.a.a r1 = r7.j
            if (r1 != 0) goto L_0x0023
            r1 = r2
            goto L_0x0025
        L_0x0023:
            java.lang.String r1 = r1.u
        L_0x0025:
            r0.setText(r1)
            i0.e.c.f.b.a.a r0 = r7.j
            r1 = 1
            if (r0 != 0) goto L_0x002f
            goto L_0x00a6
        L_0x002f:
            com.clubhouse.backchannel.databinding.InboxItemBinding r3 = r8.b()
            androidx.constraintlayout.widget.ConstraintLayout r3 = r3.a
            android.content.res.Resources r3 = r3.getResources()
            java.lang.String r4 = "holder.binding.root.resources"
            m0.n.b.i.d(r3, r4)
            java.lang.String r4 = "<this>"
            m0.n.b.i.e(r0, r4)
            java.lang.String r4 = "res"
            m0.n.b.i.e(r3, r4)
            i0.e.c.f.b.a.c r4 = r0.d
            boolean r5 = r4 instanceof i0.e.c.f.b.a.c.a
            if (r5 == 0) goto L_0x007e
            java.lang.String r5 = "null cannot be cast to non-null type com.clubhouse.backchannel.data.models.local.BackchannelMessage.Chat"
            java.util.Objects.requireNonNull(r4, r5)
            i0.e.c.f.b.a.c$a r4 = (i0.e.c.f.b.a.c.a) r4
            boolean r5 = r4.e
            if (r5 == 0) goto L_0x0067
            int r0 = com.clubhouse.backchannel.R.string.subtitle_last_message_self
            java.lang.Object[] r5 = new java.lang.Object[r1]
            r6 = 0
            java.lang.String r4 = r4.i
            r5[r6] = r4
            java.lang.String r0 = r3.getString(r0, r5)
            goto L_0x00a7
        L_0x0067:
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination r3 = r0.t
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination r5 = com.clubhouse.pubsub.user.backchannel.models.remote.ChatDestination.CHATS
            if (r3 != r5) goto L_0x00a6
            java.util.List<java.lang.Integer> r0 = r0.p
            com.clubhouse.pubsub.user.backchannel.models.remote.ChatMember r3 = r4.f
            java.lang.Integer r3 = r3.getId()
            boolean r0 = r0.contains(r3)
            if (r0 != 0) goto L_0x00a6
            java.lang.String r0 = r4.i
            goto L_0x00a7
        L_0x007e:
            boolean r0 = r4 instanceof i0.e.c.f.b.a.c.b
            if (r0 == 0) goto L_0x0092
            java.lang.String r0 = "null cannot be cast to non-null type com.clubhouse.backchannel.data.models.local.BackchannelMessage.MemberAdded"
            java.util.Objects.requireNonNull(r4, r0)
            i0.e.c.f.b.a.c$b r4 = (i0.e.c.f.b.a.c.b) r4
            java.lang.CharSequence r0 = h0.b0.v.W(r4, r3)
            java.lang.String r0 = r0.toString()
            goto L_0x00a7
        L_0x0092:
            boolean r0 = r4 instanceof i0.e.c.f.b.a.c.C0216c
            if (r0 == 0) goto L_0x00a6
            java.lang.String r0 = "null cannot be cast to non-null type com.clubhouse.backchannel.data.models.local.BackchannelMessage.MemberRemoved"
            java.util.Objects.requireNonNull(r4, r0)
            i0.e.c.f.b.a.c$c r4 = (i0.e.c.f.b.a.c.C0216c) r4
            java.lang.CharSequence r0 = h0.b0.v.X(r4, r3)
            java.lang.String r0 = r0.toString()
            goto L_0x00a7
        L_0x00a6:
            r0 = r2
        L_0x00a7:
            com.clubhouse.backchannel.databinding.InboxItemBinding r3 = r8.b()
            android.widget.TextView r3 = r3.d
            r3.setText(r0)
            com.clubhouse.backchannel.databinding.InboxItemBinding r3 = r8.b()
            android.widget.TextView r3 = r3.d
            java.lang.String r4 = "holder.binding.subtitle"
            m0.n.b.i.d(r3, r4)
            if (r0 != 0) goto L_0x00bf
            r0 = r2
            goto L_0x00c8
        L_0x00bf:
            boolean r0 = kotlin.text.StringsKt__IndentKt.o(r0)
            r0 = r0 ^ r1
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x00c8:
            i0.e.b.d3.k.L(r3, r0)
            com.clubhouse.backchannel.databinding.InboxItemBinding r0 = r8.b()
            android.widget.ImageView r0 = r0.f
            java.lang.String r1 = "holder.binding.unreadBadge"
            m0.n.b.i.d(r0, r1)
            i0.e.c.f.b.a.a r1 = r7.j
            if (r1 != 0) goto L_0x00dc
            r1 = r2
            goto L_0x00e2
        L_0x00dc:
            boolean r1 = r1.q
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
        L_0x00e2:
            i0.e.b.d3.k.L(r0, r1)
            com.clubhouse.backchannel.databinding.InboxItemBinding r0 = r8.b()
            android.widget.TextView r0 = r0.e
            i0.e.c.f.b.a.a r1 = r7.j
            if (r1 != 0) goto L_0x00f0
            goto L_0x00f9
        L_0x00f0:
            j$.time.OffsetDateTime r1 = r1.c
            if (r1 != 0) goto L_0x00f5
            goto L_0x00f9
        L_0x00f5:
            java.lang.String r2 = h0.b0.v.L1(r1)
        L_0x00f9:
            r0.setText(r2)
            com.clubhouse.backchannel.databinding.InboxItemBinding r0 = r8.b()
            androidx.constraintlayout.widget.ConstraintLayout r0 = r0.a
            android.view.View$OnClickListener r1 = r7.k
            r0.setOnClickListener(r1)
            com.clubhouse.backchannel.databinding.InboxItemBinding r8 = r8.b()
            androidx.constraintlayout.widget.ConstraintLayout r8 = r8.a
            android.view.View$OnLongClickListener r0 = r7.l
            r8.setOnLongClickListener(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.e.c.h.p.a.k(i0.e.c.h.p.a$a):void");
    }

    public int o() {
        return R.layout.inbox_item;
    }
}
