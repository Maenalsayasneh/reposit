package com.instabug.bug.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import androidx.appcompat.widget.AppCompatImageView;
import com.instabug.bug.R;

public class CorneredImageView extends AppCompatImageView {
    public final RectF c = new RectF();
    public final Path d = new Path();
    public int q;
    public int x;

    public static class a extends Drawable {
        public Paint a;
        public Rect b;

        public a(int i, int i2) {
            Paint paint = new Paint();
            this.a = paint;
            paint.setColor(i);
            this.a.setStrokeWidth((float) i2);
            this.a.setStyle(Paint.Style.STROKE);
        }

        public void draw(Canvas canvas) {
            Rect rect = this.b;
            if (rect != null) {
                canvas.drawRect(rect, this.a);
            }
        }

        public int getOpacity() {
            return -1;
        }

        public void onBoundsChange(Rect rect) {
            this.b = rect;
        }

        public void setAlpha(int i) {
        }

        public void setColorFilter(ColorFilter colorFilter) {
        }
    }

    public CorneredImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.CorneredImageView);
        this.q = obtainStyledAttributes.getDimensionPixelSize(R.styleable.CorneredImageView_ib_bug_cornerRadius, 0);
        this.x = obtainStyledAttributes.getInt(R.styleable.CorneredImageView_ib_bug_roundedCorners, 0);
        obtainStyledAttributes.recycle();
    }

    public final void c() {
        this.d.rewind();
        if (((float) this.q) >= 1.0f && this.x != 0) {
            int width = getWidth();
            int height = getHeight();
            int i = this.q;
            float f = (float) (i * 2);
            float f2 = (float) (-i);
            float f3 = (float) i;
            this.c.set(f2, f2, f3, f3);
            if (d(1)) {
                this.c.offsetTo(0.0f, 0.0f);
                this.d.arcTo(this.c, 180.0f, 90.0f);
            } else {
                this.d.moveTo(0.0f, 0.0f);
            }
            if (d(2)) {
                this.c.offsetTo(((float) width) - f, 0.0f);
                this.d.arcTo(this.c, 270.0f, 90.0f);
            } else {
                this.d.lineTo((float) width, 0.0f);
            }
            if (d(4)) {
                this.c.offsetTo(((float) width) - f, ((float) height) - f);
                this.d.arcTo(this.c, 0.0f, 90.0f);
            } else {
                this.d.lineTo((float) width, (float) height);
            }
            if (d(8)) {
                this.c.offsetTo(0.0f, ((float) height) - f);
                this.d.arcTo(this.c, 90.0f, 90.0f);
            } else {
                this.d.lineTo(0.0f, (float) height);
            }
            this.d.close();
        }
    }

    public final boolean d(int i) {
        return (this.x & i) == i;
    }

    public int getRadius() {
        return this.q;
    }

    public int getRoundedCorners() {
        return this.x;
    }

    public void onDraw(Canvas canvas) {
        if (!this.d.isEmpty()) {
            canvas.clipPath(this.d);
        }
        super.onDraw(canvas);
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        c();
    }

    public void setCornerRadius(int i) {
        this.q = i;
        c();
        invalidate();
    }

    public void setRoundedCorners(int i) {
        this.x = i;
        c();
        setBackgroundDrawable(new a(0, 10));
        invalidate();
    }
}
