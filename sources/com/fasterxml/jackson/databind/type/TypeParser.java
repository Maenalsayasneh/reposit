package com.fasterxml.jackson.databind.type;

import com.fasterxml.jackson.databind.JavaType;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.f.a.c.t.f;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class TypeParser implements Serializable {
    public final TypeFactory c;

    public static final class a extends StringTokenizer {
        public final String a;
        public int b;
        public String c;

        public a(String str) {
            super(str, "<,>", true);
            this.a = str;
        }

        public boolean hasMoreTokens() {
            return this.c != null || super.hasMoreTokens();
        }

        public String nextToken() {
            String str = this.c;
            if (str != null) {
                this.c = null;
                return str;
            }
            String nextToken = super.nextToken();
            this.b = nextToken.length() + this.b;
            return nextToken.trim();
        }
    }

    public TypeParser(TypeFactory typeFactory) {
        this.c = typeFactory;
    }

    public IllegalArgumentException a(a aVar, String str) {
        String str2 = aVar.a;
        return new IllegalArgumentException(String.format("Failed to parse type '%s' (remaining: '%s'): %s", new Object[]{str2, str2.substring(aVar.b), str}));
    }

    public JavaType b(a aVar) throws IllegalArgumentException {
        JavaType[] javaTypeArr;
        if (aVar.hasMoreTokens()) {
            String nextToken = aVar.nextToken();
            try {
                Class<?> n = this.c.n(nextToken);
                if (aVar.hasMoreTokens()) {
                    String nextToken2 = aVar.nextToken();
                    if ("<".equals(nextToken2)) {
                        ArrayList arrayList = new ArrayList();
                        while (aVar.hasMoreTokens()) {
                            arrayList.add(b(aVar));
                            if (!aVar.hasMoreTokens()) {
                                break;
                            }
                            String nextToken3 = aVar.nextToken();
                            if (">".equals(nextToken3)) {
                                if (arrayList.isEmpty()) {
                                    javaTypeArr = TypeBindings.d;
                                } else {
                                    javaTypeArr = (JavaType[]) arrayList.toArray(TypeBindings.d);
                                }
                                return this.c.c((i0.f.a.c.s.a) null, n, TypeBindings.c(n, javaTypeArr));
                            } else if (!InstabugDbContract.COMMA_SEP.equals(nextToken3)) {
                                throw a(aVar, "Unexpected token '" + nextToken3 + "', expected ',' or '>')");
                            }
                        }
                        throw a(aVar, "Unexpected end-of-string");
                    }
                    aVar.c = nextToken2;
                }
                return this.c.c((i0.f.a.c.s.a) null, n, TypeBindings.q);
            } catch (Exception e) {
                f.K(e);
                throw a(aVar, "Cannot locate class '" + nextToken + "', problem: " + e.getMessage());
            }
        } else {
            throw a(aVar, "Unexpected end-of-string");
        }
    }
}
