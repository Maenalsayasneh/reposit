package h0.b.f;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.appcompat.R;
import h0.i.j.c;
import java.lang.reflect.Field;

/* compiled from: DropDownListView */
public class c0 extends ListView {
    public int Y1;
    public Field Z1;
    public a a2;
    public boolean b2;
    public final Rect c = new Rect();
    public boolean c2;
    public int d = 0;
    public boolean d2;
    public c e2;
    public b f2;
    public int q = 0;
    public int x = 0;
    public int y = 0;

    /* compiled from: DropDownListView */
    public static class a extends h0.b.c.a.a {
        public boolean d = true;

        public a(Drawable drawable) {
            super(drawable);
        }

        public void draw(Canvas canvas) {
            if (this.d) {
                this.c.draw(canvas);
            }
        }

        public void setHotspot(float f, float f2) {
            if (this.d) {
                this.c.setHotspot(f, f2);
            }
        }

        public void setHotspotBounds(int i, int i2, int i3, int i4) {
            if (this.d) {
                this.c.setHotspotBounds(i, i2, i3, i4);
            }
        }

        public boolean setState(int[] iArr) {
            if (this.d) {
                return this.c.setState(iArr);
            }
            return false;
        }

        public boolean setVisible(boolean z, boolean z2) {
            if (this.d) {
                return super.setVisible(z, z2);
            }
            return false;
        }
    }

    /* compiled from: DropDownListView */
    public class b implements Runnable {
        public b() {
        }

        public void run() {
            c0 c0Var = c0.this;
            c0Var.f2 = null;
            c0Var.drawableStateChanged();
        }
    }

