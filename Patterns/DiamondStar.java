package Patterns;
public class DiamondStar
{
    public static void main(String[] args) {
      	int spaceCount = 3, spacedec = 1;
		for(int i = 1; i<6; ){
          spacedec++;
          for(int j = spaceCount - spacedec; j >= 0; j--){
            System.out.print(" ");
          }
          for(int inner = 1;inner <= i;inner++){
            System.out.print("*");
          }
          System.out.println();
          i+=2;
        }
        
        spacedec = 3;
 
        for(int i = 3; i>0 ; ){
          spacedec--;
          for(int j = spaceCount - spacedec; j >= 1; j--){
            System.out.print(" ");
          }
          for(int inner = i;inner >= 1;inner--){
            System.out.print("*");
          }
          System.out.println();
          i-=2;
        }
	}
}