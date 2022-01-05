package h0.b.f;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.PopupWindow;
import androidx.appcompat.R;
import h0.b.b.a.a;

/* compiled from: AppCompatPopupWindow */
public class n extends PopupWindow {
    public n(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.PopupWindow, i, i2);
        int i3 = R.styleable.PopupWindow_overlapAnchor;
        if (obtainStyledAttributes.hasValue(i3)) {
            setOverlapAnchor(obtainStyledAttributes.getBoolean(i3, false));
        }
        int i4 = R.styleable.PopupWindow_android_popupBackground;
        if (!obtainStyledAttributes.hasValue(i4) || (resourceId = obtainStyledAttributes.getResourceId(i4, 0)) == 0) {
            drawable = obtainStyledAttributes.getDrawable(i4);
        } else {
            drawable = a.a(context, resourceId);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }

    public void showAsDropDown(View view, int i, int i2) {
        super.showAsDropDown(view, i, i2);
    }

    public void update(View view, int i, int i2, int i3, int i4) {
        super.update(view, i, i2, i3, i4);
    }

    public void showAsDropDown(View view, int i, int i2, int i3) {
        super.showAsDropDown(view, i, i2, i3);
    }
}
