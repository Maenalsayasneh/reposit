package i0.f.a.b.k;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.util.InternCache;
import java.util.Arrays;
import java.util.BitSet;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: CharsToNameCanonicalizer */
public final class b {
    public final b a;
    public final AtomicReference<C0119b> b;
    public final int c;
    public final int d;
    public boolean e;
    public String[] f;
    public a[] g;
    public int h;
    public int i;
    public int j;
    public int k;
    public boolean l;
    public BitSet m;

    /* compiled from: CharsToNameCanonicalizer */
    public static final class a {
        public final String a;
        public final a b;
        public final int c;

        public a(String str, a aVar) {
            this.a = str;
            this.b = aVar;
            this.c = aVar != null ? 1 + aVar.c : 1;
        }

        public String a(char[] cArr, int i, int i2) {
            if (this.a.length() != i2) {
                return null;
            }
            int i3 = 0;
            while (this.a.charAt(i3) == cArr[i + i3]) {
                i3++;
                if (i3 >= i2) {
                    return this.a;
                }
            }
            return null;
        }
    }

    public b(int i2) {
        this.a = null;
        this.c = i2;
        this.e = true;
        this.d = -1;
        this.l = false;
        this.k = 0;
        this.b = new AtomicReference<>(new C0119b(0, 0, new String[64], new a[32]));
    }

    public int a(int i2) {
        int i3 = i2 + (i2 >>> 15);
        int i4 = i3 ^ (i3 << 7);
        return (i4 + (i4 >>> 3)) & this.j;
    }

    public int b(String str) {
        int length = str.length();
        int i2 = this.c;
        for (int i3 = 0; i3 < length; i3++) {
            i2 = (i2 * 33) + str.charAt(i3);
        }
        if (i2 == 0) {
            return 1;
        }
        return i2;
    }

