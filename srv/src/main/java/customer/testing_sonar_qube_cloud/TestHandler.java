package customer.testing_sonar_qube_cloud;

public class TestHandler {

    // Intentionally bad code to see if SonarCloud detects it
    public void testMethod() {
        int unusedVariable = 42; // This should trigger an 'unused variable' warning
        String nullString = null;

        // Null check missing - should trigger a code smell
        System.out.println(nullString.length());

        // Code duplication example
        System.out.println("Hello Sonar!");
        System.out.println("Hello Sonar!");
    }

    // Another method to test code coverage
    public int addNumbers(int a, int b) {
        return a + b; // Simple logic, can be covered by unit tests
    }

    public static void main(String[] args) {
        TestHandler handler = new TestHandler();
        handler.testMethod();
        System.out.println("Sum: " + handler.addNumbers(5, 10));
    }
}
