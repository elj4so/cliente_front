
package solis;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the solis package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private static final QName _CalcularHipotenusa_QNAME = new QName("http://solis/", "calcular_hipotenusa");
    private static final QName _CalcularHipotenusaResponse_QNAME = new QName("http://solis/", "calcular_hipotenusaResponse");
    private static final QName _SolisGarciaJasiel_QNAME = new QName("http://solis/", "solis_garcia_jasiel");
    private static final QName _SolisGarciaJasielResponse_QNAME = new QName("http://solis/", "solis_garcia_jasielResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: solis
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link CalcularHipotenusa }
     * 
     * @return
     *     the new instance of {@link CalcularHipotenusa }
     */
    public CalcularHipotenusa createCalcularHipotenusa() {
        return new CalcularHipotenusa();
    }

    /**
     * Create an instance of {@link CalcularHipotenusaResponse }
     * 
     * @return
     *     the new instance of {@link CalcularHipotenusaResponse }
     */
    public CalcularHipotenusaResponse createCalcularHipotenusaResponse() {
        return new CalcularHipotenusaResponse();
    }

    /**
     * Create an instance of {@link SolisGarciaJasiel }
     * 
     * @return
     *     the new instance of {@link SolisGarciaJasiel }
     */
    public SolisGarciaJasiel createSolisGarciaJasiel() {
        return new SolisGarciaJasiel();
    }

    /**
     * Create an instance of {@link SolisGarciaJasielResponse }
     * 
     * @return
     *     the new instance of {@link SolisGarciaJasielResponse }
     */
    public SolisGarciaJasielResponse createSolisGarciaJasielResponse() {
        return new SolisGarciaJasielResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularHipotenusa }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularHipotenusa }{@code >}
     */
    @XmlElementDecl(namespace = "http://solis/", name = "calcular_hipotenusa")
    public JAXBElement<CalcularHipotenusa> createCalcularHipotenusa(CalcularHipotenusa value) {
        return new JAXBElement<>(_CalcularHipotenusa_QNAME, CalcularHipotenusa.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CalcularHipotenusaResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link CalcularHipotenusaResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://solis/", name = "calcular_hipotenusaResponse")
    public JAXBElement<CalcularHipotenusaResponse> createCalcularHipotenusaResponse(CalcularHipotenusaResponse value) {
        return new JAXBElement<>(_CalcularHipotenusaResponse_QNAME, CalcularHipotenusaResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolisGarciaJasiel }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolisGarciaJasiel }{@code >}
     */
    @XmlElementDecl(namespace = "http://solis/", name = "solis_garcia_jasiel")
    public JAXBElement<SolisGarciaJasiel> createSolisGarciaJasiel(SolisGarciaJasiel value) {
        return new JAXBElement<>(_SolisGarciaJasiel_QNAME, SolisGarciaJasiel.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SolisGarciaJasielResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link SolisGarciaJasielResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://solis/", name = "solis_garcia_jasielResponse")
    public JAXBElement<SolisGarciaJasielResponse> createSolisGarciaJasielResponse(SolisGarciaJasielResponse value) {
        return new JAXBElement<>(_SolisGarciaJasielResponse_QNAME, SolisGarciaJasielResponse.class, null, value);
    }

}
