package h0.v.a;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.animation.Interpolator;
import androidx.recyclerview.R;
import androidx.recyclerview.widget.RecyclerView;
import h0.i.i.f;
import h0.i.i.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ItemTouchHelper */
public class k extends RecyclerView.m implements RecyclerView.p {
    public float Y1;
    public float Z1;
    public float a2;
    public float b2;
    public final List<View> c = new ArrayList();
    public float c2;
    public final float[] d = new float[2];
    public float d2;
    public int e2 = -1;
    public d f2;
    public int g2 = 0;
    public int h2;
    public List<f> i2 = new ArrayList();
    public int j2;
    public RecyclerView k2;
    public final Runnable l2 = new a();
    public VelocityTracker m2;
    public List<RecyclerView.b0> n2;
    public List<Integer> o2;
    public View p2 = null;
    public RecyclerView.b0 q = null;
    public int q2 = -1;
    public h0.i.i.f r2;
    public e s2;
    public final RecyclerView.r t2 = new b();
    public Rect u2;
    public long v2;
    public float x;
    public float y;

    /* compiled from: ItemTouchHelper */
    public class a implements Runnable {
        public a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0088  */
        /* JADX WARNING: Removed duplicated region for block: B:35:0x00cb  */
        /* JADX WARNING: Removed duplicated region for block: B:38:0x00e5  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0101  */
        /* JADX WARNING: Removed duplicated region for block: B:41:0x0104 A[ADDED_TO_REGION] */
        /* JADX WARNING: Removed duplicated region for block: B:45:0x0110  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void run() {
            /*
                r17 = this;
                r0 = r17
                h0.v.a.k r1 = h0.v.a.k.this
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r1.q
                if (r2 == 0) goto L_0x0135
                r3 = 0
                r4 = -9223372036854775808
                if (r2 != 0) goto L_0x0011
                r1.v2 = r4
                goto L_0x0118
            L_0x0011:
                long r6 = java.lang.System.currentTimeMillis()
                long r8 = r1.v2
                int r2 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r2 != 0) goto L_0x001e
                r8 = 0
                goto L_0x0020
            L_0x001e:
                long r8 = r6 - r8
            L_0x0020:
                androidx.recyclerview.widget.RecyclerView r2 = r1.k2
                androidx.recyclerview.widget.RecyclerView$n r2 = r2.getLayoutManager()
                android.graphics.Rect r10 = r1.u2
                if (r10 != 0) goto L_0x0031
                android.graphics.Rect r10 = new android.graphics.Rect
                r10.<init>()
                r1.u2 = r10
            L_0x0031:
                androidx.recyclerview.widget.RecyclerView$b0 r10 = r1.q
                android.view.View r10 = r10.itemView
                android.graphics.Rect r11 = r1.u2
                r2.calculateItemDecorationsForChild(r10, r11)
                boolean r10 = r2.canScrollHorizontally()
                r11 = 0
                if (r10 == 0) goto L_0x0081
                float r10 = r1.c2
                float r12 = r1.a2
                float r10 = r10 + r12
                int r10 = (int) r10
                android.graphics.Rect r12 = r1.u2
                int r12 = r12.left
                int r12 = r10 - r12
                androidx.recyclerview.widget.RecyclerView r13 = r1.k2
                int r13 = r13.getPaddingLeft()
                int r12 = r12 - r13
                float r13 = r1.a2
                int r14 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r14 >= 0) goto L_0x005d
                if (r12 >= 0) goto L_0x005d
                goto L_0x007f
            L_0x005d:
                int r12 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r12 <= 0) goto L_0x0081
                androidx.recyclerview.widget.RecyclerView$b0 r12 = r1.q
                android.view.View r12 = r12.itemView
                int r12 = r12.getWidth()
                int r12 = r12 + r10
                android.graphics.Rect r10 = r1.u2
                int r10 = r10.right
                int r12 = r12 + r10
                androidx.recyclerview.widget.RecyclerView r10 = r1.k2
                int r10 = r10.getWidth()
                androidx.recyclerview.widget.RecyclerView r13 = r1.k2
                int r13 = r13.getPaddingRight()
                int r10 = r10 - r13
                int r12 = r12 - r10
                if (r12 <= 0) goto L_0x0081
            L_0x007f:
                r13 = r12
                goto L_0x0082
            L_0x0081:
                r13 = r3
            L_0x0082:
                boolean r2 = r2.canScrollVertically()
                if (r2 == 0) goto L_0x00c8
                float r2 = r1.d2
                float r10 = r1.b2
                float r2 = r2 + r10
                int r2 = (int) r2
                android.graphics.Rect r10 = r1.u2
                int r10 = r10.top
                int r10 = r2 - r10
                androidx.recyclerview.widget.RecyclerView r12 = r1.k2
                int r12 = r12.getPaddingTop()
                int r10 = r10 - r12
                float r12 = r1.b2
                int r14 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r14 >= 0) goto L_0x00a4
                if (r10 >= 0) goto L_0x00a4
                goto L_0x00c6
            L_0x00a4:
                int r10 = (r12 > r11 ? 1 : (r12 == r11 ? 0 : -1))
                if (r10 <= 0) goto L_0x00c8
                androidx.recyclerview.widget.RecyclerView$b0 r10 = r1.q
                android.view.View r10 = r10.itemView
                int r10 = r10.getHeight()
                int r10 = r10 + r2
                android.graphics.Rect r2 = r1.u2
                int r2 = r2.bottom
                int r10 = r10 + r2
                androidx.recyclerview.widget.RecyclerView r2 = r1.k2
                int r2 = r2.getHeight()
                androidx.recyclerview.widget.RecyclerView r11 = r1.k2
                int r11 = r11.getPaddingBottom()
                int r2 = r2 - r11
                int r10 = r10 - r2
                if (r10 <= 0) goto L_0x00c8
            L_0x00c6:
                r2 = r10
                goto L_0x00c9
            L_0x00c8:
                r2 = r3
            L_0x00c9:
                if (r13 == 0) goto L_0x00e2
                h0.v.a.k$d r10 = r1.f2
                androidx.recyclerview.widget.RecyclerView r11 = r1.k2
                androidx.recyclerview.widget.RecyclerView$b0 r12 = r1.q
                android.view.View r12 = r12.itemView
                int r12 = r12.getWidth()
                androidx.recyclerview.widget.RecyclerView r14 = r1.k2
                int r14 = r14.getWidth()
                r15 = r8
                int r13 = r10.interpolateOutOfBoundsScroll(r11, r12, r13, r14, r15)
            L_0x00e2:
                r15 = r13
                if (r2 == 0) goto L_0x0101
                h0.v.a.k$d r10 = r1.f2
                androidx.recyclerview.widget.RecyclerView r11 = r1.k2
                androidx.recyclerview.widget.RecyclerView$b0 r12 = r1.q
                android.view.View r12 = r12.itemView
                int r12 = r12.getHeight()
                androidx.recyclerview.widget.RecyclerView r13 = r1.k2
                int r14 = r13.getHeight()
                r13 = r2
                r2 = r15
                r15 = r8
                int r8 = r10.interpolateOutOfBoundsScroll(r11, r12, r13, r14, r15)
                r13 = r2
                r2 = r8
                goto L_0x0102
            L_0x0101:
                r13 = r15
            L_0x0102:
                if (r13 != 0) goto L_0x010a
                if (r2 == 0) goto L_0x0107
                goto L_0x010a
            L_0x0107:
                r1.v2 = r4
                goto L_0x0118
            L_0x010a:
                long r8 = r1.v2
                int r3 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
                if (r3 != 0) goto L_0x0112
                r1.v2 = r6
            L_0x0112:
                androidx.recyclerview.widget.RecyclerView r1 = r1.k2
                r1.scrollBy(r13, r2)
                r3 = 1
            L_0x0118:
                if (r3 == 0) goto L_0x0135
                h0.v.a.k r1 = h0.v.a.k.this
                androidx.recyclerview.widget.RecyclerView$b0 r2 = r1.q
                if (r2 == 0) goto L_0x0123
                r1.p(r2)
            L_0x0123:
                h0.v.a.k r1 = h0.v.a.k.this
                androidx.recyclerview.widget.RecyclerView r2 = r1.k2
                java.lang.Runnable r1 = r1.l2
                r2.removeCallbacks(r1)
                h0.v.a.k r1 = h0.v.a.k.this
                androidx.recyclerview.widget.RecyclerView r1 = r1.k2
                java.util.concurrent.atomic.AtomicInteger r2 = h0.i.i.q.a
                r1.postOnAnimation(r0)
            L_0x0135:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: h0.v.a.k.a.run():void");
        }
    }

    /* compiled from: ItemTouchHelper */
    public class b implements RecyclerView.r {
        public b() {
        }

