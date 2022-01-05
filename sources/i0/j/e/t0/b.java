package i0.j.e.t0;

import com.instabug.library.util.InstabugDateFormatter;

/* compiled from: LogData */
public class b {
    public String a;
    public String b;
    public long c;
    public String d;

    public b(String str, String str2, long j, String str3, a aVar) {
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(InstabugDateFormatter.convertUnixTimeToFormattedDate(this.c, "HH:mm:ss.SSS"));
        sb.append(" ");
        sb.append(this.d);
        sb.append("  ");
        sb.append(this.a);
        sb.append("  ");
        return i0.d.a.a.a.y0(sb, this.b, "\n");
    }
}
