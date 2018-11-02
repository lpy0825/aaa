import java.applet.Applet;
import java.applet.AudioClip;
import java.io.File;
import java.io.FileNotFoundException;
import java.net.MalformedURLException;

public class Test1 {
    public static void main(String[] args) throws MalformedURLException, FileNotFoundException, InterruptedException {
        //选择播放文件
        File file = new File("E:\\tmp\\bullet.wav");
        //创建audioclip对象
        AudioClip audioClip = null;
        //将file转换为url
        audioClip = Applet.newAudioClip(file.toURL());
        //循环播放	播放一次可以使用audioClip.play
        audioClip.loop();
        Thread.sleep(5000);
    }
}
