/*/
 Se crea una base datos de colores 

_______________________
|      colores        |
-----------------------
|   id      INTEGER
|   nombre  TEXT
|   red     INTEGER
|   green   INTEGER
|   blue    INTEGER
-----------------------

CREAR UNA CLASE LLAMADA COLOR
_______________________
|      Color        |
-----------------------
| -  nombre  String
| -  red     INT
| -  green   INT
| -  blue    INT
-----------------------
| + Color()
| + setters
| + getters
| + getColor(): List<Colores>
| + addColor():Void
| + borrarColor(int id): void
| + actualizarColor(int red, int green, int blue,int id):Void
---------------------------------------------------------------

Crear interfaz grafica que contenga un menu desplegable que permita cambiar
el color de un panel de acuerdo a los valores de la base de datos.


 
 */

package coleresdata;

/**
 *
 * @author juang
 */
public class ColeresData {

    public static void main(String[] args) {
        PanelCambioColor window = new PanelCambioColor("Cambio de color");
        window.setBounds(300, 100, 400, 400);
        window.setDefaultCloseOperation(PanelCambioColor.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
