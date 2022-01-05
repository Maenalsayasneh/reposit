package h0.b0;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi22 */
public class z extends y {
    public static boolean f = true;

    @SuppressLint({"NewApi"})
    public void d(View view, int i, int i2, int i3, int i4) {
        if (f) {
            try {
                view.setLeftTopRightBottom(i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f = false;
            }
        }
    }
}
