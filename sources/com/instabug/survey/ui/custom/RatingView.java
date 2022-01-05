package com.instabug.survey.ui.custom;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.survey.R;

public class RatingView extends View {
    public float Y1;
    public float Z1;
    public a a2;
    public float b2;
    public int c = getResources().getColor(R.color.survey_rate_selected);
    public float c2;
    public int d;
    public float d2;
    public b e2;
    public View.OnClickListener f2;
    public boolean g2;
    public float[] h2;
    public RectF i2;
    public RectF j2;
    public Canvas k2;
    public Bitmap l2;
    public Path m2;
    public Paint n2;
    public CornerPathEffect o2;
    public Paint p2;
    public int q;
    public Paint q2;
    public Paint r2;
    public float s2;
    public int t2 = 5;
    public float u2 = 2.14748365E9f;
    public float v2 = 2.14748365E9f;
    public float w2 = ((float) ((int) a(4.0f, 0)));
    public int x;
    public int y;

    public enum a {
        Left(0),
        Right(1);
        
        public int id;

        private a(int i) {
            this.id = i;
        }

        public static a a(int i) {
            a[] values = values();
            for (int i2 = 0; i2 < 2; i2++) {
                a aVar = values[i2];
                if (aVar.id == i) {
                    return aVar;
                }
            }
            Log.w("RatingView", String.format("Gravity chosen is neither 'left' nor 'right', I will set it to Left", new Object[0]));
            return Left;
        }
    }

    public interface b {
        void u0(RatingView ratingView, float f, boolean z);
    }

