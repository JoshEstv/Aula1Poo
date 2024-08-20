public class Bloco {
        int num;
        public static void main(String [] args){
             Bloco[]bs = new Bloco [10];
             for(int i = 0; i < bs.length; i++) {
                bs[i] = new Bloco();
                bs[i].num = 0;
             }

             for(int i = 0; i < bs.length; i++) {
                System.out.println(bs[i]);
             }
            
        }
        
    
}
