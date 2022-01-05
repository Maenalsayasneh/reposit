package s0.c.e;

import java.lang.reflect.Method;
import java.util.Queue;
import org.slf4j.helpers.NOPLogger;
import s0.c.d.a;
import s0.c.d.c;

/* compiled from: SubstituteLogger */
public class b implements s0.c.b {
    public Queue<c> Y1;
    public final boolean Z1;
    public final String c;
    public volatile s0.c.b d;
    public Boolean q;
    public Method x;
    public a y;

    public b(String str, Queue<c> queue, boolean z) {
        this.c = str;
        this.Y1 = queue;
        this.Z1 = z;
    }

    public void a(String str, Throwable th) {
        d().a(str, th);
    }

    public void b(String str, Throwable th) {
        d().b(str, th);
    }

    public void c(String str) {
        d().c(str);
    }

    public s0.c.b d() {
        if (this.d != null) {
            return this.d;
        }
        if (this.Z1) {
            return NOPLogger.c;
        }
        if (this.y == null) {
            this.y = new a(this, this.Y1);
        }
        return this.y;
    }

    public void debug(String str) {
        d().debug(str);
    }

    public boolean e() {
        Boolean bool = this.q;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            this.x = this.d.getClass().getMethod("log", new Class[]{s0.c.d.b.class});
            this.q = Boolean.TRUE;
        } catch (NoSuchMethodException unused) {
            this.q = Boolean.FALSE;
        }
        return this.q.booleanValue();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && b.class == obj.getClass() && this.c.equals(((b) obj).c);
    }

    public String getName() {
        return this.c;
    }

    public int hashCode() {
        return this.c.hashCode();
    }

    public void info(String str) {
        d().info(str);
    }
}
