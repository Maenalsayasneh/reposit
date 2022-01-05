package i0.j.c.l;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.net.Uri;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import android.text.SpannableStringBuilder;
import android.text.method.LinkMovementMethod;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.instabug.chat.settings.AttachmentTypesState;
import com.instabug.chat.ui.ChatActivity;
import com.instabug.featuresrequest.R;
import com.instabug.library.Instabug;
import com.instabug.library.core.plugin.Plugin;
import com.instabug.library.core.plugin.PluginPromptOption;
import com.instabug.library.instacapture.screenshot.FieldHelper;
import com.instabug.library.instacapture.screenshot.RootViewInfo;
import com.instabug.library.internal.storage.AttachmentManager;
import com.instabug.library.internal.storage.DiskUtils;
import com.instabug.library.internal.storage.cache.AttachmentsDbHelper;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.internal.storage.operation.DeleteUriDiskOperation;
import com.instabug.library.invocation.InstabugInvocationEvent;
import com.instabug.library.invocation.InvocationManager;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.State;
import com.instabug.library.network.Request;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.StringUtility;
import com.pubnub.api.builder.PubNubErrorBuilder;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import i0.j.d.f.b;
import i0.j.e.b.c.c;
import i0.j.e.l0.k.a.b.b.d;
import i0.j.e.l0.k.a.b.b.e;
import i0.j.e.l0.k.a.b.b.f;
import i0.j.e.l0.k.a.b.b.g;
import i0.j.e.l0.k.a.b.b.h;
import i0.j.e.l0.k.a.b.b.i;
import i0.j.e.l0.k.a.b.b.j;
import i0.j.e.l0.k.a.b.b.k;
import i0.j.e.l0.k.a.b.b.l;
import i0.j.e.l0.k.a.b.b.m;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: ChatSettings */
public class a {
    public static List<c> a;
    public static List<c> b;

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static void A(ListView listView) {
        ListAdapter adapter = listView.getAdapter();
        if (adapter != null) {
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(listView.getWidth(), Integer.MIN_VALUE);
            int i = 0;
            for (int i2 = 0; i2 < adapter.getCount(); i2++) {
                View view = adapter.getView(i2, (View) null, listView);
                view.measure(makeMeasureSpec, View.MeasureSpec.makeMeasureSpec(0, 0));
                i += view.getMeasuredHeight();
            }
            ViewGroup.LayoutParams layoutParams = listView.getLayoutParams();
            layoutParams.height = ((adapter.getCount() - 1) * listView.getDividerHeight()) + i;
            listView.setLayoutParams(layoutParams);
            listView.requestLayout();
        }
    }

