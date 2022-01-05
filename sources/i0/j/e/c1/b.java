package i0.j.e.c1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.Service;
import android.content.ContentValues;
import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.app.NotificationCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.R;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEvent;
import com.instabug.library.core.eventbus.coreeventbus.SDKCoreEventPublisher;
import com.instabug.library.internal.device.InstabugDeviceProperties;
import com.instabug.library.internal.orchestrator.ActionsOrchestrator;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.storage.cache.db.DatabaseManager;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.storage.cache.db.SQLiteDatabaseWrapper;
import com.instabug.library.internal.storage.cache.user.UserCacheManager;
import com.instabug.library.network.Request;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.tracking.InstabugInternalTrackingDelegate;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.DisplayUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.OrientationUtils;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.survey.models.State;
import com.instabug.survey.models.Survey;
import com.instabug.survey.ui.f;
import com.pubnub.api.vendor.FileEncryptionUtil;
import i0.j.e.l0.j.e;
import i0.j.e.l0.j.g;
import i0.j.e.l0.j.h;
import i0.j.e.l0.j.i;
import i0.j.e.l0.j.j;
import i0.j.e.l0.j.k;
import i0.j.f.m.d;
import java.io.Closeable;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: UserManager */
public class b {

    /* compiled from: UserManager */
    public static class a extends k0.b.b0.a {
        public void onComplete() {
        }

        public void onError(Throwable th) {
            InstabugSDKLogger.e("UserManager", th.getClass().getSimpleName(), th);
        }
    }

    /* renamed from: i0.j.e.c1.b$b  reason: collision with other inner class name */
    /* compiled from: UserManager */
    public static class C0177b implements Request.Callbacks<String, Throwable> {
        public final /* synthetic */ String a;
        public final /* synthetic */ String b;

        public C0177b(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public void onFailed(Object obj) {
            Throwable th = (Throwable) obj;
            SettingsManager.getInstance().setShouldMakeUUIDMigrationRequest(true);
        }

        public void onSucceeded(Object obj) {
            String str = (String) obj;
            StringBuilder P0 = i0.d.a.a.a.P0("old uuid ");
            P0.append(this.a);
            InstabugSDKLogger.v("UserManager", P0.toString());
            InstabugSDKLogger.v("UserManager", "md5uuid " + this.b);
            b.f();
            b.u(this.b);
            SettingsManager.getInstance().setShouldMakeUUIDMigrationRequest(false);
        }
    }

    /* compiled from: UserManager */
    public static class c implements Runnable {
        public final /* synthetic */ String c;

        public c(String str) {
            this.c = str;
        }

        public void run() {
            UserCacheManager.insertIfNotExists(this.c, b.A());
        }
    }

    public static int A() {
        return SettingsManager.getInstance().getSessionsCount();
    }

    public static void B(String str) {
        SettingsManager.getInstance().setIdentifiedUserEmail(str);
        if ("".equals(str)) {
            InstabugSDKLogger.d("UserManager", "Email set to empty string, enabling user input of email");
        } else if (!Patterns.EMAIL_ADDRESS.matcher(str).matches()) {
            InstabugSDKLogger.w("UserManager", "Invalid email " + str + " passed to setIdentifiedUserEmail, ignoring.");
        }
    }

