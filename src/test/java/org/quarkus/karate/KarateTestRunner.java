package org.quarkus.karate;

//import io.quarkus.test.junit.QuarkusTest;
import com.intuit.karate.junit4.Karate;
import com.intuit.karate.KarateOptions;
import org.junit.runner.RunWith;

@RunWith(Karate.class)
@KarateOptions(features = "src/test/resources")
public class KarateTestRunner {

}
