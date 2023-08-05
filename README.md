# eastechtest_backend

## Before starting the application
1. This app is created by using intelliJ as the editor so please enable the annotation processing
   - Click File -> Settings -> Build, Execution, Deployment -> Compiler -> Annotation Processors
   - Click on ***Enable annotation processing***
   - Select ***Obtain processors from project classpath***

2. Install the lombok plugin
   - Click File -> Settings -> Plugin
   - Search ***Lombok***
   - Install the plugin by the JetBrains (the one with chilli icon)
3. Make sure the Java version is 17 with the maven version 3.9.4 when building the project

## Start the application
- By IntelliJ, just run the application by clicking on the arrow on the line 7 in the class ***EastechtestApplication***
- By command line, please run the command ***mvn spring-boot:run*** in the root of the project directory