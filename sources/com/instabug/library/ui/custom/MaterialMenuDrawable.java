package com.instabug.library.ui.custom;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.util.Property;
import android.util.TypedValue;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import i0.d.a.a.a;

public class MaterialMenuDrawable extends Drawable implements MaterialMenu, Animatable {
    private static final float ARROW_BOT_LINE_ANGLE = 225.0f;
    private static final float ARROW_MID_LINE_ANGLE = 180.0f;
    private static final float ARROW_TOP_LINE_ANGLE = 135.0f;
    private static final int BASE_CIRCLE_RADIUS = 18;
    private static final int BASE_DRAWABLE_HEIGHT = 40;
    private static final int BASE_DRAWABLE_WIDTH = 40;
    private static final int BASE_ICON_WIDTH = 20;
    private static final float CHECK_BOTTOM_ANGLE = -90.0f;
    private static final float CHECK_MIDDLE_ANGLE = 135.0f;
    private static final int DEFAULT_CIRCLE_ALPHA = 200;
    public static final int DEFAULT_COLOR = -1;
    public static final int DEFAULT_SCALE = 1;
    public static final int DEFAULT_TRANSFORM_DURATION = 800;
    public static final boolean DEFAULT_VISIBLE = true;
    private static final float TRANSFORMATION_END = 2.0f;
    private static final float TRANSFORMATION_MID = 1.0f;
    private static final float TRANSFORMATION_START = 0.0f;
    private static final float X_BOT_LINE_ANGLE = -44.0f;
    private static final float X_ROTATION_ANGLE = 90.0f;
    private static final float X_TOP_LINE_ANGLE = 44.0f;
    /* access modifiers changed from: private */
    public IconState animatingIconState;
    private AnimationState animationState;
    private Animator.AnimatorListener animatorListener;
    /* access modifiers changed from: private */
    public final Paint circlePaint;
    /* access modifiers changed from: private */
    public final float circleRadius;
    /* access modifiers changed from: private */
    public IconState currentIconState;
    /* access modifiers changed from: private */
    public final float dip1;
    private final float dip2;
    private final float dip3;
    private final float dip4;
    private final float dip8;
    private final float diph;
    /* access modifiers changed from: private */
    public final int height;
    private final Paint iconPaint;
    /* access modifiers changed from: private */
    public final float iconWidth;
    private final Object lock;
    private MaterialMenuState materialMenuState;
    /* access modifiers changed from: private */
    public boolean rtlEnabled;
    private final float sidePadding;
    /* access modifiers changed from: private */
    public final Stroke stroke;
    /* access modifiers changed from: private */
    public final float strokeWidth;
    private final float topPadding;
    /* access modifiers changed from: private */
    public ObjectAnimator transformation;
    private Property<MaterialMenuDrawable, Float> transformationProperty;
    /* access modifiers changed from: private */
    public boolean transformationRunning;
    private float transformationValue;
    /* access modifiers changed from: private */
    public boolean visible;
    /* access modifiers changed from: private */
    public final int width;

