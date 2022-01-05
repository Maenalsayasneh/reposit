package com.clubhouse.android.ui.channels;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.clubhouse.android.data.models.local.channel.AllUserMessage;
import com.clubhouse.android.data.models.local.channel.UserInChannel;
import com.clubhouse.android.ui.channels.clip.CreateClipComingSoonDialogFragment;
import com.clubhouse.android.ui.channels.views.RaiseHandFragmentKt$showRaiseHandEducation$1;
import com.clubhouse.app.R;
import h0.b.a.d;
import h0.b0.v;
import h0.i.i.d0;
import i0.e.b.a3.b.d;
import i0.e.b.a3.b.e;
import i0.e.b.a3.f.j;
import i0.e.b.g3.k.r;
import i0.e.b.z2.g.a1;
import i0.e.b.z2.g.b1;
import i0.e.b.z2.g.c1;
import i0.e.b.z2.g.d1;
import i0.e.b.z2.g.e1;
import i0.e.b.z2.g.f1;
import i0.e.b.z2.g.h1;
import i0.e.b.z2.g.k1;
import i0.e.b.z2.g.l1;
import i0.e.b.z2.g.m1;
import i0.e.b.z2.g.q;
import i0.e.b.z2.g.s;
import i0.e.b.z2.g.s0;
import i0.e.b.z2.g.u0;
import i0.e.b.z2.g.v0;
import i0.e.b.z2.g.w0;
import i0.e.b.z2.g.x0;
import i0.e.b.z2.g.y;
import i0.e.b.z2.g.y0;
import i0.e.b.z2.g.z;
import i0.e.b.z2.g.z0;
import i0.h.a.c.w.g;
import i0.h.a.c.w.k;
import i0.j.f.p.h;
import java.util.Objects;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import m0.i;
import m0.n.a.l;
import m0.n.a.p;
import m0.r.k;

@m0.l.f.a.c(c = "com.clubhouse.android.ui.channels.ChannelFragment$onViewCreated$2", f = "ChannelFragment.kt", l = {}, m = "invokeSuspend")
/* compiled from: ChannelFragment.kt */
public final class ChannelFragment$onViewCreated$2 extends SuspendLambda implements p<i0.e.b.a3.b.b, m0.l.c<? super i>, Object> {
    public /* synthetic */ Object c;
    public final /* synthetic */ ChannelFragment d;

    /* compiled from: kotlin-style lambda group */
    public static final class a extends Lambda implements l<j, i> {
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;
        public final /* synthetic */ Object q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public a(int i, Object obj, Object obj2) {
            super(1);
            this.c = i;
            this.d = obj;
            this.q = obj2;
        }

