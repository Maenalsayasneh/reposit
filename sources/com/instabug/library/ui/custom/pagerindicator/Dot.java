package com.instabug.library.ui.custom.pagerindicator;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.util.AttributeSet;
import android.util.Log;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import com.instabug.library.R;
import com.instabug.library.view.ViewUtils;

public final class Dot extends RelativeLayout {
    private static final int DEFAULT_ACTIVE_COLOR = -1;
    private static final int DEFAULT_ACTIVE_DIAMETER_DP = 9;
    private static final int DEFAULT_INACTIVE_COLOR = -1;
    private static final int DEFAULT_INACTIVE_DIAMETER_DP = 6;
    private static final boolean DEFAULT_INITIALLY_ACTIVE = false;
    private static final int DEFAULT_TRANSITION_DURATION_MS = 200;
    private static final String TAG = "DOT";
    private int activeColor;
    private int activeDiameterPx;
    /* access modifiers changed from: private */
    public AnimatorSet currentAnimator;
    private ImageView drawableHolder;
    private int inactiveColor;
    private int inactiveDiameterPx;
    private ShapeDrawable shape;
    /* access modifiers changed from: private */
    public State state;
    private int transitionDurationMs;

    public enum State {
        INACTIVE(true, (int) null, (boolean) null),
        ACTIVE(true, (int) null, (boolean) null),
        TRANSITIONING_TO_ACTIVE(false, r7, r0),
        TRANSITIONING_TO_INACTIVE(false, r0, r7);
        
        private final State from;
        private final boolean isStable;
        private final State to;

        private State(boolean z, State state, State state2) {
            this.isStable = z;
            this.to = state;
            this.from = state2;
        }

        public boolean isStable() {
            return this.isStable;
        }

        public State transitioningFrom() {
            return this.from;
        }

        public State transitioningTo() {
            return this.to;
        }
    }

    public Dot(Context context) {
        this(context, (AttributeSet) null);
    }

