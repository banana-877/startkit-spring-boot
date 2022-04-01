# startkit-spring-boot
 
## docker install
事前に<a href="https://docs.docker.com/docker-for-mac/install/">docker</a>をインストールする

※Windowsの場合も同様にDockerとDockerComposeのインストールを行う。
 
## マイグレーションの詳細
※現時点ではローカル環境にJDKとmavenのインストールが必要となっている。（コンテナ下で実行できるように改善予定）

JDKとmavenがインストールされている状態で、./app配下にて以下のコマンドを実行する

```zsh
$ mvn flyway:migrate
```

## アプリケーションの起動
 
git clone したディレクトリで

```zsh
$ docker compose up -d
```

## アクセス確認
以下のページへアクセスする。

http://localhost:8080/
（http://localhost:8080/login にリダイレクトされ、ログイン画面が表示されること）

Email：demo@test.com

password：password

アクセス後、上記の情報にてログインする。

HelloWorldのページが表示されれば構築成功となる。

## アプリケーションの終了
終了時は以下のコマンドにて中断

 ```zsh
$ docker compose down
```
