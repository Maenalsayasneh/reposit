package i0.o.a;

import android.content.Context;
import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;
import h0.n.a.a;
import i0.o.a.v;
import java.io.IOException;
import m0.r.t.a.r.m.a1.a;
import r0.y;

/* compiled from: FileRequestHandler */
public class k extends g {
    public k(Context context) {
        super(context);
    }

    public boolean c(t tVar) {
        return "file".equals(tVar.d.getScheme());
    }

    public v.a f(t tVar, int i) throws IOException {
        y D3 = a.D3(this.a.getContentResolver().openInputStream(tVar.d));
        Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.DISK;
        h0.n.a.a aVar = new h0.n.a.a(tVar.d.getPath());
        a.b d = aVar.d("Orientation");
        int i2 = 1;
        if (d != null) {
            try {
                i2 = d.f(aVar.I);
            } catch (NumberFormatException unused) {
            }
        }
        return new v.a((Bitmap) null, D3, loadedFrom, i2);
    }
}
