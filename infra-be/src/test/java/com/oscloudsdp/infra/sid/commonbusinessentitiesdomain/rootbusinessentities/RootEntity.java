package com.oscloudsdp.infra.sid.commonbusinessentitiesdomain.rootbusinessentities;

import java.util.Collection;
import java.util.UUID;

import com.oscloudsdp.infra.sid.commonbusinessentitiesdomain.rootbusinessentities.characterisitc.CharacteristicValue;
/**
 * A SID entity, such as Customer, Product, Service, and so forth.
 * 
 * SoC: 
 * Not implemented: 
 * RootEntityTypeForRootEntity		# not very OO	
 * RevenueAssuranceParmForRootEnity #Revenue Assurance can be an candidate aspect later
 * 
 * @author oscloudsdp
 *
 */

public abstract class RootEntity {

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
	final String objectID = UUID.randomUUID().toString();
	
	
	Collection<CharacteristicValue> characteristicValue;
	
}
