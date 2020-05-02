package PublicClass;

public class StringBufferDemo {
    public static void main(String[] args) {
//        String s1 = "a";
//        String s2 = "b";
//        String s3 = "c";
//        //直接拼接
//        System.out.println(s1+s2+s3);
//
//        StringBuffer sb = new StringBuffer(s1);
//        //sb.append(s1);//append 追加
//        sb.append(s2);
//        sb.insert(0,s3);
//        String sa = sb.toString();
//        System.out.println(sa);//cab
 //         stringAppend();
         stringBufferAppend();
   }
//        public static void stringAppend(){
//            long begin = System.currentTimeMillis();//获取系统当前的时间，毫秒数（当前时间距离1970年1月1日多少毫秒）
//            String s = "a";
//            for (int i = 0; i < 200000; i++) {
//                s += "a";
//            }
//            long end = System.currentTimeMillis();
//            System.out.println("耗时：" + (end - begin));//=7424毫秒
//        }
        public static void stringBufferAppend(){
            long begin = System.currentTimeMillis();
            StringBuffer sb = new StringBuffer("a");
            for (int i = 0; i < 200000; i++) {
                sb.append("a");
            }
            long end = System.currentTimeMillis();
            System.out.println("耗时：" + (end - begin));//=11毫秒
        }
    }

