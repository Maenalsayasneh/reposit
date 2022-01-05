package i0.j.c.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.instabug.chat.ui.ChatActivity;
import com.instabug.library.screenshot.ExtraScreenshotHelper;
import com.instabug.library.util.InstabugSDKLogger;
import com.pubnub.api.builder.PubNubErrorBuilder;
import java.lang.ref.WeakReference;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: ScreenshotHelper */
public class a implements ExtraScreenshotHelper.OnCaptureListener {
    public static a a;
    public WeakReference<Context> b;
    public ExtraScreenshotHelper c = new ExtraScreenshotHelper();
    public String d;

    public final void a(Context context, String str, com.instabug.chat.e.a aVar) {
        Intent intent = new Intent(context, ChatActivity.class);
        intent.putExtra("chat_process", PubNubErrorBuilder.PNERR_PUSH_TOPIC_MISSING);
        intent.putExtra("chat_number", str);
        intent.putExtra("attachment", aVar);
        intent.addFlags(65536);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }

    public void onExtraScreenshotCaptured(Uri uri) {
        Context context;
        InstabugSDKLogger.v(a.class, "Uri: " + uri);
        this.c.release();
        WeakReference<Context> weakReference = this.b;
        if (weakReference != null && (context = (Context) weakReference.get()) != null) {
            String str = this.d;
            com.instabug.chat.e.a aVar = new com.instabug.chat.e.a();
            aVar.y = "offline";
            aVar.x = "extra_image";
            aVar.d = uri.getPath();
            aVar.c = uri.getLastPathSegment();
            a(context, str, aVar);
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void onExtraScreenshotError(Throwable th) {
        Context context;
        WeakReference<Context> weakReference = this.b;
        if (weakReference != null && (context = (Context) weakReference.get()) != null) {
            a(context, this.d, (com.instabug.chat.e.a) null);
        }
    }
}
