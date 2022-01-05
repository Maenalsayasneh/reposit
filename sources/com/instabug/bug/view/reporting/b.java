package com.instabug.bug.view.reporting;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.media.projection.MediaProjectionManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;
import android.text.Editable;
import android.text.Spanned;
import android.text.TextWatcher;
import android.text.method.LinkMovementMethod;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.instabug.bug.R;
import com.instabug.library.Feature;
import com.instabug.library.FragmentVisibilityChangedListener;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.core.ui.InstabugBaseFragment;
import com.instabug.library.internal.InstabugMediaProjectionIntent;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.internal.video.RequestPermissionActivityLauncher;
import com.instabug.library.model.Attachment;
import com.instabug.library.model.State;
import com.instabug.library.screenshot.ScreenshotProvider;
import com.instabug.library.ui.custom.InstabugAlertDialog;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.DeviceStateProvider;
import com.instabug.library.util.DrawableUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.KeyboardUtils;
import com.instabug.library.util.LocaleUtils;
import com.instabug.library.util.OrientationUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.library.util.SimpleTextWatcher;
import com.instabug.library.view.ViewUtils;
import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;
import i0.j.b.t.c;
import java.util.List;
import java.util.Objects;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED", "ERADICATE_FIELD_NOT_NULLABLE"})
/* compiled from: BaseReportingFragment */
public abstract class b extends InstabugBaseFragment<i0.j.b.t.k.k> implements c.b, View.OnClickListener, i0.j.b.t.k.l {
    public static int c = -1;
    public RecyclerView Y1;
    public ScrollView Z1;
    public String a2;
    public BroadcastReceiver b2;
    public ProgressDialog c2;
    public EditText d;
    public i0.j.b.t.c d2;
    public n e2;
    public i0.j.b.t.e f2;
    public BottomSheetBehavior<View> g2;
    public ImageView h2;
    public int i2 = 0;
    public boolean j2 = false;
    public boolean k2 = false;
    public long l2 = 0;
    public Runnable m2;
    public Handler n2 = new Handler();
    public ViewStub o2;
    public EditText p2;
    public EditText q;
    public TextWatcher q2;
    public ViewTreeObserver.OnGlobalLayoutListener r2 = new g();
    public TextView x;
    public TextView y;

    /* compiled from: BaseReportingFragment */
    public class a implements Runnable {
        public a() {
        }

        public void run() {
            b bVar = b.this;
            int i = R.id.instabug_add_attachment;
            int i2 = b.c;
            if (bVar.findViewById(i) != null) {
                b.this.findViewById(i).setVisibility(8);
            }
            b.this.g2.N(3);
        }
    }

    /* renamed from: com.instabug.bug.view.reporting.b$b  reason: collision with other inner class name */
    /* compiled from: BaseReportingFragment */
    public class C0095b implements Runnable {
        public C0095b() {
        }

        public void run() {
            View findViewByPosition;
            RecyclerView recyclerView = b.this.Y1;
            if (recyclerView != null && recyclerView.getLayoutManager() != null && (findViewByPosition = b.this.Y1.getLayoutManager().findViewByPosition(b.this.d2.getItemCount() - 1)) != null && b.this.getActivity() != null) {
                Rect rect = new Rect();
                findViewByPosition.getGlobalVisibleRect(rect);
                DisplayMetrics displayMetrics = DeviceStateProvider.getDisplayMetrics(b.this.getActivity());
                b.this.e2.g0((((float) (rect.right + rect.left)) / 2.0f) / ((float) displayMetrics.widthPixels), (((float) (rect.top + rect.bottom)) / 2.0f) / ((float) displayMetrics.heightPixels));
            }
        }
    }

    /* compiled from: BaseReportingFragment */
    public class c implements Runnable {
        public c() {
        }

        public void run() {
            Objects.requireNonNull(i0.j.b.s.a.h());
            if (!i0.j.b.s.b.a().k) {
                b bVar = b.this;
                if (bVar.f2 != null) {
                    bVar.e2.o();
                }
            } else if (b.this.getFragmentManager() != null) {
                com.instabug.bug.view.e eVar = new com.instabug.bug.view.e();
                eVar.setArguments(new Bundle());
                eVar.P0(b.this.getFragmentManager(), "Instabug-Thanks-Fragment");
            }
        }
    }

    /* compiled from: BaseReportingFragment */
    public class d implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* compiled from: BaseReportingFragment */
    public class e implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* compiled from: BaseReportingFragment */
    public class f implements TextWatcher {
        public f() {
        }

        public void afterTextChanged(Editable editable) {
            b bVar = b.this;
            int i = b.c;
            P p = bVar.presenter;
            if (p != null && editable != null) {
                ((i0.j.b.t.k.k) p).q(editable.toString());
            }
        }

        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: BaseReportingFragment */
    public class g implements ViewTreeObserver.OnGlobalLayoutListener {
        public g() {
        }

