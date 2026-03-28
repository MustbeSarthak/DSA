class Longestprefix {

    public static void main(String[] args) {

        StringBuilder res = new StringBuilder(); // Using string builder for better performance

        String[] arr = {"flower", "flow", "fiar"};
        String base = arr[0];

        for (int i = 0; i < base.length(); i++) {

            char ch = base.charAt(i); 

            for (int j = 0; j < arr.length; j++) {

                if (i >= arr[j].length() || arr[j].charAt(i) != ch) { // The condition in case out of bound error
                    System.out.println(res.toString()); 
                    return;
                }
            }

            res.append(ch); // Returning the string 
        }

        System.out.println(res.toString());
    }
}