package h0.g0.r;

import android.content.Context;
import android.text.TextUtils;
import h0.y.a.c;

/* compiled from: WorkDatabase */
public class h implements c.C0076c {
    public final /* synthetic */ Context a;

    public h(Context context) {
        this.a = context;
    }

    public c a(c.b bVar) {
        Context context = this.a;
        String str = bVar.b;
        c.a aVar = bVar.c;
        if (aVar == null) {
            throw new IllegalArgumentException("Must set a callback to create the configuration.");
        } else if (context == null) {
            throw new IllegalArgumentException("Must set a non-null context to create the configuration.");
        } else if (!TextUtils.isEmpty(str)) {
            return new h0.y.a.f.c(context, str, aVar, true);
        } else {
            throw new IllegalArgumentException("Must set a non-null database name to a configuration that uses the no backup directory.");
        }
    }
}