        public void a(RecyclerView recyclerView, MotionEvent motionEvent) {
            ((f.b) k.this.r2.a).a.onTouchEvent(motionEvent);
            VelocityTracker velocityTracker = k.this.m2;
            if (velocityTracker != null) {
                velocityTracker.addMovement(motionEvent);
            }
            if (k.this.e2 != -1) {
                int actionMasked = motionEvent.getActionMasked();
                int findPointerIndex = motionEvent.findPointerIndex(k.this.e2);
                if (findPointerIndex >= 0) {
                    k.this.j(actionMasked, motionEvent, findPointerIndex);
                }
                k kVar = k.this;
                RecyclerView.b0 b0Var = kVar.q;
                if (b0Var != null) {
                    int i = 0;
                    if (actionMasked != 1) {
                        if (actionMasked != 2) {
                            if (actionMasked == 3) {
                                VelocityTracker velocityTracker2 = kVar.m2;
                                if (velocityTracker2 != null) {
                                    velocityTracker2.clear();
                                }
                            } else if (actionMasked == 6) {
                                int actionIndex = motionEvent.getActionIndex();
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                k kVar2 = k.this;
                                if (pointerId == kVar2.e2) {
                                    if (actionIndex == 0) {
                                        i = 1;
                                    }
                                    kVar2.e2 = motionEvent.getPointerId(i);
                                    k kVar3 = k.this;
                                    kVar3.s(motionEvent, kVar3.h2, actionIndex);
                                    return;
                                }
                                return;
                            } else {
                                return;
                            }
                        } else if (findPointerIndex >= 0) {
                            kVar.s(motionEvent, kVar.h2, findPointerIndex);
                            k.this.p(b0Var);
                            k kVar4 = k.this;
                            kVar4.k2.removeCallbacks(kVar4.l2);
                            k.this.l2.run();
                            k.this.k2.invalidate();
                            return;
                        } else {
                            return;
                        }
                    }
                    k.this.r((RecyclerView.b0) null, 0);
                    k.this.e2 = -1;
                }
            }
        }

        public boolean c(RecyclerView recyclerView, MotionEvent motionEvent) {
            int findPointerIndex;
            ((f.b) k.this.r2.a).a.onTouchEvent(motionEvent);
            int actionMasked = motionEvent.getActionMasked();
            f fVar = null;
            if (actionMasked == 0) {
                k.this.e2 = motionEvent.getPointerId(0);
                k.this.x = motionEvent.getX();
                k.this.y = motionEvent.getY();
                k kVar = k.this;
                VelocityTracker velocityTracker = kVar.m2;
                if (velocityTracker != null) {
                    velocityTracker.recycle();
                }
                kVar.m2 = VelocityTracker.obtain();
                k kVar2 = k.this;
                if (kVar2.q == null) {
                    if (!kVar2.i2.isEmpty()) {
                        View m = kVar2.m(motionEvent);
                        int size = kVar2.i2.size() - 1;
                        while (true) {
                            if (size < 0) {
                                break;
                            }
                            f fVar2 = kVar2.i2.get(size);
                            if (fVar2.e.itemView == m) {
                                fVar = fVar2;
                                break;
                            }
                            size--;
                        }
                    }
                    if (fVar != null) {
                        k kVar3 = k.this;
                        kVar3.x -= fVar.i;
                        kVar3.y -= fVar.j;
                        kVar3.l(fVar.e, true);
                        if (k.this.c.remove(fVar.e.itemView)) {
                            k kVar4 = k.this;
                            kVar4.f2.clearView(kVar4.k2, fVar.e);
                        }
                        k.this.r(fVar.e, fVar.f);
                        k kVar5 = k.this;
                        kVar5.s(motionEvent, kVar5.h2, 0);
                    }
                }
            } else if (actionMasked == 3 || actionMasked == 1) {
                k kVar6 = k.this;
                kVar6.e2 = -1;
                kVar6.r((RecyclerView.b0) null, 0);
            } else {
                int i = k.this.e2;
                if (i != -1 && (findPointerIndex = motionEvent.findPointerIndex(i)) >= 0) {
                    k.this.j(actionMasked, motionEvent, findPointerIndex);
                }
            }
            VelocityTracker velocityTracker2 = k.this.m2;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (k.this.q != null) {
                return true;
            }
            return false;
        }

