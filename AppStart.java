
/**
 * Write a description of class AppStart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AppStart
{
       public AppStart(){
        Size s1 = Size.MEDIUM;
        System.out.println("Name       : MEDIUM" );
        System.out.println("toString(): "+s1.toString());
        System.out.println("Ordem: 1");
        System.out.println("Valor minimo:" + s1.getMinValue());
        System.out.println("Valor maximo:" + s1.getMaxValue());
        System.out.println("Código: " + s1.getCode());
    }
}
