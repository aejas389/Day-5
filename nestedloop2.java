public class nestedloop2 {

    public static void main(String[] args) {
        

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=5;j++){
                System.out.println((char)(j+64)+"");
            }

            System.out.println();
        }
    }
    
}
