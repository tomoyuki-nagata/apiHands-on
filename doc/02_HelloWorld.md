# HelloWorld

## 1.HelloWorldという文字列を返すAPIを作成する。
1. src/main/java/com/api/handson/apiSample/controllerに「helloWorld」のフォルダを作成する。
2. 1のフォルダに、「HelloWorldController.java」を作成する。
3. 2のファイルの内容を下記のように記述する。
```java
package com.api.handson.apiSample.controller.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("hello-world")
    public String helloWorld() {
        return "Hello World!!";
    }
}

```
4. 保存して、talend-apiにて`GET localhost:8080/hello-world`にアクセスする。

### コードの解説
```java
// HelloWorldController.javaの存在するディレクトリの情報
package com.api.handson.apiSample.controller.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// このファイルがコントローラーであることの宣言
@RestController
public class HelloWorldController {

    // URLの設定(GET hello-worldというURLでリクエストが来た際にこのメソッドが動作する。)
    @GetMapping("hello-world")
    public String helloWorld() {
        // 戻り値
        return "Hello World!!";
    }
}

```
### 用語解説
- [GET](https://wa3.i-3-i.info/word1495.html)


## 2.パラメーターを用いて挨拶を返すAPIを作成する。
1. src/main/java/com/api/handson/apiSampleに「dto」というフォルダを作成する。
2. 1のフォルダに「Greeting.java」を作成する。
3. 2のファイルの内容を下記のように記述する。
```java
package com.api.handson.apiSample.dto;

import lombok.Getter;

public class Greeting {
    @Getter
    private final String content;

    public Greeting(String content) {
        this.content = content;
    }
}
```
4. src/main/java/com/api/handson/apiSample/controller/helloWorldのフォルダに、「GreetingController.java」を作成する。
5. 4のファイルの内容を下記のように記述する。
```java
package com.api.handson.apiSample.controller.helloWorld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.api.handson.apiSample.dto.Greeting;

@RestController
public class GreetingController {

    @GetMapping("greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting("Hello," + name + "!!");
    }
}
```
6. 保存して、talend-apiにて`GET localhost:8080/greeting?name=xxxx`にアクセスする。

### コードの解説
```java
// 結果の文字列を格納するためのクラス
public class Greeting {
    //Getterの自動生成
    @Getter
    private final String content;

    //コンストラクタの作成
    public Greeting(String content) {
        this.content = content;
    }
}

// このファイルがコントローラーであることの宣言
@RestController
public class GreetingController {

    // URLの設定(GET hello-worldというURLでリクエストが来た際にこのメソッドが動作する。)
    @GetMapping("greeting")
    //「name」というリクエストパラメーターを受け取る。もしリクエストパラメーターが送られていなかった場合、デフォルトの値がWorldになる。
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        //「Hello,xxxx!」の文字列をフィールドに持つGreetingオブジェクトを返却する。
        return new Greeting("Hello," + name + "!!");
    }
}
```

### 用語解説
- [リクエストパラメーター](https://algorithm.joho.info/computer/get-request-parameter/)
- [Getter](https://qiita.com/takahirocook/items/27828bc8477735612021)
- [コンストラクタ](https://wa3.i-3-i.info/word13646.html)