    /* renamed from: com.instabug.library.ui.custom.MaterialMenuDrawable$3  reason: invalid class name */
    public static /* synthetic */ class AnonymousClass3 {
        public static final /* synthetic */ int[] $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$AnimationState;
        public static final /* synthetic */ int[] $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$IconState;
        public static final /* synthetic */ int[] $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$Stroke;

        /* JADX WARNING: Can't wrap try/catch for region: R(27:0|(2:1|2)|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|(2:19|20)|21|23|24|25|26|27|28|29|30|31|32|(3:33|34|36)) */
        /* JADX WARNING: Can't wrap try/catch for region: R(31:0|1|2|3|(2:5|6)|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Can't wrap try/catch for region: R(32:0|1|2|3|5|6|7|9|10|11|12|13|15|16|17|18|19|20|21|23|24|25|26|27|28|29|30|31|32|33|34|36) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x0027 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:17:0x0040 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x004a */
        /* JADX WARNING: Missing exception handler attribute for start block: B:25:0x0064 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:27:0x006e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:29:0x0078 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:31:0x0082 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:33:0x008d */
        static {
            /*
                com.instabug.library.ui.custom.MaterialMenuDrawable.IconState.values()
                r0 = 4
                int[] r1 = new int[r0]
                $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$IconState = r1
                r2 = 1
                com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r3 = com.instabug.library.ui.custom.MaterialMenuDrawable.IconState.BURGER     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r3 = r3.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r1[r3] = r2     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                r1 = 2
                int[] r3 = $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$IconState     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r4 = com.instabug.library.ui.custom.MaterialMenuDrawable.IconState.ARROW     // Catch:{ NoSuchFieldError -> 0x001c }
                int r4 = r4.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r3[r4] = r1     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                r3 = 3
                int[] r4 = $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$IconState     // Catch:{ NoSuchFieldError -> 0x0027 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r5 = com.instabug.library.ui.custom.MaterialMenuDrawable.IconState.X     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                int[] r4 = $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$IconState     // Catch:{ NoSuchFieldError -> 0x0031 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r5 = com.instabug.library.ui.custom.MaterialMenuDrawable.IconState.CHECK     // Catch:{ NoSuchFieldError -> 0x0031 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0031 }
                r4[r5] = r0     // Catch:{ NoSuchFieldError -> 0x0031 }
            L_0x0031:
                com.instabug.library.ui.custom.MaterialMenuDrawable.Stroke.values()
                int[] r4 = new int[r3]
                $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$Stroke = r4
                com.instabug.library.ui.custom.MaterialMenuDrawable$Stroke r5 = com.instabug.library.ui.custom.MaterialMenuDrawable.Stroke.REGULAR     // Catch:{ NoSuchFieldError -> 0x0040 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0040 }
                r4[r5] = r2     // Catch:{ NoSuchFieldError -> 0x0040 }
            L_0x0040:
                int[] r4 = $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$Stroke     // Catch:{ NoSuchFieldError -> 0x004a }
                com.instabug.library.ui.custom.MaterialMenuDrawable$Stroke r5 = com.instabug.library.ui.custom.MaterialMenuDrawable.Stroke.THIN     // Catch:{ NoSuchFieldError -> 0x004a }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x004a }
                r4[r5] = r1     // Catch:{ NoSuchFieldError -> 0x004a }
            L_0x004a:
                int[] r4 = $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$Stroke     // Catch:{ NoSuchFieldError -> 0x0054 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$Stroke r5 = com.instabug.library.ui.custom.MaterialMenuDrawable.Stroke.EXTRA_THIN     // Catch:{ NoSuchFieldError -> 0x0054 }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x0054 }
                r4[r5] = r3     // Catch:{ NoSuchFieldError -> 0x0054 }
            L_0x0054:
                com.instabug.library.ui.custom.MaterialMenuDrawable.AnimationState.values()
                r4 = 6
                int[] r5 = new int[r4]
                $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$AnimationState = r5
                com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r6 = com.instabug.library.ui.custom.MaterialMenuDrawable.AnimationState.BURGER_ARROW     // Catch:{ NoSuchFieldError -> 0x0064 }
                int r6 = r6.ordinal()     // Catch:{ NoSuchFieldError -> 0x0064 }
                r5[r6] = r2     // Catch:{ NoSuchFieldError -> 0x0064 }
            L_0x0064:
                int[] r2 = $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$AnimationState     // Catch:{ NoSuchFieldError -> 0x006e }
                com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r5 = com.instabug.library.ui.custom.MaterialMenuDrawable.AnimationState.BURGER_X     // Catch:{ NoSuchFieldError -> 0x006e }
                int r5 = r5.ordinal()     // Catch:{ NoSuchFieldError -> 0x006e }
                r2[r5] = r1     // Catch:{ NoSuchFieldError -> 0x006e }
            L_0x006e:
                int[] r1 = $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$AnimationState     // Catch:{ NoSuchFieldError -> 0x0078 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r2 = com.instabug.library.ui.custom.MaterialMenuDrawable.AnimationState.ARROW_X     // Catch:{ NoSuchFieldError -> 0x0078 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0078 }
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0078 }
            L_0x0078:
                int[] r1 = $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$AnimationState     // Catch:{ NoSuchFieldError -> 0x0082 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r2 = com.instabug.library.ui.custom.MaterialMenuDrawable.AnimationState.ARROW_CHECK     // Catch:{ NoSuchFieldError -> 0x0082 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0082 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0082 }
            L_0x0082:
                int[] r0 = $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$AnimationState     // Catch:{ NoSuchFieldError -> 0x008d }
                com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r1 = com.instabug.library.ui.custom.MaterialMenuDrawable.AnimationState.BURGER_CHECK     // Catch:{ NoSuchFieldError -> 0x008d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x008d }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x008d }
            L_0x008d:
                int[] r0 = $SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$AnimationState     // Catch:{ NoSuchFieldError -> 0x0097 }
                com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r1 = com.instabug.library.ui.custom.MaterialMenuDrawable.AnimationState.X_CHECK     // Catch:{ NoSuchFieldError -> 0x0097 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0097 }
                r0[r1] = r4     // Catch:{ NoSuchFieldError -> 0x0097 }
            L_0x0097:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.ui.custom.MaterialMenuDrawable.AnonymousClass3.<clinit>():void");
        }
    }

    public enum AnimationState {
        BURGER_ARROW,
        BURGER_X,
        ARROW_X,
        ARROW_CHECK,
        BURGER_CHECK,
        X_CHECK;

        @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
        public IconState getFirstState() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return IconState.BURGER;
            }
            if (ordinal == 1) {
                return IconState.BURGER;
            }
            if (ordinal == 2) {
                return IconState.ARROW;
            }
            if (ordinal == 3) {
                return IconState.ARROW;
            }
            if (ordinal == 4) {
                return IconState.BURGER;
            }
            if (ordinal != 5) {
                return null;
            }
            return IconState.X;
        }

        @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
        public IconState getSecondState() {
            int ordinal = ordinal();
            if (ordinal == 0) {
                return IconState.ARROW;
            }
            if (ordinal == 1) {
                return IconState.X;
            }
            if (ordinal == 2) {
                return IconState.X;
            }
            if (ordinal == 3) {
                return IconState.CHECK;
            }
            if (ordinal == 4) {
                return IconState.CHECK;
            }
            if (ordinal != 5) {
                return null;
            }
            return IconState.CHECK;
        }
    }

    public enum IconState {
        BURGER,
        ARROW,
        X,
        CHECK
    }

    public final class MaterialMenuState extends Drawable.ConstantState {
        /* access modifiers changed from: private */
        public int changingConfigurations;

        public int getChangingConfigurations() {
            return this.changingConfigurations;
        }

        public Drawable newDrawable() {
            MaterialMenuDrawable materialMenuDrawable = new MaterialMenuDrawable(MaterialMenuDrawable.this.circlePaint.getColor(), MaterialMenuDrawable.this.stroke, MaterialMenuDrawable.this.transformation.getDuration(), MaterialMenuDrawable.this.width, MaterialMenuDrawable.this.height, MaterialMenuDrawable.this.iconWidth, MaterialMenuDrawable.this.circleRadius, MaterialMenuDrawable.this.strokeWidth, MaterialMenuDrawable.this.dip1);
            materialMenuDrawable.setIconState(MaterialMenuDrawable.this.animatingIconState != null ? MaterialMenuDrawable.this.animatingIconState : MaterialMenuDrawable.this.currentIconState);
            materialMenuDrawable.setVisible(MaterialMenuDrawable.this.visible);
            materialMenuDrawable.setRTLEnabled(MaterialMenuDrawable.this.rtlEnabled);
            return materialMenuDrawable;
        }

        private MaterialMenuState() {
        }
    }

    public enum Stroke {
        REGULAR(3),
        THIN(2),
        EXTRA_THIN(1);
        
        /* access modifiers changed from: private */
        public final int strokeWidth;

        private Stroke(int i) {
            this.strokeWidth = i;
        }

        public static Stroke valueOf(int i) {
            if (i == 1) {
                return EXTRA_THIN;
            }
            if (i == 2) {
                return THIN;
            }
            if (i != 3) {
                return THIN;
            }
            return REGULAR;
        }
    }

    public static float dpToPx(Resources resources, float f) {
        return TypedValue.applyDimension(1, f, resources.getDisplayMetrics());
    }

    private void drawBottomLine(Canvas canvas, float f) {
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        float f11;
        Canvas canvas2 = canvas;
        float f12 = f;
        canvas.restore();
        canvas.save();
        float f13 = (float) this.width;
        float f14 = (this.dip3 / TRANSFORMATION_END) + (f13 / TRANSFORMATION_END);
        float f15 = (((float) this.height) - this.topPadding) - this.dip2;
        float f16 = this.sidePadding;
        float f17 = f13 - f16;
        int ordinal = this.animationState.ordinal();
        float f18 = TRANSFORMATION_START;
        if (ordinal != 0) {
            if (ordinal == 1) {
                float f19 = isMorphingForward() ? f12 * CHECK_BOTTOM_ANGLE : X_ROTATION_ANGLE * f12;
                float f20 = f12 * X_BOT_LINE_ANGLE;
                f3 = this.sidePadding + this.dip4;
                float f21 = ((float) this.height) - this.topPadding;
                float f22 = this.dip3;
                f2 = f21 - f22;
                f6 = (f22 * f12) + f16;
                float f23 = f20;
                f4 = f17;
                f5 = f19;
                f18 = f23;
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    f10 = (f12 * CHECK_BOTTOM_ANGLE) + 135.0f;
                    float f24 = ((float) this.width) / TRANSFORMATION_END;
                    float f25 = this.dip3 * f12;
                    f9 = (((float) this.height) / TRANSFORMATION_END) - f25;
                    f11 = f17 - resolveStrokeModifier(TRANSFORMATION_MID);
                    f6 = ((this.dip4 + this.dip1) * f12) + this.dip3 + f16;
                    f8 = f24 + f25;
                } else if (ordinal == 4) {
                    float f26 = 45.0f * f12;
                    float f27 = ((float) this.width) / TRANSFORMATION_END;
                    float f28 = this.dip3 * f12;
                    float resolveStrokeModifier = f17 - resolveStrokeModifier(f12);
                    f6 = (this.dip8 * f12) + f16;
                    f4 = resolveStrokeModifier;
                    f5 = 0.0f;
                    f18 = f26;
                    f3 = f27 + f28;
                    f2 = (((float) this.height) / TRANSFORMATION_END) - f28;
                } else if (ordinal != 5) {
                    f4 = f17;
                    f6 = f16;
                    f5 = 0.0f;
                    f3 = 0.0f;
                    f2 = 0.0f;
                } else {
                    float f29 = TRANSFORMATION_MID - f12;
                    f18 = f29 * CHECK_BOTTOM_ANGLE;
                    f10 = (89.0f * f12) + X_BOT_LINE_ANGLE;
                    float f30 = this.sidePadding;
                    float f31 = this.dip4;
                    float f32 = ((float) this.width) / TRANSFORMATION_END;
                    float f33 = this.dip3;
                    f8 = ((((f32 + f33) - f30) - f31) * f12) + f30 + f31;
                    float f34 = (float) this.height;
                    float f35 = this.topPadding;
                    float f36 = (((f34 / TRANSFORMATION_END) + f35) - f34) * f12;
                    f6 = (this.dip8 - ((f31 + this.dip1) * f29)) + f16;
                    f11 = f17 - resolveStrokeModifier(f29);
                    f9 = f36 + ((f34 - f35) - f33);
                }
                float f37 = f18;
                f18 = f10;
                f2 = f9;
                f3 = f8;
                f7 = f37;
                f4 = f11;
            } else {
                f18 = (181.0f * f12) + 135.0f;
                float f38 = f12 * CHECK_BOTTOM_ANGLE;
                float f39 = ((float) this.width) / TRANSFORMATION_END;
                float f40 = f39 + (((this.sidePadding + this.dip4) - f39) * f12);
                float f41 = ((float) this.height) / TRANSFORMATION_END;
                float a = a.a(f41 - this.topPadding, this.dip3, f12, f41);
                float resolveStrokeModifier2 = f17 - resolveStrokeModifier(f12);
                f6 = f16 + this.dip3;
                float f42 = a;
                f4 = resolveStrokeModifier2;
                f5 = f38;
                f3 = f40;
                f2 = f42;
            }
            canvas2.rotate(f18, f3, f2);
            canvas2.rotate(f5, f14, f15);
            canvas.drawLine(f6, f15, f4, f15, this.iconPaint);
        }
        float a2 = isMorphingForward() ? f12 * 135.0f : a.a(TRANSFORMATION_MID, f12, ARROW_BOT_LINE_ANGLE, 135.0f);
        float f43 = (float) this.width;
        f3 = f43 / TRANSFORMATION_END;
        f2 = ((float) this.height) / TRANSFORMATION_END;
        f4 = (f43 - this.sidePadding) - resolveStrokeModifier(f12);
        f6 = (this.dip3 * f12) + this.sidePadding;
        f7 = 0.0f;
        f18 = a2;
        f5 = f7;
        canvas2.rotate(f18, f3, f2);
        canvas2.rotate(f5, f14, f15);
        canvas.drawLine(f6, f15, f4, f15, this.iconPaint);
    }

