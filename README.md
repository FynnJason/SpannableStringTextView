# SpannableStringTextView
SpannableString，列出大多数常用的方法和实例供参考。
![image](https://github.com/FynnJason/SpannableStringTextView/raw/master/i.png)

###设置文字的前景色
```java
SpannableString spannableString = new SpannableString("设置文字的前景色为淡蓝色");
ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(Color.parseColor("#0099EE"));
spannableString.setSpan(foregroundColorSpan, 9, spannableString.length(), Spanned.SPAN_INCLUSIVE_EXCLUSIVE);
binding.contentOne.setText(spannableString);
```
