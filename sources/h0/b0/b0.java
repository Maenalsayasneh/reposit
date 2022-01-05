package h0.b0;

import android.graphics.Matrix;
import android.view.View;

/* compiled from: ViewUtilsApi29 */
public class b0 extends a0 {
    public float b(View view) {
        return view.getTransitionAlpha();
    }

    public void d(View view, int i, int i2, int i3, int i4) {
        view.setLeftTopRightBottom(i, i2, i3, i4);
    }

    public void e(View view, float f) {
        view.setTransitionAlpha(f);
    }

    public void f(View view, int i) {
        view.setTransitionVisibility(i);
    }

    public void g(View view, Matrix matrix) {
        view.transformMatrixToGlobal(matrix);
    }

    public void h(View view, Matrix matrix) {
        view.transformMatrixToLocal(matrix);
    }
}
