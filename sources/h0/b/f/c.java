package h0.b.f;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.R;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatImageView;
import h0.b.e.i.g;
import h0.b.e.i.i;
import h0.b.e.i.k;
import h0.b.e.i.l;
import h0.b.e.i.m;
import h0.b.e.i.n;
import h0.b.e.i.p;
import h0.b.e.i.r;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: ActionMenuPresenter */
public class c extends h0.b.e.i.b {
    public d b2;
    public Drawable c2;
    public boolean d2;
    public boolean e2;
    public boolean f2;
    public int g2;
    public int h2;
    public int i2;
    public boolean j2;
    public int k2;
    public final SparseBooleanArray l2 = new SparseBooleanArray();
    public e m2;
    public a n2;
    public C0020c o2;
    public b p2;
    public final f q2 = new f();

    /* compiled from: ActionMenuPresenter */
    public class a extends l {
        public a(Context context, r rVar, View view) {
            super(context, rVar, view, false, R.attr.actionOverflowMenuStyle, 0);
            if (!rVar.A.g()) {
                View view2 = c.this.b2;
                this.f = view2 == null ? (View) c.this.a2 : view2;
            }
            d(c.this.q2);
        }

        public void c() {
            c cVar = c.this;
            cVar.n2 = null;
            Objects.requireNonNull(cVar);
            super.c();
        }
    }

    /* compiled from: ActionMenuPresenter */
    public class b extends ActionMenuItemView.b {
        public b() {
        }
    }

    /* renamed from: h0.b.f.c$c  reason: collision with other inner class name */
    /* compiled from: ActionMenuPresenter */
    public class C0020c implements Runnable {
        public e c;

        public C0020c(e eVar) {
            this.c = eVar;
        }

        public void run() {
            g.a aVar;
            g gVar = c.this.q;
            if (!(gVar == null || (aVar = gVar.f) == null)) {
                aVar.b(gVar);
            }
            View view = (View) c.this.a2;
            if (!(view == null || view.getWindowToken() == null || !this.c.f())) {
                c.this.m2 = this.c;
            }
            c.this.o2 = null;
        }
    }

    /* compiled from: ActionMenuPresenter */
    public class d extends AppCompatImageView implements ActionMenuView.a {

        /* compiled from: ActionMenuPresenter */
        public class a extends e0 {
            public a(View view, c cVar) {
                super(view);
            }

            public p b() {
                e eVar = c.this.m2;
                if (eVar == null) {
                    return null;
                }
                return eVar.a();
            }

            public boolean c() {
                c.this.n();
                return true;
            }

            public boolean d() {
                c cVar = c.this;
                if (cVar.o2 != null) {
                    return false;
                }
                cVar.j();
                return true;
            }
        }

        public d(Context context) {
            super(context, (AttributeSet) null, R.attr.actionOverflowButtonStyle);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            g0.a.b.b.a.y0(this, getContentDescription());
            setOnTouchListener(new a(this, c.this));
        }

        public boolean a() {
            return false;
        }

        public boolean b() {
            return false;
        }

        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            c.this.n();
            return true;
        }

