/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package allcircleclient;

import java.io.StringReader;
import javax.xml.bind.JAXB;
import model.Result;
import util.CircleClient;

/**
 *
 * @author user
 */
public class AllCircleClient {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CircleClient client = new CircleClient();
        double radius = 4;
        String xml = client.getXml(Double.toString(radius));
//        System.out.println(xml);
        Result res = JAXB.unmarshal(new StringReader(xml), Result.class);
        System.out.println("Radius is :" + radius);
        System.out.println("Area is :" + res.getArea());
        System.out.println("Circumference is :" + res.getCircumference());
                
    }
    
}
