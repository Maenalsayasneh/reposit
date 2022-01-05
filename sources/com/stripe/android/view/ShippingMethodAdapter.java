package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\n\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00011B\u0007¢\u0006\u0004\b/\u00100J\u000f\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016R*\u0010\u0019\u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00038\u0000@@X\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0005\"\u0004\b\u001c\u0010\u001dR\u0015\u0010 \u001a\u0004\u0018\u00010\u00138F@\u0006¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR.\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00100!8\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R6\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00130(2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130(8\u0000@@X\u000e¢\u0006\u0012\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.¨\u00062"}, d2 = {"Lcom/stripe/android/view/ShippingMethodAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;", "", "getItemCount", "()I", "position", "", "getItemId", "(I)J", "Landroid/view/ViewGroup;", "viewGroup", "i", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;", "holder", "Lm0/i;", "onBindViewHolder", "(Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;I)V", "Lcom/stripe/android/model/ShippingMethod;", "shippingMethod", "setSelected$payments_core_release", "(Lcom/stripe/android/model/ShippingMethod;)V", "setSelected", "value", "selectedIndex", "I", "getSelectedIndex$payments_core_release", "setSelectedIndex$payments_core_release", "(I)V", "getSelectedShippingMethod", "()Lcom/stripe/android/model/ShippingMethod;", "selectedShippingMethod", "Lkotlin/Function1;", "onShippingMethodSelectedCallback", "Lm0/n/a/l;", "getOnShippingMethodSelectedCallback$payments_core_release", "()Lm0/n/a/l;", "setOnShippingMethodSelectedCallback$payments_core_release", "(Lm0/n/a/l;)V", "", "shippingMethods", "Ljava/util/List;", "getShippingMethods$payments_core_release", "()Ljava/util/List;", "setShippingMethods$payments_core_release", "(Ljava/util/List;)V", "<init>", "()V", "ShippingMethodViewHolder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ShippingMethodAdapter.kt */
public final class ShippingMethodAdapter extends RecyclerView.Adapter<ShippingMethodViewHolder> {
    private l<? super ShippingMethod, i> onShippingMethodSelectedCallback = ShippingMethodAdapter$onShippingMethodSelectedCallback$1.INSTANCE;
    private /* synthetic */ int selectedIndex;
    private List<ShippingMethod> shippingMethods = EmptyList.c;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\f\u001a\u00020\u000b8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/stripe/android/view/ShippingMethodAdapter$ShippingMethodViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$b0;", "Lcom/stripe/android/model/ShippingMethod;", "shippingMethod", "Lm0/i;", "setShippingMethod", "(Lcom/stripe/android/model/ShippingMethod;)V", "", "selected", "setSelected", "(Z)V", "Lcom/stripe/android/view/ShippingMethodView;", "shippingMethodView", "Lcom/stripe/android/view/ShippingMethodView;", "getShippingMethodView$payments_core_release", "()Lcom/stripe/android/view/ShippingMethodView;", "<init>", "(Lcom/stripe/android/view/ShippingMethodView;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ShippingMethodAdapter.kt */
    public static final class ShippingMethodViewHolder extends RecyclerView.b0 {
        private final ShippingMethodView shippingMethodView;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ShippingMethodViewHolder(ShippingMethodView shippingMethodView2) {
            super(shippingMethodView2);
            m0.n.b.i.e(shippingMethodView2, "shippingMethodView");
            this.shippingMethodView = shippingMethodView2;
        }

        public final ShippingMethodView getShippingMethodView$payments_core_release() {
            return this.shippingMethodView;
        }

        public final void setSelected(boolean z) {
            this.shippingMethodView.setSelected(z);
        }

        public final void setShippingMethod(ShippingMethod shippingMethod) {
            m0.n.b.i.e(shippingMethod, "shippingMethod");
            this.shippingMethodView.setShippingMethod(shippingMethod);
        }
    }

    public ShippingMethodAdapter() {
        setHasStableIds(true);
    }

    public int getItemCount() {
        return this.shippingMethods.size();
    }

    public long getItemId(int i) {
        return (long) this.shippingMethods.get(i).hashCode();
    }

    public final l<ShippingMethod, i> getOnShippingMethodSelectedCallback$payments_core_release() {
        return this.onShippingMethodSelectedCallback;
    }

    public final int getSelectedIndex$payments_core_release() {
        return this.selectedIndex;
    }

    public final ShippingMethod getSelectedShippingMethod() {
        return (ShippingMethod) g.z(this.shippingMethods, this.selectedIndex);
    }

    public final List<ShippingMethod> getShippingMethods$payments_core_release() {
        return this.shippingMethods;
    }

    public final void setOnShippingMethodSelectedCallback$payments_core_release(l<? super ShippingMethod, i> lVar) {
        m0.n.b.i.e(lVar, "<set-?>");
        this.onShippingMethodSelectedCallback = lVar;
    }

    public final void setSelected$payments_core_release(ShippingMethod shippingMethod) {
        m0.n.b.i.e(shippingMethod, "shippingMethod");
        setSelectedIndex$payments_core_release(this.shippingMethods.indexOf(shippingMethod));
    }

    public final void setSelectedIndex$payments_core_release(int i) {
        int i2 = this.selectedIndex;
        if (i2 != i) {
            notifyItemChanged(i2);
            notifyItemChanged(i);
            this.selectedIndex = i;
            this.onShippingMethodSelectedCallback.invoke(this.shippingMethods.get(i));
        }
    }

    public final void setShippingMethods$payments_core_release(List<ShippingMethod> list) {
        m0.n.b.i.e(list, InstabugDbContract.UserAttributesEntry.COLUMN_VALUE);
        setSelectedIndex$payments_core_release(0);
        this.shippingMethods = list;
        notifyDataSetChanged();
    }

    public void onBindViewHolder(ShippingMethodViewHolder shippingMethodViewHolder, int i) {
        m0.n.b.i.e(shippingMethodViewHolder, "holder");
        shippingMethodViewHolder.setShippingMethod(this.shippingMethods.get(i));
        shippingMethodViewHolder.setSelected(i == this.selectedIndex);
        shippingMethodViewHolder.getShippingMethodView$payments_core_release().setOnClickListener(new ShippingMethodAdapter$onBindViewHolder$1(this, shippingMethodViewHolder));
    }

    public ShippingMethodViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        m0.n.b.i.e(viewGroup, "viewGroup");
        Context context = viewGroup.getContext();
        m0.n.b.i.d(context, "viewGroup.context");
        return new ShippingMethodViewHolder(new ShippingMethodView(context, (AttributeSet) null, 0, 6, (f) null));
    }
}
