package s0.a.a;

import i0.d.a.a.a;
import java.io.IOException;
import java.util.Arrays;
import s0.a.e.b.b0.c.h3;
import s0.a.g.j;

public class a0 extends r {
    public byte[] c;

    public a0(byte[] bArr) {
        if (bArr.length >= 2) {
            this.c = bArr;
            if (!D(0) || !D(1)) {
                throw new IllegalArgumentException("illegal characters in UTCTime string");
            }
            return;
        }
        throw new IllegalArgumentException("UTCTime string too short");
    }

    public String B() {
        String str;
        StringBuilder sb;
        String C = C();
        if (C.charAt(0) < '5') {
            sb = new StringBuilder();
            str = "20";
        } else {
            sb = new StringBuilder();
            str = "19";
        }
        return a.y0(sb, str, C);
    }

    public String C() {
        StringBuilder sb;
        String str;
        String a = j.a(this.c);
        if (a.indexOf(45) >= 0 || a.indexOf(43) >= 0) {
            int indexOf = a.indexOf(45);
            if (indexOf < 0) {
                indexOf = a.indexOf(43);
            }
            if (indexOf == a.length() - 3) {
                a = a.n0(a, "00");
            }
            if (indexOf == 10) {
                sb = new StringBuilder();
                sb.append(a.substring(0, 10));
                sb.append("00GMT");
                sb.append(a.substring(10, 13));
                sb.append(":");
                str = a.substring(13, 15);
            } else {
                sb = new StringBuilder();
                sb.append(a.substring(0, 12));
                sb.append("GMT");
                sb.append(a.substring(12, 15));
                sb.append(":");
                str = a.substring(15, 17);
            }
        } else if (a.length() == 11) {
            sb = new StringBuilder();
            sb.append(a.substring(0, 10));
            str = "00GMT+00:00";
        } else {
            sb = new StringBuilder();
            sb.append(a.substring(0, 12));
            str = "GMT+00:00";
        }
        sb.append(str);
        return sb.toString();
    }

    public final boolean D(int i) {
        byte[] bArr = this.c;
        return bArr.length > i && bArr[i] >= 48 && bArr[i] <= 57;
    }

    public int hashCode() {
        return h3.m1(this.c);
    }

    public boolean s(r rVar) {
        if (!(rVar instanceof a0)) {
            return false;
        }
        return Arrays.equals(this.c, ((a0) rVar).c);
    }

    public void t(q qVar, boolean z) throws IOException {
        qVar.g(z, 23, this.c);
    }

    public String toString() {
        return j.a(this.c);
    }

    public int u() {
        int length = this.c.length;
        return a2.a(length) + 1 + length;
    }

    public boolean y() {
        return false;
    }
}
