package CustomClass.Shape;

import java.util.*;

public class ShapeObject {

    public static void main(String[] args) {

     Circle circle = new Circle();
     Hexagon hexagon = new Hexagon();
     Equilateral_triangle equilateral_triangle = new Equilateral_triangle(6,5);
     Equilateral_triangle equilateral_triangle2 = new Equilateral_triangle(6);

     circle.setInfo(5);
     hexagon.SetInfo(5);


        System.out.println(equilateral_triangle.perimeter);
        System.out.println(equilateral_triangle.area);

        System.out.println(equilateral_triangle2.area);
        System.out.println(equilateral_triangle.toString());
        System.out.println(equilateral_triangle2.toString());


        System.out.println(circle.toString());
        System.out.println(hexagon.toString());

        ArrayList<Double> areas = new ArrayList<>();
        areas.addAll(Arrays.asList(circle.area,hexagon.area, equilateral_triangle.area, equilateral_triangle2.area));
        System.out.println(areas.size());
        System.out.println("Max area = "+Collections.max(areas));
        System.out.println(Collections.frequency(areas, 15.0));

        LinkedHashMap<String,Double> list  = new LinkedHashMap<>();
        list.put("circle", circle.area);
        list.put("Hexagon", hexagon.area);
        list.put("Equilateral_Triangle",equilateral_triangle.area);

        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get("circle"));


    }
}
