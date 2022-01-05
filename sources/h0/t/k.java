package h0.t;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.navigation.common.R;
import h0.f.i;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* compiled from: NavDestination */
public class k {
    public ArrayList<h> Y1;
    public i<d> Z1;
    public HashMap<String, e> a2;
    public final String c;
    public m d;
    public int q;
    public String x;
    public CharSequence y;

    /* compiled from: NavDestination */
    public static class a implements Comparable<a> {
        public final k c;
        public final Bundle d;
        public final boolean q;
        public final boolean x;
        public final int y;

        public a(k kVar, Bundle bundle, boolean z, boolean z2, int i) {
            this.c = kVar;
            this.d = bundle;
            this.q = z;
            this.x = z2;
            this.y = i;
        }

        /* renamed from: a */
        public int compareTo(a aVar) {
            boolean z = this.q;
            if (z && !aVar.q) {
                return 1;
            }
            if (!z && aVar.q) {
                return -1;
            }
            Bundle bundle = this.d;
            if (bundle != null && aVar.d == null) {
                return 1;
            }
            if (bundle == null && aVar.d != null) {
                return -1;
            }
            if (bundle != null) {
                int size = bundle.size() - aVar.d.size();
                if (size > 0) {
                    return 1;
                }
                if (size < 0) {
                    return -1;
                }
            }
            boolean z2 = this.x;
            if (z2 && !aVar.x) {
                return 1;
            }
            if (z2 || !aVar.x) {
                return this.y - aVar.y;
            }
            return -1;
        }
    }

    static {
        new HashMap();
    }

    public k(s<? extends k> sVar) {
        this.c = t.b(sVar.getClass());
    }

    public static String j(Context context, int i) {
        if (i <= 16777215) {
            return Integer.toString(i);
        }
        try {
            return context.getResources().getResourceName(i);
        } catch (Resources.NotFoundException unused) {
            return Integer.toString(i);
        }
    }

    public Bundle b(Bundle bundle) {
        HashMap<String, e> hashMap;
        if (bundle == null && ((hashMap = this.a2) == null || hashMap.isEmpty())) {
            return null;
        }
        Bundle bundle2 = new Bundle();
        HashMap<String, e> hashMap2 = this.a2;
        if (hashMap2 != null) {
            for (Map.Entry next : hashMap2.entrySet()) {
                e eVar = (e) next.getValue();
                String str = (String) next.getKey();
                if (eVar.c) {
                    eVar.a.d(bundle2, str, eVar.d);
                }
            }
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
            HashMap<String, e> hashMap3 = this.a2;
            if (hashMap3 != null) {
                for (Map.Entry next2 : hashMap3.entrySet()) {
                    e eVar2 = (e) next2.getValue();
                    String str2 = (String) next2.getKey();
                    boolean z = false;
                    if (eVar2.b || !bundle.containsKey(str2) || bundle.get(str2) != null) {
                        try {
                            eVar2.a.a(bundle, str2);
                            z = true;
                            continue;
                        } catch (ClassCastException unused) {
                            continue;
                        }
                    }
                    if (!z) {
                        StringBuilder P0 = i0.d.a.a.a.P0("Wrong argument type for '");
                        P0.append((String) next2.getKey());
                        P0.append("' in argument bundle. ");
                        P0.append(((e) next2.getValue()).a.b());
                        P0.append(" expected.");
                        throw new IllegalArgumentException(P0.toString());
                    }
                }
            }
        }
        return bundle2;
    }

    public int[] c() {
        ArrayDeque arrayDeque = new ArrayDeque();
        m mVar = this;
        while (true) {
            m mVar2 = mVar.d;
            if (mVar2 == null || mVar2.c2 != mVar.q) {
                arrayDeque.addFirst(mVar);
            }
            if (mVar2 == null) {
                break;
            }
            mVar = mVar2;
        }
        int[] iArr = new int[arrayDeque.size()];
        int i = 0;
        Iterator it = arrayDeque.iterator();
        while (it.hasNext()) {
            iArr[i] = ((k) it.next()).q;
            i++;
        }
        return iArr;
    }