        public void e(boolean z) {
            if (z) {
                k.this.r((RecyclerView.b0) null, 0);
            }
        }
    }

    /* compiled from: ItemTouchHelper */
    public class c extends f {
        public final /* synthetic */ int n;
        public final /* synthetic */ RecyclerView.b0 o;
        public final /* synthetic */ k p;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public c(k kVar, RecyclerView.b0 b0Var, int i, int i2, float f, float f2, float f3, float f4, int i3, RecyclerView.b0 b0Var2) {
            super(b0Var, i, i2, f, f2, f3, f4);
            this.p = kVar;
            this.n = i3;
            this.o = b0Var2;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.l) {
                this.e.setIsRecyclable(true);
            }
            this.l = true;
            if (!this.k) {
                if (this.n <= 0) {
                    k kVar = this.p;
                    kVar.f2.clearView(kVar.k2, this.o);
                } else {
                    this.p.c.add(this.o.itemView);
                    this.h = true;
                    int i = this.n;
                    if (i > 0) {
                        k kVar2 = this.p;
                        kVar2.k2.post(new l(kVar2, this, i));
                    }
                }
                k kVar3 = this.p;
                View view = kVar3.p2;
                View view2 = this.o.itemView;
                if (view == view2) {
                    kVar3.q(view2);
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper */
    public static abstract class d {
        private static final int ABS_HORIZONTAL_DIR_FLAGS = 789516;
        public static final int DEFAULT_DRAG_ANIMATION_DURATION = 200;
        public static final int DEFAULT_SWIPE_ANIMATION_DURATION = 250;
        private static final long DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS = 2000;
        public static final int RELATIVE_DIR_FLAGS = 3158064;
        private static final Interpolator sDragScrollInterpolator = new a();
        private static final Interpolator sDragViewScrollCapInterpolator = new b();
        private int mCachedMaxScrollSpeed = -1;

        /* compiled from: ItemTouchHelper */
        public class a implements Interpolator {
            public float getInterpolation(float f) {
                return f * f * f * f * f;
            }
        }

        /* compiled from: ItemTouchHelper */
        public class b implements Interpolator {
            public float getInterpolation(float f) {
                float f2 = f - 1.0f;
                return (f2 * f2 * f2 * f2 * f2) + 1.0f;
            }
        }

        public static int convertToRelativeDirection(int i, int i2) {
            int i3;
            int i4 = i & ABS_HORIZONTAL_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 << 2;
            } else {
                int i6 = i4 << 1;
                i5 |= -789517 & i6;
                i3 = (i6 & ABS_HORIZONTAL_DIR_FLAGS) << 2;
            }
            return i5 | i3;
        }

        public static m getDefaultUIUtil() {
            return n.a;
        }

        private int getMaxDragScroll(RecyclerView recyclerView) {
            if (this.mCachedMaxScrollSpeed == -1) {
                this.mCachedMaxScrollSpeed = recyclerView.getResources().getDimensionPixelSize(R.dimen.item_touch_helper_max_drag_scroll_per_frame);
            }
            return this.mCachedMaxScrollSpeed;
        }

        public static int makeFlag(int i, int i2) {
            return i2 << (i * 8);
        }

        public static int makeMovementFlags(int i, int i2) {
            int makeFlag = makeFlag(0, i2 | i);
            return makeFlag(2, i) | makeFlag(1, i2) | makeFlag;
        }

        public boolean canDropOver(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2) {
            return true;
        }

        public RecyclerView.b0 chooseDropTarget(RecyclerView.b0 b0Var, List<RecyclerView.b0> list, int i, int i2) {
            int bottom;
            int abs;
            int top;
            int abs2;
            int left;
            int abs3;
            int right;
            int abs4;
            RecyclerView.b0 b0Var2 = b0Var;
            int width = b0Var2.itemView.getWidth() + i;
            int height = b0Var2.itemView.getHeight() + i2;
            int left2 = i - b0Var2.itemView.getLeft();
            int top2 = i2 - b0Var2.itemView.getTop();
            int size = list.size();
            RecyclerView.b0 b0Var3 = null;
            int i3 = -1;
            for (int i4 = 0; i4 < size; i4++) {
                RecyclerView.b0 b0Var4 = list.get(i4);
                if (left2 > 0 && (right = b0Var4.itemView.getRight() - width) < 0 && b0Var4.itemView.getRight() > b0Var2.itemView.getRight() && (abs4 = Math.abs(right)) > i3) {
                    b0Var3 = b0Var4;
                    i3 = abs4;
                }
                if (left2 < 0 && (left = b0Var4.itemView.getLeft() - i) > 0 && b0Var4.itemView.getLeft() < b0Var2.itemView.getLeft() && (abs3 = Math.abs(left)) > i3) {
                    b0Var3 = b0Var4;
                    i3 = abs3;
                }
                if (top2 < 0 && (top = b0Var4.itemView.getTop() - i2) > 0 && b0Var4.itemView.getTop() < b0Var2.itemView.getTop() && (abs2 = Math.abs(top)) > i3) {
                    b0Var3 = b0Var4;
                    i3 = abs2;
                }
                if (top2 > 0 && (bottom = b0Var4.itemView.getBottom() - height) < 0 && b0Var4.itemView.getBottom() > b0Var2.itemView.getBottom() && (abs = Math.abs(bottom)) > i3) {
                    b0Var3 = b0Var4;
                    i3 = abs;
                }
            }
            return b0Var3;
        }

        public void clearView(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            View view = b0Var.itemView;
            int i = R.id.item_touch_helper_previous_elevation;
            Object tag = view.getTag(i);
            if (tag instanceof Float) {
                float floatValue = ((Float) tag).floatValue();
                AtomicInteger atomicInteger = q.a;
                view.setElevation(floatValue);
            }
            view.setTag(i, (Object) null);
            view.setTranslationX(0.0f);
            view.setTranslationY(0.0f);
        }

        public int convertToAbsoluteDirection(int i, int i2) {
            int i3;
            int i4 = i & RELATIVE_DIR_FLAGS;
            if (i4 == 0) {
                return i;
            }
            int i5 = i & (~i4);
            if (i2 == 0) {
                i3 = i4 >> 2;
            } else {
                int i6 = i4 >> 1;
                i5 |= -3158065 & i6;
                i3 = (i6 & RELATIVE_DIR_FLAGS) >> 2;
            }
            return i5 | i3;
        }

        public final int getAbsoluteMovementFlags(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            int movementFlags = getMovementFlags(recyclerView, b0Var);
            AtomicInteger atomicInteger = q.a;
            return convertToAbsoluteDirection(movementFlags, recyclerView.getLayoutDirection());
        }

        public long getAnimationDuration(RecyclerView recyclerView, int i, float f, float f2) {
            RecyclerView.k itemAnimator = recyclerView.getItemAnimator();
            if (itemAnimator == null) {
                return i == 8 ? 200 : 250;
            }
            if (i == 8) {
                return itemAnimator.getMoveDuration();
            }
            return itemAnimator.getRemoveDuration();
        }

        public int getBoundingBoxMargin() {
            return 0;
        }

        public float getMoveThreshold(RecyclerView.b0 b0Var) {
            return 0.5f;
        }

        public abstract int getMovementFlags(RecyclerView recyclerView, RecyclerView.b0 b0Var);

        public float getSwipeEscapeVelocity(float f) {
            return f;
        }

        public abstract float getSwipeThreshold(RecyclerView.b0 b0Var);

        public float getSwipeVelocityThreshold(float f) {
            return f;
        }

        public boolean hasDragFlag(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            return (getAbsoluteMovementFlags(recyclerView, b0Var) & 16711680) != 0;
        }

        public boolean hasSwipeFlag(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            return (getAbsoluteMovementFlags(recyclerView, b0Var) & 65280) != 0;
        }

        public int interpolateOutOfBoundsScroll(RecyclerView recyclerView, int i, int i2, int i3, long j) {
            float f = 1.0f;
            int interpolation = (int) (sDragViewScrollCapInterpolator.getInterpolation(Math.min(1.0f, (((float) Math.abs(i2)) * 1.0f) / ((float) i))) * ((float) (((int) Math.signum((float) i2)) * getMaxDragScroll(recyclerView))));
            if (j <= DRAG_SCROLL_ACCELERATION_LIMIT_TIME_MS) {
                f = ((float) j) / 2000.0f;
            }
            int interpolation2 = (int) (sDragScrollInterpolator.getInterpolation(f) * ((float) interpolation));
            if (interpolation2 == 0) {
                return i2 > 0 ? 1 : -1;
            }
            return interpolation2;
        }

        public boolean isItemViewSwipeEnabled() {
            return true;
        }

        public boolean isLongPressDragEnabled() {
            return true;
        }

        public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var, float f, float f2, int i, boolean z) {
            View view = b0Var.itemView;
            if (z && view.getTag(R.id.item_touch_helper_previous_elevation) == null) {
                AtomicInteger atomicInteger = q.a;
                Float valueOf = Float.valueOf(view.getElevation());
                int childCount = recyclerView.getChildCount();
                float f3 = 0.0f;
                for (int i2 = 0; i2 < childCount; i2++) {
                    View childAt = recyclerView.getChildAt(i2);
                    if (childAt != view) {
                        AtomicInteger atomicInteger2 = q.a;
                        float elevation = childAt.getElevation();
                        if (elevation > f3) {
                            f3 = elevation;
                        }
                    }
                }
                view.setElevation(f3 + 1.0f);
                view.setTag(R.id.item_touch_helper_previous_elevation, valueOf);
            }
            view.setTranslationX(f);
            view.setTranslationY(f2);
        }

        public void onChildDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var, float f, float f2, int i, boolean z) {
            View view = b0Var.itemView;
        }

        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var, List<f> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = list.get(i2);
                float f3 = fVar.a;
                float f4 = fVar.c;
                if (f3 == f4) {
                    fVar.i = fVar.e.itemView.getTranslationX();
                } else {
                    fVar.i = i0.d.a.a.a.a(f4, f3, fVar.m, f3);
                }
                float f5 = fVar.b;
                float f6 = fVar.d;
                if (f5 == f6) {
                    fVar.j = fVar.e.itemView.getTranslationY();
                } else {
                    fVar.j = i0.d.a.a.a.a(f6, f5, fVar.m, f5);
                }
                int save = canvas.save();
                onChildDraw(canvas, recyclerView, fVar.e, fVar.i, fVar.j, fVar.f, false);
                canvas.restoreToCount(save);
            }
            if (b0Var != null) {
                int save2 = canvas.save();
                onChildDraw(canvas, recyclerView, b0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
        }

        public void onDrawOver(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var, List<f> list, int i, float f, float f2) {
            Canvas canvas2 = canvas;
            List<f> list2 = list;
            int size = list.size();
            boolean z = false;
            for (int i2 = 0; i2 < size; i2++) {
                f fVar = list2.get(i2);
                int save = canvas.save();
                onChildDrawOver(canvas, recyclerView, fVar.e, fVar.i, fVar.j, fVar.f, false);
                canvas.restoreToCount(save);
            }
            if (b0Var != null) {
                int save2 = canvas.save();
                onChildDrawOver(canvas, recyclerView, b0Var, f, f2, i, true);
                canvas.restoreToCount(save2);
            }
            for (int i3 = size - 1; i3 >= 0; i3--) {
                f fVar2 = list2.get(i3);
                boolean z2 = fVar2.l;
                if (z2 && !fVar2.h) {
                    list2.remove(i3);
                } else if (!z2) {
                    z = true;
                }
            }
            if (z) {
                recyclerView.invalidate();
            }
        }

        public abstract boolean onMove(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2);

        public void onMoved(RecyclerView recyclerView, RecyclerView.b0 b0Var, int i, RecyclerView.b0 b0Var2, int i2, int i3, int i4) {
            RecyclerView.n layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof h) {
                ((h) layoutManager).prepareForDrop(b0Var.itemView, b0Var2.itemView, i3, i4);
                return;
            }
            if (layoutManager.canScrollHorizontally()) {
                if (layoutManager.getDecoratedLeft(b0Var2.itemView) <= recyclerView.getPaddingLeft()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedRight(b0Var2.itemView) >= recyclerView.getWidth() - recyclerView.getPaddingRight()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
            if (layoutManager.canScrollVertically()) {
                if (layoutManager.getDecoratedTop(b0Var2.itemView) <= recyclerView.getPaddingTop()) {
                    recyclerView.scrollToPosition(i2);
                }
                if (layoutManager.getDecoratedBottom(b0Var2.itemView) >= recyclerView.getHeight() - recyclerView.getPaddingBottom()) {
                    recyclerView.scrollToPosition(i2);
                }
            }
        }

        public void onSelectedChanged(RecyclerView.b0 b0Var, int i) {
        }

        public abstract void onSwiped(RecyclerView.b0 b0Var, int i);
    }

    /* compiled from: ItemTouchHelper */
    public class e extends GestureDetector.SimpleOnGestureListener {
        public boolean a = true;

        public e() {
        }

        public boolean onDown(MotionEvent motionEvent) {
            return true;
        }

        public void onLongPress(MotionEvent motionEvent) {
            View m;
            RecyclerView.b0 childViewHolder;
            int i;
            if (this.a && (m = k.this.m(motionEvent)) != null && (childViewHolder = k.this.k2.getChildViewHolder(m)) != null) {
                k kVar = k.this;
                if (kVar.f2.hasDragFlag(kVar.k2, childViewHolder) && motionEvent.getPointerId(0) == (i = k.this.e2)) {
                    int findPointerIndex = motionEvent.findPointerIndex(i);
                    float x = motionEvent.getX(findPointerIndex);
                    float y = motionEvent.getY(findPointerIndex);
                    k kVar2 = k.this;
                    kVar2.x = x;
                    kVar2.y = y;
                    kVar2.b2 = 0.0f;
                    kVar2.a2 = 0.0f;
                    if (kVar2.f2.isLongPressDragEnabled()) {
                        k.this.r(childViewHolder, 2);
                    }
                }
            }
        }
    }

    /* compiled from: ItemTouchHelper */
    public static class f implements Animator.AnimatorListener {
        public final float a;
        public final float b;
        public final float c;
        public final float d;
        public final RecyclerView.b0 e;
        public final int f;
        public final ValueAnimator g;
        public boolean h;
        public float i;
        public float j;
        public boolean k = false;
        public boolean l = false;
        public float m;

        /* compiled from: ItemTouchHelper */
        public class a implements ValueAnimator.AnimatorUpdateListener {
            public a() {
            }

            public void onAnimationUpdate(ValueAnimator valueAnimator) {
                f.this.m = valueAnimator.getAnimatedFraction();
            }
        }

        public f(RecyclerView.b0 b0Var, int i2, int i3, float f2, float f3, float f4, float f5) {
            this.f = i3;
            this.e = b0Var;
            this.a = f2;
            this.b = f3;
            this.c = f4;
            this.d = f5;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            this.g = ofFloat;
            ofFloat.addUpdateListener(new a());
            ofFloat.setTarget(b0Var.itemView);
            ofFloat.addListener(this);
            this.m = 0.0f;
        }

        public void onAnimationCancel(Animator animator) {
            this.m = 1.0f;
        }

        public void onAnimationEnd(Animator animator) {
            if (!this.l) {
                this.e.setIsRecyclable(true);
            }
            this.l = true;
        }

        public void onAnimationRepeat(Animator animator) {
        }

        public void onAnimationStart(Animator animator) {
        }
    }

    /* compiled from: ItemTouchHelper */
    public static abstract class g extends d {
        private int mDefaultDragDirs;
        private int mDefaultSwipeDirs;

        public g(int i, int i2) {
            this.mDefaultSwipeDirs = i2;
            this.mDefaultDragDirs = i;
        }

        public int getDragDirs(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            return this.mDefaultDragDirs;
        }

        public int getMovementFlags(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            return d.makeMovementFlags(getDragDirs(recyclerView, b0Var), getSwipeDirs(recyclerView, b0Var));
        }

        public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
            return this.mDefaultSwipeDirs;
        }

        public void setDefaultDragDirs(int i) {
            this.mDefaultDragDirs = i;
        }

        public void setDefaultSwipeDirs(int i) {
            this.mDefaultSwipeDirs = i;
        }
    }

