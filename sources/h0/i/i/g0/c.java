package h0.i.i.g0;

import android.os.Build;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeProvider;
import java.util.List;
import java.util.Objects;

/* compiled from: AccessibilityNodeProviderCompat */
public class c {
    public final Object a;

    /* compiled from: AccessibilityNodeProviderCompat */
    public static class a extends AccessibilityNodeProvider {
        public final c a;

        public a(c cVar) {
            this.a = cVar;
        }

        public AccessibilityNodeInfo createAccessibilityNodeInfo(int i) {
            b a2 = this.a.a(i);
            if (a2 == null) {
                return null;
            }
            return a2.b;
        }

        public List<AccessibilityNodeInfo> findAccessibilityNodeInfosByText(String str, int i) {
            Objects.requireNonNull(this.a);
            return null;
        }

        public boolean performAction(int i, int i2, Bundle bundle) {
            return this.a.c(i, i2, bundle);
        }
    }

    /* compiled from: AccessibilityNodeProviderCompat */
    public static class b extends a {
        public b(c cVar) {
            super(cVar);
        }

        public AccessibilityNodeInfo findFocus(int i) {
            b b = this.a.b(i);
            if (b == null) {
                return null;
            }
            return b.b;
        }
    }

    /* renamed from: h0.i.i.g0.c$c  reason: collision with other inner class name */
    /* compiled from: AccessibilityNodeProviderCompat */
    public static class C0049c extends b {
        public C0049c(c cVar) {
            super(cVar);
        }

        public void addExtraDataToAccessibilityNodeInfo(int i, AccessibilityNodeInfo accessibilityNodeInfo, String str, Bundle bundle) {
            Objects.requireNonNull(this.a);
        }
    }

    public c() {
        if (Build.VERSION.SDK_INT >= 26) {
            this.a = new C0049c(this);
        } else {
            this.a = new b(this);
        }
    }

    public b a(int i) {
        return null;
    }

    public b b(int i) {
        return null;
    }

    public boolean c(int i, int i2, Bundle bundle) {
        return false;
    }

    public c(Object obj) {
        this.a = obj;
    }
}
