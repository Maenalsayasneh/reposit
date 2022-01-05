package com.stripe.android.view;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.PaymentSessionConfig;
import com.stripe.android.model.ShippingInformation;
import com.stripe.android.model.ShippingMethod;
import h0.f0.a.a;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import m0.i;
import m0.j.g;
import m0.n.a.l;
import m0.n.b.f;
import m0.o.d;
import m0.r.k;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u00002\u00020\u0001:\u0001NB=\u0012\u0006\u0010?\u001a\u00020>\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\u000e\b\u0002\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A\u0012\u0014\b\u0002\u00102\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\n01¢\u0006\u0004\bL\u0010MJ\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\t\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0016\u0010\u001f\u001a\u00020\u001e8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R7\u0010*\u001a\b\u0012\u0004\u0012\u00020\"0!2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0!8@@@X\u0002¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R/\u00100\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"8@@@X\u0002¢\u0006\u0012\n\u0004\b+\u0010%\u001a\u0004\b,\u0010-\"\u0004\b.\u0010/R\"\u00102\u001a\u000e\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\n018\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b2\u00103R.\u00106\u001a\u0004\u0018\u0001042\b\u00105\u001a\u0004\u0018\u0001048\u0000@@X\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000f0!8B@\u0002X\u0004¢\u0006\u0006\u001a\u0004\b<\u0010'R\u0016\u0010?\u001a\u00020>8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001c\u0010C\u001a\b\u0012\u0004\u0012\u00020B0A8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u00020\u00158\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\bE\u0010FR*\u0010G\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00158\u0000@@X\u000e¢\u0006\u0012\n\u0004\bG\u0010F\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010K¨\u0006O"}, d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter;", "Lh0/f0/a/a;", "Landroid/view/ViewGroup;", "collection", "", "position", "", "instantiateItem", "(Landroid/view/ViewGroup;I)Ljava/lang/Object;", "view", "Lm0/i;", "destroyItem", "(Landroid/view/ViewGroup;ILjava/lang/Object;)V", "getCount", "()I", "Lcom/stripe/android/view/PaymentFlowPage;", "getPageAt$payments_core_release", "(I)Lcom/stripe/android/view/PaymentFlowPage;", "getPageAt", "Landroid/view/View;", "o", "", "isViewFromObject", "(Landroid/view/View;Ljava/lang/Object;)Z", "", "getPageTitle", "(I)Ljava/lang/CharSequence;", "obj", "getItemPosition", "(Ljava/lang/Object;)I", "Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionConfig", "Lcom/stripe/android/PaymentSessionConfig;", "", "Lcom/stripe/android/model/ShippingMethod;", "<set-?>", "shippingMethods$delegate", "Lm0/o/d;", "getShippingMethods$payments_core_release", "()Ljava/util/List;", "setShippingMethods$payments_core_release", "(Ljava/util/List;)V", "shippingMethods", "selectedShippingMethod$delegate", "getSelectedShippingMethod$payments_core_release", "()Lcom/stripe/android/model/ShippingMethod;", "setSelectedShippingMethod$payments_core_release", "(Lcom/stripe/android/model/ShippingMethod;)V", "selectedShippingMethod", "Lkotlin/Function1;", "onShippingMethodSelectedCallback", "Lm0/n/a/l;", "Lcom/stripe/android/model/ShippingInformation;", "value", "shippingInformation", "Lcom/stripe/android/model/ShippingInformation;", "getShippingInformation$payments_core_release", "()Lcom/stripe/android/model/ShippingInformation;", "setShippingInformation$payments_core_release", "(Lcom/stripe/android/model/ShippingInformation;)V", "getPages", "pages", "Landroid/content/Context;", "context", "Landroid/content/Context;", "", "", "allowedShippingCountryCodes", "Ljava/util/Set;", "shouldRecreateShippingMethodsScreen", "Z", "isShippingInfoSubmitted", "isShippingInfoSubmitted$payments_core_release", "()Z", "setShippingInfoSubmitted$payments_core_release", "(Z)V", "<init>", "(Landroid/content/Context;Lcom/stripe/android/PaymentSessionConfig;Ljava/util/Set;Lm0/n/a/l;)V", "PaymentFlowViewHolder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: PaymentFlowPagerAdapter.kt */
public final class PaymentFlowPagerAdapter extends a {
    public static final /* synthetic */ k[] $$delegatedProperties;
    private final Set<String> allowedShippingCountryCodes;
    private final Context context;
    private boolean isShippingInfoSubmitted;
    private final l<ShippingMethod, i> onShippingMethodSelectedCallback;
    private final PaymentSessionConfig paymentSessionConfig;
    private final d selectedShippingMethod$delegate;
    private ShippingInformation shippingInformation;
    private final d shippingMethods$delegate;
    /* access modifiers changed from: private */
    public boolean shouldRecreateShippingMethodsScreen;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\u0006\u0007B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$b0;", "Landroid/view/View;", "itemView", "<init>", "(Landroid/view/View;)V", "ShippingInformationViewHolder", "ShippingMethodViewHolder", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingInformationViewHolder;", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingMethodViewHolder;", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: PaymentFlowPagerAdapter.kt */
    public static abstract class PaymentFlowViewHolder extends RecyclerView.b0 {
        public /* synthetic */ PaymentFlowViewHolder(View view, f fVar) {
            this(view);
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012B\u0011\b\u0016\u0012\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0011\u0010\u0015J-\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u0016"}, d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingInformationViewHolder;", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder;", "Lcom/stripe/android/PaymentSessionConfig;", "paymentSessionConfig", "Lcom/stripe/android/model/ShippingInformation;", "shippingInformation", "", "", "allowedShippingCountryCodes", "Lm0/i;", "bind", "(Lcom/stripe/android/PaymentSessionConfig;Lcom/stripe/android/model/ShippingInformation;Ljava/util/Set;)V", "Lcom/stripe/android/view/ShippingInfoWidget;", "shippingInfoWidget", "Lcom/stripe/android/view/ShippingInfoWidget;", "Lcom/stripe/android/databinding/ShippingInfoPageBinding;", "viewBinding", "<init>", "(Lcom/stripe/android/databinding/ShippingInfoPageBinding;)V", "Landroid/view/ViewGroup;", "root", "(Landroid/view/ViewGroup;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentFlowPagerAdapter.kt */
        public static final class ShippingInformationViewHolder extends PaymentFlowViewHolder {
            private final ShippingInfoWidget shippingInfoWidget;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public ShippingInformationViewHolder(com.stripe.android.databinding.ShippingInfoPageBinding r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    m0.n.b.i.e(r3, r0)
                    android.widget.ScrollView r0 = r3.getRoot()
                    java.lang.String r1 = "viewBinding.root"
                    m0.n.b.i.d(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    com.stripe.android.view.ShippingInfoWidget r3 = r3.shippingInfoWidget
                    java.lang.String r0 = "viewBinding.shippingInfoWidget"
                    m0.n.b.i.d(r3, r0)
                    r2.shippingInfoWidget = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentFlowPagerAdapter.PaymentFlowViewHolder.ShippingInformationViewHolder.<init>(com.stripe.android.databinding.ShippingInfoPageBinding):void");
            }

            public final void bind(PaymentSessionConfig paymentSessionConfig, ShippingInformation shippingInformation, Set<String> set) {
                m0.n.b.i.e(paymentSessionConfig, "paymentSessionConfig");
                m0.n.b.i.e(set, "allowedShippingCountryCodes");
                this.shippingInfoWidget.setHiddenFields(paymentSessionConfig.getHiddenShippingInfoFields());
                this.shippingInfoWidget.setOptionalFields(paymentSessionConfig.getOptionalShippingInfoFields());
                this.shippingInfoWidget.setAllowedCountryCodes(set);
                this.shippingInfoWidget.populateShippingInfo(shippingInformation);
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public ShippingInformationViewHolder(android.view.ViewGroup r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "root"
                    m0.n.b.i.e(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    com.stripe.android.databinding.ShippingInfoPageBinding r3 = com.stripe.android.databinding.ShippingInfoPageBinding.inflate(r0, r3, r1)
                    java.lang.String r0 = "ShippingInfoPageBinding.…  false\n                )"
                    m0.n.b.i.d(r3, r0)
                    r2.<init>((com.stripe.android.databinding.ShippingInfoPageBinding) r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentFlowPagerAdapter.PaymentFlowViewHolder.ShippingInformationViewHolder.<init>(android.view.ViewGroup):void");
            }
        }

        @Metadata(bv = {1, 0, 3}, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J9\u0010\t\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u0015"}, d2 = {"Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder$ShippingMethodViewHolder;", "Lcom/stripe/android/view/PaymentFlowPagerAdapter$PaymentFlowViewHolder;", "", "Lcom/stripe/android/model/ShippingMethod;", "shippingMethods", "selectedShippingMethod", "Lkotlin/Function1;", "Lm0/i;", "onShippingMethodSelectedCallback", "bind", "(Ljava/util/List;Lcom/stripe/android/model/ShippingMethod;Lm0/n/a/l;)V", "Lcom/stripe/android/view/SelectShippingMethodWidget;", "shippingMethodWidget", "Lcom/stripe/android/view/SelectShippingMethodWidget;", "Lcom/stripe/android/databinding/ShippingMethodPageBinding;", "viewBinding", "<init>", "(Lcom/stripe/android/databinding/ShippingMethodPageBinding;)V", "Landroid/view/ViewGroup;", "root", "(Landroid/view/ViewGroup;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
        /* compiled from: PaymentFlowPagerAdapter.kt */
        public static final class ShippingMethodViewHolder extends PaymentFlowViewHolder {
            private final SelectShippingMethodWidget shippingMethodWidget;

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public ShippingMethodViewHolder(com.stripe.android.databinding.ShippingMethodPageBinding r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "viewBinding"
                    m0.n.b.i.e(r3, r0)
                    android.widget.FrameLayout r0 = r3.getRoot()
                    java.lang.String r1 = "viewBinding.root"
                    m0.n.b.i.d(r0, r1)
                    r1 = 0
                    r2.<init>(r0, r1)
                    com.stripe.android.view.SelectShippingMethodWidget r3 = r3.selectShippingMethodWidget
                    java.lang.String r0 = "viewBinding.selectShippingMethodWidget"
                    m0.n.b.i.d(r3, r0)
                    r2.shippingMethodWidget = r3
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentFlowPagerAdapter.PaymentFlowViewHolder.ShippingMethodViewHolder.<init>(com.stripe.android.databinding.ShippingMethodPageBinding):void");
            }

            public final void bind(List<ShippingMethod> list, ShippingMethod shippingMethod, l<? super ShippingMethod, i> lVar) {
                m0.n.b.i.e(list, "shippingMethods");
                m0.n.b.i.e(lVar, "onShippingMethodSelectedCallback");
                this.shippingMethodWidget.setShippingMethods(list);
                this.shippingMethodWidget.setShippingMethodSelectedCallback(lVar);
                if (shippingMethod != null) {
                    this.shippingMethodWidget.setSelectedShippingMethod(shippingMethod);
                }
            }

            /* JADX WARNING: Illegal instructions before constructor call */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public ShippingMethodViewHolder(android.view.ViewGroup r3) {
                /*
                    r2 = this;
                    java.lang.String r0 = "root"
                    m0.n.b.i.e(r3, r0)
                    android.content.Context r0 = r3.getContext()
                    android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
                    r1 = 0
                    com.stripe.android.databinding.ShippingMethodPageBinding r3 = com.stripe.android.databinding.ShippingMethodPageBinding.inflate(r0, r3, r1)
                    java.lang.String r0 = "ShippingMethodPageBindin…  false\n                )"
                    m0.n.b.i.d(r3, r0)
                    r2.<init>((com.stripe.android.databinding.ShippingMethodPageBinding) r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.stripe.android.view.PaymentFlowPagerAdapter.PaymentFlowViewHolder.ShippingMethodViewHolder.<init>(android.view.ViewGroup):void");
            }
        }

        private PaymentFlowViewHolder(View view) {
            super(view);
        }
    }

    @Metadata(bv = {1, 0, 3}, d1 = {}, d2 = {}, k = 3, mv = {1, 4, 2})
    public final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            PaymentFlowPage.values();
            int[] iArr = new int[2];
            $EnumSwitchMapping$0 = iArr;
            iArr[PaymentFlowPage.ShippingInfo.ordinal()] = 1;
            iArr[PaymentFlowPage.ShippingMethod.ordinal()] = 2;
        }
    }

    static {
        Class<PaymentFlowPagerAdapter> cls = PaymentFlowPagerAdapter.class;
        $$delegatedProperties = new k[]{i0.d.a.a.a.o1(cls, "shippingMethods", "getShippingMethods$payments_core_release()Ljava/util/List;", 0), i0.d.a.a.a.o1(cls, "selectedShippingMethod", "getSelectedShippingMethod$payments_core_release()Lcom/stripe/android/model/ShippingMethod;", 0)};
    }

    public PaymentFlowPagerAdapter(Context context2, PaymentSessionConfig paymentSessionConfig2, Set<String> set, l<? super ShippingMethod, i> lVar) {
        m0.n.b.i.e(context2, "context");
        m0.n.b.i.e(paymentSessionConfig2, "paymentSessionConfig");
        m0.n.b.i.e(set, "allowedShippingCountryCodes");
        m0.n.b.i.e(lVar, "onShippingMethodSelectedCallback");
        this.context = context2;
        this.paymentSessionConfig = paymentSessionConfig2;
        this.allowedShippingCountryCodes = set;
        this.onShippingMethodSelectedCallback = lVar;
        EmptyList emptyList = EmptyList.c;
        this.shippingMethods$delegate = new PaymentFlowPagerAdapter$$special$$inlined$observable$1(emptyList, emptyList, this);
        this.selectedShippingMethod$delegate = new PaymentFlowPagerAdapter$$special$$inlined$observable$2((Object) null, (Object) null, this);
    }

    private final List<PaymentFlowPage> getPages() {
        PaymentFlowPage[] paymentFlowPageArr = new PaymentFlowPage[2];
        PaymentFlowPage paymentFlowPage = PaymentFlowPage.ShippingInfo;
        PaymentFlowPage paymentFlowPage2 = null;
        if (!this.paymentSessionConfig.isShippingInfoRequired()) {
            paymentFlowPage = null;
        }
        boolean z = false;
        paymentFlowPageArr[0] = paymentFlowPage;
        PaymentFlowPage paymentFlowPage3 = PaymentFlowPage.ShippingMethod;
        if (this.paymentSessionConfig.isShippingMethodRequired() && (!this.paymentSessionConfig.isShippingInfoRequired() || this.isShippingInfoSubmitted)) {
            z = true;
        }
        if (z) {
            paymentFlowPage2 = paymentFlowPage3;
        }
        paymentFlowPageArr[1] = paymentFlowPage2;
        return g.M(paymentFlowPageArr);
    }

    public void destroyItem(ViewGroup viewGroup, int i, Object obj) {
        m0.n.b.i.e(viewGroup, "collection");
        m0.n.b.i.e(obj, "view");
        viewGroup.removeView((View) obj);
    }

    public int getCount() {
        return getPages().size();
    }

    public int getItemPosition(Object obj) {
        m0.n.b.i.e(obj, "obj");
        if (!(obj instanceof View) || ((View) obj).getTag() != PaymentFlowPage.ShippingMethod || !this.shouldRecreateShippingMethodsScreen) {
            return super.getItemPosition(obj);
        }
        this.shouldRecreateShippingMethodsScreen = false;
        return -2;
    }

    public final PaymentFlowPage getPageAt$payments_core_release(int i) {
        return (PaymentFlowPage) g.z(getPages(), i);
    }

    public CharSequence getPageTitle(int i) {
        return this.context.getString(getPages().get(i).getTitleResId());
    }

    public final ShippingMethod getSelectedShippingMethod$payments_core_release() {
        return (ShippingMethod) this.selectedShippingMethod$delegate.getValue(this, $$delegatedProperties[1]);
    }

    public final ShippingInformation getShippingInformation$payments_core_release() {
        return this.shippingInformation;
    }

    public final List<ShippingMethod> getShippingMethods$payments_core_release() {
        return (List) this.shippingMethods$delegate.getValue(this, $$delegatedProperties[0]);
    }

    public Object instantiateItem(ViewGroup viewGroup, int i) {
        RecyclerView.b0 b0Var;
        m0.n.b.i.e(viewGroup, "collection");
        PaymentFlowPage paymentFlowPage = getPages().get(i);
        int ordinal = paymentFlowPage.ordinal();
        if (ordinal == 0) {
            b0Var = new PaymentFlowViewHolder.ShippingInformationViewHolder(viewGroup);
        } else if (ordinal == 1) {
            b0Var = new PaymentFlowViewHolder.ShippingMethodViewHolder(viewGroup);
        } else {
            throw new NoWhenBranchMatchedException();
        }
        if (b0Var instanceof PaymentFlowViewHolder.ShippingInformationViewHolder) {
            ((PaymentFlowViewHolder.ShippingInformationViewHolder) b0Var).bind(this.paymentSessionConfig, this.shippingInformation, this.allowedShippingCountryCodes);
        } else if (b0Var instanceof PaymentFlowViewHolder.ShippingMethodViewHolder) {
            ((PaymentFlowViewHolder.ShippingMethodViewHolder) b0Var).bind(getShippingMethods$payments_core_release(), getSelectedShippingMethod$payments_core_release(), this.onShippingMethodSelectedCallback);
        }
        viewGroup.addView(b0Var.itemView);
        View view = b0Var.itemView;
        m0.n.b.i.d(view, "viewHolder.itemView");
        view.setTag(paymentFlowPage);
        View view2 = b0Var.itemView;
        m0.n.b.i.d(view2, "viewHolder.itemView");
        return view2;
    }

    public final boolean isShippingInfoSubmitted$payments_core_release() {
        return this.isShippingInfoSubmitted;
    }

    public boolean isViewFromObject(View view, Object obj) {
        m0.n.b.i.e(view, "view");
        m0.n.b.i.e(obj, "o");
        return view == obj;
    }

    public final void setSelectedShippingMethod$payments_core_release(ShippingMethod shippingMethod) {
        this.selectedShippingMethod$delegate.setValue(this, $$delegatedProperties[1], shippingMethod);
    }

    public final void setShippingInfoSubmitted$payments_core_release(boolean z) {
        this.isShippingInfoSubmitted = z;
        notifyDataSetChanged();
    }

    public final void setShippingInformation$payments_core_release(ShippingInformation shippingInformation2) {
        this.shippingInformation = shippingInformation2;
        notifyDataSetChanged();
    }

    public final void setShippingMethods$payments_core_release(List<ShippingMethod> list) {
        m0.n.b.i.e(list, "<set-?>");
        this.shippingMethods$delegate.setValue(this, $$delegatedProperties[0], list);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public PaymentFlowPagerAdapter(Context context2, PaymentSessionConfig paymentSessionConfig2, Set set, l lVar, int i, f fVar) {
        this(context2, paymentSessionConfig2, (i & 4) != 0 ? EmptySet.c : set, (i & 8) != 0 ? AnonymousClass1.INSTANCE : lVar);
    }
}