    public static String C() {
        String mD5Uuid = SettingsManager.getInstance().getMD5Uuid();
        StringBuilder P0 = i0.d.a.a.a.P0("getUUID: ");
        P0.append(t());
        InstabugSDKLogger.v("UserManager", P0.toString());
        if ((mD5Uuid == null || mD5Uuid.isEmpty()) && ((mD5Uuid = SettingsManager.getInstance().getUuid()) == null || mD5Uuid.isEmpty())) {
            mD5Uuid = UUID.randomUUID().toString();
            InstabugSDKLogger.v("UserManager", "new randomly generated UUID: " + mD5Uuid);
            SettingsManager.getInstance().setUuid(mD5Uuid);
        }
        PoolProvider.getUserActionsExecutor().execute(new c(mD5Uuid));
        return mD5Uuid;
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public static void D(String str) {
        InstabugSDKLogger.v("UserManager", "setIdentifiedUsername: " + str);
        SettingsManager.getInstance().setIdentifiedUsername(str);
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public static String E() {
        if (s() == null || s().trim().equals("")) {
            return v();
        }
        return s();
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public static String F() {
        if (t() == null || t().trim().equals("")) {
            return y();
        }
        return t();
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public static boolean G() {
        boolean z = !SettingsManager.getInstance().getIdentifiedUserEmail().isEmpty();
        InstabugSDKLogger.v("UserManager", "isLoggedIn: " + z);
        return z;
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public static void H() {
        InstabugSDKLogger.v("UserManager", "logoutUser");
        w("");
        z("");
        if (!SettingsManager.getInstance().getIdentifiedUserEmail().trim().isEmpty() && !SettingsManager.getInstance().getIdentifiedUsername().trim().isEmpty()) {
            SDKCoreEventPublisher.post(new SDKCoreEvent("user", SDKCoreEvent.User.VALUE_LOGGED_OUT));
            String C = C();
            ActionsOrchestrator.obtainOrchestrator(PoolProvider.getUserActionsExecutor()).addWorkerThreadAction(new i0.j.e.l0.j.a(C, A())).addSameThreadAction(new g()).addWorkerThreadAction(new k(C, System.currentTimeMillis())).orchestrate();
        }
    }

    public static int a(Activity activity, f fVar) {
        int displayHeightInPx = DisplayUtils.getDisplayHeightInPx(activity);
        int i = d.a[fVar.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (OrientationUtils.isInLandscape(activity)) {
                    if (InstabugDeviceProperties.isTablet(activity)) {
                        return (displayHeightInPx * 40) / 100;
                    }
                    return (displayHeightInPx * 45) / 100;
                } else if (InstabugDeviceProperties.isTablet(activity)) {
                    return (displayHeightInPx * 25) / 100;
                } else {
                    return (displayHeightInPx * 38) / 100;
                }
            } else if (InstabugDeviceProperties.isTablet(activity)) {
                return (displayHeightInPx * 80) / 100;
            } else {
                if (OrientationUtils.isInLandscape(activity)) {
                    return (displayHeightInPx * 95) / 100;
                }
                return (displayHeightInPx * 88) / 100;
            }
        } else if (InstabugDeviceProperties.isTablet(activity)) {
            if (OrientationUtils.isInLandscape(activity)) {
                return (displayHeightInPx * 60) / 100;
            }
            return (displayHeightInPx * 45) / 100;
        } else if (OrientationUtils.isInLandscape(activity)) {
            return (displayHeightInPx * 75) / 100;
        } else {
            return (displayHeightInPx * 52) / 100;
        }
    }

    public static String b(int i) {
        switch (i) {
            case 0:
                return "P";
            case 1:
                return "Ā";
            case 2:
                return "ā";
            case 3:
                return "Ă";
            case 4:
                return "ă";
            case 5:
                return "Ą";
            case 6:
                return "ą";
            case 7:
                return "Ć";
            case 8:
                return "ć";
            case 9:
                return "Ĉ";
            case 10:
                return "ĉ";
            case 11:
                return "Ċ";
            case 12:
                return "ċ";
            case 13:
                return "Č";
            case 14:
                return "č";
            case 15:
                return "Ď";
            case 16:
                return "ď";
            case 17:
                return "Đ";
            case 18:
                return "đ";
            case 19:
                return "Ē";
            case 20:
                return "ē";
            case 21:
                return "Ĕ";
            case 22:
                return "ĕ";
            case 23:
                return "Ė";
            case 24:
                return "ė";
            case 25:
                return "Ę";
            case 26:
                return "ę";
            default:
                return "";
        }
    }

    public static String c(String str) {
        if (str == null || str.isEmpty()) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes(FileEncryptionUtil.ENCODING_UTF_8));
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                byte b2 = b & 255;
                if (b2 < 16) {
                    sb.append("0");
                    sb.append(Integer.toHexString(b2));
                } else {
                    sb.append(Integer.toHexString(b2));
                }
            }
            return sb.toString();
        } catch (UnsupportedEncodingException | NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static JSONObject d(com.instabug.survey.e.c.a aVar, String str) throws JSONException {
        long j;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", aVar.c);
        jSONObject.put("type", (Object) aVar.d());
        jSONObject.put(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, (Object) aVar.d);
        jSONObject.put("is_announcement", true);
        JSONArray jSONArray = new JSONArray();
        Iterator<com.instabug.survey.e.c.c> it = aVar.x.iterator();
        while (it.hasNext()) {
            com.instabug.survey.e.c.c next = it.next();
            String str2 = next.q;
            if (str2 != null && !str2.equals("")) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("question_id", next.x);
                String str3 = next.c;
                if (str3 == null) {
                    str3 = "";
                }
                jSONObject2.put("question_title", (Object) str3);
                jSONObject2.put("question_type", (Object) !next.c().equals("") ? next.c() : aVar.d());
                if (str.equals(State.DISMISSED)) {
                    j = aVar.a2.Y1;
                } else {
                    j = aVar.b();
                }
                jSONObject2.put("response_timestamp", j);
                jSONObject2.put("response_value", (Object) next.q);
                jSONArray.put((Object) jSONObject2);
            }
        }
        jSONObject.put("responses", (Object) jSONArray);
        return jSONObject;
    }

    public static JSONObject e(Survey survey, String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("id", survey.getId());
        jSONObject.put("type", (Object) survey.getTypeAsString());
        jSONObject.put(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, (Object) survey.getTitle());
        jSONObject.put("is_announcement", false);
        ArrayList<com.instabug.survey.models.b> questions = survey.getQuestions();
        int type = survey.getType();
        JSONArray jSONArray = new JSONArray();
        if (!(type == 0 || type == 1) || !str.equals(State.DISMISSED)) {
            Iterator<com.instabug.survey.models.b> it = questions.iterator();
            while (it.hasNext()) {
                com.instabug.survey.models.b next = it.next();
                String str2 = next.y;
                if (str2 != null) {
                    String str3 = "";
                    if (!str2.equals(str3)) {
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("question_id", next.c);
                        jSONObject2.put("question_title", (Object) next.d);
                        int i = next.q;
                        if (i == 0) {
                            str3 = "Textfield";
                        } else if (i == 1) {
                            str3 = "MCQ";
                        } else if (i == 2) {
                            str3 = "StarRating";
                        } else if (i == 3) {
                            str3 = "NPS";
                        } else if (i == 4) {
                            str3 = "AppStoreRating";
                        } else if (i == 5) {
                            str3 = "Alert";
                        }
                        jSONObject2.put("question_type", (Object) str3);
                        jSONObject2.put("response_timestamp", next.Y1);
                        jSONObject2.put("response_value", (Object) next.y);
                        jSONArray.put((Object) jSONObject2);
                    }
                }
            }
        }
        jSONObject.put("responses", (Object) jSONArray);
        return jSONObject;
    }

    public static void f() {
        InstabugSDKLogger.v("UserManager", "clearUserActivities");
        SettingsManager.getInstance().setLastContactedAt(0);
        CacheManager.getInstance().invalidateAllCachesForIdentifyingUsers();
    }

    public static void g(Activity activity) {
        if (activity != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) activity.getSystemService("input_method");
            View currentFocus = activity.getCurrentFocus();
            if (currentFocus == null) {
                currentFocus = new View(activity);
            }
            inputMethodManager.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0);
        }
    }

