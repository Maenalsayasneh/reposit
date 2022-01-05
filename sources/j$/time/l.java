package j$.time;

import j$.time.zone.c;
import j$.time.zone.d;
import j$.time.zone.e;
import java.io.Serializable;

final class l extends ZoneId implements Serializable {
    private final String b;
    private final transient c c;

    l(String str, c cVar) {
        this.b = str;
        this.c = cVar;
    }

    static l P(String str, boolean z) {
        int length = str.length();
        if (length >= 2) {
            for (int i = 0; i < length; i++) {
                char charAt = str.charAt(i);
                if ((charAt < 'a' || charAt > 'z') && ((charAt < 'A' || charAt > 'Z') && ((charAt != '/' || i == 0) && ((charAt < '0' || charAt > '9' || i == 0) && ((charAt != '~' || i == 0) && ((charAt != '.' || i == 0) && ((charAt != '_' || i == 0) && ((charAt != '+' || i == 0) && (charAt != '-' || i == 0))))))))) {
                    throw new c("Invalid ID for region-based ZoneId, invalid format: " + str);
                }
            }
            c cVar = null;
            try {
                cVar = e.b(str, true);
            } catch (d e) {
                if (z) {
                    throw e;
                }
            }
            return new l(str, cVar);
        }
        throw new c("Invalid ID for region-based ZoneId, invalid format: " + str);
    }

    public c p() {
        c cVar = this.c;
        return cVar != null ? cVar : e.b(this.b, false);
    }

    public String t() {
        return this.b;
    }
}
