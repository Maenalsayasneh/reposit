package i0.f.a.b.m;

import i0.f.a.b.i.e;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: TextBuffer */
public final class i {
    public static final char[] a = new char[0];
    public final a b;
    public char[] c;
    public int d;
    public int e;
    public ArrayList<char[]> f;
    public boolean g;
    public int h;
    public char[] i;
    public int j;
    public String k;
    public char[] l;

    public i(a aVar) {
        this.b = aVar;
    }

    public void a(String str, int i2, int i3) {
        if (this.d >= 0) {
            u(i3);
        }
        this.k = null;
        this.l = null;
        char[] cArr = this.i;
        int length = cArr.length;
        int i4 = this.j;
        int i5 = length - i4;
        if (i5 >= i3) {
            str.getChars(i2, i2 + i3, cArr, i4);
            this.j += i3;
            return;
        }
        if (i5 > 0) {
            int i6 = i2 + i5;
            str.getChars(i2, i6, cArr, i4);
            i3 -= i5;
            i2 = i6;
        }
        while (true) {
            j();
            int min = Math.min(this.i.length, i3);
            int i7 = i2 + min;
            str.getChars(i2, i7, this.i, 0);
            this.j += min;
            i3 -= min;
            if (i3 > 0) {
                i2 = i7;
            } else {
                return;
            }
        }
    }

    public void b(char[] cArr, int i2, int i3) {
        if (this.d >= 0) {
            u(i3);
        }
        this.k = null;
        this.l = null;
        char[] cArr2 = this.i;
        int length = cArr2.length;
        int i4 = this.j;
        int i5 = length - i4;
        if (i5 >= i3) {
            System.arraycopy(cArr, i2, cArr2, i4, i3);
            this.j += i3;
            return;
        }
        if (i5 > 0) {
            System.arraycopy(cArr, i2, cArr2, i4, i5);
            i2 += i5;
            i3 -= i5;
        }
        do {
            j();
            int min = Math.min(this.i.length, i3);
            System.arraycopy(cArr, i2, this.i, 0, min);
            this.j += min;
            i2 += min;
            i3 -= min;
        } while (i3 > 0);
    }

    public final char[] c(int i2) {
        a aVar = this.b;
        if (aVar != null) {
            return aVar.b(2, i2);
        }
        return new char[Math.max(i2, 500)];
    }

    public final void d() {
        this.g = false;
        this.f.clear();
        this.h = 0;
        this.j = 0;
    }

