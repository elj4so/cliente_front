
package solis;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para calcular_hipotenusa complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>{@code
 * <complexType name="calcular_hipotenusa">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cateto1" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *         <element name="cateto2" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "calcular_hipotenusa", propOrder = {
    "cateto1",
    "cateto2"
})
public class CalcularHipotenusa {

    protected double cateto1;
    protected double cateto2;

    /**
     * Obtiene el valor de la propiedad cateto1.
     * 
     */
    public double getCateto1() {
        return cateto1;
    }

    /**
     * Define el valor de la propiedad cateto1.
     * 
     */
    public void setCateto1(double value) {
        this.cateto1 = value;
    }

    /**
     * Obtiene el valor de la propiedad cateto2.
     * 
     */
    public double getCateto2() {
        return cateto2;
    }

    /**
     * Define el valor de la propiedad cateto2.
     * 
     */
    public void setCateto2(double value) {
        this.cateto2 = value;
    }

}
