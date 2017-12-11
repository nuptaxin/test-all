package ren.ashin.test.all.robot;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

/**
 * @ClassName: Test
 * @Description: TODO
 * @author renzx
 * @date Dec 8, 2017
 */
public class Test {
    public static void main(String[] args) {
        // 新建文件并写文件
        WriteFile();
        // 重复输入
        //RepeatWord();
    }


    private static void WriteFile() {
        Robot robot;
        try {
            robot = new Robot();
            Runtime.getRuntime().exec("notepad");
            // For linux.
            // Runtime.getRuntime().exec("gedit");
            // 定义5秒的延迟以便你打开notepad 哈哈
            // Robot 开始写
            // 从0写到99
            robot.delay(1000);
            for (int i = 1; i < 100; i++) {
                int x = i;
                int m = 100;
                boolean flag = false;

                for (int j = m; j >= 1; j = j / 10) {
                    if (x / j > 0) {
                        robot.keyPress(96 + x / j);
                        robot.keyRelease(96 + x / j);
                        flag = true;
                    } else if (flag) {
                        robot.keyPress(96);
                        robot.keyRelease(96);
                    }
                    x = x % j;
                }
                robot.keyPress(KeyEvent.VK_SPACE);
            }
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    public static void RepeatWord() {
        Robot robot;
        try {
            robot = new Robot();
            robot.delay(3000);
            for (int i = 1; i < 1000000; i++) {
                robot.keyPress(KeyEvent.VK_H);
                robot.keyPress(KeyEvent.VK_A);
                robot.keyPress(KeyEvent.VK_N);
                robot.keyPress(KeyEvent.VK_D);
                robot.keyPress(KeyEvent.VK_S);
                robot.keyPress(KeyEvent.VK_O);
                robot.keyPress(KeyEvent.VK_M);
                robot.keyPress(KeyEvent.VK_E);
                robot.keyPress(KeyEvent.VK_SPACE);
                robot.keyPress(KeyEvent.VK_B);
                robot.keyPress(KeyEvent.VK_O);
                robot.keyPress(KeyEvent.VK_Y);
                robot.delay(1500);
                robot.keyPress(KeyEvent.VK_ENTER);
                robot.keyRelease(KeyEvent.VK_ENTER);
            }
        } catch (AWTException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }


    public static void pressKeyWithShift(Robot robot, int keyvalue) {
        robot.keyPress(KeyEvent.VK_SHIFT);
        robot.keyPress(keyvalue);
        robot.keyRelease(keyvalue);
        robot.keyRelease(KeyEvent.VK_SHIFT);
    }
}