    private void animateDotChange(int i, int i2, int i3, final int i4, int i5) {
        if (i < 0) {
            throw new IllegalArgumentException("startSize cannot be less than 0");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("endSize cannot be less than 0");
        } else if (i5 >= 0) {
            AnimatorSet animatorSet = this.currentAnimator;
            if (animatorSet != null) {
                animatorSet.cancel();
            }
            AnimatorSet animatorSet2 = new AnimatorSet();
            this.currentAnimator = animatorSet2;
            animatorSet2.setDuration((long) i5);
            final int i6 = i2;
            final int i7 = i4;
            final int i8 = i;
            final int i9 = i3;
            this.currentAnimator.addListener(new AnimatorListenerAdapter() {
                public void onAnimationCancel(Animator animator) {
                    if (Dot.this.state != null && !Dot.this.state.isStable()) {
                        Dot dot = Dot.this;
                        State unused = dot.state = dot.state.transitioningFrom();
                    }
                    Dot.this.changeSize(i8);
                    Dot.this.changeColor(i9);
                    AnimatorSet unused2 = Dot.this.currentAnimator = null;
                }

                public void onAnimationEnd(Animator animator) {
                    if (Dot.this.state != null && !Dot.this.state.isStable()) {
                        Dot dot = Dot.this;
                        State unused = dot.state = dot.state.transitioningTo();
                    }
                    Dot.this.changeSize(i6);
                    Dot.this.changeColor(i7);
                    AnimatorSet unused2 = Dot.this.currentAnimator = null;
                }

                public void onAnimationStart(Animator animator) {
                    if (Dot.this.state == State.INACTIVE) {
                        State unused = Dot.this.state = State.TRANSITIONING_TO_ACTIVE;
                    } else if (Dot.this.state == State.ACTIVE) {
                        State unused2 = Dot.this.state = State.TRANSITIONING_TO_INACTIVE;
                    }
                }
            });
            ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
            ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Dot.this.changeSize(((Integer) valueAnimator.getAnimatedValue()).intValue());
                }
            });
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() {
                public void onAnimationUpdate(ValueAnimator valueAnimator) {
                    Dot.this.changeColor(i4);
                }
            });
            AnimatorSet animatorSet3 = this.currentAnimator;
            if (animatorSet3 != null) {
                animatorSet3.playTogether(new Animator[]{ofInt, ofFloat});
                this.currentAnimator.start();
            }
        } else {
            throw new IllegalArgumentException("duration cannot be less than 0");
        }
    }

    /* access modifiers changed from: private */
    public void changeColor(int i) {
        this.shape.getPaint().setColor(i);
    }

    /* access modifiers changed from: private */
    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void changeSize(int i) {
        this.shape.setIntrinsicWidth(i);
        this.shape.setIntrinsicHeight(i);
        this.drawableHolder.setImageDrawable((Drawable) null);
        this.drawableHolder.setImageDrawable(this.shape);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE", "CustomViewStyleable"})
    private void init(AttributeSet attributeSet, int i) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R.styleable.IBDot, i, 0);
        int convertDpToPx = ViewUtils.convertDpToPx(getContext(), 9.0f);
        this.inactiveDiameterPx = obtainStyledAttributes.getDimensionPixelSize(R.styleable.IBDot_ibViewPagerInactiveDiameter, ViewUtils.convertDpToPx(getContext(), 6.0f));
        this.activeDiameterPx = obtainStyledAttributes.getDimensionPixelSize(R.styleable.IBDot_ibViewPagerActiveDiameter, convertDpToPx);
        this.inactiveColor = obtainStyledAttributes.getColor(R.styleable.IBDot_ibViewPagerInactiveColor, -1);
        this.activeColor = obtainStyledAttributes.getColor(R.styleable.IBDot_ibViewPagerActiveColor, -1);
        this.transitionDurationMs = obtainStyledAttributes.getInt(R.styleable.IBDot_ibViewPagerTransitionDuration, 200);
        this.state = obtainStyledAttributes.getBoolean(R.styleable.IBDot_ibViewPagerInitiallyActive, false) ? State.ACTIVE : State.INACTIVE;
        obtainStyledAttributes.recycle();
        reflectParametersInView();
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    private void reflectParametersInView() {
        removeAllViews();
        int max = Math.max(this.inactiveDiameterPx, this.activeDiameterPx);
        setLayoutParams(new RelativeLayout.LayoutParams(max, max));
        setGravity(17);
        State state2 = this.state;
        State state3 = State.ACTIVE;
        int i = state2 == state3 ? this.activeDiameterPx : this.inactiveDiameterPx;
        int i2 = state2 == state3 ? this.activeColor : this.inactiveColor;
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        this.shape = shapeDrawable;
        shapeDrawable.setIntrinsicWidth(i);
        this.shape.setIntrinsicHeight(i);
        this.shape.getPaint().setColor(i2);
        ImageView imageView = new ImageView(getContext());
        this.drawableHolder = imageView;
        imageView.setImageDrawable((Drawable) null);
        this.drawableHolder.setImageDrawable(this.shape);
        addView(this.drawableHolder);
    }

    public int getActiveColor() {
        return this.activeColor;
    }

    public int getActiveDiameter() {
        return this.activeDiameterPx;
    }

    public int getInactiveColor() {
        return this.inactiveColor;
    }

    public int getInactiveDiameter() {
        return this.inactiveDiameterPx;
    }

    public int getTransitionDuration() {
        return this.transitionDurationMs;
    }

    public void setActive(boolean z) {
        AnimatorSet animatorSet = this.currentAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z && this.state != State.ACTIVE && this.transitionDurationMs > 0) {
            animateDotChange(this.inactiveDiameterPx, this.activeDiameterPx, this.inactiveColor, this.activeColor, this.transitionDurationMs);
            return;
        }
        changeSize(this.activeDiameterPx);
        changeColor(this.activeColor);
        this.state = State.ACTIVE;
    }

    public Dot setActiveColor(int i) {
        this.activeColor = i;
        reflectParametersInView();
        return this;
    }

    public Dot setActiveDiameterDp(int i) {
        if (i >= 0) {
            setActiveDiameterPx(i);
            return this;
        }
        throw new IllegalArgumentException("activeDiameterDp cannot be less than 0");
    }

    public Dot setActiveDiameterPx(int i) {
        if (i >= 0) {
            this.activeDiameterPx = i;
            reflectParametersInView();
            return this;
        }
        throw new IllegalArgumentException("activeDiameterPx cannot be less than 0");
    }

    public void setInactive(boolean z) {
        AnimatorSet animatorSet = this.currentAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        if (z && this.state != State.INACTIVE && this.transitionDurationMs > 0) {
            animateDotChange(this.activeDiameterPx, this.inactiveDiameterPx, this.activeColor, this.inactiveColor, this.transitionDurationMs);
            return;
        }
        changeSize(this.inactiveDiameterPx);
        changeColor(this.inactiveColor);
        this.state = State.INACTIVE;
    }

    public Dot setInactiveColor(int i) {
        this.inactiveColor = i;
        reflectParametersInView();
        return this;
    }

    public Dot setInactiveDiameterDp(int i) {
        if (i >= 0) {
            setInactiveDiameterPx(ViewUtils.convertDpToPx(getContext(), (float) i));
            return this;
        }
        throw new IllegalArgumentException("inactiveDiameterDp cannot be less than 0");
    }

    public Dot setInactiveDiameterPx(int i) {
        if (i >= 0) {
            this.inactiveDiameterPx = i;
            reflectParametersInView();
            return this;
        }
        throw new IllegalArgumentException("inactiveDiameterPx cannot be less than 0");
    }

    public Dot setTransitionDuration(int i) {
        if (i >= 0) {
            this.transitionDurationMs = i;
            return this;
        }
        throw new IllegalArgumentException("transitionDurationMs cannot be less than 0");
    }

    public void toggleState(boolean z) {
        AnimatorSet animatorSet = this.currentAnimator;
        if (animatorSet != null) {
            animatorSet.cancel();
        }
        State state2 = this.state;
        if (state2 != State.ACTIVE) {
            setActive(z);
        } else if (state2 != State.INACTIVE) {
            setInactive(z);
        } else {
            Log.e(TAG, "[Animation trying to start from illegal state]");
        }
    }

    public Dot(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public Dot(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.currentAnimator = null;
        init(attributeSet, i);
    }
}
