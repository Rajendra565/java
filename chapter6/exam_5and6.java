// public class exam_5and6 {
//     public static void main(String[] args) {
//         int []mark={1,2,3,4,5,6,7,8};
//         int l=mark.length;
//         // int n=Math.floorDiv(l, 2);
        
//         int temp;
//         for(int i=0;i<Math.floorDiv(l, 2);i++){
//             temp=mark[i];
//             mark[i]=mark[l-i-1];
//             mark[l-i-1]=temp;
            
//         }
//         for (int i : mark) {
//             System.out.println(i);
//         }
// }
// }
public class exam_5and6 {

    public static void main(String[] args) {
        int []arr={888,2,666,4,5,6};
        int mix=666;
        for (int i : arr) {
            if (mix>i) {
                mix=i;
            }
        }
        System.out.println(mix);

        } 
            
            
        }
    

