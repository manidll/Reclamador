
package mx.itson.reclamador.negocio;


public class Operacion {
    
 
  public   Operacion(){
      
  }
  public String imprimir = "";
  String sexo="";
  String nombre="";
  String ApellidoP="";
  String ApellidoM="";
  String estado = "";
  String Maria = "";
   String jose = "";
  Integer dia =0;
  Integer año=0;
  Integer mes =0;
  char abv1 ;
  char abv2;
  char dosmil =0;
  String ultimoD = "1";
  
  public void esFecha (String _dia, String _mes, String _año){
      dia =Integer.parseInt(_dia);
      mes= Integer.parseInt(_mes);
      año = Integer.parseInt(_año);
              
  }
  public void esGenero(String cmbSexo){
     sexo= cmbSexo; 
  }
    public void esEstado(String cmbEstado){
          estado= cmbEstado ;
 
     }
    public void getNombre (String nombres, String PrimerAp,String SegundoAp){
       
        
        nombre= nombres.toUpperCase();
        ApellidoP= PrimerAp.toUpperCase();
        ApellidoM= SegundoAp.toUpperCase();  
    
    }
    public void CurpG (){
        

       //Paso 1 extrae la primera letra de apellido
        char PrimerLetraPaterno = ApellidoP.charAt(0);
        
        
        //Paso 2 extrae la primera vocal que encuentra en el primer apellido
        char VocalApellidoP=0;
        for (int i = 1; i < ApellidoP.length(); i++) {
            
        char ExtraeVocalP = ApellidoP.charAt(i);
        if (ExtraeVocalP=='A' || ExtraeVocalP =='E'|| ExtraeVocalP =='I'|| ExtraeVocalP =='O'|| ExtraeVocalP =='U'){
       VocalApellidoP= ExtraeVocalP;
       break;
    }
}
        
   
        //Paso 3 extrae la primera letra de apellido materno.
        char PrimeraLetraApMaterno = ApellidoM.charAt(0);
        
        
        //Paso 4 extrae la primera letra del primer nombre.
        char PrimeraLetraNombre = nombre.charAt(0);
        
        
   
        
        //Paso 5 extrae la penúltimo y ultimo numeros de año.
        String anio = String.valueOf(año);
        char  penúltimoNumeroA= anio.charAt(2);   
        char ultimonumero = anio.charAt(3);
        
        
        
        //Paso 7 se encuentra los valores del mes en numeros.
        String MesNacimiento = String.valueOf(mes);
        char PrimerNumeroMes =0;
        char SegundoNumeroMex =0;
        if (mes < 10){
                PrimerNumeroMes= '0';
                SegundoNumeroMex = MesNacimiento.charAt(0);
        }else{
             PrimerNumeroMes = MesNacimiento.charAt(0);
             SegundoNumeroMex = MesNacimiento.charAt(1);
        }
        
        
        //Paso 8 se realiza a buscar los numeros de dia.
        String dias = String.valueOf(dia);
        char NumeroDia1=0;
        char NumeroDia2=0;
          if (dia < 10){
              NumeroDia1='0';
              NumeroDia2= dias.charAt(0);
              
          }else{
              NumeroDia1= dias.charAt(0);
              NumeroDia2= dias.charAt(1);
              
          }
          
          //Paso 9 se realiza la operacion se encontrar que sexo tiene.
          
          char Genero  = sexo.charAt(0);
          
          
          //Paso 10 se abrevia el estado que se elija.
          
          EstadoMexico();
          char abreviaturaEstado1 = abv1;
          char abreviaturaEstado2 = abv2;
          
          
          
           //Paso 11 Buscar la primera consonante del apellido paterno.      
          
         char PrimeracConsonantePater =0;
         for (int i = 1; i < ApellidoP.length(); i++) {
        char ConsontatePatern = ApellidoP.charAt(i);
        if (ConsontatePatern  !='A' && ConsontatePatern !='E'&& ConsontatePatern !='I'&& ConsontatePatern !='O'&& ConsontatePatern !='U'){
            PrimeracConsonantePater= ConsontatePatern;
            
       
       
       break;
    }
} 
         //Paso 11 Buscar la primera consonante del apellido materno.
         
         char PrimeracConsonanteMatern =0;
         for (int i = 1; i < ApellidoM.length(); i++) {
        char ConsontaterMatern = ApellidoM.charAt(i);
        if (ConsontaterMatern  !='A' && ConsontaterMatern !='E'&& ConsontaterMatern !='I'&& ConsontaterMatern !='O'&& ConsontaterMatern !='U'){
            PrimeracConsonanteMatern= ConsontaterMatern;
    
       break;
    }
} 
          //Paso 12 Buscar la primera consonante del nombre.
          
          
         char ConsonanteNombre =0;
         for (int i = 1; i < nombre.length(); i++) {
        char LetraConNombre = nombre.charAt(i);
        if (LetraConNombre  !='A' && LetraConNombre !='E'&& LetraConNombre !='I'&& LetraConNombre !='O'&& LetraConNombre !='U'){
            ConsonanteNombre= LetraConNombre;
            

       break;
    }      
} 
         //Paso 13 poner A o 0 dependiendo del año
          
        if(año >= 2000){
            dosmil='A';
            
        }else{
            dosmil= '0';
        }
         
      
         
         

                 
  imprimir = String.valueOf(PrimerLetraPaterno +""+  VocalApellidoP + PrimeraLetraApMaterno + PrimeraLetraNombre + penúltimoNumeroA + ultimonumero + PrimerNumeroMes + SegundoNumeroMex +NumeroDia1 + NumeroDia2 + Genero + abreviaturaEstado1 + abreviaturaEstado2 + PrimeracConsonantePater +PrimeracConsonanteMatern + ConsonanteNombre + dosmil + ultimoD);
          
        
        
       
}
          public void EstadoMexico (){
              switch(estado){
                  case "Aguas Calientes":
                      abv1='A';
                      abv2='S';
                      break;
                      
                      
                      case "Baja California":
                                 abv1='B';
                                 abv2='C';
                                 break;
                                 
                                  case "Baja California Sur":
                                     abv1='B';
                                     abv2='S';
                                     break;
                                     
                                     case"Campeche" :
                                         abv1='C';
                                         abv2='C';
                                         break;
                                         
                                         case "Coahuila":
                                             abv1='C';
                                             abv2='L';
                                             break;
                                             
                                         case "Colima":
                                                 abv1='C';
                                                 abv2='M';
                                                 break;
                                                 
                                         case "Durango":
                                             abv1= 'D';
                                             abv2='G';
                                             break;
                                             
                                         case "Guanajuato":
                                                 abv1 ='G';
                                                 abv2='T';
                                                 break;
                                                 
                                         case "Guerrero":
                                         abv1='G';
                                         abv2='R';
                                         break;
                                         
                                         case "Hidalgo":
                                             abv1='H';
                                             abv2='G';
                                             break;
                                             
                                         case "Jalisco":
                                             abv1='J';
                                             abv2='C';
                                             break;
                                             
                                         case "México":
                                             abv1='M';
                                             abv2='C';
                                             break;
                                             
                                         case "Michoacán":
                                             abv1='M';
                                             abv2='N';
                                             break;
                                             
                                         case "Morelos":
                                             abv1='M';
                                             abv2='S';
                                             break;
                                             
                                         case "Nayarit":
                                             abv1='N';
                                             abv2='T';
                                             break;
                                             
                                         case "Nuevo León":
                                             abv1='N';
                                             abv2='L';
                                             break;
                                             
                                         case "Oaxaca":
                                             abv1='O';
                                             abv2='C';
                                             break;
                                             
                                         case "Puebla":
                                             abv1='P';
                                             abv2='L';
                                             break;
                                             
                                             case "Querétaro":   
                                             abv1='Q';
                                             abv2='O';
                                             break;
                                             
                                             case "Quintana Roo":
                                                 abv1='Q';
                                                 abv2='R';
                                                  break;
                                                  
                                             case "San Luis Potosí":
                                                 abv1='S';
                                                 abv2='P';
                                                  break;
                                                  
                                             case "Sinaloa":
                                                 abv1='S';
                                                 abv2='L';
                                                 break;
                                                 
                                             case "Sonora":
                                                 abv1='S';
                                                 abv2='R';
                                                 break;
                                                 
                                             case "Tabasco":
                                                 abv1='T';
                                                 abv2='C';
                                                 break;
                                                 
                                                 case"Tamaulipas":
                                                     abv1='T';
                                                     abv2='S';
                                                     break;
                                                     
                                                 case "Tlaxcala":
                                                     abv1='T';
                                                     abv2='L';
                                                     break;
                                                     
                                                 case "Veracruz":
                                                     abv1= 'V';
                                                     abv2='Z';
                                                     break;
                                                     
                                                     case "Yucatán":
                                                         abv1='Y';
                                                         abv2='N';
                                                         break;
                                                         
                                                     case "Zacatecas":
                                                         abv1='Z';
                                                         abv2='S';
                                                         break;    
                                                         
                                                         
                                                 
                                                 
                                                 
                                                 
                                                 
                                             
                                             
                                             
                                             
                                             
                                             
                                                     
                                             
                                            
                                             
                                                     
                                                     
                                                 
                                             
                                                     
                                         
                                                 
                                                         
                                                     
                                                     
                                         
                                                         
                                                 
                                                        
                                                     
                                             
                                                 
                                         
                                 
                     
                          
                         
                      
                      
                  
              
              
          }
              
          }
}



    
    
        
        
 

     



     







    
        
            
        
    
            
    
        
    

      
        
      
                
              





    
    

    




