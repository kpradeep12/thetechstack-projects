# ReactJS and Spring Boot Maven Archetype

This is a Maven archetype project to create a ReactJS and Sprint boot application. Single project contains backend and frontend folders.

Packaged with below libraries

- Spring:
  - DevTools
  - Lombok

- ReactJS:
  - Formik
  - Material UI
  - React router

## Install in local repository

Clone this repo and execute below command to install in local repository.

`mvn clean install`


## Generate ReactJs and Spring project

Once this archetype is installed in local repository, then it will be ready to use to generate ReactJs and Spring boot project.

`mvn archetype:generate -DarchetypeGroupId=net.thetechstack -DarchetypeArtifactId=reactjs-spring-boot-archetype -DarchetypeVersion=1.0 -DgroupId=<group-id> -DartifactId=<project-name>`

Provide proper values for \<group-id> and \<project-name>.

### Contents of the project
- **pom.xml**: Maven POM file
- **src**: Java/Spring boot source folder 
- **ui**: ReactJs files.

### Compile and Run project

`mvn clean compile`

Builds Spring and ReactJs files

`mvn spring-boot:run`

Runs application at default 8080 port


Access application at http://localhost:8080

