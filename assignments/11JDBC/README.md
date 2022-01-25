###### _25 Jan 2022 - 26 Jan 2022_

### JDBC

Steps to make it work:
1. Edit the database connection string and give it your mariadb database name, username and password.
``
Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/<db_name>", "<username>", "<password>");
``

2. Compile like you usually do
```
javac <.java file>
```

3. Execute with classpath flag
```
java -cp .:<full_path_to_jar_file> <object code>
```
example:
```
java -cp .:utils/xxx.jar Insert
```


> Have newer version of JDK ? Then just run
```
java -cp .:utils/xxx.jar <xxx.java>
```

#### Breakdown
cp stands for classpath. Run ``java --help`` for more info
( . ) dot after -cp flag says current directory and ( : ) colon right after the dot is file separator.

> UNIX uses colon whereas ᴍɪᴄʀᴏꜱᴏꜰᴛ uses semi colon as their file separator
