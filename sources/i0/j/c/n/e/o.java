package i0.j.c.n.e;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instabug.chat.R;
import com.instabug.chat.e.c;
import com.instabug.chat.e.e;
import com.instabug.library.core.InstabugCore;
import com.instabug.library.internal.media.AudioPlayer;
import com.instabug.library.internal.storage.cache.AssetsCacheManager;
import com.instabug.library.model.AssetEntity;
import com.instabug.library.ui.custom.CircularImageView;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.Colorizer;
import com.instabug.library.util.InstabugDateFormatter;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.VideoManipulationUtils;
import com.instabug.library.util.threading.PoolProvider;
import com.instabug.library.view.ViewUtils;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

/* compiled from: MessagesListAdapter */
public class o extends BaseAdapter {
    public c Y1;
    public boolean Z1 = true;
    public final AudioPlayer c;
    public List<com.instabug.chat.e.c> d;
    public ColorFilter q;
    public Context x;
    public ListView y;

    /* compiled from: MessagesListAdapter */
    public class a implements Runnable {
        public final /* synthetic */ String c;
        public final /* synthetic */ ImageView d;
        public final /* synthetic */ boolean q;

        /* renamed from: i0.j.c.n.e.o$a$a  reason: collision with other inner class name */
        /* compiled from: MessagesListAdapter */
        public class C0167a implements BitmapUtils.OnBitmapReady {

            /* renamed from: i0.j.c.n.e.o$a$a$a  reason: collision with other inner class name */
            /* compiled from: MessagesListAdapter */
            public class C0168a implements Runnable {
                public final /* synthetic */ Bitmap c;

                public C0168a(Bitmap bitmap) {
                    this.c = bitmap;
                }

                public void run() {
                    a.this.d.setImageBitmap(this.c);
                    a aVar = a.this;
                    if (aVar.q) {
                        o oVar = o.this;
                        if (oVar.Z1) {
                            oVar.y.setSelection(oVar.getCount() - 1);
                            o.this.Z1 = false;
                        }
                    }
                }
            }

            public C0167a() {
            }

            public void onBitmapFailedToLoad() {
            }

            public void onBitmapReady(Bitmap bitmap) {
                PoolProvider.postMainThreadTask(new C0168a(bitmap));
            }
        }

        public a(String str, ImageView imageView, boolean z) {
            this.c = str;
            this.d = imageView;
            this.q = z;
        }

        public void run() {
            BitmapUtils.loadBitmapForAsset(o.this.x, this.c, AssetEntity.AssetType.IMAGE, new C0167a());
        }
    }

