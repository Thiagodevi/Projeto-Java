
public class appConta {

   
    public static void main(String[] args) {
       Conta c1;
       c1 = new Conta();
       
       c1.setCorretista("Thiago");
       c1.setNumero(155495790);
       c1.setValor(150.00f);
       
       System.out.println("o nome do corretista é:" + c1.getCorretista());
       System.out.println("o numero da conta é:" + c1.getNumero());
       System.out.println("o valor inicial da conta é: " + c1.getValor());
       
      
       
    }
    
}