    public c0(Context context, boolean z) {
        super(context, (AttributeSet) null, R.attr.dropDownListViewStyle);
        this.c2 = z;
        setCacheColorHint(0);
        try {
            Field declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.Z1 = declaredField;
            declaredField.setAccessible(true);
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }

    private void setSelectorEnabled(boolean z) {
        a aVar = this.a2;
        if (aVar != null) {
            aVar.d = z;
        }
    }

    public int a(int i, int i2, int i3) {
        int i4;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i5 = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        View view = null;
        while (i6 < count) {
            int itemViewType = adapter.getItemViewType(i6);
            if (itemViewType != i7) {
                view = null;
                i7 = itemViewType;
            }
            view = adapter.getView(i6, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i9 = layoutParams.height;
            if (i9 > 0) {
                i4 = View.MeasureSpec.makeMeasureSpec(i9, 1073741824);
            } else {
                i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view.measure(i, i4);
            view.forceLayout();
            if (i6 > 0) {
                i5 += dividerHeight;
            }
            i5 += view.getMeasuredHeight();
            if (i5 >= i2) {
                return (i3 < 0 || i6 <= i3 || i8 <= 0 || i5 == i2) ? i2 : i8;
            }
            if (i3 >= 0 && i6 >= i3) {
                i8 = i5;
            }
            i6++;
        }
        return i5;
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x013f  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0144  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x015a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean b(android.view.MotionEvent r17, int r18) {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            int r3 = r17.getActionMasked()
            r4 = 1
            r5 = 0
            if (r3 == r4) goto L_0x0018
            r0 = 2
            if (r3 == r0) goto L_0x0016
            r0 = 3
            if (r3 == r0) goto L_0x001f
            r0 = r4
            r4 = r5
            goto L_0x0126
        L_0x0016:
            r0 = r4
            goto L_0x0019
        L_0x0018:
            r0 = r5
        L_0x0019:
            int r6 = r17.findPointerIndex(r18)
            if (r6 >= 0) goto L_0x0023
        L_0x001f:
            r0 = r5
            r4 = r0
            goto L_0x0126
        L_0x0023:
            float r7 = r2.getX(r6)
            int r7 = (int) r7
            float r6 = r2.getY(r6)
            int r6 = (int) r6
            int r8 = r1.pointToPosition(r7, r6)
            r9 = -1
            if (r8 != r9) goto L_0x0036
            goto L_0x0126
        L_0x0036:
            int r0 = r16.getFirstVisiblePosition()
            int r0 = r8 - r0
            android.view.View r10 = r1.getChildAt(r0)
            float r7 = (float) r7
            float r6 = (float) r6
            r1.d2 = r4
            r1.drawableHotspotChanged(r7, r6)
            boolean r0 = r16.isPressed()
            if (r0 != 0) goto L_0x0050
            r1.setPressed(r4)
        L_0x0050:
            r16.layoutChildren()
            int r0 = r1.Y1
            if (r0 == r9) goto L_0x006d
            int r11 = r16.getFirstVisiblePosition()
            int r0 = r0 - r11
            android.view.View r0 = r1.getChildAt(r0)
            if (r0 == 0) goto L_0x006d
            if (r0 == r10) goto L_0x006d
            boolean r11 = r0.isPressed()
            if (r11 == 0) goto L_0x006d
            r0.setPressed(r5)
        L_0x006d:
            r1.Y1 = r8
            int r0 = r10.getLeft()
            float r0 = (float) r0
            float r0 = r7 - r0
            int r11 = r10.getTop()
            float r11 = (float) r11
            float r11 = r6 - r11
            r10.drawableHotspotChanged(r0, r11)
            boolean r0 = r10.isPressed()
            if (r0 != 0) goto L_0x0089
            r10.setPressed(r4)
        L_0x0089:
            android.graphics.drawable.Drawable r11 = r16.getSelector()
            if (r11 == 0) goto L_0x0093
            if (r8 == r9) goto L_0x0093
            r12 = r4
            goto L_0x0094
        L_0x0093:
            r12 = r5
        L_0x0094:
            if (r12 == 0) goto L_0x0099
            r11.setVisible(r5, r5)
        L_0x0099:
            android.graphics.Rect r0 = r1.c
            int r13 = r10.getLeft()
            int r14 = r10.getTop()
            int r15 = r10.getRight()
            int r4 = r10.getBottom()
            r0.set(r13, r14, r15, r4)
            int r4 = r0.left
            int r13 = r1.d
            int r4 = r4 - r13
            r0.left = r4
            int r4 = r0.top
            int r13 = r1.q
            int r4 = r4 - r13
            r0.top = r4
            int r4 = r0.right
            int r13 = r1.x
            int r4 = r4 + r13
            r0.right = r4
            int r4 = r0.bottom
            int r13 = r1.y
            int r4 = r4 + r13
            r0.bottom = r4
            java.lang.reflect.Field r0 = r1.Z1     // Catch:{ IllegalAccessException -> 0x00ea }
            boolean r0 = r0.getBoolean(r1)     // Catch:{ IllegalAccessException -> 0x00ea }
            boolean r4 = r10.isEnabled()     // Catch:{ IllegalAccessException -> 0x00ea }
            if (r4 == r0) goto L_0x00ee
            java.lang.reflect.Field r4 = r1.Z1     // Catch:{ IllegalAccessException -> 0x00ea }
            if (r0 != 0) goto L_0x00dc
            r0 = 1
            goto L_0x00dd
        L_0x00dc:
            r0 = r5
        L_0x00dd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)     // Catch:{ IllegalAccessException -> 0x00ea }
            r4.set(r1, r0)     // Catch:{ IllegalAccessException -> 0x00ea }
            if (r8 == r9) goto L_0x00ee
            r16.refreshDrawableState()     // Catch:{ IllegalAccessException -> 0x00ea }
            goto L_0x00ee
        L_0x00ea:
            r0 = move-exception
            r0.printStackTrace()
        L_0x00ee:
            if (r12 == 0) goto L_0x0109
            android.graphics.Rect r0 = r1.c
            float r4 = r0.exactCenterX()
            float r0 = r0.exactCenterY()
            int r12 = r16.getVisibility()
            if (r12 != 0) goto L_0x0102
            r12 = 1
            goto L_0x0103
        L_0x0102:
            r12 = r5
        L_0x0103:
            r11.setVisible(r12, r5)
            r11.setHotspot(r4, r0)
        L_0x0109:
            android.graphics.drawable.Drawable r0 = r16.getSelector()
            if (r0 == 0) goto L_0x0114
            if (r8 == r9) goto L_0x0114
            r0.setHotspot(r7, r6)
        L_0x0114:
            r1.setSelectorEnabled(r5)
            r16.refreshDrawableState()
            r4 = 1
            if (r3 != r4) goto L_0x0124
            long r3 = r1.getItemIdAtPosition(r8)
            r1.performItemClick(r10, r8, r3)
        L_0x0124:
            r4 = r5
            r0 = 1
        L_0x0126:
            if (r0 == 0) goto L_0x012a
            if (r4 == 0) goto L_0x0142
        L_0x012a:
            r1.d2 = r5
            r1.setPressed(r5)
            r16.drawableStateChanged()
            int r3 = r1.Y1
            int r4 = r16.getFirstVisiblePosition()
            int r3 = r3 - r4
            android.view.View r3 = r1.getChildAt(r3)
            if (r3 == 0) goto L_0x0142
            r3.setPressed(r5)
        L_0x0142:
            if (r0 == 0) goto L_0x015a
            h0.i.j.c r3 = r1.e2
            if (r3 != 0) goto L_0x014f
            h0.i.j.c r3 = new h0.i.j.c
            r3.<init>(r1)
            r1.e2 = r3
        L_0x014f:
            h0.i.j.c r3 = r1.e2
            boolean r4 = r3.j2
            r5 = 1
            r3.j2 = r5
            r3.onTouch(r1, r2)
            goto L_0x0167
        L_0x015a:
            h0.i.j.c r2 = r1.e2
            if (r2 == 0) goto L_0x0167
            boolean r3 = r2.j2
            if (r3 == 0) goto L_0x0165
            r2.d()
        L_0x0165:
            r2.j2 = r5
        L_0x0167:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.f.c0.b(android.view.MotionEvent, int):boolean");
    }

    public final void c() {
        Drawable selector = getSelector();
        if (selector != null && this.d2 && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public void drawableStateChanged() {
        if (this.f2 == null) {
            super.drawableStateChanged();
            setSelectorEnabled(true);
            c();
        }
    }

    public boolean hasFocus() {
        return this.c2 || super.hasFocus();
    }

    public boolean hasWindowFocus() {
        return this.c2 || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.c2 || super.isFocused();
    }

    public boolean isInTouchMode() {
        return (this.c2 && this.b2) || super.isInTouchMode();
    }

    public void onDetachedFromWindow() {
        this.f2 = null;
        super.onDetachedFromWindow();
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f2 == null) {
            b bVar = new b();
            this.f2 = bVar;
            post(bVar);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (!(pointToPosition == -1 || pointToPosition == getSelectedItemPosition())) {
                View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
                if (childAt.isEnabled()) {
                    setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
                }
                c();
            }
        } else {
            setSelection(-1);
        }
        return onHoverEvent;
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.Y1 = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        b bVar = this.f2;
        if (bVar != null) {
            c0 c0Var = c0.this;
            c0Var.f2 = null;
            c0Var.removeCallbacks(bVar);
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z) {
        this.b2 = z;
    }

    public void setSelector(Drawable drawable) {
        a aVar = drawable != null ? new a(drawable) : null;
        this.a2 = aVar;
        super.setSelector(aVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.q = rect.top;
        this.x = rect.right;
        this.y = rect.bottom;
    }
}
