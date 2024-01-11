/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package motorservice;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author nguyenhoanggiaan
 */
public class ColorDAO {
    List<Color> listColor = new ArrayList<>();

    public ColorDAO() {
        listColor.add(new Color("1","Black"));
        listColor.add(new Color("2","White"));
        listColor.add(new Color("3","Green"));
        listColor.add(new Color("4","Blue"));
        listColor.add(new Color("5","Grey"));
    }
    public int add(Color cl){
        listColor.add(cl);
        return 1;
    }
    public List<Color> getAllColor(){
        return listColor;
    }
    
}
