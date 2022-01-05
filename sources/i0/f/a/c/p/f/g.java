package i0.f.a.c.p.f;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.jsontype.PolymorphicTypeValidator;
import com.fasterxml.jackson.databind.type.TypeFactory;
import i0.f.a.c.c;
import java.io.IOException;

/* compiled from: MinimalClassNameIdResolver */
public class g extends f {
    public final String d;
    public final String e;

    public g(JavaType javaType, TypeFactory typeFactory, PolymorphicTypeValidator polymorphicTypeValidator) {
        super(javaType, typeFactory, polymorphicTypeValidator);
        String name = javaType.c.getName();
        int lastIndexOf = name.lastIndexOf(46);
        if (lastIndexOf < 0) {
            this.d = "";
            this.e = ".";
            return;
        }
        this.e = name.substring(0, lastIndexOf + 1);
        this.d = name.substring(0, lastIndexOf);
    }

    public String a(Object obj) {
        String name = obj.getClass().getName();
        return name.startsWith(this.e) ? name.substring(this.e.length() - 1) : name;
    }

    public JavaType h(String str, c cVar) throws IOException {
        if (str.startsWith(".")) {
            StringBuilder sb = new StringBuilder(this.d.length() + str.length());
            if (this.d.isEmpty()) {
                sb.append(str.substring(1));
            } else {
                sb.append(this.d);
                sb.append(str);
            }
            str = sb.toString();
        }
        return super.h(str, cVar);
    }
}
