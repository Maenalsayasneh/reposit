package i0.j.b.t.k;

import android.app.Activity;
import android.content.Context;
import android.text.Spanned;
import androidx.fragment.app.Fragment;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.model.Attachment;
import java.util.List;

/* compiled from: IBaseReportingView */
public interface l extends BaseContract.View<Fragment> {
    void A(String str);

    void C0();

    void D(Attachment attachment);

    void D0(String str);

    void E0(Spanned spanned);

    void F();

    void G0();

    void K();

    void L(boolean z);

    void R(String str);

    void T(Spanned spanned);

    void Z();

    void a();

    void b();

    void c();

    void c(List<Attachment> list);

    void d();

    Activity getActivity();

    Context getContext();

    void i(String str);

    void i0();

    void m();

    String n();

    void q(String str);

    String s();

    String w();

    String x();
}
