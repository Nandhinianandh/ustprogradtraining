public class funccall {

    static int addTwo(int num){
        num=num+2;
        return num;
    }
    static int addTwoToObject(MyInteger intObj){
        intObj.value=intObj.value+2;
        return intObj.value;
    }

    static void changeArray(int[] arr){
        arr[0]=-1;
    }
    public static void main(String[] args)
    {
        int a=5;
        System.out.println(addTwo(a));
        System.out.println(a);
        int [] number={4,5,6,7};
        changeArray(number);

        for (int num:number) {
            System.out.println(num);
        }
        System.out.println(5);
        System.out.println('a');
        System.out.println(true);

        Integer num=5;
        String numStr =num.toString();
        System.out.println(numStr);

        //Object toString()

        MyInteger myinteger=new MyInteger(5);
        addTwoToObject(myinteger);
        System.out.println(myinteger);



        Demo demo=new Demo();
        System.out.println(demo);

    }
}

