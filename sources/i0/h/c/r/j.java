package i0.h.c.r;

import com.google.firebase.installations.local.PersistedInstallation;
import i0.h.a.b.m.h;
import i0.h.c.r.p.c;

/* compiled from: GetIdListener */
public class j implements m {
    public final h<String> a;

    public j(h<String> hVar) {
        this.a = hVar;
    }

    public boolean a(Exception exc) {
        return false;
    }

    public boolean b(c cVar) {
        if (!(cVar.f() == PersistedInstallation.RegistrationStatus.UNREGISTERED) && !cVar.j() && !cVar.h()) {
            return false;
        }
        this.a.b(cVar.c());
        return true;
    }
}
