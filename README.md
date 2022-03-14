# startkit-spring-boot
 
## docker install
事前に<a href="https://docs.docker.com/docker-for-mac/install/">docker</a>をインストールする

※Windowsの場合も同様にDockerとDockerComposeのインストールを行う。
 
## バックエンド側起動
 
git clone したディレクトリで

```zsh
$ cd ./api
$ docker build -t springio/gs-spring-boot-docker .
$ docker run -p 8080:8080 springio/gs-spring-boot-docker
```
 実行中にCtrl+Cにて中断
