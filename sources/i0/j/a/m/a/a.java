package i0.j.a.m.a;

import android.content.Context;
import java.lang.reflect.InvocationTargetException;

/* compiled from: DebugUtilsImpl */
public class a {
    public Context a = i0.j.a.g.a.m();
    public i0.j.a.n.a.a b = i0.j.a.g.a.i();

    public boolean a() {
        Context context = this.a;
        String str = "";
        String packageName = context != null ? context.getApplicationContext().getPackageName() : str;
        String str2 = null;
        try {
            try {
                try {
                    str2 = (String) Class.forName("android.os.SystemProperties").getDeclaredMethod("get", new Class[]{String.class}).invoke((Object) null, new Object[]{"debug.instabug.apm.app"});
                } catch (IllegalAccessException e) {
                    this.b.b(e.getMessage() != null ? e.getMessage() : str, e);
                } catch (InvocationTargetException e2) {
                    this.b.b(e2.getMessage() != null ? e2.getMessage() : str, e2);
                }
            } catch (NoSuchMethodException e3) {
                this.b.b(e3.getMessage() != null ? e3.getMessage() : str, e3);
            }
        } catch (ClassNotFoundException e4) {
            i0.j.a.n.a.a aVar = this.b;
            if (e4.getMessage() != null) {
                str = e4.getMessage();
            }
            aVar.b(str, e4);
        }
        if (packageName.isEmpty() || !packageName.equals(str2)) {
            return false;
        }
        return true;
    }
}
