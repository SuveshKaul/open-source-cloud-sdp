package com.oscloudsdp.infra.sidbuscm;

import java.util.Collection;


/**
 * A SID entity, such as Customer, Product, Service, and so forth.
 * 
 * SoC: 
 * Not implemented: 
 * RootEntityTypeForRootEntity		# not very OO	
 * RevenueAssuranceParmForRootEnity #Revenue Assurance can be an candidate aspect later
 * entitySpecificationForEntity;	#simplified. Entity is described by its characteristics. 
 * 
 * Modified:
 * RootEntity #merged into Entity
 * 
 * @author oscloudsdp
 *
 */

public class Entity {
	/**
	 * Represents a user-friendly identifier of an object. It is a (possibly ambiguous) name by which 
	 * the object is commonly known in some limited scope (such as an organization) and conforms to the 
	 * naming conventions of the country or culture with which it is associated. It is NOT used as a 
	 * naming attribute (i.e., to uniquely identify an instance of the object).
	 */
	String commonName;
	
	
	/**
	 * This is a string, and defines a textual free-form description of the object.

	 */
	String description;
	
	/**
	 * Unambiguously distinguishes different object instances.  It is the naming attribute of the object.
	 */
	String objectID;
	
	
	Collection<CharacteristicValue> characteristicValue;
	
	/**
	 * This is a graphic string that identifies the version of the object.
	 */
	String version;
	
	EntityIdentification entityIdentification;

}
