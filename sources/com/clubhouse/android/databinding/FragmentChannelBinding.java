package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Barrier;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.ui.SafeMotionLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.ui.channels.views.ChannelCtaBar;
import com.clubhouse.android.ui.channels.views.FacePile;
import com.clubhouse.android.ui.channels.views.NoticeBar;
import com.clubhouse.app.R;
import com.clubhouse.wave.databinding.WaveSocialRoomUpsellBinding;
import h0.e0.a;

public final class FragmentChannelBinding implements a {
    public final SafeMotionLayout a;
    public final ImageView b;
    public final LinearLayout c;
    public final ChannelCtaBar d;
    public final EpoxyRecyclerView e;
    public final ImageView f;
    public final View g;
    public final ImageView h;
    public final LinearLayout i;
    public final TextView j;
    public final TextView k;
    public final TextView l;
    public final FacePile m;
    public final ImageView n;
    public final Button o;
    public final ImageView p;
    public final ImageView q;
    public final ImageView r;
    public final ImageView s;
    public final Button t;
    public final AvatarView u;
    public final NoticeBar v;
    public final SwipeRefreshLayout w;
    public final Toolbar x;
    public final WaveSocialRoomUpsellBinding y;

    public FragmentChannelBinding(SafeMotionLayout safeMotionLayout, ImageView imageView, Barrier barrier, LinearLayout linearLayout, ChannelCtaBar channelCtaBar, EpoxyRecyclerView epoxyRecyclerView, ImageView imageView2, View view, ImageView imageView3, LinearLayout linearLayout2, TextView textView, TextView textView2, TextView textView3, FrameLayout frameLayout, FacePile facePile, ImageView imageView4, Button button, ImageView imageView5, ImageView imageView6, ImageView imageView7, ImageView imageView8, Button button2, AvatarView avatarView, SafeMotionLayout safeMotionLayout2, NoticeBar noticeBar, SwipeRefreshLayout swipeRefreshLayout, Toolbar toolbar, WaveSocialRoomUpsellBinding waveSocialRoomUpsellBinding) {
        this.a = safeMotionLayout;
        this.b = imageView;
        this.c = linearLayout;
        this.d = channelCtaBar;
        this.e = epoxyRecyclerView;
        this.f = imageView2;
        this.g = view;
        this.h = imageView3;
        this.i = linearLayout2;
        this.j = textView;
        this.k = textView2;
        this.l = textView3;
        this.m = facePile;
        this.n = imageView4;
        this.o = button;
        this.p = imageView5;
        this.q = imageView6;
        this.r = imageView7;
        this.s = imageView8;
        this.t = button2;
        this.u = avatarView;
        this.v = noticeBar;
        this.w = swipeRefreshLayout;
        this.x = toolbar;
        this.y = waveSocialRoomUpsellBinding;
    }