        public void onGlobalLayout() {
            if (b.this.getActivity() != null) {
                b bVar = b.this;
                int i = b.c;
                if (bVar.rootView != null) {
                    Rect rect = new Rect();
                    b.this.getActivity().getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                    int height = b.this.getActivity().getWindow().getDecorView().getRootView().getHeight();
                    if (((double) (height - rect.bottom)) > ((double) height) * 0.15d) {
                        b bVar2 = b.this;
                        bVar2.j2 = true;
                        bVar2.g2.N(4);
                        b bVar3 = b.this;
                        bVar3.k2 = true;
                        int i2 = R.id.arrow_handler;
                        if (bVar3.findViewById(i2) != null) {
                            b.this.findViewById(i2).setVisibility(4);
                            return;
                        }
                        return;
                    }
                    b bVar4 = b.this;
                    bVar4.k2 = false;
                    bVar4.j2 = false;
                    if (bVar4.i2 > 1) {
                        int i3 = R.id.arrow_handler;
                        if (bVar4.findViewById(i3) != null) {
                            b.this.findViewById(i3).setVisibility(0);
                        }
                    }
                }
            }
        }
    }

    /* compiled from: BaseReportingFragment */
    public class h extends SimpleTextWatcher {
        public h() {
        }

        public void afterTextChanged(Editable editable) {
            EditText editText = b.this.d;
            if (editText != null) {
                String obj = editText.getText().toString();
                P p = b.this.presenter;
                if (p != null) {
                    ((i0.j.b.t.k.k) p).f(obj);
                }
            }
        }
    }

    /* compiled from: BaseReportingFragment */
    public class i extends SimpleTextWatcher {
        public i() {
        }

        public void afterTextChanged(Editable editable) {
            EditText editText;
            if (b.this.getActivity() != null) {
                b bVar = b.this;
                int i = b.c;
                P p = bVar.presenter;
                if (p != null && (editText = bVar.q) != null) {
                    ((i0.j.b.t.k.k) p).i(editText.getText().toString());
                }
            }
        }
    }

    /* compiled from: BaseReportingFragment */
    public class j implements Runnable {
        public j() {
        }

        public void run() {
            if (i0.j.b.f.g().b == null) {
                InstabugSDKLogger.e("BaseReportingFragment", "Bug is null");
            } else if (i0.j.b.f.g().b.e() < 4) {
                b bVar = b.this;
                int i = b.c;
                P p = bVar.presenter;
                if (p != null) {
                    ((i0.j.b.t.k.k) p).b();
                } else {
                    InstabugSDKLogger.e("BaseReportingFragment", "Presenter is null");
                }
            } else {
                b.N0(b.this);
            }
        }
    }

    /* compiled from: BaseReportingFragment */
    public class k implements Runnable {
        public k() {
        }

        public void run() {
            if (i0.j.b.f.g().b == null) {
                InstabugSDKLogger.e("BaseReportingFragment", "Bug is null");
            } else if (i0.j.b.f.g().b.e() < 4) {
                b bVar = b.this;
                int i = b.c;
                P p = bVar.presenter;
                if (p != null) {
                    ((i0.j.b.t.k.k) p).k();
                } else {
                    InstabugSDKLogger.e("BaseReportingFragment", "Presenter is null");
                }
            } else {
                b.N0(b.this);
            }
        }
    }

    /* compiled from: BaseReportingFragment */
    public class l implements Runnable {
        public l() {
        }

        public void run() {
            if (i0.j.b.f.g().b == null) {
                InstabugSDKLogger.e("BaseReportingFragment", "Bug is null");
            } else if (i0.j.b.f.g().b.e() >= 4 || !i0.j.b.s.a.h().a().isAllowScreenRecording()) {
                b.N0(b.this);
            } else {
                b bVar = b.this;
                int i = b.c;
                Objects.requireNonNull(bVar);
                Objects.requireNonNull(i0.j.b.n.c.b());
                boolean z = false;
                if (!InternalScreenRecordHelper.getInstance().isRecording()) {
                    if (bVar.getActivity() != null) {
                        if (h0.i.b.a.checkSelfPermission(bVar.getActivity(), "android.permission.RECORD_AUDIO") == 0) {
                            z = true;
                        }
                        if (!z) {
                            bVar.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, 177);
                        } else {
                            bVar.I0();
                        }
                    }
                } else if (bVar.getContext() != null) {
                    Toast.makeText(bVar.getContext(), R.string.instabug_str_video_encoder_busy, 0).show();
                }
            }
        }
    }

    /* compiled from: BaseReportingFragment */
    public class m implements Runnable {
        public m() {
        }

