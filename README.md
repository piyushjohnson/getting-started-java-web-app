# getting-started-java-web-app
A simple scaffolding java web app for vscode 

## Pre-requisites
Install these VSCose extension
* [Java Extension Pack](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack)
* [Gradle Language Support](https://marketplace.visualstudio.com/items?itemName=naco-siren.gradle-language)
* [Gradle Tasks](https://marketplace.visualstudio.com/items?itemName=richardwillis.vscode-gradle)

## Set JDK Environment variable
* Use [this](https://docs.oracle.com/cd/E19182-01/821-0917/inst_jdk_javahome_t/index.html) guide to setup java 
OR
* Add this config to settings.json of vscode
> "java.home":"C:\\Program Files\\Java\\<jdk_folder_name>"
For example: "java.home":"C:\\Program Files\\Java\\jdk1.8.0_161" (Windows needs backslash escaping)

## Starting project

* On Terminal (Ctrl + ')
  * Running & Deploying project on (localhost)[http://localhost:8080]
  >  .\gradlew appRun
  * Cleaning
  >  .\gradlew clean
  * Building
  >  .\gradlew build
  * Testing (Re-build)
  >  .\gradlew build

Or directly through gradle tasks explorer tab

## Gradle plugins configuration 
* Greety
  * [Greety plugin docs](https://akhikhl.github.io/gretty-doc/index.html)
* WAR 
  * [WAR plugin docs](https://docs.gradle.org/current/userguide/war_plugin.html)

For more guidance head to gradle web applications [guide](https://guides.gradle.org/building-java-web-applications/)
