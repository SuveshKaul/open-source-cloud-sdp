package com.oscloudsdp.infra.sid.commonbusinessentitiesdomain.rootbusinessentities;



/**
 * A SID entity, such as Customer, Product, Service, and so forth.
 * 
 * SoC: 
 * Not implemented: 
 * entitySpecificationForEntity;	#simplified. Entity is described by its characteristics. 
 * 
 * 
 * @author oscloudsdp
 *
 */

public abstract class Entity extends RootEntity {

	/**
	 * This is a graphic string that identifies the version of the object.
	 */
	String version;
	
	/**
	 * SoC: collection is simplified as [0,1]
	 */
	
	EntityIdentification entityIdentification;

}
