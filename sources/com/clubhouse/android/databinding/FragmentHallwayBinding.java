package com.clubhouse.android.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.ui.CustomSwipeViewPager;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentHallwayBinding implements a {
    public final ConstraintLayout a;
    public final ImageView b;
    public final ImageView c;
    public final FrameLayout d;
    public final AvatarView e;
    public final ImageView f;
    public final CustomSwipeViewPager g;
    public final ImageView h;

    public FragmentHallwayBinding(ConstraintLayout constraintLayout, ImageView imageView, ImageView imageView2, FrameLayout frameLayout, AvatarView avatarView, ImageView imageView3, CustomSwipeViewPager customSwipeViewPager, ImageView imageView4, Toolbar toolbar) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = imageView2;
        this.d = frameLayout;
        this.e = avatarView;
        this.f = imageView3;
        this.g = customSwipeViewPager;
        this.h = imageView4;
    }

    public static FragmentHallwayBinding bind(View view) {
        int i = R.id.events_icon;
        ImageView imageView = (ImageView) view.findViewById(R.id.events_icon);
        if (imageView != null) {
            i = R.id.invites_icon;
            ImageView imageView2 = (ImageView) view.findViewById(R.id.invites_icon);
            if (imageView2 != null) {
                i = R.id.loading;
                FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.loading);
                if (frameLayout != null) {
                    i = R.id.me;
                    AvatarView avatarView = (AvatarView) view.findViewById(R.id.me);
                    if (avatarView != null) {
                        i = R.id.notification_icon;
                        ImageView imageView3 = (ImageView) view.findViewById(R.id.notification_icon);
                        if (imageView3 != null) {
                            i = R.id.pager;
                            CustomSwipeViewPager customSwipeViewPager = (CustomSwipeViewPager) view.findViewById(R.id.pager);
                            if (customSwipeViewPager != null) {
                                i = R.id.search_icon;
                                ImageView imageView4 = (ImageView) view.findViewById(R.id.search_icon);
                                if (imageView4 != null) {
                                    i = R.id.toolbar;
                                    Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
                                    if (toolbar != null) {
                                        return new FragmentHallwayBinding((ConstraintLayout) view, imageView, imageView2, frameLayout, avatarView, imageView3, customSwipeViewPager, imageView4, toolbar);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }

    public static FragmentHallwayBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_hallway, (ViewGroup) null, false));
    }
}
