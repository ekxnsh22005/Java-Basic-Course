public class java2darrays {
    public static void main(String[] args) {
        String cars[][] = new String[2][2];
        cars[0][0] = "Camero";
        cars[0][1] = "Ford";
        cars[1][0] = "Ferrari";
        cars[1][1] = "Laborgini";
        for(int i = 0; i<2; i++){
            for(int j = 0; j<2; j++){
                System.out.print(cars[i][j]+"\t");
            }
            System.out.println();
        }
    }
    
}