    /* compiled from: ItemTouchHelper */
    public interface h {
        void prepareForDrop(View view, View view2, int i, int i2);
    }

    public k(d dVar) {
        this.f2 = dVar;
    }

    public static boolean o(View view, float f3, float f4, float f5, float f6) {
        return f3 >= f5 && f3 <= f5 + ((float) view.getWidth()) && f4 >= f6 && f4 <= f6 + ((float) view.getHeight());
    }

    public void b(View view) {
        q(view);
        RecyclerView.b0 childViewHolder = this.k2.getChildViewHolder(view);
        if (childViewHolder != null) {
            RecyclerView.b0 b0Var = this.q;
            if (b0Var == null || childViewHolder != b0Var) {
                l(childViewHolder, false);
                if (this.c.remove(childViewHolder.itemView)) {
                    this.f2.clearView(this.k2, childViewHolder);
                    return;
                }
                return;
            }
            r((RecyclerView.b0) null, 0);
        }
    }

    public void d(View view) {
    }

    public void f(Rect rect, View view, RecyclerView recyclerView, RecyclerView.y yVar) {
        rect.setEmpty();
    }

    public void g(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        float f3;
        float f4;
        this.q2 = -1;
        if (this.q != null) {
            n(this.d);
            float[] fArr = this.d;
            float f5 = fArr[0];
            f3 = fArr[1];
            f4 = f5;
        } else {
            f4 = 0.0f;
            f3 = 0.0f;
        }
        this.f2.onDraw(canvas, recyclerView, this.q, this.i2, this.g2, f4, f3);
    }

