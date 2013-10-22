package soapws

class Wsoap {
    
    String retorno          //Indica si la operacion fue exitosa
    String descripcion      //Indica una excepcion
    String numcrd           //Número de credito
    String moneda           //VSM o Pesos
    String estado           //Estado
    String nss              //Numero de seguridad social
    String linea            //Linea
    String producto         //Producto
    String regimen          //Regimen ROA, REA, EXT
    String situacionCredito //Situacion del credito AC activo, PF cerrado, CL liquidado
    String fechaLiquidacion //Fecha de liquidación YYY-MM-DD
    String fechaOtorgamiento//Fecha de otorgamiento YYY-MM-DD
    String marcaClonado     //Identificador de clonado
    String nombre           //Nombre del Acreditado
    String rfc              //Registro Federal de Contribuyentes
    String curp             //Clave Única de Registro de Población
    String saldoTotalPesos  //Saldo total en Pesos
    String saldoTotalVsm    //Saldo total en VSM
    String factorrea        //Factor REA en VSM
    String factorroa        //Factor ROA en VSM
    String porcentajePago   //Porcentaje de Pago
    String tipoDeCredito    //Clave del tipo de crédito
    String tasaDeInteres    //Tasa de interés Actual 
    String pool             //Clave del POOL
     //************************************************************
    String marcaReestructura//Marca que identifica la Reestructura
    String fechaReestructura//Fecha de Reestructura
    String porcentajeAcreditado//Porcentaje a cargo del acreditado
    String saldoAcreditadoVsm//Saldo Acreditado en VSM
    String saldoAcreditadoPesos//Saldo Acreditado en Pesos
    String saldoInfonavitVsm//Saldo Infonavit VSM
    String saldoInfonavitPesos//Saldo Infonavit Pesos
    String fechaRollback    //Fecha de Rollback
    String indicadorCura    //Marca que identifica la Cura
    String mesesOmisos      //Numero de meses omisos
    String saldoOmisosVsm   //Monto de los meses omisos en VSM
    String saldoOmisosPesos //Monto de los meses omisos en Pesos
    String estatus          //Estatus del crédito
    String marcaProrrogaVigente //Marca que identifica si la ultima prorroga esta activa
    //************************************************************
    String ultimasProrrogas  = new String[6] //Arreglo de las ultimas 6 prorrogas
    String fechaInicProrroga //Fecha de inicio de la prorroga
    String fechafinProrroga //Fecha de fin de la prorroga
    String montoOriginalVsm //Monto Original del crédito en VSM
    String etapa            //Etapa
    String proceso          //proceso
    String numCredConyugal  //Numero de Crédito
    String promocion        //Promoción para BDA Paquete para ALS 
    String tasaInteresOriginal//Tasa de interés Original 
    String omisoMasAntiguo  //Omiso más antiguo 
    String montoFondoAnteriorPesos//Monto anterior en pesos
    String factorReaPesos //Factor REA en pesos
    String pesos          //pesos
    String factorRoaPesos //Factor ROA en pesos
    String capitalEnVsm   //Capital en VSM
    //************************************************************
    String capitalEnPesos //Capital en Pesos
    String interesEnVsm   //Interés en VSM
    String interesEnPesos //Interés en Pesos
    String acccesoriosVsm //Comisión en VSM
    String accesoriosPesos//Comisión en Pesos
    String fechaPago      //fecha de Pago
    String calleGarantia  //Calle de la garantía
    String coloniaGarantia// Colonia de la garantía
    String poblacionGarantia// Población de la garantía
    String estadoGarantia //Clave del estado de la garantía
    String codPostalGarantia// Código Postal de la garantía
    String mpioGarantia   //Municipio de la garantía
    String cveSituacionCrd// Situación del crédito
    String marcaExistencia //Clave para identificar donde existe crédito
    String credConyugal   //Numero de crédito conyugal a 26 caracteres
    //************************************************************
    String fechaProceso   //Fecha de proceso
    String tipoEscenario  //Tipo de escenario
    String fechaFinProrroga //Fecha de finalización de la prorroga
    String mcaReestructura//Clave que identifica la condición de la reestrucutra
    String mcaPerdidarellab//Clave que indentifica la perdida de relación laboral
    String mcaFinProrrogaUno//Clave que identifica el termino de la  prorroga
    String mcaFinProrrogaDos// Clave que identifica el termino de la  prorroga
    String mcaOpcionesPago //Clave que identifica las opciones de pago
    String mcaMotivCierre //Clave que identifica los motivos del cierre
    String marcaCredComp  //Marca crédito mas computadora
    String seguroAdmiVsm //Seguro de Daños en VSM
    String seguroAdmiPesos //Seguro de Daños en Pesos
    String fondoPPagoVms   //Fondo de Protección de Pagos en VSM
    String fondoPPagoPeso  //Fondo de Protección de Pagos en Pesos
    String comisAdmonVsm   //Comisión de Administración de Pagos en VSM
     //************************************************************
    String comisAdmonPes   //Comisión de Administración de Pagos en Pesos
    String pagoEsteMesVsm  //Monto del Pago de este mes en VSM
    String pagoEsteMesPeso   //Monto del Pago de este mes en pesos
    String pagoCorriVsm      //Total de Pago para estar al corriente en VSM
    String pagoCorripes      //Total de Pago para estar al corriente en pesos
    String mntoUnoccVsm      //Monto 01 de computadora VSM
    String mntoUnoccPes      //Monto 01 de computadora Pesos
    String mntoDosccVsm      //Monto 02 de computadora VSM
    String mntoDosccPes      //Monto 02 e computadora Pesos
    String mntoUltccVsm      // Monto total aplicado para crédito mas computadora en VSM
    String mntoUltccPes      //Monto total aplicado para crédito mas computadora en Pesos
    String formaPago        //Forma de Pago
    String fechLimitePago   //Fecha límite de Pago
    String lineaCaptura     //Línea de Captura
    String marcaCierre      //Marca de cierre de credito
     //************************************************************
     
