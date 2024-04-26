// Pakege chapter 2 

/*
*2.18 (Displaying Shapes with Asterisks)
*Write an application that displays a box, an oval, 
*an arrow and a diamond using asterisks (*), as follows:
*/

public class chapter218 {
    public static void main(String[] args) {
        // Define strings representing the shapes
        String box = "*********\n*       *\n*       *\n*       *\n*********\n";
        String oval = "   ***   \n *     * \n*       *\n *     * \n   ***   \n";
        String arrow = "    *    \n   ***   \n  *****  \n    *    \n    *    \n";
        String diamond = "    *    \n   ***   \n  *****  \n   ***   \n    *    \n";

        // Display the box shape
        System.out.println("Box:");
        System.out.println(box);
        
        // Display the oval shape
        System.out.println("Oval:");
        System.out.println(oval);
        
        // Display the arrow shape
        System.out.println("Arrow:");
        System.out.println(arrow);
        
        // Display the diamond shape
        System.out.println("Diamond:");
        System.out.println(diamond);
    }
}
