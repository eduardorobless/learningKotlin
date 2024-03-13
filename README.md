# learningKotlin

Compile Java, Kotlin and calling Java from Kotlin: 


1- Compile the java class:
    javac {some.java}

2- Compile the kotlin files into jar file: 
    kotlinc {path}/*.kt -cp {path} -include-runtime -d {some.jar} *Note

3- Add .class file to the {some.jar} file:
    jar uf {some.jar} -C {path} {some.class}

4- Run jar file java:
    java -cp {some.jar} {someKt}



** note that as kotlinc cannot add java classes to the .jar file stil important to include .class files into the classpath so kotlin
compiler can work, latter those .class files can be added to the resulting jar file.


** To inspect jar content 
jar -tf {jar name}



Example: 

Supposed we have the following current dir tree:

.
├── cova


And inside cova we have: 

cova/
├── JavaTimeSeries.class
├── JavaTimeSeries.java
├── covariance.kt
└── generics.kt


So to generate a jar file that contains both java and kotlin classes we have to: 

1- Compile the java class:
    Move inside cova/ and execute javac JavaTimeSeries.java 

2- Compile the kotlin files into jar file:
    kotlinc cova/*.kt -cp . -include-runtime -d app.jar

3- Add .class file to the app.jar file:
    jar uf app.jar -C . cova/JavaTimeSeries.class

4- Run jar file:
    java -cp app.jar cova.CovarianceKt


