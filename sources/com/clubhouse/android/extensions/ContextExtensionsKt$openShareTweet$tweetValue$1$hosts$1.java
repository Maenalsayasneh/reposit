package com.clubhouse.android.extensions;

import com.clubhouse.android.data.models.local.user.UserInList;
import kotlin.jvm.internal.Lambda;
import m0.n.a.l;
import m0.n.b.i;

/* compiled from: ContextExtensions.kt */
public final class ContextExtensionsKt$openShareTweet$tweetValue$1$hosts$1 extends Lambda implements l<UserInList, CharSequence> {
    public static final ContextExtensionsKt$openShareTweet$tweetValue$1$hosts$1 c = new ContextExtensionsKt$openShareTweet$tweetValue$1$hosts$1();

    public ContextExtensionsKt$openShareTweet$tweetValue$1$hosts$1() {
        super(1);
    }

    public Object invoke(Object obj) {
        UserInList userInList = (UserInList) obj;
        i.e(userInList, "host");
        String str = userInList.q;
        if (str == null || str.length() == 0) {
            String str2 = userInList.y;
            if (str2 == null) {
                return "";
            }
            return str2;
        }
        String str3 = userInList.q;
        i.c(str3);
        String lowerCase = str3.toLowerCase();
        i.d(lowerCase, "(this as java.lang.String).toLowerCase()");
        return i.k("@", lowerCase);
    }
}
