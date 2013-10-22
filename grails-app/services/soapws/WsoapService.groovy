package soapws

import grails.transaction.Transactional
import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult

@Transactional
class WsoapService {

    static expose=['cxfjax']

    @WebResult(name="Result")
    @WebMethod(operationName="getWsoap")
    Wsoap getWsoap(@WebParam(name="numcrd")String numcrd) {
        return Wsoap.findByNumcrd(numcrd)
    }  
}