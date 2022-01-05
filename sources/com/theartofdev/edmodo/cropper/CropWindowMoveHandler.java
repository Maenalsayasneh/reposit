package com.theartofdev.edmodo.cropper;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;

public final class CropWindowMoveHandler {
    public final float a;
    public final float b;
    public final float c;
    public final float d;
    public final Type e;
    public final PointF f;

    public enum Type {
        TOP_LEFT,
        TOP_RIGHT,
        BOTTOM_LEFT,
        BOTTOM_RIGHT,
        LEFT,
        TOP,
        RIGHT,
        BOTTOM,
        CENTER
    }

    static {
        new Matrix();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0068, code lost:
        r4 = r4 - r7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0069, code lost:
        r0.x = r1;
        r0.y = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x006d, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0048, code lost:
        r1 = r4 - r6;
        r4 = 0.0f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public CropWindowMoveHandler(com.theartofdev.edmodo.cropper.CropWindowMoveHandler.Type r4, i0.p.a.a.e r5, float r6, float r7) {
        /*
            r3 = this;
            r3.<init>()
            android.graphics.PointF r0 = new android.graphics.PointF
            r0.<init>()
            r3.f = r0
            r3.e = r4
            float r1 = r5.d()
            r3.a = r1
            float r1 = r5.c()
            r3.b = r1
            float r1 = r5.b()
            r3.c = r1
            float r1 = r5.a()
            r3.d = r1
            android.graphics.RectF r5 = r5.e()
            int r4 = r4.ordinal()
            r1 = 0
            switch(r4) {
                case 0: goto L_0x0062;
                case 1: goto L_0x005b;
                case 2: goto L_0x0054;
                case 3: goto L_0x004d;
                case 4: goto L_0x0046;
                case 5: goto L_0x0043;
                case 6: goto L_0x0040;
                case 7: goto L_0x003d;
                case 8: goto L_0x0032;
                default: goto L_0x0030;
            }
        L_0x0030:
            r4 = r1
            goto L_0x0069
        L_0x0032:
            float r4 = r5.centerX()
            float r1 = r4 - r6
            float r4 = r5.centerY()
            goto L_0x0068
        L_0x003d:
            float r4 = r5.bottom
            goto L_0x0068
        L_0x0040:
            float r4 = r5.right
            goto L_0x0048
        L_0x0043:
            float r4 = r5.top
            goto L_0x0068
        L_0x0046:
            float r4 = r5.left
        L_0x0048:
            float r4 = r4 - r6
            r2 = r1
            r1 = r4
            r4 = r2
            goto L_0x0069
        L_0x004d:
            float r4 = r5.right
            float r1 = r4 - r6
            float r4 = r5.bottom
            goto L_0x0068
        L_0x0054:
            float r4 = r5.left
            float r1 = r4 - r6
            float r4 = r5.bottom
            goto L_0x0068
        L_0x005b:
            float r4 = r5.right
            float r1 = r4 - r6
            float r4 = r5.top
            goto L_0x0068
        L_0x0062:
            float r4 = r5.left
            float r1 = r4 - r6
            float r4 = r5.top
        L_0x0068:
            float r4 = r4 - r7
        L_0x0069:
            r0.x = r1
            r0.y = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.theartofdev.edmodo.cropper.CropWindowMoveHandler.<init>(com.theartofdev.edmodo.cropper.CropWindowMoveHandler$Type, i0.p.a.a.e, float, float):void");
    }

    public static float g(float f2, float f3, float f4, float f5) {
        return (f4 - f2) / (f5 - f3);
    }

    public final void a(RectF rectF, float f2, RectF rectF2, int i, float f3, float f4, boolean z, boolean z2) {
        float f5 = (float) i;
        if (f2 > f5) {
            f2 = ((f2 - f5) / 1.05f) + f5;
            this.f.y -= (f2 - f5) / 1.1f;
        }
        float f6 = rectF2.bottom;
        if (f2 > f6) {
            this.f.y -= (f2 - f6) / 2.0f;
        }
        if (f6 - f2 < f3) {
            f2 = f6;
        }
        float f7 = rectF.top;
        float f8 = this.b;
        if (f2 - f7 < f8) {
            f2 = f7 + f8;
        }
        float f9 = this.d;
        if (f2 - f7 > f9) {
            f2 = f7 + f9;
        }
        if (f6 - f2 < f3) {
            f2 = f6;
        }
        if (f4 > 0.0f) {
            float f10 = (f2 - f7) * f4;
            float f11 = this.a;
            if (f10 < f11) {
                f2 = Math.min(f6, (f11 / f4) + f7);
                f10 = (f2 - rectF.top) * f4;
            }
            float f12 = this.c;
            if (f10 > f12) {
                f2 = Math.min(rectF2.bottom, (f12 / f4) + rectF.top);
                f10 = (f2 - rectF.top) * f4;
            }
            if (!z || !z2) {
                if (z) {
                    float f13 = rectF.right;
                    float f14 = rectF2.left;
                    if (f13 - f10 < f14) {
                        f2 = Math.min(rectF2.bottom, ((f13 - f14) / f4) + rectF.top);
                        f10 = (f2 - rectF.top) * f4;
                    }
                }
                if (z2) {
                    float f15 = rectF.left;
                    float f16 = rectF2.right;
                    if (f10 + f15 > f16) {
                        f2 = Math.min(f2, Math.min(rectF2.bottom, ((f16 - f15) / f4) + rectF.top));
                    }
                }
            } else {
                f2 = Math.min(f2, Math.min(rectF2.bottom, (rectF2.width() / f4) + rectF.top));
            }
        }
        rectF.bottom = f2;
    }

    public final void b(RectF rectF, float f2, RectF rectF2, float f3, float f4, boolean z, boolean z2) {
        if (f2 < 0.0f) {
            f2 /= 1.05f;
            this.f.x -= f2 / 1.1f;
        }
        float f5 = rectF2.left;
        if (f2 < f5) {
            this.f.x -= (f2 - f5) / 2.0f;
        }
        if (f2 - f5 < f3) {
            f2 = f5;
        }
        float f6 = rectF.right;
        float f7 = this.a;
        if (f6 - f2 < f7) {
            f2 = f6 - f7;
        }
        float f8 = this.c;
        if (f6 - f2 > f8) {
            f2 = f6 - f8;
        }
        if (f2 - f5 < f3) {
            f2 = f5;
        }
        if (f4 > 0.0f) {
            float f9 = (f6 - f2) / f4;
            float f10 = this.b;
            if (f9 < f10) {
                f2 = Math.max(f5, f6 - (f10 * f4));
                f9 = (rectF.right - f2) / f4;
            }
            float f11 = this.d;
            if (f9 > f11) {
                f2 = Math.max(rectF2.left, rectF.right - (f11 * f4));
                f9 = (rectF.right - f2) / f4;
            }
            if (!z || !z2) {
                if (z) {
                    float f12 = rectF.bottom;
                    float f13 = rectF2.top;
                    if (f12 - f9 < f13) {
                        f2 = Math.max(rectF2.left, rectF.right - ((f12 - f13) * f4));
                        f9 = (rectF.right - f2) / f4;
                    }
                }
                if (z2) {
                    float f14 = rectF.top;
                    float f15 = rectF2.bottom;
                    if (f9 + f14 > f15) {
                        f2 = Math.max(f2, Math.max(rectF2.left, rectF.right - ((f15 - f14) * f4)));
                    }
                }
            } else {
                f2 = Math.max(f2, Math.max(rectF2.left, rectF.right - (rectF2.height() * f4)));
            }
        }
        rectF.left = f2;
    }

    public final void c(RectF rectF, RectF rectF2, float f2) {
        rectF.inset((rectF.width() - (rectF.height() * f2)) / 2.0f, 0.0f);
        float f3 = rectF.left;
        float f4 = rectF2.left;
        if (f3 < f4) {
            rectF.offset(f4 - f3, 0.0f);
        }
        float f5 = rectF.right;
        float f6 = rectF2.right;
        if (f5 > f6) {
            rectF.offset(f6 - f5, 0.0f);
        }
    }

    public final void d(RectF rectF, float f2, RectF rectF2, int i, float f3, float f4, boolean z, boolean z2) {
        float f5 = (float) i;
        if (f2 > f5) {
            f2 = ((f2 - f5) / 1.05f) + f5;
            this.f.x -= (f2 - f5) / 1.1f;
        }
        float f6 = rectF2.right;
        if (f2 > f6) {
            this.f.x -= (f2 - f6) / 2.0f;
        }
        if (f6 - f2 < f3) {
            f2 = f6;
        }
        float f7 = rectF.left;
        float f8 = this.a;
        if (f2 - f7 < f8) {
            f2 = f7 + f8;
        }
        float f9 = this.c;
        if (f2 - f7 > f9) {
            f2 = f7 + f9;
        }
        if (f6 - f2 < f3) {
            f2 = f6;
        }
        if (f4 > 0.0f) {
            float f10 = (f2 - f7) / f4;
            float f11 = this.b;
            if (f10 < f11) {
                f2 = Math.min(f6, (f11 * f4) + f7);
                f10 = (f2 - rectF.left) / f4;
            }
            float f12 = this.d;
            if (f10 > f12) {
                f2 = Math.min(rectF2.right, (f12 * f4) + rectF.left);
                f10 = (f2 - rectF.left) / f4;
            }
            if (!z || !z2) {
                if (z) {
                    float f13 = rectF.bottom;
                    float f14 = rectF2.top;
                    if (f13 - f10 < f14) {
                        f2 = Math.min(rectF2.right, ((f13 - f14) * f4) + rectF.left);
                        f10 = (f2 - rectF.left) / f4;
                    }
                }
                if (z2) {
                    float f15 = rectF.top;
                    float f16 = rectF2.bottom;
                    if (f10 + f15 > f16) {
                        f2 = Math.min(f2, Math.min(rectF2.right, ((f16 - f15) * f4) + rectF.left));
                    }
                }
            } else {
                f2 = Math.min(f2, Math.min(rectF2.right, (rectF2.height() * f4) + rectF.left));
            }
        }
        rectF.right = f2;
    }

    public final void e(RectF rectF, float f2, RectF rectF2, float f3, float f4, boolean z, boolean z2) {
        if (f2 < 0.0f) {
            f2 /= 1.05f;
            this.f.y -= f2 / 1.1f;
        }
        float f5 = rectF2.top;
        if (f2 < f5) {
            this.f.y -= (f2 - f5) / 2.0f;
        }
        if (f2 - f5 < f3) {
            f2 = f5;
        }
        float f6 = rectF.bottom;
        float f7 = this.b;
        if (f6 - f2 < f7) {
            f2 = f6 - f7;
        }
        float f8 = this.d;
        if (f6 - f2 > f8) {
            f2 = f6 - f8;
        }
        if (f2 - f5 < f3) {
            f2 = f5;
        }
        if (f4 > 0.0f) {
            float f9 = (f6 - f2) * f4;
            float f10 = this.a;
            if (f9 < f10) {
                f2 = Math.max(f5, f6 - (f10 / f4));
                f9 = (rectF.bottom - f2) * f4;
            }
            float f11 = this.c;
            if (f9 > f11) {
                f2 = Math.max(rectF2.top, rectF.bottom - (f11 / f4));
                f9 = (rectF.bottom - f2) * f4;
            }
            if (!z || !z2) {
                if (z) {
                    float f12 = rectF.right;
                    float f13 = rectF2.left;
                    if (f12 - f9 < f13) {
                        f2 = Math.max(rectF2.top, rectF.bottom - ((f12 - f13) / f4));
                        f9 = (rectF.bottom - f2) * f4;
                    }
                }
                if (z2) {
                    float f14 = rectF.left;
                    float f15 = rectF2.right;
                    if (f9 + f14 > f15) {
                        f2 = Math.max(f2, Math.max(rectF2.top, rectF.bottom - ((f15 - f14) / f4)));
                    }
                }
            } else {
                f2 = Math.max(f2, Math.max(rectF2.top, rectF.bottom - (rectF2.width() / f4)));
            }
        }
        rectF.top = f2;
    }

    public final void f(RectF rectF, RectF rectF2, float f2) {
        rectF.inset(0.0f, (rectF.height() - (rectF.width() / f2)) / 2.0f);
        float f3 = rectF.top;
        float f4 = rectF2.top;
        if (f3 < f4) {
            rectF.offset(0.0f, f4 - f3);
        }
        float f5 = rectF.bottom;
        float f6 = rectF2.bottom;
        if (f5 > f6) {
            rectF.offset(0.0f, f6 - f5);
        }
    }
}
