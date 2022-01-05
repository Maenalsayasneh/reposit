package v0.a;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: Timber */
public final class a {
    public static final b[] a;
    public static final List<b> b = new ArrayList();
    public static volatile b[] c;
    public static final b d = new C0309a();

    /* compiled from: Timber */
    public static abstract class b {
        public final ThreadLocal<String> explicitTag = new ThreadLocal<>();

        private String getStackTraceString(Throwable th) {
            StringWriter stringWriter = new StringWriter(256);
            PrintWriter printWriter = new PrintWriter(stringWriter, false);
            th.printStackTrace(printWriter);
            printWriter.flush();
            return stringWriter.toString();
        }

        private void prepareLog(int i, Throwable th, String str, Object... objArr) {
            String tag = getTag();
            if (isLoggable(tag, i)) {
                if (str != null && str.length() == 0) {
                    str = null;
                }
                if (str != null) {
                    if (objArr != null && objArr.length > 0) {
                        str = formatMessage(str, objArr);
                    }
                    if (th != null) {
                        StringBuilder S0 = i0.d.a.a.a.S0(str, "\n");
                        S0.append(getStackTraceString(th));
                        str = S0.toString();
                    }
                } else if (th != null) {
                    str = getStackTraceString(th);
                } else {
                    return;
                }
                log(i, tag, str, th);
            }
        }

        public void d(String str, Object... objArr) {
            prepareLog(3, (Throwable) null, str, objArr);
        }

        public void e(String str, Object... objArr) {
            prepareLog(6, (Throwable) null, str, objArr);
        }

        public String formatMessage(String str, Object[] objArr) {
            return String.format(str, objArr);
        }

        public String getTag() {
            String str = this.explicitTag.get();
            if (str != null) {
                this.explicitTag.remove();
            }
            return str;
        }

        public void i(String str, Object... objArr) {
            prepareLog(4, (Throwable) null, str, objArr);
        }

        @Deprecated
        public boolean isLoggable(int i) {
            return true;
        }

        public boolean isLoggable(String str, int i) {
            return isLoggable(i);
        }

        public abstract void log(int i, String str, String str2, Throwable th);

        public void log(int i, String str, Object... objArr) {
            prepareLog(i, (Throwable) null, str, objArr);
        }

        public void v(String str, Object... objArr) {
            prepareLog(2, (Throwable) null, str, objArr);
        }

        public void w(String str, Object... objArr) {
            prepareLog(5, (Throwable) null, str, objArr);
        }

        public void wtf(String str, Object... objArr) {
            prepareLog(7, (Throwable) null, str, objArr);
        }

        public void d(Throwable th, String str, Object... objArr) {
            prepareLog(3, th, str, objArr);
        }

        public void e(Throwable th, String str, Object... objArr) {
            prepareLog(6, th, str, objArr);
        }

        public void i(Throwable th, String str, Object... objArr) {
            prepareLog(4, th, str, objArr);
        }

        public void log(int i, Throwable th, String str, Object... objArr) {
            prepareLog(i, th, str, objArr);
        }

        public void v(Throwable th, String str, Object... objArr) {
            prepareLog(2, th, str, objArr);
        }

        public void w(Throwable th, String str, Object... objArr) {
            prepareLog(5, th, str, objArr);
        }

        public void wtf(Throwable th, String str, Object... objArr) {
            prepareLog(7, th, str, objArr);
        }

        public void d(Throwable th) {
            prepareLog(3, th, (String) null, new Object[0]);
        }

        public void e(Throwable th) {
            prepareLog(6, th, (String) null, new Object[0]);
        }

        public void i(Throwable th) {
            prepareLog(4, th, (String) null, new Object[0]);
        }

        public void log(int i, Throwable th) {
            prepareLog(i, th, (String) null, new Object[0]);
        }

        public void v(Throwable th) {
            prepareLog(2, th, (String) null, new Object[0]);
        }

        public void w(Throwable th) {
            prepareLog(5, th, (String) null, new Object[0]);
        }

        public void wtf(Throwable th) {
            prepareLog(7, th, (String) null, new Object[0]);
        }
    }

    static {
        b[] bVarArr = new b[0];
        a = bVarArr;
        c = bVarArr;
    }

    /* renamed from: v0.a.a$a  reason: collision with other inner class name */
    /* compiled from: Timber */
    public static class C0309a extends b {
        public void d(String str, Object... objArr) {
            for (b d : a.c) {
                d.d(str, objArr);
            }
        }

        public void e(String str, Object... objArr) {
            for (b e : a.c) {
                e.e(str, objArr);
            }
        }

        public void i(String str, Object... objArr) {
            for (b i : a.c) {
                i.i(str, objArr);
            }
        }

        public void log(int i, String str, Object... objArr) {
            for (b log : a.c) {
                log.log(i, str, objArr);
            }
        }

        public void v(String str, Object... objArr) {
            for (b v : a.c) {
                v.v(str, objArr);
            }
        }

        public void w(String str, Object... objArr) {
            for (b w : a.c) {
                w.w(str, objArr);
            }
        }

        public void wtf(String str, Object... objArr) {
            for (b wtf : a.c) {
                wtf.wtf(str, objArr);
            }
        }

        public void d(Throwable th, String str, Object... objArr) {
            for (b d : a.c) {
                d.d(th, str, objArr);
            }
        }

        public void e(Throwable th, String str, Object... objArr) {
            for (b e : a.c) {
                e.e(th, str, objArr);
            }
        }

        public void i(Throwable th, String str, Object... objArr) {
            for (b i : a.c) {
                i.i(th, str, objArr);
            }
        }

        public void log(int i, Throwable th, String str, Object... objArr) {
            for (b log : a.c) {
                log.log(i, th, str, objArr);
            }
        }

        public void v(Throwable th, String str, Object... objArr) {
            for (b v : a.c) {
                v.v(th, str, objArr);
            }
        }

        public void w(Throwable th, String str, Object... objArr) {
            for (b w : a.c) {
                w.w(th, str, objArr);
            }
        }

        public void wtf(Throwable th, String str, Object... objArr) {
            for (b wtf : a.c) {
                wtf.wtf(th, str, objArr);
            }
        }

        public void d(Throwable th) {
            for (b d : a.c) {
                d.d(th);
            }
        }

        public void e(Throwable th) {
            for (b e : a.c) {
                e.e(th);
            }
        }

        public void i(Throwable th) {
            for (b i : a.c) {
                i.i(th);
            }
        }

        public void log(int i, Throwable th) {
            for (b log : a.c) {
                log.log(i, th);
            }
        }

        public void v(Throwable th) {
            for (b v : a.c) {
                v.v(th);
            }
        }

        public void w(Throwable th) {
            for (b w : a.c) {
                w.w(th);
            }
        }

        public void wtf(Throwable th) {
            for (b wtf : a.c) {
                wtf.wtf(th);
            }
        }

        public void log(int i, String str, String str2, Throwable th) {
            throw new AssertionError("Missing override for log method.");
        }
    }
}
