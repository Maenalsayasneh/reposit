package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import h0.b.f.d0;

public class FitWindowsLinearLayout extends LinearLayout {
    public d0 c;

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean fitSystemWindows(Rect rect) {
        d0 d0Var = this.c;
        if (d0Var != null) {
            d0Var.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    public void setOnFitSystemWindowsListener(d0 d0Var) {
        this.c = d0Var;
    }
}
