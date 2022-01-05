package r0;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import m0.n.b.i;

/* compiled from: Timeout.kt */
public class z {
    public static final z a = new a();
    public boolean b;
    public long c;
    public long d;

    /* compiled from: Timeout.kt */
    public static final class a extends z {
        public z d(long j) {
            return this;
        }

        public void f() {
        }

        public z g(long j, TimeUnit timeUnit) {
            i.e(timeUnit, "unit");
            return this;
        }
    }

    public z a() {
        this.b = false;
        return this;
    }

    public z b() {
        this.d = 0;
        return this;
    }

    public long c() {
        if (this.b) {
            return this.c;
        }
        throw new IllegalStateException("No deadline".toString());
    }

    public z d(long j) {
        this.b = true;
        this.c = j;
        return this;
    }

    public boolean e() {
        return this.b;
    }

    public void f() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.b && this.c - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j, TimeUnit timeUnit) {
        i.e(timeUnit, "unit");
        if (j >= 0) {
            this.d = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(i0.d.a.a.a.k0("timeout < 0: ", j).toString());
    }
}