    public RatingView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i;
        if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
            i = getResources().getColor(R.color.survey_rate_unselected_light);
        } else {
            i = getResources().getColor(R.color.survey_rate_unselected_dark);
        }
        this.d = i;
        this.q = 0;
        this.x = this.c;
        this.y = i;
        this.t2 = 5;
        this.w2 = (float) ((int) a(16.0f, 0));
        this.v2 = (float) ((int) a(InstabugDeviceProperties.isTablet(getContext()) ? 80.0f : 52.0f, 0));
        this.u2 = 2.14748365E9f;
        this.Y1 = 1.0f;
        this.b2 = 5.0f;
        this.c2 = 1.0f;
        this.Z1 = 0.0f;
        this.a2 = a.a(a.Left.id);
        this.m2 = new Path();
        this.o2 = new CornerPathEffect(this.c2);
        Paint paint = new Paint(5);
        this.n2 = paint;
        paint.setStyle(Paint.Style.FILL_AND_STROKE);
        this.n2.setAntiAlias(true);
        this.n2.setDither(true);
        this.n2.setStrokeJoin(Paint.Join.ROUND);
        this.n2.setStrokeCap(Paint.Cap.ROUND);
        this.n2.setColor(-16777216);
        this.n2.setPathEffect(this.o2);
        Paint paint2 = new Paint(5);
        this.p2 = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        this.p2.setStrokeJoin(Paint.Join.ROUND);
        this.p2.setStrokeCap(Paint.Cap.ROUND);
        this.p2.setStrokeWidth(this.b2);
        this.p2.setPathEffect(this.o2);
        Paint paint3 = new Paint(5);
        this.q2 = paint3;
        paint3.setStyle(Paint.Style.FILL_AND_STROKE);
        this.q2.setAntiAlias(true);
        this.q2.setDither(true);
        this.q2.setStrokeJoin(Paint.Join.ROUND);
        this.q2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint4 = new Paint(5);
        this.r2 = paint4;
        paint4.setStyle(Paint.Style.FILL_AND_STROKE);
        this.r2.setAntiAlias(true);
        this.r2.setDither(true);
        this.r2.setStrokeJoin(Paint.Join.ROUND);
        this.r2.setStrokeCap(Paint.Cap.ROUND);
        this.s2 = TypedValue.applyDimension(1, 30.0f, getResources().getDisplayMetrics());
    }

    public final float a(float f, int i) {
        if (i != 0) {
            return i != 2 ? f : TypedValue.applyDimension(2, f, getResources().getDisplayMetrics());
        }
        return TypedValue.applyDimension(1, f, getResources().getDisplayMetrics());
    }

    public final int b(float f, boolean z) {
        int i;
        int round = Math.round(f);
        if (z) {
            i = getPaddingBottom() + getPaddingTop();
        } else {
            i = 0;
        }
        return round + i;
    }

    public final void c(float f, float f3) {
        if (this.a2 != a.Left) {
            f = ((float) getWidth()) - f;
        }
        RectF rectF = this.i2;
        if (rectF != null) {
            float f4 = rectF.left;
            if (f < f4) {
                this.Z1 = 0.0f;
            } else if (f > rectF.right) {
                this.Z1 = (float) this.t2;
            } else {
                float width = (((float) this.t2) / rectF.width()) * (f - f4);
                this.Z1 = width;
                float f5 = this.Y1;
                float f6 = width % f5;
                if (f6 < f5 / 4.0f) {
                    float f7 = width - f6;
                    this.Z1 = f7;
                    this.Z1 = Math.max(0.0f, f7);
                    return;
                }
                float f8 = (width - f6) + f5;
                this.Z1 = f8;
                this.Z1 = Math.min((float) this.t2, f8);
            }
        }
    }

    public void d(float f, boolean z) {
        b bVar;
        float f3 = 0.0f;
        if (f < 0.0f) {
            Log.w("RatingView", String.format("Assigned rating is less than 0 (%f < 0), I will set it to exactly 0", new Object[]{Float.valueOf(f)}));
        } else if (f > ((float) this.t2)) {
            Log.w("RatingView", String.format("Assigned rating is greater than numberOfStars (%f > %d), I will set it to exactly numberOfStars", new Object[]{Float.valueOf(f), Integer.valueOf(this.t2)}));
            f3 = (float) this.t2;
        } else {
            f3 = f;
        }
        this.Z1 = f3;
        invalidate();
        if (z && (bVar = this.e2) != null) {
            bVar.u0(this, f, false);
        }
    }

    public final void e(Canvas canvas, float f, float f3, float f4, a aVar) {
        float f5 = this.d2 * f4;
        if (this.h2 != null) {
            this.m2.reset();
            Path path = this.m2;
            float[] fArr = this.h2;
            path.moveTo(fArr[0] + f, fArr[1] + f3);
            int i = 2;
            while (true) {
                float[] fArr2 = this.h2;
                if (i >= fArr2.length) {
                    break;
                }
                this.m2.lineTo(fArr2[i] + f, fArr2[i + 1] + f3);
                i += 2;
            }
            this.m2.close();
            canvas.drawPath(this.m2, this.n2);
            if (aVar == a.Left) {
                float f6 = f + f5;
                float f7 = this.d2;
                canvas.drawRect(f, f3, (0.02f * f7) + f6, f3 + f7, this.r2);
                float f8 = this.d2;
                canvas.drawRect(f6, f3, f + f8, f3 + f8, this.q2);
                return;
            }
            float f9 = this.d2;
            float f10 = f + f9;
            canvas.drawRect(f10 - ((0.02f * f9) + f5), f3, f10, f3 + f9, this.r2);
            float f11 = this.d2;
            canvas.drawRect(f, f3, (f + f11) - f5, f3 + f11, this.q2);
        }
    }

    public final int f(float f, int i, float f3, boolean z) {
        int i3;
        int round = Math.round((f3 * ((float) (i - 1))) + (f * ((float) i)));
        if (z) {
            i3 = getPaddingRight() + getPaddingLeft();
        } else {
            i3 = 0;
        }
        return round + i3;
    }

    public int getFillColor() {
        return this.c;
    }

    public a getGravity() {
        return this.a2;
    }

    public float getRating() {
        return this.Z1;
    }

    public void onDraw(Canvas canvas) {
        Canvas canvas2;
        super.onDraw(canvas);
        int height = getHeight();
        if (getWidth() != 0 && height != 0 && (canvas2 = this.k2) != null) {
            canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
            if (this.g2) {
                this.p2.setColor(this.q);
                this.r2.setColor(this.x);
                if (this.x != 0) {
                    this.r2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
                } else {
                    this.r2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                this.q2.setColor(this.y);
                if (this.y != 0) {
                    this.q2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
                } else {
                    this.q2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
            } else {
                this.p2.setColor(0);
                this.r2.setColor(this.c);
                if (this.c != 0) {
                    this.r2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
                } else {
                    this.r2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
                this.q2.setColor(this.d);
                if (this.d != 0) {
                    this.q2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_ATOP));
                } else {
                    this.q2.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
                }
            }
            if (this.a2 == a.Left) {
                Canvas canvas3 = this.k2;
                float f = this.Z1;
                RectF rectF = this.i2;
                if (rectF != null) {
                    float f3 = rectF.left;
                    float f4 = rectF.top;
                    float f5 = f;
                    float f6 = f3;
                    for (int i = 0; i < this.t2; i++) {
                        if (f5 >= 1.0f) {
                            e(canvas3, f6, f4, 1.0f, a.Left);
                            f5 -= 1.0f;
                        } else {
                            e(canvas3, f6, f4, f5, a.Left);
                            f5 = 0.0f;
                        }
                        f6 += this.w2 + this.d2;
                    }
                }
            } else {
                Canvas canvas4 = this.k2;
                float f7 = this.Z1;
                RectF rectF2 = this.i2;
                if (rectF2 != null) {
                    float f8 = rectF2.top;
                    float f9 = f7;
                    float f10 = rectF2.right - this.d2;
                    for (int i3 = 0; i3 < this.t2; i3++) {
                        if (f9 >= 1.0f) {
                            e(canvas4, f10, f8, 1.0f, a.Right);
                            f9 -= 1.0f;
                        } else {
                            e(canvas4, f10, f8, f9, a.Right);
                            f9 = 0.0f;
                        }
                        f10 -= this.w2 + this.d2;
                    }
                }
            }
            if (this.g2) {
                canvas.drawColor(0);
            } else {
                canvas.drawColor(0);
            }
            Bitmap bitmap = this.l2;
            if (bitmap != null) {
                canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            }
        }
    }

    public void onLayout(boolean z, int i, int i3, int i4, int i5) {
        float f;
        super.onLayout(z, i, i3, i4, i5);
        int width = getWidth();
        int height = getHeight();
        float f3 = this.u2;
        if (f3 == 2.14748365E9f) {
            float f4 = this.v2;
            if (f4 != 2.14748365E9f) {
                float b3 = (float) b(this.v2, true);
                if (((float) f(f4, this.t2, this.w2, true)) >= ((float) width) || b3 >= ((float) height)) {
                    float f5 = this.w2;
                    int i6 = this.t2;
                    f = Math.min((((float) ((width - getPaddingLeft()) - getPaddingRight())) - (f5 * ((float) (i6 - 1)))) / ((float) i6), (float) ((height - getPaddingTop()) - getPaddingBottom()));
                } else {
                    f = this.v2;
                }
            } else {
                float f6 = this.w2;
                int i7 = this.t2;
                f = Math.min((((float) ((width - getPaddingLeft()) - getPaddingRight())) - (f6 * ((float) (i7 - 1)))) / ((float) i7), (float) ((height - getPaddingTop()) - getPaddingBottom()));
            }
            this.d2 = f;
        } else {
            this.d2 = f3;
        }
        float f7 = (float) f(this.d2, this.t2, this.w2, false);
        float b4 = (float) b(this.d2, false);
        float paddingLeft = ((((float) ((width - getPaddingLeft()) - getPaddingRight())) / 2.0f) - (f7 / 2.0f)) + ((float) getPaddingLeft());
        float paddingTop = ((((float) ((height - getPaddingTop()) - getPaddingBottom())) / 2.0f) - (b4 / 2.0f)) + ((float) getPaddingTop());
        RectF rectF = new RectF(paddingLeft, paddingTop, f7 + paddingLeft, b4 + paddingTop);
        this.i2 = rectF;
        float width2 = rectF.width() * 0.05f;
        RectF rectF2 = this.i2;
        this.j2 = new RectF(rectF2.left - width2, rectF2.top, rectF2.right + width2, rectF2.bottom);
        float f8 = this.d2;
        float f9 = 0.2f * f8;
        float f10 = 0.35f * f8;
        float f11 = 0.5f * f8;
        float f12 = 0.05f * f8;
        float f13 = 0.03f * f8;
        float f14 = 0.38f * f8;
        float f15 = 0.32f * f8;
        float f16 = 0.6f * f8;
        float f17 = f8 - f13;
        float f18 = f8 - f12;
        this.h2 = new float[]{f13, f14, f13 + f10, f14, f11, f12, f17 - f10, f14, f17, f14, f8 - f15, f16, f8 - f9, f18, f11, f8 - (0.27f * f8), f9, f18, f15, f16};
    }

    public void onMeasure(int i, int i3) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i3);
        int size2 = View.MeasureSpec.getSize(i3);
        if (mode != 1073741824) {
            if (mode == Integer.MIN_VALUE) {
                float f = this.u2;
                if (f != 2.14748365E9f) {
                    size = Math.min(f(f, this.t2, this.w2, true), size);
                } else {
                    float f3 = this.v2;
                    if (f3 != 2.14748365E9f) {
                        size = Math.min(f(f3, this.t2, this.w2, true), size);
                    } else {
                        size = Math.min(f(this.s2, this.t2, this.w2, true), size);
                    }
                }
            } else {
                float f4 = this.u2;
                if (f4 != 2.14748365E9f) {
                    size = f(f4, this.t2, this.w2, true);
                } else {
                    float f5 = this.v2;
                    if (f5 != 2.14748365E9f) {
                        size = f(f5, this.t2, this.w2, true);
                    } else {
                        size = f(this.s2, this.t2, this.w2, true);
                    }
                }
            }
        }
        float f6 = this.w2;
        int i4 = this.t2;
        float paddingLeft = (((float) ((size - getPaddingLeft()) - getPaddingRight())) - (f6 * ((float) (i4 - 1)))) / ((float) i4);
        if (mode2 != 1073741824) {
            if (mode2 == Integer.MIN_VALUE) {
                float f7 = this.u2;
                if (f7 != 2.14748365E9f) {
                    size2 = Math.min(b(f7, true), size2);
                } else {
                    float f8 = this.v2;
                    if (f8 != 2.14748365E9f) {
                        size2 = Math.min(b(f8, true), size2);
                    } else {
                        size2 = Math.min(b(paddingLeft, true), size2);
                    }
                }
            } else {
                float f9 = this.u2;
                if (f9 != 2.14748365E9f) {
                    size2 = b(f9, true);
                } else {
                    float f10 = this.v2;
                    if (f10 != 2.14748365E9f) {
                        size2 = b(f10, true);
                    } else {
                        size2 = b(paddingLeft, true);
                    }
                }
            }
        }
        setMeasuredDimension(size, size2);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable != null) {
            c cVar = (c) parcelable;
            super.onRestoreInstanceState(cVar.getSuperState());
            d(cVar.c, false);
        }
    }

    public Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        new c(onSaveInstanceState).c = getRating();
        return null;
    }

    public void onSizeChanged(int i, int i3, int i4, int i5) {
        super.onSizeChanged(i, i3, i4, i5);
        Bitmap bitmap = this.l2;
        if (bitmap != null) {
            bitmap.recycle();
        }
        if (i > 0 && i3 > 0) {
            Bitmap createBitmap = Bitmap.createBitmap(i, i3, Bitmap.Config.ARGB_8888);
            this.l2 = createBitmap;
            if (createBitmap != null) {
                createBitmap.eraseColor(0);
                this.k2 = new Canvas(this.l2);
            }
        }
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        b bVar;
        int action = motionEvent.getAction() & 255;
        if (action != 0) {
            if (action == 1) {
                c(motionEvent.getX(), motionEvent.getY());
                View.OnClickListener onClickListener = this.f2;
                if (onClickListener != null) {
                    onClickListener.onClick(this);
                }
                b bVar2 = this.e2;
                if (bVar2 != null) {
                    bVar2.u0(this, this.Z1, true);
                }
                this.g2 = false;
            } else if (action != 2) {
                if (action == 3) {
                    b bVar3 = this.e2;
                    if (bVar3 != null) {
                        bVar3.u0(this, this.Z1, true);
                    }
                    this.g2 = false;
                }
            }
            invalidate();
            return true;
        }
        RectF rectF = this.j2;
        if (rectF == null || !rectF.contains(motionEvent.getX(), motionEvent.getY())) {
            if (this.g2 && (bVar = this.e2) != null) {
                bVar.u0(this, this.Z1, true);
            }
            this.g2 = false;
            return false;
        }
        this.g2 = true;
        c(motionEvent.getX(), motionEvent.getY());
        invalidate();
        return true;
    }

    public void setFillColor(int i) {
        this.c = i;
        invalidate();
    }

    public void setGravity(a aVar) {
        this.a2 = aVar;
        invalidate();
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.f2 = onClickListener;
    }

    public void setOnRatingBarChangeListener(b bVar) {
        this.e2 = bVar;
    }

    public static class c extends View.BaseSavedState {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public float c = 0.0f;

        public static class a implements Parcelable.Creator<c> {
            public Object createFromParcel(Parcel parcel) {
                return new c(parcel);
            }

            public Object[] newArray(int i) {
                return new c[i];
            }
        }

        public c(Parcel parcel) {
            super(parcel);
            this.c = parcel.readFloat();
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.c);
        }

        public c(Parcelable parcelable) {
            super(parcelable);
        }
    }
}
