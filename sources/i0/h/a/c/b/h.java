package i0.h.a.c.b;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;

/* compiled from: ViewOffsetBehavior */
public class h<V extends View> extends CoordinatorLayout.c<V> {
    public i a;
    public int b = 0;

    public h() {
    }

    public int B() {
        i iVar = this.a;
        if (iVar != null) {
            return iVar.d;
        }
        return 0;
    }

    public void C(CoordinatorLayout coordinatorLayout, V v, int i) {
        coordinatorLayout.s(v, i);
    }

    public boolean D(int i) {
        i iVar = this.a;
        if (iVar == null) {
            this.b = i;
            return false;
        } else if (iVar.d == i) {
            return false;
        } else {
            iVar.d = i;
            iVar.a();
            return true;
        }
    }

    public boolean k(CoordinatorLayout coordinatorLayout, V v, int i) {
        C(coordinatorLayout, v, i);
        if (this.a == null) {
            this.a = new i(v);
        }
        i iVar = this.a;
        iVar.b = iVar.a.getTop();
        iVar.c = iVar.a.getLeft();
        this.a.a();
        int i2 = this.b;
        if (i2 == 0) {
            return true;
        }
        i iVar2 = this.a;
        if (iVar2.d != i2) {
            iVar2.d = i2;
            iVar2.a();
        }
        this.b = 0;
        return true;
    }

    public h(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}