        public final Object invoke(Object obj) {
            int i = this.c;
            if (i == 0) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showNegativeBanner");
                String str = ((d) ((i0.e.b.a3.b.b) this.d)).a;
                if (str == null) {
                    str = ((ChannelFragment) this.q).getString(R.string.common_error_try_again);
                    m0.n.b.i.d(str, "getString(R.string.common_error_try_again)");
                }
                jVar.c.b.setText(str);
                return i.a;
            } else if (i == 1) {
                j jVar2 = (j) obj;
                m0.n.b.i.e(jVar2, "$this$showBanner");
                jVar2.e(((ChannelFragment) this.d).getString(R.string.raise_hand_success, ((e1) ((i0.e.b.a3.b.b) this.q)).a));
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* compiled from: kotlin-style lambda group */
    public static final class b extends Lambda implements l<j, i> {
        public static final b c = new b(0);
        public static final b d = new b(1);
        public final /* synthetic */ int q;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public b(int i) {
            super(1);
            this.q = i;
        }

        public final Object invoke(Object obj) {
            int i = this.q;
            if (i == 0) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showBanner");
                jVar.d(R.string.make_moderator_success);
                return i.a;
            } else if (i == 1) {
                j jVar2 = (j) obj;
                m0.n.b.i.e(jVar2, "$this$showBanner");
                jVar2.d(R.string.invite_to_speak_success);
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* compiled from: kotlin-style lambda group */
    public static final class c extends Lambda implements l<j, i> {
        public final /* synthetic */ int c;
        public final /* synthetic */ Object d;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(int i, Object obj) {
            super(1);
            this.c = i;
            this.d = obj;
        }

        public final Object invoke(Object obj) {
            int i = this.c;
            if (i == 0) {
                j jVar = (j) obj;
                m0.n.b.i.e(jVar, "$this$showBanner");
                jVar.e(((e) ((i0.e.b.a3.b.b) this.d)).a);
                return i.a;
            } else if (i == 1) {
                j jVar2 = (j) obj;
                m0.n.b.i.e(jVar2, "$this$showNegativeBanner");
                jVar2.e(((ChannelFragment) this.d).getString(R.string.raised_hands_turned_off_alert));
                return i.a;
            } else {
                throw null;
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChannelFragment$onViewCreated$2(ChannelFragment channelFragment, m0.l.c<? super ChannelFragment$onViewCreated$2> cVar) {
        super(2, cVar);
        this.d = channelFragment;
    }

    public final m0.l.c<i> create(Object obj, m0.l.c<?> cVar) {
        ChannelFragment$onViewCreated$2 channelFragment$onViewCreated$2 = new ChannelFragment$onViewCreated$2(this.d, cVar);
        channelFragment$onViewCreated$2.c = obj;
        return channelFragment$onViewCreated$2;
    }

    public Object invoke(Object obj, Object obj2) {
        ChannelFragment$onViewCreated$2 channelFragment$onViewCreated$2 = new ChannelFragment$onViewCreated$2(this.d, (m0.l.c) obj2);
        channelFragment$onViewCreated$2.c = (i0.e.b.a3.b.b) obj;
        i iVar = i.a;
        channelFragment$onViewCreated$2.invokeSuspend(iVar);
        return iVar;
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        h.d4(obj);
        i0.e.b.a3.b.b bVar = (i0.e.b.a3.b.b) this.c;
        if (bVar instanceof s) {
            ChannelFragment channelFragment = this.d;
            m0.n.b.i.e(channelFragment, "<this>");
            FragmentManager supportFragmentManager = channelFragment.requireActivity().getSupportFragmentManager();
            m0.n.b.i.d(supportFragmentManager, "requireActivity().supportFragmentManager");
            v.F(channelFragment, supportFragmentManager, new ChannelNavigation$dismiss$1(channelFragment));
        } else if (bVar instanceof y0) {
            ChannelFragment channelFragment2 = this.d;
            k<Object>[] kVarArr = ChannelFragment.Z1;
            Objects.requireNonNull(channelFragment2);
            v.c2(channelFragment2, new ChannelFragment$showSpeakerInvite$1((y0) bVar, channelFragment2));
        } else if (bVar instanceof s0) {
            ChannelFragment channelFragment3 = this.d;
            s0 s0Var = (s0) bVar;
            k<Object>[] kVarArr2 = ChannelFragment.Z1;
            Objects.requireNonNull(channelFragment3);
            int ordinal = s0Var.a.b().ordinal();
            if (ordinal == 1) {
                UserInChannel userInChannel = ((AllUserMessage) s0Var.a).c;
                if (userInChannel != null) {
                    v.c2(channelFragment3, new d0(1, channelFragment3, userInChannel));
                }
            } else if (ordinal == 9) {
                v.c2(channelFragment3, f0.q);
            } else if (ordinal == 5) {
                v.c2(channelFragment3, f0.y);
            } else if (ordinal == 6) {
                v.c2(channelFragment3, f0.d);
            } else if (ordinal == 7) {
                v.c2(channelFragment3, f0.c);
            } else if (ordinal == 21) {
                v.c2(channelFragment3, new d0(0, s0Var, channelFragment3));
            } else if (ordinal != 22) {
                switch (ordinal) {
                    case 14:
                        v.c2(channelFragment3, f0.x);
                        break;
                    case 15:
                        v.c2(channelFragment3, new d0(2, s0Var, channelFragment3));
                        break;
                    case 16:
                        v.c2(channelFragment3, new d0(3, s0Var, channelFragment3));
                        break;
                    case 17:
                        v.c2(channelFragment3, f0.Z1);
                        break;
                    case 18:
                        v.c2(channelFragment3, f0.Y1);
                        break;
                    case 19:
                        v.c2(channelFragment3, new ChannelFragment$showAlert$10(s0Var, channelFragment3));
                        break;
                }
            } else {
                channelFragment3.I0().a();
            }
        } else if (bVar instanceof e) {
            v.c2(this.d, new c(0, bVar));
        } else if (bVar instanceof d) {
            ChannelFragment channelFragment4 = this.d;
            v.f2(channelFragment4, new a(0, bVar, channelFragment4));
        } else if (m0.n.b.i.a(bVar, a1.a)) {
            v.c2(this.d, b.c);
        } else if (m0.n.b.i.a(bVar, z0.a)) {
            v.c2(this.d, b.d);
        } else if (bVar instanceof e1) {
            ChannelFragment channelFragment5 = this.d;
            v.c2(channelFragment5, new a(1, channelFragment5, bVar));
        } else if (bVar instanceof w0) {
            ChannelFragment channelFragment6 = this.d;
            k<Object>[] kVarArr3 = ChannelFragment.Z1;
            Objects.requireNonNull(channelFragment6);
            ChannelFragment$showEndRoomDialog$1 channelFragment$showEndRoomDialog$1 = new ChannelFragment$showEndRoomDialog$1(channelFragment6, (w0) bVar);
            m0.n.b.i.e(channelFragment6, "<this>");
            m0.n.b.i.e(channelFragment$showEndRoomDialog$1, "f");
            d.a aVar = new d.a(channelFragment6.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
            channelFragment$showEndRoomDialog$1.invoke(aVar);
            aVar.g();
        } else if (m0.n.b.i.a(bVar, d1.a)) {
            ChannelFragment channelFragment7 = this.d;
            m0.n.b.i.e(channelFragment7, "<this>");
            v.G(channelFragment7, RaiseHandFragmentKt$showRaiseHandEducation$1.c);
        } else if (m0.n.b.i.a(bVar, u0.a)) {
            ChannelFragment channelFragment8 = this.d;
            m0.n.b.i.e(channelFragment8, "<this>");
            new CreateClipComingSoonDialogFragment().P0(channelFragment8.getChildFragmentManager(), (String) null);
        } else if (m0.n.b.i.a(bVar, x0.a)) {
            ChannelFragment channelFragment9 = this.d;
            v.f2(channelFragment9, new c(1, channelFragment9));
        } else if (bVar instanceof q) {
            ChannelFragment channelFragment10 = this.d;
            UserInChannel userInChannel2 = ((q) bVar).a;
            k<Object>[] kVarArr4 = ChannelFragment.Z1;
            Objects.requireNonNull(channelFragment10);
            ChannelFragment$showConfirmModeratorForSocialRoom$1 channelFragment$showConfirmModeratorForSocialRoom$1 = new ChannelFragment$showConfirmModeratorForSocialRoom$1(channelFragment10, userInChannel2);
            m0.n.b.i.e(channelFragment10, "<this>");
            m0.n.b.i.e(channelFragment$showConfirmModeratorForSocialRoom$1, "f");
            d.a aVar2 = new d.a(channelFragment10.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
            channelFragment$showConfirmModeratorForSocialRoom$1.invoke(aVar2);
            aVar2.g();
        } else if (bVar instanceof i0.e.b.z2.g.p) {
            ChannelFragment channelFragment11 = this.d;
            UserInChannel userInChannel3 = ((i0.e.b.z2.g.p) bVar).a;
            k<Object>[] kVarArr5 = ChannelFragment.Z1;
            Objects.requireNonNull(channelFragment11);
            ChannelFragment$showConfirmModeratorNotFollowing$1 channelFragment$showConfirmModeratorNotFollowing$1 = new ChannelFragment$showConfirmModeratorNotFollowing$1(channelFragment11, userInChannel3);
            m0.n.b.i.e(channelFragment11, "<this>");
            m0.n.b.i.e(channelFragment$showConfirmModeratorNotFollowing$1, "f");
            d.a aVar3 = new d.a(channelFragment11.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
            channelFragment$showConfirmModeratorNotFollowing$1.invoke(aVar3);
            aVar3.g();
        } else if (bVar instanceof l1) {
            ChannelFragment channelFragment12 = this.d;
            UserInChannel userInChannel4 = ((l1) bVar).a;
            k<Object>[] kVarArr6 = ChannelFragment.Z1;
            Objects.requireNonNull(channelFragment12);
            v.c2(channelFragment12, new ChannelFragment$handleWelcomeRoomRejected$1(channelFragment12, userInChannel4));
        } else if (bVar instanceof z) {
            ChannelFragment channelFragment13 = this.d;
            long j = ((z) bVar).a;
            k<Object>[] kVarArr7 = ChannelFragment.Z1;
            Objects.requireNonNull(channelFragment13);
            v.c2(channelFragment13, new ChannelFragment$handleInviteToNewChannelSent$1(channelFragment13, j));
        } else if (bVar instanceof y) {
            this.d.S0().p(new k1(((y) bVar).a));
        } else if (bVar instanceof i0.e.b.z2.f.e) {
            ChannelNavigation.a(this.d, (i0.e.b.z2.f.e) bVar);
        } else if (bVar instanceof m1) {
            ChannelFragment channelFragment14 = this.d;
            UserInChannel userInChannel5 = ((m1) bVar).a;
            String string = channelFragment14.getString(R.string.welcome_room_prompt, userInChannel5.e2);
            m0.n.b.i.d(string, "getString(R.string.welcome_room_prompt, it.user.name)");
            k<Object>[] kVarArr8 = ChannelFragment.Z1;
            v.c2(channelFragment14, new ChannelFragment$showInviteAsSpeakerPrompt$1(string, channelFragment14, userInChannel5));
        } else if (bVar instanceof f1) {
            ChannelFragment channelFragment15 = this.d;
            UserInChannel userInChannel6 = ((f1) bVar).a;
            String string2 = channelFragment15.getString(R.string.raised_hand_alert, userInChannel6.e2);
            m0.n.b.i.d(string2, "getString(R.string.raised_hand_alert, it.user.name)");
            k<Object>[] kVarArr9 = ChannelFragment.Z1;
            v.c2(channelFragment15, new ChannelFragment$showInviteAsSpeakerPrompt$1(string2, channelFragment15, userInChannel6));
        } else if (bVar instanceof h1) {
            ChannelFragment channelFragment16 = this.d;
            int i = ((h1) bVar).a;
            k<Object>[] kVarArr10 = ChannelFragment.Z1;
            ConstraintLayout constraintLayout = channelFragment16.Q0().y.a;
            m0.n.b.i.d(constraintLayout, "binding.waveSocialUpsell.root");
            i0.e.b.d3.k.l(constraintLayout);
            TextView textView = channelFragment16.Q0().y.b;
            if (i < 2) {
                str = channelFragment16.getString(R.string.wave_make_room_social);
            } else {
                str = channelFragment16.getString(R.string.wave_make_room_social_multiple, Integer.valueOf(i));
            }
            textView.setText(str);
            Button button = channelFragment16.Q0().y.c;
            m0.n.b.i.d(button, "binding.waveSocialUpsell.socialRoom");
            h0.q.p viewLifecycleOwner = channelFragment16.getViewLifecycleOwner();
            m0.n.b.i.d(viewLifecycleOwner, "viewLifecycleOwner");
            i0.e.b.d3.k.H(button, h0.q.q.a(viewLifecycleOwner), new r(channelFragment16));
            channelFragment16.Q0().y.e.setOnClickListener(new i0.e.b.g3.k.b(channelFragment16));
        } else if (m0.n.b.i.a(bVar, b1.a)) {
            ChannelFragment channelFragment17 = this.d;
            k<Object>[] kVarArr11 = ChannelFragment.Z1;
            Objects.requireNonNull(channelFragment17);
            ChannelFragment$showOnlyModeratorLeavingConfirmation$1 channelFragment$showOnlyModeratorLeavingConfirmation$1 = new ChannelFragment$showOnlyModeratorLeavingConfirmation$1(channelFragment17);
            m0.n.b.i.e(channelFragment17, "<this>");
            m0.n.b.i.e(channelFragment$showOnlyModeratorLeavingConfirmation$1, "f");
            d.a aVar4 = new d.a(channelFragment17.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
            channelFragment$showOnlyModeratorLeavingConfirmation$1.invoke(aVar4);
            aVar4.g();
        } else if (m0.n.b.i.a(bVar, c1.a)) {
            ChannelFragment channelFragment18 = this.d;
            k<Object>[] kVarArr12 = ChannelFragment.Z1;
            Objects.requireNonNull(channelFragment18);
            ChannelFragment$showOnlySpeakerLeavingConfirmation$1 channelFragment$showOnlySpeakerLeavingConfirmation$1 = new ChannelFragment$showOnlySpeakerLeavingConfirmation$1(channelFragment18);
            m0.n.b.i.e(channelFragment18, "<this>");
            m0.n.b.i.e(channelFragment$showOnlySpeakerLeavingConfirmation$1, "f");
            d.a aVar5 = new d.a(channelFragment18.requireContext(), com.clubhouse.core.ui.R.style.Clubhouse_AlertDialog_Rounded);
            channelFragment$showOnlySpeakerLeavingConfirmation$1.invoke(aVar5);
            aVar5.g();
        } else if (m0.n.b.i.a(bVar, v0.a)) {
            ChannelFragment channelFragment19 = this.d;
            k<Object>[] kVarArr13 = ChannelFragment.Z1;
            View inflate = LayoutInflater.from(channelFragment19.requireContext()).inflate(R.layout.tooltip_create_clip_nux, (ViewGroup) null, false);
            m0.n.b.i.d(inflate, "view");
            ImageView imageView = channelFragment19.Q0().n;
            m0.n.b.i.d(imageView, "binding.iconClip");
            m0.n.b.i.e(inflate, "contentView");
            m0.n.b.i.e(imageView, "anchorView");
            View rootView = imageView.getRootView();
            m0.n.b.i.e(imageView, "<this>");
            int[] iArr = {0, 0};
            imageView.getLocationOnScreen(iArr);
            float width = ((((float) imageView.getWidth()) / 2.0f) + ((float) iArr[0])) - (((float) rootView.getWidth()) / 2.0f);
            FrameLayout frameLayout = new FrameLayout(inflate.getContext());
            Context context = frameLayout.getContext();
            m0.n.b.i.d(context, "context");
            Resources resources = context.getResources();
            int i2 = com.clubhouse.android.core.R.dimen.tooltip_arrow_height;
            k.b bVar2 = new k.b();
            bVar2.c((float) context.getResources().getDimensionPixelSize(com.clubhouse.android.core.R.dimen.tooltip_corner_radius));
            bVar2.k = new i0.h.a.c.w.h(new i0.e.b.g3.t.b((float) context.getResources().getDimensionPixelSize(com.clubhouse.android.core.R.dimen.tooltip_arrow_width), (float) resources.getDimensionPixelSize(i2)), width);
            i0.h.a.c.w.k a2 = bVar2.a();
            m0.n.b.i.d(a2, "Builder()\n            .setAllCornerSizes(cornerRadius)\n            .setBottomEdge(\n                OffsetEdgeTreatment(TooltipEdgeTreatment(arrowWidth, arrowHeight), arrowOffset))\n            .build()");
            g gVar = new g(a2);
            Resources resources2 = context.getResources();
            int i3 = com.clubhouse.android.core.R.dimen.tooltip_elevation;
            gVar.s((float) resources2.getDimensionPixelSize(i3));
            gVar.t(ColorStateList.valueOf(-1));
            frameLayout.setBackground(gVar);
            frameLayout.setElevation((float) frameLayout.getContext().getResources().getDimensionPixelSize(i3));
            frameLayout.addView(inflate);
            View rootView2 = imageView.getRootView();
            m0.n.b.i.e(imageView, "<this>");
            int[] iArr2 = {0, 0};
            imageView.getLocationOnScreen(iArr2);
            int dimensionPixelSize = frameLayout.getResources().getDimensionPixelSize(com.clubhouse.android.core.R.dimen.tooltip_bubble_horizontal_margin);
            FrameLayout frameLayout2 = new FrameLayout(frameLayout.getContext());
            frameLayout2.setClipChildren(false);
            frameLayout2.setClipToPadding(false);
            frameLayout2.setPadding(dimensionPixelSize, 0, dimensionPixelSize, 0);
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2, 83);
            d0 j2 = d0.j(rootView2.getRootWindowInsets());
            m0.n.b.i.d(j2, "toWindowInsetsCompat(rootView.rootWindowInsets)");
            h0.i.c.b a3 = j2.a(7);
            m0.n.b.i.d(a3, "insets.getInsets(WindowInsetsCompat.Type.systemBars())");
            Context context2 = frameLayout.getContext();
            m0.n.b.i.d(context2, "tooltipView.context");
            layoutParams.bottomMargin = ((rootView2.getHeight() - iArr2[1]) - a3.e) + context2.getResources().getDimensionPixelSize(i2);
            frameLayout2.addView(frameLayout, layoutParams);
            PopupWindow popupWindow = new PopupWindow(frameLayout2, -1, -1, true);
            frameLayout2.setOnClickListener(new i0.e.b.g3.t.a(popupWindow));
            popupWindow.showAtLocation(imageView, 51, 0, 0);
            frameLayout.setScaleX(0.0f);
            frameLayout.setScaleY(0.0f);
            frameLayout2.getViewTreeObserver().addOnGlobalLayoutListener(new i0.e.b.g3.t.c(frameLayout2, frameLayout, imageView));
        }
        return i.a;
    }
}
