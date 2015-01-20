package org.talend.services.test.library._1_0;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 2.7.12
 * 2014-09-29T09:31:37.075+03:00
 * Generated source version: 2.7.12
 * 
 */
@WebServiceClient(name = "LibraryProvider", 
                  wsdlLocation = "file:/D:/TALEND/src/tesb-rt-se/policies/transformation-policy/src/test/resources/Library.wsdl",
                  targetNamespace = "http://services.talend.org/test/Library/1.0") 
public class LibraryProvider extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://services.talend.org/test/Library/1.0", "LibraryProvider");
    public final static QName LibraryHttpPort = new QName("http://services.talend.org/test/Library/1.0", "LibraryHttpPort");
    static {
        URL url = null;
        try {
            url = new URL("file:/D:/TALEND/src/tesb-rt-se/policies/transformation-policy/src/test/resources/Library.wsdl");
        } catch (MalformedURLException e) {
            java.util.logging.Logger.getLogger(LibraryProvider.class.getName())
                .log(java.util.logging.Level.INFO, 
                     "Can not initialize the default wsdl from {0}", "file:/D:/TALEND/src/tesb-rt-se/policies/transformation-policy/src/test/resources/Library.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public LibraryProvider(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public LibraryProvider(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public LibraryProvider() {
        super(WSDL_LOCATION, SERVICE);
    }
    

    /**
     *
     * @return
     *     returns Library
     */
    @WebEndpoint(name = "LibraryHttpPort")
    public Library getLibraryHttpPort() {
        return super.getPort(LibraryHttpPort, Library.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Library
     */
    @WebEndpoint(name = "LibraryHttpPort")
    public Library getLibraryHttpPort(WebServiceFeature... features) {
        return super.getPort(LibraryHttpPort, Library.class, features);
    }

}