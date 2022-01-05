package i0.j.b.s;

import com.instabug.bug.h.a$a;
import com.instabug.bug.settings.AttachmentsTypesParams;
import com.instabug.library.OnSdkDismissCallback;
import java.util.List;

/* compiled from: BugSettings */
public class a {
    public static a a;

    public static a h() {
        if (a == null) {
            a = new a();
        }
        return a;
    }

    public AttachmentsTypesParams a() {
        return b.a().b;
    }

    public void b(String str, boolean z) {
        b.a().l.b.put(str, Boolean.valueOf(z));
    }

    public String c() {
        return b.a().d;
    }

    public a$a d() {
        a$a a_a = b.a().f;
        return a_a == null ? a$a.DISABLED : a_a;
    }

    public List<i0.j.b.p.a> e() {
        return b.a().e;
    }

    public OnSdkDismissCallback f() {
        return b.a().h;
    }

    public boolean g() {
        return b.a().i;
    }
}
