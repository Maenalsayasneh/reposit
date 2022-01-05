package h0.k.a;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import h0.f.i;
import h0.i.i.q;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: ExploreByTouchHelper */
public abstract class a extends h0.i.i.a {
    public static final Rect a = new Rect(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
    public static final b<h0.i.i.g0.b> b = new C0052a();
    public static final c<i<h0.i.i.g0.b>, h0.i.i.g0.b> c = new b();
    public final Rect d = new Rect();
    public final Rect e = new Rect();
    public final Rect f = new Rect();
    public final int[] g = new int[2];
    public final AccessibilityManager h;
    public final View i;
    public c j;
    public int k = Integer.MIN_VALUE;
    public int l = Integer.MIN_VALUE;
    public int m = Integer.MIN_VALUE;

    /* renamed from: h0.k.a.a$a  reason: collision with other inner class name */
    /* compiled from: ExploreByTouchHelper */
    public class C0052a implements b<h0.i.i.g0.b> {
        public void a(Object obj, Rect rect) {
            ((h0.i.i.g0.b) obj).b.getBoundsInParent(rect);
        }
    }

    /* compiled from: ExploreByTouchHelper */
    public class b implements c<i<h0.i.i.g0.b>, h0.i.i.g0.b> {
    }

    /* compiled from: ExploreByTouchHelper */
    public class c extends h0.i.i.g0.c {
        public c() {
        }

        public h0.i.i.g0.b a(int i) {
            return new h0.i.i.g0.b(AccessibilityNodeInfo.obtain(a.this.f(i).b));
        }

        public h0.i.i.g0.b b(int i) {
            int i2 = i == 2 ? a.this.k : a.this.l;
            if (i2 == Integer.MIN_VALUE) {
                return null;
            }
            return new h0.i.i.g0.b(AccessibilityNodeInfo.obtain(a.this.f(i2).b));
        }

        public boolean c(int i, int i2, Bundle bundle) {
            int i3;
            a aVar = a.this;
            if (i != -1) {
                boolean z = true;
                if (i2 == 1) {
                    return aVar.k(i);
                }
                if (i2 == 2) {
                    return aVar.b(i);
                }
                if (i2 == 64) {
                    if (!aVar.h.isEnabled() || !aVar.h.isTouchExplorationEnabled() || (i3 = aVar.k) == i) {
                        z = false;
                    } else {
                        if (i3 != Integer.MIN_VALUE) {
                            aVar.a(i3);
                        }
                        aVar.k = i;
                        aVar.i.invalidate();
                        aVar.l(i, 32768);
                    }
                    return z;
                } else if (i2 != 128) {
                    return aVar.g(i, i2, bundle);
                } else {
                    return aVar.a(i);
                }
            } else {
                View view = aVar.i;
                AtomicInteger atomicInteger = q.a;
                return view.performAccessibilityAction(i2, bundle);
            }
        }
    }

    public a(View view) {
        if (view != null) {
            this.i = view;
            this.h = (AccessibilityManager) view.getContext().getSystemService("accessibility");
            view.setFocusable(true);
            AtomicInteger atomicInteger = q.a;
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("View may not be null");
    }

    public final boolean a(int i2) {
        if (this.k != i2) {
            return false;
        }
        this.k = Integer.MIN_VALUE;
        this.i.invalidate();
        l(i2, 65536);
        return true;
    }

    public final boolean b(int i2) {
        if (this.l != i2) {
            return false;
        }
        this.l = Integer.MIN_VALUE;
        j(i2, false);
        l(i2, 8);
        return true;
    }

    public final h0.i.i.g0.b c(int i2) {
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain();
        h0.i.i.g0.b bVar = new h0.i.i.g0.b(obtain);
        obtain.setEnabled(true);
        obtain.setFocusable(true);
        obtain.setClassName("android.view.View");
        Rect rect = a;
        obtain.setBoundsInParent(rect);
        obtain.setBoundsInScreen(rect);
        View view = this.i;
        bVar.c = -1;
        obtain.setParent(view);
        i(i2, bVar);
        if (bVar.g() == null && bVar.e() == null) {
            throw new RuntimeException("Callbacks must add text or a content description in populateNodeForVirtualViewId()");
        }
        obtain.getBoundsInParent(this.e);
        if (!this.e.equals(rect)) {
            int actions = obtain.getActions();
            if ((actions & 64) != 0) {
                throw new RuntimeException("Callbacks must not add ACTION_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            } else if ((actions & 128) == 0) {
                obtain.setPackageName(this.i.getContext().getPackageName());
                View view2 = this.i;
                bVar.d = i2;
                obtain.setSource(view2, i2);
                boolean z = false;
                if (this.k == i2) {
                    obtain.setAccessibilityFocused(true);
                    obtain.addAction(128);
                } else {
                    obtain.setAccessibilityFocused(false);
                    obtain.addAction(64);
                }
                boolean z2 = this.l == i2;
                if (z2) {
                    obtain.addAction(2);
                } else if (obtain.isFocusable()) {
                    obtain.addAction(1);
                }
                obtain.setFocused(z2);
                this.i.getLocationOnScreen(this.g);
                obtain.getBoundsInScreen(this.d);
                if (this.d.equals(rect)) {
                    obtain.getBoundsInParent(this.d);
                    if (bVar.c != -1) {
                        h0.i.i.g0.b bVar2 = new h0.i.i.g0.b(AccessibilityNodeInfo.obtain());
                        for (int i3 = bVar.c; i3 != -1; i3 = bVar2.c) {
                            View view3 = this.i;
                            bVar2.c = -1;
                            bVar2.b.setParent(view3, -1);
                            bVar2.b.setBoundsInParent(a);
                            i(i3, bVar2);
                            bVar2.b.getBoundsInParent(this.e);
                            Rect rect2 = this.d;
                            Rect rect3 = this.e;
                            rect2.offset(rect3.left, rect3.top);
                        }
                        bVar2.b.recycle();
                    }
                    this.d.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                }
                if (this.i.getLocalVisibleRect(this.f)) {
                    this.f.offset(this.g[0] - this.i.getScrollX(), this.g[1] - this.i.getScrollY());
                    if (this.d.intersect(this.f)) {
                        bVar.b.setBoundsInScreen(this.d);
                        Rect rect4 = this.d;
                        if (rect4 != null && !rect4.isEmpty() && this.i.getWindowVisibility() == 0) {
                            ViewParent parent = this.i.getParent();
                            while (true) {
                                if (parent instanceof View) {
                                    View view4 = (View) parent;
                                    if (view4.getAlpha() <= 0.0f || view4.getVisibility() != 0) {
                                        break;
                                    }
                                    parent = view4.getParent();
                                } else if (parent != null) {
                                    z = true;
                                }
                            }
                        }
                        if (z) {
                            bVar.b.setVisibleToUser(true);
                        }
                    }
                }
                return bVar;
            } else {
                throw new RuntimeException("Callbacks must not add ACTION_CLEAR_ACCESSIBILITY_FOCUS in populateNodeForVirtualViewId()");
            }
        } else {
            throw new RuntimeException("Callbacks must set parent bounds in populateNodeForVirtualViewId()");
        }
    }

    public abstract void d(List<Integer> list);

    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0149, code lost:
        if (r13 < ((r17 * r17) + ((r12 * 13) * r12))) goto L_0x014b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0155 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x0150  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean e(int r20, android.graphics.Rect r21) {
        /*
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r0.d(r3)
            h0.f.i r4 = new h0.f.i
            r4.<init>()
            r5 = 0
            r6 = r5
        L_0x0015:
            int r7 = r3.size()
            if (r6 >= r7) goto L_0x0039
            java.lang.Object r7 = r3.get(r6)
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            h0.i.i.g0.b r7 = r0.c(r7)
            java.lang.Object r8 = r3.get(r6)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            r4.h(r8, r7)
            int r6 = r6 + 1
            goto L_0x0015
        L_0x0039:
            int r3 = r0.l
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r3 != r7) goto L_0x0041
            r3 = 0
            goto L_0x0047
        L_0x0041:
            java.lang.Object r3 = r4.e(r3)
            h0.i.i.g0.b r3 = (h0.i.i.g0.b) r3
        L_0x0047:
            r8 = 2
            r9 = -1
            r10 = 1
            if (r1 == r10) goto L_0x0158
            if (r1 == r8) goto L_0x0158
            r8 = 130(0x82, float:1.82E-43)
            r11 = 66
            r12 = 33
            r13 = 17
            if (r1 == r13) goto L_0x0067
            if (r1 == r12) goto L_0x0067
            if (r1 == r11) goto L_0x0067
            if (r1 != r8) goto L_0x005f
            goto L_0x0067
        L_0x005f:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD, FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            r1.<init>(r2)
            throw r1
        L_0x0067:
            android.graphics.Rect r14 = new android.graphics.Rect
            r14.<init>()
            int r15 = r0.l
            java.lang.String r6 = "direction must be one of {FOCUS_UP, FOCUS_DOWN, FOCUS_LEFT, FOCUS_RIGHT}."
            if (r15 == r7) goto L_0x007c
            h0.i.i.g0.b r2 = r0.f(r15)
            android.view.accessibility.AccessibilityNodeInfo r2 = r2.b
            r2.getBoundsInParent(r14)
            goto L_0x00a9
        L_0x007c:
            if (r2 == 0) goto L_0x0082
            r14.set(r2)
            goto L_0x00a9
        L_0x0082:
            android.view.View r2 = r0.i
            int r15 = r2.getWidth()
            int r2 = r2.getHeight()
            if (r1 == r13) goto L_0x00a6
            if (r1 == r12) goto L_0x00a2
            if (r1 == r11) goto L_0x009e
            if (r1 != r8) goto L_0x0098
            r14.set(r5, r9, r15, r9)
            goto L_0x00a9
        L_0x0098:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x009e:
            r14.set(r9, r5, r9, r2)
            goto L_0x00a9
        L_0x00a2:
            r14.set(r5, r2, r15, r2)
            goto L_0x00a9
        L_0x00a6:
            r14.set(r15, r5, r15, r2)
        L_0x00a9:
            h0.k.a.c<h0.f.i<h0.i.i.g0.b>, h0.i.i.g0.b> r2 = c
            h0.k.a.b<h0.i.i.g0.b> r15 = b
            android.graphics.Rect r7 = new android.graphics.Rect
            r7.<init>(r14)
            if (r1 == r13) goto L_0x00dd
            if (r1 == r12) goto L_0x00d4
            if (r1 == r11) goto L_0x00ca
            if (r1 != r8) goto L_0x00c4
            int r6 = r14.height()
            int r6 = r6 + r10
            int r6 = -r6
            r7.offset(r5, r6)
            goto L_0x00e5
        L_0x00c4:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            r1.<init>(r6)
            throw r1
        L_0x00ca:
            int r6 = r14.width()
            int r6 = r6 + r10
            int r6 = -r6
            r7.offset(r6, r5)
            goto L_0x00e5
        L_0x00d4:
            int r6 = r14.height()
            int r6 = r6 + r10
            r7.offset(r5, r6)
            goto L_0x00e5
        L_0x00dd:
            int r6 = r14.width()
            int r6 = r6 + r10
            r7.offset(r6, r5)
        L_0x00e5:
            h0.k.a.a$b r2 = (h0.k.a.a.b) r2
            java.util.Objects.requireNonNull(r2)
            int r2 = r4.i()
            android.graphics.Rect r6 = new android.graphics.Rect
            r6.<init>()
            r8 = r5
            r16 = 0
        L_0x00f6:
            if (r8 >= r2) goto L_0x01cd
            boolean r11 = r4.d
            if (r11 == 0) goto L_0x00ff
            r4.d()
        L_0x00ff:
            java.lang.Object[] r11 = r4.x
            r11 = r11[r8]
            h0.i.i.g0.b r11 = (h0.i.i.g0.b) r11
            if (r11 != r3) goto L_0x0108
            goto L_0x0155
        L_0x0108:
            r12 = r15
            h0.k.a.a$a r12 = (h0.k.a.a.C0052a) r12
            r12.a(r11, r6)
            boolean r12 = g0.a.b.b.a.Y(r14, r6, r1)
            if (r12 != 0) goto L_0x0115
            goto L_0x014d
        L_0x0115:
            boolean r12 = g0.a.b.b.a.Y(r14, r7, r1)
            if (r12 != 0) goto L_0x011c
            goto L_0x014b
        L_0x011c:
            boolean r12 = g0.a.b.b.a.d(r1, r14, r6, r7)
            if (r12 == 0) goto L_0x0123
            goto L_0x014b
        L_0x0123:
            boolean r12 = g0.a.b.b.a.d(r1, r14, r7, r6)
            if (r12 == 0) goto L_0x012a
            goto L_0x014d
        L_0x012a:
            int r12 = g0.a.b.b.a.c0(r1, r14, r6)
            int r13 = g0.a.b.b.a.f0(r1, r14, r6)
            int r17 = r12 * 13
            int r17 = r17 * r12
            int r13 = r13 * r13
            int r13 = r13 + r17
            int r12 = g0.a.b.b.a.c0(r1, r14, r7)
            int r17 = g0.a.b.b.a.f0(r1, r14, r7)
            int r18 = r12 * 13
            int r18 = r18 * r12
            int r17 = r17 * r17
            int r12 = r17 + r18
            if (r13 >= r12) goto L_0x014d
        L_0x014b:
            r12 = r10
            goto L_0x014e
        L_0x014d:
            r12 = r5
        L_0x014e:
            if (r12 == 0) goto L_0x0155
            r7.set(r6)
            r16 = r11
        L_0x0155:
            int r8 = r8 + 1
            goto L_0x00f6
        L_0x0158:
            android.view.View r2 = r0.i
            java.util.concurrent.atomic.AtomicInteger r6 = h0.i.i.q.a
            int r2 = r2.getLayoutDirection()
            if (r2 != r10) goto L_0x0164
            r2 = r10
            goto L_0x0165
        L_0x0164:
            r2 = r5
        L_0x0165:
            h0.k.a.c<h0.f.i<h0.i.i.g0.b>, h0.i.i.g0.b> r6 = c
            h0.k.a.b<h0.i.i.g0.b> r7 = b
            h0.k.a.a$b r6 = (h0.k.a.a.b) r6
            java.util.Objects.requireNonNull(r6)
            int r6 = r4.i()
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>(r6)
            r12 = r5
        L_0x0178:
            if (r12 >= r6) goto L_0x018d
            boolean r13 = r4.d
            if (r13 == 0) goto L_0x0181
            r4.d()
        L_0x0181:
            java.lang.Object[] r13 = r4.x
            r13 = r13[r12]
            h0.i.i.g0.b r13 = (h0.i.i.g0.b) r13
            r11.add(r13)
            int r12 = r12 + 1
            goto L_0x0178
        L_0x018d:
            h0.k.a.d r6 = new h0.k.a.d
            r6.<init>(r2, r7)
            java.util.Collections.sort(r11, r6)
            if (r1 == r10) goto L_0x01b7
            if (r1 != r8) goto L_0x01af
            int r1 = r11.size()
            if (r3 != 0) goto L_0x01a1
            r2 = r9
            goto L_0x01a5
        L_0x01a1:
            int r2 = r11.lastIndexOf(r3)
        L_0x01a5:
            int r2 = r2 + r10
            if (r2 >= r1) goto L_0x01ad
            java.lang.Object r6 = r11.get(r2)
            goto L_0x01c9
        L_0x01ad:
            r6 = 0
            goto L_0x01c9
        L_0x01af:
            java.lang.IllegalArgumentException r1 = new java.lang.IllegalArgumentException
            java.lang.String r2 = "direction must be one of {FOCUS_FORWARD, FOCUS_BACKWARD}."
            r1.<init>(r2)
            throw r1
        L_0x01b7:
            int r1 = r11.size()
            if (r3 != 0) goto L_0x01be
            goto L_0x01c2
        L_0x01be:
            int r1 = r11.indexOf(r3)
        L_0x01c2:
            int r1 = r1 + r9
            if (r1 < 0) goto L_0x01ad
            java.lang.Object r6 = r11.get(r1)
        L_0x01c9:
            r16 = r6
            h0.i.i.g0.b r16 = (h0.i.i.g0.b) r16
        L_0x01cd:
            r1 = r16
            if (r1 != 0) goto L_0x01d4
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            goto L_0x01ee
        L_0x01d4:
            boolean r2 = r4.d
            if (r2 == 0) goto L_0x01db
            r4.d()
        L_0x01db:
            int r2 = r4.y
            if (r5 >= r2) goto L_0x01ea
            java.lang.Object[] r2 = r4.x
            r2 = r2[r5]
            if (r2 != r1) goto L_0x01e7
            r9 = r5
            goto L_0x01ea
        L_0x01e7:
            int r5 = r5 + 1
            goto L_0x01db
        L_0x01ea:
            int r7 = r4.g(r9)
        L_0x01ee:
            boolean r1 = r0.k(r7)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.k.a.a.e(int, android.graphics.Rect):boolean");
    }

    public h0.i.i.g0.b f(int i2) {
        if (i2 != -1) {
            return c(i2);
        }
        AccessibilityNodeInfo obtain = AccessibilityNodeInfo.obtain(this.i);
        h0.i.i.g0.b bVar = new h0.i.i.g0.b(obtain);
        View view = this.i;
        AtomicInteger atomicInteger = q.a;
        view.onInitializeAccessibilityNodeInfo(obtain);
        ArrayList arrayList = new ArrayList();
        d(arrayList);
        if (obtain.getChildCount() <= 0 || arrayList.size() <= 0) {
            int size = arrayList.size();
            for (int i3 = 0; i3 < size; i3++) {
                bVar.b.addChild(this.i, ((Integer) arrayList.get(i3)).intValue());
            }
            return bVar;
        }
        throw new RuntimeException("Views cannot have both real and virtual children");
    }

    public abstract boolean g(int i2, int i3, Bundle bundle);

    public h0.i.i.g0.c getAccessibilityNodeProvider(View view) {
        if (this.j == null) {
            this.j = new c();
        }
        return this.j;
    }

    public void h(h0.i.i.g0.b bVar) {
    }

    public abstract void i(int i2, h0.i.i.g0.b bVar);

    public void j(int i2, boolean z) {
    }

    public final boolean k(int i2) {
        int i3;
        if ((!this.i.isFocused() && !this.i.requestFocus()) || (i3 = this.l) == i2) {
            return false;
        }
        if (i3 != Integer.MIN_VALUE) {
            b(i3);
        }
        if (i2 == Integer.MIN_VALUE) {
            return false;
        }
        this.l = i2;
        j(i2, true);
        l(i2, 8);
        return true;
    }

    public final boolean l(int i2, int i3) {
        ViewParent parent;
        AccessibilityEvent accessibilityEvent;
        if (i2 == Integer.MIN_VALUE || !this.h.isEnabled() || (parent = this.i.getParent()) == null) {
            return false;
        }
        if (i2 != -1) {
            accessibilityEvent = AccessibilityEvent.obtain(i3);
            h0.i.i.g0.b f2 = f(i2);
            accessibilityEvent.getText().add(f2.g());
            accessibilityEvent.setContentDescription(f2.e());
            accessibilityEvent.setScrollable(f2.b.isScrollable());
            accessibilityEvent.setPassword(f2.b.isPassword());
            accessibilityEvent.setEnabled(f2.b.isEnabled());
            accessibilityEvent.setChecked(f2.b.isChecked());
            if (!accessibilityEvent.getText().isEmpty() || accessibilityEvent.getContentDescription() != null) {
                accessibilityEvent.setClassName(f2.b.getClassName());
                accessibilityEvent.setSource(this.i, i2);
                accessibilityEvent.setPackageName(this.i.getContext().getPackageName());
            } else {
                throw new RuntimeException("Callbacks must add text or a content description in populateEventForVirtualViewId()");
            }
        } else {
            accessibilityEvent = AccessibilityEvent.obtain(i3);
            this.i.onInitializeAccessibilityEvent(accessibilityEvent);
        }
        return parent.requestSendAccessibilityEvent(this.i, accessibilityEvent);
    }

    public final void m(int i2) {
        int i3 = this.m;
        if (i3 != i2) {
            this.m = i2;
            l(i2, 128);
            l(i3, 256);
        }
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, h0.i.i.g0.b bVar) {
        super.onInitializeAccessibilityNodeInfo(view, bVar);
        h(bVar);
    }
}
