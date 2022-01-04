##### _28 Dec 2021 - 4 Jan 2022_

# Stream

A **Stream** is a Java interface that takes a source, conducts a set of operations to extract specific data, then provides that data to the application for use.
Essentially, it allows you to extract specialized data from a collection of generalized data.

Streams implement sequential assess of data.

An **Input stream** is used to read data from the source. And,an **Output stream** is used to write data to the destination.

## Types of Stream

Depending upon the data a stream holds, it can be classified into:

- Byte Stream
- Character Stream

#### Byte Stream

Byte stream is used to read and write a single byte (8 bits) of data.

All byte stream classes are derived from base abstract classes called `InputStream` and `OutputStream`.

#### Character Stream

Character stream is used to read and write a single character of data.

All the character stream classes are derived from base abstract classes `Reader` and `Writer` .

## Zipfile Stream

**Zip files** are basically an archive file that is used to compress all the files in one place. Doing this reduces memory space occupied and makes transport of files bundle easy.

The `java.util.zip` contains the classes for working with zip files. Each zip files has a header which includes information like name of the file and the compression method used like GZIP and ZIP.

## Object Stream

To work with the I/O of objects Java provided the support of **Object stream**.
Object stream classes implements either _ObjectInput_ or the _ObjectOutput_ interfaces.

**ObjectInput** is the subinterface of `DataInput` and the
**ObjectOutput** is the subinterface of `DataOutput` interface.
