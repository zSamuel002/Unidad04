package arrayletras;

/**
 *
 * @author zSamuel002
 */
public class ArrayLetras {

    public static void main(String[] args) {
        char[][] x = new char[3][5];
        char y = 'a';
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
             x[i][j] = y ;
             y++;
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
        
 
    }
    
}

