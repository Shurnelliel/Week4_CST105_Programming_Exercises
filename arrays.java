/** Program: arrays Program
* File: arrays.java
* Summary: Reads text from a file
* Author: Shertonia S. Stanley
* Date: December 10, 2017
**/
class arrays {
public static void main(String[] args) {
    	// Create an array of String arrays:
        String[][] values = new String[20][45];

        // Fill first row with 1-element array.
        values[0] = new String[1];
        values[0][0] = "The proverbs of Solomon son of David, king of Israel:";
     
        values[1] = new String[1];
        values[1][0] = "To know wisdom and instruction; to perceive the words of understanding";
      
        values[2] = new String[1];
        values[2][0] = "To receive the instruction of wisdom, justice, and judgment, and equity";
     
        values[3] = new String[1];
        values[3][0] = "To give subtilty to the simple, to the young man knowledge and discretion";
        
        values[4] = new String[1];
        values[4][0] = "A wise man will hear, and will increase learning";
        
        values[5] = new String[1];
        values[5][0] = "To understand a proverb, and the interpretation";
        
        values[6] = new String[1];
        values[6][0] = "The fear of the Lord is the beginning of knowledge";
        
        values[7] = new String[1];
        values[7][0] = "My son, hear the instruction of thy father,";
        
        values[8] = new String[1];
        values[8][0] = "For they shall be an ornament of grace unto thy head";
        
        values[9] = new String[1];
        values[9][0] = "My son, if sinners entice thee, consent thou not";
        
        values[10]= new String[1];
        values[10][0]= "If they say, Come with us, let us lay wait for blood";
       
        values[11]= new String[1];
        values[11][0]= "Let us swallow them up alive as the grave; and whole";
        
       	values[12]= new String[1];
        values[12][0]= "We shall find all precious substance";
        		
 		values[13]= new String[1];
        values[13][0]= "Cast in thy lot among us; let us all have one purse";	
        
       	values[14]= new String[1];
        values[14][0]=	"My son, walk not thou in the way with them";
        
       	values[15]= new String[1];
        values[15][0]= "For their feet run to evil, and make haste to shed blood";
        		
       	values[16]= new String[1];
        values[16][0]= "Surely in vain the net is spread in the sight of any bird";
        		
   		values[17]= new String[1];
        values[17][0]= "And they lay wait for their own blood; they lurk privily for their own lives";
        
      	values[18]= new String[1];
        values[18][0]= "So are the ways of every one that is greedy of gain";
        
   		values[19]= new String[1];
        values[19][0]=  "Wisdom crieth without; she uttereth her voice in the streets";
        
        
         // Display rows and elements.
        for (String[] array : values) {
            for (String element : array) {
                System.out.print(element);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}





