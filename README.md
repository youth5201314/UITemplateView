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

## 使用方法

####1.在布局文件中添加Banner
```xml
<com.youth.banner.Banner
    android:id="@+id/banner"
    android:layout_width="match_parent"
    android:layout_height="200dp" />
```
#### 3.在Activity或者Fragment中配置Banner 
```java
public class MainActivity extends AppCompatActivity {
    LoginTemplateView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view=new LoginTemplateView(this);
        view.setLoginListener(new LoginTemplateView.LoginListener() {
            @Override
            public void login(View v) {
                Toast.makeText(getApplicationContext(),view.getUsername(),Toast.LENGTH_SHORT).show();
            }
        });
        setContentView(view);
    }
}
```

