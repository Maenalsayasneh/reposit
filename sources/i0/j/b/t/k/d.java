package i0.j.b.t.k;

import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.ProgressBar;
import com.instabug.bug.R;
import com.instabug.bug.view.f.c;
import com.instabug.bug.view.reporting.b;
import com.instabug.library.internal.storage.cache.db.InstabugDbContract;
import com.instabug.library.internal.video.VideoPlayerFragment;
import com.instabug.library.model.Attachment;
import com.instabug.library.util.KeyboardUtils;
import h0.i.i.q;
import h0.o.a.a;
import java.io.File;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: BaseReportingFragment */
public class d implements Runnable {
    public final /* synthetic */ int c;
    public final /* synthetic */ View d;
    public final /* synthetic */ Attachment q;
    public final /* synthetic */ b x;

    public d(b bVar, int i, View view, Attachment attachment) {
        this.x = bVar;
        this.c = i;
        this.d = view;
        this.q = attachment;
    }

    public void run() {
        Runnable runnable;
        ImageView imageView;
        ProgressBar progressBar;
        int i = this.c;
        boolean z = false;
        if (i == R.id.instabug_attachment_img_item) {
            b bVar = this.x;
            int i2 = b.c;
            P p = bVar.presenter;
            if (p != null) {
                View view = this.d;
                Attachment attachment = this.q;
                String o = ((k) p).o();
                if (bVar.getActivity() != null) {
                    KeyboardUtils.hide(bVar.getActivity());
                }
                if (attachment.getLocalPath() != null) {
                    bVar.L(false);
                    a aVar = bVar.getFragmentManager() != null ? new a(bVar.getFragmentManager()) : null;
                    Uri fromFile = Uri.fromFile(new File(attachment.getLocalPath()));
                    int i3 = R.id.instabug_img_attachment;
                    if (!(bVar.findViewById(i3) == null || bVar.findViewById(i3) == null)) {
                        View findViewById = bVar.findViewById(i3);
                        AtomicInteger atomicInteger = q.a;
                        String transitionName = findViewById.getTransitionName();
                        if (!(transitionName == null || aVar == null)) {
                            aVar.f(view.findViewById(i3), transitionName);
                        }
                    }
                    if (!(bVar.findViewById(i3) == null || ((BitmapDrawable) ((ImageView) view.findViewById(i3)).getDrawable()) == null || aVar == null)) {
                        int i4 = R.id.instabug_fragment_container;
                        String name = attachment.getName();
                        c cVar = new c();
                        Bundle bundle = new Bundle();
                        bundle.putString(InstabugDbContract.FeatureRequestEntry.COLUMN_TITLE, o);
                        bundle.putParcelable("image_uri", fromFile);
                        bundle.putString("name", name);
                        cVar.setArguments(bundle);
                        aVar.o(i4, cVar, "annotation");
                        aVar.g("annotation");
                        aVar.h();
                    }
                }
            }
        } else if (i == R.id.instabug_btn_remove_attachment) {
            b bVar2 = this.x;
            int i5 = b.c;
            P p2 = bVar2.presenter;
            if (p2 != null) {
                ((k) p2).D(this.q);
            }
        } else if (i == R.id.instabug_attachment_video_item && this.q.getLocalPath() != null) {
            b bVar3 = this.x;
            int i6 = b.c;
            Objects.requireNonNull(bVar3);
            b bVar4 = this.x;
            String localPath = this.q.getLocalPath();
            if (localPath == null || bVar4.getFragmentManager() == null) {
                ProgressBar progressBar2 = bVar4.d2.e;
                if (!(progressBar2 != null && progressBar2.getVisibility() == 0) && (progressBar = bVar4.d2.e) != null) {
                    progressBar.setVisibility(0);
                }
                ImageView imageView2 = bVar4.d2.f;
                if (imageView2 != null && imageView2.getVisibility() == 0) {
                    z = true;
                }
                if (z && (imageView = bVar4.d2.f) != null) {
                    imageView.setVisibility(8);
                }
            } else {
                a aVar2 = new a(bVar4.getFragmentManager());
                aVar2.m(R.id.instabug_fragment_container, VideoPlayerFragment.newInstance(localPath), "video_player", 1);
                aVar2.g("play video");
                aVar2.h();
            }
        }
        b bVar5 = this.x;
        Handler handler = bVar5.n2;
        if (!(handler == null || (runnable = bVar5.m2) == null)) {
            handler.removeCallbacks(runnable);
        }
        this.x.m2 = null;
    }
}
