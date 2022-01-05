package com.instabug.library.internal.utils;

import android.util.Log;
import com.instabug.library.InstabugCustomTextPlaceHolder;

/* compiled from: PlaceHolderDeprecationLogger */
public enum a {
    CUSTOM_SURVEY_THANK_YOU {
        public String a(InstabugCustomTextPlaceHolder.Key key, InstabugCustomTextPlaceHolder.Key... keyArr) {
            StringBuilder P0 = i0.d.a.a.a.P0("Warning: This key ");
            P0.append(key.name());
            P0.append(keyArr.length > 0 ? " and " : " ");
            return i0.d.a.a.a.y0(P0, a(keyArr), "will be deprecated with the next release. You will be able to edit this message from the dashboard from this point on.");
        }
    },
    CUSTOM_DEPRECATION_MESSAGE {
        public String a(InstabugCustomTextPlaceHolder.Key key, InstabugCustomTextPlaceHolder.Key... keyArr) {
            StringBuilder sb = new StringBuilder();
            sb.append("This key ");
            sb.append(key);
            sb.append(" has been deprecated, you can use ");
            return i0.d.a.a.a.y0(sb, a(keyArr), " instead");
        }
    };

    /* compiled from: PlaceHolderDeprecationLogger */
    public static /* synthetic */ class c {
        public static final /* synthetic */ int[] a = null;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                com.instabug.library.InstabugCustomTextPlaceHolder.Key.values()
                r0 = 65
                int[] r0 = new int[r0]
                a = r0
                com.instabug.library.InstabugCustomTextPlaceHolder$Key r1 = com.instabug.library.InstabugCustomTextPlaceHolder.Key.SURVEYS_CUSTOM_THANKS_TITLE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.instabug.library.InstabugCustomTextPlaceHolder$Key r1 = com.instabug.library.InstabugCustomTextPlaceHolder.Key.SURVEYS_CUSTOM_THANKS_SUBTITLE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.instabug.library.InstabugCustomTextPlaceHolder$Key r1 = com.instabug.library.InstabugCustomTextPlaceHolder.Key.START_CHATS     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.library.internal.utils.a.c.<clinit>():void");
        }
    }

    public static void a(InstabugCustomTextPlaceHolder.Key key) {
        int i = c.a[key.ordinal()];
        if (i == 1) {
            CUSTOM_SURVEY_THANK_YOU.b(key, InstabugCustomTextPlaceHolder.Key.SURVEYS_CUSTOM_THANKS_SUBTITLE);
        } else if (i == 2) {
            CUSTOM_SURVEY_THANK_YOU.b(key, InstabugCustomTextPlaceHolder.Key.SURVEYS_CUSTOM_THANKS_TITLE);
        } else if (i == 3) {
            CUSTOM_DEPRECATION_MESSAGE.b(key, InstabugCustomTextPlaceHolder.Key.REPORT_QUESTION);
        }
    }

    public abstract String a(InstabugCustomTextPlaceHolder.Key key, InstabugCustomTextPlaceHolder.Key... keyArr);

    public void b(InstabugCustomTextPlaceHolder.Key key, InstabugCustomTextPlaceHolder.Key... keyArr) {
        Log.w("INSTABUG", a(key, keyArr));
    }

    public String a(InstabugCustomTextPlaceHolder.Key... keyArr) {
        StringBuilder sb = new StringBuilder();
        if (keyArr.length > 0) {
            for (InstabugCustomTextPlaceHolder.Key append : keyArr) {
                sb.append("<");
                sb.append(append);
                sb.append("> ");
            }
        }
        return sb.toString();
    }
}
