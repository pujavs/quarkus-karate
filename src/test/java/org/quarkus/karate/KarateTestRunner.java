package org.quarkus.karate;

import io.quarkus.test.junit.QuarkusTest;
import com.intuit.karate.junit5.Karate;
//import com.intuit.karate.KarateOptions;

@QuarkusTest
//@KarateOptions(features = "src/test/resources")
public class KarateTestRunner {
	
	 @Karate.Test
	    Karate testFullPath() {
	        //return Karate.run("classpath:karate/tags.feature").tags("@first");
		 return Karate.run("src/test/resources/feature");
	    }

}
