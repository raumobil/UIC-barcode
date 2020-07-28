/*
 *   This file was generated by openASN.1 - an open source ASN.1 toolkit for java
 *
 *   openASN.1 is Copyright (C) 2007 Clayton Hoss, Marc Weyland
 *
 *   openASN.1 is free software: you can redistribute it and/or modify
 *   it under the terms of the GNU Lesser General Public License as
 *   published by the Free Software Foundation, either version 3 of
 *   the License, or (at your option) any later version.
 *
 *   openASN.1 is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 *   GNU Lesser General Public License for more details.
 *
 *   You should have received a copy of the GNU Lesser General Public License
 *   along with openASN.1. If not, see <http://www.gnu.org/licenses/>.
 *
 */
package org.uic.ticket.api.asn.omv2;

import net.gcdc.asn1.datatypes.Asn1Optional;
import net.gcdc.asn1.datatypes.CharacterRestriction;
import net.gcdc.asn1.datatypes.RestrictedString;
import net.gcdc.asn1.datatypes.Sequence;
import net.gcdc.asn1.datatypesimpl.SequenceOfStringIA5;

@Sequence
public class PlacesType extends Object {
	public PlacesType() {
	}

	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String coach;

	@RestrictedString(CharacterRestriction.IA5String)
	@Asn1Optional public String placeString;

	@RestrictedString(CharacterRestriction.UTF8String)
	@Asn1Optional public String placeDescription;

	@Asn1Optional public SequenceOfStringIA5 placeIA5;

	@Asn1Optional public SequenceOfPlaceNum placeNum;
	
		

	public String getCoach() {

		return this.coach;
	}

	public String getPlaceString() {

		return this.placeString;
	}

	public String getPlaceDescription() {

		return this.placeDescription;
	}

	public SequenceOfStringIA5 getPlaceIA5() {

		return this.placeIA5;
	}

	public SequenceOfPlaceNum getPlaceNum() {

		return this.placeNum;
	}

	public void setCoach(String coach) {

		this.coach = coach;
	}

	public void setPlaceString(String placeString) {

		this.placeString = placeString;
	}

	public void setPlaceDescription(String placeDescription) {

		this.placeDescription = placeDescription;
	}

	public void setPlaceIA5(SequenceOfStringIA5 placeIA5) {

		this.placeIA5 = placeIA5;
	}

	public void setPlaceNum(SequenceOfPlaceNum placeNum) {

		this.placeNum = placeNum;
	}

	@Override
	public boolean equals(Object anObject) {
		if (this == anObject) return true;
		if ((anObject == null) || (anObject.getClass() != this.getClass())) return false;

		PlacesType comparator = (PlacesType)anObject;

		if ((this.getCoach() != comparator.getCoach()) && ((this.getCoach() == null) || (! this.getCoach().equals(comparator.getCoach())))) return false;
		if ((this.getPlaceString() != comparator.getPlaceString()) && ((this.getPlaceString() == null) || (! this.getPlaceString().equals(comparator.getPlaceString())))) return false;
		if ((this.getPlaceDescription() != comparator.getPlaceDescription()) && ((this.getPlaceDescription() == null) || (! this.getPlaceDescription().equals(comparator.getPlaceDescription())))) return false;
		if ((this.getPlaceIA5() != comparator.getPlaceIA5()) && ((this.getPlaceIA5() == null) || (! this.getPlaceIA5().equals(comparator.getPlaceIA5())))) return false;
		if ((this.getPlaceNum() != comparator.getPlaceNum()) && ((this.getPlaceNum() == null) || (! this.getPlaceNum().equals(comparator.getPlaceNum())))) return false;
		return true;
	}

	@Override
	public int hashCode() {
		int hash = 5477;

		hash = 3547 * hash + (null == this.getCoach() ? 0 : this.getCoach().hashCode());
		hash = 7321 * hash + (null == this.getPlaceString() ? 0 : this.getPlaceString().hashCode());
		hash = 2083 * hash + (null == this.getPlaceDescription() ? 0 : this.getPlaceDescription().hashCode());
		hash = 881 * hash + (null == this.getPlaceIA5() ? 0 : this.getPlaceIA5().hashCode());
		hash = 6679 * hash + (null == this.getPlaceNum() ? 0 : this.getPlaceNum().hashCode());
		return hash;
	}

}
