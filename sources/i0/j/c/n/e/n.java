package i0.j.c.n.e;

import android.graphics.Bitmap;
import android.view.View;
import com.instabug.chat.ui.f.d;
import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.VideoManipulationUtils;
import i0.j.c.n.e.o;

/* compiled from: MessagesListAdapter */
public class n implements AssetsCacheManager.OnDownloadFinished {
    public final /* synthetic */ o.d a;
    public final /* synthetic */ o b;

    /* compiled from: MessagesListAdapter */
    public class a implements View.OnClickListener {
        public final /* synthetic */ AssetEntity c;

        public a(AssetEntity assetEntity) {
            this.c = assetEntity;
        }

        public void onClick(View view) {
            ((d) n.this.b.Y1).i(this.c.getFile().getPath());
        }
    }

    public n(o oVar, o.d dVar) {
        this.b = oVar;
        this.a = dVar;
    }

    public void onFailed(Throwable th) {
        InstabugSDKLogger.e(this, "Asset Entity downloading got error", th);
    }

    public void onSuccess(AssetEntity assetEntity) {
        StringBuilder P0 = i0.d.a.a.a.P0("Asset Entity downloaded: ");
        P0.append(assetEntity.getFile().getPath());
        InstabugSDKLogger.d(this, P0.toString());
        this.a.k.setVisibility(8);
        this.a.h.setVisibility(0);
        Bitmap extractFirstVideoFrame = VideoManipulationUtils.extractFirstVideoFrame(assetEntity.getFile().getPath());
        if (extractFirstVideoFrame != null) {
            this.a.i.setImageBitmap(extractFirstVideoFrame);
        }
        this.a.j.setOnClickListener(new a(assetEntity));
    }
}
