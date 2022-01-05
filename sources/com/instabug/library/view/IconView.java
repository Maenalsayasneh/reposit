package com.instabug.library.view;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.widget.TextView;
import com.instabug.library.R;
import h0.i.b.d.h;
import i0.j.e.c1.b;
import i0.j.e.z0.a;

public class IconView extends TextView {
    public static final int ANDROID_ACTIONBAR_ICON_SIZE_DP = 24;
    public static final int ANDROID_ACTIONBAR_ICON_SIZE_PADDING_DP = 1;
    public int backgroundColor;
    public Paint paint;
    public int strokeColor;
    public float strokeWidth;

    public IconView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void setActionBarPadding() {
        setPadding(ViewUtils.convertDpToPx(getContext(), 1.0f));
    }

    private void setActionBarSize() {
        setTextSize(1, 24.0f);
    }

    public void onDraw(Canvas canvas) {
        Paint paint2 = this.paint;
        if (paint2 != null) {
            paint2.setColor(this.backgroundColor);
            this.paint.setStyle(Paint.Style.FILL);
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, Math.min(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f) - (this.strokeWidth / 2.0f), this.paint);
            this.paint.setStrokeWidth(this.strokeWidth);
            this.paint.setColor(this.strokeColor);
            this.paint.setStyle(Paint.Style.STROKE);
            canvas.drawCircle(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f, Math.min(((float) getWidth()) / 2.0f, ((float) getHeight()) / 2.0f) - (this.strokeWidth / 2.0f), this.paint);
        }
        super.onDraw(canvas);
    }

    public void setBackgroundColor(int i) {
        this.backgroundColor = i;
        invalidate();
    }

    public void setPadding(int i) {
        setPadding(i, i, i, i);
    }

    public void setStrokeColor(int i) {
        this.strokeColor = i;
        invalidate();
    }

    public void setStrokeWidth(float f) {
        this.strokeWidth = f;
        invalidate();
    }

    public IconView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public IconView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.backgroundColor = 0;
        this.strokeWidth = 0.0f;
        this.strokeColor = 0;
        if (!isInEditMode()) {
            setTypeface(h.a(context, R.font.ibg_font_icons));
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.IconView);
            if (!obtainStyledAttributes.hasValue(R.styleable.IconView_android_textSize)) {
                setActionBarSize();
            }
            if (!obtainStyledAttributes.hasValue(R.styleable.IconView_android_padding)) {
                setActionBarPadding();
            }
            if (!obtainStyledAttributes.hasValue(R.styleable.IconView_android_textColor)) {
                setTextColor(a.a().b);
            }
            int i2 = obtainStyledAttributes.getInt(R.styleable.IconView_instabug_icon, -1);
            if (i2 != -1) {
                setText(b.b(i2));
            }
            obtainStyledAttributes.recycle();
            this.paint = new Paint(1);
        }
    }
}
