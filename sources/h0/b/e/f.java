package h0.b.e;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.R;
import h0.b.e.i.i;
import h0.b.e.i.j;
import h0.b.f.b0;
import h0.b.f.w0;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: SupportMenuInflater */
public class f extends MenuInflater {
    public static final Class<?>[] a;
    public static final Class<?>[] b;
    public final Object[] c;
    public final Object[] d;
    public Context e;
    public Object f;

    /* compiled from: SupportMenuInflater */
    public static class a implements MenuItem.OnMenuItemClickListener {
        public static final Class<?>[] a = {MenuItem.class};
        public Object b;
        public Method c;

        public a(Object obj, String str) {
            this.b = obj;
            Class<?> cls = obj.getClass();
            try {
                this.c = cls.getMethod(str, a);
            } catch (Exception e) {
                InflateException inflateException = new InflateException(i0.d.a.a.a.W(cls, i0.d.a.a.a.T0("Couldn't resolve menu item onClick handler ", str, " in class ")));
                inflateException.initCause(e);
                throw inflateException;
            }
        }

        public boolean onMenuItemClick(MenuItem menuItem) {
            try {
                if (this.c.getReturnType() == Boolean.TYPE) {
                    return ((Boolean) this.c.invoke(this.b, new Object[]{menuItem})).booleanValue();
                }
                this.c.invoke(this.b, new Object[]{menuItem});
                return true;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* compiled from: SupportMenuInflater */
    public class b {
        public h0.i.i.b A;
        public CharSequence B;
        public CharSequence C;
        public ColorStateList D = null;
        public PorterDuff.Mode E = null;
        public Menu a;
        public int b;
        public int c;
        public int d;
        public int e;
        public boolean f;
        public boolean g;
        public boolean h;
        public int i;
        public int j;
        public CharSequence k;
        public CharSequence l;
        public int m;
        public char n;
        public int o;
        public char p;
        public int q;
        public int r;
        public boolean s;
        public boolean t;
        public boolean u;
        public int v;
        public int w;
        public String x;
        public String y;
        public String z;

        public b(Menu menu) {
            this.a = menu;
            this.b = 0;
            this.c = 0;
            this.d = 0;
            this.e = 0;
            this.f = true;
            this.g = true;
        }

        public SubMenu a() {
            this.h = true;
            SubMenu addSubMenu = this.a.addSubMenu(this.b, this.i, this.j, this.k);
            c(addSubMenu.getItem());
            return addSubMenu;
        }

        public final <T> T b(String str, Class<?>[] clsArr, Object[] objArr) {
            try {
                Constructor<?> constructor = Class.forName(str, false, f.this.e.getClassLoader()).getConstructor(clsArr);
                constructor.setAccessible(true);
                return constructor.newInstance(objArr);
            } catch (Exception e2) {
                Log.w("SupportMenuInflater", "Cannot instantiate class: " + str, e2);
                return null;
            }
        }

        public final void c(MenuItem menuItem) {
            boolean z2 = false;
            menuItem.setChecked(this.s).setVisible(this.t).setEnabled(this.u).setCheckable(this.r >= 1).setTitleCondensed(this.l).setIcon(this.m);
            int i2 = this.v;
            if (i2 >= 0) {
                menuItem.setShowAsAction(i2);
            }
            if (this.z != null) {
                if (!f.this.e.isRestricted()) {
                    f fVar = f.this;
                    if (fVar.f == null) {
                        fVar.f = fVar.a(fVar.e);
                    }
                    menuItem.setOnMenuItemClickListener(new a(fVar.f, this.z));
                } else {
                    throw new IllegalStateException("The android:onClick attribute cannot be used within a restricted context");
                }
            }
            if (this.r >= 2) {
                if (menuItem instanceof i) {
                    i iVar = (i) menuItem;
                    iVar.x = (iVar.x & -5) | 4;
                } else if (menuItem instanceof j) {
                    j jVar = (j) menuItem;
                    try {
                        if (jVar.e == null) {
                            jVar.e = jVar.d.getClass().getDeclaredMethod("setExclusiveCheckable", new Class[]{Boolean.TYPE});
                        }
                        jVar.e.invoke(jVar.d, new Object[]{Boolean.TRUE});
                    } catch (Exception e2) {
                        Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e2);
                    }
                }
            }
            String str = this.x;
            if (str != null) {
                menuItem.setActionView((View) b(str, f.a, f.this.c));
                z2 = true;
            }
            int i3 = this.w;
            if (i3 > 0) {
                if (!z2) {
                    menuItem.setActionView(i3);
                } else {
                    Log.w("SupportMenuInflater", "Ignoring attribute 'itemActionViewLayout'. Action view already specified.");
                }
            }
            h0.i.i.b bVar = this.A;
            if (bVar != null) {
                if (menuItem instanceof h0.i.d.a.b) {
                    ((h0.i.d.a.b) menuItem).a(bVar);
                } else {
                    Log.w("MenuItemCompat", "setActionProvider: item does not implement SupportMenuItem; ignoring");
                }
            }
            CharSequence charSequence = this.B;
            boolean z3 = menuItem instanceof h0.i.d.a.b;
            if (z3) {
                ((h0.i.d.a.b) menuItem).setContentDescription(charSequence);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setContentDescription(charSequence);
            }
            CharSequence charSequence2 = this.C;
            if (z3) {
                ((h0.i.d.a.b) menuItem).setTooltipText(charSequence2);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setTooltipText(charSequence2);
            }
            char c2 = this.n;
            int i4 = this.o;
            if (z3) {
                ((h0.i.d.a.b) menuItem).setAlphabeticShortcut(c2, i4);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setAlphabeticShortcut(c2, i4);
            }
            char c3 = this.p;
            int i5 = this.q;
            if (z3) {
                ((h0.i.d.a.b) menuItem).setNumericShortcut(c3, i5);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setNumericShortcut(c3, i5);
            }
            PorterDuff.Mode mode = this.E;
            if (mode != null) {
                if (z3) {
                    ((h0.i.d.a.b) menuItem).setIconTintMode(mode);
                } else if (Build.VERSION.SDK_INT >= 26) {
                    menuItem.setIconTintMode(mode);
                }
            }
            ColorStateList colorStateList = this.D;
            if (colorStateList == null) {
                return;
            }
            if (z3) {
                ((h0.i.d.a.b) menuItem).setIconTintList(colorStateList);
            } else if (Build.VERSION.SDK_INT >= 26) {
                menuItem.setIconTintList(colorStateList);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v1, resolved type: java.lang.Class<?>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            r0 = 1
            java.lang.Class[] r0 = new java.lang.Class[r0]
            r1 = 0
            java.lang.Class<android.content.Context> r2 = android.content.Context.class
            r0[r1] = r2
            a = r0
            b = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h0.b.e.f.<clinit>():void");
    }

    public f(Context context) {
        super(context);
        this.e = context;
        Object[] objArr = {context};
        this.c = objArr;
        this.d = objArr;
    }

    public final Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        char c2;
        char c3;
        AttributeSet attributeSet2 = attributeSet;
        b bVar = new b(menu);
        int eventType = xmlPullParser.getEventType();
        while (true) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                } else {
                    throw new RuntimeException(i0.d.a.a.a.n0("Expecting menu, got ", name));
                }
            } else {
                eventType = xmlPullParser.next();
                if (eventType == 1) {
                    break;
                }
                XmlPullParser xmlPullParser2 = xmlPullParser;
            }
        }
        String str = null;
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            if (eventType != 1) {
                if (eventType != 2) {
                    if (eventType == 3) {
                        String name2 = xmlPullParser.getName();
                        if (z2 && name2.equals(str)) {
                            XmlPullParser xmlPullParser3 = xmlPullParser;
                            str = null;
                            z2 = false;
                            eventType = xmlPullParser.next();
                        } else if (name2.equals("group")) {
                            bVar.b = 0;
                            bVar.c = 0;
                            bVar.d = 0;
                            bVar.e = 0;
                            bVar.f = true;
                            bVar.g = true;
                        } else if (name2.equals("item")) {
                            if (!bVar.h) {
                                h0.i.i.b bVar2 = bVar.A;
                                if (bVar2 == null || !bVar2.a()) {
                                    bVar.h = true;
                                    bVar.c(bVar.a.add(bVar.b, bVar.i, bVar.j, bVar.k));
                                } else {
                                    bVar.a();
                                }
                            }
                        } else if (name2.equals("menu")) {
                            XmlPullParser xmlPullParser4 = xmlPullParser;
                            z = true;
                            eventType = xmlPullParser.next();
                        }
                    }
                } else if (!z2) {
                    String name3 = xmlPullParser.getName();
                    if (name3.equals("group")) {
                        TypedArray obtainStyledAttributes = f.this.e.obtainStyledAttributes(attributeSet2, R.styleable.MenuGroup);
                        bVar.b = obtainStyledAttributes.getResourceId(R.styleable.MenuGroup_android_id, 0);
                        bVar.c = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_menuCategory, 0);
                        bVar.d = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_orderInCategory, 0);
                        bVar.e = obtainStyledAttributes.getInt(R.styleable.MenuGroup_android_checkableBehavior, 0);
                        bVar.f = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_visible, true);
                        bVar.g = obtainStyledAttributes.getBoolean(R.styleable.MenuGroup_android_enabled, true);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        w0 p = w0.p(f.this.e, attributeSet2, R.styleable.MenuItem);
                        bVar.i = p.l(R.styleable.MenuItem_android_id, 0);
                        bVar.j = (p.j(R.styleable.MenuItem_android_menuCategory, bVar.c) & -65536) | (p.j(R.styleable.MenuItem_android_orderInCategory, bVar.d) & 65535);
                        bVar.k = p.n(R.styleable.MenuItem_android_title);
                        bVar.l = p.n(R.styleable.MenuItem_android_titleCondensed);
                        bVar.m = p.l(R.styleable.MenuItem_android_icon, 0);
                        String m = p.m(R.styleable.MenuItem_android_alphabeticShortcut);
                        if (m == null) {
                            c2 = 0;
                        } else {
                            c2 = m.charAt(0);
                        }
                        bVar.n = c2;
                        bVar.o = p.j(R.styleable.MenuItem_alphabeticModifiers, 4096);
                        String m2 = p.m(R.styleable.MenuItem_android_numericShortcut);
                        if (m2 == null) {
                            c3 = 0;
                        } else {
                            c3 = m2.charAt(0);
                        }
                        bVar.p = c3;
                        bVar.q = p.j(R.styleable.MenuItem_numericModifiers, 4096);
                        int i = R.styleable.MenuItem_android_checkable;
                        if (p.o(i)) {
                            bVar.r = p.a(i, false) ? 1 : 0;
                        } else {
                            bVar.r = bVar.e;
                        }
                        bVar.s = p.a(R.styleable.MenuItem_android_checked, false);
                        bVar.t = p.a(R.styleable.MenuItem_android_visible, bVar.f);
                        bVar.u = p.a(R.styleable.MenuItem_android_enabled, bVar.g);
                        bVar.v = p.j(R.styleable.MenuItem_showAsAction, -1);
                        bVar.z = p.m(R.styleable.MenuItem_android_onClick);
                        bVar.w = p.l(R.styleable.MenuItem_actionLayout, 0);
                        bVar.x = p.m(R.styleable.MenuItem_actionViewClass);
                        String m3 = p.m(R.styleable.MenuItem_actionProviderClass);
                        bVar.y = m3;
                        boolean z3 = m3 != null;
                        if (z3 && bVar.w == 0 && bVar.x == null) {
                            bVar.A = (h0.i.i.b) bVar.b(m3, b, f.this.d);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            bVar.A = null;
                        }
                        bVar.B = p.n(R.styleable.MenuItem_contentDescription);
                        bVar.C = p.n(R.styleable.MenuItem_tooltipText);
                        int i2 = R.styleable.MenuItem_iconTintMode;
                        if (p.o(i2)) {
                            bVar.E = b0.c(p.j(i2, -1), bVar.E);
                        } else {
                            bVar.E = null;
                        }
                        int i3 = R.styleable.MenuItem_iconTint;
                        if (p.o(i3)) {
                            bVar.D = p.c(i3);
                        } else {
                            bVar.D = null;
                        }
                        p.b.recycle();
                        bVar.h = false;
                    } else {
                        if (name3.equals("menu")) {
                            b(xmlPullParser, attributeSet2, bVar.a());
                        } else {
                            XmlPullParser xmlPullParser5 = xmlPullParser;
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlPullParser.next();
                    }
                }
                XmlPullParser xmlPullParser6 = xmlPullParser;
                eventType = xmlPullParser.next();
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    public void inflate(int i, Menu menu) {
        if (!(menu instanceof h0.i.d.a.a)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        try {
            xmlResourceParser = this.e.getResources().getLayout(i);
            b(xmlResourceParser, Xml.asAttributeSet(xmlResourceParser), menu);
            xmlResourceParser.close();
        } catch (XmlPullParserException e2) {
            throw new InflateException("Error inflating menu XML", e2);
        } catch (IOException e3) {
            throw new InflateException("Error inflating menu XML", e3);
        } catch (Throwable th) {
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
