public class Main {
    public static void main(String[] args){
        //Create an array with each value = 0 to represent 100 closed lockers.
        int[] lockers = new int[100];
        for (int i = 0; i < 100; i++){
            lockers[i] = 0;
        }
        //Open lockers will be represented by 1 and closed lockers by 0.
        //Using a nested for loop, starting at the nth locker, it and every nth locker after it will be
        //changed from open to closed or closed to open, as the case may be.
        for(int i = 0; i < 100; i++){
            for(int j = i; j < 100; j += (i+1)){
                if(lockers[j] == 0){
                    lockers[j] = 1;
                }else{
                    lockers[j] = 0;
                }
            }
        }
        //Print the locker numbers that remain open.
        System.out.println("These lockers remain open: ");
        for(int i = 0; i < 100; i++){
            if(lockers[i] == 1){
                System.out.println(i + 1);
            }
        }
        //What do I notice about the lockers that remain open?
        System.out.println("Wow! Those numbers are all the perfect squares from 1 to 100! \n" +
                "Specifically, they are the squares of numbers 1 to 10.");
    }
}
