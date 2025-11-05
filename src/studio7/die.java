public class die{
    
    public int s;

   public die (int initN){
    s = initN;
   }

    public void Print(){
         System.out.println((int)Math.random()*s +1);
    }

    public static void Main(String[] args) {
        die dice = new die( 6);
        dice.Print();
    }

}

