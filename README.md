# Utilisation

## 1: Maven

J'utilise maven, mais vous pouvez utilisez Gradle en récupérant les mêmes dépendances!
Vous trouverez les dépendances du projet dans le fichier pom.xml.

## 2: Spring

Tout le code est commenté pour vous permettre de comprendre le fonctionnement de base de Spring.
Cependant il ne faut pas hésiter à utiliser la documentation officielle de Spring : [Spring.io](http://spring.io/)

## 3: NB

### Remarque:
Le projet ne fonctionne pas avec un Tomcat 8, c'est la dépendance de javax.servlet/servlet-api qui est en cause.
Je n'ai pas trouvé de solution pour l'instant, pour utiliser le projet veillez à utiliser un Tomcat 7.

### Principaux fichiers:
* web.xml : configuration du serveur tomcat
* mvc-dispatcher-servlet.xml : configuration de Spring (en particulier de la DispatcherServlet)

### Classes:
model - dao - service - controller


## 4: Base de données

Utilisez la base de donnée de votre choix avec cette application en créant une DataSource, vous trouverez de nombreux tutoriel pour cela.
Dans un premier temps la solution que j'ai choisi permet de créer assez rapidement une batterie d'objet simples.

### SQL
Utiliser une datasource

### MongoDB
Installation de MongoDB