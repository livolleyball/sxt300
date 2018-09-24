package unit_3;

public class TestFor {
    public static void main(String args[]){
        int [] numbers = {10, 20, 30, 40, 50};

        for(int x : numbers ){
            if(x==30){
                break;
            }
            System.out.print( x );
            System.out.print(",");
        }
        System.out.print("\n");
        String [] names ={"James", "Larry", "Tom", "Lacy"};
        for( String name : names ) {
            if(name == "Tom"){
                continue;
            }
            System.out.print( name );
            System.out.print(",");
        }
    }

}
