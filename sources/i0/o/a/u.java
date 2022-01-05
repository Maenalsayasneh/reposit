package i0.o.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.widget.ImageView;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import i0.o.a.t;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: RequestCreator */
public class u {
    public static final AtomicInteger a = new AtomicInteger();
    public final Picasso b;
    public final t.b c;
    public boolean d;

    public u(Picasso picasso, Uri uri, int i) {
        this.b = picasso;
        this.c = new t.b(uri, i, picasso.n);
    }

    public final t a(long j) {
        long j2 = j;
        int andIncrement = a.getAndIncrement();
        t.b bVar = this.c;
        if (bVar.g == null) {
            bVar.g = Picasso.Priority.NORMAL;
        }
        t tVar = new t(bVar.a, bVar.b, (String) null, bVar.e, bVar.c, bVar.d, false, false, 0, false, 0.0f, 0.0f, 0.0f, false, false, bVar.f, bVar.g, (t.a) null);
        tVar.b = andIncrement;
        tVar.c = j2;
        boolean z = this.b.p;
        if (z) {
            b0.f("Main", "created", tVar.d(), tVar.toString());
        }
        Objects.requireNonNull((Picasso.d.a) this.b.d);
        if (tVar != tVar) {
            tVar.b = andIncrement;
            tVar.c = j2;
            if (z) {
                String b2 = tVar.b();
                b0.f("Main", "changed", b2, "into " + tVar);
            }
        }
        return tVar;
    }

    public void b(ImageView imageView, e eVar) {
        Bitmap f;
        ImageView imageView2 = imageView;
        e eVar2 = eVar;
        long nanoTime = System.nanoTime();
        if (!b0.e()) {
            throw new IllegalStateException("Method call should happen from the main thread.");
        } else if (imageView2 != null) {
            t.b bVar = this.c;
            boolean z = true;
            if (!((bVar.a == null && bVar.b == 0) ? false : true)) {
                this.b.b(imageView2);
                r.c(imageView2, (Drawable) null);
                return;
            }
            if (this.d) {
                if (bVar.c == 0 && bVar.d == 0) {
                    z = false;
                }
                if (!z) {
                    int width = imageView.getWidth();
                    int height = imageView.getHeight();
                    if (width == 0 || height == 0) {
                        r.c(imageView2, (Drawable) null);
                        Picasso picasso = this.b;
                        h hVar = new h(this, imageView2, eVar2);
                        if (picasso.l.containsKey(imageView2)) {
                            picasso.a(imageView2);
                        }
                        picasso.l.put(imageView2, hVar);
                        return;
                    }
                    this.c.a(width, height);
                } else {
                    throw new IllegalStateException("Fit cannot be used with resize.");
                }
            }
            t a2 = a(nanoTime);
            StringBuilder sb = b0.a;
            String a3 = b0.a(a2, sb);
            sb.setLength(0);
            if (!MemoryPolicy.shouldReadFromMemoryCache(0) || (f = this.b.f(a3)) == null) {
                r.c(imageView2, (Drawable) null);
                this.b.d(new m(this.b, imageView, a2, 0, 0, 0, (Drawable) null, a3, (Object) null, eVar, false));
                return;
            }
            this.b.b(imageView2);
            Picasso picasso2 = this.b;
            Context context = picasso2.g;
            Picasso.LoadedFrom loadedFrom = Picasso.LoadedFrom.MEMORY;
            r.b(imageView, context, f, loadedFrom, false, picasso2.o);
            if (this.b.p) {
                b0.f("Main", "completed", a2.d(), "from " + loadedFrom);
            }
            if (eVar2 != null) {
                eVar.a();
            }
        } else {
            throw new IllegalArgumentException("Target must not be null.");
        }
    }
}
