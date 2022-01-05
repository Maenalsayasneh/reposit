package i0.j.e.m0.d;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.net.Uri;
import android.os.Handler;
import android.provider.MediaStore;
import com.instabug.library.Instabug;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import i0.j.e.m0.a;
import i0.j.e.m0.c;
import java.io.File;

/* compiled from: ScreenshotObserver */
public class j extends ContentObserver {
    public final String[] a = {InstabugDbContract.FeatureRequestEntry.COLUMN_ID, "_display_name", "_data"};
    public final String b = MediaStore.Images.Media.EXTERNAL_CONTENT_URI.toString();
    public final a c;
    public ContentResolver d;

    public j(Handler handler, ContentResolver contentResolver, a aVar) {
        super(handler);
        this.d = contentResolver;
        this.c = aVar;
    }

    public void onChange(boolean z, Uri uri) {
        super.onChange(z, uri);
        if (uri != null) {
            String uri2 = uri.toString();
            if (uri2.matches(this.b + "/[0-9]+")) {
                Cursor cursor = null;
                try {
                    cursor = this.d.query(uri, this.a, (String) null, (String[]) null, (String) null);
                    if (cursor != null && cursor.moveToFirst()) {
                        String string = cursor.getString(cursor.getColumnIndex("_display_name"));
                        String string2 = cursor.getString(cursor.getColumnIndex("_data"));
                        if (string2.toLowerCase().contains("screenshots/") && string.toLowerCase().startsWith("screenshot")) {
                            Context applicationContext = Instabug.getApplicationContext();
                            ((c) this.c).c(AttachmentsUtility.getNewFileAttachmentUri(applicationContext, Uri.fromFile(new File(string2 + "/" + string))));
                        }
                    }
                } finally {
                    if (cursor != null) {
                        cursor.close();
                    }
                }
            }
        }
    }
}
