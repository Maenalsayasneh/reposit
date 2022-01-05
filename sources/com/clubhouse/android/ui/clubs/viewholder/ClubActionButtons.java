package com.clubhouse.android.ui.clubs.viewholder;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.clubhouse.android.core.ui.BaseEpoxyModelWithHolder;
import com.clubhouse.android.data.models.local.user.BasicUser;
import com.clubhouse.android.databinding.ClubActionButtonsBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.b0.v;
import i0.e.b.a3.f.d;
import i0.e.b.d3.k;
import i0.e.b.g3.l.c3.e;
import m0.n.b.i;

/* compiled from: ClubActionButtons.kt */
public abstract class ClubActionButtons extends BaseEpoxyModelWithHolder<a> {
    public ClubStatus j;
    public BasicUser k;
    public boolean l;
    public boolean m;
    public boolean n;
    public Integer o;
    public boolean p;
    public View.OnClickListener q;
    public View.OnClickListener r;
    public View.OnClickListener s;
    public View.OnClickListener t;
    public View.OnClickListener u;
    public View.OnClickListener v;
    public View.OnClickListener w;
    public View.OnClickListener x;

    /* compiled from: ClubActionButtons.kt */
    public enum ClubStatus {
        ADMIN,
        LEADER,
        MEMBER,
        STRANGER
    }

    /* compiled from: ClubActionButtons.kt */
    public static final class a extends d {
        public ClubActionButtonsBinding b;

        public void a(View view) {
            i.e(view, "itemView");
            ClubActionButtonsBinding bind = ClubActionButtonsBinding.bind(view);
            i.d(bind, "bind(itemView)");
            i.e(bind, "<set-?>");
            this.b = bind;
        }

        public final ClubActionButtonsBinding b() {
            ClubActionButtonsBinding clubActionButtonsBinding = this.b;
            if (clubActionButtonsBinding != null) {
                return clubActionButtonsBinding;
            }
            i.m("binding");
            throw null;
        }
    }

    /* compiled from: ClubActionButtons.kt */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        static {
            ClubStatus.values();
            int[] iArr = new int[4];
            iArr[ClubStatus.ADMIN.ordinal()] = 1;
            iArr[ClubStatus.LEADER.ordinal()] = 2;
            iArr[ClubStatus.MEMBER.ordinal()] = 3;
            iArr[ClubStatus.STRANGER.ordinal()] = 4;
            a = iArr;
        }
    }

    /* renamed from: K */
    public void k(a aVar) {
        i.e(aVar, "holder");
        LinearLayout linearLayout = aVar.b().e;
        i.d(linearLayout, "binding.inviterAttribution");
        k.p(linearLayout);
        Button button = aVar.b().l;
        i.d(button, "binding.scheduleRoomButton");
        k.p(button);
        Button button2 = aVar.b().h;
        i.d(button2, "binding.joinButton");
        k.p(button2);
        Button button3 = aVar.b().b;
        i.d(button3, "binding.addMembers");
        k.p(button3);
        Button button4 = aVar.b().j;
        i.d(button4, "binding.member");
        k.p(button4);
        Button button5 = aVar.b().k;
        i.d(button5, "binding.nominateMembers");
        k.p(button5);
        Button button6 = aVar.b().d;
        i.d(button6, "binding.inviteMembers");
        k.p(button6);
        Button button7 = aVar.b().c;
        i.d(button7, "binding.applyToJoin");
        k.p(button7);
        Button button8 = aVar.b().i;
        i.d(button8, "binding.joinTheClub");
        k.p(button8);
        ClubStatus clubStatus = this.j;
        int i = clubStatus == null ? -1 : b.a[clubStatus.ordinal()];
        if (i == 1) {
            Button button9 = aVar.b().l;
            i.d(button9, "binding.scheduleRoomButton");
            k.K(button9);
            Button button10 = aVar.b().l;
            i.d(button10, "binding.scheduleRoomButton");
            k.H(button10, aVar.a, this.q);
            Button button11 = aVar.b().b;
            i.d(button11, "binding.addMembers");
            k.K(button11);
            Button button12 = aVar.b().b;
            i.d(button12, "binding.addMembers");
            button12.getViewTreeObserver().addOnGlobalLayoutListener(new e(button12, this));
            Button button13 = aVar.b().b;
            i.d(button13, "binding.addMembers");
            k.H(button13, aVar.a, this.v);
        } else if (i == 2) {
            Button button14 = aVar.b().l;
            i.d(button14, "binding.scheduleRoomButton");
            k.K(button14);
            Button button15 = aVar.b().l;
            i.d(button15, "binding.scheduleRoomButton");
            k.H(button15, aVar.a, this.q);
            M(aVar);
        } else if (i == 3) {
            Button button16 = aVar.b().j;
            i.d(button16, "binding.member");
            k.K(button16);
            Button button17 = aVar.b().j;
            i.d(button17, "binding.member");
            k.H(button17, aVar.a, this.u);
            M(aVar);
        } else if (i != 4) {
            L(aVar);
        } else if (this.l) {
            L(aVar);
        } else {
            boolean z = this.n;
            if (z) {
                Button button18 = aVar.b().i;
                i.d(button18, "binding.joinTheClub");
                k.K(button18);
                Button button19 = aVar.b().i;
                i.d(button19, "binding.joinTheClub");
                k.H(button19, aVar.a, this.s);
            } else if (this.m && !z) {
                Button button20 = aVar.b().c;
                i.d(button20, "binding.applyToJoin");
                k.K(button20);
                Button button21 = aVar.b().c;
                i.d(button21, "binding.applyToJoin");
                k.H(button21, aVar.a, this.r);
                if (this.p) {
                    aVar.b().c.setText(aVar.b().a.getResources().getString(R.string.applied_to_join));
                } else {
                    aVar.b().c.setText(aVar.b().a.getResources().getString(R.string.apply_to_join));
                }
            }
        }
    }

    public final void L(a aVar) {
        BasicUser basicUser = this.k;
        if (basicUser != null) {
            LinearLayout linearLayout = aVar.b().e;
            i.d(linearLayout, "binding.inviterAttribution");
            k.K(linearLayout);
            AvatarView avatarView = aVar.b().f;
            i.d(avatarView, "binding.inviterAvatar");
            v.S0(avatarView, basicUser.x, basicUser.d, 0.0f, 4);
            aVar.b().g.setText(aVar.b().a.getResources().getString(R.string.inviter_name_with_message, new Object[]{basicUser.d}));
            String str = basicUser.d;
            if (str != null) {
                TextView textView = aVar.b().g;
                i.d(textView, "binding.inviterNameWithMessage");
                k.y(textView, str);
            }
        }
        Button button = aVar.b().h;
        i.d(button, "binding.joinButton");
        k.K(button);
        aVar.b().h.setOnClickListener(this.t);
    }

    public final void M(a aVar) {
        if (!this.n) {
            Button button = aVar.b().k;
            i.d(button, "binding.nominateMembers");
            k.K(button);
            Button button2 = aVar.b().k;
            i.d(button2, "binding.nominateMembers");
            k.H(button2, aVar.a, this.w);
            return;
        }
        Button button3 = aVar.b().d;
        i.d(button3, "binding.inviteMembers");
        k.K(button3);
        Button button4 = aVar.b().d;
        i.d(button4, "binding.inviteMembers");
        k.H(button4, aVar.a, this.x);
    }
}