        public void run() {
            b bVar = b.this;
            int i = R.id.instabug_add_attachment;
            int i2 = b.c;
            if (bVar.findViewById(i) != null) {
                b bVar2 = b.this;
                BottomSheetBehavior<View> bottomSheetBehavior = bVar2.g2;
                if (bottomSheetBehavior.z == 4) {
                    bVar2.findViewById(i).setVisibility(8);
                    b.this.g2.N(3);
                    return;
                }
                bottomSheetBehavior.N(4);
            }
        }
    }

    /* compiled from: BaseReportingFragment */
    public interface n {
        void g0(float f, float f2);

        void o();
    }

    public static void N0(b bVar) {
        if (bVar.getActivity() != null) {
            InstabugAlertDialog.showAlertDialog(bVar.getActivity(), bVar.getString(R.string.instabug_str_alert_title_max_attachments), bVar.getString(R.string.instabug_str_alert_message_max_attachments), bVar.getString(R.string.instabug_str_ok), (String) null, (DialogInterface.OnClickListener) null, (DialogInterface.OnClickListener) null);
        }
    }

    public void A(String str) {
        EditText editText = this.p2;
        if (editText != null) {
            editText.requestFocus();
            this.p2.setError(str);
        }
    }

    public void C0() {
        if (getActivity() != null) {
            RequestPermissionActivityLauncher.start(getActivity(), false, false, (ScreenshotProvider.ScreenshotCapturingListener) null);
        }
    }

    public void D(Attachment attachment) {
        this.d2.b.remove(attachment);
        this.d2.notifyDataSetChanged();
    }

    public void D0(String str) {
        this.d.requestFocus();
        this.d.setError(str);
    }

    public void E0(Spanned spanned) {
        this.y.setVisibility(0);
        this.y.setText(spanned);
    }

    public void F() {
        ProgressDialog progressDialog = this.c2;
        if (progressDialog != null) {
            if (!progressDialog.isShowing()) {
                this.c2.show();
            }
        } else if (getActivity() != null) {
            ProgressDialog progressDialog2 = new ProgressDialog(getActivity());
            this.c2 = progressDialog2;
            progressDialog2.setCancelable(false);
            this.c2.setMessage(getResources().getString(R.string.instabug_str_dialog_message_preparing));
            this.c2.show();
        }
    }

    public void G0() {
        if (getActivity() != null) {
            InstabugAlertDialog.showAlertDialog(getActivity(), getString(R.string.instabug_str_bugreport_file_size_limit_warning_title), getString(R.string.instabug_str_bugreport_file_size_limit_warning_message, 50L), getString(R.string.instabug_str_ok), (String) null, new d(), (DialogInterface.OnClickListener) null);
        }
    }

