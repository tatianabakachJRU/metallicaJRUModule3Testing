package com.javarush;

import org.junit.platform.suite.api.SelectClasses;
import org.junit.platform.suite.api.Suite;
import org.junit.platform.suite.api.SuiteDisplayName;

@Suite
@SuiteDisplayName("Suite Tests")
@SelectClasses({CalculatorTest.class, ObjectTestExample.class,
        ParametrizedTestExample.class})
public class SuiteTestExample {
}
