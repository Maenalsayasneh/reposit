package com.instabug.bug.view.reporting;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.Spanned;
import android.util.Base64;
import android.util.Pair;
import android.util.Patterns;
import androidx.fragment.app.Fragment;
import com.instabug.bug.BugPlugin;
import com.instabug.bug.StateCreatorEventBus;
import com.instabug.bug.k.b.c$b;
import com.instabug.bug.model.a;
import com.instabug.bug.screenshot.viewhierarchy.utilities.ViewHierarchyInspectorEventBus;
import com.instabug.library.Feature;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.R;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.eventbus.ScreenRecordingEventBus;
import com.instabug.library.core.ui.BasePresenter;
import com.instabug.library.internal.InstabugMediaProjectionIntent;
import com.instabug.library.internal.orchestrator.ActionsOrchestrator;
import com.instabug.library.internal.storage.AttachmentsUtility;
import com.instabug.library.internal.storage.cache.Cache;
import com.instabug.library.internal.storage.cache.CacheManager;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.internal.video.RequestPermissionActivity;
import com.instabug.library.model.Attachment;
import com.instabug.library.settings.SettingsManager;
import com.instabug.library.util.FileUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.PermissionsUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.library.util.VideoManipulationUtils;
import com.instabug.library.util.threading.PoolProvider;
import com.pubnub.api.vendor.FileEncryptionUtil;
import i0.j.b.f;
import i0.j.b.t.k.i;
import i0.j.b.t.k.j;
import i0.j.b.t.k.k;
import i0.j.b.t.k.l;
import io.reactivex.disposables.CompositeDisposable;
import java.io.File;
import java.lang.ref.WeakReference;
import java.nio.charset.Charset;
import java.util.Objects;
import java.util.regex.Pattern;

/* compiled from: BaseReportingPresenter */
public abstract class c extends BasePresenter<l> implements k {
    public CompositeDisposable c;
    public h d = h.NONE;
    public int q = 0;
    public boolean x = false;

    /* compiled from: BaseReportingPresenter */
    public class a implements Runnable {
        public final /* synthetic */ l c;

        public a(l lVar) {
            this.c = lVar;
        }

        public void run() {
            InstabugSDKLogger.d("BaseReportingPresenter", "Permission granted");
            f.g().e();
            this.c.d();
        }
    }

    /* compiled from: BaseReportingPresenter */
    public class b implements k0.b.y.d<c$b> {
        public b() {
        }

        public void b(Object obj) throws Exception {
            WeakReference<V> weakReference;
            c$b c_b = (c$b) obj;
            c.m(c.this);
            InstabugSDKLogger.d("BaseReportingPresenter", "receive a view hierarchy inspection action, action value: " + c_b);
            if ((c_b == c$b.COMPLETED || c_b == c$b.FAILED) && (weakReference = c.this.view) != null) {
                c.k(c.this, (l) weakReference.get());
            }
        }
    }

    /* renamed from: com.instabug.bug.view.reporting.c$c  reason: collision with other inner class name */
    /* compiled from: BaseReportingPresenter */
    public class C0096c implements k0.b.y.d<Throwable> {
        public C0096c() {
        }

        public void b(Object obj) throws Exception {
            Throwable th = (Throwable) obj;
            c.m(c.this);
            WeakReference<V> weakReference = c.this.view;
            if (weakReference != null) {
                c.k(c.this, (l) weakReference.get());
            }
        }
    }

