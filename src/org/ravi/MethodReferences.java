package org.ravi;

import javax.swing.*;
import java.awt.*;
import java.util.function.BiFunction;

public class MethodReferences {

    public static void main(String[] args) {
        //Not implement run method. How?
        //Static method reference
        new Thread(MethodReferences::print).start();
        //Non-static method reference
        new Thread(new MethodReferences()::print2).start();
        //Constructor reference
        HWInterface hw = HelloWorld::new;
        hw.print();

        //Color Mixer with BiFunction use case
        String color1 = "#FF0000";
        String color2 = "#0000FF";
        //Method reference here
        BiFunction<String, String, Color> color = ColorMixer::add;
        JFrame frame = new JFrame("Color");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        panel.setBackground(color.apply(color1,color2));
        frame.add(panel);
        frame.setPreferredSize(new Dimension(400, 300));
        frame.pack();
        frame.setVisible(true);
    }

    private static void print(){
        System.out.println("Implemented the static run method without extending thread. That's the power of method reference.");
    }
    private void print2(){
        System.out.println("Implemented the non static run method without extending thread. That's the power of method reference.");
    }

}
class ColorMixer{
     static Color add(String color1, String color2){
        int color1Percent = 50;
        ColorMixer mixer = new ColorMixer();
        int cr,cg,cb;
        cr = mixer.addInvidual(mixer.parseHex(color1,1,3), mixer.parseHex(color2,1,3), color1Percent);
        cg = mixer.addInvidual(mixer.parseHex(color1,3,5), mixer.parseHex(color2,3,5), color1Percent);
        cb = mixer.addInvidual(mixer.parseHex(color1,5,7), mixer.parseHex(color2,5,7), color1Percent);
        return new Color(cr, cg, cb);
    }
    private int parseHex(String color, int startIndex, int endIndex){
        int c = Integer.parseInt(color.substring(startIndex,endIndex),16);
        return c > 255 ? 255 : c;
    }

    private int addInvidual(int a, int b, int colorOnePercent){
        float pa = ((float)colorOnePercent)/100;
        float pb = 1-pa;
        int c = Math.round(a*pa)+Math.round(b*pb);
        return c > 255 ? 255 : c;
    }
}
class HelloWorld {
     HelloWorld(){
        System.out.println("Hello world");
    }
}
interface HWInterface {
     void print();
}
