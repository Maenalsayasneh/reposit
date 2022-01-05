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
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.core.databinding.BottomSheetGrabHandleBinding;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.app.R;
import h0.e0.a;

public final class FragmentSendDirectPaymentBinding implements a {
    public final ConstraintLayout a;
    public final AvatarView b;
    public final Button c;
    public final TextView d;
    public final LinearLayout e;
    public final Button f;
    public final TextView g;
    public final TextView h;
    public final ImageView i;
    public final ProgressBar j;
    public final ConstraintLayout k;
    public final FrameLayout l;
    public final TextView m;
    public final Button n;
    public final Button o;
    public final Button p;
    public final CardView q;
    public final Button r;
    public final ConstraintLayout s;
    public final TextView t;

    public FragmentSendDirectPaymentBinding(ConstraintLayout constraintLayout, AvatarView avatarView, Button button, TextView textView, LinearLayout linearLayout, Button button2, TextView textView2, TextView textView3, ImageView imageView, ProgressBar progressBar, ConstraintLayout constraintLayout2, BottomSheetGrabHandleBinding bottomSheetGrabHandleBinding, FrameLayout frameLayout, TextView textView4, Button button3, Button button4, Button button5, CardView cardView, Button button6, ConstraintLayout constraintLayout3, TextView textView5) {
        this.a = constraintLayout;
        this.b = avatarView;
        this.c = button;
        this.d = textView;
        this.e = linearLayout;
        this.f = button2;
        this.g = textView2;
        this.h = textView3;
        this.i = imageView;
        this.j = progressBar;
        this.k = constraintLayout2;
        this.l = frameLayout;
        this.m = textView4;
        this.n = button3;
        this.o = button4;
        this.p = button5;
        this.q = cardView;
        this.r = button6;
        this.s = constraintLayout3;
        this.t = textView5;
    }

    public static FragmentSendDirectPaymentBinding bind(View view) {
        View view2 = view;
        int i2 = R.id.avatar;
        AvatarView avatarView = (AvatarView) view2.findViewById(R.id.avatar);
        if (avatarView != null) {
            i2 = R.id.back_button;
            Button button = (Button) view2.findViewById(R.id.back_button);
            if (button != null) {
                i2 = R.id.card_info;
                TextView textView = (TextView) view2.findViewById(R.id.card_info);
                if (textView != null) {
                    i2 = R.id.confirm_amount_state;
                    LinearLayout linearLayout = (LinearLayout) view2.findViewById(R.id.confirm_amount_state);
                    if (linearLayout != null) {
                        i2 = R.id.confirm_button;
                        Button button2 = (Button) view2.findViewById(R.id.confirm_button);
                        if (button2 != null) {
                            i2 = R.id.fee_info;
                            TextView textView2 = (TextView) view2.findViewById(R.id.fee_info);
                            if (textView2 != null) {
                                i2 = R.id.finalizing_amount_label;
                                TextView textView3 = (TextView) view2.findViewById(R.id.finalizing_amount_label);
                                if (textView3 != null) {
                                    i2 = R.id.finalizing_check_mark;
                                    ImageView imageView = (ImageView) view2.findViewById(R.id.finalizing_check_mark);
                                    if (imageView != null) {
                                        i2 = R.id.finalizing_spinner;
                                        ProgressBar progressBar = (ProgressBar) view2.findViewById(R.id.finalizing_spinner);
                                        if (progressBar != null) {
                                            i2 = R.id.finalizing_state;
                                            ConstraintLayout constraintLayout = (ConstraintLayout) view2.findViewById(R.id.finalizing_state);
                                            if (constraintLayout != null) {
                                                i2 = R.id.grab_handle;
                                                View findViewById = view2.findViewById(R.id.grab_handle);
                                                if (findViewById != null) {
                                                    BottomSheetGrabHandleBinding bind = BottomSheetGrabHandleBinding.bind(findViewById);
                                                    i2 = R.id.loading_state;
                                                    FrameLayout frameLayout = (FrameLayout) view2.findViewById(R.id.loading_state);
                                                    if (frameLayout != null) {
                                                        i2 = R.id.name;
                                                        TextView textView4 = (TextView) view2.findViewById(R.id.name);
                                                        if (textView4 != null) {
                                                            i2 = R.id.payment_amount_10;
                                                            Button button3 = (Button) view2.findViewById(R.id.payment_amount_10);
                                                            if (button3 != null) {
                                                                i2 = R.id.payment_amount_20;
                                                                Button button4 = (Button) view2.findViewById(R.id.payment_amount_20);
                                                                if (button4 != null) {
                                                                    i2 = R.id.payment_amount_5;
                                                                    Button button5 = (Button) view2.findViewById(R.id.payment_amount_5);
                                                                    if (button5 != null) {
                                                                        i2 = R.id.payment_amount_label;
                                                                        CardView cardView = (CardView) view2.findViewById(R.id.payment_amount_label);
                                                                        if (cardView != null) {
                                                                            i2 = R.id.payment_amount_other;
                                                                            Button button6 = (Button) view2.findViewById(R.id.payment_amount_other);
                                                                            if (button6 != null) {
                                                                                i2 = R.id.select_amount_state;
                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) view2.findViewById(R.id.select_amount_state);
                                                                                if (constraintLayout2 != null) {
                                                                                    i2 = R.id.username;
                                                                                    TextView textView5 = (TextView) view2.findViewById(R.id.username);
                                                                                    if (textView5 != null) {
                                                                                        return new FragmentSendDirectPaymentBinding((ConstraintLayout) view2, avatarView, button, textView, linearLayout, button2, textView2, textView3, imageView, progressBar, constraintLayout, bind, frameLayout, textView4, button3, button4, button5, cardView, button6, constraintLayout2, textView5);
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

    public static FragmentSendDirectPaymentBinding inflate(LayoutInflater layoutInflater) {
        return bind(layoutInflater.inflate(R.layout.fragment_send_direct_payment, (ViewGroup) null, false));
    }
}
