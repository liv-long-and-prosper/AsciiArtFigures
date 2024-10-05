package AsciiArtFigures;

public class AsciiArtFigures {
        static String PRINT_CHAR = "*";
    public static void main(String[] args) {
        printNumberSlide(5);
        printVFormation(3);
        printDiamondBox(5);
        printTree(7);
    }

    private static void printNumberSlide(int size) {
        for (int rows = 0; rows < size; rows++) {
            for (int columns = 0; columns < 21; columns++) {
                System.out.print((rows*21 + columns)%10);
            }
            System.out.print("\n");
        }
    }

    private static void printVFormation(int vSize) {
            for (int v = vSize-1; v > 0; v--) {
                int spaces;
                String leftV = "\\";
                String rightV = "/";
                System.out.print(leftV);
                for (spaces = 1; spaces <= v; spaces++) {
                    System.out.print("  ");
                }
                System.out.println(rightV);
                for (spaces = 1; spaces <= vSize-v; spaces++) {
                    System.out.print(" ");
                }
            }
            System.out.print("\\/\n");
    }

    private static void printTree(int treeSize) {
        for (int i = 1; i <= treeSize; i ++) {
            int starCount = 2*(i-1)+1;
                for (int spcCount = treeSize - i; spcCount > 0; spcCount--) {
                    System.out.print(" ");
                }
                for (int stars=starCount; stars > 0; stars--){
                    System.out.print(PRINT_CHAR);
                }
                System.out.print("\n");
        }
        for (int trunk = 2; trunk > 0; trunk --) {
            for (int spcCount = treeSize - 1; spcCount > 0; spcCount--) {
                System.out.print(" ");
            }
            System.out.println("#");
        }
    }

    private static void printDiamondBox(int boxSize) {
        System.out.print("+");
            for (int r = 0; r < boxSize+2; r++) {
                System.out.print("-");
            }
        System.out.println("+");
        System.out.print("|");
        for (int r = 0; r < boxSize+2; r++) {
            System.out.print(" ");
        }
        System.out.println("|");

        for (int i = 1; i <= boxSize/2; i ++) {
            System.out.print("| ");

            int starCount = 2*(i-1)+1;
            for (int spcCount = (boxSize/2 + 1) - i; spcCount > 0; spcCount--) {
                System.out.print(" ");
            }
            for (int stars=starCount; stars > 0; stars--){
                System.out.print(PRINT_CHAR);
            }
            for (int spcCount = (boxSize/2 + 1) - i; spcCount > 0; spcCount--) {
                System.out.print(" ");
            }
            System.out.println(" |");
        }
        System.out.print("| ");
            for (int width= boxSize; width > 0; width--){
                System.out.print(PRINT_CHAR);
            }
            System.out.println(" |");
            for (int i = boxSize/2; i >0;i--){
                System.out.print("| ");
                int starCount = 2*(i-1)+1;
                for (int spcCount = (boxSize/2 + 1) - i; spcCount > 0; spcCount--) {
                    System.out.print(" ");
                }
                for (int stars=starCount; stars > 0; stars--){
                    System.out.print(PRINT_CHAR);
                }
                for (int spcCount = (boxSize/2 + 1) - i; spcCount > 0; spcCount--) {
                    System.out.print(" ");
                }
                System.out.println(" |");
            }
        System.out.print("|");
        for (int r = 0; r < boxSize+2; r++) {
            System.out.print(" ");
        }
        System.out.println("|");
        System.out.print("+");
        for (int r = 0; r < boxSize+2; r++) {
            System.out.print("-");
        }

        System.out.println("+");
    }
}