    /* compiled from: BaseReportingPresenter */
    public static /* synthetic */ class d {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
        static {
            /*
                com.instabug.bug.view.reporting.c.h.values()
                r0 = 4
                int[] r0 = new int[r0]
                a = r0
                com.instabug.bug.view.reporting.c$h r1 = com.instabug.bug.view.reporting.c.h.SEND_BUG     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.bug.view.reporting.c$h r1 = com.instabug.bug.view.reporting.c.h.TAKE_EXTRA_SCREENSHOT     // Catch:{ NoSuchFieldError -> 0x001c }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0027 }
                com.instabug.bug.view.reporting.c$h r1 = com.instabug.bug.view.reporting.c.h.RECORD_VIDEO     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.instabug.bug.view.reporting.c.d.<clinit>():void");
        }
    }

    /* compiled from: BaseReportingPresenter */
    public enum h {
        NONE,
        SEND_BUG,
        TAKE_EXTRA_SCREENSHOT,
        RECORD_VIDEO
    }

    public c(l lVar) {
        super(lVar);
    }

    public static void k(c cVar, l lVar) {
        Objects.requireNonNull(cVar);
        if (lVar != null && ((Fragment) lVar.getViewContext()).getActivity() != null) {
            ((Fragment) lVar.getViewContext()).getActivity().runOnUiThread(new j(cVar, lVar));
        }
    }

    public static /* synthetic */ int m(c cVar) {
        int i = cVar.q - 1;
        cVar.q = i;
        return i;
    }

    public void D(Attachment attachment) {
        l lVar;
        if (f.g().b != null) {
            f.g().b.b().remove(attachment);
        }
        if (attachment.getLocalPath() != null) {
            File file = new File(attachment.getLocalPath());
            if (attachment.getType() != null && (Attachment.Type.EXTRA_VIDEO.equals(attachment.getType()) || Attachment.Type.GALLERY_VIDEO.equals(attachment.getType()))) {
                InstabugSDKLogger.d("BaseReportingPresenter", "removing video attachment");
                Cache cache = CacheManager.getInstance().getCache(CacheManager.DEFAULT_IN_MEMORY_CACHE_KEY);
                if (!(cache == null || cache.delete("video.path") == null)) {
                    InstabugSDKLogger.d("BaseReportingPresenter", "video attachment removed successfully");
                }
                if (f.g().b != null) {
                    f.g().b.setHasVideo(false);
                }
            }
            if (file.delete()) {
                InstabugSDKLogger.d("BaseReportingPresenter", "attachment removed successfully");
                WeakReference<V> weakReference = this.view;
                if (weakReference != null && (lVar = (l) weakReference.get()) != null) {
                    lVar.D(attachment);
                }
            }
        }
    }

    public void E(int i, int i2, Intent intent) {
        WeakReference<V> weakReference;
        l lVar;
        Pair<String, String> fileNameAndSize;
        if (i == 3862) {
            if (i2 == -1 && intent != null && intent.getData() != null && (weakReference = this.view) != null && (lVar = (l) weakReference.get()) != null && (fileNameAndSize = AttachmentsUtility.getFileNameAndSize(lVar.getActivity(), intent.getData())) != null) {
                Object obj = fileNameAndSize.first;
                String str = (String) obj;
                String extension = obj != null ? FileUtils.getExtension(str) : null;
                Object obj2 = fileNameAndSize.second;
                String str2 = obj2 != null ? (String) obj2 : "0";
                if (extension == null) {
                    return;
                }
                if (FileUtils.isImageExtension(extension)) {
                    File fileFromContentProvider = AttachmentsUtility.getFileFromContentProvider(lVar.getContext(), intent.getData(), str);
                    if (fileFromContentProvider != null) {
                        f g = f.g();
                        Context context = lVar.getContext();
                        Attachment.Type type = Attachment.Type.GALLERY_IMAGE;
                        if (g.b != null) {
                            g.b.a(Uri.fromFile(fileFromContentProvider), type, false);
                            g.d(context);
                        }
                    }
                } else if (FileUtils.isVideoExtension(extension)) {
                    try {
                        if ((Double.parseDouble(str2) / 1024.0d) / 1024.0d > 50.0d) {
                            lVar.G0();
                            InstabugSDKLogger.e("BaseReportingPresenter", "video size exceeded the limit");
                            return;
                        }
                        File fileFromContentProvider2 = AttachmentsUtility.getFileFromContentProvider(lVar.getContext(), intent.getData(), str);
                        if (fileFromContentProvider2 == null) {
                            InstabugSDKLogger.e("BaseReportingPresenter", "video file is null");
                        } else if (VideoManipulationUtils.extractVideoDuration(fileFromContentProvider2.getPath()) > 60000) {
                            lVar.i0();
                            InstabugSDKLogger.e("BaseReportingPresenter", "video length exceeded the limit");
                            if (fileFromContentProvider2.delete()) {
                                InstabugSDKLogger.v("BaseReportingPresenter", "file deleted");
                            }
                        } else {
                            f.g().a(lVar.getContext(), Uri.fromFile(fileFromContentProvider2), (String) null, Attachment.Type.GALLERY_VIDEO);
                        }
                    } catch (Exception e) {
                        if (e.getMessage() != null) {
                            InstabugSDKLogger.e("BaseReportingPresenter", e.getMessage(), e);
                        } else {
                            InstabugSDKLogger.e("BaseReportingPresenter", e.toString(), e);
                        }
                    }
                }
            }
        } else if (i == 3890) {
            if (i2 == -1 && intent != null) {
                InstabugMediaProjectionIntent.setMediaProjectionIntent(intent);
                InstabugMediaProjectionIntent.setStaticResultCode(i2);
                n();
            }
        } else if (i == 2030 && this.view.get() != null && intent != null && intent.getBooleanExtra(RequestPermissionActivity.KEY_IS_PERMISSION_GRANDTED, false)) {
            p((l) this.view.get());
        }
    }

    public void F(Bundle bundle) {
    }

    public void H(Bundle bundle) {
    }

    public void b() {
        WeakReference<V> weakReference;
        if (!this.x && (weakReference = this.view) != null) {
            l lVar = (l) weakReference.get();
            if (f.g().b != null && f.g().b.a2 && f.g().b.b2 == a.c.IN_PROGRESS) {
                this.d = h.TAKE_EXTRA_SCREENSHOT;
                if (lVar != null) {
                    lVar.F();
                }
            } else if (lVar == null) {
            } else {
                if (SettingsManager.getInstance().isScreenshotByMediaProjectionEnabled()) {
                    lVar.C0();
                } else {
                    p(lVar);
                }
            }
        }
    }

    public void c() {
        CompositeDisposable compositeDisposable = this.c;
        if (compositeDisposable != null) {
            compositeDisposable.dispose();
        }
    }

    public void d() {
        l lVar;
        l lVar2;
        if (i0.j.b.s.a.h().c() != null) {
            String c2 = i0.j.b.s.a.h().c();
            if (c2 != null && !c2.isEmpty() && InstabugCore.getFeatureState(Feature.DISCLAIMER) == Feature.State.ENABLED) {
                Spanned fromHtml = Html.fromHtml(i0.h.a.b.c.m.b.c(i0.j.b.s.a.h().c(), "#metadata-screen", "instabug-bug://instabug-disclaimer.com/disclaimer"), 0);
                WeakReference<V> weakReference = this.view;
                if (weakReference != null && (lVar2 = (l) weakReference.get()) != null) {
                    lVar2.T(fromHtml);
                    return;
                }
                return;
            }
            WeakReference<V> weakReference2 = this.view;
            if (weakReference2 != null && (lVar = (l) weakReference2.get()) != null) {
                lVar.m();
            }
        }
    }

    public void f() {
        WeakReference<V> weakReference = this.view;
        if (weakReference != null) {
            l lVar = (l) weakReference.get();
            if (lVar != null) {
                lVar.R(InstabugCore.getEnteredEmail());
                InstabugSDKLogger.d("BaseReportingPresenter", "updateEmailFromUserManager with entered email: " + InstabugCore.getEnteredEmail());
                return;
            }
            return;
        }
        StringBuilder P0 = i0.d.a.a.a.P0("updateEmailFromUserManager failed with entered email: ");
        P0.append(InstabugCore.getEnteredEmail());
        P0.append(" null view");
        InstabugSDKLogger.w("BaseReportingPresenter", P0.toString());
    }

    public void g() {
        WeakReference<V> weakReference;
        l lVar;
        this.c = new CompositeDisposable();
        r();
        if (f.g().b != null && f.g().b.getState() == null) {
            this.q++;
            CompositeDisposable compositeDisposable = this.c;
            if (compositeDisposable != null) {
                compositeDisposable.add(StateCreatorEventBus.getInstance().getEventObservable().t(new i0.j.b.t.k.h(this), new i(this), k0.b.z.b.a.c, k0.b.z.b.a.d));
            }
        }
        if (InstabugCore.isFeatureEnabled(Feature.VIEW_HIERARCHY_V2)) {
            r();
        }
        Feature feature = Feature.REPORT_PHONE_NUMBER;
        if (!(!InstabugCore.isFeatureAvailable(feature) || (weakReference = this.view) == null || weakReference.get() == null || (lVar = (l) this.view.get()) == null)) {
            lVar.c();
        }
        if (InstabugCore.isFeatureAvailable(feature)) {
            Objects.requireNonNull(i0.j.b.s.a.h());
            String string = i0.j.b.s.c.a().b.getString("ib_e_pn", (String) null);
            if (f.g().b == null || f.g().b.getState() == null) {
                if (string != null && !string.trim().isEmpty()) {
                    l(string, true);
                }
            } else if (f.g().b.getState().getCustomUserAttribute() != null && !f.g().b.getState().getCustomUserAttribute().trim().isEmpty()) {
                l(f.g().b.getState().getCustomUserAttribute(), false);
            }
        }
    }

    public void i(String str) {
        if (f.g().b != null) {
            f.g().b.x = str;
        }
    }

    public void l() {
        WeakReference<V> weakReference;
        l lVar;
        com.instabug.bug.model.a aVar = f.g().b;
        if (aVar != null && (weakReference = this.view) != null && (lVar = (l) weakReference.get()) != null) {
            lVar.c(aVar.b());
        }
    }

    public void n() {
        WeakReference<V> weakReference;
        if (!this.x && (weakReference = this.view) != null) {
            l lVar = (l) weakReference.get();
            if (f.g().b == null || !f.g().b.a2 || f.g().b.b2 != a.c.IN_PROGRESS) {
                f.g().e();
                i0.j.b.n.c b2 = i0.j.b.n.c.b();
                Objects.requireNonNull(b2);
                InternalScreenRecordHelper.getInstance().init();
                k0.b.w.a aVar = b2.b;
                if (aVar == null || aVar.isDisposed()) {
                    b2.b = ScreenRecordingEventBus.getInstance().subscribe(new i0.j.b.n.b(b2));
                }
                if (lVar != null) {
                    lVar.finishActivity();
                }
                BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
                if (bugPlugin != null) {
                    bugPlugin.setState(2);
                    return;
                }
                return;
            }
            this.d = h.RECORD_VIDEO;
            if (lVar != null) {
                lVar.F();
            }
        }
    }

    public final void p(l lVar) {
        i0.j.b.o.a aVar;
        f.g().e();
        if (f.g().b != null) {
            f.g().b.Y1 = a.C0094a.IN_PROGRESS;
        }
        BugPlugin bugPlugin = (BugPlugin) InstabugCore.getXPlugin(BugPlugin.class);
        if (!(bugPlugin == null || bugPlugin.getAppContext() == null)) {
            bugPlugin.setState(2);
            SettingsManager.getInstance().setProcessingForeground(false);
            synchronized (i0.j.b.o.a.class) {
                if (i0.j.b.o.a.a == null) {
                    i0.j.b.o.a.a = new i0.j.b.o.a();
                }
                aVar = i0.j.b.o.a.a;
            }
            Context appContext = bugPlugin.getAppContext();
            synchronized (aVar) {
                aVar.b = new WeakReference<>(appContext);
                aVar.c.init(aVar);
            }
        }
        if (lVar != null) {
            lVar.finishActivity();
        }
    }

    public void q(String str) {
        if (f.g().b != null && f.g().b.getState() != null) {
            f.g().b.getState().setCustomUserAttribute(str);
        }
    }

    public final void r() {
        this.q++;
        CompositeDisposable compositeDisposable = this.c;
        if (compositeDisposable != null) {
            compositeDisposable.add(ViewHierarchyInspectorEventBus.getInstance().getEventObservable().t(new b(), new C0096c(), k0.b.z.b.a.c, k0.b.z.b.a.d));
        }
    }

    public void s() {
        WeakReference<V> weakReference;
        l lVar;
        String str;
        boolean z;
        boolean z2;
        boolean z3;
        if (!this.x && (weakReference = this.view) != null && (lVar = (l) weakReference.get()) != null) {
            if (f.g().b == null) {
                InstabugSDKLogger.e("BaseReportingPresenter", "BUG WAS NULL - Recreate a new bug");
                if (((Fragment) lVar.getViewContext()).getContext() != null) {
                    f.g().c(((Fragment) lVar.getViewContext()).getContext());
                } else {
                    InstabugSDKLogger.e("BaseReportingPresenter", "Couldn't create the Bug due to Null context");
                }
            }
            if (f.g().b != null && f.g().b.a2 && f.g().b.b2 == a.c.IN_PROGRESS) {
                this.d = h.SEND_BUG;
                lVar.F();
            } else if (f.g().b == null || f.g().b.getState() != null) {
                l lVar2 = (l) this.view.get();
                com.instabug.bug.model.a aVar = f.g().b;
                String str2 = null;
                if (aVar == null || aVar.getState() == null) {
                    str = null;
                } else {
                    str = aVar.getState().getUserEmail();
                    if (str != null) {
                        str = str.trim();
                        InstabugSDKLogger.d("BaseReportingPresenter", "checkUserEmailValid :" + str);
                    }
                }
                if ((str == null || str.isEmpty()) && lVar2 != null) {
                    str = lVar2.w().trim();
                    f(str);
                }
                Objects.requireNonNull(i0.j.b.s.a.h());
                if (!i0.j.b.s.b.a().j || !i0.j.b.s.a.h().g() || ((str != null && Patterns.EMAIL_ADDRESS.matcher(str.trim()).matches()) || lVar2 == null)) {
                    z = true;
                } else {
                    String placeHolder = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.INVALID_EMAIL_MESSAGE, ((Fragment) lVar2.getViewContext()).getString(R.string.instabug_err_invalid_email));
                    InstabugSDKLogger.d("BaseReportingPresenter", "checkUserEmailValid failed with email:" + str);
                    lVar2.D0(placeHolder);
                    z = false;
                }
                if (z) {
                    if (InstabugCore.isFeatureAvailable(Feature.REPORT_PHONE_NUMBER)) {
                        l lVar3 = (l) this.view.get();
                        if (lVar3 != null) {
                            String n = lVar3.n();
                            z3 = (n == null || n.trim().isEmpty()) ? true : Pattern.compile("^[+]*([0-1]{0,3}\\s?)?([0-9]{1}[\\s\\-])?((\\([0-9]{3}\\))|[0-9]{3})[\\s\\-]?[0-9]{3}[\\s\\-]?[0-9]{4}$").matcher(n.trim()).matches();
                        } else {
                            z3 = false;
                        }
                        if (z3) {
                            String n2 = lVar.n();
                            i0.j.b.s.a h2 = i0.j.b.s.a.h();
                            String encodeToString = Base64.encodeToString(n2.getBytes(Charset.forName(FileEncryptionUtil.ENCODING_UTF_8)), 2);
                            Objects.requireNonNull(h2);
                            i0.j.b.s.c a2 = i0.j.b.s.c.a();
                            a2.c.putString("ib_e_pn", encodeToString);
                            a2.c.apply();
                            String n3 = lVar.n();
                            if (!(f.g().b == null || f.g().b.getState() == null)) {
                                f.g().b.getState().setCustomUserAttribute(n3);
                            }
                        } else {
                            lVar.A(lVar.getContext().getString(R.string.ib_error_phone_number));
                            return;
                        }
                    }
                    l lVar4 = (l) this.view.get();
                    if (f.g().b != null) {
                        str2 = f.g().b.x;
                    }
                    Objects.requireNonNull(i0.j.b.s.a.h());
                    if (!i0.j.b.s.b.a().c || (!(str2 == null || str2.trim().length() == 0) || lVar4 == null)) {
                        z2 = true;
                    } else {
                        String placeHolder2 = PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.INVALID_COMMENT_MESSAGE, ((Fragment) lVar4.getViewContext()).getString(R.string.instabug_err_invalid_comment));
                        InstabugSDKLogger.w("BaseReportingPresenter", "checkCommentValid comment field is invalid :" + str2);
                        lVar4.i(placeHolder2);
                        z2 = false;
                    }
                    if (z2) {
                        if (i0.j.b.s.a.h().g()) {
                            SettingsManager.getInstance().setEnteredEmail(lVar.w());
                        }
                        if (h()) {
                            lVar.K();
                        } else if (f.g().b == null || f.g().b.getState() != null) {
                            if (((Fragment) lVar.getViewContext()).getContext() != null) {
                                f g = f.g();
                                Context context = ((Fragment) lVar.getViewContext()).getContext();
                                Objects.requireNonNull(g);
                                ActionsOrchestrator.obtainOrchestrator(PoolProvider.newBackgroundExecutor()).addWorkerThreadAction(new i0.j.b.c(g, context)).orchestrate();
                                this.x = true;
                            } else {
                                InstabugSDKLogger.e("BaseReportingPresenter", "Couldn't commit the Bug due to Null context");
                            }
                            lVar.Z();
                        } else {
                            lVar.F();
                        }
                        lVar.L(false);
                    }
                }
            } else {
                this.d = h.SEND_BUG;
                lVar.F();
            }
        }
    }

