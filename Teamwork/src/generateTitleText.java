import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.DoubleStream;

public class generateTitleText {
    @Test
    public void creatTitle() {
        int num = 10;
        int scope = 10;
        Random random = new Random();
        int signNum;//获取符号
        char sign;//随机生成的符号
        int answer_n, answer_d;//结果数
        int e1, e2;
        int numerator_1, numerator_2;
        int denominator_1, denominator_2;//定义分子分母
        String s;//用来判断是否是重复题目
        ArrayList<String> string = new ArrayList<>();
        String[] strings = new String[num];
        String[] answer = new String[num];
        String Answer;
        int strings_num = 0;//获取字符串的下标
        String[] strings1, strings2;
        getPoints getPoints = new getPoints();//获得题目
        int answer_integer;
        for (int j = 0; j < num; j++) {
            strings1 = getPoints.getPoint(num);//获得数1
            strings2 = getPoints.getPoint(num);//获得数2
            numerator_1 = Integer.parseInt(strings1[2].split("/")[0]);
            denominator_1 = Integer.parseInt(strings1[2].split("/")[1]);
            numerator_2 = Integer.parseInt(strings2[2].split("/")[0]);
            denominator_2 = Integer.parseInt(strings2[2].split("/")[1]);
            e1 = Integer.parseInt(strings1[0]);//获得整数部分
            e2 = Integer.parseInt(strings2[0]);//获得整数部分
            int max, min;
            signNum = Math.abs(random.nextInt(4));
            switch (signNum) {
                case 0: {
                    answer_n = (e1 * denominator_1 + numerator_1) * denominator_2 + (e2 * denominator_2 + numerator_2) * denominator_1;
                    answer_d = denominator_1 * denominator_2;
                    max = Math.max(answer_d, answer_n);
                    min = Math.min(answer_d, answer_n);
                    int divisor = getPointTest.findDivisor(max, min);
                    answer_integer = answer_n / answer_d;
                    if(answer_integer !=0)
                        Answer =answer_integer + "'" + ((answer_n - answer_integer * answer_d)/ divisor ) + "/" + (answer_d / divisor);
                    else
                        Answer =((answer_n - answer_integer * answer_d)  / divisor) + "/" + (answer_d / divisor);
                    s = strings1[0] + strings1[1] + strings1[2] + " + " + strings2[0] + strings2[1] + strings2[2] + " =";
                    if (string.contains(s)) {
                        j--;
                        continue;
                    }
                    string.add(s);
                    strings[strings_num] = s;
                    answer[strings_num] = Answer;
                    System.out.println(e1 + "'" + numerator_1 +"/"+ denominator_1 + " + " + e2 + "'" + numerator_2 + "/" + denominator_2  + "=" + Answer);
                    break;
                }
                case 1: {
                    answer_n = (e1 * denominator_1 + numerator_1) * denominator_2 - (e2 * denominator_2 + numerator_2) * denominator_1;
                    answer_d = denominator_1 * denominator_2;
                    max = Math.max(answer_d, answer_n);
                    min = Math.min(answer_d, answer_n);
                    int divisor = getPointTest.findDivisor(max, min);
                    answer_integer = answer_n / answer_d;
                    if(answer_integer !=0)
                        Answer =answer_integer + "'" + ((answer_n - answer_integer * answer_d)/ divisor ) + "/" + (answer_d / divisor);
                    else
                        Answer =((answer_n - answer_integer * answer_d)  / divisor) + "/" + (answer_d / divisor);
                    s = strings1[0] + strings1[1] + strings1[2] + " - " + strings2[0] + strings2[1] + strings2[2] + " =";
                    if (string.contains(s)) {
                        j--;
                        continue;
                    }
                    string.add(s);
                    strings[strings_num] = s;
                    answer[strings_num] = Answer;
                    System.out.println(e1 + "'" + numerator_1 +"/"+ denominator_1 + " - " + e2 + "'" + numerator_2 + "/" + denominator_2  + "=" + Answer);
                    break;
                }
                case 2: {
                    answer_n = (numerator_1 + e1 * denominator_1) * (numerator_2 + e2 * denominator_2);
                    answer_d = denominator_1 * denominator_2;
                    max = Math.max(answer_d, answer_n);
                    min = Math.min(answer_d, answer_n);
                    int divisor = getPointTest.findDivisor(max, min);
                    answer_integer = answer_n / answer_d;
                    if(answer_integer !=0)
                        Answer =answer_integer + "'" + ((answer_n - answer_integer * answer_d)/ divisor ) + "/" + (answer_d / divisor);
                    else
                        Answer =((answer_n - answer_integer * answer_d)  / divisor) + "/" + (answer_d / divisor);
                    s = strings1[0] + strings1[1] + strings1[2] + " * " + strings2[0] + strings2[1] + strings2[2] + " =";
                    if (string.contains(s)) {
                        j--;
                        continue;
                    }
                    string.add(s);
                    strings[strings_num] = s;
                    answer[strings_num] = Answer;
                    System.out.println(e1 + "'" + numerator_1 +"/"+ denominator_1 + " * " + e2 + "'" + numerator_2 + "/" + denominator_2  + "=" + Answer);
                    break;
                }
                case 3: {
                    if (denominator_1 == 0 || denominator_2 == 0 || numerator_1 == 0) {
                        j--;
                        continue;
                    }//查错功能和查重
                    answer_n = (e1 * denominator_1 + numerator_1) * denominator_2;//答案的分子
                    answer_d = (e2 * denominator_2 + numerator_2) * denominator_1;//答案的分母
                    max = Math.max(answer_d, answer_n);
                    min = Math.min(answer_d, answer_n);
                    int divisor = getPointTest.findDivisor(max, min);
                    answer_integer = answer_n / answer_d;
                    if(answer_integer !=0)
                        Answer =answer_integer + "'" + ((answer_n - answer_integer * answer_d)/ divisor ) + "/" + (answer_d / divisor);
                    else
                        Answer =((answer_n - answer_integer * answer_d)  / divisor) + "/" + (answer_d / divisor);
                    s = strings1[0] + strings1[1] + strings1[2] + " + " + strings2[0] + strings2[1] + strings2[2] + " =";
                    if(string.contains(s)){
                        j--;
                        continue;
                    }
                    strings[strings_num] = s;
                    answer[strings_num] = Answer;
                    System.out.println(e1 + "'" + numerator_1 +"/"+ denominator_1 + " / " + e2 + "'" + numerator_2 + "/" + denominator_2  + "=" + Answer);
                    break;
                }
            }
            strings_num++;
        }
    }
}
