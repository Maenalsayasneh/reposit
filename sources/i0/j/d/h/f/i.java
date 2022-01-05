package i0.j.d.h.f;

import androidx.fragment.app.Fragment;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.d.b;
import com.instabug.library.Instabug;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.ui.BaseContract;
import com.instabug.library.core.ui.BasePresenter;
import com.instabug.library.network.Request;
import com.instabug.library.user.UserManagerWrapper;
import com.instabug.library.util.InstabugSDKLogger;
import org.json.JSONException;

/* compiled from: AddNewFeaturePresenter */
public class i extends BasePresenter<a> implements BaseContract.Presenter {
    public final a c;

    /* compiled from: AddNewFeaturePresenter */
    public class a implements Request.Callbacks<Boolean, Throwable> {
        public final /* synthetic */ b a;

        public a(b bVar) {
            this.a = bVar;
        }

        public void onFailed(Object obj) {
            StringBuilder P0 = i0.d.a.a.a.P0("Something went wrong while sending featureRequest: ");
            P0.append(this.a);
            InstabugSDKLogger.e("AddNewFeaturePresenter", P0.toString(), (Throwable) obj);
            a aVar = i.this.c;
            if (aVar != null) {
                aVar.x();
                a aVar2 = i.this.c;
                aVar2.q(((Fragment) aVar2.getViewContext()).getString(R.string.feature_request_str_add_comment_error));
            }
        }

        public void onSucceeded(Object obj) {
            Boolean bool = (Boolean) obj;
            StringBuilder P0 = i0.d.a.a.a.P0("featureRequest ");
            P0.append(this.a);
            P0.append(" synced successfully");
            InstabugSDKLogger.d("AddNewFeaturePresenter", P0.toString());
            a aVar = i.this.c;
            if (aVar != null) {
                aVar.x();
                i.this.c.f0();
            }
        }
    }

    public i(a aVar) {
        super(aVar);
        a aVar2 = (a) this.view.get();
        this.c = aVar2;
        if (aVar2 != null) {
            aVar2.f(InstabugCore.getEnteredEmail());
            aVar2.i(InstabugCore.getEnteredUsername());
        }
    }

    public final void g() {
        a aVar = this.c;
        if (aVar != null) {
            InstabugCore.setEnteredEmail(aVar.M());
            InstabugCore.setEnteredUsername(this.c.s());
            this.c.u();
            b bVar = new b(UserManagerWrapper.getUserName(), UserManagerWrapper.getUserEmail(), InstabugCore.getPushNotificationToken());
            bVar.d = this.c.c() != null ? this.c.c() : "";
            bVar.q = this.c.w();
            try {
                if (Instabug.getApplicationContext() != null) {
                    if (i0.j.d.g.a.a.a == null) {
                        synchronized (i0.j.d.g.a.a.class) {
                            if (i0.j.d.g.a.a.a == null) {
                                i0.j.d.g.a.a.a = new i0.j.d.g.a.a();
                            }
                        }
                    }
                    i0.j.d.g.a.a.a.a(Instabug.getApplicationContext(), bVar, new a(bVar));
                }
            } catch (JSONException e) {
                InstabugSDKLogger.e("AddNewFeaturePresenter", "JsonException while sending featureRequest: " + bVar, e);
                this.c.q("Something went wrong");
            }
        }
    }
}
