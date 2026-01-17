# Hytale Plgin template

## How to build

```shell
./gradlew build
```
> Resolves HytaleServer.jar from install from "~/.var" or "%USER%/appdata, \
> if not found consider setting ENV variable "hytale_home" to install directory.


## How to run
```shell
./gradlew runServer
```

> Pleases not that the server will not start if there is a *-sources.jar in the build/libs directory,\
> since it essentially is a broken plugin.