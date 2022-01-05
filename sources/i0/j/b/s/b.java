package i0.j.b.s;

import android.annotation.SuppressLint;
import com.instabug.bug.h.a$a;
import com.instabug.bug.settings.AttachmentsTypesParams;
import com.instabug.library.Feature;
import com.instabug.library.OnSdkDismissCallback;
import i0.j.b.p.a;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PerSessionSettings */
public class b {
    public static b a;
    public AttachmentsTypesParams b;
    public boolean c = false;
    public String d;
    public List<a> e;
    public a$a f;
    public boolean g = false;
    public OnSdkDismissCallback h;
    public boolean i;
    public boolean j;
    public boolean k;
    public d l;

    public b() {
        Feature.State state = Feature.State.ENABLED;
        this.i = true;
        this.j = true;
        this.k = true;
        this.b = new AttachmentsTypesParams();
        this.e = new ArrayList();
        if (d.a == null) {
            d.a = new d();
        }
        this.l = d.a;
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public static synchronized b a() {
        b bVar;
        synchronized (b.class) {
            if (a == null) {
                a = new b();
            }
            bVar = a;
        }
        return bVar;
    }
}
