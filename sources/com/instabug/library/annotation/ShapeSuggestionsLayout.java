package com.instabug.library.annotation;

import android.animation.Animator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.LinearLayout;
import com.instabug.library.R;
import com.instabug.library.util.AttrResolver;

public class ShapeSuggestionsLayout extends LinearLayout {
    public static final /* synthetic */ int c = 0;
    public Handler Y1 = new Handler();
    public float d;
    public c q;
    public boolean x;
    public final Runnable y = new a();

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            ShapeSuggestionsLayout.this.a();
        }
    }

    public class b implements Animator.AnimatorListener {
        public b() {
        }

        public void onAnimationCancel(Animator animator) {
        }

        public void onAnimationEnd(Animator animator) {
            ShapeSuggestionsLayout.this.setVisibility(4);
            ShapeSuggestionsLayout.this.removeAllViews();
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    public interface c {
    }

    public final class d extends View {
        public int Y1;
        public Path c;
        public Path d;
        public Paint q;
        public RectF x;
        public int y;

        public d(Context context, Path path, int i) {
            super(context);
            this.c = path;
            Paint paint = new Paint(1);
            this.q = paint;
            paint.setStrokeWidth(4.0f);
            this.Y1 = i;
        }

        public void onDraw(Canvas canvas) {
            super.onDraw(canvas);
            this.q.setColor(this.y);
            this.q.setStyle(Paint.Style.FILL);
            RectF rectF = this.x;
            if (rectF != null) {
                float f = ShapeSuggestionsLayout.this.d;
                canvas.drawRoundRect(rectF, f, f, this.q);
            }
            this.q.setColor(this.Y1);
            this.q.setStyle(Paint.Style.STROKE);
            Path path = this.d;
            if (path != null) {
                canvas.drawPath(path, this.q);
            }
        }

        public void onMeasure(int i, int i2) {
            super.onMeasure(i, i2);
            int dimension = (int) getResources().getDimension(R.dimen.instabug_path_view_margin);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) getLayoutParams();
            layoutParams.setMargins(dimension, dimension, dimension, dimension);
            setLayoutParams(layoutParams);
            int dimension2 = (int) getResources().getDimension(R.dimen.instabug_path_view_dimen);
            setMeasuredDimension(dimension2, dimension2);
            float f = (float) dimension2;
            this.x = new RectF(0.0f, 0.0f, f, f);
            RectF rectF = new RectF(this.x);
            rectF.inset(8.0f, 8.0f);
            Path path = new Path(this.c);
            RectF rectF2 = new RectF();
            path.computeBounds(rectF2, true);
            Matrix matrix = new Matrix();
            matrix.setRectToRect(rectF2, rectF, Matrix.ScaleToFit.CENTER);
            path.transform(matrix);
            this.d = path;
        }

        public void setBackgroundColor(int i) {
            this.y = i;
            invalidate();
        }
    }

    public ShapeSuggestionsLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        setVisibility(4);
        setGravity(17);
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.d = TypedValue.applyDimension(1, 4.0f, displayMetrics);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(AttrResolver.getBackgroundColor(getContext()));
        gradientDrawable.setCornerRadius(this.d);
        gradientDrawable.setStroke((int) TypedValue.applyDimension(1, 1.5f, displayMetrics), AttrResolver.getDividerColor(getContext()));
        setBackground(gradientDrawable);
    }

    public void a() {
        Handler handler = this.Y1;
        if (handler != null) {
            handler.removeCallbacks(this.y);
        }
        if (!this.x) {
            this.x = true;
            animate().alpha(0.0f).setDuration(400).setListener(new b());
        }
    }

    public final void b(int i) {
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            getChildAt(i2).setBackgroundColor(0);
        }
        getChildAt(i).setBackgroundColor(AttrResolver.getDividerColor(getContext()));
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void c() {
        if (this.x) {
            this.x = false;
            setVisibility(0);
            animate().alpha(1.0f).setDuration(400).setListener((Animator.AnimatorListener) null);
            Handler handler = this.Y1;
            if (handler != null) {
                handler.postDelayed(this.y, 3000);
            }
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (!this.x) {
            a();
            c();
        }
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Handler handler = this.Y1;
        if (handler != null) {
            handler.removeCallbacks(this.y);
            this.Y1 = null;
        }
    }

    public void setOnShapeSelectedListener(c cVar) {
        this.q = cVar;
    }
}