    public static void h(Service service, int i, int i2) {
        NotificationCompat.Builder builder;
        if (Build.VERSION.SDK_INT >= 26) {
            NotificationManager notificationManager = (NotificationManager) service.getSystemService("notification");
            if (notificationManager != null && notificationManager.getNotificationChannel("ibg-screen-recording") == null) {
                notificationManager.createNotificationChannel(new NotificationChannel("ibg-screen-recording", "Screen Recording Service", 2));
            }
            builder = new NotificationCompat.Builder((Context) service, "ibg-screen-recording");
        } else {
            builder = new NotificationCompat.Builder(service);
        }
        builder.setOngoing(false).setAutoCancel(true).setSmallIcon(R.drawable.ibg_core_ic_instabug_logo).setContentText(LocaleUtils.getLocaleStringResource(Instabug.getLocale(service.getApplicationContext()), i, service.getApplicationContext()));
        service.startForeground(i2, builder.build());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00e1, code lost:
        r10 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e2, code lost:
        com.instabug.library.util.InstabugSDKLogger.e("UserManager", "Something went wrong while do UUID migration request", r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void i(android.content.Context r10) {
        /*
            java.lang.String r0 = "UserManager"
            java.lang.String r1 = "migrate UUID"
            com.instabug.library.util.InstabugSDKLogger.d(r0, r1)
            com.instabug.library.settings.SettingsManager r0 = com.instabug.library.settings.SettingsManager.getInstance()
            java.lang.String r0 = r0.getMD5Uuid()
            java.lang.Object r1 = i0.j.e.y.b.a.b
            monitor-enter(r1)
            java.lang.String r2 = "getLastActivityTime()"
            boolean r2 = i0.j.e.y.b.a.b(r2)     // Catch:{ all -> 0x00fb }
            r3 = 0
            if (r2 != 0) goto L_0x001f
            monitor-exit(r1)     // Catch:{ all -> 0x00fb }
            r5 = r3
            goto L_0x003d
        L_0x001f:
            java.util.List<com.instabug.library.core.plugin.Plugin> r2 = i0.j.e.y.b.a.a     // Catch:{ all -> 0x00fb }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x00fb }
            r5 = r3
        L_0x0026:
            boolean r7 = r2.hasNext()     // Catch:{ all -> 0x00fb }
            if (r7 == 0) goto L_0x003c
            java.lang.Object r7 = r2.next()     // Catch:{ all -> 0x00fb }
            com.instabug.library.core.plugin.Plugin r7 = (com.instabug.library.core.plugin.Plugin) r7     // Catch:{ all -> 0x00fb }
            long r7 = r7.getLastActivityTime()     // Catch:{ all -> 0x00fb }
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 <= 0) goto L_0x0026
            r5 = r7
            goto L_0x0026
        L_0x003c:
            monitor-exit(r1)     // Catch:{ all -> 0x00fb }
        L_0x003d:
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            r2 = 1
            if (r1 == 0) goto L_0x0044
            r1 = r2
            goto L_0x0045
        L_0x0044:
            r1 = 0
        L_0x0045:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isUserHasActivity: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "UserManager"
            com.instabug.library.util.InstabugSDKLogger.v(r4, r3)
            if (r1 == 0) goto L_0x00ea
            com.instabug.library.settings.SettingsManager r1 = com.instabug.library.settings.SettingsManager.getInstance()
            boolean r1 = r1.isUserLoggedOut()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "isUserLoggedOut: "
            r3.append(r4)
            r3.append(r1)
            java.lang.String r3 = r3.toString()
            java.lang.String r4 = "UserManager"
            com.instabug.library.util.InstabugSDKLogger.v(r4, r3)
            if (r1 == 0) goto L_0x00ea
            com.instabug.library.settings.SettingsManager r1 = com.instabug.library.settings.SettingsManager.getInstance()
            r1.setShouldMakeUUIDMigrationRequest(r2)
            com.instabug.library.settings.SettingsManager r1 = com.instabug.library.settings.SettingsManager.getInstance()     // Catch:{ JSONException -> 0x00e1 }
            java.lang.String r1 = r1.getUuid()     // Catch:{ JSONException -> 0x00e1 }
            if (r1 != 0) goto L_0x0096
            java.lang.String r10 = "UserManager"
            java.lang.String r0 = "old uuid is null"
            com.instabug.library.util.InstabugSDKLogger.v(r10, r0)     // Catch:{ JSONException -> 0x00e1 }
            return
        L_0x0096:
            if (r0 != 0) goto L_0x00a0
            java.lang.String r10 = "UserManager"
            java.lang.String r0 = "New UUID is null"
            com.instabug.library.util.InstabugSDKLogger.v(r10, r0)     // Catch:{ JSONException -> 0x00e1 }
            return
        L_0x00a0:
            i0.j.e.r0.f r2 = new i0.j.e.r0.f     // Catch:{ JSONException -> 0x00e1 }
            r2.<init>(r0, r1)     // Catch:{ JSONException -> 0x00e1 }
            io.reactivex.internal.operators.completable.CompletableCreate r3 = new io.reactivex.internal.operators.completable.CompletableCreate     // Catch:{ JSONException -> 0x00e1 }
            r3.<init>(r2)     // Catch:{ JSONException -> 0x00e1 }
            k0.b.a r2 = io.reactivex.plugins.RxJavaPlugins.onAssembly((k0.b.a) r3)     // Catch:{ JSONException -> 0x00e1 }
            k0.b.q r3 = k0.b.d0.a.b()     // Catch:{ JSONException -> 0x00e1 }
            k0.b.a r2 = r2.f(r3)     // Catch:{ JSONException -> 0x00e1 }
            i0.j.e.c1.b$a r3 = new i0.j.e.c1.b$a     // Catch:{ JSONException -> 0x00e1 }
            r3.<init>()     // Catch:{ JSONException -> 0x00e1 }
            r2.a(r3)     // Catch:{ JSONException -> 0x00e1 }
            java.lang.Class<i0.j.e.v0.e.f> r2 = i0.j.e.v0.e.f.class
            monitor-enter(r2)     // Catch:{ JSONException -> 0x00e1 }
            i0.j.e.v0.e.f r3 = i0.j.e.v0.e.f.a     // Catch:{ all -> 0x00de }
            if (r3 != 0) goto L_0x00d2
            i0.j.e.v0.e.f r3 = new i0.j.e.v0.e.f     // Catch:{ all -> 0x00de }
            r3.<init>()     // Catch:{ all -> 0x00de }
            i0.j.e.v0.e.f.a = r3     // Catch:{ all -> 0x00de }
            r4 = 0
            com.instabug.library.network.NetworkManager r3 = r3.b     // Catch:{ all -> 0x00de }
            r3.setOnDoRequestListener(r4)     // Catch:{ all -> 0x00de }
        L_0x00d2:
            i0.j.e.v0.e.f r3 = i0.j.e.v0.e.f.a     // Catch:{ all -> 0x00de }
            monitor-exit(r2)     // Catch:{ JSONException -> 0x00e1 }
            i0.j.e.c1.b$b r2 = new i0.j.e.c1.b$b     // Catch:{ JSONException -> 0x00e1 }
            r2.<init>(r1, r0)     // Catch:{ JSONException -> 0x00e1 }
            r3.a(r10, r1, r0, r2)     // Catch:{ JSONException -> 0x00e1 }
            goto L_0x00fa
        L_0x00de:
            r10 = move-exception
            monitor-exit(r2)     // Catch:{ JSONException -> 0x00e1 }
            throw r10     // Catch:{ JSONException -> 0x00e1 }
        L_0x00e1:
            r10 = move-exception
            java.lang.String r0 = "UserManager"
            java.lang.String r1 = "Something went wrong while do UUID migration request"
            com.instabug.library.util.InstabugSDKLogger.e(r0, r1, r10)
            goto L_0x00fa
        L_0x00ea:
            f()
            if (r0 != 0) goto L_0x00f7
            java.lang.String r10 = "UserManager"
            java.lang.String r0 = "New UUID is null"
            com.instabug.library.util.InstabugSDKLogger.v(r10, r0)
            return
        L_0x00f7:
            u(r0)
        L_0x00fa:
            return
        L_0x00fb:
            r10 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x00fb }
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: i0.j.e.c1.b.i(android.content.Context):void");
    }

    public static void j(Context context, View view) {
        if (view != null) {
            int i = com.instabug.survey.R.id.instabug_pbi_container;
            view.findViewById(i).setVisibility(0);
            view.findViewById(i).setBackgroundColor(AttrResolver.getBackgroundColor(context));
            TextView textView = (TextView) view.findViewById(com.instabug.survey.R.id.text_view_pb);
            ImageView imageView = (ImageView) view.findViewById(com.instabug.survey.R.id.image_instabug_logo);
            imageView.setImageResource(com.instabug.survey.R.drawable.ibg_core_ic_instabug_logo);
            if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeDark) {
                imageView.setColorFilter(Color.parseColor("#FFFFFF"), PorterDuff.Mode.SRC_ATOP);
                textView.setTextColor(h0.i.b.a.getColor(context, 17170443));
                return;
            }
            int i2 = com.instabug.survey.R.color.instabug_survey_pbi_color;
            imageView.setColorFilter(h0.i.b.a.getColor(context, i2), PorterDuff.Mode.SRC_ATOP);
            textView.setTextColor(h0.i.b.a.getColor(context, i2));
        }
    }

    public static void k(View view) {
        if (view != null) {
            view.findViewById(com.instabug.survey.R.id.instabug_pbi_container).setVisibility(8);
        }
    }

    public static void l(FragmentManager fragmentManager, Fragment fragment, int i, int i2) {
        h0.o.a.a aVar = new h0.o.a.a(fragmentManager);
        aVar.d = i;
        aVar.e = i2;
        aVar.f = 0;
        aVar.g = 0;
        aVar.o(com.instabug.survey.R.id.instabug_fragment_container, fragment, (String) null);
        aVar.h();
    }

    public static void m(FragmentManager fragmentManager, com.instabug.survey.e.c.a aVar) {
        int i = aVar.q;
        if (i == 100) {
            int i2 = com.instabug.survey.R.anim.instabug_anim_flyin_from_bottom;
            int i3 = com.instabug.survey.R.anim.instabug_anim_flyout_to_bottom;
            int i4 = com.instabug.survey.e.e.a.c.d.q;
            Bundle bundle = new Bundle();
            bundle.putSerializable("announcement_item", aVar.x.get(0));
            com.instabug.survey.e.e.a.c.d dVar = new com.instabug.survey.e.e.a.c.d();
            dVar.setArguments(bundle);
            l(fragmentManager, dVar, i2, i3);
        } else if (i == 101) {
            l(fragmentManager, com.instabug.survey.e.e.a.b.c.I0(aVar.x.get(0)), 0, 0);
        }
    }

    public static void n(Closeable closeable) {
        try {
            closeable.close();
        } catch (Throwable th) {
            StringBuilder P0 = i0.d.a.a.a.P0("Failed to close ");
            P0.append(closeable.getClass().getSimpleName());
            InstabugSDKLogger.e("ClosableUtils", P0.toString(), th);
        }
    }

    public static boolean o() {
        Activity currentActivity = InstabugInternalTrackingDelegate.getInstance().getCurrentActivity();
        return currentActivity != null && h0.i.b.a.checkSelfPermission(currentActivity, "android.permission.RECORD_AUDIO") == 0;
    }

    public static void p(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.setMode(0);
        if (!audioManager.isMicrophoneMute()) {
            audioManager.setMicrophoneMute(true);
        }
    }

    public static synchronized long q(long j, long j2, String str) {
        long update;
        synchronized (b.class) {
            SQLiteDatabaseWrapper openDatabase = DatabaseManager.getInstance().openDatabase();
            String[] strArr = {String.valueOf(j2)};
            openDatabase.beginTransaction();
            ContentValues contentValues = new ContentValues();
            contentValues.put(InstabugDbContract.AnnouncementAssetsEntry.COLUMN_ID, Long.valueOf(j2));
            contentValues.put(InstabugDbContract.AnnouncementAssetsEntry.COLUMN_ANNOUNCE_ID, Long.valueOf(j));
            contentValues.put(InstabugDbContract.AnnouncementAssetsEntry.COLUMN_FILE_PATH, str);
            update = (long) openDatabase.update(InstabugDbContract.AnnouncementAssetsEntry.TABLE_NAME, contentValues, "asset_id=? ", strArr);
            openDatabase.setTransactionSuccessful();
            InstabugSDKLogger.d(i0.j.f.b.a.a.class, "assets of id: " + str + " has been updated in " + InstabugDbContract.AnnouncementAssetsEntry.TABLE_NAME);
            openDatabase.endTransaction();
            openDatabase.close();
        }
        return update;
    }

    public static void r(Context context) {
        AudioManager audioManager = (AudioManager) context.getSystemService("audio");
        audioManager.setMode(0);
        if (audioManager.isMicrophoneMute()) {
            audioManager.setMicrophoneMute(false);
        }
    }

    public static String s() {
        return SettingsManager.getInstance().getEnteredEmail();
    }

    public static String t() {
        return SettingsManager.getInstance().getEnteredUsername();
    }

    public static void u(String str) {
        SDKCoreEventPublisher.post(new SDKCoreEvent("user", SDKCoreEvent.User.VALUE_LOGGED_IN));
        ActionsOrchestrator.obtainOrchestrator().addWorkerThreadAction(new i0.j.e.l0.j.f(str)).addWorkerThreadAction(new e(str)).addWorkerThreadAction(new i(str)).addWorkerThreadAction(new j(str)).addWorkerThreadAction(new h(str)).orchestrate();
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public static String v() throws IllegalStateException {
        String identifiedUserEmail = SettingsManager.getInstance().getIdentifiedUserEmail();
        if (identifiedUserEmail.isEmpty()) {
            identifiedUserEmail = SettingsManager.getInstance().getEnteredEmail();
        }
        InstabugSDKLogger.v("UserManager", "getIdentifiedUserEmail: " + identifiedUserEmail);
        return identifiedUserEmail;
    }

    public static void w(String str) {
        InstabugSDKLogger.v("UserManager", "setEnteredEmail: " + str);
        SettingsManager.getInstance().setEnteredEmail(str);
    }

    public static boolean x(View view) {
        return view.getClass().getName().contains(SettingsManager.INSTABUG_SHARED_PREF_NAME);
    }

    @SuppressLint({"NULL_DEREFERENCE"})
    public static String y() {
        String identifiedUsername = SettingsManager.getInstance().getIdentifiedUsername();
        if (identifiedUsername.isEmpty()) {
            identifiedUsername = SettingsManager.getInstance().getEnteredUsername();
        }
        InstabugSDKLogger.v("UserManager", "getIdentifiedUsername: " + identifiedUsername);
        return identifiedUsername;
    }

    public static void z(String str) {
        InstabugSDKLogger.v("UserManager", "setEnteredUsername: " + str);
        SettingsManager.getInstance().setEnteredUsername(str);
    }
}