    public void h(Canvas canvas, RecyclerView recyclerView, RecyclerView.y yVar) {
        float f3;
        float f4;
        if (this.q != null) {
            n(this.d);
            float[] fArr = this.d;
            float f5 = fArr[0];
            f3 = fArr[1];
            f4 = f5;
        } else {
            f4 = 0.0f;
            f3 = 0.0f;
        }
        this.f2.onDrawOver(canvas, recyclerView, this.q, this.i2, this.g2, f4, f3);
    }

    public final int i(RecyclerView.b0 b0Var, int i) {
        if ((i & 12) == 0) {
            return 0;
        }
        int i3 = 8;
        int i4 = this.a2 > 0.0f ? 8 : 4;
        VelocityTracker velocityTracker = this.m2;
        if (velocityTracker != null && this.e2 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f2.getSwipeVelocityThreshold(this.Z1));
            float xVelocity = this.m2.getXVelocity(this.e2);
            float yVelocity = this.m2.getYVelocity(this.e2);
            if (xVelocity <= 0.0f) {
                i3 = 4;
            }
            float abs = Math.abs(xVelocity);
            if ((i3 & i) != 0 && i4 == i3 && abs >= this.f2.getSwipeEscapeVelocity(this.Y1) && abs > Math.abs(yVelocity)) {
                return i3;
            }
        }
        float swipeThreshold = this.f2.getSwipeThreshold(b0Var) * ((float) this.k2.getWidth());
        if ((i & i4) == 0 || Math.abs(this.a2) <= swipeThreshold) {
            return 0;
        }
        return i4;
    }

