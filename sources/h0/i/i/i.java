package h0.i.i;

import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import g0.a.b.b.a;

/* compiled from: NestedScrollingChildHelper */
public class i {
    public ViewParent a;
    public ViewParent b;
    public final View c;
    public boolean d;
    public int[] e;

    public i(View view) {
        this.c = view;
    }

    public boolean a(float f, float f2, boolean z) {
        ViewParent f3;
        if (!this.d || (f3 = f(0)) == null) {
            return false;
        }
        return a.k0(f3, this.c, f, f2, z);
    }

    public boolean b(float f, float f2) {
        ViewParent f3;
        if (!this.d || (f3 = f(0)) == null) {
            return false;
        }
        return a.l0(f3, this.c, f, f2);
    }

    public boolean c(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        ViewParent f;
        int i4;
        int i5;
        if (!this.d || (f = f(i3)) == null) {
            return false;
        }
        if (i != 0 || i2 != 0) {
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                i5 = iArr2[0];
                i4 = iArr2[1];
            } else {
                i5 = 0;
                i4 = 0;
            }
            if (iArr == null) {
                if (this.e == null) {
                    this.e = new int[2];
                }
                iArr = this.e;
            }
            iArr[0] = 0;
            iArr[1] = 0;
            a.m0(f, this.c, i, i2, iArr, i3);
            if (iArr2 != null) {
                this.c.getLocationInWindow(iArr2);
                iArr2[0] = iArr2[0] - i5;
                iArr2[1] = iArr2[1] - i4;
            }
            if (iArr[0] == 0 && iArr[1] == 0) {
                return false;
            }
            return true;
        } else if (iArr2 == null) {
            return false;
        } else {
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
    }

    public boolean d(int i, int i2, int i3, int i4, int[] iArr) {
        return e(i, i2, i3, i4, iArr, 0, (int[]) null);
    }

    public final boolean e(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent f;
        int i6;
        int i7;
        int[] iArr3;
        int[] iArr4 = iArr;
        if (!this.d || (f = f(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr4 != null) {
                iArr4[0] = 0;
                iArr4[1] = 0;
            }
            return false;
        }
        if (iArr4 != null) {
            this.c.getLocationInWindow(iArr4);
            i7 = iArr4[0];
            i6 = iArr4[1];
        } else {
            i7 = 0;
            i6 = 0;
        }
        if (iArr2 == null) {
            if (this.e == null) {
                this.e = new int[2];
            }
            int[] iArr5 = this.e;
            iArr5[0] = 0;
            iArr5[1] = 0;
            iArr3 = iArr5;
        } else {
            iArr3 = iArr2;
        }
        a.n0(f, this.c, i, i2, i3, i4, i5, iArr3);
        if (iArr4 != null) {
            this.c.getLocationInWindow(iArr4);
            iArr4[0] = iArr4[0] - i7;
            iArr4[1] = iArr4[1] - i6;
        }
        return true;
    }

    public final ViewParent f(int i) {
        if (i == 0) {
            return this.a;
        }
        if (i != 1) {
            return null;
        }
        return this.b;
    }

    public boolean g(int i) {
        return f(i) != null;
    }

    public boolean h(int i, int i2) {
        boolean z;
        if (f(i2) != null) {
            return true;
        }
        if (this.d) {
            View view = this.c;
            for (ViewParent parent = this.c.getParent(); parent != null; parent = parent.getParent()) {
                View view2 = this.c;
                boolean z2 = parent instanceof j;
                if (z2) {
                    z = ((j) parent).l(view, view2, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            z = parent.onStartNestedScroll(view, view2, i);
                        } catch (AbstractMethodError e2) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onStartNestedScroll", e2);
                        }
                    }
                    z = false;
                }
                if (z) {
                    if (i2 == 0) {
                        this.a = parent;
                    } else if (i2 == 1) {
                        this.b = parent;
                    }
                    View view3 = this.c;
                    if (z2) {
                        ((j) parent).m(view, view3, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view, view3, i);
                        } catch (AbstractMethodError e3) {
                            Log.e("ViewParentCompat", "ViewParent " + parent + " does not implement interface method onNestedScrollAccepted", e3);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    public void i(int i) {
        ViewParent f = f(i);
        if (f != null) {
            View view = this.c;
            if (f instanceof j) {
                ((j) f).n(view, i);
            } else if (i == 0) {
                try {
                    f.onStopNestedScroll(view);
                } catch (AbstractMethodError e2) {
                    Log.e("ViewParentCompat", "ViewParent " + f + " does not implement interface method onStopNestedScroll", e2);
                }
            }
            if (i == 0) {
                this.a = null;
            } else if (i == 1) {
                this.b = null;
            }
        }
    }
}
