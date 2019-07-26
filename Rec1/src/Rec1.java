
public class Rec1 {

    int fac(int n){      
          if (n == 1)      
            return 1;      
          else      
            return(n * fac(n-1));      
    }   
    public static void main(String[] args) {
       Rec1 ob = new Rec1() ;
        System.out.println(ob.fac(5));
    }
    
}
