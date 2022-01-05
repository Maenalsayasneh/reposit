package h0.b0;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi21 */
public class y extends x {
    public static boolean d = true;
    public static boolean e = true;

    @SuppressLint({"NewApi"})
    public void g(View view, Matrix matrix) {
        if (d) {
            try {
                view.transformMatrixToGlobal(matrix);
            } catch (NoSuchMethodError unused) {
                d = false;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void h(View view, Matrix matrix) {
        if (e) {
            try {
                view.transformMatrixToLocal(matrix);
            } catch (NoSuchMethodError unused) {
                e = false;
            }
        }
    }
}
