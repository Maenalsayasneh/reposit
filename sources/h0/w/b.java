package h0.w;

import androidx.room.RoomDatabase;
import h0.y.a.f.f;

/* compiled from: EntityInsertionAdapter */
public abstract class b<T> extends i {
    public b(RoomDatabase roomDatabase) {
        super(roomDatabase);
    }

    public abstract void d(f fVar, T t);

    public final void e(T t) {
        f a = a();
        try {
            d(a, t);
            a.d.executeInsert();
            if (a == this.c) {
                this.a.set(false);
            }
        } catch (Throwable th) {
            c(a);
            throw th;
        }
    }
}
