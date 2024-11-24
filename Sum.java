// Sum of 1 to 10 even and odd numbers.
class Sum {
    public static void main(String[] args) {
        int i, even=0, odd=0;
        for (i = 0; i <=10; i++) 
        {
            if (i%2==0) 
            {
                even = even+i;
            }
            else
            {
                odd =odd+i;
            }
            

        }
        System.out.println("Sum of even = "+even+" Sum of odd = "+odd);
    }
}