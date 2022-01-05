package q0.h0.h;

import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.d.a.a.a;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import okhttp3.Protocol;

/* compiled from: StatusLine.kt */
public final class j {
    public final Protocol a;
    public final int b;
    public final String c;

    public j(Protocol protocol, int i, String str) {
        i.e(protocol, "protocol");
        i.e(str, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        this.a = protocol;
        this.b = i;
        this.c = str;
    }

    public static final j a(String str) throws IOException {
        Protocol protocol;
        String str2;
        i.e(str, "statusLine");
        int i = 9;
        if (StringsKt__IndentKt.J(str, "HTTP/1.", false, 2)) {
            if (str.length() < 9 || str.charAt(8) != ' ') {
                throw new ProtocolException(a.n0("Unexpected status line: ", str));
            }
            int charAt = str.charAt(7) - '0';
            if (charAt == 0) {
                protocol = Protocol.HTTP_1_0;
            } else if (charAt == 1) {
                protocol = Protocol.HTTP_1_1;
            } else {
                throw new ProtocolException(a.n0("Unexpected status line: ", str));
            }
        } else if (StringsKt__IndentKt.J(str, "ICY ", false, 2)) {
            protocol = Protocol.HTTP_1_0;
            i = 4;
        } else {
            throw new ProtocolException(a.n0("Unexpected status line: ", str));
        }
        int i2 = i + 3;
        if (str.length() >= i2) {
            try {
                String substring = str.substring(i, i2);
                i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                int parseInt = Integer.parseInt(substring);
                if (str.length() <= i2) {
                    str2 = "";
                } else if (str.charAt(i2) == ' ') {
                    str2 = str.substring(i + 4);
                    i.d(str2, "(this as java.lang.String).substring(startIndex)");
                } else {
                    throw new ProtocolException(a.n0("Unexpected status line: ", str));
                }
                return new j(protocol, parseInt, str2);
            } catch (NumberFormatException unused) {
                throw new ProtocolException(a.n0("Unexpected status line: ", str));
            }
        } else {
            throw new ProtocolException(a.n0("Unexpected status line: ", str));
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        if (this.a == Protocol.HTTP_1_0) {
            sb.append("HTTP/1.0");
        } else {
            sb.append("HTTP/1.1");
        }
        sb.append(' ');
        sb.append(this.b);
        sb.append(' ');
        sb.append(this.c);
        String sb2 = sb.toString();
        i.d(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }
}
