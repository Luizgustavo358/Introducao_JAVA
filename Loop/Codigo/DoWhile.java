public class DoWhile{

    public static void main( String [] args ){
        // altere esse valor e veja as mudancas
        int numRepeticoes = 10;
        int num = 1;

        do{
            System.out.println( num );
            num = num + 1;
        }while( num <= numRepeticoes );
    }
}