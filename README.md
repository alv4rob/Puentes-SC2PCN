# Puentes tecnológicos entre PCN y smart contracts

Se trata de un conjunto de herramientas que actúan como puentes tecnológicos entre la notación de negocio **PCN** (Process Chain Network) y los **smart contracts** con el objetivo de acercar esta tecnología a profesionales del negocio. Para ello, estas herramientas permiten transformar diagramas PCN en smart contracts escritos en Solidity y viceversa, ambos modelados bajo el paradigma MDE (Model Driven Engineering).

Estas herramientas se construyen vinculadas a los siguientes plug-ins en el IDE Eclipse:
* [**INNoVaServ**](https://github.com/franciscoperezb/innovaserv_toolkit): Entorno de modelado para el diseño de servicios que soporta varias notaciones de negocio.

  A la definición de modelo PCN que incorpora este entorno se acopla un paquete que integra la funcionalidad del **puente PCN - smart contract**, con el que se pueden generar smart contracts en forma de modelo SmaC (*.sce*) a partir de modelos PCN (*.pcn*).
  
* [**SmaC**](https://github.com/CommITURJC/SmaC): DSL textual que soporta la codificación de smart contracts escritos en Solidity.

  A la definición de este DSL (modelo SmaC) se acopla un paquete que integra la funcionalidad del **puente smart contract - PCN**, permitiendo generar modelos PCN (*.pcn*) a partir de smart contracts en forma de modelo SmaC (*.sce*) con un formato específico.

## Puente PCN - Smart contract

Para transformar un modelo PCN en smart contract basta con hacer clic derecho sobre el modelo PCN objetivo dentro del *Package Explorer* de Eclipse, clicar sobre el botón ***Generate Solidity code*** y rellenar los datos necesarios para generar el fichero *.sce* resultante dentro del directorio *sce-gen*.

![Puente PCN - Smart Contract](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Videos/PCN-SmartContract_Demo.gif)

La herramienta se implementa en el paquete [***pcn.generator.sce***](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Plugins/es.kybele.elastic.models.pcn/src/pcn/generator/sce/) y sigue la siguiente arquitectura:

![Arquitectura puente PCN - Smart Contract](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Images/PCN-SmartContract_Arch.png)

## Puente smart contract - PCN

Para transformar un smart contract en modelo PCN basta con hacer clic derecho sobre el modelo SmaC objetivo dentro del *Package Explorer* de Eclipse y clicar sobre el botón ***Generate PCN model*** para generar el fichero *.pcn* resultante dentro del directorio *pcn-gen*.

![Puente smart contract - PCN](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Videos/SmartContract-PCN_Demo.gif)

La herramienta se implementa en el paquete [***sce.generator.pcn***](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Plugins/org.xtext.ui/src/sce/generator/pcn/) y sigue la siguiente arquitectura:

![Arquitectura puente smart contract - PCN](https://github.com/alv4rob/PCN-SmartContract-Bridges/blob/main/Images/SmartContract-PCN_Arch.png)
