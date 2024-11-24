import java.io.*;
public class Main3
{
    public static void main(String[] args) throws Exception
    {
        File f = new File("Demo.txt");
        FileReader fr = new FileReader(f);
        BufferedReader br = new BufferedReader(fr);
        String data = null;
        if((data = br.readLine())!=null);
        {
            System.out.println(data);
        }
        br.close();
        fr.close();

    }
}
