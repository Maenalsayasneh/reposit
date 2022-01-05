package h0.z.a;

import android.view.animation.Animation;
import android.view.animation.Transformation;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

/* compiled from: SwipeRefreshLayout */
public class e extends Animation {
    public final /* synthetic */ SwipeRefreshLayout c;

    public e(SwipeRefreshLayout swipeRefreshLayout) {
        this.c = swipeRefreshLayout;
    }

    public void applyTransformation(float f, Transformation transformation) {
        this.c.setAnimationProgress(f);
    }
}
