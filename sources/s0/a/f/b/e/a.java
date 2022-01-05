package s0.a.f.b.e;

import s0.a.e.b.b0.c.h3;

public class a {
    public int a;
    public int b;
    public int c;
    public short[][][] d;
    public short[][][] e;
    public short[][] f;
    public short[] g;

    public a(byte b2, byte b3, short[][][] sArr, short[][][] sArr2, short[][] sArr3, short[] sArr4) {
        byte b4 = b2 & 255;
        this.a = b4;
        byte b5 = b3 & 255;
        this.b = b5;
        this.c = b5 - b4;
        this.d = sArr;
        this.e = sArr2;
        this.f = sArr3;
        this.g = sArr4;
    }

    public boolean equals(Object obj) {
        if (obj != null && (obj instanceof a)) {
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && h3.N0(this.d, aVar.d) && h3.N0(this.e, aVar.e) && h3.M0(this.f, aVar.f) && h3.L0(this.g, aVar.g);
        }
    }

    public int hashCode() {
        int s1 = h3.s1(this.d);
        int s12 = h3.s1(this.e);
        int r1 = h3.r1(this.f);
        return h3.q1(this.g) + ((r1 + ((s12 + ((s1 + (((((this.a * 37) + this.b) * 37) + this.c) * 37)) * 37)) * 37)) * 37);
    }
}
