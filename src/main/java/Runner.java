public class Runner {

    public static void main(String[] args) {

        // Shows how SpecificPair can only take arguments of the predefined type i.e. type specified in class constructor
//        SpecificPair strings = new SpecificPair("Hello",  2);
//        System.out.println(strings);



        // Shows how GenericPair can take any type when object is instantiated
        GenericPair mixedType = new GenericPair("Hello", 4);
        System.out.println(mixedType);

        // Shows type of returned object
        Object result1 = mixedType.getFirst();
        System.out.println("Type = " + result1.getClass().getName());

        Object result2 = mixedType.getSecond();
        System.out.println("Type = " + result2.getClass().getName());

    }
}
