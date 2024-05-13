package conversordemoedas.main;

import conversordemoedas.models.Currency;
import conversordemoedas.utils.SaveFiles;
import java.util.List;

public class Main{
    public static void main(String[] args) {

        startMsg();
        Menu menu = new Menu();
        menu.showMenu();

        List<Currency> history = menu.history;


        var fileSaver = new SaveFiles();
        // fileSaver.saveJson(menu.exportList());
        System.out.println(history.toString());
        endMsg();

    }

    private static void startMsg(){
        System.out.println("""
        ****************************************************************
        
        ----------------------------------------------------------------
        
                 Seja bem-vindo(a) ao Conversor de Moedas!
        """);
    }

    private static void endMsg(){
        System.out.println("""
        
        
                 
        
        ----------------------------------------------------------------
        
        ****************************************************************
        """);
    }
}
