# Intro to Kotlin

## Basics

### Get Kotlin

* `brew install kotlin`

### Compile and Run the Hello World app

* `kotlinc helloworld.kt -include-runtime -d helloworld.jar`
* `java -jar helloworld.jar`

Obviously this includes the entire the Kotlin Runtime in the jar above. To
compile a library without the run time use:  `kotlinc hello.kt -d hello.jar`

To run the library/file use: `kotlin -classpath helloworld.jar HelloworldKt`
where the last argument is the automatically generated class `HellowordlKt`.

### Example app

* `kotlinc example.kt -d example.jar`
* `kotlin -classpath example.jar ExampleKt`

