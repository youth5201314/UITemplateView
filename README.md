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
    compile 'com.youth.template:UITemplateView:1.0.3'  
}
```
或者引用本地lib
```groovy
compile project(':UITemplateView')
```
## 登录模板方法
|方法名|描述
|---|---|
|setLoginLogo(int resId)| 设置登录界面logo
|setLoginLogoVisibility(int visibility)| 设置登录界面logo显示状态 
|setLoginBackgroundResource(int resId)|设置登录界面背景图片
|setLoginBackgroundColor(int color)|设置登录界面背景颜色
|setLoginNameIcon(int resId)|设置登录名输入框图标
|setLoginNameHint(String text)|设置登录名输入框提示文字
|setLoginNameBackground(int resId)|设置登录名输入框背景样式
|setLoginPasswordIcon(int resId)|设置密码输入框图标
|setLoginPasswordHint(String text)|设置密码输入框提示文字
|setLoginPasswordBackground(int resId)|设置密码输入框背景样式
|setLoginButtonBackground(int resId)|设置登录按钮背景样式
|setLoginButtonText(String text)|设置登录按钮文字
|setLoginButtonTextColor(int color)|设置登录按钮文字颜色
|setForgotButtonText(String text)|设置忘记密码按钮文字（你也可以换成其他的功能）
|setForgotButtonTextColor(int color)|设置忘记密码文字颜色
|setRegisterButtonText(String text)|设置注册按钮文字（你也可以换成其他的功能）
|setRegisterButtonTextColor(int color)|设置注册文字颜色
|getLoginName()|获取输入的登录名
|getLoginPassword()|获取输入的密码
|setLoginListener(this)|设置登录按钮点击事件
|setForgotListener(this)|设置忘记密码点击事件
|setRegisterListener(this)|设置忘记密码点击事件

## 使用方法（以登录界面模板为例）

#### 方法一、在布局文件中添加模板，然后在Activity中获取
```xml
<com.youth.template.LoginTemplateView
    android:id="@+id/template"
    android:layout_width="match_parent"
    android:layout_height="match_parent" />
```
```java
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        LoginTemplateView view=(LoginTemplateView)findViewById(R.id.template);
        //接下来就通过api中方法设置界面样式、获取界面输入值、设置点击事件
    }
}
```
#### 方法二、直接在Activity中创建
```java
public class MainActivity extends AppCompatActivity {
    LoginTemplateView view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        view=new LoginTemplateView(this);
        setContentView(view);
        //设置点击事件
        view.setLoginListener(new LoginTemplateView.LoginListener() {
           @Override
           public void login(View v) {
               Toast.makeText(getApplicationContext(),view.getLoginName(),Toast.LENGTH_SHORT).show();
           }
        });
    }
}
```

