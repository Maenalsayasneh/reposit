package com.instabug.chat.ui.f;

import android.annotation.SuppressLint;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.projection.MediaProjectionManager;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.ListView;
import com.instabug.chat.R;
import com.instabug.chat.cache.ChatsCacheManager;
import com.instabug.chat.ui.e.c;
import com.instabug.chat.ui.f.a;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.core.ui.ToolbarFragment;
import com.instabug.library.internal.InstabugMediaProjectionIntent;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.video.RequestPermissionActivityLauncher;
import com.instabug.library.internal.video.VideoPlayerFragment;
import com.instabug.library.screenshot.ScreenshotProvider;
import com.instabug.library.ui.custom.InstabugAlertDialog;
import com.instabug.library.util.Colorizer;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.library.util.SystemServiceUtils;
import com.pubnub.api.builder.PubNubErrorBuilder;
import h0.o.a.k;
import i0.j.c.n.e.c;
import i0.j.c.n.e.h;
import i0.j.c.n.e.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED", "ERADICATE_FIELD_NOT_NULLABLE"})
/* compiled from: ChatFragment */
public class d extends ToolbarFragment<i0.j.c.n.e.b> implements c, View.OnClickListener, o.c, a.C0098a, c.a {
    public static final /* synthetic */ int c = 0;
    public String d;
    public o q;
    public EditText x;

