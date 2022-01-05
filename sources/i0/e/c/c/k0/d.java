package i0.e.c.c.k0;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.clubhouse.android.shared.ui.AvatarView;
import com.clubhouse.android.ui.common.TightTextView;
import com.clubhouse.backchannel.R;
import com.clubhouse.backchannel.chat.style.MessageBubbleStyle;
import com.clubhouse.backchannel.chat.style.MessageColor;
import com.clubhouse.backchannel.data.models.local.DeliveryStatus;
import com.clubhouse.backchannel.databinding.ChatMessageBinding;
import com.google.android.material.card.MaterialCardView;
import h0.b0.v;
import h0.i.b.a;
import i0.e.b.d3.k;
import i0.h.a.c.w.k;
import java.util.Objects;
import m0.n.b.i;

/* compiled from: ChatMessageView.kt */
public final class d extends ConstraintLayout {
    public final ChatMessageBinding n2;
    public final TextView o2;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public d(Context context) {
        super(context, (AttributeSet) null, 0);
        i.e(context, "context");
        i.e(context, "context");
        ViewGroup.inflate(context, R.layout.chat_message, this);
        ChatMessageBinding bind = ChatMessageBinding.bind(this);
        i.d(bind, "bind(this)");
        this.n2 = bind;
        TightTextView tightTextView = bind.d;
        i.d(tightTextView, "binding.messageBody");
        this.o2 = tightTextView;
    }

    public final TextView getMessageBody$backchannel_release() {
        return this.o2;
    }

    public final void setAvatar(String str) {
        AvatarView avatarView = this.n2.b;
        i.d(avatarView, "binding.avatar");
        v.Q0(avatarView, str);
    }

    public final void setDeliveryStatus(DeliveryStatus deliveryStatus) {
        TextView textView = this.n2.f;
        i.d(textView, "binding.notDelivered");
        DeliveryStatus deliveryStatus2 = DeliveryStatus.ERRORED;
        boolean z = true;
        k.L(textView, Boolean.valueOf(deliveryStatus == deliveryStatus2));
        ImageView imageView = this.n2.g;
        i.d(imageView, "binding.retry");
        if (deliveryStatus != deliveryStatus2) {
            z = false;
        }
        k.L(imageView, Boolean.valueOf(z));
        float f = deliveryStatus == DeliveryStatus.SENDING ? 0.33f : 1.0f;
        this.n2.c.setAlpha(f);
        this.n2.d.setAlpha(f);
    }

    public final void setIsEmoji(boolean z) {
        MaterialCardView materialCardView = this.n2.c;
        i.d(materialCardView, "binding.chatBackground");
        k.q(materialCardView, Boolean.valueOf(z));
        this.n2.d.setTextSize(0, getResources().getDimension(z ? R.dimen.text_size_emoji : R.dimen.text_size_message));
    }

    public final void setLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.n2.a.setOnLongClickListener(onLongClickListener);
    }

    public final void setMessageBody(CharSequence charSequence) {
        this.o2.setText(charSequence);
    }

    public final void setMessageBubbleStyle(MessageBubbleStyle messageBubbleStyle) {
        i.e(messageBubbleStyle, "style");
        View view = this.n2.a;
        i.d(view, "binding.root");
        k.I(view, getResources().getDimensionPixelSize(messageBubbleStyle.getGapToPrevious()));
        MaterialCardView materialCardView = this.n2.c;
        i0.h.a.c.w.k shapeAppearanceModel = materialCardView.getShapeAppearanceModel();
        Objects.requireNonNull(shapeAppearanceModel);
        k.b bVar = new k.b(shapeAppearanceModel);
        bVar.f(getResources().getDimension(messageBubbleStyle.getRadius().a));
        bVar.g(getResources().getDimension(messageBubbleStyle.getRadius().b));
        bVar.d(getResources().getDimension(messageBubbleStyle.getRadius().c));
        bVar.e(getResources().getDimension(messageBubbleStyle.getRadius().d));
        materialCardView.setShapeAppearanceModel(bVar.a());
    }

    public final void setMessageColor(MessageColor messageColor) {
        i.e(messageColor, "color");
        this.n2.e.setTextColor(a.getColor(getContext(), messageColor.getForeground()));
        this.n2.c.setCardBackgroundColor(a.getColor(getContext(), messageColor.getBackground()));
    }

    public final void setName(CharSequence charSequence) {
        this.n2.e.setText(charSequence);
        this.n2.b.setText(AvatarView.c.a(String.valueOf(charSequence)));
    }

    public final void setProfileClickListener(View.OnClickListener onClickListener) {
        this.n2.b.setOnClickListener(onClickListener);
    }

    public final void setRetryClickListener(View.OnClickListener onClickListener) {
        this.n2.g.setOnClickListener(onClickListener);
    }

    public final void setShowAvatar(boolean z) {
        this.n2.b.setVisibility(z ? 0 : 4);
    }

    public final void setShowName(boolean z) {
        TextView textView = this.n2.e;
        i.d(textView, "binding.name");
        i0.e.b.d3.k.L(textView, Boolean.valueOf(z));
    }

    public final void t(boolean z) {
        h hVar = new h(this);
        i0.b.c.a aVar = new i0.b.c.a();
        if (z) {
            aVar.a(R.style.MessageBodyAlignEnd);
        } else {
            aVar.a(R.style.MessageBodyAlignStart);
        }
        hVar.a(aVar.b());
        TextView textView = this.o2;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        Objects.requireNonNull(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        ConstraintLayout.a aVar2 = (ConstraintLayout.a) layoutParams;
        aVar2.D = z ? 1.0f : 0.0f;
        textView.setLayoutParams(aVar2);
    }

    public final void setAvatar(int i) {
        this.n2.b.setImageResource(i);
    }
}
