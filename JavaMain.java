public class JavaMain {

    public static void main(String [] args)
    {
        Integer[] numbers={324,6,7900};
        String[] strLine={"Albert","Is","smart"};

        GenericClass<Integer> integerInstance =new GenericClass<>();
        integerInstance.setElements(2000);
        System.out.println(integerInstance.getElements());

        integerInstance.printArrayContent(numbers);

        System.out.println();

        GenericClass<String> stringInstance=new GenericClass<>();
        stringInstance.setElements("Test");
        System.out.println(stringInstance.getElements());

        stringInstance.printArrayContent(strLine);

    }

}
