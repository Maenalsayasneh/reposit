package i0.l.a.i.a.h;

import com.nimbusds.jose.shaded.json.parser.ParseException;
import java.io.IOException;

/* compiled from: JSONParser */
public class d {
    public g a;

    static {
        String property = System.getProperty("JSON_SMART_SIMPLE");
    }

    public d(int i) {
    }

    public Object a(String str) throws ParseException {
        if (this.a == null) {
            this.a = new g(640);
        }
        g gVar = this.a;
        a aVar = a.a;
        c cVar = c.a;
        gVar.x = str;
        gVar.w = str.length();
        gVar.l = -1;
        gVar.g = aVar;
        gVar.h = cVar;
        try {
            gVar.c();
            Object d = gVar.d(e.e);
            if (gVar.r) {
                if (!gVar.s) {
                    gVar.j();
                }
                if (gVar.f != 26) {
                    throw new ParseException(gVar.l - 1, 1, Character.valueOf(gVar.f));
                }
            }
            gVar.k = null;
            gVar.j = null;
            return d;
        } catch (IOException e) {
            throw new ParseException(gVar.l, e);
        }
    }
}
