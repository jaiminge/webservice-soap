package soapws

import javax.xml.bind.annotation.XmlAccessType
import javax.xml.bind.annotation.XmlAccessorType
import javax.xml.bind.annotation.XmlRootElement
import javax.xml.bind.annotation.XmlAttribute

@XmlAccessorType( XmlAccessType.NONE )
@XmlRootElement
class Wsoap {
    @XmlAttribute
    String retorno          //Indica si la operacion fue exitosa
    @XmlAttribute
    String descripcion      //Indica una excepcion
    @XmlAttribute
    String numcrd           //Número de credito
    @XmlAttribute
    String moneda           //VSM o Pesos
    @XmlAttribute
    String estado           //Estado
    @XmlAttribute
    String nss              //Numero de seguridad social
    @XmlAttribute
    String linea            //Linea
    @XmlAttribute
    String producto         //Producto
    @XmlAttribute
    String regimen          //Regimen ROA, REA, EXT
    @XmlAttribute
    String situacionCredito //Situacion del credito AC activo, PF cerrado, CL liquidado
    @XmlAttribute
    String fechaLiquidacion //Fecha de liquidación YYY-MM-DD
    @XmlAttribute
    String fechaOtorgamiento//Fecha de otorgamiento YYY-MM-DD
    @XmlAttribute
    String marcaClonado     //Identificador de clonado
    @XmlAttribute
    String nombre           //Nombre del Acreditado
    @XmlAttribute
    String rfc              //Registro Federal de Contribuyentes
    @XmlAttribute
    String curp             //Clave Única de Registro de Población
    @XmlAttribute
    String saldoTotalPesos  //Saldo total en Pesos
    @XmlAttribute
    String saldoTotalVsm    //Saldo total en VSM
    @XmlAttribute
    String factorrea        //Factor REA en VSM
    @XmlAttribute
    String factorroa        //Factor ROA en VSM
    @XmlAttribute
    String porcentajePago   //Porcentaje de Pago
    @XmlAttribute
    String tipoDeCredito    //Clave del tipo de crédito
    @XmlAttribute
    String tasaDeInteres    //Tasa de interés Actual 
    @XmlAttribute
    String pool             //Clave del POOL
    @XmlAttribute
    String marcaReestructura//Marca que identifica la Reestructura
    @XmlAttribute
    String fechaReestructura//Fecha de Reestructura
    @XmlAttribute
    String porcentajeAcreditado//Porcentaje a cargo del acreditado
    @XmlAttribute
    String saldoAcreditadoVsm//Saldo Acreditado en VSM
    @XmlAttribute
    String saldoAcreditadoPesos//Saldo Acreditado en Pesos
    @XmlAttribute
    String saldoInfonavitVsm//Saldo Infonavit VSM
    @XmlAttribute
    String saldoInfonavitPesos//Saldo Infonavit Pesos
    @XmlAttribute
    String fechaRollback    //Fecha de Rollback
    @XmlAttribute
    String indicadorCura    //Marca que identifica la Cura
    @XmlAttribute
    String mesesOmisos      //Numero de meses omisos
    @XmlAttribute
    String saldoOmisosVsm   //Monto de los meses omisos en VSM
    @XmlAttribute
    String saldoOmisosPesos //Monto de los meses omisos en Pesos
    @XmlAttribute
    String estatus          //Estatus del crédito
    @XmlAttribute
    String marcaProrrogaVigente //Marca que identifica si la ultima prorroga esta activa
    @XmlAttribute
    String ultimasProrrogas  = new String[6] //Arreglo de las ultimas 6 prorrogas
    @XmlAttribute
    String fechaInicProrroga //Fecha de inicio de la prorroga
    @XmlAttribute
    String fechafinProrroga //Fecha de fin de la prorroga
    @XmlAttribute
    String montoOriginalVsm //Monto Original del crédito en VSM
    @XmlAttribute
    String etapa            //Etapa
    @XmlAttribute
    String proceso          //proceso
    @XmlAttribute
    String numCredConyugal  //Numero de Crédito
    @XmlAttribute
    String promocion        //Promoción para BDA Paquete para ALS 
    @XmlAttribute
    String tasaInteresOriginal//Tasa de interés Original 
    @XmlAttribute
    String omisoMasAntiguo  //Omiso más antiguo 
    @XmlAttribute
    String montoFondoAnteriorPesos//Monto anterior en pesos
    @XmlAttribute
    String factorReaPesos //Factor REA en pesos
    @XmlAttribute
    String pesos          //pesos
    @XmlAttribute
    String factorRoaPesos //Factor ROA en pesos
    @XmlAttribute
    String capitalEnVsm   //Capital en VSM
    @XmlAttribute
    String capitalEnPesos //Capital en Pesos
    @XmlAttribute
    String interesEnVsm   //Interés en VSM
    @XmlAttribute
    String interesEnPesos //Interés en Pesos
    @XmlAttribute
    String acccesoriosVsm //Comisión en VSM
    @XmlAttribute
    String accesoriosPesos//Comisión en Pesos
    @XmlAttribute
    String fechaPago      //fecha de Pago
    @XmlAttribute
    String calleGarantia  //Calle de la garantía
    @XmlAttribute
    String coloniaGarantia// Colonia de la garantía
    @XmlAttribute
    String poblacionGarantia// Población de la garantía
    @XmlAttribute
    String estadoGarantia //Clave del estado de la garantía
    @XmlAttribute
    String codPostalGarantia// Código Postal de la garantía
    @XmlAttribute
    String mpioGarantia   //Municipio de la garantía
    @XmlAttribute
    String cveSituacionCrd// Situación del crédito
    @XmlAttribute
    String marcaExistencia //Clave para identificar donde existe crédito
    @XmlAttribute
    String credConyugal   //Numero de crédito conyugal a 26 caracteres
    @XmlAttribute
    String fechaProceso   //Fecha de proceso
    @XmlAttribute
    String tipoEscenario  //Tipo de escenario
    @XmlAttribute
    String fechaFinProrroga //Fecha de finalización de la prorroga
    @XmlAttribute
    String mcaReestructura//Clave que identifica la condición de la reestrucutra
    @XmlAttribute
    String mcaPerdidarellab//Clave que indentifica la perdida de relación laboral
    @XmlAttribute
    String mcaFinProrrogaUno//Clave que identifica el termino de la  prorroga
    @XmlAttribute
    String mcaFinProrrogaDos// Clave que identifica el termino de la  prorroga
    @XmlAttribute
    String mcaOpcionesPago //Clave que identifica las opciones de pago
    @XmlAttribute
    String mcaMotivCierre //Clave que identifica los motivos del cierre
    @XmlAttribute
    String marcaCredComp  //Marca crédito mas computadora
    @XmlAttribute
    String seguroAdmiVsm //Seguro de Daños en VSM
    @XmlAttribute
    String seguroAdmiPesos //Seguro de Daños en Pesos
    @XmlAttribute
    String fondoPPagoVms   //Fondo de Protección de Pagos en VSM
    @XmlAttribute
    String fondoPPagoPeso  //Fondo de Protección de Pagos en Pesos
    @XmlAttribute
    String comisAdmonVsm   //Comisión de Administración de Pagos en VSM
    @XmlAttribute
    String comisAdmonPes   //Comisión de Administración de Pagos en Pesos
    @XmlAttribute
    String pagoEsteMesVsm  //Monto del Pago de este mes en VSM
    @XmlAttribute
    String pagoEsteMesPeso   //Monto del Pago de este mes en pesos
    @XmlAttribute
    String pagoCorriVsm      //Total de Pago para estar al corriente en VSM
    @XmlAttribute
    String pagoCorripes      //Total de Pago para estar al corriente en pesos
    @XmlAttribute
    String mntoUnoccVsm      //Monto 01 de computadora VSM
    @XmlAttribute
    String mntoUnoccPes      //Monto 01 de computadora Pesos
    @XmlAttribute
    String mntoDosccVsm      //Monto 02 de computadora VSM
    @XmlAttribute
    String mntoDosccPes      //Monto 02 e computadora Pesos
    @XmlAttribute
    String mntoUltccVsm      // Monto total aplicado para crédito mas computadora en VSM
    @XmlAttribute
    String mntoUltccPes      //Monto total aplicado para crédito mas computadora en Pesos
    @XmlAttribute
    String formaPago        //Forma de Pago
    @XmlAttribute
    String fechLimitePago   //Fecha límite de Pago
    @XmlAttribute
    String lineaCaptura     //Línea de Captura
    @XmlAttribute
    String marcaCierre      //Marca de cierre de credito
    @XmlAttribute
    String tipoPagos       //Tipo de Pagos
    @XmlAttribute
    String marcaSegCred    //Marca de segundo credito
    @XmlAttribute
    String mtoPagPendD     //Monto de pagos pendientes diario
    @XmlAttribute
    String facReaMensual   //Factor de desc REA diario
    @XmlAttribute
    String facRoaMensual   //Factor de desc ROA diario
    @XmlAttribute
    String segDaniosd      //Saeguro de daños diario
    @XmlAttribute
    String fondoPpd        //Fondo de Proteccion de pagos diario
    @XmlAttribute
    String credCcd        //Credito mas comp diario
    @XmlAttribute
    String totalDescDia   //Total a descontar diario
    @XmlAttribute
    String pagoAlCorrd    //Pago al corriente diario
    @XmlAttribute
    String fecUltimoPago  //Fecha de ultimo pago ALS
    @XmlAttribute
    String statusContable //Estatus Contable
    
    
    
