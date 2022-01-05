package h0.i.i.g0;

import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import h0.i.i.g0.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: AccessibilityNodeInfoCompat */
public class b {
    public static int a;
    public final AccessibilityNodeInfo b;
    public int c = -1;
    public int d = -1;

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class a {
        public static final a a = new a(16, (CharSequence) null);
        public static final a b = new a(4096, (CharSequence) null);
        public static final a c = new a(8192, (CharSequence) null);
        public static final a d = new a(262144, (CharSequence) null);
        public static final a e = new a(524288, (CharSequence) null);
        public static final a f = new a(1048576, (CharSequence) null);
        public static final a g = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
        public static final a h = new a(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (CharSequence) null, (d) null, (Class<? extends d.a>) null);
        public final Object i;
        public final int j;
        public final Class<? extends d.a> k;
        public final d l;

        static {
            new AccessibilityNodeInfo.AccessibilityAction(1, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(2, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(4, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(8, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(32, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(64, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(128, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(256, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(512, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(2048, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(16384, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(32768, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(65536, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(131072, (CharSequence) null);
            new AccessibilityNodeInfo.AccessibilityAction(2097152, (CharSequence) null);
            int i2 = Build.VERSION.SDK_INT;
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908342, (CharSequence) null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908343, (CharSequence) null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908345, (CharSequence) null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908347, (CharSequence) null);
            }
            if ((i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908358, (CharSequence) null);
            }
            if ((i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908359, (CharSequence) null);
            }
            if ((i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908360, (CharSequence) null);
            }
            if ((i2 >= 29 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908361, (CharSequence) null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908348, (CharSequence) null);
            }
            if (AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908349, (CharSequence) null);
            }
            if ((i2 >= 26 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908354, (CharSequence) null);
            }
            if ((i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908356, (CharSequence) null);
            }
            if ((i2 >= 28 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908357, (CharSequence) null);
            }
            if ((i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908362, (CharSequence) null);
            }
            if ((i2 >= 30 ? AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER : null) == null) {
                new AccessibilityNodeInfo.AccessibilityAction(16908372, (CharSequence) null);
            }
        }

        public a(int i2, CharSequence charSequence) {
            this((Object) null, i2, charSequence, (d) null, (Class<? extends d.a>) null);
        }

        public int a() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.i).getId();
        }

        public CharSequence b() {
            return ((AccessibilityNodeInfo.AccessibilityAction) this.i).getLabel();
        }

        public boolean equals(Object obj) {
            if (obj == null || !(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            Object obj2 = this.i;
            if (obj2 == null) {
                if (aVar.i != null) {
                    return false;
                }
                return true;
            } else if (!obj2.equals(aVar.i)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            Object obj = this.i;
            if (obj != null) {
                return obj.hashCode();
            }
            return 0;
        }

        public a(Object obj, int i2, CharSequence charSequence, d dVar, Class<? extends d.a> cls) {
            this.j = i2;
            this.l = dVar;
            if (obj == null) {
                this.i = new AccessibilityNodeInfo.AccessibilityAction(i2, charSequence);
            } else {
                this.i = obj;
            }
            this.k = cls;
        }
    }

    /* renamed from: h0.i.i.g0.b$b  reason: collision with other inner class name */
    /* compiled from: AccessibilityNodeInfoCompat */
    public static class C0048b {
        public final Object a;

        public C0048b(Object obj) {
            this.a = obj;
        }

        public static C0048b a(int i, int i2, boolean z, int i3) {
            return new C0048b(AccessibilityNodeInfo.CollectionInfo.obtain(i, i2, z, i3));
        }
    }

    /* compiled from: AccessibilityNodeInfoCompat */
    public static class c {
        public final Object a;

        public c(Object obj) {
            this.a = obj;
        }

        public static c a(int i, int i2, int i3, int i4, boolean z, boolean z2) {
            return new c(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, i2, i3, i4, z, z2));
        }
    }

    public b(AccessibilityNodeInfo accessibilityNodeInfo) {
        this.b = accessibilityNodeInfo;
    }

    public static String c(int i) {
        if (i == 1) {
            return "ACTION_FOCUS";
        }
        if (i == 2) {
            return "ACTION_CLEAR_FOCUS";
        }
        switch (i) {
            case 4:
                return "ACTION_SELECT";
            case 8:
                return "ACTION_CLEAR_SELECTION";
            case 16:
                return "ACTION_CLICK";
            case 32:
                return "ACTION_LONG_CLICK";
            case 64:
                return "ACTION_ACCESSIBILITY_FOCUS";
            case 128:
                return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
            case 256:
                return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
            case 512:
                return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
            case RecyclerView.b0.FLAG_ADAPTER_FULLUPDATE:
                return "ACTION_NEXT_HTML_ELEMENT";
            case 2048:
                return "ACTION_PREVIOUS_HTML_ELEMENT";
            case 4096:
                return "ACTION_SCROLL_FORWARD";
            case 8192:
                return "ACTION_SCROLL_BACKWARD";
            case 16384:
                return "ACTION_COPY";
            case 32768:
                return "ACTION_PASTE";
            case 65536:
                return "ACTION_CUT";
            case 131072:
                return "ACTION_SET_SELECTION";
            case 262144:
                return "ACTION_EXPAND";
            case 524288:
                return "ACTION_COLLAPSE";
            case 2097152:
                return "ACTION_SET_TEXT";
            case 16908354:
                return "ACTION_MOVE_WINDOW";
            case 16908372:
                return "ACTION_IME_ENTER";
            default:
                switch (i) {
                    case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                    case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                    case 16908344:
                        return "ACTION_SCROLL_UP";
                    case 16908345:
                        return "ACTION_SCROLL_LEFT";
                    case 16908346:
                        return "ACTION_SCROLL_DOWN";
                    case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                    case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                    case 16908349:
                        return "ACTION_SET_PROGRESS";
                    default:
                        switch (i) {
                            case 16908356:
                                return "ACTION_SHOW_TOOLTIP";
                            case 16908357:
                                return "ACTION_HIDE_TOOLTIP";
                            case 16908358:
                                return "ACTION_PAGE_UP";
                            case 16908359:
                                return "ACTION_PAGE_DOWN";
                            case 16908360:
                                return "ACTION_PAGE_LEFT";
                            case 16908361:
                                return "ACTION_PAGE_RIGHT";
                            case 16908362:
                                return "ACTION_PRESS_AND_HOLD";
                            default:
                                return "ACTION_UNKNOWN";
                        }
                }
        }
    }

    public static ClickableSpan[] d(CharSequence charSequence) {
        if (charSequence instanceof Spanned) {
            return (ClickableSpan[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), ClickableSpan.class);
        }
        return null;
    }

    public void a(a aVar) {
        this.b.addAction((AccessibilityNodeInfo.AccessibilityAction) aVar.i);
    }

    public final List<Integer> b(String str) {
        ArrayList<Integer> integerArrayList = this.b.getExtras().getIntegerArrayList(str);
        if (integerArrayList != null) {
            return integerArrayList;
        }
        ArrayList arrayList = new ArrayList();
        this.b.getExtras().putIntegerArrayList(str, arrayList);
        return arrayList;
    }

    public CharSequence e() {
        return this.b.getContentDescription();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        if (accessibilityNodeInfo == null) {
            if (bVar.b != null) {
                return false;
            }
        } else if (!accessibilityNodeInfo.equals(bVar.b)) {
            return false;
        }
        return this.d == bVar.d && this.c == bVar.c;
    }

    public Bundle f() {
        return this.b.getExtras();
    }

    public CharSequence g() {
        if (!(!b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty())) {
            return this.b.getText();
        }
        List<Integer> b2 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
        List<Integer> b3 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
        List<Integer> b4 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
        List<Integer> b5 = b("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
        SpannableString spannableString = new SpannableString(TextUtils.substring(this.b.getText(), 0, this.b.getText().length()));
        for (int i = 0; i < b2.size(); i++) {
            spannableString.setSpan(new a(b5.get(i).intValue(), this, f().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), b2.get(i).intValue(), b3.get(i).intValue(), b4.get(i).intValue());
        }
        return spannableString;
    }

    public final void h(int i, boolean z) {
        Bundle f = f();
        if (f != null) {
            int i2 = f.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & (~i);
            if (!z) {
                i = 0;
            }
            f.putInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", i | i2);
        }
    }

    public int hashCode() {
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        if (accessibilityNodeInfo == null) {
            return 0;
        }
        return accessibilityNodeInfo.hashCode();
    }

    public void i(Object obj) {
        AccessibilityNodeInfo.CollectionInfo collectionInfo;
        AccessibilityNodeInfo accessibilityNodeInfo = this.b;
        if (obj == null) {
            collectionInfo = null;
        } else {
            collectionInfo = (AccessibilityNodeInfo.CollectionInfo) ((C0048b) obj).a;
        }
        accessibilityNodeInfo.setCollectionInfo(collectionInfo);
    }

    public void j(Object obj) {
        this.b.setCollectionItemInfo((AccessibilityNodeInfo.CollectionItemInfo) ((c) obj).a);
    }

    public void k(CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            this.b.setHintText(charSequence);
        } else {
            this.b.getExtras().putCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.HINT_TEXT_KEY", charSequence);
        }
    }

    public String toString() {
        ArrayList arrayList;
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        Rect rect = new Rect();
        this.b.getBoundsInParent(rect);
        sb.append("; boundsInParent: " + rect);
        this.b.getBoundsInScreen(rect);
        sb.append("; boundsInScreen: " + rect);
        sb.append("; packageName: ");
        sb.append(this.b.getPackageName());
        sb.append("; className: ");
        sb.append(this.b.getClassName());
        sb.append("; text: ");
        sb.append(g());
        sb.append("; contentDescription: ");
        sb.append(e());
        sb.append("; viewId: ");
        sb.append(this.b.getViewIdResourceName());
        sb.append("; checkable: ");
        sb.append(this.b.isCheckable());
        sb.append("; checked: ");
        sb.append(this.b.isChecked());
        sb.append("; focusable: ");
        sb.append(this.b.isFocusable());
        sb.append("; focused: ");
        sb.append(this.b.isFocused());
        sb.append("; selected: ");
        sb.append(this.b.isSelected());
        sb.append("; clickable: ");
        sb.append(this.b.isClickable());
        sb.append("; longClickable: ");
        sb.append(this.b.isLongClickable());
        sb.append("; enabled: ");
        sb.append(this.b.isEnabled());
        sb.append("; password: ");
        sb.append(this.b.isPassword());
        sb.append("; scrollable: " + this.b.isScrollable());
        sb.append("; [");
        List<AccessibilityNodeInfo.AccessibilityAction> actionList = this.b.getActionList();
        if (actionList != null) {
            ArrayList arrayList2 = new ArrayList();
            int size = actionList.size();
            for (int i = 0; i < size; i++) {
                arrayList2.add(new a(actionList.get(i), 0, (CharSequence) null, (d) null, (Class<? extends d.a>) null));
            }
            arrayList = arrayList2;
        } else {
            arrayList = Collections.emptyList();
        }
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            a aVar = (a) arrayList.get(i2);
            String c2 = c(aVar.a());
            if (c2.equals("ACTION_UNKNOWN") && aVar.b() != null) {
                c2 = aVar.b().toString();
            }
            sb.append(c2);
            if (i2 != arrayList.size() - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}
