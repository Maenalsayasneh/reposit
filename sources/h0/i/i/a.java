package h0.i.i;

import android.os.Build;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import androidx.core.R;
import h0.i.i.g0.b;
import h0.i.i.g0.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AccessibilityDelegateCompat */
public class a {
    private static final View.AccessibilityDelegate DEFAULT_DELEGATE = new View.AccessibilityDelegate();
    private final View.AccessibilityDelegate mBridge;
    private final View.AccessibilityDelegate mOriginalDelegate;

    /* renamed from: h0.i.i.a$a  reason: collision with other inner class name */
    /* compiled from: AccessibilityDelegateCompat */
    public static final class C0047a extends View.AccessibilityDelegate {
        public final a a;

        public C0047a(a aVar) {
            this.a = aVar;
        }

        public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            return this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public AccessibilityNodeProvider getAccessibilityNodeProvider(View view) {
            c accessibilityNodeProvider = this.a.getAccessibilityNodeProvider(view);
            if (accessibilityNodeProvider != null) {
                return (AccessibilityNodeProvider) accessibilityNodeProvider.a;
            }
            return null;
        }

        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.onInitializeAccessibilityEvent(view, accessibilityEvent);
        }

        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
            boolean z;
            boolean z2;
            int i;
            View view2 = view;
            AccessibilityNodeInfo accessibilityNodeInfo2 = accessibilityNodeInfo;
            Class<Boolean> cls = Boolean.class;
            b bVar = new b(accessibilityNodeInfo2);
            AtomicInteger atomicInteger = q.a;
            Boolean bool = (Boolean) new r(R.id.tag_screen_reader_focusable, cls, 28).d(view2);
            if (bool == null) {
                z = false;
            } else {
                z = bool.booleanValue();
            }
            int i2 = Build.VERSION.SDK_INT;
            boolean z3 = true;
            if (i2 >= 28) {
                accessibilityNodeInfo2.setScreenReaderFocusable(z);
            } else {
                bVar.h(1, z);
            }
            Boolean bool2 = (Boolean) new u(R.id.tag_accessibility_heading, cls, 28).d(view2);
            if (bool2 == null) {
                z2 = false;
            } else {
                z2 = bool2.booleanValue();
            }
            if (i2 >= 28) {
                accessibilityNodeInfo2.setHeading(z2);
            } else {
                bVar.h(2, z2);
            }
            CharSequence g = q.g(view);
            if (i2 >= 28) {
                accessibilityNodeInfo2.setPaneTitle(g);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.PANE_TITLE_KEY", g);
            }
            CharSequence charSequence = (CharSequence) new t(R.id.tag_state_description, CharSequence.class, 64, 30).d(view2);
            if (i2 < 30) {
                z3 = false;
            }
            if (z3) {
                accessibilityNodeInfo2.setStateDescription(charSequence);
            } else {
                accessibilityNodeInfo.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY", charSequence);
            }
            this.a.onInitializeAccessibilityNodeInfo(view2, bVar);
            CharSequence text = accessibilityNodeInfo.getText();
            if (i2 < 26) {
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
                accessibilityNodeInfo.getExtras().remove("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
                SparseArray sparseArray = (SparseArray) view2.getTag(R.id.tag_accessibility_clickable_spans);
                if (sparseArray != null) {
                    ArrayList arrayList = new ArrayList();
                    for (int i3 = 0; i3 < sparseArray.size(); i3++) {
                        if (((WeakReference) sparseArray.valueAt(i3)).get() == null) {
                            arrayList.add(Integer.valueOf(i3));
                        }
                    }
                    for (int i4 = 0; i4 < arrayList.size(); i4++) {
                        sparseArray.remove(((Integer) arrayList.get(i4)).intValue());
                    }
                }
                ClickableSpan[] d = b.d(text);
                if (d != null && d.length > 0) {
                    bVar.f().putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY", R.id.accessibility_action_clickable_span);
                    int i5 = R.id.tag_accessibility_clickable_spans;
                    SparseArray sparseArray2 = (SparseArray) view2.getTag(i5);
                    if (sparseArray2 == null) {
                        sparseArray2 = new SparseArray();
                        view2.setTag(i5, sparseArray2);
                    }
                    for (int i6 = 0; i6 < d.length; i6++) {
                        ClickableSpan clickableSpan = d[i6];
                        int i7 = 0;
                        while (true) {
                            if (i7 >= sparseArray2.size()) {
                                i = b.a;
                                b.a = i + 1;
                                break;
                            } else if (clickableSpan.equals((ClickableSpan) ((WeakReference) sparseArray2.valueAt(i7)).get())) {
                                i = sparseArray2.keyAt(i7);
                                break;
                            } else {
                                i7++;
                            }
                        }
                        sparseArray2.put(i, new WeakReference(d[i6]));
                        ClickableSpan clickableSpan2 = d[i6];
                        Spanned spanned = (Spanned) text;
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").add(Integer.valueOf(spanned.getSpanStart(clickableSpan2)));
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY").add(Integer.valueOf(spanned.getSpanEnd(clickableSpan2)));
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY").add(Integer.valueOf(spanned.getSpanFlags(clickableSpan2)));
                        bVar.b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY").add(Integer.valueOf(i));
                    }
                }
            }
            List<b.a> actionList = a.getActionList(view);
            for (int i8 = 0; i8 < actionList.size(); i8++) {
                bVar.a(actionList.get(i8));
            }
        }

