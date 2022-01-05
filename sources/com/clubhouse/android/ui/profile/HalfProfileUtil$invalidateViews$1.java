package com.clubhouse.android.ui.profile;

import android.content.Context;
import android.text.Layout;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.ui.RSVPButton;
import com.clubhouse.android.data.models.local.EventInProfile;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.data.models.local.club.ClubWithAdmin;
import com.clubhouse.android.data.models.local.notification.FollowNotificationType;
import com.clubhouse.android.data.models.local.user.UserInList;
import com.clubhouse.android.data.models.local.user.UserInStatus;
import com.clubhouse.android.data.models.local.user.UserProfile;
import com.clubhouse.android.databinding.FragmentHalfProfileBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.user.model.User;
import com.clubhouse.app.R;
import com.google.android.material.button.MaterialButton;
import h0.b0.v;
import i0.b.b.f;
import i0.e.b.d3.k;
import i0.e.b.f3.d;
import i0.e.b.g3.u.q4;
import i0.e.b.g3.u.r4;
import j$.time.OffsetDateTime;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;

/* compiled from: HalfProfileUtil.kt */
public final class HalfProfileUtil$invalidateViews$1 extends Lambda implements l<q4, i> {
    public final /* synthetic */ HalfProfileFragment c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HalfProfileUtil$invalidateViews$1(HalfProfileFragment halfProfileFragment) {
        super(1);
        this.c = halfProfileFragment;
    }

