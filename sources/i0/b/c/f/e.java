package i0.b.c.f;

import android.util.SparseIntArray;
import android.view.View;
import m0.n.b.i;

/* compiled from: ViewProxy.kt */
public final class e extends a<e, View> {
    public static final SparseIntArray b;
    public boolean c;
    public Integer d;
    public Integer e;
    public Integer f;
    public Integer g;
    public Integer h;
    public Integer i;
    public Integer j;
    public Integer k;
    public Integer l;
    public Integer m;
    public Integer n;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        sparseIntArray.put(0, 0);
        sparseIntArray.put(4, 4);
        sparseIntArray.put(8, 8);
        sparseIntArray.put(1, 4);
        sparseIntArray.put(2, 8);
        b = sparseIntArray;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public e(View view) {
        super(view);
        i.e(view, "view");
    }
}
