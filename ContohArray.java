public class ContohArray{
    public static void main (String[]args){
        int [][]duaD = new int [2][3];

        int k = 1;
        for (int i = 0; i < 2; i++){
            for (int j = 0; j < 3; j++){
                duaD[i][j] = k * 10 ;
                System.out.print(duaD[i][j]);
                if (j<2)System.out.print(" ");
                k++;
            }
            System.out.println();
        }
    }
}