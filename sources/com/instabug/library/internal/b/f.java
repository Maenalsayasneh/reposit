package com.instabug.library.internal.b;

import com.instabug.library.util.TimeUtils;

@Deprecated
/* compiled from: RetentionContract */
public enum f {
    USER_DATA {
        private static final int PERIOD_IN_MONTHS = 6;

        public long a() {
            return 100;
        }

        public long b() {
            return TimeUtils.monthToMillis(6);
        }
    };
    
    public static final long VALUE_UNDEFINED = -1;

    public long a() {
        return -1;
    }

    public long b() {
        return -1;
    }
}
