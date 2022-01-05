package com.instabug.library.internal.b.i;

import i0.j.e.t0.d;
import java.util.concurrent.TimeUnit;

/* compiled from: Contract */
public enum a {
    LOGS {
        public long a() {
            int i;
            d a = i0.j.e.l0.c.b.c().a();
            if (a == null) {
                i = 7;
            } else {
                i = a.q;
            }
            return TimeUnit.DAYS.toMillis((long) i);
        }

        public long b() {
            int i;
            d a = i0.j.e.l0.c.b.c().a();
            if (a == null) {
                i = 20000;
            } else {
                i = a.x;
            }
            return (long) (i * 1000);
        }

        public boolean c() {
            d a = i0.j.e.l0.c.b.c().a();
            return a != null && a.d == 0;
        }
    },
    DISABLED_LOGS {
        public long a() {
            return 0;
        }

        public long b() {
            return 0;
        }

        public boolean c() {
            return true;
        }
    };
    
    public static final long VALUE_UNDEFINED = -1;

    public long a() {
        return -1;
    }

    public long b() {
        return -1;
    }

    public boolean c() {
        return false;
    }
}
