public class arrays_displaying {
    public static void main(String[] args) {
        int []mark={55,77,66,88,99,90,12,40,50,50,05,98,87,76};
        System.out.println(mark.length);
        // for(int i:mark){
        //     System.out.println(i);
        // }

        //    for loop
        for(int i=0;i<mark.length;i++){
            System.out.println(mark[i]);
        }

        // reverse order
        // for(int i=mark.length-1;i>0;i--){
        //     System.out.println(mark[i]);
        // }
    }
}
