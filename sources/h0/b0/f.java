package h0.b0;

import android.animation.TypeEvaluator;
import android.graphics.Rect;

/* compiled from: RectEvaluator */
public class f implements TypeEvaluator<Rect> {
    public Object evaluate(float f, Object obj, Object obj2) {
        Rect rect = (Rect) obj;
        Rect rect2 = (Rect) obj2;
        int i = rect.left;
        int i2 = i + ((int) (((float) (rect2.left - i)) * f));
        int i3 = rect.top;
        int i4 = i3 + ((int) (((float) (rect2.top - i3)) * f));
        int i5 = rect.right;
        int i6 = rect.bottom;
        return new Rect(i2, i4, i5 + ((int) (((float) (rect2.right - i5)) * f)), i6 + ((int) (((float) (rect2.bottom - i6)) * f)));
    }
}
