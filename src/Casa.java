/**
 * Created by armia on 2/15/2017.
 */
/*aberta cor x y  method = abre fecha pinta isopen  */
public class Casa {

    public static void main(String[] args){

        int openDoors = 0;

        Porta1 casaPorta1;
        casaPorta1 = new Porta1();
        Porta2 casaPorta2;
        casaPorta2  = new Porta2();
        Porta3 casaPorta3;
        casaPorta3  = new Porta3();

        casaPorta1.open();
        casaPorta2.open();
        casaPorta3.open();

        if (casaPorta1.isOpen == true){

            openDoors ++;


        }

        if (casaPorta2.isOpen == true){

            openDoors ++;


        }

        if (casaPorta3.isOpen == true){

            openDoors ++;


        }

        System.out.println(openDoors);
    }


}
