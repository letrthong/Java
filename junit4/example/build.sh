javac Calculator.java

javac  -cp ".:../lib/junit-4.12.jar" CalculatorTest.java



java -cp .:../lib/junit-4.12.jar:../lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore CalculatorTest