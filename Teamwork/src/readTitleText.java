import org.junit.Test;

import java.io.*;

public class readTitleText {
    @Test
    public void readTitleText() throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader("F:\\DeskTop\\结对作业\\ExerciseText.txt"));
        String s;
        while((s = bf.readLine() ) != null){
            System.out.println(s);
        }
        bf.close();
    }
}
