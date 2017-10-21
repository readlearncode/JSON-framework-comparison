package mapping._default.basictypes;

import org.boon.json.JsonFactory;
import org.junit.Test;

import static org.assertj.core.api.Java6Assertions.assertThat;

/**
 * Source code github.com/readlearncode
 *
 * @author Alex Theedom www.readlearncode.com
 * @version 1.0
 */
public class AllBasicTypesTest {

    @Test
    public void givenDefaultValues_shouldSerialise() {

        /*
            {
              "byteWrapper": 0,
              "shortWrapper": 0,
              "charWrapper": " ",
              "intWrapper": 0,
              "longWrapper": 0,
              "floatWrapper": 0,
              "doubleWrapper": 0,
              "string": "Hello World"
            }
         */

        String expectedJson ="{\"byteWrapper\":0,\"shortWrapper\":0,\"charWrapper\":\" \",\"intWrapper\":0,\"longWrapper\":0,\"floatWrapper\":0.0,\"doubleWrapper\":0.0,\"string\":\"Hello World\"}";
        AllBasicTypes allBasicTypes = new AllBasicTypes();
        String actualJson =  JsonFactory.create().toJson(allBasicTypes);
        assertThat(actualJson).isEqualTo(expectedJson);

    }

}