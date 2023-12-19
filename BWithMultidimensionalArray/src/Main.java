public class Main {


    public static void main(String[] args) {

    int [] [] bArr= new int[7][4];

        for (int i = 0; i < bArr.length ; i++) {
            for (int j = 0; j < bArr[i].length; j++) {
                if (i==0 || j ==0){
                    System.out.print(" * ");
                } else if (i==3 || j == 3){
                    System.out.print(" * ");
                } else if (i==6){
                    System.out.print(" * ");
                } else {
                    System.out.print("   ");
                }

            }
            System.out.println();
        }

    }
}