package q0.h0.j;

import i0.d.a.a.a;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import okio.ByteString;

/* compiled from: Http2.kt */
public final class c {
    public static final ByteString a = ByteString.d.c("PRI * HTTP/2.0\r\n\r\nSM\r\n\r\n");
    public static final String[] b = {"DATA", "HEADERS", "PRIORITY", "RST_STREAM", "SETTINGS", "PUSH_PROMISE", "PING", "GOAWAY", "WINDOW_UPDATE", "CONTINUATION"};
    public static final String[] c = new String[64];
    public static final String[] d;
    public static final c e = new c();

    static {
        String[] strArr = new String[256];
        for (int i = 0; i < 256; i++) {
            String binaryString = Integer.toBinaryString(i);
            i.d(binaryString, "Integer.toBinaryString(it)");
            strArr[i] = StringsKt__IndentKt.A(q0.h0.c.i("%8s", binaryString), ' ', '0', false, 4);
        }
        d = strArr;
        String[] strArr2 = c;
        strArr2[0] = "";
        strArr2[1] = "END_STREAM";
        int[] iArr = {1};
        strArr2[8] = "PADDED";
        for (int i2 = 0; i2 < 1; i2++) {
            int i3 = iArr[i2];
            String[] strArr3 = c;
            strArr3[i3 | 8] = i.k(strArr3[i3], "|PADDED");
        }
        String[] strArr4 = c;
        strArr4[4] = "END_HEADERS";
        strArr4[32] = "PRIORITY";
        strArr4[36] = "END_HEADERS|PRIORITY";
        int[] iArr2 = {4, 32, 36};
        for (int i4 = 0; i4 < 3; i4++) {
            int i5 = iArr2[i4];
            for (int i6 = 0; i6 < 1; i6++) {
                int i7 = iArr[i6];
                String[] strArr5 = c;
                int i8 = i7 | i5;
                strArr5[i8] = strArr5[i7] + "|" + strArr5[i5];
                StringBuilder sb = new StringBuilder();
                sb.append(strArr5[i7]);
                sb.append("|");
                strArr5[i8 | 8] = a.y0(sb, strArr5[i5], "|PADDED");
            }
        }
        int length = c.length;
        for (int i9 = 0; i9 < length; i9++) {
            String[] strArr6 = c;
            if (strArr6[i9] == null) {
                strArr6[i9] = d[i9];
            }
        }
    }

    public final String a(int i) {
        String[] strArr = b;
        if (i < strArr.length) {
            return strArr[i];
        }
        return q0.h0.c.i("0x%02x", Integer.valueOf(i));
    }

    public final String b(boolean z, int i, int i2, int i3, int i4) {
        String str;
        String str2;
        String a2 = a(i3);
        if (i4 == 0) {
            str = "";
        } else {
            if (!(i3 == 2 || i3 == 3)) {
                if (i3 == 4 || i3 == 6) {
                    str = i4 == 1 ? "ACK" : d[i4];
                } else if (!(i3 == 7 || i3 == 8)) {
                    String[] strArr = c;
                    if (i4 < strArr.length) {
                        str2 = strArr[i4];
                        i.c(str2);
                    } else {
                        str2 = d[i4];
                    }
                    str = (i3 != 5 || (i4 & 4) == 0) ? (i3 != 0 || (i4 & 32) == 0) ? str2 : StringsKt__IndentKt.B(str2, "PRIORITY", "COMPRESSED", false, 4) : StringsKt__IndentKt.B(str2, "HEADERS", "PUSH_PROMISE", false, 4);
                }
            }
            str = d[i4];
        }
        return q0.h0.c.i("%s 0x%08x %5d %-13s %s", z ? "<<" : ">>", Integer.valueOf(i), Integer.valueOf(i2), a2, str);
    }
}