    String tipoPagos       //Tipo de Pagos
    String marcaSegCred    //Marca de segundo credito
    String mtoPagPendD     //Monto de pagos pendientes diario
    String facReaMensual   //Factor de desc REA diario
    String facRoaMensual   //Factor de desc ROA diario
    String segDaniosd      //Saeguro de daños diario
    String fondoPpd        //Fondo de Proteccion de pagos diario
    String credCcd        //Credito mas comp diario
    String totalDescDia   //Total a descontar diario
    String pagoAlCorrd    //Pago al corriente diario
    String fecUltimoPago  //Fecha de ultimo pago ALS
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
        fechaLiquidacion maxSize: 10, nullable: true, matches: "[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        fechaOtorgamiento maxSize: 10, nullable: true, matches: "[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        marcaClonado maxSize: 1, nullable: true
        nombre maxSize: 40, nullable: true
        rfc maxSize: 15, nullable: true
        curp maxSize: 20, nullable: true
        saldoTotalPesos maxSize: 15, nullable: true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        saldoTotalVsm maxSize:15, nullable: true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        factorrea maxSize:15, nullable: true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        factorroa maxSize:15, nullable: true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        porcentajePago maxSize:12, nullable: true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        tipoDeCredito maxSize:2, nullable: true
        tasaDeInteres maxSize:30, nullable: true //******??????????
        pool maxSize:4, nullable:true
        //*****************************************************
         marcaReestructura maxSiSize:1, nullable:true
        fechaReestructura maxSiSize:10, nullable:true, matches: "[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        porcentajeAcreditado maxSiSize:12, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        saldoAcreditadoVsm maxSiSize:12, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        saldoAcreditadoPesos maxSiSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        saldoInfonavitVsm  maxSiSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        saldoInfonavitPesos maxSiSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        fechaRollback maxSiSize:10, nullable:true, matches: "[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        indicadorCura maxSiSize:1, nullable:true
        mesesOmisos   maxSiSize:3, nullable:true  //***999????
        saldoOmisosVsm maxSiSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        saldoOmisosPesos maxSiSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        estatus maxSiSize:40, nullable:true
        marcaProrrogaVigente maxSiSize:1, nullable:true
         //************************************************************
         
        fechaInicProrroga maxSize: 6, nullable: true, matches: "[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        fechafinProrroga maxSize: 6, nullable: true, matches: "[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        montoOriginalVsm maxSiSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        etapa maxSiSize:10, nullable:true
        proceso maxSiSize:15, nullable:true
        numCredConyugal maxSiSize:15, nullable:true
        promocion maxSiSize:20, nullable:true
        tasaInteresOriginal maxSiSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        omisoMasAntiguo maxSiSize:10, nullable:true
        promocion maxSiSize:15, nullable:true
        montoFondoAnteriorPesos maxSiSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        pesos maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        factorRoaPesos maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        capitalEnVsm maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
          //************************************************************
        capitalEnPesos maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        interesEnVsm maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        interesEnPesos maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        acccesoriosVsm maxSize:15, nullable:true, matches:"[^[0-9]+(|.\\d*[0-9])+]"
        accesoriosPesos maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        fechaPago maxSize: 10, nullable: true, matches: "[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        calleGarantia maxSize: 80, nullable: true
        coloniaGarantia maxSize: 80, nullable: true
        poblacionGarantia maxSize: 28, nullable: true
        estadoGarantia maxSize: 2, nullable: true
        mpioGarantia maxSize: 20, nullable: true
        cveSituacionCrd maxSize: 2, nullable: true
        marcaExistencia maxSize: 3, nullable: true, inList: ["ALS","BDA"]
        credConyugal maxSize:26, nullable: true
          //************************************************************
    
         fechaProceso maxSize: 10, nullable: true, matches: "[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        tipoEscenario maxSize: 2, nullable: true
        fechaFinProrroga maxSize: 8, nullable: true
        mcaReestructura  maxSize: 2, nullable: true
        mcaPerdidarellab maxSize: 2, nullable: true
        mcaFinProrrogaUno maxSize: 2, nullable: true 
        mcaFinProrrogaDos maxSize: 3, nullable: true 
        mcaOpcionesPago  maxSize: 2, nullable: true
        mcaMotivCierre   maxSize: 2, nullable: true
        seguroAdmiVsm    maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        seguroAdmiPesos  maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        fondoPPagoVms    maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        fondoPPagoPeso   maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        comisAdmonVsm    maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        
          //************************************************************
        comisAdmonPes    maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        pagoEsteMesVsm   maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        pagoEsteMesPeso  maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        pagoCorriVsm     maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        pagoCorripes     maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        mntoUnoccVsm     maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        mntoDosccVsm     maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        mntoDosccPes     maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        mntoUltccVsm     maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        mntoUltccPes     maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        formaPago        maxSize:16, nullable:true
        fechLimitePago   maxSize:18, nullable:true
        lineaCaptura     maxSize:19, nullable:true
        marcaCierre      maxSize:19, nullable:true
        //************************************************************
        
        tipoPagos       maxSize:1, nullable:true
        marcaSegCred     maxSize:4, nullable:true
        mtoPagPendD     maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        facReaMensual   maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        facRoaMensual   maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        segDaniosd      maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        fondoPpd        maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        totalDescDia    maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        pagoAlCorrd     maxSize:15, nullable:true, matches: "[^[0-9]+(|.\\d*[0-9])+]"
        fecUltimoPago   maxSize: 10, nullable: true, matches: "[0-9][0-9][0-9]-[0-9][0-9]-[0-9][0-9]"
        statusContable   maxSize: 2, nullable: true
    }
}
