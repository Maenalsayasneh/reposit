package androidx.recyclerview.widget;

import android.animation.LayoutTransition;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Observable;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.Display;
import android.view.FocusFinder;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.OverScroller;
import androidx.customview.view.AbsSavedState;
import androidx.recyclerview.R;
import com.instabug.library.networkv2.connection.InstabugBaseConnectionManagerImpl;
import h0.i.i.g0.b;
import h0.v.a.a;
import h0.v.a.b0;
import h0.v.a.c0;
import h0.v.a.e;
import h0.v.a.j;
import h0.v.a.x;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

public class RecyclerView extends ViewGroup implements h0.i.i.h {
    public static final boolean ALLOW_SIZE_IN_UNSPECIFIED_SPEC = true;
    public static final boolean ALLOW_THREAD_GAP_WORK = true;
    public static final boolean DEBUG = false;
    public static final int DEFAULT_ORIENTATION = 1;
    public static final boolean DISPATCH_TEMP_DETACH = false;
    private static final boolean FORCE_ABS_FOCUS_SEARCH_DIRECTION = false;
    public static final boolean FORCE_INVALIDATE_DISPLAY_LIST = false;
    public static final long FOREVER_NS = Long.MAX_VALUE;
    public static final int HORIZONTAL = 0;
    private static final boolean IGNORE_DETACHED_FOCUSED_CHILD = false;
    private static final int INVALID_POINTER = -1;
    public static final int INVALID_TYPE = -1;
    private static final Class<?>[] LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE;
    public static final int MAX_SCROLL_DURATION = 2000;
    private static final int[] NESTED_SCROLLING_ATTRS = {16843830};
    public static final long NO_ID = -1;
    public static final int NO_POSITION = -1;
    public static final boolean POST_UPDATES_ON_ANIMATION = true;
    public static final int SCROLL_STATE_DRAGGING = 1;
    public static final int SCROLL_STATE_IDLE = 0;
    public static final int SCROLL_STATE_SETTLING = 2;
    public static final String TAG = "RecyclerView";
    public static final int TOUCH_SLOP_DEFAULT = 0;
    public static final int TOUCH_SLOP_PAGING = 1;
    public static final String TRACE_BIND_VIEW_TAG = "RV OnBindView";
    public static final String TRACE_CREATE_VIEW_TAG = "RV CreateView";
    private static final String TRACE_HANDLE_ADAPTER_UPDATES_TAG = "RV PartialInvalidate";
    public static final String TRACE_NESTED_PREFETCH_TAG = "RV Nested Prefetch";
    private static final String TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG = "RV FullInvalidate";
    private static final String TRACE_ON_LAYOUT_TAG = "RV OnLayout";
    public static final String TRACE_PREFETCH_TAG = "RV Prefetch";
    public static final String TRACE_SCROLL_TAG = "RV Scroll";
    public static final int UNDEFINED_DURATION = Integer.MIN_VALUE;
    public static final boolean VERBOSE_TRACING = false;
    public static final int VERTICAL = 1;
    public static final Interpolator sQuinticInterpolator = new c();
    public h0.v.a.x mAccessibilityDelegate;
    private final AccessibilityManager mAccessibilityManager;
    public Adapter mAdapter;
    public h0.v.a.a mAdapterHelper;
    public boolean mAdapterUpdateDuringMeasure;
    private EdgeEffect mBottomGlow;
    private i mChildDrawingOrderCallback;
    public h0.v.a.e mChildHelper;
    public boolean mClipToPadding;
    public boolean mDataSetHasChangedAfterLayout;
    public boolean mDispatchItemsChangedEvent;
    private int mDispatchScrollCounter;
    private int mEatenAccessibilityChangeFlags;
    private j mEdgeEffectFactory;
    public boolean mEnableFastScroller;
    public boolean mFirstLayoutComplete;
    public h0.v.a.j mGapWorker;
    public boolean mHasFixedSize;
    private boolean mIgnoreMotionEventTillDown;
    private int mInitialTouchX;
    private int mInitialTouchY;
    private int mInterceptRequestLayoutDepth;
    private r mInterceptingOnItemTouchListener;
    public boolean mIsAttached;
    public k mItemAnimator;
    private k.b mItemAnimatorListener;
    private Runnable mItemAnimatorRunner;
    public final ArrayList<m> mItemDecorations;
    public boolean mItemsAddedOrRemoved;
    public boolean mItemsChanged;
    private int mLastAutoMeasureNonExactMeasuredHeight;
    private int mLastAutoMeasureNonExactMeasuredWidth;
    private boolean mLastAutoMeasureSkippedDueToExact;
    private int mLastTouchX;
    private int mLastTouchY;
    public n mLayout;
    private int mLayoutOrScrollCounter;
    public boolean mLayoutSuppressed;
    public boolean mLayoutWasDefered;
    private EdgeEffect mLeftGlow;
    private final int mMaxFlingVelocity;
    private final int mMinFlingVelocity;
    private final int[] mMinMaxLayoutPositions;
    private final int[] mNestedOffsets;
    private final w mObserver;
    private List<p> mOnChildAttachStateListeners;
    private q mOnFlingListener;
    private final ArrayList<r> mOnItemTouchListeners;
    public final List<b0> mPendingAccessibilityImportanceChange;
    public SavedState mPendingSavedState;
    public boolean mPostedAnimatorRunner;
    public j.b mPrefetchRegistry;
    private boolean mPreserveFocusAfterLayout;
    public final u mRecycler;
    public v mRecyclerListener;
    public final List<v> mRecyclerListeners;
    public final int[] mReusableIntPair;
    private EdgeEffect mRightGlow;
    private float mScaledHorizontalScrollFactor;
    private float mScaledVerticalScrollFactor;
    private s mScrollListener;
    private List<s> mScrollListeners;
    private final int[] mScrollOffset;
    private int mScrollPointerId;
    private int mScrollState;
    private h0.i.i.i mScrollingChildHelper;
    public final y mState;
    public final Rect mTempRect;
    private final Rect mTempRect2;
    public final RectF mTempRectF;
    private EdgeEffect mTopGlow;
    private int mTouchSlop;
    public final Runnable mUpdateChildViewsRunnable;
    private VelocityTracker mVelocityTracker;
    public final a0 mViewFlinger;
    private final c0.b mViewInfoProcessCallback;
    public final c0 mViewInfoStore;

    public class a implements Runnable {
        public a() {
        }

