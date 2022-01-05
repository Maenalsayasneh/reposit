package h0.b0;

import android.annotation.SuppressLint;
import android.view.View;

/* compiled from: ViewUtilsApi19 */
public class x extends c0 {
    public static boolean c = true;

    public void a(View view) {
    }

    @SuppressLint({"NewApi"})
    public float b(View view) {
        if (c) {
            try {
                return view.getTransitionAlpha();
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        return view.getAlpha();
    }

    public void c(View view) {
    }

    @SuppressLint({"NewApi"})
    public void e(View view, float f) {
        if (c) {
            try {
                view.setTransitionAlpha(f);
                return;
            } catch (NoSuchMethodError unused) {
                c = false;
            }
        }
        view.setAlpha(f);
    }
}
