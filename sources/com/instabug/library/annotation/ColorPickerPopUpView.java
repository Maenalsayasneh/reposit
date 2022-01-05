package com.instabug.library.annotation;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import com.instabug.library.R;
import com.instabug.library.annotation.AnnotationLayout;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.view.ViewUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class ColorPickerPopUpView extends View {
    public static final int c = Color.argb(255, 247, 247, 247);
    public int[] Y1 = {-65536, -15925503, -65028, -15893761, -33280, -1024, -4737097};
    public int Z1;
    public List<a> a2;
    public RectF d;
    public c q;
    public int x;
    public b y;

    public static class a {
        public RectF a = new RectF();
        public int b;
        public boolean c;

        public a(int i) {
            this.b = i;
        }
    }

    public interface b {
    }

    public enum c {
        PORTRAIT,
        LANDSCAPE
    }

    public ColorPickerPopUpView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.ColorPickerPopUpView, 0, 0);
        c screenOrientation = getScreenOrientation();
        c cVar = c.PORTRAIT;
        this.q = screenOrientation != cVar ? c.LANDSCAPE : cVar;
        obtainStyledAttributes.recycle();
        this.x = c;
        this.a2 = new ArrayList();
        for (int aVar : this.Y1) {
            this.a2.add(new a(aVar));
        }
        setSelectedColor(0);
    }

    private c getScreenOrientation() {
        if (getResources().getConfiguration().orientation == 2) {
            return c.LANDSCAPE;
        }
        return c.PORTRAIT;
    }

    private void setSelectedColor(int i) {
        this.Z1 = this.Y1[i];
        int i2 = 0;
        while (i2 < this.a2.size()) {
            this.a2.get(i2).c = i2 == i;
            i2++;
        }
        invalidate();
        b bVar = this.y;
        if (bVar != null) {
            int i3 = this.Z1;
            AnnotationLayout.e eVar = (AnnotationLayout.e) bVar;
            AnnotationLayout.this.annotationView.setDrawingColor(i3);
            AnnotationLayout.this.colorPicker.setVisibility(8);
            AnnotationLayout.this.brushIndicator.setBackgroundColor(i3);
        }
    }

    public int getSelectedColor() {
        return this.Z1;
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        c screenOrientation = getScreenOrientation();
        c cVar = c.PORTRAIT;
        if (screenOrientation != cVar) {
            cVar = c.LANDSCAPE;
        }
        this.q = cVar;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Path path = new Path();
        RectF rectF = this.d;
        if (rectF != null) {
            path.moveTo(rectF.left, rectF.top);
            path.lineTo(this.d.width(), this.d.top);
            path.lineTo(this.d.width(), this.d.height() + 200.0f);
            RectF rectF2 = this.d;
            path.lineTo(rectF2.left, rectF2.height() + 200.0f);
            RectF rectF3 = this.d;
            path.lineTo(rectF3.left, rectF3.top);
            path.close();
        }
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(this.x);
        canvas.drawPath(path, paint);
        canvas.save();
        canvas.restore();
        for (a next : this.a2) {
            RectF rectF4 = next.a;
            int i = next.b;
            float f = rectF4.left;
            RectF rectF5 = new RectF(f, rectF4.top, ((float) Math.floor((double) (rectF4.height() + 0.5f))) + f, rectF4.top + ((float) Math.floor((double) (rectF4.height() + 0.5f))));
            Path path2 = new Path();
            path2.addOval(rectF5, Path.Direction.CW);
            Paint paint2 = new Paint(1);
            paint2.setStyle(Paint.Style.FILL);
            paint2.setColor(i);
            canvas.drawPath(path2, paint2);
            if (next.c) {
                Path path3 = new Path();
                path3.moveTo(i0.d.a.a.a.b(rectF4, 0.20313f, rectF4.left), (rectF4.height() * 0.51758f) + rectF4.top);
                path3.lineTo(i0.d.a.a.a.b(rectF4, 0.39844f, rectF4.left), (rectF4.height() * 0.71875f) + rectF4.top);
                path3.lineTo(i0.d.a.a.a.b(rectF4, 0.79492f, rectF4.left), (rectF4.height() * 0.33008f) + rectF4.top);
                path3.lineTo(i0.d.a.a.a.b(rectF4, 0.74805f, rectF4.left), (rectF4.height() * 0.28125f) + rectF4.top);
                path3.lineTo(i0.d.a.a.a.b(rectF4, 0.39844f, rectF4.left), (rectF4.height() * 0.625f) + rectF4.top);
                path3.lineTo(i0.d.a.a.a.b(rectF4, 0.25f, rectF4.left), (rectF4.height() * 0.47266f) + rectF4.top);
                path3.lineTo(i0.d.a.a.a.b(rectF4, 0.20313f, rectF4.left), (rectF4.height() * 0.51758f) + rectF4.top);
                path3.close();
                Paint paint3 = new Paint(1);
                paint3.setStyle(Paint.Style.FILL);
                paint3.setColor(-1);
                canvas.drawPath(path3, paint3);
            }
        }
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int measuredWidth = getMeasuredWidth();
        setMeasuredDimension(measuredWidth, (measuredWidth * 55) / 426);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            this.Z1 = bundle.getInt("selected_color");
            parcelable = bundle.getParcelable("instabug_color_picker");
            int[] iArr = this.Y1;
            int i = this.Z1;
            int i2 = 0;
            int i3 = 0;
            while (true) {
                if (i3 >= iArr.length) {
                    break;
                } else if (iArr[i3] == i) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            setSelectedColor(i2);
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("instabug_color_picker", super.onSaveInstanceState());
        bundle.putInt("selected_color", this.Z1);
        return bundle;
    }

    public void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.q == c.LANDSCAPE) {
            float f = ((float) (i * 55)) / 406.0f;
            if (InstabugDeviceProperties.isTablet(getContext())) {
                this.d = new RectF(0.0f, (float) ViewUtils.convertDpToPx(getContext(), 110.0f), (float) i, f);
            } else {
                this.d = new RectF(0.0f, (float) ViewUtils.convertDpToPx(getContext(), 50.0f), (float) i, f);
            }
        } else {
            float f2 = ((float) (i * 55)) / 420.0f;
            if (InstabugDeviceProperties.isTablet(getContext())) {
                this.d = new RectF(0.0f, (float) ViewUtils.convertDpToPx(getContext(), 60.0f), (float) i, f2);
            } else {
                this.d = new RectF(0.0f, (float) ViewUtils.convertDpToPx(getContext(), 16.0f), (float) i, f2);
            }
        }
        RectF rectF = this.d;
        float floor = rectF.left + ((float) Math.floor((double) ((rectF.width() * 0.04429f) + 0.5f)));
        RectF rectF2 = this.d;
        float floor2 = rectF2.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF2, 0.2f, 0.5f)));
        RectF rectF3 = this.d;
        float floor3 = rectF3.left + ((float) Math.floor((double) ((rectF3.width() * 0.09857f) + 0.5f)));
        RectF rectF4 = this.d;
        this.a2.get(0).a = new RectF(floor, floor2, floor3, rectF4.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF4, 0.66504f, 0.5f))));
        RectF rectF5 = this.d;
        float floor4 = rectF5.left + ((float) Math.floor((double) ((rectF5.width() * 0.18714f) + 0.5f)));
        RectF rectF6 = this.d;
        float floor5 = rectF6.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF6, 0.2f, 0.5f)));
        RectF rectF7 = this.d;
        float floor6 = rectF7.left + ((float) Math.floor((double) ((rectF7.width() * 0.24143f) + 0.5f)));
        RectF rectF8 = this.d;
        this.a2.get(1).a = new RectF(floor4, floor5, floor6, rectF8.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF8, 0.66504f, 0.5f))));
        RectF rectF9 = this.d;
        float floor7 = rectF9.left + ((float) Math.floor((double) ((rectF9.width() * 0.33f) + 0.5f)));
        RectF rectF10 = this.d;
        float floor8 = rectF10.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF10, 0.2f, 0.5f)));
        RectF rectF11 = this.d;
        float floor9 = rectF11.left + ((float) Math.floor((double) ((rectF11.width() * 0.38429f) + 0.5f)));
        RectF rectF12 = this.d;
        this.a2.get(2).a = new RectF(floor7, floor8, floor9, rectF12.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF12, 0.66504f, 0.5f))));
        RectF rectF13 = this.d;
        float floor10 = rectF13.left + ((float) Math.floor((double) ((rectF13.width() * 0.47286f) + 0.5f)));
        RectF rectF14 = this.d;
        float floor11 = rectF14.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF14, 0.2f, 0.5f)));
        RectF rectF15 = this.d;
        float floor12 = rectF15.left + ((float) Math.floor((double) ((rectF15.width() * 0.52714f) + 0.5f)));
        RectF rectF16 = this.d;
        this.a2.get(3).a = new RectF(floor10, floor11, floor12, rectF16.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF16, 0.66504f, 0.5f))));
        RectF rectF17 = this.d;
        float floor13 = rectF17.left + ((float) Math.floor((double) ((rectF17.width() * 0.61571f) + 0.5f)));
        RectF rectF18 = this.d;
        float floor14 = rectF18.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF18, 0.2f, 0.5f)));
        RectF rectF19 = this.d;
        float floor15 = rectF19.left + ((float) Math.floor((double) ((rectF19.width() * 0.67f) + 0.5f)));
        RectF rectF20 = this.d;
        this.a2.get(4).a = new RectF(floor13, floor14, floor15, rectF20.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF20, 0.66504f, 0.5f))));
        RectF rectF21 = this.d;
        float floor16 = rectF21.left + ((float) Math.floor((double) ((rectF21.width() * 0.75857f) + 0.5f)));
        RectF rectF22 = this.d;
        float floor17 = rectF22.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF22, 0.2f, 0.5f)));
        RectF rectF23 = this.d;
        float floor18 = rectF23.left + ((float) Math.floor((double) ((rectF23.width() * 0.81286f) + 0.5f)));
        RectF rectF24 = this.d;
        this.a2.get(5).a = new RectF(floor16, floor17, floor18, rectF24.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF24, 0.66504f, 0.5f))));
        RectF rectF25 = this.d;
        float floor19 = rectF25.left + ((float) Math.floor((double) ((rectF25.width() * 0.90143f) + 0.5f)));
        RectF rectF26 = this.d;
        float floor20 = rectF26.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF26, 0.2f, 0.5f)));
        RectF rectF27 = this.d;
        float floor21 = rectF27.left + ((float) Math.floor((double) ((rectF27.width() * 0.95571f) + 0.5f)));
        RectF rectF28 = this.d;
        this.a2.get(6).a = new RectF(floor19, floor20, floor21, rectF28.top + ((float) Math.floor((double) i0.d.a.a.a.b(rectF28, 0.66504f, 0.5f))));
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (actionMasked == 1) {
            int i = 0;
            while (true) {
                if (i >= this.a2.size()) {
                    break;
                }
                a aVar = this.a2.get(i);
                Objects.requireNonNull(aVar);
                RectF rectF = new RectF();
                rectF.set(aVar.a);
                rectF.inset((-aVar.a.width()) / 3.0f, (-aVar.a.height()) / 3.0f);
                if (rectF.contains(x2, y2)) {
                    setSelectedColor(i);
                    break;
                }
                i++;
            }
        }
        return true;
    }

    public void setColors(int[] iArr) {
        this.Y1 = Arrays.copyOf(iArr, iArr.length);
    }

    public void setOnColorSelectionListener(b bVar) {
        this.y = bVar;
    }

    public void setOrientation(c cVar) {
        this.q = cVar;
    }

    public void setPopUpBackgroundColor(int i) {
        this.x = i;
        invalidate();
    }
}
