# StringBinizer

Java library that encode strings in binary and decode binary in strings.

## Implementation

**Import like Maven dependency**

1. Clone project.
2. Install and create package in local .m2 executing this command:

```bash
    $ mvn clean install
```

3. Add dependency in `pom.xml` of your project:

```xml
    <dependency>
        <groupId>ar.com.pablocaamano</groupId>
        <artifactId>stringbinizer</artifactId>
        <version>1.2</version>
    </dependency>
```

**Import like external jar package**

1. Clone project.
2. Create `.jar` package executing this command:

```bash
    $ mvn package
```
3. Jar file will be generated in target directory.

## How to use

**Encoding any String to binary**

Invoke `encode(param)` method with String parameter. This method returns other String with the binary conversion. Example:

```java
    String binaryString = Stringbinizer.encode("Hello world!");
```

**Decoding binary to String**

Invoke `decoder(param)` method with binary parameter contained in String format. This method returns other String with the original String. Example:

```java
    String originalString = Stringbinizer.decode("100100010110001111000");
```