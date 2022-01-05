package h0.g.b.b;

import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import h0.g.b.b.x;
import h0.g.c.g;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: ViewTransitionController */
public class y {
    public final MotionLayout a;
    public ArrayList<x> b = new ArrayList<>();
    public HashSet<View> c;
    public String d = "ViewTransitionController";
    public ArrayList<x.a> e;
    public ArrayList<x.a> f = new ArrayList<>();

    /* compiled from: ViewTransitionController */
    public class a {
        public a(y yVar, x xVar, int i, boolean z, int i2) {
        }
    }

    public y(MotionLayout motionLayout) {
        this.a = motionLayout;
    }

    public final void a(x xVar, boolean z) {
        int i = xVar.u;
        int i2 = xVar.t;
        g sharedValues = ConstraintLayout.getSharedValues();
        int i3 = xVar.u;
        a aVar = new a(this, xVar, i, z, i2);
        HashSet hashSet = sharedValues.a.get(Integer.valueOf(i3));
        if (hashSet == null) {
            hashSet = new HashSet();
            sharedValues.a.put(Integer.valueOf(i3), hashSet);
        }
        hashSet.add(new WeakReference(aVar));
    }
}
