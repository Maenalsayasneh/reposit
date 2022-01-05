package com.google.android.material.button;

import android.graphics.Canvas;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import com.google.android.material.R;
import com.google.android.material.button.MaterialButton;
import h0.i.i.g0.b;
import h0.i.i.q;
import i0.h.a.c.w.k;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Objects;
import java.util.TreeMap;
import java.util.concurrent.atomic.AtomicInteger;

public class MaterialButtonToggleGroup extends LinearLayout {
    public static final String c = MaterialButtonToggleGroup.class.getSimpleName();
    public static final int d = R.style.Widget_MaterialComponents_MaterialButtonToggleGroup;
    public final LinkedHashSet<e> Y1 = new LinkedHashSet<>();
    public final Comparator<MaterialButton> Z1 = new a();
    public Integer[] a2;
    public boolean b2 = false;
    public boolean c2;
    public boolean d2;
    public int e2;
    public final List<d> q = new ArrayList();
    public final c x = new c((a) null);
    public final f y = new f((a) null);

    public class a implements Comparator<MaterialButton> {
        public a() {
        }

        public int compare(Object obj, Object obj2) {
            MaterialButton materialButton = (MaterialButton) obj;
            MaterialButton materialButton2 = (MaterialButton) obj2;
            int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
            if (compareTo != 0) {
                return compareTo;
            }
            int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
            return compareTo2 != 0 ? compareTo2 : Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton)).compareTo(Integer.valueOf(MaterialButtonToggleGroup.this.indexOfChild(materialButton2)));
        }
    }

    public class b extends h0.i.i.a {
        public b() {
        }

        public void onInitializeAccessibilityNodeInfo(View view, h0.i.i.g0.b bVar) {
            int i;
            super.onInitializeAccessibilityNodeInfo(view, bVar);
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            String str = MaterialButtonToggleGroup.c;
            Objects.requireNonNull(materialButtonToggleGroup);
            if (view instanceof MaterialButton) {
                int i2 = 0;
                int i3 = 0;
                while (true) {
                    if (i2 >= materialButtonToggleGroup.getChildCount()) {
                        break;
                    } else if (materialButtonToggleGroup.getChildAt(i2) == view) {
                        i = i3;
                        break;
                    } else {
                        if ((materialButtonToggleGroup.getChildAt(i2) instanceof MaterialButton) && materialButtonToggleGroup.e(i2)) {
                            i3++;
                        }
                        i2++;
                    }
                }
                bVar.j(b.c.a(0, 1, i, 1, false, ((MaterialButton) view).isChecked()));
            }
            i = -1;
            bVar.j(b.c.a(0, 1, i, 1, false, ((MaterialButton) view).isChecked()));
        }
    }

    public class c implements MaterialButton.a {
        public c(a aVar) {
        }

        public void a(MaterialButton materialButton, boolean z) {
            MaterialButtonToggleGroup materialButtonToggleGroup = MaterialButtonToggleGroup.this;
            if (!materialButtonToggleGroup.b2) {
                if (materialButtonToggleGroup.c2) {
                    materialButtonToggleGroup.e2 = z ? materialButton.getId() : -1;
                }
                if (MaterialButtonToggleGroup.this.g(materialButton.getId(), z)) {
                    MaterialButtonToggleGroup.this.c(materialButton.getId(), materialButton.isChecked());
                }
                MaterialButtonToggleGroup.this.invalidate();
            }
        }
    }

    public static class d {
        public static final i0.h.a.c.w.c a = new i0.h.a.c.w.a(0.0f);
        public i0.h.a.c.w.c b;
        public i0.h.a.c.w.c c;
        public i0.h.a.c.w.c d;
        public i0.h.a.c.w.c e;

        public d(i0.h.a.c.w.c cVar, i0.h.a.c.w.c cVar2, i0.h.a.c.w.c cVar3, i0.h.a.c.w.c cVar4) {
            this.b = cVar;
            this.c = cVar3;
            this.d = cVar4;
            this.e = cVar2;
        }
    }

    public interface e {
        void a(MaterialButtonToggleGroup materialButtonToggleGroup, int i, boolean z);
    }

    public class f implements MaterialButton.b {
        public f(a aVar) {
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public MaterialButtonToggleGroup(android.content.Context r7, android.util.AttributeSet r8) {
        /*
            r6 = this;
            int r3 = com.google.android.material.R.attr.materialButtonToggleGroupStyle
            int r4 = d
            android.content.Context r7 = i0.h.a.c.a0.a.a.a(r7, r8, r3, r4)
            r6.<init>(r7, r8, r3)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r6.q = r7
            com.google.android.material.button.MaterialButtonToggleGroup$c r7 = new com.google.android.material.button.MaterialButtonToggleGroup$c
            r0 = 0
            r7.<init>(r0)
            r6.x = r7
            com.google.android.material.button.MaterialButtonToggleGroup$f r7 = new com.google.android.material.button.MaterialButtonToggleGroup$f
            r7.<init>(r0)
            r6.y = r7
            java.util.LinkedHashSet r7 = new java.util.LinkedHashSet
            r7.<init>()
            r6.Y1 = r7
            com.google.android.material.button.MaterialButtonToggleGroup$a r7 = new com.google.android.material.button.MaterialButtonToggleGroup$a
            r7.<init>()
            r6.Z1 = r7
            r7 = 0
            r6.b2 = r7
            android.content.Context r0 = r6.getContext()
            int[] r2 = com.google.android.material.R.styleable.MaterialButtonToggleGroup
            int[] r5 = new int[r7]
            r1 = r8
            android.content.res.TypedArray r8 = i0.h.a.c.q.j.d(r0, r1, r2, r3, r4, r5)
            int r0 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_singleSelection
            boolean r0 = r8.getBoolean(r0, r7)
            r6.setSingleSelection((boolean) r0)
            int r0 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_checkedButton
            r1 = -1
            int r0 = r8.getResourceId(r0, r1)
            r6.e2 = r0
            int r0 = com.google.android.material.R.styleable.MaterialButtonToggleGroup_selectionRequired
            boolean r7 = r8.getBoolean(r0, r7)
            r6.d2 = r7
            r7 = 1
            r6.setChildrenDrawingOrderEnabled(r7)
            r8.recycle()
            java.util.concurrent.atomic.AtomicInteger r8 = h0.i.i.q.a
            r6.setImportantForAccessibility(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.button.MaterialButtonToggleGroup.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private int getFirstVisibleChildIndex() {
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (e(i)) {
                return i;
            }
        }
        return -1;
    }

    private int getLastVisibleChildIndex() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            if (e(childCount)) {
                return childCount;
            }
        }
        return -1;
    }

    private int getVisibleButtonCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof MaterialButton) && e(i2)) {
                i++;
            }
        }
        return i;
    }

    private void setCheckedId(int i) {
        this.e2 = i;
        c(i, true);
    }

    private void setGeneratedIdIfNeeded(MaterialButton materialButton) {
        if (materialButton.getId() == -1) {
            AtomicInteger atomicInteger = q.a;
            materialButton.setId(View.generateViewId());
        }
    }

    private void setupButtonChild(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
        materialButton.setCheckable(true);
        materialButton.addOnCheckedChangeListener(this.x);
        materialButton.setOnPressedChangeListenerInternal(this.y);
        materialButton.setShouldDrawSurfaceColorStroke(true);
    }

    public final void a() {
        LinearLayout.LayoutParams layoutParams;
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        if (firstVisibleChildIndex != -1) {
            for (int i = firstVisibleChildIndex + 1; i < getChildCount(); i++) {
                MaterialButton d3 = d(i);
                int min = Math.min(d3.getStrokeWidth(), d(i - 1).getStrokeWidth());
                ViewGroup.LayoutParams layoutParams2 = d3.getLayoutParams();
                if (layoutParams2 instanceof LinearLayout.LayoutParams) {
                    layoutParams = (LinearLayout.LayoutParams) layoutParams2;
                } else {
                    layoutParams = new LinearLayout.LayoutParams(layoutParams2.width, layoutParams2.height);
                }
                if (getOrientation() == 0) {
                    layoutParams.setMarginEnd(0);
                    layoutParams.setMarginStart(-min);
                    layoutParams.topMargin = 0;
                } else {
                    layoutParams.bottomMargin = 0;
                    layoutParams.topMargin = -min;
                    layoutParams.setMarginStart(0);
                }
                d3.setLayoutParams(layoutParams);
            }
            if (getChildCount() != 0 && firstVisibleChildIndex != -1) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) ((MaterialButton) getChildAt(firstVisibleChildIndex)).getLayoutParams();
                if (getOrientation() == 1) {
                    layoutParams3.topMargin = 0;
                    layoutParams3.bottomMargin = 0;
                    return;
                }
                layoutParams3.setMarginEnd(0);
                layoutParams3.setMarginStart(0);
                layoutParams3.leftMargin = 0;
                layoutParams3.rightMargin = 0;
            }
        }
    }

    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (!(view instanceof MaterialButton)) {
            Log.e(c, "Child views must be of type MaterialButton.");
            return;
        }
        super.addView(view, i, layoutParams);
        MaterialButton materialButton = (MaterialButton) view;
        setGeneratedIdIfNeeded(materialButton);
        setupButtonChild(materialButton);
        if (materialButton.isChecked()) {
            g(materialButton.getId(), true);
            setCheckedId(materialButton.getId());
        }
        k shapeAppearanceModel = materialButton.getShapeAppearanceModel();
        this.q.add(new d(shapeAppearanceModel.f, shapeAppearanceModel.i, shapeAppearanceModel.g, shapeAppearanceModel.h));
        q.p(materialButton, new b());
    }

    public void b(int i) {
        if (i != this.e2) {
            f(i, true);
            g(i, true);
            setCheckedId(i);
        }
    }

    public final void c(int i, boolean z) {
        Iterator it = this.Y1.iterator();
        while (it.hasNext()) {
            ((e) it.next()).a(this, i, z);
        }
    }

    public final MaterialButton d(int i) {
        return (MaterialButton) getChildAt(i);
    }

    public void dispatchDraw(Canvas canvas) {
        TreeMap treeMap = new TreeMap(this.Z1);
        int childCount = getChildCount();
        for (int i = 0; i < childCount; i++) {
            treeMap.put(d(i), Integer.valueOf(i));
        }
        this.a2 = (Integer[]) treeMap.values().toArray(new Integer[0]);
        super.dispatchDraw(canvas);
    }

    public final boolean e(int i) {
        return getChildAt(i).getVisibility() != 8;
    }

    public final void f(int i, boolean z) {
        View findViewById = findViewById(i);
        if (findViewById instanceof MaterialButton) {
            this.b2 = true;
            ((MaterialButton) findViewById).setChecked(z);
            this.b2 = false;
        }
    }

    public final boolean g(int i, boolean z) {
        List<Integer> checkedButtonIds = getCheckedButtonIds();
        if (!this.d2 || !checkedButtonIds.isEmpty()) {
            if (z && this.c2) {
                checkedButtonIds.remove(Integer.valueOf(i));
                for (Integer intValue : checkedButtonIds) {
                    int intValue2 = intValue.intValue();
                    f(intValue2, false);
                    c(intValue2, false);
                }
            }
            return true;
        }
        f(i, true);
        this.e2 = i;
        return false;
    }

    public CharSequence getAccessibilityClassName() {
        return MaterialButtonToggleGroup.class.getName();
    }

    public int getCheckedButtonId() {
        if (this.c2) {
            return this.e2;
        }
        return -1;
    }

    public List<Integer> getCheckedButtonIds() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < getChildCount(); i++) {
            MaterialButton d3 = d(i);
            if (d3.isChecked()) {
                arrayList.add(Integer.valueOf(d3.getId()));
            }
        }
        return arrayList;
    }

    public int getChildDrawingOrder(int i, int i2) {
        Integer[] numArr = this.a2;
        if (numArr != null && i2 < numArr.length) {
            return numArr[i2].intValue();
        }
        Log.w(c, "Child order wasn't updated");
        return i2;
    }

    public void h() {
        d dVar;
        int childCount = getChildCount();
        int firstVisibleChildIndex = getFirstVisibleChildIndex();
        int lastVisibleChildIndex = getLastVisibleChildIndex();
        for (int i = 0; i < childCount; i++) {
            MaterialButton d3 = d(i);
            if (d3.getVisibility() != 8) {
                k shapeAppearanceModel = d3.getShapeAppearanceModel();
                Objects.requireNonNull(shapeAppearanceModel);
                k.b bVar = new k.b(shapeAppearanceModel);
                d dVar2 = this.q.get(i);
                if (firstVisibleChildIndex != lastVisibleChildIndex) {
                    boolean z = getOrientation() == 0;
                    if (i == firstVisibleChildIndex) {
                        if (!z) {
                            i0.h.a.c.w.c cVar = dVar2.b;
                            i0.h.a.c.w.c cVar2 = d.a;
                            dVar = new d(cVar, cVar2, dVar2.c, cVar2);
                        } else if (i0.h.a.b.c.m.b.X(this)) {
                            i0.h.a.c.w.c cVar3 = d.a;
                            dVar = new d(cVar3, cVar3, dVar2.c, dVar2.d);
                        } else {
                            i0.h.a.c.w.c cVar4 = dVar2.b;
                            i0.h.a.c.w.c cVar5 = dVar2.e;
                            i0.h.a.c.w.c cVar6 = d.a;
                            dVar = new d(cVar4, cVar5, cVar6, cVar6);
                        }
                    } else if (i != lastVisibleChildIndex) {
                        dVar2 = null;
                    } else if (!z) {
                        i0.h.a.c.w.c cVar7 = d.a;
                        dVar = new d(cVar7, dVar2.e, cVar7, dVar2.d);
                    } else if (i0.h.a.b.c.m.b.X(this)) {
                        i0.h.a.c.w.c cVar8 = dVar2.b;
                        i0.h.a.c.w.c cVar9 = dVar2.e;
                        i0.h.a.c.w.c cVar10 = d.a;
                        dVar = new d(cVar8, cVar9, cVar10, cVar10);
                    } else {
                        i0.h.a.c.w.c cVar11 = d.a;
                        dVar = new d(cVar11, cVar11, dVar2.c, dVar2.d);
                    }
                    dVar2 = dVar;
                }
                if (dVar2 == null) {
                    bVar.c(0.0f);
                } else {
                    bVar.e = dVar2.b;
                    bVar.h = dVar2.e;
                    bVar.f = dVar2.c;
                    bVar.g = dVar2.d;
                }
                d3.setShapeAppearanceModel(bVar.a());
            }
        }
    }

    public void onFinishInflate() {
        super.onFinishInflate();
        int i = this.e2;
        if (i != -1) {
            f(i, true);
            g(i, true);
            setCheckedId(i);
        }
    }

    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo((AccessibilityNodeInfo.CollectionInfo) b.C0048b.a(1, getVisibleButtonCount(), false, this.c2 ? 1 : 2).a);
    }

    public void onMeasure(int i, int i2) {
        h();
        a();
        super.onMeasure(i, i2);
    }

    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        if (view instanceof MaterialButton) {
            MaterialButton materialButton = (MaterialButton) view;
            materialButton.removeOnCheckedChangeListener(this.x);
            materialButton.setOnPressedChangeListenerInternal((MaterialButton.b) null);
        }
        int indexOfChild = indexOfChild(view);
        if (indexOfChild >= 0) {
            this.q.remove(indexOfChild);
        }
        h();
        a();
    }

    public void setSelectionRequired(boolean z) {
        this.d2 = z;
    }

    public void setSingleSelection(boolean z) {
        if (this.c2 != z) {
            this.c2 = z;
            this.b2 = true;
            for (int i = 0; i < getChildCount(); i++) {
                MaterialButton d3 = d(i);
                d3.setChecked(false);
                c(d3.getId(), false);
            }
            this.b2 = false;
            setCheckedId(-1);
        }
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
