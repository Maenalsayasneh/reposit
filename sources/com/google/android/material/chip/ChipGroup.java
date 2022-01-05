package com.google.android.material.chip;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.CompoundButton;
import com.google.android.material.R;
import h0.i.i.g0.b;
import h0.i.i.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class ChipGroup extends i0.h.a.c.q.e {
    public static final int y = R.style.Widget_MaterialComponents_ChipGroup;
    public int Y1;
    public int Z1;
    public boolean a2;
    public boolean b2;
    public d c2;
    public final b d2 = new b((a) null);
    public e e2 = new e((a) null);
    public int f2 = -1;
    public boolean g2 = false;

    public class b implements CompoundButton.OnCheckedChangeListener {
        public b(a aVar) {
        }

        public void onCheckedChanged(CompoundButton compoundButton, boolean z) {
            ChipGroup chipGroup = ChipGroup.this;
            if (!chipGroup.g2) {
                if (chipGroup.getCheckedChipIds().isEmpty()) {
                    ChipGroup chipGroup2 = ChipGroup.this;
                    if (chipGroup2.b2) {
                        chipGroup2.d(compoundButton.getId(), true);
                        ChipGroup chipGroup3 = ChipGroup.this;
                        chipGroup3.f2 = compoundButton.getId();
                        d dVar = chipGroup3.c2;
                        return;
                    }
                }
                int id = compoundButton.getId();
                if (z) {
                    ChipGroup chipGroup4 = ChipGroup.this;
                    int i = chipGroup4.f2;
                    if (!(i == -1 || i == id || !chipGroup4.a2)) {
                        chipGroup4.d(i, false);
                    }
                    ChipGroup.this.setCheckedId(id);
                    return;
                }
                ChipGroup chipGroup5 = ChipGroup.this;
                if (chipGroup5.f2 == id) {
                    chipGroup5.setCheckedId(-1);
                }
            }
        }
    }

    public static class c extends ViewGroup.MarginLayoutParams {
        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(int i, int i2) {
            super(i, i2);
        }
    }

    public interface d {
        void a(ChipGroup chipGroup, int i);
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener c;

        public e(a aVar) {
        }

        public void onChildViewAdded(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    AtomicInteger atomicInteger = q.a;
                    view2.setId(View.generateViewId());
                }
                Chip chip = (Chip) view2;
                if (chip.isChecked()) {
                    ((ChipGroup) view).c(chip.getId());
                }
                chip.setOnCheckedChangeListenerInternal(ChipGroup.this.d2);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.c;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        public void onChildViewRemoved(View view, View view2) {
            if (view == ChipGroup.this && (view2 instanceof Chip)) {
                ((Chip) view2).setOnCheckedChangeListenerInternal((CompoundButton.OnCheckedChangeListener) null);
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.c;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ChipGroup(android.content.Context r8, android.util.AttributeSet r9) {
        /*
            r7 = this;
            int r3 = com.google.android.material.R.attr.chipGroupStyle
            int r4 = y
            android.content.Context r8 = i0.h.a.c.a0.a.a.a(r8, r9, r3, r4)
            r7.<init>(r8, r9, r3)
            com.google.android.material.chip.ChipGroup$b r8 = new com.google.android.material.chip.ChipGroup$b
            r0 = 0
            r8.<init>(r0)
            r7.d2 = r8
            com.google.android.material.chip.ChipGroup$e r8 = new com.google.android.material.chip.ChipGroup$e
            r8.<init>(r0)
            r7.e2 = r8
            r8 = -1
            r7.f2 = r8
            r6 = 0
            r7.g2 = r6
            android.content.Context r0 = r7.getContext()
            int[] r2 = com.google.android.material.R.styleable.ChipGroup
            int[] r5 = new int[r6]
            r1 = r9
            android.content.res.TypedArray r9 = i0.h.a.c.q.j.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.ChipGroup_chipSpacing
            int r0 = r9.getDimensionPixelOffset(r0, r6)
            int r1 = com.google.android.material.R.styleable.ChipGroup_chipSpacingHorizontal
            int r1 = r9.getDimensionPixelOffset(r1, r0)
            r7.setChipSpacingHorizontal(r1)
            int r1 = com.google.android.material.R.styleable.ChipGroup_chipSpacingVertical
            int r0 = r9.getDimensionPixelOffset(r1, r0)
            r7.setChipSpacingVertical(r0)
            int r0 = com.google.android.material.R.styleable.ChipGroup_singleLine
            boolean r0 = r9.getBoolean(r0, r6)
            r7.setSingleLine((boolean) r0)
            int r0 = com.google.android.material.R.styleable.ChipGroup_singleSelection
            boolean r0 = r9.getBoolean(r0, r6)
            r7.setSingleSelection((boolean) r0)
            int r0 = com.google.android.material.R.styleable.ChipGroup_selectionRequired
            boolean r0 = r9.getBoolean(r0, r6)
            r7.setSelectionRequired(r0)
            int r0 = com.google.android.material.R.styleable.ChipGroup_checkedChip
            int r0 = r9.getResourceId(r0, r8)
            if (r0 == r8) goto L_0x006a
            r7.f2 = r0
        L_0x006a:
            r9.recycle()
            com.google.android.material.chip.ChipGroup$e r8 = r7.e2
            super.setOnHierarchyChangeListener(r8)
            r8 = 1
            java.util.concurrent.atomic.AtomicInteger r9 = h0.i.i.q.a
            r7.setImportantForAccessibility(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.chip.ChipGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if (getChildAt(i2) instanceof Chip) {
                i++;
            }
        }
        return i;
    }

    /* access modifiers changed from: private */
    public void setCheckedId(int i) {
        this.f2 = i;
        d dVar = this.c2;
        if (dVar != null && this.a2) {
            dVar.a(this, i);
        }
    }

    public boolean a() {
        return this.q;
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof Chip) {
            Chip chip = (Chip) view;
            if (chip.isChecked()) {
                int i2 = this.f2;
                if (i2 != -1 && this.a2) {
                    d(i2, false);
                }
                setCheckedId(chip.getId());
            }
        }
        super.addView(view, i, layoutParams);
    }

    public void c(int i) {
        int i2 = this.f2;
        if (i != i2) {
            if (i2 != -1 && this.a2) {
                d(i2, false);
            }
            if (i != -1) {
                d(i, true);
            }
            setCheckedId(i);
        }
    }

    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof c);
    }

    public final void d(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof Chip) {
            this.g2 = true;
            ((Chip) findViewById).setChecked(z);
            this.g2 = false;
        }
    }

    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new c(-2, -2);
    }

    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        if (this.a2) {
            return this.f2;
        }
        return -1;
    }

    public List<Integer> getCheckedChipIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            View childAt = getChildAt(i);
            if ((childAt instanceof Chip) && ((Chip) childAt).isChecked()) {
                arrayList.add(Integer.valueOf(childAt.getId()));
                if (this.a2) {
                    return arrayList;
                }
            }
        }
        return arrayList;
    }

    public int getChipSpacingHorizontal() {
        return this.Y1;
    }

    public int getChipSpacingVertical() {
        return this.Z1;
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.f2;
        if (i != -1) {
            d(i, true);
            setCheckedId(this.f2);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0048b.a(getRowCount(), this.q ? getChipCount() : -1, false, this.a2 ? 1 : 2).a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.Y1 != i) {
            this.Y1 = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.Z1 != i) {
            this.Z1 = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    public void setOnCheckedChangeListener(d dVar) {
        this.c2 = dVar;
    }

    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.e2.c = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.b2 = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        if (this.a2 != z) {
            this.a2 = z;
            this.g2 = true;
            for (int i = 0; i < getChildCount(); i++) {
                View childAt = getChildAt(i);
                if (childAt instanceof Chip) {
                    ((Chip) childAt).setChecked(false);
                }
            }
            this.g2 = false;
            setCheckedId(-1);
        }
    }

    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new c(layoutParams);
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
