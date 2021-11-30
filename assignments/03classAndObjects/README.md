###### _30 Nov 2021 - 01 Dec 2021_

# Class and Objects in Java

### What is a class ?

A class is a user defined blueprint or prototype from which objects are created. It represents the set of properties or methods that are common to all objects of one type.
Example:

```java
public class Dog {
   String name;
   String breed;
   Dog(String name, String breed){
       this.name = name;
       this.breed = breed;
   }
   // method
   void barking() {
   }
   // method
   void hungry() {
   }
   // method
   void sleeping() {
   }
}

```

### What is an object ?

It is an instance of a class.
Example:

```java
Dog myDog = new Dog("Max", "German Shepherd");
```
