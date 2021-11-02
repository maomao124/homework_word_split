import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Project name(项目名称)：作业_单词分割
 * Package(包名): PACKAGE_NAME
 * Class(类名): StudentDemo
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/11/2
 * Time(创建时间)： 21:20
 * Version(版本): 1.0
 * Description(描述)：
 * 测试输入：
 * aaa|bbb|ccc
 * This?is?a?test?string
 * 预期输出：
 * aaa
 * bbb
 * ccc
 * <p>
 * This
 * is
 * a
 * test
 * string
 * <p>
 * 提示:
 * “|”、“.”、“*”、“+”、“\\”等不是有效的模式匹配规则表达式，是转义字符，使用split()方法时必须得加"\\"才行。
 */

public class StudentDemo
{

    //使用String.split()方法分割
    public List<String> splitPartition(String str)
    {
        List<String> list = new ArrayList<String>();

//请在此添加实现代码
/********** Begin **********/
        String[] s1 = str.split("\\|");
        for (String s : s1)
        {
            list.add(s);
        }
/********** End **********/


        return list;
    }

    //使用StringTokenizer类进行分割
    public List<String> tokenPartition(String str)
    {
        List<String> list = new ArrayList<String>();
        //请在此添加实现代码
/********** Begin **********/
        StringTokenizer strToken = new StringTokenizer(str, "?");
        while (strToken.hasMoreTokens())
        {
            list.add(strToken.nextToken());
        }

/********** End **********/


        return list;
    }

    public static void main(String[] args)
    {
        StudentDemo s = new StudentDemo();
        System.out.println(s.splitPartition("54|689|69"));
        System.out.println(s.tokenPartition("587?69?578?697?1"));
    }
}
