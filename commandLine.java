public class commandLine {
    public static void main(String[] args) {
        System.out.println("AMAN RAJ");
        
        if(args.length>0) // something is there
            System.out.println("hello "+ args[0]);
        else
            System.out.println("Please provide name on command line");
    }
}
