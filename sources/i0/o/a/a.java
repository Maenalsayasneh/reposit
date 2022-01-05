package i0.o.a;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.squareup.picasso.Picasso;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

/* compiled from: Action */
public abstract class a<T> {
    public final Picasso a;
    public final t b;
    public final WeakReference<T> c;
    public final boolean d;
    public final int e;
    public final int f;
    public final int g;
    public final Drawable h;
    public final String i;
    public final Object j;
    public boolean k;
    public boolean l;

    /* renamed from: i0.o.a.a$a  reason: collision with other inner class name */
    /* compiled from: Action */
    public static class C0218a<M> extends WeakReference<M> {
        public final a a;

        public C0218a(a aVar, M m, ReferenceQueue<? super M> referenceQueue) {
            super(m, referenceQueue);
            this.a = aVar;
        }
    }

    public a(Picasso picasso, T t, t tVar, int i2, int i3, int i4, Drawable drawable, String str, Object obj, boolean z) {
        C0218a aVar;
        this.a = picasso;
        this.b = tVar;
        if (t == null) {
            aVar = null;
        } else {
            aVar = new C0218a(this, t, picasso.m);
        }
        this.c = aVar;
        this.e = i2;
        this.f = i3;
        this.d = z;
        this.g = i4;
        this.h = drawable;
        this.i = str;
        this.j = obj == null ? this : obj;
    }

    public void a() {
        this.l = true;
    }

    public abstract void b(Bitmap bitmap, Picasso.LoadedFrom loadedFrom);

    public abstract void c(Exception exc);

    public T d() {
        WeakReference<T> weakReference = this.c;
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }
}
