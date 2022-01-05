package q0.h0.l.i;

import android.util.Log;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import kotlin.text.StringsKt__IndentKt;
import m0.n.b.i;
import m0.r.t.a.r.m.a1.a;

/* compiled from: AndroidLog.kt */
public final class d extends Handler {
    public static final d a = new d();

    public void close() {
    }

    public void flush() {
    }

    public void publish(LogRecord logRecord) {
        int i;
        int min;
        i.e(logRecord, "record");
        c cVar = c.c;
        String loggerName = logRecord.getLoggerName();
        i.d(loggerName, "record.loggerName");
        if (logRecord.getLevel().intValue() > Level.INFO.intValue()) {
            i = 5;
        } else {
            i = logRecord.getLevel().intValue() == Level.INFO.intValue() ? 4 : 3;
        }
        String message = logRecord.getMessage();
        i.d(message, "record.message");
        Throwable thrown = logRecord.getThrown();
        i.e(loggerName, "loggerName");
        i.e(message, InstabugDbContract.BugEntry.COLUMN_MESSAGE);
        String str = c.b.get(loggerName);
        if (str == null) {
            str = a.S3(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (thrown != null) {
                StringBuilder S0 = i0.d.a.a.a.S0(message, "\n");
                S0.append(Log.getStackTraceString(thrown));
                message = S0.toString();
            }
            int length = message.length();
            int i2 = 0;
            while (i2 < length) {
                int l = StringsKt__IndentKt.l(message, 10, i2, false, 4);
                if (l == -1) {
                    l = length;
                }
                while (true) {
                    min = Math.min(l, i2 + 4000);
                    String substring = message.substring(i2, min);
                    i.d(substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                    Log.println(i, str, substring);
                    if (min >= l) {
                        break;
                    }
                    i2 = min;
                }
                i2 = min + 1;
            }
        }
    }
}
