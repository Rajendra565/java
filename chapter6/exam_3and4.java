

// public class exam_3and4 {
//     public static void main(String[] args) {
//         int []mark={90,99,89,78,68};
//         int sum=0;
//         for (int i : mark) {
//             sum=sum+i;
//         }
//         System.out.println("average in the arrays : "+sum/mark.length);
//     }
// }
public class exam_3and4 {
        public static void main(String[] args) {
            int [][]num1={{1,2,3},{4,5,6}};
            int [][]num2={{6,9,4},{7,8,5}};
            // int [][] sum=num1[][]+num[][];
            int [][]sum={{0,0,0},{0,0,0}};
            for(int i=0;i<num1.length;i++){
            for(int j=0;j<num1[i].length;j++){
                sum [i][j]=num1[i][j]+num2[i][j];
                System.out.print(sum[i][j]+" ");
                
            }
            System.out.println("");

        }
    
    }
}