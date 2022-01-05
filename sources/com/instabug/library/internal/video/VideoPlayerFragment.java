package com.instabug.library.internal.video;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.VideoView;
import com.instabug.library.Feature;
import com.instabug.library.InstabugBaseFragment;
import com.instabug.library.InstabugCustomTextPlaceHolder;
import com.instabug.library.R;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.PlaceHolderUtils;
import h0.b.a.e;
import h0.o.a.k;
import i0.j.e.l0.m.h;
import i0.j.e.z;

public class VideoPlayerFragment extends InstabugBaseFragment implements h.a {
    public static final String TAG = "VideoPlayerFragment";
    private static final String VIDEO_PATH = "video.uri";
    /* access modifiers changed from: private */
    public h mediaControls;
    /* access modifiers changed from: private */
    public int position = 0;
    /* access modifiers changed from: private */
    public ProgressDialog progressDialog;
    private String videoUri;
    /* access modifiers changed from: private */
    public VideoView videoView;
    private View videoViewToolbar;

    public class a implements View.OnClickListener {
        public a() {
        }

        public void onClick(View view) {
            if (VideoPlayerFragment.this.getActivity() != null) {
                VideoPlayerFragment.this.getActivity().onBackPressed();
            }
        }
    }

    public class b implements MediaPlayer.OnPreparedListener {
        public b() {
        }

        @SuppressLint({"NULL_DEREFERENCE"})
        public void onPrepared(MediaPlayer mediaPlayer) {
            VideoPlayerFragment.this.progressDialog.dismiss();
            VideoPlayerFragment.this.videoView.seekTo(VideoPlayerFragment.this.position);
            if (VideoPlayerFragment.this.position == 0) {
                VideoPlayerFragment.this.videoView.start();
                VideoPlayerFragment.this.mediaControls.show();
                return;
            }
            VideoPlayerFragment.this.videoView.pause();
        }
    }

    public class c implements MediaPlayer.OnErrorListener {
        public c() {
        }

        @SuppressLint({"NULL_DEREFERENCE"})
        public boolean onError(MediaPlayer mediaPlayer, int i, int i2) {
            VideoPlayerFragment.this.progressDialog.dismiss();
            return false;
        }
    }

    public static VideoPlayerFragment newInstance(String str) {
        VideoPlayerFragment videoPlayerFragment = new VideoPlayerFragment();
        Bundle bundle = new Bundle();
        bundle.putString(VIDEO_PATH, str);
        videoPlayerFragment.setArguments(bundle);
        return videoPlayerFragment;
    }

    private void showToolbar(boolean z) {
        h0.b.a.a supportActionBar;
        k activity = getActivity();
        if (activity != null && (supportActionBar = ((e) activity).getSupportActionBar()) != null) {
            if (z) {
                supportActionBar.w();
            } else {
                supportActionBar.f();
            }
        }
    }

    public void consumeNewInstanceSavedArguments() {
        this.videoUri = getArguments() == null ? null : getArguments().getString(VIDEO_PATH);
    }

    public int getLayout() {
        return R.layout.instabug_lyt_video_view;
    }

    @SuppressLint({"ERADICATE_RETURN_NOT_NULLABLE"})
    public String getTitle() {
        return PlaceHolderUtils.getPlaceHolder(InstabugCustomTextPlaceHolder.Key.VIDEO_PLAYER_TITLE, getString(R.string.instabug_str_video_player));
    }

    public void isVisible(boolean z) {
        View view = this.videoViewToolbar;
        if (view != null) {
            view.setVisibility(z ? 0 : 8);
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        k activity = getActivity();
        if (activity != null) {
            if (this.mediaControls == null) {
                this.mediaControls = new h(activity, this);
            }
            ProgressDialog progressDialog2 = new ProgressDialog(activity);
            this.progressDialog = progressDialog2;
            progressDialog2.setMessage("Loading...");
            this.progressDialog.setCancelable(false);
            this.progressDialog.show();
            try {
                VideoView videoView2 = this.videoView;
                if (!(videoView2 == null || this.videoUri == null)) {
                    videoView2.setMediaController(this.mediaControls);
                    this.videoView.setVideoURI(Uri.parse(this.videoUri));
                }
            } catch (Exception e) {
                if (e.getMessage() != null) {
                    InstabugSDKLogger.e(TAG, e.getMessage(), e);
                } else {
                    InstabugSDKLogger.e(TAG, e.toString(), e);
                }
            }
            VideoView videoView3 = this.videoView;
            if (videoView3 != null) {
                videoView3.requestFocus();
                this.videoView.setOnPreparedListener(new b());
                this.videoView.setOnErrorListener(new c());
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        showToolbar(true);
    }

    public void onDestroyView() {
        k activity;
        View findViewById;
        this.mediaControls = null;
        this.videoView = null;
        this.videoViewToolbar = null;
        super.onDestroyView();
        if (z.j().h(Feature.WHITE_LABELING) == Feature.State.DISABLED && (activity = getActivity()) != null && (findViewById = activity.findViewById(R.id.instabug_pbi_footer)) != null) {
            findViewById.setVisibility(0);
        }
    }

    public void onResume() {
        super.onResume();
        showToolbar(false);
    }

    public void onViewCreated(View view, Bundle bundle) {
        k activity;
        View findViewById;
        super.onViewCreated(view, bundle);
        this.videoView = (VideoView) view.findViewById(R.id.video_view);
        View findViewById2 = view.findViewById(R.id.ib_core_toolbar_video);
        this.videoViewToolbar = findViewById2;
        if (findViewById2 != null) {
            findViewById2.setOnClickListener(new a());
        }
        if (z.j().h(Feature.WHITE_LABELING) == Feature.State.DISABLED && (activity = getActivity()) != null && (findViewById = activity.findViewById(R.id.instabug_pbi_footer)) != null) {
            findViewById.setVisibility(8);
        }
    }

    public void restoreState(Bundle bundle) {
        int i = bundle.getInt("Position");
        this.position = i;
        VideoView videoView2 = this.videoView;
        if (videoView2 != null) {
            videoView2.seekTo(i);
        }
    }

    public void saveState(Bundle bundle) {
        VideoView videoView2 = this.videoView;
        if (videoView2 != null) {
            bundle.putInt("Position", videoView2.getCurrentPosition());
            this.videoView.pause();
        }
    }
}
