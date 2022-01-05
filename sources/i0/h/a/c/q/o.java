package i0.h.a.c.q;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* compiled from: VisibilityAwareImageButton */
public class o extends ImageButton {
    public int c = getVisibility();

    public o(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void b(int i, boolean z) {
        super.setVisibility(i);
        if (z) {
            this.c = i;
        }
    }

    public final int getUserSetVisibility() {
        return this.c;
    }

    public void setVisibility(int i) {
        super.setVisibility(i);
        this.c = i;
    }

    public o(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
