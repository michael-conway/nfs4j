/*
 * Automatically generated by jrpcgen 1.0.7+ on 1/8/15 10:21 AM
 * jrpcgen is part of the "Remote Tea" ONC/RPC package for Java
 * See http://remotetea.sourceforge.net for details
 *
 * This version of jrpcgen adopted by dCache project
 * See http://www.dCache.ORG for details
 */
package org.dcache.nfs.v4.ff;
import org.dcache.xdr.*;
import java.io.IOException;

public class ff_layouthint4 implements XdrAble, java.io.Serializable {
    public ff_mirrors_hint fflh_mirrors_hint;

    private static final long serialVersionUID = 5904359426929067786L;

    public ff_layouthint4() {
    }

    public ff_layouthint4(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        xdrDecode(xdr);
    }

    public void xdrEncode(XdrEncodingStream xdr)
           throws OncRpcException, IOException {
        fflh_mirrors_hint.xdrEncode(xdr);
    }

    public void xdrDecode(XdrDecodingStream xdr)
           throws OncRpcException, IOException {
        fflh_mirrors_hint = new ff_mirrors_hint(xdr);
    }

}
// End of ff_layouthint4.java
