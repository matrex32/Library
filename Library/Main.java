import java.util.*;


public class Main{
    public static void main(String [] args){
    Biblioteca biblioteca = Biblioteca.getInstance();
    
    Scanner sc = new Scanner(System.in);
    
    while(true){
        String s = sc.nextLine();
        String [] cmd = s.split(" ");
        switch(cmd[0]){
            case "exit":
                System.out.println("Aplicatia se inchide");
                System.exit(2);
            break;
            
            case "ADD_POEZII" :
                 String titlu = cmd[1];
                 String autor = cmd[2];
                 int nrPag =  Integer.parseInt(cmd[3]);
                 int nrPoezii = Integer.parseInt(cmd[4]);
                 Poezii po = new Poezii(titlu, autor, nrPag,  nrPoezii);
                 biblioteca.addCarte(po);
            break;
            
            case "ADD_ROMAN" :
                String titlu1 = cmd[1];
                String autor1 = cmd[2];
                int nrPag1 = Integer.parseInt(cmd[3]);
                String tip = cmd[4];
                Romane ro = new Romane(titlu1, autor1, nrPag1,tip );
                biblioteca.addCarte(ro);
            break;
            
            case "AF_CARTI" :
                biblioteca.afiseazaCarti();
            break;
            
            
            case "AF_CARTI_SORTATE" :
               biblioteca.afiseazaCartiSortat();
            break;
            
            case "AF_AUTOR" :
                biblioteca.afiseazaAutor(cmd[1]) ;
                
            break;
            }
    }
}
}