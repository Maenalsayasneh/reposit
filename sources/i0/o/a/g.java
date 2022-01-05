package i0.o.a;

import android.content.Context;
import com.squareup.picasso.Picasso;
import i0.o.a.v;
import java.io.IOException;
import m0.r.t.a.r.m.a1.a;

/* compiled from: ContentStreamRequestHandler */
public class g extends v {
    public final Context a;

    public g(Context context) {
        this.a = context;
    }

    public boolean c(t tVar) {
        return "content".equals(tVar.d.getScheme());
    }

    public v.a f(t tVar, int i) throws IOException {
        return new v.a(a.D3(this.a.getContentResolver().openInputStream(tVar.d)), Picasso.LoadedFrom.DISK);
    }
}
