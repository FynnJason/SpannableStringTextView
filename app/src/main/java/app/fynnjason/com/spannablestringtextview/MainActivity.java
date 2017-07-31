package app.fynnjason.com.spannablestringtextview;

import android.databinding.DataBindingUtil;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.BackgroundColorSpan;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.ImageSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.SubscriptSpan;
import android.text.style.SuperscriptSpan;
import android.text.style.URLSpan;
import android.text.style.UnderlineSpan;
import android.view.View;
import android.widget.Toast;

import app.fynnjason.com.spannablestringtextview.databinding.ActivityMainBinding;

/**
 * author：FynnJason
 * copyright：© 2017 Android.Own.
 */
public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);

        SpannableString spannableString = new SpannableString("设置文字的前景色为淡蓝色");
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#0099EE"));
        spannableString.setSpan(foregroundColorSpan, 9, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        binding.contentOne.setText(spannableString);

        spannableString = new SpannableString("设置文字的背景色为淡绿色");
        BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(Color.parseColor("#AC00FF30"));
        spannableString.setSpan(backgroundColorSpan, 9, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        binding.contentTwo.setText(spannableString);

        spannableString = new SpannableString("万丈高楼平地起");
        RelativeSizeSpan r1 = new RelativeSizeSpan(1.2f);
        RelativeSizeSpan r2 = new RelativeSizeSpan(1.3f);
        RelativeSizeSpan r3 = new RelativeSizeSpan(1.4f);
        RelativeSizeSpan r4 = new RelativeSizeSpan(1.5f);
        RelativeSizeSpan r5 = new RelativeSizeSpan(1.4f);
        RelativeSizeSpan r6 = new RelativeSizeSpan(1.3f);
        RelativeSizeSpan r7 = new RelativeSizeSpan(1.2f);
        spannableString.setSpan(r1, 0, 1, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(r2, 1, 2, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(r3, 2, 3, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(r4, 3, 4, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(r5, 4, 5, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(r6, 5, 6, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(r7, 6, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        binding.contentThree.setText(spannableString);

        spannableString = new SpannableString("为文字设置删除线");
        StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
        spannableString.setSpan(strikethroughSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        binding.contentFour.setText(spannableString);

        spannableString = new SpannableString("为文字设置下划线");
        UnderlineSpan underlineSpan = new UnderlineSpan();
        spannableString.setSpan(underlineSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        binding.contentFive.setText(spannableString);

        spannableString = new SpannableString("为文字设置上标");
        SuperscriptSpan superscriptSpan = new SuperscriptSpan();
        spannableString.setSpan(superscriptSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        binding.contentSix.setText(spannableString);

        spannableString = new SpannableString("为文字设置下标");
        SubscriptSpan subscriptSpan = new SubscriptSpan();
        spannableString.setSpan(subscriptSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        binding.contentSeven.setText(spannableString);

        spannableString = new SpannableString("为文字设置粗体、斜体风格");
        StyleSpan s1 = new StyleSpan(Typeface.BOLD);
        StyleSpan s2 = new StyleSpan(Typeface.ITALIC);
        spannableString.setSpan(s1, 5, 7, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        spannableString.setSpan(s2, 8, 10, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        binding.contentEight.setHighlightColor(Color.parseColor("#FF00EE"));
        binding.contentEight.setText(spannableString);

        spannableString = new SpannableString("在文本中添加表情(表情)");
        Drawable drawable = getResources().getDrawable(R.drawable.biaoqing);
        drawable.setBounds(0, 0, 42, 42);
        ImageSpan imageSpan = new ImageSpan(drawable);
        spannableString.setSpan(imageSpan, 6, 8, Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        binding.contentNine.setText(spannableString);

        spannableString = new SpannableString("为文字设置点击事件");
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "点到了", Toast.LENGTH_SHORT).show();
            }
        };
        spannableString.setSpan(clickableSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        binding.contentTen.setMovementMethod(LinkMovementMethod.getInstance());
        binding.contentTen.setHighlightColor(Color.parseColor("#00000000"));
        binding.contentTen.setText(spannableString);

        spannableString = new SpannableString("为文字设置超链接");
        URLSpan urlSpan = new URLSpan("http://www.baidu.com");
        spannableString.setSpan(urlSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
        binding.contentEl.setMovementMethod(LinkMovementMethod.getInstance());
        binding.contentEl.setHighlightColor(Color.parseColor("#00000000"));
        binding.contentEl.setText(spannableString);

    }
}