    static constraints = {
        retorno maxSize: 8, nullable: true
        descripcion maxSize: 50, nullable: true
        numcrd maxSize: 10, nullable: true
        moneda maxSize: 5, nullable: true, inList: ["VSM","PESOS"]
        estado maxSize: 30, nullable: true
        
        nss maxSize: 11, nullable: true
        linea maxSize: 30, nullable: true
        producto maxSize: 20, nullable: true
        regimen maxSize: 3, nullable: true, inList: ["ROA", "REA", "EXT"]
        situacionCredito maxSize: 40, nullable: true, inList: ["AC", "PF", "CL"]
        fechaLiquidacion maxSize: 10, nullable: true, matches: "0-9[][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        fechaOtorgamiento maxSize: 10, nullable: true, matches: "0-9[][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        marcaClonado maxSize: 1, nullable: true
        nombre maxSize: 40, nullable: true
        rfc maxSize: 15, nullable: true
        curp maxSize: 20, nullable: true
        saldoTotalPesos maxSize: 15, nullable: true, matches: "[0-9]*\\.?[0-9]+"
        saldoTotalVsm maxSize:15, nullable: true, matches: "[0-9]*\\.?[0-9]+"
        factorrea maxSize:15, nullable: true, matches: "[0-9]*\\.?[0-9]+"
        factorroa maxSize:15, nullable: true, matches: "[0-9]*\\.?[0-9]+"
        porcentajePago maxSize:12, nullable: true, matches: "[0-9]*\\.?[0-9]+"
        tipoDeCredito maxSize:2, nullable: true
        tasaDeInteres maxSize:30, nullable: true //******??????????
        pool maxSize:4, nullable:true
        //*****************************************************
         marcaReestructura maxSiSize:1, nullable:true
        fechaReestructura maxSiSize:10, nullable:true, matches: "0-9[][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        porcentajeAcreditado maxSiSize:12, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        saldoAcreditadoVsm maxSiSize:12, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        saldoAcreditadoPesos maxSiSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        saldoInfonavitVsm  maxSiSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        saldoInfonavitPesos maxSiSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        fechaRollback maxSiSize:10, nullable:true, matches: "0-9[][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        indicadorCura maxSiSize:1, nullable:true
        mesesOmisos   maxSiSize:3, nullable:true  //***999????
        saldoOmisosVsm maxSiSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        saldoOmisosPesos maxSiSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        estatus maxSiSize:40, nullable:true
        marcaProrrogaVigente maxSiSize:1, nullable:true
         //************************************************************
         
        fechaInicProrroga maxSize: 6, nullable: true, matches: "0-9[][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        fechafinProrroga maxSize: 6, nullable: true, matches: "0-9[][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        montoOriginalVsm maxSiSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        etapa maxSiSize:10, nullable:true
        proceso maxSiSize:15, nullable:true
        numCredConyugal maxSiSize:15, nullable:true
        promocion maxSiSize:20, nullable:true
        tasaInteresOriginal maxSiSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        omisoMasAntiguo maxSiSize:10, nullable:true
        promocion maxSiSize:15, nullable:true
        montoFondoAnteriorPesos maxSiSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        pesos maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        factorRoaPesos maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        capitalEnVsm maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
          //************************************************************
        capitalEnPesos maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        interesEnVsm maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        interesEnPesos maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        acccesoriosVsm maxSize:15, nullable:true, matches:"[0-9]*\\.?[0-9]+"
        accesoriosPesos maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        fechaPago maxSize: 10, nullable: true, matches: "0-9[][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        calleGarantia maxSize: 80, nullable: true
        coloniaGarantia maxSize: 80, nullable: true
        poblacionGarantia maxSize: 28, nullable: true
        estadoGarantia maxSize: 2, nullable: true
        mpioGarantia maxSize: 20, nullable: true
        cveSituacionCrd maxSize: 2, nullable: true
        marcaExistencia maxSize: 3, nullable: true, inList: ["ALS","BDA"]
        credConyugal maxSize:26, nullable: true
          //************************************************************
    
         fechaProceso maxSize: 10, nullable: true, matches: "0-9[][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        tipoEscenario maxSize: 2, nullable: true
        fechaFinProrroga maxSize: 8, nullable: true
        mcaReestructura  maxSize: 2, nullable: true
        mcaPerdidarellab maxSize: 2, nullable: true
        mcaFinProrrogaUno maxSize: 2, nullable: true 
        mcaFinProrrogaDos maxSize: 3, nullable: true 
        mcaOpcionesPago  maxSize: 2, nullable: true
        mcaMotivCierre   maxSize: 2, nullable: true
        seguroAdmiVsm    maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        seguroAdmiPesos  maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        fondoPPagoVms    maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        fondoPPagoPeso   maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        comisAdmonVsm    maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        
          //************************************************************
        comisAdmonPes    maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        pagoEsteMesVsm   maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        pagoEsteMesPeso  maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        pagoCorriVsm     maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        pagoCorripes     maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        mntoUnoccVsm     maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        mntoDosccVsm     maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        mntoDosccPes     maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        mntoUltccVsm     maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        mntoUltccPes     maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        formaPago        maxSize:16, nullable:true
        fechLimitePago   maxSize:18, nullable:true
        lineaCaptura     maxSize:19, nullable:true
        marcaCierre      maxSize:19, nullable:true
        //************************************************************
        
        tipoPagos       maxSize:1, nullable:true
        marcaSegCred     maxSize:4, nullable:true
        mtoPagPendD     maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        facReaMensual   maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        facRoaMensual   maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        segDaniosd      maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        fondoPpd        maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        totalDescDia    maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        pagoAlCorrd     maxSize:15, nullable:true, matches: "[0-9]*\\.?[0-9]+"
        fecUltimoPago   maxSize: 10, nullable: true, matches: "0-9[][0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        statusContable   maxSize: 2, nullable: true
    }
}
