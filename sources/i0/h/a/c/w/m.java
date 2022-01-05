package i0.h.a.c.w;

import android.graphics.Canvas;
import android.graphics.Matrix;
import i0.h.a.c.v.a;
import i0.h.a.c.w.n;
import java.util.List;

/* compiled from: ShapePath */
public class m extends n.f {
    public final /* synthetic */ List b;
    public final /* synthetic */ Matrix c;

    public m(n nVar, List list, Matrix matrix) {
        this.b = list;
        this.c = matrix;
    }

    public void a(Matrix matrix, a aVar, int i, Canvas canvas) {
        for (n.f a : this.b) {
            a.a(this.c, aVar, i, canvas);
        }
    }
}
