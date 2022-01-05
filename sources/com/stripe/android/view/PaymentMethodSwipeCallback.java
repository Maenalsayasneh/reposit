package com.stripe.android.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.R;
import com.stripe.android.model.PaymentMethod;
import com.stripe.android.view.PaymentMethodsAdapter;
import h0.i.b.a;
import h0.v.a.k;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 62\u00020\u0001:\u000267B\u001f\u0012\u0006\u00103\u001a\u000202\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b4\u00105J/\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ'\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0018\u0010\u0019JG\u0010\u001d\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0016\u0010!\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010$\u001a\u00020#8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010&\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b&\u0010\"R\u0016\u0010'\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b'\u0010\"R\u0016\u0010)\u001a\u00020(8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u0010.\u001a\u00020\u00048\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b.\u0010\"R\u0016\u00100\u001a\u00020/8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b0\u00101¨\u00068"}, d2 = {"Lcom/stripe/android/view/PaymentMethodSwipeCallback;", "Lh0/v/a/k$g;", "Landroid/view/View;", "itemView", "", "dX", "", "transitionFraction", "Landroid/graphics/Canvas;", "canvas", "Lm0/i;", "updateSwipedPaymentMethod", "(Landroid/view/View;IFLandroid/graphics/Canvas;)V", "Landroidx/recyclerview/widget/RecyclerView;", "recyclerView", "Landroidx/recyclerview/widget/RecyclerView$b0;", "viewHolder", "target", "", "onMove", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$b0;Landroidx/recyclerview/widget/RecyclerView$b0;)Z", "direction", "onSwiped", "(Landroidx/recyclerview/widget/RecyclerView$b0;I)V", "getSwipeDirs", "(Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$b0;)I", "dY", "actionState", "isCurrentlyActive", "onChildDraw", "(Landroid/graphics/Canvas;Landroidx/recyclerview/widget/RecyclerView;Landroidx/recyclerview/widget/RecyclerView$b0;FFIZ)V", "getSwipeThreshold", "(Landroidx/recyclerview/widget/RecyclerView$b0;)F", "swipeStartColor", "I", "Landroid/graphics/drawable/Drawable;", "trashIcon", "Landroid/graphics/drawable/Drawable;", "swipeThresholdColor", "iconStartOffset", "Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;", "listener", "Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "adapter", "Lcom/stripe/android/view/PaymentMethodsAdapter;", "itemViewStartPadding", "Landroid/graphics/drawable/ColorDrawable;", "background", "Landroid/graphics/drawable/ColorDrawable;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;Lcom/stripe/android/view/PaymentMethodsAdapter;Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;)V", "Companion", "Listener", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentMethodSwipeCallback.kt */
public final class PaymentMethodSwipeCallback extends k.g {
    public static final Companion Companion = new Companion((f) null);
    private static final float END_TRANSITION_THRESHOLD = 0.5f;
    private static final float START_TRANSITION_THRESHOLD = 0.25f;
    private final PaymentMethodsAdapter adapter;
    private final ColorDrawable background;
    private final int iconStartOffset;
    private final int itemViewStartPadding;
    private final Listener listener;
    private final int swipeStartColor;
    private final int swipeThresholdColor;
    private final Drawable trashIcon;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\r\u0010\u000eJ+\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0006\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\u000f"}, d2 = {"Lcom/stripe/android/view/PaymentMethodSwipeCallback$Companion;", "", "", "fraction", "", "startValue", "endValue", "calculateTransitionColor$payments_core_release", "(FII)I", "calculateTransitionColor", "END_TRANSITION_THRESHOLD", "F", "START_TRANSITION_THRESHOLD", "<init>", "()V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodSwipeCallback.kt */
    public static final class Companion {
        private Companion() {
        }