    public Object invoke(Object obj) {
        String str;
        String str2;
        q4 q4Var = (q4) obj;
        m0.n.b.i.e(q4Var, "state");
        r4 r4Var = r4.a;
        FragmentHalfProfileBinding T0 = this.c.T0();
        UserProfile userProfile = q4Var.k;
        FollowNotificationType followNotificationType = q4Var.n;
        boolean z = q4Var.o;
        boolean z2 = q4Var.p;
        boolean z3 = q4Var.q;
        List<UserInList> list = q4Var.l;
        User user = q4Var.a;
        ProgressBar progressBar = T0.v;
        m0.n.b.i.d(progressBar, "loading");
        boolean z4 = true;
        k.L(progressBar, Boolean.valueOf((q4Var.i instanceof f) || (q4Var.j instanceof f)));
        Button button = T0.u;
        m0.n.b.i.d(button, "joinChannel");
        k.L(button, Boolean.valueOf(q4Var.y || q4Var.x));
        Button button2 = T0.u;
        if (q4Var.x) {
            str = T0.a.getContext().getString(R.string.join_room_speaking);
        } else {
            str = T0.a.getContext().getString(R.string.join_room_listening);
        }
        button2.setText(str);
        if (list != null) {
            if (!list.isEmpty()) {
                EpoxyRecyclerView epoxyRecyclerView = T0.n;
                m0.n.b.i.d(epoxyRecyclerView, "followSuggestionsList");
                k.K(epoxyRecyclerView);
                T0.n.g();
                TextView textView = T0.m;
                m0.n.b.i.d(textView, "followSuggestionsEmpty");
                k.p(textView);
            } else {
                EpoxyRecyclerView epoxyRecyclerView2 = T0.n;
                m0.n.b.i.d(epoxyRecyclerView2, "followSuggestionsList");
                k.r(epoxyRecyclerView2);
                TextView textView2 = T0.m;
                m0.n.b.i.d(textView2, "followSuggestionsEmpty");
                k.K(textView2);
            }
        }
        int i = 8;
        if (q4Var.m) {
            T0.l.setVisibility(0);
            T0.f.setVisibility(8);
            T0.d.setVisibility(8);
            T0.k.setActivated(true);
        } else {
            T0.l.setVisibility(8);
            T0.f.setVisibility(0);
            T0.d.setVisibility(0);
            T0.k.setActivated(false);
        }
        int ordinal = followNotificationType.ordinal();
        if (ordinal == 0) {
            T0.B.setActivated(false);
            T0.B.setSelected(true);
        } else if (ordinal == 1) {
            T0.B.setActivated(false);
            T0.B.setSelected(false);
        } else if (ordinal == 2) {
            T0.B.setActivated(true);
            T0.B.setSelected(false);
        }
        ImageView imageView = T0.B;
        m0.n.b.i.d(imageView, "notifyOptions");
        imageView.setVisibility(z2 ? 0 : 8);
        LinearLayout linearLayout = T0.L;
        m0.n.b.i.d(linearLayout, "socialOptions");
        boolean z5 = !z;
        linearLayout.setVisibility(z5 ? 0 : 8);
        ImageView imageView2 = T0.x;
        m0.n.b.i.d(imageView2, "menu");
        imageView2.setVisibility(z5 ? 0 : 8);
        ImageView imageView3 = T0.K;
        m0.n.b.i.d(imageView3, "share");
        imageView3.setVisibility(z ? 0 : 8);
        ImageView imageView4 = T0.B;
        m0.n.b.i.d(imageView4, "notifyOptions");
        imageView4.setVisibility(z2 ? 0 : 8);
        T0.i.setChecked(z2);
        T0.i.setBlocked(z3);
        AvatarView avatarView = T0.c;
        m0.n.b.i.d(avatarView, "avatar");
        k.u(avatarView, user);
        T0.A.setText(user.getName());
        T0.N.setText(T0.a.getContext().getString(R.string.username, new Object[]{user.C()}));
        ConstraintLayout constraintLayout = T0.M.a;
        m0.n.b.i.d(constraintLayout, "upcomingEventContainer.root");
        k.q(constraintLayout, Boolean.valueOf(q4Var.t == null));
        EventInProfile eventInProfile = q4Var.t;
        if (eventInProfile != null) {
            TextView textView3 = T0.M.c;
            m0.n.b.i.d(textView3, "upcomingEventContainer.eventClub");
            k.q(textView3, Boolean.valueOf(eventInProfile.c == null));
            ClubWithAdmin clubWithAdmin = eventInProfile.c;
            if (clubWithAdmin != null) {
                T0.M.c.setText(clubWithAdmin.y);
            }
            String str3 = eventInProfile.y;
            if (str3 != null) {
                T0.M.g.setText(str3);
            }
            OffsetDateTime offsetDateTime = eventInProfile.Z1;
            if (offsetDateTime != null) {
                TextView textView4 = T0.M.d;
                Context context = T0.a.getContext();
                m0.n.b.i.d(context, "root.context");
                textView4.setText(v.J1(offsetDateTime, context));
                T0.M.f.setText(v.L1(offsetDateTime));
            }
            RSVPButton rSVPButton = T0.M.b;
            m0.n.b.i.d(rSVPButton, "upcomingEventContainer.bellIcon");
            k.q(rSVPButton, Boolean.valueOf(z || eventInProfile.h(q4Var.s) || eventInProfile.d2));
            T0.M.b.setChecked(eventInProfile.g().booleanValue());
        }
        if (userProfile != null) {
            if (q4Var.v) {
                boolean z6 = q4Var.A;
                boolean z7 = !z && !z3 && m0.n.b.i.a(userProfile.s2, Boolean.TRUE);
                ImageView imageView5 = T0.I;
                m0.n.b.i.d(imageView5, "sendMessageButton");
                k.p(imageView5);
                Button button3 = T0.H;
                m0.n.b.i.d(button3, "sendMessage");
                k.L(button3, Boolean.valueOf(z7));
                Button button4 = T0.J;
                m0.n.b.i.d(button4, "sendWave");
                k.L(button4, Boolean.valueOf(z6));
                if (q4Var.r) {
                    T0.J.setText(T0.a.getContext().getResources().getString(R.string.cancel_wave));
                    ((MaterialButton) T0.J).setIconResource(R.drawable.ic_joined_check);
                } else {
                    T0.J.setText(T0.a.getContext().getResources().getString(R.string.send_wave));
                    ((MaterialButton) T0.J).setIconResource(R.drawable.ic_hand_wave_emoji);
                }
            } else {
                ImageView imageView6 = T0.I;
                m0.n.b.i.d(imageView6, "sendMessageButton");
                k.L(imageView6, Boolean.valueOf(!z && !z3 && m0.n.b.i.a(userProfile.s2, Boolean.TRUE)));
                Button button5 = T0.H;
                m0.n.b.i.d(button5, "sendMessage");
                k.p(button5);
                Button button6 = T0.J;
                m0.n.b.i.d(button6, "sendWave");
                k.p(button6);
            }
            ImageView imageView7 = T0.e;
            m0.n.b.i.d(imageView7, "blockedByNetwork");
            imageView7.setVisibility(userProfile.b2 ? 0 : 8);
            TextView textView5 = T0.p;
            m0.n.b.i.d(textView5, "followsYou");
            textView5.setVisibility(userProfile.a2 ? 0 : 8);
            Button button7 = T0.r;
            m0.n.b.i.d(button7, "inviteToPrivateChannel");
            if (q4Var.v || !userProfile.a2 || (!(user instanceof UserInChannel) && !(user instanceof UserInStatus))) {
                z4 = false;
            }
            if (z4) {
                i = 0;
            }
            button7.setVisibility(i);
            LinearLayout linearLayout2 = T0.j;
            m0.n.b.i.d(linearLayout2, "followCountContainer");
            linearLayout2.setVisibility(0);
            T0.C.setText(d.a(userProfile.y));
            T0.E.setText(d.a(userProfile.Y1));
            T0.o.setText(T0.a.getContext().getResources().getQuantityString(R.plurals.followers_label, userProfile.y));
            T0.d.setText(userProfile.d);
            TextView textView6 = T0.d;
            m0.n.b.i.d(textView6, "bio");
            m0.n.b.i.e(textView6, "<this>");
            Layout layout = textView6.getLayout();
            if (layout == null) {
                str2 = null;
            } else {
                int lineStart = layout.getLineStart(0);
                int lineEnd = layout.getLineEnd(textView6.getLineCount() - 1);
                String obj2 = textView6.getText().toString();
                Objects.requireNonNull(obj2, "null cannot be cast to non-null type java.lang.String");
                str2 = obj2.substring(lineStart, lineEnd);
                m0.n.b.i.d(str2, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            }
            textView6.setContentDescription(str2);
        }
        r4Var.b(this.c.S0(), q4Var);
        return i.a;
    }
}