    public final d e(int i) {
        d dVar;
        i<d> iVar = this.Z1;
        if (iVar == null) {
            dVar = null;
        } else {
            dVar = iVar.f(i, null);
        }
        if (dVar != null) {
            return dVar;
        }
        m mVar = this.d;
        if (mVar != null) {
            return mVar.e(i);
        }
        return null;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v0, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v1, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v6, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v6, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v7, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v2, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v3, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: java.util.regex.Matcher} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v10, resolved type: android.os.Bundle} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v9, resolved type: java.lang.String} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.util.regex.Matcher} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public h0.t.k.a k(h0.t.j r19) {
        /*
            r18 = this;
            r6 = r18
            r7 = r19
            java.util.ArrayList<h0.t.h> r0 = r6.Y1
            r8 = 0
            if (r0 != 0) goto L_0x000a
            return r8
        L_0x000a:
            java.util.Iterator r9 = r0.iterator()
            r10 = r8
        L_0x000f:
            boolean r0 = r9.hasNext()
            if (r0 == 0) goto L_0x0149
            java.lang.Object r0 = r9.next()
            h0.t.h r0 = (h0.t.h) r0
            android.net.Uri r1 = r7.a
            if (r1 == 0) goto L_0x00f1
            java.util.HashMap<java.lang.String, h0.t.e> r3 = r6.a2
            if (r3 != 0) goto L_0x0028
            java.util.Map r3 = java.util.Collections.emptyMap()
            goto L_0x002c
        L_0x0028:
            java.util.Map r3 = java.util.Collections.unmodifiableMap(r3)
        L_0x002c:
            java.util.regex.Pattern r4 = r0.d
            java.lang.String r5 = r1.toString()
            java.util.regex.Matcher r4 = r4.matcher(r5)
            boolean r5 = r4.matches()
            if (r5 != 0) goto L_0x003f
        L_0x003c:
            r5 = r8
            goto L_0x00ef
        L_0x003f:
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.util.ArrayList<java.lang.String> r11 = r0.b
            int r11 = r11.size()
            r12 = 0
        L_0x004b:
            if (r12 >= r11) goto L_0x006c
            java.util.ArrayList<java.lang.String> r13 = r0.b
            java.lang.Object r13 = r13.get(r12)
            java.lang.String r13 = (java.lang.String) r13
            int r12 = r12 + 1
            java.lang.String r14 = r4.group(r12)
            java.lang.String r14 = android.net.Uri.decode(r14)
            java.lang.Object r15 = r3.get(r13)
            h0.t.e r15 = (h0.t.e) r15
            boolean r13 = r0.b(r5, r13, r14, r15)
            if (r13 == 0) goto L_0x004b
            goto L_0x003c
        L_0x006c:
            boolean r4 = r0.f
            if (r4 == 0) goto L_0x00ef
            java.util.Map<java.lang.String, h0.t.h$b> r4 = r0.c
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x007a:
            boolean r11 = r4.hasNext()
            if (r11 == 0) goto L_0x00ef
            java.lang.Object r11 = r4.next()
            java.lang.String r11 = (java.lang.String) r11
            java.util.Map<java.lang.String, h0.t.h$b> r12 = r0.c
            java.lang.Object r12 = r12.get(r11)
            h0.t.h$b r12 = (h0.t.h.b) r12
            java.lang.String r11 = r1.getQueryParameter(r11)
            if (r11 == 0) goto L_0x00a5
            java.lang.String r13 = r12.a
            java.util.regex.Pattern r13 = java.util.regex.Pattern.compile(r13)
            java.util.regex.Matcher r11 = r13.matcher(r11)
            boolean r13 = r11.matches()
            if (r13 != 0) goto L_0x00a6
            goto L_0x003c
        L_0x00a5:
            r11 = r8
        L_0x00a6:
            r13 = 0
        L_0x00a7:
            java.util.ArrayList<java.lang.String> r14 = r12.b
            int r14 = r14.size()
            if (r13 >= r14) goto L_0x007a
            if (r11 == 0) goto L_0x00bc
            int r14 = r13 + 1
            java.lang.String r14 = r11.group(r14)
            java.lang.String r14 = android.net.Uri.decode(r14)
            goto L_0x00bd
        L_0x00bc:
            r14 = r8
        L_0x00bd:
            java.util.ArrayList<java.lang.String> r15 = r12.b
            java.lang.Object r15 = r15.get(r13)
            java.lang.String r15 = (java.lang.String) r15
            java.lang.Object r16 = r3.get(r15)
            r2 = r16
            h0.t.e r2 = (h0.t.e) r2
            if (r14 == 0) goto L_0x00e7
            java.lang.String r8 = "[{}]"
            r17 = r1
            java.lang.String r1 = ""
            java.lang.String r1 = r14.replaceAll(r8, r1)
            boolean r1 = r1.equals(r15)
            if (r1 != 0) goto L_0x00e9
            boolean r1 = r0.b(r5, r15, r14, r2)
            if (r1 == 0) goto L_0x00e9
            r5 = 0
            goto L_0x00ef
        L_0x00e7:
            r17 = r1
        L_0x00e9:
            int r13 = r13 + 1
            r1 = r17
            r8 = 0
            goto L_0x00a7
        L_0x00ef:
            r2 = r5
            goto L_0x00f2
        L_0x00f1:
            r2 = 0
        L_0x00f2:
            java.lang.String r1 = r7.b
            if (r1 == 0) goto L_0x0101
            java.lang.String r3 = r0.g
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x0101
            r1 = 1
            r4 = r1
            goto L_0x0102
        L_0x0101:
            r4 = 0
        L_0x0102:
            java.lang.String r1 = r7.c
            r3 = -1
            if (r1 == 0) goto L_0x012c
            java.lang.String r5 = r0.i
            if (r5 == 0) goto L_0x0129
            java.util.regex.Pattern r5 = r0.h
            java.util.regex.Matcher r5 = r5.matcher(r1)
            boolean r5 = r5.matches()
            if (r5 != 0) goto L_0x0118
            goto L_0x0129
        L_0x0118:
            h0.t.h$a r5 = new h0.t.h$a
            java.lang.String r8 = r0.i
            r5.<init>(r8)
            h0.t.h$a r8 = new h0.t.h$a
            r8.<init>(r1)
            int r1 = r5.compareTo(r8)
            goto L_0x012a
        L_0x0129:
            r1 = r3
        L_0x012a:
            r5 = r1
            goto L_0x012d
        L_0x012c:
            r5 = r3
        L_0x012d:
            if (r2 != 0) goto L_0x0133
            if (r4 != 0) goto L_0x0133
            if (r5 <= r3) goto L_0x0146
        L_0x0133:
            h0.t.k$a r8 = new h0.t.k$a
            boolean r3 = r0.e
            r0 = r8
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5)
            if (r10 == 0) goto L_0x0145
            int r0 = r8.compareTo(r10)
            if (r0 <= 0) goto L_0x0146
        L_0x0145:
            r10 = r8
        L_0x0146:
            r8 = 0
            goto L_0x000f
        L_0x0149:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.t.k.k(h0.t.j):h0.t.k$a");
    }

    public void o(Context context, AttributeSet attributeSet) {
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R.styleable.Navigator);
        int resourceId = obtainAttributes.getResourceId(R.styleable.Navigator_android_id, 0);
        this.q = resourceId;
        this.x = null;
        this.x = j(context, resourceId);
        this.y = obtainAttributes.getText(R.styleable.Navigator_android_label);
        obtainAttributes.recycle();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("(");
        String str = this.x;
        if (str == null) {
            sb.append("0x");
            sb.append(Integer.toHexString(this.q));
        } else {
            sb.append(str);
        }
        sb.append(")");
        if (this.y != null) {
            sb.append(" label=");
            sb.append(this.y);
        }
        return sb.toString();
    }

    public k(String str) {
        this.c = str;
    }
}
