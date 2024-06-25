# Java OOP

 Training of solid fundamentals of the Java Language and Object Orientation. It is in topics for better understanding of each functionality presented.

- AbstractClasses
- Object Encapsulation
- Polymorphism
- Inheritance
- Objects Composition
- Enumeration
- Collections
- Interface
- Generics
- Lambda
- Exceptions

## Installing Java 17 on Linux (Ubuntu)

1 - Open a terminal (CTRL + ALT + T)

2 - Type the following command

`sudo add-apt-repository ppa:linuxuprising/java`

Accept the terms and press ENTER

3 - Update the package manager

`sudo apt-get update`

4 - Install Java 17

`sudo apt-get install oracle-java17-installer --install-recommends`

5 - To make sure Java is installed, type `java -version`

### Note

If Java is not being recognized in the terminal, add JAVA_HOME to your bashrc variables

`export JAVA_HOME=/usr/lib/jvm/java-17-openjdk-amd64`

## Installing Maven on Linux

1- Update the packages

`sudo apt-get update`

2 - Install Maven with the following command

`sudo apt-get -y install maven`

Maven should be installed in one of the following paths **/usr/share/maven**
or **/etc/maven**
.

To check if Maven was successfully installed, access Terminal and type

`mvn -version`

This will show the version of Maven installed.

## Other tools

- Rest Client
- Docker and Docker Compose
