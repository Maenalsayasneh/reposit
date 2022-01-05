package com.instabug.featuresrequest.ui.custom;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.animation.ScaleAnimation;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import com.instabug.featuresrequest.R;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
public class IbFrRippleView extends LinearLayout {
    public int Y1 = 90;
    public Handler Z1;
    public float a2 = 0.0f;
    public boolean b2 = false;
    public final Runnable c = new a();
    public int c2 = 0;
    public int d;
    public int d2 = 0;
    public int e2 = -1;
    public float f2 = -1.0f;
    public float g2 = -1.0f;
    public int h2 = 200;
    public float i2;
    public ScaleAnimation j2;
    public Boolean k2;
    public Boolean l2;
    public Integer m2 = 2;
    public Paint n2;
    public Bitmap o2;
    public int p2;
    public int q;
    public int q2;
    public GestureDetector r2;
    public b s2;
    public int x = 10;
    public int y = 200;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            IbFrRippleView.this.invalidate();
        }
    }

    public interface b {
        void a(IbFrRippleView ibFrRippleView);
    }

    public enum d {
        SIMPLE(0),
        DOUBLE(1),
        RECTANGLE(2);
        
        public int type;

        private d(int i) {
            this.type = i;
        }
    }

    public IbFrRippleView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        if (!isInEditMode()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.IbFrRippleView);
            this.p2 = obtainStyledAttributes.getColor(R.styleable.IbFrRippleView_ib_fr_rv_color, getResources().getColor(R.color.ib_fr_ripple_color));
            this.m2 = Integer.valueOf(obtainStyledAttributes.getInt(R.styleable.IbFrRippleView_ib_fr_rv_type, 2));
            this.k2 = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.IbFrRippleView_ib_fr_rv_zoom, true));
            this.l2 = Boolean.valueOf(obtainStyledAttributes.getBoolean(R.styleable.IbFrRippleView_ib_fr_rv_centered, true));
            this.y = obtainStyledAttributes.getInteger(R.styleable.IbFrRippleView_ib_fr_rv_rippleDuration, 200);
            this.x = obtainStyledAttributes.getInteger(R.styleable.IbFrRippleView_ib_fr_rv_framerate, this.x);
            this.Y1 = obtainStyledAttributes.getInteger(R.styleable.IbFrRippleView_ib_fr_rv_alpha, this.Y1);
            this.q2 = obtainStyledAttributes.getDimensionPixelSize(R.styleable.IbFrRippleView_ib_fr_rv_ripplePadding, 0);
            this.Z1 = new Handler();
            this.i2 = obtainStyledAttributes.getFloat(R.styleable.IbFrRippleView_ib_fr_rv_zoomScale, 1.03f);
            this.h2 = obtainStyledAttributes.getInt(R.styleable.IbFrRippleView_ib_fr_rv_zoomDuration, 200);
            obtainStyledAttributes.recycle();
            Paint paint = new Paint();
            this.n2 = paint;
            paint.setAntiAlias(true);
            this.n2.setStyle(Paint.Style.FILL);
            this.n2.setColor(this.p2);
            this.n2.setAlpha(this.Y1);
            setWillNotDraw(false);
            this.r2 = new GestureDetector(context, new i0.j.d.h.d.a(this));
            setDrawingCacheEnabled(true);
            setClickable(true);
        }
    }

    public void a(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        if (isEnabled() && !this.b2) {
            if (this.k2.booleanValue()) {
                startAnimation(this.j2);
            }
            this.a2 = (float) Math.max(this.d, this.q);
            if (this.m2.intValue() != 2) {
                this.a2 /= 2.0f;
            }
            this.a2 -= (float) this.q2;
            if (this.l2.booleanValue() || this.m2.intValue() == 1) {
                this.f2 = ((float) getMeasuredWidth()) / 2.0f;
                this.g2 = ((float) getMeasuredHeight()) / 2.0f;
            } else {
                this.f2 = x2;
                this.g2 = y2;
            }
            this.b2 = true;
            if (this.m2.intValue() == 1 && this.o2 == null) {
                this.o2 = getDrawingCache(true);
            }
            invalidate();
        }
    }

    public final void b(Boolean bool) {
        if (getParent() instanceof AdapterView) {
            AdapterView adapterView = (AdapterView) getParent();
            int positionForView = adapterView.getPositionForView(this);
            long itemIdAtPosition = adapterView.getItemIdAtPosition(positionForView);
            if (bool.booleanValue()) {
                if (adapterView.getOnItemLongClickListener() != null) {
                    adapterView.getOnItemLongClickListener().onItemLongClick(adapterView, this, positionForView, itemIdAtPosition);
                }
            } else if (adapterView.getOnItemClickListener() != null) {
                adapterView.getOnItemClickListener().onItemClick(adapterView, this, positionForView, itemIdAtPosition);
            }
        }
    }

    public void draw(Canvas canvas) {
        Bitmap bitmap;
        super.draw(canvas);
        if (this.b2) {
            canvas.save();
            int i = this.y;
            int i3 = this.c2;
            int i4 = this.x;
            if (i <= i3 * i4) {
                this.b2 = false;
                this.c2 = 0;
                this.e2 = -1;
                this.d2 = 0;
                canvas.restore();
                invalidate();
                b bVar = this.s2;
                if (bVar != null) {
                    bVar.a(this);
                    return;
                }
                return;
            }
            this.Z1.postDelayed(this.c, (long) i4);
            if (this.c2 == 0) {
                canvas.save();
            }
            canvas.drawCircle(this.f2, this.g2, ((((float) this.c2) * ((float) this.x)) / ((float) this.y)) * this.a2, this.n2);
            this.n2.setColor(Color.parseColor("#ffff4444"));
            if (this.m2.intValue() == 1 && (bitmap = this.o2) != null) {
                int i5 = this.c2;
                int i6 = this.x;
                float f = ((float) i5) * ((float) i6);
                int i7 = this.y;
                if (f / ((float) i7) > 0.4f) {
                    if (this.e2 == -1) {
                        this.e2 = i7 - (i5 * i6);
                    }
                    int i8 = this.d2 + 1;
                    this.d2 = i8;
                    float f3 = this.a2;
                    Bitmap createBitmap = Bitmap.createBitmap(bitmap.getWidth(), this.o2.getHeight(), Bitmap.Config.ARGB_8888);
                    Canvas canvas2 = new Canvas(createBitmap);
                    Paint paint = new Paint();
                    float f4 = this.f2;
                    float f5 = (float) ((int) (((((float) i8) * ((float) i6)) / ((float) this.e2)) * f3));
                    float f6 = this.g2;
                    Rect rect = new Rect((int) (f4 - f5), (int) (f6 - f5), (int) (f4 + f5), (int) (f6 + f5));
                    paint.setAntiAlias(true);
                    canvas2.drawARGB(0, 0, 0, 0);
                    canvas2.drawCircle(this.f2, this.g2, f5, paint);
                    paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                    canvas2.drawBitmap(this.o2, rect, rect, paint);
                    canvas.drawBitmap(createBitmap, 0.0f, 0.0f, this.n2);
                    createBitmap.recycle();
                }
            }
            this.n2.setColor(this.p2);
            if (this.m2.intValue() == 1) {
                float f7 = (float) this.x;
                if ((((float) this.c2) * f7) / ((float) this.y) > 0.6f) {
                    Paint paint2 = this.n2;
                    float f8 = (float) this.Y1;
                    paint2.setAlpha((int) (f8 - (((((float) this.d2) * f7) / ((float) this.e2)) * f8)));
                } else {
                    this.n2.setAlpha(this.Y1);
                }
            } else {
                Paint paint3 = this.n2;
                float f9 = (float) this.Y1;
                paint3.setAlpha((int) (f9 - (((((float) this.c2) * ((float) this.x)) / ((float) this.y)) * f9)));
            }
            this.c2++;
        }
    }

    public void drawableStateChanged() {
        super.drawableStateChanged();
    }

    public int getFrameRate() {
        return this.x;
    }

    public int getRippleAlpha() {
        return this.Y1;
    }

    public int getRippleColor() {
        return this.p2;
    }

    public int getRippleDuration() {
        return this.y;
    }

    public int getRipplePadding() {
        return this.q2;
    }

    public d getRippleType() {
        return d.values()[this.m2.intValue()];
    }

    public int getZoomDuration() {
        return this.h2;
    }

    public float getZoomScale() {
        return this.i2;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        onTouchEvent(motionEvent);
        return super.onInterceptTouchEvent(motionEvent);
    }

    public void onSizeChanged(int i, int i3, int i4, int i5) {
        super.onSizeChanged(i, i3, i4, i5);
        this.d = i;
        this.q = i3;
        float f = this.i2;
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, f, 1.0f, f, ((float) i) / 2.0f, ((float) i3) / 2.0f);
        this.j2 = scaleAnimation;
        scaleAnimation.setDuration((long) this.h2);
        this.j2.setRepeatMode(2);
        this.j2.setRepeatCount(1);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.r2.onTouchEvent(motionEvent)) {
            a(motionEvent);
            b(Boolean.FALSE);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCentered(Boolean bool) {
        this.l2 = bool;
    }

    public void setFrameRate(int i) {
        this.x = i;
    }

    public void setOnRippleCompleteListener(b bVar) {
        this.s2 = bVar;
    }

    public void setRippleAlpha(int i) {
        this.Y1 = i;
    }

    public void setRippleColor(int i) {
        this.p2 = i;
    }

    public void setRippleDuration(int i) {
        this.y = i;
    }

    public void setRipplePadding(int i) {
        this.q2 = i;
    }

    public void setRippleType(d dVar) {
        this.m2 = Integer.valueOf(dVar.ordinal());
    }

    public void setZoomDuration(int i) {
        this.h2 = i;
    }

    public void setZoomScale(float f) {
        this.i2 = f;
    }

    public void setZooming(Boolean bool) {
        this.k2 = bool;
    }
}
