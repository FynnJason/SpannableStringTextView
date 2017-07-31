# SpannableStringTextView

![image](https://github.com/FynnJason/SpannableStringTextView/raw/master/i.png)

###设置文字的前景色
```
SpannableString spannableString = new SpannableString("设置文字的前景色为淡蓝色");
ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#0099EE"));
spannableString.setSpan(foregroundColorSpan, 9, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
binding.contentOne.setText(spannableString);
```

###设置文字的背景色
```
spannableString = new SpannableString("设置文字的背景色为淡绿色");
BackgroundColorSpan backgroundColorSpan = new BackgroundColorSpan(Color.parseColor("#AC00FF30"));
spannableString.setSpan(backgroundColorSpan, 9, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
binding.contentTwo.setText(spannableString);
```

###设置文字大小
```
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
```

###设置删除线
```
spannableString = new SpannableString("为文字设置删除线");
StrikethroughSpan strikethroughSpan = new StrikethroughSpan();
spannableString.setSpan(strikethroughSpan, 5, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
binding.contentFour.setText(spannableString);
```
