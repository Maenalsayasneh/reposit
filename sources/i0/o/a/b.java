package i0.o.a;

import android.content.Context;
import android.content.res.AssetManager;
import android.net.Uri;
import com.squareup.picasso.Picasso;
import i0.o.a.v;
import java.io.IOException;
import m0.r.t.a.r.m.a1.a;

/* compiled from: AssetRequestHandler */
public class b extends v {
    public final Context a;
    public final Object b = new Object();
    public AssetManager c;

    public b(Context context) {
        this.a = context;
    }

    public boolean c(t tVar) {
        Uri uri = tVar.d;
        if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
            return false;
        }
        return true;
    }

    public v.a f(t tVar, int i) throws IOException {
        if (this.c == null) {
            synchronized (this.b) {
                if (this.c == null) {
                    this.c = this.a.getAssets();
                }
            }
        }
        return new v.a(a.D3(this.c.open(tVar.d.toString().substring(22))), Picasso.LoadedFrom.DISK);
    }
}