        public final int calculateTransitionColor$payments_core_release(float f, int i, int i2) {
            int alpha = Color.alpha(i);
            int red = Color.red(i);
            int green = Color.green(i);
            int blue = Color.blue(i);
            return Color.argb((int) (((float) alpha) + (((float) (Color.alpha(i2) - alpha)) * f)), (int) (((float) red) + (((float) (Color.red(i2) - red)) * f)), (int) (((float) green) + (((float) (Color.green(i2) - green)) * f)), (int) (((float) blue) + (((float) (Color.blue(i2) - blue)) * f)));
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/stripe/android/view/PaymentMethodSwipeCallback$Listener;", "", "Lcom/stripe/android/model/PaymentMethod;", "paymentMethod", "Lm0/i;", "onSwiped", "(Lcom/stripe/android/model/PaymentMethod;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentMethodSwipeCallback.kt */
    public interface Listener {
        void onSwiped(PaymentMethod paymentMethod);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PaymentMethodSwipeCallback(Context context, PaymentMethodsAdapter paymentMethodsAdapter, Listener listener2) {
        super(0, 8);
        i.e(context, "context");
        i.e(paymentMethodsAdapter, "adapter");
        i.e(listener2, "listener");
        this.adapter = paymentMethodsAdapter;
        this.listener = listener2;
        Drawable drawable = a.getDrawable(context, R.drawable.stripe_ic_trash);
        i.c(drawable);
        i.d(drawable, "ContextCompat.getDrawabl…awable.stripe_ic_trash)!!");
        this.trashIcon = drawable;
        int color = a.getColor(context, R.color.stripe_swipe_start_payment_method);
        this.swipeStartColor = color;
        this.swipeThresholdColor = a.getColor(context, R.color.stripe_swipe_threshold_payment_method);
        this.background = new ColorDrawable(color);
        this.itemViewStartPadding = drawable.getIntrinsicWidth() / 2;
        this.iconStartOffset = context.getResources().getDimensionPixelSize(R.dimen.stripe_list_row_start_padding);
    }

    private final void updateSwipedPaymentMethod(View view, int i, float f, Canvas canvas) {
        int i2;
        int height = ((view.getHeight() - this.trashIcon.getIntrinsicHeight()) / 2) + view.getTop();
        int intrinsicHeight = this.trashIcon.getIntrinsicHeight() + height;
        if (i > 0) {
            int left = view.getLeft() + this.iconStartOffset;
            int intrinsicWidth = this.trashIcon.getIntrinsicWidth() + left;
            if (i > intrinsicWidth) {
                this.trashIcon.setBounds(left, height, intrinsicWidth, intrinsicHeight);
            } else {
                this.trashIcon.setBounds(0, 0, 0, 0);
            }
            this.background.setBounds(view.getLeft(), view.getTop(), view.getLeft() + i + this.itemViewStartPadding, view.getBottom());
            ColorDrawable colorDrawable = this.background;
            if (f <= 0.0f) {
                i2 = this.swipeStartColor;
            } else if (f >= 1.0f) {
                i2 = this.swipeThresholdColor;
            } else {
                i2 = Companion.calculateTransitionColor$payments_core_release(f, this.swipeStartColor, this.swipeThresholdColor);
            }
            colorDrawable.setColor(i2);
        } else {
            this.trashIcon.setBounds(0, 0, 0, 0);
            this.background.setBounds(0, 0, 0, 0);
        }
        this.background.draw(canvas);
        this.trashIcon.draw(canvas);
    }

    public int getSwipeDirs(RecyclerView recyclerView, RecyclerView.b0 b0Var) {
        i.e(recyclerView, "recyclerView");
        i.e(b0Var, "viewHolder");
        if (b0Var instanceof PaymentMethodsAdapter.ViewHolder.PaymentMethodViewHolder) {
            return super.getSwipeDirs(recyclerView, b0Var);
        }
        return 0;
    }

    public float getSwipeThreshold(RecyclerView.b0 b0Var) {
        i.e(b0Var, "viewHolder");
        return END_TRANSITION_THRESHOLD;
    }

    public void onChildDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.b0 b0Var, float f, float f2, int i, boolean z) {
        i.e(canvas, "canvas");
        i.e(recyclerView, "recyclerView");
        i.e(b0Var, "viewHolder");
        super.onChildDraw(canvas, recyclerView, b0Var, f, f2, i, z);
        if (b0Var instanceof PaymentMethodsAdapter.ViewHolder.PaymentMethodViewHolder) {
            View view = b0Var.itemView;
            i.d(view, "viewHolder.itemView");
            float width = ((float) view.getWidth()) * START_TRANSITION_THRESHOLD;
            float width2 = ((float) view.getWidth()) * END_TRANSITION_THRESHOLD;
            updateSwipedPaymentMethod(view, (int) f, f < width ? 0.0f : f >= width2 ? 1.0f : (f - width) / (width2 - width), canvas);
        }
    }

    public boolean onMove(RecyclerView recyclerView, RecyclerView.b0 b0Var, RecyclerView.b0 b0Var2) {
        i.e(recyclerView, "recyclerView");
        i.e(b0Var, "viewHolder");
        i.e(b0Var2, "target");
        return true;
    }

    public void onSwiped(RecyclerView.b0 b0Var, int i) {
        i.e(b0Var, "viewHolder");
        this.listener.onSwiped(this.adapter.getPaymentMethodAtPosition$payments_core_release(b0Var.getBindingAdapterPosition()));
    }
}
