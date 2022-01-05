package h0.w;

import androidx.room.RoomDatabase;
import h0.y.a.f.f;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: SharedSQLiteStatement */
public abstract class i {
    public final AtomicBoolean a = new AtomicBoolean(false);
    public final RoomDatabase b;
    public volatile f c;

    public i(RoomDatabase roomDatabase) {
        this.b = roomDatabase;
    }

    public f a() {
        this.b.a();
        if (this.a.compareAndSet(false, true)) {
            if (this.c == null) {
                this.c = this.b.d(b());
            }
            return this.c;
        }
        return this.b.d(b());
    }

    public abstract String b();

    public void c(f fVar) {
        if (fVar == this.c) {
            this.a.set(false);
        }
    }
}
