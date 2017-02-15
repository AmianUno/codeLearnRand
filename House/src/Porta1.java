/**
 * Created by armia on 2/15/2017.
 */
/*aberta cor x y  method = abre fecha pinta isopen  */

public class Porta1 {

    boolean isOpen;
    String cor;
    double dimX;
    double dimY;

    void open(){

        isOpen = true;

    }
    void close(){
        isOpen = false;

    }


    void paint(String color){

        cor = color;

    }

}
