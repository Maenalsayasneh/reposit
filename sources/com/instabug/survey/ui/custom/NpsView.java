package com.instabug.survey.ui.custom;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.view.View;
import com.instabug.library.Instabug;
import com.instabug.library.util.AttrResolver;
import com.instabug.survey.R;
import java.util.ArrayList;

public class NpsView extends View {
    public a Y1;
    public ArrayList<Rect> Z1 = new ArrayList<>();
    public int a2;
    public int b2;
    public int c;
    public int c2;
    public int d;
    public int d2;
    public int e2;
    public int f2;
    public int g2;
    public int h2;
    public int i2;
    public int j2;
    public Paint k2;
    public Paint l2;
    public Paint m2;
    public Paint n2;
    public Paint o2;
    public Path p2;
    public int q = 11;
    public Path q2;
    public Path r2;
    public CornerPathEffect s2;
    public CornerPathEffect t2;
    public float u2;
    public float v2;
    public float w2;
    public int x = -1;
    public boolean y = false;

    public interface a {
        void g0(int i);
    }

    public NpsView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.NpsView);
            this.q = obtainStyledAttributes.getInt(R.styleable.NpsView_nps_count, 11);
            this.u2 = (float) obtainStyledAttributes.getDimensionPixelSize(R.styleable.NpsView_nps_num_text_size, (int) c(getContext(), 40.0f));
            this.g2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.NpsView_nps_selected_view_edge_size, (int) c(getContext(), 30.0f));
            this.v2 = (float) obtainStyledAttributes.getDimensionPixelSize(R.styleable.NpsView_nps_selected_num_text_size, (int) c(getContext(), 20.0f));
            this.j2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.NpsView_nps_selected_rect_size, (int) c(getContext(), 100.0f));
            this.w2 = (float) obtainStyledAttributes.getDimensionPixelSize(R.styleable.NpsView_nps_rect_corners_radius, 2);
            if (this.q == 0) {
                this.q = 1;
            }
            setCirclesRectColor(AttrResolver.resolveAttributeColor(getContext(), R.attr.survey_nps_circles_container_background));
            setBorderColor(AttrResolver.resolveAttributeColor(getContext(), R.attr.survey_nps_circles_container_border_background));
            setNumbersColor(AttrResolver.resolveAttributeColor(getContext(), R.attr.survey_nps_numbers_color));
            if (!isInEditMode()) {
                setIndicatorViewBackgroundColor(Instabug.getPrimaryColor());
            }
            setIndicatorViewTextColor(-1);
            setIndicatorViewCircleColor(-1);
            obtainStyledAttributes.recycle();
            this.q2 = new Path();
            this.r2 = new Path();
            this.p2 = new Path();
            this.l2 = new Paint(1);
            this.k2 = new TextPaint(1);
            this.m2 = new Paint(1);
            this.n2 = new Paint(1);
            this.o2 = new TextPaint(1);
            this.s2 = new CornerPathEffect(a(getContext(), 4.0f));
            this.t2 = new CornerPathEffect(this.w2);
        }
    }

    public static float a(Context context, float f) {
        return f * context.getResources().getDisplayMetrics().density;
    }

    public static float c(Context context, float f) {
        return f / context.getResources().getDisplayMetrics().density;
    }

    public final void b(float f, float f3) {
        int i = 0;
        this.y = false;
        int i3 = this.x;
        if (i3 == -1 || !this.Z1.get(i3).contains((int) f, (int) f3)) {
            while (i < this.q) {
                if (this.Z1.size() <= i || !this.Z1.get(i).contains((int) f, (int) f3)) {
                    i++;
                } else if (this.x != i) {
                    this.x = i;
                    invalidate();
                    return;
                } else {
                    return;
                }
            }
        }
    }

    public int getBorderColor() {
        return this.b2;
    }

    public int getCirclesRectColor() {
        return this.a2;
    }

    public int getIndicatorViewBackgroundColor() {
        return this.c2;
    }

    public int getIndicatorViewCircleColor() {
        return this.f2;
    }

    public int getIndicatorViewTextColor() {
        return this.e2;
    }

    public int getNumbersColor() {
        return this.d2;
    }

    public int getScore() {
        return this.x;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        this.Z1.clear();
        int width = getWidth();
        int i = this.g2;
        this.h2 = (width - (i * 2)) / this.q;
        int i3 = this.d;
        int i4 = i;
        for (int i5 = 0; i5 < this.q; i5++) {
            i += this.h2;
            this.Z1.add(new Rect(i4, 0, i, i3));
            i4 += this.h2;
        }
        this.p2.rewind();
        this.p2.moveTo((float) this.g2, (float) ((int) Math.floor(((double) this.i2) / 1.7d)));
        this.p2.lineTo((float) this.g2, (float) this.i2);
        this.p2.lineTo((float) (getWidth() - this.g2), (float) this.i2);
        this.p2.lineTo((float) (getWidth() - this.g2), (float) ((int) Math.floor(((double) this.i2) / 1.7d)));
        this.p2.close();
        this.l2.setStyle(Paint.Style.FILL);
        this.l2.setColor(getCirclesRectColor());
        this.l2.setPathEffect(this.t2);
        canvas.drawPath(this.p2, this.l2);
        this.l2.setStrokeWidth(a(getContext(), 2.0f));
        this.l2.setStyle(Paint.Style.STROKE);
        this.l2.setColor(getBorderColor());
        this.l2.setPathEffect(this.t2);
        canvas.drawRect((float) this.g2, (float) Math.floor(((double) this.i2) / 1.7d), (float) (getWidth() - this.g2), (float) this.i2, this.l2);
        int width2 = (getWidth() - (this.g2 * 2)) / this.q;
        int a3 = (int) (a(getContext(), 8.0f) + ((float) Math.round(((double) this.i2) / 1.3d)));
        this.k2.setColor(getNumbersColor());
        this.k2.setTextSize(this.u2);
        this.k2.setStyle(Paint.Style.FILL);
        this.k2.setFakeBoldText(true);
        this.k2.setTypeface(Typeface.defaultFromStyle(0));
        int i6 = (width2 / 2) + this.g2;
        float measureText = this.k2.measureText("9", 0, 1) / 2.0f;
        int i7 = (int) (((float) i6) - measureText);
        for (int i8 = 0; i8 < this.q; i8++) {
            if (i8 == 10) {
                i7 = (int) (((float) ((int) (((float) i7) + measureText))) - (this.k2.measureText("10", 0, 2) / 2.0f));
            }
            canvas.drawText(String.valueOf(i8), (float) i7, (float) a3, this.k2);
            i7 += width2;
        }
        if (this.y) {
            if (this.x != -1) {
                this.r2.reset();
                this.m2.setColor(getIndicatorViewBackgroundColor());
                int i9 = this.Z1.get(this.x).left;
                int i10 = this.Z1.get(this.x).right;
                int i11 = this.h2;
                int i12 = this.j2;
                if (i11 > i12) {
                    int i13 = (i11 - i12) / 2;
                    i9 += i13;
                    i10 -= i13;
                }
                float f = (float) i9;
                this.r2.moveTo(f, ((float) this.i2) / 1.7f);
                this.r2.lineTo(f, (float) this.i2);
                float f3 = (float) i10;
                this.r2.lineTo(f3, (float) this.i2);
                this.r2.lineTo(f3, ((float) this.i2) / 1.7f);
                this.r2.close();
                canvas.drawPath(this.r2, this.m2);
                float f4 = ((float) this.i2) / 1.3f;
                float a4 = a(getContext(), 4.0f);
                if (((float) (this.Z1.get(this.x).right - this.Z1.get(this.x).left)) > ((float) this.i2) / 1.7f) {
                    a4 /= 1.5f;
                }
                this.n2.setColor(getIndicatorViewCircleColor());
                canvas.drawCircle((float) (((i10 - i9) / 2) + i9), a(getContext(), 4.0f) + f4, a4, this.n2);
            }
        } else if (this.x != -1) {
            this.q2.reset();
            this.m2.setColor(getIndicatorViewBackgroundColor());
            this.m2.setPathEffect(this.s2);
            float f5 = (float) this.Z1.get(this.x).left;
            float f6 = (float) this.Z1.get(this.x).right;
            float f7 = (float) this.Z1.get(this.x).top;
            int i14 = this.h2;
            int i15 = this.j2;
            if (i14 > i15) {
                float f8 = ((float) (i14 - i15)) / 2.0f;
                f5 += f8;
                f6 -= f8;
            }
            float f9 = (float) this.g2;
            float f10 = f5 - f9;
            float f11 = f9 + f6;
            this.q2.moveTo(f10, f7);
            this.q2.lineTo(f10, ((float) this.i2) / 1.7f);
            this.q2.lineTo(f5, (((float) this.i2) / 1.7f) + ((float) this.g2));
            this.q2.lineTo(f5, (float) this.i2);
            this.q2.lineTo(f6, (float) this.i2);
            this.q2.lineTo(f6, (((float) this.i2) / 1.7f) + ((float) this.g2));
            this.q2.lineTo(f11, ((float) this.i2) / 1.7f);
            this.q2.lineTo(f11, 0.0f);
            this.q2.close();
            canvas.drawPath(this.q2, this.m2);
            this.o2.setColor(getIndicatorViewTextColor());
            this.o2.setTextAlign(Paint.Align.CENTER);
            this.o2.setTextSize(this.v2);
            this.o2.setTypeface(Typeface.defaultFromStyle(1));
            canvas.drawText(String.valueOf(this.x), ((f6 - f5) / 2.0f) + f5, (((float) this.i2) / 1.7f) / 1.5f, this.o2);
        }
    }

    public void onMeasure(int i, int i3) {
        super.onMeasure(i, i3);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode == 1073741824) {
            this.c = size;
        } else if (mode == Integer.MIN_VALUE) {
            this.c = Math.min(500, size);
        } else {
            this.c = 500;
        }
        if (mode2 == 1073741824) {
            this.d = size2;
        } else if (mode == Integer.MIN_VALUE) {
            this.d = Math.min(280, size2);
        } else {
            this.d = 280;
        }
        this.c = Math.abs(this.c);
        int abs = Math.abs(this.d);
        this.d = abs;
        this.i2 = abs - 2;
        setMeasuredDimension(this.c, abs);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001b, code lost:
        if (r5 != 6) goto L_0x004c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r5) {
        /*
            r4 = this;
            float r0 = r5.getX()
            float r1 = r5.getY()
            int r5 = r5.getActionMasked()
            r2 = 1
            if (r5 == 0) goto L_0x0031
            if (r5 == r2) goto L_0x0022
            r3 = 2
            if (r5 == r3) goto L_0x001e
            r3 = 3
            if (r5 == r3) goto L_0x0022
            r3 = 5
            if (r5 == r3) goto L_0x0031
            r0 = 6
            if (r5 == r0) goto L_0x0022
            goto L_0x004c
        L_0x001e:
            r4.b(r0, r1)
            goto L_0x004c
        L_0x0022:
            r4.y = r2
            r4.invalidate()
            com.instabug.survey.ui.custom.NpsView$a r5 = r4.Y1
            if (r5 == 0) goto L_0x004c
            int r0 = r4.x
            r5.g0(r0)
            goto L_0x004c
        L_0x0031:
            r4.b(r0, r1)
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r0 = "onTouchEvent: NPS view touch rect : "
            r5.append(r0)
            int r0 = r4.x
            r5.append(r0)
            java.lang.String r5 = r5.toString()
            java.lang.String r0 = "NPS"
            android.util.Log.d(r0, r5)
        L_0x004c:
            r4.invalidate()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.survey.ui.custom.NpsView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setBorderColor(int i) {
        this.b2 = i;
    }

    public void setCirclesRectColor(int i) {
        this.a2 = i;
    }

    public void setIndicatorViewBackgroundColor(int i) {
        this.c2 = i;
    }

    public void setIndicatorViewCircleColor(int i) {
        this.f2 = i;
    }

    public void setIndicatorViewTextColor(int i) {
        this.e2 = i;
    }

    public void setNumbersColor(int i) {
        this.d2 = i;
    }

    public void setOnSelectionListener(a aVar) {
        this.Y1 = aVar;
    }

    public void setScore(int i) {
        this.x = i;
        this.y = true;
        postInvalidate();
    }
}
