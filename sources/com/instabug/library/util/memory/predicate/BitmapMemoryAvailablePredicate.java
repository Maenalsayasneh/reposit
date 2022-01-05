package com.instabug.library.util.memory.predicate;

import android.graphics.Bitmap;
import java.util.Arrays;

public class BitmapMemoryAvailablePredicate extends MemoryAvailablePredicate {
    public final Bitmap.Config b;
    public final int[] c;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(12:0|1|2|3|4|5|6|7|8|9|10|12) */
        /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                android.graphics.Bitmap$Config[] r0 = android.graphics.Bitmap.Config.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                a = r0
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ALPHA_8     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGB_565     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_4444     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.ARGB_8888     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                android.graphics.Bitmap$Config r1 = android.graphics.Bitmap.Config.RGBA_F16     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.util.memory.predicate.BitmapMemoryAvailablePredicate.a.<clinit>():void");
        }
    }

    public BitmapMemoryAvailablePredicate(Bitmap.Config config, int[] iArr) {
        this.b = config;
        this.c = Arrays.copyOf(iArr, 2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0021, code lost:
        if (r0 != 4) goto L_0x0025;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean check() {
        /*
            r5 = this;
            int[] r0 = r5.c
            r1 = 0
            r1 = r0[r1]
            r2 = 1
            r0 = r0[r2]
            int r1 = r1 * r0
            android.graphics.Bitmap$Config r0 = r5.b
            r3 = 8
            if (r0 != 0) goto L_0x0010
            goto L_0x0025
        L_0x0010:
            int[] r4 = com.instabug.library.util.memory.predicate.BitmapMemoryAvailablePredicate.a.a
            int r0 = r0.ordinal()
            r0 = r4[r0]
            if (r0 == r2) goto L_0x0024
            r2 = 2
            if (r0 == r2) goto L_0x0024
            r4 = 3
            if (r0 == r4) goto L_0x0024
            r2 = 4
            if (r0 == r2) goto L_0x0024
            goto L_0x0025
        L_0x0024:
            r3 = r2
        L_0x0025:
            int r1 = r1 * r3
            long r0 = (long) r1
            boolean r0 = r5.isMemoryAvailable(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.util.memory.predicate.BitmapMemoryAvailablePredicate.check():boolean");
    }
}
