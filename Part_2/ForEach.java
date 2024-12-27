public class ForEach {
    public static void main(String[] args) {
        String[] array = new String[] { "RAM", "SHYAM", "MOHAN", "SOHAN", "SITA", "GEETA"};
        printArray(array);
        printArrayForEach(array);
    }

    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    public static void printArrayForEach(String[] array)
        {
            for(String name: array)
            {
                System.out.println(name);
            }
        }


}
