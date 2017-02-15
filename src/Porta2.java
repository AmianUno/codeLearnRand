/**
 * Created by armia on 2/15/2017.
 */
public class Porta2 {
    boolean isOpen;
    String cor;
    double dimX;
    double dimY;

    void open(){

        isOpen = true;

    }
    void paint(String color){

        cor = color;

    }
    void close(){
        isOpen = false;

    }
}
