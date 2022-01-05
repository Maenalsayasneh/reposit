package i0.j.c.n.e;

import android.content.Intent;
import android.net.Uri;
import com.instabug.chat.e.a;
import com.instabug.chat.e.c;
import com.instabug.chat.e.d;
import com.instabug.library.core.ui.BaseContract;
import java.util.List;

/* compiled from: ChatContract */
public interface b extends BaseContract.Presenter {
    d C(String str, a aVar);

    a G(Uri uri, String str);

    void I(a aVar);

    void J(Intent intent);

    void K(int i, int i2, Intent intent);

    void L(d dVar);

    void a();

    List<c> c(List<d> list);

    void c();

    com.instabug.chat.e.b d();

    void g();

    void i(String str);

    void n();

    void o();

    d v(String str, String str2);
}
