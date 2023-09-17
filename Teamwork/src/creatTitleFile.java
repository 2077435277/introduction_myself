import java.io.File;
import java.io.IOException;
import java.io.PrintStream;

public class creatTitleFile {
    public void creatTitle() throws IOException {
        File file = new File("F:\\DeskTop\\结对作业\\ExerciseText.txt");
        file.createNewFile();
    }
    public void writeTitle(String[] s) throws IOException {
        PrintStream printStream = new PrintStream("F:\\DeskTop\\结对作业\\ExerciseText.txt");
        for(int i = 0 ; i < s.length ; i++){
            printStream.println("第"+ (i+1) + "题为:\t" + s[i]);
            printStream.flush();
        }
        printStream.close();
        return;
    }
    public void writeAnswer(String[] s) throws IOException {
        PrintStream printStream = new PrintStream("F:\\DeskTop\\结对作业\\AnswerText.txt");
        for(int i = 0 ; i < s.length ; i++){
            printStream.println("第"+ (i+1) + "题目的答为:\t" +s[i]);
            printStream.flush();
        }
        printStream.close();
        return;
    }
}