    /* compiled from: ChatFragment */
    public class a implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    /* compiled from: ChatFragment */
    public class b implements DialogInterface.OnClickListener {
        public void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
        }
    }

    public void G(Uri uri, String str) {
        if (getActivity() != null && this.presenter != null) {
            h0.o.a.a aVar = new h0.o.a.a(getActivity().getSupportFragmentManager());
            int i = R.id.instabug_fragment_container;
            String e = ((i0.j.c.n.e.b) this.presenter).d().e();
            String str2 = ((i0.j.c.n.e.b) this.presenter).d().c;
            com.instabug.chat.ui.e.c cVar = new com.instabug.chat.ui.e.c();
            Bundle bundle = new Bundle();
            bundle.putString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, e);
            bundle.putString("chat_id", str2);
            bundle.putParcelable("image_uri", uri);
            bundle.putString("attachment_type", str);
            cVar.setArguments(bundle);
            aVar.m(i, cVar, "annotation_fragment_for_chat", 1);
            aVar.g("annotation_fragment_for_chat");
            aVar.h();
        }
    }

    public void I() {
        View view = this.rootView;
        if (view != null) {
            ((ImageButton) view.findViewById(R.id.instabug_btn_toolbar_left)).setImageResource(R.drawable.ibg_core_ic_close);
        }
    }

    public final void M() {
        MediaProjectionManager mediaProjectionManager;
        if (getActivity() != null && (mediaProjectionManager = (MediaProjectionManager) getActivity().getSystemService("media_projection")) != null) {
            if (InstabugMediaProjectionIntent.getMediaProjectionIntent() != null) {
                ((i0.j.c.n.e.b) this.presenter).J(InstabugMediaProjectionIntent.getMediaProjectionIntent());
            } else {
                startActivityForResult(mediaProjectionManager.createScreenCaptureIntent(), 3890);
            }
        }
    }

    public void c(List<com.instabug.chat.e.d> list) {
        P p = this.presenter;
        if (p != null) {
            o oVar = this.q;
            List<com.instabug.chat.e.c> c2 = ((i0.j.c.n.e.b) p).c(list);
            Objects.requireNonNull(oVar);
            Iterator<com.instabug.chat.e.c> it = c2.iterator();
            while (it.hasNext()) {
                if (it.next().e == null) {
                    it.remove();
                }
            }
            oVar.d = c2;
        }
    }

    public void c0(String str, Uri uri, String str2) {
        P p = this.presenter;
        if (p != null && str != null && str.equals(((i0.j.c.n.e.b) p).d().c)) {
            i0.j.c.n.e.b bVar = (i0.j.c.n.e.b) this.presenter;
            bVar.L(bVar.C(bVar.d().c, ((i0.j.c.n.e.b) this.presenter).G(uri, str2)));
        }
    }

    public void d() {
        if (getActivity() != null) {
            InstabugAlertDialog.showAlertDialog(getActivity(), getString(com.instabug.library.R.string.instabug_str_video_length_limit_warning_title), getString(com.instabug.library.R.string.instabug_str_video_length_limit_warning_message), getString(R.string.instabug_str_ok), (String) null, new b(), (DialogInterface.OnClickListener) null);
        }
    }

    public void f() {
        if (getActivity() != null) {
            RequestPermissionActivityLauncher.start(getActivity(), false, false, (ScreenshotProvider.ScreenshotCapturingListener) null);
        }
    }

    public void g() {
        View view = this.rootView;
        if (view != null) {
            view.findViewById(R.id.instabug_btn_attach).setVisibility(8);
        }
    }

    public int getContentLayout() {
        return R.layout.instabug_fragment_chat;
    }

    public String getTitle() {
        com.instabug.chat.e.b chat = ChatsCacheManager.getChat(this.d);
        if (chat != null) {
            return chat.e();
        }
        return getString(R.string.instabug_str_empty);
    }

    public void h() {
        View view = this.rootView;
        if (view != null) {
            ImageView imageView = (ImageView) view.findViewById(R.id.instabug_btn_attach);
            Colorizer.applyPrimaryColorTint(imageView);
            imageView.setOnClickListener(this);
        }
    }

    public void i(String str) {
        if (getActivity() != null) {
            SystemServiceUtils.hideInputMethod(getActivity());
            h0.o.a.a aVar = new h0.o.a.a(getActivity().getSupportFragmentManager());
            aVar.m(R.id.instabug_fragment_container, VideoPlayerFragment.newInstance(str), VideoPlayerFragment.TAG, 1);
            aVar.g(VideoPlayerFragment.TAG);
            aVar.h();
        }
    }

    @SuppressLint({"ERADICATE_PARAMETER_NOT_NULLABLE"})
    public void initContentViews(View view, Bundle bundle) {
        view.findViewById(R.id.instabug_btn_toolbar_right).setVisibility(8);
        ListView listView = (ListView) view.findViewById(R.id.instabug_lst_messages);
        EditText editText = (EditText) view.findViewById(R.id.instabug_edit_text_new_message);
        this.x = editText;
        editText.setHint(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.CONVERSATION_TEXT_FIELD_HINT, getString(R.string.instabug_str_sending_message_hint)));
        this.x.setInputType(16385);
        ImageView imageView = (ImageView) view.findViewById(R.id.instabug_btn_send);
        if (getContext() != null) {
            imageView.setImageDrawable(Colorizer.getPrimaryColorTintedDrawable(h0.i.b.a.getDrawable(getContext(), R.drawable.ibg_core_ic_send)));
        }
        imageView.setOnClickListener(this);
        o oVar = new o(new ArrayList(), getActivity(), listView, this);
        this.q = oVar;
        listView.setAdapter(oVar);
        int i = R.id.instabug_btn_toolbar_left;
        if (view.findViewById(i) != null) {
            view.findViewById(i).setTag(R.id.TAG_BTN_BACK, "instabug_btn_back");
        }
    }

    public void n() {
        if (getActivity() != null) {
            InstabugAlertDialog.showAlertDialog(getActivity(), getString(R.string.instabug_str_bugreport_file_size_limit_warning_title), getString(R.string.instabug_str_bugreport_file_size_limit_warning_message, 50L), getString(R.string.instabug_str_ok), (String) null, new a(), (DialogInterface.OnClickListener) null);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        P p = this.presenter;
        if (p != null) {
            ((i0.j.c.n.e.b) p).K(i, i2, intent);
        }
    }

    public void onClick(View view) {
        if (view.getId() == R.id.instabug_btn_send) {
            String obj = this.x.getText().toString();
            if (!TextUtils.isEmpty(obj.trim())) {
                P p = this.presenter;
                if (p != null) {
                    i0.j.c.n.e.b bVar = (i0.j.c.n.e.b) p;
                    bVar.L(bVar.v(bVar.d().c, obj));
                }
                this.x.setText("");
            }
        } else if (view.getId() == R.id.instabug_btn_attach && getActivity() != null) {
            SystemServiceUtils.hideInputMethod(getActivity());
            if (getActivity() != null && this.presenter != null) {
                h0.o.a.a aVar = new h0.o.a.a(getActivity().getSupportFragmentManager());
                int i = R.id.instabug_fragment_container;
                a aVar2 = new a();
                aVar2.x = this;
                aVar.m(i, aVar2, "attachments_bottom_sheet_fragment", 1);
                aVar.g("attachments_bottom_sheet_fragment");
                aVar.h();
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
        if (getArguments() != null) {
            this.d = getArguments().getString("chat_number");
        }
        this.presenter = new h(this);
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.x = null;
        P p = this.presenter;
        if (p != null) {
            ((i0.j.c.n.e.b) p).c();
        }
    }

    public void onDoneButtonClicked() {
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        if (iArr.length <= 0 || iArr[0] != 0) {
            if (i == 163) {
                M();
            }
        } else if (i == 162) {
            P p = this.presenter;
            if (p != null) {
                ((i0.j.c.n.e.b) p).o();
            }
        } else if (i != 163) {
            super.onRequestPermissionsResult(i, strArr, iArr);
        } else {
            M();
        }
    }

    public void onStart() {
        P p;
        super.onStart();
        P p2 = this.presenter;
        if (p2 != null) {
            ((i0.j.c.n.e.b) p2).n();
        }
        com.instabug.chat.e.a aVar = null;
        if (getArguments() != null) {
            aVar = (com.instabug.chat.e.a) getArguments().getSerializable("attachment");
        }
        if (!(aVar == null || (p = this.presenter) == null)) {
            ((i0.j.c.n.e.b) p).I(aVar);
        }
        if (getArguments() != null) {
            getArguments().clear();
        }
    }

    public void onStop() {
        super.onStop();
        P p = this.presenter;
        if (p != null) {
            ((i0.j.c.n.e.b) p).g();
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        P p = this.presenter;
        if (p != null) {
            ((i0.j.c.n.e.b) p).i(this.d);
        }
    }

    public void t() {
        Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("*/*");
        intent.putExtra("android.intent.extra.MIME_TYPES", new String[]{"image/*", "video/*"});
        startActivityForResult(Intent.createChooser(intent, getString(R.string.instabug_str_pick_media_chooser_title)), PubNubErrorBuilder.PNERR_MESSAGE_TIMETOKEN_MISSING);
    }

    public void t0(String str, Uri uri) {
        k activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    public void u() {
        View view = this.rootView;
        if (view != null) {
            int i = R.id.instabug_btn_toolbar_left;
            ((ImageButton) view.findViewById(i)).setImageResource(R.drawable.ibg_core_ic_back);
            this.rootView.findViewById(i).setRotation((float) getResources().getInteger(R.integer.instabug_icon_lang_rotation));
        }
    }

    public void w() {
        this.q.notifyDataSetChanged();
    }

    public void f(String str) {
        if (getActivity() != null) {
            SystemServiceUtils.hideInputMethod(getActivity());
            h0.o.a.a aVar = new h0.o.a.a(getActivity().getSupportFragmentManager());
            int i = R.id.instabug_fragment_container;
            f fVar = new f();
            Bundle bundle = new Bundle();
            bundle.putString("img_url", str);
            fVar.setArguments(bundle);
            aVar.m(i, fVar, "image_attachment_viewer_fragment", 1);
            aVar.g("image_attachment_viewer_fragment");
            aVar.h();
        }
    }
}
