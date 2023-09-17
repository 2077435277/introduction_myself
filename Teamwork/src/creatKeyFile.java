import java.io.IOException;
import java.util.Scanner;

public class creatKeyFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s1,s2;//获取输入信息
        String[] split1,split2;//判断是否输入正确
        System.out.println("请输出你要执行的操作");
        System.out.println("-n 生成题目的个数");
        while(true){
        s1 = sc.nextLine();
        split1 = s1.split(" ");
        if(split1[0] != "-n")
            break;
        else
            System.out.println("无法识别信息，请重新输入");
        }
        System.out.println("-r 题目中数值范围");
        while(true){
            s2 = sc.nextLine();
            split2 = s2.split(" ");
            if(split2[0] != "-r")
                break;
            else
                System.out.println("无法识别信息，请重新输入");
        }
        CreatTitleFileText.creatTitle();
        generateTitle generateTitle = new generateTitle();
        generateTitle.creatTitle(Integer.parseInt(split1[1]),Integer.parseInt(split2[1]));
        System.out.println("题目已经成功生成,请到相应文件中查看");
    }
}
