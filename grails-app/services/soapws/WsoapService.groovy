package soapws

import grails.transaction.Transactional
import javax.jws.WebMethod
import javax.jws.WebParam
import javax.jws.WebResult

@Transactional
class WsoapService {

   static expose=['cxfjax']
   
    
  /*@WebResult(name="Result")
  @WebMethod(operationName="getRetorno")
  int getRetorno(@WebParam(name="id")Long id) {
    return Wsoap.get(id).retorno
  }*/
    
  @WebResult(name="Result")
  @WebMethod(operationName="getWsoap")
  int getWsoap(@WebParam(name="id")Long id) {
    return Wsoap.get(id).Wsoap
  }
    
  
    
}
