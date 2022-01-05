package com.stripe.android.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.SpinnerAdapter;
import androidx.appcompat.R;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatSpinner;
import androidx.appcompat.widget.AppCompatTextView;
import com.stripe.android.databinding.CardBrandSpinnerDropdownBinding;
import com.stripe.android.databinding.CardBrandSpinnerMainBinding;
import com.stripe.android.model.CardBrand;
import h0.i.b.a;
import i0.j.f.p.h;
import java.util.List;
import kotlin.Metadata;
import m0.n.b.f;
import m0.n.b.i;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001:\u0001\u001eB'\b\u0007\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0014¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\b\b\u0001\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u00022\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\n8F@\u0006¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/stripe/android/view/CardBrandSpinner;", "Landroidx/appcompat/widget/AppCompatSpinner;", "Lm0/i;", "onFinishInflate", "()V", "", "tintColor", "setTintColor", "(I)V", "", "Lcom/stripe/android/model/CardBrand;", "cardBrands", "setCardBrands", "(Ljava/util/List;)V", "Landroid/graphics/drawable/Drawable;", "defaultBackground", "Landroid/graphics/drawable/Drawable;", "getCardBrand", "()Lcom/stripe/android/model/CardBrand;", "cardBrand", "Lcom/stripe/android/view/CardBrandSpinner$Adapter;", "cardBrandsAdapter", "Lcom/stripe/android/view/CardBrandSpinner$Adapter;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Adapter", "payments-core_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: CardBrandSpinner.kt */
public final class CardBrandSpinner extends AppCompatSpinner {
    private final Adapter cardBrandsAdapter;
    private Drawable defaultBackground;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\r\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\"\u0010\u0010\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0018\u001a\n \u0017*\u0004\u0018\u00010\u00160\u00168\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001e"}, d2 = {"Lcom/stripe/android/view/CardBrandSpinner$Adapter;", "Landroid/widget/ArrayAdapter;", "Lcom/stripe/android/model/CardBrand;", "cardBrand", "Landroid/graphics/drawable/Drawable;", "createCardBrandDrawable", "(Lcom/stripe/android/model/CardBrand;)Landroid/graphics/drawable/Drawable;", "", "position", "Landroid/view/View;", "convertView", "Landroid/view/ViewGroup;", "parent", "getView", "(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;", "getDropDownView", "tintColor", "I", "getTintColor$payments_core_release", "()I", "setTintColor$payments_core_release", "(I)V", "Landroid/view/LayoutInflater;", "kotlin.jvm.PlatformType", "layoutInflater", "Landroid/view/LayoutInflater;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "payments-core_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: CardBrandSpinner.kt */
    public static final class Adapter extends ArrayAdapter<CardBrand> {
        private final LayoutInflater layoutInflater;
        private int tintColor;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Adapter(Context context) {
            super(context, 0);
            i.e(context, "context");
            this.layoutInflater = LayoutInflater.from(context);
        }

        private final Drawable createCardBrandDrawable(CardBrand cardBrand) {
            Drawable drawable = a.getDrawable(getContext(), cardBrand.getIcon());
            if (drawable == null) {
                throw new IllegalArgumentException("Required value was null.".toString());
            } else if (cardBrand != CardBrand.Unknown) {
                return drawable;
            } else {
                drawable.mutate().setTint(this.tintColor);
                Drawable D0 = g0.a.b.b.a.D0(drawable);
                i.d(D0, "DrawableCompat.unwrap(compatIcon)");
                return D0;
            }
        }

        public View getDropDownView(int i, View view, ViewGroup viewGroup) {
            CardBrandSpinnerDropdownBinding cardBrandSpinnerDropdownBinding;
            i.e(viewGroup, "parent");
            if (view == null || (cardBrandSpinnerDropdownBinding = CardBrandSpinnerDropdownBinding.bind(view)) == null) {
                cardBrandSpinnerDropdownBinding = CardBrandSpinnerDropdownBinding.inflate(this.layoutInflater, viewGroup, false);
            }
            i.d(cardBrandSpinnerDropdownBinding, "convertView?.let {\n     …tInflater, parent, false)");
            Object item = getItem(i);
            if (item != null) {
                CardBrand cardBrand = (CardBrand) item;
                AppCompatTextView appCompatTextView = cardBrandSpinnerDropdownBinding.textView;
                i.d(appCompatTextView, "it");
                appCompatTextView.setText(cardBrand.getDisplayName());
                appCompatTextView.setCompoundDrawablesRelativeWithIntrinsicBounds(createCardBrandDrawable(cardBrand), (Drawable) null, (Drawable) null, (Drawable) null);
                AppCompatTextView root = cardBrandSpinnerDropdownBinding.getRoot();
                i.d(root, "viewBinding.root");
                return root;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public final int getTintColor$payments_core_release() {
            return this.tintColor;
        }

        public View getView(int i, View view, ViewGroup viewGroup) {
            CardBrandSpinnerMainBinding cardBrandSpinnerMainBinding;
            i.e(viewGroup, "parent");
            if (view == null || (cardBrandSpinnerMainBinding = CardBrandSpinnerMainBinding.bind(view)) == null) {
                cardBrandSpinnerMainBinding = CardBrandSpinnerMainBinding.inflate(this.layoutInflater, viewGroup, false);
            }
            i.d(cardBrandSpinnerMainBinding, "convertView?.let {\n     …tInflater, parent, false)");
            Object item = getItem(i);
            if (item != null) {
                CardBrand cardBrand = (CardBrand) item;
                AppCompatImageView appCompatImageView = cardBrandSpinnerMainBinding.image;
                appCompatImageView.setImageDrawable(createCardBrandDrawable(cardBrand));
                i.d(appCompatImageView, "it");
                appCompatImageView.setContentDescription(cardBrand.getDisplayName());
                AppCompatImageView root = cardBrandSpinnerMainBinding.getRoot();
                i.d(root, "viewBinding.root");
                return root;
            }
            throw new IllegalArgumentException("Required value was null.".toString());
        }

        public final void setTintColor$payments_core_release(int i) {
            this.tintColor = i;
        }
    }

    public CardBrandSpinner(Context context) {
        this(context, (AttributeSet) null, 0, 6, (f) null);
    }

    public CardBrandSpinner(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardBrandSpinner(Context context, AttributeSet attributeSet, int i, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? R.attr.spinnerStyle : i);
    }

    public final CardBrand getCardBrand() {
        return (CardBrand) getSelectedItem();
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        this.defaultBackground = getBackground();
        setCardBrands(h.L2(CardBrand.Unknown));
    }

    public final /* synthetic */ void setCardBrands(List<? extends CardBrand> list) {
        i.e(list, "cardBrands");
        this.cardBrandsAdapter.clear();
        this.cardBrandsAdapter.addAll(list);
        this.cardBrandsAdapter.notifyDataSetChanged();
        setSelection(0);
        if (list.size() > 1) {
            setClickable(true);
            setEnabled(true);
            setBackground(this.defaultBackground);
            return;
        }
        setClickable(false);
        setEnabled(false);
        setBackgroundColor(a.getColor(getContext(), 17170445));
    }

    public final void setTintColor(int i) {
        this.cardBrandsAdapter.setTintColor$payments_core_release(i);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CardBrandSpinner(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 1);
        i.e(context, "context");
        Adapter adapter = new Adapter(context);
        this.cardBrandsAdapter = adapter;
        setAdapter((SpinnerAdapter) adapter);
        setDropDownWidth(getResources().getDimensionPixelSize(com.stripe.android.R.dimen.card_brand_spinner_dropdown_width));
    }
}
