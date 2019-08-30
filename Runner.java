import java.util.Arrays;
import java.util.Random;

public class Runner {
    public static final Sort[] sort={
            new methodSort()
    };
//待排序序列：顺序，逆序，随机

    public static void main(String[] args) {
        if(args.length<2){
            System.out.println("需要指定序列和数据量大小");
            return;
        }
        //
        String order=args[0];
        //
        int size=Integer.parseInt(args[1]);
        int[] array;
        if(order.equals("顺序")){
            array=buildOrder(size);
        }else if(order.equals("逆序")){
            array=buildReverse(size);
        }else if(order.equals("随机")){
            array=buildRandom(size);
        }else{
            System.out.println("不支持的序列顺序");
            return;
        }
        testSort(array);
    }

    public static int[] buildRandom(int size){
        int[]array=new int[size];
        Random random=new Random(20198898);
        for(int i=0;i<size;i++){
            array[i]=random.nextInt(size);
        }
        return array;
    }
    public static int[] buildReverse(int size){
        int[] array=new int[size];
        for(int i=size;i>0;i--){
            array[i]=i;
        }
        return array;
    }
    public static int[] buildOrder(int size){
        int[] array=new int[size];
        for(int i=0;i<size;i++){
            array[i]=i;
        }
        return array;
    }
    public static void testSort(int[] origin){
        for(Sort sort:sort){
            int[] array= Arrays.copyOf(origin,origin.length);
            long begin=System.nanoTime();
            sort.sort(array);
            long end=System.nanoTime();

            int[] second=Arrays.copyOf(origin,origin.length);
            Arrays.sort(second);

            if(!Arrays.equals(array,second)){
                System.out.println("排序错误");
            }
        }
    }
}