    public String c(char[] cArr, int i2, int i3, int i4) {
        String str;
        if (i3 < 1) {
            return "";
        }
        if (!this.e) {
            return new String(cArr, i2, i3);
        }
        int a2 = a(i4);
        String str2 = this.f[a2];
        if (str2 != null) {
            if (str2.length() == i3) {
                int i5 = 0;
                while (str2.charAt(i5) == cArr[i2 + i5]) {
                    i5++;
                    if (i5 == i3) {
                        return str2;
                    }
                }
            }
            a aVar = this.g[a2 >> 1];
            if (aVar != null) {
                String a3 = aVar.a(cArr, i2, i3);
                if (a3 != null) {
                    return a3;
                }
                a aVar2 = aVar.b;
                while (true) {
                    if (aVar2 == null) {
                        str = null;
                        break;
                    }
                    str = aVar2.a(cArr, i2, i3);
                    if (str != null) {
                        break;
                    }
                    aVar2 = aVar2.b;
                }
                if (str != null) {
                    return str;
                }
            }
        }
        if (this.l) {
            String[] strArr = this.f;
            this.f = (String[]) Arrays.copyOf(strArr, strArr.length);
            a[] aVarArr = this.g;
            this.g = (a[]) Arrays.copyOf(aVarArr, aVarArr.length);
            this.l = false;
        } else if (this.h >= this.i) {
            int i6 = r1 + r1;
            if (i6 > 65536) {
                this.h = 0;
                this.e = false;
                this.f = new String[64];
                this.g = new a[32];
                this.j = 63;
                this.l = false;
            } else {
                a[] aVarArr2 = this.g;
                this.f = new String[i6];
                this.g = new a[(i6 >> 1)];
                this.j = i6 - 1;
                this.i = i6 - (i6 >> 2);
                int i7 = 0;
                int i8 = 0;
                for (String str3 : this.f) {
                    if (str3 != null) {
                        i7++;
                        int a4 = a(b(str3));
                        String[] strArr2 = this.f;
                        if (strArr2[a4] == null) {
                            strArr2[a4] = str3;
                        } else {
                            int i9 = a4 >> 1;
                            a[] aVarArr3 = this.g;
                            a aVar3 = new a(str3, aVarArr3[i9]);
                            aVarArr3[i9] = aVar3;
                            i8 = Math.max(i8, aVar3.c);
                        }
                    }
                }
                int i10 = r1 >> 1;
                for (int i11 = 0; i11 < i10; i11++) {
                    for (a aVar4 = aVarArr2[i11]; aVar4 != null; aVar4 = aVar4.b) {
                        i7++;
                        String str4 = aVar4.a;
                        int a5 = a(b(str4));
                        String[] strArr3 = this.f;
                        if (strArr3[a5] == null) {
                            strArr3[a5] = str4;
                        } else {
                            int i12 = a5 >> 1;
                            a[] aVarArr4 = this.g;
                            a aVar5 = new a(str4, aVarArr4[i12]);
                            aVarArr4[i12] = aVar5;
                            i8 = Math.max(i8, aVar5.c);
                        }
                    }
                }
                this.k = i8;
                this.m = null;
                if (i7 != this.h) {
                    throw new IllegalStateException(String.format("Internal error on SymbolTable.rehash(): had %d entries; now have %d", new Object[]{Integer.valueOf(this.h), Integer.valueOf(i7)}));
                }
            }
            int i13 = this.c;
            int i14 = i3 + i2;
            for (int i15 = i2; i15 < i14; i15++) {
                i13 = (i13 * 33) + cArr[i15];
            }
            if (i13 == 0) {
                i13 = 1;
            }
            a2 = a(i13);
        }
        String str5 = new String(cArr, i2, i3);
        if (JsonFactory.Feature.INTERN_FIELD_NAMES.enabledIn(this.d)) {
            str5 = InternCache.c.a(str5);
        }
        this.h++;
        String[] strArr4 = this.f;
        if (strArr4[a2] == null) {
            strArr4[a2] = str5;
        } else {
            int i16 = a2 >> 1;
            a[] aVarArr5 = this.g;
            a aVar6 = new a(str5, aVarArr5[i16]);
            int i17 = aVar6.c;
            if (i17 > 100) {
                BitSet bitSet = this.m;
                if (bitSet == null) {
                    BitSet bitSet2 = new BitSet();
                    this.m = bitSet2;
                    bitSet2.set(i16);
                } else if (!bitSet.get(i16)) {
                    this.m.set(i16);
                } else if (!JsonFactory.Feature.FAIL_ON_SYMBOL_HASH_OVERFLOW.enabledIn(this.d)) {
                    this.e = false;
                } else {
                    StringBuilder P0 = i0.d.a.a.a.P0("Longest collision chain in symbol table (of size ");
                    P0.append(this.h);
                    P0.append(") now exceeds maximum, ");
                    P0.append(100);
                    P0.append(" -- suspect a DoS attack based on hash collisions");
                    throw new IllegalStateException(P0.toString());
                }
                this.f[a2] = str5;
                this.g[i16] = null;
                this.h -= aVar6.c;
                this.k = -1;
            } else {
                aVarArr5[i16] = aVar6;
                this.k = Math.max(i17, this.k);
            }
        }
        return str5;
    }

    /* renamed from: i0.f.a.b.k.b$b  reason: collision with other inner class name */
    /* compiled from: CharsToNameCanonicalizer */
    public static final class C0119b {
        public final int a;
        public final int b;
        public final String[] c;
        public final a[] d;

        public C0119b(int i, int i2, String[] strArr, a[] aVarArr) {
            this.a = i;
            this.b = i2;
            this.c = strArr;
            this.d = aVarArr;
        }

        public C0119b(b bVar) {
            this.a = bVar.h;
            this.b = bVar.k;
            this.c = bVar.f;
            this.d = bVar.g;
        }
    }

    public b(b bVar, int i2, int i3, C0119b bVar2) {
        this.a = bVar;
        this.c = i3;
        this.b = null;
        this.d = i2;
        this.e = JsonFactory.Feature.CANONICALIZE_FIELD_NAMES.enabledIn(i2);
        String[] strArr = bVar2.c;
        this.f = strArr;
        this.g = bVar2.d;
        this.h = bVar2.a;
        this.k = bVar2.b;
        int length = strArr.length;
        this.i = length - (length >> 2);
        this.j = length - 1;
        this.l = true;
    }
}
