package h0.m.a;

import android.content.Context;
import android.content.pm.PackageManager;
import android.database.ContentObserver;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.HandlerThread;
import h0.i.f.d;
import h0.i.f.k;
import h0.i.f.l;
import h0.m.a.a;
import java.nio.ByteBuffer;
import java.util.Objects;

/* compiled from: FontRequestEmojiCompatConfig */
public class e extends a.c {
    public static final a b = new a();

    /* compiled from: FontRequestEmojiCompatConfig */
    public static class a {
    }

    /* compiled from: FontRequestEmojiCompatConfig */
    public static class b implements a.f {
        public final Context a;
        public final h0.i.f.e b;
        public final a c;
        public final Object d = new Object();
        public Handler e;
        public HandlerThread f;
        public a.g g;
        public ContentObserver h;
        public Runnable i;

        /* compiled from: FontRequestEmojiCompatConfig */
        public class a implements Runnable {
            public final /* synthetic */ a.g c;

            public a(a.g gVar) {
                this.c = gVar;
            }

            public void run() {
                b bVar = b.this;
                bVar.g = this.c;
                bVar.b();
            }
        }

        public b(Context context, h0.i.f.e eVar, a aVar) {
            g0.a.b.b.a.m(context, "Context cannot be null");
            g0.a.b.b.a.m(eVar, "FontRequest cannot be null");
            this.a = context.getApplicationContext();
            this.b = eVar;
            this.c = aVar;
        }

        public final void a() {
            this.g = null;
            ContentObserver contentObserver = this.h;
            if (contentObserver != null) {
                a aVar = this.c;
                Context context = this.a;
                Objects.requireNonNull(aVar);
                context.getContentResolver().unregisterContentObserver(contentObserver);
                this.h = null;
            }
            synchronized (this.d) {
                this.e.removeCallbacks(this.i);
                HandlerThread handlerThread = this.f;
                if (handlerThread != null) {
                    handlerThread.quit();
                }
                this.e = null;
                this.f = null;
            }
        }

        public void b() {
            if (this.g != null) {
                try {
                    l d2 = d();
                    int i2 = d2.e;
                    if (i2 == 2) {
                        synchronized (this.d) {
                        }
                    }
                    if (i2 == 0) {
                        a aVar = this.c;
                        Context context = this.a;
                        Objects.requireNonNull(aVar);
                        Typeface b2 = h0.i.c.e.a.b(context, (CancellationSignal) null, new l[]{d2}, 0);
                        ByteBuffer g02 = g0.a.b.b.a.g0(this.a, (CancellationSignal) null, d2.a);
                        if (g02 != null) {
                            this.g.a(f.a(b2, g02));
                            a();
                            return;
                        }
                        throw new RuntimeException("Unable to open file.");
                    }
                    throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                } catch (Throwable th) {
                    a.C0056a.this.a.d(th);
                    a();
                }
            }
        }

        public void c(a.g gVar) {
            g0.a.b.b.a.m(gVar, "LoaderCallback cannot be null");
            synchronized (this.d) {
                if (this.e == null) {
                    HandlerThread handlerThread = new HandlerThread("emojiCompat", 10);
                    this.f = handlerThread;
                    handlerThread.start();
                    this.e = new Handler(this.f.getLooper());
                }
                this.e.post(new a(gVar));
            }
        }

        public final l d() {
            try {
                a aVar = this.c;
                Context context = this.a;
                h0.i.f.e eVar = this.b;
                Objects.requireNonNull(aVar);
                k a2 = d.a(context, eVar, (CancellationSignal) null);
                if (a2.a == 0) {
                    l[] lVarArr = a2.b;
                    if (lVarArr != null && lVarArr.length != 0) {
                        return lVarArr[0];
                    }
                    throw new RuntimeException("fetchFonts failed (empty result)");
                }
                throw new RuntimeException(i0.d.a.a.a.u0(i0.d.a.a.a.P0("fetchFonts failed ("), a2.a, ")"));
            } catch (PackageManager.NameNotFoundException e2) {
                throw new RuntimeException("provider not found", e2);
            }
        }
    }

    public e(Context context, h0.i.f.e eVar) {
        super(new b(context, eVar, b));
    }
}
