# Android UI模板
<br>
现在开发中很多界面都是经常出现，而且大同小异。所以就写了一个ui的模板，你可以通过设置图片颜色来改变界面的样式。简单的实现界面开发。
## 效果图
![效果示例](https://raw.githubusercontent.com/youth5201314/UITemplateView/master/image/login1.png)
### 联系方式
* 邮箱地址： 1028729086@qq.com
* 如果遇到问题和建议欢迎在给我发送邮件，希望让这个工程越来越完善。

##Gradle
```groovy
dependencies{
    compile 'com.youth.template:UITemplateView:1.0.0'  
}
```
或者引用本地lib
```groovy
compile project(':UITemplateView')
```
##方法
|方法名|参数|描述
|:---:|:---:|
|setDelayTime(int time)| 设置轮播图片间隔时间（默认为2000）
|setImages(Object[] imagesUrl)| 设置轮播图片 
|setOnBannerClickListener|设置点击事件

##使用步骤

####1.在布局文件中添加Banner
```xml
<com.youth.banner.Banner
    android:id="@+id/banner"
    android:layout_width="match_parent"
    android:layout_height="200dp" />
```
#### 3.在Activity或者Fragment中配置Banner 
```java
private Banner banner;
String[] images= new String[] {"url"};
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    banner = (Banner) findViewById(R.id.banner);
    banner.setDelayTime(500);//设置轮播间隔时间
    banner.setImages(images);//可以选择设置图片网址，或者资源文件
    banner.setOnBannerClickListener(new Banner.OnBannerClickListener() {//设置点击事件
        @Override
        public void OnBannerClick(View view, int position) {

        }
    });

}
```