        public boolean setFrame(int i, int i2, int i3, int i4) {
            boolean frame = super.setFrame(i, i2, i3, i4);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (!(drawable == null || background == null)) {
                int width = getWidth();
                int height = getHeight();
                int max = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                background.setHotspotBounds(paddingLeft - max, paddingTop - max, paddingLeft + max, paddingTop + max);
            }
            return frame;
        }
    }

    /* compiled from: ActionMenuPresenter */
    public class e extends l {
        public e(Context context, g gVar, View view, boolean z) {
            super(context, gVar, view, z, R.attr.actionOverflowMenuStyle, 0);
            this.g = 8388613;
            d(c.this.q2);
        }

        public void c() {
            g gVar = c.this.q;
            if (gVar != null) {
                gVar.c(true);
            }
            c.this.m2 = null;
            super.c();
        }
    }

    /* compiled from: ActionMenuPresenter */
    public class f implements m.a {
        public f() {
        }

        public void c(g gVar, boolean z) {
            if (gVar instanceof r) {
                gVar.k().c(false);
            }
            m.a aVar = c.this.y;
            if (aVar != null) {
                aVar.c(gVar, z);
            }
        }

        public boolean d(g gVar) {
            c cVar = c.this;
            if (gVar == cVar.q) {
                return false;
            }
            int i = ((r) gVar).A.a;
            m.a aVar = cVar.y;
            if (aVar != null) {
                return aVar.d(gVar);
            }
            return false;
        }
    }

    public c(Context context) {
        super(context, R.layout.abc_action_menu_layout, R.layout.abc_action_menu_item_layout);
    }

    public boolean a() {
        return j() | l();
    }

    public View b(i iVar, View view, ViewGroup viewGroup) {
        n.a aVar;
        View actionView = iVar.getActionView();
        int i = 0;
        if (actionView == null || iVar.f()) {
            if (view instanceof n.a) {
                aVar = (n.a) view;
            } else {
                aVar = (n.a) this.x.inflate(this.Z1, viewGroup, false);
            }
            aVar.d(iVar, 0);
            ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
            actionMenuItemView.setItemInvoker((ActionMenuView) this.a2);
            if (this.p2 == null) {
                this.p2 = new b();
            }
            actionMenuItemView.setPopupCallback(this.p2);
            actionView = (View) aVar;
        }
        if (iVar.C) {
            i = 8;
        }
        actionView.setVisibility(i);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.j(layoutParams));
        }
        return actionView;
    }

    public void c(g gVar, boolean z) {
        a();
        m.a aVar = this.y;
        if (aVar != null) {
            aVar.c(gVar, z);
        }
    }

    public void d(boolean z) {
        n nVar;
        int i;
        boolean z2;
        ViewGroup viewGroup = (ViewGroup) this.a2;
        ArrayList<i> arrayList = null;
        boolean z3 = false;
        if (viewGroup != null) {
            g gVar = this.q;
            if (gVar != null) {
                gVar.i();
                ArrayList<i> l = this.q.l();
                int size = l.size();
                i = 0;
                for (int i3 = 0; i3 < size; i3++) {
                    i iVar = l.get(i3);
                    if (iVar.g()) {
                        View childAt = viewGroup.getChildAt(i);
                        i itemData = childAt instanceof n.a ? ((n.a) childAt).getItemData() : null;
                        View b3 = b(iVar, childAt, viewGroup);
                        if (iVar != itemData) {
                            b3.setPressed(false);
                            b3.jumpDrawablesToCurrentState();
                        }
                        if (b3 != childAt) {
                            ViewGroup viewGroup2 = (ViewGroup) b3.getParent();
                            if (viewGroup2 != null) {
                                viewGroup2.removeView(b3);
                            }
                            ((ViewGroup) this.a2).addView(b3, i);
                        }
                        i++;
                    }
                }
            } else {
                i = 0;
            }
            while (i < viewGroup.getChildCount()) {
                if (viewGroup.getChildAt(i) == this.b2) {
                    z2 = false;
                } else {
                    viewGroup.removeViewAt(i);
                    z2 = true;
                }
                if (!z2) {
                    i++;
                }
            }
        }
        ((View) this.a2).requestLayout();
        g gVar2 = this.q;
        if (gVar2 != null) {
            gVar2.i();
            ArrayList<i> arrayList2 = gVar2.j;
            int size2 = arrayList2.size();
            for (int i4 = 0; i4 < size2; i4++) {
                h0.i.i.b bVar = arrayList2.get(i4).A;
            }
        }
        g gVar3 = this.q;
        if (gVar3 != null) {
            gVar3.i();
            arrayList = gVar3.k;
        }
        if (this.e2 && arrayList != null) {
            int size3 = arrayList.size();
            if (size3 == 1) {
                z3 = !arrayList.get(0).C;
            } else if (size3 > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if (this.b2 == null) {
                this.b2 = new d(this.c);
            }
            ViewGroup viewGroup3 = (ViewGroup) this.b2.getParent();
            if (viewGroup3 != this.a2) {
                if (viewGroup3 != null) {
                    viewGroup3.removeView(this.b2);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.a2;
                d dVar = this.b2;
                ActionMenuView.c q = actionMenuView.h();
                q.a = true;
                actionMenuView.addView(dVar, q);
            }
        } else {
            d dVar2 = this.b2;
            if (dVar2 != null && dVar2.getParent() == (nVar = this.a2)) {
                ((ViewGroup) nVar).removeView(this.b2);
            }
        }
        ((ActionMenuView) this.a2).setOverflowReserved(this.e2);
    }

    public boolean e() {
        int i;
        ArrayList<i> arrayList;
        int i3;
        boolean z;
        g gVar = this.q;
        if (gVar != null) {
            arrayList = gVar.l();
            i = arrayList.size();
        } else {
            i = 0;
            arrayList = null;
        }
        int i4 = this.i2;
        int i5 = this.h2;
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) this.a2;
        int i6 = 0;
        boolean z2 = false;
        int i7 = 0;
        int i8 = 0;
        while (true) {
            i3 = 2;
            z = true;
            if (i6 >= i) {
                break;
            }
            i iVar = arrayList.get(i6);
            int i9 = iVar.y;
            if ((i9 & 2) == 2) {
                i8++;
            } else {
                if ((i9 & 1) == 1) {
                    i7++;
                } else {
                    z2 = true;
                }
            }
            if (this.j2 && iVar.C) {
                i4 = 0;
            }
            i6++;
        }
        if (this.e2 && (z2 || i7 + i8 > i4)) {
            i4--;
        }
        int i10 = i4 - i8;
        SparseBooleanArray sparseBooleanArray = this.l2;
        sparseBooleanArray.clear();
        int i11 = 0;
        int i12 = 0;
        while (i11 < i) {
            i iVar2 = arrayList.get(i11);
            int i13 = iVar2.y;
            if ((i13 & 2) == i3 ? z : false) {
                View b3 = b(iVar2, (View) null, viewGroup);
                b3.measure(makeMeasureSpec, makeMeasureSpec);
                int measuredWidth = b3.getMeasuredWidth();
                i5 -= measuredWidth;
                if (i12 == 0) {
                    i12 = measuredWidth;
                }
                int i14 = iVar2.b;
                if (i14 != 0) {
                    sparseBooleanArray.put(i14, z);
                }
                iVar2.k(z);
            } else {
                if ((i13 & true) == z ? z : false) {
                    int i15 = iVar2.b;
                    boolean z3 = sparseBooleanArray.get(i15);
                    boolean z4 = ((i10 > 0 || z3) && i5 > 0) ? z : false;
                    if (z4) {
                        View b4 = b(iVar2, (View) null, viewGroup);
                        b4.measure(makeMeasureSpec, makeMeasureSpec);
                        int measuredWidth2 = b4.getMeasuredWidth();
                        i5 -= measuredWidth2;
                        if (i12 == 0) {
                            i12 = measuredWidth2;
                        }
                        z4 &= i5 + i12 > 0;
                    }
                    if (z4 && i15 != 0) {
                        sparseBooleanArray.put(i15, true);
                    } else if (z3) {
                        sparseBooleanArray.put(i15, false);
                        for (int i16 = 0; i16 < i11; i16++) {
                            i iVar3 = arrayList.get(i16);
                            if (iVar3.b == i15) {
                                if (iVar3.g()) {
                                    i10++;
                                }
                                iVar3.k(false);
                            }
                        }
                    }
                    if (z4) {
                        i10--;
                    }
                    iVar2.k(z4);
                } else {
                    iVar2.k(false);
                    i11++;
                    i3 = 2;
                    z = true;
                }
            }
            i11++;
            i3 = 2;
            z = true;
        }
        return z;
    }

    public void i(Context context, g gVar) {
        this.d = context;
        LayoutInflater.from(context);
        this.q = gVar;
        Resources resources = context.getResources();
        if (!this.f2) {
            this.e2 = true;
        }
        int i = 2;
        this.g2 = context.getResources().getDisplayMetrics().widthPixels / 2;
        Configuration configuration = context.getResources().getConfiguration();
        int i3 = configuration.screenWidthDp;
        int i4 = configuration.screenHeightDp;
        if (configuration.smallestScreenWidthDp > 600 || i3 > 600 || ((i3 > 960 && i4 > 720) || (i3 > 720 && i4 > 960))) {
            i = 5;
        } else if (i3 >= 500 || ((i3 > 640 && i4 > 480) || (i3 > 480 && i4 > 640))) {
            i = 4;
        } else if (i3 >= 360) {
            i = 3;
        }
        this.i2 = i;
        int i5 = this.g2;
        if (this.e2) {
            if (this.b2 == null) {
                d dVar = new d(this.c);
                this.b2 = dVar;
                if (this.d2) {
                    dVar.setImageDrawable(this.c2);
                    this.c2 = null;
                    this.d2 = false;
                }
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.b2.measure(makeMeasureSpec, makeMeasureSpec);
            }
            i5 -= this.b2.getMeasuredWidth();
        } else {
            this.b2 = null;
        }
        this.h2 = i5;
        this.k2 = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    public boolean j() {
        n nVar;
        C0020c cVar = this.o2;
        if (cVar == null || (nVar = this.a2) == null) {
            e eVar = this.m2;
            if (eVar == null) {
                return false;
            }
            if (eVar.b()) {
                eVar.j.dismiss();
            }
            return true;
        }
        ((View) nVar).removeCallbacks(cVar);
        this.o2 = null;
        return true;
    }

    public boolean k(r rVar) {
        boolean z = false;
        if (!rVar.hasVisibleItems()) {
            return false;
        }
        r rVar2 = rVar;
        while (true) {
            g gVar = rVar2.z;
            if (gVar == this.q) {
                break;
            }
            rVar2 = gVar;
        }
        i iVar = rVar2.A;
        ViewGroup viewGroup = (ViewGroup) this.a2;
        View view = null;
        if (viewGroup != null) {
            int childCount = viewGroup.getChildCount();
            int i = 0;
            while (true) {
                if (i >= childCount) {
                    break;
                }
                View childAt = viewGroup.getChildAt(i);
                if ((childAt instanceof n.a) && ((n.a) childAt).getItemData() == iVar) {
                    view = childAt;
                    break;
                }
                i++;
            }
        }
        if (view == null) {
            return false;
        }
        int i3 = rVar.A.a;
        int size = rVar.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                break;
            }
            MenuItem item = rVar.getItem(i4);
            if (item.isVisible() && item.getIcon() != null) {
                z = true;
                break;
            }
            i4++;
        }
        a aVar = new a(this.d, rVar, view);
        this.n2 = aVar;
        aVar.h = z;
        k kVar = aVar.j;
        if (kVar != null) {
            kVar.o(z);
        }
        if (this.n2.f()) {
            m.a aVar2 = this.y;
            if (aVar2 != null) {
                aVar2.d(rVar);
            }
            return true;
        }
        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
    }

    public boolean l() {
        a aVar = this.n2;
        if (aVar == null) {
            return false;
        }
        if (!aVar.b()) {
            return true;
        }
        aVar.j.dismiss();
        return true;
    }

    public boolean m() {
        e eVar = this.m2;
        return eVar != null && eVar.b();
    }

    public boolean n() {
        g gVar;
        if (!this.e2 || m() || (gVar = this.q) == null || this.a2 == null || this.o2 != null) {
            return false;
        }
        gVar.i();
        if (gVar.k.isEmpty()) {
            return false;
        }
        C0020c cVar = new C0020c(new e(this.d, this.q, this.b2, true));
        this.o2 = cVar;
        ((View) this.a2).post(cVar);
        return true;
    }
}
