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
