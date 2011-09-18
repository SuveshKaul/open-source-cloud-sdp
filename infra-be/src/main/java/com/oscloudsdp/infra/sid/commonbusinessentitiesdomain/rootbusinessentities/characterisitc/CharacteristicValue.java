package com.oscloudsdp.infra.sid.commonbusinessentitiesdomain.rootbusinessentities.characterisitc;


/**
 * A value of a CharacteristicSpecifcation chosen or entered (if no values are specified) for a Entity that further defines what the Entity is.
 *
 * SoC: 
 * Not implemented: 
 * 	validFor										#simplified - determined by the Entity validFor
 *  CharacteristicValueHas 							#simplified
 *  ServiceAccessPoint								#candidate violation of OO
 *  RootEntityForCharacteristicValue				#simplified, only from entity to char, not vice versa
 *  CharacteristicValueFor							#simplified
 *  MatrixCharValueIndexForCharacteristicValue		#simplified
 *  PricingLogicAlgorithmForCharacteristicValue		#violation of OO. A candidate aspect - pricing
 *  ComponentProdOfferPriceForCharacteristicValue	#violation of OO. A candidate aspect - pricing
 *  
 * Modified
 *  RootEntityForCharacteristicValue #changed to EntityForCharacteristicValue, simplified 
 * 	
 * @author oscloudsdp
 *
 */

public class CharacteristicValue {
	
	/**
	 * A fact that describes a Entity.
	 */
	String value;		
	
	/**
	 * meta-data of the characteristic. Can be used to describe/validate the characteristic 
	 */
	CharacteristicSpecification characteristicSpecificationForCharacteristicValue;
	
	
	/**
	 * meta-data of the value of the characteristic. Can be used to describe/validate the value of the characteristic 
	 * == this one is overlapping with CharacteristicSpecValue within the characteristicSpecificationForCharacteristicValue. 
	 * == use the one here to promote a flat hierarchy
	 */
	CharacteristicSpecValue		characteristicSpecValueForCharacteristicValue;
	
	
	
}
