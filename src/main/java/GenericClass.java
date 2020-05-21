public class GenericClass<T> {
    public T elements;

    public void setElements(T elements) {

        this.elements = elements;
    }

    public T getElements() {

        return elements;
    }

    public void printArrayContent(T[] array)
    {
        for (int i = 0 ; i < array.length;i++){
            System.out.println(array[i]);
        }


    }
}
