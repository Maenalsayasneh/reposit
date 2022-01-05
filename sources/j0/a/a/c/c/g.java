package j0.a.a.c.c;

import android.app.Application;
import android.app.Service;
import i0.e.b.l;
import i0.j.f.p.h;
import j0.a.a.c.a.d;
import j0.a.b.b;
import java.util.Objects;

/* compiled from: ServiceComponentManager */
public final class g implements b<Object> {
    public final Service c;
    public Object d;

    /* compiled from: ServiceComponentManager */
    public interface a {
        d a();
    }

    public g(Service service) {
        this.c = service;
    }

    public Object U() {
        if (this.d == null) {
            Application application = this.c.getApplication();
            h.D(application instanceof b, "Hilt service must be attached to an @AndroidEntryPoint Application. Found: %s", application.getClass());
            d a2 = ((a) h.L0(application, a.class)).a();
            Service service = this.c;
            l.f fVar = (l.f) a2;
            Objects.requireNonNull(fVar);
            Objects.requireNonNull(service);
            fVar.b = service;
            h.C(service, Service.class);
            this.d = new l.g(fVar.a, fVar.b);
        }
        return this.d;
    }
}
