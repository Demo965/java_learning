package PublicClass;

import java.io.IOException;

/**
 * 当前程序运行时对象
 *
 * 初始化
 * Runtime runtime = Runtime.getRuntime();
 */
public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        System.out.println("程序空闲内存"+runtime.freeMemory()/1024/1024);
        System.out.println("程序总内存"+runtime.totalMemory()/1024/1024);
        System.out.println("程序最大内存"+runtime.maxMemory()/1024/1024);
        runtime.gc();//提醒垃圾回收器开始上班
        runtime.exec("mspaint");//用Java代码执行dos命令

    }

}
