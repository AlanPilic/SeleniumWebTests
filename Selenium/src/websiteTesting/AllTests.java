package websiteTesting;

// test suite that runs all the tests

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ testLogin.class, testTable.class, testInput.class })
public class AllTests {

}
