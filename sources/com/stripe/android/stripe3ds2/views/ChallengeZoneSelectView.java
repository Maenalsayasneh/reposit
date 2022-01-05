package com.stripe.android.stripe3ds2.views;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.stripe.android.stripe3ds2.R;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneMultiSelectViewBinding;
import com.stripe.android.stripe3ds2.databinding.StripeChallengeZoneSingleSelectViewBinding;
import com.stripe.android.stripe3ds2.init.ui.ButtonCustomization;
import com.stripe.android.stripe3ds2.init.ui.LabelCustomization;
import com.stripe.android.stripe3ds2.transactions.ChallengeResponseData;
import i0.h.a.c.s.a;
import i0.j.f.p.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.j.o;
import m0.n.b.f;
import m0.n.b.i;
import m0.q.e;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000 F2\u00020\u00012\u00020\u0002:\u0001FB1\b\u0007\u0012\u0006\u0010@\u001a\u00020?\u0012\n\b\u0002\u0010B\u001a\u0004\u0018\u00010A\u0012\b\b\u0002\u0010C\u001a\u00020\u0018\u0012\b\b\u0002\u0010-\u001a\u00020\u0007¢\u0006\u0004\bD\u0010EJ)\u0010\f\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\r2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u00122\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001cH\u0014¢\u0006\u0004\b \u0010!R\u001d\u0010%\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\"\u0018\u00010\r8F@\u0006¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001c\u0010'\u001a\u00020&8\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00030\r8F@\u0006¢\u0006\u0006\u001a\u0004\b+\u0010$R\u0019\u0010-\u001a\u00020\u00078\u0006@\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b-\u0010/R\u001c\u00101\u001a\b\u0012\u0004\u0012\u00020\u00180\r8@@\u0000X\u0004¢\u0006\u0006\u001a\u0004\b0\u0010$R\u001c\u00103\u001a\u0002028\u0000@\u0000X\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b9\u00108R\u0016\u0010:\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b:\u00108R\u0016\u0010=\u001a\u00020\u00128V@\u0016X\u0004¢\u0006\u0006\u001a\u0004\b;\u0010<R\u0016\u0010>\u001a\u00020\u00188\u0002@\u0002X\u0004¢\u0006\u0006\n\u0004\b>\u00108¨\u0006G"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView;", "Landroid/widget/FrameLayout;", "Lcom/stripe/android/stripe3ds2/views/FormField;", "Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;", "option", "Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;", "buttonCustomization", "", "lastButton", "Landroid/widget/CompoundButton;", "buildButton$3ds2sdk_release", "(Lcom/stripe/android/stripe3ds2/transactions/ChallengeResponseData$ChallengeSelectOption;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;Z)Landroid/widget/CompoundButton;", "buildButton", "", "options", "Lm0/i;", "setChallengeSelectOptions", "(Ljava/util/List;Lcom/stripe/android/stripe3ds2/init/ui/ButtonCustomization;)V", "", "label", "Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;", "labelCustomization", "setTextEntryLabel", "(Ljava/lang/String;Lcom/stripe/android/stripe3ds2/init/ui/LabelCustomization;)V", "", "index", "selectOption", "(I)V", "Landroid/os/Parcelable;", "onSaveInstanceState", "()Landroid/os/Parcelable;", "state", "onRestoreInstanceState", "(Landroid/os/Parcelable;)V", "Landroid/widget/CheckBox;", "getCheckBoxes", "()Ljava/util/List;", "checkBoxes", "Landroid/widget/LinearLayout;", "selectGroup", "Landroid/widget/LinearLayout;", "getSelectGroup$3ds2sdk_release", "()Landroid/widget/LinearLayout;", "getSelectedOptions", "selectedOptions", "isSingleSelectMode", "Z", "()Z", "getSelectedIndexes$3ds2sdk_release", "selectedIndexes", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "infoLabel", "Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "getInfoLabel$3ds2sdk_release", "()Lcom/stripe/android/stripe3ds2/views/ThreeDS2TextView;", "buttonBottomMargin", "I", "buttonMinHeight", "buttonOffsetMargin", "getUserEntry", "()Ljava/lang/String;", "userEntry", "buttonLabelPadding", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IZ)V", "Companion", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
/* compiled from: ChallengeZoneSelectView.kt */
public final class ChallengeZoneSelectView extends FrameLayout implements FormField {
    private static final Companion Companion = new Companion((f) null);
    @Deprecated
    private static final String STATE_SELECTED_INDEXED = "state_selected_indexes";
    @Deprecated
    private static final String STATE_SUPER = "state_super";
    private final int buttonBottomMargin;
    private final int buttonLabelPadding;
    private final int buttonMinHeight;
    private final int buttonOffsetMargin;
    private final ThreeDS2TextView infoLabel;
    private final boolean isSingleSelectMode;
    private final LinearLayout selectGroup;

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0016\u0010\u0003\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0005\u001a\u00020\u00028\u0002@\u0002XT¢\u0006\u0006\n\u0004\b\u0005\u0010\u0004¨\u0006\b"}, d2 = {"Lcom/stripe/android/stripe3ds2/views/ChallengeZoneSelectView$Companion;", "", "", "STATE_SELECTED_INDEXED", "Ljava/lang/String;", "STATE_SUPER", "<init>", "()V", "3ds2sdk_release"}, k = 1, mv = {1, 4, 2})
    /* compiled from: ChallengeZoneSelectView.kt */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(f fVar) {
            this();
        }
    }

    public ChallengeZoneSelectView(Context context) {
        this(context, (AttributeSet) null, 0, false, 14, (f) null);
    }

    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, 12, (f) null);
    }

    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, 8, (f) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i, boolean z, int i2, f fVar) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z);
    }

    public final CompoundButton buildButton$3ds2sdk_release(ChallengeResponseData.ChallengeSelectOption challengeSelectOption, ButtonCustomization buttonCustomization, boolean z) {
        CompoundButton compoundButton;
        i.e(challengeSelectOption, "option");
        if (this.isSingleSelectMode) {
            compoundButton = new a(getContext(), (AttributeSet) null);
        } else {
            compoundButton = new MaterialCheckBox(getContext(), (AttributeSet) null);
        }
        if (buttonCustomization != null) {
            String backgroundColor = buttonCustomization.getBackgroundColor();
            boolean z2 = false;
            if (!(backgroundColor == null || StringsKt__IndentKt.o(backgroundColor))) {
                compoundButton.setButtonTintList(ColorStateList.valueOf(Color.parseColor(buttonCustomization.getBackgroundColor())));
            }
            String textColor = buttonCustomization.getTextColor();
            if (textColor == null || StringsKt__IndentKt.o(textColor)) {
                z2 = true;
            }
            if (!z2) {
                compoundButton.setTextColor(Color.parseColor(buttonCustomization.getTextColor()));
            }
        }
        compoundButton.setId(View.generateViewId());
        compoundButton.setTag(challengeSelectOption);
        compoundButton.setText(challengeSelectOption.getText());
        compoundButton.setPadding(this.buttonLabelPadding, compoundButton.getPaddingTop(), compoundButton.getPaddingRight(), compoundButton.getPaddingBottom());
        compoundButton.setMinimumHeight(this.buttonMinHeight);
        RadioGroup.LayoutParams layoutParams = new RadioGroup.LayoutParams(-1, -2);
        if (!z) {
            layoutParams.bottomMargin = this.buttonBottomMargin;
        }
        layoutParams.leftMargin = this.buttonOffsetMargin;
        compoundButton.setLayoutParams(layoutParams);
        return compoundButton;
    }

    public final List<CheckBox> getCheckBoxes() {
        if (this.isSingleSelectMode) {
            return null;
        }
        e f = m0.q.i.f(0, this.selectGroup.getChildCount());
        ArrayList arrayList = new ArrayList(h.K(f, 10));
        Iterator it = f.iterator();
        while (it.hasNext()) {
            View childAt = this.selectGroup.getChildAt(((o) it).a());
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.CheckBox");
            arrayList.add((CheckBox) childAt);
        }
        return arrayList;
    }

    public final ThreeDS2TextView getInfoLabel$3ds2sdk_release() {
        return this.infoLabel;
    }

    public final LinearLayout getSelectGroup$3ds2sdk_release() {
        return this.selectGroup;
    }

    public final List<Integer> getSelectedIndexes$3ds2sdk_release() {
        e f = m0.q.i.f(0, this.selectGroup.getChildCount());
        ArrayList arrayList = new ArrayList();
        Iterator it = f.iterator();
        while (it.hasNext()) {
            int a = ((o) it).a();
            View childAt = this.selectGroup.getChildAt(a);
            Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
            Integer valueOf = ((CompoundButton) childAt).isChecked() ? Integer.valueOf(a) : null;
            if (valueOf != null) {
                arrayList.add(valueOf);
            }
        }
        return g.p0(arrayList, this.isSingleSelectMode ? 1 : arrayList.size());
    }

    public final List<ChallengeResponseData.ChallengeSelectOption> getSelectedOptions() {
        List<Integer> selectedIndexes$3ds2sdk_release = getSelectedIndexes$3ds2sdk_release();
        ArrayList arrayList = new ArrayList(h.K(selectedIndexes$3ds2sdk_release, 10));
        for (Number intValue : selectedIndexes$3ds2sdk_release) {
            View childAt = this.selectGroup.getChildAt(intValue.intValue());
            i.d(childAt, "selectGroup.getChildAt(it)");
            Object tag = childAt.getTag();
            Objects.requireNonNull(tag, "null cannot be cast to non-null type com.stripe.android.stripe3ds2.transactions.ChallengeResponseData.ChallengeSelectOption");
            arrayList.add((ChallengeResponseData.ChallengeSelectOption) tag);
        }
        return arrayList;
    }

    public String getUserEntry() {
        return g.E(getSelectedOptions(), InstabugDbContract.COMMA_SEP, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, ChallengeZoneSelectView$userEntry$1.INSTANCE, 30);
    }

    public final boolean isSingleSelectMode() {
        return this.isSingleSelectMode;
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        i.e(parcelable, "state");
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            super.onRestoreInstanceState(bundle.getParcelable(STATE_SUPER));
            ArrayList<Integer> integerArrayList = bundle.getIntegerArrayList(STATE_SELECTED_INDEXED);
            if (integerArrayList != null) {
                for (Integer num : integerArrayList) {
                    i.d(num, "it");
                    selectOption(num.intValue());
                }
                return;
            }
            return;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public Parcelable onSaveInstanceState() {
        return g0.a.b.b.a.g(new Pair(STATE_SUPER, super.onSaveInstanceState()), new Pair(STATE_SELECTED_INDEXED, new ArrayList(getSelectedIndexes$3ds2sdk_release())));
    }

    public final void selectOption(int i) {
        View childAt = this.selectGroup.getChildAt(i);
        Objects.requireNonNull(childAt, "null cannot be cast to non-null type android.widget.CompoundButton");
        ((CompoundButton) childAt).setChecked(true);
    }

    public final void setChallengeSelectOptions(List<ChallengeResponseData.ChallengeSelectOption> list, ButtonCustomization buttonCustomization) {
        if (list != null) {
            int size = list.size();
            Iterator it = m0.q.i.f(0, size).iterator();
            while (it.hasNext()) {
                int a = ((o) it).a();
                ChallengeResponseData.ChallengeSelectOption challengeSelectOption = list.get(a);
                boolean z = true;
                if (a != size - 1) {
                    z = false;
                }
                this.selectGroup.addView(buildButton$3ds2sdk_release(challengeSelectOption, buttonCustomization, z));
            }
        }
    }

    public final void setTextEntryLabel(String str, LabelCustomization labelCustomization) {
        if (str == null || StringsKt__IndentKt.o(str)) {
            this.infoLabel.setVisibility(8);
        } else {
            this.infoLabel.setText(str, labelCustomization);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengeZoneSelectView(Context context, AttributeSet attributeSet, int i, boolean z) {
        super(context, attributeSet, i);
        i.e(context, "context");
        this.isSingleSelectMode = z;
        if (getId() == -1) {
            setId(R.id.stripe_3ds2_default_challenge_zone_select_view_id);
        }
        this.buttonBottomMargin = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_vertical_margin);
        this.buttonLabelPadding = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_label_padding);
        this.buttonOffsetMargin = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_offset_margin);
        this.buttonMinHeight = context.getResources().getDimensionPixelSize(R.dimen.stripe_3ds2_challenge_zone_select_button_min_height);
        if (z) {
            StripeChallengeZoneSingleSelectViewBinding inflate = StripeChallengeZoneSingleSelectViewBinding.inflate(LayoutInflater.from(context), this, true);
            i.d(inflate, "StripeChallengeZoneSingl…   true\n                )");
            ThreeDS2TextView threeDS2TextView = inflate.label;
            i.d(threeDS2TextView, "viewBinding.label");
            this.infoLabel = threeDS2TextView;
            RadioGroup radioGroup = inflate.selectGroup;
            i.d(radioGroup, "viewBinding.selectGroup");
            this.selectGroup = radioGroup;
            return;
        }
        StripeChallengeZoneMultiSelectViewBinding inflate2 = StripeChallengeZoneMultiSelectViewBinding.inflate(LayoutInflater.from(context), this, true);
        i.d(inflate2, "StripeChallengeZoneMulti…   true\n                )");
        ThreeDS2TextView threeDS2TextView2 = inflate2.label;
        i.d(threeDS2TextView2, "viewBinding.label");
        this.infoLabel = threeDS2TextView2;
        LinearLayout linearLayout = inflate2.selectGroup;
        i.d(linearLayout, "viewBinding.selectGroup");
        this.selectGroup = linearLayout;
    }
}
