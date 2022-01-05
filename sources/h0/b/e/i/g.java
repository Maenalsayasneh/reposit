package h0.b.e.i;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import h0.i.i.v;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: MenuBuilder */
public class g implements h0.i.d.a.a {
    public static final int[] a = {1, 4, 5, 3, 2, 0};
    public final Context b;
    public final Resources c;
    public boolean d;
    public boolean e;
    public a f;
    public ArrayList<i> g;
    public ArrayList<i> h;
    public boolean i;
    public ArrayList<i> j;
    public ArrayList<i> k;
    public boolean l;
    public int m = 0;
    public CharSequence n;
    public Drawable o;
    public View p;
    public boolean q = false;
    public boolean r = false;
    public boolean s = false;
    public boolean t = false;
    public ArrayList<i> u = new ArrayList<>();
    public CopyOnWriteArrayList<WeakReference<m>> v = new CopyOnWriteArrayList<>();
    public i w;
    public boolean x = false;
    public boolean y;

    /* compiled from: MenuBuilder */
    public interface a {
        boolean a(g gVar, MenuItem menuItem);

        void b(g gVar);
    }

    /* compiled from: MenuBuilder */
    public interface b {
        boolean a(i iVar);
    }

    public g(Context context) {
        boolean z;
        boolean z2 = false;
        this.b = context;
        Resources resources = context.getResources();
        this.c = resources;
        this.g = new ArrayList<>();
        this.h = new ArrayList<>();
        this.i = true;
        this.j = new ArrayList<>();
        this.k = new ArrayList<>();
        this.l = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = v.a;
            if (Build.VERSION.SDK_INT >= 28) {
                z = viewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                z = identifier != 0 && resources2.getBoolean(identifier);
            }
            if (z) {
                z2 = true;
            }
        }
        this.e = z2;
    }

    public MenuItem a(int i2, int i3, int i4, CharSequence charSequence) {
        int i5;
        int i6 = (-65536 & i4) >> 16;
        if (i6 >= 0) {
            int[] iArr = a;
            if (i6 < iArr.length) {
                int i7 = (iArr[i6] << 16) | (65535 & i4);
                i iVar = new i(this, i2, i3, i4, i7, charSequence, this.m);
                ArrayList<i> arrayList = this.g;
                int size = arrayList.size();
                while (true) {
                    size--;
                    if (size >= 0) {
                        if (arrayList.get(size).d <= i7) {
                            i5 = size + 1;
                            break;
                        }
                    } else {
                        i5 = 0;
                        break;
                    }
                }
                arrayList.add(i5, iVar);
                q(true);
                return iVar;
            }
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public MenuItem add(CharSequence charSequence) {
        return a(0, 0, 0, charSequence);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [android.view.MenuItem[]] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int addIntentOptions(int r8, int r9, int r10, android.content.ComponentName r11, android.content.Intent[] r12, android.content.Intent r13, int r14, android.view.MenuItem[] r15) {
        /*
            r7 = this;
            android.content.Context r0 = r7.b
            android.content.pm.PackageManager r0 = r0.getPackageManager()
            r1 = 0
            java.util.List r11 = r0.queryIntentActivityOptions(r11, r12, r13, r1)
            if (r11 == 0) goto L_0x0012
            int r2 = r11.size()
            goto L_0x0013
        L_0x0012:
            r2 = r1
        L_0x0013:
            r14 = r14 & 1
            if (r14 != 0) goto L_0x001a
            r7.removeGroup(r8)
        L_0x001a:
            if (r1 >= r2) goto L_0x005e
            java.lang.Object r14 = r11.get(r1)
            android.content.pm.ResolveInfo r14 = (android.content.pm.ResolveInfo) r14
            android.content.Intent r3 = new android.content.Intent
            int r4 = r14.specificIndex
            if (r4 >= 0) goto L_0x002a
            r4 = r13
            goto L_0x002c
        L_0x002a:
            r4 = r12[r4]
        L_0x002c:
            r3.<init>(r4)
            android.content.ComponentName r4 = new android.content.ComponentName
            android.content.pm.ActivityInfo r5 = r14.activityInfo
            android.content.pm.ApplicationInfo r6 = r5.applicationInfo
            java.lang.String r6 = r6.packageName
            java.lang.String r5 = r5.name
            r4.<init>(r6, r5)
            r3.setComponent(r4)
            java.lang.CharSequence r4 = r14.loadLabel(r0)
            android.view.MenuItem r4 = r7.a(r8, r9, r10, r4)
            android.graphics.drawable.Drawable r5 = r14.loadIcon(r0)
            h0.b.e.i.i r4 = (h0.b.e.i.i) r4
            r4.setIcon((android.graphics.drawable.Drawable) r5)
            r4.setIntent(r3)
            if (r15 == 0) goto L_0x005b
            int r14 = r14.specificIndex
            if (r14 < 0) goto L_0x005b
            r15[r14] = r4
        L_0x005b:
            int r1 = r1 + 1
            goto L_0x001a
        L_0x005e:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.e.i.g.addIntentOptions(int, int, int, android.content.ComponentName, android.content.Intent[], android.content.Intent, int, android.view.MenuItem[]):int");
    }

    public SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public void b(m mVar, Context context) {
        this.v.add(new WeakReference(mVar));
        mVar.i(context, this);
        this.l = true;
    }

    public final void c(boolean z) {
        if (!this.t) {
            this.t = true;
            Iterator<WeakReference<m>> it = this.v.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.v.remove(next);
                } else {
                    mVar.c(this, z);
                }
            }
            this.t = false;
        }
    }

    public void clear() {
        i iVar = this.w;
        if (iVar != null) {
            d(iVar);
        }
        this.g.clear();
        q(true);
    }

    public void clearHeader() {
        this.o = null;
        this.n = null;
        this.p = null;
        q(false);
    }

    public void close() {
        c(true);
    }

    public boolean d(i iVar) {
        boolean z = false;
        if (!this.v.isEmpty() && this.w == iVar) {
            z();
            Iterator<WeakReference<m>> it = this.v.iterator();
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.v.remove(next);
                } else {
                    z = mVar.f(this, iVar);
                    if (z) {
                        break;
                    }
                }
            }
            y();
            if (z) {
                this.w = null;
            }
        }
        return z;
    }

    public boolean e(g gVar, MenuItem menuItem) {
        a aVar = this.f;
        return aVar != null && aVar.a(gVar, menuItem);
    }

    public boolean f(i iVar) {
        boolean z = false;
        if (this.v.isEmpty()) {
            return false;
        }
        z();
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            m mVar = (m) next.get();
            if (mVar == null) {
                this.v.remove(next);
            } else {
                z = mVar.g(this, iVar);
                if (z) {
                    break;
                }
            }
        }
        y();
        if (z) {
            this.w = iVar;
        }
        return z;
    }

    public MenuItem findItem(int i2) {
        MenuItem findItem;
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.g.get(i3);
            if (iVar.a == i2) {
                return iVar;
            }
            if (iVar.hasSubMenu() && (findItem = iVar.o.findItem(i2)) != null) {
                return findItem;
            }
        }
        return null;
    }

    public i g(int i2, KeyEvent keyEvent) {
        char c2;
        ArrayList<i> arrayList = this.u;
        arrayList.clear();
        h(arrayList, i2, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return arrayList.get(0);
        }
        boolean n2 = n();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = arrayList.get(i3);
            if (n2) {
                c2 = iVar.j;
            } else {
                c2 = iVar.h;
            }
            char[] cArr = keyData.meta;
            if ((c2 == cArr[0] && (metaState & 2) == 0) || ((c2 == cArr[2] && (metaState & 2) != 0) || (n2 && c2 == 8 && i2 == 67))) {
                return iVar;
            }
        }
        return null;
    }

    public MenuItem getItem(int i2) {
        return this.g.get(i2);
    }

    public void h(List<i> list, int i2, KeyEvent keyEvent) {
        char c2;
        int i3;
        boolean n2 = n();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (keyEvent.getKeyData(keyData) || i2 == 67) {
            int size = this.g.size();
            for (int i4 = 0; i4 < size; i4++) {
                i iVar = this.g.get(i4);
                if (iVar.hasSubMenu()) {
                    iVar.o.h(list, i2, keyEvent);
                }
                if (n2) {
                    c2 = iVar.j;
                } else {
                    c2 = iVar.h;
                }
                if (n2) {
                    i3 = iVar.k;
                } else {
                    i3 = iVar.i;
                }
                if (((modifiers & 69647) == (i3 & 69647)) && c2 != 0) {
                    char[] cArr = keyData.meta;
                    if ((c2 == cArr[0] || c2 == cArr[2] || (n2 && c2 == 8 && i2 == 67)) && iVar.isEnabled()) {
                        list.add(iVar);
                    }
                }
            }
        }
    }

    public boolean hasVisibleItems() {
        if (this.y) {
            return true;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.g.get(i2).isVisible()) {
                return true;
            }
        }
        return false;
    }

    public void i() {
        ArrayList<i> l2 = l();
        if (this.l) {
            Iterator<WeakReference<m>> it = this.v.iterator();
            boolean z = false;
            while (it.hasNext()) {
                WeakReference next = it.next();
                m mVar = (m) next.get();
                if (mVar == null) {
                    this.v.remove(next);
                } else {
                    z |= mVar.e();
                }
            }
            if (z) {
                this.j.clear();
                this.k.clear();
                int size = l2.size();
                for (int i2 = 0; i2 < size; i2++) {
                    i iVar = l2.get(i2);
                    if (iVar.g()) {
                        this.j.add(iVar);
                    } else {
                        this.k.add(iVar);
                    }
                }
            } else {
                this.j.clear();
                this.k.clear();
                this.k.addAll(l());
            }
            this.l = false;
        }
    }

    public boolean isShortcutKey(int i2, KeyEvent keyEvent) {
        return g(i2, keyEvent) != null;
    }

    public String j() {
        return "android:menu:actionviewstates";
    }

    public g k() {
        return this;
    }

    public ArrayList<i> l() {
        if (!this.i) {
            return this.h;
        }
        this.h.clear();
        int size = this.g.size();
        for (int i2 = 0; i2 < size; i2++) {
            i iVar = this.g.get(i2);
            if (iVar.isVisible()) {
                this.h.add(iVar);
            }
        }
        this.i = false;
        this.l = true;
        return this.h;
    }

    public boolean m() {
        return this.x;
    }

    public boolean n() {
        return this.d;
    }

    public boolean o() {
        return this.e;
    }

    public void p() {
        this.l = true;
        q(true);
    }

    public boolean performIdentifierAction(int i2, int i3) {
        return r(findItem(i2), i3);
    }

    public boolean performShortcut(int i2, KeyEvent keyEvent, int i3) {
        i g2 = g(i2, keyEvent);
        boolean s2 = g2 != null ? s(g2, (m) null, i3) : false;
        if ((i3 & 2) != 0) {
            c(true);
        }
        return s2;
    }

    public void q(boolean z) {
        if (!this.q) {
            if (z) {
                this.i = true;
                this.l = true;
            }
            if (!this.v.isEmpty()) {
                z();
                Iterator<WeakReference<m>> it = this.v.iterator();
                while (it.hasNext()) {
                    WeakReference next = it.next();
                    m mVar = (m) next.get();
                    if (mVar == null) {
                        this.v.remove(next);
                    } else {
                        mVar.d(z);
                    }
                }
                y();
                return;
            }
            return;
        }
        this.r = true;
        if (z) {
            this.s = true;
        }
    }

    public boolean r(MenuItem menuItem, int i2) {
        return s(menuItem, (m) null, i2);
    }

    public void removeGroup(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.g.get(i3).b == i2) {
                break;
            } else {
                i3++;
            }
        }
        if (i3 >= 0) {
            int size2 = this.g.size() - i3;
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                if (i4 >= size2 || this.g.get(i3).b != i2) {
                    q(true);
                } else {
                    t(i3, false);
                    i4 = i5;
                }
            }
            q(true);
        }
    }

    public void removeItem(int i2) {
        int size = size();
        int i3 = 0;
        while (true) {
            if (i3 >= size) {
                i3 = -1;
                break;
            } else if (this.g.get(i3).a == i2) {
                break;
            } else {
                i3++;
            }
        }
        t(i3, true);
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0062  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean s(android.view.MenuItem r7, h0.b.e.i.m r8, int r9) {
        /*
            r6 = this;
            h0.b.e.i.i r7 = (h0.b.e.i.i) r7
            r0 = 0
            if (r7 == 0) goto L_0x00d2
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto L_0x000d
            goto L_0x00d2
        L_0x000d:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.p
            r2 = 1
            if (r1 == 0) goto L_0x0019
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L_0x0019
            goto L_0x0040
        L_0x0019:
            h0.b.e.i.g r1 = r7.n
            boolean r1 = r1.e(r1, r7)
            if (r1 == 0) goto L_0x0022
            goto L_0x0040
        L_0x0022:
            android.content.Intent r1 = r7.g
            if (r1 == 0) goto L_0x0036
            h0.b.e.i.g r3 = r7.n     // Catch:{ ActivityNotFoundException -> 0x002e }
            android.content.Context r3 = r3.b     // Catch:{ ActivityNotFoundException -> 0x002e }
            r3.startActivity(r1)     // Catch:{ ActivityNotFoundException -> 0x002e }
            goto L_0x0040
        L_0x002e:
            r1 = move-exception
            java.lang.String r3 = "MenuItemImpl"
            java.lang.String r4 = "Can't find activity to handle intent; ignoring"
            android.util.Log.e(r3, r4, r1)
        L_0x0036:
            h0.i.i.b r1 = r7.A
            if (r1 == 0) goto L_0x0042
            boolean r1 = r1.e()
            if (r1 == 0) goto L_0x0042
        L_0x0040:
            r1 = r2
            goto L_0x0043
        L_0x0042:
            r1 = r0
        L_0x0043:
            h0.i.i.b r3 = r7.A
            if (r3 == 0) goto L_0x004f
            boolean r4 = r3.a()
            if (r4 == 0) goto L_0x004f
            r4 = r2
            goto L_0x0050
        L_0x004f:
            r4 = r0
        L_0x0050:
            boolean r5 = r7.f()
            if (r5 == 0) goto L_0x0062
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto L_0x00d1
            r6.c(r2)
            goto L_0x00d1
        L_0x0062:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L_0x0073
            if (r4 == 0) goto L_0x006b
            goto L_0x0073
        L_0x006b:
            r7 = r9 & 1
            if (r7 != 0) goto L_0x00d1
            r6.c(r2)
            goto L_0x00d1
        L_0x0073:
            r9 = r9 & 4
            if (r9 != 0) goto L_0x007a
            r6.c(r0)
        L_0x007a:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L_0x008e
            h0.b.e.i.r r9 = new h0.b.e.i.r
            android.content.Context r5 = r6.b
            r9.<init>(r5, r6, r7)
            r7.o = r9
            java.lang.CharSequence r5 = r7.e
            r9.setHeaderTitle((java.lang.CharSequence) r5)
        L_0x008e:
            h0.b.e.i.r r7 = r7.o
            if (r4 == 0) goto L_0x0095
            r3.f(r7)
        L_0x0095:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<h0.b.e.i.m>> r9 = r6.v
            boolean r9 = r9.isEmpty()
            if (r9 == 0) goto L_0x009e
            goto L_0x00cb
        L_0x009e:
            if (r8 == 0) goto L_0x00a4
            boolean r0 = r8.k(r7)
        L_0x00a4:
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<h0.b.e.i.m>> r8 = r6.v
            java.util.Iterator r8 = r8.iterator()
        L_0x00aa:
            boolean r9 = r8.hasNext()
            if (r9 == 0) goto L_0x00cb
            java.lang.Object r9 = r8.next()
            java.lang.ref.WeakReference r9 = (java.lang.ref.WeakReference) r9
            java.lang.Object r3 = r9.get()
            h0.b.e.i.m r3 = (h0.b.e.i.m) r3
            if (r3 != 0) goto L_0x00c4
            java.util.concurrent.CopyOnWriteArrayList<java.lang.ref.WeakReference<h0.b.e.i.m>> r3 = r6.v
            r3.remove(r9)
            goto L_0x00aa
        L_0x00c4:
            if (r0 != 0) goto L_0x00aa
            boolean r0 = r3.k(r7)
            goto L_0x00aa
        L_0x00cb:
            r1 = r1 | r0
            if (r1 != 0) goto L_0x00d1
            r6.c(r2)
        L_0x00d1:
            return r1
        L_0x00d2:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.e.i.g.s(android.view.MenuItem, h0.b.e.i.m, int):boolean");
    }

    public void setGroupCheckable(int i2, boolean z, boolean z2) {
        int size = this.g.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.g.get(i3);
            if (iVar.b == i2) {
                iVar.x = (iVar.x & -5) | (z2 ? 4 : 0);
                iVar.setCheckable(z);
            }
        }
    }

    public void setGroupDividerEnabled(boolean z) {
        this.x = z;
    }

    public void setGroupEnabled(int i2, boolean z) {
        int size = this.g.size();
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.g.get(i3);
            if (iVar.b == i2) {
                iVar.setEnabled(z);
            }
        }
    }

    public void setGroupVisible(int i2, boolean z) {
        int size = this.g.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            i iVar = this.g.get(i3);
            if (iVar.b == i2 && iVar.l(z)) {
                z2 = true;
            }
        }
        if (z2) {
            q(true);
        }
    }

    public void setQwertyMode(boolean z) {
        this.d = z;
        q(false);
    }

    public int size() {
        return this.g.size();
    }

    public final void t(int i2, boolean z) {
        if (i2 >= 0 && i2 < this.g.size()) {
            this.g.remove(i2);
            if (z) {
                q(true);
            }
        }
    }

    public void u(m mVar) {
        Iterator<WeakReference<m>> it = this.v.iterator();
        while (it.hasNext()) {
            WeakReference next = it.next();
            m mVar2 = (m) next.get();
            if (mVar2 == null || mVar2 == mVar) {
                this.v.remove(next);
            }
        }
    }

    public void v(Bundle bundle) {
        MenuItem findItem;
        if (bundle != null) {
            SparseArray sparseParcelableArray = bundle.getSparseParcelableArray(j());
            int size = size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = getItem(i2);
                View actionView = item.getActionView();
                if (!(actionView == null || actionView.getId() == -1)) {
                    actionView.restoreHierarchyState(sparseParcelableArray);
                }
                if (item.hasSubMenu()) {
                    ((r) item.getSubMenu()).v(bundle);
                }
            }
            int i3 = bundle.getInt("android:menu:expandedactionview");
            if (i3 > 0 && (findItem = findItem(i3)) != null) {
                findItem.expandActionView();
            }
        }
    }

    public void w(Bundle bundle) {
        int size = size();
        SparseArray sparseArray = null;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = getItem(i2);
            View actionView = item.getActionView();
            if (!(actionView == null || actionView.getId() == -1)) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((r) item.getSubMenu()).w(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(j(), sparseArray);
        }
    }

    public final void x(int i2, CharSequence charSequence, int i3, Drawable drawable, View view) {
        Resources resources = this.c;
        if (view != null) {
            this.p = view;
            this.n = null;
            this.o = null;
        } else {
            if (i2 > 0) {
                this.n = resources.getText(i2);
            } else if (charSequence != null) {
                this.n = charSequence;
            }
            if (i3 > 0) {
                this.o = h0.i.b.a.getDrawable(this.b, i3);
            } else if (drawable != null) {
                this.o = drawable;
            }
            this.p = null;
        }
        q(false);
    }

    public void y() {
        this.q = false;
        if (this.r) {
            this.r = false;
            q(this.s);
        }
    }

    public void z() {
        if (!this.q) {
            this.q = true;
            this.r = false;
            this.s = false;
        }
    }

    public MenuItem add(int i2) {
        return a(0, 0, 0, this.c.getString(i2));
    }

    public SubMenu addSubMenu(int i2) {
        return addSubMenu(0, 0, 0, (CharSequence) this.c.getString(i2));
    }

    public MenuItem add(int i2, int i3, int i4, CharSequence charSequence) {
        return a(i2, i3, i4, charSequence);
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, CharSequence charSequence) {
        i iVar = (i) a(i2, i3, i4, charSequence);
        r rVar = new r(this.b, this, iVar);
        iVar.o = rVar;
        rVar.setHeaderTitle(iVar.e);
        return rVar;
    }

    public MenuItem add(int i2, int i3, int i4, int i5) {
        return a(i2, i3, i4, this.c.getString(i5));
    }

    public SubMenu addSubMenu(int i2, int i3, int i4, int i5) {
        return addSubMenu(i2, i3, i4, (CharSequence) this.c.getString(i5));
    }
}
