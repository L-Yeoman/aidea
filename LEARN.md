##  文档
默认服务器地址：env.dart--------- defaultAPIServerURL  
首页  HomePage  path:'/chat-chat'    
我的  SettingScreen  
底部导航 AppScaffold

#### 聊天支持图片   
```dart
--------------ChatInput
//图片上传
Row(
children: [
if (widget.enableNotifier.value &&
widget.enableImageUpload &&
Ability().supportImageUploader &&
widget.onImageSelected != null &&
Ability().supportWebSocket)
_buildImageUploadButton(
context, setting, customColors),
if (widget.leftSideToolsBuilder != null)
...widget.leftSideToolsBuilder!(),
]
```

聊天消息列表 HomeChatPage  
消息发送和接收  _messageSendEventHandler   
ai服务配置  openai_repo  

### 图标库
[Icons](https://fonts.google.com/icons)
[flutter笔记（五）-----图标Icon](https://www.jianshu.com/p/4f479e5d9d8d)

### 支付
[tobias](https://github.com/OpenFlutter/tobias/blob/master/README_CN.md)  
[支付宝文档](https://opendocs.alipay.com/open/204/105051/)
```dart
PaymentScreen
```

### 分享  
[微信分享插件 fluwx](https://github.com/OpenFlutter/fluwx/blob/master/README_CN.md)
[微信开放平台](https://developers.weixin.qq.com/doc/oplatform/Mobile_App/Resource_Center_Homepage.html)
```dart
InviteCard  
shareTo
```
## AI模型  
支持 OpenAI 的 GPT-3.5，GPT-4 大语言模型  
支持 Anthropic 的 Claude instant，Claude 2.0 大语言模型  
支持国产模型：通义千问，文心一言，讯飞星火，商汤日日新，腾讯混元，百川53B，360智脑  
支持开源大模型：Llama2，ChatGLM2，AquilaChat 7B，Bloomz 7B 等，后续还将开放更多  
[Chatgpt](https://platform.openai.com/docs/guides/text-generation/managing-tokens)  
[开源模型 ChatGLM2](https://github.com/THUDM/ChatGLM2-6B)  
[开源 Aquila2](https://github.com/FlagAI-Open/Aquila2/blob/main/README_CN.md)    
[畫圖 midjourney](https://www.midjourney.com/home?callbackUrl=%2Fexplore)  
[midjourney 使用](https://zhuanlan.zhihu.com/p/638514125)

## 知识点  
### Bloc模式   
[Flutter中的BLoC，你所需要知道的一切](https://www.jianshu.com/p/4711af0e3c9c)    
[flutter_bloc](https://github.com/felangel/bloc/tree/master/packages/flutter_bloc)  
```java
MultiRepositoryProvider
```

### GoRouter路由
[GoRouter路由管理](https://www.jianshu.com/p/6bd8d27aac06)
```java
 _router = GoRouter();
 return MaterialApp.router();
```

### 网络请求  
[Dio](https://github.com/cfug/dio/blob/main/dio/README-ZH.md)


