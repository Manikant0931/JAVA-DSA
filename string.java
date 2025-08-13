class VariableDemo {
    static String staticStr = "Hello";
    String instanceStr = "World";

    void showVariables() {
        String localStr = "Java";
        System.out.println("Static String: " + staticStr);
        System.out.println("Instance String: " + instanceStr);
        System.out.println("Local String: " + localStr);
    }

    public static void main(String[] args) {
        VariableDemo obj = new VariableDemo();
        obj.showVariables();
    }
}