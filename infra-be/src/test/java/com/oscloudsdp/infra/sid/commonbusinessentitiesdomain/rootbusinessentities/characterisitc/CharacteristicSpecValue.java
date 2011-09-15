package com.oscloudsdp.infra.sid.commonbusinessentitiesdomain.rootbusinessentities.characterisitc;

import com.oscloudsdp.infra.sid.commonbusinessentitiesdomain.rootbusinessentities.TimePeriod;


/**
 * 
 * SoC:
 * CharSpecValueRelationshipHas					#simplified
 * CharacteristicValue							#simplified, circle reference
 * PerformanceCatSpecification					#aspect of performance
 * PerformanceSpecificationForCharacteristicSpecValue #aspect of performance
 * CharSpecValueRelationshipForCharacteristicSpecValueFor	#simplified
 * CharacteristicSpecificationForCharacteristicSpecValue	#simplified. always unidirectional navigation
 * EntitySpecCharValueUseForCharacteristicSpecValue			#simplified
 * PerformanceCharacteristicValueForCharacteristicSpecValue	#aspect of performance
 * RootEntityTypeCharValueUseForCharacteristicSpecValue		#simplified. always unidirectional navigation
 *
 * @author oscloudsdp
 *
 */

public class CharacteristicSpecValue {
	
	/**
	 * A kind of value that the characteristic can take on, such as numeric, text, and so forth.
	 */
	String valueType;
	
	/**
	 * Indicates if the value is the default value for a characteristic.
	 */
	Boolean _default;
	String	value;
	String 	unitOfMeasure;
	String	valueFrom;
	String	valueTo;
	String 	rangeInterval;
	TimePeriod validFor;
	
	

}
