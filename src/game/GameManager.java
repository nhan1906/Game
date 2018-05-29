/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import game.model.*;
import game.utils.Config;
import java.awt.Graphics;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JPanel;

/**
 *
 * @author James
 */
public class GameManager extends JPanel implements Runnable {
    
    private Ghost ghostPlayer; // Đại diện cho người chơi
    private Board board = new Board(); // Vẽ bản game phần nội dung game
    
    
    //Vai trò của ClassDiChuyenDatTenLai
    private ClassDiChuyenDatTenLai dc = new ClassDiChuyenDatTenLai();
    
    //Map Ghost và Thuat toán
    private Map<String, Ghost> mapGhost = new HashMap();
    private Map<String, ThuatToan> mapThuatToanVaGhost = new HashMap();
    
    
    private Thread thread;
    private static int breakTime = 0; // Thời gian khởi tạo lại phần thưởng
    
    public GameManager(){
        initConfig();
    }
    
    @Override
    public void run() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void initConfig() {
        // Hàm này chọn map cho trò chơi, random ghost, ghostPlayer, Map, tường , 
        
//        Config.tuong = dc.RanDom(69);                                  // random các loại tường
//       Mang.car = dc.RanDom(5);                                    // random cac loại car
//       Mang.carNC = dc.RanDom(2);
//       dc.NhapMapTuFile("map"+dc.RanDom(10)+".txt");                   //nhập map và tọa độ các xe  : map là random.....từ 1 trong 20 map
//       carNC = new CarNguoiChoi(1,Mang.x,Mang.y,true,true);      // sau khi nhập file thì ta mới có tọa độ của carNC, nên nó phải đặt ở dưới
//   
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        board.draw(g);
    }
    
}