    public void j(int i, MotionEvent motionEvent, int i3) {
        int absoluteMovementFlags;
        View m;
        if (this.q == null && i == 2 && this.g2 != 2 && this.f2.isItemViewSwipeEnabled() && this.k2.getScrollState() != 1) {
            RecyclerView.n layoutManager = this.k2.getLayoutManager();
            int i4 = this.e2;
            RecyclerView.b0 b0Var = null;
            if (i4 != -1) {
                int findPointerIndex = motionEvent.findPointerIndex(i4);
                float abs = Math.abs(motionEvent.getX(findPointerIndex) - this.x);
                float abs2 = Math.abs(motionEvent.getY(findPointerIndex) - this.y);
                float f3 = (float) this.j2;
                if ((abs >= f3 || abs2 >= f3) && ((abs <= abs2 || !layoutManager.canScrollHorizontally()) && ((abs2 <= abs || !layoutManager.canScrollVertically()) && (m = m(motionEvent)) != null))) {
                    b0Var = this.k2.getChildViewHolder(m);
                }
            }
            if (b0Var != null && (absoluteMovementFlags = (this.f2.getAbsoluteMovementFlags(this.k2, b0Var) & 65280) >> 8) != 0) {
                float x2 = motionEvent.getX(i3);
                float y2 = motionEvent.getY(i3);
                float f4 = x2 - this.x;
                float f5 = y2 - this.y;
                float abs3 = Math.abs(f4);
                float abs4 = Math.abs(f5);
                float f6 = (float) this.j2;
                if (abs3 >= f6 || abs4 >= f6) {
                    if (abs3 > abs4) {
                        if (f4 < 0.0f && (absoluteMovementFlags & 4) == 0) {
                            return;
                        }
                        if (f4 > 0.0f && (absoluteMovementFlags & 8) == 0) {
                            return;
                        }
                    } else if (f5 < 0.0f && (absoluteMovementFlags & 1) == 0) {
                        return;
                    } else {
                        if (f5 > 0.0f && (absoluteMovementFlags & 2) == 0) {
                            return;
                        }
                    }
                    this.b2 = 0.0f;
                    this.a2 = 0.0f;
                    this.e2 = motionEvent.getPointerId(0);
                    r(b0Var, 1);
                }
            }
        }
    }

    public final int k(RecyclerView.b0 b0Var, int i) {
        if ((i & 3) == 0) {
            return 0;
        }
        int i3 = 2;
        int i4 = this.b2 > 0.0f ? 2 : 1;
        VelocityTracker velocityTracker = this.m2;
        if (velocityTracker != null && this.e2 > -1) {
            velocityTracker.computeCurrentVelocity(1000, this.f2.getSwipeVelocityThreshold(this.Z1));
            float xVelocity = this.m2.getXVelocity(this.e2);
            float yVelocity = this.m2.getYVelocity(this.e2);
            if (yVelocity <= 0.0f) {
                i3 = 1;
            }
            float abs = Math.abs(yVelocity);
            if ((i3 & i) != 0 && i3 == i4 && abs >= this.f2.getSwipeEscapeVelocity(this.Y1) && abs > Math.abs(xVelocity)) {
                return i3;
            }
        }
        float swipeThreshold = this.f2.getSwipeThreshold(b0Var) * ((float) this.k2.getHeight());
        if ((i & i4) == 0 || Math.abs(this.b2) <= swipeThreshold) {
            return 0;
        }
        return i4;
    }

    public void l(RecyclerView.b0 b0Var, boolean z) {
        f fVar;
        int size = this.i2.size();
        do {
            size--;
            if (size >= 0) {
                fVar = this.i2.get(size);
            } else {
                return;
            }
        } while (fVar.e != b0Var);
        fVar.k |= z;
        if (!fVar.l) {
            fVar.g.cancel();
        }
        this.i2.remove(size);
    }

    public View m(MotionEvent motionEvent) {
        float x2 = motionEvent.getX();
        float y2 = motionEvent.getY();
        RecyclerView.b0 b0Var = this.q;
        if (b0Var != null) {
            View view = b0Var.itemView;
            if (o(view, x2, y2, this.c2 + this.a2, this.d2 + this.b2)) {
                return view;
            }
        }
        for (int size = this.i2.size() - 1; size >= 0; size--) {
            f fVar = this.i2.get(size);
            View view2 = fVar.e.itemView;
            if (o(view2, x2, y2, fVar.i, fVar.j)) {
                return view2;
            }
        }
        return this.k2.findChildViewUnder(x2, y2);
    }

    public final void n(float[] fArr) {
        if ((this.h2 & 12) != 0) {
            fArr[0] = (this.c2 + this.a2) - ((float) this.q.itemView.getLeft());
        } else {
            fArr[0] = this.q.itemView.getTranslationX();
        }
        if ((this.h2 & 3) != 0) {
            fArr[1] = (this.d2 + this.b2) - ((float) this.q.itemView.getTop());
        } else {
            fArr[1] = this.q.itemView.getTranslationY();
        }
    }

