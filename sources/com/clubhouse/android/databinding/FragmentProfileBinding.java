package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.airbnb.epoxy.EpoxyRecyclerView;
import com.clubhouse.android.core.ui.TriStateButton;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentProfileBinding implements a {
    public final ImageView A;
    public final AvatarView B;
    public final AvatarView C;
    public final AvatarView D;
    public final TextView E;
    public final ConstraintLayout F;
    public final AvatarView G;
    public final TextView H;
    public final ImageView I;
    public final TextView J;
    public final LinearLayout K;
    public final TextView L;
    public final LinearLayout M;
    public final ScrollView N;
    public final Button O;
    public final ImageView P;
    public final Button Q;
    public final ImageView R;
    public final ImageView S;
    public final LinearLayout T;
    public final LinearLayout U;
    public final Button V;
    public final ProfileUpcomingEventBinding W;
    public final TextView X;
    public final ImageView Y;
    public final ConstraintLayout a;
    public final AvatarView b;
    public final ImageView c;
    public final TextView d;
    public final ImageView e;
    public final View f;
    public final ImageView g;
    public final LinearLayout h;
    public final EpoxyRecyclerView i;
    public final View j;
    public final TriStateButton k;
    public final LinearLayout l;
    public final ImageView m;
    public final ConstraintLayout n;
    public final TextView o;
    public final EpoxyRecyclerView p;
    public final TextView q;
    public final ConstraintLayout r;
    public final TextView s;
    public final TextView t;
    public final TextView u;
    public final Button v;
    public final Button w;
    public final TextView x;
    public final TextView y;
    public final FrameLayout z;

    public FragmentProfileBinding(ConstraintLayout constraintLayout, AvatarView avatarView, ImageView imageView, TextView textView, ImageView imageView2, View view, ImageView imageView3, LinearLayout linearLayout, TextView textView2, EpoxyRecyclerView epoxyRecyclerView, View view2, TriStateButton triStateButton, LinearLayout linearLayout2, ImageView imageView4, ConstraintLayout constraintLayout2, TextView textView3, TextView textView4, EpoxyRecyclerView epoxyRecyclerView2, TextView textView5, TextView textView6, ConstraintLayout constraintLayout3, TextView textView7, TextView textView8, ConstraintLayout constraintLayout4, TextView textView9, Button button, Button button2, TextView textView10, TextView textView11, FrameLayout frameLayout, ImageView imageView5, AvatarView avatarView2, AvatarView avatarView3, AvatarView avatarView4, FrameLayout frameLayout2, TextView textView12, ConstraintLayout constraintLayout5, AvatarView avatarView5, TextView textView13, ImageView imageView6, TextView textView14, LinearLayout linearLayout3, TextView textView15, LinearLayout linearLayout4, ScrollView scrollView, Button button3, ImageView imageView7, Button button4, ImageView imageView8, ImageView imageView9, LinearLayout linearLayout5, LinearLayout linearLayout6, Toolbar toolbar, Button button5, ProfileUpcomingEventBinding profileUpcomingEventBinding, TextView textView16, ImageView imageView10, ConstraintLayout constraintLayout6) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = imageView;
        this.d = textView;
        this.e = imageView2;
        this.f = view;
        this.g = imageView3;
        this.h = linearLayout;
        this.i = epoxyRecyclerView;
        this.j = view2;
        this.k = triStateButton;
        this.l = linearLayout2;
        this.m = imageView4;
        this.n = constraintLayout2;
        this.o = textView3;
        this.p = epoxyRecyclerView2;
        this.q = textView6;
        this.r = constraintLayout3;
        this.s = textView7;
        this.t = textView8;
        this.u = textView9;
        this.v = button;
        this.w = button2;
        this.x = textView10;
        this.y = textView11;
        this.z = frameLayout;
        this.A = imageView5;
        this.B = avatarView2;
        this.C = avatarView3;
        this.D = avatarView4;
        this.E = textView12;
        this.F = constraintLayout5;
        this.G = avatarView5;
        this.H = textView13;
        this.I = imageView6;
        this.J = textView14;
        this.K = linearLayout3;
        this.L = textView15;
        this.M = linearLayout4;
        this.N = scrollView;
        this.O = button3;
        this.P = imageView7;
        this.Q = button4;
        this.R = imageView8;
        this.S = imageView9;
        this.T = linearLayout5;
        this.U = linearLayout6;
        this.V = button5;
        this.W = profileUpcomingEventBinding;
        this.X = textView16;
        this.Y = imageView10;
    }

    public static FragmentProfileBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.avatar;
        AvatarView avatarView = (AvatarView) view2.findViewById(R.id.avatar);
        if (avatarView != null) {
            i2 = R.id.back;
            ImageView imageView = (ImageView) view2.findViewById(R.id.back);
            if (imageView != null) {
                i2 = R.id.bio;
                TextView textView = (TextView) view2.findViewById(R.id.bio);
                if (textView != null) {
                    i2 = R.id.blocked_by_network;
                    ImageView imageView2 = (ImageView) view2.findViewById(R.id.blocked_by_network);
                    if (imageView2 != null) {
                        i2 = R.id.buttons_shadow;
                        View findViewById = view2.findViewById(R.id.buttons_shadow);
                        if (findViewById != null) {
                            i2 = R.id.close;
                            ImageView imageView3 = (ImageView) view2.findViewById(R.id.close);
                            if (imageView3 != null) {
                                i2 = R.id.club_container;
                                LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.club_container);
                                if (linearLayout != null) {
                                    i2 = R.id.club_header;
                                    TextView textView2 = (TextView) view2.findViewById(R.id.club_header);
                                    if (textView2 != null) {
                                        i2 = R.id.club_list;
                                        EpoxyRecyclerView epoxyRecyclerView = (EpoxyRecyclerView) view2.findViewById(R.id.club_list);
                                        if (epoxyRecyclerView != null) {
                                            i2 = R.id.divider;
                                            View findViewById2 = view2.findViewById(R.id.divider);
                                            if (findViewById2 != null) {
                                                i2 = R.id.follow_button;
                                                TriStateButton triStateButton = (TriStateButton) view2.findViewById(R.id.follow_button);
                                                if (triStateButton != null) {
                                                    i2 = R.id.follow_count_container;
                                                    LinearLayout linearLayout2 = (LinearLayout) view2.findViewById(R.id.follow_count_container);
                                                    if (linearLayout2 != null) {
                                                        i2 = R.id.follow_suggestions_button;
                                                        ImageView imageView4 = (ImageView) view2.findViewById(R.id.follow_suggestions_button);
                                                        if (imageView4 != null) {
                                                            i2 = R.id.follow_suggestions_container;
                                                            ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.follow_suggestions_container);
                                                            if (constraintLayout != null) {
                                                                i2 = R.id.follow_suggestions_empty;
                                                                TextView textView3 = (TextView) view2.findViewById(R.id.follow_suggestions_empty);
                                                                if (textView3 != null) {
                                                                    i2 = R.id.follow_suggestions_header;
                                                                    TextView textView4 = (TextView) view2.findViewById(R.id.follow_suggestions_header);
                                                                    if (textView4 != null) {
                                                                        i2 = R.id.follow_suggestions_list;
                                                                        EpoxyRecyclerView epoxyRecyclerView2 = (EpoxyRecyclerView) view2.findViewById(R.id.follow_suggestions_list);
                                                                        if (epoxyRecyclerView2 != null) {
                                                                            i2 = R.id.follow_suggestions_see_more;
                                                                            TextView textView5 = (TextView) view2.findViewById(R.id.follow_suggestions_see_more);
                                                                            if (textView5 != null) {
                                                                                i2 = R.id.followed_by;
                                                                                TextView textView6 = (TextView) view2.findViewById(R.id.followed_by);
                                                                                if (textView6 != null) {
                                                                                    i2 = R.id.followed_by_container;
                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(R.id.followed_by_container);
                                                                                    if (constraintLayout2 != null) {
                                                                                        i2 = R.id.followers;
                                                                                        TextView textView7 = (TextView) view2.findViewById(R.id.followers);
                                                                                        if (textView7 != null) {
                                                                                            i2 = R.id.follows_you;
                                                                                            TextView textView8 = (TextView) view2.findViewById(R.id.follows_you);
                                                                                            if (textView8 != null) {
                                                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) view2;
                                                                                                i2 = R.id.fullname;
                                                                                                TextView textView9 = (TextView) view2.findViewById(R.id.fullname);
                                                                                                if (textView9 != null) {
                                                                                                    i2 = R.id.give_money_button;
                                                                                                    Button button = (Button) view2.findViewById(R.id.give_money_button);
                                                                                                    if (button != null) {
                                                                                                        i2 = R.id.instagram;
                                                                                                        Button button2 = (Button) view2.findViewById(R.id.instagram);
                                                                                                        if (button2 != null) {
                                                                                                            i2 = R.id.is_moderator;
                                                                                                            TextView textView10 = (TextView) view2.findViewById(R.id.is_moderator);
                                                                                                            if (textView10 != null) {
                                                                                                                i2 = R.id.join_date;
                                                                                                                TextView textView11 = (TextView) view2.findViewById(R.id.join_date);
                                                                                                                if (textView11 != null) {
                                                                                                                    i2 = R.id.loading_container;
                                                                                                                    FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.loading_container);
                                                                                                                    if (frameLayout != null) {
                                                                                                                        i2 = R.id.menu;
                                                                                                                        ImageView imageView5 = (ImageView) view2.findViewById(R.id.menu);
                                                                                                                        if (imageView5 != null) {
                                                                                                                            i2 = R.id.mutual_1;
                                                                                                                            AvatarView avatarView2 = (AvatarView) view2.findViewById(R.id.mutual_1);
                                                                                                                            if (avatarView2 != null) {
                                                                                                                                i2 = R.id.mutual_2;
                                                                                                                                AvatarView avatarView3 = (AvatarView) view2.findViewById(R.id.mutual_2);
                                                                                                                                if (avatarView3 != null) {
                                                                                                                                    i2 = R.id.mutual_3;
                                                                                                                                    AvatarView avatarView4 = (AvatarView) view2.findViewById(R.id.mutual_3);
                                                                                                                                    if (avatarView4 != null) {
                                                                                                                                        i2 = R.id.mutuals;
                                                                                                                                        FrameLayout frameLayout2 = (FrameLayout) view2.findViewById(R.id.mutuals);
                                                                                                                                        if (frameLayout2 != null) {
                                                                                                                                            i2 = R.id.name;
                                                                                                                                            TextView textView12 = (TextView) view2.findViewById(R.id.name);
                                                                                                                                            if (textView12 != null) {
                                                                                                                                                i2 = R.id.nominator;
                                                                                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) view2.findViewById(R.id.nominator);
                                                                                                                                                if (constraintLayout4 != null) {
                                                                                                                                                    i2 = R.id.nominator_avatar;
                                                                                                                                                    AvatarView avatarView5 = (AvatarView) view2.findViewById(R.id.nominator_avatar);
                                                                                                                                                    if (avatarView5 != null) {
                                                                                                                                                        i2 = R.id.nominator_name;
                                                                                                                                                        TextView textView13 = (TextView) view2.findViewById(R.id.nominator_name);
                                                                                                                                                        if (textView13 != null) {
                                                                                                                                                            i2 = R.id.notify_options;
                                                                                                                                                            ImageView imageView6 = (ImageView) view2.findViewById(R.id.notify_options);
                                                                                                                                                            if (imageView6 != null) {
                                                                                                                                                                i2 = R.id.num_followers;
                                                                                                                                                                TextView textView14 = (TextView) view2.findViewById(R.id.num_followers);
                                                                                                                                                                if (textView14 != null) {
                                                                                                                                                                    i2 = R.id.num_followers_container;
                                                                                                                                                                    LinearLayout linearLayout3 = (LinearLayout) view2.findViewById(R.id.num_followers_container);
                                                                                                                                                                    if (linearLayout3 != null) {
                                                                                                                                                                        i2 = R.id.num_following;
                                                                                                                                                                        TextView textView15 = (TextView) view2.findViewById(R.id.num_following);
                                                                                                                                                                        if (textView15 != null) {
                                                                                                                                                                            i2 = R.id.num_following_container;
                                                                                                                                                                            LinearLayout linearLayout4 = (LinearLayout) view2.findViewById(R.id.num_following_container);
                                                                                                                                                                            if (linearLayout4 != null) {
                                                                                                                                                                                i2 = R.id.scroll;
                                                                                                                                                                                ScrollView scrollView = (ScrollView) view2.findViewById(R.id.scroll);
                                                                                                                                                                                if (scrollView != null) {
                                                                                                                                                                                    i2 = R.id.send_message;
                                                                                                                                                                                    Button button3 = (Button) view2.findViewById(R.id.send_message);
                                                                                                                                                                                    if (button3 != null) {
                                                                                                                                                                                        i2 = R.id.send_message_button;
                                                                                                                                                                                        ImageView imageView7 = (ImageView) view2.findViewById(R.id.send_message_button);
                                                                                                                                                                                        if (imageView7 != null) {
                                                                                                                                                                                            i2 = R.id.send_wave;
                                                                                                                                                                                            Button button4 = (Button) view2.findViewById(R.id.send_wave);
                                                                                                                                                                                            if (button4 != null) {
                                                                                                                                                                                                i2 = R.id.settings;
                                                                                                                                                                                                ImageView imageView8 = (ImageView) view2.findViewById(R.id.settings);
                                                                                                                                                                                                if (imageView8 != null) {
                                                                                                                                                                                                    i2 = R.id.share;
                                                                                                                                                                                                    ImageView imageView9 = (ImageView) view2.findViewById(R.id.share);
                                                                                                                                                                                                    if (imageView9 != null) {
                                                                                                                                                                                                        i2 = R.id.social_container;
                                                                                                                                                                                                        LinearLayout linearLayout5 = (LinearLayout) view2.findViewById(R.id.social_container);
                                                                                                                                                                                                        if (linearLayout5 != null) {
                                                                                                                                                                                                            i2 = R.id.social_options;
                                                                                                                                                                                                            LinearLayout linearLayout6 = (LinearLayout) view2.findViewById(R.id.social_options);
                                                                                                                                                                                                            if (linearLayout6 != null) {
                                                                                                                                                                                                                i2 = R.id.toolbar;
                                                                                                                                                                                                                Toolbar toolbar = (Toolbar) view2.findViewById(R.id.toolbar);
                                                                                                                                                                                                                if (toolbar != null) {
                                                                                                                                                                                                                    i2 = R.id.twitter;
                                                                                                                                                                                                                    Button button5 = (Button) view2.findViewById(R.id.twitter);
                                                                                                                                                                                                                    if (button5 != null) {
                                                                                                                                                                                                                        i2 = R.id.upcoming_event_container;
                                                                                                                                                                                                                        View findViewById3 = view2.findViewById(R.id.upcoming_event_container);
                                                                                                                                                                                                                        if (findViewById3 != null) {
                                                                                                                                                                                                                            ProfileUpcomingEventBinding bind = ProfileUpcomingEventBinding.bind(findViewById3);
                                                                                                                                                                                                                            i2 = R.id.username;
                                                                                                                                                                                                                            TextView textView16 = (TextView) view2.findViewById(R.id.username);
                                                                                                                                                                                                                            if (textView16 != null) {
                                                                                                                                                                                                                                i2 = R.id.verify_email;
                                                                                                                                                                                                                                ImageView imageView10 = (ImageView) view2.findViewById(R.id.verify_email);
                                                                                                                                                                                                                                if (imageView10 != null) {
                                                                                                                                                                                                                                    i2 = R.id.wave_container;
                                                                                                                                                                                                                                    ConstraintLayout constraintLayout5 = (ConstraintLayout) view2.findViewById(R.id.wave_container);
                                                                                                                                                                                                                                    if (constraintLayout5 != null) {
                                                                                                                                                                                                                                        return new FragmentProfileBinding(constraintLayout3, avatarView, imageView, textView, imageView2, findViewById, imageView3, linearLayout, textView2, epoxyRecyclerView, findViewById2, triStateButton, linearLayout2, imageView4, constraintLayout, textView3, textView4, epoxyRecyclerView2, textView5, textView6, constraintLayout2, textView7, textView8, constraintLayout3, textView9, button, button2, textView10, textView11, frameLayout, imageView5, avatarView2, avatarView3, avatarView4, frameLayout2, textView12, constraintLayout4, avatarView5, textView13, imageView6, textView14, linearLayout3, textView15, linearLayout4, scrollView, button3, imageView7, button4, imageView8, imageView9, linearLayout5, linearLayout6, toolbar, button5, bind, textView16, imageView10, constraintLayout5);
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

    public static FragmentProfileBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_profile, (ViewGroup) null, false));
    }
}