        public void run() {
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mFirstLayoutComplete && !recyclerView.isLayoutRequested()) {
                RecyclerView recyclerView2 = RecyclerView.this;
                if (!recyclerView2.mIsAttached) {
                    recyclerView2.requestLayout();
                } else if (recyclerView2.mLayoutSuppressed) {
                    recyclerView2.mLayoutWasDefered = true;
                } else {
                    recyclerView2.consumePendingUpdateOperations();
                }
            }
        }
    }

    public class a0 implements Runnable {
        public boolean Y1 = false;
        public int c;
        public int d;
        public OverScroller q;
        public Interpolator x;
        public boolean y = false;

        public a0() {
            Interpolator interpolator = RecyclerView.sQuinticInterpolator;
            this.x = interpolator;
            this.q = new OverScroller(RecyclerView.this.getContext(), interpolator);
        }

        public void a() {
            if (this.y) {
                this.Y1 = true;
                return;
            }
            RecyclerView.this.removeCallbacks(this);
            RecyclerView recyclerView = RecyclerView.this;
            AtomicInteger atomicInteger = h0.i.i.q.a;
            recyclerView.postOnAnimation(this);
        }

        public void b(int i, int i2, int i3, Interpolator interpolator) {
            if (i3 == Integer.MIN_VALUE) {
                int abs = Math.abs(i);
                int abs2 = Math.abs(i2);
                boolean z = abs > abs2;
                RecyclerView recyclerView = RecyclerView.this;
                int width = z ? recyclerView.getWidth() : recyclerView.getHeight();
                if (!z) {
                    abs = abs2;
                }
                i3 = Math.min((int) (((((float) abs) / ((float) width)) + 1.0f) * 300.0f), RecyclerView.MAX_SCROLL_DURATION);
            }
            int i4 = i3;
            if (interpolator == null) {
                interpolator = RecyclerView.sQuinticInterpolator;
            }
            if (this.x != interpolator) {
                this.x = interpolator;
                this.q = new OverScroller(RecyclerView.this.getContext(), interpolator);
            }
            this.d = 0;
            this.c = 0;
            RecyclerView.this.setScrollState(2);
            this.q.startScroll(0, 0, i, i2, i4);
            a();
        }

        public void c() {
            RecyclerView.this.removeCallbacks(this);
            this.q.abortAnimation();
        }

        public void run() {
            int i;
            int i2;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mLayout == null) {
                c();
                return;
            }
            this.Y1 = false;
            this.y = true;
            recyclerView.consumePendingUpdateOperations();
            OverScroller overScroller = this.q;
            if (overScroller.computeScrollOffset()) {
                int currX = overScroller.getCurrX();
                int currY = overScroller.getCurrY();
                int i3 = currX - this.c;
                int i4 = currY - this.d;
                this.c = currX;
                this.d = currY;
                RecyclerView recyclerView2 = RecyclerView.this;
                int[] iArr = recyclerView2.mReusableIntPair;
                iArr[0] = 0;
                iArr[1] = 0;
                if (recyclerView2.dispatchNestedPreScroll(i3, i4, iArr, (int[]) null, 1)) {
                    int[] iArr2 = RecyclerView.this.mReusableIntPair;
                    i3 -= iArr2[0];
                    i4 -= iArr2[1];
                }
                if (RecyclerView.this.getOverScrollMode() != 2) {
                    RecyclerView.this.considerReleasingGlowsOnScroll(i3, i4);
                }
                RecyclerView recyclerView3 = RecyclerView.this;
                if (recyclerView3.mAdapter != null) {
                    int[] iArr3 = recyclerView3.mReusableIntPair;
                    iArr3[0] = 0;
                    iArr3[1] = 0;
                    recyclerView3.scrollStep(i3, i4, iArr3);
                    RecyclerView recyclerView4 = RecyclerView.this;
                    int[] iArr4 = recyclerView4.mReusableIntPair;
                    i = iArr4[0];
                    i2 = iArr4[1];
                    i3 -= i;
                    i4 -= i2;
                    x xVar = recyclerView4.mLayout.mSmoothScroller;
                    if (xVar != null && !xVar.d && xVar.e) {
                        int b = recyclerView4.mState.b();
                        if (b == 0) {
                            xVar.d();
                        } else if (xVar.a >= b) {
                            xVar.a = b - 1;
                            xVar.b(i, i2);
                        } else {
                            xVar.b(i, i2);
                        }
                    }
                } else {
                    i2 = 0;
                    i = 0;
                }
                if (!RecyclerView.this.mItemDecorations.isEmpty()) {
                    RecyclerView.this.invalidate();
                }
                RecyclerView recyclerView5 = RecyclerView.this;
                int[] iArr5 = recyclerView5.mReusableIntPair;
                iArr5[0] = 0;
                iArr5[1] = 0;
                recyclerView5.dispatchNestedScroll(i, i2, i3, i4, (int[]) null, 1, iArr5);
                RecyclerView recyclerView6 = RecyclerView.this;
                int[] iArr6 = recyclerView6.mReusableIntPair;
                int i5 = i3 - iArr6[0];
                int i6 = i4 - iArr6[1];
                if (!(i == 0 && i2 == 0)) {
                    recyclerView6.dispatchOnScrolled(i, i2);
                }
                if (!RecyclerView.this.awakenScrollBars()) {
                    RecyclerView.this.invalidate();
                }
                boolean z = overScroller.isFinished() || (((overScroller.getCurrX() == overScroller.getFinalX()) || i5 != 0) && ((overScroller.getCurrY() == overScroller.getFinalY()) || i6 != 0));
                RecyclerView recyclerView7 = RecyclerView.this;
                x xVar2 = recyclerView7.mLayout.mSmoothScroller;
                if ((xVar2 != null && xVar2.d) || !z) {
                    a();
                    RecyclerView recyclerView8 = RecyclerView.this;
                    h0.v.a.j jVar = recyclerView8.mGapWorker;
                    if (jVar != null) {
                        jVar.a(recyclerView8, i, i2);
                    }
                } else {
                    if (recyclerView7.getOverScrollMode() != 2) {
                        int currVelocity = (int) overScroller.getCurrVelocity();
                        int i7 = i5 < 0 ? -currVelocity : i5 > 0 ? currVelocity : 0;
                        if (i6 < 0) {
                            currVelocity = -currVelocity;
                        } else if (i6 <= 0) {
                            currVelocity = 0;
                        }
                        RecyclerView.this.absorbGlows(i7, currVelocity);
                    }
                    if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                        j.b bVar = RecyclerView.this.mPrefetchRegistry;
                        int[] iArr7 = bVar.c;
                        if (iArr7 != null) {
                            Arrays.fill(iArr7, -1);
                        }
                        bVar.d = 0;
                    }
                }
            }
            x xVar3 = RecyclerView.this.mLayout.mSmoothScroller;
            if (xVar3 != null && xVar3.d) {
                xVar3.b(0, 0);
            }
            this.y = false;
            if (this.Y1) {
                RecyclerView.this.removeCallbacks(this);
                RecyclerView recyclerView9 = RecyclerView.this;
                AtomicInteger atomicInteger = h0.i.i.q.a;
                recyclerView9.postOnAnimation(this);
                return;
            }
            RecyclerView.this.setScrollState(0);
            RecyclerView.this.stopNestedScroll(1);
        }
    }

    public class b implements Runnable {
        public b() {
        }

        public void run() {
            k kVar = RecyclerView.this.mItemAnimator;
            if (kVar != null) {
                kVar.runPendingAnimations();
            }
            RecyclerView.this.mPostedAnimatorRunner = false;
        }
    }

    public static abstract class b0 {
        public static final int FLAG_ADAPTER_FULLUPDATE = 1024;
        public static final int FLAG_ADAPTER_POSITION_UNKNOWN = 512;
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_BOUNCED_FROM_HIDDEN_LIST = 8192;
        public static final int FLAG_BOUND = 1;
        public static final int FLAG_IGNORE = 128;
        public static final int FLAG_INVALID = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_NOT_RECYCLABLE = 16;
        public static final int FLAG_REMOVED = 8;
        public static final int FLAG_RETURNED_FROM_SCRAP = 32;
        public static final int FLAG_TMP_DETACHED = 256;
        public static final int FLAG_UPDATE = 2;
        private static final List<Object> FULLUPDATE_PAYLOADS = Collections.emptyList();
        public static final int PENDING_ACCESSIBILITY_STATE_NOT_SET = -1;
        public final View itemView;
        public Adapter<? extends b0> mBindingAdapter;
        public int mFlags;
        public boolean mInChangeScrap = false;
        private int mIsRecyclableCount = 0;
        public long mItemId = -1;
        public int mItemViewType = -1;
        public WeakReference<RecyclerView> mNestedRecyclerView;
        public int mOldPosition = -1;
        public RecyclerView mOwnerRecyclerView;
        public List<Object> mPayloads = null;
        public int mPendingAccessibilityState = -1;
        public int mPosition = -1;
        public int mPreLayoutPosition = -1;
        public u mScrapContainer = null;
        public b0 mShadowedHolder = null;
        public b0 mShadowingHolder = null;
        public List<Object> mUnmodifiedPayloads = null;
        private int mWasImportantForAccessibilityBeforeHidden = 0;

        public b0(View view) {
            if (view != null) {
                this.itemView = view;
                return;
            }
            throw new IllegalArgumentException("itemView may not be null");
        }

        private void createPayloadsIfNeeded() {
            if (this.mPayloads == null) {
                ArrayList arrayList = new ArrayList();
                this.mPayloads = arrayList;
                this.mUnmodifiedPayloads = Collections.unmodifiableList(arrayList);
            }
        }

        public void addChangePayload(Object obj) {
            if (obj == null) {
                addFlags(FLAG_ADAPTER_FULLUPDATE);
            } else if ((1024 & this.mFlags) == 0) {
                createPayloadsIfNeeded();
                this.mPayloads.add(obj);
            }
        }

        public void addFlags(int i) {
            this.mFlags = i | this.mFlags;
        }

        public void clearOldPosition() {
            this.mOldPosition = -1;
            this.mPreLayoutPosition = -1;
        }

        public void clearPayload() {
            List<Object> list = this.mPayloads;
            if (list != null) {
                list.clear();
            }
            this.mFlags &= -1025;
        }

        public void clearReturnedFromScrapFlag() {
            this.mFlags &= -33;
        }

        public void clearTmpDetachFlag() {
            this.mFlags &= -257;
        }

        public boolean doesTransientStatePreventRecycling() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                AtomicInteger atomicInteger = h0.i.i.q.a;
                if (view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        public void flagRemovedAndOffsetPosition(int i, int i2, boolean z) {
            addFlags(8);
            offsetPosition(i2, z);
            this.mPosition = i;
        }

        public final int getAbsoluteAdapterPosition() {
            RecyclerView recyclerView = this.mOwnerRecyclerView;
            if (recyclerView == null) {
                return -1;
            }
            return recyclerView.getAdapterPositionInRecyclerView(this);
        }

        @Deprecated
        public final int getAdapterPosition() {
            return getBindingAdapterPosition();
        }

        public final Adapter<? extends b0> getBindingAdapter() {
            return this.mBindingAdapter;
        }

        public final int getBindingAdapterPosition() {
            RecyclerView recyclerView;
            Adapter adapter;
            int adapterPositionInRecyclerView;
            if (this.mBindingAdapter == null || (recyclerView = this.mOwnerRecyclerView) == null || (adapter = recyclerView.getAdapter()) == null || (adapterPositionInRecyclerView = this.mOwnerRecyclerView.getAdapterPositionInRecyclerView(this)) == -1) {
                return -1;
            }
            return adapter.findRelativeAdapterPositionIn(this.mBindingAdapter, this, adapterPositionInRecyclerView);
        }

        public final long getItemId() {
            return this.mItemId;
        }

        public final int getItemViewType() {
            return this.mItemViewType;
        }

        public final int getLayoutPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public final int getOldPosition() {
            return this.mOldPosition;
        }

        @Deprecated
        public final int getPosition() {
            int i = this.mPreLayoutPosition;
            return i == -1 ? this.mPosition : i;
        }

        public List<Object> getUnmodifiedPayloads() {
            if ((this.mFlags & FLAG_ADAPTER_FULLUPDATE) != 0) {
                return FULLUPDATE_PAYLOADS;
            }
            List<Object> list = this.mPayloads;
            if (list == null || list.size() == 0) {
                return FULLUPDATE_PAYLOADS;
            }
            return this.mUnmodifiedPayloads;
        }

        public boolean hasAnyOfTheFlags(int i) {
            return (i & this.mFlags) != 0;
        }

        public boolean isAdapterPositionUnknown() {
            return (this.mFlags & 512) != 0 || isInvalid();
        }

        public boolean isAttachedToTransitionOverlay() {
            return (this.itemView.getParent() == null || this.itemView.getParent() == this.mOwnerRecyclerView) ? false : true;
        }

        public boolean isBound() {
            return (this.mFlags & 1) != 0;
        }

        public boolean isInvalid() {
            return (this.mFlags & 4) != 0;
        }

        public final boolean isRecyclable() {
            if ((this.mFlags & 16) == 0) {
                View view = this.itemView;
                AtomicInteger atomicInteger = h0.i.i.q.a;
                if (!view.hasTransientState()) {
                    return true;
                }
            }
            return false;
        }

        public boolean isRemoved() {
            return (this.mFlags & 8) != 0;
        }

        public boolean isScrap() {
            return this.mScrapContainer != null;
        }

        public boolean isTmpDetached() {
            return (this.mFlags & 256) != 0;
        }

        public boolean isUpdated() {
            return (this.mFlags & 2) != 0;
        }

        public boolean needsUpdate() {
            return (this.mFlags & 2) != 0;
        }

        public void offsetPosition(int i, boolean z) {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
            if (this.mPreLayoutPosition == -1) {
                this.mPreLayoutPosition = this.mPosition;
            }
            if (z) {
                this.mPreLayoutPosition += i;
            }
            this.mPosition += i;
            if (this.itemView.getLayoutParams() != null) {
                ((o) this.itemView.getLayoutParams()).c = true;
            }
        }

        public void onEnteredHiddenState(RecyclerView recyclerView) {
            int i = this.mPendingAccessibilityState;
            if (i != -1) {
                this.mWasImportantForAccessibilityBeforeHidden = i;
            } else {
                View view = this.itemView;
                AtomicInteger atomicInteger = h0.i.i.q.a;
                this.mWasImportantForAccessibilityBeforeHidden = view.getImportantForAccessibility();
            }
            recyclerView.setChildImportantForAccessibilityInternal(this, 4);
        }

        public void onLeftHiddenState(RecyclerView recyclerView) {
            recyclerView.setChildImportantForAccessibilityInternal(this, this.mWasImportantForAccessibilityBeforeHidden);
            this.mWasImportantForAccessibilityBeforeHidden = 0;
        }

        public void resetInternal() {
            this.mFlags = 0;
            this.mPosition = -1;
            this.mOldPosition = -1;
            this.mItemId = -1;
            this.mPreLayoutPosition = -1;
            this.mIsRecyclableCount = 0;
            this.mShadowedHolder = null;
            this.mShadowingHolder = null;
            clearPayload();
            this.mWasImportantForAccessibilityBeforeHidden = 0;
            this.mPendingAccessibilityState = -1;
            RecyclerView.clearNestedRecyclerViewIfNotNested(this);
        }

        public void saveOldPosition() {
            if (this.mOldPosition == -1) {
                this.mOldPosition = this.mPosition;
            }
        }

        public void setFlags(int i, int i2) {
            this.mFlags = (i & i2) | (this.mFlags & (~i2));
        }

        public final void setIsRecyclable(boolean z) {
            int i = this.mIsRecyclableCount;
            int i2 = z ? i - 1 : i + 1;
            this.mIsRecyclableCount = i2;
            if (i2 < 0) {
                this.mIsRecyclableCount = 0;
                Log.e("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
            } else if (!z && i2 == 1) {
                this.mFlags |= 16;
            } else if (z && i2 == 0) {
                this.mFlags &= -17;
            }
        }

        public void setScrapContainer(u uVar, boolean z) {
            this.mScrapContainer = uVar;
            this.mInChangeScrap = z;
        }

        public boolean shouldBeKeptAsChild() {
            return (this.mFlags & 16) != 0;
        }

        public boolean shouldIgnore() {
            return (this.mFlags & 128) != 0;
        }

        public void stopIgnoring() {
            this.mFlags &= -129;
        }

        public String toString() {
            StringBuilder S0 = i0.d.a.a.a.S0(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
            S0.append(Integer.toHexString(hashCode()));
            S0.append(" position=");
            S0.append(this.mPosition);
            S0.append(" id=");
            S0.append(this.mItemId);
            S0.append(", oldPos=");
            S0.append(this.mOldPosition);
            S0.append(", pLpos:");
            S0.append(this.mPreLayoutPosition);
            StringBuilder sb = new StringBuilder(S0.toString());
            if (isScrap()) {
                sb.append(" scrap ");
                sb.append(this.mInChangeScrap ? "[changeScrap]" : "[attachedScrap]");
            }
            if (isInvalid()) {
                sb.append(" invalid");
            }
            if (!isBound()) {
                sb.append(" unbound");
            }
            if (needsUpdate()) {
                sb.append(" update");
            }
            if (isRemoved()) {
                sb.append(" removed");
            }
            if (shouldIgnore()) {
                sb.append(" ignored");
            }
            if (isTmpDetached()) {
                sb.append(" tmpDetached");
            }
            if (!isRecyclable()) {
                StringBuilder P0 = i0.d.a.a.a.P0(" not recyclable(");
                P0.append(this.mIsRecyclableCount);
                P0.append(")");
                sb.append(P0.toString());
            }
            if (isAdapterPositionUnknown()) {
                sb.append(" undefined adapter position");
            }
            if (this.itemView.getParent() == null) {
                sb.append(" no parent");
            }
            sb.append("}");
            return sb.toString();
        }

        public void unScrap() {
            this.mScrapContainer.n(this);
        }

        public boolean wasReturnedFromScrap() {
            return (this.mFlags & 32) != 0;
        }
    }

    public class c implements Interpolator {
        public float getInterpolation(float f) {
            float f2 = f - 1.0f;
            return (f2 * f2 * f2 * f2 * f2) + 1.0f;
        }
    }

    public class d implements c0.b {
        public d() {
        }
    }

    public class e implements e.b {
        public e() {
        }

        public View a(int i) {
            return RecyclerView.this.getChildAt(i);
        }

        public int b() {
            return RecyclerView.this.getChildCount();
        }

        public void c(int i) {
            View childAt = RecyclerView.this.getChildAt(i);
            if (childAt != null) {
                RecyclerView.this.dispatchChildDetached(childAt);
                childAt.clearAnimation();
            }
            RecyclerView.this.removeViewAt(i);
        }
    }

    public class f implements a.C0070a {
        public f() {
        }

        public void a(a.b bVar) {
            int i = bVar.a;
            if (i == 1) {
                RecyclerView recyclerView = RecyclerView.this;
                recyclerView.mLayout.onItemsAdded(recyclerView, bVar.b, bVar.d);
            } else if (i == 2) {
                RecyclerView recyclerView2 = RecyclerView.this;
                recyclerView2.mLayout.onItemsRemoved(recyclerView2, bVar.b, bVar.d);
            } else if (i == 4) {
                RecyclerView recyclerView3 = RecyclerView.this;
                recyclerView3.mLayout.onItemsUpdated(recyclerView3, bVar.b, bVar.d, bVar.c);
            } else if (i == 8) {
                RecyclerView recyclerView4 = RecyclerView.this;
                recyclerView4.mLayout.onItemsMoved(recyclerView4, bVar.b, bVar.d, 1);
            }
        }

        public b0 b(int i) {
            b0 findViewHolderForPosition = RecyclerView.this.findViewHolderForPosition(i, true);
            if (findViewHolderForPosition != null && !RecyclerView.this.mChildHelper.k(findViewHolderForPosition.itemView)) {
                return findViewHolderForPosition;
            }
            return null;
        }

        public void c(int i, int i2, Object obj) {
            RecyclerView.this.viewRangeUpdate(i, i2, obj);
            RecyclerView.this.mItemsChanged = true;
        }
    }

    public static class g extends Observable<h> {
        public boolean a() {
            return !this.mObservers.isEmpty();
        }

        public void b() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((h) this.mObservers.get(size)).a();
            }
        }

        public void c(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((h) this.mObservers.get(size)).e(i, i2, 1);
            }
        }

        public void d(int i, int i2, Object obj) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((h) this.mObservers.get(size)).c(i, i2, obj);
            }
        }

        public void e(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((h) this.mObservers.get(size)).d(i, i2);
            }
        }

        public void f(int i, int i2) {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((h) this.mObservers.get(size)).f(i, i2);
            }
        }

        public void g() {
            for (int size = this.mObservers.size() - 1; size >= 0; size--) {
                ((h) this.mObservers.get(size)).g();
            }
        }
    }

    public static abstract class h {
        public void a() {
        }

        public void b(int i, int i2) {
        }

        public void c(int i, int i2, Object obj) {
            b(i, i2);
        }

        public void d(int i, int i2) {
        }

        public void e(int i, int i2, int i3) {
        }

        public void f(int i, int i2) {
        }

        public void g() {
        }
    }

    public interface i {
        int a(int i, int i2);
    }

    public static class j {
        public EdgeEffect a(RecyclerView recyclerView) {
            return new EdgeEffect(recyclerView.getContext());
        }
    }

    public static abstract class k {
        public static final int FLAG_APPEARED_IN_PRE_LAYOUT = 4096;
        public static final int FLAG_CHANGED = 2;
        public static final int FLAG_INVALIDATED = 4;
        public static final int FLAG_MOVED = 2048;
        public static final int FLAG_REMOVED = 8;
        private long mAddDuration = 120;
        private long mChangeDuration = 250;
        private ArrayList<a> mFinishedListeners = new ArrayList<>();
        private b mListener = null;
        private long mMoveDuration = 250;
        private long mRemoveDuration = 120;

        public interface a {
            void a();
        }

        public interface b {
        }

        public static class c {
            public int a;
            public int b;
        }

        public static int buildAdapterChangeFlagsForAnimations(b0 b0Var) {
            int i = b0Var.mFlags & 14;
            if (b0Var.isInvalid()) {
                return 4;
            }
            if ((i & 4) != 0) {
                return i;
            }
            int oldPosition = b0Var.getOldPosition();
            int absoluteAdapterPosition = b0Var.getAbsoluteAdapterPosition();
            return (oldPosition == -1 || absoluteAdapterPosition == -1 || oldPosition == absoluteAdapterPosition) ? i : i | 2048;
        }

        public abstract boolean animateAppearance(b0 b0Var, c cVar, c cVar2);

        public abstract boolean animateChange(b0 b0Var, b0 b0Var2, c cVar, c cVar2);

        public abstract boolean animateDisappearance(b0 b0Var, c cVar, c cVar2);

        public abstract boolean animatePersistence(b0 b0Var, c cVar, c cVar2);

        public abstract boolean canReuseUpdatedViewHolder(b0 b0Var);

        public boolean canReuseUpdatedViewHolder(b0 b0Var, List<Object> list) {
            return canReuseUpdatedViewHolder(b0Var);
        }

        public final void dispatchAnimationFinished(b0 b0Var) {
            onAnimationFinished(b0Var);
            b bVar = this.mListener;
            if (bVar != null) {
                l lVar = (l) bVar;
                Objects.requireNonNull(lVar);
                b0Var.setIsRecyclable(true);
                if (b0Var.mShadowedHolder != null && b0Var.mShadowingHolder == null) {
                    b0Var.mShadowedHolder = null;
                }
                b0Var.mShadowingHolder = null;
                if (!b0Var.shouldBeKeptAsChild() && !RecyclerView.this.removeAnimatingView(b0Var.itemView) && b0Var.isTmpDetached()) {
                    RecyclerView.this.removeDetachedView(b0Var.itemView, false);
                }
            }
        }

        public final void dispatchAnimationStarted(b0 b0Var) {
            onAnimationStarted(b0Var);
        }

        public final void dispatchAnimationsFinished() {
            int size = this.mFinishedListeners.size();
            for (int i = 0; i < size; i++) {
                this.mFinishedListeners.get(i).a();
            }
            this.mFinishedListeners.clear();
        }

        public abstract void endAnimation(b0 b0Var);

        public abstract void endAnimations();

        public long getAddDuration() {
            return this.mAddDuration;
        }

        public long getChangeDuration() {
            return this.mChangeDuration;
        }

        public long getMoveDuration() {
            return this.mMoveDuration;
        }

        public long getRemoveDuration() {
            return this.mRemoveDuration;
        }

        public abstract boolean isRunning();

        public final boolean isRunning(a aVar) {
            boolean isRunning = isRunning();
            if (aVar != null) {
                if (!isRunning) {
                    aVar.a();
                } else {
                    this.mFinishedListeners.add(aVar);
                }
            }
            return isRunning;
        }

        public c obtainHolderInfo() {
            return new c();
        }

        public void onAnimationFinished(b0 b0Var) {
        }

        public void onAnimationStarted(b0 b0Var) {
        }

        public c recordPostLayoutInformation(y yVar, b0 b0Var) {
            c obtainHolderInfo = obtainHolderInfo();
            Objects.requireNonNull(obtainHolderInfo);
            View view = b0Var.itemView;
            obtainHolderInfo.a = view.getLeft();
            obtainHolderInfo.b = view.getTop();
            view.getRight();
            view.getBottom();
            return obtainHolderInfo;
        }

        public c recordPreLayoutInformation(y yVar, b0 b0Var, int i, List<Object> list) {
            c obtainHolderInfo = obtainHolderInfo();
            Objects.requireNonNull(obtainHolderInfo);
            View view = b0Var.itemView;
            obtainHolderInfo.a = view.getLeft();
            obtainHolderInfo.b = view.getTop();
            view.getRight();
            view.getBottom();
            return obtainHolderInfo;
        }

        public abstract void runPendingAnimations();

        public void setAddDuration(long j) {
            this.mAddDuration = j;
        }

        public void setChangeDuration(long j) {
            this.mChangeDuration = j;
        }

        public void setListener(b bVar) {
            this.mListener = bVar;
        }

        public void setMoveDuration(long j) {
            this.mMoveDuration = j;
        }

        public void setRemoveDuration(long j) {
            this.mRemoveDuration = j;
        }
    }

    public class l implements k.b {
        public l() {
        }
    }

    public static abstract class m {
        public void f(Rect rect, View view, RecyclerView recyclerView, y yVar) {
            ((o) view.getLayoutParams()).a();
            rect.set(0, 0, 0, 0);
        }

        public void g(Canvas canvas, RecyclerView recyclerView, y yVar) {
        }

        public void h(Canvas canvas, RecyclerView recyclerView, y yVar) {
        }
    }

    public static abstract class n {
        public boolean mAutoMeasure = false;
        public h0.v.a.e mChildHelper;
        private int mHeight;
        private int mHeightMode;
        public h0.v.a.b0 mHorizontalBoundCheck;
        private final b0.b mHorizontalBoundCheckCallback;
        public boolean mIsAttachedToWindow = false;
        private boolean mItemPrefetchEnabled = true;
        private boolean mMeasurementCacheEnabled = true;
        public int mPrefetchMaxCountObserved;
        public boolean mPrefetchMaxObservedInInitialPrefetch;
        public RecyclerView mRecyclerView;
        public boolean mRequestedSimpleAnimations = false;
        public x mSmoothScroller;
        public h0.v.a.b0 mVerticalBoundCheck;
        private final b0.b mVerticalBoundCheckCallback;
        private int mWidth;
        private int mWidthMode;

        public class a implements b0.b {
            public a() {
            }

            public int a(View view) {
                return n.this.getDecoratedLeft(view) - ((o) view.getLayoutParams()).leftMargin;
            }

            public int b() {
                return n.this.getPaddingLeft();
            }

            public int c() {
                return n.this.getWidth() - n.this.getPaddingRight();
            }

            public View d(int i) {
                return n.this.getChildAt(i);
            }

            public int e(View view) {
                return n.this.getDecoratedRight(view) + ((o) view.getLayoutParams()).rightMargin;
            }
        }

        public class b implements b0.b {
            public b() {
            }

            public int a(View view) {
                return n.this.getDecoratedTop(view) - ((o) view.getLayoutParams()).topMargin;
            }

            public int b() {
                return n.this.getPaddingTop();
            }

            public int c() {
                return n.this.getHeight() - n.this.getPaddingBottom();
            }

            public View d(int i) {
                return n.this.getChildAt(i);
            }

            public int e(View view) {
                return n.this.getDecoratedBottom(view) + ((o) view.getLayoutParams()).bottomMargin;
            }
        }

        public interface c {
        }

        public static class d {
            public int a;
            public int b;
            public boolean c;
            public boolean d;
        }

        public n() {
            a aVar = new a();
            this.mHorizontalBoundCheckCallback = aVar;
            b bVar = new b();
            this.mVerticalBoundCheckCallback = bVar;
            this.mHorizontalBoundCheck = new h0.v.a.b0(aVar);
            this.mVerticalBoundCheck = new h0.v.a.b0(bVar);
        }

        private void addViewInt(View view, int i, boolean z) {
            b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (z || childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.a(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.f(childViewHolderInt);
            }
            o oVar = (o) view.getLayoutParams();
            if (childViewHolderInt.wasReturnedFromScrap() || childViewHolderInt.isScrap()) {
                if (childViewHolderInt.isScrap()) {
                    childViewHolderInt.unScrap();
                } else {
                    childViewHolderInt.clearReturnedFromScrapFlag();
                }
                this.mChildHelper.b(view, i, view.getLayoutParams(), false);
            } else if (view.getParent() == this.mRecyclerView) {
                int j = this.mChildHelper.j(view);
                if (i == -1) {
                    i = this.mChildHelper.e();
                }
                if (j == -1) {
                    StringBuilder P0 = i0.d.a.a.a.P0("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:");
                    P0.append(this.mRecyclerView.indexOfChild(view));
                    throw new IllegalStateException(i0.d.a.a.a.S(this.mRecyclerView, P0));
                } else if (j != i) {
                    this.mRecyclerView.mLayout.moveView(j, i);
                }
            } else {
                this.mChildHelper.a(view, i, false);
                oVar.c = true;
                x xVar = this.mSmoothScroller;
                if (xVar != null && xVar.e && xVar.b.getChildLayoutPosition(view) == xVar.a) {
                    xVar.f = view;
                }
            }
            if (oVar.d) {
                childViewHolderInt.itemView.invalidate();
                oVar.d = false;
            }
        }

        public static int chooseSize(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i);
            int size = View.MeasureSpec.getSize(i);
            if (mode != Integer.MIN_VALUE) {
                return mode != 1073741824 ? Math.max(i2, i3) : size;
            }
            return Math.min(size, Math.max(i2, i3));
        }

        private void detachViewInternal(int i, View view) {
            this.mChildHelper.c(i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:2:0x000a, code lost:
            if (r3 >= 0) goto L_0x0011;
         */
        @java.lang.Deprecated
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int getChildMeasureSpec(int r1, int r2, int r3, boolean r4) {
            /*
                int r1 = r1 - r2
                r2 = 0
                int r1 = java.lang.Math.max(r2, r1)
                r0 = 1073741824(0x40000000, float:2.0)
                if (r4 == 0) goto L_0x000f
                if (r3 < 0) goto L_0x000d
                goto L_0x0011
            L_0x000d:
                r3 = r2
                goto L_0x001e
            L_0x000f:
                if (r3 < 0) goto L_0x0013
            L_0x0011:
                r2 = r0
                goto L_0x001e
            L_0x0013:
                r4 = -1
                if (r3 != r4) goto L_0x0018
                r3 = r1
                goto L_0x0011
            L_0x0018:
                r4 = -2
                if (r3 != r4) goto L_0x000d
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1
            L_0x001e:
                int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r3, r2)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.getChildMeasureSpec(int, int, int, boolean):int");
        }

        private int[] getChildRectangleOnScreenScrollAmount(View view, Rect rect) {
            int[] iArr = new int[2];
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            int left = (view.getLeft() + rect.left) - view.getScrollX();
            int top = (view.getTop() + rect.top) - view.getScrollY();
            int width2 = rect.width() + left;
            int height2 = rect.height() + top;
            int i = left - paddingLeft;
            int min = Math.min(0, i);
            int i2 = top - paddingTop;
            int min2 = Math.min(0, i2);
            int i3 = width2 - width;
            int max = Math.max(0, i3);
            int max2 = Math.max(0, height2 - height);
            if (getLayoutDirection() != 1) {
                if (min == 0) {
                    min = Math.min(i, max);
                }
                max = min;
            } else if (max == 0) {
                max = Math.max(min, i3);
            }
            if (min2 == 0) {
                min2 = Math.min(i2, max2);
            }
            iArr[0] = max;
            iArr[1] = min2;
            return iArr;
        }

        public static d getProperties(Context context, AttributeSet attributeSet, int i, int i2) {
            d dVar = new d();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RecyclerView, i, i2);
            dVar.a = obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_orientation, 1);
            dVar.b = obtainStyledAttributes.getInt(R.styleable.RecyclerView_spanCount, 1);
            dVar.c = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_reverseLayout, false);
            dVar.d = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_stackFromEnd, false);
            obtainStyledAttributes.recycle();
            return dVar;
        }

        private boolean isFocusedChildVisibleAfterScrolling(RecyclerView recyclerView, int i, int i2) {
            View focusedChild = recyclerView.getFocusedChild();
            if (focusedChild == null) {
                return false;
            }
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = getWidth() - getPaddingRight();
            int height = getHeight() - getPaddingBottom();
            Rect rect = this.mRecyclerView.mTempRect;
            getDecoratedBoundsWithMargins(focusedChild, rect);
            if (rect.left - i >= width || rect.right - i <= paddingLeft || rect.top - i2 >= height || rect.bottom - i2 <= paddingTop) {
                return false;
            }
            return true;
        }

        private static boolean isMeasurementUpToDate(int i, int i2, int i3) {
            int mode = View.MeasureSpec.getMode(i2);
            int size = View.MeasureSpec.getSize(i2);
            if (i3 > 0 && i != i3) {
                return false;
            }
            if (mode == Integer.MIN_VALUE) {
                return size >= i;
            }
            if (mode != 0) {
                return mode == 1073741824 && size == i;
            }
            return true;
        }

        private void scrapOrRecycleView(u uVar, int i, View view) {
            b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.shouldIgnore()) {
                if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || this.mRecyclerView.mAdapter.hasStableIds()) {
                    detachViewAt(i);
                    uVar.k(view);
                    this.mRecyclerView.mViewInfoStore.f(childViewHolderInt);
                    return;
                }
                removeViewAt(i);
                uVar.j(childViewHolderInt);
            }
        }

        public void addDisappearingView(View view) {
            addDisappearingView(view, -1);
        }

        public void addView(View view) {
            addView(view, -1);
        }

        public void assertInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertInLayoutOrScroll(str);
            }
        }

        public void assertNotInLayoutOrScroll(String str) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.assertNotInLayoutOrScroll(str);
            }
        }

        public void attachView(View view, int i, o oVar) {
            b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isRemoved()) {
                this.mRecyclerView.mViewInfoStore.a(childViewHolderInt);
            } else {
                this.mRecyclerView.mViewInfoStore.f(childViewHolderInt);
            }
            this.mChildHelper.b(view, i, oVar, childViewHolderInt.isRemoved());
        }

        public void calculateItemDecorationsForChild(View view, Rect rect) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(recyclerView.getItemDecorInsetsForChild(view));
            }
        }

        public boolean canScrollHorizontally() {
            return false;
        }

        public boolean canScrollVertically() {
            return false;
        }

        public boolean checkLayoutParams(o oVar) {
            return oVar != null;
        }

        public void collectAdjacentPrefetchPositions(int i, int i2, y yVar, c cVar) {
        }

        public void collectInitialPrefetchPositions(int i, c cVar) {
        }

        public int computeHorizontalScrollExtent(y yVar) {
            return 0;
        }

        public int computeHorizontalScrollOffset(y yVar) {
            return 0;
        }

        public int computeHorizontalScrollRange(y yVar) {
            return 0;
        }

        public int computeVerticalScrollExtent(y yVar) {
            return 0;
        }

        public int computeVerticalScrollOffset(y yVar) {
            return 0;
        }

        public int computeVerticalScrollRange(y yVar) {
            return 0;
        }

        public void detachAndScrapAttachedViews(u uVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                scrapOrRecycleView(uVar, childCount, getChildAt(childCount));
            }
        }

        public void detachAndScrapView(View view, u uVar) {
            scrapOrRecycleView(uVar, this.mChildHelper.j(view), view);
        }

        public void detachAndScrapViewAt(int i, u uVar) {
            scrapOrRecycleView(uVar, i, getChildAt(i));
        }

        public void detachView(View view) {
            int j = this.mChildHelper.j(view);
            if (j >= 0) {
                detachViewInternal(j, view);
            }
        }

        public void detachViewAt(int i) {
            detachViewInternal(i, getChildAt(i));
        }

        public void dispatchAttachedToWindow(RecyclerView recyclerView) {
            this.mIsAttachedToWindow = true;
            onAttachedToWindow(recyclerView);
        }

        public void dispatchDetachedFromWindow(RecyclerView recyclerView, u uVar) {
            this.mIsAttachedToWindow = false;
            onDetachedFromWindow(recyclerView, uVar);
        }

        public void endAnimation(View view) {
            k kVar = this.mRecyclerView.mItemAnimator;
            if (kVar != null) {
                kVar.endAnimation(RecyclerView.getChildViewHolderInt(view));
            }
        }

        public View findContainingItemView(View view) {
            View findContainingItemView;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (findContainingItemView = recyclerView.findContainingItemView(view)) == null || this.mChildHelper.c.contains(findContainingItemView)) {
                return null;
            }
            return findContainingItemView;
        }

        public View findViewByPosition(int i) {
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(childAt);
                if (childViewHolderInt != null && childViewHolderInt.getLayoutPosition() == i && !childViewHolderInt.shouldIgnore() && (this.mRecyclerView.mState.g || !childViewHolderInt.isRemoved())) {
                    return childAt;
                }
            }
            return null;
        }

        public abstract o generateDefaultLayoutParams();

        public o generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
            if (layoutParams instanceof o) {
                return new o((o) layoutParams);
            }
            if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                return new o((ViewGroup.MarginLayoutParams) layoutParams);
            }
            return new o(layoutParams);
        }

        public int getBaseline() {
            return -1;
        }

        public int getBottomDecorationHeight(View view) {
            return ((o) view.getLayoutParams()).b.bottom;
        }

        public View getChildAt(int i) {
            h0.v.a.e eVar = this.mChildHelper;
            if (eVar == null) {
                return null;
            }
            return ((e) eVar.a).a(eVar.f(i));
        }

        public int getChildCount() {
            h0.v.a.e eVar = this.mChildHelper;
            if (eVar != null) {
                return eVar.e();
            }
            return 0;
        }

        public boolean getClipToPadding() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.mClipToPadding;
        }

        public int getColumnCountForAccessibility(u uVar, y yVar) {
            return -1;
        }

        public int getDecoratedBottom(View view) {
            return getBottomDecorationHeight(view) + view.getBottom();
        }

        public void getDecoratedBoundsWithMargins(View view, Rect rect) {
            RecyclerView.getDecoratedBoundsWithMarginsInt(view, rect);
        }

        public int getDecoratedLeft(View view) {
            return view.getLeft() - getLeftDecorationWidth(view);
        }

        public int getDecoratedMeasuredHeight(View view) {
            Rect rect = ((o) view.getLayoutParams()).b;
            return view.getMeasuredHeight() + rect.top + rect.bottom;
        }

        public int getDecoratedMeasuredWidth(View view) {
            Rect rect = ((o) view.getLayoutParams()).b;
            return view.getMeasuredWidth() + rect.left + rect.right;
        }

        public int getDecoratedRight(View view) {
            return getRightDecorationWidth(view) + view.getRight();
        }

        public int getDecoratedTop(View view) {
            return view.getTop() - getTopDecorationHeight(view);
        }

        public View getFocusedChild() {
            View focusedChild;
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null || (focusedChild = recyclerView.getFocusedChild()) == null || this.mChildHelper.c.contains(focusedChild)) {
                return null;
            }
            return focusedChild;
        }

        public int getHeight() {
            return this.mHeight;
        }

        public int getHeightMode() {
            return this.mHeightMode;
        }

        public int getItemCount() {
            RecyclerView recyclerView = this.mRecyclerView;
            Adapter adapter = recyclerView != null ? recyclerView.getAdapter() : null;
            if (adapter != null) {
                return adapter.getItemCount();
            }
            return 0;
        }

        public int getItemViewType(View view) {
            return RecyclerView.getChildViewHolderInt(view).getItemViewType();
        }

        public int getLayoutDirection() {
            RecyclerView recyclerView = this.mRecyclerView;
            AtomicInteger atomicInteger = h0.i.i.q.a;
            return recyclerView.getLayoutDirection();
        }

        public int getLeftDecorationWidth(View view) {
            return ((o) view.getLayoutParams()).b.left;
        }

        public int getMinimumHeight() {
            RecyclerView recyclerView = this.mRecyclerView;
            AtomicInteger atomicInteger = h0.i.i.q.a;
            return recyclerView.getMinimumHeight();
        }

        public int getMinimumWidth() {
            RecyclerView recyclerView = this.mRecyclerView;
            AtomicInteger atomicInteger = h0.i.i.q.a;
            return recyclerView.getMinimumWidth();
        }

        public int getPaddingBottom() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingBottom();
            }
            return 0;
        }

        public int getPaddingEnd() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            AtomicInteger atomicInteger = h0.i.i.q.a;
            return recyclerView.getPaddingEnd();
        }

        public int getPaddingLeft() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingLeft();
            }
            return 0;
        }

        public int getPaddingRight() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingRight();
            }
            return 0;
        }

        public int getPaddingStart() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView == null) {
                return 0;
            }
            AtomicInteger atomicInteger = h0.i.i.q.a;
            return recyclerView.getPaddingStart();
        }

        public int getPaddingTop() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.getPaddingTop();
            }
            return 0;
        }

        public int getPosition(View view) {
            return ((o) view.getLayoutParams()).a();
        }

        public int getRightDecorationWidth(View view) {
            return ((o) view.getLayoutParams()).b.right;
        }

        public int getRowCountForAccessibility(u uVar, y yVar) {
            return -1;
        }

        public int getSelectionModeForAccessibility(u uVar, y yVar) {
            return 0;
        }

        public int getTopDecorationHeight(View view) {
            return ((o) view.getLayoutParams()).b.top;
        }

        public void getTransformedBoundingBox(View view, boolean z, Rect rect) {
            Matrix matrix;
            if (z) {
                Rect rect2 = ((o) view.getLayoutParams()).b;
                rect.set(-rect2.left, -rect2.top, view.getWidth() + rect2.right, view.getHeight() + rect2.bottom);
            } else {
                rect.set(0, 0, view.getWidth(), view.getHeight());
            }
            if (!(this.mRecyclerView == null || (matrix = view.getMatrix()) == null || matrix.isIdentity())) {
                RectF rectF = this.mRecyclerView.mTempRectF;
                rectF.set(rect);
                matrix.mapRect(rectF);
                rect.set((int) Math.floor((double) rectF.left), (int) Math.floor((double) rectF.top), (int) Math.ceil((double) rectF.right), (int) Math.ceil((double) rectF.bottom));
            }
            rect.offset(view.getLeft(), view.getTop());
        }

        public int getWidth() {
            return this.mWidth;
        }

        public int getWidthMode() {
            return this.mWidthMode;
        }

        public boolean hasFlexibleChildInBothOrientations() {
            int childCount = getChildCount();
            for (int i = 0; i < childCount; i++) {
                ViewGroup.LayoutParams layoutParams = getChildAt(i).getLayoutParams();
                if (layoutParams.width < 0 && layoutParams.height < 0) {
                    return true;
                }
            }
            return false;
        }

        public boolean hasFocus() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.hasFocus();
        }

        public void ignoreView(View view) {
            ViewParent parent = view.getParent();
            RecyclerView recyclerView = this.mRecyclerView;
            if (parent != recyclerView || recyclerView.indexOfChild(view) == -1) {
                throw new IllegalArgumentException(i0.d.a.a.a.S(this.mRecyclerView, i0.d.a.a.a.P0("View should be fully attached to be ignored")));
            }
            b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.addFlags(128);
            this.mRecyclerView.mViewInfoStore.g(childViewHolderInt);
        }

        public boolean isAttachedToWindow() {
            return this.mIsAttachedToWindow;
        }

        public boolean isAutoMeasureEnabled() {
            return this.mAutoMeasure;
        }

        public boolean isFocused() {
            RecyclerView recyclerView = this.mRecyclerView;
            return recyclerView != null && recyclerView.isFocused();
        }

        public final boolean isItemPrefetchEnabled() {
            return this.mItemPrefetchEnabled;
        }

        public boolean isLayoutHierarchical(u uVar, y yVar) {
            return false;
        }

        public boolean isMeasurementCacheEnabled() {
            return this.mMeasurementCacheEnabled;
        }

        public boolean isSmoothScrolling() {
            x xVar = this.mSmoothScroller;
            return xVar != null && xVar.e;
        }

        public boolean isViewPartiallyVisible(View view, boolean z, boolean z2) {
            boolean z3 = this.mHorizontalBoundCheck.b(view, 24579) && this.mVerticalBoundCheck.b(view, 24579);
            return z ? z3 : !z3;
        }

        public void layoutDecorated(View view, int i, int i2, int i3, int i4) {
            Rect rect = ((o) view.getLayoutParams()).b;
            view.layout(i + rect.left, i2 + rect.top, i3 - rect.right, i4 - rect.bottom);
        }

        public void layoutDecoratedWithMargins(View view, int i, int i2, int i3, int i4) {
            o oVar = (o) view.getLayoutParams();
            Rect rect = oVar.b;
            view.layout(i + rect.left + oVar.leftMargin, i2 + rect.top + oVar.topMargin, (i3 - rect.right) - oVar.rightMargin, (i4 - rect.bottom) - oVar.bottomMargin);
        }

        public void measureChild(View view, int i, int i2) {
            o oVar = (o) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + i3, oVar.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + i4, oVar.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, oVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void measureChildWithMargins(View view, int i, int i2) {
            o oVar = (o) view.getLayoutParams();
            Rect itemDecorInsetsForChild = this.mRecyclerView.getItemDecorInsetsForChild(view);
            int i3 = itemDecorInsetsForChild.left + itemDecorInsetsForChild.right + i;
            int i4 = itemDecorInsetsForChild.top + itemDecorInsetsForChild.bottom + i2;
            int childMeasureSpec = getChildMeasureSpec(getWidth(), getWidthMode(), getPaddingRight() + getPaddingLeft() + oVar.leftMargin + oVar.rightMargin + i3, oVar.width, canScrollHorizontally());
            int childMeasureSpec2 = getChildMeasureSpec(getHeight(), getHeightMode(), getPaddingBottom() + getPaddingTop() + oVar.topMargin + oVar.bottomMargin + i4, oVar.height, canScrollVertically());
            if (shouldMeasureChild(view, childMeasureSpec, childMeasureSpec2, oVar)) {
                view.measure(childMeasureSpec, childMeasureSpec2);
            }
        }

        public void moveView(int i, int i2) {
            View childAt = getChildAt(i);
            if (childAt != null) {
                detachViewAt(i);
                attachView(childAt, i2);
                return;
            }
            throw new IllegalArgumentException("Cannot move a child from non-existing index:" + i + this.mRecyclerView.toString());
        }

        public void offsetChildrenHorizontal(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenHorizontal(i);
            }
        }

        public void offsetChildrenVertical(int i) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.offsetChildrenVertical(i);
            }
        }

        public void onAdapterChanged(Adapter adapter, Adapter adapter2) {
        }

        public boolean onAddFocusables(RecyclerView recyclerView, ArrayList<View> arrayList, int i, int i2) {
            return false;
        }

        public void onAttachedToWindow(RecyclerView recyclerView) {
        }

        @Deprecated
        public void onDetachedFromWindow(RecyclerView recyclerView) {
        }

        public void onDetachedFromWindow(RecyclerView recyclerView, u uVar) {
            onDetachedFromWindow(recyclerView);
        }

        public View onFocusSearchFailed(View view, int i, u uVar, y yVar) {
            return null;
        }

        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityEvent(recyclerView.mRecycler, recyclerView.mState, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(h0.i.i.g0.b bVar) {
            RecyclerView recyclerView = this.mRecyclerView;
            onInitializeAccessibilityNodeInfo(recyclerView.mRecycler, recyclerView.mState, bVar);
        }

        public void onInitializeAccessibilityNodeInfoForItem(View view, h0.i.i.g0.b bVar) {
            b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && !this.mChildHelper.k(childViewHolderInt.itemView)) {
                RecyclerView recyclerView = this.mRecyclerView;
                onInitializeAccessibilityNodeInfoForItem(recyclerView.mRecycler, recyclerView.mState, view, bVar);
            }
        }

        public void onInitializeAccessibilityNodeInfoForItem(u uVar, y yVar, View view, h0.i.i.g0.b bVar) {
        }

        public View onInterceptFocusSearch(View view, int i) {
            return null;
        }

        public void onItemsAdded(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsChanged(RecyclerView recyclerView) {
        }

        public void onItemsMoved(RecyclerView recyclerView, int i, int i2, int i3) {
        }

        public void onItemsRemoved(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2) {
        }

        public void onItemsUpdated(RecyclerView recyclerView, int i, int i2, Object obj) {
            onItemsUpdated(recyclerView, i, i2);
        }

        public void onLayoutChildren(u uVar, y yVar) {
            Log.e(RecyclerView.TAG, "You must override onLayoutChildren(Recycler recycler, State state) ");
        }

        public void onLayoutCompleted(y yVar) {
        }

        public void onMeasure(u uVar, y yVar, int i, int i2) {
            this.mRecyclerView.defaultOnMeasure(i, i2);
        }

        @Deprecated
        public boolean onRequestChildFocus(RecyclerView recyclerView, View view, View view2) {
            return isSmoothScrolling() || recyclerView.isComputingLayout();
        }

        public void onRestoreInstanceState(Parcelable parcelable) {
        }

        public Parcelable onSaveInstanceState() {
            return null;
        }

        public void onScrollStateChanged(int i) {
        }

        public void onSmoothScrollerStopped(x xVar) {
            if (this.mSmoothScroller == xVar) {
                this.mSmoothScroller = null;
            }
        }

        public boolean performAccessibilityAction(int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityAction(recyclerView.mRecycler, recyclerView.mState, i, bundle);
        }

        public boolean performAccessibilityActionForItem(View view, int i, Bundle bundle) {
            RecyclerView recyclerView = this.mRecyclerView;
            return performAccessibilityActionForItem(recyclerView.mRecycler, recyclerView.mState, view, i, bundle);
        }

        public boolean performAccessibilityActionForItem(u uVar, y yVar, View view, int i, Bundle bundle) {
            return false;
        }

        public void postOnAnimation(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                AtomicInteger atomicInteger = h0.i.i.q.a;
                recyclerView.postOnAnimation(runnable);
            }
        }

        public void removeAllViews() {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                this.mChildHelper.l(childCount);
            }
        }

        public void removeAndRecycleAllViews(u uVar) {
            for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
                if (!RecyclerView.getChildViewHolderInt(getChildAt(childCount)).shouldIgnore()) {
                    removeAndRecycleViewAt(childCount, uVar);
                }
            }
        }

        public void removeAndRecycleScrapInt(u uVar) {
            int size = uVar.a.size();
            for (int i = size - 1; i >= 0; i--) {
                View view = uVar.a.get(i).itemView;
                b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
                if (!childViewHolderInt.shouldIgnore()) {
                    childViewHolderInt.setIsRecyclable(false);
                    if (childViewHolderInt.isTmpDetached()) {
                        this.mRecyclerView.removeDetachedView(view, false);
                    }
                    k kVar = this.mRecyclerView.mItemAnimator;
                    if (kVar != null) {
                        kVar.endAnimation(childViewHolderInt);
                    }
                    childViewHolderInt.setIsRecyclable(true);
                    b0 childViewHolderInt2 = RecyclerView.getChildViewHolderInt(view);
                    childViewHolderInt2.mScrapContainer = null;
                    childViewHolderInt2.mInChangeScrap = false;
                    childViewHolderInt2.clearReturnedFromScrapFlag();
                    uVar.j(childViewHolderInt2);
                }
            }
            uVar.a.clear();
            ArrayList<b0> arrayList = uVar.b;
            if (arrayList != null) {
                arrayList.clear();
            }
            if (size > 0) {
                this.mRecyclerView.invalidate();
            }
        }

        public void removeAndRecycleView(View view, u uVar) {
            removeView(view);
            uVar.i(view);
        }

        public void removeAndRecycleViewAt(int i, u uVar) {
            View childAt = getChildAt(i);
            removeViewAt(i);
            uVar.i(childAt);
        }

        public boolean removeCallbacks(Runnable runnable) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                return recyclerView.removeCallbacks(runnable);
            }
            return false;
        }

        public void removeDetachedView(View view) {
            this.mRecyclerView.removeDetachedView(view, false);
        }

        public void removeView(View view) {
            h0.v.a.e eVar = this.mChildHelper;
            int indexOfChild = RecyclerView.this.indexOfChild(view);
            if (indexOfChild >= 0) {
                if (eVar.b.f(indexOfChild)) {
                    eVar.m(view);
                }
                ((e) eVar.a).c(indexOfChild);
            }
        }

        public void removeViewAt(int i) {
            if (getChildAt(i) != null) {
                this.mChildHelper.l(i);
            }
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z) {
            return requestChildRectangleOnScreen(recyclerView, view, rect, z, false);
        }

        public void requestLayout() {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null) {
                recyclerView.requestLayout();
            }
        }

        public void requestSimpleAnimationsInNextLayout() {
            this.mRequestedSimpleAnimations = true;
        }

        public int scrollHorizontallyBy(int i, u uVar, y yVar) {
            return 0;
        }

        public void scrollToPosition(int i) {
        }

        public int scrollVerticallyBy(int i, u uVar, y yVar) {
            return 0;
        }

        @Deprecated
        public void setAutoMeasureEnabled(boolean z) {
            this.mAutoMeasure = z;
        }

        public void setExactMeasureSpecsFrom(RecyclerView recyclerView) {
            setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(recyclerView.getWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(recyclerView.getHeight(), 1073741824));
        }

        public final void setItemPrefetchEnabled(boolean z) {
            if (z != this.mItemPrefetchEnabled) {
                this.mItemPrefetchEnabled = z;
                this.mPrefetchMaxCountObserved = 0;
                RecyclerView recyclerView = this.mRecyclerView;
                if (recyclerView != null) {
                    recyclerView.mRecycler.o();
                }
            }
        }

        public void setMeasureSpecs(int i, int i2) {
            this.mWidth = View.MeasureSpec.getSize(i);
            int mode = View.MeasureSpec.getMode(i);
            this.mWidthMode = mode;
            if (mode == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mWidth = 0;
            }
            this.mHeight = View.MeasureSpec.getSize(i2);
            int mode2 = View.MeasureSpec.getMode(i2);
            this.mHeightMode = mode2;
            if (mode2 == 0 && !RecyclerView.ALLOW_SIZE_IN_UNSPECIFIED_SPEC) {
                this.mHeight = 0;
            }
        }

        public void setMeasuredDimension(Rect rect, int i, int i2) {
            setMeasuredDimension(chooseSize(i, getPaddingRight() + getPaddingLeft() + rect.width(), getMinimumWidth()), chooseSize(i2, getPaddingBottom() + getPaddingTop() + rect.height(), getMinimumHeight()));
        }

        public void setMeasuredDimensionFromChildren(int i, int i2) {
            int childCount = getChildCount();
            if (childCount == 0) {
                this.mRecyclerView.defaultOnMeasure(i, i2);
                return;
            }
            int i3 = Integer.MIN_VALUE;
            int i4 = Integer.MAX_VALUE;
            int i5 = Integer.MAX_VALUE;
            int i6 = Integer.MIN_VALUE;
            for (int i7 = 0; i7 < childCount; i7++) {
                View childAt = getChildAt(i7);
                Rect rect = this.mRecyclerView.mTempRect;
                getDecoratedBoundsWithMargins(childAt, rect);
                int i8 = rect.left;
                if (i8 < i4) {
                    i4 = i8;
                }
                int i9 = rect.right;
                if (i9 > i3) {
                    i3 = i9;
                }
                int i10 = rect.top;
                if (i10 < i5) {
                    i5 = i10;
                }
                int i11 = rect.bottom;
                if (i11 > i6) {
                    i6 = i11;
                }
            }
            this.mRecyclerView.mTempRect.set(i4, i5, i3, i6);
            setMeasuredDimension(this.mRecyclerView.mTempRect, i, i2);
        }

        public void setMeasurementCacheEnabled(boolean z) {
            this.mMeasurementCacheEnabled = z;
        }

        public void setRecyclerView(RecyclerView recyclerView) {
            if (recyclerView == null) {
                this.mRecyclerView = null;
                this.mChildHelper = null;
                this.mWidth = 0;
                this.mHeight = 0;
            } else {
                this.mRecyclerView = recyclerView;
                this.mChildHelper = recyclerView.mChildHelper;
                this.mWidth = recyclerView.getWidth();
                this.mHeight = recyclerView.getHeight();
            }
            this.mWidthMode = 1073741824;
            this.mHeightMode = 1073741824;
        }

        public boolean shouldMeasureChild(View view, int i, int i2, o oVar) {
            return view.isLayoutRequested() || !this.mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getWidth(), i, oVar.width) || !isMeasurementUpToDate(view.getHeight(), i2, oVar.height);
        }

        public boolean shouldMeasureTwice() {
            return false;
        }

        public boolean shouldReMeasureChild(View view, int i, int i2, o oVar) {
            return !this.mMeasurementCacheEnabled || !isMeasurementUpToDate(view.getMeasuredWidth(), i, oVar.width) || !isMeasurementUpToDate(view.getMeasuredHeight(), i2, oVar.height);
        }

        public void smoothScrollToPosition(RecyclerView recyclerView, y yVar, int i) {
            Log.e(RecyclerView.TAG, "You must override smoothScrollToPosition to support smooth scrolling");
        }

        public void startSmoothScroll(x xVar) {
            x xVar2 = this.mSmoothScroller;
            if (!(xVar2 == null || xVar == xVar2 || !xVar2.e)) {
                xVar2.d();
            }
            this.mSmoothScroller = xVar;
            RecyclerView recyclerView = this.mRecyclerView;
            Objects.requireNonNull(xVar);
            recyclerView.mViewFlinger.c();
            if (xVar.h) {
                StringBuilder P0 = i0.d.a.a.a.P0("An instance of ");
                P0.append(xVar.getClass().getSimpleName());
                P0.append(" was started more than once. Each instance of");
                P0.append(xVar.getClass().getSimpleName());
                P0.append(" is intended to only be used once. You should create a new instance for each use.");
                Log.w(RecyclerView.TAG, P0.toString());
            }
            xVar.b = recyclerView;
            xVar.c = this;
            int i = xVar.a;
            if (i != -1) {
                recyclerView.mState.a = i;
                xVar.e = true;
                xVar.d = true;
                xVar.f = recyclerView.mLayout.findViewByPosition(i);
                xVar.b.mViewFlinger.a();
                xVar.h = true;
                return;
            }
            throw new IllegalArgumentException("Invalid target position");
        }

        public void stopIgnoringView(View view) {
            b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            childViewHolderInt.stopIgnoring();
            childViewHolderInt.resetInternal();
            childViewHolderInt.addFlags(4);
        }

        public void stopSmoothScroller() {
            x xVar = this.mSmoothScroller;
            if (xVar != null) {
                xVar.d();
            }
        }

        public boolean supportsPredictiveItemAnimations() {
            return false;
        }

        public void addDisappearingView(View view, int i) {
            addViewInt(view, i, true);
        }

        public void addView(View view, int i) {
            addViewInt(view, i, false);
        }

        public void onInitializeAccessibilityEvent(u uVar, y yVar, AccessibilityEvent accessibilityEvent) {
            RecyclerView recyclerView = this.mRecyclerView;
            if (recyclerView != null && accessibilityEvent != null) {
                boolean z = true;
                if (!recyclerView.canScrollVertically(1) && !this.mRecyclerView.canScrollVertically(-1) && !this.mRecyclerView.canScrollHorizontally(-1) && !this.mRecyclerView.canScrollHorizontally(1)) {
                    z = false;
                }
                accessibilityEvent.setScrollable(z);
                Adapter adapter = this.mRecyclerView.mAdapter;
                if (adapter != null) {
                    accessibilityEvent.setItemCount(adapter.getItemCount());
                }
            }
        }

        public void onInitializeAccessibilityNodeInfo(u uVar, y yVar, h0.i.i.g0.b bVar) {
            if (this.mRecyclerView.canScrollVertically(-1) || this.mRecyclerView.canScrollHorizontally(-1)) {
                bVar.b.addAction(8192);
                bVar.b.setScrollable(true);
            }
            if (this.mRecyclerView.canScrollVertically(1) || this.mRecyclerView.canScrollHorizontally(1)) {
                bVar.b.addAction(4096);
                bVar.b.setScrollable(true);
            }
            bVar.i(b.C0048b.a(getRowCountForAccessibility(uVar, yVar), getColumnCountForAccessibility(uVar, yVar), isLayoutHierarchical(uVar, yVar), getSelectionModeForAccessibility(uVar, yVar)));
        }

        public boolean onRequestChildFocus(RecyclerView recyclerView, y yVar, View view, View view2) {
            return onRequestChildFocus(recyclerView, view, view2);
        }

        /* JADX WARNING: Removed duplicated region for block: B:25:0x0075 A[ADDED_TO_REGION] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean performAccessibilityAction(androidx.recyclerview.widget.RecyclerView.u r8, androidx.recyclerview.widget.RecyclerView.y r9, int r10, android.os.Bundle r11) {
            /*
                r7 = this;
                androidx.recyclerview.widget.RecyclerView r8 = r7.mRecyclerView
                r9 = 0
                if (r8 != 0) goto L_0x0006
                return r9
            L_0x0006:
                r11 = 4096(0x1000, float:5.74E-42)
                r0 = 1
                if (r10 == r11) goto L_0x0042
                r11 = 8192(0x2000, float:1.14794E-41)
                if (r10 == r11) goto L_0x0012
                r2 = r9
                r3 = r2
                goto L_0x0073
            L_0x0012:
                r10 = -1
                boolean r8 = r8.canScrollVertically(r10)
                if (r8 == 0) goto L_0x0029
                int r8 = r7.getHeight()
                int r11 = r7.getPaddingTop()
                int r8 = r8 - r11
                int r11 = r7.getPaddingBottom()
                int r8 = r8 - r11
                int r8 = -r8
                goto L_0x002a
            L_0x0029:
                r8 = r9
            L_0x002a:
                androidx.recyclerview.widget.RecyclerView r11 = r7.mRecyclerView
                boolean r10 = r11.canScrollHorizontally(r10)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.getWidth()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
                int r10 = -r10
                goto L_0x006e
            L_0x0042:
                boolean r8 = r8.canScrollVertically(r0)
                if (r8 == 0) goto L_0x0057
                int r8 = r7.getHeight()
                int r10 = r7.getPaddingTop()
                int r8 = r8 - r10
                int r10 = r7.getPaddingBottom()
                int r8 = r8 - r10
                goto L_0x0058
            L_0x0057:
                r8 = r9
            L_0x0058:
                androidx.recyclerview.widget.RecyclerView r10 = r7.mRecyclerView
                boolean r10 = r10.canScrollHorizontally(r0)
                if (r10 == 0) goto L_0x0071
                int r10 = r7.getWidth()
                int r11 = r7.getPaddingLeft()
                int r10 = r10 - r11
                int r11 = r7.getPaddingRight()
                int r10 = r10 - r11
            L_0x006e:
                r3 = r8
                r2 = r10
                goto L_0x0073
            L_0x0071:
                r3 = r8
                r2 = r9
            L_0x0073:
                if (r3 != 0) goto L_0x0078
                if (r2 != 0) goto L_0x0078
                return r9
            L_0x0078:
                androidx.recyclerview.widget.RecyclerView r1 = r7.mRecyclerView
                r4 = 0
                r5 = -2147483648(0xffffffff80000000, float:-0.0)
                r6 = 1
                r1.smoothScrollBy(r2, r3, r4, r5, r6)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.performAccessibilityAction(androidx.recyclerview.widget.RecyclerView$u, androidx.recyclerview.widget.RecyclerView$y, int, android.os.Bundle):boolean");
        }

        public boolean requestChildRectangleOnScreen(RecyclerView recyclerView, View view, Rect rect, boolean z, boolean z2) {
            int[] childRectangleOnScreenScrollAmount = getChildRectangleOnScreenScrollAmount(view, rect);
            int i = childRectangleOnScreenScrollAmount[0];
            int i2 = childRectangleOnScreenScrollAmount[1];
            if ((z2 && !isFocusedChildVisibleAfterScrolling(recyclerView, i, i2)) || (i == 0 && i2 == 0)) {
                return false;
            }
            if (z) {
                recyclerView.scrollBy(i, i2);
            } else {
                recyclerView.smoothScrollBy(i, i2);
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
            if (r5 == 1073741824) goto L_0x0020;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int getChildMeasureSpec(int r4, int r5, int r6, int r7, boolean r8) {
            /*
                int r4 = r4 - r6
                r6 = 0
                int r4 = java.lang.Math.max(r6, r4)
                r0 = -2
                r1 = -1
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = 1073741824(0x40000000, float:2.0)
                if (r8 == 0) goto L_0x001a
                if (r7 < 0) goto L_0x0011
                goto L_0x001c
            L_0x0011:
                if (r7 != r1) goto L_0x002f
                if (r5 == r2) goto L_0x0020
                if (r5 == 0) goto L_0x002f
                if (r5 == r3) goto L_0x0020
                goto L_0x002f
            L_0x001a:
                if (r7 < 0) goto L_0x001e
            L_0x001c:
                r5 = r3
                goto L_0x0031
            L_0x001e:
                if (r7 != r1) goto L_0x0022
            L_0x0020:
                r7 = r4
                goto L_0x0031
            L_0x0022:
                if (r7 != r0) goto L_0x002f
                if (r5 == r2) goto L_0x002c
                if (r5 != r3) goto L_0x0029
                goto L_0x002c
            L_0x0029:
                r7 = r4
                r5 = r6
                goto L_0x0031
            L_0x002c:
                r7 = r4
                r5 = r2
                goto L_0x0031
            L_0x002f:
                r5 = r6
                r7 = r5
            L_0x0031:
                int r4 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r5)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.n.getChildMeasureSpec(int, int, int, int, boolean):int");
        }

        public void attachView(View view, int i) {
            attachView(view, i, (o) view.getLayoutParams());
        }

        public o generateLayoutParams(Context context, AttributeSet attributeSet) {
            return new o(context, attributeSet);
        }

        public void setMeasuredDimension(int i, int i2) {
            this.mRecyclerView.setMeasuredDimension(i, i2);
        }

        public void attachView(View view) {
            attachView(view, -1);
        }
    }

    public interface p {
        void b(View view);

        void d(View view);
    }

    public static abstract class q {
    }

    public interface r {
        void a(RecyclerView recyclerView, MotionEvent motionEvent);

        boolean c(RecyclerView recyclerView, MotionEvent motionEvent);

        void e(boolean z);
    }

    public static abstract class s {
        public void a(RecyclerView recyclerView, int i) {
        }

        public void c(RecyclerView recyclerView, int i, int i2) {
        }
    }

    public static class t {
        public SparseArray<a> a = new SparseArray<>();
        public int b = 0;

        public static class a {
            public final ArrayList<b0> a = new ArrayList<>();
            public int b = 5;
            public long c = 0;
            public long d = 0;
        }

        public void a() {
            for (int i = 0; i < this.a.size(); i++) {
                this.a.valueAt(i).a.clear();
            }
        }

        public b0 b(int i) {
            a aVar = this.a.get(i);
            if (aVar == null || aVar.a.isEmpty()) {
                return null;
            }
            ArrayList<b0> arrayList = aVar.a;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                if (!arrayList.get(size).isAttachedToTransitionOverlay()) {
                    return arrayList.remove(size);
                }
            }
            return null;
        }

        public final a c(int i) {
            a aVar = this.a.get(i);
            if (aVar != null) {
                return aVar;
            }
            a aVar2 = new a();
            this.a.put(i, aVar2);
            return aVar2;
        }

        public void d(b0 b0Var) {
            int itemViewType = b0Var.getItemViewType();
            ArrayList<b0> arrayList = c(itemViewType).a;
            if (this.a.get(itemViewType).b > arrayList.size()) {
                b0Var.resetInternal();
                arrayList.add(b0Var);
            }
        }

        public long e(long j, long j2) {
            if (j == 0) {
                return j2;
            }
            return (j2 / 4) + ((j / 4) * 3);
        }
    }

    public final class u {
        public final ArrayList<b0> a;
        public ArrayList<b0> b = null;
        public final ArrayList<b0> c = new ArrayList<>();
        public final List<b0> d;
        public int e;
        public int f;
        public t g;

        public u() {
            ArrayList<b0> arrayList = new ArrayList<>();
            this.a = arrayList;
            this.d = Collections.unmodifiableList(arrayList);
            this.e = 2;
            this.f = 2;
        }

        public void a(b0 b0Var, boolean z) {
            RecyclerView.clearNestedRecyclerViewIfNotNested(b0Var);
            View view = b0Var.itemView;
            h0.v.a.x xVar = RecyclerView.this.mAccessibilityDelegate;
            if (xVar != null) {
                x.a aVar = xVar.b;
                h0.i.i.q.p(view, aVar instanceof x.a ? aVar.b.remove(view) : null);
            }
            if (z) {
                v vVar = RecyclerView.this.mRecyclerListener;
                if (vVar != null) {
                    vVar.a(b0Var);
                }
                int size = RecyclerView.this.mRecyclerListeners.size();
                for (int i = 0; i < size; i++) {
                    RecyclerView.this.mRecyclerListeners.get(i).a(b0Var);
                }
                Adapter adapter = RecyclerView.this.mAdapter;
                if (adapter != null) {
                    adapter.onViewRecycled(b0Var);
                }
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mState != null) {
                    recyclerView.mViewInfoStore.g(b0Var);
                }
            }
            b0Var.mBindingAdapter = null;
            b0Var.mOwnerRecyclerView = null;
            d().d(b0Var);
        }

        public void b() {
            this.a.clear();
            g();
        }

        public int c(int i) {
            if (i < 0 || i >= RecyclerView.this.mState.b()) {
                StringBuilder Q0 = i0.d.a.a.a.Q0("invalid position ", i, ". State item count is ");
                Q0.append(RecyclerView.this.mState.b());
                throw new IndexOutOfBoundsException(i0.d.a.a.a.S(RecyclerView.this, Q0));
            }
            RecyclerView recyclerView = RecyclerView.this;
            if (!recyclerView.mState.g) {
                return i;
            }
            return recyclerView.mAdapterHelper.f(i, 0);
        }

        public t d() {
            if (this.g == null) {
                this.g = new t();
            }
            return this.g;
        }

        public View e(int i) {
            return m(i, false, RecyclerView.FOREVER_NS).itemView;
        }

        public final void f(ViewGroup viewGroup, boolean z) {
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                if (childAt instanceof ViewGroup) {
                    f((ViewGroup) childAt, true);
                }
            }
            if (z) {
                if (viewGroup.getVisibility() == 4) {
                    viewGroup.setVisibility(0);
                    viewGroup.setVisibility(4);
                    return;
                }
                int visibility = viewGroup.getVisibility();
                viewGroup.setVisibility(4);
                viewGroup.setVisibility(visibility);
            }
        }

        public void g() {
            for (int size = this.c.size() - 1; size >= 0; size--) {
                h(size);
            }
            this.c.clear();
            if (RecyclerView.ALLOW_THREAD_GAP_WORK) {
                j.b bVar = RecyclerView.this.mPrefetchRegistry;
                int[] iArr = bVar.c;
                if (iArr != null) {
                    Arrays.fill(iArr, -1);
                }
                bVar.d = 0;
            }
        }

        public void h(int i) {
            a(this.c.get(i), true);
            this.c.remove(i);
        }

        public void i(View view) {
            b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (childViewHolderInt.isTmpDetached()) {
                RecyclerView.this.removeDetachedView(view, false);
            }
            if (childViewHolderInt.isScrap()) {
                childViewHolderInt.unScrap();
            } else if (childViewHolderInt.wasReturnedFromScrap()) {
                childViewHolderInt.clearReturnedFromScrapFlag();
            }
            j(childViewHolderInt);
            if (RecyclerView.this.mItemAnimator != null && !childViewHolderInt.isRecyclable()) {
                RecyclerView.this.mItemAnimator.endAnimation(childViewHolderInt);
            }
        }

        public void j(b0 b0Var) {
            boolean z;
            boolean z2;
            boolean z3 = false;
            if (b0Var.isScrap() || b0Var.itemView.getParent() != null) {
                StringBuilder P0 = i0.d.a.a.a.P0("Scrapped or attached views may not be recycled. isScrap:");
                P0.append(b0Var.isScrap());
                P0.append(" isAttached:");
                if (b0Var.itemView.getParent() != null) {
                    z3 = true;
                }
                P0.append(z3);
                throw new IllegalArgumentException(i0.d.a.a.a.S(RecyclerView.this, P0));
            } else if (b0Var.isTmpDetached()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Tmp detached view should be removed from RecyclerView before it can be recycled: ");
                sb.append(b0Var);
                throw new IllegalArgumentException(i0.d.a.a.a.S(RecyclerView.this, sb));
            } else if (!b0Var.shouldIgnore()) {
                boolean doesTransientStatePreventRecycling = b0Var.doesTransientStatePreventRecycling();
                Adapter adapter = RecyclerView.this.mAdapter;
                if ((adapter != null && doesTransientStatePreventRecycling && adapter.onFailedToRecycleView(b0Var)) || b0Var.isRecyclable()) {
                    if (this.f <= 0 || b0Var.hasAnyOfTheFlags(526)) {
                        z2 = false;
                    } else {
                        int size = this.c.size();
                        if (size >= this.f && size > 0) {
                            h(0);
                            size--;
                        }
                        if (RecyclerView.ALLOW_THREAD_GAP_WORK && size > 0 && !RecyclerView.this.mPrefetchRegistry.c(b0Var.mPosition)) {
                            do {
                                size--;
                                if (size < 0) {
                                    break;
                                }
                            } while (RecyclerView.this.mPrefetchRegistry.c(this.c.get(size).mPosition));
                            size++;
                        }
                        this.c.add(size, b0Var);
                        z2 = true;
                    }
                    if (!z2) {
                        a(b0Var, true);
                        z3 = true;
                    }
                    z = z3;
                    z3 = z2;
                } else {
                    z = false;
                }
                RecyclerView.this.mViewInfoStore.g(b0Var);
                if (!z3 && !z && doesTransientStatePreventRecycling) {
                    b0Var.mBindingAdapter = null;
                    b0Var.mOwnerRecyclerView = null;
                }
            } else {
                throw new IllegalArgumentException(i0.d.a.a.a.S(RecyclerView.this, i0.d.a.a.a.P0("Trying to recycle an ignored view holder. You should first call stopIgnoringView(view) before calling recycle.")));
            }
        }

        public void k(View view) {
            b0 childViewHolderInt = RecyclerView.getChildViewHolderInt(view);
            if (!childViewHolderInt.hasAnyOfTheFlags(12) && childViewHolderInt.isUpdated() && !RecyclerView.this.canReuseUpdatedViewHolder(childViewHolderInt)) {
                if (this.b == null) {
                    this.b = new ArrayList<>();
                }
                childViewHolderInt.setScrapContainer(this, true);
                this.b.add(childViewHolderInt);
            } else if (!childViewHolderInt.isInvalid() || childViewHolderInt.isRemoved() || RecyclerView.this.mAdapter.hasStableIds()) {
                childViewHolderInt.setScrapContainer(this, false);
                this.a.add(childViewHolderInt);
            } else {
                throw new IllegalArgumentException(i0.d.a.a.a.S(RecyclerView.this, i0.d.a.a.a.P0("Called scrap view with an invalid view. Invalid views cannot be reused from scrap, they should rebound from recycler pool.")));
            }
        }

        public final boolean l(b0 b0Var, int i, int i2, long j) {
            b0Var.mBindingAdapter = null;
            b0Var.mOwnerRecyclerView = RecyclerView.this;
            int itemViewType = b0Var.getItemViewType();
            long nanoTime = RecyclerView.this.getNanoTime();
            if (j != RecyclerView.FOREVER_NS) {
                long j2 = this.g.c(itemViewType).d;
                if (!(j2 == 0 || j2 + nanoTime < j)) {
                    return false;
                }
            }
            RecyclerView.this.mAdapter.bindViewHolder(b0Var, i);
            long nanoTime2 = RecyclerView.this.getNanoTime();
            t tVar = this.g;
            t.a c2 = tVar.c(b0Var.getItemViewType());
            c2.d = tVar.e(c2.d, nanoTime2 - nanoTime);
            if (RecyclerView.this.isAccessibilityEnabled()) {
                View view = b0Var.itemView;
                AtomicInteger atomicInteger = h0.i.i.q.a;
                if (view.getImportantForAccessibility() == 0) {
                    view.setImportantForAccessibility(1);
                }
                h0.v.a.x xVar = RecyclerView.this.mAccessibilityDelegate;
                if (xVar != null) {
                    x.a aVar = xVar.b;
                    if (aVar instanceof x.a) {
                        Objects.requireNonNull(aVar);
                        h0.i.i.a e2 = h0.i.i.q.e(view);
                        if (!(e2 == null || e2 == aVar)) {
                            aVar.b.put(view, e2);
                        }
                    }
                    h0.i.i.q.p(view, aVar);
                }
            }
            if (RecyclerView.this.mState.g) {
                b0Var.mPreLayoutPosition = i2;
            }
            return true;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:51:0x00c8, code lost:
            r10.addFlags(32);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:88:0x01bb, code lost:
            r5 = r10;
         */
        /* JADX WARNING: Removed duplicated region for block: B:123:0x0259  */
        /* JADX WARNING: Removed duplicated region for block: B:199:0x03e0  */
        /* JADX WARNING: Removed duplicated region for block: B:204:0x0407  */
        /* JADX WARNING: Removed duplicated region for block: B:205:0x040a  */
        /* JADX WARNING: Removed duplicated region for block: B:215:0x043a  */
        /* JADX WARNING: Removed duplicated region for block: B:216:0x0448  */
        /* JADX WARNING: Removed duplicated region for block: B:34:0x0090  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x0097  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public androidx.recyclerview.widget.RecyclerView.b0 m(int r17, boolean r18, long r19) {
            /*
                r16 = this;
                r6 = r16
                r3 = r17
                if (r3 < 0) goto L_0x046b
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.mState
                int r0 = r0.b()
                if (r3 >= r0) goto L_0x046b
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.mState
                boolean r0 = r0.g
                r1 = 32
                r2 = 0
                r7 = 1
                r8 = 0
                if (r0 == 0) goto L_0x0092
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r0 = r6.b
                if (r0 == 0) goto L_0x008d
                int r0 = r0.size()
                if (r0 != 0) goto L_0x0028
                goto L_0x008d
            L_0x0028:
                r4 = r8
            L_0x0029:
                if (r4 >= r0) goto L_0x0046
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r6.b
                java.lang.Object r5 = r5.get(r4)
                androidx.recyclerview.widget.RecyclerView$b0 r5 = (androidx.recyclerview.widget.RecyclerView.b0) r5
                boolean r9 = r5.wasReturnedFromScrap()
                if (r9 != 0) goto L_0x0043
                int r9 = r5.getLayoutPosition()
                if (r9 != r3) goto L_0x0043
                r5.addFlags(r1)
                goto L_0x008e
            L_0x0043:
                int r4 = r4 + 1
                goto L_0x0029
            L_0x0046:
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r4 = r4.mAdapter
                boolean r4 = r4.hasStableIds()
                if (r4 == 0) goto L_0x008d
                androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
                h0.v.a.a r4 = r4.mAdapterHelper
                int r4 = r4.f(r3, r8)
                if (r4 <= 0) goto L_0x008d
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.mAdapter
                int r5 = r5.getItemCount()
                if (r4 >= r5) goto L_0x008d
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.mAdapter
                long r4 = r5.getItemId(r4)
                r9 = r8
            L_0x006d:
                if (r9 >= r0) goto L_0x008d
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r10 = r6.b
                java.lang.Object r10 = r10.get(r9)
                androidx.recyclerview.widget.RecyclerView$b0 r10 = (androidx.recyclerview.widget.RecyclerView.b0) r10
                boolean r11 = r10.wasReturnedFromScrap()
                if (r11 != 0) goto L_0x008a
                long r11 = r10.getItemId()
                int r11 = (r11 > r4 ? 1 : (r11 == r4 ? 0 : -1))
                if (r11 != 0) goto L_0x008a
                r10.addFlags(r1)
                r5 = r10
                goto L_0x008e
            L_0x008a:
                int r9 = r9 + 1
                goto L_0x006d
            L_0x008d:
                r5 = r2
            L_0x008e:
                if (r5 == 0) goto L_0x0093
                r0 = r7
                goto L_0x0094
            L_0x0092:
                r5 = r2
            L_0x0093:
                r0 = r8
            L_0x0094:
                r4 = -1
                if (r5 != 0) goto L_0x0257
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r6.a
                int r5 = r5.size()
                r9 = r8
            L_0x009e:
                if (r9 >= r5) goto L_0x00d0
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r10 = r6.a
                java.lang.Object r10 = r10.get(r9)
                androidx.recyclerview.widget.RecyclerView$b0 r10 = (androidx.recyclerview.widget.RecyclerView.b0) r10
                boolean r11 = r10.wasReturnedFromScrap()
                if (r11 != 0) goto L_0x00cd
                int r11 = r10.getLayoutPosition()
                if (r11 != r3) goto L_0x00cd
                boolean r11 = r10.isInvalid()
                if (r11 != 0) goto L_0x00cd
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r11 = r11.mState
                boolean r11 = r11.g
                if (r11 != 0) goto L_0x00c8
                boolean r11 = r10.isRemoved()
                if (r11 != 0) goto L_0x00cd
            L_0x00c8:
                r10.addFlags(r1)
                goto L_0x01bb
            L_0x00cd:
                int r9 = r9 + 1
                goto L_0x009e
            L_0x00d0:
                if (r18 != 0) goto L_0x0191
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                h0.v.a.e r5 = r5.mChildHelper
                java.util.List<android.view.View> r9 = r5.c
                int r9 = r9.size()
                r10 = r8
            L_0x00dd:
                if (r10 >= r9) goto L_0x0108
                java.util.List<android.view.View> r11 = r5.c
                java.lang.Object r11 = r11.get(r10)
                android.view.View r11 = (android.view.View) r11
                h0.v.a.e$b r12 = r5.a
                androidx.recyclerview.widget.RecyclerView$e r12 = (androidx.recyclerview.widget.RecyclerView.e) r12
                java.util.Objects.requireNonNull(r12)
                androidx.recyclerview.widget.RecyclerView$b0 r12 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r11)
                int r13 = r12.getLayoutPosition()
                if (r13 != r3) goto L_0x0105
                boolean r13 = r12.isInvalid()
                if (r13 != 0) goto L_0x0105
                boolean r12 = r12.isRemoved()
                if (r12 != 0) goto L_0x0105
                goto L_0x0109
            L_0x0105:
                int r10 = r10 + 1
                goto L_0x00dd
            L_0x0108:
                r11 = r2
            L_0x0109:
                if (r11 == 0) goto L_0x0191
                androidx.recyclerview.widget.RecyclerView$b0 r5 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r11)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                h0.v.a.e r9 = r9.mChildHelper
                h0.v.a.e$b r10 = r9.a
                androidx.recyclerview.widget.RecyclerView$e r10 = (androidx.recyclerview.widget.RecyclerView.e) r10
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                int r10 = r10.indexOfChild(r11)
                if (r10 < 0) goto L_0x017a
                h0.v.a.e$a r12 = r9.b
                boolean r12 = r12.d(r10)
                if (r12 == 0) goto L_0x0163
                h0.v.a.e$a r12 = r9.b
                r12.a(r10)
                r9.m(r11)
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                h0.v.a.e r9 = r9.mChildHelper
                int r9 = r9.j(r11)
                if (r9 == r4) goto L_0x014a
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                h0.v.a.e r10 = r10.mChildHelper
                r10.c(r9)
                r6.k(r11)
                r9 = 8224(0x2020, float:1.1524E-41)
                r5.addFlags(r9)
                goto L_0x01c1
            L_0x014a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "layout index should not be -1 after unhiding a view:"
                r1.append(r2)
                r1.append(r5)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r1 = i0.d.a.a.a.S(r2, r1)
                r0.<init>(r1)
                throw r0
            L_0x0163:
                java.lang.RuntimeException r0 = new java.lang.RuntimeException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "trying to unhide a view that was not hidden"
                r1.append(r2)
                r1.append(r11)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x017a:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "view is not a child, cannot hide "
                r1.append(r2)
                r1.append(r11)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0191:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r6.c
                int r5 = r5.size()
                r9 = r8
            L_0x0198:
                if (r9 >= r5) goto L_0x01c0
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r10 = r6.c
                java.lang.Object r10 = r10.get(r9)
                androidx.recyclerview.widget.RecyclerView$b0 r10 = (androidx.recyclerview.widget.RecyclerView.b0) r10
                boolean r11 = r10.isInvalid()
                if (r11 != 0) goto L_0x01bd
                int r11 = r10.getLayoutPosition()
                if (r11 != r3) goto L_0x01bd
                boolean r11 = r10.isAttachedToTransitionOverlay()
                if (r11 != 0) goto L_0x01bd
                if (r18 != 0) goto L_0x01bb
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r6.c
                r5.remove(r9)
            L_0x01bb:
                r5 = r10
                goto L_0x01c1
            L_0x01bd:
                int r9 = r9 + 1
                goto L_0x0198
            L_0x01c0:
                r5 = r2
            L_0x01c1:
                if (r5 == 0) goto L_0x0257
                boolean r9 = r5.isRemoved()
                if (r9 == 0) goto L_0x01d0
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r9 = r9.mState
                boolean r9 = r9.g
                goto L_0x0215
            L_0x01d0:
                int r9 = r5.mPosition
                if (r9 < 0) goto L_0x023e
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.mAdapter
                int r10 = r10.getItemCount()
                if (r9 >= r10) goto L_0x023e
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r10 = r9.mState
                boolean r10 = r10.g
                if (r10 != 0) goto L_0x01f5
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.mAdapter
                int r10 = r5.mPosition
                int r9 = r9.getItemViewType(r10)
                int r10 = r5.getItemViewType()
                if (r9 == r10) goto L_0x01f5
                goto L_0x0212
            L_0x01f5:
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r9 = r9.mAdapter
                boolean r9 = r9.hasStableIds()
                if (r9 == 0) goto L_0x0214
                long r9 = r5.getItemId()
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r11 = r11.mAdapter
                int r12 = r5.mPosition
                long r11 = r11.getItemId(r12)
                int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                if (r9 != 0) goto L_0x0212
                goto L_0x0214
            L_0x0212:
                r9 = r8
                goto L_0x0215
            L_0x0214:
                r9 = r7
            L_0x0215:
                if (r9 != 0) goto L_0x023c
                if (r18 != 0) goto L_0x023a
                r9 = 4
                r5.addFlags(r9)
                boolean r9 = r5.isScrap()
                if (r9 == 0) goto L_0x022e
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r10 = r5.itemView
                r9.removeDetachedView(r10, r8)
                r5.unScrap()
                goto L_0x0237
            L_0x022e:
                boolean r9 = r5.wasReturnedFromScrap()
                if (r9 == 0) goto L_0x0237
                r5.clearReturnedFromScrapFlag()
            L_0x0237:
                r6.j(r5)
            L_0x023a:
                r5 = r2
                goto L_0x0257
            L_0x023c:
                r0 = r7
                goto L_0x0257
            L_0x023e:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Inconsistency detected. Invalid view holder adapter position"
                r1.append(r2)
                r1.append(r5)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r1 = i0.d.a.a.a.S(r2, r1)
                r0.<init>(r1)
                throw r0
            L_0x0257:
                if (r5 != 0) goto L_0x03c1
                androidx.recyclerview.widget.RecyclerView r9 = androidx.recyclerview.widget.RecyclerView.this
                h0.v.a.a r9 = r9.mAdapterHelper
                int r9 = r9.f(r3, r8)
                if (r9 < 0) goto L_0x03a0
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.mAdapter
                int r10 = r10.getItemCount()
                if (r9 >= r10) goto L_0x03a0
                androidx.recyclerview.widget.RecyclerView r10 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.mAdapter
                int r10 = r10.getItemViewType(r9)
                androidx.recyclerview.widget.RecyclerView r11 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r11 = r11.mAdapter
                boolean r11 = r11.hasStableIds()
                if (r11 == 0) goto L_0x0323
                androidx.recyclerview.widget.RecyclerView r5 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r5 = r5.mAdapter
                long r11 = r5.getItemId(r9)
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r6.a
                int r5 = r5.size()
                int r5 = r5 + r4
            L_0x028e:
                if (r5 < 0) goto L_0x02e6
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r13 = r6.a
                java.lang.Object r13 = r13.get(r5)
                androidx.recyclerview.widget.RecyclerView$b0 r13 = (androidx.recyclerview.widget.RecyclerView.b0) r13
                long r14 = r13.getItemId()
                int r14 = (r14 > r11 ? 1 : (r14 == r11 ? 0 : -1))
                if (r14 != 0) goto L_0x02e3
                boolean r14 = r13.wasReturnedFromScrap()
                if (r14 != 0) goto L_0x02e3
                int r14 = r13.getItemViewType()
                if (r10 != r14) goto L_0x02c5
                r13.addFlags(r1)
                boolean r1 = r13.isRemoved()
                if (r1 == 0) goto L_0x02c3
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r1 = r1.mState
                boolean r1 = r1.g
                if (r1 != 0) goto L_0x02c3
                r1 = 2
                r4 = 14
                r13.setFlags(r1, r4)
            L_0x02c3:
                r5 = r13
                goto L_0x031e
            L_0x02c5:
                if (r18 != 0) goto L_0x02e3
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r14 = r6.a
                r14.remove(r5)
                androidx.recyclerview.widget.RecyclerView r14 = androidx.recyclerview.widget.RecyclerView.this
                android.view.View r15 = r13.itemView
                r14.removeDetachedView(r15, r8)
                android.view.View r13 = r13.itemView
                androidx.recyclerview.widget.RecyclerView$b0 r13 = androidx.recyclerview.widget.RecyclerView.getChildViewHolderInt(r13)
                r13.mScrapContainer = r2
                r13.mInChangeScrap = r8
                r13.clearReturnedFromScrapFlag()
                r6.j(r13)
            L_0x02e3:
                int r5 = r5 + -1
                goto L_0x028e
            L_0x02e6:
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r1 = r6.c
                int r1 = r1.size()
                int r1 = r1 + r4
            L_0x02ed:
                if (r1 < 0) goto L_0x031d
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r4 = r6.c
                java.lang.Object r4 = r4.get(r1)
                androidx.recyclerview.widget.RecyclerView$b0 r4 = (androidx.recyclerview.widget.RecyclerView.b0) r4
                long r13 = r4.getItemId()
                int r5 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
                if (r5 != 0) goto L_0x031a
                boolean r5 = r4.isAttachedToTransitionOverlay()
                if (r5 != 0) goto L_0x031a
                int r5 = r4.getItemViewType()
                if (r10 != r5) goto L_0x0314
                if (r18 != 0) goto L_0x0312
                java.util.ArrayList<androidx.recyclerview.widget.RecyclerView$b0> r5 = r6.c
                r5.remove(r1)
            L_0x0312:
                r5 = r4
                goto L_0x031e
            L_0x0314:
                if (r18 != 0) goto L_0x031a
                r6.h(r1)
                goto L_0x031d
            L_0x031a:
                int r1 = r1 + -1
                goto L_0x02ed
            L_0x031d:
                r5 = r2
            L_0x031e:
                if (r5 == 0) goto L_0x0323
                r5.mPosition = r9
                r0 = r7
            L_0x0323:
                if (r5 != 0) goto L_0x0342
                androidx.recyclerview.widget.RecyclerView$t r1 = r16.d()
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r1.b(r10)
                if (r1 == 0) goto L_0x0341
                r1.resetInternal()
                boolean r4 = androidx.recyclerview.widget.RecyclerView.FORCE_INVALIDATE_DISPLAY_LIST
                if (r4 == 0) goto L_0x0341
                android.view.View r4 = r1.itemView
                boolean r5 = r4 instanceof android.view.ViewGroup
                if (r5 == 0) goto L_0x0341
                android.view.ViewGroup r4 = (android.view.ViewGroup) r4
                r6.f(r4, r8)
            L_0x0341:
                r5 = r1
            L_0x0342:
                if (r5 != 0) goto L_0x03c1
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                long r4 = r1.getNanoTime()
                r11 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
                int r1 = (r19 > r11 ? 1 : (r19 == r11 ? 0 : -1))
                if (r1 == 0) goto L_0x036d
                androidx.recyclerview.widget.RecyclerView$t r1 = r6.g
                androidx.recyclerview.widget.RecyclerView$t$a r1 = r1.c(r10)
                long r11 = r1.c
                r13 = 0
                int r1 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                if (r1 == 0) goto L_0x0369
                long r11 = r11 + r4
                int r1 = (r11 > r19 ? 1 : (r11 == r19 ? 0 : -1))
                if (r1 >= 0) goto L_0x0367
                goto L_0x0369
            L_0x0367:
                r1 = r8
                goto L_0x036a
            L_0x0369:
                r1 = r7
            L_0x036a:
                if (r1 != 0) goto L_0x036d
                return r2
            L_0x036d:
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$Adapter r2 = r1.mAdapter
                androidx.recyclerview.widget.RecyclerView$b0 r1 = r2.createViewHolder(r1, r10)
                boolean r2 = androidx.recyclerview.widget.RecyclerView.ALLOW_THREAD_GAP_WORK
                if (r2 == 0) goto L_0x0388
                android.view.View r2 = r1.itemView
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.findNestedRecyclerView(r2)
                if (r2 == 0) goto L_0x0388
                java.lang.ref.WeakReference r9 = new java.lang.ref.WeakReference
                r9.<init>(r2)
                r1.mNestedRecyclerView = r9
            L_0x0388:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                long r11 = r2.getNanoTime()
                androidx.recyclerview.widget.RecyclerView$t r2 = r6.g
                long r11 = r11 - r4
                androidx.recyclerview.widget.RecyclerView$t$a r4 = r2.c(r10)
                long r9 = r4.c
                long r9 = r2.e(r9, r11)
                r4.c = r9
                r9 = r0
                r10 = r1
                goto L_0x03c3
            L_0x03a0:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "Inconsistency detected. Invalid item position "
                java.lang.String r2 = "(offset:"
                java.lang.String r4 = ").state:"
                java.lang.StringBuilder r1 = i0.d.a.a.a.R0(r1, r3, r2, r9, r4)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r2 = r2.mState
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r1 = i0.d.a.a.a.S(r2, r1)
                r0.<init>(r1)
                throw r0
            L_0x03c1:
                r9 = r0
                r10 = r5
            L_0x03c3:
                if (r9 == 0) goto L_0x03f9
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.mState
                boolean r0 = r0.g
                if (r0 != 0) goto L_0x03f9
                r0 = 8192(0x2000, float:1.14794E-41)
                boolean r1 = r10.hasAnyOfTheFlags(r0)
                if (r1 == 0) goto L_0x03f9
                r10.setFlags(r8, r0)
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.mState
                boolean r0 = r0.j
                if (r0 == 0) goto L_0x03f9
                int r0 = androidx.recyclerview.widget.RecyclerView.k.buildAdapterChangeFlagsForAnimations(r10)
                r0 = r0 | 4096(0x1000, float:5.74E-42)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$k r2 = r1.mItemAnimator
                androidx.recyclerview.widget.RecyclerView$y r1 = r1.mState
                java.util.List r4 = r10.getUnmodifiedPayloads()
                androidx.recyclerview.widget.RecyclerView$k$c r0 = r2.recordPreLayoutInformation(r1, r10, r0, r4)
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                r1.recordAnimationInfoIfBouncedHiddenView(r10, r0)
            L_0x03f9:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r0 = r0.mState
                boolean r0 = r0.g
                if (r0 == 0) goto L_0x040a
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x040a
                r10.mPreLayoutPosition = r3
                goto L_0x041d
            L_0x040a:
                boolean r0 = r10.isBound()
                if (r0 == 0) goto L_0x041f
                boolean r0 = r10.needsUpdate()
                if (r0 != 0) goto L_0x041f
                boolean r0 = r10.isInvalid()
                if (r0 == 0) goto L_0x041d
                goto L_0x041f
            L_0x041d:
                r0 = r8
                goto L_0x0432
            L_0x041f:
                androidx.recyclerview.widget.RecyclerView r0 = androidx.recyclerview.widget.RecyclerView.this
                h0.v.a.a r0 = r0.mAdapterHelper
                int r2 = r0.f(r3, r8)
                r0 = r16
                r1 = r10
                r3 = r17
                r4 = r19
                boolean r0 = r0.l(r1, r2, r3, r4)
            L_0x0432:
                android.view.View r1 = r10.itemView
                android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
                if (r1 != 0) goto L_0x0448
                androidx.recyclerview.widget.RecyclerView r1 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r1.generateDefaultLayoutParams()
                androidx.recyclerview.widget.RecyclerView$o r1 = (androidx.recyclerview.widget.RecyclerView.o) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x0460
            L_0x0448:
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                boolean r2 = r2.checkLayoutParams(r1)
                if (r2 != 0) goto L_0x045e
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                android.view.ViewGroup$LayoutParams r1 = r2.generateLayoutParams((android.view.ViewGroup.LayoutParams) r1)
                androidx.recyclerview.widget.RecyclerView$o r1 = (androidx.recyclerview.widget.RecyclerView.o) r1
                android.view.View r2 = r10.itemView
                r2.setLayoutParams(r1)
                goto L_0x0460
            L_0x045e:
                androidx.recyclerview.widget.RecyclerView$o r1 = (androidx.recyclerview.widget.RecyclerView.o) r1
            L_0x0460:
                r1.a = r10
                if (r9 == 0) goto L_0x0467
                if (r0 == 0) goto L_0x0467
                goto L_0x0468
            L_0x0467:
                r7 = r8
            L_0x0468:
                r1.d = r7
                return r10
            L_0x046b:
                java.lang.IndexOutOfBoundsException r0 = new java.lang.IndexOutOfBoundsException
                java.lang.String r1 = "Invalid item position "
                java.lang.String r2 = "("
                java.lang.String r4 = "). Item count:"
                java.lang.StringBuilder r1 = i0.d.a.a.a.R0(r1, r3, r2, r3, r4)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                androidx.recyclerview.widget.RecyclerView$y r2 = r2.mState
                int r2 = r2.b()
                r1.append(r2)
                androidx.recyclerview.widget.RecyclerView r2 = androidx.recyclerview.widget.RecyclerView.this
                java.lang.String r1 = i0.d.a.a.a.S(r2, r1)
                r0.<init>(r1)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.u.m(int, boolean, long):androidx.recyclerview.widget.RecyclerView$b0");
        }

        public void n(b0 b0Var) {
            if (b0Var.mInChangeScrap) {
                this.b.remove(b0Var);
            } else {
                this.a.remove(b0Var);
            }
            b0Var.mScrapContainer = null;
            b0Var.mInChangeScrap = false;
            b0Var.clearReturnedFromScrapFlag();
        }

        public void o() {
            n nVar = RecyclerView.this.mLayout;
            this.f = this.e + (nVar != null ? nVar.mPrefetchMaxCountObserved : 0);
            for (int size = this.c.size() - 1; size >= 0 && this.c.size() > this.f; size--) {
                h(size);
            }
        }
    }

    public interface v {
        void a(b0 b0Var);
    }

    public class w extends h {
        public w() {
        }

        public void a() {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            RecyclerView recyclerView = RecyclerView.this;
            recyclerView.mState.f = true;
            recyclerView.processDataSetCompletelyChanged(true);
            if (!RecyclerView.this.mAdapterHelper.g()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void c(int i, int i2, Object obj) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            h0.v.a.a aVar = RecyclerView.this.mAdapterHelper;
            Objects.requireNonNull(aVar);
            boolean z = false;
            if (i2 >= 1) {
                aVar.b.add(aVar.h(4, i, i2, obj));
                aVar.f |= 4;
                if (aVar.b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                h();
            }
        }

        public void d(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            h0.v.a.a aVar = RecyclerView.this.mAdapterHelper;
            Objects.requireNonNull(aVar);
            boolean z = false;
            if (i2 >= 1) {
                aVar.b.add(aVar.h(1, i, i2, (Object) null));
                aVar.f |= 1;
                if (aVar.b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                h();
            }
        }

        public void e(int i, int i2, int i3) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            h0.v.a.a aVar = RecyclerView.this.mAdapterHelper;
            Objects.requireNonNull(aVar);
            boolean z = false;
            if (i != i2) {
                if (i3 == 1) {
                    aVar.b.add(aVar.h(8, i, i2, (Object) null));
                    aVar.f |= 8;
                    if (aVar.b.size() == 1) {
                        z = true;
                    }
                } else {
                    throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
                }
            }
            if (z) {
                h();
            }
        }

        public void f(int i, int i2) {
            RecyclerView.this.assertNotInLayoutOrScroll((String) null);
            h0.v.a.a aVar = RecyclerView.this.mAdapterHelper;
            Objects.requireNonNull(aVar);
            boolean z = false;
            if (i2 >= 1) {
                aVar.b.add(aVar.h(2, i, i2, (Object) null));
                aVar.f |= 2;
                if (aVar.b.size() == 1) {
                    z = true;
                }
            }
            if (z) {
                h();
            }
        }

        public void g() {
            Adapter adapter;
            RecyclerView recyclerView = RecyclerView.this;
            if (recyclerView.mPendingSavedState != null && (adapter = recyclerView.mAdapter) != null && adapter.canRestoreState()) {
                RecyclerView.this.requestLayout();
            }
        }

        public void h() {
            if (RecyclerView.POST_UPDATES_ON_ANIMATION) {
                RecyclerView recyclerView = RecyclerView.this;
                if (recyclerView.mHasFixedSize && recyclerView.mIsAttached) {
                    Runnable runnable = recyclerView.mUpdateChildViewsRunnable;
                    AtomicInteger atomicInteger = h0.i.i.q.a;
                    recyclerView.postOnAnimation(runnable);
                    return;
                }
            }
            RecyclerView recyclerView2 = RecyclerView.this;
            recyclerView2.mAdapterUpdateDuringMeasure = true;
            recyclerView2.requestLayout();
        }
    }

    public static abstract class x {
        public int a = -1;
        public RecyclerView b;
        public n c;
        public boolean d;
        public boolean e;
        public View f;
        public final a g = new a(0, 0);
        public boolean h;

        public static class a {
            public int a;
            public int b;
            public int c;
            public int d = -1;
            public Interpolator e;
            public boolean f = false;
            public int g = 0;

            public a(int i, int i2) {
                this.a = i;
                this.b = i2;
                this.c = Integer.MIN_VALUE;
                this.e = null;
            }

            public void a(RecyclerView recyclerView) {
                int i = this.d;
                if (i >= 0) {
                    this.d = -1;
                    recyclerView.jumpToPositionForSmoothScroller(i);
                    this.f = false;
                } else if (this.f) {
                    Interpolator interpolator = this.e;
                    if (interpolator == null || this.c >= 1) {
                        int i2 = this.c;
                        if (i2 >= 1) {
                            recyclerView.mViewFlinger.b(this.a, this.b, i2, interpolator);
                            int i3 = this.g + 1;
                            this.g = i3;
                            if (i3 > 10) {
                                Log.e(RecyclerView.TAG, "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
                            }
                            this.f = false;
                            return;
                        }
                        throw new IllegalStateException("Scroll duration must be a positive number");
                    }
                    throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
                } else {
                    this.g = 0;
                }
            }

            public void b(int i, int i2, int i3, Interpolator interpolator) {
                this.a = i;
                this.b = i2;
                this.c = i3;
                this.e = interpolator;
                this.f = true;
            }
        }

        public interface b {
            PointF computeScrollVectorForPosition(int i);
        }

        public PointF a(int i) {
            n nVar = this.c;
            if (nVar instanceof b) {
                return ((b) nVar).computeScrollVectorForPosition(i);
            }
            StringBuilder P0 = i0.d.a.a.a.P0("You should override computeScrollVectorForPosition when the LayoutManager does not implement ");
            P0.append(b.class.getCanonicalName());
            Log.w(RecyclerView.TAG, P0.toString());
            return null;
        }

        public void b(int i, int i2) {
            PointF a2;
            RecyclerView recyclerView = this.b;
            if (this.a == -1 || recyclerView == null) {
                d();
            }
            if (this.d && this.f == null && this.c != null && (a2 = a(this.a)) != null) {
                float f2 = a2.x;
                if (!(f2 == 0.0f && a2.y == 0.0f)) {
                    recyclerView.scrollStep((int) Math.signum(f2), (int) Math.signum(a2.y), (int[]) null);
                }
            }
            boolean z = false;
            this.d = false;
            View view = this.f;
            if (view != null) {
                if (this.b.getChildLayoutPosition(view) == this.a) {
                    c(this.f, recyclerView.mState, this.g);
                    this.g.a(recyclerView);
                    d();
                } else {
                    Log.e(RecyclerView.TAG, "Passed over target position while smooth scrolling.");
                    this.f = null;
                }
            }
            if (this.e) {
                y yVar = recyclerView.mState;
                a aVar = this.g;
                h0.v.a.p pVar = (h0.v.a.p) this;
                if (pVar.b.mLayout.getChildCount() == 0) {
                    pVar.d();
                } else {
                    int i3 = pVar.o;
                    int i4 = i3 - i;
                    if (i3 * i4 <= 0) {
                        i4 = 0;
                    }
                    pVar.o = i4;
                    int i5 = pVar.p;
                    int i6 = i5 - i2;
                    if (i5 * i6 <= 0) {
                        i6 = 0;
                    }
                    pVar.p = i6;
                    if (i4 == 0 && i6 == 0) {
                        PointF a3 = pVar.a(pVar.a);
                        if (a3 != null) {
                            float f3 = a3.x;
                            if (!(f3 == 0.0f && a3.y == 0.0f)) {
                                float f4 = a3.y;
                                float sqrt = (float) Math.sqrt((double) ((f4 * f4) + (f3 * f3)));
                                float f5 = a3.x / sqrt;
                                a3.x = f5;
                                float f6 = a3.y / sqrt;
                                a3.y = f6;
                                pVar.k = a3;
                                pVar.o = (int) (f5 * 10000.0f);
                                pVar.p = (int) (f6 * 10000.0f);
                                aVar.b((int) (((float) pVar.o) * 1.2f), (int) (((float) pVar.p) * 1.2f), (int) (((float) pVar.h(InstabugBaseConnectionManagerImpl.DEFAULT_READ_TIME_OUT)) * 1.2f), pVar.i);
                            }
                        }
                        aVar.d = pVar.a;
                        pVar.d();
                    }
                }
                a aVar2 = this.g;
                if (aVar2.d >= 0) {
                    z = true;
                }
                aVar2.a(recyclerView);
                if (z && this.e) {
                    this.d = true;
                    recyclerView.mViewFlinger.a();
                }
            }
        }

        public abstract void c(View view, y yVar, a aVar);

        public final void d() {
            if (this.e) {
                this.e = false;
                h0.v.a.p pVar = (h0.v.a.p) this;
                pVar.p = 0;
                pVar.o = 0;
                pVar.k = null;
                this.b.mState.a = -1;
                this.f = null;
                this.a = -1;
                this.d = false;
                this.c.onSmoothScrollerStopped(this);
                this.c = null;
                this.b = null;
            }
        }
    }

    public static class y {
        public int a = -1;
        public int b = 0;
        public int c = 0;
        public int d = 1;
        public int e = 0;
        public boolean f = false;
        public boolean g = false;
        public boolean h = false;
        public boolean i = false;
        public boolean j = false;
        public boolean k = false;
        public int l;
        public long m;
        public int n;

        public void a(int i2) {
            if ((this.d & i2) == 0) {
                StringBuilder P0 = i0.d.a.a.a.P0("Layout state should be one of ");
                P0.append(Integer.toBinaryString(i2));
                P0.append(" but it is ");
                P0.append(Integer.toBinaryString(this.d));
                throw new IllegalStateException(P0.toString());
            }
        }

        public int b() {
            if (this.g) {
                return this.b - this.c;
            }
            return this.e;
        }

        public String toString() {
            StringBuilder P0 = i0.d.a.a.a.P0("State{mTargetPosition=");
            P0.append(this.a);
            P0.append(", mData=");
            P0.append((Object) null);
            P0.append(", mItemCount=");
            P0.append(this.e);
            P0.append(", mIsMeasuring=");
            P0.append(this.i);
            P0.append(", mPreviousLayoutItemCount=");
            P0.append(this.b);
            P0.append(", mDeletedInvisibleItemCountSincePreviousLayout=");
            P0.append(this.c);
            P0.append(", mStructureChanged=");
            P0.append(this.f);
            P0.append(", mInPreLayout=");
            P0.append(this.g);
            P0.append(", mRunSimpleAnimations=");
            P0.append(this.j);
            P0.append(", mRunPredictiveAnimations=");
            return i0.d.a.a.a.C0(P0, this.k, '}');
        }
    }

    public static abstract class z {
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v2, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            int[] r1 = new int[r0]
            r2 = 16843830(0x1010436, float:2.369658E-38)
            r3 = 0
            r1[r3] = r2
            NESTED_SCROLLING_ATTRS = r1
            FORCE_INVALIDATE_DISPLAY_LIST = r3
            ALLOW_SIZE_IN_UNSPECIFIED_SPEC = r0
            POST_UPDATES_ON_ANIMATION = r0
            ALLOW_THREAD_GAP_WORK = r0
            FORCE_ABS_FOCUS_SEARCH_DIRECTION = r3
            IGNORE_DETACHED_FOCUSED_CHILD = r3
            r1 = 4
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r1[r3] = r2
            java.lang.Class<android.util.AttributeSet> r2 = android.util.AttributeSet.class
            r1[r0] = r2
            r0 = 2
            java.lang.Class r2 = java.lang.Integer.TYPE
            r1[r0] = r2
            r0 = 3
            r1[r0] = r2
            LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE = r1
            androidx.recyclerview.widget.RecyclerView$c r0 = new androidx.recyclerview.widget.RecyclerView$c
            r0.<init>()
            sQuinticInterpolator = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.<clinit>():void");
    }

    public RecyclerView(Context context) {
        this(context, (AttributeSet) null);
    }

    private void addAnimatingView(b0 b0Var) {
        View view = b0Var.itemView;
        boolean z2 = view.getParent() == this;
        this.mRecycler.n(getChildViewHolder(view));
        if (b0Var.isTmpDetached()) {
            this.mChildHelper.b(view, -1, view.getLayoutParams(), true);
        } else if (!z2) {
            this.mChildHelper.a(view, -1, true);
        } else {
            h0.v.a.e eVar = this.mChildHelper;
            int indexOfChild = RecyclerView.this.indexOfChild(view);
            if (indexOfChild >= 0) {
                eVar.b.h(indexOfChild);
                eVar.i(view);
                return;
            }
            throw new IllegalArgumentException("view is not a child, cannot hide " + view);
        }
    }

    private void animateChange(b0 b0Var, b0 b0Var2, k.c cVar, k.c cVar2, boolean z2, boolean z3) {
        b0Var.setIsRecyclable(false);
        if (z2) {
            addAnimatingView(b0Var);
        }
        if (b0Var != b0Var2) {
            if (z3) {
                addAnimatingView(b0Var2);
            }
            b0Var.mShadowedHolder = b0Var2;
            addAnimatingView(b0Var);
            this.mRecycler.n(b0Var);
            b0Var2.setIsRecyclable(false);
            b0Var2.mShadowingHolder = b0Var;
        }
        if (this.mItemAnimator.animateChange(b0Var, b0Var2, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    private void cancelScroll() {
        resetScroll();
        setScrollState(0);
    }

    public static void clearNestedRecyclerViewIfNotNested(b0 b0Var) {
        WeakReference<RecyclerView> weakReference = b0Var.mNestedRecyclerView;
        if (weakReference != null) {
            View view = (View) weakReference.get();
            while (view != null) {
                if (view != b0Var.itemView) {
                    ViewParent parent = view.getParent();
                    view = parent instanceof View ? (View) parent : null;
                } else {
                    return;
                }
            }
            b0Var.mNestedRecyclerView = null;
        }
    }

    private void createLayoutManager(Context context, String str, AttributeSet attributeSet, int i2, int i3) {
        ClassLoader classLoader;
        Constructor<? extends U> constructor;
        if (str != null) {
            String trim = str.trim();
            if (!trim.isEmpty()) {
                String fullClassName = getFullClassName(context, trim);
                try {
                    if (isInEditMode()) {
                        classLoader = getClass().getClassLoader();
                    } else {
                        classLoader = context.getClassLoader();
                    }
                    Class<? extends U> asSubclass = Class.forName(fullClassName, false, classLoader).asSubclass(n.class);
                    Object[] objArr = null;
                    try {
                        constructor = asSubclass.getConstructor(LAYOUT_MANAGER_CONSTRUCTOR_SIGNATURE);
                        objArr = new Object[]{context, attributeSet, Integer.valueOf(i2), Integer.valueOf(i3)};
                    } catch (NoSuchMethodException e2) {
                        constructor = asSubclass.getConstructor(new Class[0]);
                    }
                    constructor.setAccessible(true);
                    setLayoutManager((n) constructor.newInstance(objArr));
                } catch (NoSuchMethodException e3) {
                    e3.initCause(e2);
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Error creating LayoutManager " + fullClassName, e3);
                } catch (ClassNotFoundException e4) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Unable to find LayoutManager " + fullClassName, e4);
                } catch (InvocationTargetException e5) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e5);
                } catch (InstantiationException e6) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Could not instantiate the LayoutManager: " + fullClassName, e6);
                } catch (IllegalAccessException e7) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Cannot access non-public constructor " + fullClassName, e7);
                } catch (ClassCastException e8) {
                    throw new IllegalStateException(attributeSet.getPositionDescription() + ": Class is not a LayoutManager " + fullClassName, e8);
                }
            }
        }
    }

    private boolean didChildRangeChange(int i2, int i3) {
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        int[] iArr = this.mMinMaxLayoutPositions;
        return (iArr[0] == i2 && iArr[1] == i3) ? false : true;
    }

    private void dispatchContentChangedIfNecessary() {
        int i2 = this.mEatenAccessibilityChangeFlags;
        this.mEatenAccessibilityChangeFlags = 0;
        if (i2 != 0 && isAccessibilityEnabled()) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(2048);
            obtain.setContentChangeTypes(i2);
            sendAccessibilityEventUnchecked(obtain);
        }
    }

    private void dispatchLayoutStep1() {
        this.mState.a(1);
        fillRemainingScrollValues(this.mState);
        this.mState.i = false;
        startInterceptRequestLayout();
        c0 c0Var = this.mViewInfoStore;
        c0Var.a.clear();
        c0Var.b.c();
        onEnterLayoutOrScroll();
        processAdapterUpdatesAndSetAnimationFlags();
        saveFocusInfo();
        y yVar = this.mState;
        yVar.h = yVar.j && this.mItemsChanged;
        this.mItemsChanged = false;
        this.mItemsAddedOrRemoved = false;
        yVar.g = yVar.k;
        yVar.e = this.mAdapter.getItemCount();
        findMinMaxChildLayoutPositions(this.mMinMaxLayoutPositions);
        if (this.mState.j) {
            int e2 = this.mChildHelper.e();
            for (int i2 = 0; i2 < e2; i2++) {
                b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
                if (!childViewHolderInt.shouldIgnore() && (!childViewHolderInt.isInvalid() || this.mAdapter.hasStableIds())) {
                    this.mViewInfoStore.c(childViewHolderInt, this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt, k.buildAdapterChangeFlagsForAnimations(childViewHolderInt), childViewHolderInt.getUnmodifiedPayloads()));
                    if (this.mState.h && childViewHolderInt.isUpdated() && !childViewHolderInt.isRemoved() && !childViewHolderInt.shouldIgnore() && !childViewHolderInt.isInvalid()) {
                        this.mViewInfoStore.b.o(getChangedHolderKey(childViewHolderInt), childViewHolderInt);
                    }
                }
            }
        }
        if (this.mState.k) {
            saveOldPositions();
            y yVar2 = this.mState;
            boolean z2 = yVar2.f;
            yVar2.f = false;
            this.mLayout.onLayoutChildren(this.mRecycler, yVar2);
            this.mState.f = z2;
            for (int i3 = 0; i3 < this.mChildHelper.e(); i3++) {
                b0 childViewHolderInt2 = getChildViewHolderInt(this.mChildHelper.d(i3));
                if (!childViewHolderInt2.shouldIgnore()) {
                    c0.a orDefault = this.mViewInfoStore.a.getOrDefault(childViewHolderInt2, null);
                    if (!((orDefault == null || (orDefault.b & 4) == 0) ? false : true)) {
                        int buildAdapterChangeFlagsForAnimations = k.buildAdapterChangeFlagsForAnimations(childViewHolderInt2);
                        boolean hasAnyOfTheFlags = childViewHolderInt2.hasAnyOfTheFlags(8192);
                        if (!hasAnyOfTheFlags) {
                            buildAdapterChangeFlagsForAnimations |= 4096;
                        }
                        k.c recordPreLayoutInformation = this.mItemAnimator.recordPreLayoutInformation(this.mState, childViewHolderInt2, buildAdapterChangeFlagsForAnimations, childViewHolderInt2.getUnmodifiedPayloads());
                        if (hasAnyOfTheFlags) {
                            recordAnimationInfoIfBouncedHiddenView(childViewHolderInt2, recordPreLayoutInformation);
                        } else {
                            c0 c0Var2 = this.mViewInfoStore;
                            c0.a orDefault2 = c0Var2.a.getOrDefault(childViewHolderInt2, null);
                            if (orDefault2 == null) {
                                orDefault2 = c0.a.a();
                                c0Var2.a.put(childViewHolderInt2, orDefault2);
                            }
                            orDefault2.b |= 2;
                            orDefault2.c = recordPreLayoutInformation;
                        }
                    }
                }
            }
            clearOldPositions();
        } else {
            clearOldPositions();
        }
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        this.mState.d = 2;
    }

    private void dispatchLayoutStep2() {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        this.mState.a(6);
        this.mAdapterHelper.c();
        this.mState.e = this.mAdapter.getItemCount();
        this.mState.c = 0;
        if (this.mPendingSavedState != null && this.mAdapter.canRestoreState()) {
            Parcelable parcelable = this.mPendingSavedState.q;
            if (parcelable != null) {
                this.mLayout.onRestoreInstanceState(parcelable);
            }
            this.mPendingSavedState = null;
        }
        y yVar = this.mState;
        yVar.g = false;
        this.mLayout.onLayoutChildren(this.mRecycler, yVar);
        y yVar2 = this.mState;
        yVar2.f = false;
        yVar2.j = yVar2.j && this.mItemAnimator != null;
        yVar2.d = 4;
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
    }

    private void dispatchLayoutStep3() {
        this.mState.a(4);
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        y yVar = this.mState;
        yVar.d = 1;
        if (yVar.j) {
            for (int e2 = this.mChildHelper.e() - 1; e2 >= 0; e2--) {
                b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(e2));
                if (!childViewHolderInt.shouldIgnore()) {
                    long changedHolderKey = getChangedHolderKey(childViewHolderInt);
                    k.c recordPostLayoutInformation = this.mItemAnimator.recordPostLayoutInformation(this.mState, childViewHolderInt);
                    b0 j2 = this.mViewInfoStore.b.j(changedHolderKey, null);
                    if (j2 == null || j2.shouldIgnore()) {
                        this.mViewInfoStore.b(childViewHolderInt, recordPostLayoutInformation);
                    } else {
                        boolean d2 = this.mViewInfoStore.d(j2);
                        boolean d3 = this.mViewInfoStore.d(childViewHolderInt);
                        if (!d2 || j2 != childViewHolderInt) {
                            k.c e3 = this.mViewInfoStore.e(j2, 4);
                            this.mViewInfoStore.b(childViewHolderInt, recordPostLayoutInformation);
                            k.c e4 = this.mViewInfoStore.e(childViewHolderInt, 8);
                            if (e3 == null) {
                                handleMissingPreInfoForChangeError(changedHolderKey, childViewHolderInt, j2);
                            } else {
                                animateChange(j2, childViewHolderInt, e3, e4, d2, d3);
                            }
                        } else {
                            this.mViewInfoStore.b(childViewHolderInt, recordPostLayoutInformation);
                        }
                    }
                }
            }
            c0 c0Var = this.mViewInfoStore;
            c0.b bVar = this.mViewInfoProcessCallback;
            int i2 = c0Var.a.Z1;
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                b0 i3 = c0Var.a.i(i2);
                c0.a j3 = c0Var.a.j(i2);
                int i4 = j3.b;
                if ((i4 & 3) == 3) {
                    RecyclerView recyclerView = RecyclerView.this;
                    recyclerView.mLayout.removeAndRecycleView(i3.itemView, recyclerView.mRecycler);
                } else if ((i4 & 1) != 0) {
                    k.c cVar = j3.c;
                    if (cVar == null) {
                        RecyclerView recyclerView2 = RecyclerView.this;
                        recyclerView2.mLayout.removeAndRecycleView(i3.itemView, recyclerView2.mRecycler);
                    } else {
                        k.c cVar2 = j3.d;
                        d dVar = (d) bVar;
                        RecyclerView.this.mRecycler.n(i3);
                        RecyclerView.this.animateDisappearance(i3, cVar, cVar2);
                    }
                } else if ((i4 & 14) == 14) {
                    RecyclerView.this.animateAppearance(i3, j3.c, j3.d);
                } else if ((i4 & 12) == 12) {
                    k.c cVar3 = j3.c;
                    k.c cVar4 = j3.d;
                    d dVar2 = (d) bVar;
                    Objects.requireNonNull(dVar2);
                    i3.setIsRecyclable(false);
                    RecyclerView recyclerView3 = RecyclerView.this;
                    if (recyclerView3.mDataSetHasChangedAfterLayout) {
                        if (recyclerView3.mItemAnimator.animateChange(i3, i3, cVar3, cVar4)) {
                            RecyclerView.this.postAnimationRunner();
                        }
                    } else if (recyclerView3.mItemAnimator.animatePersistence(i3, cVar3, cVar4)) {
                        RecyclerView.this.postAnimationRunner();
                    }
                } else if ((i4 & 4) != 0) {
                    k.c cVar5 = j3.c;
                    d dVar3 = (d) bVar;
                    RecyclerView.this.mRecycler.n(i3);
                    RecyclerView.this.animateDisappearance(i3, cVar5, (k.c) null);
                } else if ((i4 & 8) != 0) {
                    RecyclerView.this.animateAppearance(i3, j3.c, j3.d);
                }
                c0.a.b(j3);
            }
        }
        this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        y yVar2 = this.mState;
        yVar2.b = yVar2.e;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        yVar2.j = false;
        yVar2.k = false;
        this.mLayout.mRequestedSimpleAnimations = false;
        ArrayList<b0> arrayList = this.mRecycler.b;
        if (arrayList != null) {
            arrayList.clear();
        }
        n nVar = this.mLayout;
        if (nVar.mPrefetchMaxObservedInInitialPrefetch) {
            nVar.mPrefetchMaxCountObserved = 0;
            nVar.mPrefetchMaxObservedInInitialPrefetch = false;
            this.mRecycler.o();
        }
        this.mLayout.onLayoutCompleted(this.mState);
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        c0 c0Var2 = this.mViewInfoStore;
        c0Var2.a.clear();
        c0Var2.b.c();
        int[] iArr = this.mMinMaxLayoutPositions;
        if (didChildRangeChange(iArr[0], iArr[1])) {
            dispatchOnScrolled(0, 0);
        }
        recoverFocusFromState();
        resetFocusInfo();
    }

    private boolean dispatchToOnItemTouchListeners(MotionEvent motionEvent) {
        r rVar = this.mInterceptingOnItemTouchListener;
        if (rVar != null) {
            rVar.a(this, motionEvent);
            int action = motionEvent.getAction();
            if (action == 3 || action == 1) {
                this.mInterceptingOnItemTouchListener = null;
            }
            return true;
        } else if (motionEvent.getAction() == 0) {
            return false;
        } else {
            return findInterceptingOnItemTouchListener(motionEvent);
        }
    }

    private boolean findInterceptingOnItemTouchListener(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        int size = this.mOnItemTouchListeners.size();
        int i2 = 0;
        while (i2 < size) {
            r rVar = this.mOnItemTouchListeners.get(i2);
            if (!rVar.c(this, motionEvent) || action == 3) {
                i2++;
            } else {
                this.mInterceptingOnItemTouchListener = rVar;
                return true;
            }
        }
        return false;
    }

    private void findMinMaxChildLayoutPositions(int[] iArr) {
        int e2 = this.mChildHelper.e();
        if (e2 == 0) {
            iArr[0] = -1;
            iArr[1] = -1;
            return;
        }
        int i2 = Integer.MAX_VALUE;
        int i3 = Integer.MIN_VALUE;
        for (int i4 = 0; i4 < e2; i4++) {
            b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i4));
            if (!childViewHolderInt.shouldIgnore()) {
                int layoutPosition = childViewHolderInt.getLayoutPosition();
                if (layoutPosition < i2) {
                    i2 = layoutPosition;
                }
                if (layoutPosition > i3) {
                    i3 = layoutPosition;
                }
            }
        }
        iArr[0] = i2;
        iArr[1] = i3;
    }

    public static RecyclerView findNestedRecyclerView(View view) {
        if (!(view instanceof ViewGroup)) {
            return null;
        }
        if (view instanceof RecyclerView) {
            return (RecyclerView) view;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            RecyclerView findNestedRecyclerView = findNestedRecyclerView(viewGroup.getChildAt(i2));
            if (findNestedRecyclerView != null) {
                return findNestedRecyclerView;
            }
        }
        return null;
    }

    private View findNextViewToFocus() {
        b0 findViewHolderForAdapterPosition;
        y yVar = this.mState;
        int i2 = yVar.l;
        if (i2 == -1) {
            i2 = 0;
        }
        int b2 = yVar.b();
        int i3 = i2;
        while (i3 < b2) {
            b0 findViewHolderForAdapterPosition2 = findViewHolderForAdapterPosition(i3);
            if (findViewHolderForAdapterPosition2 == null) {
                break;
            } else if (findViewHolderForAdapterPosition2.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition2.itemView;
            } else {
                i3++;
            }
        }
        int min = Math.min(b2, i2);
        while (true) {
            min--;
            if (min < 0 || (findViewHolderForAdapterPosition = findViewHolderForAdapterPosition(min)) == null) {
                return null;
            }
            if (findViewHolderForAdapterPosition.itemView.hasFocusable()) {
                return findViewHolderForAdapterPosition.itemView;
            }
        }
    }

    public static b0 getChildViewHolderInt(View view) {
        if (view == null) {
            return null;
        }
        return ((o) view.getLayoutParams()).a;
    }

    public static void getDecoratedBoundsWithMarginsInt(View view, Rect rect) {
        o oVar = (o) view.getLayoutParams();
        Rect rect2 = oVar.b;
        rect.set((view.getLeft() - rect2.left) - oVar.leftMargin, (view.getTop() - rect2.top) - oVar.topMargin, view.getRight() + rect2.right + oVar.rightMargin, view.getBottom() + rect2.bottom + oVar.bottomMargin);
    }

    private int getDeepestFocusedViewWithId(View view) {
        int id = view.getId();
        while (!view.isFocused() && (view instanceof ViewGroup) && view.hasFocus()) {
            view = ((ViewGroup) view).getFocusedChild();
            if (view.getId() != -1) {
                id = view.getId();
            }
        }
        return id;
    }

    private String getFullClassName(Context context, String str) {
        if (str.charAt(0) == '.') {
            return context.getPackageName() + str;
        } else if (str.contains(".")) {
            return str;
        } else {
            return RecyclerView.class.getPackage().getName() + '.' + str;
        }
    }

    private h0.i.i.i getScrollingChildHelper() {
        if (this.mScrollingChildHelper == null) {
            this.mScrollingChildHelper = new h0.i.i.i(this);
        }
        return this.mScrollingChildHelper;
    }

    private void handleMissingPreInfoForChangeError(long j2, b0 b0Var, b0 b0Var2) {
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (childViewHolderInt != b0Var && getChangedHolderKey(childViewHolderInt) == j2) {
                Adapter adapter = this.mAdapter;
                if (adapter == null || !adapter.hasStableIds()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Two different ViewHolders have the same change ID. This might happen due to inconsistent Adapter update events or if the LayoutManager lays out the same View multiple times.\n ViewHolder 1:");
                    sb.append(childViewHolderInt);
                    sb.append(" \n View Holder 2:");
                    sb.append(b0Var);
                    throw new IllegalStateException(i0.d.a.a.a.S(this, sb));
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Two different ViewHolders have the same stable ID. Stable IDs in your adapter MUST BE unique and SHOULD NOT change.\n ViewHolder 1:");
                sb2.append(childViewHolderInt);
                sb2.append(" \n View Holder 2:");
                sb2.append(b0Var);
                throw new IllegalStateException(i0.d.a.a.a.S(this, sb2));
            }
        }
        Log.e(TAG, "Problem while matching changed view holders with the newones. The pre-layout information for the change holder " + b0Var2 + " cannot be found but it is necessary for " + b0Var + exceptionLabel());
    }

    private boolean hasUpdatedView() {
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.d(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.isUpdated()) {
                return true;
            }
        }
        return false;
    }

    @SuppressLint({"InlinedApi"})
    private void initAutofill() {
        AtomicInteger atomicInteger = h0.i.i.q.a;
        int i2 = Build.VERSION.SDK_INT;
        if ((i2 >= 26 ? getImportantForAutofill() : 0) == 0 && i2 >= 26) {
            setImportantForAutofill(8);
        }
    }

    private void initChildrenHelper() {
        this.mChildHelper = new h0.v.a.e(new e());
    }

    private boolean isPreferredNextFocus(View view, View view2, int i2) {
        int i3;
        if (view2 == null || view2 == this || view2 == view || findContainingItemView(view2) == null) {
            return false;
        }
        if (view == null || findContainingItemView(view) == null) {
            return true;
        }
        this.mTempRect.set(0, 0, view.getWidth(), view.getHeight());
        this.mTempRect2.set(0, 0, view2.getWidth(), view2.getHeight());
        offsetDescendantRectToMyCoords(view, this.mTempRect);
        offsetDescendantRectToMyCoords(view2, this.mTempRect2);
        char c2 = 65535;
        int i4 = this.mLayout.getLayoutDirection() == 1 ? -1 : 1;
        Rect rect = this.mTempRect;
        int i5 = rect.left;
        Rect rect2 = this.mTempRect2;
        int i6 = rect2.left;
        if ((i5 < i6 || rect.right <= i6) && rect.right < rect2.right) {
            i3 = 1;
        } else {
            int i7 = rect.right;
            int i8 = rect2.right;
            i3 = ((i7 > i8 || i5 >= i8) && i5 > i6) ? -1 : 0;
        }
        int i9 = rect.top;
        int i10 = rect2.top;
        if ((i9 < i10 || rect.bottom <= i10) && rect.bottom < rect2.bottom) {
            c2 = 1;
        } else {
            int i11 = rect.bottom;
            int i12 = rect2.bottom;
            if ((i11 <= i12 && i9 < i12) || i9 <= i10) {
                c2 = 0;
            }
        }
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 17) {
                    if (i2 != 33) {
                        if (i2 != 66) {
                            if (i2 != 130) {
                                StringBuilder sb = new StringBuilder();
                                sb.append("Invalid direction: ");
                                sb.append(i2);
                                throw new IllegalArgumentException(i0.d.a.a.a.S(this, sb));
                            } else if (c2 > 0) {
                                return true;
                            } else {
                                return false;
                            }
                        } else if (i3 > 0) {
                            return true;
                        } else {
                            return false;
                        }
                    } else if (c2 < 0) {
                        return true;
                    } else {
                        return false;
                    }
                } else if (i3 < 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (c2 > 0 || (c2 == 0 && i3 * i4 > 0)) {
                return true;
            } else {
                return false;
            }
        } else if (c2 < 0 || (c2 == 0 && i3 * i4 < 0)) {
            return true;
        } else {
            return false;
        }
    }

    private void nestedScrollByInternal(int i2, int i3, MotionEvent motionEvent, int i4) {
        n nVar = this.mLayout;
        if (nVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int[] iArr = this.mReusableIntPair;
            int i5 = 0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean canScrollHorizontally = nVar.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            int i6 = canScrollHorizontally ? 1 : 0;
            if (canScrollVertically) {
                i6 |= 2;
            }
            startNestedScroll(i6, i4);
            if (dispatchNestedPreScroll(canScrollHorizontally ? i2 : 0, canScrollVertically ? i3 : 0, this.mReusableIntPair, this.mScrollOffset, i4)) {
                int[] iArr2 = this.mReusableIntPair;
                i2 -= iArr2[0];
                i3 -= iArr2[1];
            }
            int i7 = canScrollHorizontally ? i2 : 0;
            if (canScrollVertically) {
                i5 = i3;
            }
            scrollByInternal(i7, i5, motionEvent, i4);
            h0.v.a.j jVar = this.mGapWorker;
            if (!(jVar == null || (i2 == 0 && i3 == 0))) {
                jVar.a(this, i2, i3);
            }
            stopNestedScroll(i4);
        }
    }

    private void onPointerUp(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.mScrollPointerId) {
            int i2 = actionIndex == 0 ? 1 : 0;
            this.mScrollPointerId = motionEvent.getPointerId(i2);
            int x2 = (int) (motionEvent.getX(i2) + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY(i2) + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
        }
    }

    private boolean predictiveItemAnimationsEnabled() {
        return this.mItemAnimator != null && this.mLayout.supportsPredictiveItemAnimations();
    }

    private void processAdapterUpdatesAndSetAnimationFlags() {
        boolean z2;
        boolean z3 = false;
        if (this.mDataSetHasChangedAfterLayout) {
            h0.v.a.a aVar = this.mAdapterHelper;
            aVar.l(aVar.b);
            aVar.l(aVar.c);
            aVar.f = 0;
            if (this.mDispatchItemsChangedEvent) {
                this.mLayout.onItemsChanged(this);
            }
        }
        if (predictiveItemAnimationsEnabled()) {
            this.mAdapterHelper.j();
        } else {
            this.mAdapterHelper.c();
        }
        boolean z4 = this.mItemsAddedOrRemoved || this.mItemsChanged;
        this.mState.j = this.mFirstLayoutComplete && this.mItemAnimator != null && ((z2 = this.mDataSetHasChangedAfterLayout) || z4 || this.mLayout.mRequestedSimpleAnimations) && (!z2 || this.mAdapter.hasStableIds());
        y yVar = this.mState;
        if (yVar.j && z4 && !this.mDataSetHasChangedAfterLayout && predictiveItemAnimationsEnabled()) {
            z3 = true;
        }
        yVar.k = z3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x0040  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void pullGlows(float r7, float r8, float r9, float r10) {
        /*
            r6 = this;
            r0 = 0
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            r3 = 1
            if (r1 >= 0) goto L_0x0021
            r6.ensureLeftGlow()
            android.widget.EdgeEffect r1 = r6.mLeftGlow
            float r4 = -r8
            int r5 = r6.getWidth()
            float r5 = (float) r5
            float r4 = r4 / r5
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            float r9 = r2 - r9
            r1.onPull(r4, r9)
        L_0x001f:
            r9 = r3
            goto L_0x003c
        L_0x0021:
            int r1 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x003b
            r6.ensureRightGlow()
            android.widget.EdgeEffect r1 = r6.mRightGlow
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r4 = r8 / r4
            int r5 = r6.getHeight()
            float r5 = (float) r5
            float r9 = r9 / r5
            r1.onPull(r4, r9)
            goto L_0x001f
        L_0x003b:
            r9 = 0
        L_0x003c:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 >= 0) goto L_0x0056
            r6.ensureTopGlow()
            android.widget.EdgeEffect r9 = r6.mTopGlow
            float r1 = -r10
            int r2 = r6.getHeight()
            float r2 = (float) r2
            float r1 = r1 / r2
            int r2 = r6.getWidth()
            float r2 = (float) r2
            float r7 = r7 / r2
            r9.onPull(r1, r7)
            goto L_0x0072
        L_0x0056:
            int r1 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r1 <= 0) goto L_0x0071
            r6.ensureBottomGlow()
            android.widget.EdgeEffect r9 = r6.mBottomGlow
            int r1 = r6.getHeight()
            float r1 = (float) r1
            float r1 = r10 / r1
            int r4 = r6.getWidth()
            float r4 = (float) r4
            float r7 = r7 / r4
            float r2 = r2 - r7
            r9.onPull(r1, r2)
            goto L_0x0072
        L_0x0071:
            r3 = r9
        L_0x0072:
            if (r3 != 0) goto L_0x007c
            int r7 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r7 != 0) goto L_0x007c
            int r7 = (r10 > r0 ? 1 : (r10 == r0 ? 0 : -1))
            if (r7 == 0) goto L_0x0081
        L_0x007c:
            java.util.concurrent.atomic.AtomicInteger r7 = h0.i.i.q.a
            r6.postInvalidateOnAnimation()
        L_0x0081:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.pullGlows(float, float, float, float):void");
    }

    private void recoverFocusFromState() {
        View findViewById;
        if (this.mPreserveFocusAfterLayout && this.mAdapter != null && hasFocus() && getDescendantFocusability() != 393216) {
            if (getDescendantFocusability() != 131072 || !isFocused()) {
                if (!isFocused()) {
                    View focusedChild = getFocusedChild();
                    if (!IGNORE_DETACHED_FOCUSED_CHILD || (focusedChild.getParent() != null && focusedChild.hasFocus())) {
                        if (!this.mChildHelper.k(focusedChild)) {
                            return;
                        }
                    } else if (this.mChildHelper.e() == 0) {
                        requestFocus();
                        return;
                    }
                }
                View view = null;
                b0 findViewHolderForItemId = (this.mState.m == -1 || !this.mAdapter.hasStableIds()) ? null : findViewHolderForItemId(this.mState.m);
                if (findViewHolderForItemId != null && !this.mChildHelper.k(findViewHolderForItemId.itemView) && findViewHolderForItemId.itemView.hasFocusable()) {
                    view = findViewHolderForItemId.itemView;
                } else if (this.mChildHelper.e() > 0) {
                    view = findNextViewToFocus();
                }
                if (view != null) {
                    int i2 = this.mState.n;
                    if (!(((long) i2) == -1 || (findViewById = view.findViewById(i2)) == null || !findViewById.isFocusable())) {
                        view = findViewById;
                    }
                    view.requestFocus();
                }
            }
        }
    }

    private void releaseGlows() {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect != null) {
            edgeEffect.onRelease();
            z2 = this.mLeftGlow.isFinished();
        } else {
            z2 = false;
        }
        EdgeEffect edgeEffect2 = this.mTopGlow;
        if (edgeEffect2 != null) {
            edgeEffect2.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mRightGlow;
        if (edgeEffect3 != null) {
            edgeEffect3.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null) {
            edgeEffect4.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            AtomicInteger atomicInteger = h0.i.i.q.a;
            postInvalidateOnAnimation();
        }
    }

    private void requestChildOnScreen(View view, View view2) {
        View view3 = view2 != null ? view2 : view;
        this.mTempRect.set(0, 0, view3.getWidth(), view3.getHeight());
        ViewGroup.LayoutParams layoutParams = view3.getLayoutParams();
        if (layoutParams instanceof o) {
            o oVar = (o) layoutParams;
            if (!oVar.c) {
                Rect rect = oVar.b;
                Rect rect2 = this.mTempRect;
                rect2.left -= rect.left;
                rect2.right += rect.right;
                rect2.top -= rect.top;
                rect2.bottom += rect.bottom;
            }
        }
        if (view2 != null) {
            offsetDescendantRectToMyCoords(view2, this.mTempRect);
            offsetRectIntoDescendantCoords(view, this.mTempRect);
        }
        this.mLayout.requestChildRectangleOnScreen(this, view, this.mTempRect, !this.mFirstLayoutComplete, view2 == null);
    }

    private void resetFocusInfo() {
        y yVar = this.mState;
        yVar.m = -1;
        yVar.l = -1;
        yVar.n = -1;
    }

    private void resetScroll() {
        VelocityTracker velocityTracker = this.mVelocityTracker;
        if (velocityTracker != null) {
            velocityTracker.clear();
        }
        stopNestedScroll(0);
        releaseGlows();
    }

    private void saveFocusInfo() {
        int i2;
        b0 b0Var = null;
        View focusedChild = (!this.mPreserveFocusAfterLayout || !hasFocus() || this.mAdapter == null) ? null : getFocusedChild();
        if (focusedChild != null) {
            b0Var = findContainingViewHolder(focusedChild);
        }
        if (b0Var == null) {
            resetFocusInfo();
            return;
        }
        this.mState.m = this.mAdapter.hasStableIds() ? b0Var.getItemId() : -1;
        y yVar = this.mState;
        if (this.mDataSetHasChangedAfterLayout) {
            i2 = -1;
        } else if (b0Var.isRemoved()) {
            i2 = b0Var.mOldPosition;
        } else {
            i2 = b0Var.getAbsoluteAdapterPosition();
        }
        yVar.l = i2;
        this.mState.n = getDeepestFocusedViewWithId(b0Var.itemView);
    }

    private void setAdapterInternal(Adapter adapter, boolean z2, boolean z3) {
        Adapter adapter2 = this.mAdapter;
        if (adapter2 != null) {
            adapter2.unregisterAdapterDataObserver(this.mObserver);
            this.mAdapter.onDetachedFromRecyclerView(this);
        }
        if (!z2 || z3) {
            removeAndRecycleViews();
        }
        h0.v.a.a aVar = this.mAdapterHelper;
        aVar.l(aVar.b);
        aVar.l(aVar.c);
        aVar.f = 0;
        Adapter adapter3 = this.mAdapter;
        this.mAdapter = adapter;
        if (adapter != null) {
            adapter.registerAdapterDataObserver(this.mObserver);
            adapter.onAttachedToRecyclerView(this);
        }
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.onAdapterChanged(adapter3, this.mAdapter);
        }
        u uVar = this.mRecycler;
        Adapter adapter4 = this.mAdapter;
        uVar.b();
        t d2 = uVar.d();
        Objects.requireNonNull(d2);
        if (adapter3 != null) {
            d2.b--;
        }
        if (!z2 && d2.b == 0) {
            d2.a();
        }
        if (adapter4 != null) {
            d2.b++;
        }
        this.mState.f = true;
    }

    private void stopScrollersInternal() {
        this.mViewFlinger.c();
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.stopSmoothScroller();
        }
    }

    public void absorbGlows(int i2, int i3) {
        if (i2 < 0) {
            ensureLeftGlow();
            if (this.mLeftGlow.isFinished()) {
                this.mLeftGlow.onAbsorb(-i2);
            }
        } else if (i2 > 0) {
            ensureRightGlow();
            if (this.mRightGlow.isFinished()) {
                this.mRightGlow.onAbsorb(i2);
            }
        }
        if (i3 < 0) {
            ensureTopGlow();
            if (this.mTopGlow.isFinished()) {
                this.mTopGlow.onAbsorb(-i3);
            }
        } else if (i3 > 0) {
            ensureBottomGlow();
            if (this.mBottomGlow.isFinished()) {
                this.mBottomGlow.onAbsorb(i3);
            }
        }
        if (i2 != 0 || i3 != 0) {
            AtomicInteger atomicInteger = h0.i.i.q.a;
            postInvalidateOnAnimation();
        }
    }

    public void addFocusables(ArrayList<View> arrayList, int i2, int i3) {
        n nVar = this.mLayout;
        if (nVar == null || !nVar.onAddFocusables(this, arrayList, i2, i3)) {
            super.addFocusables(arrayList, i2, i3);
        }
    }

    public void addItemDecoration(m mVar, int i2) {
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.assertNotInLayoutOrScroll("Cannot add item decoration during a scroll  or layout");
        }
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(false);
        }
        if (i2 < 0) {
            this.mItemDecorations.add(mVar);
        } else {
            this.mItemDecorations.add(i2, mVar);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void addOnChildAttachStateChangeListener(p pVar) {
        if (this.mOnChildAttachStateListeners == null) {
            this.mOnChildAttachStateListeners = new ArrayList();
        }
        this.mOnChildAttachStateListeners.add(pVar);
    }

    public void addOnItemTouchListener(r rVar) {
        this.mOnItemTouchListeners.add(rVar);
    }

    public void addOnScrollListener(s sVar) {
        if (this.mScrollListeners == null) {
            this.mScrollListeners = new ArrayList();
        }
        this.mScrollListeners.add(sVar);
    }

    public void addRecyclerListener(v vVar) {
        g0.a.b.b.a.j(vVar != null, "'listener' arg cannot be null.");
        this.mRecyclerListeners.add(vVar);
    }

    public void animateAppearance(b0 b0Var, k.c cVar, k.c cVar2) {
        b0Var.setIsRecyclable(false);
        if (this.mItemAnimator.animateAppearance(b0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void animateDisappearance(b0 b0Var, k.c cVar, k.c cVar2) {
        addAnimatingView(b0Var);
        b0Var.setIsRecyclable(false);
        if (this.mItemAnimator.animateDisappearance(b0Var, cVar, cVar2)) {
            postAnimationRunner();
        }
    }

    public void assertInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            return;
        }
        if (str == null) {
            throw new IllegalStateException(i0.d.a.a.a.S(this, i0.d.a.a.a.P0("Cannot call this method unless RecyclerView is computing a layout or scrolling")));
        }
        throw new IllegalStateException(i0.d.a.a.a.S(this, i0.d.a.a.a.P0(str)));
    }

    public void assertNotInLayoutOrScroll(String str) {
        if (isComputingLayout()) {
            if (str == null) {
                throw new IllegalStateException(i0.d.a.a.a.S(this, i0.d.a.a.a.P0("Cannot call this method while RecyclerView is computing a layout or scrolling")));
            }
            throw new IllegalStateException(str);
        } else if (this.mDispatchScrollCounter > 0) {
            Log.w(TAG, "Cannot call this method in a scroll callback. Scroll callbacks mightbe run during a measure & layout pass where you cannot change theRecyclerView data. Any method call that might change the structureof the RecyclerView or the adapter contents should be postponed tothe next frame.", new IllegalStateException(i0.d.a.a.a.S(this, i0.d.a.a.a.P0(""))));
        }
    }

    public boolean canReuseUpdatedViewHolder(b0 b0Var) {
        k kVar = this.mItemAnimator;
        return kVar == null || kVar.canReuseUpdatedViewHolder(b0Var, b0Var.getUnmodifiedPayloads());
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof o) && this.mLayout.checkLayoutParams((o) layoutParams);
    }

    public void clearOldPositions() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.clearOldPosition();
            }
        }
        u uVar = this.mRecycler;
        int size = uVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            uVar.c.get(i3).clearOldPosition();
        }
        int size2 = uVar.a.size();
        for (int i4 = 0; i4 < size2; i4++) {
            uVar.a.get(i4).clearOldPosition();
        }
        ArrayList<b0> arrayList = uVar.b;
        if (arrayList != null) {
            int size3 = arrayList.size();
            for (int i5 = 0; i5 < size3; i5++) {
                uVar.b.get(i5).clearOldPosition();
            }
        }
    }

    public void clearOnChildAttachStateChangeListeners() {
        List<p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.clear();
        }
    }

    public void clearOnScrollListeners() {
        List<s> list = this.mScrollListeners;
        if (list != null) {
            list.clear();
        }
    }

    public int computeHorizontalScrollExtent() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollExtent(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollOffset() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollOffset(this.mState);
        }
        return 0;
    }

    public int computeHorizontalScrollRange() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollHorizontally()) {
            return this.mLayout.computeHorizontalScrollRange(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollExtent() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollExtent(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollOffset() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollOffset(this.mState);
        }
        return 0;
    }

    public int computeVerticalScrollRange() {
        n nVar = this.mLayout;
        if (nVar != null && nVar.canScrollVertically()) {
            return this.mLayout.computeVerticalScrollRange(this.mState);
        }
        return 0;
    }

    public void considerReleasingGlowsOnScroll(int i2, int i3) {
        boolean z2;
        EdgeEffect edgeEffect = this.mLeftGlow;
        if (edgeEffect == null || edgeEffect.isFinished() || i2 <= 0) {
            z2 = false;
        } else {
            this.mLeftGlow.onRelease();
            z2 = this.mLeftGlow.isFinished();
        }
        EdgeEffect edgeEffect2 = this.mRightGlow;
        if (edgeEffect2 != null && !edgeEffect2.isFinished() && i2 < 0) {
            this.mRightGlow.onRelease();
            z2 |= this.mRightGlow.isFinished();
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished() && i3 > 0) {
            this.mTopGlow.onRelease();
            z2 |= this.mTopGlow.isFinished();
        }
        EdgeEffect edgeEffect4 = this.mBottomGlow;
        if (edgeEffect4 != null && !edgeEffect4.isFinished() && i3 < 0) {
            this.mBottomGlow.onRelease();
            z2 |= this.mBottomGlow.isFinished();
        }
        if (z2) {
            AtomicInteger atomicInteger = h0.i.i.q.a;
            postInvalidateOnAnimation();
        }
    }

    public void consumePendingUpdateOperations() {
        if (!this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout) {
            int i2 = h0.i.e.f.a;
            Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
            dispatchLayout();
            Trace.endSection();
        } else if (this.mAdapterHelper.g()) {
            h0.v.a.a aVar = this.mAdapterHelper;
            int i3 = aVar.f;
            boolean z2 = false;
            if ((i3 & 4) != 0) {
                if ((i3 & 11) != 0) {
                    z2 = true;
                }
                if (!z2) {
                    int i4 = h0.i.e.f.a;
                    Trace.beginSection(TRACE_HANDLE_ADAPTER_UPDATES_TAG);
                    startInterceptRequestLayout();
                    onEnterLayoutOrScroll();
                    this.mAdapterHelper.j();
                    if (!this.mLayoutWasDefered) {
                        if (hasUpdatedView()) {
                            dispatchLayout();
                        } else {
                            this.mAdapterHelper.b();
                        }
                    }
                    stopInterceptRequestLayout(true);
                    onExitLayoutOrScroll();
                    Trace.endSection();
                    return;
                }
            }
            if (aVar.g()) {
                int i5 = h0.i.e.f.a;
                Trace.beginSection(TRACE_ON_DATA_SET_CHANGE_LAYOUT_TAG);
                dispatchLayout();
                Trace.endSection();
            }
        }
    }

    public void defaultOnMeasure(int i2, int i3) {
        int paddingRight = getPaddingRight() + getPaddingLeft();
        AtomicInteger atomicInteger = h0.i.i.q.a;
        setMeasuredDimension(n.chooseSize(i2, paddingRight, getMinimumWidth()), n.chooseSize(i3, getPaddingBottom() + getPaddingTop(), getMinimumHeight()));
    }

    public void dispatchChildAttached(View view) {
        b0 childViewHolderInt = getChildViewHolderInt(view);
        onChildAttachedToWindow(view);
        Adapter adapter = this.mAdapter;
        if (!(adapter == null || childViewHolderInt == null)) {
            adapter.onViewAttachedToWindow(childViewHolderInt);
        }
        List<p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).d(view);
            }
        }
    }

    public void dispatchChildDetached(View view) {
        b0 childViewHolderInt = getChildViewHolderInt(view);
        onChildDetachedFromWindow(view);
        Adapter adapter = this.mAdapter;
        if (!(adapter == null || childViewHolderInt == null)) {
            adapter.onViewDetachedFromWindow(childViewHolderInt);
        }
        List<p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mOnChildAttachStateListeners.get(size).b(view);
            }
        }
    }

    public void dispatchLayout() {
        if (this.mAdapter == null) {
            Log.w(TAG, "No adapter attached; skipping layout");
        } else if (this.mLayout == null) {
            Log.e(TAG, "No layout manager attached; skipping layout");
        } else {
            boolean z2 = false;
            this.mState.i = false;
            boolean z3 = this.mLastAutoMeasureSkippedDueToExact && !(this.mLastAutoMeasureNonExactMeasuredWidth == getWidth() && this.mLastAutoMeasureNonExactMeasuredHeight == getHeight());
            this.mLastAutoMeasureNonExactMeasuredWidth = 0;
            this.mLastAutoMeasureNonExactMeasuredHeight = 0;
            this.mLastAutoMeasureSkippedDueToExact = false;
            if (this.mState.d == 1) {
                dispatchLayoutStep1();
                this.mLayout.setExactMeasureSpecsFrom(this);
                dispatchLayoutStep2();
            } else {
                h0.v.a.a aVar = this.mAdapterHelper;
                if (!aVar.c.isEmpty() && !aVar.b.isEmpty()) {
                    z2 = true;
                }
                if (z2 || z3 || this.mLayout.getWidth() != getWidth() || this.mLayout.getHeight() != getHeight()) {
                    this.mLayout.setExactMeasureSpecsFrom(this);
                    dispatchLayoutStep2();
                } else {
                    this.mLayout.setExactMeasureSpecsFrom(this);
                }
            }
            dispatchLayoutStep3();
        }
    }

    public boolean dispatchNestedFling(float f2, float f3, boolean z2) {
        return getScrollingChildHelper().a(f2, f3, z2);
    }

    public boolean dispatchNestedPreFling(float f2, float f3) {
        return getScrollingChildHelper().b(f2, f3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, 0);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr) {
        return getScrollingChildHelper().d(i2, i3, i4, i5, iArr);
    }

    public void dispatchOnScrollStateChanged(int i2) {
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.onScrollStateChanged(i2);
        }
        onScrollStateChanged(i2);
        s sVar = this.mScrollListener;
        if (sVar != null) {
            sVar.a(this, i2);
        }
        List<s> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).a(this, i2);
            }
        }
    }

    public void dispatchOnScrolled(int i2, int i3) {
        this.mDispatchScrollCounter++;
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        onScrollChanged(scrollX, scrollY, scrollX - i2, scrollY - i3);
        onScrolled(i2, i3);
        s sVar = this.mScrollListener;
        if (sVar != null) {
            sVar.c(this, i2, i3);
        }
        List<s> list = this.mScrollListeners;
        if (list != null) {
            for (int size = list.size() - 1; size >= 0; size--) {
                this.mScrollListeners.get(size).c(this, i2, i3);
            }
        }
        this.mDispatchScrollCounter--;
    }

    public void dispatchPendingImportantForAccessibilityChanges() {
        int i2;
        for (int size = this.mPendingAccessibilityImportanceChange.size() - 1; size >= 0; size--) {
            b0 b0Var = this.mPendingAccessibilityImportanceChange.get(size);
            if (b0Var.itemView.getParent() == this && !b0Var.shouldIgnore() && (i2 = b0Var.mPendingAccessibilityState) != -1) {
                View view = b0Var.itemView;
                AtomicInteger atomicInteger = h0.i.i.q.a;
                view.setImportantForAccessibility(i2);
                b0Var.mPendingAccessibilityState = -1;
            }
        }
        this.mPendingAccessibilityImportanceChange.clear();
    }

    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        onPopulateAccessibilityEvent(accessibilityEvent);
        return true;
    }

    public void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchThawSelfOnly(sparseArray);
    }

    public void dispatchSaveInstanceState(SparseArray<Parcelable> sparseArray) {
        dispatchFreezeSelfOnly(sparseArray);
    }

    public void draw(Canvas canvas) {
        boolean z2;
        super.draw(canvas);
        int size = this.mItemDecorations.size();
        boolean z3 = false;
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).h(canvas, this, this.mState);
        }
        EdgeEffect edgeEffect = this.mLeftGlow;
        boolean z4 = true;
        if (edgeEffect == null || edgeEffect.isFinished()) {
            z2 = false;
        } else {
            int save = canvas.save();
            int paddingBottom = this.mClipToPadding ? getPaddingBottom() : 0;
            canvas.rotate(270.0f);
            canvas.translate((float) ((-getHeight()) + paddingBottom), 0.0f);
            EdgeEffect edgeEffect2 = this.mLeftGlow;
            z2 = edgeEffect2 != null && edgeEffect2.draw(canvas);
            canvas.restoreToCount(save);
        }
        EdgeEffect edgeEffect3 = this.mTopGlow;
        if (edgeEffect3 != null && !edgeEffect3.isFinished()) {
            int save2 = canvas.save();
            if (this.mClipToPadding) {
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
            }
            EdgeEffect edgeEffect4 = this.mTopGlow;
            z2 |= edgeEffect4 != null && edgeEffect4.draw(canvas);
            canvas.restoreToCount(save2);
        }
        EdgeEffect edgeEffect5 = this.mRightGlow;
        if (edgeEffect5 != null && !edgeEffect5.isFinished()) {
            int save3 = canvas.save();
            int width = getWidth();
            int paddingTop = this.mClipToPadding ? getPaddingTop() : 0;
            canvas.rotate(90.0f);
            canvas.translate((float) paddingTop, (float) (-width));
            EdgeEffect edgeEffect6 = this.mRightGlow;
            z2 |= edgeEffect6 != null && edgeEffect6.draw(canvas);
            canvas.restoreToCount(save3);
        }
        EdgeEffect edgeEffect7 = this.mBottomGlow;
        if (edgeEffect7 != null && !edgeEffect7.isFinished()) {
            int save4 = canvas.save();
            canvas.rotate(180.0f);
            if (this.mClipToPadding) {
                canvas.translate((float) (getPaddingRight() + (-getWidth())), (float) (getPaddingBottom() + (-getHeight())));
            } else {
                canvas.translate((float) (-getWidth()), (float) (-getHeight()));
            }
            EdgeEffect edgeEffect8 = this.mBottomGlow;
            if (edgeEffect8 != null && edgeEffect8.draw(canvas)) {
                z3 = true;
            }
            z2 |= z3;
            canvas.restoreToCount(save4);
        }
        if (z2 || this.mItemAnimator == null || this.mItemDecorations.size() <= 0 || !this.mItemAnimator.isRunning()) {
            z4 = z2;
        }
        if (z4) {
            AtomicInteger atomicInteger = h0.i.i.q.a;
            postInvalidateOnAnimation();
        }
    }

    public boolean drawChild(Canvas canvas, View view, long j2) {
        return super.drawChild(canvas, view, j2);
    }

    public void ensureBottomGlow() {
        if (this.mBottomGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this);
            this.mBottomGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public void ensureLeftGlow() {
        if (this.mLeftGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this);
            this.mLeftGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureRightGlow() {
        if (this.mRightGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this);
            this.mRightGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom(), (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight());
            } else {
                a2.setSize(getMeasuredHeight(), getMeasuredWidth());
            }
        }
    }

    public void ensureTopGlow() {
        if (this.mTopGlow == null) {
            EdgeEffect a2 = this.mEdgeEffectFactory.a(this);
            this.mTopGlow = a2;
            if (this.mClipToPadding) {
                a2.setSize((getMeasuredWidth() - getPaddingLeft()) - getPaddingRight(), (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom());
            } else {
                a2.setSize(getMeasuredWidth(), getMeasuredHeight());
            }
        }
    }

    public String exceptionLabel() {
        StringBuilder P0 = i0.d.a.a.a.P0(" ");
        P0.append(super.toString());
        P0.append(", adapter:");
        P0.append(this.mAdapter);
        P0.append(", layout:");
        P0.append(this.mLayout);
        P0.append(", context:");
        P0.append(getContext());
        return P0.toString();
    }

    public final void fillRemainingScrollValues(y yVar) {
        if (getScrollState() == 2) {
            OverScroller overScroller = this.mViewFlinger.q;
            overScroller.getFinalX();
            overScroller.getCurrX();
            Objects.requireNonNull(yVar);
            overScroller.getFinalY();
            overScroller.getCurrY();
            return;
        }
        Objects.requireNonNull(yVar);
    }

    public View findChildViewUnder(float f2, float f3) {
        for (int e2 = this.mChildHelper.e() - 1; e2 >= 0; e2--) {
            View d2 = this.mChildHelper.d(e2);
            float translationX = d2.getTranslationX();
            float translationY = d2.getTranslationY();
            if (f2 >= ((float) d2.getLeft()) + translationX && f2 <= ((float) d2.getRight()) + translationX && f3 >= ((float) d2.getTop()) + translationY && f3 <= ((float) d2.getBottom()) + translationY) {
                return d2;
            }
        }
        return null;
    }

    public View findContainingItemView(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && parent != this && (parent instanceof View)) {
            view = (View) parent;
            parent = view.getParent();
        }
        if (parent == this) {
            return view;
        }
        return null;
    }

    public b0 findContainingViewHolder(View view) {
        View findContainingItemView = findContainingItemView(view);
        if (findContainingItemView == null) {
            return null;
        }
        return getChildViewHolder(findContainingItemView);
    }

    public b0 findViewHolderForAdapterPosition(int i2) {
        b0 b0Var = null;
        if (this.mDataSetHasChangedAfterLayout) {
            return null;
        }
        int h2 = this.mChildHelper.h();
        for (int i3 = 0; i3 < h2; i3++) {
            b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && getAdapterPositionInRecyclerView(childViewHolderInt) == i2) {
                if (!this.mChildHelper.k(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                b0Var = childViewHolderInt;
            }
        }
        return b0Var;
    }

    public b0 findViewHolderForItemId(long j2) {
        Adapter adapter = this.mAdapter;
        b0 b0Var = null;
        if (adapter != null && adapter.hasStableIds()) {
            int h2 = this.mChildHelper.h();
            for (int i2 = 0; i2 < h2; i2++) {
                b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
                if (childViewHolderInt != null && !childViewHolderInt.isRemoved() && childViewHolderInt.getItemId() == j2) {
                    if (!this.mChildHelper.k(childViewHolderInt.itemView)) {
                        return childViewHolderInt;
                    }
                    b0Var = childViewHolderInt;
                }
            }
        }
        return b0Var;
    }

    public b0 findViewHolderForLayoutPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    @Deprecated
    public b0 findViewHolderForPosition(int i2) {
        return findViewHolderForPosition(i2, false);
    }

    /* JADX WARNING: Removed duplicated region for block: B:50:0x00a1 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean fling(int r19, int r20) {
        /*
            r18 = this;
            r0 = r18
            androidx.recyclerview.widget.RecyclerView$n r1 = r0.mLayout
            r2 = 0
            if (r1 != 0) goto L_0x000f
            java.lang.String r1 = "RecyclerView"
            java.lang.String r3 = "Cannot fling without a LayoutManager set. Call setLayoutManager with a non-null argument."
            android.util.Log.e(r1, r3)
            return r2
        L_0x000f:
            boolean r3 = r0.mLayoutSuppressed
            if (r3 == 0) goto L_0x0014
            return r2
        L_0x0014:
            boolean r1 = r1.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$n r3 = r0.mLayout
            boolean r3 = r3.canScrollVertically()
            if (r1 == 0) goto L_0x002c
            int r4 = java.lang.Math.abs(r19)
            int r5 = r0.mMinFlingVelocity
            if (r4 >= r5) goto L_0x0029
            goto L_0x002c
        L_0x0029:
            r4 = r19
            goto L_0x002d
        L_0x002c:
            r4 = r2
        L_0x002d:
            if (r3 == 0) goto L_0x003b
            int r5 = java.lang.Math.abs(r20)
            int r6 = r0.mMinFlingVelocity
            if (r5 >= r6) goto L_0x0038
            goto L_0x003b
        L_0x0038:
            r5 = r20
            goto L_0x003c
        L_0x003b:
            r5 = r2
        L_0x003c:
            if (r4 != 0) goto L_0x0041
            if (r5 != 0) goto L_0x0041
            return r2
        L_0x0041:
            float r6 = (float) r4
            float r7 = (float) r5
            boolean r8 = r0.dispatchNestedPreFling(r6, r7)
            if (r8 != 0) goto L_0x00fc
            r8 = 1
            if (r1 != 0) goto L_0x0051
            if (r3 == 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r9 = r2
            goto L_0x0052
        L_0x0051:
            r9 = r8
        L_0x0052:
            r0.dispatchNestedFling(r6, r7, r9)
            androidx.recyclerview.widget.RecyclerView$q r6 = r0.mOnFlingListener
            if (r6 == 0) goto L_0x00a2
            h0.v.a.z r6 = (h0.v.a.z) r6
            androidx.recyclerview.widget.RecyclerView r7 = r6.a
            androidx.recyclerview.widget.RecyclerView$n r7 = r7.getLayoutManager()
            if (r7 != 0) goto L_0x0064
            goto L_0x009e
        L_0x0064:
            androidx.recyclerview.widget.RecyclerView r10 = r6.a
            androidx.recyclerview.widget.RecyclerView$Adapter r10 = r10.getAdapter()
            if (r10 != 0) goto L_0x006d
            goto L_0x009e
        L_0x006d:
            androidx.recyclerview.widget.RecyclerView r10 = r6.a
            int r10 = r10.getMinFlingVelocity()
            int r11 = java.lang.Math.abs(r5)
            if (r11 > r10) goto L_0x007f
            int r11 = java.lang.Math.abs(r4)
            if (r11 <= r10) goto L_0x009e
        L_0x007f:
            boolean r10 = r7 instanceof androidx.recyclerview.widget.RecyclerView.x.b
            if (r10 != 0) goto L_0x0084
            goto L_0x0092
        L_0x0084:
            androidx.recyclerview.widget.RecyclerView$x r10 = r6.c(r7)
            if (r10 != 0) goto L_0x008b
            goto L_0x0092
        L_0x008b:
            int r6 = r6.e(r7, r4, r5)
            r11 = -1
            if (r6 != r11) goto L_0x0094
        L_0x0092:
            r6 = r2
            goto L_0x009a
        L_0x0094:
            r10.a = r6
            r7.startSmoothScroll(r10)
            r6 = r8
        L_0x009a:
            if (r6 == 0) goto L_0x009e
            r6 = r8
            goto L_0x009f
        L_0x009e:
            r6 = r2
        L_0x009f:
            if (r6 == 0) goto L_0x00a2
            return r8
        L_0x00a2:
            if (r9 == 0) goto L_0x00fc
            if (r1 == 0) goto L_0x00a8
            r1 = r8
            goto L_0x00a9
        L_0x00a8:
            r1 = r2
        L_0x00a9:
            if (r3 == 0) goto L_0x00ad
            r1 = r1 | 2
        L_0x00ad:
            r0.startNestedScroll(r1, r8)
            int r1 = r0.mMaxFlingVelocity
            int r3 = -r1
            int r1 = java.lang.Math.min(r4, r1)
            int r12 = java.lang.Math.max(r3, r1)
            int r1 = r0.mMaxFlingVelocity
            int r3 = -r1
            int r1 = java.lang.Math.min(r5, r1)
            int r13 = java.lang.Math.max(r3, r1)
            androidx.recyclerview.widget.RecyclerView$a0 r1 = r0.mViewFlinger
            androidx.recyclerview.widget.RecyclerView r3 = androidx.recyclerview.widget.RecyclerView.this
            r4 = 2
            r3.setScrollState(r4)
            r1.d = r2
            r1.c = r2
            android.view.animation.Interpolator r2 = r1.x
            android.view.animation.Interpolator r3 = sQuinticInterpolator
            if (r2 == r3) goto L_0x00e7
            r1.x = r3
            android.widget.OverScroller r2 = new android.widget.OverScroller
            androidx.recyclerview.widget.RecyclerView r4 = androidx.recyclerview.widget.RecyclerView.this
            android.content.Context r4 = r4.getContext()
            r2.<init>(r4, r3)
            r1.q = r2
        L_0x00e7:
            android.widget.OverScroller r9 = r1.q
            r10 = 0
            r11 = 0
            r14 = -2147483648(0xffffffff80000000, float:-0.0)
            r15 = 2147483647(0x7fffffff, float:NaN)
            r16 = -2147483648(0xffffffff80000000, float:-0.0)
            r17 = 2147483647(0x7fffffff, float:NaN)
            r9.fling(r10, r11, r12, r13, r14, r15, r16, r17)
            r1.a()
            return r8
        L_0x00fc:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.fling(int, int):boolean");
    }

    public View focusSearch(View view, int i2) {
        View view2;
        boolean z2;
        View onInterceptFocusSearch = this.mLayout.onInterceptFocusSearch(view, i2);
        if (onInterceptFocusSearch != null) {
            return onInterceptFocusSearch;
        }
        boolean z3 = true;
        boolean z4 = this.mAdapter != null && this.mLayout != null && !isComputingLayout() && !this.mLayoutSuppressed;
        FocusFinder instance = FocusFinder.getInstance();
        if (!z4 || !(i2 == 2 || i2 == 1)) {
            View findNextFocus = instance.findNextFocus(this, view, i2);
            if (findNextFocus != null || !z4) {
                view2 = findNextFocus;
            } else {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                view2 = this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
        } else {
            if (this.mLayout.canScrollVertically()) {
                int i3 = i2 == 2 ? 130 : 33;
                z2 = instance.findNextFocus(this, view, i3) == null;
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i3;
                }
            } else {
                z2 = false;
            }
            if (!z2 && this.mLayout.canScrollHorizontally()) {
                int i4 = (this.mLayout.getLayoutDirection() == 1) ^ (i2 == 2) ? 66 : 17;
                if (instance.findNextFocus(this, view, i4) != null) {
                    z3 = false;
                }
                if (FORCE_ABS_FOCUS_SEARCH_DIRECTION) {
                    i2 = i4;
                }
                z2 = z3;
            }
            if (z2) {
                consumePendingUpdateOperations();
                if (findContainingItemView(view) == null) {
                    return null;
                }
                startInterceptRequestLayout();
                this.mLayout.onFocusSearchFailed(view, i2, this.mRecycler, this.mState);
                stopInterceptRequestLayout(false);
            }
            view2 = instance.findNextFocus(this, view, i2);
        }
        if (view2 == null || view2.hasFocusable()) {
            return isPreferredNextFocus(view, view2, i2) ? view2 : super.focusSearch(view, i2);
        }
        if (getFocusedChild() == null) {
            return super.focusSearch(view, i2);
        }
        requestChildOnScreen(view2, (View) null);
        return view;
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        n nVar = this.mLayout;
        if (nVar != null) {
            return nVar.generateDefaultLayoutParams();
        }
        throw new IllegalStateException(i0.d.a.a.a.S(this, i0.d.a.a.a.P0("RecyclerView has no LayoutManager")));
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        n nVar = this.mLayout;
        if (nVar != null) {
            return nVar.generateLayoutParams(getContext(), attributeSet);
        }
        throw new IllegalStateException(i0.d.a.a.a.S(this, i0.d.a.a.a.P0("RecyclerView has no LayoutManager")));
    }

    public CharSequence getAccessibilityClassName() {
        return "androidx.recyclerview.widget.RecyclerView";
    }

    public Adapter getAdapter() {
        return this.mAdapter;
    }

    public int getAdapterPositionInRecyclerView(b0 b0Var) {
        if (b0Var.hasAnyOfTheFlags(524) || !b0Var.isBound()) {
            return -1;
        }
        h0.v.a.a aVar = this.mAdapterHelper;
        int i2 = b0Var.mPosition;
        int size = aVar.b.size();
        for (int i3 = 0; i3 < size; i3++) {
            a.b bVar = aVar.b.get(i3);
            int i4 = bVar.a;
            if (i4 != 1) {
                if (i4 == 2) {
                    int i5 = bVar.b;
                    if (i5 <= i2) {
                        int i6 = bVar.d;
                        if (i5 + i6 > i2) {
                            return -1;
                        }
                        i2 -= i6;
                    } else {
                        continue;
                    }
                } else if (i4 == 8) {
                    int i7 = bVar.b;
                    if (i7 == i2) {
                        i2 = bVar.d;
                    } else {
                        if (i7 < i2) {
                            i2--;
                        }
                        if (bVar.d <= i2) {
                            i2++;
                        }
                    }
                }
            } else if (bVar.b <= i2) {
                i2 += bVar.d;
            }
        }
        return i2;
    }

    public int getBaseline() {
        n nVar = this.mLayout;
        if (nVar != null) {
            return nVar.getBaseline();
        }
        return super.getBaseline();
    }

    public long getChangedHolderKey(b0 b0Var) {
        return this.mAdapter.hasStableIds() ? b0Var.getItemId() : (long) b0Var.mPosition;
    }

    public int getChildAdapterPosition(View view) {
        b0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getAbsoluteAdapterPosition();
        }
        return -1;
    }

    public int getChildDrawingOrder(int i2, int i3) {
        i iVar = this.mChildDrawingOrderCallback;
        if (iVar == null) {
            return super.getChildDrawingOrder(i2, i3);
        }
        return iVar.a(i2, i3);
    }

    public long getChildItemId(View view) {
        b0 childViewHolderInt;
        Adapter adapter = this.mAdapter;
        if (adapter == null || !adapter.hasStableIds() || (childViewHolderInt = getChildViewHolderInt(view)) == null) {
            return -1;
        }
        return childViewHolderInt.getItemId();
    }

    public int getChildLayoutPosition(View view) {
        b0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            return childViewHolderInt.getLayoutPosition();
        }
        return -1;
    }

    @Deprecated
    public int getChildPosition(View view) {
        return getChildAdapterPosition(view);
    }

    public b0 getChildViewHolder(View view) {
        ViewParent parent = view.getParent();
        if (parent == null || parent == this) {
            return getChildViewHolderInt(view);
        }
        throw new IllegalArgumentException("View " + view + " is not a direct child of " + this);
    }

    public boolean getClipToPadding() {
        return this.mClipToPadding;
    }

    public h0.v.a.x getCompatAccessibilityDelegate() {
        return this.mAccessibilityDelegate;
    }

    public void getDecoratedBoundsWithMargins(View view, Rect rect) {
        getDecoratedBoundsWithMarginsInt(view, rect);
    }

    public j getEdgeEffectFactory() {
        return this.mEdgeEffectFactory;
    }

    public k getItemAnimator() {
        return this.mItemAnimator;
    }

    public Rect getItemDecorInsetsForChild(View view) {
        o oVar = (o) view.getLayoutParams();
        if (!oVar.c) {
            return oVar.b;
        }
        if (this.mState.g && (oVar.b() || oVar.a.isInvalid())) {
            return oVar.b;
        }
        Rect rect = oVar.b;
        rect.set(0, 0, 0, 0);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mTempRect.set(0, 0, 0, 0);
            this.mItemDecorations.get(i2).f(this.mTempRect, view, this, this.mState);
            int i3 = rect.left;
            Rect rect2 = this.mTempRect;
            rect.left = i3 + rect2.left;
            rect.top += rect2.top;
            rect.right += rect2.right;
            rect.bottom += rect2.bottom;
        }
        oVar.c = false;
        return rect;
    }

    public m getItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 >= 0 && i2 < itemDecorationCount) {
            return this.mItemDecorations.get(i2);
        }
        throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
    }

    public int getItemDecorationCount() {
        return this.mItemDecorations.size();
    }

    public n getLayoutManager() {
        return this.mLayout;
    }

    public int getMaxFlingVelocity() {
        return this.mMaxFlingVelocity;
    }

    public int getMinFlingVelocity() {
        return this.mMinFlingVelocity;
    }

    public long getNanoTime() {
        if (ALLOW_THREAD_GAP_WORK) {
            return System.nanoTime();
        }
        return 0;
    }

    public q getOnFlingListener() {
        return this.mOnFlingListener;
    }

    public boolean getPreserveFocusAfterLayout() {
        return this.mPreserveFocusAfterLayout;
    }

    public t getRecycledViewPool() {
        return this.mRecycler.d();
    }

    public int getScrollState() {
        return this.mScrollState;
    }

    public boolean hasFixedSize() {
        return this.mHasFixedSize;
    }

    public boolean hasNestedScrollingParent() {
        return getScrollingChildHelper().g(0);
    }

    public boolean hasPendingAdapterUpdates() {
        return !this.mFirstLayoutComplete || this.mDataSetHasChangedAfterLayout || this.mAdapterHelper.g();
    }

    public void initAdapterManager() {
        this.mAdapterHelper = new h0.v.a.a(new f());
    }

    public void initFastScroller(StateListDrawable stateListDrawable, Drawable drawable, StateListDrawable stateListDrawable2, Drawable drawable2) {
        if (stateListDrawable == null || drawable == null || stateListDrawable2 == null || drawable2 == null) {
            throw new IllegalArgumentException(i0.d.a.a.a.S(this, i0.d.a.a.a.P0("Trying to set fast scroller without both required drawables.")));
        }
        Resources resources = getContext().getResources();
        new h0.v.a.i(this, stateListDrawable, drawable, stateListDrawable2, drawable2, resources.getDimensionPixelSize(R.dimen.fastscroll_default_thickness), resources.getDimensionPixelSize(R.dimen.fastscroll_minimum_range), resources.getDimensionPixelOffset(R.dimen.fastscroll_margin));
    }

    public void invalidateGlows() {
        this.mBottomGlow = null;
        this.mTopGlow = null;
        this.mRightGlow = null;
        this.mLeftGlow = null;
    }

    public void invalidateItemDecorations() {
        if (this.mItemDecorations.size() != 0) {
            n nVar = this.mLayout;
            if (nVar != null) {
                nVar.assertNotInLayoutOrScroll("Cannot invalidate item decorations during a scroll or layout");
            }
            markItemDecorInsetsDirty();
            requestLayout();
        }
    }

    public boolean isAccessibilityEnabled() {
        AccessibilityManager accessibilityManager = this.mAccessibilityManager;
        return accessibilityManager != null && accessibilityManager.isEnabled();
    }

    public boolean isAnimating() {
        k kVar = this.mItemAnimator;
        return kVar != null && kVar.isRunning();
    }

    public boolean isAttachedToWindow() {
        return this.mIsAttached;
    }

    public boolean isComputingLayout() {
        return this.mLayoutOrScrollCounter > 0;
    }

    @Deprecated
    public boolean isLayoutFrozen() {
        return isLayoutSuppressed();
    }

    public final boolean isLayoutSuppressed() {
        return this.mLayoutSuppressed;
    }

    public boolean isNestedScrollingEnabled() {
        return getScrollingChildHelper().d;
    }

    public void jumpToPositionForSmoothScroller(int i2) {
        if (this.mLayout != null) {
            setScrollState(2);
            this.mLayout.scrollToPosition(i2);
            awakenScrollBars();
        }
    }

    public void markItemDecorInsetsDirty() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            ((o) this.mChildHelper.g(i2).getLayoutParams()).c = true;
        }
        u uVar = this.mRecycler;
        int size = uVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            o oVar = (o) uVar.c.get(i3).itemView.getLayoutParams();
            if (oVar != null) {
                oVar.c = true;
            }
        }
    }

    public void markKnownViewsInvalid() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.addFlags(6);
            }
        }
        markItemDecorInsetsDirty();
        u uVar = this.mRecycler;
        int size = uVar.c.size();
        for (int i3 = 0; i3 < size; i3++) {
            b0 b0Var = uVar.c.get(i3);
            if (b0Var != null) {
                b0Var.addFlags(6);
                b0Var.addChangePayload((Object) null);
            }
        }
        Adapter adapter = RecyclerView.this.mAdapter;
        if (adapter == null || !adapter.hasStableIds()) {
            uVar.g();
        }
    }

    public void nestedScrollBy(int i2, int i3) {
        nestedScrollByInternal(i2, i3, (MotionEvent) null, 1);
    }

    public void offsetChildrenHorizontal(int i2) {
        int e2 = this.mChildHelper.e();
        for (int i3 = 0; i3 < e2; i3++) {
            this.mChildHelper.d(i3).offsetLeftAndRight(i2);
        }
    }

    public void offsetChildrenVertical(int i2) {
        int e2 = this.mChildHelper.e();
        for (int i3 = 0; i3 < e2; i3++) {
            this.mChildHelper.d(i3).offsetTopAndBottom(i2);
        }
    }

    public void offsetPositionRecordsForInsert(int i2, int i3) {
        int h2 = this.mChildHelper.h();
        for (int i4 = 0; i4 < h2; i4++) {
            b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i4));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && childViewHolderInt.mPosition >= i2) {
                childViewHolderInt.offsetPosition(i3, false);
                this.mState.f = true;
            }
        }
        u uVar = this.mRecycler;
        int size = uVar.c.size();
        for (int i5 = 0; i5 < size; i5++) {
            b0 b0Var = uVar.c.get(i5);
            if (b0Var != null && b0Var.mPosition >= i2) {
                b0Var.offsetPosition(i3, false);
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForMove(int i2, int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int h2 = this.mChildHelper.h();
        int i11 = -1;
        if (i2 < i3) {
            i6 = i2;
            i5 = i3;
            i4 = -1;
        } else {
            i5 = i2;
            i6 = i3;
            i4 = 1;
        }
        for (int i12 = 0; i12 < h2; i12++) {
            b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i12));
            if (childViewHolderInt != null && (i10 = childViewHolderInt.mPosition) >= i6 && i10 <= i5) {
                if (i10 == i2) {
                    childViewHolderInt.offsetPosition(i3 - i2, false);
                } else {
                    childViewHolderInt.offsetPosition(i4, false);
                }
                this.mState.f = true;
            }
        }
        u uVar = this.mRecycler;
        if (i2 < i3) {
            i8 = i2;
            i7 = i3;
        } else {
            i7 = i2;
            i11 = 1;
            i8 = i3;
        }
        int size = uVar.c.size();
        for (int i13 = 0; i13 < size; i13++) {
            b0 b0Var = uVar.c.get(i13);
            if (b0Var != null && (i9 = b0Var.mPosition) >= i8 && i9 <= i7) {
                if (i9 == i2) {
                    b0Var.offsetPosition(i3 - i2, false);
                } else {
                    b0Var.offsetPosition(i11, false);
                }
            }
        }
        requestLayout();
    }

    public void offsetPositionRecordsForRemove(int i2, int i3, boolean z2) {
        int i4 = i2 + i3;
        int h2 = this.mChildHelper.h();
        for (int i5 = 0; i5 < h2; i5++) {
            b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i5));
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore()) {
                int i6 = childViewHolderInt.mPosition;
                if (i6 >= i4) {
                    childViewHolderInt.offsetPosition(-i3, z2);
                    this.mState.f = true;
                } else if (i6 >= i2) {
                    childViewHolderInt.flagRemovedAndOffsetPosition(i2 - 1, -i3, z2);
                    this.mState.f = true;
                }
            }
        }
        u uVar = this.mRecycler;
        int size = uVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                b0 b0Var = uVar.c.get(size);
                if (b0Var != null) {
                    int i7 = b0Var.mPosition;
                    if (i7 >= i4) {
                        b0Var.offsetPosition(-i3, z2);
                    } else if (i7 >= i2) {
                        b0Var.addFlags(8);
                        uVar.h(size);
                    }
                }
            } else {
                requestLayout();
                return;
            }
        }
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.mLayoutOrScrollCounter = 0;
        boolean z2 = true;
        this.mIsAttached = true;
        if (!this.mFirstLayoutComplete || isLayoutRequested()) {
            z2 = false;
        }
        this.mFirstLayoutComplete = z2;
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.dispatchAttachedToWindow(this);
        }
        this.mPostedAnimatorRunner = false;
        if (ALLOW_THREAD_GAP_WORK) {
            ThreadLocal<h0.v.a.j> threadLocal = h0.v.a.j.c;
            h0.v.a.j jVar = threadLocal.get();
            this.mGapWorker = jVar;
            if (jVar == null) {
                this.mGapWorker = new h0.v.a.j();
                AtomicInteger atomicInteger = h0.i.i.q.a;
                Display display = getDisplay();
                float f2 = 60.0f;
                if (!isInEditMode() && display != null) {
                    float refreshRate = display.getRefreshRate();
                    if (refreshRate >= 30.0f) {
                        f2 = refreshRate;
                    }
                }
                h0.v.a.j jVar2 = this.mGapWorker;
                jVar2.y = (long) (1.0E9f / f2);
                threadLocal.set(jVar2);
            }
            this.mGapWorker.q.add(this);
        }
    }

    public void onChildAttachedToWindow(View view) {
    }

    public void onChildDetachedFromWindow(View view) {
    }

    public void onDetachedFromWindow() {
        h0.v.a.j jVar;
        super.onDetachedFromWindow();
        k kVar = this.mItemAnimator;
        if (kVar != null) {
            kVar.endAnimations();
        }
        stopScroll();
        this.mIsAttached = false;
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.dispatchDetachedFromWindow(this, this.mRecycler);
        }
        this.mPendingAccessibilityImportanceChange.clear();
        removeCallbacks(this.mItemAnimatorRunner);
        Objects.requireNonNull(this.mViewInfoStore);
        do {
        } while (c0.a.a.a() != null);
        if (ALLOW_THREAD_GAP_WORK && (jVar = this.mGapWorker) != null) {
            jVar.q.remove(this);
            this.mGapWorker = null;
        }
    }

    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int size = this.mItemDecorations.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mItemDecorations.get(i2).g(canvas, this, this.mState);
        }
    }

    public void onEnterLayoutOrScroll() {
        this.mLayoutOrScrollCounter++;
    }

    public void onExitLayoutOrScroll() {
        onExitLayoutOrScroll(true);
    }

    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        float f2;
        float f3;
        if (this.mLayout != null && !this.mLayoutSuppressed && motionEvent.getAction() == 8) {
            if ((motionEvent.getSource() & 2) != 0) {
                f3 = this.mLayout.canScrollVertically() ? -motionEvent.getAxisValue(9) : 0.0f;
                if (this.mLayout.canScrollHorizontally()) {
                    f2 = motionEvent.getAxisValue(10);
                    if (!(f3 == 0.0f && f2 == 0.0f)) {
                        nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
            } else {
                if ((motionEvent.getSource() & 4194304) != 0) {
                    float axisValue = motionEvent.getAxisValue(26);
                    if (this.mLayout.canScrollVertically()) {
                        f3 = -axisValue;
                    } else if (this.mLayout.canScrollHorizontally()) {
                        f2 = axisValue;
                        f3 = 0.0f;
                        nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent, 1);
                    }
                }
                f3 = 0.0f;
                f2 = 0.0f;
                nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent, 1);
            }
            f2 = 0.0f;
            nestedScrollByInternal((int) (f2 * this.mScaledHorizontalScrollFactor), (int) (f3 * this.mScaledVerticalScrollFactor), motionEvent, 1);
        }
        return false;
    }

    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z2;
        if (this.mLayoutSuppressed) {
            return false;
        }
        this.mInterceptingOnItemTouchListener = null;
        if (findInterceptingOnItemTouchListener(motionEvent)) {
            cancelScroll();
            return true;
        }
        n nVar = this.mLayout;
        if (nVar == null) {
            return false;
        }
        boolean canScrollHorizontally = nVar.canScrollHorizontally();
        boolean canScrollVertically = this.mLayout.canScrollVertically();
        if (this.mVelocityTracker == null) {
            this.mVelocityTracker = VelocityTracker.obtain();
        }
        this.mVelocityTracker.addMovement(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            if (this.mIgnoreMotionEventTillDown) {
                this.mIgnoreMotionEventTillDown = false;
            }
            this.mScrollPointerId = motionEvent.getPointerId(0);
            int x2 = (int) (motionEvent.getX() + 0.5f);
            this.mLastTouchX = x2;
            this.mInitialTouchX = x2;
            int y2 = (int) (motionEvent.getY() + 0.5f);
            this.mLastTouchY = y2;
            this.mInitialTouchY = y2;
            if (this.mScrollState == 2) {
                getParent().requestDisallowInterceptTouchEvent(true);
                setScrollState(1);
                stopNestedScroll(1);
            }
            int[] iArr = this.mNestedOffsets;
            iArr[1] = 0;
            iArr[0] = 0;
            if (canScrollVertically) {
                canScrollHorizontally |= true;
            }
            startNestedScroll(canScrollHorizontally ? 1 : 0, 0);
        } else if (actionMasked == 1) {
            this.mVelocityTracker.clear();
            stopNestedScroll(0);
        } else if (actionMasked == 2) {
            int findPointerIndex = motionEvent.findPointerIndex(this.mScrollPointerId);
            if (findPointerIndex < 0) {
                StringBuilder P0 = i0.d.a.a.a.P0("Error processing scroll; pointer index for id ");
                P0.append(this.mScrollPointerId);
                P0.append(" not found. Did any MotionEvents get skipped?");
                Log.e(TAG, P0.toString());
                return false;
            }
            int x3 = (int) (motionEvent.getX(findPointerIndex) + 0.5f);
            int y3 = (int) (motionEvent.getY(findPointerIndex) + 0.5f);
            if (this.mScrollState != 1) {
                int i2 = x3 - this.mInitialTouchX;
                int i3 = y3 - this.mInitialTouchY;
                if (!canScrollHorizontally || Math.abs(i2) <= this.mTouchSlop) {
                    z2 = false;
                } else {
                    this.mLastTouchX = x3;
                    z2 = true;
                }
                if (canScrollVertically && Math.abs(i3) > this.mTouchSlop) {
                    this.mLastTouchY = y3;
                    z2 = true;
                }
                if (z2) {
                    setScrollState(1);
                }
            }
        } else if (actionMasked == 3) {
            cancelScroll();
        } else if (actionMasked == 5) {
            this.mScrollPointerId = motionEvent.getPointerId(actionIndex);
            int x4 = (int) (motionEvent.getX(actionIndex) + 0.5f);
            this.mLastTouchX = x4;
            this.mInitialTouchX = x4;
            int y4 = (int) (motionEvent.getY(actionIndex) + 0.5f);
            this.mLastTouchY = y4;
            this.mInitialTouchY = y4;
        } else if (actionMasked == 6) {
            onPointerUp(motionEvent);
        }
        if (this.mScrollState == 1) {
            return true;
        }
        return false;
    }

    public void onLayout(boolean z2, int i2, int i3, int i4, int i5) {
        int i6 = h0.i.e.f.a;
        Trace.beginSection(TRACE_ON_LAYOUT_TAG);
        dispatchLayout();
        Trace.endSection();
        this.mFirstLayoutComplete = true;
    }

    public void onMeasure(int i2, int i3) {
        n nVar = this.mLayout;
        if (nVar == null) {
            defaultOnMeasure(i2, i3);
            return;
        }
        boolean z2 = false;
        if (nVar.isAutoMeasureEnabled()) {
            int mode = View.MeasureSpec.getMode(i2);
            int mode2 = View.MeasureSpec.getMode(i3);
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            if (mode == 1073741824 && mode2 == 1073741824) {
                z2 = true;
            }
            this.mLastAutoMeasureSkippedDueToExact = z2;
            if (!z2 && this.mAdapter != null) {
                if (this.mState.d == 1) {
                    dispatchLayoutStep1();
                }
                this.mLayout.setMeasureSpecs(i2, i3);
                this.mState.i = true;
                dispatchLayoutStep2();
                this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
                if (this.mLayout.shouldMeasureTwice()) {
                    this.mLayout.setMeasureSpecs(View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824));
                    this.mState.i = true;
                    dispatchLayoutStep2();
                    this.mLayout.setMeasuredDimensionFromChildren(i2, i3);
                }
                this.mLastAutoMeasureNonExactMeasuredWidth = getMeasuredWidth();
                this.mLastAutoMeasureNonExactMeasuredHeight = getMeasuredHeight();
            }
        } else if (this.mHasFixedSize) {
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
        } else {
            if (this.mAdapterUpdateDuringMeasure) {
                startInterceptRequestLayout();
                onEnterLayoutOrScroll();
                processAdapterUpdatesAndSetAnimationFlags();
                onExitLayoutOrScroll();
                y yVar = this.mState;
                if (yVar.k) {
                    yVar.g = true;
                } else {
                    this.mAdapterHelper.c();
                    this.mState.g = false;
                }
                this.mAdapterUpdateDuringMeasure = false;
                stopInterceptRequestLayout(false);
            } else if (this.mState.k) {
                setMeasuredDimension(getMeasuredWidth(), getMeasuredHeight());
                return;
            }
            Adapter adapter = this.mAdapter;
            if (adapter != null) {
                this.mState.e = adapter.getItemCount();
            } else {
                this.mState.e = 0;
            }
            startInterceptRequestLayout();
            this.mLayout.onMeasure(this.mRecycler, this.mState, i2, i3);
            stopInterceptRequestLayout(false);
            this.mState.g = false;
        }
    }

    public boolean onRequestFocusInDescendants(int i2, Rect rect) {
        if (isComputingLayout()) {
            return false;
        }
        return super.onRequestFocusInDescendants(i2, rect);
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        this.mPendingSavedState = savedState;
        super.onRestoreInstanceState(savedState.d);
        requestLayout();
    }

    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SavedState savedState2 = this.mPendingSavedState;
        if (savedState2 != null) {
            savedState.q = savedState2.q;
        } else {
            n nVar = this.mLayout;
            if (nVar != null) {
                savedState.q = nVar.onSaveInstanceState();
            } else {
                savedState.q = null;
            }
        }
        return savedState;
    }

    public void onScrollStateChanged(int i2) {
    }

    public void onScrolled(int i2, int i3) {
    }

    public void onSizeChanged(int i2, int i3, int i4, int i5) {
        super.onSizeChanged(i2, i3, i4, i5);
        if (i2 != i4 || i3 != i5) {
            invalidateGlows();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            r17 = this;
            r6 = r17
            r7 = r18
            boolean r0 = r6.mLayoutSuppressed
            r8 = 0
            if (r0 != 0) goto L_0x01db
            boolean r0 = r6.mIgnoreMotionEventTillDown
            if (r0 == 0) goto L_0x000f
            goto L_0x01db
        L_0x000f:
            boolean r0 = r17.dispatchToOnItemTouchListeners(r18)
            r9 = 1
            if (r0 == 0) goto L_0x001a
            r17.cancelScroll()
            return r9
        L_0x001a:
            androidx.recyclerview.widget.RecyclerView$n r0 = r6.mLayout
            if (r0 != 0) goto L_0x001f
            return r8
        L_0x001f:
            boolean r10 = r0.canScrollHorizontally()
            androidx.recyclerview.widget.RecyclerView$n r0 = r6.mLayout
            boolean r11 = r0.canScrollVertically()
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            if (r0 != 0) goto L_0x0033
            android.view.VelocityTracker r0 = android.view.VelocityTracker.obtain()
            r6.mVelocityTracker = r0
        L_0x0033:
            int r0 = r18.getActionMasked()
            int r1 = r18.getActionIndex()
            if (r0 != 0) goto L_0x0043
            int[] r2 = r6.mNestedOffsets
            r2[r9] = r8
            r2[r8] = r8
        L_0x0043:
            android.view.MotionEvent r12 = android.view.MotionEvent.obtain(r18)
            int[] r2 = r6.mNestedOffsets
            r3 = r2[r8]
            float r3 = (float) r3
            r2 = r2[r9]
            float r2 = (float) r2
            r12.offsetLocation(r3, r2)
            r2 = 1056964608(0x3f000000, float:0.5)
            if (r0 == 0) goto L_0x01af
            if (r0 == r9) goto L_0x016d
            r3 = 2
            if (r0 == r3) goto L_0x008c
            r3 = 3
            if (r0 == r3) goto L_0x0087
            r3 = 5
            if (r0 == r3) goto L_0x006b
            r1 = 6
            if (r0 == r1) goto L_0x0066
            goto L_0x01d0
        L_0x0066:
            r17.onPointerUp(r18)
            goto L_0x01d0
        L_0x006b:
            int r0 = r7.getPointerId(r1)
            r6.mScrollPointerId = r0
            float r0 = r7.getX(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r7.getY(r1)
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            goto L_0x01d0
        L_0x0087:
            r17.cancelScroll()
            goto L_0x01d0
        L_0x008c:
            int r0 = r6.mScrollPointerId
            int r0 = r7.findPointerIndex(r0)
            if (r0 >= 0) goto L_0x00ae
            java.lang.String r0 = "Error processing scroll; pointer index for id "
            java.lang.StringBuilder r0 = i0.d.a.a.a.P0(r0)
            int r1 = r6.mScrollPointerId
            r0.append(r1)
            java.lang.String r1 = " not found. Did any MotionEvents get skipped?"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "RecyclerView"
            android.util.Log.e(r1, r0)
            return r8
        L_0x00ae:
            float r1 = r7.getX(r0)
            float r1 = r1 + r2
            int r13 = (int) r1
            float r0 = r7.getY(r0)
            float r0 = r0 + r2
            int r14 = (int) r0
            int r0 = r6.mLastTouchX
            int r0 = r0 - r13
            int r1 = r6.mLastTouchY
            int r1 = r1 - r14
            int r2 = r6.mScrollState
            if (r2 == r9) goto L_0x00f7
            if (r10 == 0) goto L_0x00db
            if (r0 <= 0) goto L_0x00d0
            int r2 = r6.mTouchSlop
            int r0 = r0 - r2
            int r0 = java.lang.Math.max(r8, r0)
            goto L_0x00d7
        L_0x00d0:
            int r2 = r6.mTouchSlop
            int r0 = r0 + r2
            int r0 = java.lang.Math.min(r8, r0)
        L_0x00d7:
            if (r0 == 0) goto L_0x00db
            r2 = r9
            goto L_0x00dc
        L_0x00db:
            r2 = r8
        L_0x00dc:
            if (r11 == 0) goto L_0x00f2
            if (r1 <= 0) goto L_0x00e8
            int r3 = r6.mTouchSlop
            int r1 = r1 - r3
            int r1 = java.lang.Math.max(r8, r1)
            goto L_0x00ef
        L_0x00e8:
            int r3 = r6.mTouchSlop
            int r1 = r1 + r3
            int r1 = java.lang.Math.min(r8, r1)
        L_0x00ef:
            if (r1 == 0) goto L_0x00f2
            r2 = r9
        L_0x00f2:
            if (r2 == 0) goto L_0x00f7
            r6.setScrollState(r9)
        L_0x00f7:
            r15 = r0
            r16 = r1
            int r0 = r6.mScrollState
            if (r0 != r9) goto L_0x01d0
            int[] r3 = r6.mReusableIntPair
            r3[r8] = r8
            r3[r9] = r8
            if (r10 == 0) goto L_0x0108
            r1 = r15
            goto L_0x0109
        L_0x0108:
            r1 = r8
        L_0x0109:
            if (r11 == 0) goto L_0x010e
            r2 = r16
            goto L_0x010f
        L_0x010e:
            r2 = r8
        L_0x010f:
            int[] r4 = r6.mScrollOffset
            r5 = 0
            r0 = r17
            boolean r0 = r0.dispatchNestedPreScroll(r1, r2, r3, r4, r5)
            if (r0 == 0) goto L_0x013c
            int[] r0 = r6.mReusableIntPair
            r1 = r0[r8]
            int r15 = r15 - r1
            r0 = r0[r9]
            int r16 = r16 - r0
            int[] r0 = r6.mNestedOffsets
            r1 = r0[r8]
            int[] r2 = r6.mScrollOffset
            r3 = r2[r8]
            int r1 = r1 + r3
            r0[r8] = r1
            r1 = r0[r9]
            r2 = r2[r9]
            int r1 = r1 + r2
            r0[r9] = r1
            android.view.ViewParent r0 = r17.getParent()
            r0.requestDisallowInterceptTouchEvent(r9)
        L_0x013c:
            r0 = r16
            int[] r1 = r6.mScrollOffset
            r2 = r1[r8]
            int r13 = r13 - r2
            r6.mLastTouchX = r13
            r1 = r1[r9]
            int r14 = r14 - r1
            r6.mLastTouchY = r14
            if (r10 == 0) goto L_0x014e
            r1 = r15
            goto L_0x014f
        L_0x014e:
            r1 = r8
        L_0x014f:
            if (r11 == 0) goto L_0x0153
            r2 = r0
            goto L_0x0154
        L_0x0153:
            r2 = r8
        L_0x0154:
            boolean r1 = r6.scrollByInternal(r1, r2, r7, r8)
            if (r1 == 0) goto L_0x0161
            android.view.ViewParent r1 = r17.getParent()
            r1.requestDisallowInterceptTouchEvent(r9)
        L_0x0161:
            h0.v.a.j r1 = r6.mGapWorker
            if (r1 == 0) goto L_0x01d0
            if (r15 != 0) goto L_0x0169
            if (r0 == 0) goto L_0x01d0
        L_0x0169:
            r1.a(r6, r15, r0)
            goto L_0x01d0
        L_0x016d:
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r1 = 1000(0x3e8, float:1.401E-42)
            int r2 = r6.mMaxFlingVelocity
            float r2 = (float) r2
            r0.computeCurrentVelocity(r1, r2)
            r0 = 0
            if (r10 == 0) goto L_0x0189
            android.view.VelocityTracker r1 = r6.mVelocityTracker
            int r2 = r6.mScrollPointerId
            float r1 = r1.getXVelocity(r2)
            float r1 = -r1
            goto L_0x018a
        L_0x0189:
            r1 = r0
        L_0x018a:
            if (r11 == 0) goto L_0x0196
            android.view.VelocityTracker r2 = r6.mVelocityTracker
            int r3 = r6.mScrollPointerId
            float r2 = r2.getYVelocity(r3)
            float r2 = -r2
            goto L_0x0197
        L_0x0196:
            r2 = r0
        L_0x0197:
            int r3 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r3 != 0) goto L_0x019f
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x01a7
        L_0x019f:
            int r0 = (int) r1
            int r1 = (int) r2
            boolean r0 = r6.fling(r0, r1)
            if (r0 != 0) goto L_0x01aa
        L_0x01a7:
            r6.setScrollState(r8)
        L_0x01aa:
            r17.resetScroll()
            r8 = r9
            goto L_0x01d0
        L_0x01af:
            int r0 = r7.getPointerId(r8)
            r6.mScrollPointerId = r0
            float r0 = r18.getX()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchX = r0
            r6.mInitialTouchX = r0
            float r0 = r18.getY()
            float r0 = r0 + r2
            int r0 = (int) r0
            r6.mLastTouchY = r0
            r6.mInitialTouchY = r0
            if (r11 == 0) goto L_0x01cd
            r10 = r10 | 2
        L_0x01cd:
            r6.startNestedScroll(r10, r8)
        L_0x01d0:
            if (r8 != 0) goto L_0x01d7
            android.view.VelocityTracker r0 = r6.mVelocityTracker
            r0.addMovement(r12)
        L_0x01d7:
            r12.recycle()
            return r9
        L_0x01db:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.RecyclerView.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void postAnimationRunner() {
        if (!this.mPostedAnimatorRunner && this.mIsAttached) {
            Runnable runnable = this.mItemAnimatorRunner;
            AtomicInteger atomicInteger = h0.i.i.q.a;
            postOnAnimation(runnable);
            this.mPostedAnimatorRunner = true;
        }
    }

    public void processDataSetCompletelyChanged(boolean z2) {
        this.mDispatchItemsChangedEvent = z2 | this.mDispatchItemsChangedEvent;
        this.mDataSetHasChangedAfterLayout = true;
        markKnownViewsInvalid();
    }

    public void recordAnimationInfoIfBouncedHiddenView(b0 b0Var, k.c cVar) {
        b0Var.setFlags(0, 8192);
        if (this.mState.h && b0Var.isUpdated() && !b0Var.isRemoved() && !b0Var.shouldIgnore()) {
            this.mViewInfoStore.b.o(getChangedHolderKey(b0Var), b0Var);
        }
        this.mViewInfoStore.c(b0Var, cVar);
    }

    public void removeAndRecycleViews() {
        k kVar = this.mItemAnimator;
        if (kVar != null) {
            kVar.endAnimations();
        }
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.removeAndRecycleAllViews(this.mRecycler);
            this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
        }
        this.mRecycler.b();
    }

    public boolean removeAnimatingView(View view) {
        startInterceptRequestLayout();
        h0.v.a.e eVar = this.mChildHelper;
        int indexOfChild = RecyclerView.this.indexOfChild(view);
        boolean z2 = true;
        if (indexOfChild == -1) {
            eVar.m(view);
        } else if (eVar.b.d(indexOfChild)) {
            eVar.b.f(indexOfChild);
            eVar.m(view);
            ((e) eVar.a).c(indexOfChild);
        } else {
            z2 = false;
        }
        if (z2) {
            b0 childViewHolderInt = getChildViewHolderInt(view);
            this.mRecycler.n(childViewHolderInt);
            this.mRecycler.j(childViewHolderInt);
        }
        stopInterceptRequestLayout(!z2);
        return z2;
    }

    public void removeDetachedView(View view, boolean z2) {
        b0 childViewHolderInt = getChildViewHolderInt(view);
        if (childViewHolderInt != null) {
            if (childViewHolderInt.isTmpDetached()) {
                childViewHolderInt.clearTmpDetachFlag();
            } else if (!childViewHolderInt.shouldIgnore()) {
                StringBuilder sb = new StringBuilder();
                sb.append("Called removeDetachedView with a view which is not flagged as tmp detached.");
                sb.append(childViewHolderInt);
                throw new IllegalArgumentException(i0.d.a.a.a.S(this, sb));
            }
        }
        view.clearAnimation();
        dispatchChildDetached(view);
        super.removeDetachedView(view, z2);
    }

    public void removeItemDecoration(m mVar) {
        n nVar = this.mLayout;
        if (nVar != null) {
            nVar.assertNotInLayoutOrScroll("Cannot remove item decoration during a scroll  or layout");
        }
        this.mItemDecorations.remove(mVar);
        if (this.mItemDecorations.isEmpty()) {
            setWillNotDraw(getOverScrollMode() == 2);
        }
        markItemDecorInsetsDirty();
        requestLayout();
    }

    public void removeItemDecorationAt(int i2) {
        int itemDecorationCount = getItemDecorationCount();
        if (i2 < 0 || i2 >= itemDecorationCount) {
            throw new IndexOutOfBoundsException(i2 + " is an invalid index for size " + itemDecorationCount);
        }
        removeItemDecoration(getItemDecorationAt(i2));
    }

    public void removeOnChildAttachStateChangeListener(p pVar) {
        List<p> list = this.mOnChildAttachStateListeners;
        if (list != null) {
            list.remove(pVar);
        }
    }

    public void removeOnItemTouchListener(r rVar) {
        this.mOnItemTouchListeners.remove(rVar);
        if (this.mInterceptingOnItemTouchListener == rVar) {
            this.mInterceptingOnItemTouchListener = null;
        }
    }

    public void removeOnScrollListener(s sVar) {
        List<s> list = this.mScrollListeners;
        if (list != null) {
            list.remove(sVar);
        }
    }

    public void removeRecyclerListener(v vVar) {
        this.mRecyclerListeners.remove(vVar);
    }

    public void repositionShadowingViews() {
        b0 b0Var;
        int e2 = this.mChildHelper.e();
        for (int i2 = 0; i2 < e2; i2++) {
            View d2 = this.mChildHelper.d(i2);
            b0 childViewHolder = getChildViewHolder(d2);
            if (!(childViewHolder == null || (b0Var = childViewHolder.mShadowingHolder) == null)) {
                View view = b0Var.itemView;
                int left = d2.getLeft();
                int top = d2.getTop();
                if (left != view.getLeft() || top != view.getTop()) {
                    view.layout(left, top, view.getWidth() + left, view.getHeight() + top);
                }
            }
        }
    }

    public void requestChildFocus(View view, View view2) {
        if (!this.mLayout.onRequestChildFocus(this, this.mState, view, view2) && view2 != null) {
            requestChildOnScreen(view, view2);
        }
        super.requestChildFocus(view, view2);
    }

    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z2) {
        return this.mLayout.requestChildRectangleOnScreen(this, view, rect, z2);
    }

    public void requestDisallowInterceptTouchEvent(boolean z2) {
        int size = this.mOnItemTouchListeners.size();
        for (int i2 = 0; i2 < size; i2++) {
            this.mOnItemTouchListeners.get(i2).e(z2);
        }
        super.requestDisallowInterceptTouchEvent(z2);
    }

    public void requestLayout() {
        if (this.mInterceptRequestLayoutDepth != 0 || this.mLayoutSuppressed) {
            this.mLayoutWasDefered = true;
        } else {
            super.requestLayout();
        }
    }

    public void saveOldPositions() {
        int h2 = this.mChildHelper.h();
        for (int i2 = 0; i2 < h2; i2++) {
            b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i2));
            if (!childViewHolderInt.shouldIgnore()) {
                childViewHolderInt.saveOldPosition();
            }
        }
    }

    public void scrollBy(int i2, int i3) {
        n nVar = this.mLayout;
        if (nVar == null) {
            Log.e(TAG, "Cannot scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            boolean canScrollHorizontally = nVar.canScrollHorizontally();
            boolean canScrollVertically = this.mLayout.canScrollVertically();
            if (canScrollHorizontally || canScrollVertically) {
                if (!canScrollHorizontally) {
                    i2 = 0;
                }
                if (!canScrollVertically) {
                    i3 = 0;
                }
                scrollByInternal(i2, i3, (MotionEvent) null, 0);
            }
        }
    }

    public boolean scrollByInternal(int i2, int i3, MotionEvent motionEvent, int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = i2;
        int i10 = i3;
        consumePendingUpdateOperations();
        if (this.mAdapter != null) {
            int[] iArr = this.mReusableIntPair;
            iArr[0] = 0;
            iArr[1] = 0;
            scrollStep(i9, i10, iArr);
            int[] iArr2 = this.mReusableIntPair;
            int i11 = iArr2[0];
            int i12 = iArr2[1];
            i8 = i12;
            i7 = i11;
            i6 = i9 - i11;
            i5 = i10 - i12;
        } else {
            i8 = 0;
            i7 = 0;
            i6 = 0;
            i5 = 0;
        }
        if (!this.mItemDecorations.isEmpty()) {
            invalidate();
        }
        int[] iArr3 = this.mReusableIntPair;
        iArr3[0] = 0;
        iArr3[1] = 0;
        dispatchNestedScroll(i7, i8, i6, i5, this.mScrollOffset, i4, iArr3);
        int[] iArr4 = this.mReusableIntPair;
        int i13 = i6 - iArr4[0];
        int i14 = i5 - iArr4[1];
        boolean z2 = (iArr4[0] == 0 && iArr4[1] == 0) ? false : true;
        int i15 = this.mLastTouchX;
        int[] iArr5 = this.mScrollOffset;
        this.mLastTouchX = i15 - iArr5[0];
        this.mLastTouchY -= iArr5[1];
        int[] iArr6 = this.mNestedOffsets;
        iArr6[0] = iArr6[0] + iArr5[0];
        iArr6[1] = iArr6[1] + iArr5[1];
        if (getOverScrollMode() != 2) {
            if (motionEvent != null) {
                if (!((motionEvent.getSource() & 8194) == 8194)) {
                    pullGlows(motionEvent.getX(), (float) i13, motionEvent.getY(), (float) i14);
                }
            }
            considerReleasingGlowsOnScroll(i2, i3);
        }
        if (!(i7 == 0 && i8 == 0)) {
            dispatchOnScrolled(i7, i8);
        }
        if (!awakenScrollBars()) {
            invalidate();
        }
        if (!z2 && i7 == 0 && i8 == 0) {
            return false;
        }
        return true;
    }

    public void scrollStep(int i2, int i3, int[] iArr) {
        startInterceptRequestLayout();
        onEnterLayoutOrScroll();
        int i4 = h0.i.e.f.a;
        Trace.beginSection(TRACE_SCROLL_TAG);
        fillRemainingScrollValues(this.mState);
        int scrollHorizontallyBy = i2 != 0 ? this.mLayout.scrollHorizontallyBy(i2, this.mRecycler, this.mState) : 0;
        int scrollVerticallyBy = i3 != 0 ? this.mLayout.scrollVerticallyBy(i3, this.mRecycler, this.mState) : 0;
        Trace.endSection();
        repositionShadowingViews();
        onExitLayoutOrScroll();
        stopInterceptRequestLayout(false);
        if (iArr != null) {
            iArr[0] = scrollHorizontallyBy;
            iArr[1] = scrollVerticallyBy;
        }
    }

    public void scrollTo(int i2, int i3) {
        Log.w(TAG, "RecyclerView does not support scrolling to an absolute position. Use scrollToPosition instead");
    }

    public void scrollToPosition(int i2) {
        if (!this.mLayoutSuppressed) {
            stopScroll();
            n nVar = this.mLayout;
            if (nVar == null) {
                Log.e(TAG, "Cannot scroll to position a LayoutManager set. Call setLayoutManager with a non-null argument.");
                return;
            }
            nVar.scrollToPosition(i2);
            awakenScrollBars();
        }
    }

    public void sendAccessibilityEventUnchecked(AccessibilityEvent accessibilityEvent) {
        if (!shouldDeferAccessibilityEvent(accessibilityEvent)) {
            super.sendAccessibilityEventUnchecked(accessibilityEvent);
        }
    }

    public void setAccessibilityDelegateCompat(h0.v.a.x xVar) {
        this.mAccessibilityDelegate = xVar;
        h0.i.i.q.p(this, xVar);
    }

    public void setAdapter(Adapter adapter) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, false, true);
        processDataSetCompletelyChanged(false);
        requestLayout();
    }

    public void setChildDrawingOrderCallback(i iVar) {
        if (iVar != this.mChildDrawingOrderCallback) {
            this.mChildDrawingOrderCallback = iVar;
            setChildrenDrawingOrderEnabled(iVar != null);
        }
    }

    public boolean setChildImportantForAccessibilityInternal(b0 b0Var, int i2) {
        if (isComputingLayout()) {
            b0Var.mPendingAccessibilityState = i2;
            this.mPendingAccessibilityImportanceChange.add(b0Var);
            return false;
        }
        View view = b0Var.itemView;
        AtomicInteger atomicInteger = h0.i.i.q.a;
        view.setImportantForAccessibility(i2);
        return true;
    }

    public void setClipToPadding(boolean z2) {
        if (z2 != this.mClipToPadding) {
            invalidateGlows();
        }
        this.mClipToPadding = z2;
        super.setClipToPadding(z2);
        if (this.mFirstLayoutComplete) {
            requestLayout();
        }
    }

    public void setEdgeEffectFactory(j jVar) {
        Objects.requireNonNull(jVar);
        this.mEdgeEffectFactory = jVar;
        invalidateGlows();
    }

    public void setHasFixedSize(boolean z2) {
        this.mHasFixedSize = z2;
    }

    public void setItemAnimator(k kVar) {
        k kVar2 = this.mItemAnimator;
        if (kVar2 != null) {
            kVar2.endAnimations();
            this.mItemAnimator.setListener((k.b) null);
        }
        this.mItemAnimator = kVar;
        if (kVar != null) {
            kVar.setListener(this.mItemAnimatorListener);
        }
    }

    public void setItemViewCacheSize(int i2) {
        u uVar = this.mRecycler;
        uVar.e = i2;
        uVar.o();
    }

    @Deprecated
    public void setLayoutFrozen(boolean z2) {
        suppressLayout(z2);
    }

    public void setLayoutManager(n nVar) {
        if (nVar != this.mLayout) {
            stopScroll();
            if (this.mLayout != null) {
                k kVar = this.mItemAnimator;
                if (kVar != null) {
                    kVar.endAnimations();
                }
                this.mLayout.removeAndRecycleAllViews(this.mRecycler);
                this.mLayout.removeAndRecycleScrapInt(this.mRecycler);
                this.mRecycler.b();
                if (this.mIsAttached) {
                    this.mLayout.dispatchDetachedFromWindow(this, this.mRecycler);
                }
                this.mLayout.setRecyclerView((RecyclerView) null);
                this.mLayout = null;
            } else {
                this.mRecycler.b();
            }
            h0.v.a.e eVar = this.mChildHelper;
            e.a aVar = eVar.b;
            aVar.a = 0;
            e.a aVar2 = aVar.b;
            if (aVar2 != null) {
                aVar2.g();
            }
            int size = eVar.c.size();
            while (true) {
                size--;
                if (size < 0) {
                    break;
                }
                e eVar2 = (e) eVar.a;
                Objects.requireNonNull(eVar2);
                b0 childViewHolderInt = getChildViewHolderInt(eVar.c.get(size));
                if (childViewHolderInt != null) {
                    childViewHolderInt.onLeftHiddenState(RecyclerView.this);
                }
                eVar.c.remove(size);
            }
            e eVar3 = (e) eVar.a;
            int b2 = eVar3.b();
            for (int i2 = 0; i2 < b2; i2++) {
                View a2 = eVar3.a(i2);
                RecyclerView.this.dispatchChildDetached(a2);
                a2.clearAnimation();
            }
            RecyclerView.this.removeAllViews();
            this.mLayout = nVar;
            if (nVar != null) {
                if (nVar.mRecyclerView == null) {
                    nVar.setRecyclerView(this);
                    if (this.mIsAttached) {
                        this.mLayout.dispatchAttachedToWindow(this);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("LayoutManager ");
                    sb.append(nVar);
                    sb.append(" is already attached to a RecyclerView:");
                    throw new IllegalArgumentException(i0.d.a.a.a.S(nVar.mRecyclerView, sb));
                }
            }
            this.mRecycler.o();
            requestLayout();
        }
    }

    @Deprecated
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        if (layoutTransition == null) {
            super.setLayoutTransition((LayoutTransition) null);
            return;
        }
        throw new IllegalArgumentException("Providing a LayoutTransition into RecyclerView is not supported. Please use setItemAnimator() instead for animating changes to the items in this RecyclerView");
    }

    public void setNestedScrollingEnabled(boolean z2) {
        h0.i.i.i scrollingChildHelper = getScrollingChildHelper();
        if (scrollingChildHelper.d) {
            View view = scrollingChildHelper.c;
            AtomicInteger atomicInteger = h0.i.i.q.a;
            view.stopNestedScroll();
        }
        scrollingChildHelper.d = z2;
    }

    public void setOnFlingListener(q qVar) {
        this.mOnFlingListener = qVar;
    }

    @Deprecated
    public void setOnScrollListener(s sVar) {
        this.mScrollListener = sVar;
    }

    public void setPreserveFocusAfterLayout(boolean z2) {
        this.mPreserveFocusAfterLayout = z2;
    }

    public void setRecycledViewPool(t tVar) {
        u uVar = this.mRecycler;
        t tVar2 = uVar.g;
        if (tVar2 != null) {
            tVar2.b--;
        }
        uVar.g = tVar;
        if (tVar != null && RecyclerView.this.getAdapter() != null) {
            uVar.g.b++;
        }
    }

    @Deprecated
    public void setRecyclerListener(v vVar) {
        this.mRecyclerListener = vVar;
    }

    public void setScrollState(int i2) {
        if (i2 != this.mScrollState) {
            this.mScrollState = i2;
            if (i2 != 2) {
                stopScrollersInternal();
            }
            dispatchOnScrollStateChanged(i2);
        }
    }

    public void setScrollingTouchSlop(int i2) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        if (i2 != 0) {
            if (i2 != 1) {
                Log.w(TAG, "setScrollingTouchSlop(): bad argument constant " + i2 + "; using default value");
            } else {
                this.mTouchSlop = viewConfiguration.getScaledPagingTouchSlop();
                return;
            }
        }
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
    }

    public void setViewCacheExtension(z zVar) {
        Objects.requireNonNull(this.mRecycler);
    }

    public boolean shouldDeferAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        int i2 = 0;
        if (!isComputingLayout()) {
            return false;
        }
        int contentChangeTypes = accessibilityEvent != null ? accessibilityEvent.getContentChangeTypes() : 0;
        if (contentChangeTypes != 0) {
            i2 = contentChangeTypes;
        }
        this.mEatenAccessibilityChangeFlags |= i2;
        return true;
    }

    public void smoothScrollBy(int i2, int i3) {
        smoothScrollBy(i2, i3, (Interpolator) null);
    }

    public void smoothScrollToPosition(int i2) {
        if (!this.mLayoutSuppressed) {
            n nVar = this.mLayout;
            if (nVar == null) {
                Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
            } else {
                nVar.smoothScrollToPosition(this, this.mState, i2);
            }
        }
    }

    public void startInterceptRequestLayout() {
        int i2 = this.mInterceptRequestLayoutDepth + 1;
        this.mInterceptRequestLayoutDepth = i2;
        if (i2 == 1 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
    }

    public boolean startNestedScroll(int i2) {
        return getScrollingChildHelper().h(i2, 0);
    }

    public void stopInterceptRequestLayout(boolean z2) {
        if (this.mInterceptRequestLayoutDepth < 1) {
            this.mInterceptRequestLayoutDepth = 1;
        }
        if (!z2 && !this.mLayoutSuppressed) {
            this.mLayoutWasDefered = false;
        }
        if (this.mInterceptRequestLayoutDepth == 1) {
            if (z2 && this.mLayoutWasDefered && !this.mLayoutSuppressed && this.mLayout != null && this.mAdapter != null) {
                dispatchLayout();
            }
            if (!this.mLayoutSuppressed) {
                this.mLayoutWasDefered = false;
            }
        }
        this.mInterceptRequestLayoutDepth--;
    }

    public void stopNestedScroll() {
        getScrollingChildHelper().i(0);
    }

    public void stopScroll() {
        setScrollState(0);
        stopScrollersInternal();
    }

    public final void suppressLayout(boolean z2) {
        if (z2 != this.mLayoutSuppressed) {
            assertNotInLayoutOrScroll("Do not suppressLayout in layout or scroll");
            if (!z2) {
                this.mLayoutSuppressed = false;
                if (!(!this.mLayoutWasDefered || this.mLayout == null || this.mAdapter == null)) {
                    requestLayout();
                }
                this.mLayoutWasDefered = false;
                return;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            onTouchEvent(MotionEvent.obtain(uptimeMillis, uptimeMillis, 3, 0.0f, 0.0f, 0));
            this.mLayoutSuppressed = true;
            this.mIgnoreMotionEventTillDown = true;
            stopScroll();
        }
    }

    public void swapAdapter(Adapter adapter, boolean z2) {
        setLayoutFrozen(false);
        setAdapterInternal(adapter, true, z2);
        processDataSetCompletelyChanged(true);
        requestLayout();
    }

    public void viewRangeUpdate(int i2, int i3, Object obj) {
        int i4;
        int i5;
        int h2 = this.mChildHelper.h();
        int i6 = i3 + i2;
        for (int i7 = 0; i7 < h2; i7++) {
            View g2 = this.mChildHelper.g(i7);
            b0 childViewHolderInt = getChildViewHolderInt(g2);
            if (childViewHolderInt != null && !childViewHolderInt.shouldIgnore() && (i5 = childViewHolderInt.mPosition) >= i2 && i5 < i6) {
                childViewHolderInt.addFlags(2);
                childViewHolderInt.addChangePayload(obj);
                ((o) g2.getLayoutParams()).c = true;
            }
        }
        u uVar = this.mRecycler;
        int size = uVar.c.size();
        while (true) {
            size--;
            if (size >= 0) {
                b0 b0Var = uVar.c.get(size);
                if (b0Var != null && (i4 = b0Var.mPosition) >= i2 && i4 < i6) {
                    b0Var.addFlags(2);
                    uVar.h(size);
                }
            } else {
                return;
            }
        }
    }

    public static abstract class Adapter<VH extends b0> {
        private boolean mHasStableIds = false;
        private final g mObservable = new g();
        private StateRestorationPolicy mStateRestorationPolicy = StateRestorationPolicy.ALLOW;

        public enum StateRestorationPolicy {
            ALLOW,
            PREVENT_WHEN_EMPTY,
            PREVENT
        }

        public final void bindViewHolder(VH vh, int i) {
            boolean z = vh.mBindingAdapter == null;
            if (z) {
                vh.mPosition = i;
                if (hasStableIds()) {
                    vh.mItemId = getItemId(i);
                }
                vh.setFlags(1, 519);
                int i2 = h0.i.e.f.a;
                Trace.beginSection(RecyclerView.TRACE_BIND_VIEW_TAG);
            }
            vh.mBindingAdapter = this;
            onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
            if (z) {
                vh.clearPayload();
                ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
                if (layoutParams instanceof o) {
                    ((o) layoutParams).c = true;
                }
                int i3 = h0.i.e.f.a;
                Trace.endSection();
            }
        }

        public boolean canRestoreState() {
            int ordinal = this.mStateRestorationPolicy.ordinal();
            if (ordinal != 1) {
                return ordinal != 2;
            }
            if (getItemCount() > 0) {
                return true;
            }
            return false;
        }

        public final VH createViewHolder(ViewGroup viewGroup, int i) {
            try {
                int i2 = h0.i.e.f.a;
                Trace.beginSection(RecyclerView.TRACE_CREATE_VIEW_TAG);
                VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
                if (onCreateViewHolder.itemView.getParent() == null) {
                    onCreateViewHolder.mItemViewType = i;
                    Trace.endSection();
                    return onCreateViewHolder;
                }
                throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
            } catch (Throwable th) {
                int i3 = h0.i.e.f.a;
                Trace.endSection();
                throw th;
            }
        }

        public int findRelativeAdapterPositionIn(Adapter<? extends b0> adapter, b0 b0Var, int i) {
            if (adapter == this) {
                return i;
            }
            return -1;
        }

        public abstract int getItemCount();

        public long getItemId(int i) {
            return -1;
        }

        public int getItemViewType(int i) {
            return 0;
        }

        public final StateRestorationPolicy getStateRestorationPolicy() {
            return this.mStateRestorationPolicy;
        }

        public final boolean hasObservers() {
            return this.mObservable.a();
        }

        public final boolean hasStableIds() {
            return this.mHasStableIds;
        }

        public final void notifyDataSetChanged() {
            this.mObservable.b();
        }

        public final void notifyItemChanged(int i) {
            this.mObservable.d(i, 1, (Object) null);
        }

        public final void notifyItemInserted(int i) {
            this.mObservable.e(i, 1);
        }

        public final void notifyItemMoved(int i, int i2) {
            this.mObservable.c(i, i2);
        }

        public final void notifyItemRangeChanged(int i, int i2) {
            this.mObservable.d(i, i2, (Object) null);
        }

        public final void notifyItemRangeInserted(int i, int i2) {
            this.mObservable.e(i, i2);
        }

        public final void notifyItemRangeRemoved(int i, int i2) {
            this.mObservable.f(i, i2);
        }

        public final void notifyItemRemoved(int i) {
            this.mObservable.f(i, 1);
        }

        public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        }

        public abstract void onBindViewHolder(VH vh, int i);

        public void onBindViewHolder(VH vh, int i, List<Object> list) {
            onBindViewHolder(vh, i);
        }

        public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

        public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        }

        public boolean onFailedToRecycleView(VH vh) {
            return false;
        }

        public void onViewAttachedToWindow(VH vh) {
        }

        public void onViewDetachedFromWindow(VH vh) {
        }

        public void onViewRecycled(VH vh) {
        }

        public void registerAdapterDataObserver(h hVar) {
            this.mObservable.registerObserver(hVar);
        }

        public void setHasStableIds(boolean z) {
            if (!hasObservers()) {
                this.mHasStableIds = z;
                return;
            }
            throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
        }

        public void setStateRestorationPolicy(StateRestorationPolicy stateRestorationPolicy) {
            this.mStateRestorationPolicy = stateRestorationPolicy;
            this.mObservable.g();
        }

        public void unregisterAdapterDataObserver(h hVar) {
            this.mObservable.unregisterObserver(hVar);
        }

        public final void notifyItemChanged(int i, Object obj) {
            this.mObservable.d(i, 1, obj);
        }

        public final void notifyItemRangeChanged(int i, int i2, Object obj) {
            this.mObservable.d(i, i2, obj);
        }
    }

    public RecyclerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.recyclerViewStyle);
    }

    public boolean dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6) {
        return getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, (int[]) null);
    }

    public b0 findViewHolderForPosition(int i2, boolean z2) {
        int h2 = this.mChildHelper.h();
        b0 b0Var = null;
        for (int i3 = 0; i3 < h2; i3++) {
            b0 childViewHolderInt = getChildViewHolderInt(this.mChildHelper.g(i3));
            if (childViewHolderInt != null && !childViewHolderInt.isRemoved()) {
                if (z2) {
                    if (childViewHolderInt.mPosition != i2) {
                        continue;
                    }
                } else if (childViewHolderInt.getLayoutPosition() != i2) {
                    continue;
                }
                if (!this.mChildHelper.k(childViewHolderInt.itemView)) {
                    return childViewHolderInt;
                }
                b0Var = childViewHolderInt;
            }
        }
        return b0Var;
    }

    public void onExitLayoutOrScroll(boolean z2) {
        int i2 = this.mLayoutOrScrollCounter - 1;
        this.mLayoutOrScrollCounter = i2;
        if (i2 < 1) {
            this.mLayoutOrScrollCounter = 0;
            if (z2) {
                dispatchContentChangedIfNecessary();
                dispatchPendingImportantForAccessibilityChanges();
            }
        }
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator) {
        smoothScrollBy(i2, i3, interpolator, Integer.MIN_VALUE);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();
        public Parcelable q;

        public class a implements Parcelable.ClassLoaderCreator<SavedState> {
            public Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            public Object[] newArray(int i) {
                return new SavedState[i];
            }

            public Object createFromParcel(Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.q = parcel.readParcelable(classLoader == null ? n.class.getClassLoader() : classLoader);
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.d, i);
            parcel.writeParcelable(this.q, 0);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public RecyclerView(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        float f2;
        float f3;
        Context context2 = context;
        AttributeSet attributeSet2 = attributeSet;
        int i3 = i2;
        this.mObserver = new w();
        this.mRecycler = new u();
        this.mViewInfoStore = new c0();
        this.mUpdateChildViewsRunnable = new a();
        this.mTempRect = new Rect();
        this.mTempRect2 = new Rect();
        this.mTempRectF = new RectF();
        this.mRecyclerListeners = new ArrayList();
        this.mItemDecorations = new ArrayList<>();
        this.mOnItemTouchListeners = new ArrayList<>();
        this.mInterceptRequestLayoutDepth = 0;
        this.mDataSetHasChangedAfterLayout = false;
        this.mDispatchItemsChangedEvent = false;
        this.mLayoutOrScrollCounter = 0;
        this.mDispatchScrollCounter = 0;
        this.mEdgeEffectFactory = new j();
        this.mItemAnimator = new h0.v.a.f();
        this.mScrollState = 0;
        this.mScrollPointerId = -1;
        this.mScaledHorizontalScrollFactor = Float.MIN_VALUE;
        this.mScaledVerticalScrollFactor = Float.MIN_VALUE;
        this.mPreserveFocusAfterLayout = true;
        this.mViewFlinger = new a0();
        this.mPrefetchRegistry = ALLOW_THREAD_GAP_WORK ? new j.b() : null;
        this.mState = new y();
        this.mItemsAddedOrRemoved = false;
        this.mItemsChanged = false;
        this.mItemAnimatorListener = new l();
        this.mPostedAnimatorRunner = false;
        this.mMinMaxLayoutPositions = new int[2];
        this.mScrollOffset = new int[2];
        this.mNestedOffsets = new int[2];
        this.mReusableIntPair = new int[2];
        this.mPendingAccessibilityImportanceChange = new ArrayList();
        this.mItemAnimatorRunner = new b();
        this.mLastAutoMeasureNonExactMeasuredWidth = 0;
        this.mLastAutoMeasureNonExactMeasuredHeight = 0;
        this.mViewInfoProcessCallback = new d();
        setScrollContainer(true);
        setFocusableInTouchMode(true);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        this.mTouchSlop = viewConfiguration.getScaledTouchSlop();
        Method method = h0.i.i.v.a;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 26) {
            f2 = viewConfiguration.getScaledHorizontalScrollFactor();
        } else {
            f2 = h0.i.i.v.a(viewConfiguration, context2);
        }
        this.mScaledHorizontalScrollFactor = f2;
        if (i4 >= 26) {
            f3 = viewConfiguration.getScaledVerticalScrollFactor();
        } else {
            f3 = h0.i.i.v.a(viewConfiguration, context2);
        }
        this.mScaledVerticalScrollFactor = f3;
        this.mMinFlingVelocity = viewConfiguration.getScaledMinimumFlingVelocity();
        this.mMaxFlingVelocity = viewConfiguration.getScaledMaximumFlingVelocity();
        setWillNotDraw(getOverScrollMode() == 2);
        this.mItemAnimator.setListener(this.mItemAnimatorListener);
        initAdapterManager();
        initChildrenHelper();
        initAutofill();
        AtomicInteger atomicInteger = h0.i.i.q.a;
        if (getImportantForAccessibility() == 0) {
            setImportantForAccessibility(1);
        }
        this.mAccessibilityManager = (AccessibilityManager) getContext().getSystemService("accessibility");
        setAccessibilityDelegateCompat(new h0.v.a.x(this));
        int[] iArr = R.styleable.RecyclerView;
        TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(attributeSet2, iArr, i3, 0);
        h0.i.i.q.o(this, context, iArr, attributeSet, obtainStyledAttributes, i2, 0);
        String string = obtainStyledAttributes.getString(R.styleable.RecyclerView_layoutManager);
        if (obtainStyledAttributes.getInt(R.styleable.RecyclerView_android_descendantFocusability, -1) == -1) {
            setDescendantFocusability(262144);
        }
        this.mClipToPadding = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_android_clipToPadding, true);
        boolean z2 = obtainStyledAttributes.getBoolean(R.styleable.RecyclerView_fastScrollEnabled, false);
        this.mEnableFastScroller = z2;
        if (z2) {
            initFastScroller((StateListDrawable) obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollVerticalThumbDrawable), obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollVerticalTrackDrawable), (StateListDrawable) obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollHorizontalThumbDrawable), obtainStyledAttributes.getDrawable(R.styleable.RecyclerView_fastScrollHorizontalTrackDrawable));
        }
        obtainStyledAttributes.recycle();
        createLayoutManager(context, string, attributeSet, i2, 0);
        int[] iArr2 = NESTED_SCROLLING_ATTRS;
        TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(attributeSet2, iArr2, i3, 0);
        h0.i.i.q.o(this, context, iArr2, attributeSet, obtainStyledAttributes2, i2, 0);
        boolean z3 = obtainStyledAttributes2.getBoolean(0, true);
        obtainStyledAttributes2.recycle();
        setNestedScrollingEnabled(z3);
    }

    public boolean dispatchNestedPreScroll(int i2, int i3, int[] iArr, int[] iArr2, int i4) {
        return getScrollingChildHelper().c(i2, i3, iArr, iArr2, i4);
    }

    public boolean hasNestedScrollingParent(int i2) {
        return getScrollingChildHelper().f(i2) != null;
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4) {
        smoothScrollBy(i2, i3, interpolator, i4, false);
    }

    public boolean startNestedScroll(int i2, int i3) {
        return getScrollingChildHelper().h(i2, i3);
    }

    public void stopNestedScroll(int i2) {
        getScrollingChildHelper().i(i2);
    }

    public static class o extends ViewGroup.MarginLayoutParams {
        public b0 a;
        public final Rect b = new Rect();
        public boolean c = true;
        public boolean d = false;

        public o(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public int a() {
            return this.a.getLayoutPosition();
        }

        public boolean b() {
            return this.a.isUpdated();
        }

        public boolean c() {
            return this.a.isRemoved();
        }

        public o(int i, int i2) {
            super(i, i2);
        }

        public o(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }

        public o(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public o(o oVar) {
            super(oVar);
        }
    }

    public final void dispatchNestedScroll(int i2, int i3, int i4, int i5, int[] iArr, int i6, int[] iArr2) {
        getScrollingChildHelper().e(i2, i3, i4, i5, iArr, i6, iArr2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        n nVar = this.mLayout;
        if (nVar != null) {
            return nVar.generateLayoutParams(layoutParams);
        }
        throw new IllegalStateException(i0.d.a.a.a.S(this, i0.d.a.a.a.P0("RecyclerView has no LayoutManager")));
    }

    public void smoothScrollBy(int i2, int i3, Interpolator interpolator, int i4, boolean z2) {
        n nVar = this.mLayout;
        if (nVar == null) {
            Log.e(TAG, "Cannot smooth scroll without a LayoutManager set. Call setLayoutManager with a non-null argument.");
        } else if (!this.mLayoutSuppressed) {
            int i5 = 0;
            if (!nVar.canScrollHorizontally()) {
                i2 = 0;
            }
            if (!this.mLayout.canScrollVertically()) {
                i3 = 0;
            }
            if (i2 != 0 || i3 != 0) {
                if (i4 == Integer.MIN_VALUE || i4 > 0) {
                    if (z2) {
                        if (i2 != 0) {
                            i5 = 1;
                        }
                        if (i3 != 0) {
                            i5 |= 2;
                        }
                        startNestedScroll(i5, 1);
                    }
                    this.mViewFlinger.b(i2, i3, i4, interpolator);
                    return;
                }
                scrollBy(i2, i3);
            }
        }
    }

    public void addItemDecoration(m mVar) {
        addItemDecoration(mVar, -1);
    }
}
