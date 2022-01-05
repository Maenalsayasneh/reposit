package i0.f.a.c.n;

import i0.d.a.a.a;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

/* compiled from: MemberKey */
public final class m {
    public static final Class<?>[] a = new Class[0];
    public final String b;
    public final Class<?>[] c;

    public m(Method method) {
        this(method.getName(), method.getParameterTypes());
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != m.class) {
            return false;
        }
        m mVar = (m) obj;
        if (!this.b.equals(mVar.b)) {
            return false;
        }
        Class<?>[] clsArr = mVar.c;
        int length = this.c.length;
        if (clsArr.length != length) {
            return false;
        }
        for (int i = 0; i < length; i++) {
            if (clsArr[i] != this.c[i]) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        return this.b.hashCode() + this.c.length;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        sb.append("(");
        return a.u0(sb, this.c.length, "-args)");
    }

    public m(Constructor<?> constructor) {
        Class<?>[] parameterTypes = constructor.getParameterTypes();
        this.b = "";
        this.c = parameterTypes == null ? a : parameterTypes;
    }

    public m(String str, Class<?>[] clsArr) {
        this.b = str;
        this.c = clsArr == null ? a : clsArr;
    }
}
