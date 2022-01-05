package com.instabug.chat.ui.f;

import android.annotation.SuppressLint;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.instabug.chat.ChatPlugin;
import com.instabug.chat.R;
import com.instabug.library.FragmentVisibilityChangedListener;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugBaseFragment;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.video.InternalScreenRecordHelper;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.PermissionsUtils;
import com.instabug.library.util.PlaceHolderUtils;
import com.instabug.library.util.ResourcesUtils;
import com.pubnub.api.builder.PubNubErrorBuilder;
import i0.j.c.i.c;
import i0.j.c.n.e.b;
import i0.j.c.n.e.d;
import i0.j.c.n.e.e;
import java.util.Objects;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED"})
/* compiled from: AttachmentsBottomSheetFragment */
public class a extends InstabugBaseFragment implements View.OnClickListener, FragmentVisibilityChangedListener {
    public AppCompatImageView c;
    public AppCompatImageView d;
    public AppCompatImageView q;
    public C0098a x;

    /* renamed from: com.instabug.chat.ui.f.a$a  reason: collision with other inner class name */
    /* compiled from: AttachmentsBottomSheetFragment */
    public interface C0098a {
    }

    public final void b() {
        if (getActivity() != null) {
            h0.o.a.a aVar = new h0.o.a.a(getActivity().getSupportFragmentManager());
            aVar.n(this);
            aVar.h();
            FragmentManager supportFragmentManager = getActivity().getSupportFragmentManager();
            supportFragmentManager.A(new FragmentManager.n("attachments_bottom_sheet_fragment", -1, 1), false);
        }
    }

    public void consumeNewInstanceSavedArguments() {
    }

    public int getLayout() {
        return R.layout.instabug_fragment_attachments_bottom_sheet;
    }

    public String getTitle() {
        return getString(com.instabug.library.R.string.instabug_str_empty);
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.instabug_attach_screenshot) {
            b();
            P p = ((d) this.x).presenter;
            if (p != null) {
                ((b) p).a();
            }
        } else if (id == R.id.instabug_attach_gallery_image) {
            b();
            d dVar = (d) this.x;
            Objects.requireNonNull(dVar);
            PermissionsUtils.requestPermission((Fragment) dVar, "android.permission.READ_EXTERNAL_STORAGE", (int) PubNubErrorBuilder.PNERR_MESSAGE_ACTION_TIMETOKEN_MISSING, (Runnable) new d(), (Runnable) new e(dVar));
            ChatPlugin chatPlugin = (ChatPlugin) InstabugCore.getXPlugin(ChatPlugin.class);
            if (chatPlugin != null) {
                chatPlugin.setState(2);
            }
        } else if (id == R.id.instabug_attach_video) {
            b();
            d dVar2 = (d) this.x;
            Objects.requireNonNull(dVar2);
            if (c.a == null) {
                c.a = new c();
            }
            Objects.requireNonNull(c.a);
            if (!InternalScreenRecordHelper.getInstance().isRecording()) {
                if (dVar2.getActivity() == null) {
                    return;
                }
                if (h0.i.b.a.checkSelfPermission(dVar2.getActivity(), "android.permission.RECORD_AUDIO") != 0) {
                    dVar2.requestPermissions(new String[]{"android.permission.RECORD_AUDIO"}, PubNubErrorBuilder.PNERR_HISTORY_MESSAGE_ACTIONS_MULTIPLE_CHANNELS);
                } else {
                    dVar2.M();
                }
            } else if (dVar2.getContext() != null) {
                Toast.makeText(dVar2.getContext(), R.string.instabug_str_video_encoder_busy, 0).show();
            }
        } else if (id == R.id.instabug_attachments_bottom_sheet_dim_view) {
            b();
        }
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.c = (AppCompatImageView) view.findViewById(R.id.instabug_attach_screenshot_image_view);
        this.d = (AppCompatImageView) view.findViewById(R.id.instabug_attach_video_image_view);
        this.q = (AppCompatImageView) view.findViewById(R.id.instabug_attach_gallery_image_view);
        if (i0.j.c.l.a.l().isScreenshotEnabled()) {
            view.findViewById(R.id.instabug_attach_screenshot).setOnClickListener(this);
        } else {
            view.findViewById(R.id.instabug_attach_screenshot).setVisibility(8);
        }
        if (i0.j.c.l.a.l().isImageFromGalleryEnabled()) {
            view.findViewById(R.id.instabug_attach_gallery_image).setOnClickListener(this);
        } else {
            view.findViewById(R.id.instabug_attach_gallery_image).setVisibility(8);
        }
        if (i0.j.c.l.a.l().isScreenRecordingEnabled()) {
            view.findViewById(R.id.instabug_attach_video).setOnClickListener(this);
        } else {
            view.findViewById(R.id.instabug_attach_video).setVisibility(8);
        }
        view.findViewById(R.id.instabug_attachments_bottom_sheet_dim_view).setOnClickListener(this);
        ((TextView) view.findViewById(R.id.instabug_attach_gallery_image_text)).setText(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.ADD_IMAGE_FROM_GALLERY, getString(com.instabug.library.R.string.instabug_str_pick_media_from_gallery)));
        ((TextView) view.findViewById(R.id.instabug_attach_screenshot_text)).setText(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.ADD_EXTRA_SCREENSHOT, getString(com.instabug.library.R.string.instabug_str_take_screenshot)));
        ((TextView) view.findViewById(R.id.instabug_attach_video_text)).setText(PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.ADD_VIDEO, getString(com.instabug.library.R.string.instabug_str_record_video)));
        View findViewById = view.findViewById(R.id.instabug_attachments_actions_bottom_sheet);
        findViewById.setAlpha(0.0f);
        findViewById.post(new i0.j.c.n.e.a(findViewById));
        try {
            if (getContext() != null) {
                this.c.setImageDrawable(ResourcesUtils.getDrawable(R.drawable.ibg_core_ic_capture_screenshot, getContext()));
                this.d.setImageDrawable(ResourcesUtils.getDrawable(R.drawable.ibg_core_ic_record_video, getContext()));
                this.q.setImageDrawable(ResourcesUtils.getVectorDrawable(R.drawable.ibg_core_ic_attach_gallery_media, getContext()));
                int color = h0.i.b.a.getColor(getContext(), Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeDark ? R.color.instabug_theme_tinting_color_dark : R.color.instabug_theme_tinting_color_light);
                this.q.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                this.d.setColorFilter(color, PorterDuff.Mode.SRC_IN);
                this.c.setColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
        } catch (Exception e) {
            StringBuilder P0 = i0.d.a.a.a.P0("Failed to inflate view with exception: ");
            P0.append(e.getMessage());
            InstabugSDKLogger.e(this, P0.toString(), e);
        }
    }

    public void onVisibilityChanged(boolean z) {
        InstabugSDKLogger.d(this, "Is visible " + z);
    }

    public void restoreState(Bundle bundle) {
    }

    public void saveState(Bundle bundle) {
    }
}
