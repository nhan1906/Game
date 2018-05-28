/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JFrame;
import javax.swing.JPanel;
import sun.audio.AudioPlayer;
import sun.audio.AudioStream;

/**
 *
 * @author James
 * Màn hình game
 */
public class Game extends JFrame {

    private JPanel gm = new JPanel();
    
    //Constructor khởi tạo màn hình
    public Game(){
        
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Chạy nhạc nền ở đây
        //Lấy đường dẫn đến file
        InputStream is = new FileInputStream(new File("./audios/music_background.wav"));
        //Thay bằng API mới
        AudioStream as = new AudioStream(is);
        AudioPlayer.player.start(as);
        new Game();
        
    }
    
}
