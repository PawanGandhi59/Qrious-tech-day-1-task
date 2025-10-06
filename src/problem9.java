import java.util.HashMap;
import java.util.Map;

public class problem9 {
    public double find(Map map){
        double PI=3.14d;
        if(!map.isEmpty()){
            if(map.containsKey("shape")){
                String shape=(String) map.get("shape"),value;
                shape.toLowerCase();
                switch (shape){
                    case "circle":
                        if(map.containsKey("value")){
                            value=(String) map.get("value");
                            if(value.isEmpty()){throw new RuntimeException("Value is empty");}
                            else if(value.toLowerCase().equals("area")){
                                if(map.containsKey("radius")&& map.get("radius")!=""&& map.get("radius")!=" "){
                                    double radius =(double)map.get("radius");
                                    return PI*radius*radius;}
                                else{throw new RuntimeException("No radius found.");}
                            } else if (value.toLowerCase().equals("perimeter")) {
                                if(map.containsKey("radius")&& map.get("radius")!=""&& map.get("radius")!=" "){
                                    double radius =(double)map.get("radius");
                                    return PI*2*radius;}
                                else{throw new RuntimeException("No radius found.");}
                            }
                        }
                        else{
                            throw new RuntimeException("No value found.");
                        }
                        break;
                    case "square":
                        if(map.containsKey("value")){
                            value=(String) map.get("value");
                            if(value.isEmpty()){throw new RuntimeException("Value is empty");}
                            else if(value.toLowerCase().equals("area")){
                                if(map.containsKey("side")&& map.get("side")!=""&& map.get("side")!=" "){
                                    double side =(double)map.get("side");
                                    return side*side;}
                                else{throw new RuntimeException("No side found.");}
                            } else if (value.toLowerCase().equals("perimeter")) {
                                if(map.containsKey("side")&& map.get("side")!=""&& map.get("side")!=" "){
                                    double side =(double)map.get("side");
                                    return side*4;}
                                else{throw new RuntimeException("No radius found.");}
                            }
                        }
                        else{
                            throw new RuntimeException("No value found.");
                        }
                        break;
                    case "rectangle":
                        if(map.containsKey("value")){
                            value=(String) map.get("value");
                            if(value.isEmpty()){throw new RuntimeException("Value is empty");}
                            else if(value.toLowerCase().equals("area")){
                                if(map.containsKey("length")&& map.get("length")!=""&& map.get("length")!=" "&& map.containsKey("width")&& map.get("width")!=""&& map.get("width")!=" "){
                                    double length =(double)map.get("length");
                                    double width =(double)map.get("width");
                                    return width*length;}
                                else{throw new RuntimeException("No length or width found.");}
                            } else if (value.toLowerCase().equals("perimeter")) {
                                if(map.containsKey("length")&& map.get("length")!=""&& map.get("length")!=" "&& map.containsKey("width")&& map.get("width")!=""&& map.get("width")!=" "){
                                    double length =(double)map.get("length");
                                    double width =(double)map.get("width");
                                    return 2*(length+width);}
                                else{throw new RuntimeException("No length or width found.");}
                            }
                        }
                        else{
                            throw new RuntimeException("No value found.");
                        }
                        break;
                    case "triangle":
                        if(map.containsKey("value")){
                            value=(String) map.get("value");
                            if(value.isEmpty()){throw new RuntimeException("Value is empty");}
                            else if(value.toLowerCase().equals("area")){
                                if(map.containsKey("base")&& map.get("base")!=""&& map.get("base")!=" "&& map.containsKey("height")&& map.get("height")!=""&& map.get("height")!=" "){
                                    double base =(double)map.get("base");
                                    double height =(double)map.get("height");
                                    return ((height*base)/2);}
                                else{throw new RuntimeException("No base or height found.");}
                            } else if (value.toLowerCase().equals("perimeter")) {
                                if(map.containsKey("side1")&& map.get("side1")!=""&& map.get("side1")!=" "&& map.containsKey("side2")&& map.get("side2")!=""&& map.get("side2")!=" "&& map.containsKey("base")&& map.get("base")!=""&& map.get("base")!=" "){
                                    double side1 =(double)map.get("side1");
                                    double side2 =(double)map.get("side2");
                                    double base =(double)map.get("base");
                                    return side1+side2+base;}
                                else{throw new RuntimeException("No length or width found.");}
                            }
                        }
                        else{
                            throw new RuntimeException("No value found.");
                        }
                        break;
                    default:
                        System.out.println("No such shape found/exists");
                        break;
                }
            }
            else{
                throw new RuntimeException("No shape found.");
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        Map map= Map.of(
                "shape","circle",
                "value","area",
                "radius",10d
        );
        problem9 p=new problem9();
        System.out.println(p.find(map));

    }
}
