package s0.a.a;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class t1 {
    public static Long a = 0L;
    public static final Map b = new HashMap();
    public static Locale c;

    static {
        Locale locale;
        if (!"en".equalsIgnoreCase(Locale.getDefault().getLanguage())) {
            Locale[] availableLocales = Locale.getAvailableLocales();
            int i = 0;
            while (true) {
                if (i == availableLocales.length) {
                    break;
                } else if ("en".equalsIgnoreCase(availableLocales[i].getLanguage())) {
                    locale = availableLocales[i];
                    break;
                } else {
                    i++;
                }
            }
        }
        locale = Locale.getDefault();
        c = locale;
    }

    public static Date a(Date date) throws ParseException {
        Locale locale = Locale.getDefault();
        if (locale == null) {
            return date;
        }
        Map map = b;
        synchronized (map) {
            Long l = (Long) map.get(locale);
            if (l == null) {
                long time = new SimpleDateFormat("yyyyMMddHHmmssz").parse("19700101000000GMT+00:00").getTime();
                l = time == 0 ? a : Long.valueOf(time);
                map.put(locale, l);
            }
            if (l == a) {
                return date;
            }
            Date date2 = new Date(date.getTime() - l.longValue());
            return date2;
        }
    }
}
