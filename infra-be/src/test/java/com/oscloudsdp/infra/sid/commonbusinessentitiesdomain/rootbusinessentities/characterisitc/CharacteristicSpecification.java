package com.oscloudsdp.infra.sid.commonbusinessentitiesdomain.rootbusinessentities.characterisitc;

import com.oscloudsdp.infra.sid.commonbusinessentitiesdomain.rootbusinessentities.TimePeriod;

public class CharacteristicSpecification {
	
	/**
	 * 
	 * SoC:
	 * unique															#simplified
	 * extensible														#simplified
	 * valueType														#overlapping with the CharacteristicSpecValue
	 * PerformanceSpecification											#candidate for performance aspect
	 * CharacteristicValue												#simplified, this is circle reference
	 * CharacteristicSpecValue											#simplified
	 * RootEntityTypeCharUse											#simplified. Always navigate from characteristicValue to this
	 * PerformanceIndicatorDerivationParameter							#candidate for performance aspect
	 * CharacteristicSpecRelationshipHas								#simplified
	 * PerformanceCatCharacteristicValueForCharacteristicSpecification	#candidate for performance aspect
	 * EntitySpecCharUseForCharacteristicSpecification					#simplified
	 * CharacteristicSpecRelationshipForCharacteristicSpecificationFor	#simplified
	 * PerformanceCharacteristicValueForCharacteristicSpecification		#candidate for performance aspect
	 * PerformanceCatSpecificationForCharacteristicSpecification		#candidate for performance aspect
	 * MatrixSpecDimensionForCharacteristicSpecification				#simplified
	 * 
	 * 
	 * @author oscloudsdp
	 */
	
	
	String 	ID;
	String	name;
	String	description;

	Integer		minCardinality;
	Integer		maxCardinality;
	String		derivationFormula;
	TimePeriod	validFor;
	

}
