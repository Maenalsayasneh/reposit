package n0.c.l.q;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import m0.n.b.i;
import n0.c.l.k;

/* compiled from: JsonParser.kt */
public final class f {
    public final boolean a;
    public final i b;

    public f(d dVar, i iVar) {
        i.e(dVar, "configuration");
        i.e(iVar, "reader");
        this.b = iVar;
        this.a = dVar.c;
    }

    public final JsonElement a() {
        i iVar;
        byte b2;
        i iVar2;
        byte b3;
        boolean z = false;
        if (this.b.f()) {
            i iVar3 = this.b;
            byte b4 = iVar3.b;
            if (b4 == 0) {
                return b(false);
            }
            if (b4 == 1) {
                return b(true);
            }
            if (b4 != 6) {
                if (b4 != 8) {
                    if (b4 == 10) {
                        k kVar = k.a;
                        iVar3.g();
                        return kVar;
                    }
                    i.d(iVar3, "Can't begin reading element, unexpected token", 0, 2);
                    throw null;
                } else if (b4 == 8) {
                    iVar3.g();
                    i iVar4 = this.b;
                    boolean z2 = iVar4.b != 4;
                    int i = iVar4.a;
                    if (z2) {
                        ArrayList arrayList = new ArrayList();
                        do {
                            boolean z3 = false;
                            while (this.b.f()) {
                                arrayList.add(a());
                                iVar2 = this.b;
                                b3 = iVar2.b;
                                if (b3 == 4) {
                                    iVar2.g();
                                    z3 = true;
                                }
                            }
                            i iVar5 = this.b;
                            boolean z4 = !z3;
                            int i2 = iVar5.a;
                            if (z4) {
                                iVar5.g();
                                return new JsonArray(arrayList);
                            }
                            iVar5.c("Unexpected trailing comma", i2);
                            throw null;
                        } while (b3 == 9);
                        iVar2.c("Expected end of the array or comma", iVar2.c);
                        throw null;
                    }
                    iVar4.c("Unexpected leading comma", i);
                    throw null;
                } else {
                    iVar3.c("Expected start of the array", iVar3.c);
                    throw null;
                }
            } else if (b4 == 6) {
                iVar3.g();
                i iVar6 = this.b;
                boolean z5 = iVar6.b != 4;
                int i3 = iVar6.a;
                if (z5) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    do {
                        boolean z6 = false;
                        while (this.b.f()) {
                            String h = this.a ? this.b.h() : this.b.j();
                            i iVar7 = this.b;
                            if (iVar7.b == 5) {
                                iVar7.g();
                                linkedHashMap.put(h, a());
                                iVar = this.b;
                                b2 = iVar.b;
                                if (b2 == 4) {
                                    iVar.g();
                                    z6 = true;
                                }
                            } else {
                                iVar7.c("Expected ':'", iVar7.c);
                                throw null;
                            }
                        }
                        i iVar8 = this.b;
                        if (!z6 && iVar8.b == 7) {
                            z = true;
                        }
                        int i4 = iVar8.a;
                        if (z) {
                            iVar8.g();
                            return new JsonObject(linkedHashMap);
                        }
                        iVar8.c("Expected end of the object", i4);
                        throw null;
                    } while (b2 == 7);
                    iVar.c("Expected end of the object or comma", iVar.c);
                    throw null;
                }
                iVar6.c("Unexpected leading comma", i3);
                throw null;
            } else {
                iVar3.c("Expected start of the object", iVar3.c);
                throw null;
            }
        } else {
            i.d(this.b, "Can't begin reading value from here", 0, 2);
            throw null;
        }
    }

    public final JsonElement b(boolean z) {
        String str;
        if (this.a) {
            str = this.b.h();
        } else {
            i iVar = this.b;
            str = z ? iVar.j() : iVar.h();
        }
        return new n0.c.l.i(str, z);
    }
}