        public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            this.a.onPopulateAccessibilityEvent(view, accessibilityEvent);
        }

        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            return this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }

        public boolean performAccessibilityAction(View view, int i, Bundle bundle) {
            return this.a.performAccessibilityAction(view, i, bundle);
        }

        public void sendAccessibilityEvent(View view, int i) {
            this.a.sendAccessibilityEvent(view, i);
        }

        public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
            this.a.sendAccessibilityEventUnchecked(view, accessibilityEvent);
        }
    }

    public a() {
        this(DEFAULT_DELEGATE);
    }

    public static List<b.a> getActionList(View view) {
        List<b.a> list = (List) view.getTag(R.id.tag_accessibility_actions);
        return list == null ? Collections.emptyList() : list;
    }

    private boolean isSpanStillValid(ClickableSpan clickableSpan, View view) {
        if (clickableSpan != null) {
            ClickableSpan[] d = b.d(view.createAccessibilityNodeInfo().getText());
            int i = 0;
            while (d != null && i < d.length) {
                if (clickableSpan.equals(d[i])) {
                    return true;
                }
                i++;
            }
        }
        return false;
    }

    private boolean performClickableSpanAction(int i, View view) {
        WeakReference weakReference;
        SparseArray sparseArray = (SparseArray) view.getTag(R.id.tag_accessibility_clickable_spans);
        if (sparseArray == null || (weakReference = (WeakReference) sparseArray.get(i)) == null) {
            return false;
        }
        ClickableSpan clickableSpan = (ClickableSpan) weakReference.get();
        if (!isSpanStillValid(clickableSpan, view)) {
            return false;
        }
        clickableSpan.onClick(view);
        return true;
    }

    public boolean dispatchPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public c getAccessibilityNodeProvider(View view) {
        AccessibilityNodeProvider accessibilityNodeProvider = this.mOriginalDelegate.getAccessibilityNodeProvider(view);
        if (accessibilityNodeProvider != null) {
            return new c(accessibilityNodeProvider);
        }
        return null;
    }

    public View.AccessibilityDelegate getBridge() {
        return this.mBridge;
    }

    public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onInitializeAccessibilityEvent(view, accessibilityEvent);
    }

    public void onInitializeAccessibilityNodeInfo(View view, b bVar) {
        this.mOriginalDelegate.onInitializeAccessibilityNodeInfo(view, bVar.b);
    }

    public void onPopulateAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.onPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        return this.mOriginalDelegate.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean performAccessibilityAction(android.view.View r8, int r9, android.os.Bundle r10) {
        /*
            r7 = this;
            java.util.List r0 = getActionList(r8)
            r1 = 0
            r2 = r1
        L_0x0006:
            int r3 = r0.size()
            if (r2 >= r3) goto L_0x0066
            java.lang.Object r3 = r0.get(r2)
            h0.i.i.g0.b$a r3 = (h0.i.i.g0.b.a) r3
            int r4 = r3.a()
            if (r4 != r9) goto L_0x0063
            h0.i.i.g0.d r0 = r3.l
            if (r0 == 0) goto L_0x0066
            r0 = 0
            java.lang.Class<? extends h0.i.i.g0.d$a> r2 = r3.k
            if (r2 == 0) goto L_0x005b
            java.lang.Class[] r4 = new java.lang.Class[r1]     // Catch:{ Exception -> 0x0035 }
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r4)     // Catch:{ Exception -> 0x0035 }
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch:{ Exception -> 0x0035 }
            java.lang.Object r1 = r2.newInstance(r1)     // Catch:{ Exception -> 0x0035 }
            h0.i.i.g0.d$a r1 = (h0.i.i.g0.d.a) r1     // Catch:{ Exception -> 0x0035 }
            java.util.Objects.requireNonNull(r1)     // Catch:{ Exception -> 0x0033 }
            goto L_0x005a
        L_0x0033:
            r0 = move-exception
            goto L_0x0039
        L_0x0035:
            r1 = move-exception
            r6 = r1
            r1 = r0
            r0 = r6
        L_0x0039:
            java.lang.Class<? extends h0.i.i.g0.d$a> r2 = r3.k
            if (r2 != 0) goto L_0x0040
            java.lang.String r2 = "null"
            goto L_0x0044
        L_0x0040:
            java.lang.String r2 = r2.getName()
        L_0x0044:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "Failed to execute command with argument class ViewCommandArgument: "
            r4.append(r5)
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            java.lang.String r4 = "A11yActionCompat"
            android.util.Log.e(r4, r2, r0)
        L_0x005a:
            r0 = r1
        L_0x005b:
            h0.i.i.g0.d r1 = r3.l
            boolean r0 = r1.perform(r8, r0)
            r1 = r0
            goto L_0x0066
        L_0x0063:
            int r2 = r2 + 1
            goto L_0x0006
        L_0x0066:
            if (r1 != 0) goto L_0x006e
            android.view.View$AccessibilityDelegate r0 = r7.mOriginalDelegate
            boolean r1 = r0.performAccessibilityAction(r8, r9, r10)
        L_0x006e:
            if (r1 != 0) goto L_0x007f
            int r0 = androidx.core.R.id.accessibility_action_clickable_span
            if (r9 != r0) goto L_0x007f
            r9 = -1
            java.lang.String r0 = "ACCESSIBILITY_CLICKABLE_SPAN_ID"
            int r9 = r10.getInt(r0, r9)
            boolean r1 = r7.performClickableSpanAction(r9, r8)
        L_0x007f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.i.i.a.performAccessibilityAction(android.view.View, int, android.os.Bundle):boolean");
    }

    public void sendAccessibilityEvent(View view, int i) {
        this.mOriginalDelegate.sendAccessibilityEvent(view, i);
    }

    public void sendAccessibilityEventUnchecked(View view, AccessibilityEvent accessibilityEvent) {
        this.mOriginalDelegate.sendAccessibilityEventUnchecked(view, accessibilityEvent);
    }

    public a(View.AccessibilityDelegate accessibilityDelegate) {
        this.mOriginalDelegate = accessibilityDelegate;
        this.mBridge = new C0047a(this);
    }
}
