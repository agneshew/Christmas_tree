public class Tree {

    public static void makeTree(){

        int height = 5;
        int segments = 3;
        int downLineOfStars = 2*height+2*segments-3;

        String maxStr = "";

        for (int len=0; len < downLineOfStars; len++){
            maxStr+=" ";
        }

        for (int i=1; i <= segments; i++){

            for (int line=1; line <= height; line++){
                String starStr = "";
                for (int j=1; j <= 2*line+2*i-3; j++){
                    starStr+="*";
                }
                for (int space=0; space <= downLineOfStars-(height+line+i); space++){
                    starStr = " " + starStr;
                }
                System.out.println(starStr);
            }
        }

        for (int i=0; i <= downLineOfStars/2;i++){
            System.out.print(" ");
        }

        System.out.print("*\n");
        for (int i=0; i <= downLineOfStars/2;i++){
            System.out.print(" ");
        }

        System.out.print("*\n");
        for (int i=0; i <= downLineOfStars/2-3;i++){
            System.out.print(" ");
        }

        System.out.print("*******\n");
    }
}