    public void p(RecyclerView.b0 b0Var) {
        int i;
        int i3;
        int i4;
        RecyclerView.b0 b0Var2 = b0Var;
        if (!this.k2.isLayoutRequested() && this.g2 == 2) {
            float moveThreshold = this.f2.getMoveThreshold(b0Var2);
            int i5 = (int) (this.c2 + this.a2);
            int i6 = (int) (this.d2 + this.b2);
            if (((float) Math.abs(i6 - b0Var2.itemView.getTop())) >= ((float) b0Var2.itemView.getHeight()) * moveThreshold || ((float) Math.abs(i5 - b0Var2.itemView.getLeft())) >= ((float) b0Var2.itemView.getWidth()) * moveThreshold) {
                List<RecyclerView.b0> list = this.n2;
                if (list == null) {
                    this.n2 = new ArrayList();
                    this.o2 = new ArrayList();
                } else {
                    list.clear();
                    this.o2.clear();
                }
                int boundingBoxMargin = this.f2.getBoundingBoxMargin();
                int round = Math.round(this.c2 + this.a2) - boundingBoxMargin;
                int round2 = Math.round(this.d2 + this.b2) - boundingBoxMargin;
                int i7 = boundingBoxMargin * 2;
                int width = b0Var2.itemView.getWidth() + round + i7;
                int height = b0Var2.itemView.getHeight() + round2 + i7;
                int i8 = (round + width) / 2;
                int i9 = (round2 + height) / 2;
                RecyclerView.n layoutManager = this.k2.getLayoutManager();
                int childCount = layoutManager.getChildCount();
                int i10 = 0;
                while (i10 < childCount) {
                    View childAt = layoutManager.getChildAt(i10);
                    if (childAt != b0Var2.itemView && childAt.getBottom() >= round2 && childAt.getTop() <= height && childAt.getRight() >= round && childAt.getLeft() <= width) {
                        RecyclerView.b0 childViewHolder = this.k2.getChildViewHolder(childAt);
                        i4 = round;
                        i3 = round2;
                        if (this.f2.canDropOver(this.k2, this.q, childViewHolder)) {
                            int abs = Math.abs(i8 - ((childAt.getRight() + childAt.getLeft()) / 2));
                            int abs2 = Math.abs(i9 - ((childAt.getBottom() + childAt.getTop()) / 2));
                            int i11 = (abs2 * abs2) + (abs * abs);
                            int size = this.n2.size();
                            int i12 = 0;
                            int i13 = 0;
                            while (true) {
                                i = i8;
                                if (i13 >= size || i11 <= this.o2.get(i13).intValue()) {
                                    this.n2.add(i12, childViewHolder);
                                    this.o2.add(i12, Integer.valueOf(i11));
                                } else {
                                    i12++;
                                    i13++;
                                    i8 = i;
                                }
                            }
                            this.n2.add(i12, childViewHolder);
                            this.o2.add(i12, Integer.valueOf(i11));
                        } else {
                            i = i8;
                        }
                    } else {
                        i = i8;
                        i4 = round;
                        i3 = round2;
                    }
                    i10++;
                    round = i4;
                    round2 = i3;
                    i8 = i;
                }
                List<RecyclerView.b0> list2 = this.n2;
                if (list2.size() != 0) {
                    RecyclerView.b0 chooseDropTarget = this.f2.chooseDropTarget(b0Var2, list2, i5, i6);
                    if (chooseDropTarget == null) {
                        this.n2.clear();
                        this.o2.clear();
                        return;
                    }
                    int absoluteAdapterPosition = chooseDropTarget.getAbsoluteAdapterPosition();
                    int absoluteAdapterPosition2 = b0Var.getAbsoluteAdapterPosition();
                    if (this.f2.onMove(this.k2, b0Var2, chooseDropTarget)) {
                        this.f2.onMoved(this.k2, b0Var, absoluteAdapterPosition2, chooseDropTarget, absoluteAdapterPosition, i5, i6);
                    }
                }
            }
        }
    }

