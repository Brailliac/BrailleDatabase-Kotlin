# BrailleDatabase - Kotlin

Kotlin database of Braille codes, and associated data and utility classes.
Includes bi-directional translator.

Currently featuring the following Braille codes:
- UEB
- Czech
- Slovak
- Spanish
- Swedish
- Tamil

# To Use:

0. (If you aren't already using JitPack) Add JitPack in your root build.gradle, at the end of repositories:

```
allprojects {
  repositories {
    ...
    maven { url 'https://jitpack.io' }
  }
}
```
  
1. Add the dependency for the library:

```
dependencies {
  implementation ("com.github.brailliac:brailledatabase-kotlin:1.0.8")
}
```

# Braille info

The numbering of Braille dots is like:
![alt text](https://cdn.shopify.com/s/files/1/0543/5261/products/image_d1b3a9ff-bb2a-4fc6-bd63-46b1562d252c.jpg?v=1403641507)


# Adding new codes

I am always looking for people to help add new languages and Braille codes!

Go to https://github.com/Brailliac/BrailleDatabaseKotlin/tree/master/brailledatabase/src/main/java/com/lukeneedham/brailledatabase/Braille/SymbolDatabases and create a new file named: \*SymbolDatabase.java where * is the name, in English, of the new Braille database. You can copy the code from an existing SymbolDatabase file as a template, and tweak it for your new database.

If you need any information, please contact me at brailletutorapp@gmail.com

# Java

There is a also a Java version of this database, which is no longer maintained. It can be found here: https://github.com/Brailliac/BrailleDatabaseJava

Copyright © 2019 Brailliac / Luke Needham
