package i0.j.e.v0.e;

import android.content.Context;
import com.instabug.library.network.NetworkManager;
import com.instabug.library.network.Request;
import com.instabug.library.networkv2.request.Header;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.TaskDebouncer;
import i0.j.e.t0.a;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

/* compiled from: FeaturesService */
public class c {
    public static volatile c a;
    public final TaskDebouncer b = new TaskDebouncer(TimeUnit.SECONDS.toMillis(2));
    public NetworkManager c = new NetworkManager();

    public Request a(Context context, NetworkManager networkManager) throws JSONException {
        String str;
        Request buildRequest = networkManager.buildRequest(context, Request.Endpoint.APP_SETTINGS, Request.RequestMethod.Get);
        a featuresCache = SettingsManager.getInstance().getFeaturesCache();
        if (!(featuresCache == null || (str = featuresCache.q) == null || str == null)) {
            buildRequest.addHeader(new Request.RequestParameter(Header.IF_MATCH, str));
        }
        buildRequest.addHeader(new Request.RequestParameter("IBG-APP-TOKEN", SettingsManager.getInstance().getAppToken()));
        return buildRequest;
    }
}
