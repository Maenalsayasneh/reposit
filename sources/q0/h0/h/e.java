package q0.h0.h;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.io.EOFException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlin.text.StringsKt__IndentKt;
import m0.j.g;
import m0.n.b.i;
import okio.ByteString;
import q0.e0;
import q0.h0.c;
import q0.n;
import q0.p;
import q0.v;
import q0.w;
import r0.f;

/* compiled from: HttpHeaders.kt */
public final class e {
    public static final ByteString a;
    public static final ByteString b;

    static {
        ByteString.a aVar = ByteString.d;
        a = aVar.c("\"\\");
        b = aVar.c("\t ,=");
    }

    public static final boolean a(e0 e0Var) {
        i.e(e0Var, "$this$promisesBody");
        if (i.a(e0Var.d.c, "HEAD")) {
            return false;
        }
        int i = e0Var.y;
        if (((i >= 100 && i < 200) || i == 204 || i == 304) && c.k(e0Var) == -1 && !StringsKt__IndentKt.f("chunked", e0.b(e0Var, "Transfer-Encoding", (String) null, 2), true)) {
            return false;
        }
        return true;
    }

    public static final void b(f fVar, List<q0.i> list) throws EOFException {
        String c;
        int t;
        String str;
        f fVar2 = fVar;
        List<q0.i> list2 = list;
        while (true) {
            String str2 = null;
            while (true) {
                if (str2 == null) {
                    e(fVar);
                    str2 = c(fVar);
                    if (str2 == null) {
                        return;
                    }
                }
                boolean e = e(fVar);
                c = c(fVar);
                if (c != null) {
                    byte b2 = (byte) 61;
                    t = c.t(fVar2, b2);
                    boolean e2 = e(fVar);
                    if (e || (!e2 && !fVar.t())) {
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        int t2 = c.t(fVar2, b2) + t;
                        while (true) {
                            if (c == null) {
                                c = c(fVar);
                                if (e(fVar)) {
                                    continue;
                                    break;
                                }
                                t2 = c.t(fVar2, b2);
                            }
                            if (t2 == 0) {
                                continue;
                                break;
                            }
                            boolean z = true;
                            if (t2 <= 1 && !e(fVar)) {
                                byte b3 = (byte) 34;
                                if (!fVar.t() && fVar2.i(0) == b3) {
                                    if (fVar.readByte() != b3) {
                                        z = false;
                                    }
                                    if (z) {
                                        f fVar3 = new f();
                                        while (true) {
                                            long n = fVar2.n(a);
                                            if (n == -1) {
                                                break;
                                            } else if (fVar2.i(n) == b3) {
                                                fVar3.S(fVar2, n);
                                                fVar.readByte();
                                                str = fVar3.w();
                                                break;
                                            } else if (fVar2.d == n + 1) {
                                                break;
                                            } else {
                                                fVar3.S(fVar2, n);
                                                fVar.readByte();
                                                fVar3.S(fVar2, 1);
                                            }
                                        }
                                        str = null;
                                    } else {
                                        throw new IllegalArgumentException("Failed requirement.".toString());
                                    }
                                } else {
                                    str = c(fVar);
                                }
                                if (str != null && ((String) linkedHashMap.put(c, str)) == null) {
                                    if (e(fVar) || fVar.t()) {
                                        c = null;
                                    } else {
                                        return;
                                    }
                                } else {
                                    return;
                                }
                            } else {
                                return;
                            }
                        }
                        list2.add(new q0.i(str2, linkedHashMap));
                        str2 = c;
                    }
                } else if (fVar.t()) {
                    list2.add(new q0.i(str2, g.o()));
                    return;
                } else {
                    return;
                }
            }
            StringBuilder P0 = a.P0(c);
            P0.append(StringsKt__IndentKt.z("=", t));
            Map singletonMap = Collections.singletonMap((Object) null, P0.toString());
            i.d(singletonMap, "Collections.singletonMap…ek + \"=\".repeat(eqCount))");
            list2.add(new q0.i(str2, singletonMap));
        }
    }

    public static final String c(f fVar) {
        long n = fVar.n(b);
        if (n == -1) {
            n = fVar.d;
        }
        if (n != 0) {
            return fVar.y(n);
        }
        return null;
    }

    public static final void d(p pVar, w wVar, v vVar) {
        List list;
        i.e(pVar, "$this$receiveHeaders");
        i.e(wVar, "url");
        i.e(vVar, InstabugDbContract.NetworkLogEntry.COLUMN_HEADERS);
        if (pVar != p.a) {
            n nVar = n.e;
            i.e(wVar, "url");
            i.e(vVar, InstabugDbContract.NetworkLogEntry.COLUMN_HEADERS);
            List<String> o = vVar.o("Set-Cookie");
            int size = o.size();
            ArrayList arrayList = null;
            for (int i = 0; i < size; i++) {
                String str = o.get(i);
                i.e(wVar, "url");
                i.e(str, "setCookie");
                n b2 = n.b(System.currentTimeMillis(), wVar, str);
                if (b2 != null) {
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(b2);
                }
            }
            if (arrayList != null) {
                list = Collections.unmodifiableList(arrayList);
                i.d(list, "Collections.unmodifiableList(cookies)");
            } else {
                list = EmptyList.c;
            }
            if (!list.isEmpty()) {
                pVar.a(wVar, list);
            }
        }
    }

    public static final boolean e(f fVar) {
        boolean z = false;
        while (!fVar.t()) {
            byte i = fVar.i(0);
            if (i == 9 || i == 32) {
                fVar.readByte();
            } else if (i != 44) {
                break;
            } else {
                fVar.readByte();
                z = true;
            }
        }
        return z;
    }
}
