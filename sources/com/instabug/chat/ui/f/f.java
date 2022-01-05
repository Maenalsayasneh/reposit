package com.instabug.chat.ui.f;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.URLUtil;
import android.widget.ProgressBar;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import com.instabug.chat.R;
import com.instabug.library.Feature;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.library.view.ScaleImageView;

@SuppressLint({"ERADICATE_FIELD_NOT_INITIALIZED", "ERADICATE_FIELD_NOT_NULLABLE"})
/* compiled from: ImageAttachmentViewerFragment */
public class f extends Fragment {
    public String c;
    public ProgressBar d;
    public ScaleImageView q;
    public float x;
    public float y;

    /* compiled from: ImageAttachmentViewerFragment */
    public class a implements Runnable {

        /* renamed from: com.instabug.chat.ui.f.f$a$a  reason: collision with other inner class name */
        /* compiled from: ImageAttachmentViewerFragment */
        public class C0099a implements BitmapUtils.OnBitmapReady {

            /* renamed from: com.instabug.chat.ui.f.f$a$a$a  reason: collision with other inner class name */
            /* compiled from: ImageAttachmentViewerFragment */
            public class C0100a implements Runnable {
                public final /* synthetic */ Bitmap c;

                public C0100a(Bitmap bitmap) {
                    this.c = bitmap;
                }

                public void run() {
                    f fVar = f.this;
                    ScaleImageView scaleImageView = fVar.q;
                    if (scaleImageView != null) {
                        Bitmap bitmap = this.c;
                        if (bitmap != null) {
                            scaleImageView.setImageBitmap(bitmap);
                        } else if (fVar.getActivity() != null) {
                            Toast.makeText(fVar.getActivity(), R.string.instabug_str_image_loading_error, 0).show();
                        }
                        if (fVar.d.getVisibility() == 0) {
                            fVar.d.setVisibility(8);
                        }
                    }
                }
            }

            public C0099a() {
            }

            public void onBitmapFailedToLoad() {
            }

            public void onBitmapReady(Bitmap bitmap) {
                PoolProvider.postMainThreadTask(new C0100a(bitmap));
            }
        }

        public a() {
        }

        public void run() {
            BitmapUtils.loadBitmapForAsset(f.this.getActivity(), f.this.c, AssetEntity.AssetType.IMAGE, new C0099a());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.c = getArguments().getString("img_url");
        } else if (bundle != null) {
            this.c = bundle.getString("img_url");
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.instabug_fragment_image_attachment_viewer, viewGroup, false);
        this.d = (ProgressBar) inflate.findViewById(R.id.instabug_attachment_progress_bar);
        this.q = (ScaleImageView) inflate.findViewById(R.id.instabug_img_attachment);
        if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == Feature.State.DISABLED && getActivity() != null) {
            getActivity().findViewById(R.id.instabug_pbi_footer).setVisibility(8);
        }
        return inflate;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (InstabugCore.getFeatureState(Feature.WHITE_LABELING) == Feature.State.DISABLED && getActivity() != null) {
            getActivity().findViewById(R.id.instabug_pbi_footer).setVisibility(0);
        }
        this.q = null;
        this.d = null;
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putString("img_url", this.c);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        if (getActivity() == null) {
            InstabugSDKLogger.e(this, "Null Activity");
            return;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getActivity().getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        int i = (int) ((((float) getActivity().getResources().getDisplayMetrics().densityDpi) / 160.0f) * 24.0f);
        this.x = (float) (displayMetrics.widthPixels - i);
        this.y = (float) (displayMetrics.heightPixels - i);
        if (URLUtil.isValidUrl(this.c)) {
            PoolProvider.postIOTask(new a());
        } else {
            BitmapUtils.loadBitmap(this.c, this.q, this.x, this.y);
        }
    }
}
