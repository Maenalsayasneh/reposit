package com.stripe.android.view;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.stripe.android.R;
import com.stripe.android.databinding.BankItemBinding;
import com.stripe.android.model.BankStatuses;
import java.util.List;
import kotlin.Metadata;
import m0.i;
import m0.n.a.l;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u00015B1\u0012\u0006\u0010\u001f\u001a\u00020\u001e\u0012\f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-\u0012\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100(¢\u0006\u0004\b3\u00104J\u001f\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\u0016\u0010\u0014R$\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u0019\u0010\u001f\u001a\u00020\u001e8\u0006@\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R*\u0010$\u001a\u00020\u00052\u0006\u0010#\u001a\u00020\u00058\u0006@FX\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010\n\"\u0004\b'\u0010\u0014R%\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00100(8\u0006@\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001f\u0010/\u001a\b\u0012\u0004\u0012\u00020.0-8\u0006@\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00066"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodListAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Landroidx/recyclerview/widget/RecyclerView$b0;", "Landroid/view/ViewGroup;", "parent", "", "viewType", "onCreateViewHolder", "(Landroid/view/ViewGroup;I)Landroidx/recyclerview/widget/RecyclerView$b0;", "getItemCount", "()I", "position", "", "getItemId", "(I)J", "holder", "Lm0/i;", "onBindViewHolder", "(Landroidx/recyclerview/widget/RecyclerView$b0;I)V", "updateSelected$payments_core_release", "(I)V", "updateSelected", "notifyAdapterItemChanged", "Lcom/stripe/android/model/BankStatuses;", "bankStatuses", "Lcom/stripe/android/model/BankStatuses;", "getBankStatuses$payments_core_release", "()Lcom/stripe/android/model/BankStatuses;", "setBankStatuses$payments_core_release", "(Lcom/stripe/android/model/BankStatuses;)V", "Lcom/stripe/android/view/ThemeConfig;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "getThemeConfig", "()Lcom/stripe/android/view/ThemeConfig;", "value", "selectedPosition", "I", "getSelectedPosition", "setSelectedPosition", "Lkotlin/Function1;", "itemSelectedCallback", "Lm0/n/a/l;", "getItemSelectedCallback", "()Lm0/n/a/l;", "", "Lcom/stripe/android/view/Bank;", "items", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "<init>", "(Lcom/stripe/android/view/ThemeConfig;Ljava/util/List;Lm0/n/a/l;)V", "BankViewHolder", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: AddPaymentMethodListAdapter.kt */
public final class AddPaymentMethodListAdapter extends RecyclerView.Adapter<RecyclerView.b0> {
    private BankStatuses bankStatuses;
    private final l<Integer, i> itemSelectedCallback;
    private final List<Bank> items;
    private int selectedPosition = -1;
    private final ThemeConfig themeConfig;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\n\u0010\u000bR\u0016\u0010\u000e\u001a\u00020\r8\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0014\u001a\u00020\u00138\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0018"}, d2 = {"Lcom/stripe/android/view/AddPaymentMethodListAdapter$BankViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$b0;", "Lcom/stripe/android/view/Bank;", "bank", "", "isOnline", "Lm0/i;", "update", "(Lcom/stripe/android/view/Bank;Z)V", "isSelected", "setSelected$payments_core_release", "(Z)V", "setSelected", "Lcom/stripe/android/view/ThemeConfig;", "themeConfig", "Lcom/stripe/android/view/ThemeConfig;", "Landroid/content/res/Resources;", "resources", "Landroid/content/res/Resources;", "Lcom/stripe/android/databinding/BankItemBinding;", "viewBinding", "Lcom/stripe/android/databinding/BankItemBinding;", "<init>", "(Lcom/stripe/android/databinding/BankItemBinding;Lcom/stripe/android/view/ThemeConfig;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: AddPaymentMethodListAdapter.kt */
    public static final class BankViewHolder extends RecyclerView.b0 {
        private final Resources resources;
        private final ThemeConfig themeConfig;
        private final BankItemBinding viewBinding;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public BankViewHolder(BankItemBinding bankItemBinding, ThemeConfig themeConfig2) {
            super(bankItemBinding.getRoot());
            m0.n.b.i.e(bankItemBinding, "viewBinding");
            m0.n.b.i.e(themeConfig2, "themeConfig");
            this.viewBinding = bankItemBinding;
            this.themeConfig = themeConfig2;
            View view = this.itemView;
            m0.n.b.i.d(view, "itemView");
            Resources resources2 = view.getResources();
            m0.n.b.i.d(resources2, "itemView.resources");
            this.resources = resources2;
        }

        public final void setSelected$payments_core_release(boolean z) {
            this.viewBinding.name.setTextColor(this.themeConfig.getTextColor$payments_core_release(z));
            this.viewBinding.checkIcon.setImageTintList(ColorStateList.valueOf(this.themeConfig.getTintColor$payments_core_release(z)));
            AppCompatImageView appCompatImageView = this.viewBinding.checkIcon;
            m0.n.b.i.d(appCompatImageView, "viewBinding.checkIcon");
            appCompatImageView.setVisibility(z ? 0 : 8);
        }

        public final void update(Bank bank, boolean z) {
            String str;
            m0.n.b.i.e(bank, "bank");
            AppCompatTextView appCompatTextView = this.viewBinding.name;
            m0.n.b.i.d(appCompatTextView, "viewBinding.name");
            if (z) {
                str = bank.getDisplayName();
            } else {
                str = this.resources.getString(R.string.fpx_bank_offline, new Object[]{bank.getDisplayName()});
            }
            appCompatTextView.setText(str);
            Integer brandIconResId = bank.getBrandIconResId();
            if (brandIconResId != null) {
                this.viewBinding.icon.setImageResource(brandIconResId.intValue());
            }
        }
    }

    public AddPaymentMethodListAdapter(ThemeConfig themeConfig2, List<? extends Bank> list, l<? super Integer, i> lVar) {
        m0.n.b.i.e(themeConfig2, "themeConfig");
        m0.n.b.i.e(list, "items");
        m0.n.b.i.e(lVar, "itemSelectedCallback");
        this.themeConfig = themeConfig2;
        this.items = list;
        this.itemSelectedCallback = lVar;
        setHasStableIds(true);
    }

    public final BankStatuses getBankStatuses$payments_core_release() {
        return this.bankStatuses;
    }

    public int getItemCount() {
        return this.items.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public final l<Integer, i> getItemSelectedCallback() {
        return this.itemSelectedCallback;
    }

    public final List<Bank> getItems() {
        return this.items;
    }

    public final int getSelectedPosition() {
        return this.selectedPosition;
    }

    public final ThemeConfig getThemeConfig() {
        return this.themeConfig;
    }

    public final void notifyAdapterItemChanged(int i) {
        notifyItemChanged(i);
    }

    public void onBindViewHolder(RecyclerView.b0 b0Var, int i) {
        m0.n.b.i.e(b0Var, "holder");
        Bank bank = this.items.get(i);
        b0Var.itemView.setOnClickListener(new AddPaymentMethodListAdapter$onBindViewHolder$1(this, b0Var));
        BankViewHolder bankViewHolder = (BankViewHolder) b0Var;
        boolean z = true;
        bankViewHolder.setSelected$payments_core_release(i == this.selectedPosition);
        BankStatuses bankStatuses2 = this.bankStatuses;
        if (bankStatuses2 != null) {
            z = bankStatuses2.isOnline$payments_core_release(bank);
        }
        bankViewHolder.update(bank, z);
    }

    public RecyclerView.b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        m0.n.b.i.e(viewGroup, "parent");
        BankItemBinding inflate = BankItemBinding.inflate(LayoutInflater.from(viewGroup.getContext()), viewGroup, false);
        m0.n.b.i.d(inflate, "BankItemBinding.inflate(…      false\n            )");
        return new BankViewHolder(inflate, this.themeConfig);
    }

    public final void setBankStatuses$payments_core_release(BankStatuses bankStatuses2) {
        this.bankStatuses = bankStatuses2;
    }

    public final void setSelectedPosition(int i) {
        int i2 = this.selectedPosition;
        if (i != i2) {
            if (i2 != -1) {
                notifyItemChanged(i2);
            }
            notifyItemChanged(i);
            this.itemSelectedCallback.invoke(Integer.valueOf(i));
        }
        this.selectedPosition = i;
    }

    public final void updateSelected$payments_core_release(int i) {
        setSelectedPosition(i);
        notifyItemChanged(i);
    }
}
