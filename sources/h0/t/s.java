package h0.t;

import android.os.Bundle;
import h0.t.k;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/* compiled from: Navigator */
public abstract class s<D extends k> {

    /* compiled from: Navigator */
    public interface a {
    }

    @Target({ElementType.TYPE})
    @Retention(RetentionPolicy.RUNTIME)
    /* compiled from: Navigator */
    public @interface b {
        String value();
    }

    public abstract D a();

    public abstract k b(D d, Bundle bundle, q qVar, a aVar);

    public void c(Bundle bundle) {
    }

    public Bundle d() {
        return null;
    }

    public abstract boolean e();
}
