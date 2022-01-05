package h0.t;

import android.annotation.SuppressLint;
import h0.t.s;
import i0.d.a.a.a;
import java.util.HashMap;

@SuppressLint({"TypeParameterUnusedInFormals"})
/* compiled from: NavigatorProvider */
public class t {
    public static final HashMap<Class<?>, String> a = new HashMap<>();
    public final HashMap<String, s<? extends k>> b = new HashMap<>();

    public static String b(Class<? extends s> cls) {
        HashMap<Class<?>, String> hashMap = a;
        String str = hashMap.get(cls);
        if (str == null) {
            s.b bVar = (s.b) cls.getAnnotation(s.b.class);
            str = bVar != null ? bVar.value() : null;
            if (d(str)) {
                hashMap.put(cls, str);
            } else {
                StringBuilder P0 = a.P0("No @Navigator.Name annotation found for ");
                P0.append(cls.getSimpleName());
                throw new IllegalArgumentException(P0.toString());
            }
        }
        return str;
    }

    public static boolean d(String str) {
        return str != null && !str.isEmpty();
    }

    public final s<? extends k> a(s<? extends k> sVar) {
        String b2 = b(sVar.getClass());
        if (d(b2)) {
            return this.b.put(b2, sVar);
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }

    public <T extends s<?>> T c(String str) {
        if (d(str)) {
            T t = (s) this.b.get(str);
            if (t != null) {
                return t;
            }
            throw new IllegalStateException(a.o0("Could not find Navigator with name \"", str, "\". You must call NavController.addNavigator() for each navigation type."));
        }
        throw new IllegalArgumentException("navigator name cannot be an empty string");
    }
}
