###### _26 Nov 2021 - 03 Dec 2021_

# Garbage Collection in Java

### What is Garbage Collection ?

Garbage Collection is process of reclaiming the runtime unused memory automatically. In other words, it is a way to destroy the unused objects. Unlike in C/C++, in java garbage collection is performed **_automatically_**. The programmer does not need to explicitly mark objects to be deleted.The garbage collection implementation lives in the JVM.

> _Garbage means unreferenced objects._

#### How can an object become unrefereced ?

##### 1. By nulling the reference.

```java
MyClass obj = new MyClass();
obj = null;
```

##### 2. By assigning a reference to another.

```java
MyClass obj1 = new MyClass();
MyClass obj2 = new MyClass();
obj1 = obj2; // the first object obj1 is now available for garbage collection
```

##### 3. By anonymous object.

```java
new MyClass(); // anonymous object because it has no name.
```

#### Garbage Collection Methods

There are two methods in java that can be used for garbage collection.

##### 1. finalize()

The finalize() method is invoked each time before the object is garbage collected. This method can be used to perform cleanup processing. This method is defined in Object class as:

> _The Object class is the ***parent class*** of all the ***classes*** in java by default. In other words, it is the topmost class of java._

```java
protected void finalize(){}
```

##### 2. gc()

The gc() method is used to invoke the garbage collector to perform cleanup processing. The gc() is found in System and Runtime classes.

> _the Runtime class is there to provide access to the Java runtime system. The runtime information like memory availability, invoking the garbage collector, etc._

> _System class is there to provide access to system resources. It contains accessibility to standard input, standart output, error output streams, current time in millis, terminating the application, etc._

```java
public static void gc(){}
```

> NOTE: as of JDK 9 release finalize() is now deprecated

#### Simple Example:

```java
public class GarbageCollection{
    public static void main(String[] args){
        GarbageCollection g1 = new GarbageCollection();
        GarbageCollection g2 = new GarbageCollection();

        g1 = null;
        System.gc();

        g2 = null;
        Runtime.getRuntime().gc();
    }
}
```
