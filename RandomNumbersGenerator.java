package random.numbers.generator;
    import java.util.*;


public class RandomNumbersGenerator {

    public static void main(String[] args) {
        int c;
        Random rnum = new Random();
        for (c = 1; c <= 3; c++ )
        {
            System.out.println(rnum.nextInt(20));
            
        }
        
    }
    
}
