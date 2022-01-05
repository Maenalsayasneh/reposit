package j0.a.a.c.c;

import android.app.Activity;
import android.app.Application;
import androidx.activity.ComponentActivity;
import i0.e.b.l;
import i0.j.f.p.h;
import j0.a.b.b;
import java.util.Objects;

/* compiled from: ActivityComponentManager */
public class a implements b<Object> {
    public volatile Object c;
    public final Object d = new Object();
    public final Activity q;
    public final b<j0.a.a.b.a> x;

    /* renamed from: j0.a.a.c.c.a$a  reason: collision with other inner class name */
    /* compiled from: ActivityComponentManager */
    public interface C0224a {
        j0.a.a.c.a.a b();
    }

    public a(Activity activity) {
        this.q = activity;
        this.x = new c((ComponentActivity) activity);
    }

    public Object U() {
        if (this.c == null) {
            synchronized (this.d) {
                if (this.c == null) {
                    this.c = a();
                }
            }
        }
        return this.c;
    }

    public Object a() {
        if (this.q.getApplication() instanceof b) {
            j0.a.a.c.a.a b = ((C0224a) h.L0(this.x, C0224a.class)).b();
            Activity activity = this.q;
            l.c.a aVar = (l.c.a) b;
            Objects.requireNonNull(aVar);
            Objects.requireNonNull(activity);
            aVar.c = activity;
            h.C(activity, Activity.class);
            return new l.c.b(aVar.a, aVar.b, new i0.e.b.c3.f.b(), aVar.c, (l.a) null);
        } else if (Application.class.equals(this.q.getApplication().getClass())) {
            throw new IllegalStateException("Hilt Activity must be attached to an @HiltAndroidApp Application. Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?");
        } else {
            StringBuilder P0 = i0.d.a.a.a.P0("Hilt Activity must be attached to an @AndroidEntryPoint Application. Found: ");
            P0.append(this.q.getApplication().getClass());
            throw new IllegalStateException(P0.toString());
        }
    }
}