    public static FragmentChannelBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.backchannel;
        ImageView imageView = (ImageView) view2.findViewById(R.id.backchannel);
        if (imageView != null) {
            i2 = R.id.bottom_controls_barrier;
            Barrier barrier = (Barrier) view2.findViewById(R.id.bottom_controls_barrier);
            if (barrier != null) {
                i2 = R.id.bottom_controls_container;
                LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.bottom_controls_container);
                if (linearLayout != null) {
                    i2 = R.id.channel_cta_bar;
                    ChannelCtaBar channelCtaBar = (ChannelCtaBar) view2.findViewById(R.id.channel_cta_bar);
                    if (channelCtaBar != null) {
                        i2 = R.id.channel_user_list;
                        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view2.findViewById(R.id.channel_user_list);
                        if (epoxyRecyclerView != null) {
                            i2 = R.id.collapse;
                            ImageView imageView2 = (ImageView) view2.findViewById(R.id.collapse);
                            if (imageView2 != null) {
                                i2 = R.id.collapsed_virtual_background;
                                View findViewById = view2.findViewById(R.id.collapsed_virtual_background);
                                if (findViewById != null) {
                                    i2 = R.id.community_guidelines;
                                    ImageView imageView3 = (ImageView) view2.findViewById(R.id.community_guidelines);
                                    if (imageView3 != null) {
                                        i2 = R.id.empty_state;
                                        LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.empty_state);
                                        if (linearLayout2 != null) {
                                            i2 = R.id.empty_state_body;
                                            TextView textView = (TextView) view2.findViewById(R.id.empty_state_body);
                                            if (textView != null) {
                                                i2 = R.id.empty_state_button;
                                                TextView textView2 = (TextView) view2.findViewById(R.id.empty_state_button);
                                                if (textView2 != null) {
                                                    i2 = R.id.empty_state_title;
                                                    TextView textView3 = (TextView) view2.findViewById(R.id.empty_state_title);
                                                    if (textView3 != null) {
                                                        i2 = R.id.expanded_virtual_background;
                                                        FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.expanded_virtual_background);
                                                        if (frameLayout != null) {
                                                            i2 = R.id.facepile;
                                                            FacePile facePile = (FacePile) view2.findViewById(R.id.facepile);
                                                            if (facePile != null) {
                                                                i2 = R.id.icon_clip;
                                                                ImageView imageView4 = (ImageView) view2.findViewById(R.id.icon_clip);
                                                                if (imageView4 != null) {
                                                                    i2 = R.id.icon_leave;
                                                                    Button button = (Button) view2.findViewById(R.id.icon_leave);
                                                                    if (button != null) {
                                                                        i2 = R.id.icon_mute;
                                                                        ImageView imageView5 = (ImageView) view2.findViewById(R.id.icon_mute);
                                                                        if (imageView5 != null) {
                                                                            i2 = R.id.icon_ping;
                                                                            ImageView imageView6 = (ImageView) view2.findViewById(R.id.icon_ping);
                                                                            if (imageView6 != null) {
                                                                                i2 = R.id.icon_raise_hand;
                                                                                ImageView imageView7 = (ImageView) view2.findViewById(R.id.icon_raise_hand);
                                                                                if (imageView7 != null) {
                                                                                    i2 = R.id.icon_raised_hands_queue;
                                                                                    ImageView imageView8 = (ImageView) view2.findViewById(R.id.icon_raised_hands_queue);
                                                                                    if (imageView8 != null) {
                                                                                        i2 = R.id.leave_button;
                                                                                        Button button2 = (Button) view2.findViewById(R.id.leave_button);
                                                                                        if (button2 != null) {
                                                                                            i2 = R.id.me;
                                                                                            AvatarView avatarView = (AvatarView) view2.findViewById(R.id.me);
                                                                                            if (avatarView != null) {
                                                                                                SafeMotionLayout safeMotionLayout = (SafeMotionLayout) view2;
                                                                                                i2 = R.id.notice_bar;
                                                                                                NoticeBar noticeBar = (NoticeBar) view2.findViewById(R.id.notice_bar);
                                                                                                if (noticeBar != null) {
                                                                                                    i2 = R.id.refresh;
                                                                                                    SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) view2.findViewById(R.id.refresh);
                                                                                                    if (swipeRefreshLayout != null) {
                                                                                                        i2 = R.id.toolbar;
                                                                                                        Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                                                                                                        if (toolbar != null) {
                                                                                                            i2 = R.id.wave_social_upsell;
                                                                                                            View findViewById2 = view2.findViewById(R.id.wave_social_upsell);
                                                                                                            if (findViewById2 != null) {
                                                                                                                return new FragmentChannelBinding(safeMotionLayout, imageView, barrier, linearLayout, channelCtaBar, epoxyRecyclerView, imageView2, findViewById, imageView3, linearLayout2, textView, textView2, textView3, frameLayout, facePile, imageView4, button, imageView5, imageView6, imageView7, imageView8, button2, avatarView, safeMotionLayout, noticeBar, swipeRefreshLayout, toolbar, WaveSocialRoomUpsellBinding.bind(findViewById2));
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static FragmentChannelBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_channel, (ViewGroup) null, false));
    }
}
