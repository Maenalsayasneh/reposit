package i0.j.f.o;

import com.instabug.survey.callbacks.OnDismissCallback;
import com.instabug.survey.callbacks.OnFinishCallback;
import com.instabug.survey.callbacks.OnShowCallback;

/* compiled from: PerSessionSettings */
public class a {
    public static a a;
    public boolean b = true;
    public boolean c = false;
    public OnShowCallback d;
    public OnDismissCallback e;
    public OnFinishCallback f;
    public boolean g = false;
    public String h;
    public Boolean i = null;
    public boolean j = false;
    public boolean k = false;

    public static synchronized a a() {
        a aVar;
        synchronized (a.class) {
            if (a == null) {
                a = new a();
            }
            aVar = a;
        }
        return aVar;
    }
}
