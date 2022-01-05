package i0.j.e.p0;

import android.graphics.Bitmap;
import i0.j.e.p0.e.a;
import k0.b.y.d;

/* compiled from: InstaCapture */
public class b implements d<Bitmap> {
    public final /* synthetic */ a c;
    public final /* synthetic */ d d;

    public b(d dVar, a aVar) {
        this.d = dVar;
        this.c = aVar;
    }

    public void b(Object obj) throws Exception {
        Bitmap bitmap = (Bitmap) obj;
        a aVar = this.c;
        if (aVar != null) {
            aVar.m(bitmap);
        }
        d.c(this.d, this.c);
        this.d.e();
    }
}
