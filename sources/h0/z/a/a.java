package h0.z.a;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.animation.Animation;
import android.widget.ImageView;
import androidx.swiperefreshlayout.R;
import h0.i.i.q;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: CircleImageView */
public class a extends ImageView {
    public Animation.AnimationListener c;
    public int d;
    public int q;

    public a(Context context) {
        super(context);
        float f = getContext().getResources().getDisplayMetrics().density;
        this.d = (int) (3.5f * f);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(R.styleable.SwipeRefreshLayout);
        this.q = obtainStyledAttributes.getColor(R.styleable.SwipeRefreshLayout_swipeRefreshLayoutProgressSpinnerBackgroundColor, -328966);
        obtainStyledAttributes.recycle();
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        AtomicInteger atomicInteger = q.a;
        setElevation(f * 4.0f);
        shapeDrawable.getPaint().setColor(this.q);
        setBackground(shapeDrawable);
    }

    public void onAnimationEnd() {
        super.onAnimationEnd();
        Animation.AnimationListener animationListener = this.c;
        if (animationListener != null) {
            animationListener.onAnimationEnd(getAnimation());
        }
    }

    public void onAnimationStart() {
        super.onAnimationStart();
        Animation.AnimationListener animationListener = this.c;
        if (animationListener != null) {
            animationListener.onAnimationStart(getAnimation());
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
    }

    public void setBackgroundColor(int i) {
        if (getBackground() instanceof ShapeDrawable) {
            ((ShapeDrawable) getBackground()).getPaint().setColor(i);
            this.q = i;
        }
    }
}