    public void v(String str, String str2) {
        l lVar;
        if (!(str != null && !str.isEmpty() && InstabugCore.getFeatureState(Feature.REPRO_STEPS) == Feature.State.ENABLED && InstabugCore.isReproStepsScreenshotEnabled())) {
            WeakReference<V> weakReference = this.view;
            if (weakReference != null && (lVar = (l) weakReference.get()) != null) {
                lVar.b();
            }
        } else if (this.view != null) {
            StringBuilder U0 = i0.d.a.a.a.U0(str, " [", str2, "](", "#repro-steps-screen");
            U0.append(")");
            Spanned fromHtml = Html.fromHtml(i0.h.a.b.c.m.b.c(U0.toString(), "#repro-steps-screen", "repro-steps-disclaimer://instabug-disclaimer.com"), 0);
            l lVar2 = (l) this.view.get();
            if (lVar2 != null) {
                lVar2.E0(fromHtml);
            }
        }
    }

    public void k() {
        l lVar;
        if (!this.x) {
            f.g().c = true;
            WeakReference<V> weakReference = this.view;
            if (weakReference != null && (lVar = (l) weakReference.get()) != null) {
                PermissionsUtils.requestPermission((Fragment) lVar.getViewContext(), "android.permission.READ_EXTERNAL_STORAGE", 3873, (Runnable) null, (Runnable) new a(lVar));
            }
        }
    }

    public final void l(String str, boolean z) {
        l lVar;
        WeakReference<V> weakReference = this.view;
        if (weakReference != null && weakReference.get() != null && (lVar = (l) this.view.get()) != null) {
            if (z) {
                str = new String(Base64.decode(str, 2), Charset.forName(FileEncryptionUtil.ENCODING_UTF_8));
            }
            lVar.q(str);
        }
    }

    public void f(String str) {
        if (f.g().b != null && f.g().b.getState() != null) {
            f.g().b.getState().setUserEmail(str);
            InstabugSDKLogger.d("BaseReportingPresenter", "onEmailChanged set live bug with email:" + str);
        }
    }
}
