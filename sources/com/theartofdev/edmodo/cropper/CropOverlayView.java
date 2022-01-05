package com.theartofdev.edmodo.cropper;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ScaleGestureDetector;
import android.view.View;
import com.theartofdev.edmodo.cropper.CropImageView;
import i0.p.a.a.e;
import java.util.Arrays;
import java.util.Objects;

public class CropOverlayView extends View {
    public Paint Y1;
    public Paint Z1;
    public Paint a2;
    public Paint b2;
    public ScaleGestureDetector c;
    public Path c2 = new Path();
    public boolean d;
    public final float[] d2 = new float[8];
    public final RectF e2 = new RectF();
    public int f2;
    public int g2;
    public float h2;
    public float i2;
    public float j2;
    public float k2;
    public float l2;
    public CropWindowMoveHandler m2;
    public boolean n2;
    public int o2;
    public int p2;
    public final e q = new e();
    public float q2 = (((float) this.o2) / ((float) this.p2));
    public CropImageView.Guidelines r2;
    public CropImageView.CropShape s2;
    public final Rect t2 = new Rect();
    public boolean u2;
    public b x;
    public final RectF y = new RectF();

    public interface b {
    }

    public class c extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public c(a aVar) {
        }

        @TargetApi(11)
        public boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            RectF e = CropOverlayView.this.q.e();
            float focusX = scaleGestureDetector.getFocusX();
            float focusY = scaleGestureDetector.getFocusY();
            float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
            float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
            float f = focusY - currentSpanY;
            float f2 = focusX - currentSpanX;
            float f3 = focusX + currentSpanX;
            float f4 = focusY + currentSpanY;
            if (f2 >= f3 || f > f4 || f2 < 0.0f || f3 > CropOverlayView.this.q.b() || f < 0.0f || f4 > CropOverlayView.this.q.a()) {
                return true;
            }
            e.set(f2, f, f3, f4);
            CropOverlayView.this.q.a.set(e);
            CropOverlayView.this.invalidate();
            return true;
        }
    }

    public CropOverlayView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public static Paint e(float f, int i) {
        if (f <= 0.0f) {
            return null;
        }
        Paint paint = new Paint();
        paint.setColor(i);
        paint.setStrokeWidth(f);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        return paint;
    }

    public final boolean a(RectF rectF) {
        RectF rectF2 = rectF;
        float q3 = i0.p.a.a.c.q(this.d2);
        float s = i0.p.a.a.c.s(this.d2);
        float r = i0.p.a.a.c.r(this.d2);
        float l = i0.p.a.a.c.l(this.d2);
        if (!g()) {
            this.e2.set(q3, s, r, l);
            return false;
        }
        float[] fArr = this.d2;
        float f = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[6];
        float f7 = fArr[7];
        if (fArr[7] < fArr[1]) {
            if (fArr[1] < fArr[3]) {
                f = fArr[6];
                f3 = fArr[7];
                f4 = fArr[2];
                f5 = fArr[3];
                f6 = fArr[4];
                f7 = fArr[5];
            } else {
                f = fArr[4];
                f3 = fArr[5];
                f4 = fArr[0];
                f5 = fArr[1];
                f6 = fArr[2];
                f7 = fArr[3];
            }
        } else if (fArr[1] > fArr[3]) {
            f = fArr[2];
            f3 = fArr[3];
            f4 = fArr[6];
            f5 = fArr[7];
            f6 = fArr[0];
            f7 = fArr[1];
        }
        float f8 = (f7 - f3) / (f6 - f);
        float f9 = -1.0f / f8;
        float f10 = f3 - (f8 * f);
        float f11 = f3 - (f * f9);
        float f12 = f5 - (f8 * f4);
        float f13 = f5 - (f4 * f9);
        float centerY = rectF.centerY() - rectF2.top;
        float centerX = rectF.centerX();
        float f14 = rectF2.left;
        float f15 = centerY / (centerX - f14);
        float f16 = -f15;
        float f17 = rectF2.top;
        float f18 = f17 - (f14 * f15);
        float f19 = rectF2.right;
        float f20 = f17 - (f16 * f19);
        float f21 = f8 - f15;
        float f22 = (f18 - f10) / f21;
        float max = Math.max(q3, f22 < f19 ? f22 : q3);
        float f23 = (f18 - f11) / (f9 - f15);
        if (f23 >= rectF2.right) {
            f23 = max;
        }
        float max2 = Math.max(max, f23);
        float f24 = f9 - f16;
        float f25 = (f20 - f13) / f24;
        if (f25 >= rectF2.right) {
            f25 = max2;
        }
        float max3 = Math.max(max2, f25);
        float f26 = (f20 - f11) / f24;
        if (f26 <= rectF2.left) {
            f26 = r;
        }
        float min = Math.min(r, f26);
        float f27 = (f20 - f12) / (f8 - f16);
        if (f27 <= rectF2.left) {
            f27 = min;
        }
        float min2 = Math.min(min, f27);
        float f28 = (f18 - f12) / f21;
        if (f28 <= rectF2.left) {
            f28 = min2;
        }
        float min3 = Math.min(min2, f28);
        float max4 = Math.max(s, Math.max((f8 * max3) + f10, (f9 * min3) + f11));
        float min4 = Math.min(l, Math.min((f9 * max3) + f13, (f8 * min3) + f12));
        RectF rectF3 = this.e2;
        rectF3.left = max3;
        rectF3.top = max4;
        rectF3.right = min3;
        rectF3.bottom = min4;
        return true;
    }

    public final void b(boolean z) {
        try {
            b bVar = this.x;
            if (bVar != null) {
                CropImageView.a aVar = (CropImageView.a) bVar;
                CropImageView cropImageView = CropImageView.this;
                int i = CropImageView.c;
                cropImageView.c(z, true);
                CropImageView cropImageView2 = CropImageView.this;
                CropImageView.e eVar = cropImageView2.q2;
                if (eVar != null && !z) {
                    eVar.a(cropImageView2.getCropRect());
                }
                CropImageView cropImageView3 = CropImageView.this;
                CropImageView.d dVar = cropImageView3.r2;
                if (dVar != null && z) {
                    dVar.a(cropImageView3.getCropRect());
                }
            }
        } catch (Exception e) {
            Log.e("AIC", "Exception in crop window changed", e);
        }
    }

    public final void c(Canvas canvas) {
        if (this.a2 != null) {
            Paint paint = this.Y1;
            float strokeWidth = paint != null ? paint.getStrokeWidth() : 0.0f;
            RectF e = this.q.e();
            e.inset(strokeWidth, strokeWidth);
            float width = e.width() / 3.0f;
            float height = e.height() / 3.0f;
            if (this.s2 == CropImageView.CropShape.OVAL) {
                float width2 = (e.width() / 2.0f) - strokeWidth;
                float height2 = (e.height() / 2.0f) - strokeWidth;
                float f = e.left + width;
                float f3 = e.right - width;
                float sin = (float) (Math.sin(Math.acos((double) ((width2 - width) / width2))) * ((double) height2));
                canvas.drawLine(f, (e.top + height2) - sin, f, (e.bottom - height2) + sin, this.a2);
                canvas.drawLine(f3, (e.top + height2) - sin, f3, (e.bottom - height2) + sin, this.a2);
                float f4 = e.top + height;
                float f5 = e.bottom - height;
                float cos = (float) (Math.cos(Math.asin((double) ((height2 - height) / height2))) * ((double) width2));
                canvas.drawLine((e.left + width2) - cos, f4, (e.right - width2) + cos, f4, this.a2);
                canvas.drawLine((e.left + width2) - cos, f5, (e.right - width2) + cos, f5, this.a2);
                return;
            }
            float f6 = e.left + width;
            float f7 = e.right - width;
            Canvas canvas2 = canvas;
            canvas2.drawLine(f6, e.top, f6, e.bottom, this.a2);
            canvas.drawLine(f7, e.top, f7, e.bottom, this.a2);
            float f8 = e.top + height;
            float f9 = e.bottom - height;
            canvas2.drawLine(e.left, f8, e.right, f8, this.a2);
            canvas.drawLine(e.left, f9, e.right, f9, this.a2);
        }
    }

    public final void d(RectF rectF) {
        if (rectF.width() < this.q.d()) {
            float d3 = (this.q.d() - rectF.width()) / 2.0f;
            rectF.left -= d3;
            rectF.right += d3;
        }
        if (rectF.height() < this.q.c()) {
            float c3 = (this.q.c() - rectF.height()) / 2.0f;
            rectF.top -= c3;
            rectF.bottom += c3;
        }
        if (rectF.width() > this.q.b()) {
            float width = (rectF.width() - this.q.b()) / 2.0f;
            rectF.left += width;
            rectF.right -= width;
        }
        if (rectF.height() > this.q.a()) {
            float height = (rectF.height() - this.q.a()) / 2.0f;
            rectF.top += height;
            rectF.bottom -= height;
        }
        a(rectF);
        if (this.e2.width() > 0.0f && this.e2.height() > 0.0f) {
            float max = Math.max(this.e2.left, 0.0f);
            float max2 = Math.max(this.e2.top, 0.0f);
            float min = Math.min(this.e2.right, (float) getWidth());
            float min2 = Math.min(this.e2.bottom, (float) getHeight());
            if (rectF.left < max) {
                rectF.left = max;
            }
            if (rectF.top < max2) {
                rectF.top = max2;
            }
            if (rectF.right > min) {
                rectF.right = min;
            }
            if (rectF.bottom > min2) {
                rectF.bottom = min2;
            }
        }
        if (this.n2 && ((double) Math.abs(rectF.width() - (rectF.height() * this.q2))) > 0.1d) {
            if (rectF.width() > rectF.height() * this.q2) {
                float abs = Math.abs((rectF.height() * this.q2) - rectF.width()) / 2.0f;
                rectF.left += abs;
                rectF.right -= abs;
                return;
            }
            float abs2 = Math.abs((rectF.width() / this.q2) - rectF.height()) / 2.0f;
            rectF.top += abs2;
            rectF.bottom -= abs2;
        }
    }

    public final void f() {
        float max = Math.max(i0.p.a.a.c.q(this.d2), 0.0f);
        float max2 = Math.max(i0.p.a.a.c.s(this.d2), 0.0f);
        float min = Math.min(i0.p.a.a.c.r(this.d2), (float) getWidth());
        float min2 = Math.min(i0.p.a.a.c.l(this.d2), (float) getHeight());
        if (min > max && min2 > max2) {
            RectF rectF = new RectF();
            this.u2 = true;
            float f = this.j2;
            float f3 = min - max;
            float f4 = f * f3;
            float f5 = min2 - max2;
            float f6 = f * f5;
            if (this.t2.width() > 0 && this.t2.height() > 0) {
                Rect rect = this.t2;
                e eVar = this.q;
                float f7 = (((float) rect.left) / eVar.k) + max;
                rectF.left = f7;
                rectF.top = (((float) rect.top) / eVar.l) + max2;
                rectF.right = (((float) rect.width()) / this.q.k) + f7;
                rectF.bottom = (((float) this.t2.height()) / this.q.l) + rectF.top;
                rectF.left = Math.max(max, rectF.left);
                rectF.top = Math.max(max2, rectF.top);
                rectF.right = Math.min(min, rectF.right);
                rectF.bottom = Math.min(min2, rectF.bottom);
            } else if (!this.n2 || min <= max || min2 <= max2) {
                rectF.left = max + f4;
                rectF.top = max2 + f6;
                rectF.right = min - f4;
                rectF.bottom = min2 - f6;
            } else if (f3 / f5 > this.q2) {
                rectF.top = max2 + f6;
                rectF.bottom = min2 - f6;
                float width = ((float) getWidth()) / 2.0f;
                this.q2 = ((float) this.o2) / ((float) this.p2);
                float max3 = Math.max(this.q.d(), rectF.height() * this.q2) / 2.0f;
                rectF.left = width - max3;
                rectF.right = width + max3;
            } else {
                rectF.left = max + f4;
                rectF.right = min - f4;
                float height = ((float) getHeight()) / 2.0f;
                float max4 = Math.max(this.q.c(), rectF.width() / this.q2) / 2.0f;
                rectF.top = height - max4;
                rectF.bottom = height + max4;
            }
            d(rectF);
            this.q.a.set(rectF);
        }
    }

    public final boolean g() {
        float[] fArr = this.d2;
        return (fArr[0] == fArr[6] || fArr[1] == fArr[7]) ? false : true;
    }

    public int getAspectRatioX() {
        return this.o2;
    }

    public int getAspectRatioY() {
        return this.p2;
    }

    public CropImageView.CropShape getCropShape() {
        return this.s2;
    }

    public RectF getCropWindowRect() {
        return this.q.e();
    }

    public CropImageView.Guidelines getGuidelines() {
        return this.r2;
    }

    public Rect getInitialCropWindowRect() {
        return this.t2;
    }

    public void h() {
        if (this.u2) {
            setCropWindowRect(i0.p.a.a.c.b);
            f();
            invalidate();
        }
    }

    public void i(float[] fArr, int i, int i3) {
        if (fArr == null || !Arrays.equals(this.d2, fArr)) {
            if (fArr == null) {
                Arrays.fill(this.d2, 0.0f);
            } else {
                System.arraycopy(fArr, 0, this.d2, 0, fArr.length);
            }
            this.f2 = i;
            this.g2 = i3;
            RectF e = this.q.e();
            if (e.width() == 0.0f || e.height() == 0.0f) {
                f();
            }
        }
    }

    public boolean j(boolean z) {
        if (this.d == z) {
            return false;
        }
        this.d = z;
        if (!z || this.c != null) {
            return true;
        }
        this.c = new ScaleGestureDetector(getContext(), new c((a) null));
        return true;
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF e = this.q.e();
        float f = 0.0f;
        float max = Math.max(i0.p.a.a.c.q(this.d2), 0.0f);
        float max2 = Math.max(i0.p.a.a.c.s(this.d2), 0.0f);
        float min = Math.min(i0.p.a.a.c.r(this.d2), (float) getWidth());
        float min2 = Math.min(i0.p.a.a.c.l(this.d2), (float) getHeight());
        CropImageView.CropShape cropShape = this.s2;
        CropImageView.CropShape cropShape2 = CropImageView.CropShape.RECTANGLE;
        if (cropShape != cropShape2) {
            this.c2.reset();
            int i = Build.VERSION.SDK_INT;
            this.y.set(e.left, e.top, e.right, e.bottom);
            this.c2.addOval(this.y, Path.Direction.CW);
            canvas.save();
            if (i >= 26) {
                canvas.clipOutPath(this.c2);
            } else {
                canvas.clipPath(this.c2, Region.Op.XOR);
            }
            canvas.drawRect(max, max2, min, min2, this.b2);
            canvas.restore();
        } else if (g()) {
            int i3 = Build.VERSION.SDK_INT;
            this.c2.reset();
            Path path = this.c2;
            float[] fArr = this.d2;
            path.moveTo(fArr[0], fArr[1]);
            Path path2 = this.c2;
            float[] fArr2 = this.d2;
            path2.lineTo(fArr2[2], fArr2[3]);
            Path path3 = this.c2;
            float[] fArr3 = this.d2;
            path3.lineTo(fArr3[4], fArr3[5]);
            Path path4 = this.c2;
            float[] fArr4 = this.d2;
            path4.lineTo(fArr4[6], fArr4[7]);
            this.c2.close();
            canvas.save();
            if (i3 >= 26) {
                canvas.clipOutPath(this.c2);
            } else {
                canvas.clipPath(this.c2, Region.Op.INTERSECT);
            }
            canvas.clipRect(e, Region.Op.XOR);
            canvas.drawRect(max, max2, min, min2, this.b2);
            canvas.restore();
        } else {
            Canvas canvas2 = canvas;
            float f3 = max;
            float f4 = min;
            canvas2.drawRect(f3, max2, f4, e.top, this.b2);
            canvas2.drawRect(f3, e.bottom, f4, min2, this.b2);
            canvas2.drawRect(f3, e.top, e.left, e.bottom, this.b2);
            canvas.drawRect(e.right, e.top, min, e.bottom, this.b2);
        }
        if (this.q.j()) {
            CropImageView.Guidelines guidelines = this.r2;
            if (guidelines == CropImageView.Guidelines.ON) {
                c(canvas);
            } else if (guidelines == CropImageView.Guidelines.ON_TOUCH && this.m2 != null) {
                c(canvas);
            }
        }
        Paint paint = this.Y1;
        if (paint != null) {
            float strokeWidth = paint.getStrokeWidth();
            RectF e3 = this.q.e();
            float f5 = strokeWidth / 2.0f;
            e3.inset(f5, f5);
            if (this.s2 == cropShape2) {
                canvas.drawRect(e3, this.Y1);
            } else {
                canvas.drawOval(e3, this.Y1);
            }
        }
        if (this.Z1 != null) {
            Paint paint2 = this.Y1;
            float strokeWidth2 = paint2 != null ? paint2.getStrokeWidth() : 0.0f;
            float strokeWidth3 = this.Z1.getStrokeWidth();
            float f6 = strokeWidth3 / 2.0f;
            if (this.s2 == cropShape2) {
                f = this.h2;
            }
            float f7 = f + f6;
            RectF e4 = this.q.e();
            e4.inset(f7, f7);
            float f8 = (strokeWidth3 - strokeWidth2) / 2.0f;
            float f9 = f6 + f8;
            float f10 = e4.left - f8;
            float f11 = e4.top;
            Canvas canvas3 = canvas;
            canvas3.drawLine(f10, f11 - f9, f10, f11 + this.i2, this.Z1);
            float f12 = e4.left;
            float f13 = e4.top - f8;
            canvas3.drawLine(f12 - f9, f13, f12 + this.i2, f13, this.Z1);
            float f14 = e4.right + f8;
            float f15 = e4.top;
            canvas3.drawLine(f14, f15 - f9, f14, f15 + this.i2, this.Z1);
            float f16 = e4.right;
            float f17 = e4.top - f8;
            canvas3.drawLine(f16 + f9, f17, f16 - this.i2, f17, this.Z1);
            float f18 = e4.left - f8;
            float f19 = e4.bottom;
            canvas3.drawLine(f18, f19 + f9, f18, f19 - this.i2, this.Z1);
            float f20 = e4.left;
            float f21 = e4.bottom + f8;
            canvas3.drawLine(f20 - f9, f21, f20 + this.i2, f21, this.Z1);
            float f22 = e4.right + f8;
            float f23 = e4.bottom;
            canvas3.drawLine(f22, f23 + f9, f22, f23 - this.i2, this.Z1);
            float f24 = e4.right;
            float f25 = e4.bottom + f8;
            canvas3.drawLine(f24 + f9, f25, f24 - this.i2, f25, this.Z1);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0086, code lost:
        if (r6 <= r14.right) goto L_0x0092;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00ab, code lost:
        if (r6 <= r14.bottom) goto L_0x00b7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r22) {
        /*
            r21 = this;
            r0 = r21
            boolean r1 = r21.isEnabled()
            r2 = 0
            if (r1 == 0) goto L_0x046d
            boolean r1 = r0.d
            if (r1 == 0) goto L_0x0015
            android.view.ScaleGestureDetector r1 = r0.c
            r3 = r22
            r1.onTouchEvent(r3)
            goto L_0x0017
        L_0x0015:
            r3 = r22
        L_0x0017:
            int r1 = r22.getAction()
            r4 = 0
            r5 = 1
            if (r1 == 0) goto L_0x031a
            if (r1 == r5) goto L_0x0306
            r6 = 2
            if (r1 == r6) goto L_0x0028
            r3 = 3
            if (r1 == r3) goto L_0x0306
            return r2
        L_0x0028:
            float r1 = r22.getX()
            float r2 = r22.getY()
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler r3 = r0.m2
            if (r3 == 0) goto L_0x02fe
            float r3 = r0.l2
            i0.p.a.a.e r4 = r0.q
            android.graphics.RectF r4 = r4.e()
            boolean r6 = r0.a(r4)
            r7 = 0
            if (r6 == 0) goto L_0x0044
            r3 = r7
        L_0x0044:
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler r15 = r0.m2
            android.graphics.RectF r14 = r0.e2
            int r13 = r0.f2
            int r10 = r0.g2
            boolean r6 = r0.n2
            float r12 = r0.q2
            android.graphics.PointF r8 = r15.f
            float r9 = r8.x
            float r1 = r1 + r9
            float r8 = r8.y
            float r8 = r8 + r2
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r2 = r15.e
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r9 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.CENTER
            if (r2 != r9) goto L_0x00f4
            float r2 = r4.centerX()
            float r1 = r1 - r2
            float r2 = r4.centerY()
            float r8 = r8 - r2
            float r2 = r4.left
            float r2 = r2 + r1
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            r9 = 1073741824(0x40000000, float:2.0)
            r11 = 1065772646(0x3f866666, float:1.05)
            if (r6 < 0) goto L_0x0088
            float r6 = r4.right
            float r6 = r6 + r1
            float r12 = (float) r13
            int r12 = (r6 > r12 ? 1 : (r6 == r12 ? 0 : -1))
            if (r12 > 0) goto L_0x0088
            float r12 = r14.left
            int r2 = (r2 > r12 ? 1 : (r2 == r12 ? 0 : -1))
            if (r2 < 0) goto L_0x0088
            float r2 = r14.right
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0092
        L_0x0088:
            float r1 = r1 / r11
            android.graphics.PointF r2 = r15.f
            float r6 = r2.x
            float r12 = r1 / r9
            float r6 = r6 - r12
            r2.x = r6
        L_0x0092:
            float r2 = r4.top
            float r2 = r2 + r8
            int r6 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r6 < 0) goto L_0x00ad
            float r6 = r4.bottom
            float r6 = r6 + r8
            float r10 = (float) r10
            int r10 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r10 > 0) goto L_0x00ad
            float r10 = r14.top
            int r2 = (r2 > r10 ? 1 : (r2 == r10 ? 0 : -1))
            if (r2 < 0) goto L_0x00ad
            float r2 = r14.bottom
            int r2 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x00b7
        L_0x00ad:
            float r8 = r8 / r11
            android.graphics.PointF r2 = r15.f
            float r6 = r2.y
            float r9 = r8 / r9
            float r6 = r6 - r9
            r2.y = r6
        L_0x00b7:
            r4.offset(r1, r8)
            float r1 = r4.left
            float r2 = r14.left
            float r6 = r2 + r3
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x00c8
            float r2 = r2 - r1
            r4.offset(r2, r7)
        L_0x00c8:
            float r1 = r4.top
            float r2 = r14.top
            float r6 = r2 + r3
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x00d6
            float r2 = r2 - r1
            r4.offset(r7, r2)
        L_0x00d6:
            float r1 = r4.right
            float r2 = r14.right
            float r6 = r2 - r3
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 <= 0) goto L_0x00e4
            float r2 = r2 - r1
            r4.offset(r2, r7)
        L_0x00e4:
            float r1 = r4.bottom
            float r2 = r14.bottom
            float r3 = r2 - r3
            int r3 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r3 <= 0) goto L_0x02f1
            float r2 = r2 - r1
            r4.offset(r7, r2)
            goto L_0x02f1
        L_0x00f4:
            if (r6 == 0) goto L_0x023e
            int r2 = r2.ordinal()
            switch(r2) {
                case 0: goto L_0x0204;
                case 1: goto L_0x01c5;
                case 2: goto L_0x018a;
                case 3: goto L_0x014a;
                case 4: goto L_0x0139;
                case 5: goto L_0x0128;
                case 6: goto L_0x0110;
                case 7: goto L_0x00ff;
                default: goto L_0x00fd;
            }
        L_0x00fd:
            goto L_0x02f1
        L_0x00ff:
            r13 = 1
            r1 = 1
            r6 = r15
            r7 = r4
            r9 = r14
            r11 = r3
            r2 = r12
            r3 = r14
            r14 = r1
            r6.a(r7, r8, r9, r10, r11, r12, r13, r14)
            r15.c(r4, r3, r2)
            goto L_0x02f1
        L_0x0110:
            r2 = r12
            r16 = 1
            r17 = 1
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r13
            r11 = r3
            r13 = r16
            r1 = r14
            r14 = r17
            r6.d(r7, r8, r9, r10, r11, r12, r13, r14)
            r15.f(r4, r1, r2)
            goto L_0x02f1
        L_0x0128:
            r2 = r12
            r1 = r14
            r12 = 1
            r13 = 1
            r6 = r15
            r7 = r4
            r9 = r1
            r10 = r3
            r11 = r2
            r6.e(r7, r8, r9, r10, r11, r12, r13)
            r15.c(r4, r1, r2)
            goto L_0x02f1
        L_0x0139:
            r2 = r12
            r12 = 1
            r13 = 1
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r3
            r11 = r2
            r6.b(r7, r8, r9, r10, r11, r12, r13)
            r15.f(r4, r14, r2)
            goto L_0x02f1
        L_0x014a:
            r2 = r12
            float r6 = r4.left
            float r7 = r4.top
            float r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.g(r6, r7, r1, r8)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x016c
            r13 = 0
            r1 = 1
            r6 = r15
            r7 = r4
            r9 = r14
            r11 = r3
            r12 = r2
            r14 = r1
            r6.a(r7, r8, r9, r10, r11, r12, r13, r14)
            float r1 = r4.left
            float r1 = i0.d.a.a.a.b(r4, r2, r1)
            r4.right = r1
            goto L_0x02f1
        L_0x016c:
            r16 = 0
            r17 = 1
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r13
            r11 = r3
            r12 = r2
            r13 = r16
            r14 = r17
            r6.d(r7, r8, r9, r10, r11, r12, r13, r14)
            float r1 = r4.top
            float r3 = r4.width()
            float r3 = r3 / r2
            float r3 = r3 + r1
            r4.bottom = r3
            goto L_0x02f1
        L_0x018a:
            r2 = r12
            float r6 = r4.top
            float r7 = r4.right
            float r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.g(r1, r6, r7, r8)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x01ae
            r13 = 1
            r1 = 0
            r6 = r15
            r7 = r4
            r9 = r14
            r11 = r3
            r12 = r2
            r14 = r1
            r6.a(r7, r8, r9, r10, r11, r12, r13, r14)
            float r1 = r4.right
            float r3 = r4.height()
            float r3 = r3 * r2
            float r1 = r1 - r3
            r4.left = r1
            goto L_0x02f1
        L_0x01ae:
            r12 = 0
            r13 = 1
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r3
            r11 = r2
            r6.b(r7, r8, r9, r10, r11, r12, r13)
            float r1 = r4.top
            float r3 = r4.width()
            float r3 = r3 / r2
            float r3 = r3 + r1
            r4.bottom = r3
            goto L_0x02f1
        L_0x01c5:
            r2 = r12
            float r6 = r4.left
            float r7 = r4.bottom
            float r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.g(r6, r8, r1, r7)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x01e6
            r12 = 0
            r13 = 1
            r6 = r15
            r7 = r4
            r9 = r14
            r10 = r3
            r11 = r2
            r6.e(r7, r8, r9, r10, r11, r12, r13)
            float r1 = r4.left
            float r1 = i0.d.a.a.a.b(r4, r2, r1)
            r4.right = r1
            goto L_0x02f1
        L_0x01e6:
            r16 = 1
            r17 = 0
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r13
            r11 = r3
            r12 = r2
            r13 = r16
            r14 = r17
            r6.d(r7, r8, r9, r10, r11, r12, r13, r14)
            float r1 = r4.bottom
            float r3 = r4.width()
            float r3 = r3 / r2
            float r1 = r1 - r3
            r4.top = r1
            goto L_0x02f1
        L_0x0204:
            r2 = r12
            float r6 = r4.right
            float r7 = r4.bottom
            float r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.g(r1, r8, r6, r7)
            int r6 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0227
            r12 = 1
            r13 = 0
            r6 = r15
            r7 = r4
            r9 = r14
            r10 = r3
            r11 = r2
            r6.e(r7, r8, r9, r10, r11, r12, r13)
            float r1 = r4.right
            float r3 = r4.height()
            float r3 = r3 * r2
            float r1 = r1 - r3
            r4.left = r1
            goto L_0x02f1
        L_0x0227:
            r12 = 1
            r13 = 0
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r3
            r11 = r2
            r6.b(r7, r8, r9, r10, r11, r12, r13)
            float r1 = r4.bottom
            float r3 = r4.width()
            float r3 = r3 / r2
            float r1 = r1 - r3
            r4.top = r1
            goto L_0x02f1
        L_0x023e:
            int r2 = r2.ordinal()
            switch(r2) {
                case 0: goto L_0x02d8;
                case 1: goto L_0x02bd;
                case 2: goto L_0x02a6;
                case 3: goto L_0x027f;
                case 4: goto L_0x0272;
                case 5: goto L_0x0266;
                case 6: goto L_0x0254;
                case 7: goto L_0x0247;
                default: goto L_0x0245;
            }
        L_0x0245:
            goto L_0x02f1
        L_0x0247:
            r12 = 0
            r13 = 0
            r1 = 0
            r6 = r15
            r7 = r4
            r9 = r14
            r11 = r3
            r14 = r1
            r6.a(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x02f1
        L_0x0254:
            r12 = 0
            r2 = 0
            r16 = 0
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r13
            r11 = r3
            r13 = r2
            r14 = r16
            r6.d(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x02f1
        L_0x0266:
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r15
            r7 = r4
            r9 = r14
            r10 = r3
            r6.e(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x02f1
        L_0x0272:
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r15
            r7 = r4
            r8 = r1
            r9 = r14
            r10 = r3
            r6.b(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x02f1
        L_0x027f:
            r2 = 0
            r16 = 0
            r17 = 0
            r12 = 0
            r18 = 0
            r19 = 0
            r6 = r15
            r7 = r4
            r9 = r14
            r11 = r3
            r20 = r13
            r13 = r18
            r18 = r14
            r14 = r19
            r6.a(r7, r8, r9, r10, r11, r12, r13, r14)
            r8 = r1
            r9 = r18
            r10 = r20
            r12 = r2
            r13 = r16
            r14 = r17
            r6.d(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x02f1
        L_0x02a6:
            r18 = r14
            r12 = 0
            r2 = 0
            r14 = 0
            r13 = 0
            r6 = r15
            r7 = r4
            r9 = r18
            r11 = r3
            r6.a(r7, r8, r9, r10, r11, r12, r13, r14)
            r11 = 0
            r12 = 0
            r8 = r1
            r10 = r3
            r13 = r2
            r6.b(r7, r8, r9, r10, r11, r12, r13)
            goto L_0x02f1
        L_0x02bd:
            r20 = r13
            r18 = r14
            r11 = 0
            r12 = 0
            r2 = 0
            r13 = 0
            r6 = r15
            r7 = r4
            r9 = r18
            r10 = r3
            r6.e(r7, r8, r9, r10, r11, r12, r13)
            r12 = 0
            r14 = 0
            r8 = r1
            r10 = r20
            r11 = r3
            r13 = r2
            r6.d(r7, r8, r9, r10, r11, r12, r13, r14)
            goto L_0x02f1
        L_0x02d8:
            r18 = r14
            r2 = 0
            r14 = 0
            r16 = 0
            r11 = 0
            r12 = 0
            r13 = 0
            r6 = r15
            r7 = r4
            r9 = r18
            r10 = r3
            r6.e(r7, r8, r9, r10, r11, r12, r13)
            r8 = r1
            r11 = r2
            r12 = r14
            r13 = r16
            r6.b(r7, r8, r9, r10, r11, r12, r13)
        L_0x02f1:
            i0.p.a.a.e r1 = r0.q
            android.graphics.RectF r1 = r1.a
            r1.set(r4)
            r0.b(r5)
            r21.invalidate()
        L_0x02fe:
            android.view.ViewParent r1 = r21.getParent()
            r1.requestDisallowInterceptTouchEvent(r5)
            return r5
        L_0x0306:
            android.view.ViewParent r1 = r21.getParent()
            r1.requestDisallowInterceptTouchEvent(r2)
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler r1 = r0.m2
            if (r1 == 0) goto L_0x0319
            r0.m2 = r4
            r0.b(r2)
            r21.invalidate()
        L_0x0319:
            return r5
        L_0x031a:
            float r1 = r22.getX()
            float r2 = r22.getY()
            i0.p.a.a.e r3 = r0.q
            float r12 = r0.k2
            com.theartofdev.edmodo.cropper.CropImageView$CropShape r6 = r0.s2
            java.util.Objects.requireNonNull(r3)
            com.theartofdev.edmodo.cropper.CropImageView$CropShape r7 = com.theartofdev.edmodo.cropper.CropImageView.CropShape.OVAL
            if (r6 != r7) goto L_0x0393
            android.graphics.RectF r6 = r3.a
            float r6 = r6.width()
            r7 = 1086324736(0x40c00000, float:6.0)
            float r6 = r6 / r7
            android.graphics.RectF r8 = r3.a
            float r9 = r8.left
            float r10 = r9 + r6
            r11 = 1084227584(0x40a00000, float:5.0)
            float r6 = r6 * r11
            float r6 = r6 + r9
            float r8 = r8.height()
            float r8 = r8 / r7
            android.graphics.RectF r7 = r3.a
            float r7 = r7.top
            float r9 = r7 + r8
            float r8 = r8 * r11
            float r8 = r8 + r7
            int r7 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r7 >= 0) goto L_0x0367
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x035b
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP_LEFT
            goto L_0x045e
        L_0x035b:
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x0363
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.LEFT
            goto L_0x045e
        L_0x0363:
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM_LEFT
            goto L_0x045e
        L_0x0367:
            int r6 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r6 >= 0) goto L_0x037f
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x0373
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP
            goto L_0x045e
        L_0x0373:
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x037b
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.CENTER
            goto L_0x045e
        L_0x037b:
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM
            goto L_0x045e
        L_0x037f:
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 >= 0) goto L_0x0387
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP_RIGHT
            goto L_0x045e
        L_0x0387:
            int r6 = (r2 > r8 ? 1 : (r2 == r8 ? 0 : -1))
            if (r6 >= 0) goto L_0x038f
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.RIGHT
            goto L_0x045e
        L_0x038f:
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM_RIGHT
            goto L_0x045e
        L_0x0393:
            android.graphics.RectF r6 = r3.a
            float r7 = r6.left
            float r6 = r6.top
            boolean r6 = i0.p.a.a.e.g(r1, r2, r7, r6, r12)
            if (r6 == 0) goto L_0x03a3
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP_LEFT
            goto L_0x045e
        L_0x03a3:
            android.graphics.RectF r6 = r3.a
            float r7 = r6.right
            float r6 = r6.top
            boolean r6 = i0.p.a.a.e.g(r1, r2, r7, r6, r12)
            if (r6 == 0) goto L_0x03b3
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP_RIGHT
            goto L_0x045e
        L_0x03b3:
            android.graphics.RectF r6 = r3.a
            float r7 = r6.left
            float r6 = r6.bottom
            boolean r6 = i0.p.a.a.e.g(r1, r2, r7, r6, r12)
            if (r6 == 0) goto L_0x03c3
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM_LEFT
            goto L_0x045e
        L_0x03c3:
            android.graphics.RectF r6 = r3.a
            float r7 = r6.right
            float r6 = r6.bottom
            boolean r6 = i0.p.a.a.e.g(r1, r2, r7, r6, r12)
            if (r6 == 0) goto L_0x03d3
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM_RIGHT
            goto L_0x045e
        L_0x03d3:
            android.graphics.RectF r6 = r3.a
            float r8 = r6.left
            float r9 = r6.top
            float r10 = r6.right
            float r11 = r6.bottom
            r6 = r1
            r7 = r2
            boolean r6 = i0.p.a.a.e.f(r6, r7, r8, r9, r10, r11)
            if (r6 == 0) goto L_0x03f0
            boolean r6 = r3.j()
            r6 = r6 ^ r5
            if (r6 == 0) goto L_0x03f0
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.CENTER
            goto L_0x045e
        L_0x03f0:
            android.graphics.RectF r6 = r3.a
            float r8 = r6.left
            float r9 = r6.right
            float r10 = r6.top
            r6 = r1
            r7 = r2
            r11 = r12
            boolean r6 = i0.p.a.a.e.h(r6, r7, r8, r9, r10, r11)
            if (r6 == 0) goto L_0x0405
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.TOP
            goto L_0x045e
        L_0x0405:
            android.graphics.RectF r6 = r3.a
            float r8 = r6.left
            float r9 = r6.right
            float r10 = r6.bottom
            r6 = r1
            r7 = r2
            r11 = r12
            boolean r6 = i0.p.a.a.e.h(r6, r7, r8, r9, r10, r11)
            if (r6 == 0) goto L_0x0419
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.BOTTOM
            goto L_0x045e
        L_0x0419:
            android.graphics.RectF r6 = r3.a
            float r8 = r6.left
            float r9 = r6.top
            float r10 = r6.bottom
            r6 = r1
            r7 = r2
            r11 = r12
            boolean r6 = i0.p.a.a.e.i(r6, r7, r8, r9, r10, r11)
            if (r6 == 0) goto L_0x042d
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.LEFT
            goto L_0x045e
        L_0x042d:
            android.graphics.RectF r6 = r3.a
            float r8 = r6.right
            float r9 = r6.top
            float r10 = r6.bottom
            r6 = r1
            r7 = r2
            r11 = r12
            boolean r6 = i0.p.a.a.e.i(r6, r7, r8, r9, r10, r11)
            if (r6 == 0) goto L_0x0441
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.RIGHT
            goto L_0x045e
        L_0x0441:
            android.graphics.RectF r6 = r3.a
            float r8 = r6.left
            float r9 = r6.top
            float r10 = r6.right
            float r11 = r6.bottom
            r6 = r1
            r7 = r2
            boolean r6 = i0.p.a.a.e.f(r6, r7, r8, r9, r10, r11)
            if (r6 == 0) goto L_0x045d
            boolean r6 = r3.j()
            r6 = r6 ^ r5
            if (r6 != 0) goto L_0x045d
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type r6 = com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type.CENTER
            goto L_0x045e
        L_0x045d:
            r6 = r4
        L_0x045e:
            if (r6 == 0) goto L_0x0465
            com.theartofdev.edmodo.cropper.CropWindowMoveHandler r4 = new com.theartofdev.edmodo.cropper.CropWindowMoveHandler
            r4.<init>(r6, r3, r1, r2)
        L_0x0465:
            r0.m2 = r4
            if (r4 == 0) goto L_0x046c
            r21.invalidate()
        L_0x046c:
            return r5
        L_0x046d:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropOverlayView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setAspectRatioX(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.o2 != i) {
            this.o2 = i;
            this.q2 = ((float) i) / ((float) this.p2);
            if (this.u2) {
                f();
                invalidate();
            }
        }
    }

    public void setAspectRatioY(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("Cannot set aspect ratio value to a number less than or equal to 0.");
        } else if (this.p2 != i) {
            this.p2 = i;
            this.q2 = ((float) this.o2) / ((float) i);
            if (this.u2) {
                f();
                invalidate();
            }
        }
    }

    public void setCropShape(CropImageView.CropShape cropShape) {
        if (this.s2 != cropShape) {
            this.s2 = cropShape;
            invalidate();
        }
    }

    public void setCropWindowChangeListener(b bVar) {
        this.x = bVar;
    }

    public void setCropWindowRect(RectF rectF) {
        this.q.a.set(rectF);
    }

    public void setFixedAspectRatio(boolean z) {
        if (this.n2 != z) {
            this.n2 = z;
            if (this.u2) {
                f();
                invalidate();
            }
        }
    }

    public void setGuidelines(CropImageView.Guidelines guidelines) {
        if (this.r2 != guidelines) {
            this.r2 = guidelines;
            if (this.u2) {
                invalidate();
            }
        }
    }

    public void setInitialAttributeValues(CropImageOptions cropImageOptions) {
        e eVar = this.q;
        Objects.requireNonNull(eVar);
        eVar.c = (float) cropImageOptions.q2;
        eVar.d = (float) cropImageOptions.r2;
        eVar.g = (float) cropImageOptions.s2;
        eVar.h = (float) cropImageOptions.t2;
        eVar.i = (float) cropImageOptions.u2;
        eVar.j = (float) cropImageOptions.v2;
        setCropShape(cropImageOptions.c);
        setSnapRadius(cropImageOptions.d);
        setGuidelines(cropImageOptions.x);
        setFixedAspectRatio(cropImageOptions.e2);
        setAspectRatioX(cropImageOptions.f2);
        setAspectRatioY(cropImageOptions.g2);
        j(cropImageOptions.b2);
        this.k2 = cropImageOptions.q;
        this.j2 = cropImageOptions.d2;
        this.Y1 = e(cropImageOptions.h2, cropImageOptions.i2);
        this.h2 = cropImageOptions.k2;
        this.i2 = cropImageOptions.l2;
        this.Z1 = e(cropImageOptions.j2, cropImageOptions.m2);
        this.a2 = e(cropImageOptions.n2, cropImageOptions.o2);
        int i = cropImageOptions.p2;
        Paint paint = new Paint();
        paint.setColor(i);
        this.b2 = paint;
    }

    public void setInitialCropWindowRect(Rect rect) {
        Rect rect2 = this.t2;
        if (rect == null) {
            rect = i0.p.a.a.c.a;
        }
        rect2.set(rect);
        if (this.u2) {
            f();
            invalidate();
            b(false);
        }
    }

    public void setSnapRadius(float f) {
        this.l2 = f;
    }
}
