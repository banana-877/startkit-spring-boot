# startkit-spring-boot
 
## docker install
事前に<a href="https://docs.docker.com/docker-for-mac/install/">docker</a>をインストールする

※Windowsの場合も同様にDockerとDockerComposeのインストールを行う。
 
## アプリケーションの起動
 
git clone したディレクトリで

```zsh
$ docker compose up -d
```

## アクセス確認
以下のページへアクセスして問題なければ構築成功

http://localhost:8080/

（http://localhost:8080/login にリダイレクトされ、ログイン画面が表示されること）


 終了時は以下のコマンドにて中断

 ```zsh
$ docker compose down
```
