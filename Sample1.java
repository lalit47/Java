import java.io.File;
import java.io.FileInputStream;
public class Sample1 {
   public static void main(String args[]) throws Exception{

       FileReader f = new FileReader("D:\\practice\\dir\\my.txt");
		BufferedReader b = new BufferedReader(f);
		String s = null;
		while((s=b.readLine())!=null) {
			System.out.println(s);
		
                  int counter = 0;

            for( int i=0; i<s.length(); i++ ) {
                if( line.charAt(i) == 't' ) {
                     counter++; 

                } 


            }

             System.out.println(counter);   
          

		b.close();
		f.close();
}        
}
}     