package i0.j.d.h.c;

import android.content.Context;
import android.graphics.BitmapFactory;
import android.graphics.Color;
import android.graphics.Typeface;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.instabug.featuresrequest.R;
import com.instabug.featuresrequest.d.e;
import com.instabug.featuresrequest.d.f;
import com.instabug.library.Instabug;
import com.instabug.library.InstabugColorTheme;
import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.util.InstabugSDKLogger;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

/* compiled from: TimelineAdapter */
public class d extends BaseAdapter {
    public ArrayList<f> c;
    public b d;

    /* compiled from: TimelineAdapter */
    public class a implements Runnable {
        public final /* synthetic */ com.instabug.featuresrequest.d.a c;

        public a(com.instabug.featuresrequest.d.a aVar) {
            this.c = aVar;
        }

        public void run() {
            com.instabug.featuresrequest.d.a aVar = this.c;
            aVar.b2 = !aVar.b2;
            d.this.d.v();
        }
    }

    /* compiled from: TimelineAdapter */
    public static class b {
        public final RelativeLayout a;
        public final ImageView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView g;

        public b(View view) {
            this.b = (ImageView) view.findViewById(R.id.instabug_feature_requests_comment_avatar);
            this.c = (TextView) view.findViewById(R.id.instabug_feature_requests_comment_username);
            this.d = (TextView) view.findViewById(R.id.instabug_feature_requests_comment_date);
            this.e = (TextView) view.findViewById(R.id.instabug_feature_feature_details_comment);
            this.a = (RelativeLayout) view.findViewById(R.id.instabug_feature_request_admin_comment_layout);
            this.f = (TextView) view.findViewById(R.id.instabug_feature_request_new_status);
            this.g = (TextView) view.findViewById(R.id.instabug_feature_request_new_status_date);
        }
    }

    public d(ArrayList<f> arrayList, b bVar) {
        this.c = arrayList;
        this.d = bVar;
    }

    public void a(Context context, b bVar, com.instabug.featuresrequest.d.a aVar) {
        String str;
        TextView textView = bVar.c;
        if (textView != null) {
            textView.setTypeface((Typeface) null, 0);
            TextView textView2 = bVar.c;
            String str2 = aVar.Y1;
            if (str2 == null || str2.equalsIgnoreCase("null") || TextUtils.isEmpty(aVar.Y1.trim())) {
                str = context.getString(R.string.feature_request_owner_anonymous_word);
            } else {
                str = aVar.Y1;
            }
            textView2.setText(str);
        }
        ImageView imageView = bVar.b;
        if (imageView != null) {
            if (aVar.c2 == null) {
                AssetsCacheManager.getAssetEntity(context, AssetsCacheManager.createEmptyEntity(context, aVar.Z1, AssetEntity.AssetType.IMAGE), new e(this, aVar));
                bVar.b.setImageResource(R.drawable.ibg_core_ic_avatar);
            } else {
                try {
                    imageView.setImageBitmap(BitmapFactory.decodeStream(new FileInputStream(new File(aVar.c2))));
                } catch (FileNotFoundException e) {
                    InstabugSDKLogger.e("TimelineAdapter", "Can't set avatar image in feature detail comments", e);
                }
            }
        }
        TextView textView3 = bVar.d;
        if (textView3 != null) {
            textView3.setText(i0.j.c.l.a.n(context, aVar.d));
        }
        TextView textView4 = bVar.e;
        if (textView4 != null) {
            i0.j.c.l.a.B(textView4, aVar.x, context.getString(R.string.feature_request_str_more), context.getString(R.string.feature_request_str_less), aVar.b2, new a(aVar));
        }
    }

    public int getCount() {
        return this.c.size();
    }

    public Object getItem(int i) {
        return this.c.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        if (this.c.get(i) instanceof com.instabug.featuresrequest.d.a) {
            return ((com.instabug.featuresrequest.d.a) this.c.get(i)).y ? 1 : 0;
        }
        return 2;
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        b bVar;
        TextView textView;
        int itemViewType = getItemViewType(i);
        if (view == null) {
            if (itemViewType == 1) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ib_fr_item_admin_comment, viewGroup, false);
            } else if (itemViewType != 2) {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ib_fr_item_comment, viewGroup, false);
            } else {
                view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ib_fr_item_status_change, viewGroup, false);
            }
            bVar = new b(view);
            view.setTag(bVar);
        } else {
            bVar = (b) view.getTag();
        }
        if (itemViewType == 1) {
            Context context = view.getContext();
            a(context, bVar, (com.instabug.featuresrequest.d.a) this.c.get(i));
            TextView textView2 = bVar.c;
            if (textView2 != null) {
                textView2.setTypeface((Typeface) null, 1);
            }
            RelativeLayout relativeLayout = bVar.a;
            if (relativeLayout != null) {
                relativeLayout.getBackground().setAlpha(13);
                if (Instabug.getTheme() == InstabugColorTheme.InstabugColorThemeLight) {
                    i0.j.c.l.a.z(bVar.a, h0.i.c.a.c(Instabug.getPrimaryColor(), 255));
                } else {
                    i0.j.c.l.a.z(bVar.a, h0.i.b.a.getColor(context, 17170443));
                }
            }
        } else if (itemViewType != 2) {
            a(view.getContext(), bVar, (com.instabug.featuresrequest.d.a) this.c.get(i));
        } else {
            Context context2 = view.getContext();
            e eVar = (e) this.c.get(i);
            if (!(bVar.f == null || (textView = bVar.g) == null)) {
                textView.setText(i0.j.c.l.a.n(context2, eVar.d));
                i0.j.d.f.a.a(eVar.x, eVar.y, bVar.f, context2);
                bVar.f.setTextColor(Color.parseColor(eVar.y));
                TextView textView3 = bVar.f;
                StringBuilder P0 = i0.d.a.a.a.P0(" ");
                P0.append(bVar.f.getText());
                textView3.setText(P0.toString());
            }
        }
        return view;
    }
}
