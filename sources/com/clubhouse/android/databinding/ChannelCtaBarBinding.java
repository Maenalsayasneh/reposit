package com.clubhouse.android.databinding;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.clubhouse.android.core.databinding.BottomSheetGrabHandleBinding;
import com.clubhouse.android.core.databinding.DividerLineBinding;
import com.clubhouse.app.R;
import h0.e0.a;

public final class ChannelCtaBarBinding implements a {
    public final View a;
    public final Button b;
    public final TextView c;
    public final BottomSheetGrabHandleBinding d;
    public final DividerLineBinding e;

    public ChannelCtaBarBinding(View view, DividerLineBinding dividerLineBinding, Button button, TextView textView, BottomSheetGrabHandleBinding bottomSheetGrabHandleBinding, DividerLineBinding dividerLineBinding2) {
        this.a = view;
        this.b = button;
        this.c = textView;
        this.d = bottomSheetGrabHandleBinding;
        this.e = dividerLineBinding2;
    }

    public static ChannelCtaBarBinding bind(View view) {
        int i = R.id.bottom_line;
        View findViewById = view.findViewById(R.id.bottom_line);
        if (findViewById != null) {
            DividerLineBinding bind = DividerLineBinding.bind(findViewById);
            i = R.id.cta_button;
            Button button = (Button) view.findViewById(R.id.cta_button);
            if (button != null) {
                i = R.id.cta_description;
                TextView textView = (TextView) view.findViewById(R.id.cta_description);
                if (textView != null) {
                    i = R.id.grab_handle;
                    View findViewById2 = view.findViewById(R.id.grab_handle);
                    if (findViewById2 != null) {
                        BottomSheetGrabHandleBinding bind2 = BottomSheetGrabHandleBinding.bind(findViewById2);
                        i = R.id.top_line;
                        View findViewById3 = view.findViewById(R.id.top_line);
                        if (findViewById3 != null) {
                            return new ChannelCtaBarBinding(view, bind, button, textView, bind2, DividerLineBinding.bind(findViewById3));
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
    }
}
