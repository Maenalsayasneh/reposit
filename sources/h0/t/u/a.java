package h0.t.u;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.R;
import h0.t.k;
import h0.t.s;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

@s.b("fragment")
/* compiled from: FragmentNavigator */
public class a extends s<C0067a> {
    public final Context a;
    public final FragmentManager b;
    public final int c;
    public ArrayDeque<Integer> d = new ArrayDeque<>();

    /* renamed from: h0.t.u.a$a  reason: collision with other inner class name */
    /* compiled from: FragmentNavigator */
    public static class C0067a extends k {
        public String b2;

        public C0067a(s<? extends C0067a> sVar) {
            super((s<? extends k>) sVar);
        }

        public void o(Context context, AttributeSet attributeSet) {
            super.o(context, attributeSet);
            TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.FragmentNavigator);
            String string = obtainAttributes.getString(R.styleable.FragmentNavigator_android_name);
            if (string != null) {
                this.b2 = string;
            }
            obtainAttributes.recycle();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            String str = this.b2;
            if (str == null) {
                sb.append("null");
            } else {
                sb.append(str);
            }
            return sb.toString();
        }
    }

    /* compiled from: FragmentNavigator */
    public static final class b implements s.a {
        public final LinkedHashMap<View, String> a;

        public b(Map<View, String> map) {
            LinkedHashMap<View, String> linkedHashMap = new LinkedHashMap<>();
            this.a = linkedHashMap;
            linkedHashMap.putAll(map);
        }
    }

    public a(Context context, FragmentManager fragmentManager, int i) {
        this.a = context;
        this.b = fragmentManager;
        this.c = i;
    }

    public k a() {
        return new C0067a(this);
    }

    /* JADX WARNING: Removed duplicated region for block: B:52:0x00f7  */
    /* JADX WARNING: Removed duplicated region for block: B:58:0x012a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h0.t.k b(h0.t.k r9, android.os.Bundle r10, h0.t.q r11, h0.t.s.a r12) {
        /*
            r8 = this;
            h0.t.u.a$a r9 = (h0.t.u.a.C0067a) r9
            androidx.fragment.app.FragmentManager r0 = r8.b
            boolean r0 = r0.V()
            r1 = 0
            if (r0 == 0) goto L_0x0014
            java.lang.String r9 = "FragmentNavigator"
            java.lang.String r10 = "Ignoring navigate() call: FragmentManager has already saved its state"
            android.util.Log.i(r9, r10)
            goto L_0x0134
        L_0x0014:
            java.lang.String r0 = r9.b2
            if (r0 == 0) goto L_0x0136
            r2 = 0
            char r3 = r0.charAt(r2)
            r4 = 46
            if (r3 != r4) goto L_0x0036
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            android.content.Context r4 = r8.a
            java.lang.String r4 = r4.getPackageName()
            r3.append(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
        L_0x0036:
            android.content.Context r3 = r8.a
            androidx.fragment.app.FragmentManager r4 = r8.b
            h0.o.a.s r4 = r4.N()
            java.lang.ClassLoader r3 = r3.getClassLoader()
            androidx.fragment.app.Fragment r0 = r4.instantiate(r3, r0)
            r0.setArguments(r10)
            androidx.fragment.app.FragmentManager r10 = r8.b
            h0.o.a.a r3 = new h0.o.a.a
            r3.<init>(r10)
            r10 = -1
            if (r11 == 0) goto L_0x0056
            int r4 = r11.d
            goto L_0x0057
        L_0x0056:
            r4 = r10
        L_0x0057:
            if (r11 == 0) goto L_0x005c
            int r5 = r11.e
            goto L_0x005d
        L_0x005c:
            r5 = r10
        L_0x005d:
            if (r11 == 0) goto L_0x0062
            int r6 = r11.f
            goto L_0x0063
        L_0x0062:
            r6 = r10
        L_0x0063:
            if (r11 == 0) goto L_0x0068
            int r7 = r11.g
            goto L_0x0069
        L_0x0068:
            r7 = r10
        L_0x0069:
            if (r4 != r10) goto L_0x0071
            if (r5 != r10) goto L_0x0071
            if (r6 != r10) goto L_0x0071
            if (r7 == r10) goto L_0x0084
        L_0x0071:
            if (r4 == r10) goto L_0x0074
            goto L_0x0075
        L_0x0074:
            r4 = r2
        L_0x0075:
            if (r5 == r10) goto L_0x0078
            goto L_0x0079
        L_0x0078:
            r5 = r2
        L_0x0079:
            if (r6 == r10) goto L_0x007c
            goto L_0x007d
        L_0x007c:
            r6 = r2
        L_0x007d:
            if (r7 == r10) goto L_0x0080
            goto L_0x0081
        L_0x0080:
            r7 = r2
        L_0x0081:
            r3.r(r4, r5, r6, r7)
        L_0x0084:
            int r10 = r8.c
            r3.o(r10, r0, r1)
            r3.t(r0)
            int r10 = r9.q
            java.util.ArrayDeque<java.lang.Integer> r0 = r8.d
            boolean r0 = r0.isEmpty()
            r4 = 1
            if (r11 == 0) goto L_0x00ad
            if (r0 != 0) goto L_0x00ad
            boolean r11 = r11.a
            if (r11 == 0) goto L_0x00ad
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.d
            java.lang.Object r11 = r11.peekLast()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            if (r11 != r10) goto L_0x00ad
            r11 = r4
            goto L_0x00ae
        L_0x00ad:
            r11 = r2
        L_0x00ae:
            if (r0 == 0) goto L_0x00b1
            goto L_0x00f2
        L_0x00b1:
            if (r11 == 0) goto L_0x00e4
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.d
            int r11 = r11.size()
            if (r11 <= r4) goto L_0x00f3
            androidx.fragment.app.FragmentManager r11 = r8.b
            java.util.ArrayDeque<java.lang.Integer> r0 = r8.d
            int r0 = r0.size()
            java.util.ArrayDeque<java.lang.Integer> r5 = r8.d
            java.lang.Object r5 = r5.peekLast()
            java.lang.Integer r5 = (java.lang.Integer) r5
            int r5 = r5.intValue()
            java.lang.String r0 = r8.f(r0, r5)
            r11.a0(r0, r4)
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.d
            int r11 = r11.size()
            java.lang.String r11 = r8.f(r11, r10)
            r3.g(r11)
            goto L_0x00f3
        L_0x00e4:
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.d
            int r11 = r11.size()
            int r11 = r11 + r4
            java.lang.String r11 = r8.f(r11, r10)
            r3.g(r11)
        L_0x00f2:
            r2 = r4
        L_0x00f3:
            boolean r11 = r12 instanceof h0.t.u.a.b
            if (r11 == 0) goto L_0x0123
            h0.t.u.a$b r12 = (h0.t.u.a.b) r12
            java.util.LinkedHashMap<android.view.View, java.lang.String> r11 = r12.a
            java.util.Map r11 = java.util.Collections.unmodifiableMap(r11)
            java.util.Set r11 = r11.entrySet()
            java.util.Iterator r11 = r11.iterator()
        L_0x0107:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0123
            java.lang.Object r12 = r11.next()
            java.util.Map$Entry r12 = (java.util.Map.Entry) r12
            java.lang.Object r0 = r12.getKey()
            android.view.View r0 = (android.view.View) r0
            java.lang.Object r12 = r12.getValue()
            java.lang.String r12 = (java.lang.String) r12
            r3.f(r0, r12)
            goto L_0x0107
        L_0x0123:
            r3.r = r4
            r3.h()
            if (r2 == 0) goto L_0x0134
            java.util.ArrayDeque<java.lang.Integer> r11 = r8.d
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            r11.add(r10)
            goto L_0x0135
        L_0x0134:
            r9 = r1
        L_0x0135:
            return r9
        L_0x0136:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "Fragment class was not set"
            r9.<init>(r10)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.t.u.a.b(h0.t.k, android.os.Bundle, h0.t.q, h0.t.s$a):h0.t.k");
    }

    public void c(Bundle bundle) {
        int[] intArray = bundle.getIntArray("androidx-nav-fragment:navigator:backStackIds");
        if (intArray != null) {
            this.d.clear();
            for (int valueOf : intArray) {
                this.d.add(Integer.valueOf(valueOf));
            }
        }
    }

    public Bundle d() {
        Bundle bundle = new Bundle();
        int[] iArr = new int[this.d.size()];
        Iterator<Integer> it = this.d.iterator();
        int i = 0;
        while (it.hasNext()) {
            iArr[i] = it.next().intValue();
            i++;
        }
        bundle.putIntArray("androidx-nav-fragment:navigator:backStackIds", iArr);
        return bundle;
    }

    public boolean e() {
        if (this.d.isEmpty()) {
            return false;
        }
        if (this.b.V()) {
            Log.i("FragmentNavigator", "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return false;
        }
        this.b.a0(f(this.d.size(), this.d.peekLast().intValue()), 1);
        this.d.removeLast();
        return true;
    }

    public final String f(int i, int i2) {
        return i + "-" + i2;
    }
}
