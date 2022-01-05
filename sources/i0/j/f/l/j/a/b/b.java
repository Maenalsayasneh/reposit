package i0.j.f.l.j.a.b;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.library.util.BitmapUtils;
import com.instabug.survey.R;
import com.instabug.survey.announcements.cache.AnnouncementCacheManager;
import com.instabug.survey.e.c.c;
import com.instabug.survey.e.c.e;
import java.util.ArrayList;

/* compiled from: WhatsNewFeaturesAdapter */
public class b extends RecyclerView.Adapter<a> {
    public final LayoutInflater a;
    public c b;

    /* compiled from: WhatsNewFeaturesAdapter */
    public class a extends RecyclerView.b0 {
        public TextView a;
        public TextView b;
        public ImageView c;

        public a(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.new_feature_title);
            this.b = (TextView) view.findViewById(R.id.new_feature_description);
            this.c = (ImageView) view.findViewById(R.id.new_feature_img);
        }
    }

    public b(Activity activity, c cVar) {
        this.a = LayoutInflater.from(activity);
        this.b = cVar;
    }

    public final e b(int i) {
        ArrayList<e> arrayList = this.b.y;
        if (arrayList == null) {
            return null;
        }
        return arrayList.get(i);
    }

    public int getItemCount() {
        ArrayList<e> arrayList;
        c cVar = this.b;
        if (cVar == null || (arrayList = cVar.y) == null) {
            return 0;
        }
        return arrayList.size();
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public void onBindViewHolder(RecyclerView.b0 b0Var, int i) {
        a aVar = (a) b0Var;
        if (b(i) != null) {
            String str = "";
            aVar.a.setText(b(i).d != null ? b(i).d : str);
            TextView textView = aVar.b;
            if (b(i).q != null) {
                str = b(i).q;
            }
            textView.setText(str);
            c cVar = this.b;
            if (cVar != null) {
                if (cVar.a2) {
                    aVar.c.setVisibility(8);
                    return;
                }
                String announcementAsset = AnnouncementCacheManager.getAnnouncementAsset(cVar.x, b(i).c);
                if (announcementAsset != null) {
                    BitmapUtils.loadBitmapWithFallback(announcementAsset, aVar.c, R.drawable.ibg_survey_ic_star_icon_placholder);
                } else {
                    aVar.c.setImageResource(R.drawable.ibg_survey_ic_star_icon_placholder);
                }
            }
        }
    }

    public RecyclerView.b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new a(this.a.inflate(R.layout.instabug_announcement_new_feature_item, viewGroup, false));
    }
}