    /* compiled from: MessagesListAdapter */
    public static /* synthetic */ class b {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(10:0|1|2|3|4|5|6|7|8|10) */
        /* JADX WARNING: Code restructure failed: missing block: B:11:?, code lost:
            return;
         */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0011 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001c */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0027 */
        static {
            /*
                com.instabug.chat.e.c.b.values()
                r0 = 4
                int[] r1 = new int[r0]
                a = r1
                com.instabug.chat.e.c$b r2 = com.instabug.chat.e.c.b.MESSAGE     // Catch:{ NoSuchFieldError -> 0x0011 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0011 }
                r3 = 1
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0011 }
            L_0x0011:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x001c }
                com.instabug.chat.e.c$b r2 = com.instabug.chat.e.c.b.IMAGE     // Catch:{ NoSuchFieldError -> 0x001c }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x001c }
                r3 = 2
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x001c }
            L_0x001c:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0027 }
                com.instabug.chat.e.c$b r2 = com.instabug.chat.e.c.b.AUDIO     // Catch:{ NoSuchFieldError -> 0x0027 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0027 }
                r3 = 3
                r1[r2] = r3     // Catch:{ NoSuchFieldError -> 0x0027 }
            L_0x0027:
                int[] r1 = a     // Catch:{ NoSuchFieldError -> 0x0031 }
                com.instabug.chat.e.c$b r2 = com.instabug.chat.e.c.b.VIDEO     // Catch:{ NoSuchFieldError -> 0x0031 }
                int r2 = r2.ordinal()     // Catch:{ NoSuchFieldError -> 0x0031 }
                r1[r2] = r0     // Catch:{ NoSuchFieldError -> 0x0031 }
            L_0x0031:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.c.n.e.o.b.<clinit>():void");
        }
    }

    /* compiled from: MessagesListAdapter */
    public interface c {
    }

    /* compiled from: MessagesListAdapter */
    public static class d {
        public CircularImageView a;
        public TextView b;
        public TextView c;
        public ImageView d;
        public FrameLayout e;
        public ImageView f;
        public ProgressBar g;
        public ImageView h;
        public ImageView i;
        public FrameLayout j;
        public ProgressBar k;
        public LinearLayout l;

        public d(View view) {
            this.a = (CircularImageView) view.findViewById(R.id.instabug_img_message_sender);
            this.b = (TextView) view.findViewById(R.id.instabug_txt_message_time);
            this.c = (TextView) view.findViewById(R.id.instabug_txt_message_body);
            this.d = (ImageView) view.findViewById(R.id.instabug_img_attachment);
            this.f = (ImageView) view.findViewById(R.id.instabug_btn_play_audio);
            this.e = (FrameLayout) view.findViewById(R.id.instabug_audio_attachment);
            this.g = (ProgressBar) view.findViewById(R.id.instabug_audio_attachment_progress_bar);
            this.i = (ImageView) view.findViewById(R.id.instabug_img_video_attachment);
            this.h = (ImageView) view.findViewById(R.id.instabug_btn_play_video);
            this.j = (FrameLayout) view.findViewById(R.id.instabug_video_attachment);
            this.k = (ProgressBar) view.findViewById(R.id.instabug_video_attachment_progress_bar);
            this.l = (LinearLayout) view.findViewById(R.id.instabug_message_actions_container);
        }
    }

    public o(List<com.instabug.chat.e.c> list, Context context, ListView listView, c cVar) {
        this.d = list;
        this.y = listView;
        this.x = context;
        this.Y1 = cVar;
        this.c = new AudioPlayer();
        this.q = new PorterDuffColorFilter(InstabugCore.getPrimaryColor(), PorterDuff.Mode.SRC_IN);
    }

    public final void a(d dVar, com.instabug.chat.e.c cVar) throws ParseException {
        String str;
        String str2;
        String str3;
        String str4;
        Bitmap extractFirstVideoFrame;
        if (dVar != null) {
            InstabugSDKLogger.v(this, "viewholder: " + false + ", type:" + cVar.e);
            c.b bVar = cVar.e;
            if (bVar != null) {
                int i = b.a[bVar.ordinal()];
                if (i == 1) {
                    if (cVar.h) {
                        dVar.c.setBackgroundDrawable(Colorizer.getPrimaryColorTintedDrawable(dVar.c.getBackground()));
                    } else {
                        dVar.l.removeAllViews();
                        ArrayList<e> arrayList = cVar.i;
                        if (arrayList != null && arrayList.size() > 0) {
                            StringBuilder P0 = i0.d.a.a.a.P0("Binding MessageActions view  FlatMessage = ");
                            P0.append(cVar.toString());
                            InstabugSDKLogger.d(this, P0.toString());
                            ArrayList<e> arrayList2 = cVar.i;
                            if (arrayList2 != null && arrayList2.size() > 0) {
                                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                                    e eVar = arrayList2.get(i2);
                                    Button button = new Button(this.x);
                                    button.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                                    button.setPadding(ViewUtils.convertDpToPx(this.x, 8.0f), 0, ViewUtils.convertDpToPx(this.x, 8.0f), 0);
                                    button.setText(eVar.d);
                                    button.setTextColor(h0.i.b.a.getColor(this.x, 17170443));
                                    button.setBackgroundColor(InstabugCore.getPrimaryColor());
                                    button.setMaxEms(30);
                                    button.setMaxLines(1);
                                    button.setId(i2);
                                    button.setOnClickListener(new i(this, eVar));
                                    dVar.l.addView(button);
                                }
                            }
                        }
                    }
                    dVar.b.setText(InstabugDateFormatter.formatMessageDate(this.x, cVar.g));
                    String str5 = cVar.a;
                    if (str5 != null) {
                        dVar.c.setText(str5);
                    }
                    CircularImageView circularImageView = dVar.a;
                    if (circularImageView != null && (str = cVar.b) != null) {
                        b(str, circularImageView, false);
                    }
                } else if (i == 2) {
                    if (cVar.h) {
                        dVar.d.setBackgroundDrawable(Colorizer.getPrimaryColorTintedDrawable(dVar.d.getBackground()));
                    }
                    dVar.b.setText(InstabugDateFormatter.formatMessageDate(this.x, cVar.g));
                    String str6 = cVar.d;
                    if (str6 != null) {
                        BitmapUtils.loadBitmap(str6, dVar.d);
                    } else {
                        String str7 = cVar.c;
                        if (str7 != null) {
                            b(str7, dVar.d, true);
                        }
                    }
                    dVar.d.setOnClickListener(new j(this, cVar));
                    CircularImageView circularImageView2 = dVar.a;
                    if (circularImageView2 != null && (str2 = cVar.b) != null) {
                        b(str2, circularImageView2, false);
                    }
                } else if (i == 3) {
                    InstabugSDKLogger.e(this, "viewholder: " + false + ", type:" + cVar.e);
                    if (cVar.h) {
                        dVar.e.setBackgroundDrawable(Colorizer.getPrimaryColorTintedDrawable(dVar.e.getBackground()));
                        dVar.f.setColorFilter(this.q);
                    }
                    dVar.b.setText(InstabugDateFormatter.formatMessageDate(this.x, cVar.g));
                    String str8 = cVar.c;
                    if (str8 == null) {
                        str8 = cVar.d;
                    }
                    ProgressBar progressBar = dVar.g;
                    if (progressBar != null && progressBar.getVisibility() == 0) {
                        dVar.g.setVisibility(8);
                    }
                    if (dVar.f.getVisibility() == 8) {
                        dVar.f.setVisibility(0);
                    }
                    dVar.e.setOnClickListener(new k(this, cVar, str8, dVar));
                    this.c.addOnStopListener(new l(str8, cVar, dVar));
                    CircularImageView circularImageView3 = dVar.a;
                    if (circularImageView3 != null && (str3 = cVar.b) != null) {
                        b(str3, circularImageView3, false);
                    }
                } else if (i == 4) {
                    if (cVar.h) {
                        dVar.i.setBackgroundDrawable(Colorizer.getPrimaryColorTintedDrawable(dVar.i.getBackground()));
                        dVar.h.setColorFilter(this.q);
                    }
                    dVar.b.setText(InstabugDateFormatter.formatMessageDate(this.x, cVar.g));
                    if (cVar.d != null) {
                        InstabugSDKLogger.d(this, "Video path not found but main screenshot found, using it");
                        dVar.k.setVisibility(8);
                        dVar.h.setVisibility(0);
                        dVar.j.setOnClickListener(new m(this, cVar));
                        try {
                            String str9 = cVar.d;
                            if (!(str9 == null || (extractFirstVideoFrame = VideoManipulationUtils.extractFirstVideoFrame(str9)) == null)) {
                                dVar.i.setImageBitmap(extractFirstVideoFrame);
                            }
                        } catch (RuntimeException e) {
                            InstabugSDKLogger.e(this, e.getMessage(), e);
                        }
                    } else {
                        String str10 = cVar.c;
                        if (str10 != null) {
                            AssetsCacheManager.getAssetEntity(this.x, AssetsCacheManager.createEmptyEntity(this.x, str10, AssetEntity.AssetType.VIDEO), new n(this, dVar));
                        }
                    }
                    CircularImageView circularImageView4 = dVar.a;
                    if (circularImageView4 != null && (str4 = cVar.c) != null) {
                        b(str4, circularImageView4, false);
                    }
                }
            }
        }
    }

    public final void b(String str, ImageView imageView, boolean z) {
        PoolProvider.postIOTask(new a(str, imageView, z));
    }

    public int getCount() {
        return this.d.size();
    }

    public Object getItem(int i) {
        return this.d.get(i);
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        com.instabug.chat.e.c cVar = this.d.get(i);
        c.b bVar = cVar.e;
        if (bVar == null) {
            return -1;
        }
        int i2 = b.a[bVar.ordinal()];
        if (i2 == 1) {
            return cVar.h ^ true ? 1 : 0;
        }
        if (i2 != 2) {
            if (i2 != 3) {
                if (i2 != 4) {
                    return -1;
                }
                return cVar.h ? 6 : 7;
            } else if (cVar.h) {
                return 4;
            } else {
                return 5;
            }
        } else if (cVar.h) {
            return 2;
        } else {
            return 3;
        }
    }

    public View getView(int i, View view, ViewGroup viewGroup) {
        d dVar;
        int itemViewType = getItemViewType(i);
        if (view == null) {
            switch (itemViewType) {
                case 0:
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.instabug_message_list_item_me, viewGroup, false);
                    break;
                case 1:
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.instabug_message_list_item, viewGroup, false);
                    break;
                case 2:
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.instabug_message_list_item_img_me, viewGroup, false);
                    break;
                case 3:
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.instabug_message_list_item_img, viewGroup, false);
                    break;
                case 4:
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.instabug_message_list_item_voice_me, viewGroup, false);
                    break;
                case 5:
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.instabug_message_list_item_voice, viewGroup, false);
                    break;
                case 6:
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.instabug_message_list_item_video_me, viewGroup, false);
                    break;
                case 7:
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.instabug_message_list_item_video, viewGroup, false);
                    break;
                default:
                    view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.instabug_message_list_item_me, viewGroup, false);
                    break;
            }
            dVar = new d(view);
            view.setTag(dVar);
        } else {
            dVar = (d) view.getTag();
        }
        try {
            a(dVar, this.d.get(i));
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return view;
    }

    public int getViewTypeCount() {
        return 8;
    }
}
