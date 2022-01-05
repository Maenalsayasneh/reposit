package i0.j.d.h.e.g;

import com.instabug.featuresrequest.d.b;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MainMyFeaturesDao */
public class a extends i0.j.d.h.b.a {
    public static volatile a b;
    public List<b> c;

    public a() {
        if (b == null) {
            this.c = new ArrayList();
            return;
        }
        throw new RuntimeException("Use getInstance() method to get the single instance of this class");
    }

    public b a(int i) {
        return this.c.get(i);
    }

    public void b() {
        this.c.clear();
    }

    public void c(List<b> list) {
        this.c.addAll(list);
    }

    public List<b> d() {
        return this.c;
    }

    public int e() {
        return this.c.size();
    }
}
