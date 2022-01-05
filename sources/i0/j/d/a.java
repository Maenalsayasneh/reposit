package i0.j.d;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.ui.FeaturesRequestActivity;
import com.instabug.library.Feature;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.invocation.invocationdialog.InstabugDialogActivity;
import com.instabug.library.invocation.invocationdialog.InstabugDialogItem;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.PlaceHolderUtils;
import io.reactivex.disposables.CompositeDisposable;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: FeaturesRequestPluginWrapper */
public class a {
    public static final CompositeDisposable a = new CompositeDisposable();

    /* renamed from: i0.j.d.a$a  reason: collision with other inner class name */
    /* compiled from: FeaturesRequestPluginWrapper */
    public static class C0171a implements PluginPromptOption.OnInvocationListener {
        public final /* synthetic */ Context a;

        public C0171a(Context context) {
            this.a = context;
        }

        public void onInvoke(Uri uri, String... strArr) {
            this.a.startActivity(InstabugDialogActivity.getIntent(this.a, (String) null, (Uri) null, (ArrayList<InstabugDialogItem>) null, true));
            Intent intent = new Intent(this.a, FeaturesRequestActivity.class);
            intent.addFlags(268435456);
            this.a.startActivity(intent);
        }
    }

    public static ArrayList<PluginPromptOption> a(Context context) {
        boolean z = true;
        ArrayList<PluginPromptOption> arrayList = new ArrayList<>(1);
        Objects.requireNonNull(i0.j.d.e.a.d());
        Feature feature = Feature.FEATURE_REQUESTS;
        boolean isFeatureAvailable = InstabugCore.isFeatureAvailable(feature);
        boolean isExperimentalFeatureAvailable = InstabugCore.isExperimentalFeatureAvailable(feature);
        boolean isFeatureEnabled = InstabugCore.isFeatureEnabled(feature);
        if (!isFeatureAvailable || !isExperimentalFeatureAvailable || !isFeatureEnabled) {
            z = false;
        }
        if (z) {
            PluginPromptOption pluginPromptOption = new PluginPromptOption();
            pluginPromptOption.setInvocationMode(5);
            pluginPromptOption.setPromptOptionIdentifier(5);
            pluginPromptOption.setOrder(3);
            pluginPromptOption.setIcon(R.drawable.ibg_core_ic_request_feature);
            pluginPromptOption.setTitle(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.REQUEST_FEATURE, LocaleUtils.getLocaleStringResource(Instabug.getLocale(context), com.instabug.library.R.string.instabug_str_request_feature, context)));
            pluginPromptOption.setDescription(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.REQUEST_FEATURE_DESCRIPTION, LocaleUtils.getLocaleStringResource(Instabug.getLocale(context), com.instabug.library.R.string.ib_fr_request_feature_description, context)));
            pluginPromptOption.setOnInvocationListener(new C0171a(context));
            arrayList.add(pluginPromptOption);
        }
        return arrayList;
    }
}
