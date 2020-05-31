public class Skyscraper {
    public static void main(String[] args) {
        solve(21);
        solve(50);
        solve(74);
    }

    public static void solve(int breaklevel){
        int lowlevel = 0;
        int toplevel = 100;
        while (true) {            
            if (breaklevel <= (lowlevel + toplevel)/2 ) {
                toplevel = (lowlevel + toplevel)/2;
                break;
            } else {
                lowlevel = (lowlevel + toplevel) /2;

            }
        }
        for (int i = lowlevel; i < toplevel+1; i++) {
            if (i <= breaklevel) {
                lowlevel = i;
            } else {
                break;
            }
        }
        System.out.println("Vejce se nerozbije do " + lowlevel + ". patra.");
    }
}
