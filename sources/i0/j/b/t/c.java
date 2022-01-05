package i0.j.b.t;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.instabug.bug.R;
import com.instabug.library.Instabug;
import com.instabug.library.model.Attachment;
import com.instabug.library.util.AttrResolver;
import com.instabug.library.util.BitmapUtils;
import com.instabug.library.util.InstabugSDKLogger;
import com.instabug.library.util.VideoManipulationUtils;
import com.instabug.library.view.IconView;
import h0.i.i.q;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: AttachmentsAdapter */
public class c extends RecyclerView.Adapter<RecyclerView.b0> {
    public int[] a;
    public List<Attachment> b;
    public ColorFilter c;
    public b d;
    public ProgressBar e;
    public ImageView f;
    public Context g;
    public int h = -1;

    /* compiled from: AttachmentsAdapter */
    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        /* JADX WARNING: Can't wrap try/catch for region: R(14:0|1|2|3|4|5|6|7|8|9|10|11|12|14) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:11:0x003e */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x0028 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0033 */
        static {
            /*
                com.instabug.library.model.Attachment.Type.values()
                r0 = 11
                int[] r0 = new int[r0]
                a = r0
                com.instabug.library.model.Attachment$Type r1 = com.instabug.library.model.Attachment.Type.EXTRA_IMAGE     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x001d }
                com.instabug.library.model.Attachment$Type r1 = com.instabug.library.model.Attachment.Type.GALLERY_IMAGE     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0028 }
                com.instabug.library.model.Attachment$Type r1 = com.instabug.library.model.Attachment.Type.MAIN_SCREENSHOT     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0033 }
                com.instabug.library.model.Attachment$Type r1 = com.instabug.library.model.Attachment.Type.EXTRA_VIDEO     // Catch:{ NoSuchFieldError -> 0x0033 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0033 }
                r2 = 4
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0033 }
            L_0x0033:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x003e }
                com.instabug.library.model.Attachment$Type r1 = com.instabug.library.model.Attachment.Type.GALLERY_VIDEO     // Catch:{ NoSuchFieldError -> 0x003e }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x003e }
                r2 = 5
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x003e }
            L_0x003e:
                int[] r0 = a     // Catch:{ NoSuchFieldError -> 0x0049 }
                com.instabug.library.model.Attachment$Type r1 = com.instabug.library.model.Attachment.Type.AUTO_SCREEN_RECORDING_VIDEO     // Catch:{ NoSuchFieldError -> 0x0049 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0049 }
                r2 = 6
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0049 }
            L_0x0049:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: i0.j.b.t.c.a.<clinit>():void");
        }
    }

    /* compiled from: AttachmentsAdapter */
    public interface b {
    }

    /* renamed from: i0.j.b.t.c$c  reason: collision with other inner class name */
    /* compiled from: AttachmentsAdapter */
    public static class C0162c extends RecyclerView.b0 {
        public RelativeLayout a;
        public RelativeLayout b;
        public ImageView c;
        public ImageView d;
        public IconView e;
        public View f;

        public C0162c(View view) {
            super(view);
            this.c = (ImageView) view.findViewById(R.id.instabug_img_attachment);
            this.d = (ImageView) view.findViewById(R.id.instabug_btn_image_edit_attachment);
            this.a = (RelativeLayout) view.findViewById(R.id.instabug_attachment_img_item);
            this.e = (IconView) view.findViewById(R.id.instabug_btn_remove_attachment);
            this.b = (RelativeLayout) view.findViewById(R.id.instabug_attachemnt_thumb_background);
            this.f = view.findViewById(R.id.instabug_btn_remove_attachment_circle);
        }
    }

    /* compiled from: AttachmentsAdapter */
    public static class d extends RecyclerView.b0 {
        public RelativeLayout a;
        public RelativeLayout b;
        public ProgressBar c;
        public IconView d;
        public ImageView e;
        public ImageView f;

        public d(View view) {
            super(view);
            this.a = (RelativeLayout) view.findViewById(R.id.instabug_attachment_video_item);
            this.f = (ImageView) view.findViewById(R.id.instabug_img_video_attachment);
            this.d = (IconView) view.findViewById(R.id.instabug_btn_remove_attachment);
            this.c = (ProgressBar) view.findViewById(R.id.instabug_attachment_progress_bar);
            this.e = (ImageView) view.findViewById(R.id.instabug_btn_video_play_attachment);
            this.b = (RelativeLayout) view.findViewById(R.id.instabug_attachemnt_thumb_background);
            ProgressBar progressBar = this.c;
            if (progressBar != null) {
                progressBar.getIndeterminateDrawable().setColorFilter(Instabug.getPrimaryColor(), PorterDuff.Mode.MULTIPLY);
            }
        }
    }

    public c(Context context, ColorFilter colorFilter, b bVar) {
        int i = R.drawable.ibg_bug_ic_edit;
        int i2 = R.drawable.ibg_bug_ic_magnify;
        int i3 = R.drawable.ibg_bug_ic_blur;
        this.a = new int[]{i, i2, i3, i, i2, i3, i};
        this.g = context;
        this.c = null;
        this.d = bVar;
        this.b = new ArrayList();
    }

    public final void b(RelativeLayout relativeLayout) {
        Context context = this.g;
        if (context != null) {
            Drawable drawable = context.getResources().getDrawable(R.drawable.ibg_bug_shape_attachment_border);
            drawable.setColorFilter(new PorterDuffColorFilter(AttrResolver.resolveAttributeColor(this.g, R.attr.ibg_bug_attachment_border_color), PorterDuff.Mode.SRC_IN));
            relativeLayout.setBackgroundDrawable(drawable);
        }
    }

    public int getItemCount() {
        List<Attachment> list = this.b;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public long getItemId(int i) {
        return (long) i;
    }

    public int getItemViewType(int i) {
        List<Attachment> list = this.b;
        if (list == null || list.size() == 0 || this.b.get(i).getType() == null) {
            return super.getItemViewType(i);
        }
        int i2 = a.a[this.b.get(i).getType().ordinal()];
        return (i2 == 4 || i2 == 5 || i2 == 6) ? 1 : 0;
    }

    public void onBindViewHolder(RecyclerView.b0 b0Var, int i) {
        int i2;
        if (getItemViewType(i) != 1) {
            C0162c cVar = (C0162c) b0Var;
            Attachment attachment = this.b.get(i);
            if (attachment.getLocalPath() != null) {
                BitmapUtils.loadBitmap(attachment.getLocalPath(), cVar.c);
            }
            cVar.c.setTag(attachment);
            cVar.a.setOnClickListener(new b(this, attachment));
            cVar.e.setTag(attachment);
            cVar.e.setOnClickListener(new b(this, attachment));
            cVar.e.setTextColor(Instabug.getPrimaryColor());
            if (attachment.getName() != null) {
                ImageView imageView = cVar.c;
                String name = attachment.getName();
                AtomicInteger atomicInteger = q.a;
                imageView.setTransitionName(name);
            }
            b(cVar.b);
            if (attachment.getType() == Attachment.Type.MAIN_SCREENSHOT) {
                Objects.requireNonNull(i0.j.b.s.a.h());
                if (i0.j.b.s.b.a().g) {
                    cVar.e.setVisibility(8);
                    cVar.f.setVisibility(8);
                    i2 = this.h;
                    if (i2 != -1 && i == i2 && this.b.get(i).shouldAnimate()) {
                        AnimationDrawable animationDrawable = new AnimationDrawable();
                        for (int i3 : this.a) {
                            Context context = this.g;
                            if (context != null) {
                                Drawable a2 = h0.b.b.a.a.a(context, i3);
                                if (a2 != null) {
                                    animationDrawable.addFrame(a2, 1500);
                                } else {
                                    animationDrawable.stop();
                                }
                            }
                        }
                        animationDrawable.setEnterFadeDuration(200);
                        animationDrawable.setOneShot(true);
                        cVar.d.setImageDrawable(animationDrawable);
                        cVar.d.post(new a(animationDrawable));
                        this.b.get(i).setShouldAnimate(false);
                        return;
                    }
                    return;
                }
            }
            cVar.e.setVisibility(0);
            cVar.f.setVisibility(0);
            i2 = this.h;
            if (i2 != -1) {
                return;
            }
            return;
        }
        d dVar = (d) b0Var;
        Attachment attachment2 = this.b.get(i);
        IconView iconView = dVar.d;
        int i4 = R.id.instabug_btn_remove_attachment;
        iconView.findViewById(i4).setTag(attachment2);
        dVar.d.findViewById(i4).setOnClickListener(new b(this, attachment2));
        dVar.d.setTextColor(Instabug.getPrimaryColor());
        ColorFilter colorFilter = this.c;
        if (colorFilter != null) {
            dVar.e.setColorFilter(colorFilter);
        }
        dVar.f.setTag(attachment2);
        dVar.a.setOnClickListener(new b(this, attachment2));
        this.f = dVar.e;
        this.e = dVar.c;
        StringBuilder P0 = i0.d.a.a.a.P0("encoded: ");
        P0.append(attachment2.isVideoEncoded());
        InstabugSDKLogger.d("AttachmentsAdapter", P0.toString());
        if (attachment2.getLocalPath() != null) {
            try {
                InstabugSDKLogger.d("AttachmentsAdapter", "Video path found, extracting it's first frame " + attachment2.getLocalPath());
                Bitmap extractFirstVideoFrame = VideoManipulationUtils.extractFirstVideoFrame(attachment2.getLocalPath());
                if (extractFirstVideoFrame != null) {
                    dVar.f.setImageBitmap(extractFirstVideoFrame);
                }
            } catch (RuntimeException e2) {
                InstabugSDKLogger.e("AttachmentsAdapter", "error while bindVideoAttachmentView", e2);
            }
        } else {
            InstabugSDKLogger.d("AttachmentsAdapter", "Neither video path nor main screenshot found, using white background");
            dVar.f.setImageResource(R.drawable.ibg_core_bg_card);
            ProgressBar progressBar = this.e;
            if (progressBar != null && progressBar.getVisibility() == 8) {
                this.e.setVisibility(0);
            }
            ImageView imageView2 = this.f;
            if (imageView2 != null && imageView2.getVisibility() == 0) {
                this.f.setVisibility(8);
            }
        }
        b(dVar.b);
    }

    public RecyclerView.b0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i != 1) {
            return new C0162c(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ibg_bug_lyt_attachment_image, viewGroup, false));
        }
        return new d(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.ibg_bug_lyt_attachment_video, viewGroup, false));
    }
}