    public final void I0() {
        MediaProjectionManager mediaProjectionManager;
        if (getActivity() != null && (mediaProjectionManager = (MediaProjectionManager) getActivity().getSystemService("media_projection")) != null) {
            if (InstabugMediaProjectionIntent.getMediaProjectionIntent() != null) {
                P p = this.presenter;
                if (p != null) {
                    ((i0.j.b.t.k.k) p).n();
                    return;
                }
                return;
            }
            startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 3890);
        }
    }

    public final void J0(ImageView imageView, int i3) {
        if (imageView != null) {
            imageView.getDrawable().setColorFilter(i3, PorterDuff.Mode.SRC_IN);
        }
    }

    public void K() {
        if (this.presenter != null && getFragmentManager() != null) {
            String o = ((i0.j.b.t.k.k) this.presenter).o();
            FragmentManager fragmentManager = getFragmentManager();
            int i3 = R.id.instabug_fragment_container;
            Bundle bundle = new Bundle();
            bundle.putString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, o);
            com.instabug.bug.view.h.c cVar = new com.instabug.bug.view.h.c();
            cVar.setArguments(bundle);
            h0.o.a.a aVar = new h0.o.a.a(fragmentManager);
            aVar.o(i3, cVar, "ExtraFieldsFragment");
            aVar.g("ExtraFieldsFragment");
            aVar.h();
        }
    }

    public final void K0(Runnable runnable) {
        Objects.requireNonNull(i0.j.b.n.c.b());
        if (InternalScreenRecordHelper.getInstance().isRecording()) {
            String str = getString(R.string.instabug_str_video_encoder_busy) + ", " + getString(R.string.instabug_str_please_wait);
            if (getContext() != null) {
                Toast.makeText(getContext(), str, 1).show();
                return;
            }
            return;
        }
        runnable.run();
    }

    public void L(boolean z) {
        if (getFragmentManager() != null) {
            FragmentManager fragmentManager = getFragmentManager();
            int i3 = R.id.instabug_fragment_container;
            if (fragmentManager.I(i3) instanceof FragmentVisibilityChangedListener) {
                ((FragmentVisibilityChangedListener) getFragmentManager().I(i3)).onVisibilityChanged(z);
            }
        }
    }

    public final void L0(int i3) {
        if (!i0.j.b.s.a.h().a().isAllowScreenRecording()) {
            int i4 = R.id.instabug_attach_video;
            if (findViewById(i4) != null) {
                findViewById(i4).setVisibility(8);
            }
            int i5 = R.id.ib_bug_attachment_collapsed_video_icon;
            if (findViewById(i5) != null) {
                findViewById(i5).setVisibility(8);
                return;
            }
            return;
        }
        int i6 = R.id.instabug_attach_video;
        if (findViewById(i6) != null) {
            findViewById(i6).setVisibility(i3);
        }
    }

    public abstract i0.j.b.t.k.k M0();

    public void R(String str) {
        this.d.setText(str);
    }

    public void T(Spanned spanned) {
        this.x.setVisibility(0);
        this.x.setText(spanned);
        this.x.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void Z() {
        if (getActivity() != null) {
            KeyboardUtils.hide(getActivity());
        }
        new Handler().postDelayed(new c(), 200);
    }

    public void a() {
        ProgressDialog progressDialog = this.c2;
        if (progressDialog != null && progressDialog.isShowing()) {
            this.c2.dismiss();
        }
    }

    public void b() {
        this.y.setVisibility(8);
    }

    public final void b0() {
        if (this.rootView != null) {
            int i3 = R.id.instabug_add_attachment;
            if (findViewById(i3) != null) {
                findViewById(i3).setVisibility(0);
            }
            if (i0.j.b.s.a.h().a().isAllowScreenRecording()) {
                L0(4);
            } else {
                L0(8);
            }
        }
    }

    public void c() {
        try {
            this.o2.inflate();
        } catch (IllegalStateException unused) {
        }
        this.p2 = (EditText) findViewById(R.id.instabug_edit_text_phone);
        View findViewById = findViewById(R.id.instabug_image_button_phone_info);
        if (findViewById != null) {
            findViewById.setOnClickListener(this);
        }
        f fVar = new f();
        this.q2 = fVar;
        EditText editText = this.p2;
        if (editText != null) {
            editText.addTextChangedListener(fVar);
        }
    }

    public void d() {
        String string = getString(R.string.instabug_str_pick_media_chooser_title);
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        startActivityForResult(Intent.createChooser(intent, string), 3862);
    }

    public final void f0() {
        if (this.rootView != null) {
            if (i0.j.b.s.a.h().a().isAllowScreenRecording()) {
                int i3 = R.id.instabug_add_attachment;
                if (findViewById(i3) != null) {
                    findViewById(i3).setVisibility(4);
                }
                L0(0);
                return;
            }
            int i4 = R.id.instabug_add_attachment;
            if (findViewById(i4) != null) {
                findViewById(i4).setVisibility(8);
            }
            L0(8);
        }
    }

    public /* bridge */ /* synthetic */ Activity getActivity() {
        return super.getActivity();
    }

    public int getLayout() {
        return R.layout.ibg_bug_frgament_reporting_layout;
    }

    public void i(String str) {
        this.q.requestFocus();
        this.q.setError(str);
    }

    public void i0() {
        if (getActivity() != null) {
            InstabugAlertDialog.showAlertDialog(getActivity(), getString(R.string.instabug_str_video_length_limit_warning_title), getString(R.string.instabug_str_video_length_limit_warning_message), getString(R.string.instabug_str_ok), (String) null, new e(), (DialogInterface.OnClickListener) null);
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void initViews(View view, Bundle bundle) {
        this.Z1 = (ScrollView) findViewById(R.id.ib_bug_scroll_view);
        this.q = (EditText) findViewById(R.id.instabug_edit_text_message);
        this.d = (EditText) findViewById(R.id.instabug_edit_text_email);
        this.Y1 = (RecyclerView) findViewById(R.id.instabug_lyt_attachments_list);
        this.x = (TextView) findViewById(R.id.instabug_text_view_disclaimer);
        this.y = (TextView) findViewById(R.id.instabug_text_view_repro_steps_disclaimer);
        this.o2 = (ViewStub) findViewById(R.id.instabug_viewstub_phone);
        View findViewById = findViewById(R.id.instabug_attachment_bottom_sheet);
        TextView textView = (TextView) findViewById(R.id.instabug_add_attachment_label);
        if (textView != null) {
            textView.setText(PlaceHolderUtils.getPlaceHolder(getContext(), InstabugCustomTextPlaceHolder.Key.REPORT_ADD_ATTACHMENT_HEADER, R.string.instabug_str_add_attachment));
        }
        ImageView imageView = (ImageView) findViewById(R.id.instabug_add_attachment_icon);
        ImageView imageView2 = (ImageView) findViewById(R.id.arrow_handler);
        this.h2 = imageView2;
        if (imageView2 != null) {
            imageView2.setRotation(0.0f);
            this.h2.setOnClickListener(this);
        }
        BottomSheetBehavior<View> H = BottomSheetBehavior.H(findViewById);
        this.g2 = H;
        H.M(ViewUtils.convertDpToPx(Instabug.getApplicationContext(), 100.0f));
        int i3 = R.id.instabug_add_attachment;
        if (findViewById(i3) != null) {
            findViewById(i3).setOnClickListener(this);
        }
        int i4 = R.id.ib_bottomsheet_arrow_layout;
        if (findViewById(i4) != null) {
            findViewById(i4).setOnClickListener(this);
        }
        if (imageView != null) {
            J0(imageView, Instabug.getPrimaryColor());
        }
        if (i0.j.b.s.a.h().a().isAllowScreenRecording()) {
            this.i2++;
            int i5 = R.id.instabug_attach_video;
            if (findViewById(i5) != null) {
                findViewById(i5).setOnClickListener(this);
            }
            ImageView imageView3 = (ImageView) findViewById(R.id.ib_bug_attachment_collapsed_video_icon);
            J0((ImageView) findViewById(R.id.instabug_attach_video_icon), Instabug.getPrimaryColor());
            if (getContext() != null) {
                J0(imageView3, AttrResolver.resolveAttributeColor(getContext(), R.attr.ibg_bug_add_attachment_icon_color));
            }
        } else {
            L0(8);
            int i6 = R.id.ib_bug_attachment_collapsed_video_icon;
            if (findViewById(i6) != null) {
                findViewById(i6).setVisibility(8);
            }
            int i7 = R.id.ib_bug_videorecording_separator;
            if (findViewById(i7) != null) {
                findViewById(i7).setVisibility(8);
            }
        }
        if (i0.j.b.s.a.h().a().isAllowTakeExtraScreenshot()) {
            this.i2++;
            int i8 = R.id.instabug_attach_screenshot;
            if (findViewById(i8) != null) {
                findViewById(i8).setOnClickListener(this);
            }
            ImageView imageView4 = (ImageView) findViewById(R.id.ib_bug_attachment_collapsed_screenshot_icon);
            J0((ImageView) findViewById(R.id.instabug_attach_screenshot_icon), Instabug.getPrimaryColor());
            if (getContext() != null) {
                J0(imageView4, AttrResolver.resolveAttributeColor(getContext(), R.attr.ibg_bug_add_attachment_icon_color));
            }
        } else {
            int i9 = R.id.instabug_attach_screenshot;
            if (findViewById(i9) != null) {
                findViewById(i9).setVisibility(8);
            }
            int i10 = R.id.ib_bug_attachment_collapsed_screenshot_icon;
            if (findViewById(i10) != null) {
                findViewById(i10).setVisibility(8);
            }
            int i11 = R.id.ib_bug_screenshot_separator;
            if (findViewById(i11) != null) {
                findViewById(i11).setVisibility(8);
            }
        }
        if (i0.j.b.s.a.h().a().isAllowAttachImageFromGallery()) {
            this.i2++;
            int i12 = R.id.instabug_attach_gallery_image;
            if (findViewById(i12) != null) {
                findViewById(i12).setOnClickListener(this);
            }
            ImageView imageView5 = (ImageView) findViewById(R.id.instabug_attach_gallery_image_icon);
            ImageView imageView6 = (ImageView) findViewById(R.id.ib_bug_attachment_collapsed_photo_library_icon);
            if (getContext() != null) {
                J0(imageView6, AttrResolver.resolveAttributeColor(getContext(), R.attr.ibg_bug_add_attachment_icon_color));
            }
            J0(imageView5, Instabug.getPrimaryColor());
        } else {
            int i13 = R.id.instabug_attach_gallery_image;
            if (findViewById(i13) != null) {
                findViewById(i13).setVisibility(8);
            }
            int i14 = R.id.ib_bug_attachment_collapsed_photo_library_icon;
            if (findViewById(i14) != null) {
                findViewById(i14).setVisibility(8);
            }
        }
        if (findViewById(i3) != null) {
            findViewById(i3).setVisibility(4);
        }
        if (this.i2 > 1) {
            BottomSheetBehavior<View> bottomSheetBehavior = this.g2;
            i0.j.b.t.k.f fVar = new i0.j.b.t.k.f(this);
            Objects.requireNonNull(bottomSheetBehavior);
            Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
            bottomSheetBehavior.J.clear();
            bottomSheetBehavior.J.add(fVar);
        } else {
            BottomSheetBehavior<View> bottomSheetBehavior2 = this.g2;
            i0.j.b.t.k.g gVar = new i0.j.b.t.k.g(this);
            Objects.requireNonNull(bottomSheetBehavior2);
            Log.w("BottomSheetBehavior", "BottomSheetBehavior now supports multiple callbacks. `setBottomSheetCallback()` removes all existing callbacks, including ones set internally by library authors, which may result in unintended behavior. This may change in the future. Please use `addBottomSheetCallback()` and `removeBottomSheetCallback()` instead to set your own callbacks.");
            bottomSheetBehavior2.J.clear();
            bottomSheetBehavior2.J.add(gVar);
        }
        BottomSheetBehavior<View> bottomSheetBehavior3 = this.g2;
        int i15 = c;
        if (i15 == -1) {
            i15 = 3;
        }
        bottomSheetBehavior3.N(i15);
        if (c == 4) {
            b0();
            this.g2.N(4);
            this.h2.setRotation(180.0f);
        } else {
            f0();
            this.h2.setRotation(0.0f);
        }
        int i16 = R.id.instabug_attach_gallery_image_label;
        if (findViewById(i16) != null) {
            ((TextView) findViewById(i16)).setText(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.ADD_IMAGE_FROM_GALLERY, getString(R.string.instabug_str_pick_media_from_gallery)));
        }
        int i17 = R.id.instabug_attach_screenshot_label;
        if (findViewById(i17) != null) {
            ((TextView) findViewById(i17)).setText(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.ADD_EXTRA_SCREENSHOT, getString(R.string.instabug_str_take_screenshot)));
        }
        int i18 = R.id.instabug_attach_video_label;
        if (findViewById(i18) != null) {
            ((TextView) findViewById(i18)).setText(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.ADD_VIDEO, getString(R.string.instabug_str_record_video)));
        }
        if (getActivity() != null && OrientationUtils.isInLandscape(getActivity())) {
            b0();
            this.g2.N(4);
            this.h2.setRotation(180.0f);
        }
        ImageView imageView7 = this.h2;
        if (imageView7 != null && this.i2 == 1) {
            imageView7.setVisibility(8);
            if (findViewById(i3) != null) {
                findViewById(i3).setVisibility(8);
            }
        }
        if (Instabug.getApplicationContext() != null) {
            this.Y1.setLayoutManager(new LinearLayoutManager(Instabug.getApplicationContext(), 0, false));
            this.d2 = new i0.j.b.t.c(Instabug.getApplicationContext(), (ColorFilter) null, this);
        }
        this.d.setHint(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.EMAIL_FIELD_HINT, getString(R.string.instabug_str_email_hint)));
        this.d.addTextChangedListener(new h());
        this.q.addTextChangedListener(new i());
        this.y.setOnClickListener(this);
        if (!i0.j.b.s.a.h().g()) {
            this.d.setVisibility(8);
        }
        P p = this.presenter;
        if (!(p == null || ((i0.j.b.t.k.k) p).a() == null)) {
            this.q.setHint(((i0.j.b.t.k.k) this.presenter).a());
        }
        String str = this.a2;
        if (str != null) {
            this.q.setText(str);
        }
        if (i0.j.b.s.a.h().g() && i0.j.b.f.g().b != null) {
            State state = i0.j.b.f.g().b.getState();
            if (state != null) {
                String userEmail = state.getUserEmail();
                if (userEmail != null && !userEmail.isEmpty()) {
                    this.d.setText(userEmail);
                }
            } else {
                P p3 = this.presenter;
                if (p3 != null) {
                    ((i0.j.b.t.k.k) p3).f();
                }
            }
        }
        P p4 = this.presenter;
        if (p4 != null) {
            ((i0.j.b.t.k.k) p4).v(PlaceHolderUtils.getPlaceHolder(getContext(), InstabugCustomTextPlaceHolder.Key.REPORT_REPRO_STEPS_DISCLAIMER_BODY, R.string.IBGReproStepsDisclaimerBody), PlaceHolderUtils.getPlaceHolder(getContext(), InstabugCustomTextPlaceHolder.Key.REPORT_REPRO_STEPS_DISCLAIMER_LINK, R.string.IBGReproStepsDisclaimerLink));
            ((i0.j.b.t.k.k) this.presenter).d();
        }
        if (getActivity() != null) {
            KeyboardUtils.hide(getActivity());
        }
    }

    public void m() {
        this.x.setVisibility(8);
    }

    @SuppressLint({"ERADICATE_INCONSISTENT_SUBCLASS_RETURN_ANNOTATION"})
    public String n() {
        EditText editText = this.p2;
        if (editText != null) {
            return editText.getText().toString();
        }
        return null;
    }

    public void onActivityResult(int i3, int i4, Intent intent) {
        super.onActivityResult(i3, i4, intent);
        P p = this.presenter;
        if (p != null) {
            ((i0.j.b.t.k.k) p).E(i3, i4, intent);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        try {
            this.e2 = (n) context;
            if (getActivity() instanceof i0.j.b.t.e) {
                this.f2 = (i0.j.b.t.e) context;
            }
        } catch (ClassCastException unused) {
            throw new ClassCastException(getClass().getSimpleName() + " must implement BaseReportingFragment.Callbacks");
        }
    }

    public void onClick(View view) {
        if (SystemClock.elapsedRealtime() - this.l2 >= 1000) {
            this.l2 = SystemClock.elapsedRealtime();
            int id = view.getId();
            if (id == R.id.instabug_attach_screenshot) {
                K0(new j());
            } else if (id == R.id.instabug_attach_gallery_image) {
                K0(new k());
            } else if (id == R.id.instabug_attach_video) {
                K0(new l());
            } else if (id == R.id.ib_bottomsheet_arrow_layout || id == R.id.arrow_handler) {
                if (getActivity() != null) {
                    KeyboardUtils.hide(getActivity());
                }
                new Handler().postDelayed(new m(), 200);
            } else if (id == R.id.instabug_add_attachment) {
                if (this.g2.z == 4) {
                    if (getActivity() != null) {
                        KeyboardUtils.hide(getActivity());
                    }
                    new Handler().postDelayed(new a(), 200);
                }
            } else if (id == R.id.instabug_text_view_repro_steps_disclaimer) {
                i0.j.b.t.e eVar = this.f2;
                if (eVar != null) {
                    eVar.t();
                }
            } else if (id == R.id.instabug_image_button_phone_info && getActivity() != null) {
                InstabugAlertDialog.showAlertDialog(getActivity(), (String) null, getString(R.string.ib_alert_phone_number_msg), getString(R.string.instabug_str_ok), (String) null, new i0.j.b.t.k.c(), (DialogInterface.OnClickListener) null);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        postponeEnterTransition();
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.a2 = getArguments().getString("bug_message");
        }
        setHasOptionsMenu(true);
        this.b2 = new i0.j.b.t.k.e(this);
        if (this.presenter == null) {
            this.presenter = M0();
        }
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        menuInflater.inflate(R.menu.instabug_bug_reporting, menu);
        P p = this.presenter;
        if (p != null ? ((i0.j.b.t.k.k) p).h() : false) {
            menu.findItem(R.id.instabug_bugreporting_send).setVisible(false);
            int i3 = R.id.instabug_bugreporting_next;
            menu.findItem(i3).setVisible(true);
            if (getContext() != null && LocaleUtils.isRTL(Instabug.getLocale(getContext()))) {
                menu.findItem(i3).setIcon(DrawableUtils.getRotateDrawable(menu.findItem(i3).getIcon(), 180.0f));
                return;
            }
            return;
        }
        int i4 = R.id.instabug_bugreporting_send;
        menu.findItem(i4).setVisible(true);
        menu.findItem(R.id.instabug_bugreporting_next).setVisible(false);
        if (getContext() != null && LocaleUtils.isRTL(Instabug.getLocale(getContext()))) {
            menu.findItem(i4).setIcon(DrawableUtils.getRotateDrawable(menu.findItem(i4).getIcon(), 180.0f));
        }
    }

    @SuppressFBWarnings({"ST_WRITE_TO_STATIC_FROM_INSTANCE_METHOD"})
    public void onDestroy() {
        TextWatcher textWatcher;
        Handler handler;
        Runnable runnable = this.m2;
        if (!(runnable == null || (handler = this.n2) == null)) {
            handler.removeCallbacks(runnable);
            this.m2 = null;
        }
        EditText editText = this.p2;
        if (!(editText == null || (textWatcher = this.q2) == null)) {
            editText.removeTextChangedListener(textWatcher);
        }
        super.onDestroy();
        c = -1;
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.i2 = 0;
        this.x = null;
        this.d = null;
        this.q = null;
        this.p2 = null;
        this.o2 = null;
        this.y = null;
        this.Z1 = null;
        this.h2 = null;
        this.Y1 = null;
    }

    public void onDetach() {
        super.onDetach();
        this.f2 = null;
        this.e2 = null;
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        P p;
        if (SystemClock.elapsedRealtime() - this.l2 < 1000) {
            return false;
        }
        this.l2 = SystemClock.elapsedRealtime();
        if (menuItem.getItemId() == R.id.instabug_bugreporting_next && (p = this.presenter) != null) {
            ((i0.j.b.t.k.k) p).s();
        } else if (menuItem.getItemId() == R.id.instabug_bugreporting_send && this.presenter != null) {
            if (getFragmentManager() != null) {
                for (Fragment fragment : getFragmentManager().O()) {
                    if (fragment instanceof com.instabug.bug.view.h.c) {
                        return super.onOptionsItemSelected(menuItem);
                    }
                }
            }
            ((i0.j.b.t.k.k) this.presenter).s();
        } else if (menuItem.getItemId() == 16908332 && getActivity() != null) {
            getActivity().onBackPressed();
        }
        return false;
    }

    public void onRequestPermissionsResult(int i3, String[] strArr, int[] iArr) {
        if (iArr.length <= 0 || iArr[0] != 0) {
            if (i3 == 177) {
                I0();
            }
        } else if (i3 == 177) {
            I0();
        } else if (i3 != 3873) {
            super.onRequestPermissionsResult(i3, strArr, iArr);
        } else {
            d();
            i0.j.b.f.g().e();
        }
    }

    public void onResume() {
        super.onResume();
        if (getActivity() != null) {
            getActivity().getWindow().getDecorView().getViewTreeObserver().addOnGlobalLayoutListener(this.r2);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        P p = this.presenter;
        if (p != null) {
            ((i0.j.b.t.k.k) p).H(bundle);
        }
    }

    public void onStart() {
        P p;
        super.onStart();
        if (getActivity() != null && (p = this.presenter) != null) {
            ((i0.j.b.t.k.k) p).g();
            h0.s.a.a.a(getActivity()).b(this.b2, new IntentFilter("refresh.attachments"));
            ((i0.j.b.t.k.k) this.presenter).l();
        }
    }

    public void onStop() {
        P p;
        super.onStop();
        if (!(getActivity() == null || (p = this.presenter) == null)) {
            ((i0.j.b.t.k.k) p).c();
            h0.s.a.a.a(getActivity()).d(this.b2);
        }
        if (getActivity() != null) {
            getActivity().getWindow().getDecorView().getViewTreeObserver().removeOnGlobalLayoutListener(this.r2);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        P p;
        super.onViewCreated(view, bundle);
        if (getActivity() != null) {
            getActivity().getWindow().setSoftInputMode(16);
        }
        i0.j.b.t.e eVar = this.f2;
        if (eVar != null && (p = this.presenter) != null) {
            eVar.f(((i0.j.b.t.k.k) p).o());
        }
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        P p = this.presenter;
        if (p != null) {
            ((i0.j.b.t.k.k) p).F(bundle);
        }
    }

    public void q(String str) {
        EditText editText = this.p2;
        if (editText != null) {
            editText.setText(str);
        }
    }

    public String w() {
        return this.d.getText().toString();
    }

    public void c(List<Attachment> list) {
        boolean z;
        this.d2.b.clear();
        int i3 = -1;
        int i4 = 0;
        while (true) {
            z = true;
            if (i4 >= list.size()) {
                break;
            }
            if (list.get(i4).getType() != null) {
                if (list.get(i4).getType().equals(Attachment.Type.MAIN_SCREENSHOT) || list.get(i4).getType().equals(Attachment.Type.EXTRA_IMAGE) || list.get(i4).getType().equals(Attachment.Type.GALLERY_IMAGE) || list.get(i4).getType().equals(Attachment.Type.AUDIO) || list.get(i4).getType().equals(Attachment.Type.EXTRA_VIDEO) || list.get(i4).getType().equals(Attachment.Type.GALLERY_VIDEO) || list.get(i4).getType().equals(Attachment.Type.AUTO_SCREEN_RECORDING_VIDEO)) {
                    if (list.get(i4).getType().equals(Attachment.Type.GALLERY_VIDEO)) {
                        list.get(i4).setVideoEncoded(true);
                    }
                    this.d2.b.add(list.get(i4));
                }
                if ((list.get(i4).getType().equals(Attachment.Type.EXTRA_VIDEO) || list.get(i4).getType().equals(Attachment.Type.GALLERY_VIDEO)) && i0.j.b.f.g().b != null) {
                    i0.j.b.f.g().b.setHasVideo(true);
                }
            }
            i4++;
        }
        for (int i5 = 0; i5 < this.d2.b.size(); i5++) {
            if (this.d2.b.get(i5).getType() != null && (this.d2.b.get(i5).getType().equals(Attachment.Type.MAIN_SCREENSHOT) || this.d2.b.get(i5).getType().equals(Attachment.Type.GALLERY_IMAGE) || this.d2.b.get(i5).getType().equals(Attachment.Type.EXTRA_IMAGE))) {
                i3 = i5;
            }
        }
        i0.j.b.t.c cVar = this.d2;
        cVar.h = i3;
        this.Y1.setAdapter(cVar);
        this.d2.notifyDataSetChanged();
        if (InstabugCore.getFeatureState(Feature.MULTIPLE_ATTACHMENTS) == Feature.State.ENABLED) {
            Objects.requireNonNull(i0.j.b.s.a.h());
            if (!i0.j.b.s.b.a().b.isAllowTakeExtraScreenshot() && !i0.j.b.s.b.a().b.isAllowAttachImageFromGallery() && !i0.j.b.s.b.a().b.isAllowScreenRecording()) {
                z = false;
            }
            if (z) {
                int i6 = R.id.instabug_attachment_bottom_sheet;
                if (findViewById(i6) != null) {
                    findViewById(i6).setVisibility(0);
                }
                this.Y1.post(new C0095b());
                startPostponedEnterTransition();
            }
        }
        int i7 = R.id.instabug_attachment_bottom_sheet;
        if (findViewById(i7) != null) {
            findViewById(i7).setVisibility(8);
        }
        this.Y1.post(new C0095b());
        startPostponedEnterTransition();
    }
}
