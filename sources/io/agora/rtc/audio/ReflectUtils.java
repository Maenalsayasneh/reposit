package io.agora.rtc.audio;

import i0.d.a.a.a;
import io.agora.rtc.internal.Logging;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;

public class ReflectUtils {
    private static final String TAG = "ReflectUtils";

    public static Object safeCallMethod(Class cls, Object obj, String str, Class[] clsArr, Object[] objArr) {
        Method method;
        try {
            method = cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            method = null;
        }
        if (method == null) {
            StringBuilder P0 = a.P0("cannot  find method:  ");
            P0.append(cls.getSimpleName());
            P0.append(".");
            P0.append(str);
            P0.append(":");
            P0.append(Arrays.toString(clsArr));
            Logging.e(TAG, P0.toString());
            return null;
        }
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            e2.printStackTrace();
            Logging.e(TAG, "cannot  execute method:  " + cls.getSimpleName() + "." + str + ":" + Arrays.toString(clsArr));
            return null;
        } catch (InvocationTargetException e3) {
            e3.printStackTrace();
            Logging.e(TAG, "cannot  execute method:  " + cls.getSimpleName() + "." + str + ":" + Arrays.toString(clsArr));
            return null;
        }
    }

    public static Class safeFindClass(String str) {
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static Method safeGetMethod(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
            return null;
        }
    }
}