    public char[] e() {
        int i2;
        char[] cArr = this.l;
        if (cArr == null) {
            String str = this.k;
            if (str != null) {
                cArr = str.toCharArray();
            } else {
                int i3 = this.d;
                if (i3 >= 0) {
                    int i4 = this.e;
                    if (i4 < 1) {
                        cArr = a;
                    } else if (i3 == 0) {
                        cArr = Arrays.copyOf(this.c, i4);
                    } else {
                        cArr = Arrays.copyOfRange(this.c, i3, i4 + i3);
                    }
                } else {
                    int t = t();
                    if (t < 1) {
                        cArr = a;
                    } else {
                        cArr = new char[t];
                        ArrayList<char[]> arrayList = this.f;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            i2 = 0;
                            for (int i5 = 0; i5 < size; i5++) {
                                char[] cArr2 = this.f.get(i5);
                                int length = cArr2.length;
                                System.arraycopy(cArr2, 0, cArr, i2, length);
                                i2 += length;
                            }
                        } else {
                            i2 = 0;
                        }
                        System.arraycopy(this.i, 0, cArr, i2, this.j);
                    }
                }
            }
            this.l = cArr;
        }
        return cArr;
    }

    public BigDecimal f() throws NumberFormatException {
        char[] cArr;
        char[] cArr2;
        char[] cArr3 = this.l;
        if (cArr3 != null) {
            String str = e.a;
            return e.b(cArr3, 0, cArr3.length);
        }
        int i2 = this.d;
        if (i2 >= 0 && (cArr2 = this.c) != null) {
            return e.b(cArr2, i2, this.e);
        }
        if (this.h == 0 && (cArr = this.i) != null) {
            return e.b(cArr, 0, this.j);
        }
        char[] e2 = e();
        String str2 = e.a;
        return e.b(e2, 0, e2.length);
    }

    public int g(boolean z) {
        char[] cArr;
        int i2 = this.d;
        if (i2 < 0 || (cArr = this.c) == null) {
            if (z) {
                return -e.e(this.i, 1, this.j - 1);
            }
            return e.e(this.i, 0, this.j);
        } else if (z) {
            return -e.e(cArr, i2 + 1, this.e - 1);
        } else {
            return e.e(cArr, i2, this.e);
        }
    }

    public String h() {
        if (this.k == null) {
            if (this.l != null) {
                this.k = new String(this.l);
            } else {
                String str = "";
                if (this.d < 0) {
                    int i2 = this.h;
                    int i3 = this.j;
                    if (i2 == 0) {
                        if (i3 != 0) {
                            str = new String(this.i, 0, i3);
                        }
                        this.k = str;
                    } else {
                        StringBuilder sb = new StringBuilder(i2 + i3);
                        ArrayList<char[]> arrayList = this.f;
                        if (arrayList != null) {
                            int size = arrayList.size();
                            for (int i4 = 0; i4 < size; i4++) {
                                char[] cArr = this.f.get(i4);
                                sb.append(cArr, 0, cArr.length);
                            }
                        }
                        sb.append(this.i, 0, this.j);
                        this.k = sb.toString();
                    }
                } else if (this.e < 1) {
                    this.k = str;
                    return str;
                } else {
                    this.k = new String(this.c, this.d, this.e);
                }
            }
        }
        return this.k;
    }

    public char[] i() {
        this.d = -1;
        this.j = 0;
        this.e = 0;
        this.c = null;
        this.k = null;
        this.l = null;
        if (this.g) {
            d();
        }
        char[] cArr = this.i;
        if (cArr != null) {
            return cArr;
        }
        char[] c2 = c(0);
        this.i = c2;
        return c2;
    }

    public final void j() {
        if (this.f == null) {
            this.f = new ArrayList<>();
        }
        char[] cArr = this.i;
        this.g = true;
        this.f.add(cArr);
        this.h += cArr.length;
        this.j = 0;
        int length = cArr.length;
        int i2 = length + (length >> 1);
        if (i2 < 500) {
            i2 = 500;
        } else if (i2 > 65536) {
            i2 = 65536;
        }
        this.i = new char[i2];
    }

    public char[] k() {
        char[] cArr = this.i;
        int length = cArr.length;
        int i2 = (length >> 1) + length;
        if (i2 > 65536) {
            i2 = (length >> 2) + length;
        }
        char[] copyOf = Arrays.copyOf(cArr, i2);
        this.i = copyOf;
        return copyOf;
    }

    public char[] l() {
        if (this.f == null) {
            this.f = new ArrayList<>();
        }
        this.g = true;
        this.f.add(this.i);
        int length = this.i.length;
        this.h += length;
        this.j = 0;
        int i2 = length + (length >> 1);
        if (i2 < 500) {
            i2 = 500;
        } else if (i2 > 65536) {
            i2 = 65536;
        }
        char[] cArr = new char[i2];
        this.i = cArr;
        return cArr;
    }

    public char[] m() {
        if (this.d >= 0) {
            u(1);
        } else {
            char[] cArr = this.i;
            if (cArr == null) {
                this.i = c(0);
            } else if (this.j >= cArr.length) {
                j();
            }
        }
        return this.i;
    }

    public char[] n() {
        if (this.d >= 0) {
            return this.c;
        }
        char[] cArr = this.l;
        if (cArr != null) {
            return cArr;
        }
        String str = this.k;
        if (str != null) {
            char[] charArray = str.toCharArray();
            this.l = charArray;
            return charArray;
        } else if (this.g) {
            return e();
        } else {
            char[] cArr2 = this.i;
            return cArr2 == null ? a : cArr2;
        }
    }

    public int o() {
        int i2 = this.d;
        if (i2 >= 0) {
            return i2;
        }
        return 0;
    }

    public void p() {
        char[] cArr;
        this.d = -1;
        this.j = 0;
        this.e = 0;
        this.c = null;
        this.l = null;
        if (this.g) {
            d();
        }
        a aVar = this.b;
        if (aVar != null && (cArr = this.i) != null) {
            this.i = null;
            aVar.d.set(2, cArr);
        }
    }

    public void q() {
        this.d = -1;
        this.j = 0;
        this.e = 0;
        this.c = null;
        this.k = null;
        this.l = null;
        if (this.g) {
            d();
        }
    }

    public void r(char[] cArr, int i2, int i3) {
        this.k = null;
        this.l = null;
        this.c = cArr;
        this.d = i2;
        this.e = i3;
        if (this.g) {
            d();
        }
    }

    public String s(int i2) {
        String str;
        this.j = i2;
        if (this.h > 0) {
            return h();
        }
        if (i2 == 0) {
            str = "";
        } else {
            str = new String(this.i, 0, i2);
        }
        this.k = str;
        return str;
    }

    public int t() {
        if (this.d >= 0) {
            return this.e;
        }
        char[] cArr = this.l;
        if (cArr != null) {
            return cArr.length;
        }
        String str = this.k;
        if (str != null) {
            return str.length();
        }
        return this.h + this.j;
    }

    public String toString() {
        return h();
    }

    public final void u(int i2) {
        int i3 = this.e;
        this.e = 0;
        char[] cArr = this.c;
        this.c = null;
        int i4 = this.d;
        this.d = -1;
        int i5 = i2 + i3;
        char[] cArr2 = this.i;
        if (cArr2 == null || i5 > cArr2.length) {
            this.i = c(i5);
        }
        if (i3 > 0) {
            System.arraycopy(cArr, i4, this.i, 0, i3);
        }
        this.h = 0;
        this.j = i3;
    }

    public i(a aVar, char[] cArr) {
        this.b = null;
        this.i = cArr;
        this.j = cArr.length;
        this.d = -1;
    }
}
