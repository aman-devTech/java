public class basicOFstrings {
    public static void main(String[] args) {
        String name = "AMAN RAJ";
        int length =name.length();
        int idx = name.indexOf("R");
        char letter = name.charAt(3);
        int lastindex = name.lastIndexOf('A');

        name = name.toLowerCase();
        name = name.toUpperCase();
        //name = name.trim(" ");
        name = name.replace('A' , 'O');
        // isEmpty checks if the string is empty?
        // name.equalsIgnoreCase("");  or name.equals("")
        // name.contains("")
        System.out.println(name);
    }
    
}
