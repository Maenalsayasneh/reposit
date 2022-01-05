package h0.x;

import android.annotation.SuppressLint;
import android.os.Bundle;
import androidx.savedstate.Recreator;

@SuppressLint({"RestrictedApi"})
/* compiled from: SavedStateRegistry */
public final class a {
    public h0.c.a.b.b<String, b> a = new h0.c.a.b.b<>();
    public Bundle b;
    public boolean c;
    public Recreator.a d;
    public boolean e = true;

    /* renamed from: h0.x.a$a  reason: collision with other inner class name */
    /* compiled from: SavedStateRegistry */
    public interface C0075a {
        void a(c cVar);
    }

    /* compiled from: SavedStateRegistry */
    public interface b {
        Bundle a();
    }

    public Bundle a(String str) {
        if (this.c) {
            Bundle bundle = this.b;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            this.b.remove(str);
            if (this.b.isEmpty()) {
                this.b = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component");
    }

    public void b(String str, b bVar) {
        if (this.a.j(str, bVar) != null) {
            throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
        }
    }

    public void c(Class<? extends C0075a> cls) {
        if (this.e) {
            if (this.d == null) {
                this.d = new Recreator.a(this);
            }
            try {
                cls.getDeclaredConstructor(new Class[0]);
                Recreator.a aVar = this.d;
                aVar.a.add(cls.getName());
            } catch (NoSuchMethodException e2) {
                StringBuilder P0 = i0.d.a.a.a.P0("Class");
                P0.append(cls.getSimpleName());
                P0.append(" must have default constructor in order to be automatically recreated");
                throw new IllegalArgumentException(P0.toString(), e2);
            }
        } else {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }
}
