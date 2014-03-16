package capsula;


public class Programa {
    public static void main (String[] args)
    {
         Agenda agenda1 = new Agenda();
         Agenda agenda2 = new Agenda();
         Agenda agenda3 = new Agenda();
        
    
         agenda1.anote(12,10,"Dia da Criança");
         agenda2.anote(7,9,"Independência do Brasil");
         agenda3.anote(24,8,"Niver com Amor!!");
    
         agenda1.mostraAnotacao();
         agenda2.mostraAnotacao();
         agenda3.mostraAnotacao();
    
       /*  agenda2.dia = 7;
         agenda2.mes = 15;
         agenda2.anotacao = "Independencia do Brasil";
         agenda2.mostraAnotacao();*/
    }
}