    public void q(View view) {
        if (view == this.p2) {
            this.p2 = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0096, code lost:
        if (r2 > 0) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void r(androidx.recyclerview.widget.RecyclerView.b0 r24, int r25) {
        /*
            r23 = this;
            r11 = r23
            r12 = r24
            r13 = r25
            androidx.recyclerview.widget.RecyclerView$b0 r0 = r11.q
            if (r12 != r0) goto L_0x000f
            int r0 = r11.g2
            if (r13 != r0) goto L_0x000f
            return
        L_0x000f:
            r0 = -9223372036854775808
            r11.v2 = r0
            int r4 = r11.g2
            r14 = 1
            r11.l(r12, r14)
            r11.g2 = r13
            r15 = 2
            if (r13 != r15) goto L_0x002d
            if (r12 == 0) goto L_0x0025
            android.view.View r0 = r12.itemView
            r11.p2 = r0
            goto L_0x002d
        L_0x0025:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r1 = "Must pass a ViewHolder when dragging"
            r0.<init>(r1)
            throw r0
        L_0x002d:
            int r0 = r13 * 8
            r10 = 8
            int r0 = r0 + r10
            int r0 = r14 << r0
            int r16 = r0 + -1
            androidx.recyclerview.widget.RecyclerView$b0 r9 = r11.q
            r8 = 0
            if (r9 == 0) goto L_0x0166
            android.view.View r0 = r9.itemView
            android.view.ViewParent r0 = r0.getParent()
            r7 = 0
            if (r0 == 0) goto L_0x0152
            if (r4 != r15) goto L_0x0049
            r6 = r8
            goto L_0x00b6
        L_0x0049:
            int r0 = r11.g2
            if (r0 != r15) goto L_0x004e
            goto L_0x00b4
        L_0x004e:
            h0.v.a.k$d r0 = r11.f2
            androidx.recyclerview.widget.RecyclerView r1 = r11.k2
            int r0 = r0.getMovementFlags(r1, r9)
            h0.v.a.k$d r1 = r11.f2
            androidx.recyclerview.widget.RecyclerView r2 = r11.k2
            java.util.concurrent.atomic.AtomicInteger r3 = h0.i.i.q.a
            int r2 = r2.getLayoutDirection()
            int r1 = r1.convertToAbsoluteDirection(r0, r2)
            r2 = 65280(0xff00, float:9.1477E-41)
            r1 = r1 & r2
            int r1 = r1 >> r10
            if (r1 != 0) goto L_0x006c
            goto L_0x00b4
        L_0x006c:
            r0 = r0 & r2
            int r0 = r0 >> r10
            float r2 = r11.a2
            float r2 = java.lang.Math.abs(r2)
            float r3 = r11.b2
            float r3 = java.lang.Math.abs(r3)
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 <= 0) goto L_0x0099
            int r2 = r11.i(r9, r1)
            if (r2 <= 0) goto L_0x0092
            r0 = r0 & r2
            if (r0 != 0) goto L_0x00b5
            androidx.recyclerview.widget.RecyclerView r0 = r11.k2
            int r0 = r0.getLayoutDirection()
            int r2 = h0.v.a.k.d.convertToRelativeDirection(r2, r0)
            goto L_0x00b5
        L_0x0092:
            int r2 = r11.k(r9, r1)
            if (r2 <= 0) goto L_0x00b4
            goto L_0x00b5
        L_0x0099:
            int r2 = r11.k(r9, r1)
            if (r2 <= 0) goto L_0x00a0
            goto L_0x00b5
        L_0x00a0:
            int r2 = r11.i(r9, r1)
            if (r2 <= 0) goto L_0x00b4
            r0 = r0 & r2
            if (r0 != 0) goto L_0x00b5
            androidx.recyclerview.widget.RecyclerView r0 = r11.k2
            int r0 = r0.getLayoutDirection()
            int r2 = h0.v.a.k.d.convertToRelativeDirection(r2, r0)
            goto L_0x00b5
        L_0x00b4:
            r2 = r8
        L_0x00b5:
            r6 = r2
        L_0x00b6:
            android.view.VelocityTracker r0 = r11.m2
            if (r0 == 0) goto L_0x00bf
            r0.recycle()
            r11.m2 = r7
        L_0x00bf:
            r0 = 4
            r1 = 0
            if (r6 == r14) goto L_0x00e9
            if (r6 == r15) goto L_0x00e9
            if (r6 == r0) goto L_0x00d6
            if (r6 == r10) goto L_0x00d6
            r2 = 16
            if (r6 == r2) goto L_0x00d6
            r2 = 32
            if (r6 == r2) goto L_0x00d6
            r17 = r1
            r18 = r17
            goto L_0x00fb
        L_0x00d6:
            float r2 = r11.a2
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.k2
            int r3 = r3.getWidth()
            float r3 = (float) r3
            float r2 = r2 * r3
            r18 = r1
            r17 = r2
            goto L_0x00fb
        L_0x00e9:
            float r2 = r11.b2
            float r2 = java.lang.Math.signum(r2)
            androidx.recyclerview.widget.RecyclerView r3 = r11.k2
            int r3 = r3.getHeight()
            float r3 = (float) r3
            float r2 = r2 * r3
            r17 = r1
            r18 = r2
        L_0x00fb:
            if (r4 != r15) goto L_0x00ff
            r5 = r10
            goto L_0x0104
        L_0x00ff:
            if (r6 <= 0) goto L_0x0103
            r5 = r15
            goto L_0x0104
        L_0x0103:
            r5 = r0
        L_0x0104:
            float[] r0 = r11.d
            r11.n(r0)
            float[] r0 = r11.d
            r19 = r0[r8]
            r20 = r0[r14]
            h0.v.a.k$c r3 = new h0.v.a.k$c
            r0 = r3
            r1 = r23
            r2 = r9
            r14 = r3
            r3 = r5
            r15 = r5
            r5 = r19
            r21 = r6
            r6 = r20
            r13 = r7
            r7 = r17
            r13 = r8
            r8 = r18
            r22 = r9
            r9 = r21
            r21 = r10
            r10 = r22
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10)
            h0.v.a.k$d r0 = r11.f2
            androidx.recyclerview.widget.RecyclerView r1 = r11.k2
            float r2 = r17 - r19
            float r3 = r18 - r20
            long r0 = r0.getAnimationDuration(r1, r15, r2, r3)
            android.animation.ValueAnimator r2 = r14.g
            r2.setDuration(r0)
            java.util.List<h0.v.a.k$f> r0 = r11.i2
            r0.add(r14)
            r0 = r22
            r0.setIsRecyclable(r13)
            android.animation.ValueAnimator r0 = r14.g
            r0.start()
            r0 = 0
            r8 = 1
            goto L_0x0163
        L_0x0152:
            r13 = r8
            r0 = r9
            r21 = r10
            android.view.View r1 = r0.itemView
            r11.q(r1)
            h0.v.a.k$d r1 = r11.f2
            androidx.recyclerview.widget.RecyclerView r2 = r11.k2
            r1.clearView(r2, r0)
            r0 = 0
        L_0x0163:
            r11.q = r0
            goto L_0x0169
        L_0x0166:
            r13 = r8
            r21 = r10
        L_0x0169:
            if (r12 == 0) goto L_0x019a
            h0.v.a.k$d r0 = r11.f2
            androidx.recyclerview.widget.RecyclerView r1 = r11.k2
            int r0 = r0.getAbsoluteMovementFlags(r1, r12)
            r0 = r0 & r16
            int r1 = r11.g2
            int r1 = r1 * 8
            int r0 = r0 >> r1
            r11.h2 = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getLeft()
            float r0 = (float) r0
            r11.c2 = r0
            android.view.View r0 = r12.itemView
            int r0 = r0.getTop()
            float r0 = (float) r0
            r11.d2 = r0
            r11.q = r12
            r0 = r25
            r1 = 2
            if (r0 != r1) goto L_0x019a
            android.view.View r0 = r12.itemView
            r0.performHapticFeedback(r13)
        L_0x019a:
            androidx.recyclerview.widget.RecyclerView r0 = r11.k2
            android.view.ViewParent r0 = r0.getParent()
            if (r0 == 0) goto L_0x01ac
            androidx.recyclerview.widget.RecyclerView$b0 r1 = r11.q
            if (r1 == 0) goto L_0x01a8
            r14 = 1
            goto L_0x01a9
        L_0x01a8:
            r14 = r13
        L_0x01a9:
            r0.requestDisallowInterceptTouchEvent(r14)
        L_0x01ac:
            if (r8 != 0) goto L_0x01b7
            androidx.recyclerview.widget.RecyclerView r0 = r11.k2
            androidx.recyclerview.widget.RecyclerView$n r0 = r0.getLayoutManager()
            r0.requestSimpleAnimationsInNextLayout()
        L_0x01b7:
            h0.v.a.k$d r0 = r11.f2
            androidx.recyclerview.widget.RecyclerView$b0 r1 = r11.q
            int r2 = r11.g2
            r0.onSelectedChanged(r1, r2)
            androidx.recyclerview.widget.RecyclerView r0 = r11.k2
            r0.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.v.a.k.r(androidx.recyclerview.widget.RecyclerView$b0, int):void");
    }

    public void s(MotionEvent motionEvent, int i, int i3) {
        float x2 = motionEvent.getX(i3);
        float y2 = motionEvent.getY(i3);
        float f3 = x2 - this.x;
        this.a2 = f3;
        this.b2 = y2 - this.y;
        if ((i & 4) == 0) {
            this.a2 = Math.max(0.0f, f3);
        }
        if ((i & 8) == 0) {
            this.a2 = Math.min(0.0f, this.a2);
        }
        if ((i & 1) == 0) {
            this.b2 = Math.max(0.0f, this.b2);
        }
        if ((i & 2) == 0) {
            this.b2 = Math.min(0.0f, this.b2);
        }
    }
}
