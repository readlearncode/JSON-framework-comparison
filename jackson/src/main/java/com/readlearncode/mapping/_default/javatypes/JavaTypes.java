package com.readlearncode.mapping._default.javatypes;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.LongAdder;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class JavaTypes {

    private BigInteger bigInteger = BigInteger.TEN;
    private BigDecimal bigDecimal = BigDecimal.TEN;
    private URL url = new URL("http://www.readlearncode.com");
    private URI uri = new URI("http://www.readlearncode.com");
    private Optional<String> stringOptional = Optional.of("Hello World");
    private OptionalInt optionalInt = OptionalInt.of(10);
    private OptionalLong optionalLong = OptionalLong.of(10);
    private OptionalDouble optionalDouble = OptionalDouble.of(10);
    private AtomicInteger atomicInteger = new AtomicInteger(10);
    private LongAdder longAdder = new LongAdder();

    public JavaTypes() throws MalformedURLException, URISyntaxException {
    }

    public BigInteger getBigInteger() {
        return bigInteger;
    }

    public void setBigInteger(BigInteger bigInteger) {
        this.bigInteger = bigInteger;
    }

    public BigDecimal getBigDecimal() {
        return bigDecimal;
    }

    public void setBigDecimal(BigDecimal bigDecimal) {
        this.bigDecimal = bigDecimal;
    }

    public URL getUrl() {
        return url;
    }

    public void setUrl(URL url) {
        this.url = url;
    }

    public URI getUri() {
        return uri;
    }

    public void setUri(URI uri) {
        this.uri = uri;
    }


    public Optional<String> getStringOptional() {
        return stringOptional;
    }

    public void setStringOptional(Optional<String> stringOptional) {
        this.stringOptional = stringOptional;
    }

    public OptionalInt getOptionalInt() {
        return optionalInt;
    }

    public void setOptionalInt(OptionalInt optionalInt) {
        this.optionalInt = optionalInt;
    }

    public OptionalLong getOptionalLong() {
        return optionalLong;
    }

    public void setOptionalLong(OptionalLong optionalLong) {
        this.optionalLong = optionalLong;
    }

    public OptionalDouble getOptionalDouble() {
        return optionalDouble;
    }

    public void setOptionalDouble(OptionalDouble optionalDouble) {
        this.optionalDouble = optionalDouble;
    }

    public AtomicInteger getAtomicInteger() {
        return atomicInteger;
    }

    public void setAtomicInteger(AtomicInteger atomicInteger) {
        this.atomicInteger = atomicInteger;
    }

    public LongAdder getLongAdder() {
        return longAdder;
    }

    public void setLongAdder(LongAdder longAdder) {
        this.longAdder = longAdder;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JavaTypes javaTypes = (JavaTypes) o;
        return Objects.equals(bigInteger, javaTypes.bigInteger) &&
                Objects.equals(bigDecimal, javaTypes.bigDecimal) &&
                Objects.equals(url, javaTypes.url) &&
                Objects.equals(uri, javaTypes.uri) &&
                Objects.equals(stringOptional, javaTypes.stringOptional) &&
                Objects.equals(optionalInt, javaTypes.optionalInt) &&
                Objects.equals(optionalLong, javaTypes.optionalLong) &&
                Objects.equals(optionalDouble, javaTypes.optionalDouble) &&
                Objects.equals(atomicInteger, javaTypes.atomicInteger) &&
                Objects.equals(longAdder, javaTypes.longAdder);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bigInteger, bigDecimal, url, uri, stringOptional, optionalInt, optionalLong, optionalDouble, atomicInteger, longAdder);
    }

    @Override
    public String toString() {
        return "JavaTypes{" +
                "bigInteger=" + bigInteger +
                ", bigDecimal=" + bigDecimal +
                ", url=" + url +
                ", uri=" + uri +
                ", stringOptional=" + stringOptional +
                ", optionalInt=" + optionalInt +
                ", optionalLong=" + optionalLong +
                ", optionalDouble=" + optionalDouble +
                ", atomicInteger=" + atomicInteger +
                ", longAdder=" + longAdder +
                '}';
    }
}