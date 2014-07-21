package br.com.maplink2.webservices;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.4.6
 * 2013-11-06T22:59:36.447-02:00
 * Generated source version: 2.4.6
 * 
 */
@WebServiceClient(name = "AddressFinder", 
                  wsdlLocation = "http://services.maplink.com.br/webservices/v3/AddressFinder/AddressFinder.asmx?wsdl",
                  targetNamespace = "http://webservices.maplink2.com.br") 
public class AddressFinder extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://webservices.maplink2.com.br", "AddressFinder");
    public final static QName AddressFinderSoap12 = new QName("http://webservices.maplink2.com.br", "AddressFinderSoap12");
    public final static QName AddressFinderSoap = new QName("http://webservices.maplink2.com.br", "AddressFinderSoap");
    static {
        URL url = null;
        try {
            url = new URL("http://services.maplink.com.br/webservices/v3/AddressFinder/AddressFinder.asmx?wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(AddressFinder.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "http://services.maplink.com.br/webservices/v3/AddressFinder/AddressFinder.asmx?wsdl");
        }
        WSDL_LOCATION = url;
    }

    public AddressFinder(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public AddressFinder(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public AddressFinder() {
        super(WSDL_LOCATION, SERVICE);
    }
    
    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AddressFinder(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AddressFinder(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE);
    }

    //This constructor requires JAX-WS API 2.2. You will need to endorse the 2.2
    //API jar or re-run wsdl2java with "-frontend jaxws21" to generate JAX-WS 2.1
    //compliant code instead.
    public AddressFinder(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName);
    }

    /**
     *
     * @return
     *     returns AddressFinderSoap
     */
    @WebEndpoint(name = "AddressFinderSoap12")
    public AddressFinderSoap getAddressFinderSoap12() {
        return super.getPort(AddressFinderSoap12, AddressFinderSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AddressFinderSoap
     */
    @WebEndpoint(name = "AddressFinderSoap12")
    public AddressFinderSoap getAddressFinderSoap12(WebServiceFeature... features) {
        return super.getPort(AddressFinderSoap12, AddressFinderSoap.class, features);
    }
    /**
     *
     * @return
     *     returns AddressFinderSoap
     */
    @WebEndpoint(name = "AddressFinderSoap")
    public AddressFinderSoap getAddressFinderSoap() {
        return super.getPort(AddressFinderSoap, AddressFinderSoap.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns AddressFinderSoap
     */
    @WebEndpoint(name = "AddressFinderSoap")
    public AddressFinderSoap getAddressFinderSoap(WebServiceFeature... features) {
        return super.getPort(AddressFinderSoap, AddressFinderSoap.class, features);
    }

}
