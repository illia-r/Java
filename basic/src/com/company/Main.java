package com.company; // Указывается месторасположение данного класса


//import Sec.Second; // Ссылка на экемпляр


import java.util.*;


class basic{
    //static int num = 1;

    public static void main(String[] args) {
//        Second sec = new Second(); // Объект(экземпляр) классса
//        Third thz = new Third();

        // System.out.println(Second.number2); // Sec - дирректория, в которой находится класс Second
        // static - модификатор доступа,
        // с помощью которого можно получть доступ к полям и методам класса не создавая экземпляр класса
        // если не будет в 'static_method' static - код не будет работать

//        Second.static_method();
//        // Код ниже будет работаь, если обращаться к методу через экземпляр
//        sec.static_method();

        //Scanner scanner = new Scanner(System.in);
        //String name = scanner.nextLine();
        //int number = scanner.nextInt();
        //System.out.println(name + " " + number);
//        int[] arr = {12, 123, 430};
//        for (int i : arr) {
//            System.out.println(i + 1);
//        }
//
//
//        Book book1 = new Book();
//        Book book2 = new Book("Green Dog", 120);
//        Book book3 = new Book(300, "Dogs in House");
//
//
//        System.out.println(book1.getTitle() + " " + book1.getPages());
//        System.out.println(book2.getTitle() + " " + book2.getPages());
//        System.out.println(book3.getTitle() + " " + book3.getPages());
//
//        Scanner scanner = new Scanner(System.in);
//
//        int[][] nums =
//                {
//                        {1, 2, 3, 4, 10},
//                        {4, 5, 6, 10, 5},
//                        {7, 8, 9, 9, 9},
//                        {4, 10, 2, 0, 4},
//                        {10, 5, 8, 4, 1}
//                };
//
//        int sum = 0;
//        int size = nums.length - 1;
//        for (int i = 0; i < nums.length; i++) {
//            sum += nums[i][size];
//            for (int j = 0; j < nums[i].length; j++) {
//                System.out.printf("%d ", nums[i][j]);
//            }
//            size -= 1;
//            System.out.println();
//        }
//        System.out.println(sum);
//        nums[0][nums[0].length - 1] = sum;
//        for (int[] num : nums) {
//            for (int i : num) {
//                System.out.printf("%d ", i);
//            }
//            System.out.println();
//        }


//        System.out.println("Input matrix size");
//        int cell_count = scanner.nextInt();
//        int[]matrix = new int[cell_count];
//        System.out.println("Input value");
//        for (int i = 0; i < matrix.length; i++){
//            matrix[i] = scanner.nextInt();
//        }
//        digit(matrix);

        //Fibonacci

//        int num1 = 0;
//        int num2 = 1;
//        int rez = 0;
//
//        System.out.printf("%d ", num1);
//        System.out.printf("%d ", num2);
//        while (rez != 55){
//            rez = num1 + num2;
//            num1 = num2;
//            num2 = rez;
//            System.out.printf("%d ", rez);
//        }


        // Bubble sort
//        int [] mas = {32, 123, -32, 24, 5};
//        boolean isSorted = false;
//        int buf;
//        while(!isSorted) {
//            isSorted = true;
//            for (int i = 0; i < mas.length-1; i++) {
//                if(mas[i] > mas[i+1]){
//                    isSorted = false;
//
//                    buf = mas[i];
//                    mas[i] = mas[i+1];
//                    mas[i+1] = buf;
//                }
//            }
//        }
        //Max Min
//        int [] mas = {-300, 21, -45, 888, 93, 210, -30, 999};
//        int max = 0;
//        int min = 0;
//        for (int element: mas){
//            for (int i = 1; i < mas.length; i++){
//                if (element > mas[i] & element > max){
//                    max = element;
//                }
//                else if (element < mas[i] & element < min) {
//                    min = element;
//                }
//            }
//        }
//        System.out.print(max + " " + min);


        // reverse Bubble sort
//        boolean flag = true;
//        int temp = 0;
//        int [] mas = {-300, 21, -45, 888, 93, 210, -30, 999};
//
//        while (flag){
//            flag = false;
//            for (int i = 0; i < mas.length - 1; i++){
//                if (mas[i] < mas[i + 1]){
//                    temp = mas[i + 1];
//                    mas[i + 1] = mas[i];
//                    mas[i] = temp;
//                    flag = true;
//                }
//
//            }
//        }


//        for (int i: mas){
//
//            System.out.printf("%d ", i);
//        }


//        for (int i = 0; i < mas.length; i++){
//            if (mas[i] )
//        }
//        List<Integer> list = new ArrayList<>();
//        Set<Integer> set = new HashSet<>();
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        boolean flag = true;


//        while (flag){
//            String num = reader.readLine();
//            if (num.equals("")){
//                flag = false;
//            }
//            else {
//                set.add(Integer.parseInt(num));
//            }
//
//        }
//        String num = scanner.nextLine();
//        String [] numArray = num.split(" ");
//
//        for (String elem: numArray){
//            int swap_elem = Integer.parseInt(elem);
//            list.add(swap_elem);
//            for (int list_elem: list){
//                System.out.println(list_elem);
//            }
//        }
//        Collections.sort(list);
//
//        System.out.println(list);
        ArrayList<Integer> list_int = new ArrayList<>();
        String number = "4556364607935616";
        System.out.println(validator(number));
        System.out.println(number.substring(4, 15));
        char[] num = number.substring(4, 15).toCharArray();

        for (char i: num){
            //System.out.println(i);
            //int rezult = Character.digit(i, 10);
            int rez = Character.getNumericValue(i);
            list_int.add(rez);
        }
        for (int i: list_int){
            System.out.printf("%d ", i);
        }

        for (int i = 0; i < 5; ++i){
            System.out.println(i);
        }
        for (int j = 0; j < 5; j++){
            System.out.printf("%d ", j);
        }




    }
    public static String validator(String number){
        String new_number = number;
        if (number.equals("1")){
            return "1";
        }
        else if (number.equals("")){
            return "";
        }
        else{
            for (int i = 0; i < number.length() - 4; i++){
                 new_number = changeCharInPosition(i, '#', new_number);
            }
        }
        return new_number;
    }

    public static String changeCharInPosition(int position, char ch, String str){
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }





    static int sum(int n)
    {
        if (n < 10) return n;
            return n % 10 + sum(n / 10);
    }

    static int sum(int x, int y){

        return x + y;
    }
    static double sum(double x, double y){

        return x + y;
    }

    static void digit(int []matrix){
        int rezult = 0;
        for (int i: matrix){
            System.out.println(i);
            rezult += i;
        }
        System.out.println(rezult);
    }

    static int fib(int n){
        if (n == 0){
            return 0;
        }
        if (n == 1){
            return 1;
        }
        return fib(n - 1) + fib(n - 2);
    }
}




