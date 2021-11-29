###### _23 Nov 2021 - 30 Nov 2021_

# Reflection in Java

### What is Reflection in Java ?

Reflection in Java is a feature which allows us to inspect and manipulate classes, interfaces, constructors, methods, and fields at run time. It allows an executing Java program to examine or "introspect" upon itself, and manipulate the internal properties of the program. For example, it's possible for a Java class to obtain the names of all its members and display them. It is also known as Reflection API.

> NOTE: Reflection is an advanced feature to be meddle with if one doesn't clearly know what exactly is that they want. Using Reflection and not handling it carefully will break the program.

_"Introspect: A reflective looking inward an examination of one's own thoughts and feelings."_

### Why Reflection API ?

It is a very useful approach to deal with the java class at runtime. It can be used to load the java class, call it's methods or analyse the class at runtime. Auto-Complete suggestions that pops up in IDE's listing all the methods of a class is a fruit of this feature. Reflection allows us to deal with any class without knowing it in advance.

The first and foremost use of Reflection in Java is when JVM is required to execute a Java program. JVM needs to read the bytecode, learn about all the variables, methods, constructors and inner class of that class and more importantly it should find the main method which would've been impossible without Reflection API.

#### Merits and Demerits of Reflection API

##### Merits:

- Inspection of interfaces, classes, methods, and fields during runtime is possible using reflection, even without using their names during the compile time.
- Debuggers utilize the property of reflection to look at private members on classes.
- Really useful to study a program when we only have compiled bytecode of a program without it's source code and original author of the program made a mistake and didn't expose proper API.

##### Demerits:

- Causes Preformance/Execution Overhead as reflective operations have slower performance than their non-reflective counterparts, and should be avoided in sections of code which are called frequently in performance-sensitive applications.
- Reflective code breaks abstractions and therefore may change behavior with upgrades of the platform causing exposure of internals.
- Reflective code is againts Object Oriented principles.

_The **java.lang.Class** class provides many methods that can be used to get metadata, examine and change the run time behavior of a class._

Commonly used methods of Class class:
| Method | Description |
| ------ | ----------- |
| 1) public String getName() | returns the class name
| 2) public static Class forName(String className)throws ClassNotFoundException | loads the class and returns the reference of Class class.
| 3) public Object newInstance()throws InstantiationException,IllegalAccessException | creates new instance.
| 4) public boolean isInterface() | checks if it is interface.
| 5) public boolean isArray() | checks if it is array.
| 6) public boolean isPrimitive() | checks if it is primitive.
| 7) public Class getSuperclass() | returns the superclass class reference.
| 8) public Field[] getDeclaredFields()throws SecurityException | returns the total number of fields of this class.
| 9) public Method[] getDeclaredMethods()throws SecurityException | returns the total number of methods of this class.
| 10) public Constructor[] getDeclaredConstructors()throws SecurityException | returns the total number of constructors of this class.
| 11) public Method getDeclaredMethod(String name,Class[] parameterTypes)throws NoSuchMethodException,SecurityException | returns the method class instance.

## Simple Reflect Example

#### **_Filename:_** Reflect.java

```java
class Person{}

class Reflect{
    public static void main(String args[]){
    Class reflectClass = Person.class;
    String name = reflectClass.getName();
    System.out.println("Name: "+name);
 }
}

```

#### run:

```sh
javac Reflect.java
java Reflect
```

#### Output:

```
Name: Person
```
