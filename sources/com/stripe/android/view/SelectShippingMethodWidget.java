package com.stripe.android.view;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.databinding.ShippingMethodWidgetBinding;
import com.stripe.android.model.ShippingMethod;
import java.util.List;
import kotlin.Metadata;
import m0.n.a.l;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u0006\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0015\u0010\u0011\u001a\u0004\u0018\u00010\u00038F@\u0006¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u001d"}, d2 = {"Lcom/stripe/android/view/SelectShippingMethodWidget;", "Landroid/widget/FrameLayout;", "Lkotlin/Function1;", "Lcom/stripe/android/model/ShippingMethod;", "Lm0/i;", "callback", "setShippingMethodSelectedCallback", "(Lm0/n/a/l;)V", "", "shippingMethods", "setShippingMethods", "(Ljava/util/List;)V", "shippingMethod", "setSelectedShippingMethod", "(Lcom/stripe/android/model/ShippingMethod;)V", "getSelectedShippingMethod", "()Lcom/stripe/android/model/ShippingMethod;", "selectedShippingMethod", "Lcom/stripe/android/view/ShippingMethodAdapter;", "shippingMethodAdapter", "Lcom/stripe/android/view/ShippingMethodAdapter;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: SelectShippingMethodWidget.kt */
public final class SelectShippingMethodWidget extends FrameLayout {
    private final ShippingMethodAdapter shippingMethodAdapter;

    public SelectShippingMethodWidget(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public final ShippingMethod getSelectedShippingMethod() {
        return this.shippingMethodAdapter.getSelectedShippingMethod();
    }

    public final void setSelectedShippingMethod(ShippingMethod shippingMethod) {
        i.e(shippingMethod, "shippingMethod");
        this.shippingMethodAdapter.setSelected$payments_core_release(shippingMethod);
    }

    public final void setShippingMethodSelectedCallback(l<? super ShippingMethod, m0.i> lVar) {
        i.e(lVar, "callback");
        this.shippingMethodAdapter.setOnShippingMethodSelectedCallback$payments_core_release(lVar);
    }

    public final void setShippingMethods(List<ShippingMethod> list) {
        i.e(list, "shippingMethods");
        this.shippingMethodAdapter.setShippingMethods$payments_core_release(list);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public SelectShippingMethodWidget(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        i.e(context, "context");
        ShippingMethodAdapter shippingMethodAdapter2 = new ShippingMethodAdapter();
        this.shippingMethodAdapter = shippingMethodAdapter2;
        ShippingMethodWidgetBinding inflate = ShippingMethodWidgetBinding.inflate(LayoutInflater.from(context), this);
        i.d(inflate, "ShippingMethodWidgetBind…           this\n        )");
        RecyclerView recyclerView = inflate.shippingMethods;
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(shippingMethodAdapter2);
        recyclerView.setLayoutManager(new LinearLayoutManager(context));
    }
}
