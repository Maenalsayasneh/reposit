package i0.j.b.l;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instabug.bug.Constants$MainReportCategory;
import com.instabug.bug.R;
import com.instabug.bug.model.ReportCategory;
import com.instabug.bug.view.reporting.ReportingContainerActivity;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.invocation.invocationdialog.InstabugDialogActivity;
import com.instabug.library.invocation.invocationdialog.InstabugDialogItem;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.pubnub.api.builder.PubNubErrorBuilder;
import i0.j.b.f;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: BugReportingPromptItem */
public class c extends b {

    /* compiled from: BugReportingPromptItem */
    public class a implements PluginPromptOption.OnInvocationListener {
        public final /* synthetic */ Context a;

        public a(Context context) {
            this.a = context;
        }

        public void onInvoke(Uri uri, String... strArr) {
            c cVar = c.this;
            Context context = this.a;
            Objects.requireNonNull(cVar);
            b.d();
            InstabugSDKLogger.d("BugReportingPromptItem", "Handle invocation request new bug");
            b.e(uri);
            if (f.g().b != null) {
                f.g().b.d2 = new ArrayList<>();
                f.g().b.d2.add(Constants$MainReportCategory.REPORT_BUG);
                for (String add : strArr) {
                    f.g().b.d2.add(add);
                }
            }
            b.f();
            context.startActivity(InstabugDialogActivity.getIntent(context, (String) null, (Uri) null, (ArrayList<InstabugDialogItem>) null, true));
            Intent intent = new Intent(context, ReportingContainerActivity.class);
            intent.putExtra("com.instabug.library.process", PubNubErrorBuilder.PNERR_MESSAGE_ACTION_TIMETOKEN_MISSING);
            intent.setFlags(268435456);
            intent.addFlags(65536);
            context.startActivity(intent);
        }
    }

    public PluginPromptOption a(ReportCategory reportCategory, PluginPromptOption pluginPromptOption, String str, int i) {
        PluginPromptOption a2 = super.a(reportCategory, pluginPromptOption, str, i);
        a2.setInvocationMode(1);
        a2.setPromptOptionIdentifier(0);
        return a2;
    }

    public PluginPromptOption g(Context context) {
        PluginPromptOption pluginPromptOption = new PluginPromptOption();
        pluginPromptOption.setOrder(0);
        pluginPromptOption.setInvocationMode(1);
        pluginPromptOption.setIcon(R.drawable.ibg_core_ic_report_bug);
        pluginPromptOption.setPromptOptionIdentifier(0);
        pluginPromptOption.setTitle(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.REPORT_BUG, LocaleUtils.getLocaleStringResource(Instabug.getLocale(context), R.string.IBGPromptOptionsReportBug, context)));
        pluginPromptOption.setDescription(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.REPORT_BUG_DESCRIPTION, LocaleUtils.getLocaleStringResource(Instabug.getLocale(context), R.string.ib_bug_report_bug_description, context)));
        pluginPromptOption.setOnInvocationListener(new a(context));
        pluginPromptOption.setInitialScreenshotRequired(true);
        pluginPromptOption.setSubOptions(b("bug"));
        return pluginPromptOption;
    }
}
