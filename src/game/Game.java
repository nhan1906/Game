/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.awt.Container;
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

    private JPanel gm = new GameManager();
    
    //Constructor khởi tạo màn hình
    public Game(){
        initComponents();
        initEvents();
        initWindow();
    }
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // Chạy nhạc nền ở đây
        //Lấy đường dẫn đến file
        //Nếu đường dẫn file không tồn tại thì sẽ throws FileNotFoundException
        InputStream is = new FileInputStream(new File("./audios/music_background.wav"));
        //Thay bằng API mới
        AudioStream as = new AudioStream(is);
        AudioPlayer.player.start(as);
        new Game();
        
    }

    // Thêm panel game vào
    private void initComponents() {
        Container cp = this.getContentPane();
        
        gm.setFocusable(true);
        
        cp.add(gm);
    }

    // Thiết kế giao diện cho Frame
    private void initWindow() {
//        this.setSize(500,500);
        this.setLocation(200,200);
        this.setTitle("ÁP DỤNG THUẬT GIẢI A* VÀO GAME");
        this.pack();
        // Fix error nhạc không tắt khi tắt màn hình
        // Thêm dòng này sẽ fix được lỗi đó
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    private void initEvents() {
        ClassDiChuyenDatTenLai dc = new ClassDiChuyenDatTenLai();
    }
    
}
