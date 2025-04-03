
import Controllers.ShellSort;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Metodo Shell----Insercion");
        int[] arr = {-10, 0, 4,2, 1, 9, 7,5};
        // Instancia
        ShellSort sS = new ShellSort();
        // Metodo
        sS.sort(arr); 
      
        System.out.print("Sorted array: ");
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println(); 


  
    }
}