    public static void B(TextView textView, String str, String str2, String str3, boolean z, Runnable runnable) {
        TextView textView2 = textView;
        String str4 = str;
        if (textView.getTag() == null) {
            textView.setTag(textView.getText());
        }
        if (str.length() < 170) {
            textView.setText(str);
            return;
        }
        if (z) {
            String str5 = str.substring(0, 170) + "... " + str2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str5);
            spannableStringBuilder.setSpan(new ForegroundColorSpan(Instabug.getPrimaryColor()), str5.length() - str2.length(), str5.length(), 33);
            spannableStringBuilder.setSpan(new b(textView, str, str2, str3, z, runnable), str5.length() - str2.length(), str5.length(), 33);
            textView.setText(spannableStringBuilder);
        } else {
            String str6 = str2;
            String o02 = i0.d.a.a.a.o0(str, " ", str3);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(o02);
            spannableStringBuilder2.setSpan(new ForegroundColorSpan(Instabug.getPrimaryColor()), o02.length() - str3.length(), o02.length(), 33);
            spannableStringBuilder2.setSpan(new i0.j.d.f.c(textView, str, str2, str3, z, runnable), o02.length() - str3.length(), o02.length(), 33);
            textView.setText(spannableStringBuilder2);
        }
        textView.setMovementMethod(LinkMovementMethod.getInstance());
    }

    @SuppressFBWarnings({"RV_RETURN_VALUE_IGNORED_BAD_PRACTICE"})
    public static synchronized void C(com.instabug.crash.c.a aVar) {
        synchronized (a.class) {
            for (Attachment next : aVar.x) {
                if (!(next.getLocalPath() == null || next.getName() == null)) {
                    new File(next.getLocalPath()).delete();
                    if (next.getId() != -1) {
                        AttachmentsDbHelper.delete(next.getId());
                    } else {
                        AttachmentsDbHelper.delete(next.getName(), aVar.c);
                    }
                }
            }
        }
    }

    public static synchronized void D(String str, ContentValues contentValues) {
        synchronized (a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {str};
            openDatabase.beginTransaction();
            try {
                openDatabase.update(InstabugDbContract.CrashEntry.TABLE_NAME, contentValues, "crash_id=? ", strArr);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static String E(String str) {
        return StringUtility.trimString(str, 20);
    }

    public static synchronized void F(String str) {
        synchronized (a.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {str};
            openDatabase.beginTransaction();
            try {
                openDatabase.delete(InstabugDbContract.CrashEntry.TABLE_NAME, "crash_id=? ", strArr);
                openDatabase.setTransactionSuccessful();
            } finally {
                openDatabase.endTransaction();
                openDatabase.close();
            }
        }
    }

    public static int G(String str, String str2) {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        int i = 0;
        String[] strArr = {str, str2};
        Cursor cursor = null;
        try {
            cursor = openDatabase.query(InstabugDbContract.UserEventEntry.TABLE_NAME, new String[]{InstabugDbContract.UserEventEntry.COLUMN_EVENT_LOGGING_COUNT}, "event_identifier = ? AND uuid = ? ", strArr, (String) null, (String) null, (String) null);
            if (cursor != null && cursor.getCount() > 0) {
                cursor.moveToFirst();
                i = cursor.getInt(cursor.getColumnIndex(InstabugDbContract.UserEventEntry.COLUMN_EVENT_LOGGING_COUNT));
            }
            return i;
        } finally {
            if (cursor != null) {
                cursor.close();
            }
            openDatabase.close();
        }
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processLoop(RegionMaker.java:225)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:106)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:598)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public static synchronized long H(com.instabug.crash.c.a r16) {
        /*
            java.lang.Class<i0.j.c.l.a> r1 = i0.j.c.l.a.class
            monitor-enter(r1)
            com.instabug.library.internal.storage.cache.db.DatabaseManager r0 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()     // Catch:{ all -> 0x0100 }
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r0 = r0.openDatabase()     // Catch:{ all -> 0x0100 }
            r11 = -1
            r13 = 0
            java.lang.String r3 = "crashes_table"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r2 = r0
            android.database.Cursor r14 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00df, all -> 0x00dc }
            if (r14 == 0) goto L_0x00c4
            int r2 = r14.getCount()     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            r14.close()     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            r15 = r13
            r13 = r2
        L_0x0027:
            r2 = 100
            if (r13 < r2) goto L_0x00bc
            java.lang.String r3 = "crashes_table"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "crash_id ASC"
            java.lang.String r10 = "1"
            r2 = r0
            android.database.Cursor r15 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            if (r15 == 0) goto L_0x0027
            boolean r2 = r15.moveToFirst()     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            if (r2 == 0) goto L_0x00b2
            com.instabug.crash.c.a$a r2 = com.instabug.crash.c.a.C0101a.NOT_AVAILABLE     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.String r2 = "crash_id"
            int r2 = r15.getColumnIndex(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.String r2 = r15.getString(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.util.ArrayList r3 = com.instabug.library.internal.storage.cache.AttachmentsDbHelper.retrieve(r2, r0)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.util.concurrent.CopyOnWriteArrayList r4 = new java.util.concurrent.CopyOnWriteArrayList     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            r4.<init>(r3)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.String r3 = "state"
            int r3 = r15.getColumnIndex(r3)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.lang.String r3 = r15.getString(r3)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            x(r3)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            monitor-enter(r1)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            java.util.Iterator r3 = r4.iterator()     // Catch:{ all -> 0x00af }
        L_0x006e:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x00af }
            if (r4 == 0) goto L_0x00aa
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x00af }
            com.instabug.library.model.Attachment r4 = (com.instabug.library.model.Attachment) r4     // Catch:{ all -> 0x00af }
            java.lang.String r5 = r4.getLocalPath()     // Catch:{ all -> 0x00af }
            if (r5 == 0) goto L_0x006e
            java.lang.String r5 = r4.getName()     // Catch:{ all -> 0x00af }
            if (r5 == 0) goto L_0x006e
            java.io.File r5 = new java.io.File     // Catch:{ all -> 0x00af }
            java.lang.String r6 = r4.getLocalPath()     // Catch:{ all -> 0x00af }
            r5.<init>(r6)     // Catch:{ all -> 0x00af }
            r5.delete()     // Catch:{ all -> 0x00af }
            long r5 = r4.getId()     // Catch:{ all -> 0x00af }
            int r5 = (r5 > r11 ? 1 : (r5 == r11 ? 0 : -1))
            if (r5 == 0) goto L_0x00a2
            long r4 = r4.getId()     // Catch:{ all -> 0x00af }
            com.instabug.library.internal.storage.cache.AttachmentsDbHelper.delete(r4)     // Catch:{ all -> 0x00af }
            goto L_0x006e
        L_0x00a2:
            java.lang.String r4 = r4.getName()     // Catch:{ all -> 0x00af }
            com.instabug.library.internal.storage.cache.AttachmentsDbHelper.delete(r4, r2)     // Catch:{ all -> 0x00af }
            goto L_0x006e
        L_0x00aa:
            monitor-exit(r1)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            F(r2)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            goto L_0x00b2
        L_0x00af:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
            throw r0     // Catch:{ Exception -> 0x00b9, all -> 0x00b6 }
        L_0x00b2:
            int r13 = r13 + -1
            goto L_0x0027
        L_0x00b6:
            r0 = move-exception
            r13 = r15
            goto L_0x00d6
        L_0x00b9:
            r0 = move-exception
            r13 = r15
            goto L_0x00d9
        L_0x00bc:
            r2 = r16
            r13 = r15
            goto L_0x00c6
        L_0x00c0:
            r0 = move-exception
            goto L_0x00d6
        L_0x00c2:
            r0 = move-exception
            goto L_0x00d9
        L_0x00c4:
            r2 = r16
        L_0x00c6:
            long r2 = c(r2, r0)     // Catch:{ Exception -> 0x00c2, all -> 0x00c0 }
            if (r14 == 0) goto L_0x00cf
            r14.close()     // Catch:{ all -> 0x0100 }
        L_0x00cf:
            if (r13 == 0) goto L_0x00d4
            r13.close()     // Catch:{ all -> 0x0100 }
        L_0x00d4:
            monitor-exit(r1)
            return r2
        L_0x00d6:
            r2 = r13
            r13 = r14
            goto L_0x00f5
        L_0x00d9:
            r2 = r13
            r13 = r14
            goto L_0x00e1
        L_0x00dc:
            r0 = move-exception
            r2 = r13
            goto L_0x00f5
        L_0x00df:
            r0 = move-exception
            r2 = r13
        L_0x00e1:
            java.lang.String r3 = "CrashReportsDbHelper"
            java.lang.String r4 = "trimAndInsert throwed an error: "
            com.instabug.library.util.InstabugSDKLogger.e(r3, r4, r0)     // Catch:{ all -> 0x00f4 }
            if (r13 == 0) goto L_0x00ed
            r13.close()     // Catch:{ all -> 0x0100 }
        L_0x00ed:
            if (r2 == 0) goto L_0x00f2
            r2.close()     // Catch:{ all -> 0x0100 }
        L_0x00f2:
            monitor-exit(r1)
            return r11
        L_0x00f4:
            r0 = move-exception
        L_0x00f5:
            if (r13 == 0) goto L_0x00fa
            r13.close()     // Catch:{ all -> 0x0100 }
        L_0x00fa:
            if (r2 == 0) goto L_0x00ff
            r2.close()     // Catch:{ all -> 0x0100 }
        L_0x00ff:
            throw r0     // Catch:{ all -> 0x0100 }
        L_0x0100:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.c.l.a.H(com.instabug.crash.c.a):long");
    }

    public static void I(TextInputLayout textInputLayout, int i) {
        try {
            Field declaredField = textInputLayout.getClass().getDeclaredField("mFocusedTextColor");
            declaredField.setAccessible(true);
            declaredField.set(textInputLayout, new ColorStateList(new int[][]{new int[0]}, new int[]{i}));
            Class<?> cls = textInputLayout.getClass();
            Method declaredMethod = cls.getDeclaredMethod("updateLabelState", new Class[]{Boolean.TYPE});
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(textInputLayout, new Object[]{Boolean.TRUE});
            if (Instabug.getApplicationContext() != null) {
                int color = h0.i.b.a.getColor(Instabug.getApplicationContext(), R.color.ib_fr_add_comment_error);
                try {
                    Field declaredField2 = TextInputLayout.class.getDeclaredField("mErrorView");
                    declaredField2.setAccessible(true);
                    Field declaredField3 = TextView.class.getDeclaredField("mCurTextColor");
                    declaredField3.setAccessible(true);
                    declaredField3.set((TextView) declaredField2.get(textInputLayout), Integer.valueOf(color));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static ContentValues J(String str, int i, String str2, boolean z) {
        ContentValues contentValues = new ContentValues();
        contentValues.put("event_identifier", str);
        contentValues.put(InstabugDbContract.UserEventEntry.COLUMN_EVENT_LOGGING_COUNT, Integer.valueOf(i));
        contentValues.put("uuid", str2);
        contentValues.put("is_anonymous", Boolean.valueOf(z));
        return contentValues;
    }

    public static boolean K(String str) {
        return str.contains(Request.BASE_URL) || str.contains("https://api-apm.instabug.com/api/sdk/v3");
    }

    public static void L(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = 0;
        switch (i) {
            case 12:
                i0.j.e.l0.k.a.b.b.b[] bVarArr = {new i0.j.e.l0.k.a.b.b.c(), new d(), new e(), new f(), new g(), new h(), new i(), new j(), new k(), new l(), new m()};
                if (bVarArr.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length = bVarArr.length;
                while (i3 < length) {
                    bVarArr[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 14:
                i0.j.e.l0.k.a.b.b.b[] bVarArr2 = {new d(), new e(), new f(), new g(), new h(), new i(), new j(), new k(), new l(), new m()};
                if (bVarArr2.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length2 = bVarArr2.length;
                while (i3 < length2) {
                    bVarArr2[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 15:
                i0.j.e.l0.k.a.b.b.b[] bVarArr3 = {new e(), new f(), new g(), new h(), new i(), new j(), new k(), new l(), new m()};
                if (bVarArr3.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length3 = bVarArr3.length;
                while (i3 < length3) {
                    bVarArr3[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 17:
                i0.j.e.l0.k.a.b.b.b[] bVarArr4 = {new f(), new g(), new h(), new i(), new j(), new k(), new l(), new m()};
                if (bVarArr4.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length4 = bVarArr4.length;
                while (i3 < length4) {
                    bVarArr4[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 18:
                i0.j.e.l0.k.a.b.b.b[] bVarArr5 = {new g(), new h(), new i(), new j(), new k(), new l(), new m()};
                if (bVarArr5.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length5 = bVarArr5.length;
                while (i3 < length5) {
                    bVarArr5[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 19:
                i0.j.e.l0.k.a.b.b.b[] bVarArr6 = {new h(), new i(), new j(), new k(), new l(), new m()};
                if (bVarArr6.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length6 = bVarArr6.length;
                while (i3 < length6) {
                    bVarArr6[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 20:
                i0.j.e.l0.k.a.b.b.b[] bVarArr7 = {new i(), new j(), new k(), new l(), new m()};
                if (bVarArr7.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length7 = bVarArr7.length;
                while (i3 < length7) {
                    bVarArr7[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 21:
                i0.j.e.l0.k.a.b.b.b[] bVarArr8 = {new j(), new k(), new l(), new m()};
                if (bVarArr8.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length8 = bVarArr8.length;
                while (i3 < length8) {
                    bVarArr8[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 22:
                i0.j.e.l0.k.a.b.b.b[] bVarArr9 = {new k(), new l(), new m()};
                if (bVarArr9.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length9 = bVarArr9.length;
                while (i3 < length9) {
                    bVarArr9[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 23:
                i0.j.e.l0.k.a.b.b.b[] bVarArr10 = {new l(), new m()};
                if (bVarArr10.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length10 = bVarArr10.length;
                while (i3 < length10) {
                    bVarArr10[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 24:
                new m().a(sQLiteDatabase);
                return;
            default:
                u(sQLiteDatabase, i, i2);
                return;
        }
    }

    public static void M(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (i == 12) {
            i0.j.e.l0.k.a.b.b.b[] bVarArr = {new i0.j.e.l0.k.a.b.b.c(), new d()};
            if (bVarArr.length == 0) {
                i0.d.a.a.a.g(sQLiteDatabase);
                return;
            }
            for (i0.j.e.l0.k.a.b.b.b a2 : bVarArr) {
                a2.a(sQLiteDatabase);
            }
        } else if (i != 14) {
            u(sQLiteDatabase, i, i2);
        } else {
            sQLiteDatabase.execSQL("ALTER TABLE user_attributes_table ADD COLUMN type INTEGER DEFAULT 0");
        }
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public static long N() {
        return c.a().b.getLong("ibc_ttl", 60);
    }

    public static void O(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = 0;
        if (i == 12) {
            i0.j.e.l0.k.a.b.b.b[] bVarArr = {new i0.j.e.l0.k.a.b.b.c(), new d(), new e()};
            if (bVarArr.length == 0) {
                i0.d.a.a.a.g(sQLiteDatabase);
                return;
            }
            int length = bVarArr.length;
            while (i3 < length) {
                bVarArr[i3].a(sQLiteDatabase);
                i3++;
            }
        } else if (i == 14) {
            i0.j.e.l0.k.a.b.b.b[] bVarArr2 = {new d(), new e()};
            if (bVarArr2.length == 0) {
                i0.d.a.a.a.g(sQLiteDatabase);
                return;
            }
            int length2 = bVarArr2.length;
            while (i3 < length2) {
                bVarArr2[i3].a(sQLiteDatabase);
                i3++;
            }
        } else if (i != 15) {
            u(sQLiteDatabase, i, i2);
        }
    }

    public static void P(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = 0;
        if (i == 12) {
            i0.j.e.l0.k.a.b.b.b[] bVarArr = {new i0.j.e.l0.k.a.b.b.c(), new d(), new e(), new f()};
            if (bVarArr.length == 0) {
                i0.d.a.a.a.g(sQLiteDatabase);
                return;
            }
            int length = bVarArr.length;
            while (i3 < length) {
                bVarArr[i3].a(sQLiteDatabase);
                i3++;
            }
        } else if (i == 17) {
            new f().a(sQLiteDatabase);
        } else if (i == 14) {
            i0.j.e.l0.k.a.b.b.b[] bVarArr2 = {new d(), new e(), new f()};
            if (bVarArr2.length == 0) {
                i0.d.a.a.a.g(sQLiteDatabase);
                return;
            }
            int length2 = bVarArr2.length;
            while (i3 < length2) {
                bVarArr2[i3].a(sQLiteDatabase);
                i3++;
            }
        } else if (i != 15) {
            u(sQLiteDatabase, i, i2);
        } else {
            i0.j.e.l0.k.a.b.b.b[] bVarArr3 = {new e(), new f()};
            if (bVarArr3.length == 0) {
                i0.d.a.a.a.g(sQLiteDatabase);
                return;
            }
            int length3 = bVarArr3.length;
            while (i3 < length3) {
                bVarArr3[i3].a(sQLiteDatabase);
                i3++;
            }
        }
    }

    public static void Q(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = 0;
        switch (i) {
            case 12:
                i0.j.e.l0.k.a.b.b.b[] bVarArr = {new i0.j.e.l0.k.a.b.b.c(), new d(), new e(), new f(), new g()};
                if (bVarArr.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length = bVarArr.length;
                while (i3 < length) {
                    bVarArr[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 14:
                i0.j.e.l0.k.a.b.b.b[] bVarArr2 = {new d(), new e(), new f(), new g()};
                if (bVarArr2.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length2 = bVarArr2.length;
                while (i3 < length2) {
                    bVarArr2[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 15:
                i0.j.e.l0.k.a.b.b.b[] bVarArr3 = {new e(), new f(), new g()};
                if (bVarArr3.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length3 = bVarArr3.length;
                while (i3 < length3) {
                    bVarArr3[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 17:
                i0.j.e.l0.k.a.b.b.b[] bVarArr4 = {new f(), new g()};
                if (bVarArr4.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length4 = bVarArr4.length;
                while (i3 < length4) {
                    bVarArr4[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 18:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS session_table_temp ( session_id TEXT,started_at INTEGER,duration INTEGER,user_events TEXT,user_attributes TEXT,user_events_keys TEXT,user_attributes_keys TEXT,user_email TEXT,uuid TEXT,user_name TEXT,os TEXT,app_token TEXT,device TEXT,sdk_version TEXT,app_version TEXT,crash_reporting_enabled INTEGER,users_page_enabled INTEGER,sync_status INTEGER )");
                sQLiteDatabase.execSQL("INSERT INTO " + "session_table_temp" + " SELECT " + "session_id,started_at,duration,user_events,user_attributes,user_events_keys,user_attributes_keys,user_email,uuid,user_name,os,app_token,device,sdk_version,app_version,crash_reporting_enabled,users_page_enabled,sync_status" + " FROM " + InstabugDbContract.SessionEntry.TABLE_NAME);
                sQLiteDatabase.execSQL(InstabugDbContract.SessionEntry.DROP_TABLE);
                sQLiteDatabase.execSQL("ALTER TABLE session_table_temp RENAME TO session_table");
                return;
            default:
                u(sQLiteDatabase, i, i2);
                return;
        }
    }

    public static void R(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = 0;
        switch (i) {
            case 12:
                i0.j.e.l0.k.a.b.b.b[] bVarArr = {new i0.j.e.l0.k.a.b.b.c(), new d(), new e(), new f(), new g(), new h()};
                if (bVarArr.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length = bVarArr.length;
                while (i3 < length) {
                    bVarArr[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 14:
                i0.j.e.l0.k.a.b.b.b[] bVarArr2 = {new d(), new e(), new f(), new g(), new h()};
                if (bVarArr2.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length2 = bVarArr2.length;
                while (i3 < length2) {
                    bVarArr2[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 15:
                i0.j.e.l0.k.a.b.b.b[] bVarArr3 = {new e(), new f(), new g(), new h()};
                if (bVarArr3.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length3 = bVarArr3.length;
                while (i3 < length3) {
                    bVarArr3[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 17:
                i0.j.e.l0.k.a.b.b.b[] bVarArr4 = {new f(), new g(), new h()};
                if (bVarArr4.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length4 = bVarArr4.length;
                while (i3 < length4) {
                    bVarArr4[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 18:
                i0.j.e.l0.k.a.b.b.b[] bVarArr5 = {new g(), new h()};
                if (bVarArr5.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length5 = bVarArr5.length;
                while (i3 < length5) {
                    bVarArr5[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 19:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS session_table_temp ( session_id TEXT,started_at INTEGER,duration INTEGER,user_events TEXT,user_attributes TEXT,user_events_keys TEXT,user_attributes_keys TEXT,user_email TEXT,uuid TEXT,user_name TEXT,os TEXT,app_token TEXT,device TEXT,sdk_version TEXT,app_version TEXT,crash_reporting_enabled INTEGER,users_page_enabled INTEGER,sync_status INTEGER )");
                sQLiteDatabase.execSQL("INSERT INTO " + "session_table_temp" + " SELECT " + "session_id,started_at,duration,user_events,user_attributes,user_events_keys,user_attributes_keys,user_email,uuid,user_name,os,app_token,device,sdk_version,app_version,crash_reporting_enabled,users_page_enabled,sync_status" + " FROM " + InstabugDbContract.SessionEntry.TABLE_NAME);
                sQLiteDatabase.execSQL(InstabugDbContract.SessionEntry.DROP_TABLE);
                sQLiteDatabase.execSQL("ALTER TABLE session_table_temp RENAME TO session_table");
                return;
            default:
                u(sQLiteDatabase, i, i2);
                return;
        }
    }

    public static void S(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = 0;
        switch (i) {
            case 12:
                i0.j.e.l0.k.a.b.b.b[] bVarArr = {new i0.j.e.l0.k.a.b.b.c(), new d(), new e(), new f(), new g(), new h(), new i()};
                if (bVarArr.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length = bVarArr.length;
                while (i3 < length) {
                    bVarArr[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 14:
                i0.j.e.l0.k.a.b.b.b[] bVarArr2 = {new d(), new e(), new f(), new g(), new h(), new i()};
                if (bVarArr2.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length2 = bVarArr2.length;
                while (i3 < length2) {
                    bVarArr2[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 15:
                i0.j.e.l0.k.a.b.b.b[] bVarArr3 = {new e(), new f(), new g(), new h(), new i()};
                if (bVarArr3.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length3 = bVarArr3.length;
                while (i3 < length3) {
                    bVarArr3[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 17:
                i0.j.e.l0.k.a.b.b.b[] bVarArr4 = {new f(), new g(), new h(), new i()};
                if (bVarArr4.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length4 = bVarArr4.length;
                while (i3 < length4) {
                    bVarArr4[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 18:
                i0.j.e.l0.k.a.b.b.b[] bVarArr5 = {new g(), new h(), new i()};
                if (bVarArr5.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length5 = bVarArr5.length;
                while (i3 < length5) {
                    bVarArr5[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 19:
                i0.j.e.l0.k.a.b.b.b[] bVarArr6 = {new h(), new i()};
                if (bVarArr6.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length6 = bVarArr6.length;
                while (i3 < length6) {
                    bVarArr6[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 20:
                InstabugSDKLogger.d("IBG_MIGRATION", "migration 20_21");
                if (Instabug.getApplicationContext() != null) {
                    if (sQLiteDatabase != null) {
                        InstabugSDKLogger.d("IBG_MIGRATION", "clearBugsAndCrashesTables");
                        sQLiteDatabase.execSQL(InstabugDbContract.CrashEntry.DELETE_ALL);
                        sQLiteDatabase.execSQL(InstabugDbContract.BugEntry.DELETE_ALL);
                    }
                    Context applicationContext = Instabug.getApplicationContext();
                    InstabugSDKLogger.d("IBG_MIGRATION", "clearInstabugAttachmentDirectory started");
                    File attachmentDirectory = AttachmentManager.getAttachmentDirectory(applicationContext);
                    if (attachmentDirectory != null) {
                        AttachmentManager.deleteRecursive(attachmentDirectory);
                        InstabugSDKLogger.d("IBG_MIGRATION", "clearInstabugAttachmentDirectory finished");
                        return;
                    }
                    return;
                }
                return;
            default:
                u(sQLiteDatabase, i, i2);
                return;
        }
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public static boolean T() {
        return c.a().b.getBoolean("ibc_notification_sound", false);
    }

    public static void U(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = 0;
        switch (i) {
            case 12:
                i0.j.e.l0.k.a.b.b.b[] bVarArr = {new i0.j.e.l0.k.a.b.b.c(), new d(), new e(), new f(), new g(), new h(), new i(), new j()};
                if (bVarArr.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length = bVarArr.length;
                while (i3 < length) {
                    bVarArr[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 14:
                i0.j.e.l0.k.a.b.b.b[] bVarArr2 = {new d(), new e(), new f(), new g(), new h(), new i(), new j()};
                if (bVarArr2.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length2 = bVarArr2.length;
                while (i3 < length2) {
                    bVarArr2[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 15:
                i0.j.e.l0.k.a.b.b.b[] bVarArr3 = {new e(), new f(), new g(), new h(), new i(), new j()};
                if (bVarArr3.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length3 = bVarArr3.length;
                while (i3 < length3) {
                    bVarArr3[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 17:
                i0.j.e.l0.k.a.b.b.b[] bVarArr4 = {new f(), new g(), new h(), new i(), new j()};
                if (bVarArr4.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length4 = bVarArr4.length;
                while (i3 < length4) {
                    bVarArr4[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 18:
                i0.j.e.l0.k.a.b.b.b[] bVarArr5 = {new g(), new h(), new i(), new j()};
                if (bVarArr5.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length5 = bVarArr5.length;
                while (i3 < length5) {
                    bVarArr5[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 19:
                i0.j.e.l0.k.a.b.b.b[] bVarArr6 = {new h(), new i(), new j()};
                if (bVarArr6.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length6 = bVarArr6.length;
                while (i3 < length6) {
                    bVarArr6[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 20:
                i0.j.e.l0.k.a.b.b.b[] bVarArr7 = {new i(), new j()};
                if (bVarArr7.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length7 = bVarArr7.length;
                while (i3 < length7) {
                    bVarArr7[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 21:
                sQLiteDatabase.execSQL(InstabugDbContract.AnrEntry.CREATE_TABLE);
                return;
            default:
                u(sQLiteDatabase, i, i2);
                return;
        }
    }

    public static void V(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = 0;
        switch (i) {
            case 12:
                i0.j.e.l0.k.a.b.b.b[] bVarArr = {new i0.j.e.l0.k.a.b.b.c(), new d(), new e(), new f(), new g(), new h(), new i(), new j(), new k()};
                if (bVarArr.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length = bVarArr.length;
                while (i3 < length) {
                    bVarArr[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 14:
                i0.j.e.l0.k.a.b.b.b[] bVarArr2 = {new d(), new e(), new f(), new g(), new h(), new i(), new j(), new k()};
                if (bVarArr2.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length2 = bVarArr2.length;
                while (i3 < length2) {
                    bVarArr2[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 15:
                i0.j.e.l0.k.a.b.b.b[] bVarArr3 = {new e(), new f(), new g(), new h(), new i(), new j(), new k()};
                if (bVarArr3.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length3 = bVarArr3.length;
                while (i3 < length3) {
                    bVarArr3[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 17:
                i0.j.e.l0.k.a.b.b.b[] bVarArr4 = {new f(), new g(), new h(), new i(), new j(), new k()};
                if (bVarArr4.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length4 = bVarArr4.length;
                while (i3 < length4) {
                    bVarArr4[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 18:
                i0.j.e.l0.k.a.b.b.b[] bVarArr5 = {new g(), new h(), new i(), new j(), new k()};
                if (bVarArr5.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length5 = bVarArr5.length;
                while (i3 < length5) {
                    bVarArr5[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 19:
                i0.j.e.l0.k.a.b.b.b[] bVarArr6 = {new h(), new i(), new j(), new k()};
                if (bVarArr6.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length6 = bVarArr6.length;
                while (i3 < length6) {
                    bVarArr6[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 20:
                i0.j.e.l0.k.a.b.b.b[] bVarArr7 = {new i(), new j(), new k()};
                if (bVarArr7.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length7 = bVarArr7.length;
                while (i3 < length7) {
                    bVarArr7[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 21:
                i0.j.e.l0.k.a.b.b.b[] bVarArr8 = {new j(), new k()};
                if (bVarArr8.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length8 = bVarArr8.length;
                while (i3 < length8) {
                    bVarArr8[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 22:
                sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS surveys_table_temp ( survey_id INTEGER PRIMARY KEY,survey_type INTEGER,in_app_rating INTEGER,survey_title TEXT,survey_token TEXT,conditions_operator TEXT,answered INTEGER,dismissed_at INTEGER,shown_at INTEGER,isCancelled INTEGER,attemptCount INTEGER,eventIndex INTEGER,shouldShowAgain INTEGER,paused INTEGER,sessionCounter INTEGER,questions TEXT,thanks_list TEXT,targetAudiences TEXT,customAttributes TEXT,userEvents TEXT,surveyState TEXT,surveyTargeting TEXT,surveyTriggerEvent TEXT,isLocalized BOOLEAN,currentLocale TEXT,supportedLocales TEXT)");
                sQLiteDatabase.execSQL("INSERT INTO " + "surveys_table_temp" + " SELECT " + "survey_id,survey_type,in_app_rating,survey_title,survey_token,conditions_operator,answered,dismissed_at,shown_at,isCancelled,attemptCount,eventIndex,shouldShowAgain,paused,sessionCounter,questions,thanks_list,targetAudiences,customAttributes,userEvents,surveyState,surveyTargeting,surveyTriggerEvent,isLocalized,supportedLocales,currentLocale" + " FROM " + InstabugDbContract.SurveyEntry.TABLE_NAME);
                sQLiteDatabase.execSQL(InstabugDbContract.SurveyEntry.DROP_TABLE);
                sQLiteDatabase.execSQL("ALTER TABLE surveys_table_temp RENAME TO surveys_table");
                return;
            default:
                u(sQLiteDatabase, i, i2);
                return;
        }
    }

    public static void W(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        int i3 = 0;
        switch (i) {
            case 12:
                i0.j.e.l0.k.a.b.b.b[] bVarArr = {new i0.j.e.l0.k.a.b.b.c(), new d(), new e(), new f(), new g(), new h(), new i(), new j(), new k(), new l()};
                if (bVarArr.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length = bVarArr.length;
                while (i3 < length) {
                    bVarArr[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 14:
                i0.j.e.l0.k.a.b.b.b[] bVarArr2 = {new d(), new e(), new f(), new g(), new h(), new i(), new j(), new k(), new l()};
                if (bVarArr2.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length2 = bVarArr2.length;
                while (i3 < length2) {
                    bVarArr2[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 15:
                i0.j.e.l0.k.a.b.b.b[] bVarArr3 = {new e(), new f(), new g(), new h(), new i(), new j(), new k(), new l()};
                if (bVarArr3.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length3 = bVarArr3.length;
                while (i3 < length3) {
                    bVarArr3[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 17:
                i0.j.e.l0.k.a.b.b.b[] bVarArr4 = {new f(), new g(), new h(), new i(), new j(), new k(), new l()};
                if (bVarArr4.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length4 = bVarArr4.length;
                while (i3 < length4) {
                    bVarArr4[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 18:
                i0.j.e.l0.k.a.b.b.b[] bVarArr5 = {new g(), new h(), new i(), new j(), new k(), new l()};
                if (bVarArr5.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length5 = bVarArr5.length;
                while (i3 < length5) {
                    bVarArr5[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 19:
                i0.j.e.l0.k.a.b.b.b[] bVarArr6 = {new h(), new i(), new j(), new k(), new l()};
                if (bVarArr6.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length6 = bVarArr6.length;
                while (i3 < length6) {
                    bVarArr6[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 20:
                i0.j.e.l0.k.a.b.b.b[] bVarArr7 = {new i(), new j(), new k(), new l()};
                if (bVarArr7.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length7 = bVarArr7.length;
                while (i3 < length7) {
                    bVarArr7[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 21:
                i0.j.e.l0.k.a.b.b.b[] bVarArr8 = {new j(), new k(), new l()};
                if (bVarArr8.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length8 = bVarArr8.length;
                while (i3 < length8) {
                    bVarArr8[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 22:
                i0.j.e.l0.k.a.b.b.b[] bVarArr9 = {new k(), new l()};
                if (bVarArr9.length == 0) {
                    i0.d.a.a.a.g(sQLiteDatabase);
                    return;
                }
                int length9 = bVarArr9.length;
                while (i3 < length9) {
                    bVarArr9[i3].a(sQLiteDatabase);
                    i3++;
                }
                return;
            case 23:
                sQLiteDatabase.execSQL(InstabugDbContract.ExperimentsEntry.CREATE_TABLE_QUERY);
                break;
        }
        u(sQLiteDatabase, i, i2);
    }

    public static double a(PointF pointF, PointF pointF2, PointF pointF3) {
        double[] dArr = {(double) pointF.x, (double) pointF.y};
        double[] dArr2 = {(double) pointF2.x, (double) pointF2.y};
        double[] dArr3 = {(double) pointF3.x, (double) pointF3.y};
        double[] dArr4 = {dArr2[0] - dArr[0], dArr2[1] - dArr[1]};
        double[] dArr5 = {dArr3[0] - dArr[0], dArr3[1] - dArr[1]};
        double d = (dArr4[0] * dArr5[1]) - (dArr4[1] * dArr5[0]);
        double d2 = dArr[0] - dArr2[0];
        double d3 = dArr[1] - dArr2[1];
        return Math.abs(d / Math.sqrt((d3 * d3) + (d2 * d2)));
    }

    public static float b(float f, float f2, float f3, float f4) {
        return (float) Math.toDegrees(Math.atan2((double) (f2 - f4), (double) (f - f3)));
    }

    public static synchronized long c(com.instabug.crash.c.a aVar, SQLiteDatabaseWrapper sQLiteDatabaseWrapper) {
        long insert;
        synchronized (a.class) {
            sQLiteDatabaseWrapper.beginTransaction();
            try {
                ContentValues contentValues = new ContentValues();
                contentValues.put(InstabugDbContract.CrashEntry.COLUMN_CRASH_MESSAGE, aVar.q);
                contentValues.put(InstabugDbContract.CrashEntry.COLUMN_CRASH_STATE, aVar.Y1.name());
                contentValues.put(InstabugDbContract.CrashEntry.COLUMN_HANDLED, Boolean.valueOf(aVar.Z1));
                State state = aVar.y;
                if (!(state == null || state.getUri() == null)) {
                    contentValues.put("state", aVar.y.getUri().toString());
                }
                contentValues.put("temporary_server_token", aVar.d);
                contentValues.put(InstabugDbContract.CrashEntry.COLUMN_ID, aVar.c);
                for (Attachment next : aVar.x) {
                    long insert2 = AttachmentsDbHelper.insert(next, aVar.c);
                    if (insert2 != -1) {
                        next.setId(insert2);
                    }
                }
                insert = sQLiteDatabaseWrapper.insert(InstabugDbContract.CrashEntry.TABLE_NAME, (String) null, contentValues);
                sQLiteDatabaseWrapper.setTransactionSuccessful();
                sQLiteDatabaseWrapper.endTransaction();
                sQLiteDatabaseWrapper.close();
            } catch (Exception e) {
                try {
                    InstabugSDKLogger.e("CrashReportsDbHelper", "insertcrash throwed an error: ", e);
                    return -1;
                } finally {
                    sQLiteDatabaseWrapper.endTransaction();
                    sQLiteDatabaseWrapper.close();
                }
            }
        }
        return insert;
    }

    /* JADX INFO: finally extract failed */
    public static long d(String str, int i, String str2, boolean z) {
        SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
        try {
            ContentValues J = J(str, i, str2, z);
            openDatabase.beginTransaction();
            long insertWithOnConflict = openDatabase.insertWithOnConflict(InstabugDbContract.UserEventEntry.TABLE_NAME, (String) null, J);
            openDatabase.setTransactionSuccessful();
            openDatabase.endTransaction();
            openDatabase.close();
            if (insertWithOnConflict < 1) {
                SQLiteDatabaseWrapper openDatabase2 = DatabaseManager.getInstance().openDatabase();
                String[] strArr = {str, str2};
                try {
                    openDatabase2.beginTransaction();
                    insertWithOnConflict = (long) openDatabase2.update(InstabugDbContract.UserEventEntry.TABLE_NAME, J(str, i, str2, z), "event_identifier=? AND uuid=?", strArr);
                    openDatabase2.setTransactionSuccessful();
                } finally {
                    openDatabase2.endTransaction();
                    openDatabase2.close();
                }
            }
            return insertWithOnConflict;
        } catch (Throwable th) {
            openDatabase.endTransaction();
            openDatabase.close();
            throw th;
        }
    }

    public static Intent e(Context context) {
        Intent intent = new Intent(context, ChatActivity.class);
        intent.putExtra("chat_process", 160);
        intent.addFlags(65536);
        intent.addFlags(268435456);
        return intent;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static Intent f(Context context, String str) {
        Intent intent = new Intent(context, ChatActivity.class);
        intent.putExtra("chat_process", PubNubErrorBuilder.PNERR_MESSAGE_TIMETOKEN_MISSING);
        intent.putExtra("chat_number", str);
        intent.addFlags(65536);
        intent.addFlags(268435456);
        return intent;
    }

    public static Bitmap g(Activity activity, Bitmap bitmap) {
        List<RootViewInfo> rootViews;
        if (!(activity == null || (rootViews = FieldHelper.getRootViews(activity, (int[]) null)) == null || rootViews.isEmpty())) {
            try {
                Canvas canvas = new Canvas(bitmap);
                for (RootViewInfo next : rootViews) {
                    if (next.isDialog()) {
                        w(canvas, next);
                    }
                }
                for (RootViewInfo next2 : rootViews) {
                    if (next2.isDialog()) {
                        canvas.drawColor(Color.argb((int) (next2.getLayoutParams().dimAmount * 255.0f), 0, 0, 0));
                        w(canvas, next2);
                    }
                }
                return bitmap;
            } catch (Exception e) {
                InstabugSDKLogger.e("DialogUiRenderer", e.getMessage() != null ? e.getMessage() : "Something went wrong while getting root views", e);
            }
        }
        return bitmap;
    }

    public static Bitmap h(Bitmap bitmap, int i, Context context) {
        Bitmap copy = bitmap.copy(bitmap.getConfig(), true);
        RenderScript create = RenderScript.create(context);
        Allocation createFromBitmap = Allocation.createFromBitmap(create, bitmap, Allocation.MipmapControl.MIPMAP_NONE, 1);
        Allocation createTyped = Allocation.createTyped(create, createFromBitmap.getType());
        ScriptIntrinsicBlur create2 = ScriptIntrinsicBlur.create(create, Element.U8_4(create));
        create2.setRadius((float) i);
        create2.setInput(createFromBitmap);
        create2.forEach(createTyped);
        createTyped.copyTo(copy);
        return copy;
    }

    public static PointF i(float f, float f2, float f3, PointF pointF) {
        PointF pointF2 = pointF;
        double d = (((double) f3) * 3.141592653589793d) / 180.0d;
        double sin = Math.sin(d);
        double cos = Math.cos(d);
        float f4 = pointF2.x - f;
        pointF2.x = f4;
        float f5 = pointF2.y - f2;
        pointF2.y = f5;
        double d2 = (double) f4;
        double d3 = (double) f5;
        pointF2.x = ((float) ((d2 * cos) - (d3 * sin))) + f;
        pointF2.y = ((float) ((d3 * cos) + (d2 * sin))) + f2;
        return pointF2;
    }

    public static PointF j(float f, float f2, PointF pointF) {
        PointF pointF2 = new PointF();
        s(f, f2, pointF, pointF2);
        return pointF2;
    }

    public static PointF k(PointF pointF, PointF pointF2) {
        PointF pointF3 = new PointF();
        pointF3.x = (pointF.x + pointF2.x) / 2.0f;
        pointF3.y = (pointF.y + pointF2.y) / 2.0f;
        return pointF3;
    }

    public static AttachmentTypesState l() {
        return b.a().b;
    }

    public static PluginPromptOption m(@PluginPromptOption.PromptOptionIdentifier int i, boolean z) {
        ArrayList arrayList;
        synchronized (i0.j.e.y.b.a.b) {
            arrayList = new ArrayList();
            if (i0.j.e.y.b.a.b("getPluginOptions()")) {
                for (Plugin next : i0.j.e.y.b.a.a) {
                    InstabugSDKLogger.v(i0.j.e.y.b.a.class, "plugin: " + next.toString());
                    ArrayList<PluginPromptOption> pluginOptions = next.getPluginOptions(z);
                    if (pluginOptions != null) {
                        arrayList.addAll(pluginOptions);
                    }
                }
                Collections.sort(arrayList, new PluginPromptOption.a());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            PluginPromptOption pluginPromptOption = (PluginPromptOption) it.next();
            if (pluginPromptOption.getPromptOptionIdentifier() == i) {
                return pluginPromptOption;
            }
        }
        return null;
    }

    public static String n(Context context, long j) {
        Date date = new Date(j);
        DateFormat dateInstance = DateFormat.getDateInstance(2);
        if (!Locale.getDefault().getISO3Language().equals(Locale.ENGLISH.getISO3Language())) {
            return dateInstance.format(date);
        }
        Date date2 = new Date();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        long seconds = timeUnit.toSeconds(date2.getTime() - date.getTime());
        long minutes = timeUnit.toMinutes(date2.getTime() - date.getTime());
        long hours = timeUnit.toHours(date2.getTime() - date.getTime());
        long days = timeUnit.toDays(date2.getTime() - date.getTime());
        if (seconds < 60) {
            return context.getString(R.string.feature_request_str_just_now);
        }
        if (minutes < 60) {
            return context.getResources().getQuantityString(R.plurals.instabug_feature_rq_str_minutes_ago, (int) minutes, new Object[]{Long.valueOf(minutes)});
        } else if (hours < 24) {
            return context.getResources().getQuantityString(R.plurals.instabug_feature_rq_str_hours_ago, (int) hours, new Object[]{Long.valueOf(hours)});
        } else if (days >= 7) {
            return dateInstance.format(date);
        } else {
            return context.getResources().getQuantityString(R.plurals.instabug_feature_rq_str_days_ago, (int) days, new Object[]{Long.valueOf(days)});
        }
    }

    public static String o(String str) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(Locale.getDefault());
        DecimalFormatSymbols decimalFormatSymbols = decimalFormat.getDecimalFormatSymbols();
        decimalFormatSymbols.setGroupingSeparator(',');
        decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
        return decimalFormat.format((long) Integer.parseInt(str));
    }

    public static String p(Field field, boolean z) {
        i0.j.e.l0.a.c cVar = (i0.j.e.l0.a.c) field.getAnnotation(i0.j.e.l0.a.c.class);
        if (cVar == null) {
            return field.getName();
        }
        if (z) {
            return cVar.name();
        }
        return cVar.alternate().isEmpty() ? cVar.name() : cVar.alternate();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00ef, code lost:
        if (r12 == null) goto L_0x0101;
     */
    @edu.umd.cs.findbugs.annotations.SuppressFBWarnings({"REC_CATCH_EXCEPTION"})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized java.util.List<com.instabug.crash.c.a> q(android.content.Context r13) {
        /*
            java.lang.Class<i0.j.c.l.a> r0 = i0.j.c.l.a.class
            monitor-enter(r0)
            com.instabug.library.internal.storage.cache.db.DatabaseManager r1 = com.instabug.library.internal.storage.cache.db.DatabaseManager.getInstance()     // Catch:{ all -> 0x010f }
            com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper r1 = r1.openDatabase()     // Catch:{ all -> 0x010f }
            java.util.ArrayList r11 = new java.util.ArrayList     // Catch:{ all -> 0x010f }
            r11.<init>()     // Catch:{ all -> 0x010f }
            r12 = 0
            java.lang.String r3 = "crashes_table"
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            r8 = 0
            java.lang.String r9 = "crash_id ASC"
            r10 = 0
            r2 = r1
            android.database.Cursor r12 = r2.query(r3, r4, r5, r6, r7, r8, r9, r10)     // Catch:{ Exception -> 0x00f4 }
            if (r12 == 0) goto L_0x00ef
            boolean r2 = r12.moveToFirst()     // Catch:{ Exception -> 0x00f4 }
            if (r2 == 0) goto L_0x00ef
        L_0x0028:
            com.instabug.crash.c.a r2 = new com.instabug.crash.c.a     // Catch:{ Exception -> 0x00f4 }
            r2.<init>()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "crash_id"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ Exception -> 0x00f4 }
            r2.c = r3     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "crash_message"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ Exception -> 0x00f4 }
            r2.q = r3     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "handled"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ Exception -> 0x00f4 }
            int r3 = r12.getInt(r3)     // Catch:{ Exception -> 0x00f4 }
            if (r3 == 0) goto L_0x0053
            r3 = 1
            goto L_0x0054
        L_0x0053:
            r3 = 0
        L_0x0054:
            r2.Z1 = r3     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "retry_count"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ Exception -> 0x00f4 }
            int r3 = r12.getInt(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r4 = r2.c     // Catch:{ Exception -> 0x00f4 }
            java.util.ArrayList r4 = com.instabug.library.internal.storage.cache.AttachmentsDbHelper.retrieve(r4, r1)     // Catch:{ Exception -> 0x00f4 }
            r2.b(r4)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r4 = "state"
            int r4 = r12.getColumnIndex(r4)     // Catch:{ Exception -> 0x00f4 }
            com.instabug.library.model.State r5 = new com.instabug.library.model.State     // Catch:{ Exception -> 0x00f4 }
            r5.<init>()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r4 = r12.getString(r4)     // Catch:{ Exception -> 0x00f4 }
            android.net.Uri r4 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x00f4 }
            if (r4 == 0) goto L_0x00b1
            r5.setUri(r4)     // Catch:{ Exception -> 0x00f4 }
            int r3 = r3 + 1
            com.instabug.library.internal.storage.DiskUtils r6 = com.instabug.library.internal.storage.DiskUtils.with(r13)     // Catch:{ OutOfMemoryError -> 0x009a }
            com.instabug.library.internal.storage.operation.ReadStateFromFileDiskOperation r7 = new com.instabug.library.internal.storage.operation.ReadStateFromFileDiskOperation     // Catch:{ OutOfMemoryError -> 0x009a }
            r7.<init>(r4)     // Catch:{ OutOfMemoryError -> 0x009a }
            com.instabug.library.internal.storage.executor.ReadOperationExecutor r6 = r6.readOperation(r7)     // Catch:{ OutOfMemoryError -> 0x009a }
            java.lang.String r6 = r6.execute()     // Catch:{ OutOfMemoryError -> 0x009a }
            r5.fromJson(r6)     // Catch:{ OutOfMemoryError -> 0x009a }
            r2.y = r5     // Catch:{ OutOfMemoryError -> 0x009a }
            goto L_0x00b1
        L_0x009a:
            r5 = move-exception
            java.lang.String r6 = "CrashReportsDbHelper"
            java.lang.String r7 = "retrieving crash state throws OOM"
            com.instabug.library.util.InstabugSDKLogger.e(r6, r7, r5)     // Catch:{ Exception -> 0x00f4 }
            r5 = 3
            if (r3 < r5) goto L_0x00b1
            x(r4)     // Catch:{ Exception -> 0x00f4 }
            C(r2)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r2 = r2.c     // Catch:{ Exception -> 0x00f4 }
            F(r2)     // Catch:{ Exception -> 0x00f4 }
            goto L_0x00e9
        L_0x00b1:
            android.content.ContentValues r4 = new android.content.ContentValues     // Catch:{ Exception -> 0x00f4 }
            r4.<init>()     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r5 = "retry_count"
            java.lang.Integer r6 = java.lang.Integer.valueOf(r3)     // Catch:{ Exception -> 0x00f4 }
            r4.put(r5, r6)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r5 = r2.c     // Catch:{ Exception -> 0x00f4 }
            D(r5, r4)     // Catch:{ Exception -> 0x00f4 }
            r2.a2 = r3     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "crash_state"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.Class<com.instabug.crash.c.a$a> r4 = com.instabug.crash.c.a.C0101a.class
            java.lang.String r3 = r12.getString(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.Enum r3 = java.lang.Enum.valueOf(r4, r3)     // Catch:{ Exception -> 0x00f4 }
            com.instabug.crash.c.a$a r3 = (com.instabug.crash.c.a.C0101a) r3     // Catch:{ Exception -> 0x00f4 }
            r2.Y1 = r3     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = "temporary_server_token"
            int r3 = r12.getColumnIndex(r3)     // Catch:{ Exception -> 0x00f4 }
            java.lang.String r3 = r12.getString(r3)     // Catch:{ Exception -> 0x00f4 }
            r2.d = r3     // Catch:{ Exception -> 0x00f4 }
            r11.add(r2)     // Catch:{ Exception -> 0x00f4 }
        L_0x00e9:
            boolean r2 = r12.moveToNext()     // Catch:{ Exception -> 0x00f4 }
            if (r2 != 0) goto L_0x0028
        L_0x00ef:
            if (r12 == 0) goto L_0x0101
            goto L_0x00fe
        L_0x00f2:
            r13 = move-exception
            goto L_0x0106
        L_0x00f4:
            r13 = move-exception
            java.lang.String r2 = "CrashReportsDbHelper"
            java.lang.String r3 = "retrieve: "
            com.instabug.library.util.InstabugSDKLogger.e(r2, r3, r13)     // Catch:{ all -> 0x00f2 }
            if (r12 == 0) goto L_0x0101
        L_0x00fe:
            r12.close()     // Catch:{ all -> 0x010f }
        L_0x0101:
            r1.close()     // Catch:{ all -> 0x010f }
            monitor-exit(r0)
            return r11
        L_0x0106:
            if (r12 == 0) goto L_0x010b
            r12.close()     // Catch:{ all -> 0x010f }
        L_0x010b:
            r1.close()     // Catch:{ all -> 0x010f }
            throw r13     // Catch:{ all -> 0x010f }
        L_0x010f:
            r13 = move-exception
            monitor-exit(r0)
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.c.l.a.q(android.content.Context):java.util.List");
    }

    public static JSONObject r(Throwable th, String str) {
        JSONObject jSONObject = new JSONObject();
        if (th == null) {
            return jSONObject;
        }
        try {
            String name = th.getClass().getName();
            if (str != null) {
                name = name + "-" + str;
            }
            jSONObject.put("name", (Object) name);
            StackTraceElement stackTraceElement = null;
            if (th.getStackTrace() != null && th.getStackTrace().length > 0) {
                stackTraceElement = th.getStackTrace()[0];
            }
            if (stackTraceElement == null || stackTraceElement.getFileName() == null) {
                InstabugSDKLogger.w("ExceptionFormatter", "Incomplete crash stacktrace, if you're using Proguard, add the following line to your configuration file to have file name and line number in your crash report:");
                InstabugSDKLogger.w("ExceptionFormatter", "-keepattributes SourceFile,LineNumberTable");
            } else {
                jSONObject.put("location", (Object) stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber());
            }
            jSONObject.put("exception", (Object) th.toString());
            if (th.getMessage() != null) {
                jSONObject.put(InstabugDbContract.BugEntry.COLUMN_MESSAGE, (Object) th.getMessage());
            }
            StringBuilder sb = new StringBuilder(th.toString());
            sb.append("\n");
            for (StackTraceElement stackTraceElement2 : th.getStackTrace()) {
                sb.append("\t at ");
                sb.append(stackTraceElement2.toString());
                sb.append("\n");
            }
            jSONObject.put("stackTrace", (Object) sb.toString());
            if (th.getCause() != null) {
                jSONObject.put("cause", (Object) r(th.getCause(), str));
            }
        } catch (JSONException e) {
            InstabugSDKLogger.e("ExceptionFormatter", e.getMessage() != null ? e.getMessage() : "Json exception while creating formatted exception", e);
        }
        return jSONObject;
    }

    public static void s(float f, float f2, PointF pointF, PointF pointF2) {
        double d = (double) f;
        double d2 = (((double) f2) * 3.141592653589793d) / 180.0d;
        pointF2.x = ((float) (Math.cos(d2) * d)) + pointF.x;
        pointF2.y = ((float) (Math.sin(d2) * d)) + pointF.y;
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public static void t(long j) {
        c.a().b.edit().putLong("ibc_last_chat_time", j).apply();
    }

    public static void u(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        InstabugSDKLogger.i("MigrationEngine", i0.d.a.a.a.j0("Did not migrate from v", i, " to v", i2, ". Falling back to destructive migration"));
        new i0.j.e.l0.k.a.b.b.a().a(sQLiteDatabase);
    }

    public static void v(Canvas canvas, PointF pointF, PointF pointF2, Paint paint) {
        canvas.drawLine(pointF.x, pointF.y, pointF2.x, pointF2.y, paint);
    }

    public static void w(Canvas canvas, RootViewInfo rootViewInfo) {
        View view = rootViewInfo.getView();
        if (view.getWidth() != 0 && view.getHeight() != 0) {
            canvas.save();
            canvas.translate((float) rootViewInfo.getRect().left, (float) rootViewInfo.getRect().top);
            rootViewInfo.getView().draw(canvas);
            canvas.restore();
        }
    }

    public static void x(Uri uri) {
        Context applicationContext = Instabug.getApplicationContext();
        if (applicationContext != null) {
            try {
                DiskUtils.with(applicationContext).deleteOperation(new DeleteUriDiskOperation(uri)).execute();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void y(MotionEvent motionEvent) {
        if (Instabug.isEnabled()) {
            InstabugInvocationEvent[] currentInstabugInvocationEvents = InvocationManager.getInstance().getCurrentInstabugInvocationEvents();
            int length = currentInstabugInvocationEvents.length;
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                } else if (currentInstabugInvocationEvents[i] == InstabugInvocationEvent.TWO_FINGER_SWIPE_LEFT) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                InvocationManager.getInstance().handle(motionEvent);
            }
            if (motionEvent != null) {
                InstabugInternalTrackingDelegate.getInstance().trackTouchEvent(motionEvent);
            }
        }
    }

    public static void z(View view, int i) {
        if (view != null) {
            Drawable background = view.getBackground();
            if (background instanceof ShapeDrawable) {
                ((ShapeDrawable) background).getPaint().setColor(i);
            } else if (background instanceof GradientDrawable) {
                ((GradientDrawable) background).setColor(i);
            } else if (background instanceof ColorDrawable) {
                ((ColorDrawable) background).setColor(i);
            }
        }
    }
}
