package sample.testSuite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import sample.test.JunitAnnotationsExample;
import sample.test.TestCase2;
import sample.test.Testcase1;

@RunWith(Suite.class)
@SuiteClasses({Testcase1.class,
		TestCase2.class
		})
public class TestSuiteExample {

}