    private void drawMiddleLine(Canvas canvas, float f) {
        float f2;
        int i;
        float f3;
        float f4;
        int i2;
        float f5;
        float f6;
        float f7;
        float f8;
        canvas.restore();
        canvas.save();
        float f9 = (float) this.width;
        float f10 = f9 / TRANSFORMATION_END;
        float f11 = this.sidePadding;
        float f12 = ((this.dip3 / TRANSFORMATION_END) * 5.0f) + this.topPadding;
        float f13 = f9 - f11;
        int ordinal = this.animationState.ordinal();
        float f14 = TRANSFORMATION_START;
        if (ordinal != 0) {
            if (ordinal == 1) {
                i2 = (int) ((TRANSFORMATION_MID - f) * 255.0f);
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    f5 = isMorphingForward() ? 135.0f * f : 135.0f - ((TRANSFORMATION_MID - f) * 135.0f);
                    float f15 = this.dip3;
                    f6 = (((f15 / TRANSFORMATION_END) + this.dip4) - ((TRANSFORMATION_MID - f) * this.dip2)) + f11;
                    f4 = (f * this.dip1) + f13;
                    f7 = (((float) this.width) / TRANSFORMATION_END) + f15;
                    f8 = this.diph;
                } else if (ordinal == 4) {
                    f5 = 135.0f * f;
                    float f16 = this.dip4;
                    float f17 = this.dip3;
                    f6 = (((f17 / TRANSFORMATION_END) + f16) * f) + f11;
                    f4 = (f * this.dip1) + f13;
                    f7 = (((float) this.width) / TRANSFORMATION_END) + f17;
                    f8 = this.diph;
                } else if (ordinal == 5) {
                    i = (int) (255.0f * f);
                    f14 = f * 135.0f;
                    float f18 = this.dip4;
                    float f19 = this.dip3;
                    float f20 = (((f19 / TRANSFORMATION_END) + f18) * f) + f11;
                    float f21 = (f * this.dip1) + f13;
                    f3 = (((float) this.width) / TRANSFORMATION_END) + f19 + this.diph;
                    f11 = f20;
                    f2 = f21;
                    this.iconPaint.setAlpha(i);
                    canvas.rotate(f14, f3, f10);
                    canvas.drawLine(f11, f12, f2, f12, this.iconPaint);
                    this.iconPaint.setAlpha(255);
                }
                f11 = f6;
                f3 = f7 + f8;
                f14 = f5;
                f2 = f4;
                i = 255;
                this.iconPaint.setAlpha(i);
                canvas.rotate(f14, f3, f10);
                canvas.drawLine(f11, f12, f2, f12, this.iconPaint);
                this.iconPaint.setAlpha(255);
            } else {
                float f22 = TRANSFORMATION_MID - f;
                i2 = (int) (255.0f * f22);
                f11 += f22 * this.dip2;
            }
            i = i2;
            f2 = f13;
            f3 = f10;
            this.iconPaint.setAlpha(i);
            canvas.rotate(f14, f3, f10);
            canvas.drawLine(f11, f12, f2, f12, this.iconPaint);
            this.iconPaint.setAlpha(255);
        }
        f14 = isMorphingForward() ? ARROW_MID_LINE_ANGLE * f : a.a(TRANSFORMATION_MID, f, ARROW_MID_LINE_ANGLE, ARROW_MID_LINE_ANGLE);
        f13 -= (f * resolveStrokeModifier(f)) / TRANSFORMATION_END;
        f4 = f13;
        f3 = f10;
        f2 = f4;
        i = 255;
        this.iconPaint.setAlpha(i);
        canvas.rotate(f14, f3, f10);
        canvas.drawLine(f11, f12, f2, f12, this.iconPaint);
        this.iconPaint.setAlpha(255);
    }

    private void drawTopLine(Canvas canvas, float f) {
        float f2;
        float f3;
        int i;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        float f9;
        float f10;
        Canvas canvas2 = canvas;
        float f11 = f;
        canvas.save();
        float f12 = (float) this.width;
        float f13 = (this.dip3 / TRANSFORMATION_END) + (f12 / TRANSFORMATION_END);
        float f14 = this.topPadding + this.dip2;
        float f15 = this.sidePadding;
        float f16 = f12 - f15;
        int ordinal = this.animationState.ordinal();
        float f17 = X_TOP_LINE_ANGLE;
        float f18 = X_ROTATION_ANGLE;
        float f19 = TRANSFORMATION_START;
        if (ordinal != 0) {
            if (ordinal == 1) {
                f9 = f11 * X_TOP_LINE_ANGLE;
                f8 = f11 * X_ROTATION_ANGLE;
                f6 = this.sidePadding + this.dip4;
                float f20 = this.topPadding;
                float f21 = this.dip3;
                f10 = f20 + f21;
                f7 = f15 + (f21 * f11);
            } else if (ordinal != 2) {
                if (ordinal == 3) {
                    float f22 = ((float) this.width) / TRANSFORMATION_END;
                    float f23 = ((float) this.height) / TRANSFORMATION_END;
                    float resolveStrokeModifier = f16 - resolveStrokeModifier(TRANSFORMATION_MID);
                    float f24 = f15 + this.dip3;
                    f3 = resolveStrokeModifier;
                    f18 = 0.0f;
                    i = (int) ((TRANSFORMATION_MID - f11) * 255.0f);
                    f4 = f24;
                    f19 = f22;
                    f2 = f23;
                    f17 = 225.0f;
                } else if (ordinal == 4) {
                    f3 = f16;
                    f17 = 0.0f;
                    f18 = 0.0f;
                    i = (int) ((TRANSFORMATION_MID - f11) * 255.0f);
                    f4 = f15;
                    f2 = 0.0f;
                } else if (ordinal != 5) {
                    f3 = f16;
                    f4 = f15;
                    i = 255;
                    f2 = 0.0f;
                    f17 = 0.0f;
                    f18 = 0.0f;
                } else {
                    f19 = this.sidePadding + this.dip4;
                    float f25 = this.topPadding;
                    float f26 = this.dip3;
                    float f27 = TRANSFORMATION_MID - f11;
                    float f28 = (f26 - (f26 * f27)) + f16;
                    i = (int) (f27 * 255.0f);
                    float f29 = f25 + f26;
                    f3 = f28;
                    f4 = f15 + f26;
                    f2 = f29;
                }
                this.iconPaint.setAlpha(i);
                canvas2.rotate(f17, f19, f2);
                canvas2.rotate(f18, f13, f14);
                canvas.drawLine(f4, f14, f3, f14, this.iconPaint);
                this.iconPaint.setAlpha(255);
            } else {
                f9 = (-181.0f * f11) + ARROW_BOT_LINE_ANGLE;
                f8 = f11 * X_ROTATION_ANGLE;
                float f30 = ((float) this.width) / TRANSFORMATION_END;
                f6 = (((this.sidePadding + this.dip4) - f30) * f11) + f30;
                float f31 = ((float) this.height) / TRANSFORMATION_END;
                f10 = (((this.topPadding + this.dip3) - f31) * f11) + f31;
                f16 -= resolveStrokeModifier(f11);
                f7 = f15 + this.dip3;
            }
            f5 = f10;
            f18 = f8;
            f17 = f9;
        } else {
            float a = isMorphingForward() ? f11 * ARROW_BOT_LINE_ANGLE : a.a(TRANSFORMATION_MID, f11, 135.0f, ARROW_BOT_LINE_ANGLE);
            float f32 = ((float) this.width) / TRANSFORMATION_END;
            float f33 = ((float) this.height) / TRANSFORMATION_END;
            f16 -= resolveStrokeModifier(f11);
            f7 = f15 + (this.dip3 * f11);
            f6 = f32;
            f17 = a;
            f5 = f33;
            f18 = 0.0f;
        }
        f3 = f16;
        f4 = f7;
        i = 255;
        f2 = f5;
        f19 = f6;
        this.iconPaint.setAlpha(i);
        canvas2.rotate(f17, f19, f2);
        canvas2.rotate(f18, f13, f14);
        canvas.drawLine(f4, f14, f3, f14, this.iconPaint);
        this.iconPaint.setAlpha(255);
    }

    private void initAnimations(int i) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this, this.transformationProperty, new float[]{0.0f});
        this.transformation = ofFloat;
        ofFloat.setInterpolator(new DecelerateInterpolator(3.0f));
        this.transformation.setDuration((long) i);
        this.transformation.addListener(new AnimatorListenerAdapter() {
            public void onAnimationEnd(Animator animator) {
                boolean unused = MaterialMenuDrawable.this.transformationRunning = false;
                MaterialMenuDrawable materialMenuDrawable = MaterialMenuDrawable.this;
                materialMenuDrawable.setIconState(materialMenuDrawable.animatingIconState);
            }
        });
    }

    private void initPaint(int i) {
        this.iconPaint.setAntiAlias(true);
        this.iconPaint.setStyle(Paint.Style.STROKE);
        this.iconPaint.setStrokeWidth(this.strokeWidth);
        this.iconPaint.setColor(i);
        this.circlePaint.setAntiAlias(true);
        this.circlePaint.setStyle(Paint.Style.FILL);
        this.circlePaint.setColor(i);
        this.circlePaint.setAlpha(200);
        setBounds(0, 0, this.width, this.height);
    }

    private boolean isMorphingForward() {
        return this.transformationValue <= TRANSFORMATION_MID;
    }

    private float resolveStrokeModifier(float f) {
        float f2;
        int i = AnonymousClass3.$SwitchMap$com$instabug$library$ui$custom$MaterialMenuDrawable$Stroke[this.stroke.ordinal()];
        if (i == 1) {
            AnimationState animationState2 = this.animationState;
            if (animationState2 == AnimationState.ARROW_X || animationState2 == AnimationState.X_CHECK) {
                float f3 = this.dip3;
                return f3 - (f * f3);
            }
            f2 = this.dip3;
        } else if (i == 2) {
            AnimationState animationState3 = this.animationState;
            if (animationState3 != AnimationState.ARROW_X && animationState3 != AnimationState.X_CHECK) {
                return (this.dip3 + this.diph) * f;
            }
            float f4 = this.dip3 + this.diph;
            return f4 - (f * f4);
        } else if (i != 3) {
            return TRANSFORMATION_START;
        } else {
            AnimationState animationState4 = this.animationState;
            if (animationState4 == AnimationState.ARROW_X || animationState4 == AnimationState.X_CHECK) {
                return this.dip4 - ((this.dip3 + this.dip1) * f);
            }
            f2 = this.dip4;
        }
        return f * f2;
    }

    private boolean resolveTransformation() {
        IconState iconState = this.currentIconState;
        IconState iconState2 = IconState.BURGER;
        boolean z = iconState == iconState2;
        IconState iconState3 = IconState.ARROW;
        boolean z2 = iconState == iconState3;
        IconState iconState4 = IconState.X;
        boolean z3 = iconState == iconState4;
        IconState iconState5 = IconState.CHECK;
        boolean z4 = iconState == iconState5;
        IconState iconState6 = this.animatingIconState;
        boolean z5 = iconState6 == iconState2;
        boolean z6 = iconState6 == iconState3;
        boolean z7 = iconState6 == iconState4;
        boolean z8 = iconState6 == iconState5;
        if ((z && z6) || (z2 && z5)) {
            this.animationState = AnimationState.BURGER_ARROW;
            return z;
        } else if ((z2 && z7) || (z3 && z6)) {
            this.animationState = AnimationState.ARROW_X;
            return z2;
        } else if ((z && z7) || (z3 && z5)) {
            this.animationState = AnimationState.BURGER_X;
            return z;
        } else if ((z2 && z8) || (z4 && z6)) {
            this.animationState = AnimationState.ARROW_CHECK;
            return z2;
        } else if ((z && z8) || (z4 && z5)) {
            this.animationState = AnimationState.BURGER_CHECK;
            return z;
        } else if ((!z3 || !z8) && (!z4 || !z7)) {
            throw new IllegalStateException(String.format("Animating from %s to %s is not supported", new Object[]{this.currentIconState, this.animatingIconState}));
        } else {
            this.animationState = AnimationState.X_CHECK;
            return z3;
        }
    }

    public void animateIconState(IconState iconState) {
        synchronized (this.lock) {
            if (this.transformationRunning) {
                this.transformation.end();
            }
            this.animatingIconState = iconState;
            start();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003d, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void draw(android.graphics.Canvas r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.lock
            monitor-enter(r0)
            boolean r1 = r5.visible     // Catch:{ all -> 0x003e }
            if (r1 != 0) goto L_0x0009
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return
        L_0x0009:
            float r1 = r5.transformationValue     // Catch:{ all -> 0x003e }
            r2 = 1065353216(0x3f800000, float:1.0)
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L_0x0012
            goto L_0x0016
        L_0x0012:
            r3 = 1073741824(0x40000000, float:2.0)
            float r1 = r3 - r1
        L_0x0016:
            boolean r3 = r5.rtlEnabled     // Catch:{ all -> 0x003e }
            if (r3 == 0) goto L_0x002c
            r6.save()     // Catch:{ all -> 0x003e }
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r4 = 0
            r6.scale(r3, r2, r4, r4)     // Catch:{ all -> 0x003e }
            int r2 = r5.getIntrinsicWidth()     // Catch:{ all -> 0x003e }
            int r2 = -r2
            float r2 = (float) r2     // Catch:{ all -> 0x003e }
            r6.translate(r2, r4)     // Catch:{ all -> 0x003e }
        L_0x002c:
            r5.drawTopLine(r6, r1)     // Catch:{ all -> 0x003e }
            r5.drawMiddleLine(r6, r1)     // Catch:{ all -> 0x003e }
            r5.drawBottomLine(r6, r1)     // Catch:{ all -> 0x003e }
            boolean r1 = r5.rtlEnabled     // Catch:{ all -> 0x003e }
            if (r1 == 0) goto L_0x003c
            r6.restore()     // Catch:{ all -> 0x003e }
        L_0x003c:
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            return
        L_0x003e:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x003e }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.ui.custom.MaterialMenuDrawable.draw(android.graphics.Canvas):void");
    }

    public Drawable.ConstantState getConstantState() {
        int unused = this.materialMenuState.changingConfigurations = getChangingConfigurations();
        return this.materialMenuState;
    }

    public IconState getIconState() {
        IconState iconState;
        synchronized (this.lock) {
            iconState = this.currentIconState;
        }
        return iconState;
    }

    public int getIntrinsicHeight() {
        return this.height;
    }

    public int getIntrinsicWidth() {
        return this.width;
    }

    public int getOpacity() {
        return -2;
    }

    public Float getTransformationValue() {
        Float valueOf;
        synchronized (this.lock) {
            valueOf = Float.valueOf(this.transformationValue);
        }
        return valueOf;
    }

    public boolean isDrawableVisible() {
        return this.visible;
    }

    public boolean isRunning() {
        boolean z;
        synchronized (this.lock) {
            z = this.transformationRunning;
        }
        return z;
    }

    public Drawable mutate() {
        this.materialMenuState = new MaterialMenuState();
        return this;
    }

    public void setAlpha(int i) {
        this.iconPaint.setAlpha(i);
    }

    public void setAnimationListener(Animator.AnimatorListener animatorListener2) {
        Animator.AnimatorListener animatorListener3 = this.animatorListener;
        if (animatorListener3 != null) {
            this.transformation.removeListener(animatorListener3);
        }
        if (animatorListener2 != null) {
            this.transformation.addListener(animatorListener2);
        }
        this.animatorListener = animatorListener2;
    }

    public void setColor(int i) {
        this.iconPaint.setColor(i);
        this.circlePaint.setColor(i);
        invalidateSelf();
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void setColorFilter(ColorFilter colorFilter) {
        this.iconPaint.setColorFilter(colorFilter);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x004c, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void setIconState(com.instabug.library.ui.custom.MaterialMenuDrawable.IconState r5) {
        /*
            r4 = this;
            java.lang.Object r0 = r4.lock
            monitor-enter(r0)
            boolean r1 = r4.transformationRunning     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x000f
            android.animation.ObjectAnimator r1 = r4.transformation     // Catch:{ all -> 0x004d }
            r1.cancel()     // Catch:{ all -> 0x004d }
            r1 = 0
            r4.transformationRunning = r1     // Catch:{ all -> 0x004d }
        L_0x000f:
            if (r5 == 0) goto L_0x004b
            com.instabug.library.ui.custom.MaterialMenuDrawable$IconState r1 = r4.currentIconState     // Catch:{ all -> 0x004d }
            if (r1 != r5) goto L_0x0016
            goto L_0x004b
        L_0x0016:
            int r1 = r5.ordinal()     // Catch:{ all -> 0x004d }
            if (r1 == 0) goto L_0x003d
            r2 = 1
            r3 = 1065353216(0x3f800000, float:1.0)
            if (r1 == r2) goto L_0x0036
            r2 = 2
            if (r1 == r2) goto L_0x002f
            r2 = 3
            if (r1 == r2) goto L_0x0028
            goto L_0x0044
        L_0x0028:
            com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r1 = com.instabug.library.ui.custom.MaterialMenuDrawable.AnimationState.BURGER_CHECK     // Catch:{ all -> 0x004d }
            r4.animationState = r1     // Catch:{ all -> 0x004d }
            r4.transformationValue = r3     // Catch:{ all -> 0x004d }
            goto L_0x0044
        L_0x002f:
            com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r1 = com.instabug.library.ui.custom.MaterialMenuDrawable.AnimationState.BURGER_X     // Catch:{ all -> 0x004d }
            r4.animationState = r1     // Catch:{ all -> 0x004d }
            r4.transformationValue = r3     // Catch:{ all -> 0x004d }
            goto L_0x0044
        L_0x0036:
            com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r1 = com.instabug.library.ui.custom.MaterialMenuDrawable.AnimationState.BURGER_ARROW     // Catch:{ all -> 0x004d }
            r4.animationState = r1     // Catch:{ all -> 0x004d }
            r4.transformationValue = r3     // Catch:{ all -> 0x004d }
            goto L_0x0044
        L_0x003d:
            com.instabug.library.ui.custom.MaterialMenuDrawable$AnimationState r1 = com.instabug.library.ui.custom.MaterialMenuDrawable.AnimationState.BURGER_ARROW     // Catch:{ all -> 0x004d }
            r4.animationState = r1     // Catch:{ all -> 0x004d }
            r1 = 0
            r4.transformationValue = r1     // Catch:{ all -> 0x004d }
        L_0x0044:
            r4.currentIconState = r5     // Catch:{ all -> 0x004d }
            r4.invalidateSelf()     // Catch:{ all -> 0x004d }
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x004b:
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            return
        L_0x004d:
            r5 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x004d }
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.ui.custom.MaterialMenuDrawable.setIconState(com.instabug.library.ui.custom.MaterialMenuDrawable$IconState):void");
    }

    public void setInterpolator(Interpolator interpolator) {
        this.transformation.setInterpolator(interpolator);
    }

    public void setRTLEnabled(boolean z) {
        this.rtlEnabled = z;
        invalidateSelf();
    }

    public void setTransformationDuration(int i) {
        this.transformation.setDuration((long) i);
    }

    public IconState setTransformationOffset(AnimationState animationState2, float f) {
        int i;
        IconState iconState;
        boolean z = true;
        if (f < TRANSFORMATION_START || f > TRANSFORMATION_END) {
            throw new IllegalArgumentException(String.format("Value must be between %s and %s", new Object[]{Float.valueOf(TRANSFORMATION_START), Float.valueOf(TRANSFORMATION_END)}));
        }
        synchronized (this.lock) {
            this.animationState = animationState2;
            if (f >= TRANSFORMATION_MID) {
                if (i != 0) {
                    z = false;
                }
            }
            this.currentIconState = z ? animationState2.getFirstState() : animationState2.getSecondState();
            this.animatingIconState = z ? animationState2.getSecondState() : animationState2.getFirstState();
            setTransformationValue(Float.valueOf(f));
            iconState = this.currentIconState;
        }
        return iconState;
    }

    public void setTransformationValue(Float f) {
        synchronized (this.lock) {
            this.transformationValue = f.floatValue();
            invalidateSelf();
        }
    }

    public void setVisible(boolean z) {
        this.visible = z;
        invalidateSelf();
    }

    public void start() {
        synchronized (this.lock) {
            if (!this.transformationRunning) {
                IconState iconState = this.animatingIconState;
                if (!(iconState == null || iconState == this.currentIconState)) {
                    this.transformationRunning = true;
                    boolean resolveTransformation = resolveTransformation();
                    ObjectAnimator objectAnimator = this.transformation;
                    float[] fArr = new float[2];
                    float f = TRANSFORMATION_MID;
                    fArr[0] = resolveTransformation ? TRANSFORMATION_START : 1.0f;
                    if (!resolveTransformation) {
                        f = TRANSFORMATION_END;
                    }
                    fArr[1] = f;
                    objectAnimator.setFloatValues(fArr);
                    this.transformation.start();
                }
                invalidateSelf();
            }
        }
    }

    public void stop() {
        synchronized (this.lock) {
            if (!isRunning() || !this.transformation.isRunning()) {
                this.transformationRunning = false;
                invalidateSelf();
            } else {
                this.transformation.end();
            }
        }
    }

    public MaterialMenuDrawable(Context context, int i, Stroke stroke2) {
        this(context, i, stroke2, 1, DEFAULT_TRANSFORM_DURATION);
    }

    public MaterialMenuDrawable(Context context, int i, Stroke stroke2, int i2) {
        this(context, i, stroke2, 1, i2);
    }

    public MaterialMenuDrawable(Context context, int i, Stroke stroke2, int i2, int i3) {
        this.lock = new Object();
        this.iconPaint = new Paint();
        this.circlePaint = new Paint();
        this.transformationValue = TRANSFORMATION_START;
        this.transformationRunning = false;
        this.currentIconState = IconState.BURGER;
        this.animationState = AnimationState.BURGER_ARROW;
        this.transformationProperty = new Property<MaterialMenuDrawable, Float>(Float.class, "transformation") {
            public Float get(MaterialMenuDrawable materialMenuDrawable) {
                return materialMenuDrawable.getTransformationValue();
            }

            public void set(MaterialMenuDrawable materialMenuDrawable, Float f) {
                materialMenuDrawable.setTransformationValue(f);
            }
        };
        Resources resources = context.getResources();
        float f = (float) i2;
        float dpToPx = dpToPx(resources, TRANSFORMATION_MID) * f;
        this.dip1 = dpToPx;
        this.dip2 = dpToPx(resources, TRANSFORMATION_END) * f;
        float dpToPx2 = dpToPx(resources, 3.0f) * f;
        this.dip3 = dpToPx2;
        this.dip4 = dpToPx(resources, 4.0f) * f;
        this.dip8 = dpToPx(resources, 8.0f) * f;
        this.diph = dpToPx / TRANSFORMATION_END;
        this.stroke = stroke2;
        this.visible = true;
        int dpToPx3 = (int) (dpToPx(resources, 40.0f) * f);
        this.width = dpToPx3;
        int dpToPx4 = (int) (dpToPx(resources, 40.0f) * f);
        this.height = dpToPx4;
        float dpToPx5 = dpToPx(resources, 20.0f) * f;
        this.iconWidth = dpToPx5;
        this.circleRadius = dpToPx(resources, 18.0f) * f;
        this.strokeWidth = dpToPx(resources, (float) stroke2.strokeWidth) * f;
        this.sidePadding = (((float) dpToPx3) - dpToPx5) / TRANSFORMATION_END;
        this.topPadding = (((float) dpToPx4) - (dpToPx2 * 5.0f)) / TRANSFORMATION_END;
        initPaint(i);
        initAnimations(i3);
        this.materialMenuState = new MaterialMenuState();
    }

    private MaterialMenuDrawable(int i, Stroke stroke2, long j, int i2, int i3, float f, float f2, float f3, float f4) {
        this.lock = new Object();
        this.iconPaint = new Paint();
        this.circlePaint = new Paint();
        this.transformationValue = TRANSFORMATION_START;
        this.transformationRunning = false;
        this.currentIconState = IconState.BURGER;
        this.animationState = AnimationState.BURGER_ARROW;
        this.transformationProperty = new Property<MaterialMenuDrawable, Float>(Float.class, "transformation") {
            public Float get(MaterialMenuDrawable materialMenuDrawable) {
                return materialMenuDrawable.getTransformationValue();
            }

            public void set(MaterialMenuDrawable materialMenuDrawable, Float f) {
                materialMenuDrawable.setTransformationValue(f);
            }
        };
        this.dip1 = f4;
        this.dip2 = f4 * TRANSFORMATION_END;
        float f5 = 3.0f * f4;
        this.dip3 = f5;
        this.dip4 = 4.0f * f4;
        this.dip8 = 8.0f * f4;
        this.diph = f4 / TRANSFORMATION_END;
        this.stroke = stroke2;
        this.width = i2;
        this.height = i3;
        this.iconWidth = f;
        this.circleRadius = f2;
        this.strokeWidth = f3;
        this.sidePadding = (((float) i2) - f) / TRANSFORMATION_END;
        this.topPadding = (((float) i3) - (f5 * 5.0f)) / TRANSFORMATION_END;
        initPaint(i);
        initAnimations((int) j);
        this.materialMenuState = new MaterialMenuState();
    }
}
