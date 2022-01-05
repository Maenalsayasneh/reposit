package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.ui.DragInterceptingConstraintLayout;
import com.clubhouse.android.core.ui.TriStateButton;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentHalfProfileBinding implements a {
    public final TextView A;
    public final ImageView B;
    public final TextView C;
    public final LinearLayout D;
    public final TextView E;
    public final LinearLayout F;
    public final DragInterceptingConstraintLayout G;
    public final Button H;
    public final ImageView I;
    public final Button J;
    public final ImageView K;
    public final LinearLayout L;
    public final ProfileUpcomingEventBinding M;
    public final TextView N;
    public final DragInterceptingConstraintLayout a;
    public final Button b;
    public final AvatarView c;
    public final TextView d;
    public final ImageView e;
    public final LinearLayout f;
    public final ImageView g;
    public final View h;
    public final TriStateButton i;
    public final LinearLayout j;
    public final ImageView k;
    public final ConstraintLayout l;
    public final TextView m;
    public final EpoxyRecyclerView n;
    public final TextView o;
    public final TextView p;
    public final Button q;
    public final Button r;
    public final Button s;
    public final TextView t;
    public final Button u;
    public final ProgressBar v;
    public final Button w;
    public final ImageView x;
    public final Button y;
    public final ImageView z;

    public FragmentHalfProfileBinding(DragInterceptingConstraintLayout dragInterceptingConstraintLayout, Button button, AvatarView avatarView, FrameLayout frameLayout, Barrier barrier, TextView textView, ImageView imageView, LinearLayout linearLayout, ImageView imageView2, View view, TriStateButton triStateButton, LinearLayout linearLayout2, ImageView imageView3, ConstraintLayout constraintLayout, TextView textView2, TextView textView3, EpoxyRecyclerView epoxyRecyclerView, TextView textView4, TextView textView5, TextView textView6, Button button2, Button button3, Button button4, TextView textView7, Button button5, ProgressBar progressBar, Button button6, ImageView imageView4, Button button7, ImageView imageView5, TextView textView8, ImageView imageView6, TextView textView9, LinearLayout linearLayout3, TextView textView10, LinearLayout linearLayout4, DragInterceptingConstraintLayout dragInterceptingConstraintLayout2, Button button8, ImageView imageView7, Button button9, ImageView imageView8, LinearLayout linearLayout5, Toolbar toolbar, ProfileUpcomingEventBinding profileUpcomingEventBinding, TextView textView11) {
        this.a = dragInterceptingConstraintLayout;
        this.b = button;
        this.c = avatarView;
        this.d = textView;
        this.e = imageView;
        this.f = linearLayout;
        this.g = imageView2;
        this.h = view;
        this.i = triStateButton;
        this.j = linearLayout2;
        this.k = imageView3;
        this.l = constraintLayout;
        this.m = textView2;
        this.n = epoxyRecyclerView;
        this.o = textView5;
        this.p = textView6;
        this.q = button2;
        this.r = button3;
        this.s = button4;
        this.t = textView7;
        this.u = button5;
        this.v = progressBar;
        this.w = button6;
        this.x = imageView4;
        this.y = button7;
        this.z = imageView5;
        this.A = textView8;
        this.B = imageView6;
        this.C = textView9;
        this.D = linearLayout3;
        this.E = textView10;
        this.F = linearLayout4;
        this.G = dragInterceptingConstraintLayout2;
        this.H = button8;
        this.I = imageView7;
        this.J = button9;
        this.K = imageView8;
        this.L = linearLayout5;
        this.M = profileUpcomingEventBinding;
        this.N = textView11;
    }

    public static FragmentHalfProfileBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.accept_speaker_invite;
        Button button = (Button) view2.findViewById(R.id.accept_speaker_invite);
        if (button != null) {
            i2 = R.id.avatar;
            AvatarView avatarView = (AvatarView) view2.findViewById(R.id.avatar);
            if (avatarView != null) {
                i2 = R.id.avatar_container;
                FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.avatar_container);
                if (frameLayout != null) {
                    i2 = R.id.barrier;
                    Barrier barrier = (Barrier) view2.findViewById(R.id.barrier);
                    if (barrier != null) {
                        i2 = R.id.bio;
                        TextView textView = (TextView) view2.findViewById(R.id.bio);
                        if (textView != null) {
                            i2 = R.id.blocked_by_network;
                            ImageView imageView = (ImageView) view2.findViewById(R.id.blocked_by_network);
                            if (imageView != null) {
                                i2 = R.id.button_container;
                                LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.button_container);
                                if (linearLayout != null) {
                                    i2 = R.id.close;
                                    ImageView imageView2 = (ImageView) view2.findViewById(R.id.close);
                                    if (imageView2 != null) {
                                        i2 = R.id.divider;
                                        View findViewById = view2.findViewById(R.id.divider);
                                        if (findViewById != null) {
                                            i2 = R.id.follow_button;
                                            TriStateButton triStateButton = (TriStateButton) view2.findViewById(R.id.follow_button);
                                            if (triStateButton != null) {
                                                i2 = R.id.follow_count_container;
                                                LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.follow_count_container);
                                                if (linearLayout2 != null) {
                                                    i2 = R.id.follow_suggestions_button;
                                                    ImageView imageView3 = (ImageView) view2.findViewById(R.id.follow_suggestions_button);
                                                    if (imageView3 != null) {
                                                        i2 = R.id.follow_suggestions_container;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.follow_suggestions_container);
                                                        if (constraintLayout != null) {
                                                            i2 = R.id.follow_suggestions_empty;
                                                            TextView textView2 = (TextView) view2.findViewById(R.id.follow_suggestions_empty);
                                                            if (textView2 != null) {
                                                                i2 = R.id.follow_suggestions_header;
                                                                TextView textView3 = (TextView) view2.findViewById(R.id.follow_suggestions_header);
                                                                if (textView3 != null) {
                                                                    i2 = R.id.follow_suggestions_list;
                                                                    EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view2.findViewById(R.id.follow_suggestions_list);
                                                                    if (epoxyRecyclerView != null) {
                                                                        i2 = R.id.follow_suggestions_see_more;
                                                                        TextView textView4 = (TextView) view2.findViewById(R.id.follow_suggestions_see_more);
                                                                        if (textView4 != null) {
                                                                            i2 = R.id.followers;
                                                                            TextView textView5 = (TextView) view2.findViewById(R.id.followers);
                                                                            if (textView5 != null) {
                                                                                i2 = R.id.follows_you;
                                                                                TextView textView6 = (TextView) view2.findViewById(R.id.follows_you);
                                                                                if (textView6 != null) {
                                                                                    i2 = R.id.full_profile_button;
                                                                                    Button button2 = (Button) view2.findViewById(R.id.full_profile_button);
                                                                                    if (button2 != null) {
                                                                                        i2 = R.id.invite_to_private_channel;
                                                                                        Button button3 = (Button) view2.findViewById(R.id.invite_to_private_channel);
                                                                                        if (button3 != null) {
                                                                                            i2 = R.id.invite_to_speak;
                                                                                            Button button4 = (Button) view2.findViewById(R.id.invite_to_speak);
                                                                                            if (button4 != null) {
                                                                                                i2 = R.id.is_moderator;
                                                                                                TextView textView7 = (TextView) view2.findViewById(R.id.is_moderator);
                                                                                                if (textView7 != null) {
                                                                                                    i2 = R.id.join_channel;
                                                                                                    Button button5 = (Button) view2.findViewById(R.id.join_channel);
                                                                                                    if (button5 != null) {
                                                                                                        i2 = R.id.loading;
                                                                                                        ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.loading);
                                                                                                        if (progressBar != null) {
                                                                                                            i2 = R.id.make_a_moderator;
                                                                                                            Button button6 = (Button) view2.findViewById(R.id.make_a_moderator);
                                                                                                            if (button6 != null) {
                                                                                                                i2 = R.id.menu;
                                                                                                                ImageView imageView4 = (ImageView) view2.findViewById(R.id.menu);
                                                                                                                if (imageView4 != null) {
                                                                                                                    i2 = R.id.move_to_audience;
                                                                                                                    Button button7 = (Button) view2.findViewById(R.id.move_to_audience);
                                                                                                                    if (button7 != null) {
                                                                                                                        i2 = R.id.mute;
                                                                                                                        ImageView imageView5 = (ImageView) view2.findViewById(R.id.mute);
                                                                                                                        if (imageView5 != null) {
                                                                                                                            i2 = R.id.name;
                                                                                                                            TextView textView8 = (TextView) view2.findViewById(R.id.name);
                                                                                                                            if (textView8 != null) {
                                                                                                                                i2 = R.id.notify_options;
                                                                                                                                ImageView imageView6 = (ImageView) view2.findViewById(R.id.notify_options);
                                                                                                                                if (imageView6 != null) {
                                                                                                                                    i2 = R.id.num_followers;
                                                                                                                                    TextView textView9 = (TextView) view2.findViewById(R.id.num_followers);
                                                                                                                                    if (textView9 != null) {
                                                                                                                                        i2 = R.id.num_followers_container;
                                                                                                                                        LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(R.id.num_followers_container);
                                                                                                                                        if (linearLayout3 != null) {
                                                                                                                                            i2 = R.id.num_following;
                                                                                                                                            TextView textView10 = (TextView) view2.findViewById(R.id.num_following);
                                                                                                                                            if (textView10 != null) {
                                                                                                                                                i2 = R.id.num_following_container;
                                                                                                                                                LinearLayout linearLayout4 = (LinearLayout) view2.findViewById(R.id.num_following_container);
                                                                                                                                                if (linearLayout4 != null) {
                                                                                                                                                    DragInterceptingConstraintLayout dragInterceptingConstraintLayout = (DragInterceptingConstraintLayout) view2;
                                                                                                                                                    i2 = R.id.send_message;
                                                                                                                                                    Button button8 = (Button) view2.findViewById(R.id.send_message);
                                                                                                                                                    if (button8 != null) {
                                                                                                                                                        i2 = R.id.send_message_button;
                                                                                                                                                        ImageView imageView7 = (ImageView) view2.findViewById(R.id.send_message_button);
                                                                                                                                                        if (imageView7 != null) {
                                                                                                                                                            i2 = R.id.send_wave;
                                                                                                                                                            Button button9 = (Button) view2.findViewById(R.id.send_wave);
                                                                                                                                                            if (button9 != null) {
                                                                                                                                                                i2 = R.id.share;
                                                                                                                                                                ImageView imageView8 = (ImageView) view2.findViewById(R.id.share);
                                                                                                                                                                if (imageView8 != null) {
                                                                                                                                                                    i2 = R.id.social_options;
                                                                                                                                                                    LinearLayout linearLayout5 = (LinearLayout) view2.findViewById(R.id.social_options);
                                                                                                                                                                    if (linearLayout5 != null) {
                                                                                                                                                                        i2 = R.id.toolbar;
                                                                                                                                                                        Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                                                                                                                                                                        if (toolbar != null) {
                                                                                                                                                                            i2 = R.id.upcoming_event_container;
                                                                                                                                                                            View findViewById2 = view2.findViewById(R.id.upcoming_event_container);
                                                                                                                                                                            if (findViewById2 != null) {
                                                                                                                                                                                ProfileUpcomingEventBinding bind = ProfileUpcomingEventBinding.bind(findViewById2);
                                                                                                                                                                                i2 = R.id.username;
                                                                                                                                                                                TextView textView11 = (TextView) view2.findViewById(R.id.username);
                                                                                                                                                                                if (textView11 != null) {
                                                                                                                                                                                    return new FragmentHalfProfileBinding(dragInterceptingConstraintLayout, button, avatarView, frameLayout, barrier, textView, imageView, linearLayout, imageView2, findViewById, triStateButton, linearLayout2, imageView3, constraintLayout, textView2, textView3, epoxyRecyclerView, textView4, textView5, textView6, button2, button3, button4, textView7, button5, progressBar, button6, imageView4, button7, imageView5, textView8, imageView6, textView9, linearLayout3, textView10, linearLayout4, dragInterceptingConstraintLayout, button8, imageView7, button9, imageView8, linearLayout5, toolbar, bind, textView11);
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

    public static FragmentHalfProfileBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_half_profile, (ViewGroup) null, false));
    }
}
