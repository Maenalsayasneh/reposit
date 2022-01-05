package i0.j.e.t0;

import i0.d.a.a.a;

/* compiled from: LogDescriptor */
public class c {
    public String a;
    public String b;
    public String c;
    public long d;

    public c(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    public String toString() {
        StringBuilder P0 = a.P0("\nsession started\nAppToken: ");
        P0.append(this.a);
        P0.append("\n");
        P0.append("OS Version: ");
        P0.append(this.b);
        P0.append("\n");
        P0.append("sdk version: ");
        P0.append(this.c);
        P0.append("\n");
        P0.append("free memory: ");
        P0.append(this.d);
        P0.append("\n\n");
        return P0.toString();
    }
}
