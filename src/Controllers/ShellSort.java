package Controllers;



public class ShellSort{
    public void sort(int [] array) {
        int n= array.length;
        for(int gap=n / 2;gap>0;gap /=2){
            System.out.println("Gap:"+gap);

        // INSERCCION
            for(int i=gap;i<n;i++){
                int temp=array[i];
                int j=i;
               
                 
                //  AQUI SE DESPLZA"TEMP" A SU POSICION CORRECTA
                while(j>=gap && array[j-gap] >temp){
                    array[j]=array[j-gap];
                    j=j-gap;


                    array[j]=temp;




                }
            } 
        }      
    }
    
}
public void ordenarAscendete( int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        for (int j = 0; j < array.length - i - 1);
        if (array[j] > array[j + 1]) {
            int aux = array[j];
            array[j] = array[j + 1];
            array[j + 1] = aux;

        }
    }
}

public void ordenarDescendente( int[] array) {
    for (int i = 0; i < array.length - 1; i++) {
        for (int j = 0; j < array.length - i - 1; j
        if (array[j] < array[j + 1]) {
            int aux = array[j];
            array[j] = array[j + 1];
            array[j + 1] = aux;
        }
    }
}